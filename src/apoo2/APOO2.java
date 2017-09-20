/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apoo2;

public class APOO2 {

    public static void main(String[] args) {
        Presidente p = new Presidente();
        p.nome = "  Alexandre  Calil ";
        p.clube = new Clube[1];
        p.clube[1].nome = "Atlético Mineiro";
        p.clube[1].cnpj = "1223344556677";
        p.clube[1].endereco = new Endereco[1];
        
        p.clube[1].endereco[1].bairro = "Pampulha";
        p.clube[1].endereco[1].rua = "Rua Tiradentes";
        p.clube[1].endereco[1].cidade = "Belo Horizonte";
        p.clube[1].endereco[1].estado = "MG";
        p.clube[1].endereco[1].numero = 341;
        
        p.endereco = new Endereco[1];
        p.endereco[1] = p.clube[1].endereco[1];
        System.out.println( p.clube[1].nome);
       
    }
}
