package enviarEmail;

import org.junit.Test;

//senha = "zkcu opjt ufvo aigt"

public class AppTeste {
	
	@Test
	
	public void enviarEmail() throws Exception {
		
		ObjEnvioEmail enviaEmail = new ObjEnvioEmail("wellington.o.reis@gmail.com, wor_m.service@hotmail.com, wor.testeemail@gmail.com", 
													 "Equipe Wor Micro Service", 
													 "Testando e-mail com Java", 
													 "Parabéns! Você recebeu um e-mail enviado pelo JavaMail");
		
	enviaEmail.enviarEmail();
		
		
	}

}
