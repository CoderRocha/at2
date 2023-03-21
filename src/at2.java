import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = input.nextLine().charAt(0);

        System.out.print("Digite o estado civil: ");
        String estadoCivil = input.nextLine();

        if (sexo == 'F' && estadoCivil.equalsIgnoreCase("CASADA")) {
            System.out.print("Digite o tempo de casada (anos): ");
            int tempoCasada = input.nextInt();

            System.out.println("Nome: " + nome);
            System.out.println("Sexo: " + sexo);
            System.out.println("Estado Civil: " + estadoCivil);
            System.out.println("Tempo de Casada: " + tempoCasada + " anos");
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("Sexo: " + sexo);
            System.out.println("Estado Civil: " + estadoCivil);
        }
    }
}
