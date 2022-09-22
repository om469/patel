// import  java.util.Scanner;
// public class prime {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();

//         if (n == 2) {
//             System.out.println("n is prime"  );
//         }
//         else{
//             boolean isPrime = true;
//             for (int i =2; i <= Math.sqrt (n); i++){
//                 if(n % i==0 ){
//                     isPrime= false;
//                 }
//             }
//             if (isPrime == true){
//                 System.out.println("n is prime");
//             }
//             else{
//                 System.out.println("n is not prime");
//             }
//         }

//     }
// }


// import  java.util.Scanner;
// public class prime {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();

//         if (n == 2) {
//             System.out.println("n is prime"  );
//         }
//         else{
//             boolean isPrime = true;
//             for (int i =2; i <=n-1; i++){
//                 if(n % i==0 ){
//                     isPrime= false;
//                 }
//             }
//             if (isPrime == true){
//                 System.out.println("n is prime");
//             }
//             else{
//                 System.out.println("n is not prime");
//             }
//         }

//     }
// }


/*CHECK IF A NUMBER IS PRIME OR NOT */




public class prime {
    public static boolean isPrime(int n){
      if (n == 2){
        return true;
      }
        for (int i = 2; i<= n-1; i++){
            if (n % i==0) {
         
         return false; 
            }
        }
         return true;
    }
    
    public static void primeInRange(int n){
        for (int i= 2; i <=n; i++){
            if (isPrime(i)){//true
                System.out.print(i+" ");

            }
        }
        System.out.println();
    }
       public static void main(String args[]){
            
         primeInRange(16);
       }
    
}   