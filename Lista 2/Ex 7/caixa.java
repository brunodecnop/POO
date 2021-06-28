public  class  Caixa {
    public  static  void  main ( String [] args ) {
        Cliente cliente =  novo  Cliente ();
        cliente . nome =  " José " ;
        cliente . endereco =  " Rua 2, número 100 " ;
        cliente . modoDePagamento =  " dinheiro " ;
        Sistema . para fora . println ( " Cliente: " );
        cliente . mostrarInfo ();
        Sistema . para fora . println ( " " );

        Produto arroz =  novo  Produto ();
        arroz . descricao =  " Arroz " ;
        arroz . preco =  15,0 ;
        arroz . qtdEmEstoque =  500 ;

        Produto feijao =  novo  Produto ();
        feijao . descricao =  " Feijão " ;
        feijao . preco =  12,0 ;
        feijao . qtdEmEstoque =  500 ;

        Produto cartelaDeOvos =  novo  Produto ();
        cartelaDeOvos . descricao =  " Ovos " ;
        cartelaDeOvos . preco =  10,0 ;
        cartelaDeOvos . qtdEmEstoque =  1000 ;

        Produto leite =  novo  Produto ();
        leite . descricao =  " Leite " ;
        leite . preco =  9,0 ;
        leite . qtdEmEstoque =  200 ;

        Produto couve =  novo  Produto ();
        couve . descricao =  " Couve " ;
        couve . preco =  2,50 ;
        couve . qtdEmEstoque =  300 ;

        arroz . mostrarInfo ();
        feijao . mostrarInfo ();
        cartelaDeOvos . mostrarInfo ();
        leite . mostrarInfo ();
        couve . mostrarInfo ();
        Sistema . para fora . println ( " " );

        Pedido pedido =  novo  Pedido ();
        pedido . cliente = cliente;
        Sistema . para fora . println ( " Adicionando itens ao pedido: " );
        pedido . addItem (arroz, 3 );
        pedido . addItem (feijao, 3 );
        pedido . addItem (cartelaDeOvos, 1 );
        pedido . addItem (leite, 4 );
        pedido . addItem (couve, 5 );
        Sistema . para fora . println ( " " );

        pedido . mostrarInfo ();
        pedido . mostraNumItens ();
        Sistema . para fora . println ( " " );

        Sistema . para fora . println ( " Produtos após adicionar pedidos à lista: " );
        arroz . mostrarInfo ();
        feijao . mostrarInfo ();
        cartelaDeOvos . mostrarInfo ();
        leite . mostrarInfo ();
        couve . mostrarInfo ();
        Sistema . para fora . println ( " " );

        total duplo = pedido . calcularTotal ();
        Sistema . para fora . println ( " Valor total do pedido: " + total + " reais. " );

        pedido . verificarPagamento (cliente);
    }
}
