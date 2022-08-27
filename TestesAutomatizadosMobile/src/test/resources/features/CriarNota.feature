#language: pt
#enconding: UTF-8

Funcionalidade: Google Keep
  
	Contexto: 
		Dado que eu aciono o botao get started
	
  Cenario: Criar uma nota
    Quando eu acionar no botao New text note 
    E eu informa no campo title "Nota1"
    E eu eu informa no campo nota "Texto1"
    E eu acionar o botao voltar
    Entao o aplicativo cadastra a nota com o titulo "Nota1"
    
    @cenario2
   Cenario: Interagir com o switch das configuracoes
    Quando eu acionar o menu 
    E eu acionar a aba setting 
    E eu eu tocar no switch
    Entao o switch fica desabilitado
    
    @cenario3
   Cenario: Alterar nota
    Quando eu acionar a nota 
    E eu informa no campo title "NotaEditada"
    E eu eu informa no campo nota "TextoEditado"
    Entao o aplicativo cadastra a nota com o titulo "NotaEditada"

    
	
