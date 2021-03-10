package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cont = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] instanceof Asiento == true) {
				cont ++;
			}
		}
		return cont;
	}
	
	public String verificarIntegridad() {
		int num = 0;
		
		if (registro != motor.registro) {
			num ++;
		}
		
		for (int j = 0; j < asientos.length; j++) {
			if (asientos[j] instanceof Asiento == true) {
				if (asientos[j].registro != registro) {
					num ++;
				}
				if (asientos[j].registro != motor.registro) {
					num ++;
				}
			}
		}
		
		if (num == 0) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
