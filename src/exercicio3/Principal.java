package exercicio3;

public class Principal {

    public static void main(String[] args) {
        Clube clube;
        
        
        clube = new Clube();
        clube.nome = "Atlético Mineiro";
        clube.cnpj = "1223344556677";
       
        
        clube.endereco = new Endereco();
        clube.endereco.bairro = "Pampulha";
        clube.endereco.rua = "Rua Tiradentes";
        clube.endereco.cidade = "Belo Horizonte";
        clube.endereco.estado = "MG";
        clube.endereco.numero = 341;
        
        clube.presidente = new Presidente();
        clube.presidente.nome = "  Alexandre  Calil ";
        
        clube.presidente.endereco = new Endereco();
        clube.presidente.endereco.bairro = clube.endereco.bairro;
        clube.presidente.endereco.rua = clube.endereco.rua;
        clube.presidente.endereco.cidade = clube.endereco.cidade;
        clube.presidente.endereco.estado = clube.endereco.estado;
        clube.presidente.endereco.numero = clube.endereco.numero;
        
        //System.out.println( clube.presidente.endereco.estado);
    }
}
