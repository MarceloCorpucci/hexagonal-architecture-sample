package hexagonal.architecture.sample.domain.boundary;

public interface SUTSlice {
	public void setSUTClient(SUTClient sutClient);
	public void whichRepresents(String criteria);
	public Object getSlice();
	public SUTSlice search(String definedObject);
}
