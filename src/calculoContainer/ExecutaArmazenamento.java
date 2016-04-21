package calculoContainer;

import calculoContainer.ArmazenaCaixaContainer;
import javax.swing.JOptionPane;

public class ExecutaArmazenamento {	

	public static void main(String[] args) {
		
		ArmazenaCaixaContainer objArmazena = new ArmazenaCaixaContainer(); 
		try {
			
			if (! objArmazena.executaArmazenagem()) 
				JOptionPane.showMessageDialog(null, "Aten��o n�o foi poss�vel Armazenar as Caixas!" );			
			else {
				objArmazena.defineCoordenadas();
			}
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Exce��o ao iniciar Armazenamento de Caixas: " + ex.getMessage() );
			System.out.println("Exce��o ao iniciar Armazenamento de Caixas: " + ex.getMessage());
			ex.printStackTrace();			
		}
		finally {
			if (objArmazena != null)
				objArmazena = null;
		}	
		
		System.gc();
		System.exit(0);
		
	}

}
