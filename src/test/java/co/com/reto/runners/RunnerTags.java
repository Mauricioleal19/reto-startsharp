package co.com.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/create_meeting.feature",
        tags = "@stories",
        glue = "co.com.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
