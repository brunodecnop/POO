classe  Televisao {
    estado booleano =  falso , silencioso =  falso ;
    int do volume =  5 , canal =  15 ;

    void  onOff () {
        isso . estado =  ! isso . estado;
    }
    String  estaLigado () {
        if ( this . estado)
            retornar  " Ligado " ;
        senão
            retornar  " Desligado " ;
    }
    void  incVolume () {
        if ( this . silencioso) {
            isso . volume =  0 ;
            isso . silencioso =  falso ;
        }
        isso . volume ++ ;
        Se ( esse . de volume >  10 )
            isso . volume =  10 ;
    }
    void  decVolume () {
        isso . volume - ;
        se ( este . volume <  0 )
            isso . volume =  0 ;
    }
    int  volumeTV () {
        volume de retorno ;
    }
    void  incCanal () {
        isso . canal ++ ;
        if ( this . canal >  99 )
            isso . canal =  0 ;
    }
    void  decCanal () {
        isso . canal - ;
        if ( this . canal <  0 )
            isso . canal =  99 ;
    }
    void  defCanal ( int  canal ) {
        if ((canal <=  99 ) && (canal > =  0 ))
            isso . canal = canal;
    }
    int  canalTV () {
        canal de retorno ;
    }
    void  modoSilencioso () {
        isso . silencioso =  ! isso . silencioso;
    }
    String  estaSilenciado () {
        if ( this . silencioso)
            retornar  " Ligado " ;
        senão
            retornar  " Desligado " ;
    }
    void  exibeTV () {
        Sistema . para fora . println ( " Estado: "  + estaLigado ());
        Sistema . para fora . println ( " Canal: "  + canalTV ());
        Sistema . para fora . println ( " Volume: "  + volumeTV ());
        Sistema . para fora . println ( " Silencioso: "  + estaSilenciado ());
        Sistema . para fora . println ( " " );
    }
}
