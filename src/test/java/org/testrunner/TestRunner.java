package org.testrunner;
import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Facebook.feature",
glue="org.stepdef",dryRun=false,
plugin= {"html:C:\\MyWorkSpace\\MavenCucumber\\target\\sample.html",
		"json:C:\\MyWorkSpace\\MavenCucumber\\target\\sample.json"},
		snippets=SnippetType.CAMELCASE)
public class TestRunner {
	
//	@AfterClass
//	public static void afterClass() {
//		BaseClass.generateJVMReport("23-Aug-23", "C:\\\\MyWorkSpace\\\\MavenCucumber\\\\target\\\\sample.json");
//	}
	
}
