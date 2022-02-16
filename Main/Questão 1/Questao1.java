import java.util.Scanner;

public class Questao1{
    /**
     * Executa o programa 
     * @param args
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(criarTrianguloDeAsteriscos( in.nextInt()));
    }
    /**
     * gera o triangulo de asteriscos a ser criado 
     * @param nextInt o tamanho na vertical 
     * @return o triangulo de asteriscos  criado
     */
    private static String criarTrianguloDeAsteriscos(int nextInt) {
        String triangulo ="";
        for (int i=1 ; i<=nextInt ; i++) {
            for (int j=0 ; j<nextInt ; j++) {
                if (j< (nextInt-i)){
                    triangulo += " ";
                }else{
                    triangulo += "*";
                }
            }
            triangulo+="\n";
        }
        return triangulo;
    }

}