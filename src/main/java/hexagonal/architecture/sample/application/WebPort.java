package hexagonal.architecture.sample.application;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public interface WebPort {
	SUTClient open(String url);
	SUTClient close();
	SUTClient on(SUTSlice slicePoint);
	SUTClient addText(String text);
}
