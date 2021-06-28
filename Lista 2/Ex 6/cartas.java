public  class  Cartas {
    int valor_carta;
    String naipe_carta;

    public  Cartas ( int  valor , String  naipe ) {
        if ((valor_carta > =  1  || valor_carta <=  13 ) && (naipe ==  " Copas "  || naipe ==  " Espadas "  || naipe ==  " Ouros "  || naipe ==  " Paus " )) {
            valor_carta = valor;
            naipe_carta = naipe;
        }
        else {
            valor_carta =  0 ;
            naipe_carta =  " naipe inexistente " ;
        }
    }

    public  String  toString () {
        String [] nome_cartas = { " Carta inválida " , " Ás " , " 2 " , " 3 " , " 4 " , " 5 " , " 6 " , " 7 " , " 8 " , " 9 " , " 10 " , " Valete " , "Dama " , "Rei " };
        return nome_cartas [valor_carta] + " de " + naipe_carta + " . " ;
    }
}
