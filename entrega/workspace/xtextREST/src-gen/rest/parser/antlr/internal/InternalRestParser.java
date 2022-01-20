package rest.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import rest.services.RestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RestSystem'", "'{'", "'requests'", "','", "'}'", "'structs'", "'answers'", "'Struct'", "'fields'", "'Answer'", "'status'", "'return'", "'Route'", "'segments'", "'Parameter'", "'ReGet'", "'succAnswer'", "'route'", "'operations'", "'parameters'", "'RePost'", "'RePut'", "'ReDelete'", "'Segment'", "'value'", "'OpCreate'", "'id'", "'failedAnswer'", "'struct'", "'fieldsets'", "'OpRead'", "'('", "')'", "'OpUpdate'", "'OpDelete'", "'FieldSet'", "'Field'", "'-'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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


        public InternalRestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRest.g"; }



     	private RestGrammarAccess grammarAccess;

        public InternalRestParser(TokenStream input, RestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RestSystem";
       	}

       	@Override
       	protected RestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRestSystem"
    // InternalRest.g:64:1: entryRuleRestSystem returns [EObject current=null] : iv_ruleRestSystem= ruleRestSystem EOF ;
    public final EObject entryRuleRestSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestSystem = null;


        try {
            // InternalRest.g:64:51: (iv_ruleRestSystem= ruleRestSystem EOF )
            // InternalRest.g:65:2: iv_ruleRestSystem= ruleRestSystem EOF
            {
             newCompositeNode(grammarAccess.getRestSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestSystem=ruleRestSystem();

            state._fsp--;

             current =iv_ruleRestSystem; 
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
    // $ANTLR end "entryRuleRestSystem"


    // $ANTLR start "ruleRestSystem"
    // InternalRest.g:71:1: ruleRestSystem returns [EObject current=null] : ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'requests' otherlv_4= '{' ( (lv_requests_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_requests_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'structs' otherlv_10= '{' ( (lv_structs_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_structs_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'answers' otherlv_16= '{' ( (lv_answers_17_0= ruleAnswer ) ) (otherlv_18= ',' ( (lv_answers_19_0= ruleAnswer ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleRestSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_requests_5_0 = null;

        EObject lv_requests_7_0 = null;

        EObject lv_structs_11_0 = null;

        EObject lv_structs_13_0 = null;

        EObject lv_answers_17_0 = null;

        EObject lv_answers_19_0 = null;



        	enterRule();

        try {
            // InternalRest.g:77:2: ( ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'requests' otherlv_4= '{' ( (lv_requests_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_requests_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'structs' otherlv_10= '{' ( (lv_structs_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_structs_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'answers' otherlv_16= '{' ( (lv_answers_17_0= ruleAnswer ) ) (otherlv_18= ',' ( (lv_answers_19_0= ruleAnswer ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalRest.g:78:2: ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'requests' otherlv_4= '{' ( (lv_requests_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_requests_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'structs' otherlv_10= '{' ( (lv_structs_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_structs_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'answers' otherlv_16= '{' ( (lv_answers_17_0= ruleAnswer ) ) (otherlv_18= ',' ( (lv_answers_19_0= ruleAnswer ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalRest.g:78:2: ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'requests' otherlv_4= '{' ( (lv_requests_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_requests_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'structs' otherlv_10= '{' ( (lv_structs_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_structs_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'answers' otherlv_16= '{' ( (lv_answers_17_0= ruleAnswer ) ) (otherlv_18= ',' ( (lv_answers_19_0= ruleAnswer ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalRest.g:79:3: () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'requests' otherlv_4= '{' ( (lv_requests_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_requests_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'structs' otherlv_10= '{' ( (lv_structs_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_structs_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'answers' otherlv_16= '{' ( (lv_answers_17_0= ruleAnswer ) ) (otherlv_18= ',' ( (lv_answers_19_0= ruleAnswer ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalRest.g:79:3: ()
            // InternalRest.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestSystemAccess().getRestSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestSystemAccess().getRestSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRest.g:94:3: (otherlv_3= 'requests' otherlv_4= '{' ( (lv_requests_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_requests_7_0= ruleRequest ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRest.g:95:4: otherlv_3= 'requests' otherlv_4= '{' ( (lv_requests_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_requests_7_0= ruleRequest ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRestSystemAccess().getRequestsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRest.g:103:4: ( (lv_requests_5_0= ruleRequest ) )
                    // InternalRest.g:104:5: (lv_requests_5_0= ruleRequest )
                    {
                    // InternalRest.g:104:5: (lv_requests_5_0= ruleRequest )
                    // InternalRest.g:105:6: lv_requests_5_0= ruleRequest
                    {

                    						newCompositeNode(grammarAccess.getRestSystemAccess().getRequestsRequestParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_requests_5_0=ruleRequest();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    						}
                    						add(
                    							current,
                    							"requests",
                    							lv_requests_5_0,
                    							"rest.Rest.Request");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:122:4: (otherlv_6= ',' ( (lv_requests_7_0= ruleRequest ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRest.g:123:5: otherlv_6= ',' ( (lv_requests_7_0= ruleRequest ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRestSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRest.g:127:5: ( (lv_requests_7_0= ruleRequest ) )
                    	    // InternalRest.g:128:6: (lv_requests_7_0= ruleRequest )
                    	    {
                    	    // InternalRest.g:128:6: (lv_requests_7_0= ruleRequest )
                    	    // InternalRest.g:129:7: lv_requests_7_0= ruleRequest
                    	    {

                    	    							newCompositeNode(grammarAccess.getRestSystemAccess().getRequestsRequestParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_requests_7_0=ruleRequest();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requests",
                    	    								lv_requests_7_0,
                    	    								"rest.Rest.Request");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:152:3: (otherlv_9= 'structs' otherlv_10= '{' ( (lv_structs_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_structs_13_0= ruleStruct ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRest.g:153:4: otherlv_9= 'structs' otherlv_10= '{' ( (lv_structs_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_structs_13_0= ruleStruct ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRestSystemAccess().getStructsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRest.g:161:4: ( (lv_structs_11_0= ruleStruct ) )
                    // InternalRest.g:162:5: (lv_structs_11_0= ruleStruct )
                    {
                    // InternalRest.g:162:5: (lv_structs_11_0= ruleStruct )
                    // InternalRest.g:163:6: lv_structs_11_0= ruleStruct
                    {

                    						newCompositeNode(grammarAccess.getRestSystemAccess().getStructsStructParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_structs_11_0=ruleStruct();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    						}
                    						add(
                    							current,
                    							"structs",
                    							lv_structs_11_0,
                    							"rest.Rest.Struct");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:180:4: (otherlv_12= ',' ( (lv_structs_13_0= ruleStruct ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRest.g:181:5: otherlv_12= ',' ( (lv_structs_13_0= ruleStruct ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRestSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:185:5: ( (lv_structs_13_0= ruleStruct ) )
                    	    // InternalRest.g:186:6: (lv_structs_13_0= ruleStruct )
                    	    {
                    	    // InternalRest.g:186:6: (lv_structs_13_0= ruleStruct )
                    	    // InternalRest.g:187:7: lv_structs_13_0= ruleStruct
                    	    {

                    	    							newCompositeNode(grammarAccess.getRestSystemAccess().getStructsStructParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_structs_13_0=ruleStruct();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"structs",
                    	    								lv_structs_13_0,
                    	    								"rest.Rest.Struct");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:210:3: (otherlv_15= 'answers' otherlv_16= '{' ( (lv_answers_17_0= ruleAnswer ) ) (otherlv_18= ',' ( (lv_answers_19_0= ruleAnswer ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRest.g:211:4: otherlv_15= 'answers' otherlv_16= '{' ( (lv_answers_17_0= ruleAnswer ) ) (otherlv_18= ',' ( (lv_answers_19_0= ruleAnswer ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRestSystemAccess().getAnswersKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRest.g:219:4: ( (lv_answers_17_0= ruleAnswer ) )
                    // InternalRest.g:220:5: (lv_answers_17_0= ruleAnswer )
                    {
                    // InternalRest.g:220:5: (lv_answers_17_0= ruleAnswer )
                    // InternalRest.g:221:6: lv_answers_17_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getRestSystemAccess().getAnswersAnswerParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_answers_17_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    						}
                    						add(
                    							current,
                    							"answers",
                    							lv_answers_17_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:238:4: (otherlv_18= ',' ( (lv_answers_19_0= ruleAnswer ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRest.g:239:5: otherlv_18= ',' ( (lv_answers_19_0= ruleAnswer ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRestSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:243:5: ( (lv_answers_19_0= ruleAnswer ) )
                    	    // InternalRest.g:244:6: (lv_answers_19_0= ruleAnswer )
                    	    {
                    	    // InternalRest.g:244:6: (lv_answers_19_0= ruleAnswer )
                    	    // InternalRest.g:245:7: lv_answers_19_0= ruleAnswer
                    	    {

                    	    							newCompositeNode(grammarAccess.getRestSystemAccess().getAnswersAnswerParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_answers_19_0=ruleAnswer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"answers",
                    	    								lv_answers_19_0,
                    	    								"rest.Rest.Answer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRestSystem"


    // $ANTLR start "entryRuleRequest"
    // InternalRest.g:276:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalRest.g:276:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalRest.g:277:2: iv_ruleRequest= ruleRequest EOF
            {
             newCompositeNode(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequest=ruleRequest();

            state._fsp--;

             current =iv_ruleRequest; 
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
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalRest.g:283:1: ruleRequest returns [EObject current=null] : (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        EObject this_ReGet_0 = null;

        EObject this_RePost_1 = null;

        EObject this_RePut_2 = null;

        EObject this_ReDelete_3 = null;



        	enterRule();

        try {
            // InternalRest.g:289:2: ( (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete ) )
            // InternalRest.g:290:2: (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete )
            {
            // InternalRest.g:290:2: (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            case 33:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRest.g:291:3: this_ReGet_0= ruleReGet
                    {

                    			newCompositeNode(grammarAccess.getRequestAccess().getReGetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReGet_0=ruleReGet();

                    state._fsp--;


                    			current = this_ReGet_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:300:3: this_RePost_1= ruleRePost
                    {

                    			newCompositeNode(grammarAccess.getRequestAccess().getRePostParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RePost_1=ruleRePost();

                    state._fsp--;


                    			current = this_RePost_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRest.g:309:3: this_RePut_2= ruleRePut
                    {

                    			newCompositeNode(grammarAccess.getRequestAccess().getRePutParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RePut_2=ruleRePut();

                    state._fsp--;


                    			current = this_RePut_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRest.g:318:3: this_ReDelete_3= ruleReDelete
                    {

                    			newCompositeNode(grammarAccess.getRequestAccess().getReDeleteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReDelete_3=ruleReDelete();

                    state._fsp--;


                    			current = this_ReDelete_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleOperation"
    // InternalRest.g:330:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalRest.g:330:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalRest.g:331:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalRest.g:337:1: ruleOperation returns [EObject current=null] : (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_OpCreate_0 = null;

        EObject this_OpRead_1 = null;

        EObject this_OpUpdate_2 = null;

        EObject this_OpDelete_3 = null;



        	enterRule();

        try {
            // InternalRest.g:343:2: ( (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete ) )
            // InternalRest.g:344:2: (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete )
            {
            // InternalRest.g:344:2: (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt8=1;
                }
                break;
            case 41:
                {
                alt8=2;
                }
                break;
            case 44:
                {
                alt8=3;
                }
                break;
            case 45:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRest.g:345:3: this_OpCreate_0= ruleOpCreate
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getOpCreateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpCreate_0=ruleOpCreate();

                    state._fsp--;


                    			current = this_OpCreate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:354:3: this_OpRead_1= ruleOpRead
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getOpReadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpRead_1=ruleOpRead();

                    state._fsp--;


                    			current = this_OpRead_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRest.g:363:3: this_OpUpdate_2= ruleOpUpdate
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getOpUpdateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpUpdate_2=ruleOpUpdate();

                    state._fsp--;


                    			current = this_OpUpdate_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRest.g:372:3: this_OpDelete_3= ruleOpDelete
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getOpDeleteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpDelete_3=ruleOpDelete();

                    state._fsp--;


                    			current = this_OpDelete_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleStruct"
    // InternalRest.g:384:1: entryRuleStruct returns [EObject current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final EObject entryRuleStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct = null;


        try {
            // InternalRest.g:384:47: (iv_ruleStruct= ruleStruct EOF )
            // InternalRest.g:385:2: iv_ruleStruct= ruleStruct EOF
            {
             newCompositeNode(grammarAccess.getStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStruct=ruleStruct();

            state._fsp--;

             current =iv_ruleStruct; 
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
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // InternalRest.g:391:1: ruleStruct returns [EObject current=null] : ( () otherlv_1= 'Struct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;



        	enterRule();

        try {
            // InternalRest.g:397:2: ( ( () otherlv_1= 'Struct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRest.g:398:2: ( () otherlv_1= 'Struct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRest.g:398:2: ( () otherlv_1= 'Struct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRest.g:399:3: () otherlv_1= 'Struct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalRest.g:399:3: ()
            // InternalRest.g:400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStructAccess().getStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStructAccess().getStructKeyword_1());
            		
            // InternalRest.g:410:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:411:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:411:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:412:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStructAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"rest.Rest.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:433:3: (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRest.g:434:4: otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStructAccess().getFieldsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRest.g:442:4: ( (lv_fields_6_0= ruleField ) )
                    // InternalRest.g:443:5: (lv_fields_6_0= ruleField )
                    {
                    // InternalRest.g:443:5: (lv_fields_6_0= ruleField )
                    // InternalRest.g:444:6: lv_fields_6_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_fields_6_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_6_0,
                    							"rest.Rest.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:461:4: (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRest.g:462:5: otherlv_7= ',' ( (lv_fields_8_0= ruleField ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStructAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:466:5: ( (lv_fields_8_0= ruleField ) )
                    	    // InternalRest.g:467:6: (lv_fields_8_0= ruleField )
                    	    {
                    	    // InternalRest.g:467:6: (lv_fields_8_0= ruleField )
                    	    // InternalRest.g:468:7: lv_fields_8_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_fields_8_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStructRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_8_0,
                    	    								"rest.Rest.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getStructAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStructAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleAnswer"
    // InternalRest.g:499:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // InternalRest.g:499:47: (iv_ruleAnswer= ruleAnswer EOF )
            // InternalRest.g:500:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // InternalRest.g:506:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_status_4_0 = null;

        AntlrDatatypeRuleToken lv_return_6_0 = null;



        	enterRule();

        try {
            // InternalRest.g:512:2: ( (otherlv_0= 'Answer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRest.g:513:2: (otherlv_0= 'Answer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRest.g:513:2: (otherlv_0= 'Answer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalRest.g:514:3: otherlv_0= 'Answer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerKeyword_0());
            		
            // InternalRest.g:518:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRest.g:519:4: (lv_name_1_0= ruleEString )
            {
            // InternalRest.g:519:4: (lv_name_1_0= ruleEString )
            // InternalRest.g:520:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnswerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnswerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"rest.Rest.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getStatusKeyword_3());
            		
            // InternalRest.g:545:3: ( (lv_status_4_0= ruleEInt ) )
            // InternalRest.g:546:4: (lv_status_4_0= ruleEInt )
            {
            // InternalRest.g:546:4: (lv_status_4_0= ruleEInt )
            // InternalRest.g:547:5: lv_status_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAnswerAccess().getStatusEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_status_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnswerRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_4_0,
            						"rest.Rest.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:564:3: (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRest.g:565:4: otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getAnswerAccess().getReturnKeyword_5_0());
                    			
                    // InternalRest.g:569:4: ( (lv_return_6_0= ruleEString ) )
                    // InternalRest.g:570:5: (lv_return_6_0= ruleEString )
                    {
                    // InternalRest.g:570:5: (lv_return_6_0= ruleEString )
                    // InternalRest.g:571:6: lv_return_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnswerAccess().getReturnEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_return_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnswerRule());
                    						}
                    						set(
                    							current,
                    							"return",
                    							lv_return_6_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleRoute"
    // InternalRest.g:597:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalRest.g:597:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalRest.g:598:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalRest.g:604:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segments' otherlv_3= '{' ( (lv_segments_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segments_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_segments_4_0 = null;

        EObject lv_segments_6_0 = null;



        	enterRule();

        try {
            // InternalRest.g:610:2: ( (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segments' otherlv_3= '{' ( (lv_segments_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segments_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRest.g:611:2: (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segments' otherlv_3= '{' ( (lv_segments_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segments_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRest.g:611:2: (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segments' otherlv_3= '{' ( (lv_segments_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segments_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRest.g:612:3: otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segments' otherlv_3= '{' ( (lv_segments_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segments_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteAccess().getSegmentsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:628:3: ( (lv_segments_4_0= ruleSegment ) )
            // InternalRest.g:629:4: (lv_segments_4_0= ruleSegment )
            {
            // InternalRest.g:629:4: (lv_segments_4_0= ruleSegment )
            // InternalRest.g:630:5: lv_segments_4_0= ruleSegment
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getSegmentsSegmentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_segments_4_0=ruleSegment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					add(
            						current,
            						"segments",
            						lv_segments_4_0,
            						"rest.Rest.Segment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:647:3: (otherlv_5= ',' ( (lv_segments_6_0= ruleSegment ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRest.g:648:4: otherlv_5= ',' ( (lv_segments_6_0= ruleSegment ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_19); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRouteAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRest.g:652:4: ( (lv_segments_6_0= ruleSegment ) )
            	    // InternalRest.g:653:5: (lv_segments_6_0= ruleSegment )
            	    {
            	    // InternalRest.g:653:5: (lv_segments_6_0= ruleSegment )
            	    // InternalRest.g:654:6: lv_segments_6_0= ruleSegment
            	    {

            	    						newCompositeNode(grammarAccess.getRouteAccess().getSegmentsSegmentParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_segments_6_0=ruleSegment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRouteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"segments",
            	    							lv_segments_6_0,
            	    							"rest.Rest.Segment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getRouteAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRouteAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleParameter"
    // InternalRest.g:684:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRest.g:684:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRest.g:685:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRest.g:691:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:697:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:698:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:698:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:699:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:699:3: ()
            // InternalRest.g:700:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalRest.g:710:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:711:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:711:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:712:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"rest.Rest.EString");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReGet"
    // InternalRest.g:733:1: entryRuleReGet returns [EObject current=null] : iv_ruleReGet= ruleReGet EOF ;
    public final EObject entryRuleReGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReGet = null;


        try {
            // InternalRest.g:733:46: (iv_ruleReGet= ruleReGet EOF )
            // InternalRest.g:734:2: iv_ruleReGet= ruleReGet EOF
            {
             newCompositeNode(grammarAccess.getReGetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReGet=ruleReGet();

            state._fsp--;

             current =iv_ruleReGet; 
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
    // $ANTLR end "entryRuleReGet"


    // $ANTLR start "ruleReGet"
    // InternalRest.g:740:1: ruleReGet returns [EObject current=null] : (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleReGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_route_5_0 = null;

        EObject lv_operations_8_0 = null;

        EObject lv_operations_10_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_parameters_16_0 = null;



        	enterRule();

        try {
            // InternalRest.g:746:2: ( (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalRest.g:747:2: (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalRest.g:747:2: (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalRest.g:748:3: otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReGetAccess().getReGetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getReGetAccess().getSuccAnswerKeyword_2());
            		
            // InternalRest.g:760:3: ( ( ruleEString ) )
            // InternalRest.g:761:4: ( ruleEString )
            {
            // InternalRest.g:761:4: ( ruleEString )
            // InternalRest.g:762:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReGetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReGetAccess().getSuccAnswerAnswerCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getReGetAccess().getRouteKeyword_4());
            		
            // InternalRest.g:780:3: ( (lv_route_5_0= ruleRoute ) )
            // InternalRest.g:781:4: (lv_route_5_0= ruleRoute )
            {
            // InternalRest.g:781:4: (lv_route_5_0= ruleRoute )
            // InternalRest.g:782:5: lv_route_5_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getReGetAccess().getRouteRouteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_route_5_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReGetRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_5_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:799:3: (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRest.g:800:4: otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getReGetAccess().getOperationsKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRest.g:808:4: ( (lv_operations_8_0= ruleOperation ) )
                    // InternalRest.g:809:5: (lv_operations_8_0= ruleOperation )
                    {
                    // InternalRest.g:809:5: (lv_operations_8_0= ruleOperation )
                    // InternalRest.g:810:6: lv_operations_8_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getReGetAccess().getOperationsOperationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operations_8_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReGetRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_8_0,
                    							"rest.Rest.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:827:4: (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRest.g:828:5: otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getReGetAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRest.g:832:5: ( (lv_operations_10_0= ruleOperation ) )
                    	    // InternalRest.g:833:6: (lv_operations_10_0= ruleOperation )
                    	    {
                    	    // InternalRest.g:833:6: (lv_operations_10_0= ruleOperation )
                    	    // InternalRest.g:834:7: lv_operations_10_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getReGetAccess().getOperationsOperationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_operations_10_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReGetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_10_0,
                    	    								"rest.Rest.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:857:3: (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRest.g:858:4: otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getReGetAccess().getParametersKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:866:4: ( (lv_parameters_14_0= ruleParameter ) )
                    // InternalRest.g:867:5: (lv_parameters_14_0= ruleParameter )
                    {
                    // InternalRest.g:867:5: (lv_parameters_14_0= ruleParameter )
                    // InternalRest.g:868:6: lv_parameters_14_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getReGetAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameters_14_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReGetRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_14_0,
                    							"rest.Rest.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:885:4: (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRest.g:886:5: otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getReGetAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:890:5: ( (lv_parameters_16_0= ruleParameter ) )
                    	    // InternalRest.g:891:6: (lv_parameters_16_0= ruleParameter )
                    	    {
                    	    // InternalRest.g:891:6: (lv_parameters_16_0= ruleParameter )
                    	    // InternalRest.g:892:7: lv_parameters_16_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getReGetAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_16_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReGetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_16_0,
                    	    								"rest.Rest.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleReGet"


    // $ANTLR start "entryRuleRePost"
    // InternalRest.g:923:1: entryRuleRePost returns [EObject current=null] : iv_ruleRePost= ruleRePost EOF ;
    public final EObject entryRuleRePost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRePost = null;


        try {
            // InternalRest.g:923:47: (iv_ruleRePost= ruleRePost EOF )
            // InternalRest.g:924:2: iv_ruleRePost= ruleRePost EOF
            {
             newCompositeNode(grammarAccess.getRePostRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRePost=ruleRePost();

            state._fsp--;

             current =iv_ruleRePost; 
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
    // $ANTLR end "entryRuleRePost"


    // $ANTLR start "ruleRePost"
    // InternalRest.g:930:1: ruleRePost returns [EObject current=null] : (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleRePost() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_route_5_0 = null;

        EObject lv_operations_8_0 = null;

        EObject lv_operations_10_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_parameters_16_0 = null;



        	enterRule();

        try {
            // InternalRest.g:936:2: ( (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalRest.g:937:2: (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalRest.g:937:2: (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalRest.g:938:3: otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRePostAccess().getRePostKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRePostAccess().getSuccAnswerKeyword_2());
            		
            // InternalRest.g:950:3: ( ( ruleEString ) )
            // InternalRest.g:951:4: ( ruleEString )
            {
            // InternalRest.g:951:4: ( ruleEString )
            // InternalRest.g:952:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRePostRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRePostAccess().getSuccAnswerAnswerCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getRePostAccess().getRouteKeyword_4());
            		
            // InternalRest.g:970:3: ( (lv_route_5_0= ruleRoute ) )
            // InternalRest.g:971:4: (lv_route_5_0= ruleRoute )
            {
            // InternalRest.g:971:4: (lv_route_5_0= ruleRoute )
            // InternalRest.g:972:5: lv_route_5_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getRePostAccess().getRouteRouteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_route_5_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRePostRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_5_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:989:3: (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRest.g:990:4: otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRePostAccess().getOperationsKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRest.g:998:4: ( (lv_operations_8_0= ruleOperation ) )
                    // InternalRest.g:999:5: (lv_operations_8_0= ruleOperation )
                    {
                    // InternalRest.g:999:5: (lv_operations_8_0= ruleOperation )
                    // InternalRest.g:1000:6: lv_operations_8_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getRePostAccess().getOperationsOperationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operations_8_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePostRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_8_0,
                    							"rest.Rest.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1017:4: (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRest.g:1018:5: otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getRePostAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRest.g:1022:5: ( (lv_operations_10_0= ruleOperation ) )
                    	    // InternalRest.g:1023:6: (lv_operations_10_0= ruleOperation )
                    	    {
                    	    // InternalRest.g:1023:6: (lv_operations_10_0= ruleOperation )
                    	    // InternalRest.g:1024:7: lv_operations_10_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePostAccess().getOperationsOperationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_operations_10_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePostRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_10_0,
                    	    								"rest.Rest.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:1047:3: (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRest.g:1048:4: otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRePostAccess().getParametersKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1056:4: ( (lv_parameters_14_0= ruleParameter ) )
                    // InternalRest.g:1057:5: (lv_parameters_14_0= ruleParameter )
                    {
                    // InternalRest.g:1057:5: (lv_parameters_14_0= ruleParameter )
                    // InternalRest.g:1058:6: lv_parameters_14_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getRePostAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameters_14_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePostRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_14_0,
                    							"rest.Rest.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1075:4: (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRest.g:1076:5: otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRePostAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1080:5: ( (lv_parameters_16_0= ruleParameter ) )
                    	    // InternalRest.g:1081:6: (lv_parameters_16_0= ruleParameter )
                    	    {
                    	    // InternalRest.g:1081:6: (lv_parameters_16_0= ruleParameter )
                    	    // InternalRest.g:1082:7: lv_parameters_16_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePostAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_16_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePostRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_16_0,
                    	    								"rest.Rest.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRePost"


    // $ANTLR start "entryRuleRePut"
    // InternalRest.g:1113:1: entryRuleRePut returns [EObject current=null] : iv_ruleRePut= ruleRePut EOF ;
    public final EObject entryRuleRePut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRePut = null;


        try {
            // InternalRest.g:1113:46: (iv_ruleRePut= ruleRePut EOF )
            // InternalRest.g:1114:2: iv_ruleRePut= ruleRePut EOF
            {
             newCompositeNode(grammarAccess.getRePutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRePut=ruleRePut();

            state._fsp--;

             current =iv_ruleRePut; 
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
    // $ANTLR end "entryRuleRePut"


    // $ANTLR start "ruleRePut"
    // InternalRest.g:1120:1: ruleRePut returns [EObject current=null] : (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleRePut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_route_5_0 = null;

        EObject lv_operations_8_0 = null;

        EObject lv_operations_10_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_parameters_16_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1126:2: ( (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalRest.g:1127:2: (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalRest.g:1127:2: (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalRest.g:1128:3: otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRePutAccess().getRePutKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRePutAccess().getSuccAnswerKeyword_2());
            		
            // InternalRest.g:1140:3: ( ( ruleEString ) )
            // InternalRest.g:1141:4: ( ruleEString )
            {
            // InternalRest.g:1141:4: ( ruleEString )
            // InternalRest.g:1142:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRePutRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRePutAccess().getSuccAnswerAnswerCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getRePutAccess().getRouteKeyword_4());
            		
            // InternalRest.g:1160:3: ( (lv_route_5_0= ruleRoute ) )
            // InternalRest.g:1161:4: (lv_route_5_0= ruleRoute )
            {
            // InternalRest.g:1161:4: (lv_route_5_0= ruleRoute )
            // InternalRest.g:1162:5: lv_route_5_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getRePutAccess().getRouteRouteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_route_5_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRePutRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_5_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1179:3: (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRest.g:1180:4: otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRePutAccess().getOperationsKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRest.g:1188:4: ( (lv_operations_8_0= ruleOperation ) )
                    // InternalRest.g:1189:5: (lv_operations_8_0= ruleOperation )
                    {
                    // InternalRest.g:1189:5: (lv_operations_8_0= ruleOperation )
                    // InternalRest.g:1190:6: lv_operations_8_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getRePutAccess().getOperationsOperationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operations_8_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePutRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_8_0,
                    							"rest.Rest.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1207:4: (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRest.g:1208:5: otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getRePutAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRest.g:1212:5: ( (lv_operations_10_0= ruleOperation ) )
                    	    // InternalRest.g:1213:6: (lv_operations_10_0= ruleOperation )
                    	    {
                    	    // InternalRest.g:1213:6: (lv_operations_10_0= ruleOperation )
                    	    // InternalRest.g:1214:7: lv_operations_10_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePutAccess().getOperationsOperationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_operations_10_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePutRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_10_0,
                    	    								"rest.Rest.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:1237:3: (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRest.g:1238:4: otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRePutAccess().getParametersKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1246:4: ( (lv_parameters_14_0= ruleParameter ) )
                    // InternalRest.g:1247:5: (lv_parameters_14_0= ruleParameter )
                    {
                    // InternalRest.g:1247:5: (lv_parameters_14_0= ruleParameter )
                    // InternalRest.g:1248:6: lv_parameters_14_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getRePutAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameters_14_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePutRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_14_0,
                    							"rest.Rest.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1265:4: (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRest.g:1266:5: otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRePutAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1270:5: ( (lv_parameters_16_0= ruleParameter ) )
                    	    // InternalRest.g:1271:6: (lv_parameters_16_0= ruleParameter )
                    	    {
                    	    // InternalRest.g:1271:6: (lv_parameters_16_0= ruleParameter )
                    	    // InternalRest.g:1272:7: lv_parameters_16_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePutAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_16_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePutRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_16_0,
                    	    								"rest.Rest.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRePut"


    // $ANTLR start "entryRuleReDelete"
    // InternalRest.g:1303:1: entryRuleReDelete returns [EObject current=null] : iv_ruleReDelete= ruleReDelete EOF ;
    public final EObject entryRuleReDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReDelete = null;


        try {
            // InternalRest.g:1303:49: (iv_ruleReDelete= ruleReDelete EOF )
            // InternalRest.g:1304:2: iv_ruleReDelete= ruleReDelete EOF
            {
             newCompositeNode(grammarAccess.getReDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReDelete=ruleReDelete();

            state._fsp--;

             current =iv_ruleReDelete; 
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
    // $ANTLR end "entryRuleReDelete"


    // $ANTLR start "ruleReDelete"
    // InternalRest.g:1310:1: ruleReDelete returns [EObject current=null] : (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleReDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_route_5_0 = null;

        EObject lv_operations_8_0 = null;

        EObject lv_operations_10_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_parameters_16_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1316:2: ( (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalRest.g:1317:2: (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalRest.g:1317:2: (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalRest.g:1318:3: otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'succAnswer' ( ( ruleEString ) ) otherlv_4= 'route' ( (lv_route_5_0= ruleRoute ) ) (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )? (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReDeleteAccess().getReDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getReDeleteAccess().getSuccAnswerKeyword_2());
            		
            // InternalRest.g:1330:3: ( ( ruleEString ) )
            // InternalRest.g:1331:4: ( ruleEString )
            {
            // InternalRest.g:1331:4: ( ruleEString )
            // InternalRest.g:1332:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReDeleteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getReDeleteAccess().getRouteKeyword_4());
            		
            // InternalRest.g:1350:3: ( (lv_route_5_0= ruleRoute ) )
            // InternalRest.g:1351:4: (lv_route_5_0= ruleRoute )
            {
            // InternalRest.g:1351:4: (lv_route_5_0= ruleRoute )
            // InternalRest.g:1352:5: lv_route_5_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getReDeleteAccess().getRouteRouteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_route_5_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReDeleteRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_5_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1369:3: (otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRest.g:1370:4: otherlv_6= 'operations' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) ) (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getReDeleteAccess().getOperationsKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRest.g:1378:4: ( (lv_operations_8_0= ruleOperation ) )
                    // InternalRest.g:1379:5: (lv_operations_8_0= ruleOperation )
                    {
                    // InternalRest.g:1379:5: (lv_operations_8_0= ruleOperation )
                    // InternalRest.g:1380:6: lv_operations_8_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getReDeleteAccess().getOperationsOperationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operations_8_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_8_0,
                    							"rest.Rest.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1397:4: (otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalRest.g:1398:5: otherlv_9= ',' ( (lv_operations_10_0= ruleOperation ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getReDeleteAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRest.g:1402:5: ( (lv_operations_10_0= ruleOperation ) )
                    	    // InternalRest.g:1403:6: (lv_operations_10_0= ruleOperation )
                    	    {
                    	    // InternalRest.g:1403:6: (lv_operations_10_0= ruleOperation )
                    	    // InternalRest.g:1404:7: lv_operations_10_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getReDeleteAccess().getOperationsOperationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_operations_10_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_10_0,
                    	    								"rest.Rest.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:1427:3: (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRest.g:1428:4: otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getReDeleteAccess().getParametersKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1436:4: ( (lv_parameters_14_0= ruleParameter ) )
                    // InternalRest.g:1437:5: (lv_parameters_14_0= ruleParameter )
                    {
                    // InternalRest.g:1437:5: (lv_parameters_14_0= ruleParameter )
                    // InternalRest.g:1438:6: lv_parameters_14_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getReDeleteAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameters_14_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_14_0,
                    							"rest.Rest.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1455:4: (otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalRest.g:1456:5: otherlv_15= ',' ( (lv_parameters_16_0= ruleParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getReDeleteAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1460:5: ( (lv_parameters_16_0= ruleParameter ) )
                    	    // InternalRest.g:1461:6: (lv_parameters_16_0= ruleParameter )
                    	    {
                    	    // InternalRest.g:1461:6: (lv_parameters_16_0= ruleParameter )
                    	    // InternalRest.g:1462:7: lv_parameters_16_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getReDeleteAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_16_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_16_0,
                    	    								"rest.Rest.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleReDelete"


    // $ANTLR start "entryRuleSegment"
    // InternalRest.g:1493:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // InternalRest.g:1493:48: (iv_ruleSegment= ruleSegment EOF )
            // InternalRest.g:1494:2: iv_ruleSegment= ruleSegment EOF
            {
             newCompositeNode(grammarAccess.getSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSegment=ruleSegment();

            state._fsp--;

             current =iv_ruleSegment; 
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
    // $ANTLR end "entryRuleSegment"


    // $ANTLR start "ruleSegment"
    // InternalRest.g:1500:1: ruleSegment returns [EObject current=null] : ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1506:2: ( ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRest.g:1507:2: ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRest.g:1507:2: ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRest.g:1508:3: () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRest.g:1508:3: ()
            // InternalRest.g:1509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSegmentAccess().getSegmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSegmentAccess().getSegmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRest.g:1523:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRest.g:1524:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getSegmentAccess().getValueKeyword_3_0());
                    			
                    // InternalRest.g:1528:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRest.g:1529:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRest.g:1529:5: (lv_value_4_0= ruleEString )
                    // InternalRest.g:1530:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSegmentAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSegmentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSegment"


    // $ANTLR start "entryRuleEString"
    // InternalRest.g:1556:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRest.g:1556:47: (iv_ruleEString= ruleEString EOF )
            // InternalRest.g:1557:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRest.g:1563:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRest.g:1569:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRest.g:1570:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRest.g:1570:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalRest.g:1571:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:1579:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleOpCreate"
    // InternalRest.g:1590:1: entryRuleOpCreate returns [EObject current=null] : iv_ruleOpCreate= ruleOpCreate EOF ;
    public final EObject entryRuleOpCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpCreate = null;


        try {
            // InternalRest.g:1590:49: (iv_ruleOpCreate= ruleOpCreate EOF )
            // InternalRest.g:1591:2: iv_ruleOpCreate= ruleOpCreate EOF
            {
             newCompositeNode(grammarAccess.getOpCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpCreate=ruleOpCreate();

            state._fsp--;

             current =iv_ruleOpCreate; 
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
    // $ANTLR end "entryRuleOpCreate"


    // $ANTLR start "ruleOpCreate"
    // InternalRest.g:1597:1: ruleOpCreate returns [EObject current=null] : (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleOpCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_fieldsets_10_0 = null;

        EObject lv_fieldsets_12_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1603:2: ( (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalRest.g:1604:2: (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalRest.g:1604:2: (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalRest.g:1605:3: otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpCreateAccess().getOpCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1613:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRest.g:1614:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpCreateAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1618:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1619:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1619:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1620:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_id_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpCreateRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOpCreateAccess().getFailedAnswerKeyword_3());
            		
            // InternalRest.g:1642:3: ( ( ruleEString ) )
            // InternalRest.g:1643:4: ( ruleEString )
            {
            // InternalRest.g:1643:4: ( ruleEString )
            // InternalRest.g:1644:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpCreateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getOpCreateAccess().getStructKeyword_5());
            		
            // InternalRest.g:1662:3: ( ( ruleEString ) )
            // InternalRest.g:1663:4: ( ruleEString )
            {
            // InternalRest.g:1663:4: ( ruleEString )
            // InternalRest.g:1664:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpCreateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpCreateAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1678:3: (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRest.g:1679:4: otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getOpCreateAccess().getFieldsetsKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1687:4: ( (lv_fieldsets_10_0= ruleFieldSet ) )
                    // InternalRest.g:1688:5: (lv_fieldsets_10_0= ruleFieldSet )
                    {
                    // InternalRest.g:1688:5: (lv_fieldsets_10_0= ruleFieldSet )
                    // InternalRest.g:1689:6: lv_fieldsets_10_0= ruleFieldSet
                    {

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getFieldsetsFieldSetParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_fieldsets_10_0=ruleFieldSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpCreateRule());
                    						}
                    						add(
                    							current,
                    							"fieldsets",
                    							lv_fieldsets_10_0,
                    							"rest.Rest.FieldSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1706:4: (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRest.g:1707:5: otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOpCreateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1711:5: ( (lv_fieldsets_12_0= ruleFieldSet ) )
                    	    // InternalRest.g:1712:6: (lv_fieldsets_12_0= ruleFieldSet )
                    	    {
                    	    // InternalRest.g:1712:6: (lv_fieldsets_12_0= ruleFieldSet )
                    	    // InternalRest.g:1713:7: lv_fieldsets_12_0= ruleFieldSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpCreateAccess().getFieldsetsFieldSetParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_fieldsets_12_0=ruleFieldSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOpCreateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fieldsets",
                    	    								lv_fieldsets_12_0,
                    	    								"rest.Rest.FieldSet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getOpCreateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getOpCreateAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleOpCreate"


    // $ANTLR start "entryRuleOpRead"
    // InternalRest.g:1744:1: entryRuleOpRead returns [EObject current=null] : iv_ruleOpRead= ruleOpRead EOF ;
    public final EObject entryRuleOpRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpRead = null;


        try {
            // InternalRest.g:1744:47: (iv_ruleOpRead= ruleOpRead EOF )
            // InternalRest.g:1745:2: iv_ruleOpRead= ruleOpRead EOF
            {
             newCompositeNode(grammarAccess.getOpReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpRead=ruleOpRead();

            state._fsp--;

             current =iv_ruleOpRead; 
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
    // $ANTLR end "entryRuleOpRead"


    // $ANTLR start "ruleOpRead"
    // InternalRest.g:1751:1: ruleOpRead returns [EObject current=null] : (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fields' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleOpRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1757:2: ( (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fields' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) )
            // InternalRest.g:1758:2: (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fields' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            {
            // InternalRest.g:1758:2: (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fields' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            // InternalRest.g:1759:3: otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fields' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpReadAccess().getOpReadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOpReadAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1767:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRest.g:1768:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpReadAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1772:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1773:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1773:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1774:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpReadAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_id_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpReadRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOpReadAccess().getFailedAnswerKeyword_3());
            		
            // InternalRest.g:1796:3: ( ( ruleEString ) )
            // InternalRest.g:1797:4: ( ruleEString )
            {
            // InternalRest.g:1797:4: ( ruleEString )
            // InternalRest.g:1798:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpReadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpReadAccess().getFailedAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getOpReadAccess().getStructKeyword_5());
            		
            // InternalRest.g:1816:3: ( ( ruleEString ) )
            // InternalRest.g:1817:4: ( ruleEString )
            {
            // InternalRest.g:1817:4: ( ruleEString )
            // InternalRest.g:1818:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpReadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpReadAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1832:3: (otherlv_8= 'fields' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRest.g:1833:4: otherlv_8= 'fields' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getOpReadAccess().getFieldsKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getOpReadAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalRest.g:1841:4: ( ( ruleEString ) )
                    // InternalRest.g:1842:5: ( ruleEString )
                    {
                    // InternalRest.g:1842:5: ( ruleEString )
                    // InternalRest.g:1843:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpReadRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpReadAccess().getFieldsFieldCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1857:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRest.g:1858:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOpReadAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1862:5: ( ( ruleEString ) )
                    	    // InternalRest.g:1863:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:1863:6: ( ruleEString )
                    	    // InternalRest.g:1864:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOpReadRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOpReadAccess().getFieldsFieldCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getOpReadAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getOpReadAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleOpRead"


    // $ANTLR start "entryRuleOpUpdate"
    // InternalRest.g:1892:1: entryRuleOpUpdate returns [EObject current=null] : iv_ruleOpUpdate= ruleOpUpdate EOF ;
    public final EObject entryRuleOpUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpUpdate = null;


        try {
            // InternalRest.g:1892:49: (iv_ruleOpUpdate= ruleOpUpdate EOF )
            // InternalRest.g:1893:2: iv_ruleOpUpdate= ruleOpUpdate EOF
            {
             newCompositeNode(grammarAccess.getOpUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpUpdate=ruleOpUpdate();

            state._fsp--;

             current =iv_ruleOpUpdate; 
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
    // $ANTLR end "entryRuleOpUpdate"


    // $ANTLR start "ruleOpUpdate"
    // InternalRest.g:1899:1: ruleOpUpdate returns [EObject current=null] : (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleOpUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_fieldsets_10_0 = null;

        EObject lv_fieldsets_12_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1905:2: ( (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalRest.g:1906:2: (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalRest.g:1906:2: (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalRest.g:1907:3: otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpUpdateAccess().getOpUpdateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1915:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRest.g:1916:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpUpdateAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1920:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1921:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1921:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1922:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_id_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpUpdateRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOpUpdateAccess().getFailedAnswerKeyword_3());
            		
            // InternalRest.g:1944:3: ( ( ruleEString ) )
            // InternalRest.g:1945:4: ( ruleEString )
            {
            // InternalRest.g:1945:4: ( ruleEString )
            // InternalRest.g:1946:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpUpdateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getOpUpdateAccess().getStructKeyword_5());
            		
            // InternalRest.g:1964:3: ( ( ruleEString ) )
            // InternalRest.g:1965:4: ( ruleEString )
            {
            // InternalRest.g:1965:4: ( ruleEString )
            // InternalRest.g:1966:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpUpdateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpUpdateAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1980:3: (otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRest.g:1981:4: otherlv_8= 'fieldsets' otherlv_9= '{' ( (lv_fieldsets_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getOpUpdateAccess().getFieldsetsKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1989:4: ( (lv_fieldsets_10_0= ruleFieldSet ) )
                    // InternalRest.g:1990:5: (lv_fieldsets_10_0= ruleFieldSet )
                    {
                    // InternalRest.g:1990:5: (lv_fieldsets_10_0= ruleFieldSet )
                    // InternalRest.g:1991:6: lv_fieldsets_10_0= ruleFieldSet
                    {

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getFieldsetsFieldSetParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_fieldsets_10_0=ruleFieldSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpUpdateRule());
                    						}
                    						add(
                    							current,
                    							"fieldsets",
                    							lv_fieldsets_10_0,
                    							"rest.Rest.FieldSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:2008:4: (otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRest.g:2009:5: otherlv_11= ',' ( (lv_fieldsets_12_0= ruleFieldSet ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOpUpdateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:2013:5: ( (lv_fieldsets_12_0= ruleFieldSet ) )
                    	    // InternalRest.g:2014:6: (lv_fieldsets_12_0= ruleFieldSet )
                    	    {
                    	    // InternalRest.g:2014:6: (lv_fieldsets_12_0= ruleFieldSet )
                    	    // InternalRest.g:2015:7: lv_fieldsets_12_0= ruleFieldSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpUpdateAccess().getFieldsetsFieldSetParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_fieldsets_12_0=ruleFieldSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOpUpdateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fieldsets",
                    	    								lv_fieldsets_12_0,
                    	    								"rest.Rest.FieldSet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getOpUpdateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getOpUpdateAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleOpUpdate"


    // $ANTLR start "entryRuleOpDelete"
    // InternalRest.g:2046:1: entryRuleOpDelete returns [EObject current=null] : iv_ruleOpDelete= ruleOpDelete EOF ;
    public final EObject entryRuleOpDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpDelete = null;


        try {
            // InternalRest.g:2046:49: (iv_ruleOpDelete= ruleOpDelete EOF )
            // InternalRest.g:2047:2: iv_ruleOpDelete= ruleOpDelete EOF
            {
             newCompositeNode(grammarAccess.getOpDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpDelete=ruleOpDelete();

            state._fsp--;

             current =iv_ruleOpDelete; 
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
    // $ANTLR end "entryRuleOpDelete"


    // $ANTLR start "ruleOpDelete"
    // InternalRest.g:2053:1: ruleOpDelete returns [EObject current=null] : (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleOpDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;



        	enterRule();

        try {
            // InternalRest.g:2059:2: ( (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRest.g:2060:2: (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRest.g:2060:2: (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRest.g:2061:3: otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpDeleteAccess().getOpDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOpDeleteAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:2069:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRest.g:2070:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpDeleteAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:2074:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:2075:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:2075:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:2076:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpDeleteAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_id_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpDeleteRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOpDeleteAccess().getFailedAnswerKeyword_3());
            		
            // InternalRest.g:2098:3: ( ( ruleEString ) )
            // InternalRest.g:2099:4: ( ruleEString )
            {
            // InternalRest.g:2099:4: ( ruleEString )
            // InternalRest.g:2100:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpDeleteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getOpDeleteAccess().getStructKeyword_5());
            		
            // InternalRest.g:2118:3: ( ( ruleEString ) )
            // InternalRest.g:2119:4: ( ruleEString )
            {
            // InternalRest.g:2119:4: ( ruleEString )
            // InternalRest.g:2120:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpDeleteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpDeleteAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOpDeleteAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleOpDelete"


    // $ANTLR start "entryRuleFieldSet"
    // InternalRest.g:2142:1: entryRuleFieldSet returns [EObject current=null] : iv_ruleFieldSet= ruleFieldSet EOF ;
    public final EObject entryRuleFieldSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSet = null;


        try {
            // InternalRest.g:2142:49: (iv_ruleFieldSet= ruleFieldSet EOF )
            // InternalRest.g:2143:2: iv_ruleFieldSet= ruleFieldSet EOF
            {
             newCompositeNode(grammarAccess.getFieldSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSet=ruleFieldSet();

            state._fsp--;

             current =iv_ruleFieldSet; 
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
    // $ANTLR end "entryRuleFieldSet"


    // $ANTLR start "ruleFieldSet"
    // InternalRest.g:2149:1: ruleFieldSet returns [EObject current=null] : ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleFieldSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalRest.g:2155:2: ( ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalRest.g:2156:2: ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalRest.g:2156:2: ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalRest.g:2157:3: () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalRest.g:2157:3: ()
            // InternalRest.g:2158:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldSetAccess().getFieldSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldSetAccess().getFieldSetKeyword_1());
            		
            // InternalRest.g:2168:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:2169:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:2169:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:2170:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldSetAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldSetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"rest.Rest.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldSetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:2191:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRest.g:2192:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldSetAccess().getValueKeyword_4_0());
                    			
                    // InternalRest.g:2196:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalRest.g:2197:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalRest.g:2197:5: (lv_value_5_0= ruleEString )
                    // InternalRest.g:2198:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldSetAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldSetRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFieldSetAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFieldSet"


    // $ANTLR start "entryRuleField"
    // InternalRest.g:2224:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalRest.g:2224:46: (iv_ruleField= ruleField EOF )
            // InternalRest.g:2225:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalRest.g:2231:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:2237:2: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:2238:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:2238:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:2239:3: () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:2239:3: ()
            // InternalRest.g:2240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalRest.g:2250:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:2251:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:2251:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:2252:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"rest.Rest.EString");
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEInt"
    // InternalRest.g:2273:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRest.g:2273:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRest.g:2274:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRest.g:2280:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRest.g:2286:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRest.g:2287:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRest.g:2287:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRest.g:2288:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRest.g:2288:3: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRest.g:2289:4: kw= '-'
                    {
                    kw=(Token)match(input,48,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000384000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000321000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});

}