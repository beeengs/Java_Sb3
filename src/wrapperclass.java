public class wrapperclass {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility methods.

        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');
        // Boolean d = new Boolean(true);

        // AutoBoxing

        // Integer A = 123;
        // Double B = 3.14;
        // Character C = 'S';
        // Boolean D = true;

        /* -------------------------------------

        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        System.out.println(x);

         ------------------------------------- */

        /* -----------------------------------------

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        String x = a + b + c + d;

        System.out.println(x);

        ------------------------------------------ */

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));







    }
}
