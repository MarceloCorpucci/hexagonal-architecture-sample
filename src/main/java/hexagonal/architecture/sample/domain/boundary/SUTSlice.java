package hexagonal.architecture.sample.domain.boundary;

public interface SUTSlice {
	public void setSUTClient(SUTClient sutClient);
	public SUTSlice indentifyPoint(String point);
	public SUTSlice whichIsLocatedBy(String criteria);
	public Object getSlice();
	public Object getSlicePoint(String location);
	public String usePoint();
}
