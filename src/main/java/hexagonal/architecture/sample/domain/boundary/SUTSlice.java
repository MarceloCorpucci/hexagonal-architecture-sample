package hexagonal.architecture.sample.domain.boundary;

public interface SUTSlice {
	public SUTSlice usingId(String id);
	public SUTSlice usingXpath(String xpath);
}
