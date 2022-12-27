public class Main {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        int[] tab1 = {13,4,28,101,10,15,20,1,32,33,16};
        int[] tab2 = {2,4,6,8,1};
        Convertion C = new Convertion(tab);

        C.EvenBeforeOdd(tab);
        C.EvenBeforeOdd(tab1);
        C.EvenBeforeOdd(tab2);
    }
}
