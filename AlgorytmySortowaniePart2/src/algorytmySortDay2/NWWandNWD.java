package algorytmySortDay2;

public class NWWandNWD {

    public static void main(String[] args) {
        int a=12;
        int b=10;
        System.out.println("NWD: " + NWD(a,b));
        System.out.println("NWW: " +  NWW(a,b));
    }

    static int NWD(int a, int b){
        while( a!=b ){
            if(a>b)
                a= a-b;
            else
                b= b-a;
        }
        return a;
    }

    static int NWW(int a, int b) {
        int result =a*b;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return result/a;
    }
}
