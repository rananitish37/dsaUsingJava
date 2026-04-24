import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class KillMonster{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int initialExp = sc.nextInt();

        int[] monst = new int[n];
        int[] bonus = new int[n];

        for(int i=0; i<n; i++) monst[i]=sc.nextInt();
        for(int i=0; i<n; i++) bonus[i]=sc.nextInt();

        class Monster{
            int power, bonus;
            Monster(int power, int bonus){
                this.power=power;
                this.bonus=bonus;
            }
        }

        Monster[] monster = new Monster[n];
        for(int i=0; i<n; i++) monster[i] = new Monster(monst[i], bonus[i]);

        Arrays.sort(monster, Comparator.comparingInt(m -> m.power));

        int count =0;
        for(Monster m : monster){
            if(initialExp < m.power) break;
            initialExp += m.bonus;
            count++;
        }

        System.out.print("We can kill: "+count);
    }

}