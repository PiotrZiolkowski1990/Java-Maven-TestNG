package basics;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class AJDemoTest {
    @Test
    public void assertJExampleTest(){
        String frodo = "frodo baggins";

        assertThat(frodo)
                .startsWith( "Fro")
                .endsWith( "ins")
                .isEqualToIgnoringCase( "frodo baggins" );

    }
}
