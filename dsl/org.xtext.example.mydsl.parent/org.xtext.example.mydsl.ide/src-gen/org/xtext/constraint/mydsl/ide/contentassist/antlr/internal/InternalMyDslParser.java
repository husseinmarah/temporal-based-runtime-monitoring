package org.xtext.constraint.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.constraint.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'!='", "'>'", "'<'", "'=<'", "'=>'", "'microseconds'", "'milliseconds'", "'seconds'", "'minute'", "'hour'", "'day'", "'Once'", "'ZeroOrMore'", "'OneOrMore'", "'ZeroOrOne'", "'Initialize:'", "'SimpleConstraint'", "'{'", "'Event'", "'}'", "'RealTimeConstraint'", "'Events'", "'Pattern'", "'ComplexConstraint'", "'DefinePattern'", "'('", "')'", "'Occurs'", "'followed-by'", "'InputEvent'", "'as'", "'and'", "'SetEvent'", "','", "'Occurs-After'", "'@'", "'Occurs-Before'", "'['", "']'", "'With'", "'TimeWindow'", "'.'", "'MaxDuration'", "'MinDuration'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePatternModel"
    // InternalMyDsl.g:53:1: entryRulePatternModel : rulePatternModel EOF ;
    public final void entryRulePatternModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( rulePatternModel EOF )
            // InternalMyDsl.g:55:1: rulePatternModel EOF
            {
             before(grammarAccess.getPatternModelRule()); 
            pushFollow(FOLLOW_1);
            rulePatternModel();

            state._fsp--;

             after(grammarAccess.getPatternModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternModel"


    // $ANTLR start "rulePatternModel"
    // InternalMyDsl.g:62:1: rulePatternModel : ( ( rule__PatternModel__Alternatives ) ) ;
    public final void rulePatternModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__PatternModel__Alternatives ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__PatternModel__Alternatives ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__PatternModel__Alternatives ) )
            // InternalMyDsl.g:68:3: ( rule__PatternModel__Alternatives )
            {
             before(grammarAccess.getPatternModelAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__PatternModel__Alternatives )
            // InternalMyDsl.g:69:4: rule__PatternModel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PatternModel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternModel"


    // $ANTLR start "entryRuleQueryInitialization"
    // InternalMyDsl.g:78:1: entryRuleQueryInitialization : ruleQueryInitialization EOF ;
    public final void entryRuleQueryInitialization() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleQueryInitialization EOF )
            // InternalMyDsl.g:80:1: ruleQueryInitialization EOF
            {
             before(grammarAccess.getQueryInitializationRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryInitialization();

            state._fsp--;

             after(grammarAccess.getQueryInitializationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryInitialization"


    // $ANTLR start "ruleQueryInitialization"
    // InternalMyDsl.g:87:1: ruleQueryInitialization : ( ( rule__QueryInitialization__Group__0 ) ) ;
    public final void ruleQueryInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__QueryInitialization__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__QueryInitialization__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__QueryInitialization__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__QueryInitialization__Group__0 )
            {
             before(grammarAccess.getQueryInitializationAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__QueryInitialization__Group__0 )
            // InternalMyDsl.g:94:4: rule__QueryInitialization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryInitializationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryInitialization"


    // $ANTLR start "entryRulePatternInitialization"
    // InternalMyDsl.g:103:1: entryRulePatternInitialization : rulePatternInitialization EOF ;
    public final void entryRulePatternInitialization() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePatternInitialization EOF )
            // InternalMyDsl.g:105:1: rulePatternInitialization EOF
            {
             before(grammarAccess.getPatternInitializationRule()); 
            pushFollow(FOLLOW_1);
            rulePatternInitialization();

            state._fsp--;

             after(grammarAccess.getPatternInitializationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternInitialization"


    // $ANTLR start "rulePatternInitialization"
    // InternalMyDsl.g:112:1: rulePatternInitialization : ( ( rule__PatternInitialization__Group__0 ) ) ;
    public final void rulePatternInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__PatternInitialization__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__PatternInitialization__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__PatternInitialization__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__PatternInitialization__Group__0 )
            {
             before(grammarAccess.getPatternInitializationAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__PatternInitialization__Group__0 )
            // InternalMyDsl.g:119:4: rule__PatternInitialization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternInitializationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternInitialization"


    // $ANTLR start "entryRuleComplexInitialization"
    // InternalMyDsl.g:128:1: entryRuleComplexInitialization : ruleComplexInitialization EOF ;
    public final void entryRuleComplexInitialization() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleComplexInitialization EOF )
            // InternalMyDsl.g:130:1: ruleComplexInitialization EOF
            {
             before(grammarAccess.getComplexInitializationRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexInitialization();

            state._fsp--;

             after(grammarAccess.getComplexInitializationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexInitialization"


    // $ANTLR start "ruleComplexInitialization"
    // InternalMyDsl.g:137:1: ruleComplexInitialization : ( ( rule__ComplexInitialization__Group__0 ) ) ;
    public final void ruleComplexInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ComplexInitialization__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ComplexInitialization__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ComplexInitialization__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__ComplexInitialization__Group__0 )
            {
             before(grammarAccess.getComplexInitializationAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ComplexInitialization__Group__0 )
            // InternalMyDsl.g:144:4: rule__ComplexInitialization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexInitializationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexInitialization"


    // $ANTLR start "entryRuleComplexPatternStatements"
    // InternalMyDsl.g:153:1: entryRuleComplexPatternStatements : ruleComplexPatternStatements EOF ;
    public final void entryRuleComplexPatternStatements() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleComplexPatternStatements EOF )
            // InternalMyDsl.g:155:1: ruleComplexPatternStatements EOF
            {
             before(grammarAccess.getComplexPatternStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexPatternStatements();

            state._fsp--;

             after(grammarAccess.getComplexPatternStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexPatternStatements"


    // $ANTLR start "ruleComplexPatternStatements"
    // InternalMyDsl.g:162:1: ruleComplexPatternStatements : ( ( rule__ComplexPatternStatements__Group__0 ) ) ;
    public final void ruleComplexPatternStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ComplexPatternStatements__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ComplexPatternStatements__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ComplexPatternStatements__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__ComplexPatternStatements__Group__0 )
            {
             before(grammarAccess.getComplexPatternStatementsAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__ComplexPatternStatements__Group__0 )
            // InternalMyDsl.g:169:4: rule__ComplexPatternStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexPatternStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexPatternStatements"


    // $ANTLR start "entryRuleComplexPatternType"
    // InternalMyDsl.g:178:1: entryRuleComplexPatternType : ruleComplexPatternType EOF ;
    public final void entryRuleComplexPatternType() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleComplexPatternType EOF )
            // InternalMyDsl.g:180:1: ruleComplexPatternType EOF
            {
             before(grammarAccess.getComplexPatternTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexPatternType();

            state._fsp--;

             after(grammarAccess.getComplexPatternTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexPatternType"


    // $ANTLR start "ruleComplexPatternType"
    // InternalMyDsl.g:187:1: ruleComplexPatternType : ( ( rule__ComplexPatternType__Group__0 ) ) ;
    public final void ruleComplexPatternType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ComplexPatternType__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ComplexPatternType__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ComplexPatternType__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__ComplexPatternType__Group__0 )
            {
             before(grammarAccess.getComplexPatternTypeAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__ComplexPatternType__Group__0 )
            // InternalMyDsl.g:194:4: rule__ComplexPatternType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexPatternTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexPatternType"


    // $ANTLR start "entryRuleComplexPatternOptions"
    // InternalMyDsl.g:203:1: entryRuleComplexPatternOptions : ruleComplexPatternOptions EOF ;
    public final void entryRuleComplexPatternOptions() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleComplexPatternOptions EOF )
            // InternalMyDsl.g:205:1: ruleComplexPatternOptions EOF
            {
             before(grammarAccess.getComplexPatternOptionsRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexPatternOptions();

            state._fsp--;

             after(grammarAccess.getComplexPatternOptionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexPatternOptions"


    // $ANTLR start "ruleComplexPatternOptions"
    // InternalMyDsl.g:212:1: ruleComplexPatternOptions : ( ( rule__ComplexPatternOptions__Group__0 ) ) ;
    public final void ruleComplexPatternOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ComplexPatternOptions__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ComplexPatternOptions__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ComplexPatternOptions__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__ComplexPatternOptions__Group__0 )
            {
             before(grammarAccess.getComplexPatternOptionsAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__ComplexPatternOptions__Group__0 )
            // InternalMyDsl.g:219:4: rule__ComplexPatternOptions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternOptions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexPatternOptionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexPatternOptions"


    // $ANTLR start "entryRuleInputStatement"
    // InternalMyDsl.g:228:1: entryRuleInputStatement : ruleInputStatement EOF ;
    public final void entryRuleInputStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleInputStatement EOF )
            // InternalMyDsl.g:230:1: ruleInputStatement EOF
            {
             before(grammarAccess.getInputStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleInputStatement();

            state._fsp--;

             after(grammarAccess.getInputStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputStatement"


    // $ANTLR start "ruleInputStatement"
    // InternalMyDsl.g:237:1: ruleInputStatement : ( ( rule__InputStatement__Group__0 ) ) ;
    public final void ruleInputStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__InputStatement__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__InputStatement__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__InputStatement__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__InputStatement__Group__0 )
            {
             before(grammarAccess.getInputStatementAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__InputStatement__Group__0 )
            // InternalMyDsl.g:244:4: rule__InputStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputStatement"


    // $ANTLR start "entryRulePatternStatement"
    // InternalMyDsl.g:253:1: entryRulePatternStatement : rulePatternStatement EOF ;
    public final void entryRulePatternStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( rulePatternStatement EOF )
            // InternalMyDsl.g:255:1: rulePatternStatement EOF
            {
             before(grammarAccess.getPatternStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePatternStatement();

            state._fsp--;

             after(grammarAccess.getPatternStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternStatement"


    // $ANTLR start "rulePatternStatement"
    // InternalMyDsl.g:262:1: rulePatternStatement : ( ( rule__PatternStatement__Group__0 ) ) ;
    public final void rulePatternStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__PatternStatement__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__PatternStatement__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__PatternStatement__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__PatternStatement__Group__0 )
            {
             before(grammarAccess.getPatternStatementAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__PatternStatement__Group__0 )
            // InternalMyDsl.g:269:4: rule__PatternStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternStatement"


    // $ANTLR start "entryRulePatternType"
    // InternalMyDsl.g:278:1: entryRulePatternType : rulePatternType EOF ;
    public final void entryRulePatternType() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( rulePatternType EOF )
            // InternalMyDsl.g:280:1: rulePatternType EOF
            {
             before(grammarAccess.getPatternTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePatternType();

            state._fsp--;

             after(grammarAccess.getPatternTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternType"


    // $ANTLR start "rulePatternType"
    // InternalMyDsl.g:287:1: rulePatternType : ( ( rule__PatternType__Group__0 ) ) ;
    public final void rulePatternType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__PatternType__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__PatternType__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__PatternType__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__PatternType__Group__0 )
            {
             before(grammarAccess.getPatternTypeAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__PatternType__Group__0 )
            // InternalMyDsl.g:294:4: rule__PatternType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternType"


    // $ANTLR start "entryRulePatternOptions"
    // InternalMyDsl.g:303:1: entryRulePatternOptions : rulePatternOptions EOF ;
    public final void entryRulePatternOptions() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( rulePatternOptions EOF )
            // InternalMyDsl.g:305:1: rulePatternOptions EOF
            {
             before(grammarAccess.getPatternOptionsRule()); 
            pushFollow(FOLLOW_1);
            rulePatternOptions();

            state._fsp--;

             after(grammarAccess.getPatternOptionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternOptions"


    // $ANTLR start "rulePatternOptions"
    // InternalMyDsl.g:312:1: rulePatternOptions : ( ( rule__PatternOptions__Alternatives ) ) ;
    public final void rulePatternOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__PatternOptions__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__PatternOptions__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__PatternOptions__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__PatternOptions__Alternatives )
            {
             before(grammarAccess.getPatternOptionsAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__PatternOptions__Alternatives )
            // InternalMyDsl.g:319:4: rule__PatternOptions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PatternOptions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternOptionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternOptions"


    // $ANTLR start "entryRuleOccurenceAtLeast"
    // InternalMyDsl.g:328:1: entryRuleOccurenceAtLeast : ruleOccurenceAtLeast EOF ;
    public final void entryRuleOccurenceAtLeast() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleOccurenceAtLeast EOF )
            // InternalMyDsl.g:330:1: ruleOccurenceAtLeast EOF
            {
             before(grammarAccess.getOccurenceAtLeastRule()); 
            pushFollow(FOLLOW_1);
            ruleOccurenceAtLeast();

            state._fsp--;

             after(grammarAccess.getOccurenceAtLeastRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOccurenceAtLeast"


    // $ANTLR start "ruleOccurenceAtLeast"
    // InternalMyDsl.g:337:1: ruleOccurenceAtLeast : ( ( rule__OccurenceAtLeast__Group__0 ) ) ;
    public final void ruleOccurenceAtLeast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__OccurenceAtLeast__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__OccurenceAtLeast__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__OccurenceAtLeast__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__OccurenceAtLeast__Group__0 )
            {
             before(grammarAccess.getOccurenceAtLeastAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__OccurenceAtLeast__Group__0 )
            // InternalMyDsl.g:344:4: rule__OccurenceAtLeast__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtLeast__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAtLeastAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOccurenceAtLeast"


    // $ANTLR start "entryRuleOccurenceAtMost"
    // InternalMyDsl.g:353:1: entryRuleOccurenceAtMost : ruleOccurenceAtMost EOF ;
    public final void entryRuleOccurenceAtMost() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleOccurenceAtMost EOF )
            // InternalMyDsl.g:355:1: ruleOccurenceAtMost EOF
            {
             before(grammarAccess.getOccurenceAtMostRule()); 
            pushFollow(FOLLOW_1);
            ruleOccurenceAtMost();

            state._fsp--;

             after(grammarAccess.getOccurenceAtMostRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOccurenceAtMost"


    // $ANTLR start "ruleOccurenceAtMost"
    // InternalMyDsl.g:362:1: ruleOccurenceAtMost : ( ( rule__OccurenceAtMost__Group__0 ) ) ;
    public final void ruleOccurenceAtMost() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__OccurenceAtMost__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__OccurenceAtMost__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__OccurenceAtMost__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__OccurenceAtMost__Group__0 )
            {
             before(grammarAccess.getOccurenceAtMostAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__OccurenceAtMost__Group__0 )
            // InternalMyDsl.g:369:4: rule__OccurenceAtMost__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtMost__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAtMostAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOccurenceAtMost"


    // $ANTLR start "entryRuleOccurenceAtNotSpecificTime"
    // InternalMyDsl.g:378:1: entryRuleOccurenceAtNotSpecificTime : ruleOccurenceAtNotSpecificTime EOF ;
    public final void entryRuleOccurenceAtNotSpecificTime() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleOccurenceAtNotSpecificTime EOF )
            // InternalMyDsl.g:380:1: ruleOccurenceAtNotSpecificTime EOF
            {
             before(grammarAccess.getOccurenceAtNotSpecificTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleOccurenceAtNotSpecificTime();

            state._fsp--;

             after(grammarAccess.getOccurenceAtNotSpecificTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOccurenceAtNotSpecificTime"


    // $ANTLR start "ruleOccurenceAtNotSpecificTime"
    // InternalMyDsl.g:387:1: ruleOccurenceAtNotSpecificTime : ( ( rule__OccurenceAtNotSpecificTime__Group__0 ) ) ;
    public final void ruleOccurenceAtNotSpecificTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__OccurenceAtNotSpecificTime__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__OccurenceAtNotSpecificTime__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__OccurenceAtNotSpecificTime__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__OccurenceAtNotSpecificTime__Group__0 )
            {
             before(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__OccurenceAtNotSpecificTime__Group__0 )
            // InternalMyDsl.g:394:4: rule__OccurenceAtNotSpecificTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtNotSpecificTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOccurenceAtNotSpecificTime"


    // $ANTLR start "entryRuleMaxDuration"
    // InternalMyDsl.g:403:1: entryRuleMaxDuration : ruleMaxDuration EOF ;
    public final void entryRuleMaxDuration() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleMaxDuration EOF )
            // InternalMyDsl.g:405:1: ruleMaxDuration EOF
            {
             before(grammarAccess.getMaxDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxDuration();

            state._fsp--;

             after(grammarAccess.getMaxDurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaxDuration"


    // $ANTLR start "ruleMaxDuration"
    // InternalMyDsl.g:412:1: ruleMaxDuration : ( ( rule__MaxDuration__Group__0 ) ) ;
    public final void ruleMaxDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__MaxDuration__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__MaxDuration__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__MaxDuration__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__MaxDuration__Group__0 )
            {
             before(grammarAccess.getMaxDurationAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__MaxDuration__Group__0 )
            // InternalMyDsl.g:419:4: rule__MaxDuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxDuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxDurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxDuration"


    // $ANTLR start "entryRuleMinDuration"
    // InternalMyDsl.g:428:1: entryRuleMinDuration : ruleMinDuration EOF ;
    public final void entryRuleMinDuration() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleMinDuration EOF )
            // InternalMyDsl.g:430:1: ruleMinDuration EOF
            {
             before(grammarAccess.getMinDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleMinDuration();

            state._fsp--;

             after(grammarAccess.getMinDurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinDuration"


    // $ANTLR start "ruleMinDuration"
    // InternalMyDsl.g:437:1: ruleMinDuration : ( ( rule__MinDuration__Group__0 ) ) ;
    public final void ruleMinDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__MinDuration__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__MinDuration__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__MinDuration__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__MinDuration__Group__0 )
            {
             before(grammarAccess.getMinDurationAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__MinDuration__Group__0 )
            // InternalMyDsl.g:444:4: rule__MinDuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinDuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinDurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinDuration"


    // $ANTLR start "entryRuleTimeWindow"
    // InternalMyDsl.g:453:1: entryRuleTimeWindow : ruleTimeWindow EOF ;
    public final void entryRuleTimeWindow() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleTimeWindow EOF )
            // InternalMyDsl.g:455:1: ruleTimeWindow EOF
            {
             before(grammarAccess.getTimeWindowRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeWindow();

            state._fsp--;

             after(grammarAccess.getTimeWindowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeWindow"


    // $ANTLR start "ruleTimeWindow"
    // InternalMyDsl.g:462:1: ruleTimeWindow : ( ( rule__TimeWindow__Group__0 ) ) ;
    public final void ruleTimeWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__TimeWindow__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__TimeWindow__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__TimeWindow__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__TimeWindow__Group__0 )
            {
             before(grammarAccess.getTimeWindowAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__TimeWindow__Group__0 )
            // InternalMyDsl.g:469:4: rule__TimeWindow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeWindow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeWindowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeWindow"


    // $ANTLR start "entryRuleValueOptions"
    // InternalMyDsl.g:478:1: entryRuleValueOptions : ruleValueOptions EOF ;
    public final void entryRuleValueOptions() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleValueOptions EOF )
            // InternalMyDsl.g:480:1: ruleValueOptions EOF
            {
             before(grammarAccess.getValueOptionsRule()); 
            pushFollow(FOLLOW_1);
            ruleValueOptions();

            state._fsp--;

             after(grammarAccess.getValueOptionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueOptions"


    // $ANTLR start "ruleValueOptions"
    // InternalMyDsl.g:487:1: ruleValueOptions : ( ( rule__ValueOptions__Alternatives ) ) ;
    public final void ruleValueOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__ValueOptions__Alternatives ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__ValueOptions__Alternatives ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__ValueOptions__Alternatives ) )
            // InternalMyDsl.g:493:3: ( rule__ValueOptions__Alternatives )
            {
             before(grammarAccess.getValueOptionsAccess().getAlternatives()); 
            // InternalMyDsl.g:494:3: ( rule__ValueOptions__Alternatives )
            // InternalMyDsl.g:494:4: rule__ValueOptions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueOptions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueOptionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueOptions"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyDsl.g:503:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleStringLiteral EOF )
            // InternalMyDsl.g:505:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyDsl.g:512:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalMyDsl.g:518:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalMyDsl.g:519:3: ( rule__StringLiteral__ValueAssignment )
            // InternalMyDsl.g:519:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMyDsl.g:528:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleNumberLiteral EOF )
            // InternalMyDsl.g:530:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMyDsl.g:537:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__NumberLiteral__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__NumberLiteral__Group__0 )
            // InternalMyDsl.g:544:4: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleTextLiteral"
    // InternalMyDsl.g:553:1: entryRuleTextLiteral : ruleTextLiteral EOF ;
    public final void entryRuleTextLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleTextLiteral EOF )
            // InternalMyDsl.g:555:1: ruleTextLiteral EOF
            {
             before(grammarAccess.getTextLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleTextLiteral();

            state._fsp--;

             after(grammarAccess.getTextLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextLiteral"


    // $ANTLR start "ruleTextLiteral"
    // InternalMyDsl.g:562:1: ruleTextLiteral : ( ( rule__TextLiteral__ValueAssignment ) ) ;
    public final void ruleTextLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__TextLiteral__ValueAssignment ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__TextLiteral__ValueAssignment ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__TextLiteral__ValueAssignment ) )
            // InternalMyDsl.g:568:3: ( rule__TextLiteral__ValueAssignment )
            {
             before(grammarAccess.getTextLiteralAccess().getValueAssignment()); 
            // InternalMyDsl.g:569:3: ( rule__TextLiteral__ValueAssignment )
            // InternalMyDsl.g:569:4: rule__TextLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TextLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextLiteral"


    // $ANTLR start "ruleComparisonOperator"
    // InternalMyDsl.g:578:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalMyDsl.g:583:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalMyDsl.g:583:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalMyDsl.g:584:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:585:3: ( rule__ComparisonOperator__Alternatives )
            // InternalMyDsl.g:585:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleTimeUnit"
    // InternalMyDsl.g:594:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalMyDsl.g:599:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalMyDsl.g:599:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalMyDsl.g:600:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalMyDsl.g:601:3: ( rule__TimeUnit__Alternatives )
            // InternalMyDsl.g:601:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleGreedyQuantifiers"
    // InternalMyDsl.g:610:1: ruleGreedyQuantifiers : ( ( rule__GreedyQuantifiers__Alternatives ) ) ;
    public final void ruleGreedyQuantifiers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( ( ( rule__GreedyQuantifiers__Alternatives ) ) )
            // InternalMyDsl.g:615:2: ( ( rule__GreedyQuantifiers__Alternatives ) )
            {
            // InternalMyDsl.g:615:2: ( ( rule__GreedyQuantifiers__Alternatives ) )
            // InternalMyDsl.g:616:3: ( rule__GreedyQuantifiers__Alternatives )
            {
             before(grammarAccess.getGreedyQuantifiersAccess().getAlternatives()); 
            // InternalMyDsl.g:617:3: ( rule__GreedyQuantifiers__Alternatives )
            // InternalMyDsl.g:617:4: rule__GreedyQuantifiers__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GreedyQuantifiers__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGreedyQuantifiersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreedyQuantifiers"


    // $ANTLR start "rule__PatternModel__Alternatives"
    // InternalMyDsl.g:625:1: rule__PatternModel__Alternatives : ( ( ( rule__PatternModel__ElementsAssignment_0 ) ) | ( ( rule__PatternModel__ElementsAssignment_1 ) ) | ( ( rule__PatternModel__ElementsAssignment_2 ) ) );
    public final void rule__PatternModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( ( ( rule__PatternModel__ElementsAssignment_0 ) ) | ( ( rule__PatternModel__ElementsAssignment_1 ) ) | ( ( rule__PatternModel__ElementsAssignment_2 ) ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt1=2;
                    }
                    break;
                case 32:
                    {
                    alt1=1;
                    }
                    break;
                case 35:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:630:2: ( ( rule__PatternModel__ElementsAssignment_0 ) )
                    {
                    // InternalMyDsl.g:630:2: ( ( rule__PatternModel__ElementsAssignment_0 ) )
                    // InternalMyDsl.g:631:3: ( rule__PatternModel__ElementsAssignment_0 )
                    {
                     before(grammarAccess.getPatternModelAccess().getElementsAssignment_0()); 
                    // InternalMyDsl.g:632:3: ( rule__PatternModel__ElementsAssignment_0 )
                    // InternalMyDsl.g:632:4: rule__PatternModel__ElementsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternModel__ElementsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternModelAccess().getElementsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:636:2: ( ( rule__PatternModel__ElementsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:636:2: ( ( rule__PatternModel__ElementsAssignment_1 ) )
                    // InternalMyDsl.g:637:3: ( rule__PatternModel__ElementsAssignment_1 )
                    {
                     before(grammarAccess.getPatternModelAccess().getElementsAssignment_1()); 
                    // InternalMyDsl.g:638:3: ( rule__PatternModel__ElementsAssignment_1 )
                    // InternalMyDsl.g:638:4: rule__PatternModel__ElementsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternModel__ElementsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternModelAccess().getElementsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:642:2: ( ( rule__PatternModel__ElementsAssignment_2 ) )
                    {
                    // InternalMyDsl.g:642:2: ( ( rule__PatternModel__ElementsAssignment_2 ) )
                    // InternalMyDsl.g:643:3: ( rule__PatternModel__ElementsAssignment_2 )
                    {
                     before(grammarAccess.getPatternModelAccess().getElementsAssignment_2()); 
                    // InternalMyDsl.g:644:3: ( rule__PatternModel__ElementsAssignment_2 )
                    // InternalMyDsl.g:644:4: rule__PatternModel__ElementsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternModel__ElementsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternModelAccess().getElementsAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternModel__Alternatives"


    // $ANTLR start "rule__PatternOptions__Alternatives"
    // InternalMyDsl.g:652:1: rule__PatternOptions__Alternatives : ( ( ( rule__PatternOptions__OccurenceAtLeastAssignment_0 ) ) | ( ( rule__PatternOptions__OccurenceAtMostAssignment_1 ) ) | ( ( rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2 ) ) );
    public final void rule__PatternOptions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( ( ( rule__PatternOptions__OccurenceAtLeastAssignment_0 ) ) | ( ( rule__PatternOptions__OccurenceAtMostAssignment_1 ) ) | ( ( rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case 38:
                    case 40:
                        {
                        alt2=3;
                        }
                        break;
                    case 48:
                        {
                        alt2=2;
                        }
                        break;
                    case 46:
                        {
                        alt2=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:657:2: ( ( rule__PatternOptions__OccurenceAtLeastAssignment_0 ) )
                    {
                    // InternalMyDsl.g:657:2: ( ( rule__PatternOptions__OccurenceAtLeastAssignment_0 ) )
                    // InternalMyDsl.g:658:3: ( rule__PatternOptions__OccurenceAtLeastAssignment_0 )
                    {
                     before(grammarAccess.getPatternOptionsAccess().getOccurenceAtLeastAssignment_0()); 
                    // InternalMyDsl.g:659:3: ( rule__PatternOptions__OccurenceAtLeastAssignment_0 )
                    // InternalMyDsl.g:659:4: rule__PatternOptions__OccurenceAtLeastAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternOptions__OccurenceAtLeastAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternOptionsAccess().getOccurenceAtLeastAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:663:2: ( ( rule__PatternOptions__OccurenceAtMostAssignment_1 ) )
                    {
                    // InternalMyDsl.g:663:2: ( ( rule__PatternOptions__OccurenceAtMostAssignment_1 ) )
                    // InternalMyDsl.g:664:3: ( rule__PatternOptions__OccurenceAtMostAssignment_1 )
                    {
                     before(grammarAccess.getPatternOptionsAccess().getOccurenceAtMostAssignment_1()); 
                    // InternalMyDsl.g:665:3: ( rule__PatternOptions__OccurenceAtMostAssignment_1 )
                    // InternalMyDsl.g:665:4: rule__PatternOptions__OccurenceAtMostAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternOptions__OccurenceAtMostAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternOptionsAccess().getOccurenceAtMostAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:669:2: ( ( rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2 ) )
                    {
                    // InternalMyDsl.g:669:2: ( ( rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2 ) )
                    // InternalMyDsl.g:670:3: ( rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2 )
                    {
                     before(grammarAccess.getPatternOptionsAccess().getOccurenceAtNotSpecificTimeAssignment_2()); 
                    // InternalMyDsl.g:671:3: ( rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2 )
                    // InternalMyDsl.g:671:4: rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternOptionsAccess().getOccurenceAtNotSpecificTimeAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternOptions__Alternatives"


    // $ANTLR start "rule__ValueOptions__Alternatives"
    // InternalMyDsl.g:679:1: rule__ValueOptions__Alternatives : ( ( ( rule__ValueOptions__StringLiteralAssignment_0 ) ) | ( ( rule__ValueOptions__NumberLiteralAssignment_1 ) ) | ( ( rule__ValueOptions__TextLiteralAssignment_2 ) ) );
    public final void rule__ValueOptions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:683:1: ( ( ( rule__ValueOptions__StringLiteralAssignment_0 ) ) | ( ( rule__ValueOptions__NumberLiteralAssignment_1 ) ) | ( ( rule__ValueOptions__TextLiteralAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:684:2: ( ( rule__ValueOptions__StringLiteralAssignment_0 ) )
                    {
                    // InternalMyDsl.g:684:2: ( ( rule__ValueOptions__StringLiteralAssignment_0 ) )
                    // InternalMyDsl.g:685:3: ( rule__ValueOptions__StringLiteralAssignment_0 )
                    {
                     before(grammarAccess.getValueOptionsAccess().getStringLiteralAssignment_0()); 
                    // InternalMyDsl.g:686:3: ( rule__ValueOptions__StringLiteralAssignment_0 )
                    // InternalMyDsl.g:686:4: rule__ValueOptions__StringLiteralAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueOptions__StringLiteralAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueOptionsAccess().getStringLiteralAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:690:2: ( ( rule__ValueOptions__NumberLiteralAssignment_1 ) )
                    {
                    // InternalMyDsl.g:690:2: ( ( rule__ValueOptions__NumberLiteralAssignment_1 ) )
                    // InternalMyDsl.g:691:3: ( rule__ValueOptions__NumberLiteralAssignment_1 )
                    {
                     before(grammarAccess.getValueOptionsAccess().getNumberLiteralAssignment_1()); 
                    // InternalMyDsl.g:692:3: ( rule__ValueOptions__NumberLiteralAssignment_1 )
                    // InternalMyDsl.g:692:4: rule__ValueOptions__NumberLiteralAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueOptions__NumberLiteralAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueOptionsAccess().getNumberLiteralAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:696:2: ( ( rule__ValueOptions__TextLiteralAssignment_2 ) )
                    {
                    // InternalMyDsl.g:696:2: ( ( rule__ValueOptions__TextLiteralAssignment_2 ) )
                    // InternalMyDsl.g:697:3: ( rule__ValueOptions__TextLiteralAssignment_2 )
                    {
                     before(grammarAccess.getValueOptionsAccess().getTextLiteralAssignment_2()); 
                    // InternalMyDsl.g:698:3: ( rule__ValueOptions__TextLiteralAssignment_2 )
                    // InternalMyDsl.g:698:4: rule__ValueOptions__TextLiteralAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueOptions__TextLiteralAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueOptionsAccess().getTextLiteralAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueOptions__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalMyDsl.g:706:1: rule__ComparisonOperator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=<' ) ) | ( ( '=>' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=<' ) ) | ( ( '=>' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:711:2: ( ( '=' ) )
                    {
                    // InternalMyDsl.g:711:2: ( ( '=' ) )
                    // InternalMyDsl.g:712:3: ( '=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:713:3: ( '=' )
                    // InternalMyDsl.g:713:4: '='
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:717:2: ( ( '!=' ) )
                    {
                    // InternalMyDsl.g:717:2: ( ( '!=' ) )
                    // InternalMyDsl.g:718:3: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:719:3: ( '!=' )
                    // InternalMyDsl.g:719:4: '!='
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:723:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:723:2: ( ( '>' ) )
                    // InternalMyDsl.g:724:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getBiggerThanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:725:3: ( '>' )
                    // InternalMyDsl.g:725:4: '>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getBiggerThanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:729:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:729:2: ( ( '<' ) )
                    // InternalMyDsl.g:730:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThanEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:731:3: ( '<' )
                    // InternalMyDsl.g:731:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLessThanEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:735:2: ( ( '=<' ) )
                    {
                    // InternalMyDsl.g:735:2: ( ( '=<' ) )
                    // InternalMyDsl.g:736:3: ( '=<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:737:3: ( '=<' )
                    // InternalMyDsl.g:737:4: '=<'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:741:2: ( ( '=>' ) )
                    {
                    // InternalMyDsl.g:741:2: ( ( '=>' ) )
                    // InternalMyDsl.g:742:3: ( '=>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getBiggerThanOrEqualEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:743:3: ( '=>' )
                    // InternalMyDsl.g:743:4: '=>'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getBiggerThanOrEqualEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalMyDsl.g:751:1: rule__TimeUnit__Alternatives : ( ( ( 'microseconds' ) ) | ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minute' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( ( 'microseconds' ) ) | ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minute' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:756:2: ( ( 'microseconds' ) )
                    {
                    // InternalMyDsl.g:756:2: ( ( 'microseconds' ) )
                    // InternalMyDsl.g:757:3: ( 'microseconds' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMicroSecondsEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:758:3: ( 'microseconds' )
                    // InternalMyDsl.g:758:4: 'microseconds'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMicroSecondsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:762:2: ( ( 'milliseconds' ) )
                    {
                    // InternalMyDsl.g:762:2: ( ( 'milliseconds' ) )
                    // InternalMyDsl.g:763:3: ( 'milliseconds' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMilliSecondsEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:764:3: ( 'milliseconds' )
                    // InternalMyDsl.g:764:4: 'milliseconds'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMilliSecondsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:768:2: ( ( 'seconds' ) )
                    {
                    // InternalMyDsl.g:768:2: ( ( 'seconds' ) )
                    // InternalMyDsl.g:769:3: ( 'seconds' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:770:3: ( 'seconds' )
                    // InternalMyDsl.g:770:4: 'seconds'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:774:2: ( ( 'minute' ) )
                    {
                    // InternalMyDsl.g:774:2: ( ( 'minute' ) )
                    // InternalMyDsl.g:775:3: ( 'minute' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMinuteEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:776:3: ( 'minute' )
                    // InternalMyDsl.g:776:4: 'minute'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMinuteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:780:2: ( ( 'hour' ) )
                    {
                    // InternalMyDsl.g:780:2: ( ( 'hour' ) )
                    // InternalMyDsl.g:781:3: ( 'hour' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:782:3: ( 'hour' )
                    // InternalMyDsl.g:782:4: 'hour'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:786:2: ( ( 'day' ) )
                    {
                    // InternalMyDsl.g:786:2: ( ( 'day' ) )
                    // InternalMyDsl.g:787:3: ( 'day' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:788:3: ( 'day' )
                    // InternalMyDsl.g:788:4: 'day'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__GreedyQuantifiers__Alternatives"
    // InternalMyDsl.g:796:1: rule__GreedyQuantifiers__Alternatives : ( ( ( 'Once' ) ) | ( ( 'ZeroOrMore' ) ) | ( ( 'OneOrMore' ) ) | ( ( 'ZeroOrOne' ) ) );
    public final void rule__GreedyQuantifiers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( ( 'Once' ) ) | ( ( 'ZeroOrMore' ) ) | ( ( 'OneOrMore' ) ) | ( ( 'ZeroOrOne' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:801:2: ( ( 'Once' ) )
                    {
                    // InternalMyDsl.g:801:2: ( ( 'Once' ) )
                    // InternalMyDsl.g:802:3: ( 'Once' )
                    {
                     before(grammarAccess.getGreedyQuantifiersAccess().getOnceEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:803:3: ( 'Once' )
                    // InternalMyDsl.g:803:4: 'Once'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getGreedyQuantifiersAccess().getOnceEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:807:2: ( ( 'ZeroOrMore' ) )
                    {
                    // InternalMyDsl.g:807:2: ( ( 'ZeroOrMore' ) )
                    // InternalMyDsl.g:808:3: ( 'ZeroOrMore' )
                    {
                     before(grammarAccess.getGreedyQuantifiersAccess().getZeroOrMoreEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:809:3: ( 'ZeroOrMore' )
                    // InternalMyDsl.g:809:4: 'ZeroOrMore'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getGreedyQuantifiersAccess().getZeroOrMoreEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:813:2: ( ( 'OneOrMore' ) )
                    {
                    // InternalMyDsl.g:813:2: ( ( 'OneOrMore' ) )
                    // InternalMyDsl.g:814:3: ( 'OneOrMore' )
                    {
                     before(grammarAccess.getGreedyQuantifiersAccess().getOneOrMoreEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:815:3: ( 'OneOrMore' )
                    // InternalMyDsl.g:815:4: 'OneOrMore'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getGreedyQuantifiersAccess().getOneOrMoreEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:819:2: ( ( 'ZeroOrOne' ) )
                    {
                    // InternalMyDsl.g:819:2: ( ( 'ZeroOrOne' ) )
                    // InternalMyDsl.g:820:3: ( 'ZeroOrOne' )
                    {
                     before(grammarAccess.getGreedyQuantifiersAccess().getZeroOrOneEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:821:3: ( 'ZeroOrOne' )
                    // InternalMyDsl.g:821:4: 'ZeroOrOne'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getGreedyQuantifiersAccess().getZeroOrOneEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedyQuantifiers__Alternatives"


    // $ANTLR start "rule__QueryInitialization__Group__0"
    // InternalMyDsl.g:829:1: rule__QueryInitialization__Group__0 : rule__QueryInitialization__Group__0__Impl rule__QueryInitialization__Group__1 ;
    public final void rule__QueryInitialization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( rule__QueryInitialization__Group__0__Impl rule__QueryInitialization__Group__1 )
            // InternalMyDsl.g:834:2: rule__QueryInitialization__Group__0__Impl rule__QueryInitialization__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QueryInitialization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__0"


    // $ANTLR start "rule__QueryInitialization__Group__0__Impl"
    // InternalMyDsl.g:841:1: rule__QueryInitialization__Group__0__Impl : ( 'Initialize:' ) ;
    public final void rule__QueryInitialization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:845:1: ( ( 'Initialize:' ) )
            // InternalMyDsl.g:846:1: ( 'Initialize:' )
            {
            // InternalMyDsl.g:846:1: ( 'Initialize:' )
            // InternalMyDsl.g:847:2: 'Initialize:'
            {
             before(grammarAccess.getQueryInitializationAccess().getInitializeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQueryInitializationAccess().getInitializeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__0__Impl"


    // $ANTLR start "rule__QueryInitialization__Group__1"
    // InternalMyDsl.g:856:1: rule__QueryInitialization__Group__1 : rule__QueryInitialization__Group__1__Impl rule__QueryInitialization__Group__2 ;
    public final void rule__QueryInitialization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( rule__QueryInitialization__Group__1__Impl rule__QueryInitialization__Group__2 )
            // InternalMyDsl.g:861:2: rule__QueryInitialization__Group__1__Impl rule__QueryInitialization__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__QueryInitialization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__1"


    // $ANTLR start "rule__QueryInitialization__Group__1__Impl"
    // InternalMyDsl.g:868:1: rule__QueryInitialization__Group__1__Impl : ( 'SimpleConstraint' ) ;
    public final void rule__QueryInitialization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( 'SimpleConstraint' ) )
            // InternalMyDsl.g:873:1: ( 'SimpleConstraint' )
            {
            // InternalMyDsl.g:873:1: ( 'SimpleConstraint' )
            // InternalMyDsl.g:874:2: 'SimpleConstraint'
            {
             before(grammarAccess.getQueryInitializationAccess().getSimpleConstraintKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQueryInitializationAccess().getSimpleConstraintKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__1__Impl"


    // $ANTLR start "rule__QueryInitialization__Group__2"
    // InternalMyDsl.g:883:1: rule__QueryInitialization__Group__2 : rule__QueryInitialization__Group__2__Impl rule__QueryInitialization__Group__3 ;
    public final void rule__QueryInitialization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( rule__QueryInitialization__Group__2__Impl rule__QueryInitialization__Group__3 )
            // InternalMyDsl.g:888:2: rule__QueryInitialization__Group__2__Impl rule__QueryInitialization__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__QueryInitialization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__2"


    // $ANTLR start "rule__QueryInitialization__Group__2__Impl"
    // InternalMyDsl.g:895:1: rule__QueryInitialization__Group__2__Impl : ( ( rule__QueryInitialization__NameAssignment_2 ) ) ;
    public final void rule__QueryInitialization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( ( ( rule__QueryInitialization__NameAssignment_2 ) ) )
            // InternalMyDsl.g:900:1: ( ( rule__QueryInitialization__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:900:1: ( ( rule__QueryInitialization__NameAssignment_2 ) )
            // InternalMyDsl.g:901:2: ( rule__QueryInitialization__NameAssignment_2 )
            {
             before(grammarAccess.getQueryInitializationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:902:2: ( rule__QueryInitialization__NameAssignment_2 )
            // InternalMyDsl.g:902:3: rule__QueryInitialization__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QueryInitialization__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryInitializationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__2__Impl"


    // $ANTLR start "rule__QueryInitialization__Group__3"
    // InternalMyDsl.g:910:1: rule__QueryInitialization__Group__3 : rule__QueryInitialization__Group__3__Impl rule__QueryInitialization__Group__4 ;
    public final void rule__QueryInitialization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( rule__QueryInitialization__Group__3__Impl rule__QueryInitialization__Group__4 )
            // InternalMyDsl.g:915:2: rule__QueryInitialization__Group__3__Impl rule__QueryInitialization__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__QueryInitialization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__3"


    // $ANTLR start "rule__QueryInitialization__Group__3__Impl"
    // InternalMyDsl.g:922:1: rule__QueryInitialization__Group__3__Impl : ( ( rule__QueryInitialization__TimeWindowAssignment_3 )? ) ;
    public final void rule__QueryInitialization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:926:1: ( ( ( rule__QueryInitialization__TimeWindowAssignment_3 )? ) )
            // InternalMyDsl.g:927:1: ( ( rule__QueryInitialization__TimeWindowAssignment_3 )? )
            {
            // InternalMyDsl.g:927:1: ( ( rule__QueryInitialization__TimeWindowAssignment_3 )? )
            // InternalMyDsl.g:928:2: ( rule__QueryInitialization__TimeWindowAssignment_3 )?
            {
             before(grammarAccess.getQueryInitializationAccess().getTimeWindowAssignment_3()); 
            // InternalMyDsl.g:929:2: ( rule__QueryInitialization__TimeWindowAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==51) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:929:3: rule__QueryInitialization__TimeWindowAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryInitialization__TimeWindowAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryInitializationAccess().getTimeWindowAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__3__Impl"


    // $ANTLR start "rule__QueryInitialization__Group__4"
    // InternalMyDsl.g:937:1: rule__QueryInitialization__Group__4 : rule__QueryInitialization__Group__4__Impl rule__QueryInitialization__Group__5 ;
    public final void rule__QueryInitialization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( rule__QueryInitialization__Group__4__Impl rule__QueryInitialization__Group__5 )
            // InternalMyDsl.g:942:2: rule__QueryInitialization__Group__4__Impl rule__QueryInitialization__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__QueryInitialization__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__4"


    // $ANTLR start "rule__QueryInitialization__Group__4__Impl"
    // InternalMyDsl.g:949:1: rule__QueryInitialization__Group__4__Impl : ( '{' ) ;
    public final void rule__QueryInitialization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( '{' ) )
            // InternalMyDsl.g:954:1: ( '{' )
            {
            // InternalMyDsl.g:954:1: ( '{' )
            // InternalMyDsl.g:955:2: '{'
            {
             before(grammarAccess.getQueryInitializationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQueryInitializationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__4__Impl"


    // $ANTLR start "rule__QueryInitialization__Group__5"
    // InternalMyDsl.g:964:1: rule__QueryInitialization__Group__5 : rule__QueryInitialization__Group__5__Impl rule__QueryInitialization__Group__6 ;
    public final void rule__QueryInitialization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( rule__QueryInitialization__Group__5__Impl rule__QueryInitialization__Group__6 )
            // InternalMyDsl.g:969:2: rule__QueryInitialization__Group__5__Impl rule__QueryInitialization__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__QueryInitialization__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__5"


    // $ANTLR start "rule__QueryInitialization__Group__5__Impl"
    // InternalMyDsl.g:976:1: rule__QueryInitialization__Group__5__Impl : ( 'Event' ) ;
    public final void rule__QueryInitialization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( ( 'Event' ) )
            // InternalMyDsl.g:981:1: ( 'Event' )
            {
            // InternalMyDsl.g:981:1: ( 'Event' )
            // InternalMyDsl.g:982:2: 'Event'
            {
             before(grammarAccess.getQueryInitializationAccess().getEventKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQueryInitializationAccess().getEventKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__5__Impl"


    // $ANTLR start "rule__QueryInitialization__Group__6"
    // InternalMyDsl.g:991:1: rule__QueryInitialization__Group__6 : rule__QueryInitialization__Group__6__Impl rule__QueryInitialization__Group__7 ;
    public final void rule__QueryInitialization__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( rule__QueryInitialization__Group__6__Impl rule__QueryInitialization__Group__7 )
            // InternalMyDsl.g:996:2: rule__QueryInitialization__Group__6__Impl rule__QueryInitialization__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__QueryInitialization__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__6"


    // $ANTLR start "rule__QueryInitialization__Group__6__Impl"
    // InternalMyDsl.g:1003:1: rule__QueryInitialization__Group__6__Impl : ( '{' ) ;
    public final void rule__QueryInitialization__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( ( '{' ) )
            // InternalMyDsl.g:1008:1: ( '{' )
            {
            // InternalMyDsl.g:1008:1: ( '{' )
            // InternalMyDsl.g:1009:2: '{'
            {
             before(grammarAccess.getQueryInitializationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQueryInitializationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__6__Impl"


    // $ANTLR start "rule__QueryInitialization__Group__7"
    // InternalMyDsl.g:1018:1: rule__QueryInitialization__Group__7 : rule__QueryInitialization__Group__7__Impl rule__QueryInitialization__Group__8 ;
    public final void rule__QueryInitialization__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( rule__QueryInitialization__Group__7__Impl rule__QueryInitialization__Group__8 )
            // InternalMyDsl.g:1023:2: rule__QueryInitialization__Group__7__Impl rule__QueryInitialization__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__QueryInitialization__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__7"


    // $ANTLR start "rule__QueryInitialization__Group__7__Impl"
    // InternalMyDsl.g:1030:1: rule__QueryInitialization__Group__7__Impl : ( ( rule__QueryInitialization__InputStatementsAssignment_7 ) ) ;
    public final void rule__QueryInitialization__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( ( ( rule__QueryInitialization__InputStatementsAssignment_7 ) ) )
            // InternalMyDsl.g:1035:1: ( ( rule__QueryInitialization__InputStatementsAssignment_7 ) )
            {
            // InternalMyDsl.g:1035:1: ( ( rule__QueryInitialization__InputStatementsAssignment_7 ) )
            // InternalMyDsl.g:1036:2: ( rule__QueryInitialization__InputStatementsAssignment_7 )
            {
             before(grammarAccess.getQueryInitializationAccess().getInputStatementsAssignment_7()); 
            // InternalMyDsl.g:1037:2: ( rule__QueryInitialization__InputStatementsAssignment_7 )
            // InternalMyDsl.g:1037:3: rule__QueryInitialization__InputStatementsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__QueryInitialization__InputStatementsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getQueryInitializationAccess().getInputStatementsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__7__Impl"


    // $ANTLR start "rule__QueryInitialization__Group__8"
    // InternalMyDsl.g:1045:1: rule__QueryInitialization__Group__8 : rule__QueryInitialization__Group__8__Impl rule__QueryInitialization__Group__9 ;
    public final void rule__QueryInitialization__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( rule__QueryInitialization__Group__8__Impl rule__QueryInitialization__Group__9 )
            // InternalMyDsl.g:1050:2: rule__QueryInitialization__Group__8__Impl rule__QueryInitialization__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__QueryInitialization__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__8"


    // $ANTLR start "rule__QueryInitialization__Group__8__Impl"
    // InternalMyDsl.g:1057:1: rule__QueryInitialization__Group__8__Impl : ( '}' ) ;
    public final void rule__QueryInitialization__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( '}' ) )
            // InternalMyDsl.g:1062:1: ( '}' )
            {
            // InternalMyDsl.g:1062:1: ( '}' )
            // InternalMyDsl.g:1063:2: '}'
            {
             before(grammarAccess.getQueryInitializationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQueryInitializationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__8__Impl"


    // $ANTLR start "rule__QueryInitialization__Group__9"
    // InternalMyDsl.g:1072:1: rule__QueryInitialization__Group__9 : rule__QueryInitialization__Group__9__Impl ;
    public final void rule__QueryInitialization__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( rule__QueryInitialization__Group__9__Impl )
            // InternalMyDsl.g:1077:2: rule__QueryInitialization__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryInitialization__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__9"


    // $ANTLR start "rule__QueryInitialization__Group__9__Impl"
    // InternalMyDsl.g:1083:1: rule__QueryInitialization__Group__9__Impl : ( '}' ) ;
    public final void rule__QueryInitialization__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( ( '}' ) )
            // InternalMyDsl.g:1088:1: ( '}' )
            {
            // InternalMyDsl.g:1088:1: ( '}' )
            // InternalMyDsl.g:1089:2: '}'
            {
             before(grammarAccess.getQueryInitializationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQueryInitializationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__Group__9__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__0"
    // InternalMyDsl.g:1099:1: rule__PatternInitialization__Group__0 : rule__PatternInitialization__Group__0__Impl rule__PatternInitialization__Group__1 ;
    public final void rule__PatternInitialization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( rule__PatternInitialization__Group__0__Impl rule__PatternInitialization__Group__1 )
            // InternalMyDsl.g:1104:2: rule__PatternInitialization__Group__0__Impl rule__PatternInitialization__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PatternInitialization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__0"


    // $ANTLR start "rule__PatternInitialization__Group__0__Impl"
    // InternalMyDsl.g:1111:1: rule__PatternInitialization__Group__0__Impl : ( 'Initialize:' ) ;
    public final void rule__PatternInitialization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( 'Initialize:' ) )
            // InternalMyDsl.g:1116:1: ( 'Initialize:' )
            {
            // InternalMyDsl.g:1116:1: ( 'Initialize:' )
            // InternalMyDsl.g:1117:2: 'Initialize:'
            {
             before(grammarAccess.getPatternInitializationAccess().getInitializeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getInitializeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__0__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__1"
    // InternalMyDsl.g:1126:1: rule__PatternInitialization__Group__1 : rule__PatternInitialization__Group__1__Impl rule__PatternInitialization__Group__2 ;
    public final void rule__PatternInitialization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( rule__PatternInitialization__Group__1__Impl rule__PatternInitialization__Group__2 )
            // InternalMyDsl.g:1131:2: rule__PatternInitialization__Group__1__Impl rule__PatternInitialization__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PatternInitialization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__1"


    // $ANTLR start "rule__PatternInitialization__Group__1__Impl"
    // InternalMyDsl.g:1138:1: rule__PatternInitialization__Group__1__Impl : ( 'RealTimeConstraint' ) ;
    public final void rule__PatternInitialization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( ( 'RealTimeConstraint' ) )
            // InternalMyDsl.g:1143:1: ( 'RealTimeConstraint' )
            {
            // InternalMyDsl.g:1143:1: ( 'RealTimeConstraint' )
            // InternalMyDsl.g:1144:2: 'RealTimeConstraint'
            {
             before(grammarAccess.getPatternInitializationAccess().getRealTimeConstraintKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getRealTimeConstraintKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__1__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__2"
    // InternalMyDsl.g:1153:1: rule__PatternInitialization__Group__2 : rule__PatternInitialization__Group__2__Impl rule__PatternInitialization__Group__3 ;
    public final void rule__PatternInitialization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( rule__PatternInitialization__Group__2__Impl rule__PatternInitialization__Group__3 )
            // InternalMyDsl.g:1158:2: rule__PatternInitialization__Group__2__Impl rule__PatternInitialization__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PatternInitialization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__2"


    // $ANTLR start "rule__PatternInitialization__Group__2__Impl"
    // InternalMyDsl.g:1165:1: rule__PatternInitialization__Group__2__Impl : ( ( rule__PatternInitialization__NameAssignment_2 ) ) ;
    public final void rule__PatternInitialization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( ( ( rule__PatternInitialization__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1170:1: ( ( rule__PatternInitialization__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1170:1: ( ( rule__PatternInitialization__NameAssignment_2 ) )
            // InternalMyDsl.g:1171:2: ( rule__PatternInitialization__NameAssignment_2 )
            {
             before(grammarAccess.getPatternInitializationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1172:2: ( rule__PatternInitialization__NameAssignment_2 )
            // InternalMyDsl.g:1172:3: rule__PatternInitialization__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternInitialization__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternInitializationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__2__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__3"
    // InternalMyDsl.g:1180:1: rule__PatternInitialization__Group__3 : rule__PatternInitialization__Group__3__Impl rule__PatternInitialization__Group__4 ;
    public final void rule__PatternInitialization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( rule__PatternInitialization__Group__3__Impl rule__PatternInitialization__Group__4 )
            // InternalMyDsl.g:1185:2: rule__PatternInitialization__Group__3__Impl rule__PatternInitialization__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PatternInitialization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__3"


    // $ANTLR start "rule__PatternInitialization__Group__3__Impl"
    // InternalMyDsl.g:1192:1: rule__PatternInitialization__Group__3__Impl : ( ( rule__PatternInitialization__TimeWindowAssignment_3 )? ) ;
    public final void rule__PatternInitialization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( ( ( rule__PatternInitialization__TimeWindowAssignment_3 )? ) )
            // InternalMyDsl.g:1197:1: ( ( rule__PatternInitialization__TimeWindowAssignment_3 )? )
            {
            // InternalMyDsl.g:1197:1: ( ( rule__PatternInitialization__TimeWindowAssignment_3 )? )
            // InternalMyDsl.g:1198:2: ( rule__PatternInitialization__TimeWindowAssignment_3 )?
            {
             before(grammarAccess.getPatternInitializationAccess().getTimeWindowAssignment_3()); 
            // InternalMyDsl.g:1199:2: ( rule__PatternInitialization__TimeWindowAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==51) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1199:3: rule__PatternInitialization__TimeWindowAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternInitialization__TimeWindowAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternInitializationAccess().getTimeWindowAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__3__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__4"
    // InternalMyDsl.g:1207:1: rule__PatternInitialization__Group__4 : rule__PatternInitialization__Group__4__Impl rule__PatternInitialization__Group__5 ;
    public final void rule__PatternInitialization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( rule__PatternInitialization__Group__4__Impl rule__PatternInitialization__Group__5 )
            // InternalMyDsl.g:1212:2: rule__PatternInitialization__Group__4__Impl rule__PatternInitialization__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__PatternInitialization__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__4"


    // $ANTLR start "rule__PatternInitialization__Group__4__Impl"
    // InternalMyDsl.g:1219:1: rule__PatternInitialization__Group__4__Impl : ( '{' ) ;
    public final void rule__PatternInitialization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( ( '{' ) )
            // InternalMyDsl.g:1224:1: ( '{' )
            {
            // InternalMyDsl.g:1224:1: ( '{' )
            // InternalMyDsl.g:1225:2: '{'
            {
             before(grammarAccess.getPatternInitializationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__4__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__5"
    // InternalMyDsl.g:1234:1: rule__PatternInitialization__Group__5 : rule__PatternInitialization__Group__5__Impl rule__PatternInitialization__Group__6 ;
    public final void rule__PatternInitialization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( rule__PatternInitialization__Group__5__Impl rule__PatternInitialization__Group__6 )
            // InternalMyDsl.g:1239:2: rule__PatternInitialization__Group__5__Impl rule__PatternInitialization__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__PatternInitialization__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__5"


    // $ANTLR start "rule__PatternInitialization__Group__5__Impl"
    // InternalMyDsl.g:1246:1: rule__PatternInitialization__Group__5__Impl : ( 'Events' ) ;
    public final void rule__PatternInitialization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( ( 'Events' ) )
            // InternalMyDsl.g:1251:1: ( 'Events' )
            {
            // InternalMyDsl.g:1251:1: ( 'Events' )
            // InternalMyDsl.g:1252:2: 'Events'
            {
             before(grammarAccess.getPatternInitializationAccess().getEventsKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getEventsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__5__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__6"
    // InternalMyDsl.g:1261:1: rule__PatternInitialization__Group__6 : rule__PatternInitialization__Group__6__Impl rule__PatternInitialization__Group__7 ;
    public final void rule__PatternInitialization__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( rule__PatternInitialization__Group__6__Impl rule__PatternInitialization__Group__7 )
            // InternalMyDsl.g:1266:2: rule__PatternInitialization__Group__6__Impl rule__PatternInitialization__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__PatternInitialization__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__6"


    // $ANTLR start "rule__PatternInitialization__Group__6__Impl"
    // InternalMyDsl.g:1273:1: rule__PatternInitialization__Group__6__Impl : ( '{' ) ;
    public final void rule__PatternInitialization__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( ( '{' ) )
            // InternalMyDsl.g:1278:1: ( '{' )
            {
            // InternalMyDsl.g:1278:1: ( '{' )
            // InternalMyDsl.g:1279:2: '{'
            {
             before(grammarAccess.getPatternInitializationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__6__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__7"
    // InternalMyDsl.g:1288:1: rule__PatternInitialization__Group__7 : rule__PatternInitialization__Group__7__Impl rule__PatternInitialization__Group__8 ;
    public final void rule__PatternInitialization__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( rule__PatternInitialization__Group__7__Impl rule__PatternInitialization__Group__8 )
            // InternalMyDsl.g:1293:2: rule__PatternInitialization__Group__7__Impl rule__PatternInitialization__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__PatternInitialization__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__7"


    // $ANTLR start "rule__PatternInitialization__Group__7__Impl"
    // InternalMyDsl.g:1300:1: rule__PatternInitialization__Group__7__Impl : ( ( ( rule__PatternInitialization__InputStatementsAssignment_7 ) ) ( ( rule__PatternInitialization__InputStatementsAssignment_7 )* ) ) ;
    public final void rule__PatternInitialization__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( ( ( ( rule__PatternInitialization__InputStatementsAssignment_7 ) ) ( ( rule__PatternInitialization__InputStatementsAssignment_7 )* ) ) )
            // InternalMyDsl.g:1305:1: ( ( ( rule__PatternInitialization__InputStatementsAssignment_7 ) ) ( ( rule__PatternInitialization__InputStatementsAssignment_7 )* ) )
            {
            // InternalMyDsl.g:1305:1: ( ( ( rule__PatternInitialization__InputStatementsAssignment_7 ) ) ( ( rule__PatternInitialization__InputStatementsAssignment_7 )* ) )
            // InternalMyDsl.g:1306:2: ( ( rule__PatternInitialization__InputStatementsAssignment_7 ) ) ( ( rule__PatternInitialization__InputStatementsAssignment_7 )* )
            {
            // InternalMyDsl.g:1306:2: ( ( rule__PatternInitialization__InputStatementsAssignment_7 ) )
            // InternalMyDsl.g:1307:3: ( rule__PatternInitialization__InputStatementsAssignment_7 )
            {
             before(grammarAccess.getPatternInitializationAccess().getInputStatementsAssignment_7()); 
            // InternalMyDsl.g:1308:3: ( rule__PatternInitialization__InputStatementsAssignment_7 )
            // InternalMyDsl.g:1308:4: rule__PatternInitialization__InputStatementsAssignment_7
            {
            pushFollow(FOLLOW_12);
            rule__PatternInitialization__InputStatementsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPatternInitializationAccess().getInputStatementsAssignment_7()); 

            }

            // InternalMyDsl.g:1311:2: ( ( rule__PatternInitialization__InputStatementsAssignment_7 )* )
            // InternalMyDsl.g:1312:3: ( rule__PatternInitialization__InputStatementsAssignment_7 )*
            {
             before(grammarAccess.getPatternInitializationAccess().getInputStatementsAssignment_7()); 
            // InternalMyDsl.g:1313:3: ( rule__PatternInitialization__InputStatementsAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1313:4: rule__PatternInitialization__InputStatementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PatternInitialization__InputStatementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPatternInitializationAccess().getInputStatementsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__7__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__8"
    // InternalMyDsl.g:1322:1: rule__PatternInitialization__Group__8 : rule__PatternInitialization__Group__8__Impl rule__PatternInitialization__Group__9 ;
    public final void rule__PatternInitialization__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( rule__PatternInitialization__Group__8__Impl rule__PatternInitialization__Group__9 )
            // InternalMyDsl.g:1327:2: rule__PatternInitialization__Group__8__Impl rule__PatternInitialization__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__PatternInitialization__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__8"


    // $ANTLR start "rule__PatternInitialization__Group__8__Impl"
    // InternalMyDsl.g:1334:1: rule__PatternInitialization__Group__8__Impl : ( '}' ) ;
    public final void rule__PatternInitialization__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( ( '}' ) )
            // InternalMyDsl.g:1339:1: ( '}' )
            {
            // InternalMyDsl.g:1339:1: ( '}' )
            // InternalMyDsl.g:1340:2: '}'
            {
             before(grammarAccess.getPatternInitializationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__8__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__9"
    // InternalMyDsl.g:1349:1: rule__PatternInitialization__Group__9 : rule__PatternInitialization__Group__9__Impl rule__PatternInitialization__Group__10 ;
    public final void rule__PatternInitialization__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( rule__PatternInitialization__Group__9__Impl rule__PatternInitialization__Group__10 )
            // InternalMyDsl.g:1354:2: rule__PatternInitialization__Group__9__Impl rule__PatternInitialization__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__PatternInitialization__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__9"


    // $ANTLR start "rule__PatternInitialization__Group__9__Impl"
    // InternalMyDsl.g:1361:1: rule__PatternInitialization__Group__9__Impl : ( 'Pattern' ) ;
    public final void rule__PatternInitialization__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( ( 'Pattern' ) )
            // InternalMyDsl.g:1366:1: ( 'Pattern' )
            {
            // InternalMyDsl.g:1366:1: ( 'Pattern' )
            // InternalMyDsl.g:1367:2: 'Pattern'
            {
             before(grammarAccess.getPatternInitializationAccess().getPatternKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getPatternKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__9__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__10"
    // InternalMyDsl.g:1376:1: rule__PatternInitialization__Group__10 : rule__PatternInitialization__Group__10__Impl rule__PatternInitialization__Group__11 ;
    public final void rule__PatternInitialization__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1380:1: ( rule__PatternInitialization__Group__10__Impl rule__PatternInitialization__Group__11 )
            // InternalMyDsl.g:1381:2: rule__PatternInitialization__Group__10__Impl rule__PatternInitialization__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__PatternInitialization__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__10"


    // $ANTLR start "rule__PatternInitialization__Group__10__Impl"
    // InternalMyDsl.g:1388:1: rule__PatternInitialization__Group__10__Impl : ( '{' ) ;
    public final void rule__PatternInitialization__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( ( '{' ) )
            // InternalMyDsl.g:1393:1: ( '{' )
            {
            // InternalMyDsl.g:1393:1: ( '{' )
            // InternalMyDsl.g:1394:2: '{'
            {
             before(grammarAccess.getPatternInitializationAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__10__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__11"
    // InternalMyDsl.g:1403:1: rule__PatternInitialization__Group__11 : rule__PatternInitialization__Group__11__Impl rule__PatternInitialization__Group__12 ;
    public final void rule__PatternInitialization__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( rule__PatternInitialization__Group__11__Impl rule__PatternInitialization__Group__12 )
            // InternalMyDsl.g:1408:2: rule__PatternInitialization__Group__11__Impl rule__PatternInitialization__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__PatternInitialization__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__11"


    // $ANTLR start "rule__PatternInitialization__Group__11__Impl"
    // InternalMyDsl.g:1415:1: rule__PatternInitialization__Group__11__Impl : ( ( rule__PatternInitialization__PatternStatementsAssignment_11 ) ) ;
    public final void rule__PatternInitialization__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( ( ( rule__PatternInitialization__PatternStatementsAssignment_11 ) ) )
            // InternalMyDsl.g:1420:1: ( ( rule__PatternInitialization__PatternStatementsAssignment_11 ) )
            {
            // InternalMyDsl.g:1420:1: ( ( rule__PatternInitialization__PatternStatementsAssignment_11 ) )
            // InternalMyDsl.g:1421:2: ( rule__PatternInitialization__PatternStatementsAssignment_11 )
            {
             before(grammarAccess.getPatternInitializationAccess().getPatternStatementsAssignment_11()); 
            // InternalMyDsl.g:1422:2: ( rule__PatternInitialization__PatternStatementsAssignment_11 )
            // InternalMyDsl.g:1422:3: rule__PatternInitialization__PatternStatementsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__PatternInitialization__PatternStatementsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPatternInitializationAccess().getPatternStatementsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__11__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__12"
    // InternalMyDsl.g:1430:1: rule__PatternInitialization__Group__12 : rule__PatternInitialization__Group__12__Impl rule__PatternInitialization__Group__13 ;
    public final void rule__PatternInitialization__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( rule__PatternInitialization__Group__12__Impl rule__PatternInitialization__Group__13 )
            // InternalMyDsl.g:1435:2: rule__PatternInitialization__Group__12__Impl rule__PatternInitialization__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__PatternInitialization__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__12"


    // $ANTLR start "rule__PatternInitialization__Group__12__Impl"
    // InternalMyDsl.g:1442:1: rule__PatternInitialization__Group__12__Impl : ( '}' ) ;
    public final void rule__PatternInitialization__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( ( '}' ) )
            // InternalMyDsl.g:1447:1: ( '}' )
            {
            // InternalMyDsl.g:1447:1: ( '}' )
            // InternalMyDsl.g:1448:2: '}'
            {
             before(grammarAccess.getPatternInitializationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__12__Impl"


    // $ANTLR start "rule__PatternInitialization__Group__13"
    // InternalMyDsl.g:1457:1: rule__PatternInitialization__Group__13 : rule__PatternInitialization__Group__13__Impl ;
    public final void rule__PatternInitialization__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( rule__PatternInitialization__Group__13__Impl )
            // InternalMyDsl.g:1462:2: rule__PatternInitialization__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternInitialization__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__13"


    // $ANTLR start "rule__PatternInitialization__Group__13__Impl"
    // InternalMyDsl.g:1468:1: rule__PatternInitialization__Group__13__Impl : ( '}' ) ;
    public final void rule__PatternInitialization__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1472:1: ( ( '}' ) )
            // InternalMyDsl.g:1473:1: ( '}' )
            {
            // InternalMyDsl.g:1473:1: ( '}' )
            // InternalMyDsl.g:1474:2: '}'
            {
             before(grammarAccess.getPatternInitializationAccess().getRightCurlyBracketKeyword_13()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__Group__13__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__0"
    // InternalMyDsl.g:1484:1: rule__ComplexInitialization__Group__0 : rule__ComplexInitialization__Group__0__Impl rule__ComplexInitialization__Group__1 ;
    public final void rule__ComplexInitialization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( rule__ComplexInitialization__Group__0__Impl rule__ComplexInitialization__Group__1 )
            // InternalMyDsl.g:1489:2: rule__ComplexInitialization__Group__0__Impl rule__ComplexInitialization__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ComplexInitialization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__0"


    // $ANTLR start "rule__ComplexInitialization__Group__0__Impl"
    // InternalMyDsl.g:1496:1: rule__ComplexInitialization__Group__0__Impl : ( 'Initialize:' ) ;
    public final void rule__ComplexInitialization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( ( 'Initialize:' ) )
            // InternalMyDsl.g:1501:1: ( 'Initialize:' )
            {
            // InternalMyDsl.g:1501:1: ( 'Initialize:' )
            // InternalMyDsl.g:1502:2: 'Initialize:'
            {
             before(grammarAccess.getComplexInitializationAccess().getInitializeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getInitializeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__0__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__1"
    // InternalMyDsl.g:1511:1: rule__ComplexInitialization__Group__1 : rule__ComplexInitialization__Group__1__Impl rule__ComplexInitialization__Group__2 ;
    public final void rule__ComplexInitialization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( rule__ComplexInitialization__Group__1__Impl rule__ComplexInitialization__Group__2 )
            // InternalMyDsl.g:1516:2: rule__ComplexInitialization__Group__1__Impl rule__ComplexInitialization__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComplexInitialization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__1"


    // $ANTLR start "rule__ComplexInitialization__Group__1__Impl"
    // InternalMyDsl.g:1523:1: rule__ComplexInitialization__Group__1__Impl : ( 'ComplexConstraint' ) ;
    public final void rule__ComplexInitialization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( ( 'ComplexConstraint' ) )
            // InternalMyDsl.g:1528:1: ( 'ComplexConstraint' )
            {
            // InternalMyDsl.g:1528:1: ( 'ComplexConstraint' )
            // InternalMyDsl.g:1529:2: 'ComplexConstraint'
            {
             before(grammarAccess.getComplexInitializationAccess().getComplexConstraintKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getComplexConstraintKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__1__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__2"
    // InternalMyDsl.g:1538:1: rule__ComplexInitialization__Group__2 : rule__ComplexInitialization__Group__2__Impl rule__ComplexInitialization__Group__3 ;
    public final void rule__ComplexInitialization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( rule__ComplexInitialization__Group__2__Impl rule__ComplexInitialization__Group__3 )
            // InternalMyDsl.g:1543:2: rule__ComplexInitialization__Group__2__Impl rule__ComplexInitialization__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComplexInitialization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__2"


    // $ANTLR start "rule__ComplexInitialization__Group__2__Impl"
    // InternalMyDsl.g:1550:1: rule__ComplexInitialization__Group__2__Impl : ( ( rule__ComplexInitialization__NameAssignment_2 ) ) ;
    public final void rule__ComplexInitialization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( ( ( rule__ComplexInitialization__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1555:1: ( ( rule__ComplexInitialization__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1555:1: ( ( rule__ComplexInitialization__NameAssignment_2 ) )
            // InternalMyDsl.g:1556:2: ( rule__ComplexInitialization__NameAssignment_2 )
            {
             before(grammarAccess.getComplexInitializationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1557:2: ( rule__ComplexInitialization__NameAssignment_2 )
            // InternalMyDsl.g:1557:3: rule__ComplexInitialization__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexInitializationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__2__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__3"
    // InternalMyDsl.g:1565:1: rule__ComplexInitialization__Group__3 : rule__ComplexInitialization__Group__3__Impl rule__ComplexInitialization__Group__4 ;
    public final void rule__ComplexInitialization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( rule__ComplexInitialization__Group__3__Impl rule__ComplexInitialization__Group__4 )
            // InternalMyDsl.g:1570:2: rule__ComplexInitialization__Group__3__Impl rule__ComplexInitialization__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ComplexInitialization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__3"


    // $ANTLR start "rule__ComplexInitialization__Group__3__Impl"
    // InternalMyDsl.g:1577:1: rule__ComplexInitialization__Group__3__Impl : ( ( rule__ComplexInitialization__TimeWindowAssignment_3 )? ) ;
    public final void rule__ComplexInitialization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( ( ( rule__ComplexInitialization__TimeWindowAssignment_3 )? ) )
            // InternalMyDsl.g:1582:1: ( ( rule__ComplexInitialization__TimeWindowAssignment_3 )? )
            {
            // InternalMyDsl.g:1582:1: ( ( rule__ComplexInitialization__TimeWindowAssignment_3 )? )
            // InternalMyDsl.g:1583:2: ( rule__ComplexInitialization__TimeWindowAssignment_3 )?
            {
             before(grammarAccess.getComplexInitializationAccess().getTimeWindowAssignment_3()); 
            // InternalMyDsl.g:1584:2: ( rule__ComplexInitialization__TimeWindowAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1584:3: rule__ComplexInitialization__TimeWindowAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexInitialization__TimeWindowAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexInitializationAccess().getTimeWindowAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__3__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__4"
    // InternalMyDsl.g:1592:1: rule__ComplexInitialization__Group__4 : rule__ComplexInitialization__Group__4__Impl rule__ComplexInitialization__Group__5 ;
    public final void rule__ComplexInitialization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( rule__ComplexInitialization__Group__4__Impl rule__ComplexInitialization__Group__5 )
            // InternalMyDsl.g:1597:2: rule__ComplexInitialization__Group__4__Impl rule__ComplexInitialization__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ComplexInitialization__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__4"


    // $ANTLR start "rule__ComplexInitialization__Group__4__Impl"
    // InternalMyDsl.g:1604:1: rule__ComplexInitialization__Group__4__Impl : ( '{' ) ;
    public final void rule__ComplexInitialization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( ( '{' ) )
            // InternalMyDsl.g:1609:1: ( '{' )
            {
            // InternalMyDsl.g:1609:1: ( '{' )
            // InternalMyDsl.g:1610:2: '{'
            {
             before(grammarAccess.getComplexInitializationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__4__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__5"
    // InternalMyDsl.g:1619:1: rule__ComplexInitialization__Group__5 : rule__ComplexInitialization__Group__5__Impl rule__ComplexInitialization__Group__6 ;
    public final void rule__ComplexInitialization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( rule__ComplexInitialization__Group__5__Impl rule__ComplexInitialization__Group__6 )
            // InternalMyDsl.g:1624:2: rule__ComplexInitialization__Group__5__Impl rule__ComplexInitialization__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ComplexInitialization__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__5"


    // $ANTLR start "rule__ComplexInitialization__Group__5__Impl"
    // InternalMyDsl.g:1631:1: rule__ComplexInitialization__Group__5__Impl : ( 'Events' ) ;
    public final void rule__ComplexInitialization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( ( 'Events' ) )
            // InternalMyDsl.g:1636:1: ( 'Events' )
            {
            // InternalMyDsl.g:1636:1: ( 'Events' )
            // InternalMyDsl.g:1637:2: 'Events'
            {
             before(grammarAccess.getComplexInitializationAccess().getEventsKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getEventsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__5__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__6"
    // InternalMyDsl.g:1646:1: rule__ComplexInitialization__Group__6 : rule__ComplexInitialization__Group__6__Impl rule__ComplexInitialization__Group__7 ;
    public final void rule__ComplexInitialization__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( rule__ComplexInitialization__Group__6__Impl rule__ComplexInitialization__Group__7 )
            // InternalMyDsl.g:1651:2: rule__ComplexInitialization__Group__6__Impl rule__ComplexInitialization__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__ComplexInitialization__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__6"


    // $ANTLR start "rule__ComplexInitialization__Group__6__Impl"
    // InternalMyDsl.g:1658:1: rule__ComplexInitialization__Group__6__Impl : ( '{' ) ;
    public final void rule__ComplexInitialization__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( ( '{' ) )
            // InternalMyDsl.g:1663:1: ( '{' )
            {
            // InternalMyDsl.g:1663:1: ( '{' )
            // InternalMyDsl.g:1664:2: '{'
            {
             before(grammarAccess.getComplexInitializationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__6__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__7"
    // InternalMyDsl.g:1673:1: rule__ComplexInitialization__Group__7 : rule__ComplexInitialization__Group__7__Impl rule__ComplexInitialization__Group__8 ;
    public final void rule__ComplexInitialization__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1677:1: ( rule__ComplexInitialization__Group__7__Impl rule__ComplexInitialization__Group__8 )
            // InternalMyDsl.g:1678:2: rule__ComplexInitialization__Group__7__Impl rule__ComplexInitialization__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__ComplexInitialization__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__7"


    // $ANTLR start "rule__ComplexInitialization__Group__7__Impl"
    // InternalMyDsl.g:1685:1: rule__ComplexInitialization__Group__7__Impl : ( ( ( rule__ComplexInitialization__InputStatementsAssignment_7 ) ) ( ( rule__ComplexInitialization__InputStatementsAssignment_7 )* ) ) ;
    public final void rule__ComplexInitialization__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1689:1: ( ( ( ( rule__ComplexInitialization__InputStatementsAssignment_7 ) ) ( ( rule__ComplexInitialization__InputStatementsAssignment_7 )* ) ) )
            // InternalMyDsl.g:1690:1: ( ( ( rule__ComplexInitialization__InputStatementsAssignment_7 ) ) ( ( rule__ComplexInitialization__InputStatementsAssignment_7 )* ) )
            {
            // InternalMyDsl.g:1690:1: ( ( ( rule__ComplexInitialization__InputStatementsAssignment_7 ) ) ( ( rule__ComplexInitialization__InputStatementsAssignment_7 )* ) )
            // InternalMyDsl.g:1691:2: ( ( rule__ComplexInitialization__InputStatementsAssignment_7 ) ) ( ( rule__ComplexInitialization__InputStatementsAssignment_7 )* )
            {
            // InternalMyDsl.g:1691:2: ( ( rule__ComplexInitialization__InputStatementsAssignment_7 ) )
            // InternalMyDsl.g:1692:3: ( rule__ComplexInitialization__InputStatementsAssignment_7 )
            {
             before(grammarAccess.getComplexInitializationAccess().getInputStatementsAssignment_7()); 
            // InternalMyDsl.g:1693:3: ( rule__ComplexInitialization__InputStatementsAssignment_7 )
            // InternalMyDsl.g:1693:4: rule__ComplexInitialization__InputStatementsAssignment_7
            {
            pushFollow(FOLLOW_12);
            rule__ComplexInitialization__InputStatementsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComplexInitializationAccess().getInputStatementsAssignment_7()); 

            }

            // InternalMyDsl.g:1696:2: ( ( rule__ComplexInitialization__InputStatementsAssignment_7 )* )
            // InternalMyDsl.g:1697:3: ( rule__ComplexInitialization__InputStatementsAssignment_7 )*
            {
             before(grammarAccess.getComplexInitializationAccess().getInputStatementsAssignment_7()); 
            // InternalMyDsl.g:1698:3: ( rule__ComplexInitialization__InputStatementsAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1698:4: rule__ComplexInitialization__InputStatementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ComplexInitialization__InputStatementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComplexInitializationAccess().getInputStatementsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__7__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__8"
    // InternalMyDsl.g:1707:1: rule__ComplexInitialization__Group__8 : rule__ComplexInitialization__Group__8__Impl rule__ComplexInitialization__Group__9 ;
    public final void rule__ComplexInitialization__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( rule__ComplexInitialization__Group__8__Impl rule__ComplexInitialization__Group__9 )
            // InternalMyDsl.g:1712:2: rule__ComplexInitialization__Group__8__Impl rule__ComplexInitialization__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__ComplexInitialization__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__8"


    // $ANTLR start "rule__ComplexInitialization__Group__8__Impl"
    // InternalMyDsl.g:1719:1: rule__ComplexInitialization__Group__8__Impl : ( '}' ) ;
    public final void rule__ComplexInitialization__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( ( '}' ) )
            // InternalMyDsl.g:1724:1: ( '}' )
            {
            // InternalMyDsl.g:1724:1: ( '}' )
            // InternalMyDsl.g:1725:2: '}'
            {
             before(grammarAccess.getComplexInitializationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__8__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__9"
    // InternalMyDsl.g:1734:1: rule__ComplexInitialization__Group__9 : rule__ComplexInitialization__Group__9__Impl rule__ComplexInitialization__Group__10 ;
    public final void rule__ComplexInitialization__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( rule__ComplexInitialization__Group__9__Impl rule__ComplexInitialization__Group__10 )
            // InternalMyDsl.g:1739:2: rule__ComplexInitialization__Group__9__Impl rule__ComplexInitialization__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__ComplexInitialization__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__9"


    // $ANTLR start "rule__ComplexInitialization__Group__9__Impl"
    // InternalMyDsl.g:1746:1: rule__ComplexInitialization__Group__9__Impl : ( 'Pattern' ) ;
    public final void rule__ComplexInitialization__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( ( 'Pattern' ) )
            // InternalMyDsl.g:1751:1: ( 'Pattern' )
            {
            // InternalMyDsl.g:1751:1: ( 'Pattern' )
            // InternalMyDsl.g:1752:2: 'Pattern'
            {
             before(grammarAccess.getComplexInitializationAccess().getPatternKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getPatternKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__9__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__10"
    // InternalMyDsl.g:1761:1: rule__ComplexInitialization__Group__10 : rule__ComplexInitialization__Group__10__Impl rule__ComplexInitialization__Group__11 ;
    public final void rule__ComplexInitialization__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( rule__ComplexInitialization__Group__10__Impl rule__ComplexInitialization__Group__11 )
            // InternalMyDsl.g:1766:2: rule__ComplexInitialization__Group__10__Impl rule__ComplexInitialization__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__ComplexInitialization__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__10"


    // $ANTLR start "rule__ComplexInitialization__Group__10__Impl"
    // InternalMyDsl.g:1773:1: rule__ComplexInitialization__Group__10__Impl : ( '{' ) ;
    public final void rule__ComplexInitialization__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( ( '{' ) )
            // InternalMyDsl.g:1778:1: ( '{' )
            {
            // InternalMyDsl.g:1778:1: ( '{' )
            // InternalMyDsl.g:1779:2: '{'
            {
             before(grammarAccess.getComplexInitializationAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__10__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__11"
    // InternalMyDsl.g:1788:1: rule__ComplexInitialization__Group__11 : rule__ComplexInitialization__Group__11__Impl rule__ComplexInitialization__Group__12 ;
    public final void rule__ComplexInitialization__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( rule__ComplexInitialization__Group__11__Impl rule__ComplexInitialization__Group__12 )
            // InternalMyDsl.g:1793:2: rule__ComplexInitialization__Group__11__Impl rule__ComplexInitialization__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__ComplexInitialization__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__11"


    // $ANTLR start "rule__ComplexInitialization__Group__11__Impl"
    // InternalMyDsl.g:1800:1: rule__ComplexInitialization__Group__11__Impl : ( ( rule__ComplexInitialization__ComplexPatternStatementsAssignment_11 ) ) ;
    public final void rule__ComplexInitialization__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( ( ( rule__ComplexInitialization__ComplexPatternStatementsAssignment_11 ) ) )
            // InternalMyDsl.g:1805:1: ( ( rule__ComplexInitialization__ComplexPatternStatementsAssignment_11 ) )
            {
            // InternalMyDsl.g:1805:1: ( ( rule__ComplexInitialization__ComplexPatternStatementsAssignment_11 ) )
            // InternalMyDsl.g:1806:2: ( rule__ComplexInitialization__ComplexPatternStatementsAssignment_11 )
            {
             before(grammarAccess.getComplexInitializationAccess().getComplexPatternStatementsAssignment_11()); 
            // InternalMyDsl.g:1807:2: ( rule__ComplexInitialization__ComplexPatternStatementsAssignment_11 )
            // InternalMyDsl.g:1807:3: rule__ComplexInitialization__ComplexPatternStatementsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__ComplexPatternStatementsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getComplexInitializationAccess().getComplexPatternStatementsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__11__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__12"
    // InternalMyDsl.g:1815:1: rule__ComplexInitialization__Group__12 : rule__ComplexInitialization__Group__12__Impl rule__ComplexInitialization__Group__13 ;
    public final void rule__ComplexInitialization__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( rule__ComplexInitialization__Group__12__Impl rule__ComplexInitialization__Group__13 )
            // InternalMyDsl.g:1820:2: rule__ComplexInitialization__Group__12__Impl rule__ComplexInitialization__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__ComplexInitialization__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__12"


    // $ANTLR start "rule__ComplexInitialization__Group__12__Impl"
    // InternalMyDsl.g:1827:1: rule__ComplexInitialization__Group__12__Impl : ( '}' ) ;
    public final void rule__ComplexInitialization__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( ( '}' ) )
            // InternalMyDsl.g:1832:1: ( '}' )
            {
            // InternalMyDsl.g:1832:1: ( '}' )
            // InternalMyDsl.g:1833:2: '}'
            {
             before(grammarAccess.getComplexInitializationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__12__Impl"


    // $ANTLR start "rule__ComplexInitialization__Group__13"
    // InternalMyDsl.g:1842:1: rule__ComplexInitialization__Group__13 : rule__ComplexInitialization__Group__13__Impl ;
    public final void rule__ComplexInitialization__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( rule__ComplexInitialization__Group__13__Impl )
            // InternalMyDsl.g:1847:2: rule__ComplexInitialization__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexInitialization__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__13"


    // $ANTLR start "rule__ComplexInitialization__Group__13__Impl"
    // InternalMyDsl.g:1853:1: rule__ComplexInitialization__Group__13__Impl : ( '}' ) ;
    public final void rule__ComplexInitialization__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( ( '}' ) )
            // InternalMyDsl.g:1858:1: ( '}' )
            {
            // InternalMyDsl.g:1858:1: ( '}' )
            // InternalMyDsl.g:1859:2: '}'
            {
             before(grammarAccess.getComplexInitializationAccess().getRightCurlyBracketKeyword_13()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__Group__13__Impl"


    // $ANTLR start "rule__ComplexPatternStatements__Group__0"
    // InternalMyDsl.g:1869:1: rule__ComplexPatternStatements__Group__0 : rule__ComplexPatternStatements__Group__0__Impl rule__ComplexPatternStatements__Group__1 ;
    public final void rule__ComplexPatternStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( rule__ComplexPatternStatements__Group__0__Impl rule__ComplexPatternStatements__Group__1 )
            // InternalMyDsl.g:1874:2: rule__ComplexPatternStatements__Group__0__Impl rule__ComplexPatternStatements__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ComplexPatternStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexPatternStatements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternStatements__Group__0"


    // $ANTLR start "rule__ComplexPatternStatements__Group__0__Impl"
    // InternalMyDsl.g:1881:1: rule__ComplexPatternStatements__Group__0__Impl : ( 'DefinePattern' ) ;
    public final void rule__ComplexPatternStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1885:1: ( ( 'DefinePattern' ) )
            // InternalMyDsl.g:1886:1: ( 'DefinePattern' )
            {
            // InternalMyDsl.g:1886:1: ( 'DefinePattern' )
            // InternalMyDsl.g:1887:2: 'DefinePattern'
            {
             before(grammarAccess.getComplexPatternStatementsAccess().getDefinePatternKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComplexPatternStatementsAccess().getDefinePatternKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternStatements__Group__0__Impl"


    // $ANTLR start "rule__ComplexPatternStatements__Group__1"
    // InternalMyDsl.g:1896:1: rule__ComplexPatternStatements__Group__1 : rule__ComplexPatternStatements__Group__1__Impl rule__ComplexPatternStatements__Group__2 ;
    public final void rule__ComplexPatternStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( rule__ComplexPatternStatements__Group__1__Impl rule__ComplexPatternStatements__Group__2 )
            // InternalMyDsl.g:1901:2: rule__ComplexPatternStatements__Group__1__Impl rule__ComplexPatternStatements__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComplexPatternStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexPatternStatements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternStatements__Group__1"


    // $ANTLR start "rule__ComplexPatternStatements__Group__1__Impl"
    // InternalMyDsl.g:1908:1: rule__ComplexPatternStatements__Group__1__Impl : ( '(' ) ;
    public final void rule__ComplexPatternStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( ( '(' ) )
            // InternalMyDsl.g:1913:1: ( '(' )
            {
            // InternalMyDsl.g:1913:1: ( '(' )
            // InternalMyDsl.g:1914:2: '('
            {
             before(grammarAccess.getComplexPatternStatementsAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComplexPatternStatementsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternStatements__Group__1__Impl"


    // $ANTLR start "rule__ComplexPatternStatements__Group__2"
    // InternalMyDsl.g:1923:1: rule__ComplexPatternStatements__Group__2 : rule__ComplexPatternStatements__Group__2__Impl rule__ComplexPatternStatements__Group__3 ;
    public final void rule__ComplexPatternStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( rule__ComplexPatternStatements__Group__2__Impl rule__ComplexPatternStatements__Group__3 )
            // InternalMyDsl.g:1928:2: rule__ComplexPatternStatements__Group__2__Impl rule__ComplexPatternStatements__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ComplexPatternStatements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexPatternStatements__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternStatements__Group__2"


    // $ANTLR start "rule__ComplexPatternStatements__Group__2__Impl"
    // InternalMyDsl.g:1935:1: rule__ComplexPatternStatements__Group__2__Impl : ( ( rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2 ) ) ;
    public final void rule__ComplexPatternStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1939:1: ( ( ( rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2 ) ) )
            // InternalMyDsl.g:1940:1: ( ( rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2 ) )
            {
            // InternalMyDsl.g:1940:1: ( ( rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2 ) )
            // InternalMyDsl.g:1941:2: ( rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2 )
            {
             before(grammarAccess.getComplexPatternStatementsAccess().getComplexPatternTypeAssignment_2()); 
            // InternalMyDsl.g:1942:2: ( rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2 )
            // InternalMyDsl.g:1942:3: rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexPatternStatementsAccess().getComplexPatternTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternStatements__Group__2__Impl"


    // $ANTLR start "rule__ComplexPatternStatements__Group__3"
    // InternalMyDsl.g:1950:1: rule__ComplexPatternStatements__Group__3 : rule__ComplexPatternStatements__Group__3__Impl ;
    public final void rule__ComplexPatternStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( rule__ComplexPatternStatements__Group__3__Impl )
            // InternalMyDsl.g:1955:2: rule__ComplexPatternStatements__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternStatements__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternStatements__Group__3"


    // $ANTLR start "rule__ComplexPatternStatements__Group__3__Impl"
    // InternalMyDsl.g:1961:1: rule__ComplexPatternStatements__Group__3__Impl : ( ')' ) ;
    public final void rule__ComplexPatternStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1965:1: ( ( ')' ) )
            // InternalMyDsl.g:1966:1: ( ')' )
            {
            // InternalMyDsl.g:1966:1: ( ')' )
            // InternalMyDsl.g:1967:2: ')'
            {
             before(grammarAccess.getComplexPatternStatementsAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComplexPatternStatementsAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternStatements__Group__3__Impl"


    // $ANTLR start "rule__ComplexPatternType__Group__0"
    // InternalMyDsl.g:1977:1: rule__ComplexPatternType__Group__0 : rule__ComplexPatternType__Group__0__Impl rule__ComplexPatternType__Group__1 ;
    public final void rule__ComplexPatternType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( rule__ComplexPatternType__Group__0__Impl rule__ComplexPatternType__Group__1 )
            // InternalMyDsl.g:1982:2: rule__ComplexPatternType__Group__0__Impl rule__ComplexPatternType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ComplexPatternType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexPatternType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group__0"


    // $ANTLR start "rule__ComplexPatternType__Group__0__Impl"
    // InternalMyDsl.g:1989:1: rule__ComplexPatternType__Group__0__Impl : ( ( rule__ComplexPatternType__FirstEventAssignment_0 ) ) ;
    public final void rule__ComplexPatternType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( ( ( rule__ComplexPatternType__FirstEventAssignment_0 ) ) )
            // InternalMyDsl.g:1994:1: ( ( rule__ComplexPatternType__FirstEventAssignment_0 ) )
            {
            // InternalMyDsl.g:1994:1: ( ( rule__ComplexPatternType__FirstEventAssignment_0 ) )
            // InternalMyDsl.g:1995:2: ( rule__ComplexPatternType__FirstEventAssignment_0 )
            {
             before(grammarAccess.getComplexPatternTypeAccess().getFirstEventAssignment_0()); 
            // InternalMyDsl.g:1996:2: ( rule__ComplexPatternType__FirstEventAssignment_0 )
            // InternalMyDsl.g:1996:3: rule__ComplexPatternType__FirstEventAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternType__FirstEventAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexPatternTypeAccess().getFirstEventAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group__0__Impl"


    // $ANTLR start "rule__ComplexPatternType__Group__1"
    // InternalMyDsl.g:2004:1: rule__ComplexPatternType__Group__1 : rule__ComplexPatternType__Group__1__Impl rule__ComplexPatternType__Group__2 ;
    public final void rule__ComplexPatternType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( rule__ComplexPatternType__Group__1__Impl rule__ComplexPatternType__Group__2 )
            // InternalMyDsl.g:2009:2: rule__ComplexPatternType__Group__1__Impl rule__ComplexPatternType__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ComplexPatternType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexPatternType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group__1"


    // $ANTLR start "rule__ComplexPatternType__Group__1__Impl"
    // InternalMyDsl.g:2016:1: rule__ComplexPatternType__Group__1__Impl : ( ( rule__ComplexPatternType__Group_1__0 )? ) ;
    public final void rule__ComplexPatternType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( ( ( rule__ComplexPatternType__Group_1__0 )? ) )
            // InternalMyDsl.g:2021:1: ( ( rule__ComplexPatternType__Group_1__0 )? )
            {
            // InternalMyDsl.g:2021:1: ( ( rule__ComplexPatternType__Group_1__0 )? )
            // InternalMyDsl.g:2022:2: ( rule__ComplexPatternType__Group_1__0 )?
            {
             before(grammarAccess.getComplexPatternTypeAccess().getGroup_1()); 
            // InternalMyDsl.g:2023:2: ( rule__ComplexPatternType__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:2023:3: rule__ComplexPatternType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexPatternType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexPatternTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group__1__Impl"


    // $ANTLR start "rule__ComplexPatternType__Group__2"
    // InternalMyDsl.g:2031:1: rule__ComplexPatternType__Group__2 : rule__ComplexPatternType__Group__2__Impl ;
    public final void rule__ComplexPatternType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( rule__ComplexPatternType__Group__2__Impl )
            // InternalMyDsl.g:2036:2: rule__ComplexPatternType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group__2"


    // $ANTLR start "rule__ComplexPatternType__Group__2__Impl"
    // InternalMyDsl.g:2042:1: rule__ComplexPatternType__Group__2__Impl : ( ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 ) ) ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )* ) ) ;
    public final void rule__ComplexPatternType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( ( ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 ) ) ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )* ) ) )
            // InternalMyDsl.g:2047:1: ( ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 ) ) ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )* ) )
            {
            // InternalMyDsl.g:2047:1: ( ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 ) ) ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )* ) )
            // InternalMyDsl.g:2048:2: ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 ) ) ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )* )
            {
            // InternalMyDsl.g:2048:2: ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 ) )
            // InternalMyDsl.g:2049:3: ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )
            {
             before(grammarAccess.getComplexPatternTypeAccess().getComplexPatternOptionsAssignment_2()); 
            // InternalMyDsl.g:2050:3: ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )
            // InternalMyDsl.g:2050:4: rule__ComplexPatternType__ComplexPatternOptionsAssignment_2
            {
            pushFollow(FOLLOW_19);
            rule__ComplexPatternType__ComplexPatternOptionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexPatternTypeAccess().getComplexPatternOptionsAssignment_2()); 

            }

            // InternalMyDsl.g:2053:2: ( ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )* )
            // InternalMyDsl.g:2054:3: ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )*
            {
             before(grammarAccess.getComplexPatternTypeAccess().getComplexPatternOptionsAssignment_2()); 
            // InternalMyDsl.g:2055:3: ( rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2055:4: rule__ComplexPatternType__ComplexPatternOptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ComplexPatternType__ComplexPatternOptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComplexPatternTypeAccess().getComplexPatternOptionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group__2__Impl"


    // $ANTLR start "rule__ComplexPatternType__Group_1__0"
    // InternalMyDsl.g:2065:1: rule__ComplexPatternType__Group_1__0 : rule__ComplexPatternType__Group_1__0__Impl rule__ComplexPatternType__Group_1__1 ;
    public final void rule__ComplexPatternType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( rule__ComplexPatternType__Group_1__0__Impl rule__ComplexPatternType__Group_1__1 )
            // InternalMyDsl.g:2070:2: rule__ComplexPatternType__Group_1__0__Impl rule__ComplexPatternType__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ComplexPatternType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexPatternType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group_1__0"


    // $ANTLR start "rule__ComplexPatternType__Group_1__0__Impl"
    // InternalMyDsl.g:2077:1: rule__ComplexPatternType__Group_1__0__Impl : ( 'Occurs' ) ;
    public final void rule__ComplexPatternType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2081:1: ( ( 'Occurs' ) )
            // InternalMyDsl.g:2082:1: ( 'Occurs' )
            {
            // InternalMyDsl.g:2082:1: ( 'Occurs' )
            // InternalMyDsl.g:2083:2: 'Occurs'
            {
             before(grammarAccess.getComplexPatternTypeAccess().getOccursKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComplexPatternTypeAccess().getOccursKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group_1__0__Impl"


    // $ANTLR start "rule__ComplexPatternType__Group_1__1"
    // InternalMyDsl.g:2092:1: rule__ComplexPatternType__Group_1__1 : rule__ComplexPatternType__Group_1__1__Impl ;
    public final void rule__ComplexPatternType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( rule__ComplexPatternType__Group_1__1__Impl )
            // InternalMyDsl.g:2097:2: rule__ComplexPatternType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group_1__1"


    // $ANTLR start "rule__ComplexPatternType__Group_1__1__Impl"
    // InternalMyDsl.g:2103:1: rule__ComplexPatternType__Group_1__1__Impl : ( ( rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1 ) ) ;
    public final void rule__ComplexPatternType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2107:1: ( ( ( rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1 ) ) )
            // InternalMyDsl.g:2108:1: ( ( rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2108:1: ( ( rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1 ) )
            // InternalMyDsl.g:2109:2: ( rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1 )
            {
             before(grammarAccess.getComplexPatternTypeAccess().getGreedyQuantifiersAssignment_1_1()); 
            // InternalMyDsl.g:2110:2: ( rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1 )
            // InternalMyDsl.g:2110:3: rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexPatternTypeAccess().getGreedyQuantifiersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__Group_1__1__Impl"


    // $ANTLR start "rule__ComplexPatternOptions__Group__0"
    // InternalMyDsl.g:2119:1: rule__ComplexPatternOptions__Group__0 : rule__ComplexPatternOptions__Group__0__Impl rule__ComplexPatternOptions__Group__1 ;
    public final void rule__ComplexPatternOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( rule__ComplexPatternOptions__Group__0__Impl rule__ComplexPatternOptions__Group__1 )
            // InternalMyDsl.g:2124:2: rule__ComplexPatternOptions__Group__0__Impl rule__ComplexPatternOptions__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComplexPatternOptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexPatternOptions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group__0"


    // $ANTLR start "rule__ComplexPatternOptions__Group__0__Impl"
    // InternalMyDsl.g:2131:1: rule__ComplexPatternOptions__Group__0__Impl : ( 'followed-by' ) ;
    public final void rule__ComplexPatternOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( ( 'followed-by' ) )
            // InternalMyDsl.g:2136:1: ( 'followed-by' )
            {
            // InternalMyDsl.g:2136:1: ( 'followed-by' )
            // InternalMyDsl.g:2137:2: 'followed-by'
            {
             before(grammarAccess.getComplexPatternOptionsAccess().getFollowedByKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComplexPatternOptionsAccess().getFollowedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group__0__Impl"


    // $ANTLR start "rule__ComplexPatternOptions__Group__1"
    // InternalMyDsl.g:2146:1: rule__ComplexPatternOptions__Group__1 : rule__ComplexPatternOptions__Group__1__Impl rule__ComplexPatternOptions__Group__2 ;
    public final void rule__ComplexPatternOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( rule__ComplexPatternOptions__Group__1__Impl rule__ComplexPatternOptions__Group__2 )
            // InternalMyDsl.g:2151:2: rule__ComplexPatternOptions__Group__1__Impl rule__ComplexPatternOptions__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ComplexPatternOptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexPatternOptions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group__1"


    // $ANTLR start "rule__ComplexPatternOptions__Group__1__Impl"
    // InternalMyDsl.g:2158:1: rule__ComplexPatternOptions__Group__1__Impl : ( ( rule__ComplexPatternOptions__SeceondEventAssignment_1 ) ) ;
    public final void rule__ComplexPatternOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( ( ( rule__ComplexPatternOptions__SeceondEventAssignment_1 ) ) )
            // InternalMyDsl.g:2163:1: ( ( rule__ComplexPatternOptions__SeceondEventAssignment_1 ) )
            {
            // InternalMyDsl.g:2163:1: ( ( rule__ComplexPatternOptions__SeceondEventAssignment_1 ) )
            // InternalMyDsl.g:2164:2: ( rule__ComplexPatternOptions__SeceondEventAssignment_1 )
            {
             before(grammarAccess.getComplexPatternOptionsAccess().getSeceondEventAssignment_1()); 
            // InternalMyDsl.g:2165:2: ( rule__ComplexPatternOptions__SeceondEventAssignment_1 )
            // InternalMyDsl.g:2165:3: rule__ComplexPatternOptions__SeceondEventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternOptions__SeceondEventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexPatternOptionsAccess().getSeceondEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group__1__Impl"


    // $ANTLR start "rule__ComplexPatternOptions__Group__2"
    // InternalMyDsl.g:2173:1: rule__ComplexPatternOptions__Group__2 : rule__ComplexPatternOptions__Group__2__Impl ;
    public final void rule__ComplexPatternOptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( rule__ComplexPatternOptions__Group__2__Impl )
            // InternalMyDsl.g:2178:2: rule__ComplexPatternOptions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternOptions__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group__2"


    // $ANTLR start "rule__ComplexPatternOptions__Group__2__Impl"
    // InternalMyDsl.g:2184:1: rule__ComplexPatternOptions__Group__2__Impl : ( ( rule__ComplexPatternOptions__Group_2__0 )? ) ;
    public final void rule__ComplexPatternOptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( ( rule__ComplexPatternOptions__Group_2__0 )? ) )
            // InternalMyDsl.g:2189:1: ( ( rule__ComplexPatternOptions__Group_2__0 )? )
            {
            // InternalMyDsl.g:2189:1: ( ( rule__ComplexPatternOptions__Group_2__0 )? )
            // InternalMyDsl.g:2190:2: ( rule__ComplexPatternOptions__Group_2__0 )?
            {
             before(grammarAccess.getComplexPatternOptionsAccess().getGroup_2()); 
            // InternalMyDsl.g:2191:2: ( rule__ComplexPatternOptions__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2191:3: rule__ComplexPatternOptions__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexPatternOptions__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexPatternOptionsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group__2__Impl"


    // $ANTLR start "rule__ComplexPatternOptions__Group_2__0"
    // InternalMyDsl.g:2200:1: rule__ComplexPatternOptions__Group_2__0 : rule__ComplexPatternOptions__Group_2__0__Impl rule__ComplexPatternOptions__Group_2__1 ;
    public final void rule__ComplexPatternOptions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( rule__ComplexPatternOptions__Group_2__0__Impl rule__ComplexPatternOptions__Group_2__1 )
            // InternalMyDsl.g:2205:2: rule__ComplexPatternOptions__Group_2__0__Impl rule__ComplexPatternOptions__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__ComplexPatternOptions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexPatternOptions__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group_2__0"


    // $ANTLR start "rule__ComplexPatternOptions__Group_2__0__Impl"
    // InternalMyDsl.g:2212:1: rule__ComplexPatternOptions__Group_2__0__Impl : ( 'Occurs' ) ;
    public final void rule__ComplexPatternOptions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( ( 'Occurs' ) )
            // InternalMyDsl.g:2217:1: ( 'Occurs' )
            {
            // InternalMyDsl.g:2217:1: ( 'Occurs' )
            // InternalMyDsl.g:2218:2: 'Occurs'
            {
             before(grammarAccess.getComplexPatternOptionsAccess().getOccursKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComplexPatternOptionsAccess().getOccursKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group_2__0__Impl"


    // $ANTLR start "rule__ComplexPatternOptions__Group_2__1"
    // InternalMyDsl.g:2227:1: rule__ComplexPatternOptions__Group_2__1 : rule__ComplexPatternOptions__Group_2__1__Impl ;
    public final void rule__ComplexPatternOptions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( rule__ComplexPatternOptions__Group_2__1__Impl )
            // InternalMyDsl.g:2232:2: rule__ComplexPatternOptions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternOptions__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group_2__1"


    // $ANTLR start "rule__ComplexPatternOptions__Group_2__1__Impl"
    // InternalMyDsl.g:2238:1: rule__ComplexPatternOptions__Group_2__1__Impl : ( ( rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1 ) ) ;
    public final void rule__ComplexPatternOptions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( ( ( rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1 ) ) )
            // InternalMyDsl.g:2243:1: ( ( rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2243:1: ( ( rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1 ) )
            // InternalMyDsl.g:2244:2: ( rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1 )
            {
             before(grammarAccess.getComplexPatternOptionsAccess().getGreedyQuantifiersAssignment_2_1()); 
            // InternalMyDsl.g:2245:2: ( rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1 )
            // InternalMyDsl.g:2245:3: rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexPatternOptionsAccess().getGreedyQuantifiersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__Group_2__1__Impl"


    // $ANTLR start "rule__InputStatement__Group__0"
    // InternalMyDsl.g:2254:1: rule__InputStatement__Group__0 : rule__InputStatement__Group__0__Impl rule__InputStatement__Group__1 ;
    public final void rule__InputStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( rule__InputStatement__Group__0__Impl rule__InputStatement__Group__1 )
            // InternalMyDsl.g:2259:2: rule__InputStatement__Group__0__Impl rule__InputStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InputStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__0"


    // $ANTLR start "rule__InputStatement__Group__0__Impl"
    // InternalMyDsl.g:2266:1: rule__InputStatement__Group__0__Impl : ( 'InputEvent' ) ;
    public final void rule__InputStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( ( 'InputEvent' ) )
            // InternalMyDsl.g:2271:1: ( 'InputEvent' )
            {
            // InternalMyDsl.g:2271:1: ( 'InputEvent' )
            // InternalMyDsl.g:2272:2: 'InputEvent'
            {
             before(grammarAccess.getInputStatementAccess().getInputEventKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInputStatementAccess().getInputEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__0__Impl"


    // $ANTLR start "rule__InputStatement__Group__1"
    // InternalMyDsl.g:2281:1: rule__InputStatement__Group__1 : rule__InputStatement__Group__1__Impl rule__InputStatement__Group__2 ;
    public final void rule__InputStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( rule__InputStatement__Group__1__Impl rule__InputStatement__Group__2 )
            // InternalMyDsl.g:2286:2: rule__InputStatement__Group__1__Impl rule__InputStatement__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__InputStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__1"


    // $ANTLR start "rule__InputStatement__Group__1__Impl"
    // InternalMyDsl.g:2293:1: rule__InputStatement__Group__1__Impl : ( ( rule__InputStatement__NameAssignment_1 ) ) ;
    public final void rule__InputStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2297:1: ( ( ( rule__InputStatement__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2298:1: ( ( rule__InputStatement__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2298:1: ( ( rule__InputStatement__NameAssignment_1 ) )
            // InternalMyDsl.g:2299:2: ( rule__InputStatement__NameAssignment_1 )
            {
             before(grammarAccess.getInputStatementAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2300:2: ( rule__InputStatement__NameAssignment_1 )
            // InternalMyDsl.g:2300:3: rule__InputStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputStatement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__1__Impl"


    // $ANTLR start "rule__InputStatement__Group__2"
    // InternalMyDsl.g:2308:1: rule__InputStatement__Group__2 : rule__InputStatement__Group__2__Impl rule__InputStatement__Group__3 ;
    public final void rule__InputStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( rule__InputStatement__Group__2__Impl rule__InputStatement__Group__3 )
            // InternalMyDsl.g:2313:2: rule__InputStatement__Group__2__Impl rule__InputStatement__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__InputStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__2"


    // $ANTLR start "rule__InputStatement__Group__2__Impl"
    // InternalMyDsl.g:2320:1: rule__InputStatement__Group__2__Impl : ( 'as' ) ;
    public final void rule__InputStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( ( 'as' ) )
            // InternalMyDsl.g:2325:1: ( 'as' )
            {
            // InternalMyDsl.g:2325:1: ( 'as' )
            // InternalMyDsl.g:2326:2: 'as'
            {
             before(grammarAccess.getInputStatementAccess().getAsKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInputStatementAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__2__Impl"


    // $ANTLR start "rule__InputStatement__Group__3"
    // InternalMyDsl.g:2335:1: rule__InputStatement__Group__3 : rule__InputStatement__Group__3__Impl rule__InputStatement__Group__4 ;
    public final void rule__InputStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( rule__InputStatement__Group__3__Impl rule__InputStatement__Group__4 )
            // InternalMyDsl.g:2340:2: rule__InputStatement__Group__3__Impl rule__InputStatement__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__InputStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__3"


    // $ANTLR start "rule__InputStatement__Group__3__Impl"
    // InternalMyDsl.g:2347:1: rule__InputStatement__Group__3__Impl : ( ( rule__InputStatement__PropertyAssignment_3 ) ) ;
    public final void rule__InputStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( ( ( rule__InputStatement__PropertyAssignment_3 ) ) )
            // InternalMyDsl.g:2352:1: ( ( rule__InputStatement__PropertyAssignment_3 ) )
            {
            // InternalMyDsl.g:2352:1: ( ( rule__InputStatement__PropertyAssignment_3 ) )
            // InternalMyDsl.g:2353:2: ( rule__InputStatement__PropertyAssignment_3 )
            {
             before(grammarAccess.getInputStatementAccess().getPropertyAssignment_3()); 
            // InternalMyDsl.g:2354:2: ( rule__InputStatement__PropertyAssignment_3 )
            // InternalMyDsl.g:2354:3: rule__InputStatement__PropertyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputStatement__PropertyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputStatementAccess().getPropertyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__3__Impl"


    // $ANTLR start "rule__InputStatement__Group__4"
    // InternalMyDsl.g:2362:1: rule__InputStatement__Group__4 : rule__InputStatement__Group__4__Impl rule__InputStatement__Group__5 ;
    public final void rule__InputStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( rule__InputStatement__Group__4__Impl rule__InputStatement__Group__5 )
            // InternalMyDsl.g:2367:2: rule__InputStatement__Group__4__Impl rule__InputStatement__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__InputStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__4"


    // $ANTLR start "rule__InputStatement__Group__4__Impl"
    // InternalMyDsl.g:2374:1: rule__InputStatement__Group__4__Impl : ( 'and' ) ;
    public final void rule__InputStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( ( 'and' ) )
            // InternalMyDsl.g:2379:1: ( 'and' )
            {
            // InternalMyDsl.g:2379:1: ( 'and' )
            // InternalMyDsl.g:2380:2: 'and'
            {
             before(grammarAccess.getInputStatementAccess().getAndKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInputStatementAccess().getAndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__4__Impl"


    // $ANTLR start "rule__InputStatement__Group__5"
    // InternalMyDsl.g:2389:1: rule__InputStatement__Group__5 : rule__InputStatement__Group__5__Impl rule__InputStatement__Group__6 ;
    public final void rule__InputStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( rule__InputStatement__Group__5__Impl rule__InputStatement__Group__6 )
            // InternalMyDsl.g:2394:2: rule__InputStatement__Group__5__Impl rule__InputStatement__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__InputStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__5"


    // $ANTLR start "rule__InputStatement__Group__5__Impl"
    // InternalMyDsl.g:2401:1: rule__InputStatement__Group__5__Impl : ( 'SetEvent' ) ;
    public final void rule__InputStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( ( 'SetEvent' ) )
            // InternalMyDsl.g:2406:1: ( 'SetEvent' )
            {
            // InternalMyDsl.g:2406:1: ( 'SetEvent' )
            // InternalMyDsl.g:2407:2: 'SetEvent'
            {
             before(grammarAccess.getInputStatementAccess().getSetEventKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInputStatementAccess().getSetEventKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__5__Impl"


    // $ANTLR start "rule__InputStatement__Group__6"
    // InternalMyDsl.g:2416:1: rule__InputStatement__Group__6 : rule__InputStatement__Group__6__Impl rule__InputStatement__Group__7 ;
    public final void rule__InputStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( rule__InputStatement__Group__6__Impl rule__InputStatement__Group__7 )
            // InternalMyDsl.g:2421:2: rule__InputStatement__Group__6__Impl rule__InputStatement__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__InputStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__6"


    // $ANTLR start "rule__InputStatement__Group__6__Impl"
    // InternalMyDsl.g:2428:1: rule__InputStatement__Group__6__Impl : ( ( rule__InputStatement__ComparisonOperatorAssignment_6 ) ) ;
    public final void rule__InputStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( ( ( rule__InputStatement__ComparisonOperatorAssignment_6 ) ) )
            // InternalMyDsl.g:2433:1: ( ( rule__InputStatement__ComparisonOperatorAssignment_6 ) )
            {
            // InternalMyDsl.g:2433:1: ( ( rule__InputStatement__ComparisonOperatorAssignment_6 ) )
            // InternalMyDsl.g:2434:2: ( rule__InputStatement__ComparisonOperatorAssignment_6 )
            {
             before(grammarAccess.getInputStatementAccess().getComparisonOperatorAssignment_6()); 
            // InternalMyDsl.g:2435:2: ( rule__InputStatement__ComparisonOperatorAssignment_6 )
            // InternalMyDsl.g:2435:3: rule__InputStatement__ComparisonOperatorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InputStatement__ComparisonOperatorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInputStatementAccess().getComparisonOperatorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__6__Impl"


    // $ANTLR start "rule__InputStatement__Group__7"
    // InternalMyDsl.g:2443:1: rule__InputStatement__Group__7 : rule__InputStatement__Group__7__Impl rule__InputStatement__Group__8 ;
    public final void rule__InputStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( rule__InputStatement__Group__7__Impl rule__InputStatement__Group__8 )
            // InternalMyDsl.g:2448:2: rule__InputStatement__Group__7__Impl rule__InputStatement__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__InputStatement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__7"


    // $ANTLR start "rule__InputStatement__Group__7__Impl"
    // InternalMyDsl.g:2455:1: rule__InputStatement__Group__7__Impl : ( ( rule__InputStatement__ValueAssignment_7 ) ) ;
    public final void rule__InputStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( ( ( rule__InputStatement__ValueAssignment_7 ) ) )
            // InternalMyDsl.g:2460:1: ( ( rule__InputStatement__ValueAssignment_7 ) )
            {
            // InternalMyDsl.g:2460:1: ( ( rule__InputStatement__ValueAssignment_7 ) )
            // InternalMyDsl.g:2461:2: ( rule__InputStatement__ValueAssignment_7 )
            {
             before(grammarAccess.getInputStatementAccess().getValueAssignment_7()); 
            // InternalMyDsl.g:2462:2: ( rule__InputStatement__ValueAssignment_7 )
            // InternalMyDsl.g:2462:3: rule__InputStatement__ValueAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__InputStatement__ValueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getInputStatementAccess().getValueAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__7__Impl"


    // $ANTLR start "rule__InputStatement__Group__8"
    // InternalMyDsl.g:2470:1: rule__InputStatement__Group__8 : rule__InputStatement__Group__8__Impl ;
    public final void rule__InputStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( rule__InputStatement__Group__8__Impl )
            // InternalMyDsl.g:2475:2: rule__InputStatement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputStatement__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__8"


    // $ANTLR start "rule__InputStatement__Group__8__Impl"
    // InternalMyDsl.g:2481:1: rule__InputStatement__Group__8__Impl : ( ',' ) ;
    public final void rule__InputStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( ( ',' ) )
            // InternalMyDsl.g:2486:1: ( ',' )
            {
            // InternalMyDsl.g:2486:1: ( ',' )
            // InternalMyDsl.g:2487:2: ','
            {
             before(grammarAccess.getInputStatementAccess().getCommaKeyword_8()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInputStatementAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__Group__8__Impl"


    // $ANTLR start "rule__PatternStatement__Group__0"
    // InternalMyDsl.g:2497:1: rule__PatternStatement__Group__0 : rule__PatternStatement__Group__0__Impl rule__PatternStatement__Group__1 ;
    public final void rule__PatternStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( rule__PatternStatement__Group__0__Impl rule__PatternStatement__Group__1 )
            // InternalMyDsl.g:2502:2: rule__PatternStatement__Group__0__Impl rule__PatternStatement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__PatternStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternStatement__Group__0"


    // $ANTLR start "rule__PatternStatement__Group__0__Impl"
    // InternalMyDsl.g:2509:1: rule__PatternStatement__Group__0__Impl : ( 'DefinePattern' ) ;
    public final void rule__PatternStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2513:1: ( ( 'DefinePattern' ) )
            // InternalMyDsl.g:2514:1: ( 'DefinePattern' )
            {
            // InternalMyDsl.g:2514:1: ( 'DefinePattern' )
            // InternalMyDsl.g:2515:2: 'DefinePattern'
            {
             before(grammarAccess.getPatternStatementAccess().getDefinePatternKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPatternStatementAccess().getDefinePatternKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternStatement__Group__0__Impl"


    // $ANTLR start "rule__PatternStatement__Group__1"
    // InternalMyDsl.g:2524:1: rule__PatternStatement__Group__1 : rule__PatternStatement__Group__1__Impl rule__PatternStatement__Group__2 ;
    public final void rule__PatternStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( rule__PatternStatement__Group__1__Impl rule__PatternStatement__Group__2 )
            // InternalMyDsl.g:2529:2: rule__PatternStatement__Group__1__Impl rule__PatternStatement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PatternStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternStatement__Group__1"


    // $ANTLR start "rule__PatternStatement__Group__1__Impl"
    // InternalMyDsl.g:2536:1: rule__PatternStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__PatternStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( ( '(' ) )
            // InternalMyDsl.g:2541:1: ( '(' )
            {
            // InternalMyDsl.g:2541:1: ( '(' )
            // InternalMyDsl.g:2542:2: '('
            {
             before(grammarAccess.getPatternStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPatternStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternStatement__Group__1__Impl"


    // $ANTLR start "rule__PatternStatement__Group__2"
    // InternalMyDsl.g:2551:1: rule__PatternStatement__Group__2 : rule__PatternStatement__Group__2__Impl rule__PatternStatement__Group__3 ;
    public final void rule__PatternStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( rule__PatternStatement__Group__2__Impl rule__PatternStatement__Group__3 )
            // InternalMyDsl.g:2556:2: rule__PatternStatement__Group__2__Impl rule__PatternStatement__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__PatternStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternStatement__Group__2"


    // $ANTLR start "rule__PatternStatement__Group__2__Impl"
    // InternalMyDsl.g:2563:1: rule__PatternStatement__Group__2__Impl : ( ( rule__PatternStatement__PatternTypeAssignment_2 ) ) ;
    public final void rule__PatternStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( ( ( rule__PatternStatement__PatternTypeAssignment_2 ) ) )
            // InternalMyDsl.g:2568:1: ( ( rule__PatternStatement__PatternTypeAssignment_2 ) )
            {
            // InternalMyDsl.g:2568:1: ( ( rule__PatternStatement__PatternTypeAssignment_2 ) )
            // InternalMyDsl.g:2569:2: ( rule__PatternStatement__PatternTypeAssignment_2 )
            {
             before(grammarAccess.getPatternStatementAccess().getPatternTypeAssignment_2()); 
            // InternalMyDsl.g:2570:2: ( rule__PatternStatement__PatternTypeAssignment_2 )
            // InternalMyDsl.g:2570:3: rule__PatternStatement__PatternTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternStatement__PatternTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternStatementAccess().getPatternTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternStatement__Group__2__Impl"


    // $ANTLR start "rule__PatternStatement__Group__3"
    // InternalMyDsl.g:2578:1: rule__PatternStatement__Group__3 : rule__PatternStatement__Group__3__Impl ;
    public final void rule__PatternStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( rule__PatternStatement__Group__3__Impl )
            // InternalMyDsl.g:2583:2: rule__PatternStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternStatement__Group__3"


    // $ANTLR start "rule__PatternStatement__Group__3__Impl"
    // InternalMyDsl.g:2589:1: rule__PatternStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__PatternStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( ( ')' ) )
            // InternalMyDsl.g:2594:1: ( ')' )
            {
            // InternalMyDsl.g:2594:1: ( ')' )
            // InternalMyDsl.g:2595:2: ')'
            {
             before(grammarAccess.getPatternStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPatternStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternStatement__Group__3__Impl"


    // $ANTLR start "rule__PatternType__Group__0"
    // InternalMyDsl.g:2605:1: rule__PatternType__Group__0 : rule__PatternType__Group__0__Impl rule__PatternType__Group__1 ;
    public final void rule__PatternType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( rule__PatternType__Group__0__Impl rule__PatternType__Group__1 )
            // InternalMyDsl.g:2610:2: rule__PatternType__Group__0__Impl rule__PatternType__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__PatternType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternType__Group__0"


    // $ANTLR start "rule__PatternType__Group__0__Impl"
    // InternalMyDsl.g:2617:1: rule__PatternType__Group__0__Impl : ( ( rule__PatternType__FirstEventAssignment_0 ) ) ;
    public final void rule__PatternType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( ( rule__PatternType__FirstEventAssignment_0 ) ) )
            // InternalMyDsl.g:2622:1: ( ( rule__PatternType__FirstEventAssignment_0 ) )
            {
            // InternalMyDsl.g:2622:1: ( ( rule__PatternType__FirstEventAssignment_0 ) )
            // InternalMyDsl.g:2623:2: ( rule__PatternType__FirstEventAssignment_0 )
            {
             before(grammarAccess.getPatternTypeAccess().getFirstEventAssignment_0()); 
            // InternalMyDsl.g:2624:2: ( rule__PatternType__FirstEventAssignment_0 )
            // InternalMyDsl.g:2624:3: rule__PatternType__FirstEventAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternType__FirstEventAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternTypeAccess().getFirstEventAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternType__Group__0__Impl"


    // $ANTLR start "rule__PatternType__Group__1"
    // InternalMyDsl.g:2632:1: rule__PatternType__Group__1 : rule__PatternType__Group__1__Impl ;
    public final void rule__PatternType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( rule__PatternType__Group__1__Impl )
            // InternalMyDsl.g:2637:2: rule__PatternType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternType__Group__1"


    // $ANTLR start "rule__PatternType__Group__1__Impl"
    // InternalMyDsl.g:2643:1: rule__PatternType__Group__1__Impl : ( ( ( rule__PatternType__PatternOptionsAssignment_1 ) ) ( ( rule__PatternType__PatternOptionsAssignment_1 )* ) ) ;
    public final void rule__PatternType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( ( ( ( rule__PatternType__PatternOptionsAssignment_1 ) ) ( ( rule__PatternType__PatternOptionsAssignment_1 )* ) ) )
            // InternalMyDsl.g:2648:1: ( ( ( rule__PatternType__PatternOptionsAssignment_1 ) ) ( ( rule__PatternType__PatternOptionsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:2648:1: ( ( ( rule__PatternType__PatternOptionsAssignment_1 ) ) ( ( rule__PatternType__PatternOptionsAssignment_1 )* ) )
            // InternalMyDsl.g:2649:2: ( ( rule__PatternType__PatternOptionsAssignment_1 ) ) ( ( rule__PatternType__PatternOptionsAssignment_1 )* )
            {
            // InternalMyDsl.g:2649:2: ( ( rule__PatternType__PatternOptionsAssignment_1 ) )
            // InternalMyDsl.g:2650:3: ( rule__PatternType__PatternOptionsAssignment_1 )
            {
             before(grammarAccess.getPatternTypeAccess().getPatternOptionsAssignment_1()); 
            // InternalMyDsl.g:2651:3: ( rule__PatternType__PatternOptionsAssignment_1 )
            // InternalMyDsl.g:2651:4: rule__PatternType__PatternOptionsAssignment_1
            {
            pushFollow(FOLLOW_30);
            rule__PatternType__PatternOptionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternTypeAccess().getPatternOptionsAssignment_1()); 

            }

            // InternalMyDsl.g:2654:2: ( ( rule__PatternType__PatternOptionsAssignment_1 )* )
            // InternalMyDsl.g:2655:3: ( rule__PatternType__PatternOptionsAssignment_1 )*
            {
             before(grammarAccess.getPatternTypeAccess().getPatternOptionsAssignment_1()); 
            // InternalMyDsl.g:2656:3: ( rule__PatternType__PatternOptionsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2656:4: rule__PatternType__PatternOptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__PatternType__PatternOptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPatternTypeAccess().getPatternOptionsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternType__Group__1__Impl"


    // $ANTLR start "rule__OccurenceAtLeast__Group__0"
    // InternalMyDsl.g:2666:1: rule__OccurenceAtLeast__Group__0 : rule__OccurenceAtLeast__Group__0__Impl rule__OccurenceAtLeast__Group__1 ;
    public final void rule__OccurenceAtLeast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2670:1: ( rule__OccurenceAtLeast__Group__0__Impl rule__OccurenceAtLeast__Group__1 )
            // InternalMyDsl.g:2671:2: rule__OccurenceAtLeast__Group__0__Impl rule__OccurenceAtLeast__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OccurenceAtLeast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OccurenceAtLeast__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__0"


    // $ANTLR start "rule__OccurenceAtLeast__Group__0__Impl"
    // InternalMyDsl.g:2678:1: rule__OccurenceAtLeast__Group__0__Impl : ( 'followed-by' ) ;
    public final void rule__OccurenceAtLeast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2682:1: ( ( 'followed-by' ) )
            // InternalMyDsl.g:2683:1: ( 'followed-by' )
            {
            // InternalMyDsl.g:2683:1: ( 'followed-by' )
            // InternalMyDsl.g:2684:2: 'followed-by'
            {
             before(grammarAccess.getOccurenceAtLeastAccess().getFollowedByKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtLeastAccess().getFollowedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__0__Impl"


    // $ANTLR start "rule__OccurenceAtLeast__Group__1"
    // InternalMyDsl.g:2693:1: rule__OccurenceAtLeast__Group__1 : rule__OccurenceAtLeast__Group__1__Impl rule__OccurenceAtLeast__Group__2 ;
    public final void rule__OccurenceAtLeast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2697:1: ( rule__OccurenceAtLeast__Group__1__Impl rule__OccurenceAtLeast__Group__2 )
            // InternalMyDsl.g:2698:2: rule__OccurenceAtLeast__Group__1__Impl rule__OccurenceAtLeast__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__OccurenceAtLeast__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OccurenceAtLeast__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__1"


    // $ANTLR start "rule__OccurenceAtLeast__Group__1__Impl"
    // InternalMyDsl.g:2705:1: rule__OccurenceAtLeast__Group__1__Impl : ( ( rule__OccurenceAtLeast__SeceondEventAssignment_1 ) ) ;
    public final void rule__OccurenceAtLeast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2709:1: ( ( ( rule__OccurenceAtLeast__SeceondEventAssignment_1 ) ) )
            // InternalMyDsl.g:2710:1: ( ( rule__OccurenceAtLeast__SeceondEventAssignment_1 ) )
            {
            // InternalMyDsl.g:2710:1: ( ( rule__OccurenceAtLeast__SeceondEventAssignment_1 ) )
            // InternalMyDsl.g:2711:2: ( rule__OccurenceAtLeast__SeceondEventAssignment_1 )
            {
             before(grammarAccess.getOccurenceAtLeastAccess().getSeceondEventAssignment_1()); 
            // InternalMyDsl.g:2712:2: ( rule__OccurenceAtLeast__SeceondEventAssignment_1 )
            // InternalMyDsl.g:2712:3: rule__OccurenceAtLeast__SeceondEventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtLeast__SeceondEventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAtLeastAccess().getSeceondEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__1__Impl"


    // $ANTLR start "rule__OccurenceAtLeast__Group__2"
    // InternalMyDsl.g:2720:1: rule__OccurenceAtLeast__Group__2 : rule__OccurenceAtLeast__Group__2__Impl rule__OccurenceAtLeast__Group__3 ;
    public final void rule__OccurenceAtLeast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2724:1: ( rule__OccurenceAtLeast__Group__2__Impl rule__OccurenceAtLeast__Group__3 )
            // InternalMyDsl.g:2725:2: rule__OccurenceAtLeast__Group__2__Impl rule__OccurenceAtLeast__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__OccurenceAtLeast__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OccurenceAtLeast__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__2"


    // $ANTLR start "rule__OccurenceAtLeast__Group__2__Impl"
    // InternalMyDsl.g:2732:1: rule__OccurenceAtLeast__Group__2__Impl : ( 'Occurs-After' ) ;
    public final void rule__OccurenceAtLeast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2736:1: ( ( 'Occurs-After' ) )
            // InternalMyDsl.g:2737:1: ( 'Occurs-After' )
            {
            // InternalMyDsl.g:2737:1: ( 'Occurs-After' )
            // InternalMyDsl.g:2738:2: 'Occurs-After'
            {
             before(grammarAccess.getOccurenceAtLeastAccess().getOccursAfterKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtLeastAccess().getOccursAfterKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__2__Impl"


    // $ANTLR start "rule__OccurenceAtLeast__Group__3"
    // InternalMyDsl.g:2747:1: rule__OccurenceAtLeast__Group__3 : rule__OccurenceAtLeast__Group__3__Impl rule__OccurenceAtLeast__Group__4 ;
    public final void rule__OccurenceAtLeast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2751:1: ( rule__OccurenceAtLeast__Group__3__Impl rule__OccurenceAtLeast__Group__4 )
            // InternalMyDsl.g:2752:2: rule__OccurenceAtLeast__Group__3__Impl rule__OccurenceAtLeast__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__OccurenceAtLeast__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OccurenceAtLeast__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__3"


    // $ANTLR start "rule__OccurenceAtLeast__Group__3__Impl"
    // InternalMyDsl.g:2759:1: rule__OccurenceAtLeast__Group__3__Impl : ( '@' ) ;
    public final void rule__OccurenceAtLeast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( ( '@' ) )
            // InternalMyDsl.g:2764:1: ( '@' )
            {
            // InternalMyDsl.g:2764:1: ( '@' )
            // InternalMyDsl.g:2765:2: '@'
            {
             before(grammarAccess.getOccurenceAtLeastAccess().getCommercialAtKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtLeastAccess().getCommercialAtKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__3__Impl"


    // $ANTLR start "rule__OccurenceAtLeast__Group__4"
    // InternalMyDsl.g:2774:1: rule__OccurenceAtLeast__Group__4 : rule__OccurenceAtLeast__Group__4__Impl ;
    public final void rule__OccurenceAtLeast__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2778:1: ( rule__OccurenceAtLeast__Group__4__Impl )
            // InternalMyDsl.g:2779:2: rule__OccurenceAtLeast__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtLeast__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__4"


    // $ANTLR start "rule__OccurenceAtLeast__Group__4__Impl"
    // InternalMyDsl.g:2785:1: rule__OccurenceAtLeast__Group__4__Impl : ( ( rule__OccurenceAtLeast__MinDurationAssignment_4 ) ) ;
    public final void rule__OccurenceAtLeast__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2789:1: ( ( ( rule__OccurenceAtLeast__MinDurationAssignment_4 ) ) )
            // InternalMyDsl.g:2790:1: ( ( rule__OccurenceAtLeast__MinDurationAssignment_4 ) )
            {
            // InternalMyDsl.g:2790:1: ( ( rule__OccurenceAtLeast__MinDurationAssignment_4 ) )
            // InternalMyDsl.g:2791:2: ( rule__OccurenceAtLeast__MinDurationAssignment_4 )
            {
             before(grammarAccess.getOccurenceAtLeastAccess().getMinDurationAssignment_4()); 
            // InternalMyDsl.g:2792:2: ( rule__OccurenceAtLeast__MinDurationAssignment_4 )
            // InternalMyDsl.g:2792:3: rule__OccurenceAtLeast__MinDurationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtLeast__MinDurationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAtLeastAccess().getMinDurationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__Group__4__Impl"


    // $ANTLR start "rule__OccurenceAtMost__Group__0"
    // InternalMyDsl.g:2801:1: rule__OccurenceAtMost__Group__0 : rule__OccurenceAtMost__Group__0__Impl rule__OccurenceAtMost__Group__1 ;
    public final void rule__OccurenceAtMost__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2805:1: ( rule__OccurenceAtMost__Group__0__Impl rule__OccurenceAtMost__Group__1 )
            // InternalMyDsl.g:2806:2: rule__OccurenceAtMost__Group__0__Impl rule__OccurenceAtMost__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OccurenceAtMost__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OccurenceAtMost__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__0"


    // $ANTLR start "rule__OccurenceAtMost__Group__0__Impl"
    // InternalMyDsl.g:2813:1: rule__OccurenceAtMost__Group__0__Impl : ( 'followed-by' ) ;
    public final void rule__OccurenceAtMost__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2817:1: ( ( 'followed-by' ) )
            // InternalMyDsl.g:2818:1: ( 'followed-by' )
            {
            // InternalMyDsl.g:2818:1: ( 'followed-by' )
            // InternalMyDsl.g:2819:2: 'followed-by'
            {
             before(grammarAccess.getOccurenceAtMostAccess().getFollowedByKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtMostAccess().getFollowedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__0__Impl"


    // $ANTLR start "rule__OccurenceAtMost__Group__1"
    // InternalMyDsl.g:2828:1: rule__OccurenceAtMost__Group__1 : rule__OccurenceAtMost__Group__1__Impl rule__OccurenceAtMost__Group__2 ;
    public final void rule__OccurenceAtMost__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2832:1: ( rule__OccurenceAtMost__Group__1__Impl rule__OccurenceAtMost__Group__2 )
            // InternalMyDsl.g:2833:2: rule__OccurenceAtMost__Group__1__Impl rule__OccurenceAtMost__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__OccurenceAtMost__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OccurenceAtMost__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__1"


    // $ANTLR start "rule__OccurenceAtMost__Group__1__Impl"
    // InternalMyDsl.g:2840:1: rule__OccurenceAtMost__Group__1__Impl : ( ( rule__OccurenceAtMost__SeceondEventAssignment_1 ) ) ;
    public final void rule__OccurenceAtMost__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2844:1: ( ( ( rule__OccurenceAtMost__SeceondEventAssignment_1 ) ) )
            // InternalMyDsl.g:2845:1: ( ( rule__OccurenceAtMost__SeceondEventAssignment_1 ) )
            {
            // InternalMyDsl.g:2845:1: ( ( rule__OccurenceAtMost__SeceondEventAssignment_1 ) )
            // InternalMyDsl.g:2846:2: ( rule__OccurenceAtMost__SeceondEventAssignment_1 )
            {
             before(grammarAccess.getOccurenceAtMostAccess().getSeceondEventAssignment_1()); 
            // InternalMyDsl.g:2847:2: ( rule__OccurenceAtMost__SeceondEventAssignment_1 )
            // InternalMyDsl.g:2847:3: rule__OccurenceAtMost__SeceondEventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtMost__SeceondEventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAtMostAccess().getSeceondEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__1__Impl"


    // $ANTLR start "rule__OccurenceAtMost__Group__2"
    // InternalMyDsl.g:2855:1: rule__OccurenceAtMost__Group__2 : rule__OccurenceAtMost__Group__2__Impl rule__OccurenceAtMost__Group__3 ;
    public final void rule__OccurenceAtMost__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2859:1: ( rule__OccurenceAtMost__Group__2__Impl rule__OccurenceAtMost__Group__3 )
            // InternalMyDsl.g:2860:2: rule__OccurenceAtMost__Group__2__Impl rule__OccurenceAtMost__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__OccurenceAtMost__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OccurenceAtMost__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__2"


    // $ANTLR start "rule__OccurenceAtMost__Group__2__Impl"
    // InternalMyDsl.g:2867:1: rule__OccurenceAtMost__Group__2__Impl : ( 'Occurs-Before' ) ;
    public final void rule__OccurenceAtMost__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2871:1: ( ( 'Occurs-Before' ) )
            // InternalMyDsl.g:2872:1: ( 'Occurs-Before' )
            {
            // InternalMyDsl.g:2872:1: ( 'Occurs-Before' )
            // InternalMyDsl.g:2873:2: 'Occurs-Before'
            {
             before(grammarAccess.getOccurenceAtMostAccess().getOccursBeforeKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtMostAccess().getOccursBeforeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__2__Impl"


    // $ANTLR start "rule__OccurenceAtMost__Group__3"
    // InternalMyDsl.g:2882:1: rule__OccurenceAtMost__Group__3 : rule__OccurenceAtMost__Group__3__Impl rule__OccurenceAtMost__Group__4 ;
    public final void rule__OccurenceAtMost__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2886:1: ( rule__OccurenceAtMost__Group__3__Impl rule__OccurenceAtMost__Group__4 )
            // InternalMyDsl.g:2887:2: rule__OccurenceAtMost__Group__3__Impl rule__OccurenceAtMost__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__OccurenceAtMost__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OccurenceAtMost__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__3"


    // $ANTLR start "rule__OccurenceAtMost__Group__3__Impl"
    // InternalMyDsl.g:2894:1: rule__OccurenceAtMost__Group__3__Impl : ( '@' ) ;
    public final void rule__OccurenceAtMost__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2898:1: ( ( '@' ) )
            // InternalMyDsl.g:2899:1: ( '@' )
            {
            // InternalMyDsl.g:2899:1: ( '@' )
            // InternalMyDsl.g:2900:2: '@'
            {
             before(grammarAccess.getOccurenceAtMostAccess().getCommercialAtKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtMostAccess().getCommercialAtKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__3__Impl"


    // $ANTLR start "rule__OccurenceAtMost__Group__4"
    // InternalMyDsl.g:2909:1: rule__OccurenceAtMost__Group__4 : rule__OccurenceAtMost__Group__4__Impl ;
    public final void rule__OccurenceAtMost__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2913:1: ( rule__OccurenceAtMost__Group__4__Impl )
            // InternalMyDsl.g:2914:2: rule__OccurenceAtMost__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtMost__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__4"


    // $ANTLR start "rule__OccurenceAtMost__Group__4__Impl"
    // InternalMyDsl.g:2920:1: rule__OccurenceAtMost__Group__4__Impl : ( ( rule__OccurenceAtMost__MaxDurationAssignment_4 ) ) ;
    public final void rule__OccurenceAtMost__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2924:1: ( ( ( rule__OccurenceAtMost__MaxDurationAssignment_4 ) ) )
            // InternalMyDsl.g:2925:1: ( ( rule__OccurenceAtMost__MaxDurationAssignment_4 ) )
            {
            // InternalMyDsl.g:2925:1: ( ( rule__OccurenceAtMost__MaxDurationAssignment_4 ) )
            // InternalMyDsl.g:2926:2: ( rule__OccurenceAtMost__MaxDurationAssignment_4 )
            {
             before(grammarAccess.getOccurenceAtMostAccess().getMaxDurationAssignment_4()); 
            // InternalMyDsl.g:2927:2: ( rule__OccurenceAtMost__MaxDurationAssignment_4 )
            // InternalMyDsl.g:2927:3: rule__OccurenceAtMost__MaxDurationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtMost__MaxDurationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAtMostAccess().getMaxDurationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__Group__4__Impl"


    // $ANTLR start "rule__OccurenceAtNotSpecificTime__Group__0"
    // InternalMyDsl.g:2936:1: rule__OccurenceAtNotSpecificTime__Group__0 : rule__OccurenceAtNotSpecificTime__Group__0__Impl rule__OccurenceAtNotSpecificTime__Group__1 ;
    public final void rule__OccurenceAtNotSpecificTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2940:1: ( rule__OccurenceAtNotSpecificTime__Group__0__Impl rule__OccurenceAtNotSpecificTime__Group__1 )
            // InternalMyDsl.g:2941:2: rule__OccurenceAtNotSpecificTime__Group__0__Impl rule__OccurenceAtNotSpecificTime__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OccurenceAtNotSpecificTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OccurenceAtNotSpecificTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtNotSpecificTime__Group__0"


    // $ANTLR start "rule__OccurenceAtNotSpecificTime__Group__0__Impl"
    // InternalMyDsl.g:2948:1: rule__OccurenceAtNotSpecificTime__Group__0__Impl : ( 'followed-by' ) ;
    public final void rule__OccurenceAtNotSpecificTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2952:1: ( ( 'followed-by' ) )
            // InternalMyDsl.g:2953:1: ( 'followed-by' )
            {
            // InternalMyDsl.g:2953:1: ( 'followed-by' )
            // InternalMyDsl.g:2954:2: 'followed-by'
            {
             before(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getFollowedByKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getFollowedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtNotSpecificTime__Group__0__Impl"


    // $ANTLR start "rule__OccurenceAtNotSpecificTime__Group__1"
    // InternalMyDsl.g:2963:1: rule__OccurenceAtNotSpecificTime__Group__1 : rule__OccurenceAtNotSpecificTime__Group__1__Impl ;
    public final void rule__OccurenceAtNotSpecificTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2967:1: ( rule__OccurenceAtNotSpecificTime__Group__1__Impl )
            // InternalMyDsl.g:2968:2: rule__OccurenceAtNotSpecificTime__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtNotSpecificTime__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtNotSpecificTime__Group__1"


    // $ANTLR start "rule__OccurenceAtNotSpecificTime__Group__1__Impl"
    // InternalMyDsl.g:2974:1: rule__OccurenceAtNotSpecificTime__Group__1__Impl : ( ( rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1 ) ) ;
    public final void rule__OccurenceAtNotSpecificTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2978:1: ( ( ( rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1 ) ) )
            // InternalMyDsl.g:2979:1: ( ( rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1 ) )
            {
            // InternalMyDsl.g:2979:1: ( ( rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1 ) )
            // InternalMyDsl.g:2980:2: ( rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1 )
            {
             before(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getSeceondEventAssignment_1()); 
            // InternalMyDsl.g:2981:2: ( rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1 )
            // InternalMyDsl.g:2981:3: rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getSeceondEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtNotSpecificTime__Group__1__Impl"


    // $ANTLR start "rule__MaxDuration__Group__0"
    // InternalMyDsl.g:2990:1: rule__MaxDuration__Group__0 : rule__MaxDuration__Group__0__Impl rule__MaxDuration__Group__1 ;
    public final void rule__MaxDuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2994:1: ( rule__MaxDuration__Group__0__Impl rule__MaxDuration__Group__1 )
            // InternalMyDsl.g:2995:2: rule__MaxDuration__Group__0__Impl rule__MaxDuration__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__MaxDuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxDuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__0"


    // $ANTLR start "rule__MaxDuration__Group__0__Impl"
    // InternalMyDsl.g:3002:1: rule__MaxDuration__Group__0__Impl : ( ( rule__MaxDuration__TimerTypeAssignment_0 ) ) ;
    public final void rule__MaxDuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3006:1: ( ( ( rule__MaxDuration__TimerTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3007:1: ( ( rule__MaxDuration__TimerTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3007:1: ( ( rule__MaxDuration__TimerTypeAssignment_0 ) )
            // InternalMyDsl.g:3008:2: ( rule__MaxDuration__TimerTypeAssignment_0 )
            {
             before(grammarAccess.getMaxDurationAccess().getTimerTypeAssignment_0()); 
            // InternalMyDsl.g:3009:2: ( rule__MaxDuration__TimerTypeAssignment_0 )
            // InternalMyDsl.g:3009:3: rule__MaxDuration__TimerTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MaxDuration__TimerTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMaxDurationAccess().getTimerTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__0__Impl"


    // $ANTLR start "rule__MaxDuration__Group__1"
    // InternalMyDsl.g:3017:1: rule__MaxDuration__Group__1 : rule__MaxDuration__Group__1__Impl rule__MaxDuration__Group__2 ;
    public final void rule__MaxDuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3021:1: ( rule__MaxDuration__Group__1__Impl rule__MaxDuration__Group__2 )
            // InternalMyDsl.g:3022:2: rule__MaxDuration__Group__1__Impl rule__MaxDuration__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__MaxDuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxDuration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__1"


    // $ANTLR start "rule__MaxDuration__Group__1__Impl"
    // InternalMyDsl.g:3029:1: rule__MaxDuration__Group__1__Impl : ( '[' ) ;
    public final void rule__MaxDuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3033:1: ( ( '[' ) )
            // InternalMyDsl.g:3034:1: ( '[' )
            {
            // InternalMyDsl.g:3034:1: ( '[' )
            // InternalMyDsl.g:3035:2: '['
            {
             before(grammarAccess.getMaxDurationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMaxDurationAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__1__Impl"


    // $ANTLR start "rule__MaxDuration__Group__2"
    // InternalMyDsl.g:3044:1: rule__MaxDuration__Group__2 : rule__MaxDuration__Group__2__Impl rule__MaxDuration__Group__3 ;
    public final void rule__MaxDuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3048:1: ( rule__MaxDuration__Group__2__Impl rule__MaxDuration__Group__3 )
            // InternalMyDsl.g:3049:2: rule__MaxDuration__Group__2__Impl rule__MaxDuration__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__MaxDuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxDuration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__2"


    // $ANTLR start "rule__MaxDuration__Group__2__Impl"
    // InternalMyDsl.g:3056:1: rule__MaxDuration__Group__2__Impl : ( ( rule__MaxDuration__TimeAssignment_2 ) ) ;
    public final void rule__MaxDuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3060:1: ( ( ( rule__MaxDuration__TimeAssignment_2 ) ) )
            // InternalMyDsl.g:3061:1: ( ( rule__MaxDuration__TimeAssignment_2 ) )
            {
            // InternalMyDsl.g:3061:1: ( ( rule__MaxDuration__TimeAssignment_2 ) )
            // InternalMyDsl.g:3062:2: ( rule__MaxDuration__TimeAssignment_2 )
            {
             before(grammarAccess.getMaxDurationAccess().getTimeAssignment_2()); 
            // InternalMyDsl.g:3063:2: ( rule__MaxDuration__TimeAssignment_2 )
            // InternalMyDsl.g:3063:3: rule__MaxDuration__TimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MaxDuration__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaxDurationAccess().getTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__2__Impl"


    // $ANTLR start "rule__MaxDuration__Group__3"
    // InternalMyDsl.g:3071:1: rule__MaxDuration__Group__3 : rule__MaxDuration__Group__3__Impl rule__MaxDuration__Group__4 ;
    public final void rule__MaxDuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3075:1: ( rule__MaxDuration__Group__3__Impl rule__MaxDuration__Group__4 )
            // InternalMyDsl.g:3076:2: rule__MaxDuration__Group__3__Impl rule__MaxDuration__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__MaxDuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxDuration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__3"


    // $ANTLR start "rule__MaxDuration__Group__3__Impl"
    // InternalMyDsl.g:3083:1: rule__MaxDuration__Group__3__Impl : ( ( rule__MaxDuration__TimeUnitAssignment_3 ) ) ;
    public final void rule__MaxDuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3087:1: ( ( ( rule__MaxDuration__TimeUnitAssignment_3 ) ) )
            // InternalMyDsl.g:3088:1: ( ( rule__MaxDuration__TimeUnitAssignment_3 ) )
            {
            // InternalMyDsl.g:3088:1: ( ( rule__MaxDuration__TimeUnitAssignment_3 ) )
            // InternalMyDsl.g:3089:2: ( rule__MaxDuration__TimeUnitAssignment_3 )
            {
             before(grammarAccess.getMaxDurationAccess().getTimeUnitAssignment_3()); 
            // InternalMyDsl.g:3090:2: ( rule__MaxDuration__TimeUnitAssignment_3 )
            // InternalMyDsl.g:3090:3: rule__MaxDuration__TimeUnitAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MaxDuration__TimeUnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMaxDurationAccess().getTimeUnitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__3__Impl"


    // $ANTLR start "rule__MaxDuration__Group__4"
    // InternalMyDsl.g:3098:1: rule__MaxDuration__Group__4 : rule__MaxDuration__Group__4__Impl ;
    public final void rule__MaxDuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3102:1: ( rule__MaxDuration__Group__4__Impl )
            // InternalMyDsl.g:3103:2: rule__MaxDuration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxDuration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__4"


    // $ANTLR start "rule__MaxDuration__Group__4__Impl"
    // InternalMyDsl.g:3109:1: rule__MaxDuration__Group__4__Impl : ( ']' ) ;
    public final void rule__MaxDuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3113:1: ( ( ']' ) )
            // InternalMyDsl.g:3114:1: ( ']' )
            {
            // InternalMyDsl.g:3114:1: ( ']' )
            // InternalMyDsl.g:3115:2: ']'
            {
             before(grammarAccess.getMaxDurationAccess().getRightSquareBracketKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMaxDurationAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__Group__4__Impl"


    // $ANTLR start "rule__MinDuration__Group__0"
    // InternalMyDsl.g:3125:1: rule__MinDuration__Group__0 : rule__MinDuration__Group__0__Impl rule__MinDuration__Group__1 ;
    public final void rule__MinDuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3129:1: ( rule__MinDuration__Group__0__Impl rule__MinDuration__Group__1 )
            // InternalMyDsl.g:3130:2: rule__MinDuration__Group__0__Impl rule__MinDuration__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__MinDuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinDuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__0"


    // $ANTLR start "rule__MinDuration__Group__0__Impl"
    // InternalMyDsl.g:3137:1: rule__MinDuration__Group__0__Impl : ( ( rule__MinDuration__TimerTypeAssignment_0 ) ) ;
    public final void rule__MinDuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3141:1: ( ( ( rule__MinDuration__TimerTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3142:1: ( ( rule__MinDuration__TimerTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3142:1: ( ( rule__MinDuration__TimerTypeAssignment_0 ) )
            // InternalMyDsl.g:3143:2: ( rule__MinDuration__TimerTypeAssignment_0 )
            {
             before(grammarAccess.getMinDurationAccess().getTimerTypeAssignment_0()); 
            // InternalMyDsl.g:3144:2: ( rule__MinDuration__TimerTypeAssignment_0 )
            // InternalMyDsl.g:3144:3: rule__MinDuration__TimerTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MinDuration__TimerTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMinDurationAccess().getTimerTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__0__Impl"


    // $ANTLR start "rule__MinDuration__Group__1"
    // InternalMyDsl.g:3152:1: rule__MinDuration__Group__1 : rule__MinDuration__Group__1__Impl rule__MinDuration__Group__2 ;
    public final void rule__MinDuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3156:1: ( rule__MinDuration__Group__1__Impl rule__MinDuration__Group__2 )
            // InternalMyDsl.g:3157:2: rule__MinDuration__Group__1__Impl rule__MinDuration__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__MinDuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinDuration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__1"


    // $ANTLR start "rule__MinDuration__Group__1__Impl"
    // InternalMyDsl.g:3164:1: rule__MinDuration__Group__1__Impl : ( '[' ) ;
    public final void rule__MinDuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3168:1: ( ( '[' ) )
            // InternalMyDsl.g:3169:1: ( '[' )
            {
            // InternalMyDsl.g:3169:1: ( '[' )
            // InternalMyDsl.g:3170:2: '['
            {
             before(grammarAccess.getMinDurationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMinDurationAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__1__Impl"


    // $ANTLR start "rule__MinDuration__Group__2"
    // InternalMyDsl.g:3179:1: rule__MinDuration__Group__2 : rule__MinDuration__Group__2__Impl rule__MinDuration__Group__3 ;
    public final void rule__MinDuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3183:1: ( rule__MinDuration__Group__2__Impl rule__MinDuration__Group__3 )
            // InternalMyDsl.g:3184:2: rule__MinDuration__Group__2__Impl rule__MinDuration__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__MinDuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinDuration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__2"


    // $ANTLR start "rule__MinDuration__Group__2__Impl"
    // InternalMyDsl.g:3191:1: rule__MinDuration__Group__2__Impl : ( ( rule__MinDuration__TimeAssignment_2 ) ) ;
    public final void rule__MinDuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3195:1: ( ( ( rule__MinDuration__TimeAssignment_2 ) ) )
            // InternalMyDsl.g:3196:1: ( ( rule__MinDuration__TimeAssignment_2 ) )
            {
            // InternalMyDsl.g:3196:1: ( ( rule__MinDuration__TimeAssignment_2 ) )
            // InternalMyDsl.g:3197:2: ( rule__MinDuration__TimeAssignment_2 )
            {
             before(grammarAccess.getMinDurationAccess().getTimeAssignment_2()); 
            // InternalMyDsl.g:3198:2: ( rule__MinDuration__TimeAssignment_2 )
            // InternalMyDsl.g:3198:3: rule__MinDuration__TimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MinDuration__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMinDurationAccess().getTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__2__Impl"


    // $ANTLR start "rule__MinDuration__Group__3"
    // InternalMyDsl.g:3206:1: rule__MinDuration__Group__3 : rule__MinDuration__Group__3__Impl rule__MinDuration__Group__4 ;
    public final void rule__MinDuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3210:1: ( rule__MinDuration__Group__3__Impl rule__MinDuration__Group__4 )
            // InternalMyDsl.g:3211:2: rule__MinDuration__Group__3__Impl rule__MinDuration__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__MinDuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinDuration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__3"


    // $ANTLR start "rule__MinDuration__Group__3__Impl"
    // InternalMyDsl.g:3218:1: rule__MinDuration__Group__3__Impl : ( ( rule__MinDuration__TimeUnitAssignment_3 ) ) ;
    public final void rule__MinDuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3222:1: ( ( ( rule__MinDuration__TimeUnitAssignment_3 ) ) )
            // InternalMyDsl.g:3223:1: ( ( rule__MinDuration__TimeUnitAssignment_3 ) )
            {
            // InternalMyDsl.g:3223:1: ( ( rule__MinDuration__TimeUnitAssignment_3 ) )
            // InternalMyDsl.g:3224:2: ( rule__MinDuration__TimeUnitAssignment_3 )
            {
             before(grammarAccess.getMinDurationAccess().getTimeUnitAssignment_3()); 
            // InternalMyDsl.g:3225:2: ( rule__MinDuration__TimeUnitAssignment_3 )
            // InternalMyDsl.g:3225:3: rule__MinDuration__TimeUnitAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MinDuration__TimeUnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMinDurationAccess().getTimeUnitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__3__Impl"


    // $ANTLR start "rule__MinDuration__Group__4"
    // InternalMyDsl.g:3233:1: rule__MinDuration__Group__4 : rule__MinDuration__Group__4__Impl ;
    public final void rule__MinDuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3237:1: ( rule__MinDuration__Group__4__Impl )
            // InternalMyDsl.g:3238:2: rule__MinDuration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinDuration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__4"


    // $ANTLR start "rule__MinDuration__Group__4__Impl"
    // InternalMyDsl.g:3244:1: rule__MinDuration__Group__4__Impl : ( ']' ) ;
    public final void rule__MinDuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3248:1: ( ( ']' ) )
            // InternalMyDsl.g:3249:1: ( ']' )
            {
            // InternalMyDsl.g:3249:1: ( ']' )
            // InternalMyDsl.g:3250:2: ']'
            {
             before(grammarAccess.getMinDurationAccess().getRightSquareBracketKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMinDurationAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__Group__4__Impl"


    // $ANTLR start "rule__TimeWindow__Group__0"
    // InternalMyDsl.g:3260:1: rule__TimeWindow__Group__0 : rule__TimeWindow__Group__0__Impl rule__TimeWindow__Group__1 ;
    public final void rule__TimeWindow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3264:1: ( rule__TimeWindow__Group__0__Impl rule__TimeWindow__Group__1 )
            // InternalMyDsl.g:3265:2: rule__TimeWindow__Group__0__Impl rule__TimeWindow__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__TimeWindow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeWindow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__0"


    // $ANTLR start "rule__TimeWindow__Group__0__Impl"
    // InternalMyDsl.g:3272:1: rule__TimeWindow__Group__0__Impl : ( 'With' ) ;
    public final void rule__TimeWindow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3276:1: ( ( 'With' ) )
            // InternalMyDsl.g:3277:1: ( 'With' )
            {
            // InternalMyDsl.g:3277:1: ( 'With' )
            // InternalMyDsl.g:3278:2: 'With'
            {
             before(grammarAccess.getTimeWindowAccess().getWithKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTimeWindowAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__0__Impl"


    // $ANTLR start "rule__TimeWindow__Group__1"
    // InternalMyDsl.g:3287:1: rule__TimeWindow__Group__1 : rule__TimeWindow__Group__1__Impl rule__TimeWindow__Group__2 ;
    public final void rule__TimeWindow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3291:1: ( rule__TimeWindow__Group__1__Impl rule__TimeWindow__Group__2 )
            // InternalMyDsl.g:3292:2: rule__TimeWindow__Group__1__Impl rule__TimeWindow__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__TimeWindow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeWindow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__1"


    // $ANTLR start "rule__TimeWindow__Group__1__Impl"
    // InternalMyDsl.g:3299:1: rule__TimeWindow__Group__1__Impl : ( 'TimeWindow' ) ;
    public final void rule__TimeWindow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3303:1: ( ( 'TimeWindow' ) )
            // InternalMyDsl.g:3304:1: ( 'TimeWindow' )
            {
            // InternalMyDsl.g:3304:1: ( 'TimeWindow' )
            // InternalMyDsl.g:3305:2: 'TimeWindow'
            {
             before(grammarAccess.getTimeWindowAccess().getTimeWindowKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTimeWindowAccess().getTimeWindowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__1__Impl"


    // $ANTLR start "rule__TimeWindow__Group__2"
    // InternalMyDsl.g:3314:1: rule__TimeWindow__Group__2 : rule__TimeWindow__Group__2__Impl rule__TimeWindow__Group__3 ;
    public final void rule__TimeWindow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3318:1: ( rule__TimeWindow__Group__2__Impl rule__TimeWindow__Group__3 )
            // InternalMyDsl.g:3319:2: rule__TimeWindow__Group__2__Impl rule__TimeWindow__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__TimeWindow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeWindow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__2"


    // $ANTLR start "rule__TimeWindow__Group__2__Impl"
    // InternalMyDsl.g:3326:1: rule__TimeWindow__Group__2__Impl : ( '[' ) ;
    public final void rule__TimeWindow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3330:1: ( ( '[' ) )
            // InternalMyDsl.g:3331:1: ( '[' )
            {
            // InternalMyDsl.g:3331:1: ( '[' )
            // InternalMyDsl.g:3332:2: '['
            {
             before(grammarAccess.getTimeWindowAccess().getLeftSquareBracketKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTimeWindowAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__2__Impl"


    // $ANTLR start "rule__TimeWindow__Group__3"
    // InternalMyDsl.g:3341:1: rule__TimeWindow__Group__3 : rule__TimeWindow__Group__3__Impl rule__TimeWindow__Group__4 ;
    public final void rule__TimeWindow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3345:1: ( rule__TimeWindow__Group__3__Impl rule__TimeWindow__Group__4 )
            // InternalMyDsl.g:3346:2: rule__TimeWindow__Group__3__Impl rule__TimeWindow__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__TimeWindow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeWindow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__3"


    // $ANTLR start "rule__TimeWindow__Group__3__Impl"
    // InternalMyDsl.g:3353:1: rule__TimeWindow__Group__3__Impl : ( ( rule__TimeWindow__TimeAssignment_3 ) ) ;
    public final void rule__TimeWindow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3357:1: ( ( ( rule__TimeWindow__TimeAssignment_3 ) ) )
            // InternalMyDsl.g:3358:1: ( ( rule__TimeWindow__TimeAssignment_3 ) )
            {
            // InternalMyDsl.g:3358:1: ( ( rule__TimeWindow__TimeAssignment_3 ) )
            // InternalMyDsl.g:3359:2: ( rule__TimeWindow__TimeAssignment_3 )
            {
             before(grammarAccess.getTimeWindowAccess().getTimeAssignment_3()); 
            // InternalMyDsl.g:3360:2: ( rule__TimeWindow__TimeAssignment_3 )
            // InternalMyDsl.g:3360:3: rule__TimeWindow__TimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TimeWindow__TimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTimeWindowAccess().getTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__3__Impl"


    // $ANTLR start "rule__TimeWindow__Group__4"
    // InternalMyDsl.g:3368:1: rule__TimeWindow__Group__4 : rule__TimeWindow__Group__4__Impl rule__TimeWindow__Group__5 ;
    public final void rule__TimeWindow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3372:1: ( rule__TimeWindow__Group__4__Impl rule__TimeWindow__Group__5 )
            // InternalMyDsl.g:3373:2: rule__TimeWindow__Group__4__Impl rule__TimeWindow__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__TimeWindow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeWindow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__4"


    // $ANTLR start "rule__TimeWindow__Group__4__Impl"
    // InternalMyDsl.g:3380:1: rule__TimeWindow__Group__4__Impl : ( ( rule__TimeWindow__TimeUnitAssignment_4 ) ) ;
    public final void rule__TimeWindow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3384:1: ( ( ( rule__TimeWindow__TimeUnitAssignment_4 ) ) )
            // InternalMyDsl.g:3385:1: ( ( rule__TimeWindow__TimeUnitAssignment_4 ) )
            {
            // InternalMyDsl.g:3385:1: ( ( rule__TimeWindow__TimeUnitAssignment_4 ) )
            // InternalMyDsl.g:3386:2: ( rule__TimeWindow__TimeUnitAssignment_4 )
            {
             before(grammarAccess.getTimeWindowAccess().getTimeUnitAssignment_4()); 
            // InternalMyDsl.g:3387:2: ( rule__TimeWindow__TimeUnitAssignment_4 )
            // InternalMyDsl.g:3387:3: rule__TimeWindow__TimeUnitAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TimeWindow__TimeUnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTimeWindowAccess().getTimeUnitAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__4__Impl"


    // $ANTLR start "rule__TimeWindow__Group__5"
    // InternalMyDsl.g:3395:1: rule__TimeWindow__Group__5 : rule__TimeWindow__Group__5__Impl ;
    public final void rule__TimeWindow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3399:1: ( rule__TimeWindow__Group__5__Impl )
            // InternalMyDsl.g:3400:2: rule__TimeWindow__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeWindow__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__5"


    // $ANTLR start "rule__TimeWindow__Group__5__Impl"
    // InternalMyDsl.g:3406:1: rule__TimeWindow__Group__5__Impl : ( ']' ) ;
    public final void rule__TimeWindow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3410:1: ( ( ']' ) )
            // InternalMyDsl.g:3411:1: ( ']' )
            {
            // InternalMyDsl.g:3411:1: ( ']' )
            // InternalMyDsl.g:3412:2: ']'
            {
             before(grammarAccess.getTimeWindowAccess().getRightSquareBracketKeyword_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTimeWindowAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__Group__5__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // InternalMyDsl.g:3422:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3426:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // InternalMyDsl.g:3427:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // InternalMyDsl.g:3434:1: rule__NumberLiteral__Group__0__Impl : ( ( rule__NumberLiteral__ValueAssignment_0 ) ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3438:1: ( ( ( rule__NumberLiteral__ValueAssignment_0 ) ) )
            // InternalMyDsl.g:3439:1: ( ( rule__NumberLiteral__ValueAssignment_0 ) )
            {
            // InternalMyDsl.g:3439:1: ( ( rule__NumberLiteral__ValueAssignment_0 ) )
            // InternalMyDsl.g:3440:2: ( rule__NumberLiteral__ValueAssignment_0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_0()); 
            // InternalMyDsl.g:3441:2: ( rule__NumberLiteral__ValueAssignment_0 )
            // InternalMyDsl.g:3441:3: rule__NumberLiteral__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // InternalMyDsl.g:3449:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3453:1: ( rule__NumberLiteral__Group__1__Impl )
            // InternalMyDsl.g:3454:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // InternalMyDsl.g:3460:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__Group_1__0 )? ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3464:1: ( ( ( rule__NumberLiteral__Group_1__0 )? ) )
            // InternalMyDsl.g:3465:1: ( ( rule__NumberLiteral__Group_1__0 )? )
            {
            // InternalMyDsl.g:3465:1: ( ( rule__NumberLiteral__Group_1__0 )? )
            // InternalMyDsl.g:3466:2: ( rule__NumberLiteral__Group_1__0 )?
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup_1()); 
            // InternalMyDsl.g:3467:2: ( rule__NumberLiteral__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==53) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:3467:3: rule__NumberLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberLiteralAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_1__0"
    // InternalMyDsl.g:3476:1: rule__NumberLiteral__Group_1__0 : rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 ;
    public final void rule__NumberLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3480:1: ( rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 )
            // InternalMyDsl.g:3481:2: rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__NumberLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_1__0"


    // $ANTLR start "rule__NumberLiteral__Group_1__0__Impl"
    // InternalMyDsl.g:3488:1: rule__NumberLiteral__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NumberLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3492:1: ( ( '.' ) )
            // InternalMyDsl.g:3493:1: ( '.' )
            {
            // InternalMyDsl.g:3493:1: ( '.' )
            // InternalMyDsl.g:3494:2: '.'
            {
             before(grammarAccess.getNumberLiteralAccess().getFullStopKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_1__1"
    // InternalMyDsl.g:3503:1: rule__NumberLiteral__Group_1__1 : rule__NumberLiteral__Group_1__1__Impl ;
    public final void rule__NumberLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3507:1: ( rule__NumberLiteral__Group_1__1__Impl )
            // InternalMyDsl.g:3508:2: rule__NumberLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_1__1"


    // $ANTLR start "rule__NumberLiteral__Group_1__1__Impl"
    // InternalMyDsl.g:3514:1: rule__NumberLiteral__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NumberLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3518:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3519:1: ( RULE_INT )
            {
            // InternalMyDsl.g:3519:1: ( RULE_INT )
            // InternalMyDsl.g:3520:2: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__PatternModel__ElementsAssignment_0"
    // InternalMyDsl.g:3530:1: rule__PatternModel__ElementsAssignment_0 : ( rulePatternInitialization ) ;
    public final void rule__PatternModel__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3534:1: ( ( rulePatternInitialization ) )
            // InternalMyDsl.g:3535:2: ( rulePatternInitialization )
            {
            // InternalMyDsl.g:3535:2: ( rulePatternInitialization )
            // InternalMyDsl.g:3536:3: rulePatternInitialization
            {
             before(grammarAccess.getPatternModelAccess().getElementsPatternInitializationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePatternInitialization();

            state._fsp--;

             after(grammarAccess.getPatternModelAccess().getElementsPatternInitializationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternModel__ElementsAssignment_0"


    // $ANTLR start "rule__PatternModel__ElementsAssignment_1"
    // InternalMyDsl.g:3545:1: rule__PatternModel__ElementsAssignment_1 : ( ruleQueryInitialization ) ;
    public final void rule__PatternModel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3549:1: ( ( ruleQueryInitialization ) )
            // InternalMyDsl.g:3550:2: ( ruleQueryInitialization )
            {
            // InternalMyDsl.g:3550:2: ( ruleQueryInitialization )
            // InternalMyDsl.g:3551:3: ruleQueryInitialization
            {
             before(grammarAccess.getPatternModelAccess().getElementsQueryInitializationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryInitialization();

            state._fsp--;

             after(grammarAccess.getPatternModelAccess().getElementsQueryInitializationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternModel__ElementsAssignment_1"


    // $ANTLR start "rule__PatternModel__ElementsAssignment_2"
    // InternalMyDsl.g:3560:1: rule__PatternModel__ElementsAssignment_2 : ( ruleComplexInitialization ) ;
    public final void rule__PatternModel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3564:1: ( ( ruleComplexInitialization ) )
            // InternalMyDsl.g:3565:2: ( ruleComplexInitialization )
            {
            // InternalMyDsl.g:3565:2: ( ruleComplexInitialization )
            // InternalMyDsl.g:3566:3: ruleComplexInitialization
            {
             before(grammarAccess.getPatternModelAccess().getElementsComplexInitializationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexInitialization();

            state._fsp--;

             after(grammarAccess.getPatternModelAccess().getElementsComplexInitializationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternModel__ElementsAssignment_2"


    // $ANTLR start "rule__QueryInitialization__NameAssignment_2"
    // InternalMyDsl.g:3575:1: rule__QueryInitialization__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__QueryInitialization__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3579:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3580:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3580:2: ( RULE_ID )
            // InternalMyDsl.g:3581:3: RULE_ID
            {
             before(grammarAccess.getQueryInitializationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryInitializationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__NameAssignment_2"


    // $ANTLR start "rule__QueryInitialization__TimeWindowAssignment_3"
    // InternalMyDsl.g:3590:1: rule__QueryInitialization__TimeWindowAssignment_3 : ( ruleTimeWindow ) ;
    public final void rule__QueryInitialization__TimeWindowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3594:1: ( ( ruleTimeWindow ) )
            // InternalMyDsl.g:3595:2: ( ruleTimeWindow )
            {
            // InternalMyDsl.g:3595:2: ( ruleTimeWindow )
            // InternalMyDsl.g:3596:3: ruleTimeWindow
            {
             before(grammarAccess.getQueryInitializationAccess().getTimeWindowTimeWindowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeWindow();

            state._fsp--;

             after(grammarAccess.getQueryInitializationAccess().getTimeWindowTimeWindowParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__TimeWindowAssignment_3"


    // $ANTLR start "rule__QueryInitialization__InputStatementsAssignment_7"
    // InternalMyDsl.g:3605:1: rule__QueryInitialization__InputStatementsAssignment_7 : ( ruleInputStatement ) ;
    public final void rule__QueryInitialization__InputStatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3609:1: ( ( ruleInputStatement ) )
            // InternalMyDsl.g:3610:2: ( ruleInputStatement )
            {
            // InternalMyDsl.g:3610:2: ( ruleInputStatement )
            // InternalMyDsl.g:3611:3: ruleInputStatement
            {
             before(grammarAccess.getQueryInitializationAccess().getInputStatementsInputStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInputStatement();

            state._fsp--;

             after(grammarAccess.getQueryInitializationAccess().getInputStatementsInputStatementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryInitialization__InputStatementsAssignment_7"


    // $ANTLR start "rule__PatternInitialization__NameAssignment_2"
    // InternalMyDsl.g:3620:1: rule__PatternInitialization__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PatternInitialization__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3624:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3625:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3625:2: ( RULE_ID )
            // InternalMyDsl.g:3626:3: RULE_ID
            {
             before(grammarAccess.getPatternInitializationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternInitializationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__NameAssignment_2"


    // $ANTLR start "rule__PatternInitialization__TimeWindowAssignment_3"
    // InternalMyDsl.g:3635:1: rule__PatternInitialization__TimeWindowAssignment_3 : ( ruleTimeWindow ) ;
    public final void rule__PatternInitialization__TimeWindowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3639:1: ( ( ruleTimeWindow ) )
            // InternalMyDsl.g:3640:2: ( ruleTimeWindow )
            {
            // InternalMyDsl.g:3640:2: ( ruleTimeWindow )
            // InternalMyDsl.g:3641:3: ruleTimeWindow
            {
             before(grammarAccess.getPatternInitializationAccess().getTimeWindowTimeWindowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeWindow();

            state._fsp--;

             after(grammarAccess.getPatternInitializationAccess().getTimeWindowTimeWindowParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__TimeWindowAssignment_3"


    // $ANTLR start "rule__PatternInitialization__InputStatementsAssignment_7"
    // InternalMyDsl.g:3650:1: rule__PatternInitialization__InputStatementsAssignment_7 : ( ruleInputStatement ) ;
    public final void rule__PatternInitialization__InputStatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3654:1: ( ( ruleInputStatement ) )
            // InternalMyDsl.g:3655:2: ( ruleInputStatement )
            {
            // InternalMyDsl.g:3655:2: ( ruleInputStatement )
            // InternalMyDsl.g:3656:3: ruleInputStatement
            {
             before(grammarAccess.getPatternInitializationAccess().getInputStatementsInputStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInputStatement();

            state._fsp--;

             after(grammarAccess.getPatternInitializationAccess().getInputStatementsInputStatementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__InputStatementsAssignment_7"


    // $ANTLR start "rule__PatternInitialization__PatternStatementsAssignment_11"
    // InternalMyDsl.g:3665:1: rule__PatternInitialization__PatternStatementsAssignment_11 : ( rulePatternStatement ) ;
    public final void rule__PatternInitialization__PatternStatementsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3669:1: ( ( rulePatternStatement ) )
            // InternalMyDsl.g:3670:2: ( rulePatternStatement )
            {
            // InternalMyDsl.g:3670:2: ( rulePatternStatement )
            // InternalMyDsl.g:3671:3: rulePatternStatement
            {
             before(grammarAccess.getPatternInitializationAccess().getPatternStatementsPatternStatementParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePatternStatement();

            state._fsp--;

             after(grammarAccess.getPatternInitializationAccess().getPatternStatementsPatternStatementParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternInitialization__PatternStatementsAssignment_11"


    // $ANTLR start "rule__ComplexInitialization__NameAssignment_2"
    // InternalMyDsl.g:3680:1: rule__ComplexInitialization__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexInitialization__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3684:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3685:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3685:2: ( RULE_ID )
            // InternalMyDsl.g:3686:3: RULE_ID
            {
             before(grammarAccess.getComplexInitializationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplexInitializationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__NameAssignment_2"


    // $ANTLR start "rule__ComplexInitialization__TimeWindowAssignment_3"
    // InternalMyDsl.g:3695:1: rule__ComplexInitialization__TimeWindowAssignment_3 : ( ruleTimeWindow ) ;
    public final void rule__ComplexInitialization__TimeWindowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3699:1: ( ( ruleTimeWindow ) )
            // InternalMyDsl.g:3700:2: ( ruleTimeWindow )
            {
            // InternalMyDsl.g:3700:2: ( ruleTimeWindow )
            // InternalMyDsl.g:3701:3: ruleTimeWindow
            {
             before(grammarAccess.getComplexInitializationAccess().getTimeWindowTimeWindowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeWindow();

            state._fsp--;

             after(grammarAccess.getComplexInitializationAccess().getTimeWindowTimeWindowParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__TimeWindowAssignment_3"


    // $ANTLR start "rule__ComplexInitialization__InputStatementsAssignment_7"
    // InternalMyDsl.g:3710:1: rule__ComplexInitialization__InputStatementsAssignment_7 : ( ruleInputStatement ) ;
    public final void rule__ComplexInitialization__InputStatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3714:1: ( ( ruleInputStatement ) )
            // InternalMyDsl.g:3715:2: ( ruleInputStatement )
            {
            // InternalMyDsl.g:3715:2: ( ruleInputStatement )
            // InternalMyDsl.g:3716:3: ruleInputStatement
            {
             before(grammarAccess.getComplexInitializationAccess().getInputStatementsInputStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInputStatement();

            state._fsp--;

             after(grammarAccess.getComplexInitializationAccess().getInputStatementsInputStatementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__InputStatementsAssignment_7"


    // $ANTLR start "rule__ComplexInitialization__ComplexPatternStatementsAssignment_11"
    // InternalMyDsl.g:3725:1: rule__ComplexInitialization__ComplexPatternStatementsAssignment_11 : ( ruleComplexPatternStatements ) ;
    public final void rule__ComplexInitialization__ComplexPatternStatementsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3729:1: ( ( ruleComplexPatternStatements ) )
            // InternalMyDsl.g:3730:2: ( ruleComplexPatternStatements )
            {
            // InternalMyDsl.g:3730:2: ( ruleComplexPatternStatements )
            // InternalMyDsl.g:3731:3: ruleComplexPatternStatements
            {
             before(grammarAccess.getComplexInitializationAccess().getComplexPatternStatementsComplexPatternStatementsParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexPatternStatements();

            state._fsp--;

             after(grammarAccess.getComplexInitializationAccess().getComplexPatternStatementsComplexPatternStatementsParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexInitialization__ComplexPatternStatementsAssignment_11"


    // $ANTLR start "rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2"
    // InternalMyDsl.g:3740:1: rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2 : ( ruleComplexPatternType ) ;
    public final void rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3744:1: ( ( ruleComplexPatternType ) )
            // InternalMyDsl.g:3745:2: ( ruleComplexPatternType )
            {
            // InternalMyDsl.g:3745:2: ( ruleComplexPatternType )
            // InternalMyDsl.g:3746:3: ruleComplexPatternType
            {
             before(grammarAccess.getComplexPatternStatementsAccess().getComplexPatternTypeComplexPatternTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexPatternType();

            state._fsp--;

             after(grammarAccess.getComplexPatternStatementsAccess().getComplexPatternTypeComplexPatternTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternStatements__ComplexPatternTypeAssignment_2"


    // $ANTLR start "rule__ComplexPatternType__FirstEventAssignment_0"
    // InternalMyDsl.g:3755:1: rule__ComplexPatternType__FirstEventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ComplexPatternType__FirstEventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3759:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3760:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3760:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3761:3: ( RULE_ID )
            {
             before(grammarAccess.getComplexPatternTypeAccess().getFirstEventInputStatementCrossReference_0_0()); 
            // InternalMyDsl.g:3762:3: ( RULE_ID )
            // InternalMyDsl.g:3763:4: RULE_ID
            {
             before(grammarAccess.getComplexPatternTypeAccess().getFirstEventInputStatementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplexPatternTypeAccess().getFirstEventInputStatementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getComplexPatternTypeAccess().getFirstEventInputStatementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__FirstEventAssignment_0"


    // $ANTLR start "rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1"
    // InternalMyDsl.g:3774:1: rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1 : ( ruleGreedyQuantifiers ) ;
    public final void rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3778:1: ( ( ruleGreedyQuantifiers ) )
            // InternalMyDsl.g:3779:2: ( ruleGreedyQuantifiers )
            {
            // InternalMyDsl.g:3779:2: ( ruleGreedyQuantifiers )
            // InternalMyDsl.g:3780:3: ruleGreedyQuantifiers
            {
             before(grammarAccess.getComplexPatternTypeAccess().getGreedyQuantifiersGreedyQuantifiersEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGreedyQuantifiers();

            state._fsp--;

             after(grammarAccess.getComplexPatternTypeAccess().getGreedyQuantifiersGreedyQuantifiersEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__GreedyQuantifiersAssignment_1_1"


    // $ANTLR start "rule__ComplexPatternType__ComplexPatternOptionsAssignment_2"
    // InternalMyDsl.g:3789:1: rule__ComplexPatternType__ComplexPatternOptionsAssignment_2 : ( ruleComplexPatternOptions ) ;
    public final void rule__ComplexPatternType__ComplexPatternOptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3793:1: ( ( ruleComplexPatternOptions ) )
            // InternalMyDsl.g:3794:2: ( ruleComplexPatternOptions )
            {
            // InternalMyDsl.g:3794:2: ( ruleComplexPatternOptions )
            // InternalMyDsl.g:3795:3: ruleComplexPatternOptions
            {
             before(grammarAccess.getComplexPatternTypeAccess().getComplexPatternOptionsComplexPatternOptionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexPatternOptions();

            state._fsp--;

             after(grammarAccess.getComplexPatternTypeAccess().getComplexPatternOptionsComplexPatternOptionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternType__ComplexPatternOptionsAssignment_2"


    // $ANTLR start "rule__ComplexPatternOptions__SeceondEventAssignment_1"
    // InternalMyDsl.g:3804:1: rule__ComplexPatternOptions__SeceondEventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComplexPatternOptions__SeceondEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3808:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3809:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3809:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3810:3: ( RULE_ID )
            {
             before(grammarAccess.getComplexPatternOptionsAccess().getSeceondEventInputStatementCrossReference_1_0()); 
            // InternalMyDsl.g:3811:3: ( RULE_ID )
            // InternalMyDsl.g:3812:4: RULE_ID
            {
             before(grammarAccess.getComplexPatternOptionsAccess().getSeceondEventInputStatementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplexPatternOptionsAccess().getSeceondEventInputStatementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComplexPatternOptionsAccess().getSeceondEventInputStatementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__SeceondEventAssignment_1"


    // $ANTLR start "rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1"
    // InternalMyDsl.g:3823:1: rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1 : ( ruleGreedyQuantifiers ) ;
    public final void rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3827:1: ( ( ruleGreedyQuantifiers ) )
            // InternalMyDsl.g:3828:2: ( ruleGreedyQuantifiers )
            {
            // InternalMyDsl.g:3828:2: ( ruleGreedyQuantifiers )
            // InternalMyDsl.g:3829:3: ruleGreedyQuantifiers
            {
             before(grammarAccess.getComplexPatternOptionsAccess().getGreedyQuantifiersGreedyQuantifiersEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGreedyQuantifiers();

            state._fsp--;

             after(grammarAccess.getComplexPatternOptionsAccess().getGreedyQuantifiersGreedyQuantifiersEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPatternOptions__GreedyQuantifiersAssignment_2_1"


    // $ANTLR start "rule__InputStatement__NameAssignment_1"
    // InternalMyDsl.g:3838:1: rule__InputStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InputStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3842:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3843:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3843:2: ( RULE_ID )
            // InternalMyDsl.g:3844:3: RULE_ID
            {
             before(grammarAccess.getInputStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__NameAssignment_1"


    // $ANTLR start "rule__InputStatement__PropertyAssignment_3"
    // InternalMyDsl.g:3853:1: rule__InputStatement__PropertyAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InputStatement__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3858:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3858:2: ( RULE_STRING )
            // InternalMyDsl.g:3859:3: RULE_STRING
            {
             before(grammarAccess.getInputStatementAccess().getPropertySTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputStatementAccess().getPropertySTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__PropertyAssignment_3"


    // $ANTLR start "rule__InputStatement__ComparisonOperatorAssignment_6"
    // InternalMyDsl.g:3868:1: rule__InputStatement__ComparisonOperatorAssignment_6 : ( ruleComparisonOperator ) ;
    public final void rule__InputStatement__ComparisonOperatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3872:1: ( ( ruleComparisonOperator ) )
            // InternalMyDsl.g:3873:2: ( ruleComparisonOperator )
            {
            // InternalMyDsl.g:3873:2: ( ruleComparisonOperator )
            // InternalMyDsl.g:3874:3: ruleComparisonOperator
            {
             before(grammarAccess.getInputStatementAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getInputStatementAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__ComparisonOperatorAssignment_6"


    // $ANTLR start "rule__InputStatement__ValueAssignment_7"
    // InternalMyDsl.g:3883:1: rule__InputStatement__ValueAssignment_7 : ( ruleValueOptions ) ;
    public final void rule__InputStatement__ValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3887:1: ( ( ruleValueOptions ) )
            // InternalMyDsl.g:3888:2: ( ruleValueOptions )
            {
            // InternalMyDsl.g:3888:2: ( ruleValueOptions )
            // InternalMyDsl.g:3889:3: ruleValueOptions
            {
             before(grammarAccess.getInputStatementAccess().getValueValueOptionsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleValueOptions();

            state._fsp--;

             after(grammarAccess.getInputStatementAccess().getValueValueOptionsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputStatement__ValueAssignment_7"


    // $ANTLR start "rule__PatternStatement__PatternTypeAssignment_2"
    // InternalMyDsl.g:3898:1: rule__PatternStatement__PatternTypeAssignment_2 : ( rulePatternType ) ;
    public final void rule__PatternStatement__PatternTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3902:1: ( ( rulePatternType ) )
            // InternalMyDsl.g:3903:2: ( rulePatternType )
            {
            // InternalMyDsl.g:3903:2: ( rulePatternType )
            // InternalMyDsl.g:3904:3: rulePatternType
            {
             before(grammarAccess.getPatternStatementAccess().getPatternTypePatternTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePatternType();

            state._fsp--;

             after(grammarAccess.getPatternStatementAccess().getPatternTypePatternTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternStatement__PatternTypeAssignment_2"


    // $ANTLR start "rule__PatternType__FirstEventAssignment_0"
    // InternalMyDsl.g:3913:1: rule__PatternType__FirstEventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternType__FirstEventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3917:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3918:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3918:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3919:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternTypeAccess().getFirstEventInputStatementCrossReference_0_0()); 
            // InternalMyDsl.g:3920:3: ( RULE_ID )
            // InternalMyDsl.g:3921:4: RULE_ID
            {
             before(grammarAccess.getPatternTypeAccess().getFirstEventInputStatementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternTypeAccess().getFirstEventInputStatementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternTypeAccess().getFirstEventInputStatementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternType__FirstEventAssignment_0"


    // $ANTLR start "rule__PatternType__PatternOptionsAssignment_1"
    // InternalMyDsl.g:3932:1: rule__PatternType__PatternOptionsAssignment_1 : ( rulePatternOptions ) ;
    public final void rule__PatternType__PatternOptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3936:1: ( ( rulePatternOptions ) )
            // InternalMyDsl.g:3937:2: ( rulePatternOptions )
            {
            // InternalMyDsl.g:3937:2: ( rulePatternOptions )
            // InternalMyDsl.g:3938:3: rulePatternOptions
            {
             before(grammarAccess.getPatternTypeAccess().getPatternOptionsPatternOptionsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePatternOptions();

            state._fsp--;

             after(grammarAccess.getPatternTypeAccess().getPatternOptionsPatternOptionsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternType__PatternOptionsAssignment_1"


    // $ANTLR start "rule__PatternOptions__OccurenceAtLeastAssignment_0"
    // InternalMyDsl.g:3947:1: rule__PatternOptions__OccurenceAtLeastAssignment_0 : ( ruleOccurenceAtLeast ) ;
    public final void rule__PatternOptions__OccurenceAtLeastAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3951:1: ( ( ruleOccurenceAtLeast ) )
            // InternalMyDsl.g:3952:2: ( ruleOccurenceAtLeast )
            {
            // InternalMyDsl.g:3952:2: ( ruleOccurenceAtLeast )
            // InternalMyDsl.g:3953:3: ruleOccurenceAtLeast
            {
             before(grammarAccess.getPatternOptionsAccess().getOccurenceAtLeastOccurenceAtLeastParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOccurenceAtLeast();

            state._fsp--;

             after(grammarAccess.getPatternOptionsAccess().getOccurenceAtLeastOccurenceAtLeastParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternOptions__OccurenceAtLeastAssignment_0"


    // $ANTLR start "rule__PatternOptions__OccurenceAtMostAssignment_1"
    // InternalMyDsl.g:3962:1: rule__PatternOptions__OccurenceAtMostAssignment_1 : ( ruleOccurenceAtMost ) ;
    public final void rule__PatternOptions__OccurenceAtMostAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3966:1: ( ( ruleOccurenceAtMost ) )
            // InternalMyDsl.g:3967:2: ( ruleOccurenceAtMost )
            {
            // InternalMyDsl.g:3967:2: ( ruleOccurenceAtMost )
            // InternalMyDsl.g:3968:3: ruleOccurenceAtMost
            {
             before(grammarAccess.getPatternOptionsAccess().getOccurenceAtMostOccurenceAtMostParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOccurenceAtMost();

            state._fsp--;

             after(grammarAccess.getPatternOptionsAccess().getOccurenceAtMostOccurenceAtMostParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternOptions__OccurenceAtMostAssignment_1"


    // $ANTLR start "rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2"
    // InternalMyDsl.g:3977:1: rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2 : ( ruleOccurenceAtNotSpecificTime ) ;
    public final void rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3981:1: ( ( ruleOccurenceAtNotSpecificTime ) )
            // InternalMyDsl.g:3982:2: ( ruleOccurenceAtNotSpecificTime )
            {
            // InternalMyDsl.g:3982:2: ( ruleOccurenceAtNotSpecificTime )
            // InternalMyDsl.g:3983:3: ruleOccurenceAtNotSpecificTime
            {
             before(grammarAccess.getPatternOptionsAccess().getOccurenceAtNotSpecificTimeOccurenceAtNotSpecificTimeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOccurenceAtNotSpecificTime();

            state._fsp--;

             after(grammarAccess.getPatternOptionsAccess().getOccurenceAtNotSpecificTimeOccurenceAtNotSpecificTimeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternOptions__OccurenceAtNotSpecificTimeAssignment_2"


    // $ANTLR start "rule__OccurenceAtLeast__SeceondEventAssignment_1"
    // InternalMyDsl.g:3992:1: rule__OccurenceAtLeast__SeceondEventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OccurenceAtLeast__SeceondEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3996:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3997:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3997:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3998:3: ( RULE_ID )
            {
             before(grammarAccess.getOccurenceAtLeastAccess().getSeceondEventInputStatementCrossReference_1_0()); 
            // InternalMyDsl.g:3999:3: ( RULE_ID )
            // InternalMyDsl.g:4000:4: RULE_ID
            {
             before(grammarAccess.getOccurenceAtLeastAccess().getSeceondEventInputStatementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtLeastAccess().getSeceondEventInputStatementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOccurenceAtLeastAccess().getSeceondEventInputStatementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__SeceondEventAssignment_1"


    // $ANTLR start "rule__OccurenceAtLeast__MinDurationAssignment_4"
    // InternalMyDsl.g:4011:1: rule__OccurenceAtLeast__MinDurationAssignment_4 : ( ruleMinDuration ) ;
    public final void rule__OccurenceAtLeast__MinDurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4015:1: ( ( ruleMinDuration ) )
            // InternalMyDsl.g:4016:2: ( ruleMinDuration )
            {
            // InternalMyDsl.g:4016:2: ( ruleMinDuration )
            // InternalMyDsl.g:4017:3: ruleMinDuration
            {
             before(grammarAccess.getOccurenceAtLeastAccess().getMinDurationMinDurationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMinDuration();

            state._fsp--;

             after(grammarAccess.getOccurenceAtLeastAccess().getMinDurationMinDurationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtLeast__MinDurationAssignment_4"


    // $ANTLR start "rule__OccurenceAtMost__SeceondEventAssignment_1"
    // InternalMyDsl.g:4026:1: rule__OccurenceAtMost__SeceondEventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OccurenceAtMost__SeceondEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4030:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4031:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4031:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4032:3: ( RULE_ID )
            {
             before(grammarAccess.getOccurenceAtMostAccess().getSeceondEventInputStatementCrossReference_1_0()); 
            // InternalMyDsl.g:4033:3: ( RULE_ID )
            // InternalMyDsl.g:4034:4: RULE_ID
            {
             before(grammarAccess.getOccurenceAtMostAccess().getSeceondEventInputStatementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtMostAccess().getSeceondEventInputStatementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOccurenceAtMostAccess().getSeceondEventInputStatementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__SeceondEventAssignment_1"


    // $ANTLR start "rule__OccurenceAtMost__MaxDurationAssignment_4"
    // InternalMyDsl.g:4045:1: rule__OccurenceAtMost__MaxDurationAssignment_4 : ( ruleMaxDuration ) ;
    public final void rule__OccurenceAtMost__MaxDurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4049:1: ( ( ruleMaxDuration ) )
            // InternalMyDsl.g:4050:2: ( ruleMaxDuration )
            {
            // InternalMyDsl.g:4050:2: ( ruleMaxDuration )
            // InternalMyDsl.g:4051:3: ruleMaxDuration
            {
             before(grammarAccess.getOccurenceAtMostAccess().getMaxDurationMaxDurationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMaxDuration();

            state._fsp--;

             after(grammarAccess.getOccurenceAtMostAccess().getMaxDurationMaxDurationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtMost__MaxDurationAssignment_4"


    // $ANTLR start "rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1"
    // InternalMyDsl.g:4060:1: rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4064:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4065:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4065:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4066:3: ( RULE_ID )
            {
             before(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getSeceondEventInputStatementCrossReference_1_0()); 
            // InternalMyDsl.g:4067:3: ( RULE_ID )
            // InternalMyDsl.g:4068:4: RULE_ID
            {
             before(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getSeceondEventInputStatementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getSeceondEventInputStatementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOccurenceAtNotSpecificTimeAccess().getSeceondEventInputStatementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurenceAtNotSpecificTime__SeceondEventAssignment_1"


    // $ANTLR start "rule__MaxDuration__TimerTypeAssignment_0"
    // InternalMyDsl.g:4079:1: rule__MaxDuration__TimerTypeAssignment_0 : ( ( 'MaxDuration' ) ) ;
    public final void rule__MaxDuration__TimerTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4083:1: ( ( ( 'MaxDuration' ) ) )
            // InternalMyDsl.g:4084:2: ( ( 'MaxDuration' ) )
            {
            // InternalMyDsl.g:4084:2: ( ( 'MaxDuration' ) )
            // InternalMyDsl.g:4085:3: ( 'MaxDuration' )
            {
             before(grammarAccess.getMaxDurationAccess().getTimerTypeMaxDurationKeyword_0_0()); 
            // InternalMyDsl.g:4086:3: ( 'MaxDuration' )
            // InternalMyDsl.g:4087:4: 'MaxDuration'
            {
             before(grammarAccess.getMaxDurationAccess().getTimerTypeMaxDurationKeyword_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMaxDurationAccess().getTimerTypeMaxDurationKeyword_0_0()); 

            }

             after(grammarAccess.getMaxDurationAccess().getTimerTypeMaxDurationKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__TimerTypeAssignment_0"


    // $ANTLR start "rule__MaxDuration__TimeAssignment_2"
    // InternalMyDsl.g:4098:1: rule__MaxDuration__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__MaxDuration__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4102:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4103:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4103:2: ( RULE_INT )
            // InternalMyDsl.g:4104:3: RULE_INT
            {
             before(grammarAccess.getMaxDurationAccess().getTimeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMaxDurationAccess().getTimeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__TimeAssignment_2"


    // $ANTLR start "rule__MaxDuration__TimeUnitAssignment_3"
    // InternalMyDsl.g:4113:1: rule__MaxDuration__TimeUnitAssignment_3 : ( ruleTimeUnit ) ;
    public final void rule__MaxDuration__TimeUnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( ( ruleTimeUnit ) )
            // InternalMyDsl.g:4118:2: ( ruleTimeUnit )
            {
            // InternalMyDsl.g:4118:2: ( ruleTimeUnit )
            // InternalMyDsl.g:4119:3: ruleTimeUnit
            {
             before(grammarAccess.getMaxDurationAccess().getTimeUnitTimeUnitEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getMaxDurationAccess().getTimeUnitTimeUnitEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDuration__TimeUnitAssignment_3"


    // $ANTLR start "rule__MinDuration__TimerTypeAssignment_0"
    // InternalMyDsl.g:4128:1: rule__MinDuration__TimerTypeAssignment_0 : ( ( 'MinDuration' ) ) ;
    public final void rule__MinDuration__TimerTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4132:1: ( ( ( 'MinDuration' ) ) )
            // InternalMyDsl.g:4133:2: ( ( 'MinDuration' ) )
            {
            // InternalMyDsl.g:4133:2: ( ( 'MinDuration' ) )
            // InternalMyDsl.g:4134:3: ( 'MinDuration' )
            {
             before(grammarAccess.getMinDurationAccess().getTimerTypeMinDurationKeyword_0_0()); 
            // InternalMyDsl.g:4135:3: ( 'MinDuration' )
            // InternalMyDsl.g:4136:4: 'MinDuration'
            {
             before(grammarAccess.getMinDurationAccess().getTimerTypeMinDurationKeyword_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMinDurationAccess().getTimerTypeMinDurationKeyword_0_0()); 

            }

             after(grammarAccess.getMinDurationAccess().getTimerTypeMinDurationKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__TimerTypeAssignment_0"


    // $ANTLR start "rule__MinDuration__TimeAssignment_2"
    // InternalMyDsl.g:4147:1: rule__MinDuration__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__MinDuration__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4151:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4152:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4152:2: ( RULE_INT )
            // InternalMyDsl.g:4153:3: RULE_INT
            {
             before(grammarAccess.getMinDurationAccess().getTimeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMinDurationAccess().getTimeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__TimeAssignment_2"


    // $ANTLR start "rule__MinDuration__TimeUnitAssignment_3"
    // InternalMyDsl.g:4162:1: rule__MinDuration__TimeUnitAssignment_3 : ( ruleTimeUnit ) ;
    public final void rule__MinDuration__TimeUnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4166:1: ( ( ruleTimeUnit ) )
            // InternalMyDsl.g:4167:2: ( ruleTimeUnit )
            {
            // InternalMyDsl.g:4167:2: ( ruleTimeUnit )
            // InternalMyDsl.g:4168:3: ruleTimeUnit
            {
             before(grammarAccess.getMinDurationAccess().getTimeUnitTimeUnitEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getMinDurationAccess().getTimeUnitTimeUnitEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDuration__TimeUnitAssignment_3"


    // $ANTLR start "rule__TimeWindow__TimeAssignment_3"
    // InternalMyDsl.g:4177:1: rule__TimeWindow__TimeAssignment_3 : ( RULE_INT ) ;
    public final void rule__TimeWindow__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4182:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4182:2: ( RULE_INT )
            // InternalMyDsl.g:4183:3: RULE_INT
            {
             before(grammarAccess.getTimeWindowAccess().getTimeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeWindowAccess().getTimeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__TimeAssignment_3"


    // $ANTLR start "rule__TimeWindow__TimeUnitAssignment_4"
    // InternalMyDsl.g:4192:1: rule__TimeWindow__TimeUnitAssignment_4 : ( ruleTimeUnit ) ;
    public final void rule__TimeWindow__TimeUnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4196:1: ( ( ruleTimeUnit ) )
            // InternalMyDsl.g:4197:2: ( ruleTimeUnit )
            {
            // InternalMyDsl.g:4197:2: ( ruleTimeUnit )
            // InternalMyDsl.g:4198:3: ruleTimeUnit
            {
             before(grammarAccess.getTimeWindowAccess().getTimeUnitTimeUnitEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeWindowAccess().getTimeUnitTimeUnitEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWindow__TimeUnitAssignment_4"


    // $ANTLR start "rule__ValueOptions__StringLiteralAssignment_0"
    // InternalMyDsl.g:4207:1: rule__ValueOptions__StringLiteralAssignment_0 : ( ruleStringLiteral ) ;
    public final void rule__ValueOptions__StringLiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4211:1: ( ( ruleStringLiteral ) )
            // InternalMyDsl.g:4212:2: ( ruleStringLiteral )
            {
            // InternalMyDsl.g:4212:2: ( ruleStringLiteral )
            // InternalMyDsl.g:4213:3: ruleStringLiteral
            {
             before(grammarAccess.getValueOptionsAccess().getStringLiteralStringLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getValueOptionsAccess().getStringLiteralStringLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueOptions__StringLiteralAssignment_0"


    // $ANTLR start "rule__ValueOptions__NumberLiteralAssignment_1"
    // InternalMyDsl.g:4222:1: rule__ValueOptions__NumberLiteralAssignment_1 : ( ruleNumberLiteral ) ;
    public final void rule__ValueOptions__NumberLiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4226:1: ( ( ruleNumberLiteral ) )
            // InternalMyDsl.g:4227:2: ( ruleNumberLiteral )
            {
            // InternalMyDsl.g:4227:2: ( ruleNumberLiteral )
            // InternalMyDsl.g:4228:3: ruleNumberLiteral
            {
             before(grammarAccess.getValueOptionsAccess().getNumberLiteralNumberLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getValueOptionsAccess().getNumberLiteralNumberLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueOptions__NumberLiteralAssignment_1"


    // $ANTLR start "rule__ValueOptions__TextLiteralAssignment_2"
    // InternalMyDsl.g:4237:1: rule__ValueOptions__TextLiteralAssignment_2 : ( ruleTextLiteral ) ;
    public final void rule__ValueOptions__TextLiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( ( ruleTextLiteral ) )
            // InternalMyDsl.g:4242:2: ( ruleTextLiteral )
            {
            // InternalMyDsl.g:4242:2: ( ruleTextLiteral )
            // InternalMyDsl.g:4243:3: ruleTextLiteral
            {
             before(grammarAccess.getValueOptionsAccess().getTextLiteralTextLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTextLiteral();

            state._fsp--;

             after(grammarAccess.getValueOptionsAccess().getTextLiteralTextLiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueOptions__TextLiteralAssignment_2"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalMyDsl.g:4252:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4256:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4257:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4257:2: ( RULE_STRING )
            // InternalMyDsl.g:4258:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_0"
    // InternalMyDsl.g:4267:1: rule__NumberLiteral__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4271:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4272:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4272:2: ( RULE_INT )
            // InternalMyDsl.g:4273:3: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_0"


    // $ANTLR start "rule__TextLiteral__ValueAssignment"
    // InternalMyDsl.g:4282:1: rule__TextLiteral__ValueAssignment : ( RULE_ID ) ;
    public final void rule__TextLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4286:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4287:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4287:2: ( RULE_ID )
            // InternalMyDsl.g:4288:3: RULE_ID
            {
             before(grammarAccess.getTextLiteralAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextLiteralAccess().getValueIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});

}