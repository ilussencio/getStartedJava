import java.util.Scanner;

public class App {
    static int menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("MENU DE OPCOES:");
        System.out.println("1) Relatorio de clientes");
        System.out.println("2) A receita total");
        System.out.println("3) Conta foi mais barata");
        System.out.println("4) Consumo medio de clientes tipo 1.");
        System.out.println("5) Clientes que consumiram acima de 120 pulsos.");
        System.out.println("6) A porcentagem de clientes tipo 2");
        System.out.println("7) Sair");
        System.out.print("Informe uma opcao: ");
        
        int opcao = s.nextInt();
        return opcao;
    }

    static void relatorio(int quant,String nome[],String telefone[],int tipo[],int minutos[],double valordaconta[]){
        System.out.println("\t*** RELATORIO DE CLIENTES ***");
        System.out.println("\t\tCliente\tNome\tTelefone\tTipo\tMinutos\tValor da conta");
        for(int i = 0; i < quant; i++){            
            System.out.printf("\t\t%d\t%s\t%s\t%d\t%d\t%.2f\n",i,nome[i],telefone[i],tipo[i],minutos[i],valordaconta[i]);
        }
        System.out.println("\t*** FIM ***");
    }

    static void receita_total(int quant,double valordaconta[]){
        double soma=0;

        for(int i = 0; i < quant; i++){
            soma += valordaconta[i];
        }

        System.out.println("\t*** RECEITA TOTAL DA EMPRESA ***");
        System.out.printf("\t\tR$ %.2f\n",soma);
        System.out.println("\t*** FIM ***");
    }

    static void conta_barata(int quant,String nome[],String telefone[],double valordaconta[]){
        int menor = 0;

        for(int i = 0; i < quant; i ++){
            if(valordaconta[i] < valordaconta[menor])
                menor = i;
        }
        System.out.println("\t*** CONTA MAIS BARATA ***");
        System.out.printf("\t\tCliente\tNome\tTelefone\tValor da conta\n");
        System.out.printf("\t\t%d\t%s\t%s\t%.2f\n",menor,nome[menor],telefone[menor],valordaconta[menor]);
        System.out.println("\t*** FIM ***");
    }

    static void consumo_medio_tp1(int quant,int tipo[],int minutos[]){
        int soma = 0, count = 0;
        for(int i = 0; i < quant; i++){
            if(tipo[i] == 1){
                soma += minutos[i];
                count += 1;
            }
        }
        System.out.println("\t*** MEDIA DE MINUTOS - TIPO 1 ***");
        System.out.printf("\t\t%d minutos\n",soma/count);
        System.out.println("\t*** FIM ***");
    }

    static void consumo_acima(int quant,int minutos[]){
        int count = 0;
        for(int i = 0; i < quant; i ++){
            if(minutos[i] >= 120)
                count ++;
        }
        System.out.println("\t*** QUANTIDADE DE CLIENTES ACIMA DE 120 MINUTOS ***");
        System.out.printf("\t\tPossui %d clientes acima de 120 minutos\n", count);
        System.out.println("\t*** FIM ***");
    }
    
    static void porcentagem(int quant,int tipo[]){
        double count = 0;
        for(int i = 0; i < quant; i ++){
            if(tipo[i] == 2)
                count ++;
        }
        System.out.println("\t*** PORCENTAGEM DE CLIENTE TIPO 2 ***");
        System.out.printf("\t\tPorcentagem de clientes tipo 2: %.1f porcento\n", (double) (count/quant)*100);
        System.out.println("\t*** FIM ***");
    }
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        //  TAREFA 01
        //Informar a quantidade de clientes/entradas
        System.out.printf("Informe a quantidade de clientes: ");
        int quant = s.nextInt();

        //Declarando os vetores utilizados para salvar os dados
        String nome[] = new String[quant];
        String telefone[] = new String[quant];
        int tipo[] = new int[quant];
        int minutos[] = new int[quant];
        double valordaconta[] = new double[quant];

        

        //Leitura dos dados dos clientes
        for(int i = 0; i < quant; i ++){
            s.nextLine(); //Limpar buffer
            System.out.printf("\nDados do %do. cliente:\n",i);
            System.out.printf("Nome: ");
            nome[i] = s.nextLine();            
            System.out.printf("Telefone: ");
            telefone[i] = s.next();
            System.out.printf("Tipo: ");
            tipo[i] = s.nextInt();
            System.out.printf("Minutos: ");
            minutos[i] = s.nextInt();
        }

        //  TAREFA 02
        //Declarando a matriz de preços
        double mPreco[][] = new double[3][2];

        //Preenchendo a matriz
        System.out.println("\nInforme o preco basico e excedente de cada tipo de conta:");
        for(int i=0; i<3;i++){
            System.out.printf("Tipo %d: ",i);
            for(int j=0;j<2;j++){
                mPreco[i][j] = s.nextDouble();
            }
        }

        //  TAREFA 03
        //Calcular o valor da conta
        for(int i=0; i < quant; i++){
            if(minutos[i] <= 90){
                valordaconta[i] = mPreco[tipo[i]][0];
            }else{
                valordaconta[i] = (double) ((minutos[i]-90) * mPreco[tipo[i]][1]) + mPreco[tipo[i]][0];
            }
        }

        int opcao;
        do{
            opcao = menu();

            if(opcao >= 1 && opcao <= 7){
                if(opcao == 1)
                    relatorio(quant,nome,telefone,tipo,minutos,valordaconta);
                if(opcao == 2)
                    receita_total(quant,valordaconta);
                if(opcao == 3)
                    conta_barata(quant,nome,telefone,valordaconta);
                if(opcao == 4)
                    consumo_medio_tp1(quant,tipo,minutos);
                if(opcao == 5)
                    consumo_acima(quant,minutos);
                if(opcao == 6)
                    porcentagem(quant,tipo);

            }else{
                System.out.println("\n\t*** OPÇÃO INVALIDA! ***\n");
            }
            System.out.println();

        }while(opcao != 7);



    }
}