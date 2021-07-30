public class Ship{
    private int x;
    private int y;
    private int hp;

    
    public static String shiphp(int hp){
        if(hp > 0){
            return "生きてる";
        }else{
            return "撃沈済み";
        }
    }
    

    public static void bomb(int x,int y){
        System.out.println("はずれ！");
        System.out.println("波高し！");
        System.out.println("爆弾が当たった！しかし船はまだ沈まない！船は移動します");
        System.out.println("爆弾が当たった！撃沈しました！");
    }
}
