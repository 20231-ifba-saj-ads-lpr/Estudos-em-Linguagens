public class App {

    public static void main(String[] args) {
        System.err.println("Aprendendo POO com Java ");

        byte TipoByte = Byte.MAX_VALUE;  //127
        short TipoShort = Short.MIN_VALUE; //
        int TipoInt = 43;
        long TipoLong =  9223372036854775807L; // todo número long tem que terminar  com L no gial exemplo: 2313L
        float  TipoFloat = 2.8F; //Todos número float tem que terminar em F
        double  TipoDouble = Double.MAX_VALUE;
        boolean  TipoBoolean = true;
        float peso = (float) 90.54;  // Existe no JAVA, um processo chamado: "TRucar", que é trocar o tipo de por outro, ou seja, convertado
        
        String TipoString = "Seu um texto";
        char TipoChar = 'S';
    

          
        // Aqui estou instanciando uma classe, construindo um objeto. 
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

       Carro novoCarro = new Carro ("Fiat uno", 2029, "Fiat");


       System.out.println(novoCarro.getModelo());
       System.out.println(novoCarro.getAno());

       System.out.println("Teste");
       System.out.println(novoCarro.getCor());



    }
}

/*
 * Formas de Escrever: ;
 * Pasacalcase: MeuCachorro/NotaFiscal palavra composta, palavra unica: Cschorro
 * CamelCase: Todo palavra comeca com letra minuscula, como se fosse um camelo 
 * Kibab-case: mnota-fiscal
 * snake_case: nota_fiscal
 */