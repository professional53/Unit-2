package string_methods_examples;

public class Main {
    public static void main(String[] args) {
        //String with constructor vs string literal
        String myFirstName = new String("Brandon");
        String myLastName = "Smith";
        String anotherFirstName = new String("Brandon");
        String anotherLastName = "Smith";

        System.out.println(myFirstName == anotherFirstName);
        System.out.println(myLastName == anotherLastName);

        // To compare two objects, use .equals
        System.out.println(myFirstName.equals(anotherFirstName));
        //String length
        System.out.println(myFirstName.length());
        //substring method
        System.out.println(myFirstName.substring(0,5));
        //get "don"
        System.out.println(myFirstName.substring(4));
        //indexOf = finds location of first instance of string
        System.out.println(myFirstName.indexOf("d"));
        //equals method

        //compareTo

    }
}
