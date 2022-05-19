package Q136;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <String> arraylist=new ArrayList<>();
        arraylist.add("tech");
        arraylist.add("expert");
        arraylist.set(0,"java");

       arraylist.forEach(a->a.concat("forum"));
       arraylist.replaceAll(s->s.concat("group"));
        System.out.println(arraylist);


    }
}
