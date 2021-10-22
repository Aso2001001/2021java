package rpgcreature;

import java.util.Random;

/**
 * メタルスライムクラス
 */
public class Golem extends Monster{
    private final static int CRITICAL_HIT_RATE = 5;
    
    /**
     * メタルスライムのコンストラクタ
     */
    public Golem(){
        super("ゴーレム",100);
    }

    /**
     * 攻撃メソッド
     * @param opponent：攻撃相手
     */
    @Override
    public void attack(Creature opponent) {
        
        Random r = new Random();
        if( r.nextInt(100) < CRITICAL_HIT_RATE ){
            System.out.printf("%sのクリティカルヒット！\n",getName());
            int damage = 30;

            opponent.damaged(damage);
            
            displayMessage(opponent,damage);

        }else{
            int damage = r.nextInt(5)+5;
            System.out.printf("%sの攻撃！\n",getName());
            
            opponent.damaged(damage);
            
            displayMessage(opponent,damage);
        }
    }
}