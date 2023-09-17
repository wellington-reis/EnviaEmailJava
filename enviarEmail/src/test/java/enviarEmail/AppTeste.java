package enviarEmail;

import org.junit.Test;

//senha = "zkcu opjt ufvo aigt"

public class AppTeste {
	
	@Test
	
	public void enviarEmail() throws Exception {
		
		ObjEnvioEmail enviaEmail = new ObjEnvioEmail(
		
				//lista de email(s)		
		
		"wor.testeemail@gmail.com",//Remetente 
		
		//--------------------------------------
		
				//Emitente
		"Equipe Wor Micro Service", 
		
				//Assunto
		"Testando e-mail com Java", 
		
				//texto
		"Parabéns! Você recebeu um e-mail enviado pelo JavaMail");
		
	enviaEmail.enviarEmail();
		
		
	}

}
