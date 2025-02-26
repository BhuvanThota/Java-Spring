

## Encapsulation


- The way to handle the access of the varMem of the class using private and handling the getters and setters is Encapsulation

- This helps in data hiding and gives control for the class data.

 
### Getter and Setter

- The way of handling how the private varMem in the class are handled. 


### This Keyword

- when we have same name for the method arg in a class as the class memVar we can use this.memVar to specify that we are using the Class variable.


```java

class Mobile{

    private String brand;
    private int price;

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

mob1.setBrand("Apple");
mob1.setPrice(100);

mob1.show();
```

________________









