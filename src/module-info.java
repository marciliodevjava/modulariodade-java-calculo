module app.calculo {
	//aqui estou exportando o pacote; está disponivel para fora do arquivo
	exports br.com.cod3r.app.calculo;
	requires app.logging;// Herança transmitida pelo pai
	
	exports br.com.cod3r.app.calculo.interno
		to app.financeiro; // to ele indica explisitamente que sera exportado.
	opens br.com.cod3r.app.calculo;
}