package hexagonal.architecture.sample.framework;

import java.util.ArrayList;
import java.util.List;

import hexagonal.architecture.sample.domain.boundary.OpenApplicationCommand;

public class OpenWebCommandExecutor {
	private final List<OpenApplicationCommand> openApplicationCommands = new ArrayList<>();
	
	//TODO: Implement logging
	public void executeOperation(OpenApplicationCommand openApplicationCommand) {
		openApplicationCommands.add(openApplicationCommand);
	}
}
