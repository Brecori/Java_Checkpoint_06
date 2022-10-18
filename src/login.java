import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        String nomeInicial;
        String nameToChar;
        String NOMES[] = new String[1];
        String login = "";
        int i;

        System.out.print("Insira o seu nome completo: ");
        nomeInicial = input.nextLine();

        nome = nomeInicial;
        nome = nome.replace(" das ", " da ");
        nome = nome.replace(" dos ", " do ");
        nome = nome.replaceAll(" d[aeo] ", " ");
        NOMES = nome.split(" ");
        int ultimoNome = NOMES.length - 1;

        if (NOMES.length > 2) {
            for (i = 0; i < NOMES.length; i++) {
                if (i < 2) {
                    login = login.concat(String.valueOf(NOMES[i].charAt(0)));
                }

            }
                login = login.concat(NOMES[ultimoNome]).toLowerCase();
        }
        else {
            login = login.concat(String.valueOf(NOMES[0].charAt(0)));
            login = login.concat(NOMES[ultimoNome]).toLowerCase();
        }
        System.out.println();
        System.out.println("\tSeu Nome: \t" + nomeInicial);
        System.out.println("\tSeu Login: \t" + login);











        input.close();
    }
}
