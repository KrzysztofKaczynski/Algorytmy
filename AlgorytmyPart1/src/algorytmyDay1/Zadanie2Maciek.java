package algorytmyDay1;

public class Zadanie2Maciek
{
    public static void main(String[] args) {

        int wysokosc = 7;
        int szerokosc = 7;


        //first
//        for(int i=0; i<wysokość;i++){
//            for(int j=0; j<=i ;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //second
//        for(int i=0; i<wysokość; i++){
//            for(int j=0;j<=i ; j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            System.out.println();
//        }
//
//        //third
//        for(int i=0; i< szerokosc+1; i++){
//            System.out.print("*");
//        }
//        System.out.println("");   //podstawa górna
//        for(int i=1; i<wysokość+1;i++){
//            System.out.print("*");
//            for(int j=1; j < szerokosc  ; j++ ){
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }         //środek (rysujesz * pozniej wolna przestrzeń i znowu *) "*      *"
        // tą sytuacje powtarzasz (idziesz w dół)
//        for(int i=0; i< szerokosc+1; i++){
//            System.out.print("*"); // podstawa dolna
//        }
        //fourth
        int wysokoscPolowy =6; //jak bedziesz to zmieniał to X będzie się zwiększał i zmniejszał
        int d=wysokoscPolowy*2-2; //ile zrobić spacji pomiedzy gwiazdkami
        int p=0; //ile zrobić spacji zanim wstawie gwiazdkę
        //gorna połowa
        for(int i=0;i<wysokoscPolowy;i++){
            for(int j=0;j<p;j++){
                System.out.print(" ");
            }//ilosc spacji przed gwiazdka
            System.out.print("*"); //gwiazdka
            for(int j=0;j<d;j++){
                System.out.print(" ");
            } //ilosc spacji pomiedzy gwiazdkami
            System.out.println("*"); //gwiazdka
            p++; //tutaj dodajemy ilosc spacji przed gwiazdka w kazdej linijce
            d=d-2; // ilość spacji pomiedzy gwiazdkami zmniejsza sie o 2 z jednej i z drugiej strony
        }
        // dolna polowa tak samo jak góra tylko na odwrót jest z p i d
        for(int i=0;i<wysokoscPolowy;i++){
            p--;
            d=d+2;
            for(int j=0;j<p;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<d;j++){
                System.out.print(" ");
            }
            System.out.println("*");


        }




    }
}


