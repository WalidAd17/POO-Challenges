import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        System.out.println("");
        System.out.println("        ****************************************************************************");
        System.out.println("                    Bienvenue dans le défi n°2 sur les ensembles");
        System.out.println("        ****************************************************************************");
        int choix;
        do {
            System.out.println("______________________");
            System.out.println("Le menu :             |");
            System.out.println("---------             |");
            System.out.println("1 - Jouez .           |");
            System.out.println("2 - Quitter .         |");
            System.out.println("______________________");
            System.out.print("Votre choix : ");
            choix= scanner.nextInt();
            switch (choix){
                case 1:
                    System.out.print("=> Donner la taille de la collection A : ");
                    int nbA = scanner.nextInt();
                    for (int i=0; i<nbA; i++){
                        System.out.print("L'element n° "+(i+1)+" de A : ");
                        int x = scanner.nextInt();
                        A.add(x);
                    }

                    System.out.println(" ------------------------------ ");

                    System.out.print("=> Donner la taille de la collection B : ");
                    int nbB = scanner.nextInt();
                    for (int i=0; i<nbB; i++){
                        System.out.print("L'element n° "+(i+1)+" de B : ");
                        int y = scanner.nextInt();
                        B.add(y);
                    }
                    System.out.println("");
                    System.out.println("****************************************************************************");


                    System.out.print("La collection A = ");
                    System.out.print("[");
                    int cptt=0;

                    for(int k : A) {
                        System.out.print(k);
                        if (cptt != A.size() - 1) {
                            System.out.print(" , ");
                        }
                        cptt++;
                    }
                    System.out.print("]");

                    System.out.print("  et  ");
                    System.out.print("La collection B = ");
                    System.out.print("[");
                    int cpt=0;
                    for(int o : B){
                        System.out.print(o);
                        if(cpt !=B.size()-1){
                            System.out.print(" , ");
                        }
                        cpt++;
                    }
                    System.out.println("]");
                    System.out.println("****************************************************************************");


                    Operations O = new Operations(A,B);

                    O.AdifferenceB(A,B);
                    System.out.print("  |  ");
                    O.BdifferenceA(A,B);
                    System.out.print("  |  ");
                    O.union(A,B);
                    System.out.print("  |  ");
                    O.intersection(A,B);
                    System.out.println("");
                    System.out.println("****************************************************************************");

                    break;
                case 2:
                    System.out.println("Vous avez quitté le programme :) Merci");
                    break;
                default:
                    System.out.println("Attention ! Veuillez choisir un numéro qui existe dans le menu ");
                    break;
            }

        }while(choix != 2);
    }
}