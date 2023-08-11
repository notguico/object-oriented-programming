import java.util.Scanner;

public class Atividade1Bubble {
    public static void main(String[] args) throws Exception {
    
    Scanner leitor = new Scanner(System.in);

    String[] nome = new String[5];     
    int[] idade = new int[5];
    
    for(int i = 0; i < 5; i++) {
        System.out.println("Digite o nome da pessoa "+(i+1)+":");
        nome[i] = leitor.nextLine();
        System.out.println("Digite a idade da pessoa "+(i+1)+":");
        idade[i] = leitor.nextInt();
        leitor.nextLine();
    }
    leitor.close(); 
    
    //ordenando com BubbleSort
    int aux = 0;
    String auxString = new String();
    for(int i = 0; i<5; i++){
        for(int j = 0; j<4; j++){
            if(idade[j] < idade[j + 1]){
                aux = idade[j];
                idade[j] = idade[j+1];
                idade[j+1] = aux;
                auxString = nome[j];
                nome[j] = nome[j+1];
                nome[j+1] = auxString;
            }
        }
    }

    for(int i = 0; i < 5; i++){
        System.out.println(nome[i]+" tem "+idade[i]+" anos.");
    }

    }
}
