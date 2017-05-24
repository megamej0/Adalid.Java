package salud;
import edu.femxa.val.imc.IMC;
import edu.femxa.val.imc.Persona;
import edu.femxa.val.imc.TipoIMC;

public class SaludMain {
	public static void main(String[] args) {
		Persona persona = null;
		
		persona = new Persona(60d, 1.50d);
		double imc_numerico = IMC.calcula(persona);
		TipoIMC tipo = TipoIMC.traduceIMC(imc_numerico);
		System.out.println(tipo);
		
	}

}
