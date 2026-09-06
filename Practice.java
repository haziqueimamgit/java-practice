public class Practice {
    public static void main(String[] args) {
        String name = "Hazique";
        name = name.toLowerCase();
        System.out.println(name);

        String fullName = "Hazique Imam";
        fullName = fullName.replace(" ", "_");
        System.out.println(fullName);

        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Hazique");
        System.out.println(letter);

        String mystring = "we will solve  java string     practice";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
    }
}