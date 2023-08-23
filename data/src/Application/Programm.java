package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Programm {

	public static void main(String[] args) {

		// lembrando que data hora sao objetos imutaveis
		
		// Convertendo texto para data
		LocalDate d04 = LocalDate.parse("2023-08-15");
		// Convertendo texto para data e hora
		LocalDateTime d05 = LocalDateTime.parse("2023-08-15T01:30:22");
		// Convertendo o texto para data hora em gmt de londres
		Instant d06 = Instant.parse("2023-08-15T01:30:22Z");

		// vai converter o instant para uma data local, e o dia pode mudar por conta do fuzo horario
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		// vai converter o instant para uma data local, que no caso é o brasil
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		// vai converter o instant para uma data local, que no caso é portugal
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		// vai pegar o dia do mes
		System.out.println("d04 = " + d04.getDayOfMonth());
		// mes da data convertida
		System.out.println("d04 = " + d04.getMonthValue());
		// vai pegar o ano da data convertida 
		System.out.println("d04 = " + d04.getYear());
		
		// vai pegar a hora da data d05
		System.out.println("d05 hora = " + d05.getHour());
		//vai pegar o minute da data do d05
		System.out.println("d05 minute = " + d05.getMinute());
		
	}
}
