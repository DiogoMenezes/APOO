package exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        Cliente c1,c2;
               
        c1 = new Cliente();
        c1.nome = "Marcelo Loutfi";
        c1.conta = new Conta();
        c1.conta.numero=1;
        c1.conta.saldo=800;
        c1.conta.banco = new Banco();
        c1.conta.banco.nome="Banco Lehman Brothers";
        
        
        c2 = new Cliente();
        c2.nome = "Bill Gates";
        c2.conta = new Conta();
        c2.conta.numero=2;
        c2.conta.saldo=200;
        c2.conta.banco = new Banco();
        c2.conta.banco.nome="Banco Lehman Brothers";
        
        //System.out.println( c2.conta.saldo);
    }
}
