package application;

public aspect logger {
	pointcut pulsar():execution(void *handle*(..));
    
	after() : pulsar(){
		char[] t = thisJoinPoint.getSignature().toString().split(" ")[1].toCharArray();
		String event= String.valueOf(t[17]);
		if (event.equals("1")) {System.out.println("Se cambio el fondo al color : Azul");}
		else if (event.equals("2")) {System.out.println("Se cambio el fondo al color : Coral");}
		else if (event.equals("3")) {System.out.println("Se cambio el fondo al color : Verde");}
		else if (event.equals("4")) {System.out.println("Se creo un objeto de la clase circulo con radio 30 de color indigo");}
		
}
}