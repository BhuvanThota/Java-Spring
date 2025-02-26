


## Constructors

- The class method which is called to initial default values for a class on creating a class object


### Constructor Overloading

- To have multiple constructors with diff set of args. 


```java
class Mobile{

    private String brand;
    private int price;

    public Mobile(){
        brand = "Apple";
        price = 100;
    }

    public Mobile(String brand){
        this();
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return this.price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void show(){
        System.out.println(getBrand() + " : " + getPrice());
    }
}

Mobile mob1 = new Mobile();

Mobile mob2 = new Mobile("Samsung");

```
