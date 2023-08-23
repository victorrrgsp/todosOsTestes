 package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		//objeto de formatação
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//especifica o fuzo horario q irei ultiliza, que considera o horario do computador, para utilizar o instant
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//O iso date time é uma data local
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		//
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		//Convertendo texto para data
		LocalDate d04 = LocalDate.parse("2023-08-15");
		//Convertendo texto para data e hora
		LocalDateTime d05 = LocalDateTime.parse("2023-08-15T01:30:22");
		//Convertendo o texto para data hora em gmt de londres
		Instant d06 = Instant.parse("2023-08-15T01:30:22Z");
	
		//passa como argumento o format, que ele respeita na datatimeformatter
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));	
		System.out.println();
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println();
		
		//Vai printar no formato iso
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		//tambem vai printar no formato iso
		System.out.println("d06 = " + d06.toString());
	}
}