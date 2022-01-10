package com.teste;

public class Calculador {
	
	public int somar (String expressao){
        int soma = 0;
        for (String valorSomar: expressao.split("\\+"))
            soma += Integer.parseInt(valorSomar);
        System.out.println(soma);
        return soma;
    }

}
