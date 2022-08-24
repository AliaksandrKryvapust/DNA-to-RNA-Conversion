public class Source {
    public static void main(String[] args) {
    String str = "GCAT";
        System.out.println(dnaToRna(str).equals("GCAU"));
    }
    public static String dnaToRna(String dna) {
        return dna.replaceAll("T","U");
    }
}
