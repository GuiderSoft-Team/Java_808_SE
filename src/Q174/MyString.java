package Q174;

class MyString {
    String msg;

    MyString(String msg) {
        this.msg = msg;

    }
}
//Test.java:
class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8").msg);


    }
}
/*
    What is
    the result?

        a)Hello Java SE 8
        Hello Java SE 8

        b)Hello java.lang.StringBuilder@<<hashcode1>>
        Hello p1.MyString@<<hashcode2>>

        c)Hello Java SE 8
        Hello p1.MyString@<<hashcode>>

        d)Compilation fails at the Test


        A.Option A
        B.Option B
        C.Option C
        D.Option D
        E.Option E

        Answer:A*/
