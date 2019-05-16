package oopsconcepts;
// sample program to illustate method overloading
public class TestOverloading {
    static int mul(int a){
        return 2*a;
    }
    static  int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        System.out.println(mul(10));
        System.out.println(mul(10,20));
    }
}
