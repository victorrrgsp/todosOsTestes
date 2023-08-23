package Application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Cdt {

	public static void main(String[] args) {

		// lembrando que data hora sao objetos imutaveis

		// Convertendo texto para data
		LocalDate d04 = LocalDate.parse("2023-08-15");
		// Convertendo texto para data e hora local
		LocalDateTime d05 = LocalDateTime.parse("2023-08-15T01:30:22");
		// Convertendo o texto para data hora em gmt de londres
		Instant d06 = Instant.parse("2023-08-15T01:30:22Z");

		// está instaciando uma nova data menos 7 dias
		LocalDate diasAntes = d04.minusDays(7);
		// está instaciando uma nova data mais 7 dias
		LocalDate diasDepois = d04.plusDays(7);

		System.out.println("Dias Antes = " + diasAntes);
		System.out.println("Dias Depois = " + diasDepois);
		System.out.println();

		// está instaciando uma nova data com menos 7 anos
		LocalDate addAnos = d04.minusYears(7);
		// está instaciando uma nova data com mais 7 anos
		LocalDate removeAnos = d04.plusYears(7);

		System.out.println("Anos Antes = " + addAnos);
		System.out.println("Anos depois = " + removeAnos);
		System.out.println();

		// está instaciando uma nova data com hora menos 7 dias
		LocalDateTime diasAntesDT = d05.minusDays(7);
		// está instaciando uma nova data com hora mais 7 dias
		LocalDateTime diasDepoisDT = d05.plusDays(7);

		System.out.println("Dias Antes = " + diasAntesDT);
		System.out.println("Dias depois = " + diasDepoisDT);
		System.out.println();

		// está instaciando uma nova data global menos 7 dias, onde terá que especificar
		Instant diasAntesI = d06.minus(7, ChronoUnit.DAYS);
		// está instaciando uma nova data global mais 7 dias, onde terá que especificar
		Instant diasDepoisI = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("Dias Antes = " + diasAntesI);
		System.out.println("Dias depois = " + diasDepoisI);
		System.out.println();

		/*
		 * ele nao pode calcula de duracao de duas data, terá que converter para,
		 * dateTime no inicio do dia
		 */
		Duration t1 = Duration.between(diasAntes.atStartOfDay(), d04.atStartOfDay());
		// calcula de duracao de duas data com horario
		Duration t2 = Duration.between(diasAntesDT, d05);
		// calcula de duracao de duas data com horario global
		Duration t3 = Duration.between(diasAntesI, d06);
		// calcula de duracao de duas data com horario global
		Duration t4 = Duration.between(d06 ,diasAntesI);

		System.out.println("t1 dias = " + t1.toHours());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.getSeconds());
		System.out.println("t4 dias = " + t4.toDays());
	}
}