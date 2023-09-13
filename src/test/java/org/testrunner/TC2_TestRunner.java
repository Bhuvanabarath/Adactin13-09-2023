package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\TC2_ExploreHotel.feature",monochrome=true,dryRun=true
				,glue="org.stepdef")
public class TC2_TestRunner {
	
}
