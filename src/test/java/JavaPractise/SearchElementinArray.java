package JavaPractise;

public class SearchElementinArray {

    public static void main(String[] args) {
        int a[]={20,30,40,50,60};

        int serach_ele=50;
          boolean flag =false;
        for (int i=0;i<a.length;i++)
        {
            if(serach_ele==a[i]){
                System.out.print("found");
               flag=true;
               break;

            }
        }
        if (flag==false) {
            System.out.print("not found");
        }
        }
}
