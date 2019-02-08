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
	public SUTClient on(SUTSlice slicePoint) {
		return sutClient.on(slicePoint);
	}

	@Override
	public SUTClient addText(String text) {
		return sutClient.addText(text);
	}

}
