package WhileLoops;

import java.util.Scanner;

public class P15NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 1;
        for(int i=0; i<n ; i++){
            for(int j=0; j<n ; j++){
                if(i>=j){
                    System.out.print(num);
                    System.out.print(" ");
                    num++;
                }
                if(num > n){
                    break;
                }
            }
            System.out.println();
            if(num > n){
                break;
            }
        }
    }
}
