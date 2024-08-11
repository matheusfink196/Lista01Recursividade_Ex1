package controller;

public class SomatorioController {
	public SomatorioController() {
		super();
	}
	public int somatorio( int n) {
	    	if (n <= 0) {
            		return 0;
//se valor menor ou igual a zero retorna = ponto de parada
		} else {
			return n + somatorio(n - 1);
//se o n-1 continua a recursiva
		}
       
	}
}
