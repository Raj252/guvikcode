import java.util.*;
class number
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arrNum[]=new  int[n];
        for(int i=0;i<n;i++)
        {
            arrNum[i]=input.nextInt();
        }
         Arrays.sort(arrNum);
         int allow=0;
        for(int i =n-1; i >=0 ; i--)
        {   
            if(i==0 && allow==0)
            {
                System.out.print(arrNum[i]); 
            }
            if(arrNum[i]!=0 || allow==1)
            {
                System.out.print(arrNum[i]);
                allow=1;
            }
            
            
        }   
    }
}
