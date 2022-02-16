import java.util.Scanner;

public class Questao1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(criarTrianguloDeAsteriscos( in.nextInt()));
    }

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