package com.star.webApp.runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@target/failedrerun.txt"},
					glue= {"com/star/webApp/stepDefinationFiles"},
					plugin= {"pretty"},
					monochrome=true
					)
public class RunnerFailed {

}
