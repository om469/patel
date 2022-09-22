
// public class pattern {
//     public static void main(String args[]){
//         for(int line=1; line<=4; line++ ){
//             for (int star=1; star<=line; star++){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }


/*reverse pattern */

// public class pattern {
//     public static void main(String args[]){
//         int n= 8;
//         for(int line=1; line<=n; line++ ){
//             for (int star=1; star<=n-line+1; star++){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }


/* half pyramid pattern */



// public class pattern {
//     public static void main(String args[]){
//         int n =9;
//         for(int line=1; line<=n; line++ ){
//             for (int number=1; number<=line; number++){
//                 System.out.print(number);
//             }
//             System.out.println( );
//         }
//     }
// }



/*character pattern */



public class pattern {
    public static void main(String args[]){
        int n= 6;
        char ch= 'A';
        //outer loop
        for(int line=1; line<=n; line++ ){
            //inner loop
            for (int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println( );
        }
    }
}
