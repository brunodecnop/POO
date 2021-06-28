import  java.util.Scanner ;
import  java.io.IOException ;

classe  Celular {
    Bateria bateria =  nova  bateria ();
    
    void  painel () {
        Sistema . para fora . println ( " Bateria: "  +  this . bateria . getCarga () +  " % \ n " );
    }
    void  mensagem () {
        Teclado do scanner =  novo  scanner ( sistema . In );
        teclado . Next();
        int carga = bateria . getCarga ();
        carga - ;
        bateria . setCarga (carga);
    }
    void  ligacao () throws  IOException {
        long inicio =  Sistema . currentTimeMillis ();
        Sistema . para fora . imprimir ( " Em chamada ... " );
        Sistema . no . leitura();
        fim longo =  Sistema . currentTimeMillis ();
        tempo longo = (fim - inicio) / 1000 ;
        int h = ( int ) (andamento / 3600 );
        int m = ( int ) ((andamento - h / 3600 ) / 60 );
        int s = ( int ) (andamento - (h * 3600  + m * 60 ));
        Sistema . para fora . printf ( " Duração da ligação:% d:% 02d:% 02d \ n " , h, m, s);
        int carga = bateria . getCarga () - (( int ) (tempo / 5 ));
        bateria . setCarga (carga);
    }
    void  recarga () throws  IOException {
        long inicio =  Sistema . currentTimeMillis ();
        Sistema . para fora . imprimir ( " Carregando ... " );
        Sistema . no . leitura();
        fim longo =  Sistema . currentTimeMillis ();
        tempo longo = (fim - inicio) / 1000 ;
        int h = ( int ) (andamento / 3600 );
        int m = ( int ) ((andamento - h / 3600 ) / 60 );
        int s = ( int ) (andamento - (h * 3600  + m * 60 ));
        Sistema . para fora . printf ( " Duração da recarga:% d:% 02d:% 02d \ n " , h, m, s);
        int carga = bateria . getCarga () + (( int ) (andamento / 60 ));
        bateria . setCarga (carga);
    }
}
