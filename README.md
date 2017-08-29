Instructions to Build Framework:

    Used Eclipse neon.3

    Started Maven Project (Java) named QAWorks

    Dependencies : cucumber-junit 1.2.4 / cucumber-java 1.2.4 / cucumber-core 1.2.4 / selenium-java 2.53.1

    Created Contact feature file in src/test/resources where the Test Scenario is written

    Created Runner Class in src/test/java/ where the Runner code is written to initiate Contact.feature

    Created StepDefinition Class in src/test/java/ where the steps written for Runner Class to perform

Running Test:

    Right Click on QAWorks and Run as jUnit

Dependencies:
4.0.0 QAWorks QAWorks 0.0.1-SNAPSHOT

<dependencies>
	<dependency>
		<groupId>info.cukes</groupId>
		<artifactId>cucumber-junit</artifactId>
		<version>1.2.4</version>
	</dependency>
	<dependency>
		<groupId>info.cukes</groupId>
		<artifactId>cucumber-java</artifactId>
		<version>1.2.4</version>
	</dependency>
	<dependency>
		<groupId>info.cukes</groupId>
		<artifactId>cucumber-core</artifactId>
		<version>1.2.4</version>
	</dependency>
	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>2.53.1</version>
	</dependency>
</dependencies>

Other Scenarios:

    InValid Submission
    Empty Filed Submission
    Valid Submission in Different Browsers - IE / Chrome / Safari
