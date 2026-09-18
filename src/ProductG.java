public class ProductG<T, U> {

    T item;
    U price;

    ProductG(T item , U price){
        this.item = item;
        this.price = price;

    }

    public T getitem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }

}
