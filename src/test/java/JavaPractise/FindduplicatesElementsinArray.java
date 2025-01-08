package JavaPractise;

public class FindduplicatesElementsinArray {

    public static void main(String[] args) {

        String strarr[]={"java","c","phython","java","c"};

        for (int i=0;i<strarr.length;i++)
        {
            for (int j=i+1;j<strarr.length;j++){

                if(strarr[i]==strarr[j]){
                    System.out.print("Duplicates found"+ strarr[i]);
                }

        }
        }
    }
}
