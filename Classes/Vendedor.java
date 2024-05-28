package Classes;

public class Vendedor {

    private int codigoVendedor;
    private String nomeVendedor;
    private char tipoDeMercadoria;
    
    public Vendedor() {
        this.codigoVendedor = 0;
        this.nomeVendedor = "";
        this.tipoDeMercadoria = ' ';
    }

    public Vendedor(int codigoVendedor, String nomeVendedor, char tipoDeMercadoria) {
        this.codigoVendedor = codigoVendedor;
        this.nomeVendedor = nomeVendedor;
        this.tipoDeMercadoria = tipoDeMercadoria;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public char getTipoDeMercadoria() {
        return tipoDeMercadoria;
    }

    public void setTipoDeMercadoria(char tipoDeMercadoria) {
        this.tipoDeMercadoria = tipoDeMercadoria;
    }
    
    @Override
    public String toString() {
        return "Vendedor{" +
            "codigoVendedor=" + codigoVendedor +
            ", nomeVendedor='" + nomeVendedor + '\'' +
            ", tipoDeMercadoria='" + tipoDeMercadoria + '\'' +
            '}';
    }
    
}