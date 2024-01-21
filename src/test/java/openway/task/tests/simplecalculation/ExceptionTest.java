package openway.task.tests.simplecalculation;

import openway.task.simplecalculation.Calculator;
import org.testng.annotations.Test;

public class ExceptionTest {

    Calculator calculator = new Calculator();

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void missingValuesTestCase() {
        double[] nums = {2, 3};
        calculator.calculate(nums);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void extraValuesTestCase() {
        double[] nums = {2, 3, 4, 5.7, 0.001, 0.9};
        calculator.calculate(nums);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void nonNumericTestCase() {
        double[] nums = {-2, Double.parseDouble("text"), -3, 4};
        calculator.calculate(nums);
    }

}
