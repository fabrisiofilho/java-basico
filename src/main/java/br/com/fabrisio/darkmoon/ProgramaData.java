package br.com.fabrisio.darkmoon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaData {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		LocalDate nasceu = LocalDate.parse("2030-12-20", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate inicio = LocalDate.parse("2021-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate viveu = nasceu;
		LocalDate aniver;
		Integer dia = 0;
		Integer diaProximo = 0;
		Integer idade;
		Integer fez = 0;
		
		if(viveu.isBefore(hoje)) {
			do {
				viveu = viveu.plusDays(1);
				dia++;
			}while(viveu.isBefore(hoje));
			
			idade = dia/365;
			aniver = nasceu.plusYears(idade + 1);
			
			while(inicio.isBefore(hoje) || inicio.equals(hoje)) {
				inicio = inicio.plusDays(1);
				if(inicio.equals(aniver.minusYears(1))){
					fez = 1;
				}
			}
			
			if(hoje.isBefore(aniver)){
				while(hoje.isBefore(aniver)){
					hoje = hoje.plusDays(1);
					diaProximo++;
				}
			}
			System.out.println("Hoje é: " + hoje.format(DateTimeFormatter.ISO_LOCAL_DATE));
			System.out.println("Nasceu em: " + nasceu.format(DateTimeFormatter.ISO_LOCAL_DATE));
			System.out.println("Viveu : " + dia + " até hoje");
			System.out.println("Faltam : " + diaProximo + " aniversario");
			if(fez == 1) {
				System.out.println("Ja fez aniversario este ano");
			}else {
				System.out.println("Não fez aniversario ainda este ano");
			}
		} else {
			System.out.println("Está data é no futuro");
			while(hoje.isBefore(nasceu)) {
				hoje = hoje.plusDays(1);
				dia++;
			}
			System.out.println("E a pessoa nascerá daqui : " + dia);
		}
	}
}
