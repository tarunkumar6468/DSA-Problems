package puzz;
import java.util.*;
public class jnasd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            //   int key = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int i = 0 ; i<n; i++){ // row
                for(int j = 0; j<m; j++){ // col
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i = 0 ; i<m; i++){ // row
                for(int j = 0; j<n; j++){ // col
                    arr[j][i] = arr[i][j];
                }
            }

            for(int i = 0 ; i<n; i++){ // row
                for(int j = 0; j<m; j++){ // col
                    System.out.println("matrix = "+arr[i][j]);
                }
            }

        }
    }


