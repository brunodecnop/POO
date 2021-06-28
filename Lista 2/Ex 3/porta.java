public  class  Porta {
    private  String cor;
     flutuação privada largura;
     flutuação privada altura;
    privado  booleano aberto =  falso ;

    // retorna verdadeiro caso a porta aberta
    boolean  estaAberta () {
        retorno aberto;
    }

    // imprime se a porta está aberta ou nao
    void  imprimirEstaAberta () {
        if (estaAberta ()) Sistema . para fora . println ( " A porta está aberta! " );
        else  System . para fora . println ( " A porta está fechada! " );
        Sistema . para fora . println ( " " );
    }

    // abre uma porta
    void  abrePorta () {
        if (estaAberta ()) Sistema . para fora . println ( " A porta já está aberta. Não é possível abrir. " );
        senão aberta =  verdadeiro ;
    }   
    
    // fecha a porta
    void  fechaPorta () {
        if (estaAberta ()) aberta =  falso ;
        else  System . para fora . println ( " A porta já está fechada. Não é possível fechar. " );
    }

    // imprime a cor da porta
    void  imprimirCorDaPorta () {
        Sistema . para fora . println ( " A cor da porta é: " + cor);
    }

    // pinta a porta com uma nova cor
    void  pintarPorta ( String  novaCor ) {
        cor = novaCor;
    }

    // imprime como dimensões da porta
    void  imprimirDimensaoDaPorta () {
        Sistema . para fora . println ( " A largura da porta em metros é: " + largura);
        Sistema . para fora . println ( " A altura da porta em metros é: " + altura);
    }

    // altera como dimensões da porta
    void  alterarDimensoes ( float  novaLargura , float  novaAltura ) {
        altura = novaAltura;
        largura = novaLargura;
    }

    // imprime caracteristicas gerais da porta
    void  mostrarPorta () {
        imprimirCorDaPorta ();
        imprimirDimensaoDaPorta ();
        Sistema . para fora . println ( " " );
    }
}
