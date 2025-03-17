package com.mycompany.testadata;

import java.time.LocalDate;

public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean verificaData(int dia, int mes, int ano){
        if(dia > 0 && mes <= 12 && mes > 0 && ano >= 1) {
            
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
                return false;
            }
            
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                return false;
            }
            
            if (mes == 2) {
                if (ehBissexto(ano) && dia > 29) {
                    return false;  
                } else if (!ehBissexto(ano) && dia > 28) {
                    return false;  
                }
            }
            return true;
        }
        return false;
    }
    

    public void exibirData() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

 
    public Data() {
        LocalDate data = LocalDate.now();
        this.dia = data.getDayOfMonth();
        this.mes = data.getMonthValue();
        this.ano = data.getYear();
    }

 
    public Data(int dia, int mes, int ano) {
        if (verificaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida.");
        }
    }

    public void proximoDia() {

        LocalDate dataAtual = LocalDate.of(ano, mes, dia);
        LocalDate proximoDia = dataAtual.plusDays(1);
  
        this.dia = proximoDia.getDayOfMonth();
        this.mes = proximoDia.getMonthValue();
        this.ano = proximoDia.getYear();
    }

 
    public static boolean ehBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }
        return false;
    }

}
