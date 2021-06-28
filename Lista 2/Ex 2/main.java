public  class  Main {
    
    public  static  void  main ( String [] args ) {
    Pessoa pessoa =  nova  Pessoa ();
    pessoa . nome =  " Maria " ;
    pessoa . idade =  25 ;

    Sistema . para fora . println ( " Antes do aniversário: " );
    pessoa . imprimirNome ();
    pessoa . imprimirIdade ();
    pessoa . fazAniversario ();
    Sistema . para fora . println ( " Depois do aniversário: " );
    pessoa . imprimirNome ();
    pessoa . imprimirIdade ();
    Sistema . para fora . println ( " " );
    para ( int i =  0 ; i <  5 ; i ++ ) {
        pessoa . fazAniversario ();
    }
    Sistema . para fora . println ( " Depois de mais 5 aniversários: " );
    pessoa . imprimirNome ();
    pessoa . imprimirIdade ();
    }
}
© 2021 GitHub, Inc.
