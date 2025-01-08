package JavaPractise;

public class Reverse_Each_Wordin_String {
    public static void main(String[] args) {

        String str="welcome to java";

        //first we need to split

        String [] strarray=str.split(" ");

        //we need to reverse each word
        String finalRevword="";

        for(String revstr:strarray ){
            String revword="";
            for (int i=revstr.length()-1;i>=0;i--){
               revword=revword+revstr.charAt(i);
            }
          //we need to append to last string
            finalRevword=finalRevword+revword+" ";
        }


        System.out.print(finalRevword);
    }
}
