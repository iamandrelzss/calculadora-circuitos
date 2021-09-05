import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner Entrada_V_R_I = new Scanner(System.in);
        System.out.println("Digite V se você quer calcular o valor da tensão: ");
        System.out.println("Digite R se você quer calcular o valor da resistência: ");
        System.out.println("Digite I se você quer calcular o valor da corrente: ");
        String Chave_Para_Ser_Calculada = Entrada_V_R_I.nextLine();

        switch (Chave_Para_Ser_Calculada) {

            case "V":
                System.out.println("Digite o valor do resistor: ");
                int Valor_do_Resistor_Calculo_Tensao = Entrada_V_R_I.nextInt();

                System.out.println("Digite o valor da corrente: ");
                double Valor_da_Corrente_Calculo_Tensao = Entrada_V_R_I.nextDouble();

                double Resultado_Final_Calculo_Da_Tensao = (Valor_do_Resistor_Calculo_Tensao * Valor_da_Corrente_Calculo_Tensao);
                System.out.println("A tensão é de: " + Resultado_Final_Calculo_Da_Tensao);
                break;

            case "R":
                System.out.println("Digite o valor da tensão: ");
                double Valor_da_Tensão_Calculo_Do_Valor_do_Resistor = Entrada_V_R_I.nextDouble();

                System.out.println("Digite o valor da corrente");
                double Valor_da_Corrente_Calculo_Do_Valor_do_Resistor = Entrada_V_R_I.nextDouble();

                double Valor_do_Resistor = (Valor_da_Tensão_Calculo_Do_Valor_do_Resistor / Valor_da_Corrente_Calculo_Do_Valor_do_Resistor);
                System.out.println("O Valor do Resistor é de: " + Valor_do_Resistor);
                break;

            case "I":
                System.out.println("Digite o valor da tensão: ");
                double Valor_da_Tensão_Calculo_Do_Valor_da_Corrente = Entrada_V_R_I.nextDouble();

                System.out.println("Digite o valor do resistor: ");
                double Valor_do_Resistor__Calculo_da_Corrente = Entrada_V_R_I.nextDouble();

                double Valor_da_Corrente = (Valor_da_Tensão_Calculo_Do_Valor_da_Corrente / Valor_do_Resistor__Calculo_da_Corrente);
                System.out.println("O valor da corrente é de: " + Valor_da_Corrente);

                default:
                    System.out.println("Digite um valor válido");
                    break;
        }

        Entrada_V_R_I.close();
    }

}