package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	public void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "gasolina") {
			this.tipo = tipo;
		}
		
	}

}
