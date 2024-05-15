package CadastrarEmpresa;

public class ProgramaPrincipal {

    public static void main(String[] args){
    
    Vendedor vendedor1 = new Vendedor(132, "lucas", 'n');
    Vendedor vendedor2 = new Vendedor(133, "carol", 'n');

    Empresa empresa1 = new Empresa(3);

    empresa1.inserirVendedor(vendedor1);
    empresa1.inserirVendedor(vendedor2);

    int quantidade = empresa1.quantVendedoresMesmaMercadoria('n');
    //empresa1.excluirVendedorPeloNome("lucas");
    System.out.println(empresa1.toString());
    System.out.println(quantidade);


    }
}
