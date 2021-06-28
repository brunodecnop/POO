public  class  Item {
    Produto produto;
    quantidade int ;

    // cálculo o subtotal de cada item
     obterSubTotal dupla () {
        return produto . preco * quantidade;
    }

    // mostra informações gerais do item
    void  mostrarInfo () {
        Sistema . para fora . println ( " Produto: " + produto . descrição);
        Sistema . para fora . println ( " Preço total do item: " + obterSubTotal ());
        Sistema . para fora . println ( " Quantidade: " + quantidade);
    };
}
