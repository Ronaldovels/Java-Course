public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        String[] fruits = {"apple", "orange", "banana"};
        String target = "orange";
        boolean isFound = false;


        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found in the array.");
        }

    }


}
