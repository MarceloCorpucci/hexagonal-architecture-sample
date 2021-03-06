@wip
Feature: Domain Layer Boundary

	Scenario: SUTManager responsibility
		* SUTManager is in charge of defining the SUTClient to be employed according to the application type.
		
	Scenario: SUTClient responsibility
		* It contains the "open" method definition, which accepts a string as parameter representing the path.
		* It contains the "close" method definition.
		* It contains the "on" method definition, which accepts a string parameter representing the slice to be found.
		* It contains the "addText" method definition, which accepts a string parameter representing the text to be added into the text field.
		# TODO utilizeClient
		# TODO getSUTSlice
		
	Scenario: WebSlice responsibility
		* It is a wrapper of a WebElement, part of the WebDriver API.
		# TODO setSUTClient(SUTClient sutClient)
		# TODO whichRepresents(String criteria)
		# TODO getSlice()
		# TODO search(String definedObject)
		
