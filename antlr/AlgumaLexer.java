// Generated from Alguma.g4 by ANTLR 4.10

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TIPO=5, ID=6, NUM=7, OPERADOR=8, WS=9, 
		STR=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "TIPO", "ID", "NUM", "OPERADOR", "WS", 
			"STR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':DECLARACAO'", "':ALGORITMO'", "'ATRIBUIR'", "'A'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TIPO", "ID", "NUM", "OPERADOR", "WS", 
			"STR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\nv\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0005\u0004\u0005M\b\u0005"+
		"\u000b\u0005\f\u0005N\u0001\u0005\u0005\u0005R\b\u0005\n\u0005\f\u0005"+
		"U\t\u0005\u0001\u0006\u0004\u0006X\b\u0006\u000b\u0006\f\u0006Y\u0001"+
		"\u0006\u0001\u0006\u0005\u0006^\b\u0006\n\u0006\f\u0006a\t\u0006\u0003"+
		"\u0006c\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\bh\b\b\u000b\b\f"+
		"\bi\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tp\b\t\n\t\f\ts\t\t\u0001\t"+
		"\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0001\u0000\u0006"+
		"\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u000009\u0005\u0000*+--//<<>"+
		">\u0003\u0000\t\n\r\r  \u0001\u0000\"\"\u007f\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000\u0000\u0000"+
		"\u0003!\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00075"+
		"\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bL\u0001\u0000"+
		"\u0000\u0000\rW\u0001\u0000\u0000\u0000\u000fd\u0001\u0000\u0000\u0000"+
		"\u0011g\u0001\u0000\u0000\u0000\u0013m\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0005:\u0000\u0000\u0016\u0017\u0005D\u0000\u0000\u0017\u0018\u0005E"+
		"\u0000\u0000\u0018\u0019\u0005C\u0000\u0000\u0019\u001a\u0005L\u0000\u0000"+
		"\u001a\u001b\u0005A\u0000\u0000\u001b\u001c\u0005R\u0000\u0000\u001c\u001d"+
		"\u0005A\u0000\u0000\u001d\u001e\u0005C\u0000\u0000\u001e\u001f\u0005A"+
		"\u0000\u0000\u001f \u0005O\u0000\u0000 \u0002\u0001\u0000\u0000\u0000"+
		"!\"\u0005:\u0000\u0000\"#\u0005A\u0000\u0000#$\u0005L\u0000\u0000$%\u0005"+
		"G\u0000\u0000%&\u0005O\u0000\u0000&\'\u0005R\u0000\u0000\'(\u0005I\u0000"+
		"\u0000()\u0005T\u0000\u0000)*\u0005M\u0000\u0000*+\u0005O\u0000\u0000"+
		"+\u0004\u0001\u0000\u0000\u0000,-\u0005A\u0000\u0000-.\u0005T\u0000\u0000"+
		"./\u0005R\u0000\u0000/0\u0005I\u0000\u000001\u0005B\u0000\u000012\u0005"+
		"U\u0000\u000023\u0005I\u0000\u000034\u0005R\u0000\u00004\u0006\u0001\u0000"+
		"\u0000\u000056\u0005A\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005i"+
		"\u0000\u000089\u0005n\u0000\u00009J\u0005t\u0000\u0000:;\u0005f\u0000"+
		"\u0000;<\u0005l\u0000\u0000<=\u0005o\u0000\u0000=>\u0005a\u0000\u0000"+
		">J\u0005t\u0000\u0000?@\u0005s\u0000\u0000@A\u0005t\u0000\u0000AB\u0005"+
		"r\u0000\u0000BC\u0005i\u0000\u0000CD\u0005n\u0000\u0000DJ\u0005g\u0000"+
		"\u0000EF\u0005B\u0000\u0000FG\u0005o\u0000\u0000GH\u0005o\u0000\u0000"+
		"HJ\u0005l\u0000\u0000I7\u0001\u0000\u0000\u0000I:\u0001\u0000\u0000\u0000"+
		"I?\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000J\n\u0001\u0000\u0000"+
		"\u0000KM\u0007\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OS\u0001"+
		"\u0000\u0000\u0000PR\u0007\u0001\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000T\f\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0007\u0002"+
		"\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Zb\u0001\u0000\u0000\u0000"+
		"[_\u0005,\u0000\u0000\\^\u0007\u0002\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000b[\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u000e\u0001\u0000\u0000"+
		"\u0000de\u0007\u0003\u0000\u0000e\u0010\u0001\u0000\u0000\u0000fh\u0007"+
		"\u0004\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kl\u0006\b\u0000\u0000l\u0012\u0001\u0000\u0000\u0000mq\u0005\""+
		"\u0000\u0000np\b\u0005\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\"\u0000\u0000u\u0014"+
		"\u0001\u0000\u0000\u0000\n\u0000INQSY_biq\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}