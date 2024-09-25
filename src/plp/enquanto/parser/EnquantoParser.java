// Generated from ./src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.13.1
package plp.enquanto.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EnquantoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, BOOLEANO=42, INT=43, ID=44, TEXTO=45, Comentario=46, 
		Espaco=47;
	public static final int
		RULE_programa = 0, RULE_seqComando = 1, RULE_comando = 2, RULE_expressao = 3, 
		RULE_booleano = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seqComando", "comando", "expressao", "booleano"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "','", "'skip'", "'se'", "'entao'", "'senaose'", 
			"'senao'", "'enquanto'", "'faca'", "'exiba'", "'escreva'", "'{'", "'}'", 
			"'para'", "'de'", "'ate'", "'repita'", "'vezes'", "'escolha'", "'caso'", 
			"':'", "'outro'", "'leia'", "'^'", "'*'", "'/'", "'+'", "'-'", "'('", 
			"')'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'nao'", "'e'", "'xou'", 
			"'ou'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BOOLEANO", "INT", "ID", "TEXTO", 
			"Comentario", "Espaco"
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

	@Override
	public String getGrammarFileName() { return "Enquanto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnquantoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			seqComando();
			setState(11);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeqComandoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeqComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqComando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSeqComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSeqComando(this);
		}
	}

	public final SeqComandoContext seqComando() throws RecognitionException {
		SeqComandoContext _localctx = new SeqComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seqComando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			comando();
			setState(14);
			match(T__0);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592187402800L) != 0)) {
				{
				{
				setState(15);
				comando();
				setState(16);
				match(T__0);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitAtribuicao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeContext extends ComandoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSe(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExibaContext extends ComandoContext {
		public TerminalNode TEXTO() { return getToken(EnquantoParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExibaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExiba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExiba(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscolhaContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public EscolhaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscolha(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ComandoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public EnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEnquanto(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ParaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPara(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoParalelaContext extends ComandoContext {
		public List<TerminalNode> ID() { return getTokens(EnquantoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EnquantoParser.ID, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public AtribuicaoParalelaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterAtribuicaoParalela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitAtribuicaoParalela(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepitaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public RepitaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterRepita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitRepita(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ComandoContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public BlocoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBloco(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscrevaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EscrevaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscreva(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComandoContext {
		public SkipContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSkip(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(ID);
				setState(24);
				match(T__1);
				setState(25);
				expressao(0);
				}
				break;
			case 2:
				_localctx = new AtribuicaoParalelaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(ID);
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(27);
						match(T__2);
						setState(28);
						match(ID);
						}
						} 
					}
					setState(33);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(34);
				match(T__1);
				setState(35);
				expressao(0);
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(36);
						match(T__2);
						setState(37);
						expressao(0);
						}
						} 
					}
					setState(42);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new SeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__4);
				setState(45);
				booleano(0);
				setState(46);
				match(T__5);
				setState(47);
				comando();
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(48);
						match(T__6);
						setState(49);
						booleano(0);
						setState(50);
						match(T__5);
						setState(51);
						comando();
						}
						} 
					}
					setState(57);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(58);
				match(T__7);
				setState(59);
				comando();
				}
				break;
			case 5:
				_localctx = new EnquantoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				match(T__8);
				setState(62);
				booleano(0);
				setState(63);
				match(T__9);
				setState(64);
				comando();
				}
				break;
			case 6:
				_localctx = new ExibaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				match(T__10);
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXTO:
					{
					setState(67);
					match(TEXTO);
					}
					break;
				case T__23:
				case T__29:
				case INT:
				case ID:
					{
					setState(68);
					expressao(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				match(T__11);
				setState(72);
				expressao(0);
				}
				break;
			case 8:
				_localctx = new BlocoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				match(T__12);
				setState(74);
				seqComando();
				setState(75);
				match(T__13);
				}
				break;
			case 9:
				_localctx = new ParaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
				match(T__14);
				setState(78);
				match(ID);
				setState(79);
				match(T__15);
				setState(80);
				expressao(0);
				setState(81);
				match(T__16);
				setState(82);
				expressao(0);
				setState(83);
				match(T__9);
				setState(84);
				comando();
				}
				break;
			case 10:
				_localctx = new RepitaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				match(T__17);
				setState(87);
				expressao(0);
				setState(88);
				match(T__18);
				setState(89);
				comando();
				}
				break;
			case 11:
				_localctx = new EscolhaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(91);
				match(T__19);
				setState(92);
				match(ID);
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(93);
						match(T__20);
						setState(94);
						expressao(0);
						setState(95);
						match(T__21);
						setState(96);
						comando();
						}
						} 
					}
					setState(102);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(103);
				match(T__22);
				setState(104);
				match(T__21);
				setState(105);
				comando();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeiaContext extends ExpressaoContext {
		public LeiaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitLeia(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public InteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitInteiro(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpBinContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpBinContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpBin(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public IdContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParContext extends ExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpParContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExpPar(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				match(INT);
				}
				break;
			case T__23:
				{
				_localctx = new LeiaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(T__23);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(ID);
				}
				break;
			case T__29:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(T__29);
				setState(113);
				expressao(0);
				setState(114);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(118);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(119);
						match(T__24);
						setState(120);
						expressao(6);
						}
						break;
					case 2:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(121);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(122);
						match(T__25);
						setState(123);
						expressao(5);
						}
						break;
					case 3:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(124);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(125);
						match(T__26);
						setState(126);
						expressao(4);
						}
						break;
					case 4:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(127);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(128);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						expressao(3);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoContext extends ParserRuleContext {
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	 
		public BooleanoContext() { }
		public void copyFrom(BooleanoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XouLogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public XouLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterXouLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitXouLogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends BooleanoContext {
		public TerminalNode BOOLEANO() { return getToken(EnquantoParser.BOOLEANO, 0); }
		public BoolContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBool(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ELogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public ELogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterELogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitELogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NaoLogicoContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public NaoLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterNaoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitNaoLogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpRelContext extends BooleanoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpRelContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpRel(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolParContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BoolParContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBoolPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBoolPar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OuLogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public OuLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOuLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOuLogico(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		return booleano(0);
	}

	private BooleanoContext booleano(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanoContext _localctx = new BooleanoContext(_ctx, _parentState);
		BooleanoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_booleano, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(136);
				match(BOOLEANO);
				}
				break;
			case 2:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				expressao(0);
				setState(138);
				match(T__31);
				setState(139);
				expressao(0);
				}
				break;
			case 3:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				expressao(0);
				setState(142);
				match(T__32);
				setState(143);
				expressao(0);
				}
				break;
			case 4:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				expressao(0);
				setState(146);
				match(T__33);
				setState(147);
				expressao(0);
				}
				break;
			case 5:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				expressao(0);
				setState(150);
				match(T__34);
				setState(151);
				expressao(0);
				}
				break;
			case 6:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				expressao(0);
				setState(154);
				match(T__35);
				setState(155);
				expressao(0);
				}
				break;
			case 7:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				expressao(0);
				setState(158);
				match(T__36);
				setState(159);
				expressao(0);
				}
				break;
			case 8:
				{
				_localctx = new NaoLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(T__37);
				setState(162);
				booleano(5);
				}
				break;
			case 9:
				{
				_localctx = new BoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(T__29);
				setState(164);
				booleano(0);
				setState(165);
				match(T__30);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ELogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(169);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(170);
						match(T__38);
						setState(171);
						booleano(5);
						}
						break;
					case 2:
						{
						_localctx = new XouLogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(172);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(173);
						match(T__39);
						setState(174);
						booleano(4);
						}
						break;
					case 3:
						{
						_localctx = new OuLogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						match(T__40);
						setState(177);
						booleano(3);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 4:
			return booleano_sempred((BooleanoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleano_sempred(BooleanoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0013\b\u0001\n\u0001\f\u0001\u0016\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00026\b"+
		"\u0002\n\u0002\f\u00029\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002c\b\u0002\n\u0002\f\u0002f\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002k\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003u\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u0083\b\u0003\n\u0003\f\u0003\u0086\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00a8\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00b3\b\u0004\n\u0004\f\u0004\u00b6\t\u0004\u0001"+
		"\u0004\u0004\u001f(7d\u0002\u0006\b\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0001\u0001\u0000\u001c\u001d\u00d4\u0000\n\u0001\u0000\u0000\u0000\u0002"+
		"\r\u0001\u0000\u0000\u0000\u0004j\u0001\u0000\u0000\u0000\u0006t\u0001"+
		"\u0000\u0000\u0000\b\u00a7\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002"+
		"\u0001\u0000\u000b\f\u0005\u0001\u0000\u0000\f\u0001\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e\u0014\u0005\u0001\u0000\u0000"+
		"\u000f\u0010\u0003\u0004\u0002\u0000\u0010\u0011\u0005\u0001\u0000\u0000"+
		"\u0011\u0013\u0001\u0000\u0000\u0000\u0012\u000f\u0001\u0000\u0000\u0000"+
		"\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0003\u0001\u0000\u0000\u0000"+
		"\u0016\u0014\u0001\u0000\u0000\u0000\u0017\u0018\u0005,\u0000\u0000\u0018"+
		"\u0019\u0005\u0002\u0000\u0000\u0019k\u0003\u0006\u0003\u0000\u001a\u001f"+
		"\u0005,\u0000\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c\u001e\u0005"+
		",\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0002"+
		"\u0000\u0000#(\u0003\u0006\u0003\u0000$%\u0005\u0003\u0000\u0000%\'\u0003"+
		"\u0006\u0003\u0000&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)k\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+k\u0005\u0004\u0000\u0000,-\u0005\u0005"+
		"\u0000\u0000-.\u0003\b\u0004\u0000./\u0005\u0006\u0000\u0000/7\u0003\u0004"+
		"\u0002\u000001\u0005\u0007\u0000\u000012\u0003\b\u0004\u000023\u0005\u0006"+
		"\u0000\u000034\u0003\u0004\u0002\u000046\u0001\u0000\u0000\u000050\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:;\u0005\b\u0000\u0000;<\u0003\u0004\u0002\u0000<k\u0001\u0000\u0000"+
		"\u0000=>\u0005\t\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005\n\u0000\u0000"+
		"@A\u0003\u0004\u0002\u0000Ak\u0001\u0000\u0000\u0000BE\u0005\u000b\u0000"+
		"\u0000CF\u0005-\u0000\u0000DF\u0003\u0006\u0003\u0000EC\u0001\u0000\u0000"+
		"\u0000ED\u0001\u0000\u0000\u0000Fk\u0001\u0000\u0000\u0000GH\u0005\f\u0000"+
		"\u0000Hk\u0003\u0006\u0003\u0000IJ\u0005\r\u0000\u0000JK\u0003\u0002\u0001"+
		"\u0000KL\u0005\u000e\u0000\u0000Lk\u0001\u0000\u0000\u0000MN\u0005\u000f"+
		"\u0000\u0000NO\u0005,\u0000\u0000OP\u0005\u0010\u0000\u0000PQ\u0003\u0006"+
		"\u0003\u0000QR\u0005\u0011\u0000\u0000RS\u0003\u0006\u0003\u0000ST\u0005"+
		"\n\u0000\u0000TU\u0003\u0004\u0002\u0000Uk\u0001\u0000\u0000\u0000VW\u0005"+
		"\u0012\u0000\u0000WX\u0003\u0006\u0003\u0000XY\u0005\u0013\u0000\u0000"+
		"YZ\u0003\u0004\u0002\u0000Zk\u0001\u0000\u0000\u0000[\\\u0005\u0014\u0000"+
		"\u0000\\d\u0005,\u0000\u0000]^\u0005\u0015\u0000\u0000^_\u0003\u0006\u0003"+
		"\u0000_`\u0005\u0016\u0000\u0000`a\u0003\u0004\u0002\u0000ac\u0001\u0000"+
		"\u0000\u0000b]\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000gh\u0005\u0017\u0000\u0000hi\u0005\u0016\u0000"+
		"\u0000ik\u0003\u0004\u0002\u0000j\u0017\u0001\u0000\u0000\u0000j\u001a"+
		"\u0001\u0000\u0000\u0000j+\u0001\u0000\u0000\u0000j,\u0001\u0000\u0000"+
		"\u0000j=\u0001\u0000\u0000\u0000jB\u0001\u0000\u0000\u0000jG\u0001\u0000"+
		"\u0000\u0000jI\u0001\u0000\u0000\u0000jM\u0001\u0000\u0000\u0000jV\u0001"+
		"\u0000\u0000\u0000j[\u0001\u0000\u0000\u0000k\u0005\u0001\u0000\u0000"+
		"\u0000lm\u0006\u0003\uffff\uffff\u0000mu\u0005+\u0000\u0000nu\u0005\u0018"+
		"\u0000\u0000ou\u0005,\u0000\u0000pq\u0005\u001e\u0000\u0000qr\u0003\u0006"+
		"\u0003\u0000rs\u0005\u001f\u0000\u0000su\u0001\u0000\u0000\u0000tl\u0001"+
		"\u0000\u0000\u0000tn\u0001\u0000\u0000\u0000to\u0001\u0000\u0000\u0000"+
		"tp\u0001\u0000\u0000\u0000u\u0084\u0001\u0000\u0000\u0000vw\n\u0005\u0000"+
		"\u0000wx\u0005\u0019\u0000\u0000x\u0083\u0003\u0006\u0003\u0006yz\n\u0004"+
		"\u0000\u0000z{\u0005\u001a\u0000\u0000{\u0083\u0003\u0006\u0003\u0005"+
		"|}\n\u0003\u0000\u0000}~\u0005\u001b\u0000\u0000~\u0083\u0003\u0006\u0003"+
		"\u0004\u007f\u0080\n\u0002\u0000\u0000\u0080\u0081\u0007\u0000\u0000\u0000"+
		"\u0081\u0083\u0003\u0006\u0003\u0003\u0082v\u0001\u0000\u0000\u0000\u0082"+
		"y\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082\u007f\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0007\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0006"+
		"\u0004\uffff\uffff\u0000\u0088\u00a8\u0005*\u0000\u0000\u0089\u008a\u0003"+
		"\u0006\u0003\u0000\u008a\u008b\u0005 \u0000\u0000\u008b\u008c\u0003\u0006"+
		"\u0003\u0000\u008c\u00a8\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u0006"+
		"\u0003\u0000\u008e\u008f\u0005!\u0000\u0000\u008f\u0090\u0003\u0006\u0003"+
		"\u0000\u0090\u00a8\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u0006\u0003"+
		"\u0000\u0092\u0093\u0005\"\u0000\u0000\u0093\u0094\u0003\u0006\u0003\u0000"+
		"\u0094\u00a8\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0006\u0003\u0000"+
		"\u0096\u0097\u0005#\u0000\u0000\u0097\u0098\u0003\u0006\u0003\u0000\u0098"+
		"\u00a8\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0006\u0003\u0000\u009a"+
		"\u009b\u0005$\u0000\u0000\u009b\u009c\u0003\u0006\u0003\u0000\u009c\u00a8"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u0006\u0003\u0000\u009e\u009f"+
		"\u0005%\u0000\u0000\u009f\u00a0\u0003\u0006\u0003\u0000\u00a0\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005&\u0000\u0000\u00a2\u00a8\u0003\b"+
		"\u0004\u0005\u00a3\u00a4\u0005\u001e\u0000\u0000\u00a4\u00a5\u0003\b\u0004"+
		"\u0000\u00a5\u00a6\u0005\u001f\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a7\u0087\u0001\u0000\u0000\u0000\u00a7\u0089\u0001\u0000\u0000"+
		"\u0000\u00a7\u008d\u0001\u0000\u0000\u0000\u00a7\u0091\u0001\u0000\u0000"+
		"\u0000\u00a7\u0095\u0001\u0000\u0000\u0000\u00a7\u0099\u0001\u0000\u0000"+
		"\u0000\u00a7\u009d\u0001\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a8\u00b4\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\n\u0004\u0000\u0000\u00aa\u00ab\u0005\'\u0000\u0000"+
		"\u00ab\u00b3\u0003\b\u0004\u0005\u00ac\u00ad\n\u0003\u0000\u0000\u00ad"+
		"\u00ae\u0005(\u0000\u0000\u00ae\u00b3\u0003\b\u0004\u0004\u00af\u00b0"+
		"\n\u0002\u0000\u0000\u00b0\u00b1\u0005)\u0000\u0000\u00b1\u00b3\u0003"+
		"\b\u0004\u0003\u00b2\u00a9\u0001\u0000\u0000\u0000\u00b2\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\t\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\r\u0014\u001f(7Edjt\u0082\u0084\u00a7\u00b2\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}