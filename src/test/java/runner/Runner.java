package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"pageSteps", "runner"},
        plugin = {"json:target/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Test")

public class Runner {
}
