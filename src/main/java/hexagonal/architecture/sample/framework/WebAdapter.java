package hexagonal.architecture.sample.framework;

import hexagonal.architecture.sample.application.WebPort;
import hexagonal.architecture.sample.domain.boundary.SUTClient;

public class WebAdapter implements WebPort {
	private SUTClient sutClient;
	
	public WebAdapter(SUTClient sutClient) {
		this.sutClient = sutClient;
	}
	
	@Override
	public SUTClient open(String url) {
		return sutClient.open(url);
	}

}
