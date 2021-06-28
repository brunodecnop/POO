public  class  Main {
    public  static  void  main ( String [] args ) {

        Cartas carta1 =  novas  Cartas ( 2 , " Espadas " );
        Sistema . para fora . println ( " Exemplo de carta: " + carta1);

        Baralho baralho1 =  novo  Baralho ();
        Sistema . para fora . println ( " \ n Exemplo de baralho ainda não embaralhado: \ n " + baralho1);

        Sistema . para fora . println ( " Primeiras três cartas do topo ordenado " );
        Sistema . para fora . println (baralho1 . sacaCarta ());
        Sistema . para fora . println (baralho1 . sacaCarta ());
        Sistema . para fora . println (baralho1 . sacaCarta ());

        baralho1 . embaralhaCartas ();
        Sistema . para fora . println ( " \ n Exemplo de baralho após ser embaralhado: " );
        Sistema . para fora . println (baralho1);

        Sistema . para fora . println ( " Primeiras três cartas do topo embaralhado: " );
        Sistema . para fora . println (baralho1 . sacaCarta ());
        Sistema . para fora . println (baralho1 . sacaCarta ());
        Sistema . para fora . println (baralho1 . sacaCarta ());


    }
}
