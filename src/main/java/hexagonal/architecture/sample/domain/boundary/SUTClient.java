package hexagonal.architecture.sample.domain.boundary;

public interface SUTClient {
	SUTClient open(String path);
	SUTClient close();
	Object utilizeClient();
	SUTClient setSUTSlice(SUTSlice sutSlice);
	SUTClient waitUntilSliceAvailable(String location);
	SUTClient waitUntilSUTLocationIsReady(String location);
	String getSUTLocation();
	SUTClient addText(String text);
	SUTClient select();
}
