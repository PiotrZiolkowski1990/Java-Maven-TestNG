package services;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class WeirdStuffTest {
    @DataProvider(name="rangeProvider")
    public Object[][] createRangeNumber() {
        // chce wygenerować liczby od 0 do 100
        Object[][] testData = new Object[101][1];
        for (int i=0; i<=100; i++) {
            testData[i][0] = i;
        }
        return testData;
    }
    @Test(dataProvider = "rangeProvider")
    void testRange(int x) {
        assertThat(WeirdStuff.isItTheAnswerToUltimateQuestionOfLife(x))
                .isNotEqualTo("That should not happen at all");
    }

}
