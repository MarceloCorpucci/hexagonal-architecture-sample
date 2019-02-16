package hexagonal.architecture.sample.application;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public interface WebPort {
	SUTClient open(String url);
	SUTClient close();
	SUTSlice definePoint(String point);
	String usePoint();
	WebPort then();
	SUTClient waitUntilSliceAvailable(String location);
	SUTClient waitUntilSUTLocationIsReady(String location);
	String getSUTLocation(); 
	SUTClient addText(String text);
	SUTClient select();
}
