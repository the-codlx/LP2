package LocadoraDeFilmes;
public class Filme {

private int codigoFilme;
private String tituloDoFilme;
private char genero;

public Filme() {
    this.codigoFilme = 0;
    this.tituloDoFilme = "";
    this.genero = ' ';
}

public Filme(int codigoFilme, String tituloDoFilme, char genero) {
    this.codigoFilme = codigoFilme;
    this.tituloDoFilme = tituloDoFilme;
    this.genero = genero;
}

public int getCodigoFilme() {
    return codigoFilme;
}

public void setCodigoFilme(int codigoFilme) {
    this.codigoFilme = codigoFilme;
}

public String getTituloDoFilme() {
    return tituloDoFilme;
}

public void setTituloDoFilme(String tituloDoFilme) {
    this.tituloDoFilme = tituloDoFilme;
}

public char getGenero() {
    return genero;
}

public void setGenero(char genero) {
    this.genero = genero;
}

@Override
public String toString() {
    return "Filme{" +
            "codigoFilme=" + codigoFilme +
            ", tituloFilme='" + tituloDoFilme + '\'' +
            ", genero='" + genero + '\'' +
            '}';
}


    
}
