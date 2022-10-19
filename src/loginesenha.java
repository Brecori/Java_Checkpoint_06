import java.util.Random;
import java.util.Scanner;

public class loginesenha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        String nomeInicial;
        String nameToChar;
        String NOMES[] = new String[1];
        String login = "";
        Random r = new Random();
        String senha[] = new String[12];
        String senhaFinal = "";
        int i, j;
        int indice = 0;
        char letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char simbols[] = {'!','@','#','$','%','&','*'};



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

        for (i=0;i<4;i++) {
            for (j = 0; j<3; j++) {
                do {
                    indice = r.nextInt(12);
                }
                while (senha[indice] != null);

                switch (i) {
                    case 0:
                        senha[indice] = String.valueOf(letras[r.nextInt(26)]);
                        break;
                    case 1:
                        senha[indice] = String.valueOf(letras[r.nextInt(26)]).toLowerCase();
                        break;
                    case 2:
                        senha[indice] = String.valueOf(simbols[r.nextInt(7)]);
                        break;
                    case 3:
                        senha[indice] = String.valueOf(r.nextInt(9));
                        break;
                }
            }

        }

        for (i=0;i< senha.length;i++) {
            senhaFinal = senhaFinal.concat(String.valueOf(senha[i]));
        }


        System.out.println();
        System.out.println("\tSeu Nome: \t" + nomeInicial);
        System.out.println("\tSeu Login: \t" + login);
        System.out.println("\tSua Senha: \t" + senhaFinal);



        input.close();
    }



}
