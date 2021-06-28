public  class  Main {
    public  static  void  main ( String [] args ) {
        Agenda agendaTelefonica =  nova  Agenda ();
        
        agendaTelefonica . mostrarNumeroDeContatos ();
        agendaTelefonica . adicionarContato ( " Maria " , " (21) 99999-9999 " );
        agendaTelefonica . adicionarContato ( " João " , " (21) 98000-0000 " );
        agendaTelefonica . adicionarContato ( " Zé " , " (21) 91234-5678 " );
        agendaTelefonica . adicionarContato ( " Simone " , " (21) 98675-4321 " );
        agendaTelefonica . adicionarContato ( " Ana " , " (21) 91234-6789 " );
        agendaTelefonica . adicionarContato ( " Pedro " , " (21) 97890-1234 " );
        agendaTelefonica . adicionarContato ( " Bia " , " (21) 98877-6655 " );
        Sistema . para fora . println ( " " );
        agendaTelefonica . listarContatos ();
        agendaTelefonica . mostrarNumeroDeContatos ();
        Sistema . para fora . println ( " " );

        Sistema . para fora . println ( " Contato antes da alteração do número: " );
        agendaTelefonica . mostrarContato ( " Simone " );
        agendaTelefonica . alterarContato ( " Simone " , " (11) 98675-4321 " );
        agendaTelefonica . mostrarContato ( " Simone " );
    }
}
