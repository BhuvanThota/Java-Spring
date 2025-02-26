package Basics;

@FunctionalInterface
interface Square {
    int calculate(int x);
}


public class Demo {
  public static void main(String args[]) {

    int a = 5;

    // lambda expression to 
    // define the calculate method
    Square s = new Square(){
        public int calculate(int x){
            return x *x;
        }
    }; 

    int ans = s.calculate(a);
    System.out.println(ans);

  
  }
}



