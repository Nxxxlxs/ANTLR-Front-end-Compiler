// Generated from Alguma.g4 by ANTLR 4.10

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link AlgumaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterNInicio(AlgumaParser.NInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link AlgumaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitNInicio(AlgumaParser.NInicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link AlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracao(AlgumaParser.BlocoDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link AlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracao(AlgumaParser.BlocoDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDecl}
	 * labeled alternative in {@link AlgumaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterNDecl(AlgumaParser.NDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDecl}
	 * labeled alternative in {@link AlgumaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitNDecl(AlgumaParser.NDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoAlgoritmo}
	 * labeled alternative in {@link AlgumaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterBlocoAlgoritmo(AlgumaParser.BlocoAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoAlgoritmo}
	 * labeled alternative in {@link AlgumaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitBlocoAlgoritmo(AlgumaParser.BlocoAlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nalgr}
	 * labeled alternative in {@link AlgumaParser#algr}.
	 * @param ctx the parse tree
	 */
	void enterNalgr(AlgumaParser.NalgrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nalgr}
	 * labeled alternative in {@link AlgumaParser#algr}.
	 * @param ctx the parse tree
	 */
	void exitNalgr(AlgumaParser.NalgrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtr}
	 * labeled alternative in {@link AlgumaParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterNAtr(AlgumaParser.NAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtr}
	 * labeled alternative in {@link AlgumaParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitNAtr(AlgumaParser.NAtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(AlgumaParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(AlgumaParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Noperacao}
	 * labeled alternative in {@link AlgumaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterNoperacao(AlgumaParser.NoperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Noperacao}
	 * labeled alternative in {@link AlgumaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitNoperacao(AlgumaParser.NoperacaoContext ctx);
}