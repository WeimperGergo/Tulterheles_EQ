package eq_weimpergergo;

import java.util.Random;

public class EQ_WeimperGergo {

    static String unit = "\uD83D\uDFEA";
    static Random rnd = new Random();
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //eq(5, true);
            //eq(4);
            eq(true);
            //eq();
        }
        
    }

    
    private static void eq(int db, boolean szamKiir) {
        for (int i = 0; i < db; i++) {
            System.out.print(unit);    
        }
        if(szamKiir) System.out.printf("(%d)\n", db);
        else System.out.println("");
    }
    
    private static void eq(int db) {
        eq(db, false);
    }
    
    private static void eq(boolean szamKiir) {
        int db = rnd.nextInt(3, 8);
        eq(db, szamKiir);
    }
    
    private static void eq() {
        eq(false);
    }
    
}
