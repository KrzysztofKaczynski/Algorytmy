package algorytmyDay1;

public class Zadanie1Maciek{

        public static void main(String[] args) {
            oddNumber();
            evenNumber();
            someNumber();
            fibSequences();
        }

        static void oddNumber(){
            for(int i=1;i<=61;i=i+2){
                System.out.print(i + ", ");
            }
            System.out.println();
        }

        static void evenNumber(){
            for(int i=0;i<=6; i=i+2){
                System.out.print(i + ", " );
            }
            for(int i=4;i>=0;i=i-2){
                System.out.print(i + ", ");
            }
            System.out.println();
        }

        static void someNumber(){
            for(int i=1;i<10;i++){
                System.out.print((i*100) +", " + i + ", ");
            }
            System.out.println();
        }

        static int fibNumber(int n){
            if(n==1 || n==2) {
                return 1;
            } else {
                return fibNumber(n-1) + fibNumber(n-2);
            }
        }

        static void fibSequences(){
            for(int i=1;i<10;i++){
                System.out.print(fibNumber(i) + ", ");
            }
            System.out.println();
        }


}


