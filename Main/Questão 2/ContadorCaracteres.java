import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(validaTamanhoSenha(scanner.nextLine()));
    }

    private static int validaTamanhoSenha(String nextLine) {
        int qtd =0;
        if(nextLine.length()<6){
            qtd = 6- nextLine.length();
        }
        return qtd;
    }
    
}
