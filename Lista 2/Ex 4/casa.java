public  class  Casa {
    private  String cor;
    privado  int numeroDePortas =  10 ;
    privado  int qtdDePortas =  0 ;
     Porta privada [] portas =  nova  Porta [numeroDePortas];

    void  imprimirCorDaCasa () {
        Sistema . para fora . println ( " A cor da casa é " + cor + " . " );
    }

    void  pintarCasa ( String  novaCor ) {
        cor = novaCor;
        Sistema . para fora . println ( " A casa foi pintada! " );
    }

    void  quantasPortasEstaoAbertas () {
        int qtdPortasAbertas =  0 ;
        para ( int i =  0 ; i < qtdDePortas; i ++ ) {
            if (portas [i] . estaAberta ()) qtdPortasAbertas ++ ;
        }
        Sistema . para fora . println (qtdPortasAbertas + " portas estão abertas. " );
    }

    void  addPorta ( Porta  porta ) {
        if (qtdDePortas > = numeroDePortas) {
            Sistema . para fora . println ( " A casa já tem muitas portas, não é possível adicionar mais. " );
        }
        else {
            portas [qtdDePortas] = porta;
            qtdDePortas ++ ;
        }
    }
}
