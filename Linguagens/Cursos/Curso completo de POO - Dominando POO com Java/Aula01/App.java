public class App {

    public static void main(String[] args) {
        System.err.println("Aprendendo POO com Java ");
          
        // Que estou instanciando uma classe, construindo um objeto. 
        Pessoa pessoa1 = new Pessoa(); 
        pessoa1.nome = "Fulano";
        pessoa1.idade = 21;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        
        Pessoa pessoa2 = new Pessoa(); 
        pessoa2.nome = "Ciclano";
        pessoa2.idade = 24; 

        
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
      
        Carro meuCarro = new Carro(); 
        meuCarro.ano = 2021; 
        meuCarro.modelo = "Jeep"; 
        meuCarro.cor = "Preto"; 

        System.out.println(meuCarro.ano);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.cor);


    }
}