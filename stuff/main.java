package stuff;
public class main{
    public static void main(String args[]){
        int result = addNumbers(1,1);
        printHello1();
        printHello2();
        printHello3();
    }

    public static void printHello1(){
        System.out.println("hello2");
    }

    public static void printHello2(){
        System.out.println("hello3");
    }

    public static void printHello3(){
        System.out.println("hello4");
    }

    public static int addNumbers(int a, int b){
        return a+b;
    }


}