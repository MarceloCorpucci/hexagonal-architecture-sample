package hexagonal.architecture.sample.application;

import hexagonal.architecture.sample.domain.boundary.SUTClient;

public interface WebPort {
	WebPort indentifyPoint(String point);
	WebPort whichIsLocatedBy(String criteria);

	WebPort then();
	
	String usePoint();
	String getSUTLocation(); 

	SUTClient open(String url);
	SUTClient close();
	
	SUTClient waitUntilSliceAvailable(String location);
	SUTClient waitUntilSUTLocationIsReady(String location);
	
	SUTClient addText(String text);
	SUTClient select();
}
