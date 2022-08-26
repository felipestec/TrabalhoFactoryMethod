package factoryMethod;

public class PoligonoFactory {
	
	public static Poligono createPoligono(int numeroLado){
		
		if(numeroLado == 3) {
			return new Triangulo();
		}else if(numeroLado == 4) {
			return new Quadrado();
		}else if(numeroLado == 5) {
			return new Pentagono();
		}
		return null;
	}

}
