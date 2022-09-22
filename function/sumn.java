import java.util.*;
public class sumn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range= sc.nextInt();
        int sum = 0;
        int i=1;
        while (i<=range){
        sum += i;
        i++;
      
        }
        // System.out.println("sum is : " + sum);
        System.out.println(sum+ " ");
    }
}
