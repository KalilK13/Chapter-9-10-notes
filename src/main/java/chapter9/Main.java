package chapter9;

public class Main {
    private double price; //Instance variable with no set value defaults based on type. Located on heap along with class.


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) //Method with local variable price.
    {
        this.price = price;
    }
    public double discountPrice(int percent){
        return getPrice() * ( percent/100 ) + getPrice(); //when this method is called discountPrice will go on the stack along with its local variable-
        //then the getPrice method goes on the stack above it.
    }

}
