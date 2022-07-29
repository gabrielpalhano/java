class exCap3_3 {
	public static void main(String[] args) {
		double jan = 15.000;
		double fev = 23.000;
		double mar = 17.000;
		double gasto_total = (jan + fev + mar);
		double gasto_medio = (gasto_total / 3);
		
			System.out.println("O Gasto total da empresa no trimestre foi de: "+(String.format("%.3f", gasto_total))+ "\n e o gasto médio foi de: "+(String.format("%.3f", gasto_medio))+"!");
	}
}

/* Ecercício Proposto:
	Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos
	somar o gasto total. Sabendo que em janeiro foram gastis 15 mil reais, em fevereiro foram gastos 23 mil reias e em março 17 mil
	faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos. */
	
/* Saída esperada:
	O gasto total da empresa no trimestre foi de: 55,0
	e o gasto médio foi de 18,333! */