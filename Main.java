import java.util.Scanner;

public class Main {

    //metodo de soma
    public static double Soma(double n1, double n2) {
        return n1 + n2;
    }

    //metodo de subtraçao
    public static double Sub(double n1, double n2) {
        return n1 - n2;
    }

    //metodo de multiplicaçao
    public static double Mul(double n1, double n2) {
        return n1 * n2;
    }

    //metodo de divisao
    public static double Div(double n1, double n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] historico = new double[1000]; //vetor pra saber se acabou os vetores
        double[] historicoR = new double[1000]; //vetor do historico do resultado
        double[] num1 = new double[1000]; //vetor do 1 numero
        double[] num2 = new double[1000]; //vetor do 2 numero
        String[] operador = new String[1000]; //vetor dos operadores

        // mensagem inicial
        System.out.println("------BEM-VINDO------");
        System.out.println("---------A----------");
        System.out.println("---CALCULADORA-SIMPLES---");
        System.out.println("");

        //laço que ira se repetir infionitamente ate o usuario digitar 3 no menu
        int i = 0;
        do {
            // menu
            System.out.println("");
            System.out.println("1.INICIAR:");
            System.out.println("2.HISTÓRICO");
            System.out.println("3.SAIR");
            int menu = scanner.nextInt();

            //Iniciar
            if (menu == 1) {
                //1 numero inserido
                System.out.println("Numero: ");
                num1[i] = scanner.nextDouble();

                //2 numero inserido
                System.out.println("Numero: ");
                num2[i] = scanner.nextDouble();

                //operador inserido
                System.out.println("Operador (+),(-),(x),(/): ");
                operador[i] = scanner.next();

                //if para chamar o metodo correto dependendo do operador escolhido

                //operador +
                if (operador[i].equals("+")) {
                    System.out.println("resultado: " + Soma(num1[i], num2[i]));
                    historicoR[i] = Soma(num1[i], num2[i]);
                    historico[i] = 1;
                    i++;

                //operador -
                } else if (operador[i].equals("-")) {
                    System.out.println("resultado: " + Sub(num1[i], num2[i]));
                    historicoR[i] = Sub(num1[i], num2[i]);
                    historico[i] = 1;
                    i++;

                //operador *
                } else if (operador[i].equals("*")) {
                    System.out.println("resultado: " + Mul(num1[i], num2[i]));
                    historicoR[i] = Mul(num1[i], num2[i]);
                    historico[i] = 1;
                    i++;

                //operador /
                } else if (operador[i].equals("/")) {
                    System.out.println("resultado: " + Div(num1[i], num2[i]));
                    historicoR[i] = Div(num1[i], num2[i]);
                    historico[i] = 1;
                    i++;

                //operador invalido
                } else {
                    System.out.println("Operador inválido");
                }
            }

            //historico
            else if (menu == 2) {
                for(int x = 0; ; x++){
                    if(historico[x] == 0){
                        break;
                    }

                    System.out.println(x + ". " + num1[x] + " " + operador[x] + " " + num2[x] + " = " + historicoR[x]);
                }

            }//sair
            else if (menu == 3) {
                System.out.println("saindo...");
                break;

            } //opcao invalida
            else {
                System.out.println("Opção inválida");
            }

        } while (i < 1000);
    }
}
