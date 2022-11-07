package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Asistencia;
import modelo.Sistema;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sis=new Sistema();
try{
	
	System.out.println("1");
	sis.agregarTrabajoPresencial(LocalDate.of(2020, 10, 15), "1578", LocalTime.of(9, 00), LocalTime.of(17,00));
	
}catch(Exception e) {
	System.err.println(e.getMessage());
}
try {
	//1-2) Crear y agregar a la lista el objeto Teletrabajo: fecha= 15/10/2020, legajo= 3782, motivo= Pandemia,
	//tareasRealizadas = 5@@#~~~€¬77789900'¡¡¡'''''''''''????????????'''?????????????Ç?Ç?Ç?ÇÇÇÇÇ?Ç????¿¿¿;;;
	System.out.println("2");
	sis.agregarTeletrabajo(LocalDate.of(2020, 10, 15),"3782","Pandemia", 5);
}catch(Exception e) {
	System.err.println(e.getMessage());
}
try {
	System.out.println("3");
	sis.agregarTrabajoPresencial(LocalDate.of(2020, 10, 15), "1578", LocalTime.of(10, 00), LocalTime.of(18,00));
}catch(Exception e) {
	System.err.println(e.getMessage());
}

	try {
	sis.agregarTeletrabajo(LocalDate.of(2020, 10, 16),"3782","Pandemia", 9);
	
}catch(Exception e) {
	System.err.println(e.getMessage());
	
}
	
		System.out.println("4");

		System.out.println("cantidad de horas id =1---> "+sis.traerAsistencia(1).calcularHorasTrabajadas());
		System.out.println("cantidad de horas id =2---> "+sis.traerAsistencia(2).calcularHorasTrabajadas());
		try {
			System.out.println("5");
		
			sis.agregarTrabajoPresencial(LocalDate.of(2020, 10, 15), "2839", LocalTime.of(9, 00), LocalTime.of(17,00));
			sis.agregarTeletrabajo(LocalDate.of(2020, 10, 16),"3452","Pandemia", 5);
			sis.agregarTeletrabajo(LocalDate.of(2020, 10, 16),"5243","Pandemia", 7);

	}catch(Exception e) {
		System.err.println(e.getMessage());
	}
		System.out.println("6");
		//4-1) Traer todas las asistencias del 15/10/2020
	System.out.println(sis.traerAsistencia(LocalDate.of(2020, 10, 15)).toString());
	
	
	
	
	try {
		System.out.println("7");
		System.out.println(sis.traerAsistencia(true).toString());

	}catch(Exception e) {
		System.err.println(e.getMessage());
	}
	}
	
	

}
