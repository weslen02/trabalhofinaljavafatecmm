import calendar.CalendarAgent;
import usuario.Usuario;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

public class HairSalon {
    public static void main(String... args) throws IOException, GeneralSecurityException {
        CalendarAgent ca = new CalendarAgent();
        Usuario us = new Usuario();
        int op;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("digite o valor da operacao 1-cadastrar | 2-imprimir | 3-sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Nome do cliente");
                    us.setNomeCliente("JOAOZINHO");
                    System.out.println("Digite M(para masculino) ou F(para feminino)");
                    us.setGenero(sc.next().charAt(0));
                    System.out.println("Digite sua idade");
                    us.setIdade(sc.nextInt());
                    System.out.println("Clientes:");
                    System.out.println(us);
                    System.out.println("Cadastrado com sucesso!");
                break;

                case 2:
                    ca.listEvent();

                    System.out.println("####################################");
                break;

                case 3:
                    System.out.println("Ate mais!!!");
                break;
                default:
                    System.out.println("Valor invalido");
            }
        } while (op != 3);

        sc.close();
    }
}