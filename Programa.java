import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Seja Bem-Vindo");
        try (Scanner ler = new Scanner(System.in)) {

            System.out.println("Escreva seu nome:");
            String numero = ler.next();

            System.out.println("Digite o primeiro numero:");
            numero = ler.next();
            verificador(numero);
            System.out.println("Digite o segundo numero: ");
            numero = ler.next();
            verificador(numero);
            System.out.println("Digite o terceiro numero: ");
            numero = ler.next();
            verificador(numero);

        } catch (Exception e) {
            System.out.println("Deu erro :");
        }
    }

    static void verificador(String numero){
            if ("1".equals(numero)||"2".equals(numero)) {
                Integer i = Integer.valueOf(numero);
                System.out.println("Você escreveu o numero: " + i);
            } else{
                System.out.println("Você não escreveu um numero:");
            }
    }
}