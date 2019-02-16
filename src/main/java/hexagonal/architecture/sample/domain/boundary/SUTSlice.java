package hexagonal.architecture.sample.domain.boundary;

public interface SUTSlice {
	public void setSUTClient(SUTClient sutClient);
	public void whichRepresents(String criteria);
	public Object getSlice();
	public Object getSlicePoint(String location);
	public SUTSlice definePoint(String point);
	public String usePoint();
}
