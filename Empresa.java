package CadastrarEmpresa;

public class Empresa {
    
    private Vendedor vetVendedor[];
    private int quantVendedor;

    public Empresa(int quantidade){
        this.vetVendedor = new Vendedor[quantidade];
        quantVendedor = 0;
    }

    public Vendedor getVetVendedor(int indice) {
        return vetVendedor[indice];
    }

    public void setVetVendedor(int indice, Vendedor novo) {
        this.vetVendedor[indice] = novo;
    }

    public int getQuantVendedor() {
        return quantVendedor;
    }

    public void setQuantVendedor(int quantVendedor) {
        this.quantVendedor = quantVendedor;
    }

    public boolean inserirVendedor(Vendedor novo){
        if(this.quantVendedor == this.vetVendedor.length){
            return false;
        }else{
            this.vetVendedor[quantVendedor] = novo;
            this.quantVendedor++;
            return true;
        }
    }

    public String toString(){
        String resposta = "";
        for(int i = 0; i < this.quantVendedor; i++){
           resposta += (i + 1) + "." + " " + this.vetVendedor[i].toString(); 
        }
        return resposta;
    }

    public int quantVendedoresMesmaMercadoria(char tipoMercadoria){
        int quantVendedores = 0;
        int c = 0;
        while(c < this.quantVendedor){
            if(this.vetVendedor[c].getTipoDeMercadoria() == tipoMercadoria){
                quantVendedores++;
            }
            c++;
        }
        return quantVendedores;
    }

    public boolean excluirVendedorPeloNome(String nome){

        if(this.getQuantVendedor() == 0){
            return false;
        }else{
            int c = 0;
            while(c < this.quantVendedor && !this.vetVendedor[c].getNomeVendedor().equalsIgnoreCase(nome)){
                c++;
            }
            if(c == this.quantVendedor){
                return false;
            }
            else{
                this.vetVendedor[c] = this.vetVendedor[quantVendedor - 1];
                this.quantVendedor--;
                return true;
            }
        }
    }

}
