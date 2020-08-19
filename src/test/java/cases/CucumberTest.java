package cases;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java",
        glue = "steps",
        tags = "@all",
        dryRun = false,
        snippets = SnippetType.UNDERSCORE
)
class RunnerTest {
}