package services;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.assertj.core.api.Assertions.*;

public class ParameterTest {
    @DataProvider(name="abc")
    public Object[][] calcProvider() {
        return new Object[][] {
                {1,2,3},
                {2,3,5},
                {6,7,13}
        };
    }

    @Test(dataProvider = "abc")
    public void testCalculator(int a, int b, int sum){
        int result = a + b;
        assertThat(result).isEqualTo(sum);
    }
}
