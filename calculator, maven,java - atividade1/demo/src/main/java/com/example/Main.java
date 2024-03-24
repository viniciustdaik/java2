package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        String helloworldandtimemillis = String.join(" ", "Hello World!",String.valueOf(System.currentTimeMillis()));
        double num = 2338.52030;
        System.out.println(num);
        num = 5;
        System.out.println(num);
       
        System.out.print(helloworldandtimemillis);
        System.out.println("sei lá o que to fazendo\n");
        System.out.println("Olá, eu não sei como fazer isso aqui no IFRS!");
        System.out.println("Olá, eu não sei como fazer isso aqui no IFRS!"+2+num);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.lineSeparator());
        System.out.println(System.nanoTime());
        */
       
        Scanner teclado = new Scanner(System.in);
        boolean useSavedOrNot = false;
        double saved = 0;
        while (true) {
            double result = handle(teclado,saved,useSavedOrNot);
            System.out.println("Salvar resultado para próxima operação?(Não funciona em: "+
            "exercicio6, exercicio7, exercicio9, exercicio10)(y/n):");
            String saveResult = teclado.next();
            if ("y".equals(saveResult)) {
                saved = result;
                useSavedOrNot = true;
                System.out.println("Salvado.");
            } else {
                useSavedOrNot = false;
            }
        }
    }
   
    private static double handle(Scanner teclado,double saved,boolean useSavedOrNot) {
        //teclado.nextInt() .nextDouble .nextTipo
        System.out.println("Escolha uma operação(add,sub,mul,div,square,successor(n+1,n+2),exercicio6,"
        +"exercicio7,media,exercicio9,exercicio10):");
        String operation = teclado.next();
        //System.out.println(operation instanceof String);
        //System.out.println("add".equals(operation));
        if ("add".equals(operation) || "sub".equals(operation)
            || "mul".equals(operation) || "div".equals(operation)
            || "square".equals(operation) || "successor".equals(operation)
            || "exercicio6".equals(operation) || "exercicio7".equals(operation)
            || "media".equals(operation) || "exercicio9".equals(operation)
            || "exercicio10".equals(operation)) {
            //System.out.println("ACEITADO");
            System.out.println("Operação escolhida: "+operation);
            
            if ("exercicio6".equals(operation)) {
                double result = 0;
                System.out.println("Preço da lata:");
                double price = teclado.nextDouble();
                System.out.println("Preço: "+price);
                System.out.println("Quantidade:");
                double quantity = teclado.nextDouble();
                System.out.println("Quantidade: "+quantity);
                result = price*quantity;
                System.out.println("Preço*Quantidade="+result);
                return result;
            } else if ("exercicio7".equals(operation)) {
                double result1 = 0;
                double result2 = 0;
                System.out.println("Quantidade de cachorros quentes(R$5):");
                double quantity1 = teclado.nextDouble();
                System.out.println("Inserido: "+quantity1);
                result1 = 5*quantity1;
                System.out.println("Preço para cachorros quentes: "+result1);
                
                System.out.println("Quantidade de refrigerantes(R$3):");
                double quantity2 = teclado.nextDouble();
                System.out.println("Inserido"+quantity2);
                result2 = 3*quantity2;
                System.out.println("Preço para refrigerantes(R$3): "+result2);
                System.out.println("Preço total: "+(result1+result2));
                return result1+result2;
            } else if ("exercicio9".equals(operation)) {
                double result = 0;
                System.out.println("Distância:");
                double distance = teclado.nextDouble();
                System.out.println("Inserido: "+distance);

                System.out.println("Consumo:");
                double consume = teclado.nextDouble();
                System.out.println("Inserido: "+consume);
                result = (distance/consume)*4.20;
                System.out.println("Custo total(Preço da gasolina=R$4,20): "+result);
                return result;
            } else if ("exercicio10".equals(operation)) {
                System.out.println("Peso do cacetinho em KG(R$10 por KG):");
                double peso1 = teclado.nextDouble();
                System.out.println("Inserido: "+peso1);
                double result1 = peso1*10;
                System.out.println("Preço do cacetinho: "+result1);

                System.out.println("Peso do bolo em KG(R$25 por KG):");
                double peso2 = teclado.nextDouble();
                System.out.println("Inserido: "+peso2);
                double result2 = peso2*25;
                System.out.println("Preço do bolo: "+result2);

                System.out.println("Peso da bolacha em KG(R$15 por KG):");
                double peso3 = teclado.nextDouble();
                System.out.println("Inserido: "+peso3);
                double result3 = peso3*15;
                System.out.println("Preço do bolo: "+result3);

                double finalResult = result1+result2+result3;
                System.out.println("Valor total: "+finalResult);
                return finalResult;
            }

            if (!useSavedOrNot) {
                System.out.println("Insira o 1o número:");
            } else {
                System.out.println("1o número="+saved+". Insira o 2o número:");
            }
            double num1 = teclado.nextDouble();
            System.out.println("Inserido: "+num1+"\n Insira o 2o número:");
            double num2 = 0;
            if ("mul".equals(operation)||"div".equals(operation)) {
                num2 = 1;
            }
            if (!"square".equals(operation) && !"successor".equals(operation)
            && !useSavedOrNot) {
                num2 = teclado.nextDouble();
                System.out.println("Inserido: "+num2);
            }
            if (useSavedOrNot) {
                num2 = num1;
                num1 = saved;
            }
            
            System.out.println("num1,num2"+num1+""+num2);
            
            //double num3 = oneMoreNum(teclado,operation,3);
            //double num4 = oneMoreNum(teclado,operation,4);
           
            double result = 0;
            if ("add".equals(operation)) {
                result = num1+num2;
            } else if ("sub".equals(operation)) {
                result = num1-num2;
            } else if ("mul".equals(operation)) {
                result = num1*num2;
            } else if ("div".equals(operation)) {
                result = num1/num2;
            } else if ("square".equals(operation)) {
                result = num1*num1;
            } else if ("successor".equals(operation)) {
                System.out.println("Resultado: " +(num1+1)+", "+(num1+2));
                return num1+2;
            } else if ("media".equals(operation)) {
                result = (num1+num2)/2;
            }
            
            System.out.println("Resultado: "+result);
            return result;
        }
        System.out.println("Operação não existente.");
        return 0;
    }
   
    /*private static double oneMoreNum(Scanner teclado,String operation,int num) {
        System.out.println("Inserir um "+num+"o número?(y/n):");
        String oneMoreNum = teclado.next();
        double toReturn = 0;
        if ("div".equals(operation) || "mul".equals(operation)) {
            toReturn = 1;
        }
        if ("y".equals(oneMoreNum)) {
            System.out.println("Insira o 3o número:");
            toReturn = teclado.nextDouble();
            System.out.println("Inserido: "+toReturn);
        }
        return(toReturn);
    }*/
}