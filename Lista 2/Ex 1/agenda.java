public  class  Agenda {
    privado  int tamanhoDaAgenda =  100 ;
    privado  int qtdDeContatos =  0 ;
    Contato [] contatos =  novo  Contato [tamanhoDaAgenda];
    
    // retorna True caso a agenda está cheia
    private  boolean  agendaCheia () {
        return qtdDeContatos > = tamanhoDaAgenda;
    }
    
    // ordena uma lista de contatos
    private  void  ordenaContatos () {
        if (qtdDeContatos > 1 ) {
            para ( int i =  1 ; i < qtdDeContatos; i ++ ) {
                Contato elementoAtual = contatos [i];
                int j = i;
                boolean comp;

                if ((contatos [j - 1 ] . nome) . compareTo (elementoAtual . nome) >  0 ) comp =  true ;
                else comp =  false ;

                while (j >  0  && comp) {
                    contatos [j] = contatos [j - 1 ];
                    j - ;
                    if (j > 0 ) {
                        if ((contatos [j - 1 ] . nome) . compareTo (elementoAtual . nome) >  0 ) comp =  true ;
                        else comp =  false ;
                    }
                }
                contatos [j] = elementoAtual;
            }
        }   
    }

    // encontra a posicao do contato na agenda
    private  int  encontraContato ( String  nomeDoContato ) {
        int i =  0 ;
        while (i < qtdDeContatos && contatos [i] . nome ! = nomeDoContato) {
            i ++ ;
        }

        if (i < qtdDeContatos) return i;
        senão  retornar  - 1 ;
    }

    // imprime o contato
    privado  void  imprimirContato ( Contato  contato ) {
        Sistema . para fora . println ( " Nome: " + contato . nome);
        Sistema . para fora . println ( " Telefone: " + contato . telefone);
    }
    
    // adiciona o contato a agenda e a ordena em ordem alfabética
    void  adicionarContato ( String  nomeDoContato , String  telefoneDoContato ) {
        if (agendaCheia ()) {
            Sistema . para fora . println ( " A agenda está cheia! Não é possível adicionar um novo contato. " );
        }
        else {
            Contato contato =  novo  Contato ();
            contato . nome = nomeDoContato;
            contato . telefone = telefoneDoContato;
            contatos [qtdDeContatos] = contato;
            qtdDeContatos ++ ;
            Sistema . para fora . println ( " Contato Escrito! " );
        }
        ordenaContatos ();
    }

    // busca o contato na agenda e o imprime na tela
    void  mostrarContato ( String  nomeDoContato ) {
        int pos = encontraContato (nomeDoContato);
        if (pos ==  - 1 ) Sistema . para fora . println ( " Contato não encontrado! " );
        else imprimirContato (contatos [pos]);
    }

    // busca o contato na agenda e altera seu telefone
    void  alterarContato ( String  nomeDoContato , String  novoTelefone ) {
        int pos = encontraContato (nomeDoContato);
        if (pos ==  - 1 ) Sistema . para fora . println ( " Contato não encontrado! A alteração não realizada. " );
        else {
        contatos [pos] . telefone = novoTelefone;
        Sistema . para fora . println ( " O telefone de " + nomeDoContato + " foi alterado! " );
        }
    }
    
    // imprime todos os contatos da agenda
    void  listarContatos () {
        para ( int i =  0 ; i < qtdDeContatos; i ++ ) {
            imprimirContato (contatos [i]);
        }
    }

    // informa quantos contatos ainda podem ser limitados
    void  mostrarNumeroDeContatos () {
        int n = tamanhoDaAgenda - qtdDeContatos;
        Sistema . para fora . println ( " Sua agenda tem " + qtdDeContatos + " contatos. Você ainda pode adicionar mais " + n + " contatos. " );
    }
}
