/*
	Muestra por pantalla la frase "�Hola Mundo!"

	@autor mgm11299

*/
public class HolaMundo
{
	public static void main(String[] args)
	{
		String amarillo="\033[33m";
		String celeste="\033[34m";

		System.out.println(amarillo + "!Hola Mundo!");
		System.out.println(celeste + "Aquí estamos haciendo pruebas con Git.");
	}
}