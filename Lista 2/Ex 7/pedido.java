classe  pública Pedido {
    Cliente cliente;
    privado  int maxDeItens =  200 ;
     item privado [] itens =  novo  item [maxDeItens];
    privado  int qtdDeItens =  0 ;

    // cálculo o total da compra
     calcularTotal duplo () {
        total duplo =  0 ;
        para ( int i =  0 ; i < qtdDeItens; i ++ ) {
            total + = itens [i] . obterSubTotal ();
        }
        retorno total;
    }

    // mostra o número de itens na lista
    void  mostraNumItens () {
        Sistema . para fora . println ( " O pedido tem " + qtdDeItens + " itens. " );
    }

    // função privada que verifica se uma lista de itens está cheia
    private  boolean  listaDeItensCheia () {
        if (qtdDeItens > = maxDeItens) retorna  verdadeiro ;
        senão  retorna  falso ;
    }

    // adiciona novo item à lista de itens do pedido
    void  addItem ( Produto  produto , int  quantidade ) {
        if (listaDeItensCheia ()) Sistema . para fora . println ( " A lista de itens está cheia! Não é possível adicionar um novo item. " );
        else  if (quantidade > produto . qtdEmEstoque) Sistema . para fora . println ( " Não há quantidade suficiente do produto em estoque. " );
        else {
            Item item =  novo  item ();
            item . produto = produto;
            item . quantidade = quantidade;
            produto . qtdEmEstoque - = quantidade;
            itens [qtdDeItens] = item;
            qtdDeItens ++ ;
            Sistema . para fora . println ( " Item Escrito! " );
        }
    }

    // pergunta ao cliente a forma de pagamento e verificação o pagamento do pedido
    void  verificarPagamento ( Cliente  cliente ) {
        if (cliente . modoDePagamento ==  " dinheiro "  || 
        cliente . modoDePagamento ==  " Dinheiro "  || 
        cliente . modoDePagamento ==  " check "  || 
        cliente . modoDePagamento ==  " Check "  || 
        cliente . modoDePagamento ==  " cartão "  || 
        cliente . modoDePagamento ==  " Cartão " ) Sistema . para fora . println ( " Pagamento aceito! O pedido está pago. " );
        else  System . para fora . println ( " O pagamento não foi aceito! " );
    }

    // mostra informações gerais do item
    void  mostrarInfo () {
        Sistema . para fora . println ( " Pedido " );
        para ( int i =  0 ; i < qtdDeItens; i ++ ) {
            Sistema . para fora . println ( " Item " + (i + 1 ) + " : " );
            itens [i] . mostrarInfo ();
        }
    };
}
