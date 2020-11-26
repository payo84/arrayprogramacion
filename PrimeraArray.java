import java.util.Arrays;
public class PrimeraArray {
    public static void main(String[] args){
        int[] array = new int[5];
        System.out.println(Arrays.toString(array));
        array [0] = 35;
        array [1] = 43;
        array [2] = 19;
        array [3] = 17;
        array [4] = 6;
        System.out.println(Arrays.toString(array));
        int[] otro = new int[10];
        for (int i = 0; i< otro.length; i++) {
            otro [i] = i+1;
        }
        for(int i = 0; i<otro.length; i++){
            System.out.print(otro[i] + " ");
        }
        char[] caracteres = {'a','e','i','o','u'};
        System.out.println(Arrays.toString(caracteres));
        for (int i = 0; i< caracteres.length; i++){
            System.out.print(caracteres[i]);
        }



    }
}
