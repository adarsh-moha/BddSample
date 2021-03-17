package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "@target",
		glue= {"stepDefs"},
		monochrome=true,
		plugin= {"pretty", "html:target/htmlreport/report.html","rerun:target/failed.txt"}
		
		)
public class ReRunRunner {

}
