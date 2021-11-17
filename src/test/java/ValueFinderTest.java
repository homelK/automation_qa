import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

public class ValueFinderTest {

    @Test
    public String valueFinderInText(String text) {

    StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.toCharArray()[i];

            if (Character.isDigit(currentChar)) {
                sb.append(String.valueOf(currentChar));
                continue;
            }

            if (sb.toString() == "") {
                continue;
            } else {
                break;
            }
        }

        String str = sb.toString();
        return str;


    }
}
