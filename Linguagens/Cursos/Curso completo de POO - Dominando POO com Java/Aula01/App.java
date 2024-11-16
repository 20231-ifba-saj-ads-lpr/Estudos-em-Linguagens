public class App {

    public static void main(String[] args) {
        System.err.println("Aprendendo POO com Java ");
          
        // Que estou instanciando uma classe, construindo um objeto. 
        Pessoa pessoa1 = new Pessoa(); 
        pessoa1.setNome("fulano");
        pessoa1.setIdade(21 );

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        
        Pessoa pessoa2 = new Pessoa(); 
        pessoa2.setNome("Maria"); 
        pessoa2.setIdade(21); 

        
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
      
       Carro meuCarro = new Carro();
       meuCarro.setModelo("Honda Civic");
       meuCarro.setAno(2019);
       meuCarro.setCor("Preto");


       System.out.println(meuCarro.getModelo());
       System.out.println(meuCarro.getAno());
       System.out.println(meuCarro.getCor());

       System.out.println(meuCarro.getModelo());
       System.out.println(meuCarro.getAno());
       System.out.println(meuCarro.getCor());



    }
}