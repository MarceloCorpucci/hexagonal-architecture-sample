package hexagonal.architecture.sample.framework;

import hexagonal.architecture.sample.application.WebPort;
import hexagonal.architecture.sample.application.WebSlicePort;
import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public class WebAdapter implements WebPort {
	private WebSlicePort webSlicePort;
	private SUTClient sutClient;

	public WebAdapter(SUTClient sutClient) {
		this.sutClient = sutClient;
		this.webSlicePort = new WebSliceAdapter();
	}
	
	@Override
	public SUTClient open(String url) {
		return sutClient.open(url);
	}

	@Override
	public SUTClient close() {
		return sutClient.close();
	}
	
	@Override
	public SUTSlice definePoint(String point) {
		return this.webSlicePort
						.useSUTClient(sutClient)
						.definePoint(point);
	}
	
	@Override
	public String usePoint() {
		return webSlicePort.usePoint();
	}
	
	@Override
	public SUTClient waitUntilSliceAvailable(String location) {
		return sutClient.waitUntilSUTLocationIsReady(location);
	}

	@Override
	public SUTClient waitUntilSUTLocationIsReady(String location) {
		return sutClient.waitUntilSUTLocationIsReady(location);
	}
	
	@Override
	public String getSUTLocation() {
		return sutClient.getSUTLocation();
	}

	@Override
	public SUTClient addText(String text) {
		return sutClient.addText(text);
	}
	
	public WebAdapter whichRepresents(String criteria) {
		webSlicePort.whichRepresents(criteria);
		return this;
	}

	@Override
	public WebPort then() {
		this.sutClient.setSUTSlice(webSlicePort.getFoundSlice());
		return this;
	}

	@Override
	public SUTClient select() {
		return this.sutClient.select();
	}


}
