package hexagonal.architecture.sample.application;

import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public interface WebSlicePort {
	public SUTSlice usingId(String id);
	public SUTSlice usingXpath(String xpath);
}
