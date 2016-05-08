package cedula;

public class VerificadorCedula {

	public static int digitoVerificador(int[] cedula){
		int [] resultado= new int [cedula.length-1];

		for (int posicion = 0; posicion < cedula.length-1; posicion++) {
			if (esPar(posicion + 1)) {
				resultado[posicion]=cedula[posicion];
			}else{
				resultado[posicion]=cedula[posicion]*2;
			}
		}
		for (int  posicionResultado= 0; posicionResultado < resultado.length; posicionResultado++) {
			if (resultado[posicionResultado]>9) {
				resultado[posicionResultado]-=9;
			}
		}

		int suma;

		suma = sumaDigitos(resultado);

		if ((decenaSuperior(suma)-suma)==10) {
			return 0;
		}else{
			return decenaSuperior(suma)-suma;
		}



	}

	public static boolean esPar(int digito){
		if (digito % 2 == 0) {
			return true;	
		}
		else{
			return false;
		}
	}

	public static int sumaDigitos(int[] resultado){
		int suma=0;
		for (int posicion = 0; posicion < resultado.length; posicion++) {
			suma+=resultado[posicion];
		}
		return suma;
	}
	public static int decenaSuperior(int suma){



		return suma-(suma%10)+10;
	}

}

