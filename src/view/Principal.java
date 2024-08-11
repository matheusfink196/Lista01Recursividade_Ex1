package view;
import controller.SomatorioController;

public class Principal {
	 public static void main(String[] args) {
		 SomatorioController somaCont = new SomatorioController();
	        int n = 4; 
	        int soma = somaCont.somatorio(n);
	        System.out.println(soma);
	 }
}
