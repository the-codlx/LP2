package Classes;

public class ProgramaPrincipal {
    
    public static void main(String[] args){

        Filme filme1 = new Filme();

        filme1.setCodigoFilme(122);
        filme1.setTituloDoFilme("Tá Chovendo Hambúrguer");
        filme1.setGenero('A');

        Filme filme2 = new Filme();

        filme2.setCodigoFilme(123);
        filme2.setTituloDoFilme("Até Que A Morte Nos Separe");
        filme2.setGenero('A');


        Locadora local = new Locadora(2);

        local.inserirNovoFilme(filme1);
        local.inserirNovoFilme(filme2);


        local.excluirFilmePorNome("Tá Chovendo Hambúrguer");

        System.out.println(local.toString());

        //System.out.println(quantidade);
       
    }
}
