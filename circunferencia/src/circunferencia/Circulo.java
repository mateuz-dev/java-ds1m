package circunferencia;

public class Circulo {
	
	public static void main (String[] args) {
		
		//Cálculo do Circunferência//
		
		float PI;
		float raio;
		float circunferência;
		
		PI = 3.14f;
		raio = 3.0f;
				
		circunferência = (raio * raio) * PI;
		
		System.out.print("a CIRCUNFERÊNCIA do Círculo é igual a " + circunferência);
		
	}

}