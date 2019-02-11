package hexagonal.architecture.sample.domain.boundary;

public interface SUTClient {
	SUTClient open(String path);
	SUTClient close();
	Object utilizeClient();
	SUTClient getSUTSlice(SUTSlice sutSlicePoint);
	SUTClient addText(String text);
	SUTClient select();
}
