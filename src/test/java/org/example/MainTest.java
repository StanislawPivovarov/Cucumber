package org.example;
import org.junit.runner.RunWith;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
        features = "src/test/resources",
        glue = "steps",
        tags = "@naselenide"
        //dryRun = false,
        //strict = false,
        //snippets = SnippetType.UNDERSCORE
)

public class MainTest {
}
