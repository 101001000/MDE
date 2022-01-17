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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RestSystem'", "'{'", "'request'", "','", "'}'", "'Route'", "'segment'", "'ReGet'", "'route'", "'data'", "'ops'", "'RePost'", "'RePut'", "'ReDelete'", "'Segment'", "'value'", "'Parameter'", "'Attachments'", "'Random'", "'Answer'", "'status'", "'return'", "'Struct'", "'fields'", "'OpCreate'", "'id'", "'failedAnswer'", "'succAnswer'", "'struct'", "'fieldset'", "'OpRead'", "'OpUpdate'", "'OpDelete'", "'-'", "'FieldSet'", "'expr'"
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    // InternalRest.g:71:1: ruleRestSystem returns [EObject current=null] : ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRestSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_request_5_0 = null;

        EObject lv_request_7_0 = null;



        	enterRule();

        try {
            // InternalRest.g:77:2: ( ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRest.g:78:2: ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRest.g:78:2: ( () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRest.g:79:3: () otherlv_1= 'RestSystem' otherlv_2= '{' (otherlv_3= 'request' otherlv_4= '{' ( (lv_request_5_0= ruleRequest ) ) (otherlv_6= ',' ( (lv_request_7_0= ruleRequest ) ) )* otherlv_8= '}' )? otherlv_9= '}'
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

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRest.g:160:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalRest.g:160:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalRest.g:161:2: iv_ruleRequest= ruleRequest EOF
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
    // InternalRest.g:167:1: ruleRequest returns [EObject current=null] : (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        EObject this_ReGet_0 = null;

        EObject this_RePost_1 = null;

        EObject this_RePut_2 = null;

        EObject this_ReDelete_3 = null;



        	enterRule();

        try {
            // InternalRest.g:173:2: ( (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete ) )
            // InternalRest.g:174:2: (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete )
            {
            // InternalRest.g:174:2: (this_ReGet_0= ruleReGet | this_RePost_1= ruleRePost | this_RePut_2= ruleRePut | this_ReDelete_3= ruleReDelete )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRest.g:175:3: this_ReGet_0= ruleReGet
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
                    // InternalRest.g:184:3: this_RePost_1= ruleRePost
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
                    // InternalRest.g:193:3: this_RePut_2= ruleRePut
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
                    // InternalRest.g:202:3: this_ReDelete_3= ruleReDelete
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


    // $ANTLR start "entryRuleData"
    // InternalRest.g:214:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalRest.g:214:45: (iv_ruleData= ruleData EOF )
            // InternalRest.g:215:2: iv_ruleData= ruleData EOF
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
    // InternalRest.g:221:1: ruleData returns [EObject current=null] : (this_Parameter_0= ruleParameter | this_Attachments_1= ruleAttachments | this_Random_2= ruleRandom ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_0 = null;

        EObject this_Attachments_1 = null;

        EObject this_Random_2 = null;



        	enterRule();

        try {
            // InternalRest.g:227:2: ( (this_Parameter_0= ruleParameter | this_Attachments_1= ruleAttachments | this_Random_2= ruleRandom ) )
            // InternalRest.g:228:2: (this_Parameter_0= ruleParameter | this_Attachments_1= ruleAttachments | this_Random_2= ruleRandom )
            {
            // InternalRest.g:228:2: (this_Parameter_0= ruleParameter | this_Attachments_1= ruleAttachments | this_Random_2= ruleRandom )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRest.g:229:3: this_Parameter_0= ruleParameter
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
                    // InternalRest.g:238:3: this_Attachments_1= ruleAttachments
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
                    // InternalRest.g:247:3: this_Random_2= ruleRandom
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


    // $ANTLR start "entryRuleOperation"
    // InternalRest.g:259:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalRest.g:259:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalRest.g:260:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalRest.g:266:1: ruleOperation returns [EObject current=null] : (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_OpCreate_0 = null;

        EObject this_OpRead_1 = null;

        EObject this_OpUpdate_2 = null;

        EObject this_OpDelete_3 = null;



        	enterRule();

        try {
            // InternalRest.g:272:2: ( (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete ) )
            // InternalRest.g:273:2: (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete )
            {
            // InternalRest.g:273:2: (this_OpCreate_0= ruleOpCreate | this_OpRead_1= ruleOpRead | this_OpUpdate_2= ruleOpUpdate | this_OpDelete_3= ruleOpDelete )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRest.g:274:3: this_OpCreate_0= ruleOpCreate
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
                    // InternalRest.g:283:3: this_OpRead_1= ruleOpRead
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
                    // InternalRest.g:292:3: this_OpUpdate_2= ruleOpUpdate
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
                    // InternalRest.g:301:3: this_OpDelete_3= ruleOpDelete
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


    // $ANTLR start "entryRuleRoute"
    // InternalRest.g:313:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalRest.g:313:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalRest.g:314:2: iv_ruleRoute= ruleRoute EOF
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
    // InternalRest.g:320:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalRest.g:326:2: ( (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRest.g:327:2: (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRest.g:327:2: (otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRest.g:328:3: otherlv_0= 'Route' otherlv_1= '{' otherlv_2= 'segment' otherlv_3= '{' ( (lv_segment_4_0= ruleSegment ) ) (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteAccess().getSegmentKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:344:3: ( (lv_segment_4_0= ruleSegment ) )
            // InternalRest.g:345:4: (lv_segment_4_0= ruleSegment )
            {
            // InternalRest.g:345:4: (lv_segment_4_0= ruleSegment )
            // InternalRest.g:346:5: lv_segment_4_0= ruleSegment
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

            // InternalRest.g:363:3: (otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRest.g:364:4: otherlv_5= ',' ( (lv_segment_6_0= ruleSegment ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRouteAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRest.g:368:4: ( (lv_segment_6_0= ruleSegment ) )
            	    // InternalRest.g:369:5: (lv_segment_6_0= ruleSegment )
            	    {
            	    // InternalRest.g:369:5: (lv_segment_6_0= ruleSegment )
            	    // InternalRest.g:370:6: lv_segment_6_0= ruleSegment
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
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

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
    // InternalRest.g:400:1: entryRuleReGet returns [EObject current=null] : iv_ruleReGet= ruleReGet EOF ;
    public final EObject entryRuleReGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReGet = null;


        try {
            // InternalRest.g:400:46: (iv_ruleReGet= ruleReGet EOF )
            // InternalRest.g:401:2: iv_ruleReGet= ruleReGet EOF
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
    // InternalRest.g:407:1: ruleReGet returns [EObject current=null] : (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleReGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_route_3_0 = null;

        EObject lv_data_6_0 = null;

        EObject lv_data_8_0 = null;

        EObject lv_ops_12_0 = null;

        EObject lv_ops_14_0 = null;



        	enterRule();

        try {
            // InternalRest.g:413:2: ( (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRest.g:414:2: (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRest.g:414:2: (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRest.g:415:3: otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReGetAccess().getReGetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getReGetAccess().getRouteKeyword_2());
            		
            // InternalRest.g:427:3: ( (lv_route_3_0= ruleRoute ) )
            // InternalRest.g:428:4: (lv_route_3_0= ruleRoute )
            {
            // InternalRest.g:428:4: (lv_route_3_0= ruleRoute )
            // InternalRest.g:429:5: lv_route_3_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getReGetAccess().getRouteRouteParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_route_3_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReGetRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_3_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:446:3: (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRest.g:447:4: otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getReGetAccess().getDataKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRest.g:455:4: ( (lv_data_6_0= ruleData ) )
                    // InternalRest.g:456:5: (lv_data_6_0= ruleData )
                    {
                    // InternalRest.g:456:5: (lv_data_6_0= ruleData )
                    // InternalRest.g:457:6: lv_data_6_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getReGetAccess().getDataDataParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_data_6_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReGetRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_6_0,
                    							"rest.Rest.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:474:4: (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRest.g:475:5: otherlv_7= ',' ( (lv_data_8_0= ruleData ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getReGetAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:479:5: ( (lv_data_8_0= ruleData ) )
                    	    // InternalRest.g:480:6: (lv_data_8_0= ruleData )
                    	    {
                    	    // InternalRest.g:480:6: (lv_data_8_0= ruleData )
                    	    // InternalRest.g:481:7: lv_data_8_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getReGetAccess().getDataDataParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_data_8_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReGetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_8_0,
                    	    								"rest.Rest.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:504:3: (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRest.g:505:4: otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getReGetAccess().getOpsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRest.g:513:4: ( (lv_ops_12_0= ruleOperation ) )
                    // InternalRest.g:514:5: (lv_ops_12_0= ruleOperation )
                    {
                    // InternalRest.g:514:5: (lv_ops_12_0= ruleOperation )
                    // InternalRest.g:515:6: lv_ops_12_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getReGetAccess().getOpsOperationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_ops_12_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReGetRule());
                    						}
                    						add(
                    							current,
                    							"ops",
                    							lv_ops_12_0,
                    							"rest.Rest.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:532:4: (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRest.g:533:5: otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getReGetAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:537:5: ( (lv_ops_14_0= ruleOperation ) )
                    	    // InternalRest.g:538:6: (lv_ops_14_0= ruleOperation )
                    	    {
                    	    // InternalRest.g:538:6: (lv_ops_14_0= ruleOperation )
                    	    // InternalRest.g:539:7: lv_ops_14_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getReGetAccess().getOpsOperationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_ops_14_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReGetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ops",
                    	    								lv_ops_14_0,
                    	    								"rest.Rest.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRest.g:570:1: entryRuleRePost returns [EObject current=null] : iv_ruleRePost= ruleRePost EOF ;
    public final EObject entryRuleRePost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRePost = null;


        try {
            // InternalRest.g:570:47: (iv_ruleRePost= ruleRePost EOF )
            // InternalRest.g:571:2: iv_ruleRePost= ruleRePost EOF
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
    // InternalRest.g:577:1: ruleRePost returns [EObject current=null] : (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleRePost() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_route_3_0 = null;

        EObject lv_data_6_0 = null;

        EObject lv_data_8_0 = null;

        EObject lv_ops_12_0 = null;

        EObject lv_ops_14_0 = null;



        	enterRule();

        try {
            // InternalRest.g:583:2: ( (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRest.g:584:2: (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRest.g:584:2: (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRest.g:585:3: otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRePostAccess().getRePostKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRePostAccess().getRouteKeyword_2());
            		
            // InternalRest.g:597:3: ( (lv_route_3_0= ruleRoute ) )
            // InternalRest.g:598:4: (lv_route_3_0= ruleRoute )
            {
            // InternalRest.g:598:4: (lv_route_3_0= ruleRoute )
            // InternalRest.g:599:5: lv_route_3_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getRePostAccess().getRouteRouteParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_route_3_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRePostRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_3_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:616:3: (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRest.g:617:4: otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRePostAccess().getDataKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRest.g:625:4: ( (lv_data_6_0= ruleData ) )
                    // InternalRest.g:626:5: (lv_data_6_0= ruleData )
                    {
                    // InternalRest.g:626:5: (lv_data_6_0= ruleData )
                    // InternalRest.g:627:6: lv_data_6_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getRePostAccess().getDataDataParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_data_6_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePostRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_6_0,
                    							"rest.Rest.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:644:4: (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRest.g:645:5: otherlv_7= ',' ( (lv_data_8_0= ruleData ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRePostAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:649:5: ( (lv_data_8_0= ruleData ) )
                    	    // InternalRest.g:650:6: (lv_data_8_0= ruleData )
                    	    {
                    	    // InternalRest.g:650:6: (lv_data_8_0= ruleData )
                    	    // InternalRest.g:651:7: lv_data_8_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePostAccess().getDataDataParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_data_8_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePostRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_8_0,
                    	    								"rest.Rest.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:674:3: (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRest.g:675:4: otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRePostAccess().getOpsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRest.g:683:4: ( (lv_ops_12_0= ruleOperation ) )
                    // InternalRest.g:684:5: (lv_ops_12_0= ruleOperation )
                    {
                    // InternalRest.g:684:5: (lv_ops_12_0= ruleOperation )
                    // InternalRest.g:685:6: lv_ops_12_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getRePostAccess().getOpsOperationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_ops_12_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePostRule());
                    						}
                    						add(
                    							current,
                    							"ops",
                    							lv_ops_12_0,
                    							"rest.Rest.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:702:4: (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRest.g:703:5: otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRePostAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:707:5: ( (lv_ops_14_0= ruleOperation ) )
                    	    // InternalRest.g:708:6: (lv_ops_14_0= ruleOperation )
                    	    {
                    	    // InternalRest.g:708:6: (lv_ops_14_0= ruleOperation )
                    	    // InternalRest.g:709:7: lv_ops_14_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePostAccess().getOpsOperationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_ops_14_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePostRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ops",
                    	    								lv_ops_14_0,
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

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRest.g:740:1: entryRuleRePut returns [EObject current=null] : iv_ruleRePut= ruleRePut EOF ;
    public final EObject entryRuleRePut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRePut = null;


        try {
            // InternalRest.g:740:46: (iv_ruleRePut= ruleRePut EOF )
            // InternalRest.g:741:2: iv_ruleRePut= ruleRePut EOF
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
    // InternalRest.g:747:1: ruleRePut returns [EObject current=null] : (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleRePut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_route_3_0 = null;

        EObject lv_data_6_0 = null;

        EObject lv_data_8_0 = null;

        EObject lv_ops_12_0 = null;

        EObject lv_ops_14_0 = null;



        	enterRule();

        try {
            // InternalRest.g:753:2: ( (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRest.g:754:2: (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRest.g:754:2: (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRest.g:755:3: otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRePutAccess().getRePutKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRePutAccess().getRouteKeyword_2());
            		
            // InternalRest.g:767:3: ( (lv_route_3_0= ruleRoute ) )
            // InternalRest.g:768:4: (lv_route_3_0= ruleRoute )
            {
            // InternalRest.g:768:4: (lv_route_3_0= ruleRoute )
            // InternalRest.g:769:5: lv_route_3_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getRePutAccess().getRouteRouteParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_route_3_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRePutRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_3_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:786:3: (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRest.g:787:4: otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRePutAccess().getDataKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRest.g:795:4: ( (lv_data_6_0= ruleData ) )
                    // InternalRest.g:796:5: (lv_data_6_0= ruleData )
                    {
                    // InternalRest.g:796:5: (lv_data_6_0= ruleData )
                    // InternalRest.g:797:6: lv_data_6_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getRePutAccess().getDataDataParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_data_6_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePutRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_6_0,
                    							"rest.Rest.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:814:4: (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRest.g:815:5: otherlv_7= ',' ( (lv_data_8_0= ruleData ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRePutAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:819:5: ( (lv_data_8_0= ruleData ) )
                    	    // InternalRest.g:820:6: (lv_data_8_0= ruleData )
                    	    {
                    	    // InternalRest.g:820:6: (lv_data_8_0= ruleData )
                    	    // InternalRest.g:821:7: lv_data_8_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePutAccess().getDataDataParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_data_8_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePutRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_8_0,
                    	    								"rest.Rest.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:844:3: (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRest.g:845:4: otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRePutAccess().getOpsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRest.g:853:4: ( (lv_ops_12_0= ruleOperation ) )
                    // InternalRest.g:854:5: (lv_ops_12_0= ruleOperation )
                    {
                    // InternalRest.g:854:5: (lv_ops_12_0= ruleOperation )
                    // InternalRest.g:855:6: lv_ops_12_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getRePutAccess().getOpsOperationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_ops_12_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRePutRule());
                    						}
                    						add(
                    							current,
                    							"ops",
                    							lv_ops_12_0,
                    							"rest.Rest.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:872:4: (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRest.g:873:5: otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRePutAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:877:5: ( (lv_ops_14_0= ruleOperation ) )
                    	    // InternalRest.g:878:6: (lv_ops_14_0= ruleOperation )
                    	    {
                    	    // InternalRest.g:878:6: (lv_ops_14_0= ruleOperation )
                    	    // InternalRest.g:879:7: lv_ops_14_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRePutAccess().getOpsOperationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_ops_14_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRePutRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ops",
                    	    								lv_ops_14_0,
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

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRest.g:910:1: entryRuleReDelete returns [EObject current=null] : iv_ruleReDelete= ruleReDelete EOF ;
    public final EObject entryRuleReDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReDelete = null;


        try {
            // InternalRest.g:910:49: (iv_ruleReDelete= ruleReDelete EOF )
            // InternalRest.g:911:2: iv_ruleReDelete= ruleReDelete EOF
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
    // InternalRest.g:917:1: ruleReDelete returns [EObject current=null] : (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleReDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_route_3_0 = null;

        EObject lv_data_6_0 = null;

        EObject lv_data_8_0 = null;

        EObject lv_ops_12_0 = null;

        EObject lv_ops_14_0 = null;



        	enterRule();

        try {
            // InternalRest.g:923:2: ( (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRest.g:924:2: (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRest.g:924:2: (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRest.g:925:3: otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( (lv_route_3_0= ruleRoute ) ) (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )? (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReDeleteAccess().getReDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getReDeleteAccess().getRouteKeyword_2());
            		
            // InternalRest.g:937:3: ( (lv_route_3_0= ruleRoute ) )
            // InternalRest.g:938:4: (lv_route_3_0= ruleRoute )
            {
            // InternalRest.g:938:4: (lv_route_3_0= ruleRoute )
            // InternalRest.g:939:5: lv_route_3_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getReDeleteAccess().getRouteRouteParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_route_3_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReDeleteRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_3_0,
            						"rest.Rest.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:956:3: (otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRest.g:957:4: otherlv_4= 'data' otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getReDeleteAccess().getDataKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRest.g:965:4: ( (lv_data_6_0= ruleData ) )
                    // InternalRest.g:966:5: (lv_data_6_0= ruleData )
                    {
                    // InternalRest.g:966:5: (lv_data_6_0= ruleData )
                    // InternalRest.g:967:6: lv_data_6_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_data_6_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_6_0,
                    							"rest.Rest.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:984:4: (otherlv_7= ',' ( (lv_data_8_0= ruleData ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRest.g:985:5: otherlv_7= ',' ( (lv_data_8_0= ruleData ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getReDeleteAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:989:5: ( (lv_data_8_0= ruleData ) )
                    	    // InternalRest.g:990:6: (lv_data_8_0= ruleData )
                    	    {
                    	    // InternalRest.g:990:6: (lv_data_8_0= ruleData )
                    	    // InternalRest.g:991:7: lv_data_8_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_data_8_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_8_0,
                    	    								"rest.Rest.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:1014:3: (otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRest.g:1015:4: otherlv_10= 'ops' otherlv_11= '{' ( (lv_ops_12_0= ruleOperation ) ) (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getReDeleteAccess().getOpsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRest.g:1023:4: ( (lv_ops_12_0= ruleOperation ) )
                    // InternalRest.g:1024:5: (lv_ops_12_0= ruleOperation )
                    {
                    // InternalRest.g:1024:5: (lv_ops_12_0= ruleOperation )
                    // InternalRest.g:1025:6: lv_ops_12_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getReDeleteAccess().getOpsOperationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_ops_12_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    						}
                    						add(
                    							current,
                    							"ops",
                    							lv_ops_12_0,
                    							"rest.Rest.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1042:4: (otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRest.g:1043:5: otherlv_13= ',' ( (lv_ops_14_0= ruleOperation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getReDeleteAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:1047:5: ( (lv_ops_14_0= ruleOperation ) )
                    	    // InternalRest.g:1048:6: (lv_ops_14_0= ruleOperation )
                    	    {
                    	    // InternalRest.g:1048:6: (lv_ops_14_0= ruleOperation )
                    	    // InternalRest.g:1049:7: lv_ops_14_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getReDeleteAccess().getOpsOperationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_ops_14_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReDeleteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ops",
                    	    								lv_ops_14_0,
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

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRest.g:1080:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // InternalRest.g:1080:48: (iv_ruleSegment= ruleSegment EOF )
            // InternalRest.g:1081:2: iv_ruleSegment= ruleSegment EOF
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
    // InternalRest.g:1087:1: ruleSegment returns [EObject current=null] : ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1093:2: ( ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRest.g:1094:2: ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRest.g:1094:2: ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRest.g:1095:3: () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRest.g:1095:3: ()
            // InternalRest.g:1096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSegmentAccess().getSegmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSegmentAccess().getSegmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRest.g:1110:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRest.g:1111:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getSegmentAccess().getValueKeyword_3_0());
                    			
                    // InternalRest.g:1115:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRest.g:1116:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRest.g:1116:5: (lv_value_4_0= ruleEString )
                    // InternalRest.g:1117:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSegmentAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
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
    // InternalRest.g:1143:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRest.g:1143:47: (iv_ruleEString= ruleEString EOF )
            // InternalRest.g:1144:2: iv_ruleEString= ruleEString EOF
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
    // InternalRest.g:1150:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRest.g:1156:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRest.g:1157:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRest.g:1157:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRest.g:1158:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:1166:3: this_ID_1= RULE_ID
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
    // InternalRest.g:1177:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRest.g:1177:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRest.g:1178:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRest.g:1184:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1190:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:1191:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:1191:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:1192:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:1192:3: ()
            // InternalRest.g:1193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalRest.g:1203:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:1204:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:1204:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:1205:5: lv_name_2_0= ruleEString
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
    // InternalRest.g:1226:1: entryRuleAttachments returns [EObject current=null] : iv_ruleAttachments= ruleAttachments EOF ;
    public final EObject entryRuleAttachments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachments = null;


        try {
            // InternalRest.g:1226:52: (iv_ruleAttachments= ruleAttachments EOF )
            // InternalRest.g:1227:2: iv_ruleAttachments= ruleAttachments EOF
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
    // InternalRest.g:1233:1: ruleAttachments returns [EObject current=null] : ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttachments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1239:2: ( ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:1240:2: ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:1240:2: ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:1241:3: () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:1241:3: ()
            // InternalRest.g:1242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttachmentsAccess().getAttachmentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAttachmentsAccess().getAttachmentsKeyword_1());
            		
            // InternalRest.g:1252:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:1253:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:1253:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:1254:5: lv_name_2_0= ruleEString
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
    // InternalRest.g:1275:1: entryRuleRandom returns [EObject current=null] : iv_ruleRandom= ruleRandom EOF ;
    public final EObject entryRuleRandom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandom = null;


        try {
            // InternalRest.g:1275:47: (iv_ruleRandom= ruleRandom EOF )
            // InternalRest.g:1276:2: iv_ruleRandom= ruleRandom EOF
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
    // InternalRest.g:1282:1: ruleRandom returns [EObject current=null] : ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRandom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1288:2: ( ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:1289:2: ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:1289:2: ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:1290:3: () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:1290:3: ()
            // InternalRest.g:1291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRandomAccess().getRandomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRandomAccess().getRandomKeyword_1());
            		
            // InternalRest.g:1301:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:1302:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:1302:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:1303:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "entryRuleAnswer"
    // InternalRest.g:1324:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // InternalRest.g:1324:47: (iv_ruleAnswer= ruleAnswer EOF )
            // InternalRest.g:1325:2: iv_ruleAnswer= ruleAnswer EOF
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
    // InternalRest.g:1331:1: ruleAnswer returns [EObject current=null] : ( () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalRest.g:1337:2: ( ( () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRest.g:1338:2: ( () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRest.g:1338:2: ( () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalRest.g:1339:3: () otherlv_1= 'Answer' otherlv_2= '{' (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )? (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalRest.g:1339:3: ()
            // InternalRest.g:1340:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnswerAccess().getAnswerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getAnswerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRest.g:1354:3: (otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRest.g:1355:4: otherlv_3= 'status' ( (lv_status_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getStatusKeyword_3_0());
                    			
                    // InternalRest.g:1359:4: ( (lv_status_4_0= ruleEInt ) )
                    // InternalRest.g:1360:5: (lv_status_4_0= ruleEInt )
                    {
                    // InternalRest.g:1360:5: (lv_status_4_0= ruleEInt )
                    // InternalRest.g:1361:6: lv_status_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAnswerAccess().getStatusEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            // InternalRest.g:1379:3: (otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRest.g:1380:4: otherlv_5= 'return' ( (lv_return_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getAnswerAccess().getReturnKeyword_4_0());
                    			
                    // InternalRest.g:1384:4: ( (lv_return_6_0= ruleEString ) )
                    // InternalRest.g:1385:5: (lv_return_6_0= ruleEString )
                    {
                    // InternalRest.g:1385:5: (lv_return_6_0= ruleEString )
                    // InternalRest.g:1386:6: lv_return_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnswerAccess().getReturnEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
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


    // $ANTLR start "entryRuleStruct"
    // InternalRest.g:1412:1: entryRuleStruct returns [EObject current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final EObject entryRuleStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct = null;


        try {
            // InternalRest.g:1412:47: (iv_ruleStruct= ruleStruct EOF )
            // InternalRest.g:1413:2: iv_ruleStruct= ruleStruct EOF
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
    // InternalRest.g:1419:1: ruleStruct returns [EObject current=null] : ( () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1425:2: ( ( () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRest.g:1426:2: ( () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRest.g:1426:2: ( () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRest.g:1427:3: () otherlv_1= 'Struct' otherlv_2= '{' (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRest.g:1427:3: ()
            // InternalRest.g:1428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStructAccess().getStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStructAccess().getStructKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRest.g:1442:3: (otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRest.g:1443:4: otherlv_3= 'fields' ( (lv_fields_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getStructAccess().getFieldsKeyword_3_0());
                    			
                    // InternalRest.g:1447:4: ( (lv_fields_4_0= ruleEString ) )
                    // InternalRest.g:1448:5: (lv_fields_4_0= ruleEString )
                    {
                    // InternalRest.g:1448:5: (lv_fields_4_0= ruleEString )
                    // InternalRest.g:1449:6: lv_fields_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStructAccess().getFieldsEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
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


    // $ANTLR start "entryRuleOpCreate"
    // InternalRest.g:1475:1: entryRuleOpCreate returns [EObject current=null] : iv_ruleOpCreate= ruleOpCreate EOF ;
    public final EObject entryRuleOpCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpCreate = null;


        try {
            // InternalRest.g:1475:49: (iv_ruleOpCreate= ruleOpCreate EOF )
            // InternalRest.g:1476:2: iv_ruleOpCreate= ruleOpCreate EOF
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
    // InternalRest.g:1482:1: ruleOpCreate returns [EObject current=null] : (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleOpCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_failedAnswer_5_0 = null;

        EObject lv_succAnswer_7_0 = null;

        EObject lv_struct_9_0 = null;

        EObject lv_fieldset_12_0 = null;

        EObject lv_fieldset_14_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1488:2: ( (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRest.g:1489:2: (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRest.g:1489:2: (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRest.g:1490:3: otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpCreateAccess().getOpCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1498:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRest.g:1499:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpCreateAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1503:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1504:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1504:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1505:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalRest.g:1523:3: (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRest.g:1524:4: otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpCreateAccess().getFailedAnswerKeyword_3_0());
                    			
                    // InternalRest.g:1528:4: ( (lv_failedAnswer_5_0= ruleAnswer ) )
                    // InternalRest.g:1529:5: (lv_failedAnswer_5_0= ruleAnswer )
                    {
                    // InternalRest.g:1529:5: (lv_failedAnswer_5_0= ruleAnswer )
                    // InternalRest.g:1530:6: lv_failedAnswer_5_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_failedAnswer_5_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpCreateRule());
                    						}
                    						set(
                    							current,
                    							"failedAnswer",
                    							lv_failedAnswer_5_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:1548:3: (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRest.g:1549:4: otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getOpCreateAccess().getSuccAnswerKeyword_4_0());
                    			
                    // InternalRest.g:1553:4: ( (lv_succAnswer_7_0= ruleAnswer ) )
                    // InternalRest.g:1554:5: (lv_succAnswer_7_0= ruleAnswer )
                    {
                    // InternalRest.g:1554:5: (lv_succAnswer_7_0= ruleAnswer )
                    // InternalRest.g:1555:6: lv_succAnswer_7_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getSuccAnswerAnswerParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_succAnswer_7_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpCreateRule());
                    						}
                    						set(
                    							current,
                    							"succAnswer",
                    							lv_succAnswer_7_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getOpCreateAccess().getStructKeyword_5());
            		
            // InternalRest.g:1577:3: ( (lv_struct_9_0= ruleStruct ) )
            // InternalRest.g:1578:4: (lv_struct_9_0= ruleStruct )
            {
            // InternalRest.g:1578:4: (lv_struct_9_0= ruleStruct )
            // InternalRest.g:1579:5: lv_struct_9_0= ruleStruct
            {

            					newCompositeNode(grammarAccess.getOpCreateAccess().getStructStructParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_28);
            lv_struct_9_0=ruleStruct();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpCreateRule());
            					}
            					set(
            						current,
            						"struct",
            						lv_struct_9_0,
            						"rest.Rest.Struct");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1596:3: (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRest.g:1597:4: otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getOpCreateAccess().getFieldsetKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_11, grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1605:4: ( (lv_fieldset_12_0= ruleFieldSet ) )
                    // InternalRest.g:1606:5: (lv_fieldset_12_0= ruleFieldSet )
                    {
                    // InternalRest.g:1606:5: (lv_fieldset_12_0= ruleFieldSet )
                    // InternalRest.g:1607:6: lv_fieldset_12_0= ruleFieldSet
                    {

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getFieldsetFieldSetParserRuleCall_7_2_0());
                    					
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

                    // InternalRest.g:1624:4: (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalRest.g:1625:5: otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOpCreateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1629:5: ( (lv_fieldset_14_0= ruleFieldSet ) )
                    	    // InternalRest.g:1630:6: (lv_fieldset_14_0= ruleFieldSet )
                    	    {
                    	    // InternalRest.g:1630:6: (lv_fieldset_14_0= ruleFieldSet )
                    	    // InternalRest.g:1631:7: lv_fieldset_14_0= ruleFieldSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpCreateAccess().getFieldsetFieldSetParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_fieldset_14_0=ruleFieldSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOpCreateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fieldset",
                    	    								lv_fieldset_14_0,
                    	    								"rest.Rest.FieldSet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getOpCreateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getOpCreateAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalRest.g:1662:1: entryRuleOpRead returns [EObject current=null] : iv_ruleOpRead= ruleOpRead EOF ;
    public final EObject entryRuleOpRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpRead = null;


        try {
            // InternalRest.g:1662:47: (iv_ruleOpRead= ruleOpRead EOF )
            // InternalRest.g:1663:2: iv_ruleOpRead= ruleOpRead EOF
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
    // InternalRest.g:1669:1: ruleOpRead returns [EObject current=null] : (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( (lv_failedAnswer_7_0= ruleAnswer ) ) )? (otherlv_8= 'succAnswer' ( (lv_succAnswer_9_0= ruleAnswer ) ) )? otherlv_10= 'struct' ( (lv_struct_11_0= ruleStruct ) ) otherlv_12= '}' ) ;
    public final EObject ruleOpRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_fields_3_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_failedAnswer_7_0 = null;

        EObject lv_succAnswer_9_0 = null;

        EObject lv_struct_11_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1675:2: ( (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( (lv_failedAnswer_7_0= ruleAnswer ) ) )? (otherlv_8= 'succAnswer' ( (lv_succAnswer_9_0= ruleAnswer ) ) )? otherlv_10= 'struct' ( (lv_struct_11_0= ruleStruct ) ) otherlv_12= '}' ) )
            // InternalRest.g:1676:2: (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( (lv_failedAnswer_7_0= ruleAnswer ) ) )? (otherlv_8= 'succAnswer' ( (lv_succAnswer_9_0= ruleAnswer ) ) )? otherlv_10= 'struct' ( (lv_struct_11_0= ruleStruct ) ) otherlv_12= '}' )
            {
            // InternalRest.g:1676:2: (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( (lv_failedAnswer_7_0= ruleAnswer ) ) )? (otherlv_8= 'succAnswer' ( (lv_succAnswer_9_0= ruleAnswer ) ) )? otherlv_10= 'struct' ( (lv_struct_11_0= ruleStruct ) ) otherlv_12= '}' )
            // InternalRest.g:1677:3: otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( (lv_failedAnswer_7_0= ruleAnswer ) ) )? (otherlv_8= 'succAnswer' ( (lv_succAnswer_9_0= ruleAnswer ) ) )? otherlv_10= 'struct' ( (lv_struct_11_0= ruleStruct ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpReadAccess().getOpReadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getOpReadAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1685:3: (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRest.g:1686:4: otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpReadAccess().getFieldsKeyword_2_0());
                    			
                    // InternalRest.g:1690:4: ( (lv_fields_3_0= ruleEString ) )
                    // InternalRest.g:1691:5: (lv_fields_3_0= ruleEString )
                    {
                    // InternalRest.g:1691:5: (lv_fields_3_0= ruleEString )
                    // InternalRest.g:1692:6: lv_fields_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpReadAccess().getFieldsEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_fields_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpReadRule());
                    						}
                    						set(
                    							current,
                    							"fields",
                    							lv_fields_3_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:1710:3: (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRest.g:1711:4: otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpReadAccess().getIdKeyword_3_0());
                    			
                    // InternalRest.g:1715:4: ( (lv_id_5_0= ruleEString ) )
                    // InternalRest.g:1716:5: (lv_id_5_0= ruleEString )
                    {
                    // InternalRest.g:1716:5: (lv_id_5_0= ruleEString )
                    // InternalRest.g:1717:6: lv_id_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpReadAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_id_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpReadRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:1735:3: (otherlv_6= 'failedAnswer' ( (lv_failedAnswer_7_0= ruleAnswer ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRest.g:1736:4: otherlv_6= 'failedAnswer' ( (lv_failedAnswer_7_0= ruleAnswer ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getOpReadAccess().getFailedAnswerKeyword_4_0());
                    			
                    // InternalRest.g:1740:4: ( (lv_failedAnswer_7_0= ruleAnswer ) )
                    // InternalRest.g:1741:5: (lv_failedAnswer_7_0= ruleAnswer )
                    {
                    // InternalRest.g:1741:5: (lv_failedAnswer_7_0= ruleAnswer )
                    // InternalRest.g:1742:6: lv_failedAnswer_7_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getOpReadAccess().getFailedAnswerAnswerParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_failedAnswer_7_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpReadRule());
                    						}
                    						set(
                    							current,
                    							"failedAnswer",
                    							lv_failedAnswer_7_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:1760:3: (otherlv_8= 'succAnswer' ( (lv_succAnswer_9_0= ruleAnswer ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRest.g:1761:4: otherlv_8= 'succAnswer' ( (lv_succAnswer_9_0= ruleAnswer ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getOpReadAccess().getSuccAnswerKeyword_5_0());
                    			
                    // InternalRest.g:1765:4: ( (lv_succAnswer_9_0= ruleAnswer ) )
                    // InternalRest.g:1766:5: (lv_succAnswer_9_0= ruleAnswer )
                    {
                    // InternalRest.g:1766:5: (lv_succAnswer_9_0= ruleAnswer )
                    // InternalRest.g:1767:6: lv_succAnswer_9_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getOpReadAccess().getSuccAnswerAnswerParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_succAnswer_9_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpReadRule());
                    						}
                    						set(
                    							current,
                    							"succAnswer",
                    							lv_succAnswer_9_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getOpReadAccess().getStructKeyword_6());
            		
            // InternalRest.g:1789:3: ( (lv_struct_11_0= ruleStruct ) )
            // InternalRest.g:1790:4: (lv_struct_11_0= ruleStruct )
            {
            // InternalRest.g:1790:4: (lv_struct_11_0= ruleStruct )
            // InternalRest.g:1791:5: lv_struct_11_0= ruleStruct
            {

            					newCompositeNode(grammarAccess.getOpReadAccess().getStructStructParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_struct_11_0=ruleStruct();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpReadRule());
            					}
            					set(
            						current,
            						"struct",
            						lv_struct_11_0,
            						"rest.Rest.Struct");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getOpReadAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalRest.g:1816:1: entryRuleOpUpdate returns [EObject current=null] : iv_ruleOpUpdate= ruleOpUpdate EOF ;
    public final EObject entryRuleOpUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpUpdate = null;


        try {
            // InternalRest.g:1816:49: (iv_ruleOpUpdate= ruleOpUpdate EOF )
            // InternalRest.g:1817:2: iv_ruleOpUpdate= ruleOpUpdate EOF
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
    // InternalRest.g:1823:1: ruleOpUpdate returns [EObject current=null] : (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleOpUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_failedAnswer_5_0 = null;

        EObject lv_succAnswer_7_0 = null;

        EObject lv_struct_9_0 = null;

        EObject lv_fieldset_12_0 = null;

        EObject lv_fieldset_14_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1829:2: ( (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRest.g:1830:2: (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRest.g:1830:2: (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRest.g:1831:3: otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpUpdateAccess().getOpUpdateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1839:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRest.g:1840:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpUpdateAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1844:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1845:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1845:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1846:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalRest.g:1864:3: (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRest.g:1865:4: otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpUpdateAccess().getFailedAnswerKeyword_3_0());
                    			
                    // InternalRest.g:1869:4: ( (lv_failedAnswer_5_0= ruleAnswer ) )
                    // InternalRest.g:1870:5: (lv_failedAnswer_5_0= ruleAnswer )
                    {
                    // InternalRest.g:1870:5: (lv_failedAnswer_5_0= ruleAnswer )
                    // InternalRest.g:1871:6: lv_failedAnswer_5_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_failedAnswer_5_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpUpdateRule());
                    						}
                    						set(
                    							current,
                    							"failedAnswer",
                    							lv_failedAnswer_5_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:1889:3: (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRest.g:1890:4: otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getOpUpdateAccess().getSuccAnswerKeyword_4_0());
                    			
                    // InternalRest.g:1894:4: ( (lv_succAnswer_7_0= ruleAnswer ) )
                    // InternalRest.g:1895:5: (lv_succAnswer_7_0= ruleAnswer )
                    {
                    // InternalRest.g:1895:5: (lv_succAnswer_7_0= ruleAnswer )
                    // InternalRest.g:1896:6: lv_succAnswer_7_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getSuccAnswerAnswerParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_succAnswer_7_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpUpdateRule());
                    						}
                    						set(
                    							current,
                    							"succAnswer",
                    							lv_succAnswer_7_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getOpUpdateAccess().getStructKeyword_5());
            		
            // InternalRest.g:1918:3: ( (lv_struct_9_0= ruleStruct ) )
            // InternalRest.g:1919:4: (lv_struct_9_0= ruleStruct )
            {
            // InternalRest.g:1919:4: (lv_struct_9_0= ruleStruct )
            // InternalRest.g:1920:5: lv_struct_9_0= ruleStruct
            {

            					newCompositeNode(grammarAccess.getOpUpdateAccess().getStructStructParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_28);
            lv_struct_9_0=ruleStruct();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpUpdateRule());
            					}
            					set(
            						current,
            						"struct",
            						lv_struct_9_0,
            						"rest.Rest.Struct");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1937:3: (otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRest.g:1938:4: otherlv_10= 'fieldset' otherlv_11= '{' ( (lv_fieldset_12_0= ruleFieldSet ) ) (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getOpUpdateAccess().getFieldsetKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_11, grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRest.g:1946:4: ( (lv_fieldset_12_0= ruleFieldSet ) )
                    // InternalRest.g:1947:5: (lv_fieldset_12_0= ruleFieldSet )
                    {
                    // InternalRest.g:1947:5: (lv_fieldset_12_0= ruleFieldSet )
                    // InternalRest.g:1948:6: lv_fieldset_12_0= ruleFieldSet
                    {

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetParserRuleCall_7_2_0());
                    					
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

                    // InternalRest.g:1965:4: (otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalRest.g:1966:5: otherlv_13= ',' ( (lv_fieldset_14_0= ruleFieldSet ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOpUpdateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1970:5: ( (lv_fieldset_14_0= ruleFieldSet ) )
                    	    // InternalRest.g:1971:6: (lv_fieldset_14_0= ruleFieldSet )
                    	    {
                    	    // InternalRest.g:1971:6: (lv_fieldset_14_0= ruleFieldSet )
                    	    // InternalRest.g:1972:7: lv_fieldset_14_0= ruleFieldSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_fieldset_14_0=ruleFieldSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOpUpdateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fieldset",
                    	    								lv_fieldset_14_0,
                    	    								"rest.Rest.FieldSet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getOpUpdateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getOpUpdateAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalRest.g:2003:1: entryRuleOpDelete returns [EObject current=null] : iv_ruleOpDelete= ruleOpDelete EOF ;
    public final EObject entryRuleOpDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpDelete = null;


        try {
            // InternalRest.g:2003:49: (iv_ruleOpDelete= ruleOpDelete EOF )
            // InternalRest.g:2004:2: iv_ruleOpDelete= ruleOpDelete EOF
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
    // InternalRest.g:2010:1: ruleOpDelete returns [EObject current=null] : (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) otherlv_10= '}' ) ;
    public final EObject ruleOpDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_failedAnswer_5_0 = null;

        EObject lv_succAnswer_7_0 = null;

        EObject lv_struct_9_0 = null;



        	enterRule();

        try {
            // InternalRest.g:2016:2: ( (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) otherlv_10= '}' ) )
            // InternalRest.g:2017:2: (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) otherlv_10= '}' )
            {
            // InternalRest.g:2017:2: (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) otherlv_10= '}' )
            // InternalRest.g:2018:3: otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )? (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )? otherlv_8= 'struct' ( (lv_struct_9_0= ruleStruct ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpDeleteAccess().getOpDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getOpDeleteAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:2026:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRest.g:2027:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpDeleteAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:2031:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:2032:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:2032:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:2033:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpDeleteAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalRest.g:2051:3: (otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRest.g:2052:4: otherlv_4= 'failedAnswer' ( (lv_failedAnswer_5_0= ruleAnswer ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpDeleteAccess().getFailedAnswerKeyword_3_0());
                    			
                    // InternalRest.g:2056:4: ( (lv_failedAnswer_5_0= ruleAnswer ) )
                    // InternalRest.g:2057:5: (lv_failedAnswer_5_0= ruleAnswer )
                    {
                    // InternalRest.g:2057:5: (lv_failedAnswer_5_0= ruleAnswer )
                    // InternalRest.g:2058:6: lv_failedAnswer_5_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_failedAnswer_5_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpDeleteRule());
                    						}
                    						set(
                    							current,
                    							"failedAnswer",
                    							lv_failedAnswer_5_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:2076:3: (otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRest.g:2077:4: otherlv_6= 'succAnswer' ( (lv_succAnswer_7_0= ruleAnswer ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getOpDeleteAccess().getSuccAnswerKeyword_4_0());
                    			
                    // InternalRest.g:2081:4: ( (lv_succAnswer_7_0= ruleAnswer ) )
                    // InternalRest.g:2082:5: (lv_succAnswer_7_0= ruleAnswer )
                    {
                    // InternalRest.g:2082:5: (lv_succAnswer_7_0= ruleAnswer )
                    // InternalRest.g:2083:6: lv_succAnswer_7_0= ruleAnswer
                    {

                    						newCompositeNode(grammarAccess.getOpDeleteAccess().getSuccAnswerAnswerParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_succAnswer_7_0=ruleAnswer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpDeleteRule());
                    						}
                    						set(
                    							current,
                    							"succAnswer",
                    							lv_succAnswer_7_0,
                    							"rest.Rest.Answer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getOpDeleteAccess().getStructKeyword_5());
            		
            // InternalRest.g:2105:3: ( (lv_struct_9_0= ruleStruct ) )
            // InternalRest.g:2106:4: (lv_struct_9_0= ruleStruct )
            {
            // InternalRest.g:2106:4: (lv_struct_9_0= ruleStruct )
            // InternalRest.g:2107:5: lv_struct_9_0= ruleStruct
            {

            					newCompositeNode(grammarAccess.getOpDeleteAccess().getStructStructParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_struct_9_0=ruleStruct();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpDeleteRule());
            					}
            					set(
            						current,
            						"struct",
            						lv_struct_9_0,
            						"rest.Rest.Struct");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getOpDeleteAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleEInt"
    // InternalRest.g:2132:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRest.g:2132:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRest.g:2133:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRest.g:2139:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRest.g:2145:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRest.g:2146:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRest.g:2146:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRest.g:2147:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRest.g:2147:3: (kw= '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRest.g:2148:4: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_31); 

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


    // $ANTLR start "entryRuleFieldSet"
    // InternalRest.g:2165:1: entryRuleFieldSet returns [EObject current=null] : iv_ruleFieldSet= ruleFieldSet EOF ;
    public final EObject entryRuleFieldSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSet = null;


        try {
            // InternalRest.g:2165:49: (iv_ruleFieldSet= ruleFieldSet EOF )
            // InternalRest.g:2166:2: iv_ruleFieldSet= ruleFieldSet EOF
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
    // InternalRest.g:2172:1: ruleFieldSet returns [EObject current=null] : ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalRest.g:2178:2: ( ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalRest.g:2179:2: ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalRest.g:2179:2: ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalRest.g:2180:3: () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalRest.g:2180:3: ()
            // InternalRest.g:2181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldSetAccess().getFieldSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldSetAccess().getFieldSetKeyword_1());
            		
            // InternalRest.g:2191:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:2192:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:2192:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:2193:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldSetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:2214:3: (otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRest.g:2215:4: otherlv_4= 'expr' ( (lv_expr_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldSetAccess().getExprKeyword_4_0());
                    			
                    // InternalRest.g:2219:4: ( (lv_expr_5_0= ruleEString ) )
                    // InternalRest.g:2220:5: (lv_expr_5_0= ruleEString )
                    {
                    // InternalRest.g:2220:5: (lv_expr_5_0= ruleEString )
                    // InternalRest.g:2221:6: lv_expr_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldSetAccess().getExprEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001C40000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000E0800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000180008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000F400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000008000L});

}