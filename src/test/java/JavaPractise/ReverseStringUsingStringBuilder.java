package JavaPractise;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {

        String str="welcome to java";
        String [] revword=str.split("//s");
        String finalrev="";
        for (String w:revword) {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            finalrev=finalrev+sb.toString()+" ";

        }
             System.out.print(finalrev);
    }
}
