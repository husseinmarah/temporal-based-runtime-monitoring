package org.xtext.constraint.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.constraint.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Initialize:'", "'SimpleConstraint'", "'{'", "'Event'", "'}'", "'RealTimeConstraint'", "'Events'", "'Pattern'", "'ComplexConstraint'", "'DefinePattern'", "'('", "')'", "'Occurs'", "'followed-by'", "'InputEvent'", "'as'", "'and'", "'SetEvent'", "','", "'Occurs-After'", "'@'", "'Occurs-Before'", "'MaxDuration'", "'['", "']'", "'MinDuration'", "'With'", "'TimeWindow'", "'.'", "'='", "'!='", "'>'", "'<'", "'=<'", "'=>'", "'microseconds'", "'milliseconds'", "'seconds'", "'minute'", "'hour'", "'day'", "'Once'", "'ZeroOrMore'", "'OneOrMore'", "'ZeroOrOne'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PatternModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePatternModel"
    // InternalMyDsl.g:65:1: entryRulePatternModel returns [EObject current=null] : iv_rulePatternModel= rulePatternModel EOF ;
    public final EObject entryRulePatternModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternModel = null;


        try {
            // InternalMyDsl.g:65:53: (iv_rulePatternModel= rulePatternModel EOF )
            // InternalMyDsl.g:66:2: iv_rulePatternModel= rulePatternModel EOF
            {
             newCompositeNode(grammarAccess.getPatternModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternModel=rulePatternModel();

            state._fsp--;

             current =iv_rulePatternModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternModel"


    // $ANTLR start "rulePatternModel"
    // InternalMyDsl.g:72:1: rulePatternModel returns [EObject current=null] : ( ( (lv_elements_0_0= rulePatternInitialization ) ) | ( (lv_elements_1_0= ruleQueryInitialization ) ) | ( (lv_elements_2_0= ruleComplexInitialization ) ) ) ;
    public final EObject rulePatternModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( (lv_elements_0_0= rulePatternInitialization ) ) | ( (lv_elements_1_0= ruleQueryInitialization ) ) | ( (lv_elements_2_0= ruleComplexInitialization ) ) ) )
            // InternalMyDsl.g:79:2: ( ( (lv_elements_0_0= rulePatternInitialization ) ) | ( (lv_elements_1_0= ruleQueryInitialization ) ) | ( (lv_elements_2_0= ruleComplexInitialization ) ) )
            {
            // InternalMyDsl.g:79:2: ( ( (lv_elements_0_0= rulePatternInitialization ) ) | ( (lv_elements_1_0= ruleQueryInitialization ) ) | ( (lv_elements_2_0= ruleComplexInitialization ) ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt1=1;
                    }
                    break;
                case 12:
                    {
                    alt1=2;
                    }
                    break;
                case 19:
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
                    // InternalMyDsl.g:80:3: ( (lv_elements_0_0= rulePatternInitialization ) )
                    {
                    // InternalMyDsl.g:80:3: ( (lv_elements_0_0= rulePatternInitialization ) )
                    // InternalMyDsl.g:81:4: (lv_elements_0_0= rulePatternInitialization )
                    {
                    // InternalMyDsl.g:81:4: (lv_elements_0_0= rulePatternInitialization )
                    // InternalMyDsl.g:82:5: lv_elements_0_0= rulePatternInitialization
                    {

                    					newCompositeNode(grammarAccess.getPatternModelAccess().getElementsPatternInitializationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_0_0=rulePatternInitialization();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternModelRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_0_0,
                    						"org.xtext.constraint.mydsl.MyDsl.PatternInitialization");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:100:3: ( (lv_elements_1_0= ruleQueryInitialization ) )
                    {
                    // InternalMyDsl.g:100:3: ( (lv_elements_1_0= ruleQueryInitialization ) )
                    // InternalMyDsl.g:101:4: (lv_elements_1_0= ruleQueryInitialization )
                    {
                    // InternalMyDsl.g:101:4: (lv_elements_1_0= ruleQueryInitialization )
                    // InternalMyDsl.g:102:5: lv_elements_1_0= ruleQueryInitialization
                    {

                    					newCompositeNode(grammarAccess.getPatternModelAccess().getElementsQueryInitializationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_1_0=ruleQueryInitialization();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternModelRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_1_0,
                    						"org.xtext.constraint.mydsl.MyDsl.QueryInitialization");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:120:3: ( (lv_elements_2_0= ruleComplexInitialization ) )
                    {
                    // InternalMyDsl.g:120:3: ( (lv_elements_2_0= ruleComplexInitialization ) )
                    // InternalMyDsl.g:121:4: (lv_elements_2_0= ruleComplexInitialization )
                    {
                    // InternalMyDsl.g:121:4: (lv_elements_2_0= ruleComplexInitialization )
                    // InternalMyDsl.g:122:5: lv_elements_2_0= ruleComplexInitialization
                    {

                    					newCompositeNode(grammarAccess.getPatternModelAccess().getElementsComplexInitializationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_2_0=ruleComplexInitialization();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternModelRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_2_0,
                    						"org.xtext.constraint.mydsl.MyDsl.ComplexInitialization");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternModel"


    // $ANTLR start "entryRuleQueryInitialization"
    // InternalMyDsl.g:143:1: entryRuleQueryInitialization returns [EObject current=null] : iv_ruleQueryInitialization= ruleQueryInitialization EOF ;
    public final EObject entryRuleQueryInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryInitialization = null;


        try {
            // InternalMyDsl.g:143:60: (iv_ruleQueryInitialization= ruleQueryInitialization EOF )
            // InternalMyDsl.g:144:2: iv_ruleQueryInitialization= ruleQueryInitialization EOF
            {
             newCompositeNode(grammarAccess.getQueryInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryInitialization=ruleQueryInitialization();

            state._fsp--;

             current =iv_ruleQueryInitialization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryInitialization"


    // $ANTLR start "ruleQueryInitialization"
    // InternalMyDsl.g:150:1: ruleQueryInitialization returns [EObject current=null] : (otherlv_0= 'Initialize:' otherlv_1= 'SimpleConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Event' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) ) otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleQueryInitialization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_timeWindow_3_0 = null;

        EObject lv_inputStatements_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (otherlv_0= 'Initialize:' otherlv_1= 'SimpleConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Event' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) ) otherlv_8= '}' otherlv_9= '}' ) )
            // InternalMyDsl.g:157:2: (otherlv_0= 'Initialize:' otherlv_1= 'SimpleConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Event' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) ) otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalMyDsl.g:157:2: (otherlv_0= 'Initialize:' otherlv_1= 'SimpleConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Event' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) ) otherlv_8= '}' otherlv_9= '}' )
            // InternalMyDsl.g:158:3: otherlv_0= 'Initialize:' otherlv_1= 'SimpleConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Event' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) ) otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryInitializationAccess().getInitializeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryInitializationAccess().getSimpleConstraintKeyword_1());
            		
            // InternalMyDsl.g:166:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:167:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:167:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:168:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getQueryInitializationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryInitializationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:184:3: ( (lv_timeWindow_3_0= ruleTimeWindow ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==37) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:185:4: (lv_timeWindow_3_0= ruleTimeWindow )
                    {
                    // InternalMyDsl.g:185:4: (lv_timeWindow_3_0= ruleTimeWindow )
                    // InternalMyDsl.g:186:5: lv_timeWindow_3_0= ruleTimeWindow
                    {

                    					newCompositeNode(grammarAccess.getQueryInitializationAccess().getTimeWindowTimeWindowParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_timeWindow_3_0=ruleTimeWindow();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQueryInitializationRule());
                    					}
                    					set(
                    						current,
                    						"timeWindow",
                    						lv_timeWindow_3_0,
                    						"org.xtext.constraint.mydsl.MyDsl.TimeWindow");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getQueryInitializationAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getQueryInitializationAccess().getEventKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getQueryInitializationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:215:3: ( (lv_inputStatements_7_0= ruleInputStatement ) )
            // InternalMyDsl.g:216:4: (lv_inputStatements_7_0= ruleInputStatement )
            {
            // InternalMyDsl.g:216:4: (lv_inputStatements_7_0= ruleInputStatement )
            // InternalMyDsl.g:217:5: lv_inputStatements_7_0= ruleInputStatement
            {

            					newCompositeNode(grammarAccess.getQueryInitializationAccess().getInputStatementsInputStatementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_inputStatements_7_0=ruleInputStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryInitializationRule());
            					}
            					set(
            						current,
            						"inputStatements",
            						lv_inputStatements_7_0,
            						"org.xtext.constraint.mydsl.MyDsl.InputStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getQueryInitializationAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getQueryInitializationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryInitialization"


    // $ANTLR start "entryRulePatternInitialization"
    // InternalMyDsl.g:246:1: entryRulePatternInitialization returns [EObject current=null] : iv_rulePatternInitialization= rulePatternInitialization EOF ;
    public final EObject entryRulePatternInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternInitialization = null;


        try {
            // InternalMyDsl.g:246:62: (iv_rulePatternInitialization= rulePatternInitialization EOF )
            // InternalMyDsl.g:247:2: iv_rulePatternInitialization= rulePatternInitialization EOF
            {
             newCompositeNode(grammarAccess.getPatternInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternInitialization=rulePatternInitialization();

            state._fsp--;

             current =iv_rulePatternInitialization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternInitialization"


    // $ANTLR start "rulePatternInitialization"
    // InternalMyDsl.g:253:1: rulePatternInitialization returns [EObject current=null] : (otherlv_0= 'Initialize:' otherlv_1= 'RealTimeConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_patternStatements_11_0= rulePatternStatement ) ) otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject rulePatternInitialization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_timeWindow_3_0 = null;

        EObject lv_inputStatements_7_0 = null;

        EObject lv_patternStatements_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:259:2: ( (otherlv_0= 'Initialize:' otherlv_1= 'RealTimeConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_patternStatements_11_0= rulePatternStatement ) ) otherlv_12= '}' otherlv_13= '}' ) )
            // InternalMyDsl.g:260:2: (otherlv_0= 'Initialize:' otherlv_1= 'RealTimeConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_patternStatements_11_0= rulePatternStatement ) ) otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalMyDsl.g:260:2: (otherlv_0= 'Initialize:' otherlv_1= 'RealTimeConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_patternStatements_11_0= rulePatternStatement ) ) otherlv_12= '}' otherlv_13= '}' )
            // InternalMyDsl.g:261:3: otherlv_0= 'Initialize:' otherlv_1= 'RealTimeConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_patternStatements_11_0= rulePatternStatement ) ) otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternInitializationAccess().getInitializeKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternInitializationAccess().getRealTimeConstraintKeyword_1());
            		
            // InternalMyDsl.g:269:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:270:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:270:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:271:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPatternInitializationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternInitializationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:287:3: ( (lv_timeWindow_3_0= ruleTimeWindow ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:288:4: (lv_timeWindow_3_0= ruleTimeWindow )
                    {
                    // InternalMyDsl.g:288:4: (lv_timeWindow_3_0= ruleTimeWindow )
                    // InternalMyDsl.g:289:5: lv_timeWindow_3_0= ruleTimeWindow
                    {

                    					newCompositeNode(grammarAccess.getPatternInitializationAccess().getTimeWindowTimeWindowParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_timeWindow_3_0=ruleTimeWindow();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternInitializationRule());
                    					}
                    					set(
                    						current,
                    						"timeWindow",
                    						lv_timeWindow_3_0,
                    						"org.xtext.constraint.mydsl.MyDsl.TimeWindow");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getPatternInitializationAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternInitializationAccess().getEventsKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPatternInitializationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:318:3: ( (lv_inputStatements_7_0= ruleInputStatement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:319:4: (lv_inputStatements_7_0= ruleInputStatement )
            	    {
            	    // InternalMyDsl.g:319:4: (lv_inputStatements_7_0= ruleInputStatement )
            	    // InternalMyDsl.g:320:5: lv_inputStatements_7_0= ruleInputStatement
            	    {

            	    					newCompositeNode(grammarAccess.getPatternInitializationAccess().getInputStatementsInputStatementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_inputStatements_7_0=ruleInputStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatternInitializationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputStatements",
            	    						lv_inputStatements_7_0,
            	    						"org.xtext.constraint.mydsl.MyDsl.InputStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getPatternInitializationAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getPatternInitializationAccess().getPatternKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getPatternInitializationAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:349:3: ( (lv_patternStatements_11_0= rulePatternStatement ) )
            // InternalMyDsl.g:350:4: (lv_patternStatements_11_0= rulePatternStatement )
            {
            // InternalMyDsl.g:350:4: (lv_patternStatements_11_0= rulePatternStatement )
            // InternalMyDsl.g:351:5: lv_patternStatements_11_0= rulePatternStatement
            {

            					newCompositeNode(grammarAccess.getPatternInitializationAccess().getPatternStatementsPatternStatementParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_patternStatements_11_0=rulePatternStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternInitializationRule());
            					}
            					set(
            						current,
            						"patternStatements",
            						lv_patternStatements_11_0,
            						"org.xtext.constraint.mydsl.MyDsl.PatternStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getPatternInitializationAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPatternInitializationAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternInitialization"


    // $ANTLR start "entryRuleComplexInitialization"
    // InternalMyDsl.g:380:1: entryRuleComplexInitialization returns [EObject current=null] : iv_ruleComplexInitialization= ruleComplexInitialization EOF ;
    public final EObject entryRuleComplexInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexInitialization = null;


        try {
            // InternalMyDsl.g:380:62: (iv_ruleComplexInitialization= ruleComplexInitialization EOF )
            // InternalMyDsl.g:381:2: iv_ruleComplexInitialization= ruleComplexInitialization EOF
            {
             newCompositeNode(grammarAccess.getComplexInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexInitialization=ruleComplexInitialization();

            state._fsp--;

             current =iv_ruleComplexInitialization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexInitialization"


    // $ANTLR start "ruleComplexInitialization"
    // InternalMyDsl.g:387:1: ruleComplexInitialization returns [EObject current=null] : (otherlv_0= 'Initialize:' otherlv_1= 'ComplexConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_complexPatternStatements_11_0= ruleComplexPatternStatements ) ) otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleComplexInitialization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_timeWindow_3_0 = null;

        EObject lv_inputStatements_7_0 = null;

        EObject lv_complexPatternStatements_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:393:2: ( (otherlv_0= 'Initialize:' otherlv_1= 'ComplexConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_complexPatternStatements_11_0= ruleComplexPatternStatements ) ) otherlv_12= '}' otherlv_13= '}' ) )
            // InternalMyDsl.g:394:2: (otherlv_0= 'Initialize:' otherlv_1= 'ComplexConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_complexPatternStatements_11_0= ruleComplexPatternStatements ) ) otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalMyDsl.g:394:2: (otherlv_0= 'Initialize:' otherlv_1= 'ComplexConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_complexPatternStatements_11_0= ruleComplexPatternStatements ) ) otherlv_12= '}' otherlv_13= '}' )
            // InternalMyDsl.g:395:3: otherlv_0= 'Initialize:' otherlv_1= 'ComplexConstraint' ( (lv_name_2_0= RULE_ID ) ) ( (lv_timeWindow_3_0= ruleTimeWindow ) )? otherlv_4= '{' otherlv_5= 'Events' otherlv_6= '{' ( (lv_inputStatements_7_0= ruleInputStatement ) )+ otherlv_8= '}' otherlv_9= 'Pattern' otherlv_10= '{' ( (lv_complexPatternStatements_11_0= ruleComplexPatternStatements ) ) otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexInitializationAccess().getInitializeKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexInitializationAccess().getComplexConstraintKeyword_1());
            		
            // InternalMyDsl.g:403:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:404:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:404:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:405:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getComplexInitializationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexInitializationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:421:3: ( (lv_timeWindow_3_0= ruleTimeWindow ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:422:4: (lv_timeWindow_3_0= ruleTimeWindow )
                    {
                    // InternalMyDsl.g:422:4: (lv_timeWindow_3_0= ruleTimeWindow )
                    // InternalMyDsl.g:423:5: lv_timeWindow_3_0= ruleTimeWindow
                    {

                    					newCompositeNode(grammarAccess.getComplexInitializationAccess().getTimeWindowTimeWindowParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_timeWindow_3_0=ruleTimeWindow();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexInitializationRule());
                    					}
                    					set(
                    						current,
                    						"timeWindow",
                    						lv_timeWindow_3_0,
                    						"org.xtext.constraint.mydsl.MyDsl.TimeWindow");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexInitializationAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexInitializationAccess().getEventsKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexInitializationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:452:3: ( (lv_inputStatements_7_0= ruleInputStatement ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:453:4: (lv_inputStatements_7_0= ruleInputStatement )
            	    {
            	    // InternalMyDsl.g:453:4: (lv_inputStatements_7_0= ruleInputStatement )
            	    // InternalMyDsl.g:454:5: lv_inputStatements_7_0= ruleInputStatement
            	    {

            	    					newCompositeNode(grammarAccess.getComplexInitializationAccess().getInputStatementsInputStatementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_inputStatements_7_0=ruleInputStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComplexInitializationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputStatements",
            	    						lv_inputStatements_7_0,
            	    						"org.xtext.constraint.mydsl.MyDsl.InputStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexInitializationAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexInitializationAccess().getPatternKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getComplexInitializationAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:483:3: ( (lv_complexPatternStatements_11_0= ruleComplexPatternStatements ) )
            // InternalMyDsl.g:484:4: (lv_complexPatternStatements_11_0= ruleComplexPatternStatements )
            {
            // InternalMyDsl.g:484:4: (lv_complexPatternStatements_11_0= ruleComplexPatternStatements )
            // InternalMyDsl.g:485:5: lv_complexPatternStatements_11_0= ruleComplexPatternStatements
            {

            					newCompositeNode(grammarAccess.getComplexInitializationAccess().getComplexPatternStatementsComplexPatternStatementsParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_complexPatternStatements_11_0=ruleComplexPatternStatements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexInitializationRule());
            					}
            					set(
            						current,
            						"complexPatternStatements",
            						lv_complexPatternStatements_11_0,
            						"org.xtext.constraint.mydsl.MyDsl.ComplexPatternStatements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getComplexInitializationAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getComplexInitializationAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexInitialization"


    // $ANTLR start "entryRuleComplexPatternStatements"
    // InternalMyDsl.g:514:1: entryRuleComplexPatternStatements returns [EObject current=null] : iv_ruleComplexPatternStatements= ruleComplexPatternStatements EOF ;
    public final EObject entryRuleComplexPatternStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexPatternStatements = null;


        try {
            // InternalMyDsl.g:514:65: (iv_ruleComplexPatternStatements= ruleComplexPatternStatements EOF )
            // InternalMyDsl.g:515:2: iv_ruleComplexPatternStatements= ruleComplexPatternStatements EOF
            {
             newCompositeNode(grammarAccess.getComplexPatternStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexPatternStatements=ruleComplexPatternStatements();

            state._fsp--;

             current =iv_ruleComplexPatternStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexPatternStatements"


    // $ANTLR start "ruleComplexPatternStatements"
    // InternalMyDsl.g:521:1: ruleComplexPatternStatements returns [EObject current=null] : (otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_complexPatternType_2_0= ruleComplexPatternType ) ) otherlv_3= ')' ) ;
    public final EObject ruleComplexPatternStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_complexPatternType_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:527:2: ( (otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_complexPatternType_2_0= ruleComplexPatternType ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:528:2: (otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_complexPatternType_2_0= ruleComplexPatternType ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:528:2: (otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_complexPatternType_2_0= ruleComplexPatternType ) ) otherlv_3= ')' )
            // InternalMyDsl.g:529:3: otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_complexPatternType_2_0= ruleComplexPatternType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexPatternStatementsAccess().getDefinePatternKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexPatternStatementsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:537:3: ( (lv_complexPatternType_2_0= ruleComplexPatternType ) )
            // InternalMyDsl.g:538:4: (lv_complexPatternType_2_0= ruleComplexPatternType )
            {
            // InternalMyDsl.g:538:4: (lv_complexPatternType_2_0= ruleComplexPatternType )
            // InternalMyDsl.g:539:5: lv_complexPatternType_2_0= ruleComplexPatternType
            {

            					newCompositeNode(grammarAccess.getComplexPatternStatementsAccess().getComplexPatternTypeComplexPatternTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_complexPatternType_2_0=ruleComplexPatternType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexPatternStatementsRule());
            					}
            					set(
            						current,
            						"complexPatternType",
            						lv_complexPatternType_2_0,
            						"org.xtext.constraint.mydsl.MyDsl.ComplexPatternType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexPatternStatementsAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexPatternStatements"


    // $ANTLR start "entryRuleComplexPatternType"
    // InternalMyDsl.g:564:1: entryRuleComplexPatternType returns [EObject current=null] : iv_ruleComplexPatternType= ruleComplexPatternType EOF ;
    public final EObject entryRuleComplexPatternType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexPatternType = null;


        try {
            // InternalMyDsl.g:564:59: (iv_ruleComplexPatternType= ruleComplexPatternType EOF )
            // InternalMyDsl.g:565:2: iv_ruleComplexPatternType= ruleComplexPatternType EOF
            {
             newCompositeNode(grammarAccess.getComplexPatternTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexPatternType=ruleComplexPatternType();

            state._fsp--;

             current =iv_ruleComplexPatternType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexPatternType"


    // $ANTLR start "ruleComplexPatternType"
    // InternalMyDsl.g:571:1: ruleComplexPatternType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'Occurs' ( (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers ) ) )? ( (lv_complexPatternOptions_3_0= ruleComplexPatternOptions ) )+ ) ;
    public final EObject ruleComplexPatternType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_greedyQuantifiers_2_0 = null;

        EObject lv_complexPatternOptions_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:577:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'Occurs' ( (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers ) ) )? ( (lv_complexPatternOptions_3_0= ruleComplexPatternOptions ) )+ ) )
            // InternalMyDsl.g:578:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'Occurs' ( (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers ) ) )? ( (lv_complexPatternOptions_3_0= ruleComplexPatternOptions ) )+ )
            {
            // InternalMyDsl.g:578:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'Occurs' ( (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers ) ) )? ( (lv_complexPatternOptions_3_0= ruleComplexPatternOptions ) )+ )
            // InternalMyDsl.g:579:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'Occurs' ( (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers ) ) )? ( (lv_complexPatternOptions_3_0= ruleComplexPatternOptions ) )+
            {
            // InternalMyDsl.g:579:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:580:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:580:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:581:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexPatternTypeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getComplexPatternTypeAccess().getFirstEventInputStatementCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:592:3: (otherlv_1= 'Occurs' ( (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:593:4: otherlv_1= 'Occurs' ( (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getComplexPatternTypeAccess().getOccursKeyword_1_0());
                    			
                    // InternalMyDsl.g:597:4: ( (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers ) )
                    // InternalMyDsl.g:598:5: (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers )
                    {
                    // InternalMyDsl.g:598:5: (lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers )
                    // InternalMyDsl.g:599:6: lv_greedyQuantifiers_2_0= ruleGreedyQuantifiers
                    {

                    						newCompositeNode(grammarAccess.getComplexPatternTypeAccess().getGreedyQuantifiersGreedyQuantifiersEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_greedyQuantifiers_2_0=ruleGreedyQuantifiers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexPatternTypeRule());
                    						}
                    						set(
                    							current,
                    							"greedyQuantifiers",
                    							lv_greedyQuantifiers_2_0,
                    							"org.xtext.constraint.mydsl.MyDsl.GreedyQuantifiers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:617:3: ( (lv_complexPatternOptions_3_0= ruleComplexPatternOptions ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:618:4: (lv_complexPatternOptions_3_0= ruleComplexPatternOptions )
            	    {
            	    // InternalMyDsl.g:618:4: (lv_complexPatternOptions_3_0= ruleComplexPatternOptions )
            	    // InternalMyDsl.g:619:5: lv_complexPatternOptions_3_0= ruleComplexPatternOptions
            	    {

            	    					newCompositeNode(grammarAccess.getComplexPatternTypeAccess().getComplexPatternOptionsComplexPatternOptionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_complexPatternOptions_3_0=ruleComplexPatternOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComplexPatternTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"complexPatternOptions",
            	    						lv_complexPatternOptions_3_0,
            	    						"org.xtext.constraint.mydsl.MyDsl.ComplexPatternOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexPatternType"


    // $ANTLR start "entryRuleComplexPatternOptions"
    // InternalMyDsl.g:640:1: entryRuleComplexPatternOptions returns [EObject current=null] : iv_ruleComplexPatternOptions= ruleComplexPatternOptions EOF ;
    public final EObject entryRuleComplexPatternOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexPatternOptions = null;


        try {
            // InternalMyDsl.g:640:62: (iv_ruleComplexPatternOptions= ruleComplexPatternOptions EOF )
            // InternalMyDsl.g:641:2: iv_ruleComplexPatternOptions= ruleComplexPatternOptions EOF
            {
             newCompositeNode(grammarAccess.getComplexPatternOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexPatternOptions=ruleComplexPatternOptions();

            state._fsp--;

             current =iv_ruleComplexPatternOptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexPatternOptions"


    // $ANTLR start "ruleComplexPatternOptions"
    // InternalMyDsl.g:647:1: ruleComplexPatternOptions returns [EObject current=null] : (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'Occurs' ( (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers ) ) )? ) ;
    public final EObject ruleComplexPatternOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_greedyQuantifiers_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:653:2: ( (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'Occurs' ( (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers ) ) )? ) )
            // InternalMyDsl.g:654:2: (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'Occurs' ( (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers ) ) )? )
            {
            // InternalMyDsl.g:654:2: (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'Occurs' ( (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers ) ) )? )
            // InternalMyDsl.g:655:3: otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'Occurs' ( (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexPatternOptionsAccess().getFollowedByKeyword_0());
            		
            // InternalMyDsl.g:659:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:660:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:660:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:661:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexPatternOptionsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getComplexPatternOptionsAccess().getSeceondEventInputStatementCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:672:3: (otherlv_2= 'Occurs' ( (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:673:4: otherlv_2= 'Occurs' ( (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getComplexPatternOptionsAccess().getOccursKeyword_2_0());
                    			
                    // InternalMyDsl.g:677:4: ( (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers ) )
                    // InternalMyDsl.g:678:5: (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers )
                    {
                    // InternalMyDsl.g:678:5: (lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers )
                    // InternalMyDsl.g:679:6: lv_greedyQuantifiers_3_0= ruleGreedyQuantifiers
                    {

                    						newCompositeNode(grammarAccess.getComplexPatternOptionsAccess().getGreedyQuantifiersGreedyQuantifiersEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_greedyQuantifiers_3_0=ruleGreedyQuantifiers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexPatternOptionsRule());
                    						}
                    						set(
                    							current,
                    							"greedyQuantifiers",
                    							lv_greedyQuantifiers_3_0,
                    							"org.xtext.constraint.mydsl.MyDsl.GreedyQuantifiers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexPatternOptions"


    // $ANTLR start "entryRuleInputStatement"
    // InternalMyDsl.g:701:1: entryRuleInputStatement returns [EObject current=null] : iv_ruleInputStatement= ruleInputStatement EOF ;
    public final EObject entryRuleInputStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputStatement = null;


        try {
            // InternalMyDsl.g:701:55: (iv_ruleInputStatement= ruleInputStatement EOF )
            // InternalMyDsl.g:702:2: iv_ruleInputStatement= ruleInputStatement EOF
            {
             newCompositeNode(grammarAccess.getInputStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputStatement=ruleInputStatement();

            state._fsp--;

             current =iv_ruleInputStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputStatement"


    // $ANTLR start "ruleInputStatement"
    // InternalMyDsl.g:708:1: ruleInputStatement returns [EObject current=null] : (otherlv_0= 'InputEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_Property_3_0= RULE_STRING ) ) otherlv_4= 'and' otherlv_5= 'SetEvent' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= ruleValueOptions ) ) otherlv_8= ',' ) ;
    public final EObject ruleInputStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_Property_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Enumerator lv_comparisonOperator_6_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:714:2: ( (otherlv_0= 'InputEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_Property_3_0= RULE_STRING ) ) otherlv_4= 'and' otherlv_5= 'SetEvent' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= ruleValueOptions ) ) otherlv_8= ',' ) )
            // InternalMyDsl.g:715:2: (otherlv_0= 'InputEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_Property_3_0= RULE_STRING ) ) otherlv_4= 'and' otherlv_5= 'SetEvent' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= ruleValueOptions ) ) otherlv_8= ',' )
            {
            // InternalMyDsl.g:715:2: (otherlv_0= 'InputEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_Property_3_0= RULE_STRING ) ) otherlv_4= 'and' otherlv_5= 'SetEvent' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= ruleValueOptions ) ) otherlv_8= ',' )
            // InternalMyDsl.g:716:3: otherlv_0= 'InputEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_Property_3_0= RULE_STRING ) ) otherlv_4= 'and' otherlv_5= 'SetEvent' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= ruleValueOptions ) ) otherlv_8= ','
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputStatementAccess().getInputEventKeyword_0());
            		
            // InternalMyDsl.g:720:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:721:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:721:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:722:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getInputStatementAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:742:3: ( (lv_Property_3_0= RULE_STRING ) )
            // InternalMyDsl.g:743:4: (lv_Property_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:743:4: (lv_Property_3_0= RULE_STRING )
            // InternalMyDsl.g:744:5: lv_Property_3_0= RULE_STRING
            {
            lv_Property_3_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_Property_3_0, grammarAccess.getInputStatementAccess().getPropertySTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Property",
            						lv_Property_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getInputStatementAccess().getAndKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getInputStatementAccess().getSetEventKeyword_5());
            		
            // InternalMyDsl.g:768:3: ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) )
            // InternalMyDsl.g:769:4: (lv_comparisonOperator_6_0= ruleComparisonOperator )
            {
            // InternalMyDsl.g:769:4: (lv_comparisonOperator_6_0= ruleComparisonOperator )
            // InternalMyDsl.g:770:5: lv_comparisonOperator_6_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getInputStatementAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_comparisonOperator_6_0=ruleComparisonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputStatementRule());
            					}
            					set(
            						current,
            						"comparisonOperator",
            						lv_comparisonOperator_6_0,
            						"org.xtext.constraint.mydsl.MyDsl.ComparisonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:787:3: ( (lv_value_7_0= ruleValueOptions ) )
            // InternalMyDsl.g:788:4: (lv_value_7_0= ruleValueOptions )
            {
            // InternalMyDsl.g:788:4: (lv_value_7_0= ruleValueOptions )
            // InternalMyDsl.g:789:5: lv_value_7_0= ruleValueOptions
            {

            					newCompositeNode(grammarAccess.getInputStatementAccess().getValueValueOptionsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_28);
            lv_value_7_0=ruleValueOptions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.xtext.constraint.mydsl.MyDsl.ValueOptions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInputStatementAccess().getCommaKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputStatement"


    // $ANTLR start "entryRulePatternStatement"
    // InternalMyDsl.g:814:1: entryRulePatternStatement returns [EObject current=null] : iv_rulePatternStatement= rulePatternStatement EOF ;
    public final EObject entryRulePatternStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternStatement = null;


        try {
            // InternalMyDsl.g:814:57: (iv_rulePatternStatement= rulePatternStatement EOF )
            // InternalMyDsl.g:815:2: iv_rulePatternStatement= rulePatternStatement EOF
            {
             newCompositeNode(grammarAccess.getPatternStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternStatement=rulePatternStatement();

            state._fsp--;

             current =iv_rulePatternStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternStatement"


    // $ANTLR start "rulePatternStatement"
    // InternalMyDsl.g:821:1: rulePatternStatement returns [EObject current=null] : (otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_patternType_2_0= rulePatternType ) ) otherlv_3= ')' ) ;
    public final EObject rulePatternStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_patternType_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:827:2: ( (otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_patternType_2_0= rulePatternType ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:828:2: (otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_patternType_2_0= rulePatternType ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:828:2: (otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_patternType_2_0= rulePatternType ) ) otherlv_3= ')' )
            // InternalMyDsl.g:829:3: otherlv_0= 'DefinePattern' otherlv_1= '(' ( (lv_patternType_2_0= rulePatternType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternStatementAccess().getDefinePatternKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:837:3: ( (lv_patternType_2_0= rulePatternType ) )
            // InternalMyDsl.g:838:4: (lv_patternType_2_0= rulePatternType )
            {
            // InternalMyDsl.g:838:4: (lv_patternType_2_0= rulePatternType )
            // InternalMyDsl.g:839:5: lv_patternType_2_0= rulePatternType
            {

            					newCompositeNode(grammarAccess.getPatternStatementAccess().getPatternTypePatternTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_patternType_2_0=rulePatternType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternStatementRule());
            					}
            					set(
            						current,
            						"patternType",
            						lv_patternType_2_0,
            						"org.xtext.constraint.mydsl.MyDsl.PatternType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternStatementAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternStatement"


    // $ANTLR start "entryRulePatternType"
    // InternalMyDsl.g:864:1: entryRulePatternType returns [EObject current=null] : iv_rulePatternType= rulePatternType EOF ;
    public final EObject entryRulePatternType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternType = null;


        try {
            // InternalMyDsl.g:864:52: (iv_rulePatternType= rulePatternType EOF )
            // InternalMyDsl.g:865:2: iv_rulePatternType= rulePatternType EOF
            {
             newCompositeNode(grammarAccess.getPatternTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternType=rulePatternType();

            state._fsp--;

             current =iv_rulePatternType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternType"


    // $ANTLR start "rulePatternType"
    // InternalMyDsl.g:871:1: rulePatternType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_patternOptions_1_0= rulePatternOptions ) )+ ) ;
    public final EObject rulePatternType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_patternOptions_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:877:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_patternOptions_1_0= rulePatternOptions ) )+ ) )
            // InternalMyDsl.g:878:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_patternOptions_1_0= rulePatternOptions ) )+ )
            {
            // InternalMyDsl.g:878:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_patternOptions_1_0= rulePatternOptions ) )+ )
            // InternalMyDsl.g:879:3: ( (otherlv_0= RULE_ID ) ) ( (lv_patternOptions_1_0= rulePatternOptions ) )+
            {
            // InternalMyDsl.g:879:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:880:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:880:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:881:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternTypeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternTypeAccess().getFirstEventInputStatementCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:892:3: ( (lv_patternOptions_1_0= rulePatternOptions ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:893:4: (lv_patternOptions_1_0= rulePatternOptions )
            	    {
            	    // InternalMyDsl.g:893:4: (lv_patternOptions_1_0= rulePatternOptions )
            	    // InternalMyDsl.g:894:5: lv_patternOptions_1_0= rulePatternOptions
            	    {

            	    					newCompositeNode(grammarAccess.getPatternTypeAccess().getPatternOptionsPatternOptionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_patternOptions_1_0=rulePatternOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatternTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"patternOptions",
            	    						lv_patternOptions_1_0,
            	    						"org.xtext.constraint.mydsl.MyDsl.PatternOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternType"


    // $ANTLR start "entryRulePatternOptions"
    // InternalMyDsl.g:915:1: entryRulePatternOptions returns [EObject current=null] : iv_rulePatternOptions= rulePatternOptions EOF ;
    public final EObject entryRulePatternOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternOptions = null;


        try {
            // InternalMyDsl.g:915:55: (iv_rulePatternOptions= rulePatternOptions EOF )
            // InternalMyDsl.g:916:2: iv_rulePatternOptions= rulePatternOptions EOF
            {
             newCompositeNode(grammarAccess.getPatternOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternOptions=rulePatternOptions();

            state._fsp--;

             current =iv_rulePatternOptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternOptions"


    // $ANTLR start "rulePatternOptions"
    // InternalMyDsl.g:922:1: rulePatternOptions returns [EObject current=null] : ( ( (lv_occurenceAtLeast_0_0= ruleOccurenceAtLeast ) ) | ( (lv_occurenceAtMost_1_0= ruleOccurenceAtMost ) ) | ( (lv_occurenceAtNotSpecificTime_2_0= ruleOccurenceAtNotSpecificTime ) ) ) ;
    public final EObject rulePatternOptions() throws RecognitionException {
        EObject current = null;

        EObject lv_occurenceAtLeast_0_0 = null;

        EObject lv_occurenceAtMost_1_0 = null;

        EObject lv_occurenceAtNotSpecificTime_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:928:2: ( ( ( (lv_occurenceAtLeast_0_0= ruleOccurenceAtLeast ) ) | ( (lv_occurenceAtMost_1_0= ruleOccurenceAtMost ) ) | ( (lv_occurenceAtNotSpecificTime_2_0= ruleOccurenceAtNotSpecificTime ) ) ) )
            // InternalMyDsl.g:929:2: ( ( (lv_occurenceAtLeast_0_0= ruleOccurenceAtLeast ) ) | ( (lv_occurenceAtMost_1_0= ruleOccurenceAtMost ) ) | ( (lv_occurenceAtNotSpecificTime_2_0= ruleOccurenceAtNotSpecificTime ) ) )
            {
            // InternalMyDsl.g:929:2: ( ( (lv_occurenceAtLeast_0_0= ruleOccurenceAtLeast ) ) | ( (lv_occurenceAtMost_1_0= ruleOccurenceAtMost ) ) | ( (lv_occurenceAtNotSpecificTime_2_0= ruleOccurenceAtNotSpecificTime ) ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 30:
                        {
                        alt11=1;
                        }
                        break;
                    case 32:
                        {
                        alt11=2;
                        }
                        break;
                    case EOF:
                    case 22:
                    case 24:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:930:3: ( (lv_occurenceAtLeast_0_0= ruleOccurenceAtLeast ) )
                    {
                    // InternalMyDsl.g:930:3: ( (lv_occurenceAtLeast_0_0= ruleOccurenceAtLeast ) )
                    // InternalMyDsl.g:931:4: (lv_occurenceAtLeast_0_0= ruleOccurenceAtLeast )
                    {
                    // InternalMyDsl.g:931:4: (lv_occurenceAtLeast_0_0= ruleOccurenceAtLeast )
                    // InternalMyDsl.g:932:5: lv_occurenceAtLeast_0_0= ruleOccurenceAtLeast
                    {

                    					newCompositeNode(grammarAccess.getPatternOptionsAccess().getOccurenceAtLeastOccurenceAtLeastParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_occurenceAtLeast_0_0=ruleOccurenceAtLeast();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternOptionsRule());
                    					}
                    					set(
                    						current,
                    						"occurenceAtLeast",
                    						lv_occurenceAtLeast_0_0,
                    						"org.xtext.constraint.mydsl.MyDsl.OccurenceAtLeast");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:950:3: ( (lv_occurenceAtMost_1_0= ruleOccurenceAtMost ) )
                    {
                    // InternalMyDsl.g:950:3: ( (lv_occurenceAtMost_1_0= ruleOccurenceAtMost ) )
                    // InternalMyDsl.g:951:4: (lv_occurenceAtMost_1_0= ruleOccurenceAtMost )
                    {
                    // InternalMyDsl.g:951:4: (lv_occurenceAtMost_1_0= ruleOccurenceAtMost )
                    // InternalMyDsl.g:952:5: lv_occurenceAtMost_1_0= ruleOccurenceAtMost
                    {

                    					newCompositeNode(grammarAccess.getPatternOptionsAccess().getOccurenceAtMostOccurenceAtMostParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_occurenceAtMost_1_0=ruleOccurenceAtMost();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternOptionsRule());
                    					}
                    					set(
                    						current,
                    						"occurenceAtMost",
                    						lv_occurenceAtMost_1_0,
                    						"org.xtext.constraint.mydsl.MyDsl.OccurenceAtMost");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:970:3: ( (lv_occurenceAtNotSpecificTime_2_0= ruleOccurenceAtNotSpecificTime ) )
                    {
                    // InternalMyDsl.g:970:3: ( (lv_occurenceAtNotSpecificTime_2_0= ruleOccurenceAtNotSpecificTime ) )
                    // InternalMyDsl.g:971:4: (lv_occurenceAtNotSpecificTime_2_0= ruleOccurenceAtNotSpecificTime )
                    {
                    // InternalMyDsl.g:971:4: (lv_occurenceAtNotSpecificTime_2_0= ruleOccurenceAtNotSpecificTime )
                    // InternalMyDsl.g:972:5: lv_occurenceAtNotSpecificTime_2_0= ruleOccurenceAtNotSpecificTime
                    {

                    					newCompositeNode(grammarAccess.getPatternOptionsAccess().getOccurenceAtNotSpecificTimeOccurenceAtNotSpecificTimeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_occurenceAtNotSpecificTime_2_0=ruleOccurenceAtNotSpecificTime();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternOptionsRule());
                    					}
                    					set(
                    						current,
                    						"occurenceAtNotSpecificTime",
                    						lv_occurenceAtNotSpecificTime_2_0,
                    						"org.xtext.constraint.mydsl.MyDsl.OccurenceAtNotSpecificTime");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternOptions"


    // $ANTLR start "entryRuleOccurenceAtLeast"
    // InternalMyDsl.g:993:1: entryRuleOccurenceAtLeast returns [EObject current=null] : iv_ruleOccurenceAtLeast= ruleOccurenceAtLeast EOF ;
    public final EObject entryRuleOccurenceAtLeast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurenceAtLeast = null;


        try {
            // InternalMyDsl.g:993:57: (iv_ruleOccurenceAtLeast= ruleOccurenceAtLeast EOF )
            // InternalMyDsl.g:994:2: iv_ruleOccurenceAtLeast= ruleOccurenceAtLeast EOF
            {
             newCompositeNode(grammarAccess.getOccurenceAtLeastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOccurenceAtLeast=ruleOccurenceAtLeast();

            state._fsp--;

             current =iv_ruleOccurenceAtLeast; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccurenceAtLeast"


    // $ANTLR start "ruleOccurenceAtLeast"
    // InternalMyDsl.g:1000:1: ruleOccurenceAtLeast returns [EObject current=null] : (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-After' otherlv_3= '@' ( (lv_minDuration_4_0= ruleMinDuration ) ) ) ;
    public final EObject ruleOccurenceAtLeast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_minDuration_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1006:2: ( (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-After' otherlv_3= '@' ( (lv_minDuration_4_0= ruleMinDuration ) ) ) )
            // InternalMyDsl.g:1007:2: (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-After' otherlv_3= '@' ( (lv_minDuration_4_0= ruleMinDuration ) ) )
            {
            // InternalMyDsl.g:1007:2: (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-After' otherlv_3= '@' ( (lv_minDuration_4_0= ruleMinDuration ) ) )
            // InternalMyDsl.g:1008:3: otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-After' otherlv_3= '@' ( (lv_minDuration_4_0= ruleMinDuration ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOccurenceAtLeastAccess().getFollowedByKeyword_0());
            		
            // InternalMyDsl.g:1012:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1013:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1013:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1014:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOccurenceAtLeastRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getOccurenceAtLeastAccess().getSeceondEventInputStatementCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getOccurenceAtLeastAccess().getOccursAfterKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getOccurenceAtLeastAccess().getCommercialAtKeyword_3());
            		
            // InternalMyDsl.g:1033:3: ( (lv_minDuration_4_0= ruleMinDuration ) )
            // InternalMyDsl.g:1034:4: (lv_minDuration_4_0= ruleMinDuration )
            {
            // InternalMyDsl.g:1034:4: (lv_minDuration_4_0= ruleMinDuration )
            // InternalMyDsl.g:1035:5: lv_minDuration_4_0= ruleMinDuration
            {

            					newCompositeNode(grammarAccess.getOccurenceAtLeastAccess().getMinDurationMinDurationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_minDuration_4_0=ruleMinDuration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOccurenceAtLeastRule());
            					}
            					set(
            						current,
            						"minDuration",
            						lv_minDuration_4_0,
            						"org.xtext.constraint.mydsl.MyDsl.MinDuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurenceAtLeast"


    // $ANTLR start "entryRuleOccurenceAtMost"
    // InternalMyDsl.g:1056:1: entryRuleOccurenceAtMost returns [EObject current=null] : iv_ruleOccurenceAtMost= ruleOccurenceAtMost EOF ;
    public final EObject entryRuleOccurenceAtMost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurenceAtMost = null;


        try {
            // InternalMyDsl.g:1056:56: (iv_ruleOccurenceAtMost= ruleOccurenceAtMost EOF )
            // InternalMyDsl.g:1057:2: iv_ruleOccurenceAtMost= ruleOccurenceAtMost EOF
            {
             newCompositeNode(grammarAccess.getOccurenceAtMostRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOccurenceAtMost=ruleOccurenceAtMost();

            state._fsp--;

             current =iv_ruleOccurenceAtMost; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccurenceAtMost"


    // $ANTLR start "ruleOccurenceAtMost"
    // InternalMyDsl.g:1063:1: ruleOccurenceAtMost returns [EObject current=null] : (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-Before' otherlv_3= '@' ( (lv_maxDuration_4_0= ruleMaxDuration ) ) ) ;
    public final EObject ruleOccurenceAtMost() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_maxDuration_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1069:2: ( (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-Before' otherlv_3= '@' ( (lv_maxDuration_4_0= ruleMaxDuration ) ) ) )
            // InternalMyDsl.g:1070:2: (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-Before' otherlv_3= '@' ( (lv_maxDuration_4_0= ruleMaxDuration ) ) )
            {
            // InternalMyDsl.g:1070:2: (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-Before' otherlv_3= '@' ( (lv_maxDuration_4_0= ruleMaxDuration ) ) )
            // InternalMyDsl.g:1071:3: otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Occurs-Before' otherlv_3= '@' ( (lv_maxDuration_4_0= ruleMaxDuration ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOccurenceAtMostAccess().getFollowedByKeyword_0());
            		
            // InternalMyDsl.g:1075:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1076:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1076:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1077:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOccurenceAtMostRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getOccurenceAtMostAccess().getSeceondEventInputStatementCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getOccurenceAtMostAccess().getOccursBeforeKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getOccurenceAtMostAccess().getCommercialAtKeyword_3());
            		
            // InternalMyDsl.g:1096:3: ( (lv_maxDuration_4_0= ruleMaxDuration ) )
            // InternalMyDsl.g:1097:4: (lv_maxDuration_4_0= ruleMaxDuration )
            {
            // InternalMyDsl.g:1097:4: (lv_maxDuration_4_0= ruleMaxDuration )
            // InternalMyDsl.g:1098:5: lv_maxDuration_4_0= ruleMaxDuration
            {

            					newCompositeNode(grammarAccess.getOccurenceAtMostAccess().getMaxDurationMaxDurationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_maxDuration_4_0=ruleMaxDuration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOccurenceAtMostRule());
            					}
            					set(
            						current,
            						"maxDuration",
            						lv_maxDuration_4_0,
            						"org.xtext.constraint.mydsl.MyDsl.MaxDuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurenceAtMost"


    // $ANTLR start "entryRuleOccurenceAtNotSpecificTime"
    // InternalMyDsl.g:1119:1: entryRuleOccurenceAtNotSpecificTime returns [EObject current=null] : iv_ruleOccurenceAtNotSpecificTime= ruleOccurenceAtNotSpecificTime EOF ;
    public final EObject entryRuleOccurenceAtNotSpecificTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurenceAtNotSpecificTime = null;


        try {
            // InternalMyDsl.g:1119:67: (iv_ruleOccurenceAtNotSpecificTime= ruleOccurenceAtNotSpecificTime EOF )
            // InternalMyDsl.g:1120:2: iv_ruleOccurenceAtNotSpecificTime= ruleOccurenceAtNotSpecificTime EOF
            {
             newCompositeNode(grammarAccess.getOccurenceAtNotSpecificTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOccurenceAtNotSpecificTime=ruleOccurenceAtNotSpecificTime();

            state._fsp--;

             current =iv_ruleOccurenceAtNotSpecificTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccurenceAtNotSpecificTime"


    // $ANTLR start "ruleOccurenceAtNotSpecificTime"
    // InternalMyDsl.g:1126:1: ruleOccurenceAtNotSpecificTime returns [EObject current=null] : (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOccurenceAtNotSpecificTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1132:2: ( (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1133:2: (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1133:2: (otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1134:3: otherlv_0= 'followed-by' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOccurenceAtNotSpecificTimeAccess().getFollowedByKeyword_0());
            		
            // InternalMyDsl.g:1138:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1139:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1139:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1140:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOccurenceAtNotSpecificTimeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getOccurenceAtNotSpecificTimeAccess().getSeceondEventInputStatementCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurenceAtNotSpecificTime"


    // $ANTLR start "entryRuleMaxDuration"
    // InternalMyDsl.g:1155:1: entryRuleMaxDuration returns [EObject current=null] : iv_ruleMaxDuration= ruleMaxDuration EOF ;
    public final EObject entryRuleMaxDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxDuration = null;


        try {
            // InternalMyDsl.g:1155:52: (iv_ruleMaxDuration= ruleMaxDuration EOF )
            // InternalMyDsl.g:1156:2: iv_ruleMaxDuration= ruleMaxDuration EOF
            {
             newCompositeNode(grammarAccess.getMaxDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxDuration=ruleMaxDuration();

            state._fsp--;

             current =iv_ruleMaxDuration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxDuration"


    // $ANTLR start "ruleMaxDuration"
    // InternalMyDsl.g:1162:1: ruleMaxDuration returns [EObject current=null] : ( ( (lv_timerType_0_0= 'MaxDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']' ) ;
    public final EObject ruleMaxDuration() throws RecognitionException {
        EObject current = null;

        Token lv_timerType_0_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_4=null;
        Enumerator lv_timeUnit_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1168:2: ( ( ( (lv_timerType_0_0= 'MaxDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']' ) )
            // InternalMyDsl.g:1169:2: ( ( (lv_timerType_0_0= 'MaxDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']' )
            {
            // InternalMyDsl.g:1169:2: ( ( (lv_timerType_0_0= 'MaxDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']' )
            // InternalMyDsl.g:1170:3: ( (lv_timerType_0_0= 'MaxDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']'
            {
            // InternalMyDsl.g:1170:3: ( (lv_timerType_0_0= 'MaxDuration' ) )
            // InternalMyDsl.g:1171:4: (lv_timerType_0_0= 'MaxDuration' )
            {
            // InternalMyDsl.g:1171:4: (lv_timerType_0_0= 'MaxDuration' )
            // InternalMyDsl.g:1172:5: lv_timerType_0_0= 'MaxDuration'
            {
            lv_timerType_0_0=(Token)match(input,33,FOLLOW_36); 

            					newLeafNode(lv_timerType_0_0, grammarAccess.getMaxDurationAccess().getTimerTypeMaxDurationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxDurationRule());
            					}
            					setWithLastConsumed(current, "timerType", lv_timerType_0_0, "MaxDuration");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxDurationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:1188:3: ( (lv_time_2_0= RULE_INT ) )
            // InternalMyDsl.g:1189:4: (lv_time_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1189:4: (lv_time_2_0= RULE_INT )
            // InternalMyDsl.g:1190:5: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_time_2_0, grammarAccess.getMaxDurationAccess().getTimeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxDurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:1206:3: ( (lv_timeUnit_3_0= ruleTimeUnit ) )
            // InternalMyDsl.g:1207:4: (lv_timeUnit_3_0= ruleTimeUnit )
            {
            // InternalMyDsl.g:1207:4: (lv_timeUnit_3_0= ruleTimeUnit )
            // InternalMyDsl.g:1208:5: lv_timeUnit_3_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getMaxDurationAccess().getTimeUnitTimeUnitEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_timeUnit_3_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxDurationRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_3_0,
            						"org.xtext.constraint.mydsl.MyDsl.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMaxDurationAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxDuration"


    // $ANTLR start "entryRuleMinDuration"
    // InternalMyDsl.g:1233:1: entryRuleMinDuration returns [EObject current=null] : iv_ruleMinDuration= ruleMinDuration EOF ;
    public final EObject entryRuleMinDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinDuration = null;


        try {
            // InternalMyDsl.g:1233:52: (iv_ruleMinDuration= ruleMinDuration EOF )
            // InternalMyDsl.g:1234:2: iv_ruleMinDuration= ruleMinDuration EOF
            {
             newCompositeNode(grammarAccess.getMinDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinDuration=ruleMinDuration();

            state._fsp--;

             current =iv_ruleMinDuration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinDuration"


    // $ANTLR start "ruleMinDuration"
    // InternalMyDsl.g:1240:1: ruleMinDuration returns [EObject current=null] : ( ( (lv_timerType_0_0= 'MinDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']' ) ;
    public final EObject ruleMinDuration() throws RecognitionException {
        EObject current = null;

        Token lv_timerType_0_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_4=null;
        Enumerator lv_timeUnit_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1246:2: ( ( ( (lv_timerType_0_0= 'MinDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']' ) )
            // InternalMyDsl.g:1247:2: ( ( (lv_timerType_0_0= 'MinDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']' )
            {
            // InternalMyDsl.g:1247:2: ( ( (lv_timerType_0_0= 'MinDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']' )
            // InternalMyDsl.g:1248:3: ( (lv_timerType_0_0= 'MinDuration' ) ) otherlv_1= '[' ( (lv_time_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= ']'
            {
            // InternalMyDsl.g:1248:3: ( (lv_timerType_0_0= 'MinDuration' ) )
            // InternalMyDsl.g:1249:4: (lv_timerType_0_0= 'MinDuration' )
            {
            // InternalMyDsl.g:1249:4: (lv_timerType_0_0= 'MinDuration' )
            // InternalMyDsl.g:1250:5: lv_timerType_0_0= 'MinDuration'
            {
            lv_timerType_0_0=(Token)match(input,36,FOLLOW_36); 

            					newLeafNode(lv_timerType_0_0, grammarAccess.getMinDurationAccess().getTimerTypeMinDurationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinDurationRule());
            					}
            					setWithLastConsumed(current, "timerType", lv_timerType_0_0, "MinDuration");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getMinDurationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:1266:3: ( (lv_time_2_0= RULE_INT ) )
            // InternalMyDsl.g:1267:4: (lv_time_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1267:4: (lv_time_2_0= RULE_INT )
            // InternalMyDsl.g:1268:5: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_time_2_0, grammarAccess.getMinDurationAccess().getTimeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinDurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:1284:3: ( (lv_timeUnit_3_0= ruleTimeUnit ) )
            // InternalMyDsl.g:1285:4: (lv_timeUnit_3_0= ruleTimeUnit )
            {
            // InternalMyDsl.g:1285:4: (lv_timeUnit_3_0= ruleTimeUnit )
            // InternalMyDsl.g:1286:5: lv_timeUnit_3_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getMinDurationAccess().getTimeUnitTimeUnitEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_timeUnit_3_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinDurationRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_3_0,
            						"org.xtext.constraint.mydsl.MyDsl.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMinDurationAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinDuration"


    // $ANTLR start "entryRuleTimeWindow"
    // InternalMyDsl.g:1311:1: entryRuleTimeWindow returns [EObject current=null] : iv_ruleTimeWindow= ruleTimeWindow EOF ;
    public final EObject entryRuleTimeWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeWindow = null;


        try {
            // InternalMyDsl.g:1311:51: (iv_ruleTimeWindow= ruleTimeWindow EOF )
            // InternalMyDsl.g:1312:2: iv_ruleTimeWindow= ruleTimeWindow EOF
            {
             newCompositeNode(grammarAccess.getTimeWindowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeWindow=ruleTimeWindow();

            state._fsp--;

             current =iv_ruleTimeWindow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeWindow"


    // $ANTLR start "ruleTimeWindow"
    // InternalMyDsl.g:1318:1: ruleTimeWindow returns [EObject current=null] : (otherlv_0= 'With' otherlv_1= 'TimeWindow' otherlv_2= '[' ( (lv_time_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ']' ) ;
    public final EObject ruleTimeWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_time_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_timeUnit_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1324:2: ( (otherlv_0= 'With' otherlv_1= 'TimeWindow' otherlv_2= '[' ( (lv_time_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ']' ) )
            // InternalMyDsl.g:1325:2: (otherlv_0= 'With' otherlv_1= 'TimeWindow' otherlv_2= '[' ( (lv_time_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ']' )
            {
            // InternalMyDsl.g:1325:2: (otherlv_0= 'With' otherlv_1= 'TimeWindow' otherlv_2= '[' ( (lv_time_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ']' )
            // InternalMyDsl.g:1326:3: otherlv_0= 'With' otherlv_1= 'TimeWindow' otherlv_2= '[' ( (lv_time_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeWindowAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeWindowAccess().getTimeWindowKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeWindowAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1338:3: ( (lv_time_3_0= RULE_INT ) )
            // InternalMyDsl.g:1339:4: (lv_time_3_0= RULE_INT )
            {
            // InternalMyDsl.g:1339:4: (lv_time_3_0= RULE_INT )
            // InternalMyDsl.g:1340:5: lv_time_3_0= RULE_INT
            {
            lv_time_3_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_time_3_0, grammarAccess.getTimeWindowAccess().getTimeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeWindowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:1356:3: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            // InternalMyDsl.g:1357:4: (lv_timeUnit_4_0= ruleTimeUnit )
            {
            // InternalMyDsl.g:1357:4: (lv_timeUnit_4_0= ruleTimeUnit )
            // InternalMyDsl.g:1358:5: lv_timeUnit_4_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getTimeWindowAccess().getTimeUnitTimeUnitEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
            lv_timeUnit_4_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeWindowRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_4_0,
            						"org.xtext.constraint.mydsl.MyDsl.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeWindowAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeWindow"


    // $ANTLR start "entryRuleValueOptions"
    // InternalMyDsl.g:1383:1: entryRuleValueOptions returns [EObject current=null] : iv_ruleValueOptions= ruleValueOptions EOF ;
    public final EObject entryRuleValueOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueOptions = null;


        try {
            // InternalMyDsl.g:1383:53: (iv_ruleValueOptions= ruleValueOptions EOF )
            // InternalMyDsl.g:1384:2: iv_ruleValueOptions= ruleValueOptions EOF
            {
             newCompositeNode(grammarAccess.getValueOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueOptions=ruleValueOptions();

            state._fsp--;

             current =iv_ruleValueOptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueOptions"


    // $ANTLR start "ruleValueOptions"
    // InternalMyDsl.g:1390:1: ruleValueOptions returns [EObject current=null] : ( ( (lv_stringLiteral_0_0= ruleStringLiteral ) ) | ( (lv_numberLiteral_1_0= ruleNumberLiteral ) ) | ( (lv_textLiteral_2_0= ruleTextLiteral ) ) ) ;
    public final EObject ruleValueOptions() throws RecognitionException {
        EObject current = null;

        EObject lv_stringLiteral_0_0 = null;

        EObject lv_numberLiteral_1_0 = null;

        EObject lv_textLiteral_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1396:2: ( ( ( (lv_stringLiteral_0_0= ruleStringLiteral ) ) | ( (lv_numberLiteral_1_0= ruleNumberLiteral ) ) | ( (lv_textLiteral_2_0= ruleTextLiteral ) ) ) )
            // InternalMyDsl.g:1397:2: ( ( (lv_stringLiteral_0_0= ruleStringLiteral ) ) | ( (lv_numberLiteral_1_0= ruleNumberLiteral ) ) | ( (lv_textLiteral_2_0= ruleTextLiteral ) ) )
            {
            // InternalMyDsl.g:1397:2: ( ( (lv_stringLiteral_0_0= ruleStringLiteral ) ) | ( (lv_numberLiteral_1_0= ruleNumberLiteral ) ) | ( (lv_textLiteral_2_0= ruleTextLiteral ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1398:3: ( (lv_stringLiteral_0_0= ruleStringLiteral ) )
                    {
                    // InternalMyDsl.g:1398:3: ( (lv_stringLiteral_0_0= ruleStringLiteral ) )
                    // InternalMyDsl.g:1399:4: (lv_stringLiteral_0_0= ruleStringLiteral )
                    {
                    // InternalMyDsl.g:1399:4: (lv_stringLiteral_0_0= ruleStringLiteral )
                    // InternalMyDsl.g:1400:5: lv_stringLiteral_0_0= ruleStringLiteral
                    {

                    					newCompositeNode(grammarAccess.getValueOptionsAccess().getStringLiteralStringLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_stringLiteral_0_0=ruleStringLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueOptionsRule());
                    					}
                    					set(
                    						current,
                    						"stringLiteral",
                    						lv_stringLiteral_0_0,
                    						"org.xtext.constraint.mydsl.MyDsl.StringLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1418:3: ( (lv_numberLiteral_1_0= ruleNumberLiteral ) )
                    {
                    // InternalMyDsl.g:1418:3: ( (lv_numberLiteral_1_0= ruleNumberLiteral ) )
                    // InternalMyDsl.g:1419:4: (lv_numberLiteral_1_0= ruleNumberLiteral )
                    {
                    // InternalMyDsl.g:1419:4: (lv_numberLiteral_1_0= ruleNumberLiteral )
                    // InternalMyDsl.g:1420:5: lv_numberLiteral_1_0= ruleNumberLiteral
                    {

                    					newCompositeNode(grammarAccess.getValueOptionsAccess().getNumberLiteralNumberLiteralParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_numberLiteral_1_0=ruleNumberLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueOptionsRule());
                    					}
                    					set(
                    						current,
                    						"numberLiteral",
                    						lv_numberLiteral_1_0,
                    						"org.xtext.constraint.mydsl.MyDsl.NumberLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1438:3: ( (lv_textLiteral_2_0= ruleTextLiteral ) )
                    {
                    // InternalMyDsl.g:1438:3: ( (lv_textLiteral_2_0= ruleTextLiteral ) )
                    // InternalMyDsl.g:1439:4: (lv_textLiteral_2_0= ruleTextLiteral )
                    {
                    // InternalMyDsl.g:1439:4: (lv_textLiteral_2_0= ruleTextLiteral )
                    // InternalMyDsl.g:1440:5: lv_textLiteral_2_0= ruleTextLiteral
                    {

                    					newCompositeNode(grammarAccess.getValueOptionsAccess().getTextLiteralTextLiteralParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_textLiteral_2_0=ruleTextLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueOptionsRule());
                    					}
                    					set(
                    						current,
                    						"textLiteral",
                    						lv_textLiteral_2_0,
                    						"org.xtext.constraint.mydsl.MyDsl.TextLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueOptions"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyDsl.g:1461:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMyDsl.g:1461:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyDsl.g:1462:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyDsl.g:1468:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1474:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1475:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1475:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1476:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1476:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:1477:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMyDsl.g:1496:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMyDsl.g:1496:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMyDsl.g:1497:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMyDsl.g:1503:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' this_INT_2= RULE_INT )? ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1509:2: ( ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' this_INT_2= RULE_INT )? ) )
            // InternalMyDsl.g:1510:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' this_INT_2= RULE_INT )? )
            {
            // InternalMyDsl.g:1510:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' this_INT_2= RULE_INT )? )
            // InternalMyDsl.g:1511:3: ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' this_INT_2= RULE_INT )?
            {
            // InternalMyDsl.g:1511:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyDsl.g:1512:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyDsl.g:1512:4: (lv_value_0_0= RULE_INT )
            // InternalMyDsl.g:1513:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            					newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:1529:3: (otherlv_1= '.' this_INT_2= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1530:4: otherlv_1= '.' this_INT_2= RULE_INT
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberLiteralAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_2, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleTextLiteral"
    // InternalMyDsl.g:1543:1: entryRuleTextLiteral returns [EObject current=null] : iv_ruleTextLiteral= ruleTextLiteral EOF ;
    public final EObject entryRuleTextLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextLiteral = null;


        try {
            // InternalMyDsl.g:1543:52: (iv_ruleTextLiteral= ruleTextLiteral EOF )
            // InternalMyDsl.g:1544:2: iv_ruleTextLiteral= ruleTextLiteral EOF
            {
             newCompositeNode(grammarAccess.getTextLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextLiteral=ruleTextLiteral();

            state._fsp--;

             current =iv_ruleTextLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextLiteral"


    // $ANTLR start "ruleTextLiteral"
    // InternalMyDsl.g:1550:1: ruleTextLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleTextLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1556:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1557:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1557:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalMyDsl.g:1558:3: (lv_value_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1558:3: (lv_value_0_0= RULE_ID )
            // InternalMyDsl.g:1559:4: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getTextLiteralAccess().getValueIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextLiteral"


    // $ANTLR start "ruleComparisonOperator"
    // InternalMyDsl.g:1578:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '=<' ) | (enumLiteral_5= '=>' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1584:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '=<' ) | (enumLiteral_5= '=>' ) ) )
            // InternalMyDsl.g:1585:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '=<' ) | (enumLiteral_5= '=>' ) )
            {
            // InternalMyDsl.g:1585:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '=<' ) | (enumLiteral_5= '=>' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt14=1;
                }
                break;
            case 41:
                {
                alt14=2;
                }
                break;
            case 42:
                {
                alt14=3;
                }
                break;
            case 43:
                {
                alt14=4;
                }
                break;
            case 44:
                {
                alt14=5;
                }
                break;
            case 45:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1586:3: (enumLiteral_0= '=' )
                    {
                    // InternalMyDsl.g:1586:3: (enumLiteral_0= '=' )
                    // InternalMyDsl.g:1587:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1594:3: (enumLiteral_1= '!=' )
                    {
                    // InternalMyDsl.g:1594:3: (enumLiteral_1= '!=' )
                    // InternalMyDsl.g:1595:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1602:3: (enumLiteral_2= '>' )
                    {
                    // InternalMyDsl.g:1602:3: (enumLiteral_2= '>' )
                    // InternalMyDsl.g:1603:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getBiggerThanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getBiggerThanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1610:3: (enumLiteral_3= '<' )
                    {
                    // InternalMyDsl.g:1610:3: (enumLiteral_3= '<' )
                    // InternalMyDsl.g:1611:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLessThanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLessThanEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1618:3: (enumLiteral_4= '=<' )
                    {
                    // InternalMyDsl.g:1618:3: (enumLiteral_4= '=<' )
                    // InternalMyDsl.g:1619:4: enumLiteral_4= '=<'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1626:3: (enumLiteral_5= '=>' )
                    {
                    // InternalMyDsl.g:1626:3: (enumLiteral_5= '=>' )
                    // InternalMyDsl.g:1627:4: enumLiteral_5= '=>'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getBiggerThanOrEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getBiggerThanOrEqualEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleTimeUnit"
    // InternalMyDsl.g:1637:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'microseconds' ) | (enumLiteral_1= 'milliseconds' ) | (enumLiteral_2= 'seconds' ) | (enumLiteral_3= 'minute' ) | (enumLiteral_4= 'hour' ) | (enumLiteral_5= 'day' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1643:2: ( ( (enumLiteral_0= 'microseconds' ) | (enumLiteral_1= 'milliseconds' ) | (enumLiteral_2= 'seconds' ) | (enumLiteral_3= 'minute' ) | (enumLiteral_4= 'hour' ) | (enumLiteral_5= 'day' ) ) )
            // InternalMyDsl.g:1644:2: ( (enumLiteral_0= 'microseconds' ) | (enumLiteral_1= 'milliseconds' ) | (enumLiteral_2= 'seconds' ) | (enumLiteral_3= 'minute' ) | (enumLiteral_4= 'hour' ) | (enumLiteral_5= 'day' ) )
            {
            // InternalMyDsl.g:1644:2: ( (enumLiteral_0= 'microseconds' ) | (enumLiteral_1= 'milliseconds' ) | (enumLiteral_2= 'seconds' ) | (enumLiteral_3= 'minute' ) | (enumLiteral_4= 'hour' ) | (enumLiteral_5= 'day' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt15=1;
                }
                break;
            case 47:
                {
                alt15=2;
                }
                break;
            case 48:
                {
                alt15=3;
                }
                break;
            case 49:
                {
                alt15=4;
                }
                break;
            case 50:
                {
                alt15=5;
                }
                break;
            case 51:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1645:3: (enumLiteral_0= 'microseconds' )
                    {
                    // InternalMyDsl.g:1645:3: (enumLiteral_0= 'microseconds' )
                    // InternalMyDsl.g:1646:4: enumLiteral_0= 'microseconds'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMicroSecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMicroSecondsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1653:3: (enumLiteral_1= 'milliseconds' )
                    {
                    // InternalMyDsl.g:1653:3: (enumLiteral_1= 'milliseconds' )
                    // InternalMyDsl.g:1654:4: enumLiteral_1= 'milliseconds'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMilliSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMilliSecondsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1661:3: (enumLiteral_2= 'seconds' )
                    {
                    // InternalMyDsl.g:1661:3: (enumLiteral_2= 'seconds' )
                    // InternalMyDsl.g:1662:4: enumLiteral_2= 'seconds'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1669:3: (enumLiteral_3= 'minute' )
                    {
                    // InternalMyDsl.g:1669:3: (enumLiteral_3= 'minute' )
                    // InternalMyDsl.g:1670:4: enumLiteral_3= 'minute'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMinuteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getMinuteEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1677:3: (enumLiteral_4= 'hour' )
                    {
                    // InternalMyDsl.g:1677:3: (enumLiteral_4= 'hour' )
                    // InternalMyDsl.g:1678:4: enumLiteral_4= 'hour'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1685:3: (enumLiteral_5= 'day' )
                    {
                    // InternalMyDsl.g:1685:3: (enumLiteral_5= 'day' )
                    // InternalMyDsl.g:1686:4: enumLiteral_5= 'day'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleGreedyQuantifiers"
    // InternalMyDsl.g:1696:1: ruleGreedyQuantifiers returns [Enumerator current=null] : ( (enumLiteral_0= 'Once' ) | (enumLiteral_1= 'ZeroOrMore' ) | (enumLiteral_2= 'OneOrMore' ) | (enumLiteral_3= 'ZeroOrOne' ) ) ;
    public final Enumerator ruleGreedyQuantifiers() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1702:2: ( ( (enumLiteral_0= 'Once' ) | (enumLiteral_1= 'ZeroOrMore' ) | (enumLiteral_2= 'OneOrMore' ) | (enumLiteral_3= 'ZeroOrOne' ) ) )
            // InternalMyDsl.g:1703:2: ( (enumLiteral_0= 'Once' ) | (enumLiteral_1= 'ZeroOrMore' ) | (enumLiteral_2= 'OneOrMore' ) | (enumLiteral_3= 'ZeroOrOne' ) )
            {
            // InternalMyDsl.g:1703:2: ( (enumLiteral_0= 'Once' ) | (enumLiteral_1= 'ZeroOrMore' ) | (enumLiteral_2= 'OneOrMore' ) | (enumLiteral_3= 'ZeroOrOne' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt16=1;
                }
                break;
            case 53:
                {
                alt16=2;
                }
                break;
            case 54:
                {
                alt16=3;
                }
                break;
            case 55:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1704:3: (enumLiteral_0= 'Once' )
                    {
                    // InternalMyDsl.g:1704:3: (enumLiteral_0= 'Once' )
                    // InternalMyDsl.g:1705:4: enumLiteral_0= 'Once'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getGreedyQuantifiersAccess().getOnceEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGreedyQuantifiersAccess().getOnceEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1712:3: (enumLiteral_1= 'ZeroOrMore' )
                    {
                    // InternalMyDsl.g:1712:3: (enumLiteral_1= 'ZeroOrMore' )
                    // InternalMyDsl.g:1713:4: enumLiteral_1= 'ZeroOrMore'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getGreedyQuantifiersAccess().getZeroOrMoreEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGreedyQuantifiersAccess().getZeroOrMoreEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1720:3: (enumLiteral_2= 'OneOrMore' )
                    {
                    // InternalMyDsl.g:1720:3: (enumLiteral_2= 'OneOrMore' )
                    // InternalMyDsl.g:1721:4: enumLiteral_2= 'OneOrMore'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getGreedyQuantifiersAccess().getOneOrMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGreedyQuantifiersAccess().getOneOrMoreEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1728:3: (enumLiteral_3= 'ZeroOrOne' )
                    {
                    // InternalMyDsl.g:1728:3: (enumLiteral_3= 'ZeroOrOne' )
                    // InternalMyDsl.g:1729:4: enumLiteral_3= 'ZeroOrOne'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getGreedyQuantifiersAccess().getZeroOrOneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getGreedyQuantifiersAccess().getZeroOrOneEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreedyQuantifiers"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000002L});

}