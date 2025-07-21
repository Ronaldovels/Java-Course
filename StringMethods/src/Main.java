public class Main {

    public static void main(String[] args) {

        String name = "Curious George";

        int length = name.length();
        char letter = name.charAt(4);
        int index = name.indexOf("r");
        int lastIndex = name.lastIndexOf("r");

        String nameUpper = name.toUpperCase();
        String nameLower = name.toLowerCase();
        String cleanName = name.trim();
        String changeName = name.replace("u", "x");

        System.out.println(name);
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(nameUpper);
        System.out.println(nameLower);
        System.out.println(changeName);
        System.out.println(name.isEmpty());
        System.out.println(name.contains("r"));
        System.out.println(name.equals("Curious George"));
        System.out.println(name.equalsIgnoreCase("Curious George"));




    }
}
