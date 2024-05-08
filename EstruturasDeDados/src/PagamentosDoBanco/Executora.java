package pagamentosdobanco;

import java.util.*;

public class Executora {
    public static void main(String[] args) throws Exception {
        testarBanco();
    }

    public static void testarBanco() {
        int classes = 111;
        TabelaDePagamentos tabela = new TabelaDePagamentos(classes);
        ArrayList<Integer> listaNumerosGerados = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            int numero = gerarNumeroAleatorioUnico(listaNumerosGerados);
            listaNumerosGerados.add(numero);
            tabela.inserir(numero);
        }
        Scanner input = new Scanner(System.in);
        String comando;
        do {
            mostrarMenu();
            comando = input.nextLine();
            comando = comando.toUpperCase();
            switch (comando) {
                case ("P"):
                    System.out.println("Digite o identificador do pagamento a ser pesquisado");
                    int pesquisado = lerNumeroInteiro(input);
                    if (tabela.consultar(pesquisado) != -1) {
                        System.out.println(
                                "Pagamento n° " + pesquisado + " localizado na classe " + (pesquisado % classes));
                    } else {
                        System.out.println(
                                "Não foi encontrado o pagamento n° " + pesquisado + " na classe "
                                        + pesquisado % classes);
                    }
                    break;
                case ("R"):
                    System.out.println("Digite o identificador do pagamento a ser removido");
                    int removido = lerNumeroInteiro(input);
                    tabela.remover(removido);
                    break;
                case ("M"):
                    tabela.mostrar();
                    break;
                case ("S"):
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Comando invalido");
                    break;
            }
        } while (!comando.equals("S"));
        input.close();
    }

    public static int gerarNumeroAleatorioUnico(ArrayList<Integer> listaNumerosGerados) {
        Random gerador = new Random();
        int numero = gerador.nextInt(5000);
        if (listaNumerosGerados.contains(numero)) {
            do {
                numero = gerador.nextInt(5000);
            } while (listaNumerosGerados.contains(numero));
        }
        return numero;

    }

    public static int lerNumeroInteiro(Scanner scanner) {
        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num >= 0) {
                    return num;
                }
                while (num < 0) {
                    System.out.println("Digite um numero entre 0-4999");
                    num = Integer.parseInt(scanner.nextLine());
                }
                return num;

            } catch (NumberFormatException e) {
                System.out.println("Digite um numero entre 0-4999");
            }
        }
    }

    public static void mostrarMenu() {
        StringBuilder texto = new StringBuilder("-----------------------");
        texto.append("\nMenu de consulta")
                .append("\n-----------------------")
                .append("\nP-Pesquisar")
                .append("\nR-Remover")
                .append("\nM-Mostrar")
                .append("\nS-Sair")
                .append(("\n-----------------------"));
        System.out.println(texto);
    }

}
