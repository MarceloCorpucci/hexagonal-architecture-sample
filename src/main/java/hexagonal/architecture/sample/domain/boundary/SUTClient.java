package hexagonal.architecture.sample.domain.boundary;

public interface SUTClient {
	SUTClient open(String path);
	SUTClient close();
//	SUTSlice takeSlice(SUTSlicePoint slicePoint);
	SUTClient on(SUTSlice slicePoint);
	SUTClient addText(String text);
}
