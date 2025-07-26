public class Main {

    public static void main(String[] args) {
        // varargs = allow a method to accept a varying # of arguments
        //           make methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array


        System.out.println(add(1,2,3,4,5,6));
        System.out.println(avg());
    }

    static int add(int... numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    static double avg(double... numbers) {

        if (numbers.length == 0) {
            return 0;
        }


        double sum = 0;

        for (double num : numbers) {
            sum += num;

        }

        return sum/numbers.length;
    }

}
