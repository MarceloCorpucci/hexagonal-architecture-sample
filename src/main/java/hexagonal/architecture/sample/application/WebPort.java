package hexagonal.architecture.sample.application;

import hexagonal.architecture.sample.domain.boundary.SUTClient;

public interface WebPort {
	SUTClient open(String url);
}
