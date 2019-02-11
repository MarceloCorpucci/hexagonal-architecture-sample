package hexagonal.architecture.sample.application;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public interface WebSlicePort {
	public WebSlicePort useSUTClient(SUTClient sutClient);
	public void search(String definedObject);
	public void whichRepresents(String criteria);
	public SUTSlice getFoundSlice();
}
