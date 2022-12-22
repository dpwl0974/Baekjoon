import java.util.Scanner;

public class Main {
    public static int contaxt(int x1, int x2, int y1, int y2, int r1, int r2) {
        int dpow = (int)(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)); 

        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
    
        else if (Math.pow((r2+r1),2) < dpow || Math.pow((r2-r1),2) > dpow) {
            return 0;
        }

        else if(Math.pow((r2+r1),2) == dpow || Math.pow((r2-r1),2) == dpow) {
            return 1;
        }  

        else {
            return 2;
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(contaxt(x1, x2, y1, y2, r1, r2));
        }
    } 
}