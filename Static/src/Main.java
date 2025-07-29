public class Main {

    public static void main(String[] args) {
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object
        //          Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Curious George");
        Friend friend2 = new Friend("Woodpecker");

        System.out.println(Friend.numOfFriends);
        Friend.showFriends();



    }
}
