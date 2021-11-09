public class Calculator {
    public static float Calculator(float num1, float num2, String choice) {
        switch (choice) {
            case "cong": {
                return num1 + num2;
            }
            case "tru": {
                return num1 - num2;
            }
            case "nhan": {
                return num1 * num2;
            }
            case "chia": {
                try {
                    return num1/num2;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            default: {
                return -1;
            }

        }
    }
}
