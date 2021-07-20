import java.util.Objects;

public class Programa {
    // [[ytftyfty][tftft][ygygy]]
    public static void main(String[] args_) {
        String[] args = {"soma", "1" , "2", "5", "8", "9", "4", "8", "6", "7"};
        System.out.println("Ligou");
        if (Objects.nonNull(args) && args.length > 0) {
            System.out.println(args[0]);
            if ("soma".equals(args[0])) {
                Integer soma = 0;
                for (int i = 1; i < args.length; i++) {
                    soma += Integer.valueOf(args[i]);
                }
                System.out.println("A soma dos valores: " + soma.toString());
            }else{
                for (String item : args) {
                    System.out.println(item);
                }
            }
        } else {
            System.out.println("nao veio nada :(");
        }
    }
}