package cap5lab1;

public class Cap5_Lab1 {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.nome = "Douglas";
		f.sobrenome = "Oliveira Santos";
		f.cargo = "Programador";
		f.salario = 4000.1;
		
		System.out.println("Nome: " + f.nome);
		System.out.println("Sobrenome: " + f.sobrenome);
		System.out.println("Cargo: " + f.cargo);
		System.out.println("Salário: " + f.salario);

	}

}


