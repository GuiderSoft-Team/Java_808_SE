package Q165;

public class OraString {

    String s;
    public boolean equals(OraString str){
        return this.s.equals(str.toString());
    }


    OraString(String s) {
        this.s=s;
    }
}
