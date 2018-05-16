package part1;

/**
 * Created by wojciechpotocki on 24.04.2018.
 */
public class Problem2 {
    public static void main(String[] args) {
        drawTriangle(6);
        System.out.println();
        drawDiagonalLine(6);
        System.out.println();
        drawSquare(6);
    }

    private static void drawTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void drawDiagonalLine(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            System.out.println('*');
        }
    }

    public static void drawSquare(int height) {
        for(int i = 0; i < height; i++) {
            System.out.print('*');
            for(int j = 1; j < height - 1; j++) {
                System.out.print((i == 0 || i == height - 1) ? '*' : ' ');
            }
            System.out.println('*');
        }
    }
}
