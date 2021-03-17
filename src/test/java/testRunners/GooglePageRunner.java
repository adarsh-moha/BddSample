package testRunners;

import org.junit.runner.RunWith;
//import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import com.thoughtworks.qdox.model.expression.Not;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src//test//resources//features//runthese//",
		glue= {"stepDefs"},
		monochrome=true,
		plugin= {"pretty"
				//,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
//		,tags= {"@doorfeature", "@tagdoor"}
//		,tags= {"@doorfeature or @tag"}
		,tags= {"@doorfeature"}

		//,dryRun=true
		)
public class GooglePageRunner{

}
