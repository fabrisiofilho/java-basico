package br.com.fabrisio.darkmoon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ProgramaMaisRapido {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		LocalDate nasceu = LocalDate.parse("2030-12-20", DateTimeFormatter.ISO_LOCAL_DATE);
		
		Long dias = ChronoUnit.DAYS.between(hoje, nasceu);
		
		System.out.println(dias);
	}
}
