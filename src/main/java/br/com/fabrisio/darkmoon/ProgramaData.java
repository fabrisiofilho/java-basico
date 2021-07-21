package br.com.fabrisio.darkmoon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaData {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate nasceu = LocalDate.parse("1998-12-20", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate viveu = LocalDate.parse("1998-12-20", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate proximoAniversario = LocalDate.parse("2021-12-20", DateTimeFormatter.ISO_LOCAL_DATE);
		Integer dia = 0;
		Integer diaProximo = 0;
		
		if(viveu.isBefore(hoje)) {
			do {
				viveu = viveu.plusDays(1);
				dia++;
			}while(viveu.isBefore(hoje));
		} else {
			System.out.println("Está data é no futuro");
		}
		if(proximoAniversario.isAfter(hoje)) {
			do {
				proximoAniversario = proximoAniversario.minusDays(1);
				diaProximo --;
			}while(proximoAniversario.isAfter(hoje));
		}
		
		System.out.println("Hoje é: " + hoje.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Nasceu em: " + nasceu.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Viveu : " + dia + " até hoje");
		System.out.println("Faltam : " + Math.abs(diaProximo) + " aniversario");
	}
}
