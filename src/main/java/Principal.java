import java.util.Scanner;

/**
 *
 * @author 10725213830
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ANO, ANOA;
        System.out.println("Insira o seu ano de nascimento abaixo:");
        ANO = sc.nextInt();
        System.out.println("Insira o ano atual abaixo:");
        ANOA = sc.nextInt();
        
        if (ANO <= ANOA) {
            System.out.println("Sua Idade e: " + (2026 - ANO));
        }
        else {
            System.out.println("Idade invalida");
        }
        
        
        
    }
}
