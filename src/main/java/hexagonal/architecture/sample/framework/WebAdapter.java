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
	public SUTClient open(String url) {
		return sutClient.open(url);
	}

	@Override
	public SUTClient close() {
		return sutClient.close();
	}

	@Override
	public SUTClient addText(String text) {
		return sutClient.addText(text);
	}
	
	public WebAdapter search(String definedObject) {
		webSlicePort.useSUTClient(sutClient)
					.search(definedObject);
		return this;
	}

	public WebAdapter whichRepresents(String criteria) {
		webSlicePort.whichRepresents(criteria);
		return this;
	}

	@Override
	public WebPort then() {
		this.sutClient.getSUTSlice(webSlicePort.getFoundSlice());
		return this;
	}

	@Override
	public SUTClient select() {
		return this.sutClient.select();
	}
}
