package com.frame.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-report/cucumber-reports.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features",
        glue = "com/frame/step_definitions",
        dryRun = false,
     tags = "@wip",
        monochrome = true,
        publish = false
)
public class CukesRunner {


}
