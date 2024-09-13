package Inventory;
public class Product{


    // Dibuat Private agar varib gak di akses class lain. Kalau protected bisa diakses class lain tapi hanya 
    // Subclassnya.
    protected int number;
    protected String name;
    protected int quantity;
    protected double price;

    public int getNumber() {
        return this.number;
    }

    public void setNumber() {
        this.number = number;
    }
    public String getname() {
        return this.name;
    }

    public void setname() {
        this.name= name;
    }
    public double getprice() {
        return this.price;
    }

    public void setprice() {
        this.price= price;
    }
    public int getquantity() {
        return this.number;
    }

    public void setquantity() {
        this.quantity = quantity;
    }

    public Product(){
        number = 0;
        name = "";
        quantity = 0;
        price = 0;
    }


}