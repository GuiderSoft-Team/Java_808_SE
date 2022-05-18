package Q64;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello "+new StringBuilder("Java SE 8"));
        System.out.println("Hello "+new MyString(("Java SE 8")));
    }
}


/*Answer
Hello Java SE 8
Hello Q64.MyString@4eec7777
* */