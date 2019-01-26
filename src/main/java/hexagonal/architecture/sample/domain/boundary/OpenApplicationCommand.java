package hexagonal.architecture.sample.domain.boundary;

public interface OpenApplicationCommand {
	void execute(String param);
}
