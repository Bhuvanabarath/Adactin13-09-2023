package org.testrunner;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\AdactinHotel.feature",
				glue="org.stepdef",snippets=SnippetType.CAMELCASE,dryRun=false,
				plugin= {"json:C:\\MyWorkSpace\\MavenCucumber\\target\\Adactin.json"})
				
public class AdactinTestRunner {
	@AfterClass
	public static void afterClass() {
		BaseClass.generateJVMReport("25-08-2023", "C:\\\\MyWorkSpace\\\\MavenCucumber\\\\target\\\\Adactin.json");
	}

}
