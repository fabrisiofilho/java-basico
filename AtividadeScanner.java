import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AtividadeScanner {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        Integer i = 0;
        String items;
        while(i<5){
            System.out.println("Adicionar o item " + i + "a lista:");
            items = ler.nextLine();
            list.add(items);
            i++;
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}