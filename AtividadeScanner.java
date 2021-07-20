import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AtividadeScanner {

    public static void main(String[] args) {
        try(Scanner ler = new Scanner(System.in);) {
            List<String> list = new ArrayList<String>();
            String items;
                while(list.size()<5){
                    System.out.println("Adicionar o item " + i + "a lista:");
                    items = ler.nextLine();
                    list.add(items);
                }
        System.out.println(Arrays.toString(list.toArray()));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}