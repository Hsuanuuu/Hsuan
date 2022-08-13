import java.util.Random;
import java.util.Scanner;

public class UltimatePassword {
    public static void main(String[] args) {
       //透過Scanner來獲取使用者的輸入
        Scanner s= new Scanner(System.in);
        int min=0;
        int max=100;
        Random r= new Random();//建立隨機數
        int secret=r.nextInt(max-min)+min;
        //System.out.println("隨機數為:"+secret);

        while (true){
            System.out.print("猜一個數位於"+min+"到"+max+"之間");
            int guess = s.nextInt();//next方式接收字串

            if(guess < min || guess > max) {
                System.out.println("數值不正確，要介於0~100之間");
                continue;
            }

            if(guess == secret)
            {
                System.out.println("猜中了!!!這個數字是" + secret);
                break;//猜對了就結束這個loop
            }
            else if(guess < secret)
            {
                min=guess;
            }
            else
            {
                max=guess;
            }
        }
    }
}
