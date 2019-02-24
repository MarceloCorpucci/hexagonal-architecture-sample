package hexagonal.architecture.sample.framework;

import hexagonal.architecture.sample.application.WebSlicePort;
import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;
import hexagonal.architecture.sample.domain.core.WebSlice;

public class WebSliceAdapter implements WebSlicePort {
	private SUTClient sutClient;
	private SUTSlice webSlice = new WebSlice();
	
	@Override
	public WebSlicePort setSUTClient(SUTClient sutClient) {
		this.sutClient = sutClient;
		return this;
	}

	@Override
	public SUTSlice identifyPoint(String point) {
		return this.webSlice.indentifyPoint(point);
	}
	
	@Override
	public String usePoint() {
		return webSlice.usePoint();
	}
	
	@Override
	public Object whichIsLocatedBy(String criteria) {
		webSlice.setSUTClient(sutClient);
		webSlice.whichIsLocatedBy(criteria);
		return (Object)webSlice;
	}

	@Override
	public SUTSlice getFoundSlice() {
		return this.webSlice;
	}

}
