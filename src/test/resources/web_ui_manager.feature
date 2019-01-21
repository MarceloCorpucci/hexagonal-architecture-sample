@wip
Feature: Web UI Manager

	This framework should be able to provide a way to automate web apps.
	WebDriver support is required.
	This library should be placed as part of the core capabilities
	of this framework.
	
	Scenario: Web UI Manager is a type of Test Manager
		* Web UI Manager implements TestManager.
		* So that its main behavior should be shared with other Managers.
	
	Scenario: WebDriver capabilities are available
		* Core capabilities are used to contain WebDriver.
		* WebDriver object is wrapped with WebUIManager.
		* WebUIManager exposes basic WebDriver functionality.