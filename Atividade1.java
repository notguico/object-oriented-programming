import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) throws Exception {
    
    Scanner leitor = new Scanner(System.in);

    String[] nome = new String[3];     
    int[] idade = new int[3];
    
    for(int i = 0; i < 3; i++) {
        System.out.println("Digite o nome da pessoa "+(i+1)+":");
        nome[i] = leitor.nextLine();
        System.out.println("Digite a idade da pessoa "+(i+1)+":");
        idade[i] = leitor.nextInt();
        leitor.nextLine();
    }

    leitor.close(); 

    for(int i = 0; i < 3; i++){
        System.out.println(nome[i]+" tem "+idade[i]+" anos.");
    }

    }
}
