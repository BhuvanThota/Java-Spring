package Basics;

class Calc{


    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }
}

public class Demo {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 6;

        Calc cal = new Calc();
        int res = cal.add(a,b,c);

        System.out.println(res);

    }
}
