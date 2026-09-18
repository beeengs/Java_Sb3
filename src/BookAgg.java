public class BookAgg {

    String title;
    int pages;

    BookAgg(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title +" (" + this.pages + " pages)";


    }


}
