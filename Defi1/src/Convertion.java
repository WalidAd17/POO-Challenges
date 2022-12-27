import java.util.ArrayList;
import java.util.Arrays;

public class Convertion {

    private int[] tableau_nombre;

    //Constructeur---------------------------
    public Convertion(int[] tableau_nombre){
        this.tableau_nombre=tableau_nombre;
    }
    //---------------------------------------

    //La méthode principale : EvenBeforeOdd qui réorganise un tab donné de valeurs afin que les nombres pairs apparaissent en premier,
    //suivis des nombres impairs-----------------------------------------
    public void EvenBeforeOdd(int[] tab){
        System.out.print(Arrays.toString(tab)+" => ");
        ArrayList<Integer> tab_pairs = new ArrayList<Integer>();
        ArrayList<Integer> tab_impairs = new ArrayList<Integer>();

        for (int i=0; i<tab.length;i++){
            if (tab[i] % 2 == 0){
                tab_pairs.add(tab[i]);
            }else{
                tab_impairs.add(tab[i]);
            }
        }
        int pos = 0;
        for (int i : tab_pairs)
        {
            tab[pos] = i;
            pos++;
        }
        for (int i : tab_impairs)
        {
            tab[pos] = i;
            pos++;
        }
        System.out.println(Arrays.toString(tab));
    }
    //-------------------------------------------------------------------
}
