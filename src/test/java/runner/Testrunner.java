package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//corren las automatizaciones - clase ejecutable con cucumber
@RunWith(Cucumber.class)

//buscar escenarios de pruebas
@CucumberOptions(
        features = "src/test/java/features",
        //glue = ("seleniumgluecode"),
        snippets = SnippetType.CAMELCASE
        //tags = {"@fast"}
)
//implementaciones de escenarios
public class Testrunner {
}
