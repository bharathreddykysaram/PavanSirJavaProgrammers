package JavaPractise;

public class CountWordsInString {

    public static void main(String[] args) {

        String str="welcome to java";

        //we need to create conditin
       int coumt=1;
        for (int i=0;i<str.length()-1;i++)
        {
            if((str.charAt(i)==' ') && (str.charAt(i)!=' ')){
                coumt++;
            }

        }
        System.out.print(coumt);
    }

}
