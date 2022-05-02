import antlr.AlgumaBaseListener;
import antlr.AlgumaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.*;

import static java.util.Objects.isNull;

public class MyListener extends AlgumaBaseListener {

    private Map<String, String> tabela_simbolos = new HashMap<String, String>();
    private Map<String, String> tabela_valores = new HashMap<String, String>();

    private int contador = 0;


    @Override
    public void exitNDecl(AlgumaParser.NDeclContext ctx) {
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();

        if (tabela_simbolos.containsKey(id)) {
            System.out.println("Declaracao duplicada! A variavel " + id + " ja foi declarada.");
            contador++;
        } else {
            tabela_simbolos.put(id, tipo);
        }
    }

    @Override
    public void exitNAtr(AlgumaParser.NAtrContext ctx) {

        /* Verifica se a váriavel a direita foi declarada */
        if (!(tabela_simbolos.containsKey(ctx.ID().getText()))) {
            System.out.println("Erro! Variavel a direita " + ctx.ID().getText() + " nao declarada");
            contador++;
        }
        /* Atribuição simples*/
        else if (!isNull(ctx.operando())) {
            /* Atribuição de um variável a outra variável*/
            if (!isNull(ctx.operando().ID())) {
                //System.out.println(ctx.operando().ID().getText());

                /* Verfica se a váriavel a esquerda foi declarada */
                if ((tabela_simbolos.containsKey(ctx.operando().ID().getText()))) {
                    String tipo1 = tabela_simbolos.get(ctx.operando().ID().getText());
                    String tipo2 = tabela_simbolos.get(ctx.ID().getText());

                    /* Verifica se os tipos das variáveis são compatíveis */
                    if (!tipo1.equals(tipo2)) {
                        System.out.println("Erro de tipos incompativeis! Nao e possivel atribuir uma variavel" +
                                " do tipo " + tipo1 + " a uma variavel do tipo " + tipo2);
                        contador++;
                    }

                } else {
                    System.out.println("Erro! Variavel a esquerda " + ctx.operando().ID().getText() + " nao declarada");
                    contador++;
                }
            }
            /* Atribuição de um valor numérico a uma várivavel */
            else if (!isNull(ctx.operando().NUM())) {
                String num = ctx.operando().NUM().getText();
                String tipo = tabela_simbolos.get(ctx.ID().getText());


                if (tipo.equals("float") || tipo.equals("int")) {
                    if (num.contains(",")) {
                        if (tipo.equals("int")) {
                            System.out.println("Erro de tipos incompativeis! Nao e possivel atribuir o numero " + num + " do tipo float" +
                                    " a variavel " + ctx.ID().getText() + " do tipo " + tipo);
                            contador++;
                        } else {
                            tabela_valores.put(ctx.ID().getText(), ctx.operando().NUM().getText());
                        }
                    } else {
                        tabela_valores.put(ctx.ID().getText(), ctx.operando().NUM().getText());
                    }
                } else if (tipo.equals("Bool")) {
                    if (!(num.equals("0") || num.equals("1"))) {
                        System.out.println("Erro de tipos incompativeis! Nao e possivel atribuir o valor " + num +
                                " a variavel " + ctx.ID().getText() + " do tipo " + tipo);
                        contador++;
                    } else {
                        tabela_valores.put(ctx.ID().getText(), ctx.operando().NUM().getText());
                    }
                } else {
                    System.out.println("Erro de tipos incompativeis! Nao e possivel atribuir o valor " + num +
                            " a variavel " + ctx.ID().getText() + " do tipo " + tipo);
                    contador++;
                }
                /* Atribuição de um string a uma variável */
            } else if (!isNull(ctx.operando().STR())) {
                String tipo = tabela_simbolos.get(ctx.ID().getText());

                if (!tipo.equals("string")) {
                    System.out.println("Erro de tipos incompativeis! Nao e possivel atribuir a string " + ctx.operando().STR().getText() +
                            " a variavel " + ctx.ID().getText() + " do tipo " + tipo);
                    contador++;
                } else {
                    tabela_valores.put(ctx.ID().getText(), ctx.operando().STR().getText());
                }
            }
            /* Atribuição Composta */
        } else if (!isNull(ctx.operacao())) {

            String[] operacao = ctx.operacao().getText().split("");

            String sentenca = "";

            ArrayList<String> operandos = new ArrayList<String>();

            /* Salva cada elemento da operacao em uma posicao do vetor*/
            for (int i = 0; i < operacao.length; i++) {
                if ((operacao[i].matches("<|>|=|/|-|\\*|\\+"))) {
                    operandos.add(operandos.size(), sentenca);
                    operandos.add(operandos.size(), operacao[i]);
                    sentenca = "";
                } else {
                    sentenca += operacao[i];
                }
            }
            /* Salva o ultimo elemento*/
            operandos.add(sentenca);
            //System.out.println(operandos);
            String tipo_resultado = "";

            for (int i = 0; i < operandos.size(); i++) {

                if (operandos.get(i).matches("\\+|-|\\*|<|>|/")) {
                    /* Variavel a esquerda nao declarada */
                    if (!tabela_simbolos.containsKey(operandos.get(i - 1))) {
                        System.out.println("Erro ! Variavel " + operandos.get(i - 1) + " nao declarada");
                        tipo_resultado = "e";
                        contador++;
                        /* Variavel a direita nao declarada */
                    } else if (!tabela_simbolos.containsKey(operandos.get(i + 1))) {
                        System.out.println("Erro ! Variavel " + operandos.get(i + 1) + " nao declarada");
                        tipo_resultado = "e";
                        contador++;
                    } else {
                        /* Variaveis a esquerda e direita de mesmo tipo*/
                        if (tabela_simbolos.get(operandos.get(i + 1)).equals(tabela_simbolos.get(operandos.get(i - 1)))) {
                            /* Checagem de operação do tipo string */
                            if (tabela_simbolos.get(operandos.get(i + 1)).equals("string")) {
                                if (!operandos.get(i).equals("+")) {
                                    System.out.println("Erro ! Nao e possivel realizar a operacao entre as variaveis " + operandos.get(i - 1) + " " + tabela_simbolos.get(operandos.get(i - 1)) +
                                            " e " + operandos.get(i + 1) + " " + tabela_simbolos.get(operandos.get(i + 1)));
                                    contador++;
                                }
                                else {
                                    tipo_resultado = "string";
                                }
                                /* Checagem de operacao do tipo Bool */
                            } else if (tabela_simbolos.get(operandos.get(i + 1)).equals("Bool")) {
                                tipo_resultado = "Bool";
                                System.out.println("Erro ! Nao e possivel realizar a operacao entre as variaveis " + operandos.get(i - 1) + " " + tabela_simbolos.get(operandos.get(i - 1)) +
                                        " e " + operandos.get(i + 1) + " " + tabela_simbolos.get(operandos.get(i + 1)));
                                contador++;
                            }
                            else {
                                tipo_resultado = tabela_simbolos.get(operandos.get(i+1));
                            }
                            /* TIPO 1 diferente de TIPO 2 */
                            /* Checagem de operacao entre int int, int float, float float, float int (PERMITIDO)
                            * Operações fora dessas configurações são pegas nesse if*/
                        } else if (!((tabela_simbolos.get(operandos.get(i + 1)).equals("int") && tabela_simbolos.get(operandos.get(i - 1)).equals("float")) ||
                                (tabela_simbolos.get(operandos.get(i - 1)).equals("int") && tabela_simbolos.get(operandos.get(i + 1)).equals("float")))) {
                            tipo_resultado = "null";
                            System.out.println("Erro ! Nao e possivel realizar a operacao entre as variaveis " + operandos.get(i - 1) + " " + tabela_simbolos.get(operandos.get(i - 1)) +
                                    " e " + operandos.get(i + 1) + " " + tabela_simbolos.get(operandos.get(i + 1)));
                            contador++;
                        } else {
                            /* Checagem de divisão por zero */
                            if (operandos.get(i).equals("/") && tabela_valores.get(operandos.get(i + 1)).equals("0")) {
                                tipo_resultado = tabela_simbolos.get(ctx.ID().getText());
                                System.out.println("Erro ! Nao e possivel realizar divisao por 0 ");
                                contador++;
                            /* Checagem se pelo menos uma das varaviaveis é do tipo Bool */
                            } else if (tabela_simbolos.get(operandos.get(i-1)).equals("Bool") || (tabela_simbolos.get(operandos.get(i+1)).equals("Bool"))){
                                System.out.println("Erro ! Nao e possivel realizar a operacao entre as variaveis " + operandos.get(i - 1) + " " + tabela_simbolos.get(operandos.get(i - 1)) +
                                        " e " + operandos.get(i + 1) + " " + tabela_simbolos.get(operandos.get(i + 1)));
                            }
                            /* Operação permitida */
                            else {
                                tipo_resultado = tabela_simbolos.get(operandos.get(i - 1));
                            }
                        }
                    }
                }
            }
            /* Verificação de a variável a direita pode receber o resultado da operação */
            if ((operandos.get(operandos.size()-2).equals(">") || operandos.get(operandos.size()-2).equals("<"))) {
                /* Verificação caso a ultima operação da sentença seja uma comparação - ACEITA APENAS POR TIPO BOOL*/
                if ((tabela_simbolos.containsKey(ctx.ID().getText()) && !tabela_simbolos.get(ctx.ID().getText()).equals("Bool"))) {
                    System.out.println("Erro ! Nao e possivel realizar a operacao " + ctx.operacao().getText() + " e atribuir o resultado a variavel " + ctx.ID().getText() + "("
                            + tabela_simbolos.get(ctx.ID().getText()) + ")");
                    contador++;
                }
            }
            /* Verificação se o tipo da expressão resultante corresponde ao tipo da variável a direita*/
            else if (tabela_simbolos.containsKey(ctx.ID().getText()) && !(tipo_resultado.equals(tabela_simbolos.get(ctx.ID().getText())))) {
                System.out.println("Erro ! Nao e possivel realizar a operacao e atribuir o resultado a variavel " + ctx.ID().getText() + "("
                        + tabela_simbolos.get(ctx.ID().getText()) + ")" + " pois existe pelo menos uma variavel de tipo diferente");
                contador++;
            }
        }


    }
    @Override public void visitErrorNode(ErrorNode node) {
        throw new RuntimeException("Arquivo de entrada nao correspondente a gramatica definida! Consulte a definicao da gramatica");
    }

    public Map<String, String> getTabela_simbolos() {
        return tabela_simbolos;
    }

    public Map<String, String> getTabela_valores() {
        return tabela_valores;
    }

    public void imprimeContador() {
        if (contador == 0) {
            System.out.println("Compilacao terminada! Nenhum erro econtrado");
        }
        else {
            if (contador > 1) {
                System.out.println("Falha na compilacao! Foram encontrados " + contador + " erros");
            }
            else {
                System.out.println("Falha na compilacao! Foi encontrado " + contador + " erro");
            }
        }
    }
}