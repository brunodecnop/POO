public  class  Main {
    public  static  void  main ( String [] args ) {
        Sistema . para fora . println ( " Criando uma porta ... " );
        Porta porta =  nova  Porta ();
        porta . pintarPorta ( " Marrom " );
        porta . alterarDimensoes ( 0.6f , 1.8f );
        
        Sistema . para fora . println ( " Características da porta: " );
        porta . mostrarPorta ();
    
        Sistema . para fora . println ( " Antes de abrir uma porta ... " );
        porta . imprimirEstaAberta ();
        porta . abrePorta ();
        Sistema . para fora . println ( " Depois de abrir uma porta ... " );
        porta . imprimirEstaAberta ();

        Sistema . para fora . println ( " Antes de fechar a porta ... " );
        porta . imprimirEstaAberta ();
        porta . fechaPorta ();
        Sistema . para fora . println ( " Depois de fechar a porta ... " );
        porta . imprimirEstaAberta ();

        Sistema . para fora . println ( " Antes de pintar a porta ... " );
        porta . imprimirCorDaPorta ();
        porta . pintarPorta ( " Cinza " );
        Sistema . para fora . println ( " Depois de pintar a porta ... " );
        porta . imprimirCorDaPorta ();

        Sistema . para fora . println ( " \ n Antes de alterar dimensões da porta ... " );
        porta . imprimirDimensaoDaPorta () ;;
        porta . alterarDimensoes ( 2.0f , 1.9f ) ;;
        Sistema . para fora . println ( " Depois de alterar dimensões da porta ... " );
        porta . imprimirDimensaoDaPorta ();

        Sistema . para fora . println ( " \ n Características da porta: " );
        porta . mostrarPorta ();
    }
}
