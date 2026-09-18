public class aggregation {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure.
        //               but the contained object/s can exist independently.

        BookAgg bookAgg1 = new BookAgg("The Fellow of the Ring", 423);
        BookAgg bookAgg2 = new BookAgg("The Two Towers", 352);
        BookAgg bookAgg3 = new BookAgg("The Return of the King", 416);

        BookAgg[] bookAggs = {bookAgg1, bookAgg2, bookAgg3};

        /*----------------------------------------------

        for(BookAgg bookAgg : bookAggs){
            System.out.println(bookAgg.displayInfo());
        }

        -----------------------------------------------*/

        LibraryAgg libraryAgg = new LibraryAgg("NYC Public Libraru", 1897, bookAggs);

        libraryAgg.displayInfo();

    }
}
