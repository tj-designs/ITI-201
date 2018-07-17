public class Assignment1 {
    public static void main(String[] args){  // your program should have a main method.
        // Create 2 Strings firstName and lastName that contain your first and last name (with the first letter capitalized)
        String firstName = "Tahjaun";
        String lastName = "Clarke";

        // Print your first and last name on two separate lines with one print statement
        System.out.println(firstName + "\n" + lastName);
        // Using the Strings your created and one print statement print your first and last name on the same line with a space between them
        System.out.println(firstName + " " + lastName);
        // Using the Strings you created and one print statement print your last name then your first name separated by a comma then a space
        System.out.println(lastName + "," + " " + firstName);
        // Using the Strings you created print your first name in all uppercase
        System.out.println(firstName.toUpperCase());
        // Using the Strings you created print your last name in all lowercase
        System.out.println(lastName.toLowerCase());
        // Using the Strings you created print the third letter of your first name
        System.out.println(firstName.charAt(2));
        // Using the Strings you created print the second letter of your last name
        System.out.println(lastName.charAt(1));
        // Using the Strings you created print the first two letters of your first name
        System.out.println(firstName.substring(0,2));
        // Using the Strings you created print the second and third letter of your lastname
        System.out.println(lastName.substring(1,3));
    }

}
