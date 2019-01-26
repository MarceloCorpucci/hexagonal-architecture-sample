package hexagonal.arquitecture.sample.application;

import hexagonal.architecture.sample.domain.boundary.OpenApplicationCommand;
import hexagonal.architecture.sample.domain.core.SUTManager;
import hexagonal.architecture.sample.domain.core.WebUIManager;

public class OpenWebCommand implements OpenApplicationCommand {
	private SUTManager webUIManager = new WebUIManager();

	@Override
	public void execute(String param) {
		webUIManager.open(param);
	}
}
