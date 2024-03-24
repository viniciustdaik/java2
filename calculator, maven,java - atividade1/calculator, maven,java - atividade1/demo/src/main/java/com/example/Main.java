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
            "exercicio6, exercicio7, exercicio9, exercicio10, exercicio11, exercicio12, exercicio13, "+
            "exercicio14, exercicio15)(y/n/exit):");
            String saveResult = teclado.next();
            if ("y".equals(saveResult)) {
                saved = result;
                useSavedOrNot = true;
                System.out.println("Salvado.");
            } else if ("exit".equals(saveResult)) {
                break;
            } else {
                useSavedOrNot = false;
            }
        }
    }
   
    private static double handle(Scanner teclado,double saved,boolean useSavedOrNot) {
        //teclado.nextInt() .nextDouble .nextTipo
        System.out.println("Escolha uma operação(add,sub,mul,div,exponent,successor(n+1,n+2),exercicio6,"
        +"exercicio7,media,exercicio9,exercicio10,exercicio11,exercicio12,exercicio13,exercicio14,exercicio15):");
        String operation = teclado.next();
        //System.out.println(operation instanceof String);
        //System.out.println("add".equals(operation));
        if ("add".equals(operation) || "sub".equals(operation)
            || "mul".equals(operation) || "div".equals(operation)
            || "exponent".equals(operation) || "successor".equals(operation)
            || "exercicio6".equals(operation) || "exercicio7".equals(operation)
            || "media".equals(operation) || "exercicio9".equals(operation)
            || "exercicio10".equals(operation) || "exercicio11".equals(operation)
            || "exercicio12".equals(operation) | "exercicio13".equals(operation)
            | "exercicio14".equals(operation) | "exercicio15".equals(operation)
            | "exercicio16".equals(operation)) {
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
                System.out.println("Distância em Km:");
                double distance = teclado.nextDouble();
                System.out.println("Inserido: "+distance);

                System.out.println("Consumo Km/L:");
                double consume = teclado.nextDouble();
                System.out.println("Inserido: "+consume);
                result = (distance/consume)*4.20;
                System.out.println("Custo total(Preço da gasolina=R$4,20): "+result);
                return result;
            } else if ("exercicio10".equals(operation)) {
                System.out.println("Peso dos cacetinhos em G(R$10 por KG):");
                double peso1 = teclado.nextDouble();
                System.out.println("Inserido: "+peso1+" Gramas");
                double result1 = (peso1/1000)*10;
                System.out.println("Preço dos cacetinhos: "+result1);

                System.out.println("Peso dos bolos em G(R$25 por KG):");
                double peso2 = teclado.nextDouble();
                System.out.println("Inserido: "+peso2+" Gramas");
                double result2 = (peso2/1000)*25;
                System.out.println("Preço dos bolos: "+result2);

                System.out.println("Peso das bolachas em G(R$15 por KG):");
                double peso3 = teclado.nextDouble();
                System.out.println("Inserido: "+peso3+" Gramas");
                double result3 = (peso3/1000)*15;
                System.out.println("Preço das bolachas: "+result3);

                double finalResult = result1+result2+result3;
                System.out.println("Valor total: "+finalResult);
                return finalResult;
            } else if ("exercicio11".equals(operation)) {
                System.out.println("Quantidade de calorias do café da manhã:");
                double calorias1 = teclado.nextDouble();
                System.out.println("Inserido: "+calorias1);

                System.out.println("Quantidade de calorias do lanche da manhã:");
                double calorias2 = teclado.nextDouble();
                System.out.println("Inserido: "+calorias2);
               
                System.out.println("Quantidade de calorias do almoço:");
                double calorias3 = teclado.nextDouble();
                System.out.println("Inserido: "+calorias3);
               
                System.out.println("Quantidade de calorias do lanche da tarde:");
                double calorias4 = teclado.nextDouble();
                System.out.println("Inserido: "+calorias4);
               
                System.out.println("Quantidade de calorias do jantar:");
                double calorias5 = teclado.nextDouble();
                System.out.println("Inserido: "+calorias5);

                double result = calorias1+calorias2+calorias3+calorias4+calorias5;
                System.out.println("Total de calorias: "+result);
                return result;
            } else if ("exercicio12".equals(operation)) {
                System.out.println("Quantos pastéis sua amiga comeu:");
                double pasteis1 = teclado.nextDouble();
                System.out.println("Inserido: "+pasteis1);
               
                //System.out.println(pasteis1%3+","+pasteis1/3+","+((pasteis1-pasteis1%3)/3));
               
                double result = (((pasteis1-pasteis1%3)/3)*4)+pasteis1;
                System.out.println("Total de pastéis comidos: "+result);
                return result;
            } else if ("exercicio13".equals(operation)) {
                System.out.println("Potes pequenos(R$4,50 cada):");
                double smallPots = teclado.nextDouble();
                double result1 = smallPots*4.5;
                System.out.println("Inserido: "+smallPots+" Preço dos potes pequenos: "+result1);
               
                System.out.println("Potes grandes(R$6 cada):");
                double bigPots = teclado.nextDouble();
                double result2 = bigPots*6;
                System.out.println("Inserido: "+bigPots+" Preço dos potes grandes: "+result2);
               
                double result = result1+result2;
                System.out.println("Valor total: "+result);
                return result;
            } else if ("exercicio14".equals(operation)) {
                System.out.println("Total de questões:");
                double totalQuestions = teclado.nextDouble();
                System.out.println("Inserido: "+totalQuestions);

                /*
                  Acertos = Nota
                10=50; 9=42; 8=34; 7=26; 6=18; 5=10; 
                4=2; 3=-6; 2=-14; 1=-22; 0=-30;
                 */

                System.out.println("Pontos:");
                double score = teclado.nextDouble();
                double maxPoints = totalQuestions*5;
                double incorrect = (maxPoints-score)/8;
                double correct = totalQuestions-incorrect;
                System.out.println("Inserido: "+score+" Acertos: "+correct+" Erros: "+incorrect);
                
                System.out.println("Acertou: "+correct+"/"+totalQuestions+" Pontos: "+score+"/"+maxPoints);
                return correct;
            } else if ("exercicio15".equals(operation)) {
                System.out.println("Kg de trigo(1Kg=23 pães franceses):");
                double kg1 = teclado.nextDouble();
                System.out.println("Inserido: "+kg1+"Kg");
               
                double result = kg1*23;
               
                System.out.println("Pães franceses: "+result);
                return result;
            } else if ("exercicio16".equals(operation)) {
                String num = teclado.next();
                String[] separatedNum = num.split("");
                //System.out.println(separatedNum);
                int i = 0;
                String first = "";
                String second = "";
                String third = "";
                String fourth = "";
                for (String a : separatedNum) {
                    i += 1;
                    if (i == 1) {
                        first = a+"   ";
                    } else if (i == 2) {
                        second = a+"   ";
                    } else if (i == 3) {
                        third = a+"   ";
                    } else if (i == 4) {
                        fourth = a+"   ";
                    } else if (i > 4) {
                        System.out.println("Maior que 4 digitos.");
                        i = -1;
                        break;
                    }
                }
                if (i == -1) {
                    return 0;
                }
                String result = first+second+third+fourth;
                System.out.println("Resultado: "+result);
                return 0;
            }

            if (!useSavedOrNot) {
                System.out.println("Insira o 1o número:");
            } else {
                System.out.println("1o número="+saved+". Insira o 2o número:");
            }
            double num1 = teclado.nextDouble();
            System.out.println("Inserido: "+num1);
            double num2 = 0;
            if ("mul".equals(operation)||"div".equals(operation)) {
                num2 = 1;
            }
            if (!"successor".equals(operation)
            && !useSavedOrNot) {
                if ("exponent".equals(operation)) {
                    System.out.println("Insira o 2o número:");
                    num2 = teclado.nextDouble();
                    System.out.println("Inserido: "+num2);
                } else {
                    System.out.println("Insira o expoente:");
                    num2 = teclado.nextDouble();
                    System.out.println("Inserido: "+num2);
                }
            }
            if (useSavedOrNot) {
                num2 = num1;
                num1 = saved;
            }
           
            //System.out.println("num1,num2"+num1+""+num2);
           
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
            } else if ("exponent".equals(operation)) {
                result = num1;
                if (num2 == 0) {
                    result = 1;
                    if (num1 < 0) {
                        result = -1;
                    }
                } else {
                    for (int i = 1; i < num2; i++) {
                        System.out.println(i);
                        result = result*num1;
                    }
                }
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
