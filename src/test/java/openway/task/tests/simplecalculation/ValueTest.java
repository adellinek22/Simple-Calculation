package openway.task.tests.simplecalculation;

import openway.task.simplecalculation.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueTest {

    Calculator calculator = new Calculator();

    @Test
    public void validTestCase() {
        double[] nums = {2, 3, 4, 5};
        Assert.assertEquals(calculator.calculate(nums), 0.5555555555555556);
    }

    @Test
    public void decimalTestCase() {
        double[] nums = {2.2345, 3.2341, 4.12, 5.23};
        Assert.assertEquals(calculator.calculate(nums), 0.5848770053475936);
    }

    @Test
    public void decimalIntegerTestCase() {
        double[] nums = {2.2345, 3, 4, 5.23};
        Assert.assertEquals(calculator.calculate(nums), 0.5671180931744313);
    }

    @Test
    public void zeroDivisionTestCase() {
        double[] nums = {2, 3, -4, 4};
        Assert.assertTrue(Double.isNaN(calculator.calculate(nums)));
    }

    @Test
    public void zeroResultTestCase() {
        double[] nums = {-2, 2, -3, 4};
        Assert.assertEquals(calculator.calculate(nums), 0);
    }

    @Test
    public void largeNumeratorTestCase() {
        double[] nums = {Double.MAX_VALUE, 1, -3, 4};
        Assert.assertEquals(calculator.calculate(nums), 1.7976931348623157E308);
    }

    @Test
    public void largeDenominatorTestCase() {
        double[] nums = {1, -4, Double.MAX_VALUE, 4};
        Assert.assertEquals(calculator.calculate(nums), -1.668805393880401E-308);
    }

    @Test
    public void largeNumberTestCase() {
        double[] nums = {Double.MAX_VALUE, 2, Double.MAX_VALUE, 2};
        Assert.assertEquals(calculator.calculate(nums), 1.0);
    }

    @Test
    public void smallNumeratorTestCase() {
        double[] nums = {Double.MIN_VALUE, 0.1, 1, -4};
        Assert.assertEquals(calculator.calculate(nums), -0.03333333333333333);
    }

    @Test
    public void smallDenominatorTestCase() {
        double[] nums = {-2, 4, Double.MIN_VALUE, 0.0000000000000000004};
        Assert.assertEquals(calculator.calculate(nums), 5.0E18);
    }

    @Test
    public void smallNumberTestCase() {
        double[] nums = {Double.MIN_VALUE, 2, Double.MIN_VALUE, -4};
        Assert.assertEquals(calculator.calculate(nums), -0.5);
    }

}
