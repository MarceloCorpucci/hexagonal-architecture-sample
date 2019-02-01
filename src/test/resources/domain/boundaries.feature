@wip
Feature: Domain Layer Boundary

	Scenario: SUTManager responsibility
		* SUTManager is in charge of defining the SUTClient to be employed according to the application type.
		
	Scenario: SUTClient responsibility
		* It contains the "open" method definition, which accepts a string as parameter representing the path.
		* It contains the "close" method definition. 