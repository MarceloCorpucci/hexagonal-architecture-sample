package hexagonal.architecture.sample.application;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public interface WebSlicePort {
	public WebSlicePort setSUTClient(SUTClient sutClient);
	public SUTSlice identifyPoint(String point);
	public String usePoint();
	public Object whichIsLocatedBy(String criteria);
	public SUTSlice getFoundSlice();
}
