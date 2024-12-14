public class Pessoa {
        // Atributos 
    private String nome; 
    private Integer idade; 


    //Getters e Setters 
    public void setNome(String nome){
        // Aqui pode ter validacoes e outros.
        this.nome = nome; 
    }
    
    public String getNome(){
        // 
        return this.nome;
        
    }
    public Integer getIdade(){
        return this.idade; 

    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }
}


/*
 * Metodos Acesseores:
 * eu 
 * public: Indicar que qualquer um pode acessar  
 * private: Imdica que somente a classe conseque acessar 
 * protecte: Indica que somente a classe  e seus filhos conseguem acessar 
 * default: Indica que somente  classe  no mesmo pachet 
 * 
 */

 /*
  Getters e Steters 
  */