package services;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import services.Calculator;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @DataProvider(name="abc")
    public Object[][] calcProvider() {
        return new Object[][] {
                {1,2,3},
                {2,3,5},
                {6,7,13}
        };
    }
    @Test (dataProvider = "abc")
    public void testCalculator(int a, int b, int sum) {
        int result = a + b;
        assertThat(result).isEqualTo(sum);
    }
    @Test
    void TestAdd(){
        Calculator calc = new Calculator();
        int result = calc.add(10,20);

        Assert.assertEquals(result,30);
    }
    @Test
    void TestSubstract(){
        Calculator calc = new Calculator();
        int result = calc.subtract(30,10);

        Assert.assertEquals(result,20);
    }
    @Test
    void TestMul(){
        Calculator calc = new Calculator();
        int result = calc.mul(30,10);

        Assert.assertEquals(result,300);
    }
    @Test
    void TestDiv(){
        Calculator calc = new Calculator();
        int result = calc.div(30,10);

        Assert.assertEquals(result,3);
    }
}
