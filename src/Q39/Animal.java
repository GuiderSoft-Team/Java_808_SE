package Q39;

class Animal {
    String type="Canine";
    int maxSpeed=60;

    public Animal() {
    }

    public Animal(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
class WildAnimal extends Animal{
    String bounds;

    WildAnimal (String bounds){
        //line n1
    }
    WildAnimal (String type, int maxSpeed, String bounds){
        //line n2
    }

}
//And given the code fragment:
/*7.WildAnimal wolf=newWildAnimal("Long");
  8.WildAnimal tiger=newWildAnimal("Feline", 80, "Short");
  9.System.out.println(wolf.type + " " +wolf.maxSpeed +" "+wolf.bounds);
  10.System.out.println(wolf.type + " " +tiger.maxSpeed +" "+tiger.bounds);

and this output: Canine 60 Long Feline 80 Short
        Which two modifications enable the code to print this output? (Choose two.)

 A. Replace line n1 with:
    super();
    this.bounds=bounds;

        B. Replace line n1 with:
        this.bounds=bounds;
        super();

        C. Replace line n2 with:
        super(type, maxSpeed);
        this (bounds);

        D. Replace line n1 with:
        this("Canine",60);
        this.bounds=bounds;

        E. Replace line n2 with:
        super(type, maxSpeed);
        this.bounds=bounds;


        A.	Option A

        B.	Option B

        C.	Option C

        D.	Option D

        E.	Option E

        Answer: A E
        */
