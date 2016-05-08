package cedula;

public class Main {

	public static void main(String[] args) {
		//int [] cedula={1,7,2,4,7,2,0,8,0,8};
		//int [] cedula={1,3,0,8,6,6,9,4,9,4};
		int [] cedula={1,3,0,3,4,0,4,0,3,0};
		if (VerificadorCedula.digitoVerificador(cedula)==cedula[9]) {
			System.out.println("Su cedula es correcta");

		}else{
			System.out.println("Su cedula es incorrecta");
		}
	}

}
