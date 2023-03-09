package com.star.webApp.runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/featureFiles"},
					glue= {"com/star/webApp/stepDefinationFiles"},
					monochrome=true,
					tags= "@regression or @smoke",
					plugin= {"pretty","html:target/cucumber-reports/report.html","rerun:target/failedrerun.txt"},
					publish = true
					)
public class Runner {

}
