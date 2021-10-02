package modelo;

public class servicioPublico {

	//Atributos
	private String nombreservicio;
	private int valorunitario;
}
	//Constructor
	public servicioPublico(String pNombreservicio, pValorunitario) {
		String nombreservicio = pNombreservicio;
		if (nombreservicio == "Gas natural"){
			valorunitario = 5234;
		}else if(nombreservicio = "Agua"){
			valorunitario = 9256;
		}else(nombreservicio = "Energía"){
			valorunitario = 6200;
		}
		
}