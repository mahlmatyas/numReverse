package NumReverse;

public  class Util {

    public static int[] revNums(int[] input) {
        int temp = input[0];
        for (int i = 0; i < input.length; i++) {
            for (int j=i+1; j<input.length; j++) {
                if (input[i] > input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}
