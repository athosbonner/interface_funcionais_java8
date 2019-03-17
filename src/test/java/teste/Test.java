package teste;

import com.br.stream.interfacefuncionais.Transformador;

public class Test {

	public static void main(String[] args) {
		
		Transformador<String> validador = valor -> {
			return valor.toUpperCase();
		};
		
		System.out.println(validador.transforma("athos bonner"));
		
	}

}
