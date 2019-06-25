package co.za.ssquared.cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/resources/features",
        glue = "co.za.ssquared.stepDefinations", tags = "@PortalTest",strict = true,
        plugin = {"pretty","html:target/cucumber","json:target/cucumber.json", "junit:target/myreport.xml"})

//pretty gives you a report that shows successful arts in green and unsuccessful ones in red
//json generates a json report
//junit creates an xml report
//dryRun  = true checks if mapping is done and reads its as passed
//monochrome it give you a neat and detailed looking report
//strict shows you any missing implementation steps

public class TestRunner {
}
