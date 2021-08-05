package day4;

public class TC200 {
    //finish tc 200
    public static void main(String[] args) {
        Boolean b = new Boolean("true");
        Boolean b1 = new Boolean("tRue");
        System.out.println(b.equals(b1));

        Boolean r1 = Boolean.parseBoolean("TrUe");
        Boolean r2 = Boolean.parseBoolean("true");
        System.out.println("r1 = " + r1); //true
        System.out.println("r2 = " + r2); //true
        //new commit


    }
}
