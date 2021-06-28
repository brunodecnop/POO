public  class  Main {
    public  static  void  main ( String [] args ) {
        Casa casa =  nova  Casa ();
        casa . pintarCasa ( " Amarela " );
        casa . imprimirCorDaCasa ();

        Porta portaDaSala =  nova  Porta ();
        portaDaSala . pintarPorta ( " Marrom " );
        portaDaSala . alterarDimensoes ( 0.6f , 1.8f );
        
        Porta portaDaCozinha =  nova  Porta ();
        portaDaCozinha . pintarPorta ( " Preta " );
        portaDaCozinha . alterarDimensoes ( 0.5f , 1.9f );

        Porta portaDoBanheiro =  nova  Porta ();
        portaDoBanheiro . pintarPorta ( " Branca " );
        portaDoBanheiro . alterarDimensoes ( 0.4f , 1.8f );

        casa . addPorta (portaDaSala);
        casa . addPorta (portaDaCozinha);
        casa . addPorta (portaDoBanheiro);

        Sistema . para fora . println ( " Após abrir 3 portas ... " );
        portaDaSala . abrePorta ();
        portaDoBanheiro . abrePorta ();
        portaDaCozinha . abrePorta ();
        casa . quantasPortasEstaoAbertas ();

        Sistema . para fora . println ( " Após fechar 1 das portas ... " );
        portaDoBanheiro . fechaPorta ();
        casa . quantasPortasEstaoAbertas ();
    }
}
