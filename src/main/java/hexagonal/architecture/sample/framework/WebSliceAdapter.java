package hexagonal.architecture.sample.framework;

import hexagonal.architecture.sample.application.WebSlicePort;
import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;
import hexagonal.architecture.sample.domain.core.WebSlice;

public class WebSliceAdapter implements WebSlicePort {
	private SUTClient sutClient;
	private SUTSlice webSlicePoint = new WebSlice();

	@Override
	public void search(String definedObject) {
		webSlicePoint.search(definedObject);
	}

	@Override
	public void whichRepresents(String criteria) {
		webSlicePoint.setSUTClient(sutClient);
		webSlicePoint.whichRepresents(criteria);
	}

	@Override
	public WebSlicePort useSUTClient(SUTClient sutClient) {
		this.sutClient = sutClient;
		return this;
	}

	@Override
	public SUTSlice getFoundSlice() {
		return this.webSlicePoint;
	}



}
