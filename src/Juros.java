
public class Juros {

	public static void main(String[] args) {
		double valorInicial = 1000;
		double taxaInvestimento = 10;
		int meses = 11;
		
		double valorFinal = calcularJuros(valorInicial, taxaInvestimento, meses);
		double lucro = calcularLucroJuros(valorInicial, taxaInvestimento, meses);
		
		System.out.println("Valor total:" + valorFinal);
		System.out.println("Valor do lucro:" + lucro);

	}
	
	public static double calcularLucroJuros(double valor, double taxa, int quantidadeMeses) {
		double resultado = calcularJuros(valor, taxa, quantidadeMeses);
		return resultado - valor;
			}
	// juros composto é:
	// valor inicial
	// taxa de juros
	// tempo (mês)
	public static double calcularJuros(double valor, double taxa, int quantidadeMeses) {
		double resultado = valor;
		
		for (int i = 0; i < quantidadeMeses; i++) {
			resultado = resultado * (1.0 + (taxa/100));
		}
		
		return resultado;
			
		}
	}