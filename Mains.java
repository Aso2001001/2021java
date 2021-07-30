import java.util.*;

public class Mains{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("**********");
        System.out.println("戦艦ゲーム");
        System.out.println("**********");

        int[][] field = new int[5][5];
        for(int i = 0;i < field.length;i++){
            for(int n = 0;i < field.length;n++){
                field[i][n] = 0;
            }
        }

        Random rand = new Random();
        int num = rand.nextInt(5);

        Ship ship = new Ship();

        int cnt = 1;
        
        System.out.println("----[ターン"+cnt+"]----");
        System.out.println("船1:");
        System.out.println("船2:");
        System.out.println("船3:");

        System.out.println("爆弾のx座標を入力してください(1-5)");
        int x = sc.nextInt();

        System.out.println("爆弾のy座標を入力してください(1-5)");
        int y = sc.nextInt();
        
        Ship.bomb(x,y);
        

        sc.close();
    }
}