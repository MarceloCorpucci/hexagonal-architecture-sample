package hexagonal.architecture.sample.framework;

import hexagonal.architecture.sample.application.WebSlicePort;
import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;
import hexagonal.architecture.sample.domain.core.WebSlice;

public class WebSliceAdapter implements WebSlicePort {
	private SUTClient sutClient;
	private SUTSlice webSlice = new WebSlice();
	
	@Override
	public SUTSlice definePoint(String point) {
		return this.webSlice.definePoint(point);
	}
	
	@Override
	public String usePoint() {
		return webSlice.usePoint();
	}
	
	@Override
	public void whichRepresents(String criteria) {
		webSlice.setSUTClient(sutClient);
		webSlice.whichRepresents(criteria);
	}

	@Override
	public WebSlicePort useSUTClient(SUTClient sutClient) {
		this.sutClient = sutClient;
		return this;
	}

	@Override
	public SUTSlice getFoundSlice() {
		return this.webSlice;
	}

}
