@wip1
Feature: Domain Layer - Core 

	Scenario: WebManager is a SUTManager implementation
		* Implements SUTManager.
		* It is in charge of returning a concrete SUTClient according to the application type received.
		
	Scenario: ChromeClient responsibility
		* Implements SUTClients.
		* Is a wrapper of a ChromeDriver object.
		
	Scenario: ChromeClient actions
		* It opens an url through the "open" method.
		* It closes the browser through the "close" method.
		* It enters text into text fields through the "addText" method.
		* It exposes the wrapped driver as an object through the method "utilizeClient".
		* It allows to compose a SUTSlice through the method "setSUTSlice" receiving a SUTSlice as a parameter.