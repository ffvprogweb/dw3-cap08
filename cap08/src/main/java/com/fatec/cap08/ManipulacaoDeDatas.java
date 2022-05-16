package com.fatec.cap08;

import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Months;
import org.joda.time.Years;

public class ManipulacaoDeDatas {

	public static void main(String[] args) {
		DateTime dateTime = new DateTime();
		// Imprimindo a data no formato YYYY-MM-dd 
		System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd")); 
		// Imprimindo a data no formato YYYY-MM-dd HH:mm:ss 
		System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd HH:mm:ss"));
		// Imprimindo o mês 
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText()); 
		// Imprimindo o mês
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsShortText());
		// Imprimindo o mês em Inglês 
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText(Locale.ENGLISH));

		DateTime dataFinal = new DateTime();
		System.out.println("data final  = " + dataFinal.toString("dd-MM-YYYY")); 
		DateTime dataInicio = new DateTime(2021, 1, 1, 0, 0);
		System.out.println("data inicio = " + dataInicio.toString("dd-MM-YYYY")); 
		Days d = Days.daysBetween(dataInicio, dataFinal); 
		System.out.println("Diferença dias:" + d.getDays()); 
		Years y = Years.yearsBetween(dataInicio, dataFinal); 
		System.out.println("Diferença anos:" + y.getYears()); 
		Hours h = Hours.hoursBetween(dataInicio, dataFinal);
		System.out.println("Diferença horas:" +h.getHours()); 
		Months m = Months.monthsBetween(dataInicio, dataFinal); 
		System.out.println("Diferença meses:" + m.getMonths());     

	}

}
