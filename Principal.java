import java.util.Scanner;
public class Principal{

    public static void main(String args[]){

        Scanner ler=new Scanner(System.in);
        Conta minhaConta=new Conta();
        //ler.nextLine()//Texto
        //ler.nextInt()//Inteiro
        //ler.nextDouble()//Double

        //int = -12222212121   1515151515
        //long -221212121221  2121221121212121
        //double -1212.00  +151515.5
        //float -121.00  +  1212.1555
        
        System.out.print("Qual o nome do titular: ");
        minhaConta.titular=ler.nextLine();

        System.out.print("Digite o número da Conta sem o dígito: ");
          minhaConta.numero=ler.nextInt();

        System.out.print("Digite a data de Validade: ");
        minhaConta.dataValidade=ler.nextInt();

System.out.println(minhaConta.numero);
System.out.println("Seu saldo é: " +minhaConta.saldo);
    }
}