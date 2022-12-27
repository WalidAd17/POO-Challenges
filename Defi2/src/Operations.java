import java.util.HashSet;
import java.util.Set;

public class Operations {

    private Set<Integer> A = new HashSet<>();
    private Set<Integer> B = new HashSet<>();

    public Operations(Set<Integer> A,Set<Integer> B){
        this.A=A;
        this.B=B;
    }

    public void AdifferenceB(Set<Integer> A,Set<Integer> B){
        Set<Integer> Temp = new HashSet<>();

        for (int z : A){
            Temp.add(z);
        }

        for(int i : B){
            if (Temp.contains(i)==true){
                Temp.remove(i);
            }
        }
        System.out.print("A - B = ");
        System.out.print("[");
        int cpt =0;
        for(int j : Temp){
            System.out.print(j);
            if(cpt !=Temp.size()-1){
                System.out.print(" , ");
            }
            cpt++;
        }
        System.out.print("]");
    }

    public void BdifferenceA(Set<Integer> A,Set<Integer> B){
        Set<Integer> Temp = new HashSet<>();

        for (int z : B){
            Temp.add(z);
        }

        for(int i : A){
            if (Temp.contains(i)==true){
                Temp.remove(i);
            }
        }
        System.out.print("B - A = ");
        System.out.print("[");
        int cpt =0;
        for(int j : Temp){
            System.out.print(j);
            if(cpt !=Temp.size()-1){
                System.out.print(" , ");
            }
            cpt++;
        }
        System.out.print("]");
    }

    public void union(Set<Integer> A,Set<Integer> B){
        Set<Integer> Temp = new HashSet<>();

        int tot = A.size()+B.size();
        System.out.print("A ⋃ B = ");
        System.out.print("[");
        for(int j : A){
            Temp.add(j);
        }
        for(int jj : B){
            Temp.add(jj);
        }
        int cpt=0;
        for (int k : Temp){
            System.out.print(k);
            if(cpt !=Temp.size()-1){
                System.out.print(" , ");
            }
            cpt++;
        }
        System.out.print("]");
    }

    public void intersection(Set<Integer> A,Set<Integer> B){
        Set<Integer> Temp = new HashSet<>();

        System.out.print("A ∩ B = ");
        System.out.print("[");
        for(int i : A){
            if (B.contains(i) == true){
                Temp.add(i);
            }
        }
        int cpt=0;
        for (int j:Temp){
            System.out.print(j);
            if(cpt !=Temp.size()-1){
                System.out.print(" , ");
            }
            cpt++;
        }
        System.out.print("]");
    }
}
