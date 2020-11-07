// Generated from /home/labra/src/shapes/shapeMaps/modules/shapeMaps/src/main/antlr4/ShapeMap.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShapeMapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		KW_START=18, KW_FOCUS=19, KW_SPARQL=20, KW_NOT=21, KW_TRUE=22, KW_FALSE=23, 
		AT_START=24, BACKQUOTE=25, PASS=26, COMMENT=27, CODE=28, RDF_TYPE=29, 
		IRIREF=30, PNAME_NS=31, PNAME_LN=32, ATPNAME_NS=33, ATPNAME_LN=34, BLANK_NODE_LABEL=35, 
		LANGTAG=36, INTEGER=37, DECIMAL=38, DOUBLE=39, STRING_LITERAL1=40, STRING_LITERAL2=41, 
		STRING_LITERAL_LONG1=42, STRING_LITERAL_LONG2=43;
	public static final int
		RULE_shapeMap = 0, RULE_pair = 1, RULE_statusAndShape = 2, RULE_nodeSelector = 3, 
		RULE_shapeSelector = 4, RULE_extended = 5, RULE_subjectTerm = 6, RULE_objectTerm = 7, 
		RULE_triplePattern = 8, RULE_status = 9, RULE_reason = 10, RULE_jsonAttributes = 11, 
		RULE_path = 12, RULE_pathAlternative = 13, RULE_pathSequence = 14, RULE_pathEltOrInverse = 15, 
		RULE_inverse = 16, RULE_pathElt = 17, RULE_pathPrimary = 18, RULE_pathMod = 19, 
		RULE_literal = 20, RULE_predicate = 21, RULE_rdfType = 22, RULE_datatype = 23, 
		RULE_negation = 24, RULE_questionMark = 25, RULE_numericLiteral = 26, 
		RULE_rdfLiteral = 27, RULE_booleanLiteral = 28, RULE_string = 29, RULE_nodeIri = 30, 
		RULE_shapeIri = 31, RULE_prefixedName = 32, RULE_blankNode = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"shapeMap", "pair", "statusAndShape", "nodeSelector", "shapeSelector", 
			"extended", "subjectTerm", "objectTerm", "triplePattern", "status", "reason", 
			"jsonAttributes", "path", "pathAlternative", "pathSequence", "pathEltOrInverse", 
			"inverse", "pathElt", "pathPrimary", "pathMod", "literal", "predicate", 
			"rdfType", "datatype", "negation", "questionMark", "numericLiteral", 
			"rdfLiteral", "booleanLiteral", "string", "nodeIri", "shapeIri", "prefixedName", 
			"blankNode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'@'", "'{'", "'_'", "'}'", "'//'", "'$'", "'|'", "'/'", 
			"'^'", "'('", "')'", "'*'", "'?'", "'+'", "'!'", "'^^'", null, null, 
			null, null, "'true'", "'false'", null, "'`'", null, null, null, "'a'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "KW_START", "KW_FOCUS", "KW_SPARQL", 
			"KW_NOT", "KW_TRUE", "KW_FALSE", "AT_START", "BACKQUOTE", "PASS", "COMMENT", 
			"CODE", "RDF_TYPE", "IRIREF", "PNAME_NS", "PNAME_LN", "ATPNAME_NS", "ATPNAME_LN", 
			"BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "STRING_LITERAL1", 
			"STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2"
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
	public String getGrammarFileName() { return "ShapeMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShapeMapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ShapeMapContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ShapeMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeMap; }
	}

	public final ShapeMapContext shapeMap() throws RecognitionException {
		ShapeMapContext _localctx = new ShapeMapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_shapeMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			pair();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(69);
				match(T__0);
				setState(70);
				pair();
				}
				}
				setState(75);
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

	public static class PairContext extends ParserRuleContext {
		public NodeSelectorContext nodeSelector() {
			return getRuleContext(NodeSelectorContext.class,0);
		}
		public StatusAndShapeContext statusAndShape() {
			return getRuleContext(StatusAndShapeContext.class,0);
		}
		public ReasonContext reason() {
			return getRuleContext(ReasonContext.class,0);
		}
		public JsonAttributesContext jsonAttributes() {
			return getRuleContext(JsonAttributesContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			nodeSelector();
			setState(77);
			statusAndShape();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(78);
				reason();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(81);
				jsonAttributes();
				}
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

	public static class StatusAndShapeContext extends ParserRuleContext {
		public ShapeSelectorContext shapeSelector() {
			return getRuleContext(ShapeSelectorContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public TerminalNode AT_START() { return getToken(ShapeMapParser.AT_START, 0); }
		public TerminalNode ATPNAME_NS() { return getToken(ShapeMapParser.ATPNAME_NS, 0); }
		public TerminalNode ATPNAME_LN() { return getToken(ShapeMapParser.ATPNAME_LN, 0); }
		public StatusAndShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusAndShape; }
	}

	public final StatusAndShapeContext statusAndShape() throws RecognitionException {
		StatusAndShapeContext _localctx = new StatusAndShapeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statusAndShape);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__1);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << KW_NOT))) != 0)) {
					{
					setState(85);
					status();
					}
				}

				setState(88);
				shapeSelector();
				}
				break;
			case AT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(AT_START);
				}
				break;
			case ATPNAME_NS:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(ATPNAME_NS);
				}
				break;
			case ATPNAME_LN:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(ATPNAME_LN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NodeSelectorContext extends ParserRuleContext {
		public ObjectTermContext objectTerm() {
			return getRuleContext(ObjectTermContext.class,0);
		}
		public TriplePatternContext triplePattern() {
			return getRuleContext(TriplePatternContext.class,0);
		}
		public ExtendedContext extended() {
			return getRuleContext(ExtendedContext.class,0);
		}
		public NodeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeSelector; }
	}

	public final NodeSelectorContext nodeSelector() throws RecognitionException {
		NodeSelectorContext _localctx = new NodeSelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nodeSelector);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				objectTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				triplePattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				extended();
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

	public static class ShapeSelectorContext extends ParserRuleContext {
		public ShapeIriContext shapeIri() {
			return getRuleContext(ShapeIriContext.class,0);
		}
		public TerminalNode KW_START() { return getToken(ShapeMapParser.KW_START, 0); }
		public ShapeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeSelector; }
	}

	public final ShapeSelectorContext shapeSelector() throws RecognitionException {
		ShapeSelectorContext _localctx = new ShapeSelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shapeSelector);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				shapeIri();
				}
				break;
			case KW_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(KW_START);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExtendedContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode KW_SPARQL() { return getToken(ShapeMapParser.KW_SPARQL, 0); }
		public NodeIriContext nodeIri() {
			return getRuleContext(NodeIriContext.class,0);
		}
		public ExtendedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended; }
	}

	public final ExtendedContext extended() throws RecognitionException {
		ExtendedContext _localctx = new ExtendedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extended);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SPARQL:
				{
				setState(103);
				match(KW_SPARQL);
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				{
				setState(104);
				nodeIri();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
			string();
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

	public static class SubjectTermContext extends ParserRuleContext {
		public NodeIriContext nodeIri() {
			return getRuleContext(NodeIriContext.class,0);
		}
		public RdfTypeContext rdfType() {
			return getRuleContext(RdfTypeContext.class,0);
		}
		public SubjectTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjectTerm; }
	}

	public final SubjectTermContext subjectTerm() throws RecognitionException {
		SubjectTermContext _localctx = new SubjectTermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subjectTerm);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				nodeIri();
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				rdfType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ObjectTermContext extends ParserRuleContext {
		public SubjectTermContext subjectTerm() {
			return getRuleContext(SubjectTermContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTerm; }
	}

	public final ObjectTermContext objectTerm() throws RecognitionException {
		ObjectTermContext _localctx = new ObjectTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objectTerm);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RDF_TYPE:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				subjectTerm();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TriplePatternContext extends ParserRuleContext {
		public TriplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplePattern; }
	 
		public TriplePatternContext() { }
		public void copyFrom(TriplePatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FocusSubjectContext extends TriplePatternContext {
		public TerminalNode KW_FOCUS() { return getToken(ShapeMapParser.KW_FOCUS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ObjectTermContext objectTerm() {
			return getRuleContext(ObjectTermContext.class,0);
		}
		public FocusSubjectContext(TriplePatternContext ctx) { copyFrom(ctx); }
	}
	public static class FocusObjectContext extends TriplePatternContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode KW_FOCUS() { return getToken(ShapeMapParser.KW_FOCUS, 0); }
		public SubjectTermContext subjectTerm() {
			return getRuleContext(SubjectTermContext.class,0);
		}
		public FocusObjectContext(TriplePatternContext ctx) { copyFrom(ctx); }
	}

	public final TriplePatternContext triplePattern() throws RecognitionException {
		TriplePatternContext _localctx = new TriplePatternContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_triplePattern);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new FocusSubjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__2);
				setState(118);
				match(KW_FOCUS);
				setState(119);
				path();
				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_TRUE:
				case KW_FALSE:
				case RDF_TYPE:
				case IRIREF:
				case PNAME_NS:
				case PNAME_LN:
				case INTEGER:
				case DECIMAL:
				case DOUBLE:
				case STRING_LITERAL1:
				case STRING_LITERAL2:
				case STRING_LITERAL_LONG1:
				case STRING_LITERAL_LONG2:
					{
					setState(120);
					objectTerm();
					}
					break;
				case T__3:
					{
					setState(121);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(124);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new FocusObjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__2);
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RDF_TYPE:
				case IRIREF:
				case PNAME_NS:
				case PNAME_LN:
					{
					setState(127);
					subjectTerm();
					}
					break;
				case T__3:
					{
					setState(128);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131);
				path();
				setState(132);
				match(KW_FOCUS);
				setState(133);
				match(T__4);
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

	public static class StatusContext extends ParserRuleContext {
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public QuestionMarkContext questionMark() {
			return getRuleContext(QuestionMarkContext.class,0);
		}
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_status);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case KW_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				negation();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				questionMark();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ReasonContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ReasonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reason; }
	}

	public final ReasonContext reason() throws RecognitionException {
		ReasonContext _localctx = new ReasonContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_reason);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__5);
			setState(142);
			string();
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

	public static class JsonAttributesContext extends ParserRuleContext {
		public JsonAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonAttributes; }
	}

	public final JsonAttributesContext jsonAttributes() throws RecognitionException {
		JsonAttributesContext _localctx = new JsonAttributesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jsonAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__6);
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

	public static class PathContext extends ParserRuleContext {
		public PathAlternativeContext pathAlternative() {
			return getRuleContext(PathAlternativeContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			pathAlternative();
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

	public static class PathAlternativeContext extends ParserRuleContext {
		public List<PathSequenceContext> pathSequence() {
			return getRuleContexts(PathSequenceContext.class);
		}
		public PathSequenceContext pathSequence(int i) {
			return getRuleContext(PathSequenceContext.class,i);
		}
		public PathAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathAlternative; }
	}

	public final PathAlternativeContext pathAlternative() throws RecognitionException {
		PathAlternativeContext _localctx = new PathAlternativeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pathAlternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			pathSequence();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(149);
				match(T__7);
				setState(150);
				pathSequence();
				}
				}
				setState(155);
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

	public static class PathSequenceContext extends ParserRuleContext {
		public List<PathEltOrInverseContext> pathEltOrInverse() {
			return getRuleContexts(PathEltOrInverseContext.class);
		}
		public PathEltOrInverseContext pathEltOrInverse(int i) {
			return getRuleContext(PathEltOrInverseContext.class,i);
		}
		public PathSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathSequence; }
	}

	public final PathSequenceContext pathSequence() throws RecognitionException {
		PathSequenceContext _localctx = new PathSequenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pathSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			pathEltOrInverse();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(157);
				match(T__8);
				setState(158);
				pathEltOrInverse();
				}
				}
				setState(163);
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

	public static class PathEltOrInverseContext extends ParserRuleContext {
		public PathEltContext pathElt() {
			return getRuleContext(PathEltContext.class,0);
		}
		public InverseContext inverse() {
			return getRuleContext(InverseContext.class,0);
		}
		public PathEltOrInverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathEltOrInverse; }
	}

	public final PathEltOrInverseContext pathEltOrInverse() throws RecognitionException {
		PathEltOrInverseContext _localctx = new PathEltOrInverseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pathEltOrInverse);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case RDF_TYPE:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				pathElt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				inverse();
				setState(166);
				pathElt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InverseContext extends ParserRuleContext {
		public InverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inverse; }
	}

	public final InverseContext inverse() throws RecognitionException {
		InverseContext _localctx = new InverseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__9);
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

	public static class PathEltContext extends ParserRuleContext {
		public PathPrimaryContext pathPrimary() {
			return getRuleContext(PathPrimaryContext.class,0);
		}
		public PathModContext pathMod() {
			return getRuleContext(PathModContext.class,0);
		}
		public PathEltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathElt; }
	}

	public final PathEltContext pathElt() throws RecognitionException {
		PathEltContext _localctx = new PathEltContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pathElt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			pathPrimary();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(173);
				pathMod();
				}
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

	public static class PathPrimaryContext extends ParserRuleContext {
		public NodeIriContext nodeIri() {
			return getRuleContext(NodeIriContext.class,0);
		}
		public RdfTypeContext rdfType() {
			return getRuleContext(RdfTypeContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PathPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPrimary; }
	}

	public final PathPrimaryContext pathPrimary() throws RecognitionException {
		PathPrimaryContext _localctx = new PathPrimaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pathPrimary);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				nodeIri();
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				rdfType();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(T__10);
				setState(179);
				path();
				setState(180);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PathModContext extends ParserRuleContext {
		public PathModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathMod; }
	 
		public PathModContext() { }
		public void copyFrom(PathModContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarContext extends PathModContext {
		public StarContext(PathModContext ctx) { copyFrom(ctx); }
	}
	public static class OptionalContext extends PathModContext {
		public OptionalContext(PathModContext ctx) { copyFrom(ctx); }
	}
	public static class PlusContext extends PathModContext {
		public PlusContext(PathModContext ctx) { copyFrom(ctx); }
	}

	public final PathModContext pathMod() throws RecognitionException {
		PathModContext _localctx = new PathModContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pathMod);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new StarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new OptionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				rdfLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				numericLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				booleanLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PredicateContext extends ParserRuleContext {
		public NodeIriContext nodeIri() {
			return getRuleContext(NodeIriContext.class,0);
		}
		public RdfTypeContext rdfType() {
			return getRuleContext(RdfTypeContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_predicate);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				nodeIri();
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				rdfType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RdfTypeContext extends ParserRuleContext {
		public TerminalNode RDF_TYPE() { return getToken(ShapeMapParser.RDF_TYPE, 0); }
		public RdfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfType; }
	}

	public final RdfTypeContext rdfType() throws RecognitionException {
		RdfTypeContext _localctx = new RdfTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rdfType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(RDF_TYPE);
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

	public static class DatatypeContext extends ParserRuleContext {
		public NodeIriContext nodeIri() {
			return getRuleContext(NodeIriContext.class,0);
		}
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			nodeIri();
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

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode KW_NOT() { return getToken(ShapeMapParser.KW_NOT, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_negation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==KW_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class QuestionMarkContext extends ParserRuleContext {
		public QuestionMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionMark; }
	}

	public final QuestionMarkContext questionMark() throws RecognitionException {
		QuestionMarkContext _localctx = new QuestionMarkContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_questionMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__13);
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ShapeMapParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(ShapeMapParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(ShapeMapParser.DOUBLE, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RdfLiteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rdfLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			string();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(209);
				match(T__16);
				setState(210);
				datatype();
				}
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(ShapeMapParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(ShapeMapParser.KW_FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_LONG1() { return getToken(ShapeMapParser.STRING_LITERAL_LONG1, 0); }
		public TerminalNode STRING_LITERAL_LONG2() { return getToken(ShapeMapParser.STRING_LITERAL_LONG2, 0); }
		public TerminalNode STRING_LITERAL1() { return getToken(ShapeMapParser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(ShapeMapParser.STRING_LITERAL2, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NodeIriContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(ShapeMapParser.IRIREF, 0); }
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
		public NodeIriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeIri; }
	}

	public final NodeIriContext nodeIri() throws RecognitionException {
		NodeIriContext _localctx = new NodeIriContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nodeIri);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				prefixedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ShapeIriContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(ShapeMapParser.IRIREF, 0); }
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
		public ShapeIriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeIri; }
	}

	public final ShapeIriContext shapeIri() throws RecognitionException {
		ShapeIriContext _localctx = new ShapeIriContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_shapeIri);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				prefixedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrefixedNameContext extends ParserRuleContext {
		public TerminalNode PNAME_LN() { return getToken(ShapeMapParser.PNAME_LN, 0); }
		public TerminalNode PNAME_NS() { return getToken(ShapeMapParser.PNAME_NS, 0); }
		public PrefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedName; }
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==PNAME_NS || _la==PNAME_LN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BlankNodeContext extends ParserRuleContext {
		public TerminalNode BLANK_NODE_LABEL() { return getToken(ShapeMapParser.BLANK_NODE_LABEL, 0); }
		public BlankNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNode; }
	}

	public final BlankNodeContext blankNode() throws RecognitionException {
		BlankNodeContext _localctx = new BlankNodeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blankNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(BLANK_NODE_LABEL);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\3\3\3\3\3\5\3"+
		"R\n\3\3\3\5\3U\n\3\3\4\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3"+
		"\5\5\5d\n\5\3\6\3\6\5\6h\n\6\3\7\3\7\5\7l\n\7\3\7\3\7\3\b\3\b\5\br\n\b"+
		"\3\t\3\t\5\tv\n\t\3\n\3\n\3\n\3\n\3\n\5\n}\n\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0084\n\n\3\n\3\n\3\n\3\n\5\n\u008a\n\n\3\13\3\13\5\13\u008e\n\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17\u009a\n\17\f\17\16\17\u009d"+
		"\13\17\3\20\3\20\3\20\7\20\u00a2\n\20\f\20\16\20\u00a5\13\20\3\21\3\21"+
		"\3\21\3\21\5\21\u00ab\n\21\3\22\3\22\3\23\3\23\5\23\u00b1\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00b9\n\24\3\25\3\25\3\25\5\25\u00be\n\25"+
		"\3\26\3\26\3\26\5\26\u00c3\n\26\3\27\3\27\5\27\u00c7\n\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\5\35\u00d6\n\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \5 \u00de\n \3!\3!\5!\u00e2\n!\3\"\3\"\3#\3"+
		"#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BD\2\7\4\2\22\22\27\27\3\2\')\3\2\30\31\3\2*-\3\2!\"\2\u00e4\2F\3"+
		"\2\2\2\4N\3\2\2\2\6^\3\2\2\2\bc\3\2\2\2\ng\3\2\2\2\fk\3\2\2\2\16q\3\2"+
		"\2\2\20u\3\2\2\2\22\u0089\3\2\2\2\24\u008d\3\2\2\2\26\u008f\3\2\2\2\30"+
		"\u0092\3\2\2\2\32\u0094\3\2\2\2\34\u0096\3\2\2\2\36\u009e\3\2\2\2 \u00aa"+
		"\3\2\2\2\"\u00ac\3\2\2\2$\u00ae\3\2\2\2&\u00b8\3\2\2\2(\u00bd\3\2\2\2"+
		"*\u00c2\3\2\2\2,\u00c6\3\2\2\2.\u00c8\3\2\2\2\60\u00ca\3\2\2\2\62\u00cc"+
		"\3\2\2\2\64\u00ce\3\2\2\2\66\u00d0\3\2\2\28\u00d2\3\2\2\2:\u00d7\3\2\2"+
		"\2<\u00d9\3\2\2\2>\u00dd\3\2\2\2@\u00e1\3\2\2\2B\u00e3\3\2\2\2D\u00e5"+
		"\3\2\2\2FK\5\4\3\2GH\7\3\2\2HJ\5\4\3\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2K"+
		"L\3\2\2\2L\3\3\2\2\2MK\3\2\2\2NO\5\b\5\2OQ\5\6\4\2PR\5\26\f\2QP\3\2\2"+
		"\2QR\3\2\2\2RT\3\2\2\2SU\5\30\r\2TS\3\2\2\2TU\3\2\2\2U\5\3\2\2\2VX\7\4"+
		"\2\2WY\5\24\13\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z_\5\n\6\2[_\7\32\2\2\\"+
		"_\7#\2\2]_\7$\2\2^V\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\7\3\2\2\2"+
		"`d\5\20\t\2ad\5\22\n\2bd\5\f\7\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\t\3\2"+
		"\2\2eh\5@!\2fh\7\24\2\2ge\3\2\2\2gf\3\2\2\2h\13\3\2\2\2il\7\26\2\2jl\5"+
		"> \2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mn\5<\37\2n\r\3\2\2\2or\5> \2pr\5.\30"+
		"\2qo\3\2\2\2qp\3\2\2\2r\17\3\2\2\2sv\5\16\b\2tv\5*\26\2us\3\2\2\2ut\3"+
		"\2\2\2v\21\3\2\2\2wx\7\5\2\2xy\7\25\2\2y|\5\32\16\2z}\5\20\t\2{}\7\6\2"+
		"\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2\2~\177\7\7\2\2\177\u008a\3\2\2\2\u0080"+
		"\u0083\7\5\2\2\u0081\u0084\5\16\b\2\u0082\u0084\7\6\2\2\u0083\u0081\3"+
		"\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\32\16\2\u0086"+
		"\u0087\7\25\2\2\u0087\u0088\7\7\2\2\u0088\u008a\3\2\2\2\u0089w\3\2\2\2"+
		"\u0089\u0080\3\2\2\2\u008a\23\3\2\2\2\u008b\u008e\5\62\32\2\u008c\u008e"+
		"\5\64\33\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\25\3\2\2\2\u008f"+
		"\u0090\7\b\2\2\u0090\u0091\5<\37\2\u0091\27\3\2\2\2\u0092\u0093\7\t\2"+
		"\2\u0093\31\3\2\2\2\u0094\u0095\5\34\17\2\u0095\33\3\2\2\2\u0096\u009b"+
		"\5\36\20\2\u0097\u0098\7\n\2\2\u0098\u009a\5\36\20\2\u0099\u0097\3\2\2"+
		"\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\35"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a3\5 \21\2\u009f\u00a0\7\13\2\2"+
		"\u00a0\u00a2\5 \21\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\37\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00ab\5$\23\2\u00a7\u00a8\5\"\22\2\u00a8\u00a9\5$\23\2\u00a9\u00ab\3"+
		"\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab!\3\2\2\2\u00ac\u00ad"+
		"\7\f\2\2\u00ad#\3\2\2\2\u00ae\u00b0\5&\24\2\u00af\u00b1\5(\25\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1%\3\2\2\2\u00b2\u00b9\5> \2\u00b3"+
		"\u00b9\5.\30\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6\5\32\16\2\u00b6\u00b7\7"+
		"\16\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8"+
		"\u00b4\3\2\2\2\u00b9\'\3\2\2\2\u00ba\u00be\7\17\2\2\u00bb\u00be\7\20\2"+
		"\2\u00bc\u00be\7\21\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be)\3\2\2\2\u00bf\u00c3\58\35\2\u00c0\u00c3\5\66\34"+
		"\2\u00c1\u00c3\5:\36\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3+\3\2\2\2\u00c4\u00c7\5> \2\u00c5\u00c7\5.\30\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7-\3\2\2\2\u00c8\u00c9\7\37\2\2\u00c9"+
		"/\3\2\2\2\u00ca\u00cb\5> \2\u00cb\61\3\2\2\2\u00cc\u00cd\t\2\2\2\u00cd"+
		"\63\3\2\2\2\u00ce\u00cf\7\20\2\2\u00cf\65\3\2\2\2\u00d0\u00d1\t\3\2\2"+
		"\u00d1\67\3\2\2\2\u00d2\u00d5\5<\37\2\u00d3\u00d4\7\23\2\2\u00d4\u00d6"+
		"\5\60\31\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d69\3\2\2\2\u00d7"+
		"\u00d8\t\4\2\2\u00d8;\3\2\2\2\u00d9\u00da\t\5\2\2\u00da=\3\2\2\2\u00db"+
		"\u00de\7 \2\2\u00dc\u00de\5B\"\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2"+
		"\2\u00de?\3\2\2\2\u00df\u00e2\7 \2\2\u00e0\u00e2\5B\"\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e0\3\2\2\2\u00e2A\3\2\2\2\u00e3\u00e4\t\6\2\2\u00e4C\3"+
		"\2\2\2\u00e5\u00e6\7%\2\2\u00e6E\3\2\2\2\33KQTX^cgkqu|\u0083\u0089\u008d"+
		"\u009b\u00a3\u00aa\u00b0\u00b8\u00bd\u00c2\u00c6\u00d5\u00dd\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}