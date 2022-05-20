package Q135;
public class Planet {
    public String name;
    public int moons;
    public Planet(String name,int moons)
    {
        this.name=name;
        this.moons=moons;
    }

    public static void main(String[] args) {
        Planet[]planets={
                new Planet("mercury",0),
                new Planet("venus",0),
                new Planet("earth",1),
                new Planet("mars",2) };
        System.out.println(planets);
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);


        //what is result?
        //cevap  [LQ135.Planet;@4617c264   earth  1
    }
}
