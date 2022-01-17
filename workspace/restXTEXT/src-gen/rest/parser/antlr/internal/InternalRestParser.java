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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RestSystem'", "'{'", "'request'", "','", "'}'", "'ReGet'", "'route'", "'data'", "'('", "')'", "'ops'", "'RePost'", "'RePut'", "'ReDelete'", "'Parameter'", "'Attachments'", "'Random'", "'OpCreate'", "'id'", "'failedAnswer'", "'succAnswer'", "'struct'", "'fieldset'", "'OpRead'", "'fields'", "'OpUpdate'", "'OpDelete'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
            case 16:
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


    // $ANTLR start "entryRuleReGet"
    // InternalRest.g:214:1: entryRuleReGet returns [EObject current=null] : iv_ruleReGet= ruleReGet EOF ;
    public final EObject entryRuleReGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReGet = null;


        try {
            // InternalRest.g:214:46: (iv_ruleReGet= ruleReGet EOF )
            // InternalRest.g:215:2: iv_ruleReGet= ruleReGet EOF
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
    // InternalRest.g:221:1: ruleReGet returns [EObject current=null] : (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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


        	enterRule();

        try {
            // InternalRest.g:227:2: ( (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalRest.g:228:2: (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalRest.g:228:2: (otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalRest.g:229:3: otherlv_0= 'ReGet' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReGetAccess().getReGetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getReGetAccess().getRouteKeyword_2());
            		
            // InternalRest.g:241:3: ( ( ruleEString ) )
            // InternalRest.g:242:4: ( ruleEString )
            {
            // InternalRest.g:242:4: ( ruleEString )
            // InternalRest.g:243:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReGetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReGetAccess().getRouteRouteCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:257:3: (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRest.g:258:4: otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getReGetAccess().getDataKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getReGetAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRest.g:266:4: ( ( ruleEString ) )
                    // InternalRest.g:267:5: ( ruleEString )
                    {
                    // InternalRest.g:267:5: ( ruleEString )
                    // InternalRest.g:268:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReGetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReGetAccess().getDataDataCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:282:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRest.g:283:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getReGetAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:287:5: ( ( ruleEString ) )
                    	    // InternalRest.g:288:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:288:6: ( ruleEString )
                    	    // InternalRest.g:289:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReGetRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReGetAccess().getDataDataCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getReGetAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:309:3: (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRest.g:310:4: otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getReGetAccess().getOpsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getReGetAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRest.g:318:4: ( ( ruleEString ) )
                    // InternalRest.g:319:5: ( ruleEString )
                    {
                    // InternalRest.g:319:5: ( ruleEString )
                    // InternalRest.g:320:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReGetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReGetAccess().getOpsOperationCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:334:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRest.g:335:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getReGetAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:339:5: ( ( ruleEString ) )
                    	    // InternalRest.g:340:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:340:6: ( ruleEString )
                    	    // InternalRest.g:341:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReGetRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReGetAccess().getOpsOperationCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getReGetAccess().getRightParenthesisKeyword_5_4());
                    			

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
    // InternalRest.g:369:1: entryRuleRePost returns [EObject current=null] : iv_ruleRePost= ruleRePost EOF ;
    public final EObject entryRuleRePost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRePost = null;


        try {
            // InternalRest.g:369:47: (iv_ruleRePost= ruleRePost EOF )
            // InternalRest.g:370:2: iv_ruleRePost= ruleRePost EOF
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
    // InternalRest.g:376:1: ruleRePost returns [EObject current=null] : (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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


        	enterRule();

        try {
            // InternalRest.g:382:2: ( (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalRest.g:383:2: (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalRest.g:383:2: (otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalRest.g:384:3: otherlv_0= 'RePost' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRePostAccess().getRePostKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRePostAccess().getRouteKeyword_2());
            		
            // InternalRest.g:396:3: ( ( ruleEString ) )
            // InternalRest.g:397:4: ( ruleEString )
            {
            // InternalRest.g:397:4: ( ruleEString )
            // InternalRest.g:398:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRePostRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRePostAccess().getRouteRouteCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:412:3: (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRest.g:413:4: otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getRePostAccess().getDataKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getRePostAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRest.g:421:4: ( ( ruleEString ) )
                    // InternalRest.g:422:5: ( ruleEString )
                    {
                    // InternalRest.g:422:5: ( ruleEString )
                    // InternalRest.g:423:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRePostRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRePostAccess().getDataDataCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:437:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRest.g:438:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRePostAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:442:5: ( ( ruleEString ) )
                    	    // InternalRest.g:443:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:443:6: ( ruleEString )
                    	    // InternalRest.g:444:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRePostRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRePostAccess().getDataDataCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getRePostAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:464:3: (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRest.g:465:4: otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getRePostAccess().getOpsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getRePostAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRest.g:473:4: ( ( ruleEString ) )
                    // InternalRest.g:474:5: ( ruleEString )
                    {
                    // InternalRest.g:474:5: ( ruleEString )
                    // InternalRest.g:475:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRePostRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRePostAccess().getOpsOperationCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:489:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRest.g:490:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRePostAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:494:5: ( ( ruleEString ) )
                    	    // InternalRest.g:495:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:495:6: ( ruleEString )
                    	    // InternalRest.g:496:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRePostRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRePostAccess().getOpsOperationCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getRePostAccess().getRightParenthesisKeyword_5_4());
                    			

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
    // InternalRest.g:524:1: entryRuleRePut returns [EObject current=null] : iv_ruleRePut= ruleRePut EOF ;
    public final EObject entryRuleRePut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRePut = null;


        try {
            // InternalRest.g:524:46: (iv_ruleRePut= ruleRePut EOF )
            // InternalRest.g:525:2: iv_ruleRePut= ruleRePut EOF
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
    // InternalRest.g:531:1: ruleRePut returns [EObject current=null] : (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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


        	enterRule();

        try {
            // InternalRest.g:537:2: ( (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalRest.g:538:2: (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalRest.g:538:2: (otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalRest.g:539:3: otherlv_0= 'RePut' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRePutAccess().getRePutKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRePutAccess().getRouteKeyword_2());
            		
            // InternalRest.g:551:3: ( ( ruleEString ) )
            // InternalRest.g:552:4: ( ruleEString )
            {
            // InternalRest.g:552:4: ( ruleEString )
            // InternalRest.g:553:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRePutRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRePutAccess().getRouteRouteCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:567:3: (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRest.g:568:4: otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getRePutAccess().getDataKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getRePutAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRest.g:576:4: ( ( ruleEString ) )
                    // InternalRest.g:577:5: ( ruleEString )
                    {
                    // InternalRest.g:577:5: ( ruleEString )
                    // InternalRest.g:578:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRePutRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRePutAccess().getDataDataCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:592:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRest.g:593:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRePutAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:597:5: ( ( ruleEString ) )
                    	    // InternalRest.g:598:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:598:6: ( ruleEString )
                    	    // InternalRest.g:599:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRePutRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRePutAccess().getDataDataCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getRePutAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:619:3: (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRest.g:620:4: otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getRePutAccess().getOpsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getRePutAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRest.g:628:4: ( ( ruleEString ) )
                    // InternalRest.g:629:5: ( ruleEString )
                    {
                    // InternalRest.g:629:5: ( ruleEString )
                    // InternalRest.g:630:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRePutRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRePutAccess().getOpsOperationCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:644:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRest.g:645:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRePutAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:649:5: ( ( ruleEString ) )
                    	    // InternalRest.g:650:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:650:6: ( ruleEString )
                    	    // InternalRest.g:651:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRePutRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRePutAccess().getOpsOperationCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getRePutAccess().getRightParenthesisKeyword_5_4());
                    			

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
    // InternalRest.g:679:1: entryRuleReDelete returns [EObject current=null] : iv_ruleReDelete= ruleReDelete EOF ;
    public final EObject entryRuleReDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReDelete = null;


        try {
            // InternalRest.g:679:49: (iv_ruleReDelete= ruleReDelete EOF )
            // InternalRest.g:680:2: iv_ruleReDelete= ruleReDelete EOF
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
    // InternalRest.g:686:1: ruleReDelete returns [EObject current=null] : (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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


        	enterRule();

        try {
            // InternalRest.g:692:2: ( (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalRest.g:693:2: (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalRest.g:693:2: (otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalRest.g:694:3: otherlv_0= 'ReDelete' otherlv_1= '{' otherlv_2= 'route' ( ( ruleEString ) ) (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReDeleteAccess().getReDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getReDeleteAccess().getRouteKeyword_2());
            		
            // InternalRest.g:706:3: ( ( ruleEString ) )
            // InternalRest.g:707:4: ( ruleEString )
            {
            // InternalRest.g:707:4: ( ruleEString )
            // InternalRest.g:708:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReDeleteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReDeleteAccess().getRouteRouteCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:722:3: (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRest.g:723:4: otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getReDeleteAccess().getDataKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getReDeleteAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRest.g:731:4: ( ( ruleEString ) )
                    // InternalRest.g:732:5: ( ruleEString )
                    {
                    // InternalRest.g:732:5: ( ruleEString )
                    // InternalRest.g:733:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReDeleteRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReDeleteAccess().getDataDataCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:747:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRest.g:748:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getReDeleteAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRest.g:752:5: ( ( ruleEString ) )
                    	    // InternalRest.g:753:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:753:6: ( ruleEString )
                    	    // InternalRest.g:754:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReDeleteRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReDeleteAccess().getDataDataCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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

                    otherlv_9=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getReDeleteAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:774:3: (otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRest.g:775:4: otherlv_10= 'ops' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getReDeleteAccess().getOpsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getReDeleteAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRest.g:783:4: ( ( ruleEString ) )
                    // InternalRest.g:784:5: ( ruleEString )
                    {
                    // InternalRest.g:784:5: ( ruleEString )
                    // InternalRest.g:785:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReDeleteRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReDeleteAccess().getOpsOperationCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:799:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRest.g:800:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getReDeleteAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:804:5: ( ( ruleEString ) )
                    	    // InternalRest.g:805:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:805:6: ( ruleEString )
                    	    // InternalRest.g:806:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReDeleteRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReDeleteAccess().getOpsOperationCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getReDeleteAccess().getRightParenthesisKeyword_5_4());
                    			

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


    // $ANTLR start "entryRuleEString"
    // InternalRest.g:834:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRest.g:834:47: (iv_ruleEString= ruleEString EOF )
            // InternalRest.g:835:2: iv_ruleEString= ruleEString EOF
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
    // InternalRest.g:841:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRest.g:847:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRest.g:848:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRest.g:848:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalRest.g:849:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:857:3: this_ID_1= RULE_ID
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
    // InternalRest.g:868:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRest.g:868:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRest.g:869:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRest.g:875:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:881:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:882:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:882:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:883:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:883:3: ()
            // InternalRest.g:884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalRest.g:894:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:895:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:895:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:896:5: lv_name_2_0= ruleEString
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
    // InternalRest.g:917:1: entryRuleAttachments returns [EObject current=null] : iv_ruleAttachments= ruleAttachments EOF ;
    public final EObject entryRuleAttachments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachments = null;


        try {
            // InternalRest.g:917:52: (iv_ruleAttachments= ruleAttachments EOF )
            // InternalRest.g:918:2: iv_ruleAttachments= ruleAttachments EOF
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
    // InternalRest.g:924:1: ruleAttachments returns [EObject current=null] : ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttachments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:930:2: ( ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:931:2: ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:931:2: ( () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:932:3: () otherlv_1= 'Attachments' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:932:3: ()
            // InternalRest.g:933:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttachmentsAccess().getAttachmentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAttachmentsAccess().getAttachmentsKeyword_1());
            		
            // InternalRest.g:943:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:944:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:944:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:945:5: lv_name_2_0= ruleEString
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
    // InternalRest.g:966:1: entryRuleRandom returns [EObject current=null] : iv_ruleRandom= ruleRandom EOF ;
    public final EObject entryRuleRandom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandom = null;


        try {
            // InternalRest.g:966:47: (iv_ruleRandom= ruleRandom EOF )
            // InternalRest.g:967:2: iv_ruleRandom= ruleRandom EOF
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
    // InternalRest.g:973:1: ruleRandom returns [EObject current=null] : ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRandom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:979:2: ( ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRest.g:980:2: ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRest.g:980:2: ( () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRest.g:981:3: () otherlv_1= 'Random' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRest.g:981:3: ()
            // InternalRest.g:982:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRandomAccess().getRandomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRandomAccess().getRandomKeyword_1());
            		
            // InternalRest.g:992:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:993:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:993:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:994:5: lv_name_2_0= ruleEString
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
    // InternalRest.g:1015:1: entryRuleOpCreate returns [EObject current=null] : iv_ruleOpCreate= ruleOpCreate EOF ;
    public final EObject entryRuleOpCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpCreate = null;


        try {
            // InternalRest.g:1015:49: (iv_ruleOpCreate= ruleOpCreate EOF )
            // InternalRest.g:1016:2: iv_ruleOpCreate= ruleOpCreate EOF
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
    // InternalRest.g:1022:1: ruleOpCreate returns [EObject current=null] : (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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



        	enterRule();

        try {
            // InternalRest.g:1028:2: ( (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalRest.g:1029:2: (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalRest.g:1029:2: (otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalRest.g:1030:3: otherlv_0= 'OpCreate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpCreateAccess().getOpCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1038:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRest.g:1039:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpCreateAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1043:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1044:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1044:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1045:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            // InternalRest.g:1063:3: (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRest.g:1064:4: otherlv_4= 'failedAnswer' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpCreateAccess().getFailedAnswerKeyword_3_0());
                    			
                    // InternalRest.g:1068:4: ( ( ruleEString ) )
                    // InternalRest.g:1069:5: ( ruleEString )
                    {
                    // InternalRest.g:1069:5: ( ruleEString )
                    // InternalRest.g:1070:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpCreateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:1085:3: (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRest.g:1086:4: otherlv_6= 'succAnswer' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getOpCreateAccess().getSuccAnswerKeyword_4_0());
                    			
                    // InternalRest.g:1090:4: ( ( ruleEString ) )
                    // InternalRest.g:1091:5: ( ruleEString )
                    {
                    // InternalRest.g:1091:5: ( ruleEString )
                    // InternalRest.g:1092:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpCreateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getSuccAnswerAnswerCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getOpCreateAccess().getStructKeyword_5());
            		
            // InternalRest.g:1111:3: ( ( ruleEString ) )
            // InternalRest.g:1112:4: ( ruleEString )
            {
            // InternalRest.g:1112:4: ( ruleEString )
            // InternalRest.g:1113:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpCreateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpCreateAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1127:3: (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRest.g:1128:4: otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getOpCreateAccess().getFieldsetKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getOpCreateAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalRest.g:1136:4: ( ( ruleEString ) )
                    // InternalRest.g:1137:5: ( ruleEString )
                    {
                    // InternalRest.g:1137:5: ( ruleEString )
                    // InternalRest.g:1138:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpCreateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpCreateAccess().getFieldsetFieldSetCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1152:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRest.g:1153:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOpCreateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1157:5: ( ( ruleEString ) )
                    	    // InternalRest.g:1158:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:1158:6: ( ruleEString )
                    	    // InternalRest.g:1159:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOpCreateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOpCreateAccess().getFieldsetFieldSetCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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

                    otherlv_15=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getOpCreateAccess().getRightParenthesisKeyword_7_4());
                    			

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
    // InternalRest.g:1187:1: entryRuleOpRead returns [EObject current=null] : iv_ruleOpRead= ruleOpRead EOF ;
    public final EObject entryRuleOpRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpRead = null;


        try {
            // InternalRest.g:1187:47: (iv_ruleOpRead= ruleOpRead EOF )
            // InternalRest.g:1188:2: iv_ruleOpRead= ruleOpRead EOF
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
    // InternalRest.g:1194:1: ruleOpRead returns [EObject current=null] : (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_8= 'succAnswer' ( ( ruleEString ) ) )? otherlv_10= 'struct' ( ( ruleEString ) ) otherlv_12= '}' ) ;
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



        	enterRule();

        try {
            // InternalRest.g:1200:2: ( (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_8= 'succAnswer' ( ( ruleEString ) ) )? otherlv_10= 'struct' ( ( ruleEString ) ) otherlv_12= '}' ) )
            // InternalRest.g:1201:2: (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_8= 'succAnswer' ( ( ruleEString ) ) )? otherlv_10= 'struct' ( ( ruleEString ) ) otherlv_12= '}' )
            {
            // InternalRest.g:1201:2: (otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_8= 'succAnswer' ( ( ruleEString ) ) )? otherlv_10= 'struct' ( ( ruleEString ) ) otherlv_12= '}' )
            // InternalRest.g:1202:3: otherlv_0= 'OpRead' otherlv_1= '{' (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_8= 'succAnswer' ( ( ruleEString ) ) )? otherlv_10= 'struct' ( ( ruleEString ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpReadAccess().getOpReadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getOpReadAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1210:3: (otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRest.g:1211:4: otherlv_2= 'fields' ( (lv_fields_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpReadAccess().getFieldsKeyword_2_0());
                    			
                    // InternalRest.g:1215:4: ( (lv_fields_3_0= ruleEString ) )
                    // InternalRest.g:1216:5: (lv_fields_3_0= ruleEString )
                    {
                    // InternalRest.g:1216:5: (lv_fields_3_0= ruleEString )
                    // InternalRest.g:1217:6: lv_fields_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpReadAccess().getFieldsEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            // InternalRest.g:1235:3: (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRest.g:1236:4: otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpReadAccess().getIdKeyword_3_0());
                    			
                    // InternalRest.g:1240:4: ( (lv_id_5_0= ruleEString ) )
                    // InternalRest.g:1241:5: (lv_id_5_0= ruleEString )
                    {
                    // InternalRest.g:1241:5: (lv_id_5_0= ruleEString )
                    // InternalRest.g:1242:6: lv_id_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpReadAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            // InternalRest.g:1260:3: (otherlv_6= 'failedAnswer' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRest.g:1261:4: otherlv_6= 'failedAnswer' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getOpReadAccess().getFailedAnswerKeyword_4_0());
                    			
                    // InternalRest.g:1265:4: ( ( ruleEString ) )
                    // InternalRest.g:1266:5: ( ruleEString )
                    {
                    // InternalRest.g:1266:5: ( ruleEString )
                    // InternalRest.g:1267:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpReadRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpReadAccess().getFailedAnswerAnswerCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:1282:3: (otherlv_8= 'succAnswer' ( ( ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRest.g:1283:4: otherlv_8= 'succAnswer' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getOpReadAccess().getSuccAnswerKeyword_5_0());
                    			
                    // InternalRest.g:1287:4: ( ( ruleEString ) )
                    // InternalRest.g:1288:5: ( ruleEString )
                    {
                    // InternalRest.g:1288:5: ( ruleEString )
                    // InternalRest.g:1289:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpReadRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpReadAccess().getSuccAnswerAnswerCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getOpReadAccess().getStructKeyword_6());
            		
            // InternalRest.g:1308:3: ( ( ruleEString ) )
            // InternalRest.g:1309:4: ( ruleEString )
            {
            // InternalRest.g:1309:4: ( ruleEString )
            // InternalRest.g:1310:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpReadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpReadAccess().getStructStructCrossReference_7_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


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
    // InternalRest.g:1332:1: entryRuleOpUpdate returns [EObject current=null] : iv_ruleOpUpdate= ruleOpUpdate EOF ;
    public final EObject entryRuleOpUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpUpdate = null;


        try {
            // InternalRest.g:1332:49: (iv_ruleOpUpdate= ruleOpUpdate EOF )
            // InternalRest.g:1333:2: iv_ruleOpUpdate= ruleOpUpdate EOF
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
    // InternalRest.g:1339:1: ruleOpUpdate returns [EObject current=null] : (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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



        	enterRule();

        try {
            // InternalRest.g:1345:2: ( (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalRest.g:1346:2: (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalRest.g:1346:2: (otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalRest.g:1347:3: otherlv_0= 'OpUpdate' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpUpdateAccess().getOpUpdateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1355:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRest.g:1356:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpUpdateAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1360:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1361:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1361:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1362:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            // InternalRest.g:1380:3: (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRest.g:1381:4: otherlv_4= 'failedAnswer' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpUpdateAccess().getFailedAnswerKeyword_3_0());
                    			
                    // InternalRest.g:1385:4: ( ( ruleEString ) )
                    // InternalRest.g:1386:5: ( ruleEString )
                    {
                    // InternalRest.g:1386:5: ( ruleEString )
                    // InternalRest.g:1387:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpUpdateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:1402:3: (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRest.g:1403:4: otherlv_6= 'succAnswer' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getOpUpdateAccess().getSuccAnswerKeyword_4_0());
                    			
                    // InternalRest.g:1407:4: ( ( ruleEString ) )
                    // InternalRest.g:1408:5: ( ruleEString )
                    {
                    // InternalRest.g:1408:5: ( ruleEString )
                    // InternalRest.g:1409:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpUpdateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getSuccAnswerAnswerCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getOpUpdateAccess().getStructKeyword_5());
            		
            // InternalRest.g:1428:3: ( ( ruleEString ) )
            // InternalRest.g:1429:4: ( ruleEString )
            {
            // InternalRest.g:1429:4: ( ruleEString )
            // InternalRest.g:1430:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpUpdateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpUpdateAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1444:3: (otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRest.g:1445:4: otherlv_10= 'fieldset' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getOpUpdateAccess().getFieldsetKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getOpUpdateAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalRest.g:1453:4: ( ( ruleEString ) )
                    // InternalRest.g:1454:5: ( ruleEString )
                    {
                    // InternalRest.g:1454:5: ( ruleEString )
                    // InternalRest.g:1455:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpUpdateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:1469:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalRest.g:1470:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOpUpdateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRest.g:1474:5: ( ( ruleEString ) )
                    	    // InternalRest.g:1475:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:1475:6: ( ruleEString )
                    	    // InternalRest.g:1476:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOpUpdateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getOpUpdateAccess().getRightParenthesisKeyword_7_4());
                    			

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
    // InternalRest.g:1504:1: entryRuleOpDelete returns [EObject current=null] : iv_ruleOpDelete= ruleOpDelete EOF ;
    public final EObject entryRuleOpDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpDelete = null;


        try {
            // InternalRest.g:1504:49: (iv_ruleOpDelete= ruleOpDelete EOF )
            // InternalRest.g:1505:2: iv_ruleOpDelete= ruleOpDelete EOF
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
    // InternalRest.g:1511:1: ruleOpDelete returns [EObject current=null] : (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) otherlv_10= '}' ) ;
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



        	enterRule();

        try {
            // InternalRest.g:1517:2: ( (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // InternalRest.g:1518:2: (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // InternalRest.g:1518:2: (otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) otherlv_10= '}' )
            // InternalRest.g:1519:3: otherlv_0= 'OpDelete' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )? (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )? otherlv_8= 'struct' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpDeleteAccess().getOpDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getOpDeleteAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1527:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRest.g:1528:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpDeleteAccess().getIdKeyword_2_0());
                    			
                    // InternalRest.g:1532:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalRest.g:1533:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalRest.g:1533:5: (lv_id_3_0= ruleEString )
                    // InternalRest.g:1534:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpDeleteAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            // InternalRest.g:1552:3: (otherlv_4= 'failedAnswer' ( ( ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRest.g:1553:4: otherlv_4= 'failedAnswer' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpDeleteAccess().getFailedAnswerKeyword_3_0());
                    			
                    // InternalRest.g:1557:4: ( ( ruleEString ) )
                    // InternalRest.g:1558:5: ( ruleEString )
                    {
                    // InternalRest.g:1558:5: ( ruleEString )
                    // InternalRest.g:1559:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpDeleteRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:1574:3: (otherlv_6= 'succAnswer' ( ( ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRest.g:1575:4: otherlv_6= 'succAnswer' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getOpDeleteAccess().getSuccAnswerKeyword_4_0());
                    			
                    // InternalRest.g:1579:4: ( ( ruleEString ) )
                    // InternalRest.g:1580:5: ( ruleEString )
                    {
                    // InternalRest.g:1580:5: ( ruleEString )
                    // InternalRest.g:1581:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpDeleteRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOpDeleteAccess().getSuccAnswerAnswerCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getOpDeleteAccess().getStructKeyword_5());
            		
            // InternalRest.g:1600:3: ( ( ruleEString ) )
            // InternalRest.g:1601:4: ( ruleEString )
            {
            // InternalRest.g:1601:4: ( ruleEString )
            // InternalRest.g:1602:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpDeleteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpDeleteAccess().getStructStructCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


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
    // InternalRest.g:1624:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRest.g:1624:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRest.g:1625:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRest.g:1631:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRest.g:1637:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRest.g:1638:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRest.g:1638:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRest.g:1639:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRest.g:1639:3: (kw= '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRest.g:1640:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_20); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001C10000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000248000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000009E0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}