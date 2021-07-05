package NumReverse;

public class Application {
    public static void main(String[] args) {

        //Util util = new Util();

        int[] value = {2,5,7,1,76,83,22};
        int[] retValue = Util.revNums(value);

        for (int val: retValue) {
            System.out.print(val+", ");
        }
    }
}
