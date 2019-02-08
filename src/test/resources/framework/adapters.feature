@wip
Feature: Framework Layer - Adapters

	Scenario: WebAdapter object - Adapter implementation
		* It implements WebPort.
		* It contains the method "open", accepts a string and returns a SUTClient.
		* It contains the method "close", and it returns a SUTClient.
		#TODO on and addText