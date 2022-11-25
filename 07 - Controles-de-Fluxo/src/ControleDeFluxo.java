public class ControleDeFluxo {
    public static void main(String[] args) throws Exception {
        ifFlecha();
        ifSemFlecha();
        ifFerias ();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
            
        }

    private static void ifFlecha(){
        /*ESCREVER O CÓDIGO DESSA FORMA É COMPLETAMENTE DISFUNCIONAL, NÃO FAZ PARTE DAS BOAS PRÁRICAS E DEVE SER EVITADO DE TODAS AS FORMAS */
        int mes = 12;
        if (mes==1) {
            System.out.println("Janeiro");
        }else {
            if(mes==2) {
                System.out.println("Fevereiro");
            } else {
                if (mes==3) {
                    System.out.println("Março");
                } else {
                    if (mes==4) {
                        System.out.println("Abril");
                    } else {
                        System.out.println("Digite um mês entre os citados.");
                    }
                } 
            }
        }
    }

   private static void ifSemFlecha() {
    int mes = 2930;
    if (mes == 1) {
        System.out.println("Janeiro");
    } else if (mes == 2) {
        System.out.println("Fevereiro");
    } else if (mes == 3) {
        System.out.println("Março");
    } else if (mes == 4) {
        System.out.println("Abril");
    } else if (mes == 5) {
        System.out.println("Maio");
    } else if (mes == 6) {
        System.out.println("Junho");
    } else if (mes == 7) {
        System.out.println("Julho");
    } else if (mes == 8) {
        System.out.println("Agosto");
    } else if (mes == 9) {
        System.out.println("Setembro");
    } else if (mes == 10) {
        System.out.println("Outubro");
    } else if (mes == 11) {
        System.out.println("Novembro");
    } else if (mes ==12) {
        System.out.println("Dezembro");
        } else {
            System.out.println("[ERRO!] Digite um mês válido!");
        }
    }

    private static void ifFerias() {
        /*NÃO FAZER, NESSE CASO DEVE-SE USAR O SWITCH*/
        String mes = "Julho";
        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
            System.out.println("Férias!");
        }
        
    }

    private static void ifMenor() {
 /* Esse é um exemplo para seguir onde vc vai criando novas variaveis e consegue simplifica o if.
 * 
 * Aqui são varias opções de como fazer, não seria possível, nem necessário usar esse código inteiro.
 */

        double salMensal= 2500.00;
        double mediaSal = 3000.00;

        int quantDep = 4;
        int mediaDep = 2;

/*Opção abaixo não é a melhor solução */
        if ((salMensal <= mediaSal) && (quantDep >= mediaDep)) {
            System.out.println("Funcionário deve receber o auxílio");
        }

/*As duas abaixo são as melhores opções para a continuaão do código, qual usar depende do caso 
 */
        boolean salBaixo = salMensal < mediaSal;
        boolean muitosDep = quantDep > mediaDep;

        if ((salBaixo) && (muitosDep)) {
            System.out.println("Funcionário deve receber o auxílio");
        }

        boolean recebeAuxilio = (salBaixo) && (muitosDep);
        if (recebeAuxilio) {
                System.out.println("Funcionário deve receber o auxílio");
            } else {
                System.out.println("Funcionário não deve receber o auxílio");
            }        
        }
    
    private static void switchSemana() {
        String dia = "janeiro";
        switch (dia) {
            case "Segunda":
                System.out.println("2");
                break;
            case "Terça":
                System.out.println("3");
                break;
            case "Quarta":
                System.out.println("4");
                break;
            case "Quinta":
                System.out.println("5");
                break;
            case "Sexta":
                System.out.println("6");
                break;
            case "Sábado":
                System.out.println("7");
                break;
            case "Domingo":
                System.out.println("1");
                break;
            default:
                System.out.println("[ERRO!] Digite uma opção válida");
                break;
        }
        
    }

    private static void switchNumero() {
        int numero = 4;
        
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Errado");
            break;
            case 4:
                System.out.println("Certo");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            case 6:
                System.out.println("Tente novamente");
                break;
            default:
                System.out.println("[ERRO!] Digite um número válido");
                break;
        }
    }

    private static void switchFerias() {
        String ferias = "Dezembro";
        switch (ferias){
            case "Dezembro":
            case "Janeiro":
            case "Julho":
                System.out.println("Suas férias chegou!");
                break;
            default:
                System.out.println("Esse não é um mês de férias.");
                break;
        }
    }
}