package JavaPractise;

public class CountCharatcorseq {

    public static void main(String[] args) {
        String seq="java programming";

        int totalcount=seq.length();
        int replacelength=seq.replace("a","").length();
        int count=totalcount-replacelength;

        System.out.print("count+"+count);

    }
}
