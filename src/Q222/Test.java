package Q222;

/*
Given the code fragment:

List<String> 1st = Arrays.asList("EN", "FR", "CH", "JP" );
Iterator<String> itr = 1st.iterator();
while(itr.hasNext()) {
    String e = itr.next();
    if (e == "CH") {
        break;
    }
System.out.print(e + " ");    
}
What is the result?
A. EN FR JP
B. EN FR
C. CH
D. EN FR CH
Answer: B

Explnation:
public class Main {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("EN", "FR", "CH", "JP");
        Iterator<String> itr = lst.iterator();
        while(ltr.hasNext()) {
            String e = itr.next();
            if(e == "CH") {
                break;
            }
            System.out.print(e+ " ");
        }
    }
    
} 
Result
CPU Time: 0.28 sec(s), Memory: 35336 kilobyte(s) 
*/