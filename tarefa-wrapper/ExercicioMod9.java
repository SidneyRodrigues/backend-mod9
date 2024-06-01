package br.com.smorais.tarefa_wrapper;

import java.util.Scanner;

public class ExercicioMod9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um valor númerico: ");
        int valorPrimitivo = s.nextInt();

        Float valorWrapper = Float.valueOf(valorPrimitivo);

        System.out.println("Valor Primitivo: " + valorPrimitivo);
        System.out.println("Valor Wrapper: " + valorWrapper);

        s.close();

    }
}
