import java.util.Locale;

public class Ex000 {

	public static void main(String[] args) {
		
		double x = 10.45678;
		System.out.printf("%.2f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.5f%n",x);
		System.out.println("RESULTADO = " + x + " METROS");
//%.3f indica número de casas decimais.
//%n indica a quebra de linha...
//System.out.print exibe saída de dados sem quebra de linha
//System.out.println exibe saída de dados com quebra de linha
//System.out.printf exibe saída de dados formatados...
	}

}
