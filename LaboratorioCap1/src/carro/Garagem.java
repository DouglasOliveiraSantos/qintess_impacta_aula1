package carro;

public class Garagem {
	Carro carroPasseio = new Carro();
	Carro carroUtilitario = new Carro();	

	public static void main(String[] args) {
		Garagem g = new Garagem();
		
		g.carroPasseio.modelo = "Celta";
		g.carroPasseio.potenciaMotor = 1.0;
		g.carroPasseio.cor = "Prata";
		
		g.carroUtilitario.modelo = "Palio Weekend Adventure";
		g.carroUtilitario.potenciaMotor = 1.8;
		g.carroUtilitario.cor = "Verde";
		
		System.out.println("Carro de Passeio:");
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("Modelo: " + g.carroPasseio.modelo);
		System.out.println("Potência: " + g.carroPasseio.potenciaMotor);
		System.out.println("--------------------------------------------");
		System.out.println("Carro Utilitário: ");
		System.out.println("Cor: " + g.carroUtilitario.cor);
		System.out.println("Modelo: " + g.carroUtilitario.modelo);
		System.out.println("Potência: " + g.carroUtilitario.potenciaMotor);	

	}

}
