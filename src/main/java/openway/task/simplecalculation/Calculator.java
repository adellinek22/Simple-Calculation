package openway.task.simplecalculation;

public class Calculator {
    public double calculate(double[] nums) {
        if (nums.length != 4) throw new IllegalArgumentException("Number of parameter must be 4 real numbers");

        double numerator = nums[0] + nums[1];
        double denominator = nums[2] + nums[3];

        if (denominator == 0) {
            return Double.NaN;
        }

        return numerator / denominator;
    }
}
