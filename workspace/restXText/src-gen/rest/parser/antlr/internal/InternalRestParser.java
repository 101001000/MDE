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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RestSystem'", "'{'", "'request'", "','", "'}'", "'struct'", "'operation'", "'answer'", "'Struct'", "'fields'", "'Answer'", "'status'", "'return'", "'Route'", "'segment'", "'ReGet'", "'ops'", "'('", "')'", "'succAnswer'", "'route'", "'data'", "'RePost'", "'RePut'", "'ReDelete'", "'Segment'", "'value'", "'Parameter'", "'Attachments'", "'Random'", "'OpCreate'", "'id'", "'failedAnswer'", "'fieldset'", "'OpRead'", "'field'", "'OpUpdate'", "'OpDelete'", "'FieldSet'", "'expr'", "'Field'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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
    // InternalRest.g:71:1: ruleRestSystem returns [EObject current=null] : ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'struct' otherlv_10= '{' ( (lv_struct_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_struct_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? (otherlv_21= 'answer' otherlv_22= '{' ( (lv_answer_23_0= ruleAnswer ) ) (otherlv_24= ',' ( (lv_answer_25_0= ruleAnswer ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_request_5_0 = null;

        EObject lv_request_7_0 = null;

        EObject lv_struct_11_0 = null;

        EObject lv_struct_13_0 = null;

        EObject lv_operation_17_0 = null;

        EObject lv_operation_19_0 = null;

        EObject lv_answer_23_0 = null;

        EObject lv_answer_25_0 = null;



        	enterRule();

        try {
            // InternalRest.g:77:2: ( ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'struct' otherlv_10= '{' ( (lv_struct_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_struct_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? (otherlv_21= 'answer' otherlv_22= '{' ( (lv_answer_23_0= ruleAnswer ) ) (otherlv_24= ',' ( (lv_answer_25_0= ruleAnswer ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalRest.g:78:2: ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'struct' otherlv_10= '{' ( (lv_struct_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_struct_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? (otherlv_21= 'answer' otherlv_22= '{' ( (lv_answer_23_0= ruleAnswer ) ) (otherlv_24= ',' ( (lv_answer_25_0= ruleAnswer ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalRest.g:78:2: ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'struct' otherlv_10= '{' ( (lv_struct_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_struct_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? (otherlv_21= 'answer' otherlv_22= '{' ( (lv_answer_23_0= ruleAnswer ) ) (otherlv_24= ',' ( (lv_answer_25_0= ruleAnswer ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalRest.g:79:3: () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? (otherlv_9= 'struct' otherlv_10= '{' ( (lv_struct_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_struct_13_0= ruleStruct ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? (otherlv_21= 'answer' otherlv_22= '{' ( (lv_answer_23_0= ruleAnswer ) ) (otherlv_24= ',' ( (lv_answer_25_0= ruleAnswer ) ) )* otherlv_26= '}' )? otherlv_27= '}'
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
            		
            // InternalRest.g:94:3: (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRest.g:95:4: otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRestSystemAccess().getRequestKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRest.g:103:4: ( (lv_request_5_0= ruleRequest ) )
                    // InternalRest.g:104:5: (lv_request_5_0= ruleRequest )
                    {
                    // InternalRest.g:104:5: (lv_request_5_0= ruleRequest )
                    // InternalRest.g:105:6: lv_request_5_0= ruleRequest
                    {

                    						newCompositeNode(grammarAccess.getRestSystemAccess().getRequestRequestParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_request_5_0=ruleRequest();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    						}
                    						add(
                    							current,
                    							"request",
                    							lv_request_5_0,
                    							"rest.Rest.Request");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:122:4: (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRest.g:123:5: otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRestSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRest.g:127:5: ( (lv_request_7_0= ruleRequest ) )
                    	    // InternalRest.g:128:6: (lv_request_7_0= ruleRequest )
                    	    {
                    	    // InternalRest.g:128:6: (lv_request_7_0= ruleRequest )
                    	    // InternalRest.g:129:7: lv_request_7_0= ruleRequest
                    	    {

                    	    							newCompositeNode(grammarAccess.getRestSystemAccess().getRequestRequestParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_request_7_0=ruleRequest();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"request",
                    	    								lv_request_7_0,
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

            // InternalRest.g:152:3: (otherlv_9= 'struct' otherlv_10= '{' ( (lv_struct_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_struct_13_0= ruleStruct ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRest.g:153:4: otherlv_9= 'struct' otherlv_10= '{' ( (lv_struct_11_0= ruleStruct ) ) (otherlv_12= ',' ( (lv_struct_13_0= ruleStruct ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRestSystemAccess().getStructKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRest.g:161:4: ( (lv_struct_11_0= ruleStruct ) )
                    // InternalRest.g:162:5: (lv_struct_11_0= ruleStruct )
                    {
                    // InternalRest.g:162:5: (lv_struct_11_0= ruleStruct )
                    // InternalRest.g:163:6: lv_struct_11_0= ruleStruct
                    {

                    						newCompositeNode(grammarAccess.getRestSystemAccess().getStructStructParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_struct_11_0=ruleStruct();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    						}
                    						add(
                    							current,
                    							"struct",
                    							lv_struct_11_0,
                    							"rest.Rest.Struct");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:180:4: (otherlv_12= ',' ( (lv_struct_13_0= ruleStruct ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRest.g:181:5: otherlv_12= ',' ( (lv_struct_13_0= ruleStruct ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRestSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:185:5: ( (lv_struct_13_0= ruleStruct ) )
                    	    // InternalRest.g:186:6: (lv_struct_13_0= ruleStruct )
                    	    {
                    	    // InternalRest.g:186:6: (lv_struct_13_0= ruleStruct )
                    	    // InternalRest.g:187:7: lv_struct_13_0= ruleStruct
                    	    {

                    	    							newCompositeNode(grammarAccess.getRestSystemAccess().getStructStructParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_struct_13_0=ruleStruct();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"struct",
                    	    								lv_struct_13_0,
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

            // InternalRest.g:210:3: (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRest.g:211:4: otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRestSystemAccess().getOperationKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRest.g:219:4: ( (lv_operation_17_0= ruleOperation ) )
                    // InternalRest.g:220:5: (lv_operation_17_0= ruleOperation )
                    {
                    // InternalRest.g:220:5: (lv_operation_17_0= ruleOperation )
                    // InternalRest.g:221:6: lv_operation_17_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getRestSystemAccess().getOperationOperationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operation_17_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    						}
                    						add(
                    							current,
                    							"operation",
                    							lv_operation_17_0,
                    							"rest.Rest.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:238:4: (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRest.g:239:5: otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRestSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:243:5: ( (lv_operation_19_0= ruleOperation ) )
                    	    // InternalRest.g:244:6: (lv_operation_19_0= ruleOperation )
                    	    {
                    	    // InternalRest.g:244:6: (lv_operation_19_0= ruleOperation )
                    	    // InternalRest.g:245:7: lv_operation_19_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRestSystemAccess().getOperationOperationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_operation_19_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operation",
                    	    								lv_operation_19_0,
                    	    								"rest.Rest.Operation");
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

            // InternalRest.g:268:3: (otherlv_21= 'answer' otherlv_22= '{' ( (lv_answer_23_0= ruleAnswer ) ) (otherlv_24= ',' ( (lv_answer_25_0= ruleAnswer ) ) )* otherlv_26= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRest.g:269:4: otherlv_21= 'answer' otherlv_22= '{' ( (lv_answer_23_0= ruleAnswer ) ) (otherlv_24= ',' ( (lv_answer_25_0= ruleAnswer ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getRestSystemAccess().getAnswerKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_22, grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRest.g:277:4: ( (lv_answer_23_0= ruleAnswer ) )
                    // InternalRest.g:278:5: (lv_answer_23_0= ruleAnswer )
                    {
                    // InternalRest.g:278:5: (lv_answer_23_0= ruleAnswer )
                    // InternalRest.g:279:6: lv_answer_23_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getRestSystemAccess().getAnswerAnswerParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_answer_23_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    						}
                    						add(
                    							current,
                    							"answer",
                    							lv_answer_23_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:296:4: (otherlv_24= ',' ( (lv_answer_25_0= ruleAnswer ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRest.g:297:5: otherlv_24= ',' ( (lv_answer_25_0= ruleAnswer ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getRestSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRest.g:301:5: ( (lv_answer_25_0= ruleAnswer ) )
                    	    // InternalRest.g:302:6: (lv_answer_25_0= ruleAnswer )
                    	    {
                    	    // InternalRest.g:302:6: (lv_answer_25_0= ruleAnswer )
                    	    // InternalRest.g:303:7: lv_answer_25_0= ruleAnswer
                    	    {

                    	    							newCompositeNode(grammarAccess.getRestSystemAccess().getAnswerAnswerParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_answer_25_0=ruleAnswer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRestSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"answer",
                    	    								lv_answer_25_0,
                    	    								"rest.Rest.Answer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalRest.g:334:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalRest.g:334:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalRest.g:335:2: iv_ruleRequest= ruleRequest EOF
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
    // InternalRest.g:341:1: ruleRequest returns [EObject current=null] : (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        EObject this_ReGet_0 = null;

        EObject this_RePost_1 = null;

        EObject this_RePut_2 = null;

        EObject this_ReDelete_3 = null;



        	enterRule();

        try {
            // InternalRest.g:347:2: ( (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete ) )
            // InternalRest.g:348:2: (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete )
            {
            // InternalRest.g:348:2: (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRest.g:349:3: this_ReGet_0= ruleReGet
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
                    // InternalRest.g:358:3: this_RePost_1= ruleRePost
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
                    // InternalRest.g:367:3: this_RePut_2= ruleRePut
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
                    // InternalRest.g:376:3: this_ReDelete_3= ruleReDelete
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
    // InternalRest.g:388:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalRest.g:388:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalRest.g:389:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalRest.g:395:1: ruleOperation returns [EObject current=null] : (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_OpCreate_0 = null;

        EObject this_OpRead_1 = null;

        EObject this_OpUpdate_2 = null;

        EObject this_OpDelete_3 = null;



        	enterRule();

        try {
            // InternalRest.g:401:2: ( (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete ) )
            // InternalRest.g:402:2: (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete )
            {
            // InternalRest.g:402:2: (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt10=1;
                }
                break;
            case 45:
                {
                alt10=2;
                }
                break;
            case 47:
                {
                alt10=3;
                }
                break;
            case 48:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRest.g:403:3: this_OpCreate_0= ruleOpCreate
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
                    // InternalRest.g:412:3: this_OpRead_1= ruleOpRead
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
                    // InternalRest.g:421:3: this_OpUpdate_2= ruleOpUpdate
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
                    // InternalRest.g:430:3: this_OpDelete_3= ruleOpDelete
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


    // $ANTLR start "entryRuleData"
    // InternalRest.g:442:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalRest.g:442:45: (iv_ruleData= ruleData EOF )
            // InternalRest.g:443:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalRest.g:449:1: ruleData returns [EObject current=null] : (this_Parameter_0= ruleParameter | this_Attachments_1= ruleAttachments | this_Random_2= ruleRandom ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_0 = null;

        EObject this_Attachments_1 = null;

        EObject this_Random_2 = null;



        	enterRule();

        try {
            // InternalRest.g:455:2: ( (this_Parameter_0= ruleParameter | this_Attachments_1= ruleAttachments | this_Random_2= ruleRandom ) )
            // InternalRest.g:456:2: (this_Parameter_0= ruleParameter | this_Attachments_1= ruleAttachments | this_Random_2= ruleRandom )
            {
            // InternalRest.g:456:2: (this_Parameter_0= ruleParameter | this_Attachments_1= ruleAttachments | this_Random_2= ruleRandom )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt11=1;
                }
                break;
            case 39:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRest.g:457:3: this_Parameter_0= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_0=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:466:3: this_Attachments_1= ruleAttachments
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getAttachmentsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attachments_1=ruleAttachments();

                    state._fsp--;


                    			current = this_Attachments_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRest.g:475:3: this_Random_2= ruleRandom
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getRandomParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Random_2=ruleRandom();

                    state._fsp--;


                    			current = this_Random_2;
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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleStruct"
    // InternalRest.g:487:1: entryRuleStruct returns [EObject current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final EObject entryRuleStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct = null;


        try {
            // InternalRest.g:487:47: (iv_ruleStruct= ruleStruct EOF )
            // InternalRest.g:488:2: iv_ruleStruct= ruleStruct EOF
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
    // InternalRest.g:494:1: ruleStruct returns [EObject current=null] : ( () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:500:2: ( ( () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRest.g:501:2: ( () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRest.g:501:2: ( () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRest.g:502:3: () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRest.g:502:3: ()
            // InternalRest.g:503:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStructAccess().getStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStructAccess().getStructKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRest.g:517:3: (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRest.g:518:4: otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getStructAccess().getFieldsKeyword_3_0());
                    			
                    // InternalRest.g:522:4: ( (lv_fields_4_0= ruleEString ) )
                    // InternalRest.g:523:5: (lv_fields_4_0= ruleEString )
                    {
                    // InternalRest.g:523:5: (lv_fields_4_0= ruleEString )
                    // InternalRest.g:524:6: lv_fields_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStructAccess().getFieldsEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_fields_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructRule());
                    						}
                    						set(
                    							current,
                    							"fields",
                    							lv_fields_4_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStructAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRest.g:550:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // InternalRest.g:550:47: (iv_ruleAnswer= ruleAnswer EOF )
            // InternalRest.g:551:2: iv_ruleAnswer= ruleAnswer EOF
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
    // InternalRest.g:557:1: ruleAnswer returns [EObject current=null] : ( () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_status_4_0 = null;

        AntlrDatatypeRuleToken lv_return_6_0 = null;



        	enterRule();

        try {
            // InternalRest.g:563:2: ( ( () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRest.g:564:2: ( () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRest.g:564:2: ( () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalRest.g:565:3: () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalRest.g:565:3: ()
            // InternalRest.g:566:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnswerAccess().getAnswerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getAnswerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRest.g:580:3: (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRest.g:581:4: otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getStatusKeyword_3_0());
                    			
                    // InternalRest.g:585:4: ( (lv_status_4_0= ruleEInt ) )
                    // InternalRest.g:586:5: (lv_status_4_0= ruleEInt )
                    {
                    // InternalRest.g:586:5: (lv_status_4_0= ruleEInt )
                    // InternalRest.g:587:6: lv_status_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAnswerAccess().getStatusEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
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


                    }
                    break;

            }

            // InternalRest.g:605:3: (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRest.g:606:4: otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getAnswerAccess().getReturnKeyword_4_0());
                    			
                    // InternalRest.g:610:4: ( (lv_return_6_0= ruleEString ) )
                    // InternalRest.g:611:5: (lv_return_6_0= ruleEString )
                    {
                    // InternalRest.g:611:5: (lv_return_6_0= ruleEString )
                    // InternalRest.g:612:6: lv_return_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnswerAccess().getReturnEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            			newLeafNode(otherlv_7, grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRest.g:638:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalRest.g:638:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalRest.g:639:2: iv_ruleRoute= ruleRoute EOF
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
    // InternalRest.g:645:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_segment_4_0 = null;

        EObject lv_segment_6_0 = null;



        	enterRule();

        try {
            // InternalRest.g:651:2: ( (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRest.g:652:2: (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRest.g:652:2: (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRest.g:653:3: otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteAccess().getSegmentKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:669:3: ( (lv_segment_4_0= ruleSegment ) )
            // InternalRest.g:670:4: (lv_segment_4_0= ruleSegment )
            {
            // InternalRest.g:670:4: (lv_segment_4_0= ruleSegment )
            // InternalRest.g:671:5: lv_segment_4_0= ruleSegment
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getSegmentSegmentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_segment_4_0=ruleSegment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					add(
            						current,
            						"segment",
            						lv_segment_4_0,
            						"rest.Rest.Segment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:688:3: (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRest.g:689:4: otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_20); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRouteAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRest.g:693:4: ( (lv_segment_6_0= ruleSegment ) )
            	    // InternalRest.g:694:5: (lv_segment_6_0= ruleSegment )
            	    {
            	    // InternalRest.g:694:5: (lv_segment_6_0= ruleSegment )
            	    // InternalRest.g:695:6: lv_segment_6_0= ruleSegment
            	    {

            	    						newCompositeNode(grammarAccess.getRouteAccess().getSegmentSegmentParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_segment_6_0=ruleSegment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRouteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"segment",
            	    							lv_segment_6_0,
            	    							"rest.Rest.Segment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_13); 

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


    // $ANTLR start "entryRuleReGet"
    // InternalRest.g:725:1: entryRuleReGet returns [EObject current=null] : iv_ruleReGet= ruleReGet EOF ;
    public final EObject entryRuleReGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReGet = null;


        try {
            // InternalRest.g:725:46: (iv_ruleReGet= ruleReGet EOF )
            // InternalRest.g:726:2: iv_ruleReGet= ruleReGet EOF
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
    // InternalRest.g:732:1: ruleReGet returns [EObject current=null] : (otherlv_0= 'ReGet' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleReGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_route_11_0 = null;

        EObject lv_data_14_0 = null;

        EObject lv_data_16_0 = null;



        	enterRule();

        try {
            // InternalRest.g:738:2: ( (otherlv_0= 'ReGet' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalRest.g:739:2: (otherlv_0= 'ReGet' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalRest.g:739:2: (otherlv_0= 'ReGet' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalRest.g:740:3: otherlv_0= 'ReGet' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReGetAccess().getReGetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:748:3: (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRest.g:749:4: otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getReGetAccess().getOpsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getReGetAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalRest.g:757:4: ( ( ruleEString ) )
                    // InternalRest.g:758:5: ( ruleEString )
                    {
                    // InternalRest.g:758:5: ( ruleEString )
                    // InternalRest.g:759:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReGetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReGetAccess().getOpsOperationCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:773:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRest.g:774:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getReGetAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRest.g:778:5: ( ( ruleEString ) )
                    	    // InternalRest.g:779:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:779:6: ( ruleEString )
                    	    // InternalRest.g:780:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReGetRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReGetAccess().getOpsOperationCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getReGetAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getReGetAccess().getSuccAnswerKeyword_3());
            		
            // InternalRest.g:804:3: ( ( ruleEString ) )
            // InternalRest.g:805:4: ( ruleEString )
            {
            // InternalRest.g:805:4: ( ruleEString )
            // InternalRest.g:806:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReGetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReGetAccess().getSuccAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getReGetAccess().getRouteKeyword_5());
            		
            // InternalRest.g:824:3: ( (lv_route_11_0= ruleRoute ) )
            // InternalRest.g:825:4: (lv_route_11_0= ruleRoute )
            {
            // InternalRest.g:825:4: (lv_route_11_0= ruleRoute )
            // InternalRest.g:826:5: lv_route_11_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getReGetAccess().getRouteRouteParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_route_11_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReGetRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_11_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:843:3: (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRest.g:844:4: otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getReGetAccess().getDataKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_13, grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:852:4: ( (lv_data_14_0= ruleData ) )
                    // InternalRest.g:853:5: (lv_data_14_0= ruleData )
                    {
                    // InternalRest.g:853:5: (lv_data_14_0= ruleData )
                    // InternalRest.g:854:6: lv_data_14_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getReGetAccess().getDataDataParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_data_14_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReGetRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_14_0,
                    							"rest.Rest.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:871:4: (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRest.g:872:5: otherlv_15= ',' ( (lv_data_16_0= ruleData ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getReGetAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:876:5: ( (lv_data_16_0= ruleData ) )
                    	    // InternalRest.g:877:6: (lv_data_16_0= ruleData )
                    	    {
                    	    // InternalRest.g:877:6: (lv_data_16_0= ruleData )
                    	    // InternalRest.g:878:7: lv_data_16_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getReGetAccess().getDataDataParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_data_16_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReGetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_16_0,
                    	    								"rest.Rest.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_13); 

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
    // InternalRest.g:909:1: entryRuleRePost returns [EObject current=null] : iv_ruleRePost= ruleRePost EOF ;
    public final EObject entryRuleRePost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRePost = null;


        try {
            // InternalRest.g:909:47: (iv_ruleRePost= ruleRePost EOF )
            // InternalRest.g:910:2: iv_ruleRePost= ruleRePost EOF
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
    // InternalRest.g:916:1: ruleRePost returns [EObject current=null] : (otherlv_0= 'RePost' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleRePost() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_route_11_0 = null;

        EObject lv_data_14_0 = null;

        EObject lv_data_16_0 = null;



        	enterRule();

        try {
            // InternalRest.g:922:2: ( (otherlv_0= 'RePost' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalRest.g:923:2: (otherlv_0= 'RePost' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalRest.g:923:2: (otherlv_0= 'RePost' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalRest.g:924:3: otherlv_0= 'RePost' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRePostAccess().getRePostKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:932:3: (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRest.g:933:4: otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getRePostAccess().getOpsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getRePostAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalRest.g:941:4: ( ( ruleEString ) )
                    // InternalRest.g:942:5: ( ruleEString )
                    {
                    // InternalRest.g:942:5: ( ruleEString )
                    // InternalRest.g:943:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRePostRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRePostAccess().getOpsOperationCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:957:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRest.g:958:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRePostAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRest.g:962:5: ( ( ruleEString ) )
                    	    // InternalRest.g:963:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:963:6: ( ruleEString )
                    	    // InternalRest.g:964:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRePostRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRePostAccess().getOpsOperationCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getRePostAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getRePostAccess().getSuccAnswerKeyword_3());
            		
            // InternalRest.g:988:3: ( ( ruleEString ) )
            // InternalRest.g:989:4: ( ruleEString )
            {
            // InternalRest.g:989:4: ( ruleEString )
            // InternalRest.g:990:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRePostRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRePostAccess().getSuccAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getRePostAccess().getRouteKeyword_5());
            		
            // InternalRest.g:1008:3: ( (lv_route_11_0= ruleRoute ) )
            // InternalRest.g:1009:4: (lv_route_11_0= ruleRoute )
            {
            // InternalRest.g:1009:4: (lv_route_11_0= ruleRoute )
            // InternalRest.g:1010:5: lv_route_11_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getRePostAccess().getRouteRouteParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_route_11_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRePostRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_11_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1027:3: (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRest.g:1028:4: otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRePostAccess().getDataKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_13, grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1036:4: ( (lv_data_14_0= ruleData ) )
                    // InternalRest.g:1037:5: (lv_data_14_0= ruleData )
                    {
                    // InternalRest.g:1037:5: (lv_data_14_0= ruleData )
                    // InternalRest.g:1038:6: lv_data_14_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getRePostAccess().getDataDataParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_data_14_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePostRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_14_0,
                    							"rest.Rest.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1055:4: (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRest.g:1056:5: otherlv_15= ',' ( (lv_data_16_0= ruleData ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRePostAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1060:5: ( (lv_data_16_0= ruleData ) )
                    	    // InternalRest.g:1061:6: (lv_data_16_0= ruleData )
                    	    {
                    	    // InternalRest.g:1061:6: (lv_data_16_0= ruleData )
                    	    // InternalRest.g:1062:7: lv_data_16_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePostAccess().getDataDataParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_data_16_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePostRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_16_0,
                    	    								"rest.Rest.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_13); 

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
    // InternalRest.g:1093:1: entryRuleRePut returns [EObject current=null] : iv_ruleRePut= ruleRePut EOF ;
    public final EObject entryRuleRePut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRePut = null;


        try {
            // InternalRest.g:1093:46: (iv_ruleRePut= ruleRePut EOF )
            // InternalRest.g:1094:2: iv_ruleRePut= ruleRePut EOF
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
    // InternalRest.g:1100:1: ruleRePut returns [EObject current=null] : (otherlv_0= 'RePut' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleRePut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_route_11_0 = null;

        EObject lv_data_14_0 = null;

        EObject lv_data_16_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1106:2: ( (otherlv_0= 'RePut' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalRest.g:1107:2: (otherlv_0= 'RePut' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalRest.g:1107:2: (otherlv_0= 'RePut' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalRest.g:1108:3: otherlv_0= 'RePut' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRePutAccess().getRePutKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1116:3: (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRest.g:1117:4: otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getRePutAccess().getOpsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getRePutAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalRest.g:1125:4: ( ( ruleEString ) )
                    // InternalRest.g:1126:5: ( ruleEString )
                    {
                    // InternalRest.g:1126:5: ( ruleEString )
                    // InternalRest.g:1127:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRePutRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRePutAccess().getOpsOperationCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1141:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRest.g:1142:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRePutAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRest.g:1146:5: ( ( ruleEString ) )
                    	    // InternalRest.g:1147:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:1147:6: ( ruleEString )
                    	    // InternalRest.g:1148:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRePutRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRePutAccess().getOpsOperationCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getRePutAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getRePutAccess().getSuccAnswerKeyword_3());
            		
            // InternalRest.g:1172:3: ( ( ruleEString ) )
            // InternalRest.g:1173:4: ( ruleEString )
            {
            // InternalRest.g:1173:4: ( ruleEString )
            // InternalRest.g:1174:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRePutRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRePutAccess().getSuccAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getRePutAccess().getRouteKeyword_5());
            		
            // InternalRest.g:1192:3: ( (lv_route_11_0= ruleRoute ) )
            // InternalRest.g:1193:4: (lv_route_11_0= ruleRoute )
            {
            // InternalRest.g:1193:4: (lv_route_11_0= ruleRoute )
            // InternalRest.g:1194:5: lv_route_11_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getRePutAccess().getRouteRouteParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_route_11_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRePutRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_11_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1211:3: (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRest.g:1212:4: otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRePutAccess().getDataKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_13, grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1220:4: ( (lv_data_14_0= ruleData ) )
                    // InternalRest.g:1221:5: (lv_data_14_0= ruleData )
                    {
                    // InternalRest.g:1221:5: (lv_data_14_0= ruleData )
                    // InternalRest.g:1222:6: lv_data_14_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getRePutAccess().getDataDataParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_data_14_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePutRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_14_0,
                    							"rest.Rest.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1239:4: (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalRest.g:1240:5: otherlv_15= ',' ( (lv_data_16_0= ruleData ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRePutAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1244:5: ( (lv_data_16_0= ruleData ) )
                    	    // InternalRest.g:1245:6: (lv_data_16_0= ruleData )
                    	    {
                    	    // InternalRest.g:1245:6: (lv_data_16_0= ruleData )
                    	    // InternalRest.g:1246:7: lv_data_16_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePutAccess().getDataDataParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_data_16_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePutRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_16_0,
                    	    								"rest.Rest.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_13); 

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
    // InternalRest.g:1277:1: entryRuleReDelete returns [EObject current=null] : iv_ruleReDelete= ruleReDelete EOF ;
    public final EObject entryRuleReDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReDelete = null;


        try {
            // InternalRest.g:1277:49: (iv_ruleReDelete= ruleReDelete EOF )
            // InternalRest.g:1278:2: iv_ruleReDelete= ruleReDelete EOF
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
    // InternalRest.g:1284:1: ruleReDelete returns [EObject current=null] : (otherlv_0= 'ReDelete' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleReDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_route_11_0 = null;

        EObject lv_data_14_0 = null;

        EObject lv_data_16_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1290:2: ( (otherlv_0= 'ReDelete' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalRest.g:1291:2: (otherlv_0= 'ReDelete' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalRest.g:1291:2: (otherlv_0= 'ReDelete' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalRest.g:1292:3: otherlv_0= 'ReDelete' otherlv_1= '{' (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'succAnswer' ( ( ruleEString ) ) otherlv_10= 'route' ( (lv_route_11_0= ruleRoute ) ) (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReDeleteAccess().getReDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1300:3: (otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRest.g:1301:4: otherlv_2= 'ops' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getReDeleteAccess().getOpsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getReDeleteAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalRest.g:1309:4: ( ( ruleEString ) )
                    // InternalRest.g:1310:5: ( ruleEString )
                    {
                    // InternalRest.g:1310:5: ( ruleEString )
                    // InternalRest.g:1311:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReDeleteRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReDeleteAccess().getOpsOperationCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1325:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalRest.g:1326:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getReDeleteAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRest.g:1330:5: ( ( ruleEString ) )
                    	    // InternalRest.g:1331:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:1331:6: ( ruleEString )
                    	    // InternalRest.g:1332:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReDeleteRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReDeleteAccess().getOpsOperationCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getReDeleteAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getReDeleteAccess().getSuccAnswerKeyword_3());
            		
            // InternalRest.g:1356:3: ( ( ruleEString ) )
            // InternalRest.g:1357:4: ( ruleEString )
            {
            // InternalRest.g:1357:4: ( ruleEString )
            // InternalRest.g:1358:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReDeleteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getReDeleteAccess().getRouteKeyword_5());
            		
            // InternalRest.g:1376:3: ( (lv_route_11_0= ruleRoute ) )
            // InternalRest.g:1377:4: (lv_route_11_0= ruleRoute )
            {
            // InternalRest.g:1377:4: (lv_route_11_0= ruleRoute )
            // InternalRest.g:1378:5: lv_route_11_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getReDeleteAccess().getRouteRouteParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_route_11_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReDeleteRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_11_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1395:3: (otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRest.g:1396:4: otherlv_12= 'data' otherlv_13= '{' ( (lv_data_14_0= ruleData ) ) (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getReDeleteAccess().getDataKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_13, grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1404:4: ( (lv_data_14_0= ruleData ) )
                    // InternalRest.g:1405:5: (lv_data_14_0= ruleData )
                    {
                    // InternalRest.g:1405:5: (lv_data_14_0= ruleData )
                    // InternalRest.g:1406:6: lv_data_14_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_data_14_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_14_0,
                    							"rest.Rest.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1423:4: (otherlv_15= ',' ( (lv_data_16_0= ruleData ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalRest.g:1424:5: otherlv_15= ',' ( (lv_data_16_0= ruleData ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getReDeleteAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1428:5: ( (lv_data_16_0= ruleData ) )
                    	    // InternalRest.g:1429:6: (lv_data_16_0= ruleData )
                    	    {
                    	    // InternalRest.g:1429:6: (lv_data_16_0= ruleData )
                    	    // InternalRest.g:1430:7: lv_data_16_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_data_16_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_16_0,
                    	    								"rest.Rest.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_13); 

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
    // InternalRest.g:1461:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // InternalRest.g:1461:48: (iv_ruleSegment= ruleSegment EOF )
            // InternalRest.g:1462:2: iv_ruleSegment= ruleSegment EOF
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
    // InternalRest.g:1468:1: ruleSegment returns [EObject current=null] : ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1474:2: ( ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRest.g:1475:2: ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRest.g:1475:2: ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRest.g:1476:3: () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRest.g:1476:3: ()
            // InternalRest.g:1477:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSegmentAccess().getSegmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSegmentAccess().getSegmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRest.g:1491:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRest.g:1492:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getSegmentAccess().getValueKeyword_3_0());
                    			
                    // InternalRest.g:1496:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRest.g:1497:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRest.g:1497:5: (lv_value_4_0= ruleEString )
                    // InternalRest.g:1498:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSegmentAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
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
    // InternalRest.g:1524:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRest.g:1524:47: (iv_ruleEString= ruleEString EOF )
            // InternalRest.g:1525:2: iv_ruleEString= ruleEString EOF
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
    // InternalRest.g:1531:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRest.g:1537:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRest.g:1538:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRest.g:1538:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalRest.g:1539:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:1547:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleParameter"
    // InternalRest.g:1558:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRest.g:1558:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRest.g:1559:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRest.g:1565:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1571:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:1572:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:1572:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:1573:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:1573:3: ()
            // InternalRest.g:1574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalRest.g:1584:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:1585:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:1585:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:1586:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "entryRuleAttachments"
    // InternalRest.g:1607:1: entryRuleAttachments returns [EObject current=null] : iv_ruleAttachments= ruleAttachments EOF ;
    public final EObject entryRuleAttachments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachments = null;


        try {
            // InternalRest.g:1607:52: (iv_ruleAttachments= ruleAttachments EOF )
            // InternalRest.g:1608:2: iv_ruleAttachments= ruleAttachments EOF
            {
             newCompositeNode(grammarAccess.getAttachmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttachments=ruleAttachments();

            state._fsp--;

             current =iv_ruleAttachments; 
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
    // $ANTLR end "entryRuleAttachments"


    // $ANTLR start "ruleAttachments"
    // InternalRest.g:1614:1: ruleAttachments returns [EObject current=null] : ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttachments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1620:2: ( ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:1621:2: ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:1621:2: ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:1622:3: () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:1622:3: ()
            // InternalRest.g:1623:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttachmentsAccess().getAttachmentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAttachmentsAccess().getAttachmentsKeyword_1());
            		
            // InternalRest.g:1633:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:1634:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:1634:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:1635:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttachmentsAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttachmentsRule());
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
    // $ANTLR end "ruleAttachments"


    // $ANTLR start "entryRuleRandom"
    // InternalRest.g:1656:1: entryRuleRandom returns [EObject current=null] : iv_ruleRandom= ruleRandom EOF ;
    public final EObject entryRuleRandom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandom = null;


        try {
            // InternalRest.g:1656:47: (iv_ruleRandom= ruleRandom EOF )
            // InternalRest.g:1657:2: iv_ruleRandom= ruleRandom EOF
            {
             newCompositeNode(grammarAccess.getRandomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandom=ruleRandom();

            state._fsp--;

             current =iv_ruleRandom; 
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
    // $ANTLR end "entryRuleRandom"


    // $ANTLR start "ruleRandom"
    // InternalRest.g:1663:1: ruleRandom returns [EObject current=null] : ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRandom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1669:2: ( ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:1670:2: ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:1670:2: ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:1671:3: () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:1671:3: ()
            // InternalRest.g:1672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRandomAccess().getRandomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getRandomAccess().getRandomKeyword_1());
            		
            // InternalRest.g:1682:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:1683:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:1683:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:1684:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRandomAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRandomRule());
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
    // $ANTLR end "ruleRandom"


    // $ANTLR start "entryRuleOpCreate"
    // InternalRest.g:1705:1: entryRuleOpCreate returns [EObject current=null] : iv_ruleOpCreate= ruleOpCreate EOF ;
    public final EObject entryRuleOpCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpCreate = null;


        try {
            // InternalRest.g:1705:49: (iv_ruleOpCreate= ruleOpCreate EOF )
            // InternalRest.g:1706:2: iv_ruleOpCreate= ruleOpCreate EOF
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
    // InternalRest.g:1712:1: ruleOpCreate returns [EObject current=null] : (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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

        EObject lv_fieldset_10_0 = null;

        EObject lv_fieldset_12_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1718:2: ( (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalRest.g:1719:2: (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalRest.g:1719:2: (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalRest.g:1720:3: otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpCreateAccess().getOpCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1728:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRest.g:1729:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpCreateAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1733:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1734:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1734:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1735:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getOpCreateAccess().getFailedAnswerKeyword_3());
            		
            // InternalRest.g:1757:3: ( ( ruleEString ) )
            // InternalRest.g:1758:4: ( ruleEString )
            {
            // InternalRest.g:1758:4: ( ruleEString )
            // InternalRest.g:1759:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpCreateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getOpCreateAccess().getStructKeyword_5());
            		
            // InternalRest.g:1777:3: ( ( ruleEString ) )
            // InternalRest.g:1778:4: ( ruleEString )
            {
            // InternalRest.g:1778:4: ( ruleEString )
            // InternalRest.g:1779:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpCreateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpCreateAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1793:3: (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRest.g:1794:4: otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getOpCreateAccess().getFieldsetKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_9, grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1802:4: ( (lv_fieldset_10_0= ruleFieldSet ) )
                    // InternalRest.g:1803:5: (lv_fieldset_10_0= ruleFieldSet )
                    {
                    // InternalRest.g:1803:5: (lv_fieldset_10_0= ruleFieldSet )
                    // InternalRest.g:1804:6: lv_fieldset_10_0= ruleFieldSet
                    {

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getFieldsetFieldSetParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_fieldset_10_0=ruleFieldSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpCreateRule());
                    						}
                    						add(
                    							current,
                    							"fieldset",
                    							lv_fieldset_10_0,
                    							"rest.Rest.FieldSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1821:4: (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRest.g:1822:5: otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_34); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOpCreateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1826:5: ( (lv_fieldset_12_0= ruleFieldSet ) )
                    	    // InternalRest.g:1827:6: (lv_fieldset_12_0= ruleFieldSet )
                    	    {
                    	    // InternalRest.g:1827:6: (lv_fieldset_12_0= ruleFieldSet )
                    	    // InternalRest.g:1828:7: lv_fieldset_12_0= ruleFieldSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpCreateAccess().getFieldsetFieldSetParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_fieldset_12_0=ruleFieldSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOpCreateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fieldset",
                    	    								lv_fieldset_12_0,
                    	    								"rest.Rest.FieldSet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_13); 

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
    // InternalRest.g:1859:1: entryRuleOpRead returns [EObject current=null] : iv_ruleOpRead= ruleOpRead EOF ;
    public final EObject entryRuleOpRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpRead = null;


        try {
            // InternalRest.g:1859:47: (iv_ruleOpRead= ruleOpRead EOF )
            // InternalRest.g:1860:2: iv_ruleOpRead= ruleOpRead EOF
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
    // InternalRest.g:1866:1: ruleOpRead returns [EObject current=null] : (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'field' otherlv_9= '{' ( (lv_field_10_0= ruleField ) ) (otherlv_11= ',' ( (lv_field_12_0= ruleField ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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

        EObject lv_field_10_0 = null;

        EObject lv_field_12_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1872:2: ( (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'field' otherlv_9= '{' ( (lv_field_10_0= ruleField ) ) (otherlv_11= ',' ( (lv_field_12_0= ruleField ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalRest.g:1873:2: (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'field' otherlv_9= '{' ( (lv_field_10_0= ruleField ) ) (otherlv_11= ',' ( (lv_field_12_0= ruleField ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalRest.g:1873:2: (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'field' otherlv_9= '{' ( (lv_field_10_0= ruleField ) ) (otherlv_11= ',' ( (lv_field_12_0= ruleField ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalRest.g:1874:3: otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'field' otherlv_9= '{' ( (lv_field_10_0= ruleField ) ) (otherlv_11= ',' ( (lv_field_12_0= ruleField ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpReadAccess().getOpReadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getOpReadAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1882:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRest.g:1883:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpReadAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1887:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1888:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1888:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1889:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpReadAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getOpReadAccess().getFailedAnswerKeyword_3());
            		
            // InternalRest.g:1911:3: ( ( ruleEString ) )
            // InternalRest.g:1912:4: ( ruleEString )
            {
            // InternalRest.g:1912:4: ( ruleEString )
            // InternalRest.g:1913:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpReadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpReadAccess().getFailedAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getOpReadAccess().getStructKeyword_5());
            		
            // InternalRest.g:1931:3: ( ( ruleEString ) )
            // InternalRest.g:1932:4: ( ruleEString )
            {
            // InternalRest.g:1932:4: ( ruleEString )
            // InternalRest.g:1933:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpReadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpReadAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1947:3: (otherlv_8= 'field' otherlv_9= '{' ( (lv_field_10_0= ruleField ) ) (otherlv_11= ',' ( (lv_field_12_0= ruleField ) ) )* otherlv_13= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==46) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRest.g:1948:4: otherlv_8= 'field' otherlv_9= '{' ( (lv_field_10_0= ruleField ) ) (otherlv_11= ',' ( (lv_field_12_0= ruleField ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getOpReadAccess().getFieldKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getOpReadAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1956:4: ( (lv_field_10_0= ruleField ) )
                    // InternalRest.g:1957:5: (lv_field_10_0= ruleField )
                    {
                    // InternalRest.g:1957:5: (lv_field_10_0= ruleField )
                    // InternalRest.g:1958:6: lv_field_10_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getOpReadAccess().getFieldFieldParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_field_10_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpReadRule());
                    						}
                    						add(
                    							current,
                    							"field",
                    							lv_field_10_0,
                    							"rest.Rest.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1975:4: (otherlv_11= ',' ( (lv_field_12_0= ruleField ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRest.g:1976:5: otherlv_11= ',' ( (lv_field_12_0= ruleField ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOpReadAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1980:5: ( (lv_field_12_0= ruleField ) )
                    	    // InternalRest.g:1981:6: (lv_field_12_0= ruleField )
                    	    {
                    	    // InternalRest.g:1981:6: (lv_field_12_0= ruleField )
                    	    // InternalRest.g:1982:7: lv_field_12_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpReadAccess().getFieldFieldParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_field_12_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOpReadRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"field",
                    	    								lv_field_12_0,
                    	    								"rest.Rest.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getOpReadAccess().getRightCurlyBracketKeyword_7_4());
                    			

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
    // InternalRest.g:2013:1: entryRuleOpUpdate returns [EObject current=null] : iv_ruleOpUpdate= ruleOpUpdate EOF ;
    public final EObject entryRuleOpUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpUpdate = null;


        try {
            // InternalRest.g:2013:49: (iv_ruleOpUpdate= ruleOpUpdate EOF )
            // InternalRest.g:2014:2: iv_ruleOpUpdate= ruleOpUpdate EOF
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
    // InternalRest.g:2020:1: ruleOpUpdate returns [EObject current=null] : (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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

        EObject lv_fieldset_10_0 = null;

        EObject lv_fieldset_12_0 = null;



        	enterRule();

        try {
            // InternalRest.g:2026:2: ( (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalRest.g:2027:2: (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalRest.g:2027:2: (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalRest.g:2028:3: otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpUpdateAccess().getOpUpdateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:2036:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRest.g:2037:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpUpdateAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:2041:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:2042:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:2042:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:2043:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getOpUpdateAccess().getFailedAnswerKeyword_3());
            		
            // InternalRest.g:2065:3: ( ( ruleEString ) )
            // InternalRest.g:2066:4: ( ruleEString )
            {
            // InternalRest.g:2066:4: ( ruleEString )
            // InternalRest.g:2067:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpUpdateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getOpUpdateAccess().getStructKeyword_5());
            		
            // InternalRest.g:2085:3: ( ( ruleEString ) )
            // InternalRest.g:2086:4: ( ruleEString )
            {
            // InternalRest.g:2086:4: ( ruleEString )
            // InternalRest.g:2087:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpUpdateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpUpdateAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:2101:3: (otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRest.g:2102:4: otherlv_8= 'fieldset' otherlv_9= '{' ( (lv_fieldset_10_0= ruleFieldSet ) ) (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getOpUpdateAccess().getFieldsetKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_9, grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:2110:4: ( (lv_fieldset_10_0= ruleFieldSet ) )
                    // InternalRest.g:2111:5: (lv_fieldset_10_0= ruleFieldSet )
                    {
                    // InternalRest.g:2111:5: (lv_fieldset_10_0= ruleFieldSet )
                    // InternalRest.g:2112:6: lv_fieldset_10_0= ruleFieldSet
                    {

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_fieldset_10_0=ruleFieldSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpUpdateRule());
                    						}
                    						add(
                    							current,
                    							"fieldset",
                    							lv_fieldset_10_0,
                    							"rest.Rest.FieldSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:2129:4: (otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalRest.g:2130:5: otherlv_11= ',' ( (lv_fieldset_12_0= ruleFieldSet ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_34); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOpUpdateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:2134:5: ( (lv_fieldset_12_0= ruleFieldSet ) )
                    	    // InternalRest.g:2135:6: (lv_fieldset_12_0= ruleFieldSet )
                    	    {
                    	    // InternalRest.g:2135:6: (lv_fieldset_12_0= ruleFieldSet )
                    	    // InternalRest.g:2136:7: lv_fieldset_12_0= ruleFieldSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_fieldset_12_0=ruleFieldSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOpUpdateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fieldset",
                    	    								lv_fieldset_12_0,
                    	    								"rest.Rest.FieldSet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_13); 

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
    // InternalRest.g:2167:1: entryRuleOpDelete returns [EObject current=null] : iv_ruleOpDelete= ruleOpDelete EOF ;
    public final EObject entryRuleOpDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpDelete = null;


        try {
            // InternalRest.g:2167:49: (iv_ruleOpDelete= ruleOpDelete EOF )
            // InternalRest.g:2168:2: iv_ruleOpDelete= ruleOpDelete EOF
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
    // InternalRest.g:2174:1: ruleOpDelete returns [EObject current=null] : (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRest.g:2180:2: ( (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRest.g:2181:2: (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRest.g:2181:2: (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRest.g:2182:3: otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'failedAnswer' ( ( ruleEString ) ) otherlv_6= 'struct' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpDeleteAccess().getOpDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getOpDeleteAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:2190:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRest.g:2191:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpDeleteAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:2195:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:2196:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:2196:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:2197:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpDeleteAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getOpDeleteAccess().getFailedAnswerKeyword_3());
            		
            // InternalRest.g:2219:3: ( ( ruleEString ) )
            // InternalRest.g:2220:4: ( ruleEString )
            {
            // InternalRest.g:2220:4: ( ruleEString )
            // InternalRest.g:2221:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpDeleteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerCrossReference_4_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getOpDeleteAccess().getStructKeyword_5());
            		
            // InternalRest.g:2239:3: ( ( ruleEString ) )
            // InternalRest.g:2240:4: ( ruleEString )
            {
            // InternalRest.g:2240:4: ( ruleEString )
            // InternalRest.g:2241:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpDeleteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpDeleteAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:2263:1: entryRuleFieldSet returns [EObject current=null] : iv_ruleFieldSet= ruleFieldSet EOF ;
    public final EObject entryRuleFieldSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSet = null;


        try {
            // InternalRest.g:2263:49: (iv_ruleFieldSet= ruleFieldSet EOF )
            // InternalRest.g:2264:2: iv_ruleFieldSet= ruleFieldSet EOF
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
    // InternalRest.g:2270:1: ruleFieldSet returns [EObject current=null] : ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleFieldSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_expr_5_0 = null;



        	enterRule();

        try {
            // InternalRest.g:2276:2: ( ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalRest.g:2277:2: ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalRest.g:2277:2: ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalRest.g:2278:3: () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalRest.g:2278:3: ()
            // InternalRest.g:2279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldSetAccess().getFieldSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldSetAccess().getFieldSetKeyword_1());
            		
            // InternalRest.g:2289:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:2290:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:2290:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:2291:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldSetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:2312:3: (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRest.g:2313:4: otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldSetAccess().getExprKeyword_4_0());
                    			
                    // InternalRest.g:2317:4: ( (lv_expr_5_0= ruleEString ) )
                    // InternalRest.g:2318:5: (lv_expr_5_0= ruleEString )
                    {
                    // InternalRest.g:2318:5: (lv_expr_5_0= ruleEString )
                    // InternalRest.g:2319:6: lv_expr_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldSetAccess().getExprEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expr_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldSetRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_5_0,
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
    // InternalRest.g:2345:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalRest.g:2345:46: (iv_ruleField= ruleField EOF )
            // InternalRest.g:2346:2: iv_ruleField= ruleField EOF
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
    // InternalRest.g:2352:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:2358:2: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:2359:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:2359:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:2360:3: () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:2360:3: ()
            // InternalRest.g:2361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalRest.g:2371:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:2372:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:2372:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:2373:5: lv_name_2_0= ruleEString
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
    // InternalRest.g:2394:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRest.g:2394:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRest.g:2395:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRest.g:2401:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRest.g:2407:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRest.g:2408:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRest.g:2408:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRest.g:2409:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRest.g:2409:3: (kw= '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==52) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRest.g:2410:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_38); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000E04000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001A20000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});

}