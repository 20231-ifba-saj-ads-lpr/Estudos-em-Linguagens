public class Carro {

    //#region Atributos

    public String modelo; 
    public String marca;
    public Integer ano; 
    public String cor;
    //#endregion

   ////#region Construtores
    public Carro(){

    }

    public Carro(String moedelo, Integer ano,  String cor){
        this.modelo = moedelo;
        this.ano = ano; 
        this.cor = cor; 

    }
   //#endregion

 
    //#region Getts e Setts 

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        viii    this.marca = marca;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    //#endregion
    
}
