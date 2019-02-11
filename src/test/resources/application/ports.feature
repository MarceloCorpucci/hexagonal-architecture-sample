@wip
Feature: Application Layer - Ports 

	Scenario: WebPort object - Adapter definition
		* It contains the method "open", accepts a string and returns a SUTClient.
		* It contains the method "close", and it returns a SUTClient.
		* It contains the "on" method definition, which accepts a string parameter representing the slice to be found.
		* It contains the "addText" method definition, which accepts a string parameter representing the text to be added into the text field.
		# TODO Change on for then()
		
		#TODO WebSlicePort pending