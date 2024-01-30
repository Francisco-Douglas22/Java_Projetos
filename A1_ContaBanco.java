//Import da Biblioteca
import java.util.Scanner;

public class A1_ContaBanco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Conta Bancaria em JAVA ====");
        
        //Numero da Conta
        System.out.printf("Digite o numero da Conta: ");
        int numero_conta = sc.nextInt();
        System.out.println("O Numero da Conta e: "+numero_conta);
        
        //Agencia
        System.out.printf("Digite a Agencia da Conta: ");
        int agencia = sc.nextInt();
        System.out.println("A Agencia da conta e: "+ agencia);

        //Nome cliente
        System.out.printf("Digite o nome do Cliente: ");
        final String nomeCliente = sc.nextLine();
        System.out.println("Nome do Cliente: "+nomeCliente);

        //Deposito Bancario
        System.out.printf("Digite quanto deseja Deposita: R$ ");
        double deposito = sc.nextDouble();
        System.out.println("Voce depositou: R$ "+deposito);

        double saldo = deposito;

        //Imprimindo o Resultado
        System.out.println(nomeCliente+" Obrigado Por Cria a Sua conta conosco");
        System.out.println("Sua Conta e: "+numero_conta+" Agencia: "+agencia);
        System.out.println("Voce Depositou R$: "+deposito+ " Seu Saldo e de R$: "+saldo);

        sc.close();



    }


    
}
