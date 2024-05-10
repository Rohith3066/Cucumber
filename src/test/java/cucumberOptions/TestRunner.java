package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "src/test/resources/hellocucumber",
        //path of step definition file
        glue = "stepDefenitions",
        tags = "@daytest"
)
public class TestRunner {
}




