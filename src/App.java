import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] vect = new int[n];
       for(int i = 0; i<n; i++){
        vect[i] = sc.nextInt();
       }
       for(int v:vect){
        System.out.println(v);
       }
       sc.close();

    }
}
