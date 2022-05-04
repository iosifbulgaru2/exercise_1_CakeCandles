import java.util.Scanner;

public class BirthdayCake {
    static Scanner sc = new Scanner(System.in);
    static int [] candles;
    static int n;
    static String strHeights;

    static public void readHeight(){
        strHeights = sc.nextLine().replaceAll(" ", "");;
        candles = new int[n];
    }
    static public int birthdayCakeCandles(){
        int max =-1, count = 0;
        for (int i = 0; i < n; i++) {
            if(candles[i] > max){
                max = candles[i];
                count=0;
            }
            if (candles[i] == max)
                    count++;
        }
        return count;
    }

    public static void main(String[] args) {
        do {
            n = sc.nextInt();
        } while (n < 1 || n > 1000);
        sc.nextLine();

        readHeight();
        boolean valid = false;
           do{
               for (int i = 0; i < n; i++) {
                   candles[i] = strHeights.charAt(i)-'0';
                   if(candles[i] > 4 || candles[i] < 1){
                       readHeight();
                   }
                   valid = true;
               }
           }while(!valid);
        System.out.println(birthdayCakeCandles());
    }
}
