package application;

public aspect logger {
	pointcut pulsar():execution(void *handle*(..));
    
	after() : pulsar(){
		char[] t = thisJoinPoint.getSignature().toString().split(" ")[1].toCharArray();
		String event= String.valueOf(t[17]);
		if (event.equals("1")) {System.out.println("Se cambio el fondo al color : Azul");}
		else if (event.equals("2")) {System.out.println("Se cambio el fondo al color : Coral");}
		else if (event.equals("3")) {System.out.println("Se cambio el fondo al color : Verde");}
		
		//for (int i=0;i<f.length;i++) {
		//	System.out.println(f[i]);
			
		//}
}
}