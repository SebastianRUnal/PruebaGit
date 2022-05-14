package date;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.*;

import estructurasLineales.EstructurasLineales.*;

public class Main {
		
	public static void main(String[] args) {     //la maxima hora posible es las 23:59 y la minima la 00:00
		// TODO Auto-generated method stub
		LocalDate antes= LocalDate.of(2002, 1, 22);
		LocalDate despues= LocalDate.of(2020, 2, 29);  //la api incluso implementa años biciestos :O
		
		
		LocalDateTime y=despues.atTime(5, 0);
		LocalDate x= despues.plusDays( 7).plusMonths(5).plusYears(1); // se pueden hacer varias operaciones al tiempo
		
		//System.out.print(despues.isAfter(antes));   //metodo isAfter para saber si una fecha es despues que otra
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		LinkedList enlazados= new LinkedList(); // es un reemplazo para la doblemente enlazada, solo por test purpouses
		
		String datoInfo="programar";
		LocalDate datoFecha= LocalDate.of(2022, 5, 13);	
			
		String[] dato1= {datoInfo,datoFecha.toString()};
		String[] dato2= {"estudiar",datoFecha.toString()};
		String[] dato3= {"leer","2022-05-14"};
		//System.out.println(datoFecha.toString().getClass().getSimpleName());
		enlazados.pushBack(dato1);
		enlazados.pushBack(dato2);
		enlazados.pushBack(dato3);
		//System.out.print("cabeza "+enlazados.head+"\n");
		enlazados.printDatosAlmacenados(enlazados);
		enlazados.printDatosSegunFecha(enlazados, "2022-05-13");
		
		
	}

}
