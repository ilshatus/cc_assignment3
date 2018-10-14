package golang;// Generated from Golang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GolangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, IDENTIFIER=62, KEYWORD=63, BINARY_OP=64, INT_LIT=65, 
		FLOAT_LIT=66, IMAGINARY_LIT=67, RUNE_LIT=68, LITTLE_U_VALUE=69, BIG_U_VALUE=70, 
		STRING_LIT=71, WS=72, COMMENT=73, TERMINATOR=74, LINE_COMMENT=75;
	public static final int
		RULE_sourceFile = 0, RULE_packageClause = 1, RULE_importDecl = 2, RULE_importSpec = 3, 
		RULE_importPath = 4, RULE_topLevelDecl = 5, RULE_declaration = 6, RULE_constDecl = 7, 
		RULE_constSpec = 8, RULE_identifierList = 9, RULE_expressionList = 10, 
		RULE_typeDecl = 11, RULE_typeSpec = 12, RULE_functionDecl = 13, RULE_function = 14, 
		RULE_methodDecl = 15, RULE_receiver = 16, RULE_varDecl = 17, RULE_varSpec = 18, 
		RULE_block = 19, RULE_statementList = 20, RULE_statement = 21, RULE_simpleStmt = 22, 
		RULE_expressionStmt = 23, RULE_sendStmt = 24, RULE_incDecStmt = 25, RULE_assignment = 26, 
		RULE_assign_op = 27, RULE_shortVarDecl = 28, RULE_emptyStmt = 29, RULE_labeledStmt = 30, 
		RULE_returnStmt = 31, RULE_breakStmt = 32, RULE_continueStmt = 33, RULE_gotoStmt = 34, 
		RULE_fallthroughStmt = 35, RULE_deferStmt = 36, RULE_ifStmt = 37, RULE_switchStmt = 38, 
		RULE_exprSwitchStmt = 39, RULE_exprCaseClause = 40, RULE_exprSwitchCase = 41, 
		RULE_typeSwitchStmt = 42, RULE_typeSwitchGuard = 43, RULE_typeCaseClause = 44, 
		RULE_typeSwitchCase = 45, RULE_typeList = 46, RULE_selectStmt = 47, RULE_commClause = 48, 
		RULE_commCase = 49, RULE_recvStmt = 50, RULE_forStmt = 51, RULE_forClause = 52, 
		RULE_rangeClause = 53, RULE_goStmt = 54, RULE_type = 55, RULE_typeName = 56, 
		RULE_typeLit = 57, RULE_arrayType = 58, RULE_arrayLength = 59, RULE_elementType = 60, 
		RULE_pointerType = 61, RULE_interfaceType = 62, RULE_sliceType = 63, RULE_mapType = 64, 
		RULE_channelType = 65, RULE_methodSpec = 66, RULE_functionType = 67, RULE_signature = 68, 
		RULE_result = 69, RULE_parameters = 70, RULE_parameterList = 71, RULE_parameterDecl = 72, 
		RULE_operand = 73, RULE_literal = 74, RULE_basicLit = 75, RULE_operandName = 76, 
		RULE_qualifiedIdent = 77, RULE_compositeLit = 78, RULE_literalType = 79, 
		RULE_literalValue = 80, RULE_elementList = 81, RULE_keyedElement = 82, 
		RULE_key = 83, RULE_element = 84, RULE_structType = 85, RULE_fieldDecl = 86, 
		RULE_anonymousField = 87, RULE_functionLit = 88, RULE_primaryExpr = 89, 
		RULE_selector = 90, RULE_index = 91, RULE_slice = 92, RULE_typeAssertion = 93, 
		RULE_arguments = 94, RULE_methodExpr = 95, RULE_receiverType = 96, RULE_expression = 97, 
		RULE_unaryExpr = 98, RULE_conversion = 99, RULE_eos = 100;
	public static final String[] ruleNames = {
		"sourceFile", "packageClause", "importDecl", "importSpec", "importPath", 
		"topLevelDecl", "declaration", "constDecl", "constSpec", "identifierList", 
		"expressionList", "typeDecl", "typeSpec", "functionDecl", "function", 
		"methodDecl", "receiver", "varDecl", "varSpec", "block", "statementList", 
		"statement", "simpleStmt", "expressionStmt", "sendStmt", "incDecStmt", 
		"assignment", "assign_op", "shortVarDecl", "emptyStmt", "labeledStmt", 
		"returnStmt", "breakStmt", "continueStmt", "gotoStmt", "fallthroughStmt", 
		"deferStmt", "ifStmt", "switchStmt", "exprSwitchStmt", "exprCaseClause", 
		"exprSwitchCase", "typeSwitchStmt", "typeSwitchGuard", "typeCaseClause", 
		"typeSwitchCase", "typeList", "selectStmt", "commClause", "commCase", 
		"recvStmt", "forStmt", "forClause", "rangeClause", "goStmt", "type", "typeName", 
		"typeLit", "arrayType", "arrayLength", "elementType", "pointerType", "interfaceType", 
		"sliceType", "mapType", "channelType", "methodSpec", "functionType", "signature", 
		"result", "parameters", "parameterList", "parameterDecl", "operand", "literal", 
		"basicLit", "operandName", "qualifiedIdent", "compositeLit", "literalType", 
		"literalValue", "elementList", "keyedElement", "key", "element", "structType", 
		"fieldDecl", "anonymousField", "functionLit", "primaryExpr", "selector", 
		"index", "slice", "typeAssertion", "arguments", "methodExpr", "receiverType", 
		"expression", "unaryExpr", "conversion", "eos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "'import'", "'('", "')'", "'.'", "'const'", "'='", 
		"','", "'type'", "'func'", "'var'", "'{'", "'}'", "'<-'", "'++'", "'--'", 
		"'+'", "'-'", "'|'", "'^'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'&'", 
		"'&^'", "':='", "';'", "':'", "'return'", "'break'", "'continue'", "'goto'", 
		"'fallthrough'", "'defer'", "'if'", "'else'", "'switch'", "'case'", "'default'", 
		"'select'", "'for'", "'range'", "'go'", "'['", "']'", "'interface'", "'map'", 
		"'chan'", "'...'", "'struct'", "'||'", "'&&'", "'=='", "'!='", "'<'", 
		"'<='", "'>'", "'>='", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "IDENTIFIER", "KEYWORD", "BINARY_OP", "INT_LIT", "FLOAT_LIT", 
		"IMAGINARY_LIT", "RUNE_LIT", "LITTLE_U_VALUE", "BIG_U_VALUE", "STRING_LIT", 
		"WS", "COMMENT", "TERMINATOR", "LINE_COMMENT"
	};
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
	public String getGrammarFileName() { return "Golang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    /**
	     * Returns {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     *
	     * @return {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     */
	    private boolean lineTerminatorAhead() {
	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEosToken);
	        if (ahead.getChannel() != Lexer.HIDDEN) {
	            // We're only interested in tokens on the HIDDEN channel.
	            return false;
	        }

	        if (ahead.getType() == TERMINATOR) {
	            // There is definitely a line terminator ahead.
	            return true;
	        }

	        if (ahead.getType() == WS) {
	            // Get the token ahead of the current whitespaces.
	            possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 2;
	            ahead = _input.get(possibleIndexEosToken);
	        }

	        // Get the token's text and type.
	        String text = ahead.getText();
	        int type = ahead.getType();

	        // Check if the token is, or contains a line terminator.
	        return (type == COMMENT && (text.contains("\r") || text.contains("\n"))) ||
	                (type == TERMINATOR);
	    }

	     /**
	     * Returns {@code true} if no line terminator exists between the specified
	     * token offset and the prior one on the {@code HIDDEN} channel.
	     *
	     * @return {@code true} if no line terminator exists between the specified
	     * token offset and the prior one on the {@code HIDDEN} channel.
	     */
	    private boolean noTerminatorBetween(int tokenOffset) {
	        BufferedTokenStream stream = (BufferedTokenStream)_input;
	        List<Token> tokens = stream.getHiddenTokensToLeft(stream.LT(tokenOffset).getTokenIndex());
	        
	        if (tokens == null) {
	            return true;
	        }

	        for (Token token : tokens) {
	            if (token.getText().contains("\n"))
	                return false;
	        }

	        return true;
	    }

	     /**
	     * Returns {@code true} if no line terminator exists after any encounterd
	     * parameters beyond the specified token offset and the next on the
	     * {@code HIDDEN} channel.
	     *
	     * @return {@code true} if no line terminator exists after any encounterd
	     * parameters beyond the specified token offset and the next on the
	     * {@code HIDDEN} channel.
	     */
	    private boolean noTerminatorAfterParams(int tokenOffset) {
	        BufferedTokenStream stream = (BufferedTokenStream)_input;
	        int leftParams = 1;
	        int rightParams = 0;
	        String value;

	        if (stream.LT(tokenOffset).getText().equals("(")) {
	            // Scan past parameters
	            while (leftParams != rightParams) {
	                tokenOffset++;
	                value = stream.LT(tokenOffset).getText();

	                if (value.equals("(")) {
	                    leftParams++;
	                }
	                else if (value.equals(")")) {
	                    rightParams++;
	                }
	            }

	            tokenOffset++;
	            return noTerminatorBetween(tokenOffset);
	        }
	        
	        return true;
	    }

	public GolangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceFileContext extends ParserRuleContext {
		public PackageClauseContext packageClause() {
			return getRuleContext(PackageClauseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GolangParser.EOF, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<TopLevelDeclContext> topLevelDecl() {
			return getRuleContexts(TopLevelDeclContext.class);
		}
		public TopLevelDeclContext topLevelDecl(int i) {
			return getRuleContext(TopLevelDeclContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSourceFile(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			int _alt;
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				packageClause();
				setState(203);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				packageClause();
				setState(206);
				eos();
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						importDecl();
						setState(208);
						eos();
						}
						} 
					}
					setState(214);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(215);
				importDecl();
				setState(216);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				packageClause();
				setState(219);
				eos();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(220);
					importDecl();
					setState(221);
					eos();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(228);
						topLevelDecl();
						setState(229);
						eos();
						}
						} 
					}
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(236);
				topLevelDecl();
				setState(237);
				match(EOF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				packageClause();
				setState(240);
				eos();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(241);
					importDecl();
					setState(242);
					eos();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					{
					setState(249);
					topLevelDecl();
					setState(250);
					eos();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(EOF);
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

	public static class PackageClauseContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public PackageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterPackageClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitPackageClause(this);
		}
	}

	public final PackageClauseContext packageClause() throws RecognitionException {
		PackageClauseContext _localctx = new PackageClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__0);
			setState(262);
			match(IDENTIFIER);
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

	public static class ImportDeclContext extends ParserRuleContext {
		public List<ImportSpecContext> importSpec() {
			return getRuleContexts(ImportSpecContext.class);
		}
		public ImportSpecContext importSpec(int i) {
			return getRuleContext(ImportSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitImportDecl(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__1);
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case IDENTIFIER:
			case STRING_LIT:
				{
				setState(265);
				importSpec();
				}
				break;
			case T__2:
				{
				setState(266);
				match(T__2);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4 || _la==IDENTIFIER || _la==STRING_LIT) {
					{
					{
					setState(267);
					importSpec();
					setState(268);
					eos();
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ImportSpecContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitImportSpec(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==IDENTIFIER) {
				{
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(281);
			importPath();
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

	public static class ImportPathContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(GolangParser.STRING_LIT, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitImportPath(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(STRING_LIT);
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

	public static class TopLevelDeclContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTopLevelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTopLevelDecl(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topLevelDecl);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				functionDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				methodDecl();
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

	public static class DeclarationContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				constDecl();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				typeDecl();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				varDecl();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public List<ConstSpecContext> constSpec() {
			return getRuleContexts(ConstSpecContext.class);
		}
		public ConstSpecContext constSpec(int i) {
			return getRuleContext(ConstSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__5);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(296);
				constSpec();
				}
				break;
			case T__2:
				{
				setState(297);
				match(T__2);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(298);
					constSpec();
					setState(299);
					eos();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterConstSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitConstSpec(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			identifierList();
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__20) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(310);
					type();
					}
				}

				setState(313);
				match(T__6);
				setState(314);
				expressionList();
				}
				break;
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GolangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GolangParser.IDENTIFIER, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(IDENTIFIER);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					match(T__7);
					setState(319);
					match(IDENTIFIER);
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			expression(0);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					match(T__7);
					setState(327);
					expression(0);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class TypeDeclContext extends ParserRuleContext {
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeDecl(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__8);
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(334);
				typeSpec();
				}
				break;
			case T__2:
				{
				setState(335);
				match(T__2);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(336);
					typeSpec();
					setState(337);
					eos();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeSpec(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IDENTIFIER);
			setState(348);
			type();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__9);
			setState(351);
			match(IDENTIFIER);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(352);
				function();
				}
				break;
			case 2:
				{
				setState(353);
				signature();
				}
				break;
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

	public static class FunctionContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			signature();
			setState(357);
			block();
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

	public static class MethodDeclContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__9);
			setState(360);
			receiver();
			setState(361);
			match(IDENTIFIER);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(362);
				function();
				}
				break;
			case 2:
				{
				setState(363);
				signature();
				}
				break;
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

	public static class ReceiverContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			parameters();
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

	public static class VarDeclContext extends ParserRuleContext {
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__10);
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(369);
				varSpec();
				}
				break;
			case T__2:
				{
				setState(370);
				match(T__2);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(371);
					varSpec();
					setState(372);
					eos();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitVarSpec(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			identifierList();
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__13:
			case T__20:
			case T__45:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case IDENTIFIER:
				{
				setState(383);
				type();
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(384);
					match(T__6);
					setState(385);
					expressionList();
					}
					break;
				}
				}
				break;
			case T__6:
				{
				setState(388);
				match(T__6);
				setState(389);
				expressionList();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__11);
			setState(393);
			statementList();
			setState(394);
			match(T__12);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				{
				setState(396);
				statement();
				setState(397);
				eos();
				}
				}
				setState(403);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStmtContext labeledStmt() {
			return getRuleContext(LabeledStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public GoStmtContext goStmt() {
			return getRuleContext(GoStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public FallthroughStmtContext fallthroughStmt() {
			return getRuleContext(FallthroughStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public DeferStmtContext deferStmt() {
			return getRuleContext(DeferStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				goStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(408);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(409);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(410);
				continueStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(411);
				gotoStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(412);
				fallthroughStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(413);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(414);
				ifStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(415);
				switchStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(416);
				selectStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(417);
				forStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(418);
				deferStmt();
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSimpleStmt(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simpleStmt);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				sendStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				expressionStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				incDecStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				shortVarDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				emptyStmt();
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

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExpressionStmt(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			expression(0);
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

	public static class SendStmtContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSendStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSendStmt(this);
		}
	}

	public final SendStmtContext sendStmt() throws RecognitionException {
		SendStmtContext _localctx = new SendStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			expression(0);
			setState(432);
			match(T__13);
			setState(433);
			expression(0);
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

	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitIncDecStmt(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			expression(0);
			setState(436);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			expressionList();
			setState(439);
			assign_op();
			setState(440);
			expressionList();
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

	public static class Assign_opContext extends ParserRuleContext {
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(442);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(445);
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

	public static class ShortVarDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterShortVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitShortVarDecl(this);
		}
	}

	public final ShortVarDeclContext shortVarDecl() throws RecognitionException {
		ShortVarDeclContext _localctx = new ShortVarDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			identifierList();
			setState(448);
			match(T__27);
			setState(449);
			expressionList();
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

	public static class EmptyStmtContext extends ParserRuleContext {
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitEmptyStmt(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__28);
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

	public static class LabeledStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterLabeledStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitLabeledStmt(this);
		}
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(IDENTIFIER);
			setState(454);
			match(T__29);
			setState(455);
			statement();
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T__30);
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(458);
				expressionList();
				}
				break;
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitBreakStmt(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__31);
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(462);
				match(IDENTIFIER);
				}
				break;
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

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitContinueStmt(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__32);
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(466);
				match(IDENTIFIER);
				}
				break;
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

	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitGotoStmt(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(T__33);
			setState(470);
			match(IDENTIFIER);
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

	public static class FallthroughStmtContext extends ParserRuleContext {
		public FallthroughStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFallthroughStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFallthroughStmt(this);
		}
	}

	public final FallthroughStmtContext fallthroughStmt() throws RecognitionException {
		FallthroughStmtContext _localctx = new FallthroughStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__34);
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

	public static class DeferStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeferStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterDeferStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitDeferStmt(this);
		}
	}

	public final DeferStmtContext deferStmt() throws RecognitionException {
		DeferStmtContext _localctx = new DeferStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T__35);
			setState(475);
			expression(0);
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

	public static class IfStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(T__36);
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(478);
				simpleStmt();
				setState(479);
				match(T__28);
				}
				break;
			}
			setState(483);
			expression(0);
			setState(484);
			block();
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(485);
				match(T__37);
				setState(488);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(486);
					ifStmt();
					}
					break;
				case T__11:
					{
					setState(487);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class SwitchStmtContext extends ParserRuleContext {
		public ExprSwitchStmtContext exprSwitchStmt() {
			return getRuleContext(ExprSwitchStmtContext.class,0);
		}
		public TypeSwitchStmtContext typeSwitchStmt() {
			return getRuleContext(TypeSwitchStmtContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSwitchStmt(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switchStmt);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				typeSwitchStmt();
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

	public static class ExprSwitchStmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExprCaseClauseContext> exprCaseClause() {
			return getRuleContexts(ExprCaseClauseContext.class);
		}
		public ExprCaseClauseContext exprCaseClause(int i) {
			return getRuleContext(ExprCaseClauseContext.class,i);
		}
		public ExprSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExprSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExprSwitchStmt(this);
		}
	}

	public final ExprSwitchStmtContext exprSwitchStmt() throws RecognitionException {
		ExprSwitchStmtContext _localctx = new ExprSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(T__38);
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(497);
				simpleStmt();
				setState(498);
				match(T__28);
				}
				break;
			}
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(502);
				expression(0);
				}
			}

			setState(505);
			match(T__11);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(506);
				exprCaseClause();
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			match(T__12);
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

	public static class ExprCaseClauseContext extends ParserRuleContext {
		public ExprSwitchCaseContext exprSwitchCase() {
			return getRuleContext(ExprSwitchCaseContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExprCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExprCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExprCaseClause(this);
		}
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			exprSwitchCase();
			setState(515);
			match(T__29);
			setState(516);
			statementList();
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

	public static class ExprSwitchCaseContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExprSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExprSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExprSwitchCase(this);
		}
	}

	public final ExprSwitchCaseContext exprSwitchCase() throws RecognitionException {
		ExprSwitchCaseContext _localctx = new ExprSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exprSwitchCase);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(T__39);
				setState(519);
				expressionList();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(T__40);
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

	public static class TypeSwitchStmtContext extends ParserRuleContext {
		public TypeSwitchGuardContext typeSwitchGuard() {
			return getRuleContext(TypeSwitchGuardContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public List<TypeCaseClauseContext> typeCaseClause() {
			return getRuleContexts(TypeCaseClauseContext.class);
		}
		public TypeCaseClauseContext typeCaseClause(int i) {
			return getRuleContext(TypeCaseClauseContext.class,i);
		}
		public TypeSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeSwitchStmt(this);
		}
	}

	public final TypeSwitchStmtContext typeSwitchStmt() throws RecognitionException {
		TypeSwitchStmtContext _localctx = new TypeSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__38);
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(524);
				simpleStmt();
				setState(525);
				match(T__28);
				}
				break;
			}
			setState(529);
			typeSwitchGuard();
			setState(530);
			match(T__11);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(531);
				typeCaseClause();
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
			match(T__12);
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

	public static class TypeSwitchGuardContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public TypeSwitchGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeSwitchGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeSwitchGuard(this);
		}
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(539);
				match(IDENTIFIER);
				setState(540);
				match(T__27);
				}
				break;
			}
			setState(543);
			primaryExpr(0);
			setState(544);
			match(T__4);
			setState(545);
			match(T__2);
			setState(546);
			match(T__8);
			setState(547);
			match(T__3);
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

	public static class TypeCaseClauseContext extends ParserRuleContext {
		public TypeSwitchCaseContext typeSwitchCase() {
			return getRuleContext(TypeSwitchCaseContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TypeCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeCaseClause(this);
		}
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			typeSwitchCase();
			setState(550);
			match(T__29);
			setState(551);
			statementList();
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

	public static class TypeSwitchCaseContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeSwitchCase(this);
		}
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeSwitchCase);
		try {
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(T__39);
				setState(554);
				typeList();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(T__40);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			type();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(559);
				match(T__7);
				setState(560);
				type();
				}
				}
				setState(565);
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

	public static class SelectStmtContext extends ParserRuleContext {
		public List<CommClauseContext> commClause() {
			return getRuleContexts(CommClauseContext.class);
		}
		public CommClauseContext commClause(int i) {
			return getRuleContext(CommClauseContext.class,i);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSelectStmt(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__41);
			setState(567);
			match(T__11);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(568);
				commClause();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(T__12);
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

	public static class CommClauseContext extends ParserRuleContext {
		public CommCaseContext commCase() {
			return getRuleContext(CommCaseContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CommClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterCommClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitCommClause(this);
		}
	}

	public final CommClauseContext commClause() throws RecognitionException {
		CommClauseContext _localctx = new CommClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_commClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			commCase();
			setState(577);
			match(T__29);
			setState(578);
			statementList();
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

	public static class CommCaseContext extends ParserRuleContext {
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public RecvStmtContext recvStmt() {
			return getRuleContext(RecvStmtContext.class,0);
		}
		public CommCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterCommCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitCommCase(this);
		}
	}

	public final CommCaseContext commCase() throws RecognitionException {
		CommCaseContext _localctx = new CommCaseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_commCase);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(T__39);
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(581);
					sendStmt();
					}
					break;
				case 2:
					{
					setState(582);
					recvStmt();
					}
					break;
				}
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(T__40);
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

	public static class RecvStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RecvStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recvStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterRecvStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitRecvStmt(this);
		}
	}

	public final RecvStmtContext recvStmt() throws RecognitionException {
		RecvStmtContext _localctx = new RecvStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_recvStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(588);
				expressionList();
				setState(589);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(591);
				identifierList();
				setState(592);
				match(T__27);
				}
				break;
			}
			setState(596);
			expression(0);
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

	public static class ForStmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__42);
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(599);
				expression(0);
				}
				break;
			case 2:
				{
				setState(600);
				forClause();
				}
				break;
			case 3:
				{
				setState(601);
				rangeClause();
				}
				break;
			}
			setState(604);
			block();
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitForClause(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(606);
				simpleStmt();
				}
				break;
			}
			setState(609);
			match(T__28);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(610);
				expression(0);
				}
			}

			setState(613);
			match(T__28);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__28) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(614);
				simpleStmt();
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

	public static class RangeClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitRangeClause(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(617);
				expressionList();
				setState(618);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(620);
				identifierList();
				setState(621);
				match(T__27);
				}
				break;
			}
			setState(625);
			match(T__43);
			setState(626);
			expression(0);
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

	public static class GoStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterGoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitGoStmt(this);
		}
	}

	public final GoStmtContext goStmt() throws RecognitionException {
		GoStmtContext _localctx = new GoStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_goStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(T__44);
			setState(629);
			expression(0);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_type);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				typeName();
				}
				break;
			case T__9:
			case T__13:
			case T__20:
			case T__45:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				typeLit();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				match(T__2);
				setState(634);
				type();
				setState(635);
				match(T__3);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeName);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				qualifiedIdent();
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

	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public ChannelTypeContext channelType() {
			return getRuleContext(ChannelTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeLit(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeLit);
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				functionType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(647);
				interfaceType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(648);
				sliceType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(649);
				mapType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(650);
				channelType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(T__45);
			setState(654);
			arrayLength();
			setState(655);
			match(T__46);
			setState(656);
			elementType();
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitArrayLength(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			expression(0);
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

	public static class ElementTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitElementType(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			type();
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

	public static class PointerTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitPointerType(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(T__20);
			setState(663);
			type();
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public List<MethodSpecContext> methodSpec() {
			return getRuleContexts(MethodSpecContext.class);
		}
		public MethodSpecContext methodSpec(int i) {
			return getRuleContext(MethodSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_interfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(T__47);
			setState(666);
			match(T__11);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(667);
					methodSpec();
					setState(668);
					eos();
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(675);
			match(T__12);
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

	public static class SliceTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSliceType(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(T__45);
			setState(678);
			match(T__46);
			setState(679);
			elementType();
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

	public static class MapTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitMapType(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(T__48);
			setState(682);
			match(T__45);
			setState(683);
			type();
			setState(684);
			match(T__46);
			setState(685);
			elementType();
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

	public static class ChannelTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ChannelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterChannelType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitChannelType(this);
		}
	}

	public final ChannelTypeContext channelType() throws RecognitionException {
		ChannelTypeContext _localctx = new ChannelTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_channelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(687);
				match(T__49);
				}
				break;
			case 2:
				{
				setState(688);
				match(T__49);
				setState(689);
				match(T__13);
				}
				break;
			case 3:
				{
				setState(690);
				match(T__13);
				setState(691);
				match(T__49);
				}
				break;
			}
			setState(694);
			elementType();
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

	public static class MethodSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MethodSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterMethodSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitMethodSpec(this);
		}
	}

	public final MethodSpecContext methodSpec() throws RecognitionException {
		MethodSpecContext _localctx = new MethodSpecContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_methodSpec);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				if (!(noTerminatorAfterParams(2))) throw new FailedPredicateException(this, "noTerminatorAfterParams(2)");
				setState(697);
				match(IDENTIFIER);
				setState(698);
				parameters();
				setState(699);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				typeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(702);
				match(IDENTIFIER);
				setState(703);
				parameters();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(T__9);
			setState(707);
			signature();
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

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_signature);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				if (!(noTerminatorAfterParams(1))) throw new FailedPredicateException(this, "noTerminatorAfterParams(1)");
				setState(710);
				parameters();
				setState(711);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				parameters();
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

	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_result);
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				type();
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

	public static class ParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(T__2);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__20) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(721);
				parameterList();
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(722);
					match(T__7);
					}
				}

				}
			}

			setState(727);
			match(T__3);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			parameterDecl();
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(730);
					match(T__7);
					setState(731);
					parameterDecl();
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class ParameterDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitParameterDecl(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(737);
				identifierList();
				}
				break;
			}
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(740);
				match(T__50);
				}
			}

			setState(743);
			type();
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

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_operand);
		try {
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				methodExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(748);
				match(T__2);
				setState(749);
				expression(0);
				setState(750);
				match(T__3);
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

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public CompositeLitContext compositeLit() {
			return getRuleContext(CompositeLitContext.class,0);
		}
		public FunctionLitContext functionLit() {
			return getRuleContext(FunctionLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_literal);
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				basicLit();
				}
				break;
			case T__45:
			case T__48:
			case T__51:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				compositeLit();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				functionLit();
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

	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(GolangParser.INT_LIT, 0); }
		public TerminalNode FLOAT_LIT() { return getToken(GolangParser.FLOAT_LIT, 0); }
		public TerminalNode IMAGINARY_LIT() { return getToken(GolangParser.IMAGINARY_LIT, 0); }
		public TerminalNode RUNE_LIT() { return getToken(GolangParser.RUNE_LIT, 0); }
		public TerminalNode STRING_LIT() { return getToken(GolangParser.STRING_LIT, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterBasicLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitBasicLit(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_basicLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) ) {
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

	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitOperandName(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_operandName);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				qualifiedIdent();
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

	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GolangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GolangParser.IDENTIFIER, i);
		}
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitQualifiedIdent(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(IDENTIFIER);
			setState(766);
			match(T__4);
			setState(767);
			match(IDENTIFIER);
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

	public static class CompositeLitContext extends ParserRuleContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterCompositeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitCompositeLit(this);
		}
	}

	public final CompositeLitContext compositeLit() throws RecognitionException {
		CompositeLitContext _localctx = new CompositeLitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			literalType();
			setState(770);
			literalValue();
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

	public static class LiteralTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitLiteralType(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_literalType);
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				match(T__45);
				setState(775);
				match(T__50);
				setState(776);
				match(T__46);
				setState(777);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(779);
				mapType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(780);
				typeName();
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

	public static class LiteralValueContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitLiteralValue(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_literalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(T__11);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(784);
				elementList();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(785);
					match(T__7);
					}
				}

				}
			}

			setState(790);
			match(T__12);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<KeyedElementContext> keyedElement() {
			return getRuleContexts(KeyedElementContext.class);
		}
		public KeyedElementContext keyedElement(int i) {
			return getRuleContext(KeyedElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_elementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			keyedElement();
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(793);
					match(T__7);
					setState(794);
					keyedElement();
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class KeyedElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public KeyedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterKeyedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitKeyedElement(this);
		}
	}

	public final KeyedElementContext keyedElement() throws RecognitionException {
		KeyedElementContext _localctx = new KeyedElementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_keyedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(800);
				key();
				setState(801);
				match(T__29);
				}
				break;
			}
			setState(805);
			element();
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_key);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				literalValue();
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

	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_element);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__13:
			case T__16:
			case T__17:
			case T__19:
			case T__20:
			case T__25:
			case T__45:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__60:
			case IDENTIFIER:
			case INT_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				expression(0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				literalValue();
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

	public static class StructTypeContext extends ParserRuleContext {
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitStructType(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_structType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(T__51);
			setState(817);
			match(T__11);
			setState(823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(818);
					fieldDecl();
					setState(819);
					eos();
					}
					} 
				}
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(826);
			match(T__12);
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

	public static class FieldDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnonymousFieldContext anonymousField() {
			return getRuleContext(AnonymousFieldContext.class,0);
		}
		public TerminalNode STRING_LIT() { return getToken(GolangParser.STRING_LIT, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFieldDecl(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(828);
				if (!(noTerminatorBetween(2))) throw new FailedPredicateException(this, "noTerminatorBetween(2)");
				setState(829);
				identifierList();
				setState(830);
				type();
				}
				break;
			case 2:
				{
				setState(832);
				anonymousField();
				}
				break;
			}
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(835);
				match(STRING_LIT);
				}
				break;
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

	public static class AnonymousFieldContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AnonymousFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterAnonymousField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitAnonymousField(this);
		}
	}

	public final AnonymousFieldContext anonymousField() throws RecognitionException {
		AnonymousFieldContext _localctx = new AnonymousFieldContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_anonymousField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(838);
				match(T__20);
				}
			}

			setState(841);
			typeName();
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

	public static class FunctionLitContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFunctionLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFunctionLit(this);
		}
	}

	public final FunctionLitContext functionLit() throws RecognitionException {
		FunctionLitContext _localctx = new FunctionLitContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functionLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(T__9);
			setState(844);
			function();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(847);
				operand();
				}
				break;
			case 2:
				{
				setState(848);
				conversion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(861);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(851);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(852);
						selector();
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(853);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(854);
						index();
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(855);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(856);
						slice();
						}
						break;
					case 4:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(857);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(858);
						typeAssertion();
						}
						break;
					case 5:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(859);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(860);
						arguments();
						}
						break;
					}
					} 
				}
				setState(865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(T__4);
			setState(867);
			match(IDENTIFIER);
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

	public static class IndexContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(T__45);
			setState(870);
			expression(0);
			setState(871);
			match(T__46);
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

	public static class SliceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSlice(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_slice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(T__45);
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				{
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
					{
					setState(874);
					expression(0);
					}
				}

				setState(877);
				match(T__29);
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
					{
					setState(878);
					expression(0);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
					{
					setState(881);
					expression(0);
					}
				}

				setState(884);
				match(T__29);
				setState(885);
				expression(0);
				setState(886);
				match(T__29);
				setState(887);
				expression(0);
				}
				}
				break;
			}
			setState(891);
			match(T__46);
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

	public static class TypeAssertionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeAssertion(this);
		}
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(T__4);
			setState(894);
			match(T__2);
			setState(895);
			type();
			setState(896);
			match(T__3);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(T__2);
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(899);
					expressionList();
					}
					break;
				case 2:
					{
					setState(900);
					type();
					setState(903);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(901);
						match(T__7);
						setState(902);
						expressionList();
						}
						break;
					}
					}
					break;
				}
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(907);
					match(T__50);
					}
				}

				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(910);
					match(T__7);
					}
				}

				}
			}

			setState(915);
			match(T__3);
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

	public static class MethodExprContext extends ParserRuleContext {
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public MethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitMethodExpr(this);
		}
	}

	public final MethodExprContext methodExpr() throws RecognitionException {
		MethodExprContext _localctx = new MethodExprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			receiverType();
			setState(918);
			match(T__4);
			setState(919);
			match(IDENTIFIER);
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

	public static class ReceiverTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public ReceiverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterReceiverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitReceiverType(this);
		}
	}

	public final ReceiverTypeContext receiverType() throws RecognitionException {
		ReceiverTypeContext _localctx = new ReceiverTypeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_receiverType);
		try {
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(T__2);
				setState(923);
				match(T__20);
				setState(924);
				typeName();
				setState(925);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				match(T__2);
				setState(928);
				receiverType();
				setState(929);
				match(T__3);
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

	public static class ExpressionContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(934);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(941);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(936);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(937);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(938);
					expression(2);
					}
					} 
				}
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_unaryExpr);
		int _la;
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				primaryExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__60))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(946);
				unaryExpr();
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

	public static class ConversionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitConversion(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			type();
			setState(950);
			match(T__2);
			setState(951);
			expression(0);
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(952);
				match(T__7);
				}
			}

			setState(955);
			match(T__3);
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GolangParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_eos);
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(960);
				if (!(_input.LT(1).getText().equals("}") )) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"}\") ");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(961);
				if (!(_input.LT(1).getText().equals(")") )) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\")\") ");
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 66:
			return methodSpec_sempred((MethodSpecContext)_localctx, predIndex);
		case 68:
			return signature_sempred((SignatureContext)_localctx, predIndex);
		case 86:
			return fieldDecl_sempred((FieldDeclContext)_localctx, predIndex);
		case 89:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 97:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 100:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean methodSpec_sempred(MethodSpecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return noTerminatorAfterParams(2);
		}
		return true;
	}
	private boolean signature_sempred(SignatureContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return noTerminatorAfterParams(1);
		}
		return true;
	}
	private boolean fieldDecl_sempred(FieldDeclContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return noTerminatorBetween(2);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return lineTerminatorAhead();
		case 10:
			return _input.LT(1).getText().equals("}") ;
		case 11:
			return _input.LT(1).getText().equals(")") ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u03c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\7\2\u00d5\n\2\f\2\16\2\u00d8\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2\u00e2\n\2\f\2\16\2\u00e5\13\2\3\2\3\2\3\2\7\2\u00ea\n\2\f\2\16\2\u00ed"+
		"\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00f7\n\2\f\2\16\2\u00fa\13"+
		"\2\3\2\3\2\3\2\7\2\u00ff\n\2\f\2\16\2\u0102\13\2\3\2\3\2\5\2\u0106\n\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0111\n\4\f\4\16\4\u0114\13\4"+
		"\3\4\5\4\u0117\n\4\3\5\5\5\u011a\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u0123"+
		"\n\7\3\b\3\b\3\b\5\b\u0128\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0130\n\t\f"+
		"\t\16\t\u0133\13\t\3\t\5\t\u0136\n\t\3\n\3\n\5\n\u013a\n\n\3\n\3\n\5\n"+
		"\u013e\n\n\3\13\3\13\3\13\7\13\u0143\n\13\f\13\16\13\u0146\13\13\3\f\3"+
		"\f\3\f\7\f\u014b\n\f\f\f\16\f\u014e\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0156"+
		"\n\r\f\r\16\r\u0159\13\r\3\r\5\r\u015c\n\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\5\17\u0165\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u016f\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0179\n\23\f"+
		"\23\16\23\u017c\13\23\3\23\5\23\u017f\n\23\3\24\3\24\3\24\3\24\5\24\u0185"+
		"\n\24\3\24\3\24\5\24\u0189\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26"+
		"\u0192\n\26\f\26\16\26\u0195\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01a6\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u01ae\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\5\35\u01be\n\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\5!\u01ce\n!\3\"\3\"\5\"\u01d2\n\"\3"+
		"#\3#\5#\u01d6\n#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u01e4\n\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u01eb\n\'\5\'\u01ed\n\'\3(\3(\5(\u01f1\n(\3)"+
		"\3)\3)\3)\5)\u01f7\n)\3)\5)\u01fa\n)\3)\3)\7)\u01fe\n)\f)\16)\u0201\13"+
		")\3)\3)\3*\3*\3*\3*\3+\3+\3+\5+\u020c\n+\3,\3,\3,\3,\5,\u0212\n,\3,\3"+
		",\3,\7,\u0217\n,\f,\16,\u021a\13,\3,\3,\3-\3-\5-\u0220\n-\3-\3-\3-\3-"+
		"\3-\3-\3.\3.\3.\3.\3/\3/\3/\5/\u022f\n/\3\60\3\60\3\60\7\60\u0234\n\60"+
		"\f\60\16\60\u0237\13\60\3\61\3\61\3\61\7\61\u023c\n\61\f\61\16\61\u023f"+
		"\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\5\63\u024a\n\63\3"+
		"\63\5\63\u024d\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0255\n\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\5\65\u025d\n\65\3\65\3\65\3\66\5\66\u0262\n"+
		"\66\3\66\3\66\5\66\u0266\n\66\3\66\3\66\5\66\u026a\n\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u0272\n\67\3\67\3\67\3\67\38\38\38\39\39\39\39\3"+
		"9\39\59\u0280\n9\3:\3:\5:\u0284\n:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u028e\n"+
		";\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\7@\u02a1\n@\f@\16"+
		"@\u02a4\13@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\5C\u02b7"+
		"\nC\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\5D\u02c3\nD\3E\3E\3E\3F\3F\3F\3F\3F"+
		"\5F\u02cd\nF\3G\3G\5G\u02d1\nG\3H\3H\3H\5H\u02d6\nH\5H\u02d8\nH\3H\3H"+
		"\3I\3I\3I\7I\u02df\nI\fI\16I\u02e2\13I\3J\5J\u02e5\nJ\3J\5J\u02e8\nJ\3"+
		"J\3J\3K\3K\3K\3K\3K\3K\3K\5K\u02f3\nK\3L\3L\3L\5L\u02f8\nL\3M\3M\3N\3"+
		"N\5N\u02fe\nN\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0310"+
		"\nQ\3R\3R\3R\5R\u0315\nR\5R\u0317\nR\3R\3R\3S\3S\3S\7S\u031e\nS\fS\16"+
		"S\u0321\13S\3T\3T\3T\5T\u0326\nT\3T\3T\3U\3U\3U\5U\u032d\nU\3V\3V\5V\u0331"+
		"\nV\3W\3W\3W\3W\3W\7W\u0338\nW\fW\16W\u033b\13W\3W\3W\3X\3X\3X\3X\3X\5"+
		"X\u0344\nX\3X\5X\u0347\nX\3Y\5Y\u034a\nY\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\5[\u0354"+
		"\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\7[\u0360\n[\f[\16[\u0363\13[\3\\\3\\"+
		"\3\\\3]\3]\3]\3]\3^\3^\5^\u036e\n^\3^\3^\5^\u0372\n^\3^\5^\u0375\n^\3"+
		"^\3^\3^\3^\3^\5^\u037c\n^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\5`\u038a"+
		"\n`\5`\u038c\n`\3`\5`\u038f\n`\3`\5`\u0392\n`\5`\u0394\n`\3`\3`\3a\3a"+
		"\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u03a6\nb\3c\3c\3c\3c\3c\3c\7c"+
		"\u03ae\nc\fc\16c\u03b1\13c\3d\3d\3d\5d\u03b6\nd\3e\3e\3e\3e\5e\u03bc\n"+
		"e\3e\3e\3f\3f\3f\3f\3f\5f\u03c5\nf\3f\2\4\u00b4\u00c4g\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\2\b\4\2\7\7@@\3\2\21\22\3\2\23\35\4\2CFII\4\2"+
		"\23\35\67>\7\2\20\20\23\24\26\27\34\34??\2\u03f4\2\u0105\3\2\2\2\4\u0107"+
		"\3\2\2\2\6\u010a\3\2\2\2\b\u0119\3\2\2\2\n\u011d\3\2\2\2\f\u0122\3\2\2"+
		"\2\16\u0127\3\2\2\2\20\u0129\3\2\2\2\22\u0137\3\2\2\2\24\u013f\3\2\2\2"+
		"\26\u0147\3\2\2\2\30\u014f\3\2\2\2\32\u015d\3\2\2\2\34\u0160\3\2\2\2\36"+
		"\u0166\3\2\2\2 \u0169\3\2\2\2\"\u0170\3\2\2\2$\u0172\3\2\2\2&\u0180\3"+
		"\2\2\2(\u018a\3\2\2\2*\u0193\3\2\2\2,\u01a5\3\2\2\2.\u01ad\3\2\2\2\60"+
		"\u01af\3\2\2\2\62\u01b1\3\2\2\2\64\u01b5\3\2\2\2\66\u01b8\3\2\2\28\u01bd"+
		"\3\2\2\2:\u01c1\3\2\2\2<\u01c5\3\2\2\2>\u01c7\3\2\2\2@\u01cb\3\2\2\2B"+
		"\u01cf\3\2\2\2D\u01d3\3\2\2\2F\u01d7\3\2\2\2H\u01da\3\2\2\2J\u01dc\3\2"+
		"\2\2L\u01df\3\2\2\2N\u01f0\3\2\2\2P\u01f2\3\2\2\2R\u0204\3\2\2\2T\u020b"+
		"\3\2\2\2V\u020d\3\2\2\2X\u021f\3\2\2\2Z\u0227\3\2\2\2\\\u022e\3\2\2\2"+
		"^\u0230\3\2\2\2`\u0238\3\2\2\2b\u0242\3\2\2\2d\u024c\3\2\2\2f\u0254\3"+
		"\2\2\2h\u0258\3\2\2\2j\u0261\3\2\2\2l\u0271\3\2\2\2n\u0276\3\2\2\2p\u027f"+
		"\3\2\2\2r\u0283\3\2\2\2t\u028d\3\2\2\2v\u028f\3\2\2\2x\u0294\3\2\2\2z"+
		"\u0296\3\2\2\2|\u0298\3\2\2\2~\u029b\3\2\2\2\u0080\u02a7\3\2\2\2\u0082"+
		"\u02ab\3\2\2\2\u0084\u02b6\3\2\2\2\u0086\u02c2\3\2\2\2\u0088\u02c4\3\2"+
		"\2\2\u008a\u02cc\3\2\2\2\u008c\u02d0\3\2\2\2\u008e\u02d2\3\2\2\2\u0090"+
		"\u02db\3\2\2\2\u0092\u02e4\3\2\2\2\u0094\u02f2\3\2\2\2\u0096\u02f7\3\2"+
		"\2\2\u0098\u02f9\3\2\2\2\u009a\u02fd\3\2\2\2\u009c\u02ff\3\2\2\2\u009e"+
		"\u0303\3\2\2\2\u00a0\u030f\3\2\2\2\u00a2\u0311\3\2\2\2\u00a4\u031a\3\2"+
		"\2\2\u00a6\u0325\3\2\2\2\u00a8\u032c\3\2\2\2\u00aa\u0330\3\2\2\2\u00ac"+
		"\u0332\3\2\2\2\u00ae\u0343\3\2\2\2\u00b0\u0349\3\2\2\2\u00b2\u034d\3\2"+
		"\2\2\u00b4\u0353\3\2\2\2\u00b6\u0364\3\2\2\2\u00b8\u0367\3\2\2\2\u00ba"+
		"\u036b\3\2\2\2\u00bc\u037f\3\2\2\2\u00be\u0384\3\2\2\2\u00c0\u0397\3\2"+
		"\2\2\u00c2\u03a5\3\2\2\2\u00c4\u03a7\3\2\2\2\u00c6\u03b5\3\2\2\2\u00c8"+
		"\u03b7\3\2\2\2\u00ca\u03c4\3\2\2\2\u00cc\u00cd\5\4\3\2\u00cd\u00ce\7\2"+
		"\2\3\u00ce\u0106\3\2\2\2\u00cf\u00d0\5\4\3\2\u00d0\u00d6\5\u00caf\2\u00d1"+
		"\u00d2\5\6\4\2\u00d2\u00d3\5\u00caf\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\5\6\4\2\u00da\u00db\7\2"+
		"\2\3\u00db\u0106\3\2\2\2\u00dc\u00dd\5\4\3\2\u00dd\u00e3\5\u00caf\2\u00de"+
		"\u00df\5\6\4\2\u00df\u00e0\5\u00caf\2\u00e0\u00e2\3\2\2\2\u00e1\u00de"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00eb\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e8\5\u00ca"+
		"f\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00ef\5\f\7\2\u00ef\u00f0\7\2\2\3\u00f0\u0106\3\2\2\2\u00f1"+
		"\u00f2\5\4\3\2\u00f2\u00f8\5\u00caf\2\u00f3\u00f4\5\6\4\2\u00f4\u00f5"+
		"\5\u00caf\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2"+
		"\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0100\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fc\5\f\7\2\u00fc\u00fd\5\u00caf\2\u00fd\u00ff\3\2\2"+
		"\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\2\2\3\u0104"+
		"\u0106\3\2\2\2\u0105\u00cc\3\2\2\2\u0105\u00cf\3\2\2\2\u0105\u00dc\3\2"+
		"\2\2\u0105\u00f1\3\2\2\2\u0106\3\3\2\2\2\u0107\u0108\7\3\2\2\u0108\u0109"+
		"\7@\2\2\u0109\5\3\2\2\2\u010a\u0116\7\4\2\2\u010b\u0117\5\b\5\2\u010c"+
		"\u0112\7\5\2\2\u010d\u010e\5\b\5\2\u010e\u010f\5\u00caf\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7\6"+
		"\2\2\u0116\u010b\3\2\2\2\u0116\u010c\3\2\2\2\u0117\7\3\2\2\2\u0118\u011a"+
		"\t\2\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\5\n\6\2\u011c\t\3\2\2\2\u011d\u011e\7I\2\2\u011e\13\3\2\2\2\u011f"+
		"\u0123\5\16\b\2\u0120\u0123\5\34\17\2\u0121\u0123\5 \21\2\u0122\u011f"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\r\3\2\2\2\u0124"+
		"\u0128\5\20\t\2\u0125\u0128\5\30\r\2\u0126\u0128\5$\23\2\u0127\u0124\3"+
		"\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\17\3\2\2\2\u0129"+
		"\u0135\7\b\2\2\u012a\u0136\5\22\n\2\u012b\u0131\7\5\2\2\u012c\u012d\5"+
		"\22\n\2\u012d\u012e\5\u00caf\2\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2"+
		"\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\7\6\2\2\u0135\u012a\3\2\2\2\u0135"+
		"\u012b\3\2\2\2\u0136\21\3\2\2\2\u0137\u013d\5\24\13\2\u0138\u013a\5p9"+
		"\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c"+
		"\7\t\2\2\u013c\u013e\5\26\f\2\u013d\u0139\3\2\2\2\u013d\u013e\3\2\2\2"+
		"\u013e\23\3\2\2\2\u013f\u0144\7@\2\2\u0140\u0141\7\n\2\2\u0141\u0143\7"+
		"@\2\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\25\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014c\5\u00c4"+
		"c\2\u0148\u0149\7\n\2\2\u0149\u014b\5\u00c4c\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\27\3\2\2"+
		"\2\u014e\u014c\3\2\2\2\u014f\u015b\7\13\2\2\u0150\u015c\5\32\16\2\u0151"+
		"\u0157\7\5\2\2\u0152\u0153\5\32\16\2\u0153\u0154\5\u00caf\2\u0154\u0156"+
		"\3\2\2\2\u0155\u0152\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\7\6"+
		"\2\2\u015b\u0150\3\2\2\2\u015b\u0151\3\2\2\2\u015c\31\3\2\2\2\u015d\u015e"+
		"\7@\2\2\u015e\u015f\5p9\2\u015f\33\3\2\2\2\u0160\u0161\7\f\2\2\u0161\u0164"+
		"\7@\2\2\u0162\u0165\5\36\20\2\u0163\u0165\5\u008aF\2\u0164\u0162\3\2\2"+
		"\2\u0164\u0163\3\2\2\2\u0165\35\3\2\2\2\u0166\u0167\5\u008aF\2\u0167\u0168"+
		"\5(\25\2\u0168\37\3\2\2\2\u0169\u016a\7\f\2\2\u016a\u016b\5\"\22\2\u016b"+
		"\u016e\7@\2\2\u016c\u016f\5\36\20\2\u016d\u016f\5\u008aF\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016d\3\2\2\2\u016f!\3\2\2\2\u0170\u0171\5\u008eH\2\u0171"+
		"#\3\2\2\2\u0172\u017e\7\r\2\2\u0173\u017f\5&\24\2\u0174\u017a\7\5\2\2"+
		"\u0175\u0176\5&\24\2\u0176\u0177\5\u00caf\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0175\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\7\6\2\2\u017e"+
		"\u0173\3\2\2\2\u017e\u0174\3\2\2\2\u017f%\3\2\2\2\u0180\u0188\5\24\13"+
		"\2\u0181\u0184\5p9\2\u0182\u0183\7\t\2\2\u0183\u0185\5\26\f\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189\3\2\2\2\u0186\u0187\7\t\2\2\u0187"+
		"\u0189\5\26\f\2\u0188\u0181\3\2\2\2\u0188\u0186\3\2\2\2\u0189\'\3\2\2"+
		"\2\u018a\u018b\7\16\2\2\u018b\u018c\5*\26\2\u018c\u018d\7\17\2\2\u018d"+
		")\3\2\2\2\u018e\u018f\5,\27\2\u018f\u0190\5\u00caf\2\u0190\u0192\3\2\2"+
		"\2\u0191\u018e\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194+\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u01a6\5\16\b\2\u0197"+
		"\u01a6\5> \2\u0198\u01a6\5.\30\2\u0199\u01a6\5n8\2\u019a\u01a6\5@!\2\u019b"+
		"\u01a6\5B\"\2\u019c\u01a6\5D#\2\u019d\u01a6\5F$\2\u019e\u01a6\5H%\2\u019f"+
		"\u01a6\5(\25\2\u01a0\u01a6\5L\'\2\u01a1\u01a6\5N(\2\u01a2\u01a6\5`\61"+
		"\2\u01a3\u01a6\5h\65\2\u01a4\u01a6\5J&\2\u01a5\u0196\3\2\2\2\u01a5\u0197"+
		"\3\2\2\2\u01a5\u0198\3\2\2\2\u01a5\u0199\3\2\2\2\u01a5\u019a\3\2\2\2\u01a5"+
		"\u019b\3\2\2\2\u01a5\u019c\3\2\2\2\u01a5\u019d\3\2\2\2\u01a5\u019e\3\2"+
		"\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5"+
		"\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6-\3\2\2\2"+
		"\u01a7\u01ae\5\62\32\2\u01a8\u01ae\5\60\31\2\u01a9\u01ae\5\64\33\2\u01aa"+
		"\u01ae\5\66\34\2\u01ab\u01ae\5:\36\2\u01ac\u01ae\5<\37\2\u01ad\u01a7\3"+
		"\2\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae/\3\2\2\2\u01af\u01b0\5\u00c4"+
		"c\2\u01b0\61\3\2\2\2\u01b1\u01b2\5\u00c4c\2\u01b2\u01b3\7\20\2\2\u01b3"+
		"\u01b4\5\u00c4c\2\u01b4\63\3\2\2\2\u01b5\u01b6\5\u00c4c\2\u01b6\u01b7"+
		"\t\3\2\2\u01b7\65\3\2\2\2\u01b8\u01b9\5\26\f\2\u01b9\u01ba\58\35\2\u01ba"+
		"\u01bb\5\26\f\2\u01bb\67\3\2\2\2\u01bc\u01be\t\4\2\2\u01bd\u01bc\3\2\2"+
		"\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7\t\2\2\u01c09"+
		"\3\2\2\2\u01c1\u01c2\5\24\13\2\u01c2\u01c3\7\36\2\2\u01c3\u01c4\5\26\f"+
		"\2\u01c4;\3\2\2\2\u01c5\u01c6\7\37\2\2\u01c6=\3\2\2\2\u01c7\u01c8\7@\2"+
		"\2\u01c8\u01c9\7 \2\2\u01c9\u01ca\5,\27\2\u01ca?\3\2\2\2\u01cb\u01cd\7"+
		"!\2\2\u01cc\u01ce\5\26\f\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"A\3\2\2\2\u01cf\u01d1\7\"\2\2\u01d0\u01d2\7@\2\2\u01d1\u01d0\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2C\3\2\2\2\u01d3\u01d5\7#\2\2\u01d4\u01d6\7@\2\2\u01d5"+
		"\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6E\3\2\2\2\u01d7\u01d8\7$\2\2\u01d8"+
		"\u01d9\7@\2\2\u01d9G\3\2\2\2\u01da\u01db\7%\2\2\u01dbI\3\2\2\2\u01dc\u01dd"+
		"\7&\2\2\u01dd\u01de\5\u00c4c\2\u01deK\3\2\2\2\u01df\u01e3\7\'\2\2\u01e0"+
		"\u01e1\5.\30\2\u01e1\u01e2\7\37\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e0\3"+
		"\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\5\u00c4c\2"+
		"\u01e6\u01ec\5(\25\2\u01e7\u01ea\7(\2\2\u01e8\u01eb\5L\'\2\u01e9\u01eb"+
		"\5(\25\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec"+
		"\u01e7\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edM\3\2\2\2\u01ee\u01f1\5P)\2\u01ef"+
		"\u01f1\5V,\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1O\3\2\2\2\u01f2"+
		"\u01f6\7)\2\2\u01f3\u01f4\5.\30\2\u01f4\u01f5\7\37\2\2\u01f5\u01f7\3\2"+
		"\2\2\u01f6\u01f3\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01fa\5\u00c4c\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb"+
		"\3\2\2\2\u01fb\u01ff\7\16\2\2\u01fc\u01fe\5R*\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7\17\2\2\u0203Q\3\2\2\2\u0204\u0205"+
		"\5T+\2\u0205\u0206\7 \2\2\u0206\u0207\5*\26\2\u0207S\3\2\2\2\u0208\u0209"+
		"\7*\2\2\u0209\u020c\5\26\f\2\u020a\u020c\7+\2\2\u020b\u0208\3\2\2\2\u020b"+
		"\u020a\3\2\2\2\u020cU\3\2\2\2\u020d\u0211\7)\2\2\u020e\u020f\5.\30\2\u020f"+
		"\u0210\7\37\2\2\u0210\u0212\3\2\2\2\u0211\u020e\3\2\2\2\u0211\u0212\3"+
		"\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\5X-\2\u0214\u0218\7\16\2\2\u0215"+
		"\u0217\5Z.\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2"+
		"\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c"+
		"\7\17\2\2\u021cW\3\2\2\2\u021d\u021e\7@\2\2\u021e\u0220\7\36\2\2\u021f"+
		"\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\5\u00b4"+
		"[\2\u0222\u0223\7\7\2\2\u0223\u0224\7\5\2\2\u0224\u0225\7\13\2\2\u0225"+
		"\u0226\7\6\2\2\u0226Y\3\2\2\2\u0227\u0228\5\\/\2\u0228\u0229\7 \2\2\u0229"+
		"\u022a\5*\26\2\u022a[\3\2\2\2\u022b\u022c\7*\2\2\u022c\u022f\5^\60\2\u022d"+
		"\u022f\7+\2\2\u022e\u022b\3\2\2\2\u022e\u022d\3\2\2\2\u022f]\3\2\2\2\u0230"+
		"\u0235\5p9\2\u0231\u0232\7\n\2\2\u0232\u0234\5p9\2\u0233\u0231\3\2\2\2"+
		"\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236_\3"+
		"\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239\7,\2\2\u0239\u023d\7\16\2\2\u023a"+
		"\u023c\5b\62\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0241\7\17\2\2\u0241a\3\2\2\2\u0242\u0243\5d\63\2\u0243\u0244\7 \2\2"+
		"\u0244\u0245\5*\26\2\u0245c\3\2\2\2\u0246\u0249\7*\2\2\u0247\u024a\5\62"+
		"\32\2\u0248\u024a\5f\64\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2\u024a"+
		"\u024d\3\2\2\2\u024b\u024d\7+\2\2\u024c\u0246\3\2\2\2\u024c\u024b\3\2"+
		"\2\2\u024de\3\2\2\2\u024e\u024f\5\26\f\2\u024f\u0250\7\t\2\2\u0250\u0255"+
		"\3\2\2\2\u0251\u0252\5\24\13\2\u0252\u0253\7\36\2\2\u0253\u0255\3\2\2"+
		"\2\u0254\u024e\3\2\2\2\u0254\u0251\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0257\5\u00c4c\2\u0257g\3\2\2\2\u0258\u025c\7-\2\2\u0259"+
		"\u025d\5\u00c4c\2\u025a\u025d\5j\66\2\u025b\u025d\5l\67\2\u025c\u0259"+
		"\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u025f\5(\25\2\u025fi\3\2\2\2\u0260\u0262\5.\30\2"+
		"\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265"+
		"\7\37\2\2\u0264\u0266\5\u00c4c\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2"+
		"\2\u0266\u0267\3\2\2\2\u0267\u0269\7\37\2\2\u0268\u026a\5.\30\2\u0269"+
		"\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026ak\3\2\2\2\u026b\u026c\5\26\f\2"+
		"\u026c\u026d\7\t\2\2\u026d\u0272\3\2\2\2\u026e\u026f\5\24\13\2\u026f\u0270"+
		"\7\36\2\2\u0270\u0272\3\2\2\2\u0271\u026b\3\2\2\2\u0271\u026e\3\2\2\2"+
		"\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\7.\2\2\u0274\u0275"+
		"\5\u00c4c\2\u0275m\3\2\2\2\u0276\u0277\7/\2\2\u0277\u0278\5\u00c4c\2\u0278"+
		"o\3\2\2\2\u0279\u0280\5r:\2\u027a\u0280\5t;\2\u027b\u027c\7\5\2\2\u027c"+
		"\u027d\5p9\2\u027d\u027e\7\6\2\2\u027e\u0280\3\2\2\2\u027f\u0279\3\2\2"+
		"\2\u027f\u027a\3\2\2\2\u027f\u027b\3\2\2\2\u0280q\3\2\2\2\u0281\u0284"+
		"\7@\2\2\u0282\u0284\5\u009cO\2\u0283\u0281\3\2\2\2\u0283\u0282\3\2\2\2"+
		"\u0284s\3\2\2\2\u0285\u028e\5v<\2\u0286\u028e\5\u00acW\2\u0287\u028e\5"+
		"|?\2\u0288\u028e\5\u0088E\2\u0289\u028e\5~@\2\u028a\u028e\5\u0080A\2\u028b"+
		"\u028e\5\u0082B\2\u028c\u028e\5\u0084C\2\u028d\u0285\3\2\2\2\u028d\u0286"+
		"\3\2\2\2\u028d\u0287\3\2\2\2\u028d\u0288\3\2\2\2\u028d\u0289\3\2\2\2\u028d"+
		"\u028a\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028eu\3\2\2\2"+
		"\u028f\u0290\7\60\2\2\u0290\u0291\5x=\2\u0291\u0292\7\61\2\2\u0292\u0293"+
		"\5z>\2\u0293w\3\2\2\2\u0294\u0295\5\u00c4c\2\u0295y\3\2\2\2\u0296\u0297"+
		"\5p9\2\u0297{\3\2\2\2\u0298\u0299\7\27\2\2\u0299\u029a\5p9\2\u029a}\3"+
		"\2\2\2\u029b\u029c\7\62\2\2\u029c\u02a2\7\16\2\2\u029d\u029e\5\u0086D"+
		"\2\u029e\u029f\5\u00caf\2\u029f\u02a1\3\2\2\2\u02a0\u029d\3\2\2\2\u02a1"+
		"\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2"+
		"\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a6\7\17\2\2\u02a6\177\3\2\2\2\u02a7"+
		"\u02a8\7\60\2\2\u02a8\u02a9\7\61\2\2\u02a9\u02aa\5z>\2\u02aa\u0081\3\2"+
		"\2\2\u02ab\u02ac\7\63\2\2\u02ac\u02ad\7\60\2\2\u02ad\u02ae\5p9\2\u02ae"+
		"\u02af\7\61\2\2\u02af\u02b0\5z>\2\u02b0\u0083\3\2\2\2\u02b1\u02b7\7\64"+
		"\2\2\u02b2\u02b3\7\64\2\2\u02b3\u02b7\7\20\2\2\u02b4\u02b5\7\20\2\2\u02b5"+
		"\u02b7\7\64\2\2\u02b6\u02b1\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b6\u02b4\3"+
		"\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\5z>\2\u02b9\u0085\3\2\2\2\u02ba"+
		"\u02bb\6D\2\2\u02bb\u02bc\7@\2\2\u02bc\u02bd\5\u008eH\2\u02bd\u02be\5"+
		"\u008cG\2\u02be\u02c3\3\2\2\2\u02bf\u02c3\5r:\2\u02c0\u02c1\7@\2\2\u02c1"+
		"\u02c3\5\u008eH\2\u02c2\u02ba\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c2\u02c0"+
		"\3\2\2\2\u02c3\u0087\3\2\2\2\u02c4\u02c5\7\f\2\2\u02c5\u02c6\5\u008aF"+
		"\2\u02c6\u0089\3\2\2\2\u02c7\u02c8\6F\3\2\u02c8\u02c9\5\u008eH\2\u02c9"+
		"\u02ca\5\u008cG\2\u02ca\u02cd\3\2\2\2\u02cb\u02cd\5\u008eH\2\u02cc\u02c7"+
		"\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd\u008b\3\2\2\2\u02ce\u02d1\5\u008eH"+
		"\2\u02cf\u02d1\5p9\2\u02d0\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1\u008d"+
		"\3\2\2\2\u02d2\u02d7\7\5\2\2\u02d3\u02d5\5\u0090I\2\u02d4\u02d6\7\n\2"+
		"\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d3"+
		"\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\7\6\2\2\u02da"+
		"\u008f\3\2\2\2\u02db\u02e0\5\u0092J\2\u02dc\u02dd\7\n\2\2\u02dd\u02df"+
		"\5\u0092J\2\u02de\u02dc\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2"+
		"\2\u02e0\u02e1\3\2\2\2\u02e1\u0091\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e5"+
		"\5\24\13\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2"+
		"\u02e6\u02e8\7\65\2\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9"+
		"\3\2\2\2\u02e9\u02ea\5p9\2\u02ea\u0093\3\2\2\2\u02eb\u02f3\5\u0096L\2"+
		"\u02ec\u02f3\5\u009aN\2\u02ed\u02f3\5\u00c0a\2\u02ee\u02ef\7\5\2\2\u02ef"+
		"\u02f0\5\u00c4c\2\u02f0\u02f1\7\6\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02eb"+
		"\3\2\2\2\u02f2\u02ec\3\2\2\2\u02f2\u02ed\3\2\2\2\u02f2\u02ee\3\2\2\2\u02f3"+
		"\u0095\3\2\2\2\u02f4\u02f8\5\u0098M\2\u02f5\u02f8\5\u009eP\2\u02f6\u02f8"+
		"\5\u00b2Z\2\u02f7\u02f4\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f6\3\2\2"+
		"\2\u02f8\u0097\3\2\2\2\u02f9\u02fa\t\5\2\2\u02fa\u0099\3\2\2\2\u02fb\u02fe"+
		"\7@\2\2\u02fc\u02fe\5\u009cO\2\u02fd\u02fb\3\2\2\2\u02fd\u02fc\3\2\2\2"+
		"\u02fe\u009b\3\2\2\2\u02ff\u0300\7@\2\2\u0300\u0301\7\7\2\2\u0301\u0302"+
		"\7@\2\2\u0302\u009d\3\2\2\2\u0303\u0304\5\u00a0Q\2\u0304\u0305\5\u00a2"+
		"R\2\u0305\u009f\3\2\2\2\u0306\u0310\5\u00acW\2\u0307\u0310\5v<\2\u0308"+
		"\u0309\7\60\2\2\u0309\u030a\7\65\2\2\u030a\u030b\7\61\2\2\u030b\u0310"+
		"\5z>\2\u030c\u0310\5\u0080A\2\u030d\u0310\5\u0082B\2\u030e\u0310\5r:\2"+
		"\u030f\u0306\3\2\2\2\u030f\u0307\3\2\2\2\u030f\u0308\3\2\2\2\u030f\u030c"+
		"\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u030e\3\2\2\2\u0310\u00a1\3\2\2\2\u0311"+
		"\u0316\7\16\2\2\u0312\u0314\5\u00a4S\2\u0313\u0315\7\n\2\2\u0314\u0313"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0312\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\7\17\2\2\u0319\u00a3\3"+
		"\2\2\2\u031a\u031f\5\u00a6T\2\u031b\u031c\7\n\2\2\u031c\u031e\5\u00a6"+
		"T\2\u031d\u031b\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u00a5\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0323\5\u00a8"+
		"U\2\u0323\u0324\7 \2\2\u0324\u0326\3\2\2\2\u0325\u0322\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\5\u00aaV\2\u0328\u00a7\3\2\2"+
		"\2\u0329\u032d\7@\2\2\u032a\u032d\5\u00c4c\2\u032b\u032d\5\u00a2R\2\u032c"+
		"\u0329\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032b\3\2\2\2\u032d\u00a9\3\2"+
		"\2\2\u032e\u0331\5\u00c4c\2\u032f\u0331\5\u00a2R\2\u0330\u032e\3\2\2\2"+
		"\u0330\u032f\3\2\2\2\u0331\u00ab\3\2\2\2\u0332\u0333\7\66\2\2\u0333\u0339"+
		"\7\16\2\2\u0334\u0335\5\u00aeX\2\u0335\u0336\5\u00caf\2\u0336\u0338\3"+
		"\2\2\2\u0337\u0334\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339"+
		"\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033d\7\17"+
		"\2\2\u033d\u00ad\3\2\2\2\u033e\u033f\6X\4\2\u033f\u0340\5\24\13\2\u0340"+
		"\u0341\5p9\2\u0341\u0344\3\2\2\2\u0342\u0344\5\u00b0Y\2\u0343\u033e\3"+
		"\2\2\2\u0343\u0342\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u0347\7I\2\2\u0346"+
		"\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u00af\3\2\2\2\u0348\u034a\7\27"+
		"\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034c\5r:\2\u034c\u00b1\3\2\2\2\u034d\u034e\7\f\2\2\u034e\u034f\5\36"+
		"\20\2\u034f\u00b3\3\2\2\2\u0350\u0351\b[\1\2\u0351\u0354\5\u0094K\2\u0352"+
		"\u0354\5\u00c8e\2\u0353\u0350\3\2\2\2\u0353\u0352\3\2\2\2\u0354\u0361"+
		"\3\2\2\2\u0355\u0356\f\7\2\2\u0356\u0360\5\u00b6\\\2\u0357\u0358\f\6\2"+
		"\2\u0358\u0360\5\u00b8]\2\u0359\u035a\f\5\2\2\u035a\u0360\5\u00ba^\2\u035b"+
		"\u035c\f\4\2\2\u035c\u0360\5\u00bc_\2\u035d\u035e\f\3\2\2\u035e\u0360"+
		"\5\u00be`\2\u035f\u0355\3\2\2\2\u035f\u0357\3\2\2\2\u035f\u0359\3\2\2"+
		"\2\u035f\u035b\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f"+
		"\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u00b5\3\2\2\2\u0363\u0361\3\2\2\2\u0364"+
		"\u0365\7\7\2\2\u0365\u0366\7@\2\2\u0366\u00b7\3\2\2\2\u0367\u0368\7\60"+
		"\2\2\u0368\u0369\5\u00c4c\2\u0369\u036a\7\61\2\2\u036a\u00b9\3\2\2\2\u036b"+
		"\u037b\7\60\2\2\u036c\u036e\5\u00c4c\2\u036d\u036c\3\2\2\2\u036d\u036e"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\7 \2\2\u0370\u0372\5\u00c4c\2"+
		"\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u037c\3\2\2\2\u0373\u0375"+
		"\5\u00c4c\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2"+
		"\2\u0376\u0377\7 \2\2\u0377\u0378\5\u00c4c\2\u0378\u0379\7 \2\2\u0379"+
		"\u037a\5\u00c4c\2\u037a\u037c\3\2\2\2\u037b\u036d\3\2\2\2\u037b\u0374"+
		"\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\7\61\2\2\u037e\u00bb\3\2\2\2"+
		"\u037f\u0380\7\7\2\2\u0380\u0381\7\5\2\2\u0381\u0382\5p9\2\u0382\u0383"+
		"\7\6\2\2\u0383\u00bd\3\2\2\2\u0384\u0393\7\5\2\2\u0385\u038c\5\26\f\2"+
		"\u0386\u0389\5p9\2\u0387\u0388\7\n\2\2\u0388\u038a\5\26\f\2\u0389\u0387"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\3\2\2\2\u038b\u0385\3\2\2\2\u038b"+
		"\u0386\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u038f\7\65\2\2\u038e\u038d\3"+
		"\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\3\2\2\2\u0390\u0392\7\n\2\2\u0391"+
		"\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u038b\3\2"+
		"\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\7\6\2\2\u0396"+
		"\u00bf\3\2\2\2\u0397\u0398\5\u00c2b\2\u0398\u0399\7\7\2\2\u0399\u039a"+
		"\7@\2\2\u039a\u00c1\3\2\2\2\u039b\u03a6\5r:\2\u039c\u039d\7\5\2\2\u039d"+
		"\u039e\7\27\2\2\u039e\u039f\5r:\2\u039f\u03a0\7\6\2\2\u03a0\u03a6\3\2"+
		"\2\2\u03a1\u03a2\7\5\2\2\u03a2\u03a3\5\u00c2b\2\u03a3\u03a4\7\6\2\2\u03a4"+
		"\u03a6\3\2\2\2\u03a5\u039b\3\2\2\2\u03a5\u039c\3\2\2\2\u03a5\u03a1\3\2"+
		"\2\2\u03a6\u00c3\3\2\2\2\u03a7\u03a8\bc\1\2\u03a8\u03a9\5\u00c6d\2\u03a9"+
		"\u03af\3\2\2\2\u03aa\u03ab\f\3\2\2\u03ab\u03ac\t\6\2\2\u03ac\u03ae\5\u00c4"+
		"c\4\u03ad\u03aa\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u00c5\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b6\5\u00b4"+
		"[\2\u03b3\u03b4\t\7\2\2\u03b4\u03b6\5\u00c6d\2\u03b5\u03b2\3\2\2\2\u03b5"+
		"\u03b3\3\2\2\2\u03b6\u00c7\3\2\2\2\u03b7\u03b8\5p9\2\u03b8\u03b9\7\5\2"+
		"\2\u03b9\u03bb\5\u00c4c\2\u03ba\u03bc\7\n\2\2\u03bb\u03ba\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\7\6\2\2\u03be\u00c9\3\2"+
		"\2\2\u03bf\u03c5\7\37\2\2\u03c0\u03c5\7\2\2\3\u03c1\u03c5\6f\13\2\u03c2"+
		"\u03c5\6f\f\2\u03c3\u03c5\6f\r\2\u03c4\u03bf\3\2\2\2\u03c4\u03c0\3\2\2"+
		"\2\u03c4\u03c1\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c3\3\2\2\2\u03c5\u00cb"+
		"\3\2\2\2d\u00d6\u00e3\u00eb\u00f8\u0100\u0105\u0112\u0116\u0119\u0122"+
		"\u0127\u0131\u0135\u0139\u013d\u0144\u014c\u0157\u015b\u0164\u016e\u017a"+
		"\u017e\u0184\u0188\u0193\u01a5\u01ad\u01bd\u01cd\u01d1\u01d5\u01e3\u01ea"+
		"\u01ec\u01f0\u01f6\u01f9\u01ff\u020b\u0211\u0218\u021f\u022e\u0235\u023d"+
		"\u0249\u024c\u0254\u025c\u0261\u0265\u0269\u0271\u027f\u0283\u028d\u02a2"+
		"\u02b6\u02c2\u02cc\u02d0\u02d5\u02d7\u02e0\u02e4\u02e7\u02f2\u02f7\u02fd"+
		"\u030f\u0314\u0316\u031f\u0325\u032c\u0330\u0339\u0343\u0346\u0349\u0353"+
		"\u035f\u0361\u036d\u0371\u0374\u037b\u0389\u038b\u038e\u0391\u0393\u03a5"+
		"\u03af\u03b5\u03bb\u03c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}