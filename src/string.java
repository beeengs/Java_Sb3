import java.util.Locale;

public class string {

    public static void main(String[] args) {

        String name = "Password";

        // int length = name.length();
        // char letter = name.charAt(0);
        // int index = name.indexOf("o");
        // int lastIndex = name.lastIndexOf("o");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("o","a");

        /* ------------------------------------

        System.out.println(name);
        System.out.println(name.isEmpty());

       ------------------------------------------ */

        /* -------------------------------------

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        -------------------------------------- */

        /* ------------------------------------------------------------------

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any space");
        }

        -------------------------------------------------------------------------- */

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello "+ name);
        }

    }
}
