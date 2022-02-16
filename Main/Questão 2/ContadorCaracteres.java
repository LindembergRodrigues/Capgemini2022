import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(validaTamanhoSenha(scanner.nextLine()));
    }
    /**
     * verifica se o tamanho da senha fornecida foi satisfeito
     * @param nextLine a senha fornecida
     * @return 0 caso o tamanho seja satisfeita ou a quantidade de caracteres a ser adicionado
     */
    private static int validaTamanhoSenha(String nextLine) {
        int qtd =0;
        if(nextLine.length()<6){
            qtd = 6- nextLine.length();
        }
        return qtd;
    }
    
}
