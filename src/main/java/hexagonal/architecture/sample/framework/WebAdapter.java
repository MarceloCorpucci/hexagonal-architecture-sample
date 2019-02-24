package hexagonal.architecture.sample.framework;

import hexagonal.architecture.sample.application.WebPort;
import hexagonal.architecture.sample.application.WebSlicePort;
import hexagonal.architecture.sample.domain.boundary.SUTClient;

public class WebAdapter implements WebPort {
	private WebSlicePort webSlicePort;
	private SUTClient sutClient;

	public WebAdapter(SUTClient sutClient) {
		this.sutClient = sutClient;
		this.webSlicePort = new WebSliceAdapter();
	}
	
	@Override
	public WebPort indentifyPoint(String point) {
		this.webSlicePort
			.setSUTClient(sutClient)
			.identifyPoint(point);
		return this;
	}

	public WebPort whichIsLocatedBy(String criteria) {
		webSlicePort.whichIsLocatedBy(criteria);
		return this;
	}

	@Override
	public WebPort then() {
		this.sutClient.setSUTSlice(webSlicePort.getFoundSlice());
		return this;
	}

	@Override
	public String usePoint() {
		return webSlicePort.usePoint();
	}

	@Override
	public String getSUTLocation() {
		return sutClient.getSUTLocation();
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
	public SUTClient waitUntilSliceAvailable(String location) {
		return sutClient.waitUntilSUTLocationIsReady(location);
	}

	@Override
	public SUTClient waitUntilSUTLocationIsReady(String location) {
		return sutClient.waitUntilSUTLocationIsReady(location);
	}

	@Override
	public SUTClient addText(String text) {
		return sutClient.addText(text);
	}

	@Override
	public SUTClient select() {
		return this.sutClient.select();
	}


}
