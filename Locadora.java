package LocadoraDeFilmes;

public class Locadora {
    
    private Filme vetFilmes[];
    private int quantFilmes;

   
    public Locadora(int tamanho) {
        this.vetFilmes = new Filme[tamanho];
        quantFilmes = 0;
    }


    public Filme getVetFilmes(int indice) {
        return this.vetFilmes[indice];
    }


    public void setVetFilmes(int indice, Filme novo) {
        this.vetFilmes[indice] = novo;
    }


    public int getQuantFilmes() {
        return quantFilmes;
    }


    public void setQuantFilmes(int quantFilmes) {
        this.quantFilmes = quantFilmes;
    }
    
    public String toString(){
        String resposta = "";
        for(int i = 0; i < this.quantFilmes; i++){
           resposta += (i + 1) + "." + " " + this.vetFilmes[i].toString(); 
        }
        return resposta;
    }

    public boolean inserirNovoFilme(Filme novo){

        if(this.getQuantFilmes() == this.vetFilmes.length){
            return false;
        }
        else{
            this.vetFilmes[this.quantFilmes] = novo;
            this.quantFilmes++;
            return true;
        }
    }

    public int quantidadeDeFilmesMesmoGenero(char genero){

        int quantFilmesGenero = 0;
        int c = 0;
        while(c <= this.quantFilmes - 1){
            if(this.vetFilmes[c].getGenero() == genero){
                quantFilmesGenero++;
            }
            c++;
        }
        return quantFilmesGenero;
    }

    public boolean excluirFilmePorNome(String tituloDoFilme){

        if(this.vetFilmes.length == 0){
            return false;
        }else{
            int c = 0;
            while(c < this.vetFilmes.length && !this.vetFilmes[c].getTituloDoFilme().equalsIgnoreCase(tituloDoFilme)){
                c++;
            }
            if(c == this.getQuantFilmes()){
                return false;
            }
            else{
                this.vetFilmes[c] = this.vetFilmes[this.quantFilmes - 1];
                this.quantFilmes--;
                return true;
            }
        }

    }

}