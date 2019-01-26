package hexagonal.architecture.sample.domain.core;

public interface SUTManager {
	SUTManager useApplication(String applicationType);
	void open(String app);
}
