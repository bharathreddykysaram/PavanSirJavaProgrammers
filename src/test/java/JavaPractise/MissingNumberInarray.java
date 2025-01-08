package JavaPractise;

public class MissingNumberInarray {

    public static void main(String[] args) {
        int a[]={1,2,4,5};

        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];

        }
        System.out.println("sum"+sum);
        int sum2=0;
        for (int i=1;i<=5;i++){
            sum2=sum2+i;

        }
        System.out.println("sum2"+sum2);

        int Missingnum=sum2-sum;

        System.out.print("missingNum"+Missingnum);
    }
}
