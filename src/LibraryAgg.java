public class LibraryAgg {

    String name;
    int year;
    BookAgg[] bookAggs;

    LibraryAgg(String name, int year, BookAgg[] bookAggs){
        this.name = name;
        this.year = year;
        this.bookAggs = bookAggs;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available: ");

        for(BookAgg bookAgg : bookAggs){
            System.out.println(bookAgg.displayInfo());
        }
    }
}
