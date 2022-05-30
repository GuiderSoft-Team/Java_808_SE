package Q212;

/*
Given:
    class P1 {}
    class P2 extends P1 implements I1 {}
    interface I1 {}

and the code fragment :

    P1 obj = new P1 ();
    P2 obj2 = new P2 ();
    I1 obj3 = new P2 ();
    boolean r1 = obj instanceof P2;
    boolean r2 = obj2 instanceof P1;
    boolean r3 = obj3 instanceof I1;
    System.out.println(r1 + ":" + r2 + ":" +r3);

What is the result?
A. true:false:true
B. false:true:true
C. false:true:false
D. true:true:false
Answer: B    
*/
