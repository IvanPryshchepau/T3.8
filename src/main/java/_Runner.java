/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _Runner {

    public static void main(String[] args) {

        try {
            System.out.println(calculate(Integer.parseInt(args[0])));
        } catch (NumberFormatException e){

        } catch (ArrayIndexOutOfBoundsException e) {

        }


    }

    public static int calculate(int k) {

        int[] array = {3,554,56,3,234,45,14,675,34,567};

        int result = 0;

        for (int i : array) {
            if (i%k == 0) {
                result += i;
            }
        }

        return result;

    }
}
