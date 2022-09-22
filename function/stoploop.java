import java.util.*;
public class stoploop {
    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);  
     do{
        System.out.print("enter your number : ");
        int n= sc.nextInt();
        if (n % 10 ==0){
            break;
        }
        System.out.println(n);
     }while(true);
    }
}
// when you put number of multiple of 10 then out loop while over.