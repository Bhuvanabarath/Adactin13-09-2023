package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\DataTable.feature",glue="org.stepdef",dryRun=false,
		snippets=SnippetType.CAMELCASE, tags = "@sanity")
public class DatatableTestRunner {

}
