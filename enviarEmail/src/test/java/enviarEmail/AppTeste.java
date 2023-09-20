package enviarEmail;

import org.junit.Test;

//senha = "zkcu opjt ufvo aigt"

public class AppTeste {
	
	@Test
	
	public void enviarEmail() throws Exception {
		
		StringBuilder TextEmailHtml = new StringBuilder();
		
		TextEmailHtml.append("<h2 style=\"color:red\">Olá Programador!</h2></br></br>");
		TextEmailHtml.append("<h4>Este e um texto de Email em Html.</h4></br></br>");
		
		TextEmailHtml.append("<a target=\"_blank\" href=\"http://www.globo.com\"; style=\"text-decoration:none;\">Este e um botão em Html.</a></br></br>");
		
		
		ObjEnvioEmail enviaEmail = new ObjEnvioEmail(
		
				//lista de email(s)		
		
		"wor.testeemail@gmail.com",//Remetente 
		
		//--------------------------------------
		
				//Emitente
		"Equipe Wor Micro Service", 
		
				//Assunto
		"Testando e-mail com Java", 
		
				//texto
		//"Parabéns! Você recebeu um e-mail enviado pelo JavaMail"
		
				TextEmailHtml.toString());
		
	enviaEmail.enviarEmail(true);
		
		
	}

}
