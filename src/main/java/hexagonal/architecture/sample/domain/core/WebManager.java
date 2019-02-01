package hexagonal.architecture.sample.domain.core;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTManager;

public class WebManager implements SUTManager {

		public SUTClient useApplication(String applicationType) {
			// TODO Factory needed.
			SUTClient client = null;
			if(applicationType.equals("CHROME")) {
				client = new ChromeClient();
			}
			return client;
		}

}
