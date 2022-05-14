package date;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.*;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate x= LocalDate.of(2002,1,22); //para los meses de 1 digito, necesita poner 0 por delante, osea: 01,02,03,04...
		String y = x.toString();
		System.out.print(y.equals("2002-01-22"));
	}

}
