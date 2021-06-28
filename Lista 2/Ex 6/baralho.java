import  java.util.Random ;

public  class  Baralho {
     Cartas privadas [] cartasDoBaralho;
    private  int topoDoBaralho;

    public  Baralho () {
        cartasDoBaralho =  novas  Cartas [ 52 ];
        topoDoBaralho =  51 ;

        String [] naipes = { " Copas " , " Espadas " , " Ouros " , " Paus " };

        para ( int i = 0 ; i < 52 ; ++ i) {
            cartasDoBaralho [i] =  novas  Cartas ((i % 13 ) + 1 , naipes [i / 13 ]);
        }
    }

    public  Cartas  sacaCarta () {
        Cartas cartas = topoDoBaralho > = 0  ? cartasDoBaralho [topoDoBaralho] :  null ;
        topoDoBaralho - ;
        return cartas;
    }

    public  void  embaralhaCartas () {
        Random gera_aleatorio =  new  Random ();
        int aux1 =  0 ;
        int aux2 =  0 ;
        para ( int i = 0 ; i < 200 ; i ++ ) {
            aux1 = gera_aleatorio . nextInt ( 52 );
            aux2 = gera_aleatorio . nextInt ( 52 );
            Cartas carta_aleatoria = cartasDoBaralho [aux1];
            cartasDoBaralho [aux1] = cartasDoBaralho [aux2];
            cartasDoBaralho [aux2] = carta_aleatoria;
        }
    }
    public  String  toString () {
        String baralho_completo =  " " ;
        para ( int i = 0 ; i < 52 ; i ++ ) {
            baralho_completo = baralho_completo . concat ( " [ " + (i + 1 ) + " ]: " + cartasDoBaralho [i] + " \ n " );
        }
        return baralho_completo;
    }
}
