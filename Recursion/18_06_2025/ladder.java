public class Main {
    public static void main(String[] args) {
        printFigure(5);
    }

    public static void printFigure(int n){
        if (n == 0) return;
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
        printFigure(n-1);
        printAnotherFigure(n);
    }
    public static void printAnotherFigure(int n){
        for (int i = 0; i < n; i++){
            System.out.print("#");
        }
        System.out.println();
    }
}