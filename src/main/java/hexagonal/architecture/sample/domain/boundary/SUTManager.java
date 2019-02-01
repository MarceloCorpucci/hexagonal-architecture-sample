package hexagonal.architecture.sample.domain.boundary;

public interface SUTManager {
	SUTClient useApplication(String applicationType);
}
