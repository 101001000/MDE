package rest.ide.contentassist.antlr.internal;

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
import rest.services.RestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RestSystem'", "'{'", "'}'", "'requests'", "','", "'structs'", "'answers'", "'Struct'", "'fields'", "'Answer'", "'status'", "'return'", "'Route'", "'segments'", "'Parameter'", "'ReGet'", "'succAnswer'", "'route'", "'operations'", "'parameters'", "'RePost'", "'RePut'", "'ReDelete'", "'Segment'", "'value'", "'OpCreate'", "'failedAnswer'", "'struct'", "'id'", "'fieldsets'", "'OpRead'", "'('", "')'", "'OpUpdate'", "'OpDelete'", "'FieldSet'", "'Field'", "'-'"
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

    	public void setGrammarAccess(RestGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRestSystem"
    // InternalRest.g:53:1: entryRuleRestSystem : ruleRestSystem EOF ;
    public final void entryRuleRestSystem() throws RecognitionException {
        try {
            // InternalRest.g:54:1: ( ruleRestSystem EOF )
            // InternalRest.g:55:1: ruleRestSystem EOF
            {
             before(grammarAccess.getRestSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleRestSystem();

            state._fsp--;

             after(grammarAccess.getRestSystemRule()); 
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
    // $ANTLR end "entryRuleRestSystem"


    // $ANTLR start "ruleRestSystem"
    // InternalRest.g:62:1: ruleRestSystem : ( ( rule__RestSystem__Group__0 ) ) ;
    public final void ruleRestSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:66:2: ( ( ( rule__RestSystem__Group__0 ) ) )
            // InternalRest.g:67:2: ( ( rule__RestSystem__Group__0 ) )
            {
            // InternalRest.g:67:2: ( ( rule__RestSystem__Group__0 ) )
            // InternalRest.g:68:3: ( rule__RestSystem__Group__0 )
            {
             before(grammarAccess.getRestSystemAccess().getGroup()); 
            // InternalRest.g:69:3: ( rule__RestSystem__Group__0 )
            // InternalRest.g:69:4: rule__RestSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleRestSystem"


    // $ANTLR start "entryRuleRequest"
    // InternalRest.g:78:1: entryRuleRequest : ruleRequest EOF ;
    public final void entryRuleRequest() throws RecognitionException {
        try {
            // InternalRest.g:79:1: ( ruleRequest EOF )
            // InternalRest.g:80:1: ruleRequest EOF
            {
             before(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRequestRule()); 
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
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalRest.g:87:1: ruleRequest : ( ( rule__Request__Alternatives ) ) ;
    public final void ruleRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:91:2: ( ( ( rule__Request__Alternatives ) ) )
            // InternalRest.g:92:2: ( ( rule__Request__Alternatives ) )
            {
            // InternalRest.g:92:2: ( ( rule__Request__Alternatives ) )
            // InternalRest.g:93:3: ( rule__Request__Alternatives )
            {
             before(grammarAccess.getRequestAccess().getAlternatives()); 
            // InternalRest.g:94:3: ( rule__Request__Alternatives )
            // InternalRest.g:94:4: rule__Request__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Request__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleOperation"
    // InternalRest.g:103:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalRest.g:104:1: ( ruleOperation EOF )
            // InternalRest.g:105:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalRest.g:112:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:116:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalRest.g:117:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalRest.g:117:2: ( ( rule__Operation__Alternatives ) )
            // InternalRest.g:118:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalRest.g:119:3: ( rule__Operation__Alternatives )
            // InternalRest.g:119:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleStruct"
    // InternalRest.g:128:1: entryRuleStruct : ruleStruct EOF ;
    public final void entryRuleStruct() throws RecognitionException {
        try {
            // InternalRest.g:129:1: ( ruleStruct EOF )
            // InternalRest.g:130:1: ruleStruct EOF
            {
             before(grammarAccess.getStructRule()); 
            pushFollow(FOLLOW_1);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getStructRule()); 
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
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // InternalRest.g:137:1: ruleStruct : ( ( rule__Struct__Group__0 ) ) ;
    public final void ruleStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:141:2: ( ( ( rule__Struct__Group__0 ) ) )
            // InternalRest.g:142:2: ( ( rule__Struct__Group__0 ) )
            {
            // InternalRest.g:142:2: ( ( rule__Struct__Group__0 ) )
            // InternalRest.g:143:3: ( rule__Struct__Group__0 )
            {
             before(grammarAccess.getStructAccess().getGroup()); 
            // InternalRest.g:144:3: ( rule__Struct__Group__0 )
            // InternalRest.g:144:4: rule__Struct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Struct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getGroup()); 

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
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleAnswer"
    // InternalRest.g:153:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // InternalRest.g:154:1: ( ruleAnswer EOF )
            // InternalRest.g:155:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // InternalRest.g:162:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:166:2: ( ( ( rule__Answer__Group__0 ) ) )
            // InternalRest.g:167:2: ( ( rule__Answer__Group__0 ) )
            {
            // InternalRest.g:167:2: ( ( rule__Answer__Group__0 ) )
            // InternalRest.g:168:3: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // InternalRest.g:169:3: ( rule__Answer__Group__0 )
            // InternalRest.g:169:4: rule__Answer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Answer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleRoute"
    // InternalRest.g:178:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // InternalRest.g:179:1: ( ruleRoute EOF )
            // InternalRest.g:180:1: ruleRoute EOF
            {
             before(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRouteRule()); 
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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalRest.g:187:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:191:2: ( ( ( rule__Route__Group__0 ) ) )
            // InternalRest.g:192:2: ( ( rule__Route__Group__0 ) )
            {
            // InternalRest.g:192:2: ( ( rule__Route__Group__0 ) )
            // InternalRest.g:193:3: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // InternalRest.g:194:3: ( rule__Route__Group__0 )
            // InternalRest.g:194:4: rule__Route__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getGroup()); 

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
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleParameter"
    // InternalRest.g:203:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalRest.g:204:1: ( ruleParameter EOF )
            // InternalRest.g:205:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRest.g:212:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:216:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalRest.g:217:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalRest.g:217:2: ( ( rule__Parameter__Group__0 ) )
            // InternalRest.g:218:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalRest.g:219:3: ( rule__Parameter__Group__0 )
            // InternalRest.g:219:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReGet"
    // InternalRest.g:228:1: entryRuleReGet : ruleReGet EOF ;
    public final void entryRuleReGet() throws RecognitionException {
        try {
            // InternalRest.g:229:1: ( ruleReGet EOF )
            // InternalRest.g:230:1: ruleReGet EOF
            {
             before(grammarAccess.getReGetRule()); 
            pushFollow(FOLLOW_1);
            ruleReGet();

            state._fsp--;

             after(grammarAccess.getReGetRule()); 
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
    // $ANTLR end "entryRuleReGet"


    // $ANTLR start "ruleReGet"
    // InternalRest.g:237:1: ruleReGet : ( ( rule__ReGet__Group__0 ) ) ;
    public final void ruleReGet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:241:2: ( ( ( rule__ReGet__Group__0 ) ) )
            // InternalRest.g:242:2: ( ( rule__ReGet__Group__0 ) )
            {
            // InternalRest.g:242:2: ( ( rule__ReGet__Group__0 ) )
            // InternalRest.g:243:3: ( rule__ReGet__Group__0 )
            {
             before(grammarAccess.getReGetAccess().getGroup()); 
            // InternalRest.g:244:3: ( rule__ReGet__Group__0 )
            // InternalRest.g:244:4: rule__ReGet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getGroup()); 

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
    // $ANTLR end "ruleReGet"


    // $ANTLR start "entryRuleRePost"
    // InternalRest.g:253:1: entryRuleRePost : ruleRePost EOF ;
    public final void entryRuleRePost() throws RecognitionException {
        try {
            // InternalRest.g:254:1: ( ruleRePost EOF )
            // InternalRest.g:255:1: ruleRePost EOF
            {
             before(grammarAccess.getRePostRule()); 
            pushFollow(FOLLOW_1);
            ruleRePost();

            state._fsp--;

             after(grammarAccess.getRePostRule()); 
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
    // $ANTLR end "entryRuleRePost"


    // $ANTLR start "ruleRePost"
    // InternalRest.g:262:1: ruleRePost : ( ( rule__RePost__Group__0 ) ) ;
    public final void ruleRePost() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:266:2: ( ( ( rule__RePost__Group__0 ) ) )
            // InternalRest.g:267:2: ( ( rule__RePost__Group__0 ) )
            {
            // InternalRest.g:267:2: ( ( rule__RePost__Group__0 ) )
            // InternalRest.g:268:3: ( rule__RePost__Group__0 )
            {
             before(grammarAccess.getRePostAccess().getGroup()); 
            // InternalRest.g:269:3: ( rule__RePost__Group__0 )
            // InternalRest.g:269:4: rule__RePost__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getGroup()); 

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
    // $ANTLR end "ruleRePost"


    // $ANTLR start "entryRuleRePut"
    // InternalRest.g:278:1: entryRuleRePut : ruleRePut EOF ;
    public final void entryRuleRePut() throws RecognitionException {
        try {
            // InternalRest.g:279:1: ( ruleRePut EOF )
            // InternalRest.g:280:1: ruleRePut EOF
            {
             before(grammarAccess.getRePutRule()); 
            pushFollow(FOLLOW_1);
            ruleRePut();

            state._fsp--;

             after(grammarAccess.getRePutRule()); 
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
    // $ANTLR end "entryRuleRePut"


    // $ANTLR start "ruleRePut"
    // InternalRest.g:287:1: ruleRePut : ( ( rule__RePut__Group__0 ) ) ;
    public final void ruleRePut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:291:2: ( ( ( rule__RePut__Group__0 ) ) )
            // InternalRest.g:292:2: ( ( rule__RePut__Group__0 ) )
            {
            // InternalRest.g:292:2: ( ( rule__RePut__Group__0 ) )
            // InternalRest.g:293:3: ( rule__RePut__Group__0 )
            {
             before(grammarAccess.getRePutAccess().getGroup()); 
            // InternalRest.g:294:3: ( rule__RePut__Group__0 )
            // InternalRest.g:294:4: rule__RePut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getGroup()); 

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
    // $ANTLR end "ruleRePut"


    // $ANTLR start "entryRuleReDelete"
    // InternalRest.g:303:1: entryRuleReDelete : ruleReDelete EOF ;
    public final void entryRuleReDelete() throws RecognitionException {
        try {
            // InternalRest.g:304:1: ( ruleReDelete EOF )
            // InternalRest.g:305:1: ruleReDelete EOF
            {
             before(grammarAccess.getReDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleReDelete();

            state._fsp--;

             after(grammarAccess.getReDeleteRule()); 
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
    // $ANTLR end "entryRuleReDelete"


    // $ANTLR start "ruleReDelete"
    // InternalRest.g:312:1: ruleReDelete : ( ( rule__ReDelete__Group__0 ) ) ;
    public final void ruleReDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:316:2: ( ( ( rule__ReDelete__Group__0 ) ) )
            // InternalRest.g:317:2: ( ( rule__ReDelete__Group__0 ) )
            {
            // InternalRest.g:317:2: ( ( rule__ReDelete__Group__0 ) )
            // InternalRest.g:318:3: ( rule__ReDelete__Group__0 )
            {
             before(grammarAccess.getReDeleteAccess().getGroup()); 
            // InternalRest.g:319:3: ( rule__ReDelete__Group__0 )
            // InternalRest.g:319:4: rule__ReDelete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getGroup()); 

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
    // $ANTLR end "ruleReDelete"


    // $ANTLR start "entryRuleSegment"
    // InternalRest.g:328:1: entryRuleSegment : ruleSegment EOF ;
    public final void entryRuleSegment() throws RecognitionException {
        try {
            // InternalRest.g:329:1: ( ruleSegment EOF )
            // InternalRest.g:330:1: ruleSegment EOF
            {
             before(grammarAccess.getSegmentRule()); 
            pushFollow(FOLLOW_1);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getSegmentRule()); 
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
    // $ANTLR end "entryRuleSegment"


    // $ANTLR start "ruleSegment"
    // InternalRest.g:337:1: ruleSegment : ( ( rule__Segment__Group__0 ) ) ;
    public final void ruleSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:341:2: ( ( ( rule__Segment__Group__0 ) ) )
            // InternalRest.g:342:2: ( ( rule__Segment__Group__0 ) )
            {
            // InternalRest.g:342:2: ( ( rule__Segment__Group__0 ) )
            // InternalRest.g:343:3: ( rule__Segment__Group__0 )
            {
             before(grammarAccess.getSegmentAccess().getGroup()); 
            // InternalRest.g:344:3: ( rule__Segment__Group__0 )
            // InternalRest.g:344:4: rule__Segment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getGroup()); 

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
    // $ANTLR end "ruleSegment"


    // $ANTLR start "entryRuleEString"
    // InternalRest.g:353:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRest.g:354:1: ( ruleEString EOF )
            // InternalRest.g:355:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRest.g:362:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:366:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRest.g:367:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRest.g:367:2: ( ( rule__EString__Alternatives ) )
            // InternalRest.g:368:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRest.g:369:3: ( rule__EString__Alternatives )
            // InternalRest.g:369:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleOpCreate"
    // InternalRest.g:378:1: entryRuleOpCreate : ruleOpCreate EOF ;
    public final void entryRuleOpCreate() throws RecognitionException {
        try {
            // InternalRest.g:379:1: ( ruleOpCreate EOF )
            // InternalRest.g:380:1: ruleOpCreate EOF
            {
             before(grammarAccess.getOpCreateRule()); 
            pushFollow(FOLLOW_1);
            ruleOpCreate();

            state._fsp--;

             after(grammarAccess.getOpCreateRule()); 
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
    // $ANTLR end "entryRuleOpCreate"


    // $ANTLR start "ruleOpCreate"
    // InternalRest.g:387:1: ruleOpCreate : ( ( rule__OpCreate__Group__0 ) ) ;
    public final void ruleOpCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:391:2: ( ( ( rule__OpCreate__Group__0 ) ) )
            // InternalRest.g:392:2: ( ( rule__OpCreate__Group__0 ) )
            {
            // InternalRest.g:392:2: ( ( rule__OpCreate__Group__0 ) )
            // InternalRest.g:393:3: ( rule__OpCreate__Group__0 )
            {
             before(grammarAccess.getOpCreateAccess().getGroup()); 
            // InternalRest.g:394:3: ( rule__OpCreate__Group__0 )
            // InternalRest.g:394:4: rule__OpCreate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getGroup()); 

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
    // $ANTLR end "ruleOpCreate"


    // $ANTLR start "entryRuleOpRead"
    // InternalRest.g:403:1: entryRuleOpRead : ruleOpRead EOF ;
    public final void entryRuleOpRead() throws RecognitionException {
        try {
            // InternalRest.g:404:1: ( ruleOpRead EOF )
            // InternalRest.g:405:1: ruleOpRead EOF
            {
             before(grammarAccess.getOpReadRule()); 
            pushFollow(FOLLOW_1);
            ruleOpRead();

            state._fsp--;

             after(grammarAccess.getOpReadRule()); 
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
    // $ANTLR end "entryRuleOpRead"


    // $ANTLR start "ruleOpRead"
    // InternalRest.g:412:1: ruleOpRead : ( ( rule__OpRead__Group__0 ) ) ;
    public final void ruleOpRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:416:2: ( ( ( rule__OpRead__Group__0 ) ) )
            // InternalRest.g:417:2: ( ( rule__OpRead__Group__0 ) )
            {
            // InternalRest.g:417:2: ( ( rule__OpRead__Group__0 ) )
            // InternalRest.g:418:3: ( rule__OpRead__Group__0 )
            {
             before(grammarAccess.getOpReadAccess().getGroup()); 
            // InternalRest.g:419:3: ( rule__OpRead__Group__0 )
            // InternalRest.g:419:4: rule__OpRead__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getGroup()); 

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
    // $ANTLR end "ruleOpRead"


    // $ANTLR start "entryRuleOpUpdate"
    // InternalRest.g:428:1: entryRuleOpUpdate : ruleOpUpdate EOF ;
    public final void entryRuleOpUpdate() throws RecognitionException {
        try {
            // InternalRest.g:429:1: ( ruleOpUpdate EOF )
            // InternalRest.g:430:1: ruleOpUpdate EOF
            {
             before(grammarAccess.getOpUpdateRule()); 
            pushFollow(FOLLOW_1);
            ruleOpUpdate();

            state._fsp--;

             after(grammarAccess.getOpUpdateRule()); 
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
    // $ANTLR end "entryRuleOpUpdate"


    // $ANTLR start "ruleOpUpdate"
    // InternalRest.g:437:1: ruleOpUpdate : ( ( rule__OpUpdate__Group__0 ) ) ;
    public final void ruleOpUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:441:2: ( ( ( rule__OpUpdate__Group__0 ) ) )
            // InternalRest.g:442:2: ( ( rule__OpUpdate__Group__0 ) )
            {
            // InternalRest.g:442:2: ( ( rule__OpUpdate__Group__0 ) )
            // InternalRest.g:443:3: ( rule__OpUpdate__Group__0 )
            {
             before(grammarAccess.getOpUpdateAccess().getGroup()); 
            // InternalRest.g:444:3: ( rule__OpUpdate__Group__0 )
            // InternalRest.g:444:4: rule__OpUpdate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getGroup()); 

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
    // $ANTLR end "ruleOpUpdate"


    // $ANTLR start "entryRuleOpDelete"
    // InternalRest.g:453:1: entryRuleOpDelete : ruleOpDelete EOF ;
    public final void entryRuleOpDelete() throws RecognitionException {
        try {
            // InternalRest.g:454:1: ( ruleOpDelete EOF )
            // InternalRest.g:455:1: ruleOpDelete EOF
            {
             before(grammarAccess.getOpDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleOpDelete();

            state._fsp--;

             after(grammarAccess.getOpDeleteRule()); 
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
    // $ANTLR end "entryRuleOpDelete"


    // $ANTLR start "ruleOpDelete"
    // InternalRest.g:462:1: ruleOpDelete : ( ( rule__OpDelete__Group__0 ) ) ;
    public final void ruleOpDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:466:2: ( ( ( rule__OpDelete__Group__0 ) ) )
            // InternalRest.g:467:2: ( ( rule__OpDelete__Group__0 ) )
            {
            // InternalRest.g:467:2: ( ( rule__OpDelete__Group__0 ) )
            // InternalRest.g:468:3: ( rule__OpDelete__Group__0 )
            {
             before(grammarAccess.getOpDeleteAccess().getGroup()); 
            // InternalRest.g:469:3: ( rule__OpDelete__Group__0 )
            // InternalRest.g:469:4: rule__OpDelete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpDeleteAccess().getGroup()); 

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
    // $ANTLR end "ruleOpDelete"


    // $ANTLR start "entryRuleFieldSet"
    // InternalRest.g:478:1: entryRuleFieldSet : ruleFieldSet EOF ;
    public final void entryRuleFieldSet() throws RecognitionException {
        try {
            // InternalRest.g:479:1: ( ruleFieldSet EOF )
            // InternalRest.g:480:1: ruleFieldSet EOF
            {
             before(grammarAccess.getFieldSetRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldSet();

            state._fsp--;

             after(grammarAccess.getFieldSetRule()); 
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
    // $ANTLR end "entryRuleFieldSet"


    // $ANTLR start "ruleFieldSet"
    // InternalRest.g:487:1: ruleFieldSet : ( ( rule__FieldSet__Group__0 ) ) ;
    public final void ruleFieldSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:491:2: ( ( ( rule__FieldSet__Group__0 ) ) )
            // InternalRest.g:492:2: ( ( rule__FieldSet__Group__0 ) )
            {
            // InternalRest.g:492:2: ( ( rule__FieldSet__Group__0 ) )
            // InternalRest.g:493:3: ( rule__FieldSet__Group__0 )
            {
             before(grammarAccess.getFieldSetAccess().getGroup()); 
            // InternalRest.g:494:3: ( rule__FieldSet__Group__0 )
            // InternalRest.g:494:4: rule__FieldSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldSetAccess().getGroup()); 

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
    // $ANTLR end "ruleFieldSet"


    // $ANTLR start "entryRuleField"
    // InternalRest.g:503:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalRest.g:504:1: ( ruleField EOF )
            // InternalRest.g:505:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalRest.g:512:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:516:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalRest.g:517:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalRest.g:517:2: ( ( rule__Field__Group__0 ) )
            // InternalRest.g:518:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalRest.g:519:3: ( rule__Field__Group__0 )
            // InternalRest.g:519:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEInt"
    // InternalRest.g:528:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRest.g:529:1: ( ruleEInt EOF )
            // InternalRest.g:530:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRest.g:537:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:541:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalRest.g:542:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalRest.g:542:2: ( ( rule__EInt__Group__0 ) )
            // InternalRest.g:543:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalRest.g:544:3: ( rule__EInt__Group__0 )
            // InternalRest.g:544:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Request__Alternatives"
    // InternalRest.g:552:1: rule__Request__Alternatives : ( ( ruleReGet ) | ( ruleRePost ) | ( ruleRePut ) | ( ruleReDelete ) );
    public final void rule__Request__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:556:1: ( ( ruleReGet ) | ( ruleRePost ) | ( ruleRePut ) | ( ruleReDelete ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRest.g:557:2: ( ruleReGet )
                    {
                    // InternalRest.g:557:2: ( ruleReGet )
                    // InternalRest.g:558:3: ruleReGet
                    {
                     before(grammarAccess.getRequestAccess().getReGetParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleReGet();

                    state._fsp--;

                     after(grammarAccess.getRequestAccess().getReGetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:563:2: ( ruleRePost )
                    {
                    // InternalRest.g:563:2: ( ruleRePost )
                    // InternalRest.g:564:3: ruleRePost
                    {
                     before(grammarAccess.getRequestAccess().getRePostParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRePost();

                    state._fsp--;

                     after(grammarAccess.getRequestAccess().getRePostParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRest.g:569:2: ( ruleRePut )
                    {
                    // InternalRest.g:569:2: ( ruleRePut )
                    // InternalRest.g:570:3: ruleRePut
                    {
                     before(grammarAccess.getRequestAccess().getRePutParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRePut();

                    state._fsp--;

                     after(grammarAccess.getRequestAccess().getRePutParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRest.g:575:2: ( ruleReDelete )
                    {
                    // InternalRest.g:575:2: ( ruleReDelete )
                    // InternalRest.g:576:3: ruleReDelete
                    {
                     before(grammarAccess.getRequestAccess().getReDeleteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleReDelete();

                    state._fsp--;

                     after(grammarAccess.getRequestAccess().getReDeleteParserRuleCall_3()); 

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
    // $ANTLR end "rule__Request__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalRest.g:585:1: rule__Operation__Alternatives : ( ( ruleOpCreate ) | ( ruleOpRead ) | ( ruleOpUpdate ) | ( ruleOpDelete ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:589:1: ( ( ruleOpCreate ) | ( ruleOpRead ) | ( ruleOpUpdate ) | ( ruleOpDelete ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 44:
                {
                alt2=3;
                }
                break;
            case 45:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRest.g:590:2: ( ruleOpCreate )
                    {
                    // InternalRest.g:590:2: ( ruleOpCreate )
                    // InternalRest.g:591:3: ruleOpCreate
                    {
                     before(grammarAccess.getOperationAccess().getOpCreateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOpCreate();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getOpCreateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:596:2: ( ruleOpRead )
                    {
                    // InternalRest.g:596:2: ( ruleOpRead )
                    // InternalRest.g:597:3: ruleOpRead
                    {
                     before(grammarAccess.getOperationAccess().getOpReadParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOpRead();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getOpReadParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRest.g:602:2: ( ruleOpUpdate )
                    {
                    // InternalRest.g:602:2: ( ruleOpUpdate )
                    // InternalRest.g:603:3: ruleOpUpdate
                    {
                     before(grammarAccess.getOperationAccess().getOpUpdateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOpUpdate();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getOpUpdateParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRest.g:608:2: ( ruleOpDelete )
                    {
                    // InternalRest.g:608:2: ( ruleOpDelete )
                    // InternalRest.g:609:3: ruleOpDelete
                    {
                     before(grammarAccess.getOperationAccess().getOpDeleteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOpDelete();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getOpDeleteParserRuleCall_3()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRest.g:618:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:622:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRest.g:623:2: ( RULE_STRING )
                    {
                    // InternalRest.g:623:2: ( RULE_STRING )
                    // InternalRest.g:624:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:629:2: ( RULE_ID )
                    {
                    // InternalRest.g:629:2: ( RULE_ID )
                    // InternalRest.g:630:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__RestSystem__Group__0"
    // InternalRest.g:639:1: rule__RestSystem__Group__0 : rule__RestSystem__Group__0__Impl rule__RestSystem__Group__1 ;
    public final void rule__RestSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:643:1: ( rule__RestSystem__Group__0__Impl rule__RestSystem__Group__1 )
            // InternalRest.g:644:2: rule__RestSystem__Group__0__Impl rule__RestSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RestSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__1();

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
    // $ANTLR end "rule__RestSystem__Group__0"


    // $ANTLR start "rule__RestSystem__Group__0__Impl"
    // InternalRest.g:651:1: rule__RestSystem__Group__0__Impl : ( () ) ;
    public final void rule__RestSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:655:1: ( ( () ) )
            // InternalRest.g:656:1: ( () )
            {
            // InternalRest.g:656:1: ( () )
            // InternalRest.g:657:2: ()
            {
             before(grammarAccess.getRestSystemAccess().getRestSystemAction_0()); 
            // InternalRest.g:658:2: ()
            // InternalRest.g:658:3: 
            {
            }

             after(grammarAccess.getRestSystemAccess().getRestSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group__0__Impl"


    // $ANTLR start "rule__RestSystem__Group__1"
    // InternalRest.g:666:1: rule__RestSystem__Group__1 : rule__RestSystem__Group__1__Impl rule__RestSystem__Group__2 ;
    public final void rule__RestSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:670:1: ( rule__RestSystem__Group__1__Impl rule__RestSystem__Group__2 )
            // InternalRest.g:671:2: rule__RestSystem__Group__1__Impl rule__RestSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RestSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__2();

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
    // $ANTLR end "rule__RestSystem__Group__1"


    // $ANTLR start "rule__RestSystem__Group__1__Impl"
    // InternalRest.g:678:1: rule__RestSystem__Group__1__Impl : ( 'RestSystem' ) ;
    public final void rule__RestSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:682:1: ( ( 'RestSystem' ) )
            // InternalRest.g:683:1: ( 'RestSystem' )
            {
            // InternalRest.g:683:1: ( 'RestSystem' )
            // InternalRest.g:684:2: 'RestSystem'
            {
             before(grammarAccess.getRestSystemAccess().getRestSystemKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRestSystemKeyword_1()); 

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
    // $ANTLR end "rule__RestSystem__Group__1__Impl"


    // $ANTLR start "rule__RestSystem__Group__2"
    // InternalRest.g:693:1: rule__RestSystem__Group__2 : rule__RestSystem__Group__2__Impl rule__RestSystem__Group__3 ;
    public final void rule__RestSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:697:1: ( rule__RestSystem__Group__2__Impl rule__RestSystem__Group__3 )
            // InternalRest.g:698:2: rule__RestSystem__Group__2__Impl rule__RestSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RestSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__3();

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
    // $ANTLR end "rule__RestSystem__Group__2"


    // $ANTLR start "rule__RestSystem__Group__2__Impl"
    // InternalRest.g:705:1: rule__RestSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:709:1: ( ( '{' ) )
            // InternalRest.g:710:1: ( '{' )
            {
            // InternalRest.g:710:1: ( '{' )
            // InternalRest.g:711:2: '{'
            {
             before(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RestSystem__Group__2__Impl"


    // $ANTLR start "rule__RestSystem__Group__3"
    // InternalRest.g:720:1: rule__RestSystem__Group__3 : rule__RestSystem__Group__3__Impl rule__RestSystem__Group__4 ;
    public final void rule__RestSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:724:1: ( rule__RestSystem__Group__3__Impl rule__RestSystem__Group__4 )
            // InternalRest.g:725:2: rule__RestSystem__Group__3__Impl rule__RestSystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RestSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__4();

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
    // $ANTLR end "rule__RestSystem__Group__3"


    // $ANTLR start "rule__RestSystem__Group__3__Impl"
    // InternalRest.g:732:1: rule__RestSystem__Group__3__Impl : ( ( rule__RestSystem__Group_3__0 )? ) ;
    public final void rule__RestSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:736:1: ( ( ( rule__RestSystem__Group_3__0 )? ) )
            // InternalRest.g:737:1: ( ( rule__RestSystem__Group_3__0 )? )
            {
            // InternalRest.g:737:1: ( ( rule__RestSystem__Group_3__0 )? )
            // InternalRest.g:738:2: ( rule__RestSystem__Group_3__0 )?
            {
             before(grammarAccess.getRestSystemAccess().getGroup_3()); 
            // InternalRest.g:739:2: ( rule__RestSystem__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRest.g:739:3: rule__RestSystem__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestSystem__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestSystemAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RestSystem__Group__3__Impl"


    // $ANTLR start "rule__RestSystem__Group__4"
    // InternalRest.g:747:1: rule__RestSystem__Group__4 : rule__RestSystem__Group__4__Impl rule__RestSystem__Group__5 ;
    public final void rule__RestSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:751:1: ( rule__RestSystem__Group__4__Impl rule__RestSystem__Group__5 )
            // InternalRest.g:752:2: rule__RestSystem__Group__4__Impl rule__RestSystem__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__RestSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__5();

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
    // $ANTLR end "rule__RestSystem__Group__4"


    // $ANTLR start "rule__RestSystem__Group__4__Impl"
    // InternalRest.g:759:1: rule__RestSystem__Group__4__Impl : ( ( rule__RestSystem__Group_4__0 )? ) ;
    public final void rule__RestSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:763:1: ( ( ( rule__RestSystem__Group_4__0 )? ) )
            // InternalRest.g:764:1: ( ( rule__RestSystem__Group_4__0 )? )
            {
            // InternalRest.g:764:1: ( ( rule__RestSystem__Group_4__0 )? )
            // InternalRest.g:765:2: ( rule__RestSystem__Group_4__0 )?
            {
             before(grammarAccess.getRestSystemAccess().getGroup_4()); 
            // InternalRest.g:766:2: ( rule__RestSystem__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRest.g:766:3: rule__RestSystem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestSystem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__RestSystem__Group__4__Impl"


    // $ANTLR start "rule__RestSystem__Group__5"
    // InternalRest.g:774:1: rule__RestSystem__Group__5 : rule__RestSystem__Group__5__Impl rule__RestSystem__Group__6 ;
    public final void rule__RestSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:778:1: ( rule__RestSystem__Group__5__Impl rule__RestSystem__Group__6 )
            // InternalRest.g:779:2: rule__RestSystem__Group__5__Impl rule__RestSystem__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RestSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__6();

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
    // $ANTLR end "rule__RestSystem__Group__5"


    // $ANTLR start "rule__RestSystem__Group__5__Impl"
    // InternalRest.g:786:1: rule__RestSystem__Group__5__Impl : ( ( rule__RestSystem__Group_5__0 )? ) ;
    public final void rule__RestSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:790:1: ( ( ( rule__RestSystem__Group_5__0 )? ) )
            // InternalRest.g:791:1: ( ( rule__RestSystem__Group_5__0 )? )
            {
            // InternalRest.g:791:1: ( ( rule__RestSystem__Group_5__0 )? )
            // InternalRest.g:792:2: ( rule__RestSystem__Group_5__0 )?
            {
             before(grammarAccess.getRestSystemAccess().getGroup_5()); 
            // InternalRest.g:793:2: ( rule__RestSystem__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRest.g:793:3: rule__RestSystem__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestSystem__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestSystemAccess().getGroup_5()); 

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
    // $ANTLR end "rule__RestSystem__Group__5__Impl"


    // $ANTLR start "rule__RestSystem__Group__6"
    // InternalRest.g:801:1: rule__RestSystem__Group__6 : rule__RestSystem__Group__6__Impl ;
    public final void rule__RestSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:805:1: ( rule__RestSystem__Group__6__Impl )
            // InternalRest.g:806:2: rule__RestSystem__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__6__Impl();

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
    // $ANTLR end "rule__RestSystem__Group__6"


    // $ANTLR start "rule__RestSystem__Group__6__Impl"
    // InternalRest.g:812:1: rule__RestSystem__Group__6__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:816:1: ( ( '}' ) )
            // InternalRest.g:817:1: ( '}' )
            {
            // InternalRest.g:817:1: ( '}' )
            // InternalRest.g:818:2: '}'
            {
             before(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__RestSystem__Group__6__Impl"


    // $ANTLR start "rule__RestSystem__Group_3__0"
    // InternalRest.g:828:1: rule__RestSystem__Group_3__0 : rule__RestSystem__Group_3__0__Impl rule__RestSystem__Group_3__1 ;
    public final void rule__RestSystem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:832:1: ( rule__RestSystem__Group_3__0__Impl rule__RestSystem__Group_3__1 )
            // InternalRest.g:833:2: rule__RestSystem__Group_3__0__Impl rule__RestSystem__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__RestSystem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_3__1();

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
    // $ANTLR end "rule__RestSystem__Group_3__0"


    // $ANTLR start "rule__RestSystem__Group_3__0__Impl"
    // InternalRest.g:840:1: rule__RestSystem__Group_3__0__Impl : ( 'requests' ) ;
    public final void rule__RestSystem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:844:1: ( ( 'requests' ) )
            // InternalRest.g:845:1: ( 'requests' )
            {
            // InternalRest.g:845:1: ( 'requests' )
            // InternalRest.g:846:2: 'requests'
            {
             before(grammarAccess.getRestSystemAccess().getRequestsKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRequestsKeyword_3_0()); 

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
    // $ANTLR end "rule__RestSystem__Group_3__0__Impl"


    // $ANTLR start "rule__RestSystem__Group_3__1"
    // InternalRest.g:855:1: rule__RestSystem__Group_3__1 : rule__RestSystem__Group_3__1__Impl rule__RestSystem__Group_3__2 ;
    public final void rule__RestSystem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:859:1: ( rule__RestSystem__Group_3__1__Impl rule__RestSystem__Group_3__2 )
            // InternalRest.g:860:2: rule__RestSystem__Group_3__1__Impl rule__RestSystem__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__RestSystem__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_3__2();

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
    // $ANTLR end "rule__RestSystem__Group_3__1"


    // $ANTLR start "rule__RestSystem__Group_3__1__Impl"
    // InternalRest.g:867:1: rule__RestSystem__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:871:1: ( ( '{' ) )
            // InternalRest.g:872:1: ( '{' )
            {
            // InternalRest.g:872:1: ( '{' )
            // InternalRest.g:873:2: '{'
            {
             before(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__RestSystem__Group_3__1__Impl"


    // $ANTLR start "rule__RestSystem__Group_3__2"
    // InternalRest.g:882:1: rule__RestSystem__Group_3__2 : rule__RestSystem__Group_3__2__Impl rule__RestSystem__Group_3__3 ;
    public final void rule__RestSystem__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:886:1: ( rule__RestSystem__Group_3__2__Impl rule__RestSystem__Group_3__3 )
            // InternalRest.g:887:2: rule__RestSystem__Group_3__2__Impl rule__RestSystem__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__RestSystem__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_3__3();

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
    // $ANTLR end "rule__RestSystem__Group_3__2"


    // $ANTLR start "rule__RestSystem__Group_3__2__Impl"
    // InternalRest.g:894:1: rule__RestSystem__Group_3__2__Impl : ( ( rule__RestSystem__RequestsAssignment_3_2 ) ) ;
    public final void rule__RestSystem__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:898:1: ( ( ( rule__RestSystem__RequestsAssignment_3_2 ) ) )
            // InternalRest.g:899:1: ( ( rule__RestSystem__RequestsAssignment_3_2 ) )
            {
            // InternalRest.g:899:1: ( ( rule__RestSystem__RequestsAssignment_3_2 ) )
            // InternalRest.g:900:2: ( rule__RestSystem__RequestsAssignment_3_2 )
            {
             before(grammarAccess.getRestSystemAccess().getRequestsAssignment_3_2()); 
            // InternalRest.g:901:2: ( rule__RestSystem__RequestsAssignment_3_2 )
            // InternalRest.g:901:3: rule__RestSystem__RequestsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__RequestsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getRequestsAssignment_3_2()); 

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
    // $ANTLR end "rule__RestSystem__Group_3__2__Impl"


    // $ANTLR start "rule__RestSystem__Group_3__3"
    // InternalRest.g:909:1: rule__RestSystem__Group_3__3 : rule__RestSystem__Group_3__3__Impl rule__RestSystem__Group_3__4 ;
    public final void rule__RestSystem__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:913:1: ( rule__RestSystem__Group_3__3__Impl rule__RestSystem__Group_3__4 )
            // InternalRest.g:914:2: rule__RestSystem__Group_3__3__Impl rule__RestSystem__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__RestSystem__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_3__4();

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
    // $ANTLR end "rule__RestSystem__Group_3__3"


    // $ANTLR start "rule__RestSystem__Group_3__3__Impl"
    // InternalRest.g:921:1: rule__RestSystem__Group_3__3__Impl : ( ( rule__RestSystem__Group_3_3__0 )* ) ;
    public final void rule__RestSystem__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:925:1: ( ( ( rule__RestSystem__Group_3_3__0 )* ) )
            // InternalRest.g:926:1: ( ( rule__RestSystem__Group_3_3__0 )* )
            {
            // InternalRest.g:926:1: ( ( rule__RestSystem__Group_3_3__0 )* )
            // InternalRest.g:927:2: ( rule__RestSystem__Group_3_3__0 )*
            {
             before(grammarAccess.getRestSystemAccess().getGroup_3_3()); 
            // InternalRest.g:928:2: ( rule__RestSystem__Group_3_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRest.g:928:3: rule__RestSystem__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RestSystem__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRestSystemAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__RestSystem__Group_3__3__Impl"


    // $ANTLR start "rule__RestSystem__Group_3__4"
    // InternalRest.g:936:1: rule__RestSystem__Group_3__4 : rule__RestSystem__Group_3__4__Impl ;
    public final void rule__RestSystem__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:940:1: ( rule__RestSystem__Group_3__4__Impl )
            // InternalRest.g:941:2: rule__RestSystem__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_3__4__Impl();

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
    // $ANTLR end "rule__RestSystem__Group_3__4"


    // $ANTLR start "rule__RestSystem__Group_3__4__Impl"
    // InternalRest.g:947:1: rule__RestSystem__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:951:1: ( ( '}' ) )
            // InternalRest.g:952:1: ( '}' )
            {
            // InternalRest.g:952:1: ( '}' )
            // InternalRest.g:953:2: '}'
            {
             before(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__RestSystem__Group_3__4__Impl"


    // $ANTLR start "rule__RestSystem__Group_3_3__0"
    // InternalRest.g:963:1: rule__RestSystem__Group_3_3__0 : rule__RestSystem__Group_3_3__0__Impl rule__RestSystem__Group_3_3__1 ;
    public final void rule__RestSystem__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:967:1: ( rule__RestSystem__Group_3_3__0__Impl rule__RestSystem__Group_3_3__1 )
            // InternalRest.g:968:2: rule__RestSystem__Group_3_3__0__Impl rule__RestSystem__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__RestSystem__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_3_3__1();

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
    // $ANTLR end "rule__RestSystem__Group_3_3__0"


    // $ANTLR start "rule__RestSystem__Group_3_3__0__Impl"
    // InternalRest.g:975:1: rule__RestSystem__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RestSystem__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:979:1: ( ( ',' ) )
            // InternalRest.g:980:1: ( ',' )
            {
            // InternalRest.g:980:1: ( ',' )
            // InternalRest.g:981:2: ','
            {
             before(grammarAccess.getRestSystemAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__RestSystem__Group_3_3__0__Impl"


    // $ANTLR start "rule__RestSystem__Group_3_3__1"
    // InternalRest.g:990:1: rule__RestSystem__Group_3_3__1 : rule__RestSystem__Group_3_3__1__Impl ;
    public final void rule__RestSystem__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:994:1: ( rule__RestSystem__Group_3_3__1__Impl )
            // InternalRest.g:995:2: rule__RestSystem__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__RestSystem__Group_3_3__1"


    // $ANTLR start "rule__RestSystem__Group_3_3__1__Impl"
    // InternalRest.g:1001:1: rule__RestSystem__Group_3_3__1__Impl : ( ( rule__RestSystem__RequestsAssignment_3_3_1 ) ) ;
    public final void rule__RestSystem__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1005:1: ( ( ( rule__RestSystem__RequestsAssignment_3_3_1 ) ) )
            // InternalRest.g:1006:1: ( ( rule__RestSystem__RequestsAssignment_3_3_1 ) )
            {
            // InternalRest.g:1006:1: ( ( rule__RestSystem__RequestsAssignment_3_3_1 ) )
            // InternalRest.g:1007:2: ( rule__RestSystem__RequestsAssignment_3_3_1 )
            {
             before(grammarAccess.getRestSystemAccess().getRequestsAssignment_3_3_1()); 
            // InternalRest.g:1008:2: ( rule__RestSystem__RequestsAssignment_3_3_1 )
            // InternalRest.g:1008:3: rule__RestSystem__RequestsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__RequestsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getRequestsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__RestSystem__Group_3_3__1__Impl"


    // $ANTLR start "rule__RestSystem__Group_4__0"
    // InternalRest.g:1017:1: rule__RestSystem__Group_4__0 : rule__RestSystem__Group_4__0__Impl rule__RestSystem__Group_4__1 ;
    public final void rule__RestSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1021:1: ( rule__RestSystem__Group_4__0__Impl rule__RestSystem__Group_4__1 )
            // InternalRest.g:1022:2: rule__RestSystem__Group_4__0__Impl rule__RestSystem__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__RestSystem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_4__1();

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
    // $ANTLR end "rule__RestSystem__Group_4__0"


    // $ANTLR start "rule__RestSystem__Group_4__0__Impl"
    // InternalRest.g:1029:1: rule__RestSystem__Group_4__0__Impl : ( 'structs' ) ;
    public final void rule__RestSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1033:1: ( ( 'structs' ) )
            // InternalRest.g:1034:1: ( 'structs' )
            {
            // InternalRest.g:1034:1: ( 'structs' )
            // InternalRest.g:1035:2: 'structs'
            {
             before(grammarAccess.getRestSystemAccess().getStructsKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getStructsKeyword_4_0()); 

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
    // $ANTLR end "rule__RestSystem__Group_4__0__Impl"


    // $ANTLR start "rule__RestSystem__Group_4__1"
    // InternalRest.g:1044:1: rule__RestSystem__Group_4__1 : rule__RestSystem__Group_4__1__Impl rule__RestSystem__Group_4__2 ;
    public final void rule__RestSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1048:1: ( rule__RestSystem__Group_4__1__Impl rule__RestSystem__Group_4__2 )
            // InternalRest.g:1049:2: rule__RestSystem__Group_4__1__Impl rule__RestSystem__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__RestSystem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_4__2();

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
    // $ANTLR end "rule__RestSystem__Group_4__1"


    // $ANTLR start "rule__RestSystem__Group_4__1__Impl"
    // InternalRest.g:1056:1: rule__RestSystem__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1060:1: ( ( '{' ) )
            // InternalRest.g:1061:1: ( '{' )
            {
            // InternalRest.g:1061:1: ( '{' )
            // InternalRest.g:1062:2: '{'
            {
             before(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__RestSystem__Group_4__1__Impl"


    // $ANTLR start "rule__RestSystem__Group_4__2"
    // InternalRest.g:1071:1: rule__RestSystem__Group_4__2 : rule__RestSystem__Group_4__2__Impl rule__RestSystem__Group_4__3 ;
    public final void rule__RestSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1075:1: ( rule__RestSystem__Group_4__2__Impl rule__RestSystem__Group_4__3 )
            // InternalRest.g:1076:2: rule__RestSystem__Group_4__2__Impl rule__RestSystem__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__RestSystem__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_4__3();

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
    // $ANTLR end "rule__RestSystem__Group_4__2"


    // $ANTLR start "rule__RestSystem__Group_4__2__Impl"
    // InternalRest.g:1083:1: rule__RestSystem__Group_4__2__Impl : ( ( rule__RestSystem__StructsAssignment_4_2 ) ) ;
    public final void rule__RestSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1087:1: ( ( ( rule__RestSystem__StructsAssignment_4_2 ) ) )
            // InternalRest.g:1088:1: ( ( rule__RestSystem__StructsAssignment_4_2 ) )
            {
            // InternalRest.g:1088:1: ( ( rule__RestSystem__StructsAssignment_4_2 ) )
            // InternalRest.g:1089:2: ( rule__RestSystem__StructsAssignment_4_2 )
            {
             before(grammarAccess.getRestSystemAccess().getStructsAssignment_4_2()); 
            // InternalRest.g:1090:2: ( rule__RestSystem__StructsAssignment_4_2 )
            // InternalRest.g:1090:3: rule__RestSystem__StructsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__StructsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getStructsAssignment_4_2()); 

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
    // $ANTLR end "rule__RestSystem__Group_4__2__Impl"


    // $ANTLR start "rule__RestSystem__Group_4__3"
    // InternalRest.g:1098:1: rule__RestSystem__Group_4__3 : rule__RestSystem__Group_4__3__Impl rule__RestSystem__Group_4__4 ;
    public final void rule__RestSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1102:1: ( rule__RestSystem__Group_4__3__Impl rule__RestSystem__Group_4__4 )
            // InternalRest.g:1103:2: rule__RestSystem__Group_4__3__Impl rule__RestSystem__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__RestSystem__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_4__4();

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
    // $ANTLR end "rule__RestSystem__Group_4__3"


    // $ANTLR start "rule__RestSystem__Group_4__3__Impl"
    // InternalRest.g:1110:1: rule__RestSystem__Group_4__3__Impl : ( ( rule__RestSystem__Group_4_3__0 )* ) ;
    public final void rule__RestSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1114:1: ( ( ( rule__RestSystem__Group_4_3__0 )* ) )
            // InternalRest.g:1115:1: ( ( rule__RestSystem__Group_4_3__0 )* )
            {
            // InternalRest.g:1115:1: ( ( rule__RestSystem__Group_4_3__0 )* )
            // InternalRest.g:1116:2: ( rule__RestSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getRestSystemAccess().getGroup_4_3()); 
            // InternalRest.g:1117:2: ( rule__RestSystem__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRest.g:1117:3: rule__RestSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RestSystem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRestSystemAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__RestSystem__Group_4__3__Impl"


    // $ANTLR start "rule__RestSystem__Group_4__4"
    // InternalRest.g:1125:1: rule__RestSystem__Group_4__4 : rule__RestSystem__Group_4__4__Impl ;
    public final void rule__RestSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1129:1: ( rule__RestSystem__Group_4__4__Impl )
            // InternalRest.g:1130:2: rule__RestSystem__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_4__4__Impl();

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
    // $ANTLR end "rule__RestSystem__Group_4__4"


    // $ANTLR start "rule__RestSystem__Group_4__4__Impl"
    // InternalRest.g:1136:1: rule__RestSystem__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1140:1: ( ( '}' ) )
            // InternalRest.g:1141:1: ( '}' )
            {
            // InternalRest.g:1141:1: ( '}' )
            // InternalRest.g:1142:2: '}'
            {
             before(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__RestSystem__Group_4__4__Impl"


    // $ANTLR start "rule__RestSystem__Group_4_3__0"
    // InternalRest.g:1152:1: rule__RestSystem__Group_4_3__0 : rule__RestSystem__Group_4_3__0__Impl rule__RestSystem__Group_4_3__1 ;
    public final void rule__RestSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1156:1: ( rule__RestSystem__Group_4_3__0__Impl rule__RestSystem__Group_4_3__1 )
            // InternalRest.g:1157:2: rule__RestSystem__Group_4_3__0__Impl rule__RestSystem__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__RestSystem__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_4_3__1();

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
    // $ANTLR end "rule__RestSystem__Group_4_3__0"


    // $ANTLR start "rule__RestSystem__Group_4_3__0__Impl"
    // InternalRest.g:1164:1: rule__RestSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RestSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1168:1: ( ( ',' ) )
            // InternalRest.g:1169:1: ( ',' )
            {
            // InternalRest.g:1169:1: ( ',' )
            // InternalRest.g:1170:2: ','
            {
             before(grammarAccess.getRestSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__RestSystem__Group_4_3__0__Impl"


    // $ANTLR start "rule__RestSystem__Group_4_3__1"
    // InternalRest.g:1179:1: rule__RestSystem__Group_4_3__1 : rule__RestSystem__Group_4_3__1__Impl ;
    public final void rule__RestSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1183:1: ( rule__RestSystem__Group_4_3__1__Impl )
            // InternalRest.g:1184:2: rule__RestSystem__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__RestSystem__Group_4_3__1"


    // $ANTLR start "rule__RestSystem__Group_4_3__1__Impl"
    // InternalRest.g:1190:1: rule__RestSystem__Group_4_3__1__Impl : ( ( rule__RestSystem__StructsAssignment_4_3_1 ) ) ;
    public final void rule__RestSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1194:1: ( ( ( rule__RestSystem__StructsAssignment_4_3_1 ) ) )
            // InternalRest.g:1195:1: ( ( rule__RestSystem__StructsAssignment_4_3_1 ) )
            {
            // InternalRest.g:1195:1: ( ( rule__RestSystem__StructsAssignment_4_3_1 ) )
            // InternalRest.g:1196:2: ( rule__RestSystem__StructsAssignment_4_3_1 )
            {
             before(grammarAccess.getRestSystemAccess().getStructsAssignment_4_3_1()); 
            // InternalRest.g:1197:2: ( rule__RestSystem__StructsAssignment_4_3_1 )
            // InternalRest.g:1197:3: rule__RestSystem__StructsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__StructsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getStructsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__RestSystem__Group_4_3__1__Impl"


    // $ANTLR start "rule__RestSystem__Group_5__0"
    // InternalRest.g:1206:1: rule__RestSystem__Group_5__0 : rule__RestSystem__Group_5__0__Impl rule__RestSystem__Group_5__1 ;
    public final void rule__RestSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1210:1: ( rule__RestSystem__Group_5__0__Impl rule__RestSystem__Group_5__1 )
            // InternalRest.g:1211:2: rule__RestSystem__Group_5__0__Impl rule__RestSystem__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__RestSystem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_5__1();

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
    // $ANTLR end "rule__RestSystem__Group_5__0"


    // $ANTLR start "rule__RestSystem__Group_5__0__Impl"
    // InternalRest.g:1218:1: rule__RestSystem__Group_5__0__Impl : ( 'answers' ) ;
    public final void rule__RestSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1222:1: ( ( 'answers' ) )
            // InternalRest.g:1223:1: ( 'answers' )
            {
            // InternalRest.g:1223:1: ( 'answers' )
            // InternalRest.g:1224:2: 'answers'
            {
             before(grammarAccess.getRestSystemAccess().getAnswersKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getAnswersKeyword_5_0()); 

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
    // $ANTLR end "rule__RestSystem__Group_5__0__Impl"


    // $ANTLR start "rule__RestSystem__Group_5__1"
    // InternalRest.g:1233:1: rule__RestSystem__Group_5__1 : rule__RestSystem__Group_5__1__Impl rule__RestSystem__Group_5__2 ;
    public final void rule__RestSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1237:1: ( rule__RestSystem__Group_5__1__Impl rule__RestSystem__Group_5__2 )
            // InternalRest.g:1238:2: rule__RestSystem__Group_5__1__Impl rule__RestSystem__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__RestSystem__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_5__2();

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
    // $ANTLR end "rule__RestSystem__Group_5__1"


    // $ANTLR start "rule__RestSystem__Group_5__1__Impl"
    // InternalRest.g:1245:1: rule__RestSystem__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1249:1: ( ( '{' ) )
            // InternalRest.g:1250:1: ( '{' )
            {
            // InternalRest.g:1250:1: ( '{' )
            // InternalRest.g:1251:2: '{'
            {
             before(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__RestSystem__Group_5__1__Impl"


    // $ANTLR start "rule__RestSystem__Group_5__2"
    // InternalRest.g:1260:1: rule__RestSystem__Group_5__2 : rule__RestSystem__Group_5__2__Impl rule__RestSystem__Group_5__3 ;
    public final void rule__RestSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1264:1: ( rule__RestSystem__Group_5__2__Impl rule__RestSystem__Group_5__3 )
            // InternalRest.g:1265:2: rule__RestSystem__Group_5__2__Impl rule__RestSystem__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__RestSystem__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_5__3();

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
    // $ANTLR end "rule__RestSystem__Group_5__2"


    // $ANTLR start "rule__RestSystem__Group_5__2__Impl"
    // InternalRest.g:1272:1: rule__RestSystem__Group_5__2__Impl : ( ( rule__RestSystem__AnswersAssignment_5_2 ) ) ;
    public final void rule__RestSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1276:1: ( ( ( rule__RestSystem__AnswersAssignment_5_2 ) ) )
            // InternalRest.g:1277:1: ( ( rule__RestSystem__AnswersAssignment_5_2 ) )
            {
            // InternalRest.g:1277:1: ( ( rule__RestSystem__AnswersAssignment_5_2 ) )
            // InternalRest.g:1278:2: ( rule__RestSystem__AnswersAssignment_5_2 )
            {
             before(grammarAccess.getRestSystemAccess().getAnswersAssignment_5_2()); 
            // InternalRest.g:1279:2: ( rule__RestSystem__AnswersAssignment_5_2 )
            // InternalRest.g:1279:3: rule__RestSystem__AnswersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__AnswersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getAnswersAssignment_5_2()); 

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
    // $ANTLR end "rule__RestSystem__Group_5__2__Impl"


    // $ANTLR start "rule__RestSystem__Group_5__3"
    // InternalRest.g:1287:1: rule__RestSystem__Group_5__3 : rule__RestSystem__Group_5__3__Impl rule__RestSystem__Group_5__4 ;
    public final void rule__RestSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1291:1: ( rule__RestSystem__Group_5__3__Impl rule__RestSystem__Group_5__4 )
            // InternalRest.g:1292:2: rule__RestSystem__Group_5__3__Impl rule__RestSystem__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__RestSystem__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_5__4();

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
    // $ANTLR end "rule__RestSystem__Group_5__3"


    // $ANTLR start "rule__RestSystem__Group_5__3__Impl"
    // InternalRest.g:1299:1: rule__RestSystem__Group_5__3__Impl : ( ( rule__RestSystem__Group_5_3__0 )* ) ;
    public final void rule__RestSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1303:1: ( ( ( rule__RestSystem__Group_5_3__0 )* ) )
            // InternalRest.g:1304:1: ( ( rule__RestSystem__Group_5_3__0 )* )
            {
            // InternalRest.g:1304:1: ( ( rule__RestSystem__Group_5_3__0 )* )
            // InternalRest.g:1305:2: ( rule__RestSystem__Group_5_3__0 )*
            {
             before(grammarAccess.getRestSystemAccess().getGroup_5_3()); 
            // InternalRest.g:1306:2: ( rule__RestSystem__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRest.g:1306:3: rule__RestSystem__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RestSystem__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRestSystemAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__RestSystem__Group_5__3__Impl"


    // $ANTLR start "rule__RestSystem__Group_5__4"
    // InternalRest.g:1314:1: rule__RestSystem__Group_5__4 : rule__RestSystem__Group_5__4__Impl ;
    public final void rule__RestSystem__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1318:1: ( rule__RestSystem__Group_5__4__Impl )
            // InternalRest.g:1319:2: rule__RestSystem__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_5__4__Impl();

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
    // $ANTLR end "rule__RestSystem__Group_5__4"


    // $ANTLR start "rule__RestSystem__Group_5__4__Impl"
    // InternalRest.g:1325:1: rule__RestSystem__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1329:1: ( ( '}' ) )
            // InternalRest.g:1330:1: ( '}' )
            {
            // InternalRest.g:1330:1: ( '}' )
            // InternalRest.g:1331:2: '}'
            {
             before(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__RestSystem__Group_5__4__Impl"


    // $ANTLR start "rule__RestSystem__Group_5_3__0"
    // InternalRest.g:1341:1: rule__RestSystem__Group_5_3__0 : rule__RestSystem__Group_5_3__0__Impl rule__RestSystem__Group_5_3__1 ;
    public final void rule__RestSystem__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1345:1: ( rule__RestSystem__Group_5_3__0__Impl rule__RestSystem__Group_5_3__1 )
            // InternalRest.g:1346:2: rule__RestSystem__Group_5_3__0__Impl rule__RestSystem__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__RestSystem__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_5_3__1();

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
    // $ANTLR end "rule__RestSystem__Group_5_3__0"


    // $ANTLR start "rule__RestSystem__Group_5_3__0__Impl"
    // InternalRest.g:1353:1: rule__RestSystem__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RestSystem__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1357:1: ( ( ',' ) )
            // InternalRest.g:1358:1: ( ',' )
            {
            // InternalRest.g:1358:1: ( ',' )
            // InternalRest.g:1359:2: ','
            {
             before(grammarAccess.getRestSystemAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__RestSystem__Group_5_3__0__Impl"


    // $ANTLR start "rule__RestSystem__Group_5_3__1"
    // InternalRest.g:1368:1: rule__RestSystem__Group_5_3__1 : rule__RestSystem__Group_5_3__1__Impl ;
    public final void rule__RestSystem__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1372:1: ( rule__RestSystem__Group_5_3__1__Impl )
            // InternalRest.g:1373:2: rule__RestSystem__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__RestSystem__Group_5_3__1"


    // $ANTLR start "rule__RestSystem__Group_5_3__1__Impl"
    // InternalRest.g:1379:1: rule__RestSystem__Group_5_3__1__Impl : ( ( rule__RestSystem__AnswersAssignment_5_3_1 ) ) ;
    public final void rule__RestSystem__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1383:1: ( ( ( rule__RestSystem__AnswersAssignment_5_3_1 ) ) )
            // InternalRest.g:1384:1: ( ( rule__RestSystem__AnswersAssignment_5_3_1 ) )
            {
            // InternalRest.g:1384:1: ( ( rule__RestSystem__AnswersAssignment_5_3_1 ) )
            // InternalRest.g:1385:2: ( rule__RestSystem__AnswersAssignment_5_3_1 )
            {
             before(grammarAccess.getRestSystemAccess().getAnswersAssignment_5_3_1()); 
            // InternalRest.g:1386:2: ( rule__RestSystem__AnswersAssignment_5_3_1 )
            // InternalRest.g:1386:3: rule__RestSystem__AnswersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__AnswersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getAnswersAssignment_5_3_1()); 

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
    // $ANTLR end "rule__RestSystem__Group_5_3__1__Impl"


    // $ANTLR start "rule__Struct__Group__0"
    // InternalRest.g:1395:1: rule__Struct__Group__0 : rule__Struct__Group__0__Impl rule__Struct__Group__1 ;
    public final void rule__Struct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1399:1: ( rule__Struct__Group__0__Impl rule__Struct__Group__1 )
            // InternalRest.g:1400:2: rule__Struct__Group__0__Impl rule__Struct__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Struct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group__1();

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
    // $ANTLR end "rule__Struct__Group__0"


    // $ANTLR start "rule__Struct__Group__0__Impl"
    // InternalRest.g:1407:1: rule__Struct__Group__0__Impl : ( () ) ;
    public final void rule__Struct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1411:1: ( ( () ) )
            // InternalRest.g:1412:1: ( () )
            {
            // InternalRest.g:1412:1: ( () )
            // InternalRest.g:1413:2: ()
            {
             before(grammarAccess.getStructAccess().getStructAction_0()); 
            // InternalRest.g:1414:2: ()
            // InternalRest.g:1414:3: 
            {
            }

             after(grammarAccess.getStructAccess().getStructAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__0__Impl"


    // $ANTLR start "rule__Struct__Group__1"
    // InternalRest.g:1422:1: rule__Struct__Group__1 : rule__Struct__Group__1__Impl rule__Struct__Group__2 ;
    public final void rule__Struct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1426:1: ( rule__Struct__Group__1__Impl rule__Struct__Group__2 )
            // InternalRest.g:1427:2: rule__Struct__Group__1__Impl rule__Struct__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Struct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group__2();

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
    // $ANTLR end "rule__Struct__Group__1"


    // $ANTLR start "rule__Struct__Group__1__Impl"
    // InternalRest.g:1434:1: rule__Struct__Group__1__Impl : ( 'Struct' ) ;
    public final void rule__Struct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1438:1: ( ( 'Struct' ) )
            // InternalRest.g:1439:1: ( 'Struct' )
            {
            // InternalRest.g:1439:1: ( 'Struct' )
            // InternalRest.g:1440:2: 'Struct'
            {
             before(grammarAccess.getStructAccess().getStructKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getStructKeyword_1()); 

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
    // $ANTLR end "rule__Struct__Group__1__Impl"


    // $ANTLR start "rule__Struct__Group__2"
    // InternalRest.g:1449:1: rule__Struct__Group__2 : rule__Struct__Group__2__Impl rule__Struct__Group__3 ;
    public final void rule__Struct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1453:1: ( rule__Struct__Group__2__Impl rule__Struct__Group__3 )
            // InternalRest.g:1454:2: rule__Struct__Group__2__Impl rule__Struct__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Struct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group__3();

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
    // $ANTLR end "rule__Struct__Group__2"


    // $ANTLR start "rule__Struct__Group__2__Impl"
    // InternalRest.g:1461:1: rule__Struct__Group__2__Impl : ( ( rule__Struct__NameAssignment_2 ) ) ;
    public final void rule__Struct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1465:1: ( ( ( rule__Struct__NameAssignment_2 ) ) )
            // InternalRest.g:1466:1: ( ( rule__Struct__NameAssignment_2 ) )
            {
            // InternalRest.g:1466:1: ( ( rule__Struct__NameAssignment_2 ) )
            // InternalRest.g:1467:2: ( rule__Struct__NameAssignment_2 )
            {
             before(grammarAccess.getStructAccess().getNameAssignment_2()); 
            // InternalRest.g:1468:2: ( rule__Struct__NameAssignment_2 )
            // InternalRest.g:1468:3: rule__Struct__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Struct__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Struct__Group__2__Impl"


    // $ANTLR start "rule__Struct__Group__3"
    // InternalRest.g:1476:1: rule__Struct__Group__3 : rule__Struct__Group__3__Impl rule__Struct__Group__4 ;
    public final void rule__Struct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1480:1: ( rule__Struct__Group__3__Impl rule__Struct__Group__4 )
            // InternalRest.g:1481:2: rule__Struct__Group__3__Impl rule__Struct__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Struct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group__4();

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
    // $ANTLR end "rule__Struct__Group__3"


    // $ANTLR start "rule__Struct__Group__3__Impl"
    // InternalRest.g:1488:1: rule__Struct__Group__3__Impl : ( '{' ) ;
    public final void rule__Struct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1492:1: ( ( '{' ) )
            // InternalRest.g:1493:1: ( '{' )
            {
            // InternalRest.g:1493:1: ( '{' )
            // InternalRest.g:1494:2: '{'
            {
             before(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Struct__Group__3__Impl"


    // $ANTLR start "rule__Struct__Group__4"
    // InternalRest.g:1503:1: rule__Struct__Group__4 : rule__Struct__Group__4__Impl rule__Struct__Group__5 ;
    public final void rule__Struct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1507:1: ( rule__Struct__Group__4__Impl rule__Struct__Group__5 )
            // InternalRest.g:1508:2: rule__Struct__Group__4__Impl rule__Struct__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Struct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group__5();

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
    // $ANTLR end "rule__Struct__Group__4"


    // $ANTLR start "rule__Struct__Group__4__Impl"
    // InternalRest.g:1515:1: rule__Struct__Group__4__Impl : ( ( rule__Struct__Group_4__0 )? ) ;
    public final void rule__Struct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1519:1: ( ( ( rule__Struct__Group_4__0 )? ) )
            // InternalRest.g:1520:1: ( ( rule__Struct__Group_4__0 )? )
            {
            // InternalRest.g:1520:1: ( ( rule__Struct__Group_4__0 )? )
            // InternalRest.g:1521:2: ( rule__Struct__Group_4__0 )?
            {
             before(grammarAccess.getStructAccess().getGroup_4()); 
            // InternalRest.g:1522:2: ( rule__Struct__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRest.g:1522:3: rule__Struct__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Struct__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Struct__Group__4__Impl"


    // $ANTLR start "rule__Struct__Group__5"
    // InternalRest.g:1530:1: rule__Struct__Group__5 : rule__Struct__Group__5__Impl ;
    public final void rule__Struct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1534:1: ( rule__Struct__Group__5__Impl )
            // InternalRest.g:1535:2: rule__Struct__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Struct__Group__5__Impl();

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
    // $ANTLR end "rule__Struct__Group__5"


    // $ANTLR start "rule__Struct__Group__5__Impl"
    // InternalRest.g:1541:1: rule__Struct__Group__5__Impl : ( '}' ) ;
    public final void rule__Struct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1545:1: ( ( '}' ) )
            // InternalRest.g:1546:1: ( '}' )
            {
            // InternalRest.g:1546:1: ( '}' )
            // InternalRest.g:1547:2: '}'
            {
             before(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Struct__Group__5__Impl"


    // $ANTLR start "rule__Struct__Group_4__0"
    // InternalRest.g:1557:1: rule__Struct__Group_4__0 : rule__Struct__Group_4__0__Impl rule__Struct__Group_4__1 ;
    public final void rule__Struct__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1561:1: ( rule__Struct__Group_4__0__Impl rule__Struct__Group_4__1 )
            // InternalRest.g:1562:2: rule__Struct__Group_4__0__Impl rule__Struct__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Struct__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group_4__1();

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
    // $ANTLR end "rule__Struct__Group_4__0"


    // $ANTLR start "rule__Struct__Group_4__0__Impl"
    // InternalRest.g:1569:1: rule__Struct__Group_4__0__Impl : ( 'fields' ) ;
    public final void rule__Struct__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1573:1: ( ( 'fields' ) )
            // InternalRest.g:1574:1: ( 'fields' )
            {
            // InternalRest.g:1574:1: ( 'fields' )
            // InternalRest.g:1575:2: 'fields'
            {
             before(grammarAccess.getStructAccess().getFieldsKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getFieldsKeyword_4_0()); 

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
    // $ANTLR end "rule__Struct__Group_4__0__Impl"


    // $ANTLR start "rule__Struct__Group_4__1"
    // InternalRest.g:1584:1: rule__Struct__Group_4__1 : rule__Struct__Group_4__1__Impl rule__Struct__Group_4__2 ;
    public final void rule__Struct__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1588:1: ( rule__Struct__Group_4__1__Impl rule__Struct__Group_4__2 )
            // InternalRest.g:1589:2: rule__Struct__Group_4__1__Impl rule__Struct__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Struct__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group_4__2();

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
    // $ANTLR end "rule__Struct__Group_4__1"


    // $ANTLR start "rule__Struct__Group_4__1__Impl"
    // InternalRest.g:1596:1: rule__Struct__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Struct__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1600:1: ( ( '{' ) )
            // InternalRest.g:1601:1: ( '{' )
            {
            // InternalRest.g:1601:1: ( '{' )
            // InternalRest.g:1602:2: '{'
            {
             before(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Struct__Group_4__1__Impl"


    // $ANTLR start "rule__Struct__Group_4__2"
    // InternalRest.g:1611:1: rule__Struct__Group_4__2 : rule__Struct__Group_4__2__Impl rule__Struct__Group_4__3 ;
    public final void rule__Struct__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1615:1: ( rule__Struct__Group_4__2__Impl rule__Struct__Group_4__3 )
            // InternalRest.g:1616:2: rule__Struct__Group_4__2__Impl rule__Struct__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Struct__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group_4__3();

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
    // $ANTLR end "rule__Struct__Group_4__2"


    // $ANTLR start "rule__Struct__Group_4__2__Impl"
    // InternalRest.g:1623:1: rule__Struct__Group_4__2__Impl : ( ( rule__Struct__FieldsAssignment_4_2 ) ) ;
    public final void rule__Struct__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1627:1: ( ( ( rule__Struct__FieldsAssignment_4_2 ) ) )
            // InternalRest.g:1628:1: ( ( rule__Struct__FieldsAssignment_4_2 ) )
            {
            // InternalRest.g:1628:1: ( ( rule__Struct__FieldsAssignment_4_2 ) )
            // InternalRest.g:1629:2: ( rule__Struct__FieldsAssignment_4_2 )
            {
             before(grammarAccess.getStructAccess().getFieldsAssignment_4_2()); 
            // InternalRest.g:1630:2: ( rule__Struct__FieldsAssignment_4_2 )
            // InternalRest.g:1630:3: rule__Struct__FieldsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Struct__FieldsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getFieldsAssignment_4_2()); 

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
    // $ANTLR end "rule__Struct__Group_4__2__Impl"


    // $ANTLR start "rule__Struct__Group_4__3"
    // InternalRest.g:1638:1: rule__Struct__Group_4__3 : rule__Struct__Group_4__3__Impl rule__Struct__Group_4__4 ;
    public final void rule__Struct__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1642:1: ( rule__Struct__Group_4__3__Impl rule__Struct__Group_4__4 )
            // InternalRest.g:1643:2: rule__Struct__Group_4__3__Impl rule__Struct__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Struct__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group_4__4();

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
    // $ANTLR end "rule__Struct__Group_4__3"


    // $ANTLR start "rule__Struct__Group_4__3__Impl"
    // InternalRest.g:1650:1: rule__Struct__Group_4__3__Impl : ( ( rule__Struct__Group_4_3__0 )* ) ;
    public final void rule__Struct__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1654:1: ( ( ( rule__Struct__Group_4_3__0 )* ) )
            // InternalRest.g:1655:1: ( ( rule__Struct__Group_4_3__0 )* )
            {
            // InternalRest.g:1655:1: ( ( rule__Struct__Group_4_3__0 )* )
            // InternalRest.g:1656:2: ( rule__Struct__Group_4_3__0 )*
            {
             before(grammarAccess.getStructAccess().getGroup_4_3()); 
            // InternalRest.g:1657:2: ( rule__Struct__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRest.g:1657:3: rule__Struct__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Struct__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStructAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Struct__Group_4__3__Impl"


    // $ANTLR start "rule__Struct__Group_4__4"
    // InternalRest.g:1665:1: rule__Struct__Group_4__4 : rule__Struct__Group_4__4__Impl ;
    public final void rule__Struct__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1669:1: ( rule__Struct__Group_4__4__Impl )
            // InternalRest.g:1670:2: rule__Struct__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Struct__Group_4__4__Impl();

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
    // $ANTLR end "rule__Struct__Group_4__4"


    // $ANTLR start "rule__Struct__Group_4__4__Impl"
    // InternalRest.g:1676:1: rule__Struct__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Struct__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1680:1: ( ( '}' ) )
            // InternalRest.g:1681:1: ( '}' )
            {
            // InternalRest.g:1681:1: ( '}' )
            // InternalRest.g:1682:2: '}'
            {
             before(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Struct__Group_4__4__Impl"


    // $ANTLR start "rule__Struct__Group_4_3__0"
    // InternalRest.g:1692:1: rule__Struct__Group_4_3__0 : rule__Struct__Group_4_3__0__Impl rule__Struct__Group_4_3__1 ;
    public final void rule__Struct__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1696:1: ( rule__Struct__Group_4_3__0__Impl rule__Struct__Group_4_3__1 )
            // InternalRest.g:1697:2: rule__Struct__Group_4_3__0__Impl rule__Struct__Group_4_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Struct__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group_4_3__1();

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
    // $ANTLR end "rule__Struct__Group_4_3__0"


    // $ANTLR start "rule__Struct__Group_4_3__0__Impl"
    // InternalRest.g:1704:1: rule__Struct__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Struct__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1708:1: ( ( ',' ) )
            // InternalRest.g:1709:1: ( ',' )
            {
            // InternalRest.g:1709:1: ( ',' )
            // InternalRest.g:1710:2: ','
            {
             before(grammarAccess.getStructAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Struct__Group_4_3__0__Impl"


    // $ANTLR start "rule__Struct__Group_4_3__1"
    // InternalRest.g:1719:1: rule__Struct__Group_4_3__1 : rule__Struct__Group_4_3__1__Impl ;
    public final void rule__Struct__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1723:1: ( rule__Struct__Group_4_3__1__Impl )
            // InternalRest.g:1724:2: rule__Struct__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Struct__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Struct__Group_4_3__1"


    // $ANTLR start "rule__Struct__Group_4_3__1__Impl"
    // InternalRest.g:1730:1: rule__Struct__Group_4_3__1__Impl : ( ( rule__Struct__FieldsAssignment_4_3_1 ) ) ;
    public final void rule__Struct__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1734:1: ( ( ( rule__Struct__FieldsAssignment_4_3_1 ) ) )
            // InternalRest.g:1735:1: ( ( rule__Struct__FieldsAssignment_4_3_1 ) )
            {
            // InternalRest.g:1735:1: ( ( rule__Struct__FieldsAssignment_4_3_1 ) )
            // InternalRest.g:1736:2: ( rule__Struct__FieldsAssignment_4_3_1 )
            {
             before(grammarAccess.getStructAccess().getFieldsAssignment_4_3_1()); 
            // InternalRest.g:1737:2: ( rule__Struct__FieldsAssignment_4_3_1 )
            // InternalRest.g:1737:3: rule__Struct__FieldsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Struct__FieldsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getFieldsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Struct__Group_4_3__1__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // InternalRest.g:1746:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1750:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // InternalRest.g:1751:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group__1();

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
    // $ANTLR end "rule__Answer__Group__0"


    // $ANTLR start "rule__Answer__Group__0__Impl"
    // InternalRest.g:1758:1: rule__Answer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1762:1: ( ( 'Answer' ) )
            // InternalRest.g:1763:1: ( 'Answer' )
            {
            // InternalRest.g:1763:1: ( 'Answer' )
            // InternalRest.g:1764:2: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 

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
    // $ANTLR end "rule__Answer__Group__0__Impl"


    // $ANTLR start "rule__Answer__Group__1"
    // InternalRest.g:1773:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1777:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // InternalRest.g:1778:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group__2();

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
    // $ANTLR end "rule__Answer__Group__1"


    // $ANTLR start "rule__Answer__Group__1__Impl"
    // InternalRest.g:1785:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__NameAssignment_1 ) ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1789:1: ( ( ( rule__Answer__NameAssignment_1 ) ) )
            // InternalRest.g:1790:1: ( ( rule__Answer__NameAssignment_1 ) )
            {
            // InternalRest.g:1790:1: ( ( rule__Answer__NameAssignment_1 ) )
            // InternalRest.g:1791:2: ( rule__Answer__NameAssignment_1 )
            {
             before(grammarAccess.getAnswerAccess().getNameAssignment_1()); 
            // InternalRest.g:1792:2: ( rule__Answer__NameAssignment_1 )
            // InternalRest.g:1792:3: rule__Answer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Answer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Answer__Group__1__Impl"


    // $ANTLR start "rule__Answer__Group__2"
    // InternalRest.g:1800:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1804:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // InternalRest.g:1805:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group__3();

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
    // $ANTLR end "rule__Answer__Group__2"


    // $ANTLR start "rule__Answer__Group__2__Impl"
    // InternalRest.g:1812:1: rule__Answer__Group__2__Impl : ( '{' ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1816:1: ( ( '{' ) )
            // InternalRest.g:1817:1: ( '{' )
            {
            // InternalRest.g:1817:1: ( '{' )
            // InternalRest.g:1818:2: '{'
            {
             before(grammarAccess.getAnswerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Answer__Group__2__Impl"


    // $ANTLR start "rule__Answer__Group__3"
    // InternalRest.g:1827:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl rule__Answer__Group__4 ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1831:1: ( rule__Answer__Group__3__Impl rule__Answer__Group__4 )
            // InternalRest.g:1832:2: rule__Answer__Group__3__Impl rule__Answer__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Answer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group__4();

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
    // $ANTLR end "rule__Answer__Group__3"


    // $ANTLR start "rule__Answer__Group__3__Impl"
    // InternalRest.g:1839:1: rule__Answer__Group__3__Impl : ( 'status' ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1843:1: ( ( 'status' ) )
            // InternalRest.g:1844:1: ( 'status' )
            {
            // InternalRest.g:1844:1: ( 'status' )
            // InternalRest.g:1845:2: 'status'
            {
             before(grammarAccess.getAnswerAccess().getStatusKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getStatusKeyword_3()); 

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
    // $ANTLR end "rule__Answer__Group__3__Impl"


    // $ANTLR start "rule__Answer__Group__4"
    // InternalRest.g:1854:1: rule__Answer__Group__4 : rule__Answer__Group__4__Impl rule__Answer__Group__5 ;
    public final void rule__Answer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1858:1: ( rule__Answer__Group__4__Impl rule__Answer__Group__5 )
            // InternalRest.g:1859:2: rule__Answer__Group__4__Impl rule__Answer__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Answer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group__5();

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
    // $ANTLR end "rule__Answer__Group__4"


    // $ANTLR start "rule__Answer__Group__4__Impl"
    // InternalRest.g:1866:1: rule__Answer__Group__4__Impl : ( ( rule__Answer__StatusAssignment_4 ) ) ;
    public final void rule__Answer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1870:1: ( ( ( rule__Answer__StatusAssignment_4 ) ) )
            // InternalRest.g:1871:1: ( ( rule__Answer__StatusAssignment_4 ) )
            {
            // InternalRest.g:1871:1: ( ( rule__Answer__StatusAssignment_4 ) )
            // InternalRest.g:1872:2: ( rule__Answer__StatusAssignment_4 )
            {
             before(grammarAccess.getAnswerAccess().getStatusAssignment_4()); 
            // InternalRest.g:1873:2: ( rule__Answer__StatusAssignment_4 )
            // InternalRest.g:1873:3: rule__Answer__StatusAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Answer__StatusAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getStatusAssignment_4()); 

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
    // $ANTLR end "rule__Answer__Group__4__Impl"


    // $ANTLR start "rule__Answer__Group__5"
    // InternalRest.g:1881:1: rule__Answer__Group__5 : rule__Answer__Group__5__Impl rule__Answer__Group__6 ;
    public final void rule__Answer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1885:1: ( rule__Answer__Group__5__Impl rule__Answer__Group__6 )
            // InternalRest.g:1886:2: rule__Answer__Group__5__Impl rule__Answer__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Answer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group__6();

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
    // $ANTLR end "rule__Answer__Group__5"


    // $ANTLR start "rule__Answer__Group__5__Impl"
    // InternalRest.g:1893:1: rule__Answer__Group__5__Impl : ( ( rule__Answer__Group_5__0 )? ) ;
    public final void rule__Answer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1897:1: ( ( ( rule__Answer__Group_5__0 )? ) )
            // InternalRest.g:1898:1: ( ( rule__Answer__Group_5__0 )? )
            {
            // InternalRest.g:1898:1: ( ( rule__Answer__Group_5__0 )? )
            // InternalRest.g:1899:2: ( rule__Answer__Group_5__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_5()); 
            // InternalRest.g:1900:2: ( rule__Answer__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRest.g:1900:3: rule__Answer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Answer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Answer__Group__5__Impl"


    // $ANTLR start "rule__Answer__Group__6"
    // InternalRest.g:1908:1: rule__Answer__Group__6 : rule__Answer__Group__6__Impl ;
    public final void rule__Answer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1912:1: ( rule__Answer__Group__6__Impl )
            // InternalRest.g:1913:2: rule__Answer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Answer__Group__6__Impl();

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
    // $ANTLR end "rule__Answer__Group__6"


    // $ANTLR start "rule__Answer__Group__6__Impl"
    // InternalRest.g:1919:1: rule__Answer__Group__6__Impl : ( '}' ) ;
    public final void rule__Answer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1923:1: ( ( '}' ) )
            // InternalRest.g:1924:1: ( '}' )
            {
            // InternalRest.g:1924:1: ( '}' )
            // InternalRest.g:1925:2: '}'
            {
             before(grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Answer__Group__6__Impl"


    // $ANTLR start "rule__Answer__Group_5__0"
    // InternalRest.g:1935:1: rule__Answer__Group_5__0 : rule__Answer__Group_5__0__Impl rule__Answer__Group_5__1 ;
    public final void rule__Answer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1939:1: ( rule__Answer__Group_5__0__Impl rule__Answer__Group_5__1 )
            // InternalRest.g:1940:2: rule__Answer__Group_5__0__Impl rule__Answer__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Answer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group_5__1();

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
    // $ANTLR end "rule__Answer__Group_5__0"


    // $ANTLR start "rule__Answer__Group_5__0__Impl"
    // InternalRest.g:1947:1: rule__Answer__Group_5__0__Impl : ( 'return' ) ;
    public final void rule__Answer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1951:1: ( ( 'return' ) )
            // InternalRest.g:1952:1: ( 'return' )
            {
            // InternalRest.g:1952:1: ( 'return' )
            // InternalRest.g:1953:2: 'return'
            {
             before(grammarAccess.getAnswerAccess().getReturnKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getReturnKeyword_5_0()); 

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
    // $ANTLR end "rule__Answer__Group_5__0__Impl"


    // $ANTLR start "rule__Answer__Group_5__1"
    // InternalRest.g:1962:1: rule__Answer__Group_5__1 : rule__Answer__Group_5__1__Impl ;
    public final void rule__Answer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1966:1: ( rule__Answer__Group_5__1__Impl )
            // InternalRest.g:1967:2: rule__Answer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Answer__Group_5__1__Impl();

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
    // $ANTLR end "rule__Answer__Group_5__1"


    // $ANTLR start "rule__Answer__Group_5__1__Impl"
    // InternalRest.g:1973:1: rule__Answer__Group_5__1__Impl : ( ( rule__Answer__ReturnAssignment_5_1 ) ) ;
    public final void rule__Answer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1977:1: ( ( ( rule__Answer__ReturnAssignment_5_1 ) ) )
            // InternalRest.g:1978:1: ( ( rule__Answer__ReturnAssignment_5_1 ) )
            {
            // InternalRest.g:1978:1: ( ( rule__Answer__ReturnAssignment_5_1 ) )
            // InternalRest.g:1979:2: ( rule__Answer__ReturnAssignment_5_1 )
            {
             before(grammarAccess.getAnswerAccess().getReturnAssignment_5_1()); 
            // InternalRest.g:1980:2: ( rule__Answer__ReturnAssignment_5_1 )
            // InternalRest.g:1980:3: rule__Answer__ReturnAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Answer__ReturnAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getReturnAssignment_5_1()); 

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
    // $ANTLR end "rule__Answer__Group_5__1__Impl"


    // $ANTLR start "rule__Route__Group__0"
    // InternalRest.g:1989:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1993:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // InternalRest.g:1994:2: rule__Route__Group__0__Impl rule__Route__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Route__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__1();

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
    // $ANTLR end "rule__Route__Group__0"


    // $ANTLR start "rule__Route__Group__0__Impl"
    // InternalRest.g:2001:1: rule__Route__Group__0__Impl : ( 'Route' ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2005:1: ( ( 'Route' ) )
            // InternalRest.g:2006:1: ( 'Route' )
            {
            // InternalRest.g:2006:1: ( 'Route' )
            // InternalRest.g:2007:2: 'Route'
            {
             before(grammarAccess.getRouteAccess().getRouteKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getRouteKeyword_0()); 

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
    // $ANTLR end "rule__Route__Group__0__Impl"


    // $ANTLR start "rule__Route__Group__1"
    // InternalRest.g:2016:1: rule__Route__Group__1 : rule__Route__Group__1__Impl rule__Route__Group__2 ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2020:1: ( rule__Route__Group__1__Impl rule__Route__Group__2 )
            // InternalRest.g:2021:2: rule__Route__Group__1__Impl rule__Route__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Route__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__2();

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
    // $ANTLR end "rule__Route__Group__1"


    // $ANTLR start "rule__Route__Group__1__Impl"
    // InternalRest.g:2028:1: rule__Route__Group__1__Impl : ( '{' ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2032:1: ( ( '{' ) )
            // InternalRest.g:2033:1: ( '{' )
            {
            // InternalRest.g:2033:1: ( '{' )
            // InternalRest.g:2034:2: '{'
            {
             before(grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Route__Group__1__Impl"


    // $ANTLR start "rule__Route__Group__2"
    // InternalRest.g:2043:1: rule__Route__Group__2 : rule__Route__Group__2__Impl rule__Route__Group__3 ;
    public final void rule__Route__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2047:1: ( rule__Route__Group__2__Impl rule__Route__Group__3 )
            // InternalRest.g:2048:2: rule__Route__Group__2__Impl rule__Route__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Route__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__3();

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
    // $ANTLR end "rule__Route__Group__2"


    // $ANTLR start "rule__Route__Group__2__Impl"
    // InternalRest.g:2055:1: rule__Route__Group__2__Impl : ( 'segments' ) ;
    public final void rule__Route__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2059:1: ( ( 'segments' ) )
            // InternalRest.g:2060:1: ( 'segments' )
            {
            // InternalRest.g:2060:1: ( 'segments' )
            // InternalRest.g:2061:2: 'segments'
            {
             before(grammarAccess.getRouteAccess().getSegmentsKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getSegmentsKeyword_2()); 

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
    // $ANTLR end "rule__Route__Group__2__Impl"


    // $ANTLR start "rule__Route__Group__3"
    // InternalRest.g:2070:1: rule__Route__Group__3 : rule__Route__Group__3__Impl rule__Route__Group__4 ;
    public final void rule__Route__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2074:1: ( rule__Route__Group__3__Impl rule__Route__Group__4 )
            // InternalRest.g:2075:2: rule__Route__Group__3__Impl rule__Route__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Route__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__4();

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
    // $ANTLR end "rule__Route__Group__3"


    // $ANTLR start "rule__Route__Group__3__Impl"
    // InternalRest.g:2082:1: rule__Route__Group__3__Impl : ( '{' ) ;
    public final void rule__Route__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2086:1: ( ( '{' ) )
            // InternalRest.g:2087:1: ( '{' )
            {
            // InternalRest.g:2087:1: ( '{' )
            // InternalRest.g:2088:2: '{'
            {
             before(grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Route__Group__3__Impl"


    // $ANTLR start "rule__Route__Group__4"
    // InternalRest.g:2097:1: rule__Route__Group__4 : rule__Route__Group__4__Impl rule__Route__Group__5 ;
    public final void rule__Route__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2101:1: ( rule__Route__Group__4__Impl rule__Route__Group__5 )
            // InternalRest.g:2102:2: rule__Route__Group__4__Impl rule__Route__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Route__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__5();

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
    // $ANTLR end "rule__Route__Group__4"


    // $ANTLR start "rule__Route__Group__4__Impl"
    // InternalRest.g:2109:1: rule__Route__Group__4__Impl : ( ( rule__Route__SegmentsAssignment_4 ) ) ;
    public final void rule__Route__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2113:1: ( ( ( rule__Route__SegmentsAssignment_4 ) ) )
            // InternalRest.g:2114:1: ( ( rule__Route__SegmentsAssignment_4 ) )
            {
            // InternalRest.g:2114:1: ( ( rule__Route__SegmentsAssignment_4 ) )
            // InternalRest.g:2115:2: ( rule__Route__SegmentsAssignment_4 )
            {
             before(grammarAccess.getRouteAccess().getSegmentsAssignment_4()); 
            // InternalRest.g:2116:2: ( rule__Route__SegmentsAssignment_4 )
            // InternalRest.g:2116:3: rule__Route__SegmentsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Route__SegmentsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getSegmentsAssignment_4()); 

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
    // $ANTLR end "rule__Route__Group__4__Impl"


    // $ANTLR start "rule__Route__Group__5"
    // InternalRest.g:2124:1: rule__Route__Group__5 : rule__Route__Group__5__Impl rule__Route__Group__6 ;
    public final void rule__Route__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2128:1: ( rule__Route__Group__5__Impl rule__Route__Group__6 )
            // InternalRest.g:2129:2: rule__Route__Group__5__Impl rule__Route__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Route__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__6();

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
    // $ANTLR end "rule__Route__Group__5"


    // $ANTLR start "rule__Route__Group__5__Impl"
    // InternalRest.g:2136:1: rule__Route__Group__5__Impl : ( ( rule__Route__Group_5__0 )* ) ;
    public final void rule__Route__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2140:1: ( ( ( rule__Route__Group_5__0 )* ) )
            // InternalRest.g:2141:1: ( ( rule__Route__Group_5__0 )* )
            {
            // InternalRest.g:2141:1: ( ( rule__Route__Group_5__0 )* )
            // InternalRest.g:2142:2: ( rule__Route__Group_5__0 )*
            {
             before(grammarAccess.getRouteAccess().getGroup_5()); 
            // InternalRest.g:2143:2: ( rule__Route__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRest.g:2143:3: rule__Route__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Route__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRouteAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Route__Group__5__Impl"


    // $ANTLR start "rule__Route__Group__6"
    // InternalRest.g:2151:1: rule__Route__Group__6 : rule__Route__Group__6__Impl rule__Route__Group__7 ;
    public final void rule__Route__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2155:1: ( rule__Route__Group__6__Impl rule__Route__Group__7 )
            // InternalRest.g:2156:2: rule__Route__Group__6__Impl rule__Route__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Route__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__7();

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
    // $ANTLR end "rule__Route__Group__6"


    // $ANTLR start "rule__Route__Group__6__Impl"
    // InternalRest.g:2163:1: rule__Route__Group__6__Impl : ( '}' ) ;
    public final void rule__Route__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2167:1: ( ( '}' ) )
            // InternalRest.g:2168:1: ( '}' )
            {
            // InternalRest.g:2168:1: ( '}' )
            // InternalRest.g:2169:2: '}'
            {
             before(grammarAccess.getRouteAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Route__Group__6__Impl"


    // $ANTLR start "rule__Route__Group__7"
    // InternalRest.g:2178:1: rule__Route__Group__7 : rule__Route__Group__7__Impl ;
    public final void rule__Route__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2182:1: ( rule__Route__Group__7__Impl )
            // InternalRest.g:2183:2: rule__Route__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__7__Impl();

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
    // $ANTLR end "rule__Route__Group__7"


    // $ANTLR start "rule__Route__Group__7__Impl"
    // InternalRest.g:2189:1: rule__Route__Group__7__Impl : ( '}' ) ;
    public final void rule__Route__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2193:1: ( ( '}' ) )
            // InternalRest.g:2194:1: ( '}' )
            {
            // InternalRest.g:2194:1: ( '}' )
            // InternalRest.g:2195:2: '}'
            {
             before(grammarAccess.getRouteAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Route__Group__7__Impl"


    // $ANTLR start "rule__Route__Group_5__0"
    // InternalRest.g:2205:1: rule__Route__Group_5__0 : rule__Route__Group_5__0__Impl rule__Route__Group_5__1 ;
    public final void rule__Route__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2209:1: ( rule__Route__Group_5__0__Impl rule__Route__Group_5__1 )
            // InternalRest.g:2210:2: rule__Route__Group_5__0__Impl rule__Route__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Route__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group_5__1();

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
    // $ANTLR end "rule__Route__Group_5__0"


    // $ANTLR start "rule__Route__Group_5__0__Impl"
    // InternalRest.g:2217:1: rule__Route__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Route__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2221:1: ( ( ',' ) )
            // InternalRest.g:2222:1: ( ',' )
            {
            // InternalRest.g:2222:1: ( ',' )
            // InternalRest.g:2223:2: ','
            {
             before(grammarAccess.getRouteAccess().getCommaKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Route__Group_5__0__Impl"


    // $ANTLR start "rule__Route__Group_5__1"
    // InternalRest.g:2232:1: rule__Route__Group_5__1 : rule__Route__Group_5__1__Impl ;
    public final void rule__Route__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2236:1: ( rule__Route__Group_5__1__Impl )
            // InternalRest.g:2237:2: rule__Route__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group_5__1__Impl();

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
    // $ANTLR end "rule__Route__Group_5__1"


    // $ANTLR start "rule__Route__Group_5__1__Impl"
    // InternalRest.g:2243:1: rule__Route__Group_5__1__Impl : ( ( rule__Route__SegmentsAssignment_5_1 ) ) ;
    public final void rule__Route__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2247:1: ( ( ( rule__Route__SegmentsAssignment_5_1 ) ) )
            // InternalRest.g:2248:1: ( ( rule__Route__SegmentsAssignment_5_1 ) )
            {
            // InternalRest.g:2248:1: ( ( rule__Route__SegmentsAssignment_5_1 ) )
            // InternalRest.g:2249:2: ( rule__Route__SegmentsAssignment_5_1 )
            {
             before(grammarAccess.getRouteAccess().getSegmentsAssignment_5_1()); 
            // InternalRest.g:2250:2: ( rule__Route__SegmentsAssignment_5_1 )
            // InternalRest.g:2250:3: rule__Route__SegmentsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Route__SegmentsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getSegmentsAssignment_5_1()); 

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
    // $ANTLR end "rule__Route__Group_5__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalRest.g:2259:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2263:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalRest.g:2264:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalRest.g:2271:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2275:1: ( ( () ) )
            // InternalRest.g:2276:1: ( () )
            {
            // InternalRest.g:2276:1: ( () )
            // InternalRest.g:2277:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalRest.g:2278:2: ()
            // InternalRest.g:2278:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalRest.g:2286:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2290:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalRest.g:2291:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalRest.g:2298:1: rule__Parameter__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2302:1: ( ( 'Parameter' ) )
            // InternalRest.g:2303:1: ( 'Parameter' )
            {
            // InternalRest.g:2303:1: ( 'Parameter' )
            // InternalRest.g:2304:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalRest.g:2313:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2317:1: ( rule__Parameter__Group__2__Impl )
            // InternalRest.g:2318:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalRest.g:2324:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2328:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalRest.g:2329:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalRest.g:2329:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalRest.g:2330:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalRest.g:2331:2: ( rule__Parameter__NameAssignment_2 )
            // InternalRest.g:2331:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__ReGet__Group__0"
    // InternalRest.g:2340:1: rule__ReGet__Group__0 : rule__ReGet__Group__0__Impl rule__ReGet__Group__1 ;
    public final void rule__ReGet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2344:1: ( rule__ReGet__Group__0__Impl rule__ReGet__Group__1 )
            // InternalRest.g:2345:2: rule__ReGet__Group__0__Impl rule__ReGet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ReGet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group__1();

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
    // $ANTLR end "rule__ReGet__Group__0"


    // $ANTLR start "rule__ReGet__Group__0__Impl"
    // InternalRest.g:2352:1: rule__ReGet__Group__0__Impl : ( 'ReGet' ) ;
    public final void rule__ReGet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2356:1: ( ( 'ReGet' ) )
            // InternalRest.g:2357:1: ( 'ReGet' )
            {
            // InternalRest.g:2357:1: ( 'ReGet' )
            // InternalRest.g:2358:2: 'ReGet'
            {
             before(grammarAccess.getReGetAccess().getReGetKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getReGetKeyword_0()); 

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
    // $ANTLR end "rule__ReGet__Group__0__Impl"


    // $ANTLR start "rule__ReGet__Group__1"
    // InternalRest.g:2367:1: rule__ReGet__Group__1 : rule__ReGet__Group__1__Impl rule__ReGet__Group__2 ;
    public final void rule__ReGet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2371:1: ( rule__ReGet__Group__1__Impl rule__ReGet__Group__2 )
            // InternalRest.g:2372:2: rule__ReGet__Group__1__Impl rule__ReGet__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ReGet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group__2();

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
    // $ANTLR end "rule__ReGet__Group__1"


    // $ANTLR start "rule__ReGet__Group__1__Impl"
    // InternalRest.g:2379:1: rule__ReGet__Group__1__Impl : ( '{' ) ;
    public final void rule__ReGet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2383:1: ( ( '{' ) )
            // InternalRest.g:2384:1: ( '{' )
            {
            // InternalRest.g:2384:1: ( '{' )
            // InternalRest.g:2385:2: '{'
            {
             before(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ReGet__Group__1__Impl"


    // $ANTLR start "rule__ReGet__Group__2"
    // InternalRest.g:2394:1: rule__ReGet__Group__2 : rule__ReGet__Group__2__Impl rule__ReGet__Group__3 ;
    public final void rule__ReGet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2398:1: ( rule__ReGet__Group__2__Impl rule__ReGet__Group__3 )
            // InternalRest.g:2399:2: rule__ReGet__Group__2__Impl rule__ReGet__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ReGet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group__3();

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
    // $ANTLR end "rule__ReGet__Group__2"


    // $ANTLR start "rule__ReGet__Group__2__Impl"
    // InternalRest.g:2406:1: rule__ReGet__Group__2__Impl : ( 'succAnswer' ) ;
    public final void rule__ReGet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2410:1: ( ( 'succAnswer' ) )
            // InternalRest.g:2411:1: ( 'succAnswer' )
            {
            // InternalRest.g:2411:1: ( 'succAnswer' )
            // InternalRest.g:2412:2: 'succAnswer'
            {
             before(grammarAccess.getReGetAccess().getSuccAnswerKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getSuccAnswerKeyword_2()); 

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
    // $ANTLR end "rule__ReGet__Group__2__Impl"


    // $ANTLR start "rule__ReGet__Group__3"
    // InternalRest.g:2421:1: rule__ReGet__Group__3 : rule__ReGet__Group__3__Impl rule__ReGet__Group__4 ;
    public final void rule__ReGet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2425:1: ( rule__ReGet__Group__3__Impl rule__ReGet__Group__4 )
            // InternalRest.g:2426:2: rule__ReGet__Group__3__Impl rule__ReGet__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ReGet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group__4();

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
    // $ANTLR end "rule__ReGet__Group__3"


    // $ANTLR start "rule__ReGet__Group__3__Impl"
    // InternalRest.g:2433:1: rule__ReGet__Group__3__Impl : ( ( rule__ReGet__SuccAnswerAssignment_3 ) ) ;
    public final void rule__ReGet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2437:1: ( ( ( rule__ReGet__SuccAnswerAssignment_3 ) ) )
            // InternalRest.g:2438:1: ( ( rule__ReGet__SuccAnswerAssignment_3 ) )
            {
            // InternalRest.g:2438:1: ( ( rule__ReGet__SuccAnswerAssignment_3 ) )
            // InternalRest.g:2439:2: ( rule__ReGet__SuccAnswerAssignment_3 )
            {
             before(grammarAccess.getReGetAccess().getSuccAnswerAssignment_3()); 
            // InternalRest.g:2440:2: ( rule__ReGet__SuccAnswerAssignment_3 )
            // InternalRest.g:2440:3: rule__ReGet__SuccAnswerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__SuccAnswerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getSuccAnswerAssignment_3()); 

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
    // $ANTLR end "rule__ReGet__Group__3__Impl"


    // $ANTLR start "rule__ReGet__Group__4"
    // InternalRest.g:2448:1: rule__ReGet__Group__4 : rule__ReGet__Group__4__Impl rule__ReGet__Group__5 ;
    public final void rule__ReGet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2452:1: ( rule__ReGet__Group__4__Impl rule__ReGet__Group__5 )
            // InternalRest.g:2453:2: rule__ReGet__Group__4__Impl rule__ReGet__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ReGet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group__5();

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
    // $ANTLR end "rule__ReGet__Group__4"


    // $ANTLR start "rule__ReGet__Group__4__Impl"
    // InternalRest.g:2460:1: rule__ReGet__Group__4__Impl : ( 'route' ) ;
    public final void rule__ReGet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2464:1: ( ( 'route' ) )
            // InternalRest.g:2465:1: ( 'route' )
            {
            // InternalRest.g:2465:1: ( 'route' )
            // InternalRest.g:2466:2: 'route'
            {
             before(grammarAccess.getReGetAccess().getRouteKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRouteKeyword_4()); 

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
    // $ANTLR end "rule__ReGet__Group__4__Impl"


    // $ANTLR start "rule__ReGet__Group__5"
    // InternalRest.g:2475:1: rule__ReGet__Group__5 : rule__ReGet__Group__5__Impl rule__ReGet__Group__6 ;
    public final void rule__ReGet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2479:1: ( rule__ReGet__Group__5__Impl rule__ReGet__Group__6 )
            // InternalRest.g:2480:2: rule__ReGet__Group__5__Impl rule__ReGet__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ReGet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group__6();

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
    // $ANTLR end "rule__ReGet__Group__5"


    // $ANTLR start "rule__ReGet__Group__5__Impl"
    // InternalRest.g:2487:1: rule__ReGet__Group__5__Impl : ( ( rule__ReGet__RouteAssignment_5 ) ) ;
    public final void rule__ReGet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2491:1: ( ( ( rule__ReGet__RouteAssignment_5 ) ) )
            // InternalRest.g:2492:1: ( ( rule__ReGet__RouteAssignment_5 ) )
            {
            // InternalRest.g:2492:1: ( ( rule__ReGet__RouteAssignment_5 ) )
            // InternalRest.g:2493:2: ( rule__ReGet__RouteAssignment_5 )
            {
             before(grammarAccess.getReGetAccess().getRouteAssignment_5()); 
            // InternalRest.g:2494:2: ( rule__ReGet__RouteAssignment_5 )
            // InternalRest.g:2494:3: rule__ReGet__RouteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__RouteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getRouteAssignment_5()); 

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
    // $ANTLR end "rule__ReGet__Group__5__Impl"


    // $ANTLR start "rule__ReGet__Group__6"
    // InternalRest.g:2502:1: rule__ReGet__Group__6 : rule__ReGet__Group__6__Impl rule__ReGet__Group__7 ;
    public final void rule__ReGet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2506:1: ( rule__ReGet__Group__6__Impl rule__ReGet__Group__7 )
            // InternalRest.g:2507:2: rule__ReGet__Group__6__Impl rule__ReGet__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__ReGet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group__7();

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
    // $ANTLR end "rule__ReGet__Group__6"


    // $ANTLR start "rule__ReGet__Group__6__Impl"
    // InternalRest.g:2514:1: rule__ReGet__Group__6__Impl : ( ( rule__ReGet__Group_6__0 )? ) ;
    public final void rule__ReGet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2518:1: ( ( ( rule__ReGet__Group_6__0 )? ) )
            // InternalRest.g:2519:1: ( ( rule__ReGet__Group_6__0 )? )
            {
            // InternalRest.g:2519:1: ( ( rule__ReGet__Group_6__0 )? )
            // InternalRest.g:2520:2: ( rule__ReGet__Group_6__0 )?
            {
             before(grammarAccess.getReGetAccess().getGroup_6()); 
            // InternalRest.g:2521:2: ( rule__ReGet__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRest.g:2521:3: rule__ReGet__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReGet__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReGetAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ReGet__Group__6__Impl"


    // $ANTLR start "rule__ReGet__Group__7"
    // InternalRest.g:2529:1: rule__ReGet__Group__7 : rule__ReGet__Group__7__Impl rule__ReGet__Group__8 ;
    public final void rule__ReGet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2533:1: ( rule__ReGet__Group__7__Impl rule__ReGet__Group__8 )
            // InternalRest.g:2534:2: rule__ReGet__Group__7__Impl rule__ReGet__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__ReGet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group__8();

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
    // $ANTLR end "rule__ReGet__Group__7"


    // $ANTLR start "rule__ReGet__Group__7__Impl"
    // InternalRest.g:2541:1: rule__ReGet__Group__7__Impl : ( ( rule__ReGet__Group_7__0 )? ) ;
    public final void rule__ReGet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2545:1: ( ( ( rule__ReGet__Group_7__0 )? ) )
            // InternalRest.g:2546:1: ( ( rule__ReGet__Group_7__0 )? )
            {
            // InternalRest.g:2546:1: ( ( rule__ReGet__Group_7__0 )? )
            // InternalRest.g:2547:2: ( rule__ReGet__Group_7__0 )?
            {
             before(grammarAccess.getReGetAccess().getGroup_7()); 
            // InternalRest.g:2548:2: ( rule__ReGet__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRest.g:2548:3: rule__ReGet__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReGet__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReGetAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ReGet__Group__7__Impl"


    // $ANTLR start "rule__ReGet__Group__8"
    // InternalRest.g:2556:1: rule__ReGet__Group__8 : rule__ReGet__Group__8__Impl ;
    public final void rule__ReGet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2560:1: ( rule__ReGet__Group__8__Impl )
            // InternalRest.g:2561:2: rule__ReGet__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group__8__Impl();

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
    // $ANTLR end "rule__ReGet__Group__8"


    // $ANTLR start "rule__ReGet__Group__8__Impl"
    // InternalRest.g:2567:1: rule__ReGet__Group__8__Impl : ( '}' ) ;
    public final void rule__ReGet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2571:1: ( ( '}' ) )
            // InternalRest.g:2572:1: ( '}' )
            {
            // InternalRest.g:2572:1: ( '}' )
            // InternalRest.g:2573:2: '}'
            {
             before(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ReGet__Group__8__Impl"


    // $ANTLR start "rule__ReGet__Group_6__0"
    // InternalRest.g:2583:1: rule__ReGet__Group_6__0 : rule__ReGet__Group_6__0__Impl rule__ReGet__Group_6__1 ;
    public final void rule__ReGet__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2587:1: ( rule__ReGet__Group_6__0__Impl rule__ReGet__Group_6__1 )
            // InternalRest.g:2588:2: rule__ReGet__Group_6__0__Impl rule__ReGet__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__ReGet__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_6__1();

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
    // $ANTLR end "rule__ReGet__Group_6__0"


    // $ANTLR start "rule__ReGet__Group_6__0__Impl"
    // InternalRest.g:2595:1: rule__ReGet__Group_6__0__Impl : ( 'operations' ) ;
    public final void rule__ReGet__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2599:1: ( ( 'operations' ) )
            // InternalRest.g:2600:1: ( 'operations' )
            {
            // InternalRest.g:2600:1: ( 'operations' )
            // InternalRest.g:2601:2: 'operations'
            {
             before(grammarAccess.getReGetAccess().getOperationsKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getOperationsKeyword_6_0()); 

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
    // $ANTLR end "rule__ReGet__Group_6__0__Impl"


    // $ANTLR start "rule__ReGet__Group_6__1"
    // InternalRest.g:2610:1: rule__ReGet__Group_6__1 : rule__ReGet__Group_6__1__Impl rule__ReGet__Group_6__2 ;
    public final void rule__ReGet__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2614:1: ( rule__ReGet__Group_6__1__Impl rule__ReGet__Group_6__2 )
            // InternalRest.g:2615:2: rule__ReGet__Group_6__1__Impl rule__ReGet__Group_6__2
            {
            pushFollow(FOLLOW_25);
            rule__ReGet__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_6__2();

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
    // $ANTLR end "rule__ReGet__Group_6__1"


    // $ANTLR start "rule__ReGet__Group_6__1__Impl"
    // InternalRest.g:2622:1: rule__ReGet__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ReGet__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2626:1: ( ( '{' ) )
            // InternalRest.g:2627:1: ( '{' )
            {
            // InternalRest.g:2627:1: ( '{' )
            // InternalRest.g:2628:2: '{'
            {
             before(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__ReGet__Group_6__1__Impl"


    // $ANTLR start "rule__ReGet__Group_6__2"
    // InternalRest.g:2637:1: rule__ReGet__Group_6__2 : rule__ReGet__Group_6__2__Impl rule__ReGet__Group_6__3 ;
    public final void rule__ReGet__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2641:1: ( rule__ReGet__Group_6__2__Impl rule__ReGet__Group_6__3 )
            // InternalRest.g:2642:2: rule__ReGet__Group_6__2__Impl rule__ReGet__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__ReGet__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_6__3();

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
    // $ANTLR end "rule__ReGet__Group_6__2"


    // $ANTLR start "rule__ReGet__Group_6__2__Impl"
    // InternalRest.g:2649:1: rule__ReGet__Group_6__2__Impl : ( ( rule__ReGet__OperationsAssignment_6_2 ) ) ;
    public final void rule__ReGet__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2653:1: ( ( ( rule__ReGet__OperationsAssignment_6_2 ) ) )
            // InternalRest.g:2654:1: ( ( rule__ReGet__OperationsAssignment_6_2 ) )
            {
            // InternalRest.g:2654:1: ( ( rule__ReGet__OperationsAssignment_6_2 ) )
            // InternalRest.g:2655:2: ( rule__ReGet__OperationsAssignment_6_2 )
            {
             before(grammarAccess.getReGetAccess().getOperationsAssignment_6_2()); 
            // InternalRest.g:2656:2: ( rule__ReGet__OperationsAssignment_6_2 )
            // InternalRest.g:2656:3: rule__ReGet__OperationsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__OperationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getOperationsAssignment_6_2()); 

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
    // $ANTLR end "rule__ReGet__Group_6__2__Impl"


    // $ANTLR start "rule__ReGet__Group_6__3"
    // InternalRest.g:2664:1: rule__ReGet__Group_6__3 : rule__ReGet__Group_6__3__Impl rule__ReGet__Group_6__4 ;
    public final void rule__ReGet__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2668:1: ( rule__ReGet__Group_6__3__Impl rule__ReGet__Group_6__4 )
            // InternalRest.g:2669:2: rule__ReGet__Group_6__3__Impl rule__ReGet__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__ReGet__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_6__4();

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
    // $ANTLR end "rule__ReGet__Group_6__3"


    // $ANTLR start "rule__ReGet__Group_6__3__Impl"
    // InternalRest.g:2676:1: rule__ReGet__Group_6__3__Impl : ( ( rule__ReGet__Group_6_3__0 )* ) ;
    public final void rule__ReGet__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2680:1: ( ( ( rule__ReGet__Group_6_3__0 )* ) )
            // InternalRest.g:2681:1: ( ( rule__ReGet__Group_6_3__0 )* )
            {
            // InternalRest.g:2681:1: ( ( rule__ReGet__Group_6_3__0 )* )
            // InternalRest.g:2682:2: ( rule__ReGet__Group_6_3__0 )*
            {
             before(grammarAccess.getReGetAccess().getGroup_6_3()); 
            // InternalRest.g:2683:2: ( rule__ReGet__Group_6_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRest.g:2683:3: rule__ReGet__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReGet__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getReGetAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__ReGet__Group_6__3__Impl"


    // $ANTLR start "rule__ReGet__Group_6__4"
    // InternalRest.g:2691:1: rule__ReGet__Group_6__4 : rule__ReGet__Group_6__4__Impl ;
    public final void rule__ReGet__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2695:1: ( rule__ReGet__Group_6__4__Impl )
            // InternalRest.g:2696:2: rule__ReGet__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_6__4__Impl();

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
    // $ANTLR end "rule__ReGet__Group_6__4"


    // $ANTLR start "rule__ReGet__Group_6__4__Impl"
    // InternalRest.g:2702:1: rule__ReGet__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ReGet__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2706:1: ( ( '}' ) )
            // InternalRest.g:2707:1: ( '}' )
            {
            // InternalRest.g:2707:1: ( '}' )
            // InternalRest.g:2708:2: '}'
            {
             before(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__ReGet__Group_6__4__Impl"


    // $ANTLR start "rule__ReGet__Group_6_3__0"
    // InternalRest.g:2718:1: rule__ReGet__Group_6_3__0 : rule__ReGet__Group_6_3__0__Impl rule__ReGet__Group_6_3__1 ;
    public final void rule__ReGet__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2722:1: ( rule__ReGet__Group_6_3__0__Impl rule__ReGet__Group_6_3__1 )
            // InternalRest.g:2723:2: rule__ReGet__Group_6_3__0__Impl rule__ReGet__Group_6_3__1
            {
            pushFollow(FOLLOW_25);
            rule__ReGet__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_6_3__1();

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
    // $ANTLR end "rule__ReGet__Group_6_3__0"


    // $ANTLR start "rule__ReGet__Group_6_3__0__Impl"
    // InternalRest.g:2730:1: rule__ReGet__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ReGet__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2734:1: ( ( ',' ) )
            // InternalRest.g:2735:1: ( ',' )
            {
            // InternalRest.g:2735:1: ( ',' )
            // InternalRest.g:2736:2: ','
            {
             before(grammarAccess.getReGetAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__ReGet__Group_6_3__0__Impl"


    // $ANTLR start "rule__ReGet__Group_6_3__1"
    // InternalRest.g:2745:1: rule__ReGet__Group_6_3__1 : rule__ReGet__Group_6_3__1__Impl ;
    public final void rule__ReGet__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2749:1: ( rule__ReGet__Group_6_3__1__Impl )
            // InternalRest.g:2750:2: rule__ReGet__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__ReGet__Group_6_3__1"


    // $ANTLR start "rule__ReGet__Group_6_3__1__Impl"
    // InternalRest.g:2756:1: rule__ReGet__Group_6_3__1__Impl : ( ( rule__ReGet__OperationsAssignment_6_3_1 ) ) ;
    public final void rule__ReGet__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2760:1: ( ( ( rule__ReGet__OperationsAssignment_6_3_1 ) ) )
            // InternalRest.g:2761:1: ( ( rule__ReGet__OperationsAssignment_6_3_1 ) )
            {
            // InternalRest.g:2761:1: ( ( rule__ReGet__OperationsAssignment_6_3_1 ) )
            // InternalRest.g:2762:2: ( rule__ReGet__OperationsAssignment_6_3_1 )
            {
             before(grammarAccess.getReGetAccess().getOperationsAssignment_6_3_1()); 
            // InternalRest.g:2763:2: ( rule__ReGet__OperationsAssignment_6_3_1 )
            // InternalRest.g:2763:3: rule__ReGet__OperationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__OperationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getOperationsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__ReGet__Group_6_3__1__Impl"


    // $ANTLR start "rule__ReGet__Group_7__0"
    // InternalRest.g:2772:1: rule__ReGet__Group_7__0 : rule__ReGet__Group_7__0__Impl rule__ReGet__Group_7__1 ;
    public final void rule__ReGet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2776:1: ( rule__ReGet__Group_7__0__Impl rule__ReGet__Group_7__1 )
            // InternalRest.g:2777:2: rule__ReGet__Group_7__0__Impl rule__ReGet__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__ReGet__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_7__1();

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
    // $ANTLR end "rule__ReGet__Group_7__0"


    // $ANTLR start "rule__ReGet__Group_7__0__Impl"
    // InternalRest.g:2784:1: rule__ReGet__Group_7__0__Impl : ( 'parameters' ) ;
    public final void rule__ReGet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2788:1: ( ( 'parameters' ) )
            // InternalRest.g:2789:1: ( 'parameters' )
            {
            // InternalRest.g:2789:1: ( 'parameters' )
            // InternalRest.g:2790:2: 'parameters'
            {
             before(grammarAccess.getReGetAccess().getParametersKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getParametersKeyword_7_0()); 

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
    // $ANTLR end "rule__ReGet__Group_7__0__Impl"


    // $ANTLR start "rule__ReGet__Group_7__1"
    // InternalRest.g:2799:1: rule__ReGet__Group_7__1 : rule__ReGet__Group_7__1__Impl rule__ReGet__Group_7__2 ;
    public final void rule__ReGet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2803:1: ( rule__ReGet__Group_7__1__Impl rule__ReGet__Group_7__2 )
            // InternalRest.g:2804:2: rule__ReGet__Group_7__1__Impl rule__ReGet__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__ReGet__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_7__2();

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
    // $ANTLR end "rule__ReGet__Group_7__1"


    // $ANTLR start "rule__ReGet__Group_7__1__Impl"
    // InternalRest.g:2811:1: rule__ReGet__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ReGet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2815:1: ( ( '{' ) )
            // InternalRest.g:2816:1: ( '{' )
            {
            // InternalRest.g:2816:1: ( '{' )
            // InternalRest.g:2817:2: '{'
            {
             before(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__ReGet__Group_7__1__Impl"


    // $ANTLR start "rule__ReGet__Group_7__2"
    // InternalRest.g:2826:1: rule__ReGet__Group_7__2 : rule__ReGet__Group_7__2__Impl rule__ReGet__Group_7__3 ;
    public final void rule__ReGet__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2830:1: ( rule__ReGet__Group_7__2__Impl rule__ReGet__Group_7__3 )
            // InternalRest.g:2831:2: rule__ReGet__Group_7__2__Impl rule__ReGet__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__ReGet__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_7__3();

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
    // $ANTLR end "rule__ReGet__Group_7__2"


    // $ANTLR start "rule__ReGet__Group_7__2__Impl"
    // InternalRest.g:2838:1: rule__ReGet__Group_7__2__Impl : ( ( rule__ReGet__ParametersAssignment_7_2 ) ) ;
    public final void rule__ReGet__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2842:1: ( ( ( rule__ReGet__ParametersAssignment_7_2 ) ) )
            // InternalRest.g:2843:1: ( ( rule__ReGet__ParametersAssignment_7_2 ) )
            {
            // InternalRest.g:2843:1: ( ( rule__ReGet__ParametersAssignment_7_2 ) )
            // InternalRest.g:2844:2: ( rule__ReGet__ParametersAssignment_7_2 )
            {
             before(grammarAccess.getReGetAccess().getParametersAssignment_7_2()); 
            // InternalRest.g:2845:2: ( rule__ReGet__ParametersAssignment_7_2 )
            // InternalRest.g:2845:3: rule__ReGet__ParametersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__ParametersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getParametersAssignment_7_2()); 

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
    // $ANTLR end "rule__ReGet__Group_7__2__Impl"


    // $ANTLR start "rule__ReGet__Group_7__3"
    // InternalRest.g:2853:1: rule__ReGet__Group_7__3 : rule__ReGet__Group_7__3__Impl rule__ReGet__Group_7__4 ;
    public final void rule__ReGet__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2857:1: ( rule__ReGet__Group_7__3__Impl rule__ReGet__Group_7__4 )
            // InternalRest.g:2858:2: rule__ReGet__Group_7__3__Impl rule__ReGet__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__ReGet__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_7__4();

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
    // $ANTLR end "rule__ReGet__Group_7__3"


    // $ANTLR start "rule__ReGet__Group_7__3__Impl"
    // InternalRest.g:2865:1: rule__ReGet__Group_7__3__Impl : ( ( rule__ReGet__Group_7_3__0 )* ) ;
    public final void rule__ReGet__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2869:1: ( ( ( rule__ReGet__Group_7_3__0 )* ) )
            // InternalRest.g:2870:1: ( ( rule__ReGet__Group_7_3__0 )* )
            {
            // InternalRest.g:2870:1: ( ( rule__ReGet__Group_7_3__0 )* )
            // InternalRest.g:2871:2: ( rule__ReGet__Group_7_3__0 )*
            {
             before(grammarAccess.getReGetAccess().getGroup_7_3()); 
            // InternalRest.g:2872:2: ( rule__ReGet__Group_7_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRest.g:2872:3: rule__ReGet__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReGet__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getReGetAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__ReGet__Group_7__3__Impl"


    // $ANTLR start "rule__ReGet__Group_7__4"
    // InternalRest.g:2880:1: rule__ReGet__Group_7__4 : rule__ReGet__Group_7__4__Impl ;
    public final void rule__ReGet__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2884:1: ( rule__ReGet__Group_7__4__Impl )
            // InternalRest.g:2885:2: rule__ReGet__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_7__4__Impl();

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
    // $ANTLR end "rule__ReGet__Group_7__4"


    // $ANTLR start "rule__ReGet__Group_7__4__Impl"
    // InternalRest.g:2891:1: rule__ReGet__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ReGet__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2895:1: ( ( '}' ) )
            // InternalRest.g:2896:1: ( '}' )
            {
            // InternalRest.g:2896:1: ( '}' )
            // InternalRest.g:2897:2: '}'
            {
             before(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__ReGet__Group_7__4__Impl"


    // $ANTLR start "rule__ReGet__Group_7_3__0"
    // InternalRest.g:2907:1: rule__ReGet__Group_7_3__0 : rule__ReGet__Group_7_3__0__Impl rule__ReGet__Group_7_3__1 ;
    public final void rule__ReGet__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2911:1: ( rule__ReGet__Group_7_3__0__Impl rule__ReGet__Group_7_3__1 )
            // InternalRest.g:2912:2: rule__ReGet__Group_7_3__0__Impl rule__ReGet__Group_7_3__1
            {
            pushFollow(FOLLOW_20);
            rule__ReGet__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_7_3__1();

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
    // $ANTLR end "rule__ReGet__Group_7_3__0"


    // $ANTLR start "rule__ReGet__Group_7_3__0__Impl"
    // InternalRest.g:2919:1: rule__ReGet__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ReGet__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2923:1: ( ( ',' ) )
            // InternalRest.g:2924:1: ( ',' )
            {
            // InternalRest.g:2924:1: ( ',' )
            // InternalRest.g:2925:2: ','
            {
             before(grammarAccess.getReGetAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__ReGet__Group_7_3__0__Impl"


    // $ANTLR start "rule__ReGet__Group_7_3__1"
    // InternalRest.g:2934:1: rule__ReGet__Group_7_3__1 : rule__ReGet__Group_7_3__1__Impl ;
    public final void rule__ReGet__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2938:1: ( rule__ReGet__Group_7_3__1__Impl )
            // InternalRest.g:2939:2: rule__ReGet__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__ReGet__Group_7_3__1"


    // $ANTLR start "rule__ReGet__Group_7_3__1__Impl"
    // InternalRest.g:2945:1: rule__ReGet__Group_7_3__1__Impl : ( ( rule__ReGet__ParametersAssignment_7_3_1 ) ) ;
    public final void rule__ReGet__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2949:1: ( ( ( rule__ReGet__ParametersAssignment_7_3_1 ) ) )
            // InternalRest.g:2950:1: ( ( rule__ReGet__ParametersAssignment_7_3_1 ) )
            {
            // InternalRest.g:2950:1: ( ( rule__ReGet__ParametersAssignment_7_3_1 ) )
            // InternalRest.g:2951:2: ( rule__ReGet__ParametersAssignment_7_3_1 )
            {
             before(grammarAccess.getReGetAccess().getParametersAssignment_7_3_1()); 
            // InternalRest.g:2952:2: ( rule__ReGet__ParametersAssignment_7_3_1 )
            // InternalRest.g:2952:3: rule__ReGet__ParametersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__ParametersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getParametersAssignment_7_3_1()); 

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
    // $ANTLR end "rule__ReGet__Group_7_3__1__Impl"


    // $ANTLR start "rule__RePost__Group__0"
    // InternalRest.g:2961:1: rule__RePost__Group__0 : rule__RePost__Group__0__Impl rule__RePost__Group__1 ;
    public final void rule__RePost__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2965:1: ( rule__RePost__Group__0__Impl rule__RePost__Group__1 )
            // InternalRest.g:2966:2: rule__RePost__Group__0__Impl rule__RePost__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RePost__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group__1();

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
    // $ANTLR end "rule__RePost__Group__0"


    // $ANTLR start "rule__RePost__Group__0__Impl"
    // InternalRest.g:2973:1: rule__RePost__Group__0__Impl : ( 'RePost' ) ;
    public final void rule__RePost__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2977:1: ( ( 'RePost' ) )
            // InternalRest.g:2978:1: ( 'RePost' )
            {
            // InternalRest.g:2978:1: ( 'RePost' )
            // InternalRest.g:2979:2: 'RePost'
            {
             before(grammarAccess.getRePostAccess().getRePostKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRePostKeyword_0()); 

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
    // $ANTLR end "rule__RePost__Group__0__Impl"


    // $ANTLR start "rule__RePost__Group__1"
    // InternalRest.g:2988:1: rule__RePost__Group__1 : rule__RePost__Group__1__Impl rule__RePost__Group__2 ;
    public final void rule__RePost__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2992:1: ( rule__RePost__Group__1__Impl rule__RePost__Group__2 )
            // InternalRest.g:2993:2: rule__RePost__Group__1__Impl rule__RePost__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__RePost__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group__2();

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
    // $ANTLR end "rule__RePost__Group__1"


    // $ANTLR start "rule__RePost__Group__1__Impl"
    // InternalRest.g:3000:1: rule__RePost__Group__1__Impl : ( '{' ) ;
    public final void rule__RePost__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3004:1: ( ( '{' ) )
            // InternalRest.g:3005:1: ( '{' )
            {
            // InternalRest.g:3005:1: ( '{' )
            // InternalRest.g:3006:2: '{'
            {
             before(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RePost__Group__1__Impl"


    // $ANTLR start "rule__RePost__Group__2"
    // InternalRest.g:3015:1: rule__RePost__Group__2 : rule__RePost__Group__2__Impl rule__RePost__Group__3 ;
    public final void rule__RePost__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3019:1: ( rule__RePost__Group__2__Impl rule__RePost__Group__3 )
            // InternalRest.g:3020:2: rule__RePost__Group__2__Impl rule__RePost__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RePost__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group__3();

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
    // $ANTLR end "rule__RePost__Group__2"


    // $ANTLR start "rule__RePost__Group__2__Impl"
    // InternalRest.g:3027:1: rule__RePost__Group__2__Impl : ( 'succAnswer' ) ;
    public final void rule__RePost__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3031:1: ( ( 'succAnswer' ) )
            // InternalRest.g:3032:1: ( 'succAnswer' )
            {
            // InternalRest.g:3032:1: ( 'succAnswer' )
            // InternalRest.g:3033:2: 'succAnswer'
            {
             before(grammarAccess.getRePostAccess().getSuccAnswerKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getSuccAnswerKeyword_2()); 

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
    // $ANTLR end "rule__RePost__Group__2__Impl"


    // $ANTLR start "rule__RePost__Group__3"
    // InternalRest.g:3042:1: rule__RePost__Group__3 : rule__RePost__Group__3__Impl rule__RePost__Group__4 ;
    public final void rule__RePost__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3046:1: ( rule__RePost__Group__3__Impl rule__RePost__Group__4 )
            // InternalRest.g:3047:2: rule__RePost__Group__3__Impl rule__RePost__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__RePost__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group__4();

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
    // $ANTLR end "rule__RePost__Group__3"


    // $ANTLR start "rule__RePost__Group__3__Impl"
    // InternalRest.g:3054:1: rule__RePost__Group__3__Impl : ( ( rule__RePost__SuccAnswerAssignment_3 ) ) ;
    public final void rule__RePost__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3058:1: ( ( ( rule__RePost__SuccAnswerAssignment_3 ) ) )
            // InternalRest.g:3059:1: ( ( rule__RePost__SuccAnswerAssignment_3 ) )
            {
            // InternalRest.g:3059:1: ( ( rule__RePost__SuccAnswerAssignment_3 ) )
            // InternalRest.g:3060:2: ( rule__RePost__SuccAnswerAssignment_3 )
            {
             before(grammarAccess.getRePostAccess().getSuccAnswerAssignment_3()); 
            // InternalRest.g:3061:2: ( rule__RePost__SuccAnswerAssignment_3 )
            // InternalRest.g:3061:3: rule__RePost__SuccAnswerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RePost__SuccAnswerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getSuccAnswerAssignment_3()); 

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
    // $ANTLR end "rule__RePost__Group__3__Impl"


    // $ANTLR start "rule__RePost__Group__4"
    // InternalRest.g:3069:1: rule__RePost__Group__4 : rule__RePost__Group__4__Impl rule__RePost__Group__5 ;
    public final void rule__RePost__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3073:1: ( rule__RePost__Group__4__Impl rule__RePost__Group__5 )
            // InternalRest.g:3074:2: rule__RePost__Group__4__Impl rule__RePost__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__RePost__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group__5();

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
    // $ANTLR end "rule__RePost__Group__4"


    // $ANTLR start "rule__RePost__Group__4__Impl"
    // InternalRest.g:3081:1: rule__RePost__Group__4__Impl : ( 'route' ) ;
    public final void rule__RePost__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3085:1: ( ( 'route' ) )
            // InternalRest.g:3086:1: ( 'route' )
            {
            // InternalRest.g:3086:1: ( 'route' )
            // InternalRest.g:3087:2: 'route'
            {
             before(grammarAccess.getRePostAccess().getRouteKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRouteKeyword_4()); 

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
    // $ANTLR end "rule__RePost__Group__4__Impl"


    // $ANTLR start "rule__RePost__Group__5"
    // InternalRest.g:3096:1: rule__RePost__Group__5 : rule__RePost__Group__5__Impl rule__RePost__Group__6 ;
    public final void rule__RePost__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3100:1: ( rule__RePost__Group__5__Impl rule__RePost__Group__6 )
            // InternalRest.g:3101:2: rule__RePost__Group__5__Impl rule__RePost__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__RePost__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group__6();

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
    // $ANTLR end "rule__RePost__Group__5"


    // $ANTLR start "rule__RePost__Group__5__Impl"
    // InternalRest.g:3108:1: rule__RePost__Group__5__Impl : ( ( rule__RePost__RouteAssignment_5 ) ) ;
    public final void rule__RePost__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3112:1: ( ( ( rule__RePost__RouteAssignment_5 ) ) )
            // InternalRest.g:3113:1: ( ( rule__RePost__RouteAssignment_5 ) )
            {
            // InternalRest.g:3113:1: ( ( rule__RePost__RouteAssignment_5 ) )
            // InternalRest.g:3114:2: ( rule__RePost__RouteAssignment_5 )
            {
             before(grammarAccess.getRePostAccess().getRouteAssignment_5()); 
            // InternalRest.g:3115:2: ( rule__RePost__RouteAssignment_5 )
            // InternalRest.g:3115:3: rule__RePost__RouteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RePost__RouteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getRouteAssignment_5()); 

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
    // $ANTLR end "rule__RePost__Group__5__Impl"


    // $ANTLR start "rule__RePost__Group__6"
    // InternalRest.g:3123:1: rule__RePost__Group__6 : rule__RePost__Group__6__Impl rule__RePost__Group__7 ;
    public final void rule__RePost__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3127:1: ( rule__RePost__Group__6__Impl rule__RePost__Group__7 )
            // InternalRest.g:3128:2: rule__RePost__Group__6__Impl rule__RePost__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__RePost__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group__7();

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
    // $ANTLR end "rule__RePost__Group__6"


    // $ANTLR start "rule__RePost__Group__6__Impl"
    // InternalRest.g:3135:1: rule__RePost__Group__6__Impl : ( ( rule__RePost__Group_6__0 )? ) ;
    public final void rule__RePost__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3139:1: ( ( ( rule__RePost__Group_6__0 )? ) )
            // InternalRest.g:3140:1: ( ( rule__RePost__Group_6__0 )? )
            {
            // InternalRest.g:3140:1: ( ( rule__RePost__Group_6__0 )? )
            // InternalRest.g:3141:2: ( rule__RePost__Group_6__0 )?
            {
             before(grammarAccess.getRePostAccess().getGroup_6()); 
            // InternalRest.g:3142:2: ( rule__RePost__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRest.g:3142:3: rule__RePost__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePost__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePostAccess().getGroup_6()); 

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
    // $ANTLR end "rule__RePost__Group__6__Impl"


    // $ANTLR start "rule__RePost__Group__7"
    // InternalRest.g:3150:1: rule__RePost__Group__7 : rule__RePost__Group__7__Impl rule__RePost__Group__8 ;
    public final void rule__RePost__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3154:1: ( rule__RePost__Group__7__Impl rule__RePost__Group__8 )
            // InternalRest.g:3155:2: rule__RePost__Group__7__Impl rule__RePost__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__RePost__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group__8();

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
    // $ANTLR end "rule__RePost__Group__7"


    // $ANTLR start "rule__RePost__Group__7__Impl"
    // InternalRest.g:3162:1: rule__RePost__Group__7__Impl : ( ( rule__RePost__Group_7__0 )? ) ;
    public final void rule__RePost__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3166:1: ( ( ( rule__RePost__Group_7__0 )? ) )
            // InternalRest.g:3167:1: ( ( rule__RePost__Group_7__0 )? )
            {
            // InternalRest.g:3167:1: ( ( rule__RePost__Group_7__0 )? )
            // InternalRest.g:3168:2: ( rule__RePost__Group_7__0 )?
            {
             before(grammarAccess.getRePostAccess().getGroup_7()); 
            // InternalRest.g:3169:2: ( rule__RePost__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRest.g:3169:3: rule__RePost__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePost__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePostAccess().getGroup_7()); 

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
    // $ANTLR end "rule__RePost__Group__7__Impl"


    // $ANTLR start "rule__RePost__Group__8"
    // InternalRest.g:3177:1: rule__RePost__Group__8 : rule__RePost__Group__8__Impl ;
    public final void rule__RePost__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3181:1: ( rule__RePost__Group__8__Impl )
            // InternalRest.g:3182:2: rule__RePost__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group__8__Impl();

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
    // $ANTLR end "rule__RePost__Group__8"


    // $ANTLR start "rule__RePost__Group__8__Impl"
    // InternalRest.g:3188:1: rule__RePost__Group__8__Impl : ( '}' ) ;
    public final void rule__RePost__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3192:1: ( ( '}' ) )
            // InternalRest.g:3193:1: ( '}' )
            {
            // InternalRest.g:3193:1: ( '}' )
            // InternalRest.g:3194:2: '}'
            {
             before(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__RePost__Group__8__Impl"


    // $ANTLR start "rule__RePost__Group_6__0"
    // InternalRest.g:3204:1: rule__RePost__Group_6__0 : rule__RePost__Group_6__0__Impl rule__RePost__Group_6__1 ;
    public final void rule__RePost__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3208:1: ( rule__RePost__Group_6__0__Impl rule__RePost__Group_6__1 )
            // InternalRest.g:3209:2: rule__RePost__Group_6__0__Impl rule__RePost__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RePost__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_6__1();

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
    // $ANTLR end "rule__RePost__Group_6__0"


    // $ANTLR start "rule__RePost__Group_6__0__Impl"
    // InternalRest.g:3216:1: rule__RePost__Group_6__0__Impl : ( 'operations' ) ;
    public final void rule__RePost__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3220:1: ( ( 'operations' ) )
            // InternalRest.g:3221:1: ( 'operations' )
            {
            // InternalRest.g:3221:1: ( 'operations' )
            // InternalRest.g:3222:2: 'operations'
            {
             before(grammarAccess.getRePostAccess().getOperationsKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getOperationsKeyword_6_0()); 

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
    // $ANTLR end "rule__RePost__Group_6__0__Impl"


    // $ANTLR start "rule__RePost__Group_6__1"
    // InternalRest.g:3231:1: rule__RePost__Group_6__1 : rule__RePost__Group_6__1__Impl rule__RePost__Group_6__2 ;
    public final void rule__RePost__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3235:1: ( rule__RePost__Group_6__1__Impl rule__RePost__Group_6__2 )
            // InternalRest.g:3236:2: rule__RePost__Group_6__1__Impl rule__RePost__Group_6__2
            {
            pushFollow(FOLLOW_25);
            rule__RePost__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_6__2();

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
    // $ANTLR end "rule__RePost__Group_6__1"


    // $ANTLR start "rule__RePost__Group_6__1__Impl"
    // InternalRest.g:3243:1: rule__RePost__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RePost__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3247:1: ( ( '{' ) )
            // InternalRest.g:3248:1: ( '{' )
            {
            // InternalRest.g:3248:1: ( '{' )
            // InternalRest.g:3249:2: '{'
            {
             before(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__RePost__Group_6__1__Impl"


    // $ANTLR start "rule__RePost__Group_6__2"
    // InternalRest.g:3258:1: rule__RePost__Group_6__2 : rule__RePost__Group_6__2__Impl rule__RePost__Group_6__3 ;
    public final void rule__RePost__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3262:1: ( rule__RePost__Group_6__2__Impl rule__RePost__Group_6__3 )
            // InternalRest.g:3263:2: rule__RePost__Group_6__2__Impl rule__RePost__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__RePost__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_6__3();

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
    // $ANTLR end "rule__RePost__Group_6__2"


    // $ANTLR start "rule__RePost__Group_6__2__Impl"
    // InternalRest.g:3270:1: rule__RePost__Group_6__2__Impl : ( ( rule__RePost__OperationsAssignment_6_2 ) ) ;
    public final void rule__RePost__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3274:1: ( ( ( rule__RePost__OperationsAssignment_6_2 ) ) )
            // InternalRest.g:3275:1: ( ( rule__RePost__OperationsAssignment_6_2 ) )
            {
            // InternalRest.g:3275:1: ( ( rule__RePost__OperationsAssignment_6_2 ) )
            // InternalRest.g:3276:2: ( rule__RePost__OperationsAssignment_6_2 )
            {
             before(grammarAccess.getRePostAccess().getOperationsAssignment_6_2()); 
            // InternalRest.g:3277:2: ( rule__RePost__OperationsAssignment_6_2 )
            // InternalRest.g:3277:3: rule__RePost__OperationsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__RePost__OperationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getOperationsAssignment_6_2()); 

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
    // $ANTLR end "rule__RePost__Group_6__2__Impl"


    // $ANTLR start "rule__RePost__Group_6__3"
    // InternalRest.g:3285:1: rule__RePost__Group_6__3 : rule__RePost__Group_6__3__Impl rule__RePost__Group_6__4 ;
    public final void rule__RePost__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3289:1: ( rule__RePost__Group_6__3__Impl rule__RePost__Group_6__4 )
            // InternalRest.g:3290:2: rule__RePost__Group_6__3__Impl rule__RePost__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__RePost__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_6__4();

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
    // $ANTLR end "rule__RePost__Group_6__3"


    // $ANTLR start "rule__RePost__Group_6__3__Impl"
    // InternalRest.g:3297:1: rule__RePost__Group_6__3__Impl : ( ( rule__RePost__Group_6_3__0 )* ) ;
    public final void rule__RePost__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3301:1: ( ( ( rule__RePost__Group_6_3__0 )* ) )
            // InternalRest.g:3302:1: ( ( rule__RePost__Group_6_3__0 )* )
            {
            // InternalRest.g:3302:1: ( ( rule__RePost__Group_6_3__0 )* )
            // InternalRest.g:3303:2: ( rule__RePost__Group_6_3__0 )*
            {
             before(grammarAccess.getRePostAccess().getGroup_6_3()); 
            // InternalRest.g:3304:2: ( rule__RePost__Group_6_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRest.g:3304:3: rule__RePost__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePost__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRePostAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__RePost__Group_6__3__Impl"


    // $ANTLR start "rule__RePost__Group_6__4"
    // InternalRest.g:3312:1: rule__RePost__Group_6__4 : rule__RePost__Group_6__4__Impl ;
    public final void rule__RePost__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3316:1: ( rule__RePost__Group_6__4__Impl )
            // InternalRest.g:3317:2: rule__RePost__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_6__4__Impl();

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
    // $ANTLR end "rule__RePost__Group_6__4"


    // $ANTLR start "rule__RePost__Group_6__4__Impl"
    // InternalRest.g:3323:1: rule__RePost__Group_6__4__Impl : ( '}' ) ;
    public final void rule__RePost__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3327:1: ( ( '}' ) )
            // InternalRest.g:3328:1: ( '}' )
            {
            // InternalRest.g:3328:1: ( '}' )
            // InternalRest.g:3329:2: '}'
            {
             before(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__RePost__Group_6__4__Impl"


    // $ANTLR start "rule__RePost__Group_6_3__0"
    // InternalRest.g:3339:1: rule__RePost__Group_6_3__0 : rule__RePost__Group_6_3__0__Impl rule__RePost__Group_6_3__1 ;
    public final void rule__RePost__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3343:1: ( rule__RePost__Group_6_3__0__Impl rule__RePost__Group_6_3__1 )
            // InternalRest.g:3344:2: rule__RePost__Group_6_3__0__Impl rule__RePost__Group_6_3__1
            {
            pushFollow(FOLLOW_25);
            rule__RePost__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_6_3__1();

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
    // $ANTLR end "rule__RePost__Group_6_3__0"


    // $ANTLR start "rule__RePost__Group_6_3__0__Impl"
    // InternalRest.g:3351:1: rule__RePost__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RePost__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3355:1: ( ( ',' ) )
            // InternalRest.g:3356:1: ( ',' )
            {
            // InternalRest.g:3356:1: ( ',' )
            // InternalRest.g:3357:2: ','
            {
             before(grammarAccess.getRePostAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__RePost__Group_6_3__0__Impl"


    // $ANTLR start "rule__RePost__Group_6_3__1"
    // InternalRest.g:3366:1: rule__RePost__Group_6_3__1 : rule__RePost__Group_6_3__1__Impl ;
    public final void rule__RePost__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3370:1: ( rule__RePost__Group_6_3__1__Impl )
            // InternalRest.g:3371:2: rule__RePost__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__RePost__Group_6_3__1"


    // $ANTLR start "rule__RePost__Group_6_3__1__Impl"
    // InternalRest.g:3377:1: rule__RePost__Group_6_3__1__Impl : ( ( rule__RePost__OperationsAssignment_6_3_1 ) ) ;
    public final void rule__RePost__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3381:1: ( ( ( rule__RePost__OperationsAssignment_6_3_1 ) ) )
            // InternalRest.g:3382:1: ( ( rule__RePost__OperationsAssignment_6_3_1 ) )
            {
            // InternalRest.g:3382:1: ( ( rule__RePost__OperationsAssignment_6_3_1 ) )
            // InternalRest.g:3383:2: ( rule__RePost__OperationsAssignment_6_3_1 )
            {
             before(grammarAccess.getRePostAccess().getOperationsAssignment_6_3_1()); 
            // InternalRest.g:3384:2: ( rule__RePost__OperationsAssignment_6_3_1 )
            // InternalRest.g:3384:3: rule__RePost__OperationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePost__OperationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getOperationsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__RePost__Group_6_3__1__Impl"


    // $ANTLR start "rule__RePost__Group_7__0"
    // InternalRest.g:3393:1: rule__RePost__Group_7__0 : rule__RePost__Group_7__0__Impl rule__RePost__Group_7__1 ;
    public final void rule__RePost__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3397:1: ( rule__RePost__Group_7__0__Impl rule__RePost__Group_7__1 )
            // InternalRest.g:3398:2: rule__RePost__Group_7__0__Impl rule__RePost__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__RePost__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_7__1();

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
    // $ANTLR end "rule__RePost__Group_7__0"


    // $ANTLR start "rule__RePost__Group_7__0__Impl"
    // InternalRest.g:3405:1: rule__RePost__Group_7__0__Impl : ( 'parameters' ) ;
    public final void rule__RePost__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3409:1: ( ( 'parameters' ) )
            // InternalRest.g:3410:1: ( 'parameters' )
            {
            // InternalRest.g:3410:1: ( 'parameters' )
            // InternalRest.g:3411:2: 'parameters'
            {
             before(grammarAccess.getRePostAccess().getParametersKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getParametersKeyword_7_0()); 

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
    // $ANTLR end "rule__RePost__Group_7__0__Impl"


    // $ANTLR start "rule__RePost__Group_7__1"
    // InternalRest.g:3420:1: rule__RePost__Group_7__1 : rule__RePost__Group_7__1__Impl rule__RePost__Group_7__2 ;
    public final void rule__RePost__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3424:1: ( rule__RePost__Group_7__1__Impl rule__RePost__Group_7__2 )
            // InternalRest.g:3425:2: rule__RePost__Group_7__1__Impl rule__RePost__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__RePost__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_7__2();

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
    // $ANTLR end "rule__RePost__Group_7__1"


    // $ANTLR start "rule__RePost__Group_7__1__Impl"
    // InternalRest.g:3432:1: rule__RePost__Group_7__1__Impl : ( '{' ) ;
    public final void rule__RePost__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3436:1: ( ( '{' ) )
            // InternalRest.g:3437:1: ( '{' )
            {
            // InternalRest.g:3437:1: ( '{' )
            // InternalRest.g:3438:2: '{'
            {
             before(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__RePost__Group_7__1__Impl"


    // $ANTLR start "rule__RePost__Group_7__2"
    // InternalRest.g:3447:1: rule__RePost__Group_7__2 : rule__RePost__Group_7__2__Impl rule__RePost__Group_7__3 ;
    public final void rule__RePost__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3451:1: ( rule__RePost__Group_7__2__Impl rule__RePost__Group_7__3 )
            // InternalRest.g:3452:2: rule__RePost__Group_7__2__Impl rule__RePost__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__RePost__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_7__3();

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
    // $ANTLR end "rule__RePost__Group_7__2"


    // $ANTLR start "rule__RePost__Group_7__2__Impl"
    // InternalRest.g:3459:1: rule__RePost__Group_7__2__Impl : ( ( rule__RePost__ParametersAssignment_7_2 ) ) ;
    public final void rule__RePost__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3463:1: ( ( ( rule__RePost__ParametersAssignment_7_2 ) ) )
            // InternalRest.g:3464:1: ( ( rule__RePost__ParametersAssignment_7_2 ) )
            {
            // InternalRest.g:3464:1: ( ( rule__RePost__ParametersAssignment_7_2 ) )
            // InternalRest.g:3465:2: ( rule__RePost__ParametersAssignment_7_2 )
            {
             before(grammarAccess.getRePostAccess().getParametersAssignment_7_2()); 
            // InternalRest.g:3466:2: ( rule__RePost__ParametersAssignment_7_2 )
            // InternalRest.g:3466:3: rule__RePost__ParametersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__RePost__ParametersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getParametersAssignment_7_2()); 

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
    // $ANTLR end "rule__RePost__Group_7__2__Impl"


    // $ANTLR start "rule__RePost__Group_7__3"
    // InternalRest.g:3474:1: rule__RePost__Group_7__3 : rule__RePost__Group_7__3__Impl rule__RePost__Group_7__4 ;
    public final void rule__RePost__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3478:1: ( rule__RePost__Group_7__3__Impl rule__RePost__Group_7__4 )
            // InternalRest.g:3479:2: rule__RePost__Group_7__3__Impl rule__RePost__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__RePost__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_7__4();

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
    // $ANTLR end "rule__RePost__Group_7__3"


    // $ANTLR start "rule__RePost__Group_7__3__Impl"
    // InternalRest.g:3486:1: rule__RePost__Group_7__3__Impl : ( ( rule__RePost__Group_7_3__0 )* ) ;
    public final void rule__RePost__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3490:1: ( ( ( rule__RePost__Group_7_3__0 )* ) )
            // InternalRest.g:3491:1: ( ( rule__RePost__Group_7_3__0 )* )
            {
            // InternalRest.g:3491:1: ( ( rule__RePost__Group_7_3__0 )* )
            // InternalRest.g:3492:2: ( rule__RePost__Group_7_3__0 )*
            {
             before(grammarAccess.getRePostAccess().getGroup_7_3()); 
            // InternalRest.g:3493:2: ( rule__RePost__Group_7_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRest.g:3493:3: rule__RePost__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePost__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRePostAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__RePost__Group_7__3__Impl"


    // $ANTLR start "rule__RePost__Group_7__4"
    // InternalRest.g:3501:1: rule__RePost__Group_7__4 : rule__RePost__Group_7__4__Impl ;
    public final void rule__RePost__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3505:1: ( rule__RePost__Group_7__4__Impl )
            // InternalRest.g:3506:2: rule__RePost__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_7__4__Impl();

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
    // $ANTLR end "rule__RePost__Group_7__4"


    // $ANTLR start "rule__RePost__Group_7__4__Impl"
    // InternalRest.g:3512:1: rule__RePost__Group_7__4__Impl : ( '}' ) ;
    public final void rule__RePost__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3516:1: ( ( '}' ) )
            // InternalRest.g:3517:1: ( '}' )
            {
            // InternalRest.g:3517:1: ( '}' )
            // InternalRest.g:3518:2: '}'
            {
             before(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__RePost__Group_7__4__Impl"


    // $ANTLR start "rule__RePost__Group_7_3__0"
    // InternalRest.g:3528:1: rule__RePost__Group_7_3__0 : rule__RePost__Group_7_3__0__Impl rule__RePost__Group_7_3__1 ;
    public final void rule__RePost__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3532:1: ( rule__RePost__Group_7_3__0__Impl rule__RePost__Group_7_3__1 )
            // InternalRest.g:3533:2: rule__RePost__Group_7_3__0__Impl rule__RePost__Group_7_3__1
            {
            pushFollow(FOLLOW_20);
            rule__RePost__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_7_3__1();

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
    // $ANTLR end "rule__RePost__Group_7_3__0"


    // $ANTLR start "rule__RePost__Group_7_3__0__Impl"
    // InternalRest.g:3540:1: rule__RePost__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__RePost__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3544:1: ( ( ',' ) )
            // InternalRest.g:3545:1: ( ',' )
            {
            // InternalRest.g:3545:1: ( ',' )
            // InternalRest.g:3546:2: ','
            {
             before(grammarAccess.getRePostAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__RePost__Group_7_3__0__Impl"


    // $ANTLR start "rule__RePost__Group_7_3__1"
    // InternalRest.g:3555:1: rule__RePost__Group_7_3__1 : rule__RePost__Group_7_3__1__Impl ;
    public final void rule__RePost__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3559:1: ( rule__RePost__Group_7_3__1__Impl )
            // InternalRest.g:3560:2: rule__RePost__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__RePost__Group_7_3__1"


    // $ANTLR start "rule__RePost__Group_7_3__1__Impl"
    // InternalRest.g:3566:1: rule__RePost__Group_7_3__1__Impl : ( ( rule__RePost__ParametersAssignment_7_3_1 ) ) ;
    public final void rule__RePost__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3570:1: ( ( ( rule__RePost__ParametersAssignment_7_3_1 ) ) )
            // InternalRest.g:3571:1: ( ( rule__RePost__ParametersAssignment_7_3_1 ) )
            {
            // InternalRest.g:3571:1: ( ( rule__RePost__ParametersAssignment_7_3_1 ) )
            // InternalRest.g:3572:2: ( rule__RePost__ParametersAssignment_7_3_1 )
            {
             before(grammarAccess.getRePostAccess().getParametersAssignment_7_3_1()); 
            // InternalRest.g:3573:2: ( rule__RePost__ParametersAssignment_7_3_1 )
            // InternalRest.g:3573:3: rule__RePost__ParametersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePost__ParametersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getParametersAssignment_7_3_1()); 

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
    // $ANTLR end "rule__RePost__Group_7_3__1__Impl"


    // $ANTLR start "rule__RePut__Group__0"
    // InternalRest.g:3582:1: rule__RePut__Group__0 : rule__RePut__Group__0__Impl rule__RePut__Group__1 ;
    public final void rule__RePut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3586:1: ( rule__RePut__Group__0__Impl rule__RePut__Group__1 )
            // InternalRest.g:3587:2: rule__RePut__Group__0__Impl rule__RePut__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RePut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group__1();

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
    // $ANTLR end "rule__RePut__Group__0"


    // $ANTLR start "rule__RePut__Group__0__Impl"
    // InternalRest.g:3594:1: rule__RePut__Group__0__Impl : ( 'RePut' ) ;
    public final void rule__RePut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3598:1: ( ( 'RePut' ) )
            // InternalRest.g:3599:1: ( 'RePut' )
            {
            // InternalRest.g:3599:1: ( 'RePut' )
            // InternalRest.g:3600:2: 'RePut'
            {
             before(grammarAccess.getRePutAccess().getRePutKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRePutKeyword_0()); 

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
    // $ANTLR end "rule__RePut__Group__0__Impl"


    // $ANTLR start "rule__RePut__Group__1"
    // InternalRest.g:3609:1: rule__RePut__Group__1 : rule__RePut__Group__1__Impl rule__RePut__Group__2 ;
    public final void rule__RePut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3613:1: ( rule__RePut__Group__1__Impl rule__RePut__Group__2 )
            // InternalRest.g:3614:2: rule__RePut__Group__1__Impl rule__RePut__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__RePut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group__2();

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
    // $ANTLR end "rule__RePut__Group__1"


    // $ANTLR start "rule__RePut__Group__1__Impl"
    // InternalRest.g:3621:1: rule__RePut__Group__1__Impl : ( '{' ) ;
    public final void rule__RePut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3625:1: ( ( '{' ) )
            // InternalRest.g:3626:1: ( '{' )
            {
            // InternalRest.g:3626:1: ( '{' )
            // InternalRest.g:3627:2: '{'
            {
             before(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RePut__Group__1__Impl"


    // $ANTLR start "rule__RePut__Group__2"
    // InternalRest.g:3636:1: rule__RePut__Group__2 : rule__RePut__Group__2__Impl rule__RePut__Group__3 ;
    public final void rule__RePut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3640:1: ( rule__RePut__Group__2__Impl rule__RePut__Group__3 )
            // InternalRest.g:3641:2: rule__RePut__Group__2__Impl rule__RePut__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RePut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group__3();

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
    // $ANTLR end "rule__RePut__Group__2"


    // $ANTLR start "rule__RePut__Group__2__Impl"
    // InternalRest.g:3648:1: rule__RePut__Group__2__Impl : ( 'succAnswer' ) ;
    public final void rule__RePut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3652:1: ( ( 'succAnswer' ) )
            // InternalRest.g:3653:1: ( 'succAnswer' )
            {
            // InternalRest.g:3653:1: ( 'succAnswer' )
            // InternalRest.g:3654:2: 'succAnswer'
            {
             before(grammarAccess.getRePutAccess().getSuccAnswerKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getSuccAnswerKeyword_2()); 

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
    // $ANTLR end "rule__RePut__Group__2__Impl"


    // $ANTLR start "rule__RePut__Group__3"
    // InternalRest.g:3663:1: rule__RePut__Group__3 : rule__RePut__Group__3__Impl rule__RePut__Group__4 ;
    public final void rule__RePut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3667:1: ( rule__RePut__Group__3__Impl rule__RePut__Group__4 )
            // InternalRest.g:3668:2: rule__RePut__Group__3__Impl rule__RePut__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__RePut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group__4();

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
    // $ANTLR end "rule__RePut__Group__3"


    // $ANTLR start "rule__RePut__Group__3__Impl"
    // InternalRest.g:3675:1: rule__RePut__Group__3__Impl : ( ( rule__RePut__SuccAnswerAssignment_3 ) ) ;
    public final void rule__RePut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3679:1: ( ( ( rule__RePut__SuccAnswerAssignment_3 ) ) )
            // InternalRest.g:3680:1: ( ( rule__RePut__SuccAnswerAssignment_3 ) )
            {
            // InternalRest.g:3680:1: ( ( rule__RePut__SuccAnswerAssignment_3 ) )
            // InternalRest.g:3681:2: ( rule__RePut__SuccAnswerAssignment_3 )
            {
             before(grammarAccess.getRePutAccess().getSuccAnswerAssignment_3()); 
            // InternalRest.g:3682:2: ( rule__RePut__SuccAnswerAssignment_3 )
            // InternalRest.g:3682:3: rule__RePut__SuccAnswerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RePut__SuccAnswerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getSuccAnswerAssignment_3()); 

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
    // $ANTLR end "rule__RePut__Group__3__Impl"


    // $ANTLR start "rule__RePut__Group__4"
    // InternalRest.g:3690:1: rule__RePut__Group__4 : rule__RePut__Group__4__Impl rule__RePut__Group__5 ;
    public final void rule__RePut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3694:1: ( rule__RePut__Group__4__Impl rule__RePut__Group__5 )
            // InternalRest.g:3695:2: rule__RePut__Group__4__Impl rule__RePut__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__RePut__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group__5();

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
    // $ANTLR end "rule__RePut__Group__4"


    // $ANTLR start "rule__RePut__Group__4__Impl"
    // InternalRest.g:3702:1: rule__RePut__Group__4__Impl : ( 'route' ) ;
    public final void rule__RePut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3706:1: ( ( 'route' ) )
            // InternalRest.g:3707:1: ( 'route' )
            {
            // InternalRest.g:3707:1: ( 'route' )
            // InternalRest.g:3708:2: 'route'
            {
             before(grammarAccess.getRePutAccess().getRouteKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRouteKeyword_4()); 

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
    // $ANTLR end "rule__RePut__Group__4__Impl"


    // $ANTLR start "rule__RePut__Group__5"
    // InternalRest.g:3717:1: rule__RePut__Group__5 : rule__RePut__Group__5__Impl rule__RePut__Group__6 ;
    public final void rule__RePut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3721:1: ( rule__RePut__Group__5__Impl rule__RePut__Group__6 )
            // InternalRest.g:3722:2: rule__RePut__Group__5__Impl rule__RePut__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__RePut__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group__6();

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
    // $ANTLR end "rule__RePut__Group__5"


    // $ANTLR start "rule__RePut__Group__5__Impl"
    // InternalRest.g:3729:1: rule__RePut__Group__5__Impl : ( ( rule__RePut__RouteAssignment_5 ) ) ;
    public final void rule__RePut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3733:1: ( ( ( rule__RePut__RouteAssignment_5 ) ) )
            // InternalRest.g:3734:1: ( ( rule__RePut__RouteAssignment_5 ) )
            {
            // InternalRest.g:3734:1: ( ( rule__RePut__RouteAssignment_5 ) )
            // InternalRest.g:3735:2: ( rule__RePut__RouteAssignment_5 )
            {
             before(grammarAccess.getRePutAccess().getRouteAssignment_5()); 
            // InternalRest.g:3736:2: ( rule__RePut__RouteAssignment_5 )
            // InternalRest.g:3736:3: rule__RePut__RouteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RePut__RouteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getRouteAssignment_5()); 

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
    // $ANTLR end "rule__RePut__Group__5__Impl"


    // $ANTLR start "rule__RePut__Group__6"
    // InternalRest.g:3744:1: rule__RePut__Group__6 : rule__RePut__Group__6__Impl rule__RePut__Group__7 ;
    public final void rule__RePut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3748:1: ( rule__RePut__Group__6__Impl rule__RePut__Group__7 )
            // InternalRest.g:3749:2: rule__RePut__Group__6__Impl rule__RePut__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__RePut__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group__7();

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
    // $ANTLR end "rule__RePut__Group__6"


    // $ANTLR start "rule__RePut__Group__6__Impl"
    // InternalRest.g:3756:1: rule__RePut__Group__6__Impl : ( ( rule__RePut__Group_6__0 )? ) ;
    public final void rule__RePut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3760:1: ( ( ( rule__RePut__Group_6__0 )? ) )
            // InternalRest.g:3761:1: ( ( rule__RePut__Group_6__0 )? )
            {
            // InternalRest.g:3761:1: ( ( rule__RePut__Group_6__0 )? )
            // InternalRest.g:3762:2: ( rule__RePut__Group_6__0 )?
            {
             before(grammarAccess.getRePutAccess().getGroup_6()); 
            // InternalRest.g:3763:2: ( rule__RePut__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRest.g:3763:3: rule__RePut__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePut__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePutAccess().getGroup_6()); 

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
    // $ANTLR end "rule__RePut__Group__6__Impl"


    // $ANTLR start "rule__RePut__Group__7"
    // InternalRest.g:3771:1: rule__RePut__Group__7 : rule__RePut__Group__7__Impl rule__RePut__Group__8 ;
    public final void rule__RePut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3775:1: ( rule__RePut__Group__7__Impl rule__RePut__Group__8 )
            // InternalRest.g:3776:2: rule__RePut__Group__7__Impl rule__RePut__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__RePut__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group__8();

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
    // $ANTLR end "rule__RePut__Group__7"


    // $ANTLR start "rule__RePut__Group__7__Impl"
    // InternalRest.g:3783:1: rule__RePut__Group__7__Impl : ( ( rule__RePut__Group_7__0 )? ) ;
    public final void rule__RePut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3787:1: ( ( ( rule__RePut__Group_7__0 )? ) )
            // InternalRest.g:3788:1: ( ( rule__RePut__Group_7__0 )? )
            {
            // InternalRest.g:3788:1: ( ( rule__RePut__Group_7__0 )? )
            // InternalRest.g:3789:2: ( rule__RePut__Group_7__0 )?
            {
             before(grammarAccess.getRePutAccess().getGroup_7()); 
            // InternalRest.g:3790:2: ( rule__RePut__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRest.g:3790:3: rule__RePut__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePut__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePutAccess().getGroup_7()); 

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
    // $ANTLR end "rule__RePut__Group__7__Impl"


    // $ANTLR start "rule__RePut__Group__8"
    // InternalRest.g:3798:1: rule__RePut__Group__8 : rule__RePut__Group__8__Impl ;
    public final void rule__RePut__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3802:1: ( rule__RePut__Group__8__Impl )
            // InternalRest.g:3803:2: rule__RePut__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group__8__Impl();

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
    // $ANTLR end "rule__RePut__Group__8"


    // $ANTLR start "rule__RePut__Group__8__Impl"
    // InternalRest.g:3809:1: rule__RePut__Group__8__Impl : ( '}' ) ;
    public final void rule__RePut__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3813:1: ( ( '}' ) )
            // InternalRest.g:3814:1: ( '}' )
            {
            // InternalRest.g:3814:1: ( '}' )
            // InternalRest.g:3815:2: '}'
            {
             before(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__RePut__Group__8__Impl"


    // $ANTLR start "rule__RePut__Group_6__0"
    // InternalRest.g:3825:1: rule__RePut__Group_6__0 : rule__RePut__Group_6__0__Impl rule__RePut__Group_6__1 ;
    public final void rule__RePut__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3829:1: ( rule__RePut__Group_6__0__Impl rule__RePut__Group_6__1 )
            // InternalRest.g:3830:2: rule__RePut__Group_6__0__Impl rule__RePut__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RePut__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_6__1();

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
    // $ANTLR end "rule__RePut__Group_6__0"


    // $ANTLR start "rule__RePut__Group_6__0__Impl"
    // InternalRest.g:3837:1: rule__RePut__Group_6__0__Impl : ( 'operations' ) ;
    public final void rule__RePut__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3841:1: ( ( 'operations' ) )
            // InternalRest.g:3842:1: ( 'operations' )
            {
            // InternalRest.g:3842:1: ( 'operations' )
            // InternalRest.g:3843:2: 'operations'
            {
             before(grammarAccess.getRePutAccess().getOperationsKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getOperationsKeyword_6_0()); 

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
    // $ANTLR end "rule__RePut__Group_6__0__Impl"


    // $ANTLR start "rule__RePut__Group_6__1"
    // InternalRest.g:3852:1: rule__RePut__Group_6__1 : rule__RePut__Group_6__1__Impl rule__RePut__Group_6__2 ;
    public final void rule__RePut__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3856:1: ( rule__RePut__Group_6__1__Impl rule__RePut__Group_6__2 )
            // InternalRest.g:3857:2: rule__RePut__Group_6__1__Impl rule__RePut__Group_6__2
            {
            pushFollow(FOLLOW_25);
            rule__RePut__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_6__2();

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
    // $ANTLR end "rule__RePut__Group_6__1"


    // $ANTLR start "rule__RePut__Group_6__1__Impl"
    // InternalRest.g:3864:1: rule__RePut__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RePut__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3868:1: ( ( '{' ) )
            // InternalRest.g:3869:1: ( '{' )
            {
            // InternalRest.g:3869:1: ( '{' )
            // InternalRest.g:3870:2: '{'
            {
             before(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__RePut__Group_6__1__Impl"


    // $ANTLR start "rule__RePut__Group_6__2"
    // InternalRest.g:3879:1: rule__RePut__Group_6__2 : rule__RePut__Group_6__2__Impl rule__RePut__Group_6__3 ;
    public final void rule__RePut__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3883:1: ( rule__RePut__Group_6__2__Impl rule__RePut__Group_6__3 )
            // InternalRest.g:3884:2: rule__RePut__Group_6__2__Impl rule__RePut__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__RePut__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_6__3();

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
    // $ANTLR end "rule__RePut__Group_6__2"


    // $ANTLR start "rule__RePut__Group_6__2__Impl"
    // InternalRest.g:3891:1: rule__RePut__Group_6__2__Impl : ( ( rule__RePut__OperationsAssignment_6_2 ) ) ;
    public final void rule__RePut__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3895:1: ( ( ( rule__RePut__OperationsAssignment_6_2 ) ) )
            // InternalRest.g:3896:1: ( ( rule__RePut__OperationsAssignment_6_2 ) )
            {
            // InternalRest.g:3896:1: ( ( rule__RePut__OperationsAssignment_6_2 ) )
            // InternalRest.g:3897:2: ( rule__RePut__OperationsAssignment_6_2 )
            {
             before(grammarAccess.getRePutAccess().getOperationsAssignment_6_2()); 
            // InternalRest.g:3898:2: ( rule__RePut__OperationsAssignment_6_2 )
            // InternalRest.g:3898:3: rule__RePut__OperationsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__RePut__OperationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getOperationsAssignment_6_2()); 

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
    // $ANTLR end "rule__RePut__Group_6__2__Impl"


    // $ANTLR start "rule__RePut__Group_6__3"
    // InternalRest.g:3906:1: rule__RePut__Group_6__3 : rule__RePut__Group_6__3__Impl rule__RePut__Group_6__4 ;
    public final void rule__RePut__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3910:1: ( rule__RePut__Group_6__3__Impl rule__RePut__Group_6__4 )
            // InternalRest.g:3911:2: rule__RePut__Group_6__3__Impl rule__RePut__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__RePut__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_6__4();

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
    // $ANTLR end "rule__RePut__Group_6__3"


    // $ANTLR start "rule__RePut__Group_6__3__Impl"
    // InternalRest.g:3918:1: rule__RePut__Group_6__3__Impl : ( ( rule__RePut__Group_6_3__0 )* ) ;
    public final void rule__RePut__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3922:1: ( ( ( rule__RePut__Group_6_3__0 )* ) )
            // InternalRest.g:3923:1: ( ( rule__RePut__Group_6_3__0 )* )
            {
            // InternalRest.g:3923:1: ( ( rule__RePut__Group_6_3__0 )* )
            // InternalRest.g:3924:2: ( rule__RePut__Group_6_3__0 )*
            {
             before(grammarAccess.getRePutAccess().getGroup_6_3()); 
            // InternalRest.g:3925:2: ( rule__RePut__Group_6_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRest.g:3925:3: rule__RePut__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePut__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getRePutAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__RePut__Group_6__3__Impl"


    // $ANTLR start "rule__RePut__Group_6__4"
    // InternalRest.g:3933:1: rule__RePut__Group_6__4 : rule__RePut__Group_6__4__Impl ;
    public final void rule__RePut__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3937:1: ( rule__RePut__Group_6__4__Impl )
            // InternalRest.g:3938:2: rule__RePut__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_6__4__Impl();

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
    // $ANTLR end "rule__RePut__Group_6__4"


    // $ANTLR start "rule__RePut__Group_6__4__Impl"
    // InternalRest.g:3944:1: rule__RePut__Group_6__4__Impl : ( '}' ) ;
    public final void rule__RePut__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3948:1: ( ( '}' ) )
            // InternalRest.g:3949:1: ( '}' )
            {
            // InternalRest.g:3949:1: ( '}' )
            // InternalRest.g:3950:2: '}'
            {
             before(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__RePut__Group_6__4__Impl"


    // $ANTLR start "rule__RePut__Group_6_3__0"
    // InternalRest.g:3960:1: rule__RePut__Group_6_3__0 : rule__RePut__Group_6_3__0__Impl rule__RePut__Group_6_3__1 ;
    public final void rule__RePut__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3964:1: ( rule__RePut__Group_6_3__0__Impl rule__RePut__Group_6_3__1 )
            // InternalRest.g:3965:2: rule__RePut__Group_6_3__0__Impl rule__RePut__Group_6_3__1
            {
            pushFollow(FOLLOW_25);
            rule__RePut__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_6_3__1();

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
    // $ANTLR end "rule__RePut__Group_6_3__0"


    // $ANTLR start "rule__RePut__Group_6_3__0__Impl"
    // InternalRest.g:3972:1: rule__RePut__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RePut__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3976:1: ( ( ',' ) )
            // InternalRest.g:3977:1: ( ',' )
            {
            // InternalRest.g:3977:1: ( ',' )
            // InternalRest.g:3978:2: ','
            {
             before(grammarAccess.getRePutAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__RePut__Group_6_3__0__Impl"


    // $ANTLR start "rule__RePut__Group_6_3__1"
    // InternalRest.g:3987:1: rule__RePut__Group_6_3__1 : rule__RePut__Group_6_3__1__Impl ;
    public final void rule__RePut__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3991:1: ( rule__RePut__Group_6_3__1__Impl )
            // InternalRest.g:3992:2: rule__RePut__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__RePut__Group_6_3__1"


    // $ANTLR start "rule__RePut__Group_6_3__1__Impl"
    // InternalRest.g:3998:1: rule__RePut__Group_6_3__1__Impl : ( ( rule__RePut__OperationsAssignment_6_3_1 ) ) ;
    public final void rule__RePut__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4002:1: ( ( ( rule__RePut__OperationsAssignment_6_3_1 ) ) )
            // InternalRest.g:4003:1: ( ( rule__RePut__OperationsAssignment_6_3_1 ) )
            {
            // InternalRest.g:4003:1: ( ( rule__RePut__OperationsAssignment_6_3_1 ) )
            // InternalRest.g:4004:2: ( rule__RePut__OperationsAssignment_6_3_1 )
            {
             before(grammarAccess.getRePutAccess().getOperationsAssignment_6_3_1()); 
            // InternalRest.g:4005:2: ( rule__RePut__OperationsAssignment_6_3_1 )
            // InternalRest.g:4005:3: rule__RePut__OperationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePut__OperationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getOperationsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__RePut__Group_6_3__1__Impl"


    // $ANTLR start "rule__RePut__Group_7__0"
    // InternalRest.g:4014:1: rule__RePut__Group_7__0 : rule__RePut__Group_7__0__Impl rule__RePut__Group_7__1 ;
    public final void rule__RePut__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4018:1: ( rule__RePut__Group_7__0__Impl rule__RePut__Group_7__1 )
            // InternalRest.g:4019:2: rule__RePut__Group_7__0__Impl rule__RePut__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__RePut__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_7__1();

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
    // $ANTLR end "rule__RePut__Group_7__0"


    // $ANTLR start "rule__RePut__Group_7__0__Impl"
    // InternalRest.g:4026:1: rule__RePut__Group_7__0__Impl : ( 'parameters' ) ;
    public final void rule__RePut__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4030:1: ( ( 'parameters' ) )
            // InternalRest.g:4031:1: ( 'parameters' )
            {
            // InternalRest.g:4031:1: ( 'parameters' )
            // InternalRest.g:4032:2: 'parameters'
            {
             before(grammarAccess.getRePutAccess().getParametersKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getParametersKeyword_7_0()); 

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
    // $ANTLR end "rule__RePut__Group_7__0__Impl"


    // $ANTLR start "rule__RePut__Group_7__1"
    // InternalRest.g:4041:1: rule__RePut__Group_7__1 : rule__RePut__Group_7__1__Impl rule__RePut__Group_7__2 ;
    public final void rule__RePut__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4045:1: ( rule__RePut__Group_7__1__Impl rule__RePut__Group_7__2 )
            // InternalRest.g:4046:2: rule__RePut__Group_7__1__Impl rule__RePut__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__RePut__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_7__2();

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
    // $ANTLR end "rule__RePut__Group_7__1"


    // $ANTLR start "rule__RePut__Group_7__1__Impl"
    // InternalRest.g:4053:1: rule__RePut__Group_7__1__Impl : ( '{' ) ;
    public final void rule__RePut__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4057:1: ( ( '{' ) )
            // InternalRest.g:4058:1: ( '{' )
            {
            // InternalRest.g:4058:1: ( '{' )
            // InternalRest.g:4059:2: '{'
            {
             before(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__RePut__Group_7__1__Impl"


    // $ANTLR start "rule__RePut__Group_7__2"
    // InternalRest.g:4068:1: rule__RePut__Group_7__2 : rule__RePut__Group_7__2__Impl rule__RePut__Group_7__3 ;
    public final void rule__RePut__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4072:1: ( rule__RePut__Group_7__2__Impl rule__RePut__Group_7__3 )
            // InternalRest.g:4073:2: rule__RePut__Group_7__2__Impl rule__RePut__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__RePut__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_7__3();

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
    // $ANTLR end "rule__RePut__Group_7__2"


    // $ANTLR start "rule__RePut__Group_7__2__Impl"
    // InternalRest.g:4080:1: rule__RePut__Group_7__2__Impl : ( ( rule__RePut__ParametersAssignment_7_2 ) ) ;
    public final void rule__RePut__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4084:1: ( ( ( rule__RePut__ParametersAssignment_7_2 ) ) )
            // InternalRest.g:4085:1: ( ( rule__RePut__ParametersAssignment_7_2 ) )
            {
            // InternalRest.g:4085:1: ( ( rule__RePut__ParametersAssignment_7_2 ) )
            // InternalRest.g:4086:2: ( rule__RePut__ParametersAssignment_7_2 )
            {
             before(grammarAccess.getRePutAccess().getParametersAssignment_7_2()); 
            // InternalRest.g:4087:2: ( rule__RePut__ParametersAssignment_7_2 )
            // InternalRest.g:4087:3: rule__RePut__ParametersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__RePut__ParametersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getParametersAssignment_7_2()); 

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
    // $ANTLR end "rule__RePut__Group_7__2__Impl"


    // $ANTLR start "rule__RePut__Group_7__3"
    // InternalRest.g:4095:1: rule__RePut__Group_7__3 : rule__RePut__Group_7__3__Impl rule__RePut__Group_7__4 ;
    public final void rule__RePut__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4099:1: ( rule__RePut__Group_7__3__Impl rule__RePut__Group_7__4 )
            // InternalRest.g:4100:2: rule__RePut__Group_7__3__Impl rule__RePut__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__RePut__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_7__4();

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
    // $ANTLR end "rule__RePut__Group_7__3"


    // $ANTLR start "rule__RePut__Group_7__3__Impl"
    // InternalRest.g:4107:1: rule__RePut__Group_7__3__Impl : ( ( rule__RePut__Group_7_3__0 )* ) ;
    public final void rule__RePut__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4111:1: ( ( ( rule__RePut__Group_7_3__0 )* ) )
            // InternalRest.g:4112:1: ( ( rule__RePut__Group_7_3__0 )* )
            {
            // InternalRest.g:4112:1: ( ( rule__RePut__Group_7_3__0 )* )
            // InternalRest.g:4113:2: ( rule__RePut__Group_7_3__0 )*
            {
             before(grammarAccess.getRePutAccess().getGroup_7_3()); 
            // InternalRest.g:4114:2: ( rule__RePut__Group_7_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRest.g:4114:3: rule__RePut__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePut__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getRePutAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__RePut__Group_7__3__Impl"


    // $ANTLR start "rule__RePut__Group_7__4"
    // InternalRest.g:4122:1: rule__RePut__Group_7__4 : rule__RePut__Group_7__4__Impl ;
    public final void rule__RePut__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4126:1: ( rule__RePut__Group_7__4__Impl )
            // InternalRest.g:4127:2: rule__RePut__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_7__4__Impl();

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
    // $ANTLR end "rule__RePut__Group_7__4"


    // $ANTLR start "rule__RePut__Group_7__4__Impl"
    // InternalRest.g:4133:1: rule__RePut__Group_7__4__Impl : ( '}' ) ;
    public final void rule__RePut__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4137:1: ( ( '}' ) )
            // InternalRest.g:4138:1: ( '}' )
            {
            // InternalRest.g:4138:1: ( '}' )
            // InternalRest.g:4139:2: '}'
            {
             before(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__RePut__Group_7__4__Impl"


    // $ANTLR start "rule__RePut__Group_7_3__0"
    // InternalRest.g:4149:1: rule__RePut__Group_7_3__0 : rule__RePut__Group_7_3__0__Impl rule__RePut__Group_7_3__1 ;
    public final void rule__RePut__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4153:1: ( rule__RePut__Group_7_3__0__Impl rule__RePut__Group_7_3__1 )
            // InternalRest.g:4154:2: rule__RePut__Group_7_3__0__Impl rule__RePut__Group_7_3__1
            {
            pushFollow(FOLLOW_20);
            rule__RePut__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_7_3__1();

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
    // $ANTLR end "rule__RePut__Group_7_3__0"


    // $ANTLR start "rule__RePut__Group_7_3__0__Impl"
    // InternalRest.g:4161:1: rule__RePut__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__RePut__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4165:1: ( ( ',' ) )
            // InternalRest.g:4166:1: ( ',' )
            {
            // InternalRest.g:4166:1: ( ',' )
            // InternalRest.g:4167:2: ','
            {
             before(grammarAccess.getRePutAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__RePut__Group_7_3__0__Impl"


    // $ANTLR start "rule__RePut__Group_7_3__1"
    // InternalRest.g:4176:1: rule__RePut__Group_7_3__1 : rule__RePut__Group_7_3__1__Impl ;
    public final void rule__RePut__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4180:1: ( rule__RePut__Group_7_3__1__Impl )
            // InternalRest.g:4181:2: rule__RePut__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__RePut__Group_7_3__1"


    // $ANTLR start "rule__RePut__Group_7_3__1__Impl"
    // InternalRest.g:4187:1: rule__RePut__Group_7_3__1__Impl : ( ( rule__RePut__ParametersAssignment_7_3_1 ) ) ;
    public final void rule__RePut__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4191:1: ( ( ( rule__RePut__ParametersAssignment_7_3_1 ) ) )
            // InternalRest.g:4192:1: ( ( rule__RePut__ParametersAssignment_7_3_1 ) )
            {
            // InternalRest.g:4192:1: ( ( rule__RePut__ParametersAssignment_7_3_1 ) )
            // InternalRest.g:4193:2: ( rule__RePut__ParametersAssignment_7_3_1 )
            {
             before(grammarAccess.getRePutAccess().getParametersAssignment_7_3_1()); 
            // InternalRest.g:4194:2: ( rule__RePut__ParametersAssignment_7_3_1 )
            // InternalRest.g:4194:3: rule__RePut__ParametersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePut__ParametersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getParametersAssignment_7_3_1()); 

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
    // $ANTLR end "rule__RePut__Group_7_3__1__Impl"


    // $ANTLR start "rule__ReDelete__Group__0"
    // InternalRest.g:4203:1: rule__ReDelete__Group__0 : rule__ReDelete__Group__0__Impl rule__ReDelete__Group__1 ;
    public final void rule__ReDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4207:1: ( rule__ReDelete__Group__0__Impl rule__ReDelete__Group__1 )
            // InternalRest.g:4208:2: rule__ReDelete__Group__0__Impl rule__ReDelete__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ReDelete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__1();

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
    // $ANTLR end "rule__ReDelete__Group__0"


    // $ANTLR start "rule__ReDelete__Group__0__Impl"
    // InternalRest.g:4215:1: rule__ReDelete__Group__0__Impl : ( 'ReDelete' ) ;
    public final void rule__ReDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4219:1: ( ( 'ReDelete' ) )
            // InternalRest.g:4220:1: ( 'ReDelete' )
            {
            // InternalRest.g:4220:1: ( 'ReDelete' )
            // InternalRest.g:4221:2: 'ReDelete'
            {
             before(grammarAccess.getReDeleteAccess().getReDeleteKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getReDeleteKeyword_0()); 

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
    // $ANTLR end "rule__ReDelete__Group__0__Impl"


    // $ANTLR start "rule__ReDelete__Group__1"
    // InternalRest.g:4230:1: rule__ReDelete__Group__1 : rule__ReDelete__Group__1__Impl rule__ReDelete__Group__2 ;
    public final void rule__ReDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4234:1: ( rule__ReDelete__Group__1__Impl rule__ReDelete__Group__2 )
            // InternalRest.g:4235:2: rule__ReDelete__Group__1__Impl rule__ReDelete__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ReDelete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__2();

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
    // $ANTLR end "rule__ReDelete__Group__1"


    // $ANTLR start "rule__ReDelete__Group__1__Impl"
    // InternalRest.g:4242:1: rule__ReDelete__Group__1__Impl : ( '{' ) ;
    public final void rule__ReDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4246:1: ( ( '{' ) )
            // InternalRest.g:4247:1: ( '{' )
            {
            // InternalRest.g:4247:1: ( '{' )
            // InternalRest.g:4248:2: '{'
            {
             before(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ReDelete__Group__1__Impl"


    // $ANTLR start "rule__ReDelete__Group__2"
    // InternalRest.g:4257:1: rule__ReDelete__Group__2 : rule__ReDelete__Group__2__Impl rule__ReDelete__Group__3 ;
    public final void rule__ReDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4261:1: ( rule__ReDelete__Group__2__Impl rule__ReDelete__Group__3 )
            // InternalRest.g:4262:2: rule__ReDelete__Group__2__Impl rule__ReDelete__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ReDelete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__3();

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
    // $ANTLR end "rule__ReDelete__Group__2"


    // $ANTLR start "rule__ReDelete__Group__2__Impl"
    // InternalRest.g:4269:1: rule__ReDelete__Group__2__Impl : ( 'succAnswer' ) ;
    public final void rule__ReDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4273:1: ( ( 'succAnswer' ) )
            // InternalRest.g:4274:1: ( 'succAnswer' )
            {
            // InternalRest.g:4274:1: ( 'succAnswer' )
            // InternalRest.g:4275:2: 'succAnswer'
            {
             before(grammarAccess.getReDeleteAccess().getSuccAnswerKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getSuccAnswerKeyword_2()); 

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
    // $ANTLR end "rule__ReDelete__Group__2__Impl"


    // $ANTLR start "rule__ReDelete__Group__3"
    // InternalRest.g:4284:1: rule__ReDelete__Group__3 : rule__ReDelete__Group__3__Impl rule__ReDelete__Group__4 ;
    public final void rule__ReDelete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4288:1: ( rule__ReDelete__Group__3__Impl rule__ReDelete__Group__4 )
            // InternalRest.g:4289:2: rule__ReDelete__Group__3__Impl rule__ReDelete__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ReDelete__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__4();

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
    // $ANTLR end "rule__ReDelete__Group__3"


    // $ANTLR start "rule__ReDelete__Group__3__Impl"
    // InternalRest.g:4296:1: rule__ReDelete__Group__3__Impl : ( ( rule__ReDelete__SuccAnswerAssignment_3 ) ) ;
    public final void rule__ReDelete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4300:1: ( ( ( rule__ReDelete__SuccAnswerAssignment_3 ) ) )
            // InternalRest.g:4301:1: ( ( rule__ReDelete__SuccAnswerAssignment_3 ) )
            {
            // InternalRest.g:4301:1: ( ( rule__ReDelete__SuccAnswerAssignment_3 ) )
            // InternalRest.g:4302:2: ( rule__ReDelete__SuccAnswerAssignment_3 )
            {
             before(grammarAccess.getReDeleteAccess().getSuccAnswerAssignment_3()); 
            // InternalRest.g:4303:2: ( rule__ReDelete__SuccAnswerAssignment_3 )
            // InternalRest.g:4303:3: rule__ReDelete__SuccAnswerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__SuccAnswerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getSuccAnswerAssignment_3()); 

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
    // $ANTLR end "rule__ReDelete__Group__3__Impl"


    // $ANTLR start "rule__ReDelete__Group__4"
    // InternalRest.g:4311:1: rule__ReDelete__Group__4 : rule__ReDelete__Group__4__Impl rule__ReDelete__Group__5 ;
    public final void rule__ReDelete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4315:1: ( rule__ReDelete__Group__4__Impl rule__ReDelete__Group__5 )
            // InternalRest.g:4316:2: rule__ReDelete__Group__4__Impl rule__ReDelete__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ReDelete__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__5();

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
    // $ANTLR end "rule__ReDelete__Group__4"


    // $ANTLR start "rule__ReDelete__Group__4__Impl"
    // InternalRest.g:4323:1: rule__ReDelete__Group__4__Impl : ( 'route' ) ;
    public final void rule__ReDelete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4327:1: ( ( 'route' ) )
            // InternalRest.g:4328:1: ( 'route' )
            {
            // InternalRest.g:4328:1: ( 'route' )
            // InternalRest.g:4329:2: 'route'
            {
             before(grammarAccess.getReDeleteAccess().getRouteKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRouteKeyword_4()); 

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
    // $ANTLR end "rule__ReDelete__Group__4__Impl"


    // $ANTLR start "rule__ReDelete__Group__5"
    // InternalRest.g:4338:1: rule__ReDelete__Group__5 : rule__ReDelete__Group__5__Impl rule__ReDelete__Group__6 ;
    public final void rule__ReDelete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4342:1: ( rule__ReDelete__Group__5__Impl rule__ReDelete__Group__6 )
            // InternalRest.g:4343:2: rule__ReDelete__Group__5__Impl rule__ReDelete__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ReDelete__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__6();

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
    // $ANTLR end "rule__ReDelete__Group__5"


    // $ANTLR start "rule__ReDelete__Group__5__Impl"
    // InternalRest.g:4350:1: rule__ReDelete__Group__5__Impl : ( ( rule__ReDelete__RouteAssignment_5 ) ) ;
    public final void rule__ReDelete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4354:1: ( ( ( rule__ReDelete__RouteAssignment_5 ) ) )
            // InternalRest.g:4355:1: ( ( rule__ReDelete__RouteAssignment_5 ) )
            {
            // InternalRest.g:4355:1: ( ( rule__ReDelete__RouteAssignment_5 ) )
            // InternalRest.g:4356:2: ( rule__ReDelete__RouteAssignment_5 )
            {
             before(grammarAccess.getReDeleteAccess().getRouteAssignment_5()); 
            // InternalRest.g:4357:2: ( rule__ReDelete__RouteAssignment_5 )
            // InternalRest.g:4357:3: rule__ReDelete__RouteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__RouteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getRouteAssignment_5()); 

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
    // $ANTLR end "rule__ReDelete__Group__5__Impl"


    // $ANTLR start "rule__ReDelete__Group__6"
    // InternalRest.g:4365:1: rule__ReDelete__Group__6 : rule__ReDelete__Group__6__Impl rule__ReDelete__Group__7 ;
    public final void rule__ReDelete__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4369:1: ( rule__ReDelete__Group__6__Impl rule__ReDelete__Group__7 )
            // InternalRest.g:4370:2: rule__ReDelete__Group__6__Impl rule__ReDelete__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__ReDelete__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__7();

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
    // $ANTLR end "rule__ReDelete__Group__6"


    // $ANTLR start "rule__ReDelete__Group__6__Impl"
    // InternalRest.g:4377:1: rule__ReDelete__Group__6__Impl : ( ( rule__ReDelete__Group_6__0 )? ) ;
    public final void rule__ReDelete__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4381:1: ( ( ( rule__ReDelete__Group_6__0 )? ) )
            // InternalRest.g:4382:1: ( ( rule__ReDelete__Group_6__0 )? )
            {
            // InternalRest.g:4382:1: ( ( rule__ReDelete__Group_6__0 )? )
            // InternalRest.g:4383:2: ( rule__ReDelete__Group_6__0 )?
            {
             before(grammarAccess.getReDeleteAccess().getGroup_6()); 
            // InternalRest.g:4384:2: ( rule__ReDelete__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRest.g:4384:3: rule__ReDelete__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReDelete__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReDeleteAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ReDelete__Group__6__Impl"


    // $ANTLR start "rule__ReDelete__Group__7"
    // InternalRest.g:4392:1: rule__ReDelete__Group__7 : rule__ReDelete__Group__7__Impl rule__ReDelete__Group__8 ;
    public final void rule__ReDelete__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4396:1: ( rule__ReDelete__Group__7__Impl rule__ReDelete__Group__8 )
            // InternalRest.g:4397:2: rule__ReDelete__Group__7__Impl rule__ReDelete__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__ReDelete__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__8();

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
    // $ANTLR end "rule__ReDelete__Group__7"


    // $ANTLR start "rule__ReDelete__Group__7__Impl"
    // InternalRest.g:4404:1: rule__ReDelete__Group__7__Impl : ( ( rule__ReDelete__Group_7__0 )? ) ;
    public final void rule__ReDelete__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4408:1: ( ( ( rule__ReDelete__Group_7__0 )? ) )
            // InternalRest.g:4409:1: ( ( rule__ReDelete__Group_7__0 )? )
            {
            // InternalRest.g:4409:1: ( ( rule__ReDelete__Group_7__0 )? )
            // InternalRest.g:4410:2: ( rule__ReDelete__Group_7__0 )?
            {
             before(grammarAccess.getReDeleteAccess().getGroup_7()); 
            // InternalRest.g:4411:2: ( rule__ReDelete__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRest.g:4411:3: rule__ReDelete__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReDelete__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReDeleteAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ReDelete__Group__7__Impl"


    // $ANTLR start "rule__ReDelete__Group__8"
    // InternalRest.g:4419:1: rule__ReDelete__Group__8 : rule__ReDelete__Group__8__Impl ;
    public final void rule__ReDelete__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4423:1: ( rule__ReDelete__Group__8__Impl )
            // InternalRest.g:4424:2: rule__ReDelete__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__8__Impl();

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
    // $ANTLR end "rule__ReDelete__Group__8"


    // $ANTLR start "rule__ReDelete__Group__8__Impl"
    // InternalRest.g:4430:1: rule__ReDelete__Group__8__Impl : ( '}' ) ;
    public final void rule__ReDelete__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4434:1: ( ( '}' ) )
            // InternalRest.g:4435:1: ( '}' )
            {
            // InternalRest.g:4435:1: ( '}' )
            // InternalRest.g:4436:2: '}'
            {
             before(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ReDelete__Group__8__Impl"


    // $ANTLR start "rule__ReDelete__Group_6__0"
    // InternalRest.g:4446:1: rule__ReDelete__Group_6__0 : rule__ReDelete__Group_6__0__Impl rule__ReDelete__Group_6__1 ;
    public final void rule__ReDelete__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4450:1: ( rule__ReDelete__Group_6__0__Impl rule__ReDelete__Group_6__1 )
            // InternalRest.g:4451:2: rule__ReDelete__Group_6__0__Impl rule__ReDelete__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__ReDelete__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_6__1();

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
    // $ANTLR end "rule__ReDelete__Group_6__0"


    // $ANTLR start "rule__ReDelete__Group_6__0__Impl"
    // InternalRest.g:4458:1: rule__ReDelete__Group_6__0__Impl : ( 'operations' ) ;
    public final void rule__ReDelete__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4462:1: ( ( 'operations' ) )
            // InternalRest.g:4463:1: ( 'operations' )
            {
            // InternalRest.g:4463:1: ( 'operations' )
            // InternalRest.g:4464:2: 'operations'
            {
             before(grammarAccess.getReDeleteAccess().getOperationsKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getOperationsKeyword_6_0()); 

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
    // $ANTLR end "rule__ReDelete__Group_6__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_6__1"
    // InternalRest.g:4473:1: rule__ReDelete__Group_6__1 : rule__ReDelete__Group_6__1__Impl rule__ReDelete__Group_6__2 ;
    public final void rule__ReDelete__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4477:1: ( rule__ReDelete__Group_6__1__Impl rule__ReDelete__Group_6__2 )
            // InternalRest.g:4478:2: rule__ReDelete__Group_6__1__Impl rule__ReDelete__Group_6__2
            {
            pushFollow(FOLLOW_25);
            rule__ReDelete__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_6__2();

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
    // $ANTLR end "rule__ReDelete__Group_6__1"


    // $ANTLR start "rule__ReDelete__Group_6__1__Impl"
    // InternalRest.g:4485:1: rule__ReDelete__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ReDelete__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4489:1: ( ( '{' ) )
            // InternalRest.g:4490:1: ( '{' )
            {
            // InternalRest.g:4490:1: ( '{' )
            // InternalRest.g:4491:2: '{'
            {
             before(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__ReDelete__Group_6__1__Impl"


    // $ANTLR start "rule__ReDelete__Group_6__2"
    // InternalRest.g:4500:1: rule__ReDelete__Group_6__2 : rule__ReDelete__Group_6__2__Impl rule__ReDelete__Group_6__3 ;
    public final void rule__ReDelete__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4504:1: ( rule__ReDelete__Group_6__2__Impl rule__ReDelete__Group_6__3 )
            // InternalRest.g:4505:2: rule__ReDelete__Group_6__2__Impl rule__ReDelete__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__ReDelete__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_6__3();

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
    // $ANTLR end "rule__ReDelete__Group_6__2"


    // $ANTLR start "rule__ReDelete__Group_6__2__Impl"
    // InternalRest.g:4512:1: rule__ReDelete__Group_6__2__Impl : ( ( rule__ReDelete__OperationsAssignment_6_2 ) ) ;
    public final void rule__ReDelete__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4516:1: ( ( ( rule__ReDelete__OperationsAssignment_6_2 ) ) )
            // InternalRest.g:4517:1: ( ( rule__ReDelete__OperationsAssignment_6_2 ) )
            {
            // InternalRest.g:4517:1: ( ( rule__ReDelete__OperationsAssignment_6_2 ) )
            // InternalRest.g:4518:2: ( rule__ReDelete__OperationsAssignment_6_2 )
            {
             before(grammarAccess.getReDeleteAccess().getOperationsAssignment_6_2()); 
            // InternalRest.g:4519:2: ( rule__ReDelete__OperationsAssignment_6_2 )
            // InternalRest.g:4519:3: rule__ReDelete__OperationsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__OperationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getOperationsAssignment_6_2()); 

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
    // $ANTLR end "rule__ReDelete__Group_6__2__Impl"


    // $ANTLR start "rule__ReDelete__Group_6__3"
    // InternalRest.g:4527:1: rule__ReDelete__Group_6__3 : rule__ReDelete__Group_6__3__Impl rule__ReDelete__Group_6__4 ;
    public final void rule__ReDelete__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4531:1: ( rule__ReDelete__Group_6__3__Impl rule__ReDelete__Group_6__4 )
            // InternalRest.g:4532:2: rule__ReDelete__Group_6__3__Impl rule__ReDelete__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__ReDelete__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_6__4();

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
    // $ANTLR end "rule__ReDelete__Group_6__3"


    // $ANTLR start "rule__ReDelete__Group_6__3__Impl"
    // InternalRest.g:4539:1: rule__ReDelete__Group_6__3__Impl : ( ( rule__ReDelete__Group_6_3__0 )* ) ;
    public final void rule__ReDelete__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4543:1: ( ( ( rule__ReDelete__Group_6_3__0 )* ) )
            // InternalRest.g:4544:1: ( ( rule__ReDelete__Group_6_3__0 )* )
            {
            // InternalRest.g:4544:1: ( ( rule__ReDelete__Group_6_3__0 )* )
            // InternalRest.g:4545:2: ( rule__ReDelete__Group_6_3__0 )*
            {
             before(grammarAccess.getReDeleteAccess().getGroup_6_3()); 
            // InternalRest.g:4546:2: ( rule__ReDelete__Group_6_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRest.g:4546:3: rule__ReDelete__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReDelete__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getReDeleteAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__ReDelete__Group_6__3__Impl"


    // $ANTLR start "rule__ReDelete__Group_6__4"
    // InternalRest.g:4554:1: rule__ReDelete__Group_6__4 : rule__ReDelete__Group_6__4__Impl ;
    public final void rule__ReDelete__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4558:1: ( rule__ReDelete__Group_6__4__Impl )
            // InternalRest.g:4559:2: rule__ReDelete__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_6__4__Impl();

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
    // $ANTLR end "rule__ReDelete__Group_6__4"


    // $ANTLR start "rule__ReDelete__Group_6__4__Impl"
    // InternalRest.g:4565:1: rule__ReDelete__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ReDelete__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4569:1: ( ( '}' ) )
            // InternalRest.g:4570:1: ( '}' )
            {
            // InternalRest.g:4570:1: ( '}' )
            // InternalRest.g:4571:2: '}'
            {
             before(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__ReDelete__Group_6__4__Impl"


    // $ANTLR start "rule__ReDelete__Group_6_3__0"
    // InternalRest.g:4581:1: rule__ReDelete__Group_6_3__0 : rule__ReDelete__Group_6_3__0__Impl rule__ReDelete__Group_6_3__1 ;
    public final void rule__ReDelete__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4585:1: ( rule__ReDelete__Group_6_3__0__Impl rule__ReDelete__Group_6_3__1 )
            // InternalRest.g:4586:2: rule__ReDelete__Group_6_3__0__Impl rule__ReDelete__Group_6_3__1
            {
            pushFollow(FOLLOW_25);
            rule__ReDelete__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_6_3__1();

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
    // $ANTLR end "rule__ReDelete__Group_6_3__0"


    // $ANTLR start "rule__ReDelete__Group_6_3__0__Impl"
    // InternalRest.g:4593:1: rule__ReDelete__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ReDelete__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4597:1: ( ( ',' ) )
            // InternalRest.g:4598:1: ( ',' )
            {
            // InternalRest.g:4598:1: ( ',' )
            // InternalRest.g:4599:2: ','
            {
             before(grammarAccess.getReDeleteAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__ReDelete__Group_6_3__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_6_3__1"
    // InternalRest.g:4608:1: rule__ReDelete__Group_6_3__1 : rule__ReDelete__Group_6_3__1__Impl ;
    public final void rule__ReDelete__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4612:1: ( rule__ReDelete__Group_6_3__1__Impl )
            // InternalRest.g:4613:2: rule__ReDelete__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__ReDelete__Group_6_3__1"


    // $ANTLR start "rule__ReDelete__Group_6_3__1__Impl"
    // InternalRest.g:4619:1: rule__ReDelete__Group_6_3__1__Impl : ( ( rule__ReDelete__OperationsAssignment_6_3_1 ) ) ;
    public final void rule__ReDelete__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4623:1: ( ( ( rule__ReDelete__OperationsAssignment_6_3_1 ) ) )
            // InternalRest.g:4624:1: ( ( rule__ReDelete__OperationsAssignment_6_3_1 ) )
            {
            // InternalRest.g:4624:1: ( ( rule__ReDelete__OperationsAssignment_6_3_1 ) )
            // InternalRest.g:4625:2: ( rule__ReDelete__OperationsAssignment_6_3_1 )
            {
             before(grammarAccess.getReDeleteAccess().getOperationsAssignment_6_3_1()); 
            // InternalRest.g:4626:2: ( rule__ReDelete__OperationsAssignment_6_3_1 )
            // InternalRest.g:4626:3: rule__ReDelete__OperationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__OperationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getOperationsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__ReDelete__Group_6_3__1__Impl"


    // $ANTLR start "rule__ReDelete__Group_7__0"
    // InternalRest.g:4635:1: rule__ReDelete__Group_7__0 : rule__ReDelete__Group_7__0__Impl rule__ReDelete__Group_7__1 ;
    public final void rule__ReDelete__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4639:1: ( rule__ReDelete__Group_7__0__Impl rule__ReDelete__Group_7__1 )
            // InternalRest.g:4640:2: rule__ReDelete__Group_7__0__Impl rule__ReDelete__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__ReDelete__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_7__1();

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
    // $ANTLR end "rule__ReDelete__Group_7__0"


    // $ANTLR start "rule__ReDelete__Group_7__0__Impl"
    // InternalRest.g:4647:1: rule__ReDelete__Group_7__0__Impl : ( 'parameters' ) ;
    public final void rule__ReDelete__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4651:1: ( ( 'parameters' ) )
            // InternalRest.g:4652:1: ( 'parameters' )
            {
            // InternalRest.g:4652:1: ( 'parameters' )
            // InternalRest.g:4653:2: 'parameters'
            {
             before(grammarAccess.getReDeleteAccess().getParametersKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getParametersKeyword_7_0()); 

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
    // $ANTLR end "rule__ReDelete__Group_7__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_7__1"
    // InternalRest.g:4662:1: rule__ReDelete__Group_7__1 : rule__ReDelete__Group_7__1__Impl rule__ReDelete__Group_7__2 ;
    public final void rule__ReDelete__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4666:1: ( rule__ReDelete__Group_7__1__Impl rule__ReDelete__Group_7__2 )
            // InternalRest.g:4667:2: rule__ReDelete__Group_7__1__Impl rule__ReDelete__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__ReDelete__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_7__2();

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
    // $ANTLR end "rule__ReDelete__Group_7__1"


    // $ANTLR start "rule__ReDelete__Group_7__1__Impl"
    // InternalRest.g:4674:1: rule__ReDelete__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ReDelete__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4678:1: ( ( '{' ) )
            // InternalRest.g:4679:1: ( '{' )
            {
            // InternalRest.g:4679:1: ( '{' )
            // InternalRest.g:4680:2: '{'
            {
             before(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__ReDelete__Group_7__1__Impl"


    // $ANTLR start "rule__ReDelete__Group_7__2"
    // InternalRest.g:4689:1: rule__ReDelete__Group_7__2 : rule__ReDelete__Group_7__2__Impl rule__ReDelete__Group_7__3 ;
    public final void rule__ReDelete__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4693:1: ( rule__ReDelete__Group_7__2__Impl rule__ReDelete__Group_7__3 )
            // InternalRest.g:4694:2: rule__ReDelete__Group_7__2__Impl rule__ReDelete__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__ReDelete__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_7__3();

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
    // $ANTLR end "rule__ReDelete__Group_7__2"


    // $ANTLR start "rule__ReDelete__Group_7__2__Impl"
    // InternalRest.g:4701:1: rule__ReDelete__Group_7__2__Impl : ( ( rule__ReDelete__ParametersAssignment_7_2 ) ) ;
    public final void rule__ReDelete__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4705:1: ( ( ( rule__ReDelete__ParametersAssignment_7_2 ) ) )
            // InternalRest.g:4706:1: ( ( rule__ReDelete__ParametersAssignment_7_2 ) )
            {
            // InternalRest.g:4706:1: ( ( rule__ReDelete__ParametersAssignment_7_2 ) )
            // InternalRest.g:4707:2: ( rule__ReDelete__ParametersAssignment_7_2 )
            {
             before(grammarAccess.getReDeleteAccess().getParametersAssignment_7_2()); 
            // InternalRest.g:4708:2: ( rule__ReDelete__ParametersAssignment_7_2 )
            // InternalRest.g:4708:3: rule__ReDelete__ParametersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__ParametersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getParametersAssignment_7_2()); 

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
    // $ANTLR end "rule__ReDelete__Group_7__2__Impl"


    // $ANTLR start "rule__ReDelete__Group_7__3"
    // InternalRest.g:4716:1: rule__ReDelete__Group_7__3 : rule__ReDelete__Group_7__3__Impl rule__ReDelete__Group_7__4 ;
    public final void rule__ReDelete__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4720:1: ( rule__ReDelete__Group_7__3__Impl rule__ReDelete__Group_7__4 )
            // InternalRest.g:4721:2: rule__ReDelete__Group_7__3__Impl rule__ReDelete__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__ReDelete__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_7__4();

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
    // $ANTLR end "rule__ReDelete__Group_7__3"


    // $ANTLR start "rule__ReDelete__Group_7__3__Impl"
    // InternalRest.g:4728:1: rule__ReDelete__Group_7__3__Impl : ( ( rule__ReDelete__Group_7_3__0 )* ) ;
    public final void rule__ReDelete__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4732:1: ( ( ( rule__ReDelete__Group_7_3__0 )* ) )
            // InternalRest.g:4733:1: ( ( rule__ReDelete__Group_7_3__0 )* )
            {
            // InternalRest.g:4733:1: ( ( rule__ReDelete__Group_7_3__0 )* )
            // InternalRest.g:4734:2: ( rule__ReDelete__Group_7_3__0 )*
            {
             before(grammarAccess.getReDeleteAccess().getGroup_7_3()); 
            // InternalRest.g:4735:2: ( rule__ReDelete__Group_7_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRest.g:4735:3: rule__ReDelete__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReDelete__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getReDeleteAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__ReDelete__Group_7__3__Impl"


    // $ANTLR start "rule__ReDelete__Group_7__4"
    // InternalRest.g:4743:1: rule__ReDelete__Group_7__4 : rule__ReDelete__Group_7__4__Impl ;
    public final void rule__ReDelete__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4747:1: ( rule__ReDelete__Group_7__4__Impl )
            // InternalRest.g:4748:2: rule__ReDelete__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_7__4__Impl();

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
    // $ANTLR end "rule__ReDelete__Group_7__4"


    // $ANTLR start "rule__ReDelete__Group_7__4__Impl"
    // InternalRest.g:4754:1: rule__ReDelete__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ReDelete__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4758:1: ( ( '}' ) )
            // InternalRest.g:4759:1: ( '}' )
            {
            // InternalRest.g:4759:1: ( '}' )
            // InternalRest.g:4760:2: '}'
            {
             before(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__ReDelete__Group_7__4__Impl"


    // $ANTLR start "rule__ReDelete__Group_7_3__0"
    // InternalRest.g:4770:1: rule__ReDelete__Group_7_3__0 : rule__ReDelete__Group_7_3__0__Impl rule__ReDelete__Group_7_3__1 ;
    public final void rule__ReDelete__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4774:1: ( rule__ReDelete__Group_7_3__0__Impl rule__ReDelete__Group_7_3__1 )
            // InternalRest.g:4775:2: rule__ReDelete__Group_7_3__0__Impl rule__ReDelete__Group_7_3__1
            {
            pushFollow(FOLLOW_20);
            rule__ReDelete__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_7_3__1();

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
    // $ANTLR end "rule__ReDelete__Group_7_3__0"


    // $ANTLR start "rule__ReDelete__Group_7_3__0__Impl"
    // InternalRest.g:4782:1: rule__ReDelete__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ReDelete__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4786:1: ( ( ',' ) )
            // InternalRest.g:4787:1: ( ',' )
            {
            // InternalRest.g:4787:1: ( ',' )
            // InternalRest.g:4788:2: ','
            {
             before(grammarAccess.getReDeleteAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__ReDelete__Group_7_3__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_7_3__1"
    // InternalRest.g:4797:1: rule__ReDelete__Group_7_3__1 : rule__ReDelete__Group_7_3__1__Impl ;
    public final void rule__ReDelete__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4801:1: ( rule__ReDelete__Group_7_3__1__Impl )
            // InternalRest.g:4802:2: rule__ReDelete__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__ReDelete__Group_7_3__1"


    // $ANTLR start "rule__ReDelete__Group_7_3__1__Impl"
    // InternalRest.g:4808:1: rule__ReDelete__Group_7_3__1__Impl : ( ( rule__ReDelete__ParametersAssignment_7_3_1 ) ) ;
    public final void rule__ReDelete__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4812:1: ( ( ( rule__ReDelete__ParametersAssignment_7_3_1 ) ) )
            // InternalRest.g:4813:1: ( ( rule__ReDelete__ParametersAssignment_7_3_1 ) )
            {
            // InternalRest.g:4813:1: ( ( rule__ReDelete__ParametersAssignment_7_3_1 ) )
            // InternalRest.g:4814:2: ( rule__ReDelete__ParametersAssignment_7_3_1 )
            {
             before(grammarAccess.getReDeleteAccess().getParametersAssignment_7_3_1()); 
            // InternalRest.g:4815:2: ( rule__ReDelete__ParametersAssignment_7_3_1 )
            // InternalRest.g:4815:3: rule__ReDelete__ParametersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__ParametersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getParametersAssignment_7_3_1()); 

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
    // $ANTLR end "rule__ReDelete__Group_7_3__1__Impl"


    // $ANTLR start "rule__Segment__Group__0"
    // InternalRest.g:4824:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4828:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // InternalRest.g:4829:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Segment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__1();

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
    // $ANTLR end "rule__Segment__Group__0"


    // $ANTLR start "rule__Segment__Group__0__Impl"
    // InternalRest.g:4836:1: rule__Segment__Group__0__Impl : ( () ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4840:1: ( ( () ) )
            // InternalRest.g:4841:1: ( () )
            {
            // InternalRest.g:4841:1: ( () )
            // InternalRest.g:4842:2: ()
            {
             before(grammarAccess.getSegmentAccess().getSegmentAction_0()); 
            // InternalRest.g:4843:2: ()
            // InternalRest.g:4843:3: 
            {
            }

             after(grammarAccess.getSegmentAccess().getSegmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__0__Impl"


    // $ANTLR start "rule__Segment__Group__1"
    // InternalRest.g:4851:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4855:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // InternalRest.g:4856:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Segment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__2();

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
    // $ANTLR end "rule__Segment__Group__1"


    // $ANTLR start "rule__Segment__Group__1__Impl"
    // InternalRest.g:4863:1: rule__Segment__Group__1__Impl : ( 'Segment' ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4867:1: ( ( 'Segment' ) )
            // InternalRest.g:4868:1: ( 'Segment' )
            {
            // InternalRest.g:4868:1: ( 'Segment' )
            // InternalRest.g:4869:2: 'Segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getSegmentKeyword_1()); 

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
    // $ANTLR end "rule__Segment__Group__1__Impl"


    // $ANTLR start "rule__Segment__Group__2"
    // InternalRest.g:4878:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4882:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // InternalRest.g:4883:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Segment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__3();

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
    // $ANTLR end "rule__Segment__Group__2"


    // $ANTLR start "rule__Segment__Group__2__Impl"
    // InternalRest.g:4890:1: rule__Segment__Group__2__Impl : ( '{' ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4894:1: ( ( '{' ) )
            // InternalRest.g:4895:1: ( '{' )
            {
            // InternalRest.g:4895:1: ( '{' )
            // InternalRest.g:4896:2: '{'
            {
             before(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Segment__Group__2__Impl"


    // $ANTLR start "rule__Segment__Group__3"
    // InternalRest.g:4905:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4909:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // InternalRest.g:4910:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Segment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__4();

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
    // $ANTLR end "rule__Segment__Group__3"


    // $ANTLR start "rule__Segment__Group__3__Impl"
    // InternalRest.g:4917:1: rule__Segment__Group__3__Impl : ( ( rule__Segment__Group_3__0 )? ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4921:1: ( ( ( rule__Segment__Group_3__0 )? ) )
            // InternalRest.g:4922:1: ( ( rule__Segment__Group_3__0 )? )
            {
            // InternalRest.g:4922:1: ( ( rule__Segment__Group_3__0 )? )
            // InternalRest.g:4923:2: ( rule__Segment__Group_3__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_3()); 
            // InternalRest.g:4924:2: ( rule__Segment__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRest.g:4924:3: rule__Segment__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Segment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSegmentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Segment__Group__3__Impl"


    // $ANTLR start "rule__Segment__Group__4"
    // InternalRest.g:4932:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4936:1: ( rule__Segment__Group__4__Impl )
            // InternalRest.g:4937:2: rule__Segment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group__4__Impl();

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
    // $ANTLR end "rule__Segment__Group__4"


    // $ANTLR start "rule__Segment__Group__4__Impl"
    // InternalRest.g:4943:1: rule__Segment__Group__4__Impl : ( '}' ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4947:1: ( ( '}' ) )
            // InternalRest.g:4948:1: ( '}' )
            {
            // InternalRest.g:4948:1: ( '}' )
            // InternalRest.g:4949:2: '}'
            {
             before(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Segment__Group__4__Impl"


    // $ANTLR start "rule__Segment__Group_3__0"
    // InternalRest.g:4959:1: rule__Segment__Group_3__0 : rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1 ;
    public final void rule__Segment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4963:1: ( rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1 )
            // InternalRest.g:4964:2: rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Segment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group_3__1();

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
    // $ANTLR end "rule__Segment__Group_3__0"


    // $ANTLR start "rule__Segment__Group_3__0__Impl"
    // InternalRest.g:4971:1: rule__Segment__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__Segment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4975:1: ( ( 'value' ) )
            // InternalRest.g:4976:1: ( 'value' )
            {
            // InternalRest.g:4976:1: ( 'value' )
            // InternalRest.g:4977:2: 'value'
            {
             before(grammarAccess.getSegmentAccess().getValueKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getValueKeyword_3_0()); 

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
    // $ANTLR end "rule__Segment__Group_3__0__Impl"


    // $ANTLR start "rule__Segment__Group_3__1"
    // InternalRest.g:4986:1: rule__Segment__Group_3__1 : rule__Segment__Group_3__1__Impl ;
    public final void rule__Segment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4990:1: ( rule__Segment__Group_3__1__Impl )
            // InternalRest.g:4991:2: rule__Segment__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group_3__1__Impl();

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
    // $ANTLR end "rule__Segment__Group_3__1"


    // $ANTLR start "rule__Segment__Group_3__1__Impl"
    // InternalRest.g:4997:1: rule__Segment__Group_3__1__Impl : ( ( rule__Segment__ValueAssignment_3_1 ) ) ;
    public final void rule__Segment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5001:1: ( ( ( rule__Segment__ValueAssignment_3_1 ) ) )
            // InternalRest.g:5002:1: ( ( rule__Segment__ValueAssignment_3_1 ) )
            {
            // InternalRest.g:5002:1: ( ( rule__Segment__ValueAssignment_3_1 ) )
            // InternalRest.g:5003:2: ( rule__Segment__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSegmentAccess().getValueAssignment_3_1()); 
            // InternalRest.g:5004:2: ( rule__Segment__ValueAssignment_3_1 )
            // InternalRest.g:5004:3: rule__Segment__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Segment__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__Segment__Group_3__1__Impl"


    // $ANTLR start "rule__OpCreate__Group__0"
    // InternalRest.g:5013:1: rule__OpCreate__Group__0 : rule__OpCreate__Group__0__Impl rule__OpCreate__Group__1 ;
    public final void rule__OpCreate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5017:1: ( rule__OpCreate__Group__0__Impl rule__OpCreate__Group__1 )
            // InternalRest.g:5018:2: rule__OpCreate__Group__0__Impl rule__OpCreate__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OpCreate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__1();

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
    // $ANTLR end "rule__OpCreate__Group__0"


    // $ANTLR start "rule__OpCreate__Group__0__Impl"
    // InternalRest.g:5025:1: rule__OpCreate__Group__0__Impl : ( 'OpCreate' ) ;
    public final void rule__OpCreate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5029:1: ( ( 'OpCreate' ) )
            // InternalRest.g:5030:1: ( 'OpCreate' )
            {
            // InternalRest.g:5030:1: ( 'OpCreate' )
            // InternalRest.g:5031:2: 'OpCreate'
            {
             before(grammarAccess.getOpCreateAccess().getOpCreateKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getOpCreateKeyword_0()); 

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
    // $ANTLR end "rule__OpCreate__Group__0__Impl"


    // $ANTLR start "rule__OpCreate__Group__1"
    // InternalRest.g:5040:1: rule__OpCreate__Group__1 : rule__OpCreate__Group__1__Impl rule__OpCreate__Group__2 ;
    public final void rule__OpCreate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5044:1: ( rule__OpCreate__Group__1__Impl rule__OpCreate__Group__2 )
            // InternalRest.g:5045:2: rule__OpCreate__Group__1__Impl rule__OpCreate__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__OpCreate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__2();

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
    // $ANTLR end "rule__OpCreate__Group__1"


    // $ANTLR start "rule__OpCreate__Group__1__Impl"
    // InternalRest.g:5052:1: rule__OpCreate__Group__1__Impl : ( '{' ) ;
    public final void rule__OpCreate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5056:1: ( ( '{' ) )
            // InternalRest.g:5057:1: ( '{' )
            {
            // InternalRest.g:5057:1: ( '{' )
            // InternalRest.g:5058:2: '{'
            {
             before(grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__OpCreate__Group__1__Impl"


    // $ANTLR start "rule__OpCreate__Group__2"
    // InternalRest.g:5067:1: rule__OpCreate__Group__2 : rule__OpCreate__Group__2__Impl rule__OpCreate__Group__3 ;
    public final void rule__OpCreate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5071:1: ( rule__OpCreate__Group__2__Impl rule__OpCreate__Group__3 )
            // InternalRest.g:5072:2: rule__OpCreate__Group__2__Impl rule__OpCreate__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__OpCreate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__3();

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
    // $ANTLR end "rule__OpCreate__Group__2"


    // $ANTLR start "rule__OpCreate__Group__2__Impl"
    // InternalRest.g:5079:1: rule__OpCreate__Group__2__Impl : ( ( rule__OpCreate__Group_2__0 )? ) ;
    public final void rule__OpCreate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5083:1: ( ( ( rule__OpCreate__Group_2__0 )? ) )
            // InternalRest.g:5084:1: ( ( rule__OpCreate__Group_2__0 )? )
            {
            // InternalRest.g:5084:1: ( ( rule__OpCreate__Group_2__0 )? )
            // InternalRest.g:5085:2: ( rule__OpCreate__Group_2__0 )?
            {
             before(grammarAccess.getOpCreateAccess().getGroup_2()); 
            // InternalRest.g:5086:2: ( rule__OpCreate__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRest.g:5086:3: rule__OpCreate__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpCreate__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpCreateAccess().getGroup_2()); 

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
    // $ANTLR end "rule__OpCreate__Group__2__Impl"


    // $ANTLR start "rule__OpCreate__Group__3"
    // InternalRest.g:5094:1: rule__OpCreate__Group__3 : rule__OpCreate__Group__3__Impl rule__OpCreate__Group__4 ;
    public final void rule__OpCreate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5098:1: ( rule__OpCreate__Group__3__Impl rule__OpCreate__Group__4 )
            // InternalRest.g:5099:2: rule__OpCreate__Group__3__Impl rule__OpCreate__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__OpCreate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__4();

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
    // $ANTLR end "rule__OpCreate__Group__3"


    // $ANTLR start "rule__OpCreate__Group__3__Impl"
    // InternalRest.g:5106:1: rule__OpCreate__Group__3__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpCreate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5110:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:5111:1: ( 'failedAnswer' )
            {
            // InternalRest.g:5111:1: ( 'failedAnswer' )
            // InternalRest.g:5112:2: 'failedAnswer'
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getFailedAnswerKeyword_3()); 

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
    // $ANTLR end "rule__OpCreate__Group__3__Impl"


    // $ANTLR start "rule__OpCreate__Group__4"
    // InternalRest.g:5121:1: rule__OpCreate__Group__4 : rule__OpCreate__Group__4__Impl rule__OpCreate__Group__5 ;
    public final void rule__OpCreate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5125:1: ( rule__OpCreate__Group__4__Impl rule__OpCreate__Group__5 )
            // InternalRest.g:5126:2: rule__OpCreate__Group__4__Impl rule__OpCreate__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__OpCreate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__5();

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
    // $ANTLR end "rule__OpCreate__Group__4"


    // $ANTLR start "rule__OpCreate__Group__4__Impl"
    // InternalRest.g:5133:1: rule__OpCreate__Group__4__Impl : ( ( rule__OpCreate__FailedAnswerAssignment_4 ) ) ;
    public final void rule__OpCreate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5137:1: ( ( ( rule__OpCreate__FailedAnswerAssignment_4 ) ) )
            // InternalRest.g:5138:1: ( ( rule__OpCreate__FailedAnswerAssignment_4 ) )
            {
            // InternalRest.g:5138:1: ( ( rule__OpCreate__FailedAnswerAssignment_4 ) )
            // InternalRest.g:5139:2: ( rule__OpCreate__FailedAnswerAssignment_4 )
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerAssignment_4()); 
            // InternalRest.g:5140:2: ( rule__OpCreate__FailedAnswerAssignment_4 )
            // InternalRest.g:5140:3: rule__OpCreate__FailedAnswerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__FailedAnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getFailedAnswerAssignment_4()); 

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
    // $ANTLR end "rule__OpCreate__Group__4__Impl"


    // $ANTLR start "rule__OpCreate__Group__5"
    // InternalRest.g:5148:1: rule__OpCreate__Group__5 : rule__OpCreate__Group__5__Impl rule__OpCreate__Group__6 ;
    public final void rule__OpCreate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5152:1: ( rule__OpCreate__Group__5__Impl rule__OpCreate__Group__6 )
            // InternalRest.g:5153:2: rule__OpCreate__Group__5__Impl rule__OpCreate__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__OpCreate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__6();

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
    // $ANTLR end "rule__OpCreate__Group__5"


    // $ANTLR start "rule__OpCreate__Group__5__Impl"
    // InternalRest.g:5160:1: rule__OpCreate__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpCreate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5164:1: ( ( 'struct' ) )
            // InternalRest.g:5165:1: ( 'struct' )
            {
            // InternalRest.g:5165:1: ( 'struct' )
            // InternalRest.g:5166:2: 'struct'
            {
             before(grammarAccess.getOpCreateAccess().getStructKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getStructKeyword_5()); 

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
    // $ANTLR end "rule__OpCreate__Group__5__Impl"


    // $ANTLR start "rule__OpCreate__Group__6"
    // InternalRest.g:5175:1: rule__OpCreate__Group__6 : rule__OpCreate__Group__6__Impl rule__OpCreate__Group__7 ;
    public final void rule__OpCreate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5179:1: ( rule__OpCreate__Group__6__Impl rule__OpCreate__Group__7 )
            // InternalRest.g:5180:2: rule__OpCreate__Group__6__Impl rule__OpCreate__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__OpCreate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__7();

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
    // $ANTLR end "rule__OpCreate__Group__6"


    // $ANTLR start "rule__OpCreate__Group__6__Impl"
    // InternalRest.g:5187:1: rule__OpCreate__Group__6__Impl : ( ( rule__OpCreate__StructAssignment_6 ) ) ;
    public final void rule__OpCreate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5191:1: ( ( ( rule__OpCreate__StructAssignment_6 ) ) )
            // InternalRest.g:5192:1: ( ( rule__OpCreate__StructAssignment_6 ) )
            {
            // InternalRest.g:5192:1: ( ( rule__OpCreate__StructAssignment_6 ) )
            // InternalRest.g:5193:2: ( rule__OpCreate__StructAssignment_6 )
            {
             before(grammarAccess.getOpCreateAccess().getStructAssignment_6()); 
            // InternalRest.g:5194:2: ( rule__OpCreate__StructAssignment_6 )
            // InternalRest.g:5194:3: rule__OpCreate__StructAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__StructAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getStructAssignment_6()); 

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
    // $ANTLR end "rule__OpCreate__Group__6__Impl"


    // $ANTLR start "rule__OpCreate__Group__7"
    // InternalRest.g:5202:1: rule__OpCreate__Group__7 : rule__OpCreate__Group__7__Impl rule__OpCreate__Group__8 ;
    public final void rule__OpCreate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5206:1: ( rule__OpCreate__Group__7__Impl rule__OpCreate__Group__8 )
            // InternalRest.g:5207:2: rule__OpCreate__Group__7__Impl rule__OpCreate__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__OpCreate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__8();

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
    // $ANTLR end "rule__OpCreate__Group__7"


    // $ANTLR start "rule__OpCreate__Group__7__Impl"
    // InternalRest.g:5214:1: rule__OpCreate__Group__7__Impl : ( ( rule__OpCreate__Group_7__0 )? ) ;
    public final void rule__OpCreate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5218:1: ( ( ( rule__OpCreate__Group_7__0 )? ) )
            // InternalRest.g:5219:1: ( ( rule__OpCreate__Group_7__0 )? )
            {
            // InternalRest.g:5219:1: ( ( rule__OpCreate__Group_7__0 )? )
            // InternalRest.g:5220:2: ( rule__OpCreate__Group_7__0 )?
            {
             before(grammarAccess.getOpCreateAccess().getGroup_7()); 
            // InternalRest.g:5221:2: ( rule__OpCreate__Group_7__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRest.g:5221:3: rule__OpCreate__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpCreate__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpCreateAccess().getGroup_7()); 

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
    // $ANTLR end "rule__OpCreate__Group__7__Impl"


    // $ANTLR start "rule__OpCreate__Group__8"
    // InternalRest.g:5229:1: rule__OpCreate__Group__8 : rule__OpCreate__Group__8__Impl ;
    public final void rule__OpCreate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5233:1: ( rule__OpCreate__Group__8__Impl )
            // InternalRest.g:5234:2: rule__OpCreate__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__Group__8__Impl();

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
    // $ANTLR end "rule__OpCreate__Group__8"


    // $ANTLR start "rule__OpCreate__Group__8__Impl"
    // InternalRest.g:5240:1: rule__OpCreate__Group__8__Impl : ( '}' ) ;
    public final void rule__OpCreate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5244:1: ( ( '}' ) )
            // InternalRest.g:5245:1: ( '}' )
            {
            // InternalRest.g:5245:1: ( '}' )
            // InternalRest.g:5246:2: '}'
            {
             before(grammarAccess.getOpCreateAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__OpCreate__Group__8__Impl"


    // $ANTLR start "rule__OpCreate__Group_2__0"
    // InternalRest.g:5256:1: rule__OpCreate__Group_2__0 : rule__OpCreate__Group_2__0__Impl rule__OpCreate__Group_2__1 ;
    public final void rule__OpCreate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5260:1: ( rule__OpCreate__Group_2__0__Impl rule__OpCreate__Group_2__1 )
            // InternalRest.g:5261:2: rule__OpCreate__Group_2__0__Impl rule__OpCreate__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__OpCreate__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_2__1();

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
    // $ANTLR end "rule__OpCreate__Group_2__0"


    // $ANTLR start "rule__OpCreate__Group_2__0__Impl"
    // InternalRest.g:5268:1: rule__OpCreate__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpCreate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5272:1: ( ( 'id' ) )
            // InternalRest.g:5273:1: ( 'id' )
            {
            // InternalRest.g:5273:1: ( 'id' )
            // InternalRest.g:5274:2: 'id'
            {
             before(grammarAccess.getOpCreateAccess().getIdKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getIdKeyword_2_0()); 

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
    // $ANTLR end "rule__OpCreate__Group_2__0__Impl"


    // $ANTLR start "rule__OpCreate__Group_2__1"
    // InternalRest.g:5283:1: rule__OpCreate__Group_2__1 : rule__OpCreate__Group_2__1__Impl ;
    public final void rule__OpCreate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5287:1: ( rule__OpCreate__Group_2__1__Impl )
            // InternalRest.g:5288:2: rule__OpCreate__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_2__1__Impl();

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
    // $ANTLR end "rule__OpCreate__Group_2__1"


    // $ANTLR start "rule__OpCreate__Group_2__1__Impl"
    // InternalRest.g:5294:1: rule__OpCreate__Group_2__1__Impl : ( ( rule__OpCreate__IdAssignment_2_1 ) ) ;
    public final void rule__OpCreate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5298:1: ( ( ( rule__OpCreate__IdAssignment_2_1 ) ) )
            // InternalRest.g:5299:1: ( ( rule__OpCreate__IdAssignment_2_1 ) )
            {
            // InternalRest.g:5299:1: ( ( rule__OpCreate__IdAssignment_2_1 ) )
            // InternalRest.g:5300:2: ( rule__OpCreate__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpCreateAccess().getIdAssignment_2_1()); 
            // InternalRest.g:5301:2: ( rule__OpCreate__IdAssignment_2_1 )
            // InternalRest.g:5301:3: rule__OpCreate__IdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getIdAssignment_2_1()); 

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
    // $ANTLR end "rule__OpCreate__Group_2__1__Impl"


    // $ANTLR start "rule__OpCreate__Group_7__0"
    // InternalRest.g:5310:1: rule__OpCreate__Group_7__0 : rule__OpCreate__Group_7__0__Impl rule__OpCreate__Group_7__1 ;
    public final void rule__OpCreate__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5314:1: ( rule__OpCreate__Group_7__0__Impl rule__OpCreate__Group_7__1 )
            // InternalRest.g:5315:2: rule__OpCreate__Group_7__0__Impl rule__OpCreate__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__OpCreate__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_7__1();

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
    // $ANTLR end "rule__OpCreate__Group_7__0"


    // $ANTLR start "rule__OpCreate__Group_7__0__Impl"
    // InternalRest.g:5322:1: rule__OpCreate__Group_7__0__Impl : ( 'fieldsets' ) ;
    public final void rule__OpCreate__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5326:1: ( ( 'fieldsets' ) )
            // InternalRest.g:5327:1: ( 'fieldsets' )
            {
            // InternalRest.g:5327:1: ( 'fieldsets' )
            // InternalRest.g:5328:2: 'fieldsets'
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetsKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getFieldsetsKeyword_7_0()); 

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
    // $ANTLR end "rule__OpCreate__Group_7__0__Impl"


    // $ANTLR start "rule__OpCreate__Group_7__1"
    // InternalRest.g:5337:1: rule__OpCreate__Group_7__1 : rule__OpCreate__Group_7__1__Impl rule__OpCreate__Group_7__2 ;
    public final void rule__OpCreate__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5341:1: ( rule__OpCreate__Group_7__1__Impl rule__OpCreate__Group_7__2 )
            // InternalRest.g:5342:2: rule__OpCreate__Group_7__1__Impl rule__OpCreate__Group_7__2
            {
            pushFollow(FOLLOW_30);
            rule__OpCreate__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_7__2();

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
    // $ANTLR end "rule__OpCreate__Group_7__1"


    // $ANTLR start "rule__OpCreate__Group_7__1__Impl"
    // InternalRest.g:5349:1: rule__OpCreate__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OpCreate__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5353:1: ( ( '{' ) )
            // InternalRest.g:5354:1: ( '{' )
            {
            // InternalRest.g:5354:1: ( '{' )
            // InternalRest.g:5355:2: '{'
            {
             before(grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__OpCreate__Group_7__1__Impl"


    // $ANTLR start "rule__OpCreate__Group_7__2"
    // InternalRest.g:5364:1: rule__OpCreate__Group_7__2 : rule__OpCreate__Group_7__2__Impl rule__OpCreate__Group_7__3 ;
    public final void rule__OpCreate__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5368:1: ( rule__OpCreate__Group_7__2__Impl rule__OpCreate__Group_7__3 )
            // InternalRest.g:5369:2: rule__OpCreate__Group_7__2__Impl rule__OpCreate__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__OpCreate__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_7__3();

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
    // $ANTLR end "rule__OpCreate__Group_7__2"


    // $ANTLR start "rule__OpCreate__Group_7__2__Impl"
    // InternalRest.g:5376:1: rule__OpCreate__Group_7__2__Impl : ( ( rule__OpCreate__FieldsetsAssignment_7_2 ) ) ;
    public final void rule__OpCreate__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5380:1: ( ( ( rule__OpCreate__FieldsetsAssignment_7_2 ) ) )
            // InternalRest.g:5381:1: ( ( rule__OpCreate__FieldsetsAssignment_7_2 ) )
            {
            // InternalRest.g:5381:1: ( ( rule__OpCreate__FieldsetsAssignment_7_2 ) )
            // InternalRest.g:5382:2: ( rule__OpCreate__FieldsetsAssignment_7_2 )
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetsAssignment_7_2()); 
            // InternalRest.g:5383:2: ( rule__OpCreate__FieldsetsAssignment_7_2 )
            // InternalRest.g:5383:3: rule__OpCreate__FieldsetsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__FieldsetsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getFieldsetsAssignment_7_2()); 

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
    // $ANTLR end "rule__OpCreate__Group_7__2__Impl"


    // $ANTLR start "rule__OpCreate__Group_7__3"
    // InternalRest.g:5391:1: rule__OpCreate__Group_7__3 : rule__OpCreate__Group_7__3__Impl rule__OpCreate__Group_7__4 ;
    public final void rule__OpCreate__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5395:1: ( rule__OpCreate__Group_7__3__Impl rule__OpCreate__Group_7__4 )
            // InternalRest.g:5396:2: rule__OpCreate__Group_7__3__Impl rule__OpCreate__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__OpCreate__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_7__4();

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
    // $ANTLR end "rule__OpCreate__Group_7__3"


    // $ANTLR start "rule__OpCreate__Group_7__3__Impl"
    // InternalRest.g:5403:1: rule__OpCreate__Group_7__3__Impl : ( ( rule__OpCreate__Group_7_3__0 )* ) ;
    public final void rule__OpCreate__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5407:1: ( ( ( rule__OpCreate__Group_7_3__0 )* ) )
            // InternalRest.g:5408:1: ( ( rule__OpCreate__Group_7_3__0 )* )
            {
            // InternalRest.g:5408:1: ( ( rule__OpCreate__Group_7_3__0 )* )
            // InternalRest.g:5409:2: ( rule__OpCreate__Group_7_3__0 )*
            {
             before(grammarAccess.getOpCreateAccess().getGroup_7_3()); 
            // InternalRest.g:5410:2: ( rule__OpCreate__Group_7_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==15) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRest.g:5410:3: rule__OpCreate__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OpCreate__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getOpCreateAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__OpCreate__Group_7__3__Impl"


    // $ANTLR start "rule__OpCreate__Group_7__4"
    // InternalRest.g:5418:1: rule__OpCreate__Group_7__4 : rule__OpCreate__Group_7__4__Impl ;
    public final void rule__OpCreate__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5422:1: ( rule__OpCreate__Group_7__4__Impl )
            // InternalRest.g:5423:2: rule__OpCreate__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_7__4__Impl();

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
    // $ANTLR end "rule__OpCreate__Group_7__4"


    // $ANTLR start "rule__OpCreate__Group_7__4__Impl"
    // InternalRest.g:5429:1: rule__OpCreate__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OpCreate__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5433:1: ( ( '}' ) )
            // InternalRest.g:5434:1: ( '}' )
            {
            // InternalRest.g:5434:1: ( '}' )
            // InternalRest.g:5435:2: '}'
            {
             before(grammarAccess.getOpCreateAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__OpCreate__Group_7__4__Impl"


    // $ANTLR start "rule__OpCreate__Group_7_3__0"
    // InternalRest.g:5445:1: rule__OpCreate__Group_7_3__0 : rule__OpCreate__Group_7_3__0__Impl rule__OpCreate__Group_7_3__1 ;
    public final void rule__OpCreate__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5449:1: ( rule__OpCreate__Group_7_3__0__Impl rule__OpCreate__Group_7_3__1 )
            // InternalRest.g:5450:2: rule__OpCreate__Group_7_3__0__Impl rule__OpCreate__Group_7_3__1
            {
            pushFollow(FOLLOW_30);
            rule__OpCreate__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_7_3__1();

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
    // $ANTLR end "rule__OpCreate__Group_7_3__0"


    // $ANTLR start "rule__OpCreate__Group_7_3__0__Impl"
    // InternalRest.g:5457:1: rule__OpCreate__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OpCreate__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5461:1: ( ( ',' ) )
            // InternalRest.g:5462:1: ( ',' )
            {
            // InternalRest.g:5462:1: ( ',' )
            // InternalRest.g:5463:2: ','
            {
             before(grammarAccess.getOpCreateAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__OpCreate__Group_7_3__0__Impl"


    // $ANTLR start "rule__OpCreate__Group_7_3__1"
    // InternalRest.g:5472:1: rule__OpCreate__Group_7_3__1 : rule__OpCreate__Group_7_3__1__Impl ;
    public final void rule__OpCreate__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5476:1: ( rule__OpCreate__Group_7_3__1__Impl )
            // InternalRest.g:5477:2: rule__OpCreate__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__OpCreate__Group_7_3__1"


    // $ANTLR start "rule__OpCreate__Group_7_3__1__Impl"
    // InternalRest.g:5483:1: rule__OpCreate__Group_7_3__1__Impl : ( ( rule__OpCreate__FieldsetsAssignment_7_3_1 ) ) ;
    public final void rule__OpCreate__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5487:1: ( ( ( rule__OpCreate__FieldsetsAssignment_7_3_1 ) ) )
            // InternalRest.g:5488:1: ( ( rule__OpCreate__FieldsetsAssignment_7_3_1 ) )
            {
            // InternalRest.g:5488:1: ( ( rule__OpCreate__FieldsetsAssignment_7_3_1 ) )
            // InternalRest.g:5489:2: ( rule__OpCreate__FieldsetsAssignment_7_3_1 )
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetsAssignment_7_3_1()); 
            // InternalRest.g:5490:2: ( rule__OpCreate__FieldsetsAssignment_7_3_1 )
            // InternalRest.g:5490:3: rule__OpCreate__FieldsetsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__FieldsetsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getFieldsetsAssignment_7_3_1()); 

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
    // $ANTLR end "rule__OpCreate__Group_7_3__1__Impl"


    // $ANTLR start "rule__OpRead__Group__0"
    // InternalRest.g:5499:1: rule__OpRead__Group__0 : rule__OpRead__Group__0__Impl rule__OpRead__Group__1 ;
    public final void rule__OpRead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5503:1: ( rule__OpRead__Group__0__Impl rule__OpRead__Group__1 )
            // InternalRest.g:5504:2: rule__OpRead__Group__0__Impl rule__OpRead__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OpRead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group__1();

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
    // $ANTLR end "rule__OpRead__Group__0"


    // $ANTLR start "rule__OpRead__Group__0__Impl"
    // InternalRest.g:5511:1: rule__OpRead__Group__0__Impl : ( 'OpRead' ) ;
    public final void rule__OpRead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5515:1: ( ( 'OpRead' ) )
            // InternalRest.g:5516:1: ( 'OpRead' )
            {
            // InternalRest.g:5516:1: ( 'OpRead' )
            // InternalRest.g:5517:2: 'OpRead'
            {
             before(grammarAccess.getOpReadAccess().getOpReadKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getOpReadKeyword_0()); 

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
    // $ANTLR end "rule__OpRead__Group__0__Impl"


    // $ANTLR start "rule__OpRead__Group__1"
    // InternalRest.g:5526:1: rule__OpRead__Group__1 : rule__OpRead__Group__1__Impl rule__OpRead__Group__2 ;
    public final void rule__OpRead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5530:1: ( rule__OpRead__Group__1__Impl rule__OpRead__Group__2 )
            // InternalRest.g:5531:2: rule__OpRead__Group__1__Impl rule__OpRead__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__OpRead__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group__2();

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
    // $ANTLR end "rule__OpRead__Group__1"


    // $ANTLR start "rule__OpRead__Group__1__Impl"
    // InternalRest.g:5538:1: rule__OpRead__Group__1__Impl : ( '{' ) ;
    public final void rule__OpRead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5542:1: ( ( '{' ) )
            // InternalRest.g:5543:1: ( '{' )
            {
            // InternalRest.g:5543:1: ( '{' )
            // InternalRest.g:5544:2: '{'
            {
             before(grammarAccess.getOpReadAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__OpRead__Group__1__Impl"


    // $ANTLR start "rule__OpRead__Group__2"
    // InternalRest.g:5553:1: rule__OpRead__Group__2 : rule__OpRead__Group__2__Impl rule__OpRead__Group__3 ;
    public final void rule__OpRead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5557:1: ( rule__OpRead__Group__2__Impl rule__OpRead__Group__3 )
            // InternalRest.g:5558:2: rule__OpRead__Group__2__Impl rule__OpRead__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__OpRead__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group__3();

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
    // $ANTLR end "rule__OpRead__Group__2"


    // $ANTLR start "rule__OpRead__Group__2__Impl"
    // InternalRest.g:5565:1: rule__OpRead__Group__2__Impl : ( ( rule__OpRead__Group_2__0 )? ) ;
    public final void rule__OpRead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5569:1: ( ( ( rule__OpRead__Group_2__0 )? ) )
            // InternalRest.g:5570:1: ( ( rule__OpRead__Group_2__0 )? )
            {
            // InternalRest.g:5570:1: ( ( rule__OpRead__Group_2__0 )? )
            // InternalRest.g:5571:2: ( rule__OpRead__Group_2__0 )?
            {
             before(grammarAccess.getOpReadAccess().getGroup_2()); 
            // InternalRest.g:5572:2: ( rule__OpRead__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRest.g:5572:3: rule__OpRead__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpRead__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpReadAccess().getGroup_2()); 

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
    // $ANTLR end "rule__OpRead__Group__2__Impl"


    // $ANTLR start "rule__OpRead__Group__3"
    // InternalRest.g:5580:1: rule__OpRead__Group__3 : rule__OpRead__Group__3__Impl rule__OpRead__Group__4 ;
    public final void rule__OpRead__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5584:1: ( rule__OpRead__Group__3__Impl rule__OpRead__Group__4 )
            // InternalRest.g:5585:2: rule__OpRead__Group__3__Impl rule__OpRead__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__OpRead__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group__4();

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
    // $ANTLR end "rule__OpRead__Group__3"


    // $ANTLR start "rule__OpRead__Group__3__Impl"
    // InternalRest.g:5592:1: rule__OpRead__Group__3__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpRead__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5596:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:5597:1: ( 'failedAnswer' )
            {
            // InternalRest.g:5597:1: ( 'failedAnswer' )
            // InternalRest.g:5598:2: 'failedAnswer'
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getFailedAnswerKeyword_3()); 

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
    // $ANTLR end "rule__OpRead__Group__3__Impl"


    // $ANTLR start "rule__OpRead__Group__4"
    // InternalRest.g:5607:1: rule__OpRead__Group__4 : rule__OpRead__Group__4__Impl rule__OpRead__Group__5 ;
    public final void rule__OpRead__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5611:1: ( rule__OpRead__Group__4__Impl rule__OpRead__Group__5 )
            // InternalRest.g:5612:2: rule__OpRead__Group__4__Impl rule__OpRead__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__OpRead__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group__5();

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
    // $ANTLR end "rule__OpRead__Group__4"


    // $ANTLR start "rule__OpRead__Group__4__Impl"
    // InternalRest.g:5619:1: rule__OpRead__Group__4__Impl : ( ( rule__OpRead__FailedAnswerAssignment_4 ) ) ;
    public final void rule__OpRead__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5623:1: ( ( ( rule__OpRead__FailedAnswerAssignment_4 ) ) )
            // InternalRest.g:5624:1: ( ( rule__OpRead__FailedAnswerAssignment_4 ) )
            {
            // InternalRest.g:5624:1: ( ( rule__OpRead__FailedAnswerAssignment_4 ) )
            // InternalRest.g:5625:2: ( rule__OpRead__FailedAnswerAssignment_4 )
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerAssignment_4()); 
            // InternalRest.g:5626:2: ( rule__OpRead__FailedAnswerAssignment_4 )
            // InternalRest.g:5626:3: rule__OpRead__FailedAnswerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__FailedAnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getFailedAnswerAssignment_4()); 

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
    // $ANTLR end "rule__OpRead__Group__4__Impl"


    // $ANTLR start "rule__OpRead__Group__5"
    // InternalRest.g:5634:1: rule__OpRead__Group__5 : rule__OpRead__Group__5__Impl rule__OpRead__Group__6 ;
    public final void rule__OpRead__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5638:1: ( rule__OpRead__Group__5__Impl rule__OpRead__Group__6 )
            // InternalRest.g:5639:2: rule__OpRead__Group__5__Impl rule__OpRead__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__OpRead__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group__6();

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
    // $ANTLR end "rule__OpRead__Group__5"


    // $ANTLR start "rule__OpRead__Group__5__Impl"
    // InternalRest.g:5646:1: rule__OpRead__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpRead__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5650:1: ( ( 'struct' ) )
            // InternalRest.g:5651:1: ( 'struct' )
            {
            // InternalRest.g:5651:1: ( 'struct' )
            // InternalRest.g:5652:2: 'struct'
            {
             before(grammarAccess.getOpReadAccess().getStructKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getStructKeyword_5()); 

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
    // $ANTLR end "rule__OpRead__Group__5__Impl"


    // $ANTLR start "rule__OpRead__Group__6"
    // InternalRest.g:5661:1: rule__OpRead__Group__6 : rule__OpRead__Group__6__Impl rule__OpRead__Group__7 ;
    public final void rule__OpRead__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5665:1: ( rule__OpRead__Group__6__Impl rule__OpRead__Group__7 )
            // InternalRest.g:5666:2: rule__OpRead__Group__6__Impl rule__OpRead__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__OpRead__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group__7();

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
    // $ANTLR end "rule__OpRead__Group__6"


    // $ANTLR start "rule__OpRead__Group__6__Impl"
    // InternalRest.g:5673:1: rule__OpRead__Group__6__Impl : ( ( rule__OpRead__StructAssignment_6 ) ) ;
    public final void rule__OpRead__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5677:1: ( ( ( rule__OpRead__StructAssignment_6 ) ) )
            // InternalRest.g:5678:1: ( ( rule__OpRead__StructAssignment_6 ) )
            {
            // InternalRest.g:5678:1: ( ( rule__OpRead__StructAssignment_6 ) )
            // InternalRest.g:5679:2: ( rule__OpRead__StructAssignment_6 )
            {
             before(grammarAccess.getOpReadAccess().getStructAssignment_6()); 
            // InternalRest.g:5680:2: ( rule__OpRead__StructAssignment_6 )
            // InternalRest.g:5680:3: rule__OpRead__StructAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__StructAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getStructAssignment_6()); 

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
    // $ANTLR end "rule__OpRead__Group__6__Impl"


    // $ANTLR start "rule__OpRead__Group__7"
    // InternalRest.g:5688:1: rule__OpRead__Group__7 : rule__OpRead__Group__7__Impl rule__OpRead__Group__8 ;
    public final void rule__OpRead__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5692:1: ( rule__OpRead__Group__7__Impl rule__OpRead__Group__8 )
            // InternalRest.g:5693:2: rule__OpRead__Group__7__Impl rule__OpRead__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__OpRead__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group__8();

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
    // $ANTLR end "rule__OpRead__Group__7"


    // $ANTLR start "rule__OpRead__Group__7__Impl"
    // InternalRest.g:5700:1: rule__OpRead__Group__7__Impl : ( ( rule__OpRead__Group_7__0 )? ) ;
    public final void rule__OpRead__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5704:1: ( ( ( rule__OpRead__Group_7__0 )? ) )
            // InternalRest.g:5705:1: ( ( rule__OpRead__Group_7__0 )? )
            {
            // InternalRest.g:5705:1: ( ( rule__OpRead__Group_7__0 )? )
            // InternalRest.g:5706:2: ( rule__OpRead__Group_7__0 )?
            {
             before(grammarAccess.getOpReadAccess().getGroup_7()); 
            // InternalRest.g:5707:2: ( rule__OpRead__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRest.g:5707:3: rule__OpRead__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpRead__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpReadAccess().getGroup_7()); 

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
    // $ANTLR end "rule__OpRead__Group__7__Impl"


    // $ANTLR start "rule__OpRead__Group__8"
    // InternalRest.g:5715:1: rule__OpRead__Group__8 : rule__OpRead__Group__8__Impl ;
    public final void rule__OpRead__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5719:1: ( rule__OpRead__Group__8__Impl )
            // InternalRest.g:5720:2: rule__OpRead__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__Group__8__Impl();

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
    // $ANTLR end "rule__OpRead__Group__8"


    // $ANTLR start "rule__OpRead__Group__8__Impl"
    // InternalRest.g:5726:1: rule__OpRead__Group__8__Impl : ( '}' ) ;
    public final void rule__OpRead__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5730:1: ( ( '}' ) )
            // InternalRest.g:5731:1: ( '}' )
            {
            // InternalRest.g:5731:1: ( '}' )
            // InternalRest.g:5732:2: '}'
            {
             before(grammarAccess.getOpReadAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__OpRead__Group__8__Impl"


    // $ANTLR start "rule__OpRead__Group_2__0"
    // InternalRest.g:5742:1: rule__OpRead__Group_2__0 : rule__OpRead__Group_2__0__Impl rule__OpRead__Group_2__1 ;
    public final void rule__OpRead__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5746:1: ( rule__OpRead__Group_2__0__Impl rule__OpRead__Group_2__1 )
            // InternalRest.g:5747:2: rule__OpRead__Group_2__0__Impl rule__OpRead__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__OpRead__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group_2__1();

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
    // $ANTLR end "rule__OpRead__Group_2__0"


    // $ANTLR start "rule__OpRead__Group_2__0__Impl"
    // InternalRest.g:5754:1: rule__OpRead__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpRead__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5758:1: ( ( 'id' ) )
            // InternalRest.g:5759:1: ( 'id' )
            {
            // InternalRest.g:5759:1: ( 'id' )
            // InternalRest.g:5760:2: 'id'
            {
             before(grammarAccess.getOpReadAccess().getIdKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getIdKeyword_2_0()); 

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
    // $ANTLR end "rule__OpRead__Group_2__0__Impl"


    // $ANTLR start "rule__OpRead__Group_2__1"
    // InternalRest.g:5769:1: rule__OpRead__Group_2__1 : rule__OpRead__Group_2__1__Impl ;
    public final void rule__OpRead__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5773:1: ( rule__OpRead__Group_2__1__Impl )
            // InternalRest.g:5774:2: rule__OpRead__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__Group_2__1__Impl();

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
    // $ANTLR end "rule__OpRead__Group_2__1"


    // $ANTLR start "rule__OpRead__Group_2__1__Impl"
    // InternalRest.g:5780:1: rule__OpRead__Group_2__1__Impl : ( ( rule__OpRead__IdAssignment_2_1 ) ) ;
    public final void rule__OpRead__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5784:1: ( ( ( rule__OpRead__IdAssignment_2_1 ) ) )
            // InternalRest.g:5785:1: ( ( rule__OpRead__IdAssignment_2_1 ) )
            {
            // InternalRest.g:5785:1: ( ( rule__OpRead__IdAssignment_2_1 ) )
            // InternalRest.g:5786:2: ( rule__OpRead__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpReadAccess().getIdAssignment_2_1()); 
            // InternalRest.g:5787:2: ( rule__OpRead__IdAssignment_2_1 )
            // InternalRest.g:5787:3: rule__OpRead__IdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getIdAssignment_2_1()); 

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
    // $ANTLR end "rule__OpRead__Group_2__1__Impl"


    // $ANTLR start "rule__OpRead__Group_7__0"
    // InternalRest.g:5796:1: rule__OpRead__Group_7__0 : rule__OpRead__Group_7__0__Impl rule__OpRead__Group_7__1 ;
    public final void rule__OpRead__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5800:1: ( rule__OpRead__Group_7__0__Impl rule__OpRead__Group_7__1 )
            // InternalRest.g:5801:2: rule__OpRead__Group_7__0__Impl rule__OpRead__Group_7__1
            {
            pushFollow(FOLLOW_31);
            rule__OpRead__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group_7__1();

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
    // $ANTLR end "rule__OpRead__Group_7__0"


    // $ANTLR start "rule__OpRead__Group_7__0__Impl"
    // InternalRest.g:5808:1: rule__OpRead__Group_7__0__Impl : ( 'fields' ) ;
    public final void rule__OpRead__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5812:1: ( ( 'fields' ) )
            // InternalRest.g:5813:1: ( 'fields' )
            {
            // InternalRest.g:5813:1: ( 'fields' )
            // InternalRest.g:5814:2: 'fields'
            {
             before(grammarAccess.getOpReadAccess().getFieldsKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getFieldsKeyword_7_0()); 

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
    // $ANTLR end "rule__OpRead__Group_7__0__Impl"


    // $ANTLR start "rule__OpRead__Group_7__1"
    // InternalRest.g:5823:1: rule__OpRead__Group_7__1 : rule__OpRead__Group_7__1__Impl rule__OpRead__Group_7__2 ;
    public final void rule__OpRead__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5827:1: ( rule__OpRead__Group_7__1__Impl rule__OpRead__Group_7__2 )
            // InternalRest.g:5828:2: rule__OpRead__Group_7__1__Impl rule__OpRead__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__OpRead__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group_7__2();

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
    // $ANTLR end "rule__OpRead__Group_7__1"


    // $ANTLR start "rule__OpRead__Group_7__1__Impl"
    // InternalRest.g:5835:1: rule__OpRead__Group_7__1__Impl : ( '(' ) ;
    public final void rule__OpRead__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5839:1: ( ( '(' ) )
            // InternalRest.g:5840:1: ( '(' )
            {
            // InternalRest.g:5840:1: ( '(' )
            // InternalRest.g:5841:2: '('
            {
             before(grammarAccess.getOpReadAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getLeftParenthesisKeyword_7_1()); 

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
    // $ANTLR end "rule__OpRead__Group_7__1__Impl"


    // $ANTLR start "rule__OpRead__Group_7__2"
    // InternalRest.g:5850:1: rule__OpRead__Group_7__2 : rule__OpRead__Group_7__2__Impl rule__OpRead__Group_7__3 ;
    public final void rule__OpRead__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5854:1: ( rule__OpRead__Group_7__2__Impl rule__OpRead__Group_7__3 )
            // InternalRest.g:5855:2: rule__OpRead__Group_7__2__Impl rule__OpRead__Group_7__3
            {
            pushFollow(FOLLOW_32);
            rule__OpRead__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group_7__3();

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
    // $ANTLR end "rule__OpRead__Group_7__2"


    // $ANTLR start "rule__OpRead__Group_7__2__Impl"
    // InternalRest.g:5862:1: rule__OpRead__Group_7__2__Impl : ( ( rule__OpRead__FieldsAssignment_7_2 ) ) ;
    public final void rule__OpRead__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5866:1: ( ( ( rule__OpRead__FieldsAssignment_7_2 ) ) )
            // InternalRest.g:5867:1: ( ( rule__OpRead__FieldsAssignment_7_2 ) )
            {
            // InternalRest.g:5867:1: ( ( rule__OpRead__FieldsAssignment_7_2 ) )
            // InternalRest.g:5868:2: ( rule__OpRead__FieldsAssignment_7_2 )
            {
             before(grammarAccess.getOpReadAccess().getFieldsAssignment_7_2()); 
            // InternalRest.g:5869:2: ( rule__OpRead__FieldsAssignment_7_2 )
            // InternalRest.g:5869:3: rule__OpRead__FieldsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__FieldsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getFieldsAssignment_7_2()); 

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
    // $ANTLR end "rule__OpRead__Group_7__2__Impl"


    // $ANTLR start "rule__OpRead__Group_7__3"
    // InternalRest.g:5877:1: rule__OpRead__Group_7__3 : rule__OpRead__Group_7__3__Impl rule__OpRead__Group_7__4 ;
    public final void rule__OpRead__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5881:1: ( rule__OpRead__Group_7__3__Impl rule__OpRead__Group_7__4 )
            // InternalRest.g:5882:2: rule__OpRead__Group_7__3__Impl rule__OpRead__Group_7__4
            {
            pushFollow(FOLLOW_32);
            rule__OpRead__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group_7__4();

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
    // $ANTLR end "rule__OpRead__Group_7__3"


    // $ANTLR start "rule__OpRead__Group_7__3__Impl"
    // InternalRest.g:5889:1: rule__OpRead__Group_7__3__Impl : ( ( rule__OpRead__Group_7_3__0 )* ) ;
    public final void rule__OpRead__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5893:1: ( ( ( rule__OpRead__Group_7_3__0 )* ) )
            // InternalRest.g:5894:1: ( ( rule__OpRead__Group_7_3__0 )* )
            {
            // InternalRest.g:5894:1: ( ( rule__OpRead__Group_7_3__0 )* )
            // InternalRest.g:5895:2: ( rule__OpRead__Group_7_3__0 )*
            {
             before(grammarAccess.getOpReadAccess().getGroup_7_3()); 
            // InternalRest.g:5896:2: ( rule__OpRead__Group_7_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRest.g:5896:3: rule__OpRead__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OpRead__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getOpReadAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__OpRead__Group_7__3__Impl"


    // $ANTLR start "rule__OpRead__Group_7__4"
    // InternalRest.g:5904:1: rule__OpRead__Group_7__4 : rule__OpRead__Group_7__4__Impl ;
    public final void rule__OpRead__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5908:1: ( rule__OpRead__Group_7__4__Impl )
            // InternalRest.g:5909:2: rule__OpRead__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__Group_7__4__Impl();

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
    // $ANTLR end "rule__OpRead__Group_7__4"


    // $ANTLR start "rule__OpRead__Group_7__4__Impl"
    // InternalRest.g:5915:1: rule__OpRead__Group_7__4__Impl : ( ')' ) ;
    public final void rule__OpRead__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5919:1: ( ( ')' ) )
            // InternalRest.g:5920:1: ( ')' )
            {
            // InternalRest.g:5920:1: ( ')' )
            // InternalRest.g:5921:2: ')'
            {
             before(grammarAccess.getOpReadAccess().getRightParenthesisKeyword_7_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getRightParenthesisKeyword_7_4()); 

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
    // $ANTLR end "rule__OpRead__Group_7__4__Impl"


    // $ANTLR start "rule__OpRead__Group_7_3__0"
    // InternalRest.g:5931:1: rule__OpRead__Group_7_3__0 : rule__OpRead__Group_7_3__0__Impl rule__OpRead__Group_7_3__1 ;
    public final void rule__OpRead__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5935:1: ( rule__OpRead__Group_7_3__0__Impl rule__OpRead__Group_7_3__1 )
            // InternalRest.g:5936:2: rule__OpRead__Group_7_3__0__Impl rule__OpRead__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__OpRead__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group_7_3__1();

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
    // $ANTLR end "rule__OpRead__Group_7_3__0"


    // $ANTLR start "rule__OpRead__Group_7_3__0__Impl"
    // InternalRest.g:5943:1: rule__OpRead__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OpRead__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5947:1: ( ( ',' ) )
            // InternalRest.g:5948:1: ( ',' )
            {
            // InternalRest.g:5948:1: ( ',' )
            // InternalRest.g:5949:2: ','
            {
             before(grammarAccess.getOpReadAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__OpRead__Group_7_3__0__Impl"


    // $ANTLR start "rule__OpRead__Group_7_3__1"
    // InternalRest.g:5958:1: rule__OpRead__Group_7_3__1 : rule__OpRead__Group_7_3__1__Impl ;
    public final void rule__OpRead__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5962:1: ( rule__OpRead__Group_7_3__1__Impl )
            // InternalRest.g:5963:2: rule__OpRead__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__OpRead__Group_7_3__1"


    // $ANTLR start "rule__OpRead__Group_7_3__1__Impl"
    // InternalRest.g:5969:1: rule__OpRead__Group_7_3__1__Impl : ( ( rule__OpRead__FieldsAssignment_7_3_1 ) ) ;
    public final void rule__OpRead__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5973:1: ( ( ( rule__OpRead__FieldsAssignment_7_3_1 ) ) )
            // InternalRest.g:5974:1: ( ( rule__OpRead__FieldsAssignment_7_3_1 ) )
            {
            // InternalRest.g:5974:1: ( ( rule__OpRead__FieldsAssignment_7_3_1 ) )
            // InternalRest.g:5975:2: ( rule__OpRead__FieldsAssignment_7_3_1 )
            {
             before(grammarAccess.getOpReadAccess().getFieldsAssignment_7_3_1()); 
            // InternalRest.g:5976:2: ( rule__OpRead__FieldsAssignment_7_3_1 )
            // InternalRest.g:5976:3: rule__OpRead__FieldsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__FieldsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getFieldsAssignment_7_3_1()); 

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
    // $ANTLR end "rule__OpRead__Group_7_3__1__Impl"


    // $ANTLR start "rule__OpUpdate__Group__0"
    // InternalRest.g:5985:1: rule__OpUpdate__Group__0 : rule__OpUpdate__Group__0__Impl rule__OpUpdate__Group__1 ;
    public final void rule__OpUpdate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5989:1: ( rule__OpUpdate__Group__0__Impl rule__OpUpdate__Group__1 )
            // InternalRest.g:5990:2: rule__OpUpdate__Group__0__Impl rule__OpUpdate__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OpUpdate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__1();

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
    // $ANTLR end "rule__OpUpdate__Group__0"


    // $ANTLR start "rule__OpUpdate__Group__0__Impl"
    // InternalRest.g:5997:1: rule__OpUpdate__Group__0__Impl : ( 'OpUpdate' ) ;
    public final void rule__OpUpdate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6001:1: ( ( 'OpUpdate' ) )
            // InternalRest.g:6002:1: ( 'OpUpdate' )
            {
            // InternalRest.g:6002:1: ( 'OpUpdate' )
            // InternalRest.g:6003:2: 'OpUpdate'
            {
             before(grammarAccess.getOpUpdateAccess().getOpUpdateKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getOpUpdateKeyword_0()); 

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
    // $ANTLR end "rule__OpUpdate__Group__0__Impl"


    // $ANTLR start "rule__OpUpdate__Group__1"
    // InternalRest.g:6012:1: rule__OpUpdate__Group__1 : rule__OpUpdate__Group__1__Impl rule__OpUpdate__Group__2 ;
    public final void rule__OpUpdate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6016:1: ( rule__OpUpdate__Group__1__Impl rule__OpUpdate__Group__2 )
            // InternalRest.g:6017:2: rule__OpUpdate__Group__1__Impl rule__OpUpdate__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__OpUpdate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__2();

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
    // $ANTLR end "rule__OpUpdate__Group__1"


    // $ANTLR start "rule__OpUpdate__Group__1__Impl"
    // InternalRest.g:6024:1: rule__OpUpdate__Group__1__Impl : ( '{' ) ;
    public final void rule__OpUpdate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6028:1: ( ( '{' ) )
            // InternalRest.g:6029:1: ( '{' )
            {
            // InternalRest.g:6029:1: ( '{' )
            // InternalRest.g:6030:2: '{'
            {
             before(grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__OpUpdate__Group__1__Impl"


    // $ANTLR start "rule__OpUpdate__Group__2"
    // InternalRest.g:6039:1: rule__OpUpdate__Group__2 : rule__OpUpdate__Group__2__Impl rule__OpUpdate__Group__3 ;
    public final void rule__OpUpdate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6043:1: ( rule__OpUpdate__Group__2__Impl rule__OpUpdate__Group__3 )
            // InternalRest.g:6044:2: rule__OpUpdate__Group__2__Impl rule__OpUpdate__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__OpUpdate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__3();

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
    // $ANTLR end "rule__OpUpdate__Group__2"


    // $ANTLR start "rule__OpUpdate__Group__2__Impl"
    // InternalRest.g:6051:1: rule__OpUpdate__Group__2__Impl : ( ( rule__OpUpdate__Group_2__0 )? ) ;
    public final void rule__OpUpdate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6055:1: ( ( ( rule__OpUpdate__Group_2__0 )? ) )
            // InternalRest.g:6056:1: ( ( rule__OpUpdate__Group_2__0 )? )
            {
            // InternalRest.g:6056:1: ( ( rule__OpUpdate__Group_2__0 )? )
            // InternalRest.g:6057:2: ( rule__OpUpdate__Group_2__0 )?
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_2()); 
            // InternalRest.g:6058:2: ( rule__OpUpdate__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRest.g:6058:3: rule__OpUpdate__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpUpdate__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpUpdateAccess().getGroup_2()); 

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
    // $ANTLR end "rule__OpUpdate__Group__2__Impl"


    // $ANTLR start "rule__OpUpdate__Group__3"
    // InternalRest.g:6066:1: rule__OpUpdate__Group__3 : rule__OpUpdate__Group__3__Impl rule__OpUpdate__Group__4 ;
    public final void rule__OpUpdate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6070:1: ( rule__OpUpdate__Group__3__Impl rule__OpUpdate__Group__4 )
            // InternalRest.g:6071:2: rule__OpUpdate__Group__3__Impl rule__OpUpdate__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__OpUpdate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__4();

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
    // $ANTLR end "rule__OpUpdate__Group__3"


    // $ANTLR start "rule__OpUpdate__Group__3__Impl"
    // InternalRest.g:6078:1: rule__OpUpdate__Group__3__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpUpdate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6082:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:6083:1: ( 'failedAnswer' )
            {
            // InternalRest.g:6083:1: ( 'failedAnswer' )
            // InternalRest.g:6084:2: 'failedAnswer'
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getFailedAnswerKeyword_3()); 

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
    // $ANTLR end "rule__OpUpdate__Group__3__Impl"


    // $ANTLR start "rule__OpUpdate__Group__4"
    // InternalRest.g:6093:1: rule__OpUpdate__Group__4 : rule__OpUpdate__Group__4__Impl rule__OpUpdate__Group__5 ;
    public final void rule__OpUpdate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6097:1: ( rule__OpUpdate__Group__4__Impl rule__OpUpdate__Group__5 )
            // InternalRest.g:6098:2: rule__OpUpdate__Group__4__Impl rule__OpUpdate__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__OpUpdate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__5();

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
    // $ANTLR end "rule__OpUpdate__Group__4"


    // $ANTLR start "rule__OpUpdate__Group__4__Impl"
    // InternalRest.g:6105:1: rule__OpUpdate__Group__4__Impl : ( ( rule__OpUpdate__FailedAnswerAssignment_4 ) ) ;
    public final void rule__OpUpdate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6109:1: ( ( ( rule__OpUpdate__FailedAnswerAssignment_4 ) ) )
            // InternalRest.g:6110:1: ( ( rule__OpUpdate__FailedAnswerAssignment_4 ) )
            {
            // InternalRest.g:6110:1: ( ( rule__OpUpdate__FailedAnswerAssignment_4 ) )
            // InternalRest.g:6111:2: ( rule__OpUpdate__FailedAnswerAssignment_4 )
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerAssignment_4()); 
            // InternalRest.g:6112:2: ( rule__OpUpdate__FailedAnswerAssignment_4 )
            // InternalRest.g:6112:3: rule__OpUpdate__FailedAnswerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__FailedAnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getFailedAnswerAssignment_4()); 

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
    // $ANTLR end "rule__OpUpdate__Group__4__Impl"


    // $ANTLR start "rule__OpUpdate__Group__5"
    // InternalRest.g:6120:1: rule__OpUpdate__Group__5 : rule__OpUpdate__Group__5__Impl rule__OpUpdate__Group__6 ;
    public final void rule__OpUpdate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6124:1: ( rule__OpUpdate__Group__5__Impl rule__OpUpdate__Group__6 )
            // InternalRest.g:6125:2: rule__OpUpdate__Group__5__Impl rule__OpUpdate__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__OpUpdate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__6();

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
    // $ANTLR end "rule__OpUpdate__Group__5"


    // $ANTLR start "rule__OpUpdate__Group__5__Impl"
    // InternalRest.g:6132:1: rule__OpUpdate__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpUpdate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6136:1: ( ( 'struct' ) )
            // InternalRest.g:6137:1: ( 'struct' )
            {
            // InternalRest.g:6137:1: ( 'struct' )
            // InternalRest.g:6138:2: 'struct'
            {
             before(grammarAccess.getOpUpdateAccess().getStructKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getStructKeyword_5()); 

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
    // $ANTLR end "rule__OpUpdate__Group__5__Impl"


    // $ANTLR start "rule__OpUpdate__Group__6"
    // InternalRest.g:6147:1: rule__OpUpdate__Group__6 : rule__OpUpdate__Group__6__Impl rule__OpUpdate__Group__7 ;
    public final void rule__OpUpdate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6151:1: ( rule__OpUpdate__Group__6__Impl rule__OpUpdate__Group__7 )
            // InternalRest.g:6152:2: rule__OpUpdate__Group__6__Impl rule__OpUpdate__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__OpUpdate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__7();

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
    // $ANTLR end "rule__OpUpdate__Group__6"


    // $ANTLR start "rule__OpUpdate__Group__6__Impl"
    // InternalRest.g:6159:1: rule__OpUpdate__Group__6__Impl : ( ( rule__OpUpdate__StructAssignment_6 ) ) ;
    public final void rule__OpUpdate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6163:1: ( ( ( rule__OpUpdate__StructAssignment_6 ) ) )
            // InternalRest.g:6164:1: ( ( rule__OpUpdate__StructAssignment_6 ) )
            {
            // InternalRest.g:6164:1: ( ( rule__OpUpdate__StructAssignment_6 ) )
            // InternalRest.g:6165:2: ( rule__OpUpdate__StructAssignment_6 )
            {
             before(grammarAccess.getOpUpdateAccess().getStructAssignment_6()); 
            // InternalRest.g:6166:2: ( rule__OpUpdate__StructAssignment_6 )
            // InternalRest.g:6166:3: rule__OpUpdate__StructAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__StructAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getStructAssignment_6()); 

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
    // $ANTLR end "rule__OpUpdate__Group__6__Impl"


    // $ANTLR start "rule__OpUpdate__Group__7"
    // InternalRest.g:6174:1: rule__OpUpdate__Group__7 : rule__OpUpdate__Group__7__Impl rule__OpUpdate__Group__8 ;
    public final void rule__OpUpdate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6178:1: ( rule__OpUpdate__Group__7__Impl rule__OpUpdate__Group__8 )
            // InternalRest.g:6179:2: rule__OpUpdate__Group__7__Impl rule__OpUpdate__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__OpUpdate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__8();

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
    // $ANTLR end "rule__OpUpdate__Group__7"


    // $ANTLR start "rule__OpUpdate__Group__7__Impl"
    // InternalRest.g:6186:1: rule__OpUpdate__Group__7__Impl : ( ( rule__OpUpdate__Group_7__0 )? ) ;
    public final void rule__OpUpdate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6190:1: ( ( ( rule__OpUpdate__Group_7__0 )? ) )
            // InternalRest.g:6191:1: ( ( rule__OpUpdate__Group_7__0 )? )
            {
            // InternalRest.g:6191:1: ( ( rule__OpUpdate__Group_7__0 )? )
            // InternalRest.g:6192:2: ( rule__OpUpdate__Group_7__0 )?
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_7()); 
            // InternalRest.g:6193:2: ( rule__OpUpdate__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRest.g:6193:3: rule__OpUpdate__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpUpdate__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpUpdateAccess().getGroup_7()); 

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
    // $ANTLR end "rule__OpUpdate__Group__7__Impl"


    // $ANTLR start "rule__OpUpdate__Group__8"
    // InternalRest.g:6201:1: rule__OpUpdate__Group__8 : rule__OpUpdate__Group__8__Impl ;
    public final void rule__OpUpdate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6205:1: ( rule__OpUpdate__Group__8__Impl )
            // InternalRest.g:6206:2: rule__OpUpdate__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group__8__Impl();

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
    // $ANTLR end "rule__OpUpdate__Group__8"


    // $ANTLR start "rule__OpUpdate__Group__8__Impl"
    // InternalRest.g:6212:1: rule__OpUpdate__Group__8__Impl : ( '}' ) ;
    public final void rule__OpUpdate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6216:1: ( ( '}' ) )
            // InternalRest.g:6217:1: ( '}' )
            {
            // InternalRest.g:6217:1: ( '}' )
            // InternalRest.g:6218:2: '}'
            {
             before(grammarAccess.getOpUpdateAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__OpUpdate__Group__8__Impl"


    // $ANTLR start "rule__OpUpdate__Group_2__0"
    // InternalRest.g:6228:1: rule__OpUpdate__Group_2__0 : rule__OpUpdate__Group_2__0__Impl rule__OpUpdate__Group_2__1 ;
    public final void rule__OpUpdate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6232:1: ( rule__OpUpdate__Group_2__0__Impl rule__OpUpdate__Group_2__1 )
            // InternalRest.g:6233:2: rule__OpUpdate__Group_2__0__Impl rule__OpUpdate__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__OpUpdate__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_2__1();

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
    // $ANTLR end "rule__OpUpdate__Group_2__0"


    // $ANTLR start "rule__OpUpdate__Group_2__0__Impl"
    // InternalRest.g:6240:1: rule__OpUpdate__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpUpdate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6244:1: ( ( 'id' ) )
            // InternalRest.g:6245:1: ( 'id' )
            {
            // InternalRest.g:6245:1: ( 'id' )
            // InternalRest.g:6246:2: 'id'
            {
             before(grammarAccess.getOpUpdateAccess().getIdKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getIdKeyword_2_0()); 

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
    // $ANTLR end "rule__OpUpdate__Group_2__0__Impl"


    // $ANTLR start "rule__OpUpdate__Group_2__1"
    // InternalRest.g:6255:1: rule__OpUpdate__Group_2__1 : rule__OpUpdate__Group_2__1__Impl ;
    public final void rule__OpUpdate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6259:1: ( rule__OpUpdate__Group_2__1__Impl )
            // InternalRest.g:6260:2: rule__OpUpdate__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_2__1__Impl();

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
    // $ANTLR end "rule__OpUpdate__Group_2__1"


    // $ANTLR start "rule__OpUpdate__Group_2__1__Impl"
    // InternalRest.g:6266:1: rule__OpUpdate__Group_2__1__Impl : ( ( rule__OpUpdate__IdAssignment_2_1 ) ) ;
    public final void rule__OpUpdate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6270:1: ( ( ( rule__OpUpdate__IdAssignment_2_1 ) ) )
            // InternalRest.g:6271:1: ( ( rule__OpUpdate__IdAssignment_2_1 ) )
            {
            // InternalRest.g:6271:1: ( ( rule__OpUpdate__IdAssignment_2_1 ) )
            // InternalRest.g:6272:2: ( rule__OpUpdate__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpUpdateAccess().getIdAssignment_2_1()); 
            // InternalRest.g:6273:2: ( rule__OpUpdate__IdAssignment_2_1 )
            // InternalRest.g:6273:3: rule__OpUpdate__IdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getIdAssignment_2_1()); 

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
    // $ANTLR end "rule__OpUpdate__Group_2__1__Impl"


    // $ANTLR start "rule__OpUpdate__Group_7__0"
    // InternalRest.g:6282:1: rule__OpUpdate__Group_7__0 : rule__OpUpdate__Group_7__0__Impl rule__OpUpdate__Group_7__1 ;
    public final void rule__OpUpdate__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6286:1: ( rule__OpUpdate__Group_7__0__Impl rule__OpUpdate__Group_7__1 )
            // InternalRest.g:6287:2: rule__OpUpdate__Group_7__0__Impl rule__OpUpdate__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__OpUpdate__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_7__1();

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
    // $ANTLR end "rule__OpUpdate__Group_7__0"


    // $ANTLR start "rule__OpUpdate__Group_7__0__Impl"
    // InternalRest.g:6294:1: rule__OpUpdate__Group_7__0__Impl : ( 'fieldsets' ) ;
    public final void rule__OpUpdate__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6298:1: ( ( 'fieldsets' ) )
            // InternalRest.g:6299:1: ( 'fieldsets' )
            {
            // InternalRest.g:6299:1: ( 'fieldsets' )
            // InternalRest.g:6300:2: 'fieldsets'
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetsKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getFieldsetsKeyword_7_0()); 

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
    // $ANTLR end "rule__OpUpdate__Group_7__0__Impl"


    // $ANTLR start "rule__OpUpdate__Group_7__1"
    // InternalRest.g:6309:1: rule__OpUpdate__Group_7__1 : rule__OpUpdate__Group_7__1__Impl rule__OpUpdate__Group_7__2 ;
    public final void rule__OpUpdate__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6313:1: ( rule__OpUpdate__Group_7__1__Impl rule__OpUpdate__Group_7__2 )
            // InternalRest.g:6314:2: rule__OpUpdate__Group_7__1__Impl rule__OpUpdate__Group_7__2
            {
            pushFollow(FOLLOW_30);
            rule__OpUpdate__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_7__2();

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
    // $ANTLR end "rule__OpUpdate__Group_7__1"


    // $ANTLR start "rule__OpUpdate__Group_7__1__Impl"
    // InternalRest.g:6321:1: rule__OpUpdate__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OpUpdate__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6325:1: ( ( '{' ) )
            // InternalRest.g:6326:1: ( '{' )
            {
            // InternalRest.g:6326:1: ( '{' )
            // InternalRest.g:6327:2: '{'
            {
             before(grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__OpUpdate__Group_7__1__Impl"


    // $ANTLR start "rule__OpUpdate__Group_7__2"
    // InternalRest.g:6336:1: rule__OpUpdate__Group_7__2 : rule__OpUpdate__Group_7__2__Impl rule__OpUpdate__Group_7__3 ;
    public final void rule__OpUpdate__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6340:1: ( rule__OpUpdate__Group_7__2__Impl rule__OpUpdate__Group_7__3 )
            // InternalRest.g:6341:2: rule__OpUpdate__Group_7__2__Impl rule__OpUpdate__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__OpUpdate__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_7__3();

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
    // $ANTLR end "rule__OpUpdate__Group_7__2"


    // $ANTLR start "rule__OpUpdate__Group_7__2__Impl"
    // InternalRest.g:6348:1: rule__OpUpdate__Group_7__2__Impl : ( ( rule__OpUpdate__FieldsetsAssignment_7_2 ) ) ;
    public final void rule__OpUpdate__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6352:1: ( ( ( rule__OpUpdate__FieldsetsAssignment_7_2 ) ) )
            // InternalRest.g:6353:1: ( ( rule__OpUpdate__FieldsetsAssignment_7_2 ) )
            {
            // InternalRest.g:6353:1: ( ( rule__OpUpdate__FieldsetsAssignment_7_2 ) )
            // InternalRest.g:6354:2: ( rule__OpUpdate__FieldsetsAssignment_7_2 )
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetsAssignment_7_2()); 
            // InternalRest.g:6355:2: ( rule__OpUpdate__FieldsetsAssignment_7_2 )
            // InternalRest.g:6355:3: rule__OpUpdate__FieldsetsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__FieldsetsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getFieldsetsAssignment_7_2()); 

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
    // $ANTLR end "rule__OpUpdate__Group_7__2__Impl"


    // $ANTLR start "rule__OpUpdate__Group_7__3"
    // InternalRest.g:6363:1: rule__OpUpdate__Group_7__3 : rule__OpUpdate__Group_7__3__Impl rule__OpUpdate__Group_7__4 ;
    public final void rule__OpUpdate__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6367:1: ( rule__OpUpdate__Group_7__3__Impl rule__OpUpdate__Group_7__4 )
            // InternalRest.g:6368:2: rule__OpUpdate__Group_7__3__Impl rule__OpUpdate__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__OpUpdate__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_7__4();

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
    // $ANTLR end "rule__OpUpdate__Group_7__3"


    // $ANTLR start "rule__OpUpdate__Group_7__3__Impl"
    // InternalRest.g:6375:1: rule__OpUpdate__Group_7__3__Impl : ( ( rule__OpUpdate__Group_7_3__0 )* ) ;
    public final void rule__OpUpdate__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6379:1: ( ( ( rule__OpUpdate__Group_7_3__0 )* ) )
            // InternalRest.g:6380:1: ( ( rule__OpUpdate__Group_7_3__0 )* )
            {
            // InternalRest.g:6380:1: ( ( rule__OpUpdate__Group_7_3__0 )* )
            // InternalRest.g:6381:2: ( rule__OpUpdate__Group_7_3__0 )*
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_7_3()); 
            // InternalRest.g:6382:2: ( rule__OpUpdate__Group_7_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==15) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRest.g:6382:3: rule__OpUpdate__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OpUpdate__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getOpUpdateAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__OpUpdate__Group_7__3__Impl"


    // $ANTLR start "rule__OpUpdate__Group_7__4"
    // InternalRest.g:6390:1: rule__OpUpdate__Group_7__4 : rule__OpUpdate__Group_7__4__Impl ;
    public final void rule__OpUpdate__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6394:1: ( rule__OpUpdate__Group_7__4__Impl )
            // InternalRest.g:6395:2: rule__OpUpdate__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_7__4__Impl();

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
    // $ANTLR end "rule__OpUpdate__Group_7__4"


    // $ANTLR start "rule__OpUpdate__Group_7__4__Impl"
    // InternalRest.g:6401:1: rule__OpUpdate__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OpUpdate__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6405:1: ( ( '}' ) )
            // InternalRest.g:6406:1: ( '}' )
            {
            // InternalRest.g:6406:1: ( '}' )
            // InternalRest.g:6407:2: '}'
            {
             before(grammarAccess.getOpUpdateAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__OpUpdate__Group_7__4__Impl"


    // $ANTLR start "rule__OpUpdate__Group_7_3__0"
    // InternalRest.g:6417:1: rule__OpUpdate__Group_7_3__0 : rule__OpUpdate__Group_7_3__0__Impl rule__OpUpdate__Group_7_3__1 ;
    public final void rule__OpUpdate__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6421:1: ( rule__OpUpdate__Group_7_3__0__Impl rule__OpUpdate__Group_7_3__1 )
            // InternalRest.g:6422:2: rule__OpUpdate__Group_7_3__0__Impl rule__OpUpdate__Group_7_3__1
            {
            pushFollow(FOLLOW_30);
            rule__OpUpdate__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_7_3__1();

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
    // $ANTLR end "rule__OpUpdate__Group_7_3__0"


    // $ANTLR start "rule__OpUpdate__Group_7_3__0__Impl"
    // InternalRest.g:6429:1: rule__OpUpdate__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OpUpdate__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6433:1: ( ( ',' ) )
            // InternalRest.g:6434:1: ( ',' )
            {
            // InternalRest.g:6434:1: ( ',' )
            // InternalRest.g:6435:2: ','
            {
             before(grammarAccess.getOpUpdateAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__OpUpdate__Group_7_3__0__Impl"


    // $ANTLR start "rule__OpUpdate__Group_7_3__1"
    // InternalRest.g:6444:1: rule__OpUpdate__Group_7_3__1 : rule__OpUpdate__Group_7_3__1__Impl ;
    public final void rule__OpUpdate__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6448:1: ( rule__OpUpdate__Group_7_3__1__Impl )
            // InternalRest.g:6449:2: rule__OpUpdate__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__OpUpdate__Group_7_3__1"


    // $ANTLR start "rule__OpUpdate__Group_7_3__1__Impl"
    // InternalRest.g:6455:1: rule__OpUpdate__Group_7_3__1__Impl : ( ( rule__OpUpdate__FieldsetsAssignment_7_3_1 ) ) ;
    public final void rule__OpUpdate__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6459:1: ( ( ( rule__OpUpdate__FieldsetsAssignment_7_3_1 ) ) )
            // InternalRest.g:6460:1: ( ( rule__OpUpdate__FieldsetsAssignment_7_3_1 ) )
            {
            // InternalRest.g:6460:1: ( ( rule__OpUpdate__FieldsetsAssignment_7_3_1 ) )
            // InternalRest.g:6461:2: ( rule__OpUpdate__FieldsetsAssignment_7_3_1 )
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetsAssignment_7_3_1()); 
            // InternalRest.g:6462:2: ( rule__OpUpdate__FieldsetsAssignment_7_3_1 )
            // InternalRest.g:6462:3: rule__OpUpdate__FieldsetsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__FieldsetsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getFieldsetsAssignment_7_3_1()); 

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
    // $ANTLR end "rule__OpUpdate__Group_7_3__1__Impl"


    // $ANTLR start "rule__OpDelete__Group__0"
    // InternalRest.g:6471:1: rule__OpDelete__Group__0 : rule__OpDelete__Group__0__Impl rule__OpDelete__Group__1 ;
    public final void rule__OpDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6475:1: ( rule__OpDelete__Group__0__Impl rule__OpDelete__Group__1 )
            // InternalRest.g:6476:2: rule__OpDelete__Group__0__Impl rule__OpDelete__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OpDelete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group__1();

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
    // $ANTLR end "rule__OpDelete__Group__0"


    // $ANTLR start "rule__OpDelete__Group__0__Impl"
    // InternalRest.g:6483:1: rule__OpDelete__Group__0__Impl : ( 'OpDelete' ) ;
    public final void rule__OpDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6487:1: ( ( 'OpDelete' ) )
            // InternalRest.g:6488:1: ( 'OpDelete' )
            {
            // InternalRest.g:6488:1: ( 'OpDelete' )
            // InternalRest.g:6489:2: 'OpDelete'
            {
             before(grammarAccess.getOpDeleteAccess().getOpDeleteKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOpDeleteAccess().getOpDeleteKeyword_0()); 

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
    // $ANTLR end "rule__OpDelete__Group__0__Impl"


    // $ANTLR start "rule__OpDelete__Group__1"
    // InternalRest.g:6498:1: rule__OpDelete__Group__1 : rule__OpDelete__Group__1__Impl rule__OpDelete__Group__2 ;
    public final void rule__OpDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6502:1: ( rule__OpDelete__Group__1__Impl rule__OpDelete__Group__2 )
            // InternalRest.g:6503:2: rule__OpDelete__Group__1__Impl rule__OpDelete__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__OpDelete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group__2();

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
    // $ANTLR end "rule__OpDelete__Group__1"


    // $ANTLR start "rule__OpDelete__Group__1__Impl"
    // InternalRest.g:6510:1: rule__OpDelete__Group__1__Impl : ( '{' ) ;
    public final void rule__OpDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6514:1: ( ( '{' ) )
            // InternalRest.g:6515:1: ( '{' )
            {
            // InternalRest.g:6515:1: ( '{' )
            // InternalRest.g:6516:2: '{'
            {
             before(grammarAccess.getOpDeleteAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOpDeleteAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__OpDelete__Group__1__Impl"


    // $ANTLR start "rule__OpDelete__Group__2"
    // InternalRest.g:6525:1: rule__OpDelete__Group__2 : rule__OpDelete__Group__2__Impl rule__OpDelete__Group__3 ;
    public final void rule__OpDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6529:1: ( rule__OpDelete__Group__2__Impl rule__OpDelete__Group__3 )
            // InternalRest.g:6530:2: rule__OpDelete__Group__2__Impl rule__OpDelete__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__OpDelete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group__3();

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
    // $ANTLR end "rule__OpDelete__Group__2"


    // $ANTLR start "rule__OpDelete__Group__2__Impl"
    // InternalRest.g:6537:1: rule__OpDelete__Group__2__Impl : ( ( rule__OpDelete__Group_2__0 )? ) ;
    public final void rule__OpDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6541:1: ( ( ( rule__OpDelete__Group_2__0 )? ) )
            // InternalRest.g:6542:1: ( ( rule__OpDelete__Group_2__0 )? )
            {
            // InternalRest.g:6542:1: ( ( rule__OpDelete__Group_2__0 )? )
            // InternalRest.g:6543:2: ( rule__OpDelete__Group_2__0 )?
            {
             before(grammarAccess.getOpDeleteAccess().getGroup_2()); 
            // InternalRest.g:6544:2: ( rule__OpDelete__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRest.g:6544:3: rule__OpDelete__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpDelete__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpDeleteAccess().getGroup_2()); 

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
    // $ANTLR end "rule__OpDelete__Group__2__Impl"


    // $ANTLR start "rule__OpDelete__Group__3"
    // InternalRest.g:6552:1: rule__OpDelete__Group__3 : rule__OpDelete__Group__3__Impl rule__OpDelete__Group__4 ;
    public final void rule__OpDelete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6556:1: ( rule__OpDelete__Group__3__Impl rule__OpDelete__Group__4 )
            // InternalRest.g:6557:2: rule__OpDelete__Group__3__Impl rule__OpDelete__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__OpDelete__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group__4();

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
    // $ANTLR end "rule__OpDelete__Group__3"


    // $ANTLR start "rule__OpDelete__Group__3__Impl"
    // InternalRest.g:6564:1: rule__OpDelete__Group__3__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpDelete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6568:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:6569:1: ( 'failedAnswer' )
            {
            // InternalRest.g:6569:1: ( 'failedAnswer' )
            // InternalRest.g:6570:2: 'failedAnswer'
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOpDeleteAccess().getFailedAnswerKeyword_3()); 

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
    // $ANTLR end "rule__OpDelete__Group__3__Impl"


    // $ANTLR start "rule__OpDelete__Group__4"
    // InternalRest.g:6579:1: rule__OpDelete__Group__4 : rule__OpDelete__Group__4__Impl rule__OpDelete__Group__5 ;
    public final void rule__OpDelete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6583:1: ( rule__OpDelete__Group__4__Impl rule__OpDelete__Group__5 )
            // InternalRest.g:6584:2: rule__OpDelete__Group__4__Impl rule__OpDelete__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__OpDelete__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group__5();

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
    // $ANTLR end "rule__OpDelete__Group__4"


    // $ANTLR start "rule__OpDelete__Group__4__Impl"
    // InternalRest.g:6591:1: rule__OpDelete__Group__4__Impl : ( ( rule__OpDelete__FailedAnswerAssignment_4 ) ) ;
    public final void rule__OpDelete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6595:1: ( ( ( rule__OpDelete__FailedAnswerAssignment_4 ) ) )
            // InternalRest.g:6596:1: ( ( rule__OpDelete__FailedAnswerAssignment_4 ) )
            {
            // InternalRest.g:6596:1: ( ( rule__OpDelete__FailedAnswerAssignment_4 ) )
            // InternalRest.g:6597:2: ( rule__OpDelete__FailedAnswerAssignment_4 )
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerAssignment_4()); 
            // InternalRest.g:6598:2: ( rule__OpDelete__FailedAnswerAssignment_4 )
            // InternalRest.g:6598:3: rule__OpDelete__FailedAnswerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__FailedAnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOpDeleteAccess().getFailedAnswerAssignment_4()); 

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
    // $ANTLR end "rule__OpDelete__Group__4__Impl"


    // $ANTLR start "rule__OpDelete__Group__5"
    // InternalRest.g:6606:1: rule__OpDelete__Group__5 : rule__OpDelete__Group__5__Impl rule__OpDelete__Group__6 ;
    public final void rule__OpDelete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6610:1: ( rule__OpDelete__Group__5__Impl rule__OpDelete__Group__6 )
            // InternalRest.g:6611:2: rule__OpDelete__Group__5__Impl rule__OpDelete__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__OpDelete__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group__6();

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
    // $ANTLR end "rule__OpDelete__Group__5"


    // $ANTLR start "rule__OpDelete__Group__5__Impl"
    // InternalRest.g:6618:1: rule__OpDelete__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpDelete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6622:1: ( ( 'struct' ) )
            // InternalRest.g:6623:1: ( 'struct' )
            {
            // InternalRest.g:6623:1: ( 'struct' )
            // InternalRest.g:6624:2: 'struct'
            {
             before(grammarAccess.getOpDeleteAccess().getStructKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOpDeleteAccess().getStructKeyword_5()); 

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
    // $ANTLR end "rule__OpDelete__Group__5__Impl"


    // $ANTLR start "rule__OpDelete__Group__6"
    // InternalRest.g:6633:1: rule__OpDelete__Group__6 : rule__OpDelete__Group__6__Impl rule__OpDelete__Group__7 ;
    public final void rule__OpDelete__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6637:1: ( rule__OpDelete__Group__6__Impl rule__OpDelete__Group__7 )
            // InternalRest.g:6638:2: rule__OpDelete__Group__6__Impl rule__OpDelete__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__OpDelete__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group__7();

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
    // $ANTLR end "rule__OpDelete__Group__6"


    // $ANTLR start "rule__OpDelete__Group__6__Impl"
    // InternalRest.g:6645:1: rule__OpDelete__Group__6__Impl : ( ( rule__OpDelete__StructAssignment_6 ) ) ;
    public final void rule__OpDelete__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6649:1: ( ( ( rule__OpDelete__StructAssignment_6 ) ) )
            // InternalRest.g:6650:1: ( ( rule__OpDelete__StructAssignment_6 ) )
            {
            // InternalRest.g:6650:1: ( ( rule__OpDelete__StructAssignment_6 ) )
            // InternalRest.g:6651:2: ( rule__OpDelete__StructAssignment_6 )
            {
             before(grammarAccess.getOpDeleteAccess().getStructAssignment_6()); 
            // InternalRest.g:6652:2: ( rule__OpDelete__StructAssignment_6 )
            // InternalRest.g:6652:3: rule__OpDelete__StructAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__StructAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOpDeleteAccess().getStructAssignment_6()); 

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
    // $ANTLR end "rule__OpDelete__Group__6__Impl"


    // $ANTLR start "rule__OpDelete__Group__7"
    // InternalRest.g:6660:1: rule__OpDelete__Group__7 : rule__OpDelete__Group__7__Impl ;
    public final void rule__OpDelete__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6664:1: ( rule__OpDelete__Group__7__Impl )
            // InternalRest.g:6665:2: rule__OpDelete__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__Group__7__Impl();

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
    // $ANTLR end "rule__OpDelete__Group__7"


    // $ANTLR start "rule__OpDelete__Group__7__Impl"
    // InternalRest.g:6671:1: rule__OpDelete__Group__7__Impl : ( '}' ) ;
    public final void rule__OpDelete__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6675:1: ( ( '}' ) )
            // InternalRest.g:6676:1: ( '}' )
            {
            // InternalRest.g:6676:1: ( '}' )
            // InternalRest.g:6677:2: '}'
            {
             before(grammarAccess.getOpDeleteAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOpDeleteAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__OpDelete__Group__7__Impl"


    // $ANTLR start "rule__OpDelete__Group_2__0"
    // InternalRest.g:6687:1: rule__OpDelete__Group_2__0 : rule__OpDelete__Group_2__0__Impl rule__OpDelete__Group_2__1 ;
    public final void rule__OpDelete__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6691:1: ( rule__OpDelete__Group_2__0__Impl rule__OpDelete__Group_2__1 )
            // InternalRest.g:6692:2: rule__OpDelete__Group_2__0__Impl rule__OpDelete__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__OpDelete__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group_2__1();

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
    // $ANTLR end "rule__OpDelete__Group_2__0"


    // $ANTLR start "rule__OpDelete__Group_2__0__Impl"
    // InternalRest.g:6699:1: rule__OpDelete__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpDelete__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6703:1: ( ( 'id' ) )
            // InternalRest.g:6704:1: ( 'id' )
            {
            // InternalRest.g:6704:1: ( 'id' )
            // InternalRest.g:6705:2: 'id'
            {
             before(grammarAccess.getOpDeleteAccess().getIdKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOpDeleteAccess().getIdKeyword_2_0()); 

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
    // $ANTLR end "rule__OpDelete__Group_2__0__Impl"


    // $ANTLR start "rule__OpDelete__Group_2__1"
    // InternalRest.g:6714:1: rule__OpDelete__Group_2__1 : rule__OpDelete__Group_2__1__Impl ;
    public final void rule__OpDelete__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6718:1: ( rule__OpDelete__Group_2__1__Impl )
            // InternalRest.g:6719:2: rule__OpDelete__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__Group_2__1__Impl();

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
    // $ANTLR end "rule__OpDelete__Group_2__1"


    // $ANTLR start "rule__OpDelete__Group_2__1__Impl"
    // InternalRest.g:6725:1: rule__OpDelete__Group_2__1__Impl : ( ( rule__OpDelete__IdAssignment_2_1 ) ) ;
    public final void rule__OpDelete__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6729:1: ( ( ( rule__OpDelete__IdAssignment_2_1 ) ) )
            // InternalRest.g:6730:1: ( ( rule__OpDelete__IdAssignment_2_1 ) )
            {
            // InternalRest.g:6730:1: ( ( rule__OpDelete__IdAssignment_2_1 ) )
            // InternalRest.g:6731:2: ( rule__OpDelete__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpDeleteAccess().getIdAssignment_2_1()); 
            // InternalRest.g:6732:2: ( rule__OpDelete__IdAssignment_2_1 )
            // InternalRest.g:6732:3: rule__OpDelete__IdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpDeleteAccess().getIdAssignment_2_1()); 

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
    // $ANTLR end "rule__OpDelete__Group_2__1__Impl"


    // $ANTLR start "rule__FieldSet__Group__0"
    // InternalRest.g:6741:1: rule__FieldSet__Group__0 : rule__FieldSet__Group__0__Impl rule__FieldSet__Group__1 ;
    public final void rule__FieldSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6745:1: ( rule__FieldSet__Group__0__Impl rule__FieldSet__Group__1 )
            // InternalRest.g:6746:2: rule__FieldSet__Group__0__Impl rule__FieldSet__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__FieldSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSet__Group__1();

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
    // $ANTLR end "rule__FieldSet__Group__0"


    // $ANTLR start "rule__FieldSet__Group__0__Impl"
    // InternalRest.g:6753:1: rule__FieldSet__Group__0__Impl : ( () ) ;
    public final void rule__FieldSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6757:1: ( ( () ) )
            // InternalRest.g:6758:1: ( () )
            {
            // InternalRest.g:6758:1: ( () )
            // InternalRest.g:6759:2: ()
            {
             before(grammarAccess.getFieldSetAccess().getFieldSetAction_0()); 
            // InternalRest.g:6760:2: ()
            // InternalRest.g:6760:3: 
            {
            }

             after(grammarAccess.getFieldSetAccess().getFieldSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSet__Group__0__Impl"


    // $ANTLR start "rule__FieldSet__Group__1"
    // InternalRest.g:6768:1: rule__FieldSet__Group__1 : rule__FieldSet__Group__1__Impl rule__FieldSet__Group__2 ;
    public final void rule__FieldSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6772:1: ( rule__FieldSet__Group__1__Impl rule__FieldSet__Group__2 )
            // InternalRest.g:6773:2: rule__FieldSet__Group__1__Impl rule__FieldSet__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__FieldSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSet__Group__2();

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
    // $ANTLR end "rule__FieldSet__Group__1"


    // $ANTLR start "rule__FieldSet__Group__1__Impl"
    // InternalRest.g:6780:1: rule__FieldSet__Group__1__Impl : ( 'FieldSet' ) ;
    public final void rule__FieldSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6784:1: ( ( 'FieldSet' ) )
            // InternalRest.g:6785:1: ( 'FieldSet' )
            {
            // InternalRest.g:6785:1: ( 'FieldSet' )
            // InternalRest.g:6786:2: 'FieldSet'
            {
             before(grammarAccess.getFieldSetAccess().getFieldSetKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFieldSetAccess().getFieldSetKeyword_1()); 

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
    // $ANTLR end "rule__FieldSet__Group__1__Impl"


    // $ANTLR start "rule__FieldSet__Group__2"
    // InternalRest.g:6795:1: rule__FieldSet__Group__2 : rule__FieldSet__Group__2__Impl rule__FieldSet__Group__3 ;
    public final void rule__FieldSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6799:1: ( rule__FieldSet__Group__2__Impl rule__FieldSet__Group__3 )
            // InternalRest.g:6800:2: rule__FieldSet__Group__2__Impl rule__FieldSet__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__FieldSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSet__Group__3();

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
    // $ANTLR end "rule__FieldSet__Group__2"


    // $ANTLR start "rule__FieldSet__Group__2__Impl"
    // InternalRest.g:6807:1: rule__FieldSet__Group__2__Impl : ( ( rule__FieldSet__NameAssignment_2 ) ) ;
    public final void rule__FieldSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6811:1: ( ( ( rule__FieldSet__NameAssignment_2 ) ) )
            // InternalRest.g:6812:1: ( ( rule__FieldSet__NameAssignment_2 ) )
            {
            // InternalRest.g:6812:1: ( ( rule__FieldSet__NameAssignment_2 ) )
            // InternalRest.g:6813:2: ( rule__FieldSet__NameAssignment_2 )
            {
             before(grammarAccess.getFieldSetAccess().getNameAssignment_2()); 
            // InternalRest.g:6814:2: ( rule__FieldSet__NameAssignment_2 )
            // InternalRest.g:6814:3: rule__FieldSet__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FieldSet__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldSetAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__FieldSet__Group__2__Impl"


    // $ANTLR start "rule__FieldSet__Group__3"
    // InternalRest.g:6822:1: rule__FieldSet__Group__3 : rule__FieldSet__Group__3__Impl rule__FieldSet__Group__4 ;
    public final void rule__FieldSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6826:1: ( rule__FieldSet__Group__3__Impl rule__FieldSet__Group__4 )
            // InternalRest.g:6827:2: rule__FieldSet__Group__3__Impl rule__FieldSet__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__FieldSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSet__Group__4();

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
    // $ANTLR end "rule__FieldSet__Group__3"


    // $ANTLR start "rule__FieldSet__Group__3__Impl"
    // InternalRest.g:6834:1: rule__FieldSet__Group__3__Impl : ( '{' ) ;
    public final void rule__FieldSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6838:1: ( ( '{' ) )
            // InternalRest.g:6839:1: ( '{' )
            {
            // InternalRest.g:6839:1: ( '{' )
            // InternalRest.g:6840:2: '{'
            {
             before(grammarAccess.getFieldSetAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFieldSetAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__FieldSet__Group__3__Impl"


    // $ANTLR start "rule__FieldSet__Group__4"
    // InternalRest.g:6849:1: rule__FieldSet__Group__4 : rule__FieldSet__Group__4__Impl rule__FieldSet__Group__5 ;
    public final void rule__FieldSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6853:1: ( rule__FieldSet__Group__4__Impl rule__FieldSet__Group__5 )
            // InternalRest.g:6854:2: rule__FieldSet__Group__4__Impl rule__FieldSet__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__FieldSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSet__Group__5();

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
    // $ANTLR end "rule__FieldSet__Group__4"


    // $ANTLR start "rule__FieldSet__Group__4__Impl"
    // InternalRest.g:6861:1: rule__FieldSet__Group__4__Impl : ( ( rule__FieldSet__Group_4__0 )? ) ;
    public final void rule__FieldSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6865:1: ( ( ( rule__FieldSet__Group_4__0 )? ) )
            // InternalRest.g:6866:1: ( ( rule__FieldSet__Group_4__0 )? )
            {
            // InternalRest.g:6866:1: ( ( rule__FieldSet__Group_4__0 )? )
            // InternalRest.g:6867:2: ( rule__FieldSet__Group_4__0 )?
            {
             before(grammarAccess.getFieldSetAccess().getGroup_4()); 
            // InternalRest.g:6868:2: ( rule__FieldSet__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRest.g:6868:3: rule__FieldSet__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSet__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldSetAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FieldSet__Group__4__Impl"


    // $ANTLR start "rule__FieldSet__Group__5"
    // InternalRest.g:6876:1: rule__FieldSet__Group__5 : rule__FieldSet__Group__5__Impl ;
    public final void rule__FieldSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6880:1: ( rule__FieldSet__Group__5__Impl )
            // InternalRest.g:6881:2: rule__FieldSet__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSet__Group__5__Impl();

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
    // $ANTLR end "rule__FieldSet__Group__5"


    // $ANTLR start "rule__FieldSet__Group__5__Impl"
    // InternalRest.g:6887:1: rule__FieldSet__Group__5__Impl : ( '}' ) ;
    public final void rule__FieldSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6891:1: ( ( '}' ) )
            // InternalRest.g:6892:1: ( '}' )
            {
            // InternalRest.g:6892:1: ( '}' )
            // InternalRest.g:6893:2: '}'
            {
             before(grammarAccess.getFieldSetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFieldSetAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__FieldSet__Group__5__Impl"


    // $ANTLR start "rule__FieldSet__Group_4__0"
    // InternalRest.g:6903:1: rule__FieldSet__Group_4__0 : rule__FieldSet__Group_4__0__Impl rule__FieldSet__Group_4__1 ;
    public final void rule__FieldSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6907:1: ( rule__FieldSet__Group_4__0__Impl rule__FieldSet__Group_4__1 )
            // InternalRest.g:6908:2: rule__FieldSet__Group_4__0__Impl rule__FieldSet__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__FieldSet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSet__Group_4__1();

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
    // $ANTLR end "rule__FieldSet__Group_4__0"


    // $ANTLR start "rule__FieldSet__Group_4__0__Impl"
    // InternalRest.g:6915:1: rule__FieldSet__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__FieldSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6919:1: ( ( 'value' ) )
            // InternalRest.g:6920:1: ( 'value' )
            {
            // InternalRest.g:6920:1: ( 'value' )
            // InternalRest.g:6921:2: 'value'
            {
             before(grammarAccess.getFieldSetAccess().getValueKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFieldSetAccess().getValueKeyword_4_0()); 

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
    // $ANTLR end "rule__FieldSet__Group_4__0__Impl"


    // $ANTLR start "rule__FieldSet__Group_4__1"
    // InternalRest.g:6930:1: rule__FieldSet__Group_4__1 : rule__FieldSet__Group_4__1__Impl ;
    public final void rule__FieldSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6934:1: ( rule__FieldSet__Group_4__1__Impl )
            // InternalRest.g:6935:2: rule__FieldSet__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSet__Group_4__1__Impl();

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
    // $ANTLR end "rule__FieldSet__Group_4__1"


    // $ANTLR start "rule__FieldSet__Group_4__1__Impl"
    // InternalRest.g:6941:1: rule__FieldSet__Group_4__1__Impl : ( ( rule__FieldSet__ValueAssignment_4_1 ) ) ;
    public final void rule__FieldSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6945:1: ( ( ( rule__FieldSet__ValueAssignment_4_1 ) ) )
            // InternalRest.g:6946:1: ( ( rule__FieldSet__ValueAssignment_4_1 ) )
            {
            // InternalRest.g:6946:1: ( ( rule__FieldSet__ValueAssignment_4_1 ) )
            // InternalRest.g:6947:2: ( rule__FieldSet__ValueAssignment_4_1 )
            {
             before(grammarAccess.getFieldSetAccess().getValueAssignment_4_1()); 
            // InternalRest.g:6948:2: ( rule__FieldSet__ValueAssignment_4_1 )
            // InternalRest.g:6948:3: rule__FieldSet__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSet__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldSetAccess().getValueAssignment_4_1()); 

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
    // $ANTLR end "rule__FieldSet__Group_4__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalRest.g:6957:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6961:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalRest.g:6962:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalRest.g:6969:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6973:1: ( ( () ) )
            // InternalRest.g:6974:1: ( () )
            {
            // InternalRest.g:6974:1: ( () )
            // InternalRest.g:6975:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // InternalRest.g:6976:2: ()
            // InternalRest.g:6976:3: 
            {
            }

             after(grammarAccess.getFieldAccess().getFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalRest.g:6984:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6988:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalRest.g:6989:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalRest.g:6996:1: rule__Field__Group__1__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7000:1: ( ( 'Field' ) )
            // InternalRest.g:7001:1: ( 'Field' )
            {
            // InternalRest.g:7001:1: ( 'Field' )
            // InternalRest.g:7002:2: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalRest.g:7011:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7015:1: ( rule__Field__Group__2__Impl )
            // InternalRest.g:7016:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalRest.g:7022:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7026:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalRest.g:7027:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalRest.g:7027:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalRest.g:7028:2: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // InternalRest.g:7029:2: ( rule__Field__NameAssignment_2 )
            // InternalRest.g:7029:3: rule__Field__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalRest.g:7038:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7042:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRest.g:7043:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalRest.g:7050:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7054:1: ( ( ( '-' )? ) )
            // InternalRest.g:7055:1: ( ( '-' )? )
            {
            // InternalRest.g:7055:1: ( ( '-' )? )
            // InternalRest.g:7056:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRest.g:7057:2: ( '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRest.g:7057:3: '-'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalRest.g:7065:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7069:1: ( rule__EInt__Group__1__Impl )
            // InternalRest.g:7070:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalRest.g:7076:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7080:1: ( ( RULE_INT ) )
            // InternalRest.g:7081:1: ( RULE_INT )
            {
            // InternalRest.g:7081:1: ( RULE_INT )
            // InternalRest.g:7082:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__RestSystem__RequestsAssignment_3_2"
    // InternalRest.g:7092:1: rule__RestSystem__RequestsAssignment_3_2 : ( ruleRequest ) ;
    public final void rule__RestSystem__RequestsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7096:1: ( ( ruleRequest ) )
            // InternalRest.g:7097:2: ( ruleRequest )
            {
            // InternalRest.g:7097:2: ( ruleRequest )
            // InternalRest.g:7098:3: ruleRequest
            {
             before(grammarAccess.getRestSystemAccess().getRequestsRequestParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getRequestsRequestParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__RestSystem__RequestsAssignment_3_2"


    // $ANTLR start "rule__RestSystem__RequestsAssignment_3_3_1"
    // InternalRest.g:7107:1: rule__RestSystem__RequestsAssignment_3_3_1 : ( ruleRequest ) ;
    public final void rule__RestSystem__RequestsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7111:1: ( ( ruleRequest ) )
            // InternalRest.g:7112:2: ( ruleRequest )
            {
            // InternalRest.g:7112:2: ( ruleRequest )
            // InternalRest.g:7113:3: ruleRequest
            {
             before(grammarAccess.getRestSystemAccess().getRequestsRequestParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getRequestsRequestParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__RestSystem__RequestsAssignment_3_3_1"


    // $ANTLR start "rule__RestSystem__StructsAssignment_4_2"
    // InternalRest.g:7122:1: rule__RestSystem__StructsAssignment_4_2 : ( ruleStruct ) ;
    public final void rule__RestSystem__StructsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7126:1: ( ( ruleStruct ) )
            // InternalRest.g:7127:2: ( ruleStruct )
            {
            // InternalRest.g:7127:2: ( ruleStruct )
            // InternalRest.g:7128:3: ruleStruct
            {
             before(grammarAccess.getRestSystemAccess().getStructsStructParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getStructsStructParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__RestSystem__StructsAssignment_4_2"


    // $ANTLR start "rule__RestSystem__StructsAssignment_4_3_1"
    // InternalRest.g:7137:1: rule__RestSystem__StructsAssignment_4_3_1 : ( ruleStruct ) ;
    public final void rule__RestSystem__StructsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7141:1: ( ( ruleStruct ) )
            // InternalRest.g:7142:2: ( ruleStruct )
            {
            // InternalRest.g:7142:2: ( ruleStruct )
            // InternalRest.g:7143:3: ruleStruct
            {
             before(grammarAccess.getRestSystemAccess().getStructsStructParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getStructsStructParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__RestSystem__StructsAssignment_4_3_1"


    // $ANTLR start "rule__RestSystem__AnswersAssignment_5_2"
    // InternalRest.g:7152:1: rule__RestSystem__AnswersAssignment_5_2 : ( ruleAnswer ) ;
    public final void rule__RestSystem__AnswersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7156:1: ( ( ruleAnswer ) )
            // InternalRest.g:7157:2: ( ruleAnswer )
            {
            // InternalRest.g:7157:2: ( ruleAnswer )
            // InternalRest.g:7158:3: ruleAnswer
            {
             before(grammarAccess.getRestSystemAccess().getAnswersAnswerParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getAnswersAnswerParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__RestSystem__AnswersAssignment_5_2"


    // $ANTLR start "rule__RestSystem__AnswersAssignment_5_3_1"
    // InternalRest.g:7167:1: rule__RestSystem__AnswersAssignment_5_3_1 : ( ruleAnswer ) ;
    public final void rule__RestSystem__AnswersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7171:1: ( ( ruleAnswer ) )
            // InternalRest.g:7172:2: ( ruleAnswer )
            {
            // InternalRest.g:7172:2: ( ruleAnswer )
            // InternalRest.g:7173:3: ruleAnswer
            {
             before(grammarAccess.getRestSystemAccess().getAnswersAnswerParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getAnswersAnswerParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__RestSystem__AnswersAssignment_5_3_1"


    // $ANTLR start "rule__Struct__NameAssignment_2"
    // InternalRest.g:7182:1: rule__Struct__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Struct__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7186:1: ( ( ruleEString ) )
            // InternalRest.g:7187:2: ( ruleEString )
            {
            // InternalRest.g:7187:2: ( ruleEString )
            // InternalRest.g:7188:3: ruleEString
            {
             before(grammarAccess.getStructAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStructAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Struct__NameAssignment_2"


    // $ANTLR start "rule__Struct__FieldsAssignment_4_2"
    // InternalRest.g:7197:1: rule__Struct__FieldsAssignment_4_2 : ( ruleField ) ;
    public final void rule__Struct__FieldsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7201:1: ( ( ruleField ) )
            // InternalRest.g:7202:2: ( ruleField )
            {
            // InternalRest.g:7202:2: ( ruleField )
            // InternalRest.g:7203:3: ruleField
            {
             before(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Struct__FieldsAssignment_4_2"


    // $ANTLR start "rule__Struct__FieldsAssignment_4_3_1"
    // InternalRest.g:7212:1: rule__Struct__FieldsAssignment_4_3_1 : ( ruleField ) ;
    public final void rule__Struct__FieldsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7216:1: ( ( ruleField ) )
            // InternalRest.g:7217:2: ( ruleField )
            {
            // InternalRest.g:7217:2: ( ruleField )
            // InternalRest.g:7218:3: ruleField
            {
             before(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Struct__FieldsAssignment_4_3_1"


    // $ANTLR start "rule__Answer__NameAssignment_1"
    // InternalRest.g:7227:1: rule__Answer__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Answer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7231:1: ( ( ruleEString ) )
            // InternalRest.g:7232:2: ( ruleEString )
            {
            // InternalRest.g:7232:2: ( ruleEString )
            // InternalRest.g:7233:3: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Answer__NameAssignment_1"


    // $ANTLR start "rule__Answer__StatusAssignment_4"
    // InternalRest.g:7242:1: rule__Answer__StatusAssignment_4 : ( ruleEInt ) ;
    public final void rule__Answer__StatusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7246:1: ( ( ruleEInt ) )
            // InternalRest.g:7247:2: ( ruleEInt )
            {
            // InternalRest.g:7247:2: ( ruleEInt )
            // InternalRest.g:7248:3: ruleEInt
            {
             before(grammarAccess.getAnswerAccess().getStatusEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getStatusEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Answer__StatusAssignment_4"


    // $ANTLR start "rule__Answer__ReturnAssignment_5_1"
    // InternalRest.g:7257:1: rule__Answer__ReturnAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Answer__ReturnAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7261:1: ( ( ruleEString ) )
            // InternalRest.g:7262:2: ( ruleEString )
            {
            // InternalRest.g:7262:2: ( ruleEString )
            // InternalRest.g:7263:3: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getReturnEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getReturnEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Answer__ReturnAssignment_5_1"


    // $ANTLR start "rule__Route__SegmentsAssignment_4"
    // InternalRest.g:7272:1: rule__Route__SegmentsAssignment_4 : ( ruleSegment ) ;
    public final void rule__Route__SegmentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7276:1: ( ( ruleSegment ) )
            // InternalRest.g:7277:2: ( ruleSegment )
            {
            // InternalRest.g:7277:2: ( ruleSegment )
            // InternalRest.g:7278:3: ruleSegment
            {
             before(grammarAccess.getRouteAccess().getSegmentsSegmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getSegmentsSegmentParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Route__SegmentsAssignment_4"


    // $ANTLR start "rule__Route__SegmentsAssignment_5_1"
    // InternalRest.g:7287:1: rule__Route__SegmentsAssignment_5_1 : ( ruleSegment ) ;
    public final void rule__Route__SegmentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7291:1: ( ( ruleSegment ) )
            // InternalRest.g:7292:2: ( ruleSegment )
            {
            // InternalRest.g:7292:2: ( ruleSegment )
            // InternalRest.g:7293:3: ruleSegment
            {
             before(grammarAccess.getRouteAccess().getSegmentsSegmentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getSegmentsSegmentParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Route__SegmentsAssignment_5_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalRest.g:7302:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7306:1: ( ( ruleEString ) )
            // InternalRest.g:7307:2: ( ruleEString )
            {
            // InternalRest.g:7307:2: ( ruleEString )
            // InternalRest.g:7308:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__ReGet__SuccAnswerAssignment_3"
    // InternalRest.g:7317:1: rule__ReGet__SuccAnswerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ReGet__SuccAnswerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7321:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7322:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7322:2: ( ( ruleEString ) )
            // InternalRest.g:7323:3: ( ruleEString )
            {
             before(grammarAccess.getReGetAccess().getSuccAnswerAnswerCrossReference_3_0()); 
            // InternalRest.g:7324:3: ( ruleEString )
            // InternalRest.g:7325:4: ruleEString
            {
             before(grammarAccess.getReGetAccess().getSuccAnswerAnswerEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getSuccAnswerAnswerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReGetAccess().getSuccAnswerAnswerCrossReference_3_0()); 

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
    // $ANTLR end "rule__ReGet__SuccAnswerAssignment_3"


    // $ANTLR start "rule__ReGet__RouteAssignment_5"
    // InternalRest.g:7336:1: rule__ReGet__RouteAssignment_5 : ( ruleRoute ) ;
    public final void rule__ReGet__RouteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7340:1: ( ( ruleRoute ) )
            // InternalRest.g:7341:2: ( ruleRoute )
            {
            // InternalRest.g:7341:2: ( ruleRoute )
            // InternalRest.g:7342:3: ruleRoute
            {
             before(grammarAccess.getReGetAccess().getRouteRouteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getRouteRouteParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ReGet__RouteAssignment_5"


    // $ANTLR start "rule__ReGet__OperationsAssignment_6_2"
    // InternalRest.g:7351:1: rule__ReGet__OperationsAssignment_6_2 : ( ruleOperation ) ;
    public final void rule__ReGet__OperationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7355:1: ( ( ruleOperation ) )
            // InternalRest.g:7356:2: ( ruleOperation )
            {
            // InternalRest.g:7356:2: ( ruleOperation )
            // InternalRest.g:7357:3: ruleOperation
            {
             before(grammarAccess.getReGetAccess().getOperationsOperationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getOperationsOperationParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__ReGet__OperationsAssignment_6_2"


    // $ANTLR start "rule__ReGet__OperationsAssignment_6_3_1"
    // InternalRest.g:7366:1: rule__ReGet__OperationsAssignment_6_3_1 : ( ruleOperation ) ;
    public final void rule__ReGet__OperationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7370:1: ( ( ruleOperation ) )
            // InternalRest.g:7371:2: ( ruleOperation )
            {
            // InternalRest.g:7371:2: ( ruleOperation )
            // InternalRest.g:7372:3: ruleOperation
            {
             before(grammarAccess.getReGetAccess().getOperationsOperationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getOperationsOperationParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__ReGet__OperationsAssignment_6_3_1"


    // $ANTLR start "rule__ReGet__ParametersAssignment_7_2"
    // InternalRest.g:7381:1: rule__ReGet__ParametersAssignment_7_2 : ( ruleParameter ) ;
    public final void rule__ReGet__ParametersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7385:1: ( ( ruleParameter ) )
            // InternalRest.g:7386:2: ( ruleParameter )
            {
            // InternalRest.g:7386:2: ( ruleParameter )
            // InternalRest.g:7387:3: ruleParameter
            {
             before(grammarAccess.getReGetAccess().getParametersParameterParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getParametersParameterParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__ReGet__ParametersAssignment_7_2"


    // $ANTLR start "rule__ReGet__ParametersAssignment_7_3_1"
    // InternalRest.g:7396:1: rule__ReGet__ParametersAssignment_7_3_1 : ( ruleParameter ) ;
    public final void rule__ReGet__ParametersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7400:1: ( ( ruleParameter ) )
            // InternalRest.g:7401:2: ( ruleParameter )
            {
            // InternalRest.g:7401:2: ( ruleParameter )
            // InternalRest.g:7402:3: ruleParameter
            {
             before(grammarAccess.getReGetAccess().getParametersParameterParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getParametersParameterParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__ReGet__ParametersAssignment_7_3_1"


    // $ANTLR start "rule__RePost__SuccAnswerAssignment_3"
    // InternalRest.g:7411:1: rule__RePost__SuccAnswerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__RePost__SuccAnswerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7415:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7416:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7416:2: ( ( ruleEString ) )
            // InternalRest.g:7417:3: ( ruleEString )
            {
             before(grammarAccess.getRePostAccess().getSuccAnswerAnswerCrossReference_3_0()); 
            // InternalRest.g:7418:3: ( ruleEString )
            // InternalRest.g:7419:4: ruleEString
            {
             before(grammarAccess.getRePostAccess().getSuccAnswerAnswerEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getSuccAnswerAnswerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRePostAccess().getSuccAnswerAnswerCrossReference_3_0()); 

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
    // $ANTLR end "rule__RePost__SuccAnswerAssignment_3"


    // $ANTLR start "rule__RePost__RouteAssignment_5"
    // InternalRest.g:7430:1: rule__RePost__RouteAssignment_5 : ( ruleRoute ) ;
    public final void rule__RePost__RouteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7434:1: ( ( ruleRoute ) )
            // InternalRest.g:7435:2: ( ruleRoute )
            {
            // InternalRest.g:7435:2: ( ruleRoute )
            // InternalRest.g:7436:3: ruleRoute
            {
             before(grammarAccess.getRePostAccess().getRouteRouteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getRouteRouteParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RePost__RouteAssignment_5"


    // $ANTLR start "rule__RePost__OperationsAssignment_6_2"
    // InternalRest.g:7445:1: rule__RePost__OperationsAssignment_6_2 : ( ruleOperation ) ;
    public final void rule__RePost__OperationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7449:1: ( ( ruleOperation ) )
            // InternalRest.g:7450:2: ( ruleOperation )
            {
            // InternalRest.g:7450:2: ( ruleOperation )
            // InternalRest.g:7451:3: ruleOperation
            {
             before(grammarAccess.getRePostAccess().getOperationsOperationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getOperationsOperationParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__RePost__OperationsAssignment_6_2"


    // $ANTLR start "rule__RePost__OperationsAssignment_6_3_1"
    // InternalRest.g:7460:1: rule__RePost__OperationsAssignment_6_3_1 : ( ruleOperation ) ;
    public final void rule__RePost__OperationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7464:1: ( ( ruleOperation ) )
            // InternalRest.g:7465:2: ( ruleOperation )
            {
            // InternalRest.g:7465:2: ( ruleOperation )
            // InternalRest.g:7466:3: ruleOperation
            {
             before(grammarAccess.getRePostAccess().getOperationsOperationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getOperationsOperationParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__RePost__OperationsAssignment_6_3_1"


    // $ANTLR start "rule__RePost__ParametersAssignment_7_2"
    // InternalRest.g:7475:1: rule__RePost__ParametersAssignment_7_2 : ( ruleParameter ) ;
    public final void rule__RePost__ParametersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7479:1: ( ( ruleParameter ) )
            // InternalRest.g:7480:2: ( ruleParameter )
            {
            // InternalRest.g:7480:2: ( ruleParameter )
            // InternalRest.g:7481:3: ruleParameter
            {
             before(grammarAccess.getRePostAccess().getParametersParameterParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getParametersParameterParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__RePost__ParametersAssignment_7_2"


    // $ANTLR start "rule__RePost__ParametersAssignment_7_3_1"
    // InternalRest.g:7490:1: rule__RePost__ParametersAssignment_7_3_1 : ( ruleParameter ) ;
    public final void rule__RePost__ParametersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7494:1: ( ( ruleParameter ) )
            // InternalRest.g:7495:2: ( ruleParameter )
            {
            // InternalRest.g:7495:2: ( ruleParameter )
            // InternalRest.g:7496:3: ruleParameter
            {
             before(grammarAccess.getRePostAccess().getParametersParameterParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getParametersParameterParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__RePost__ParametersAssignment_7_3_1"


    // $ANTLR start "rule__RePut__SuccAnswerAssignment_3"
    // InternalRest.g:7505:1: rule__RePut__SuccAnswerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__RePut__SuccAnswerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7509:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7510:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7510:2: ( ( ruleEString ) )
            // InternalRest.g:7511:3: ( ruleEString )
            {
             before(grammarAccess.getRePutAccess().getSuccAnswerAnswerCrossReference_3_0()); 
            // InternalRest.g:7512:3: ( ruleEString )
            // InternalRest.g:7513:4: ruleEString
            {
             before(grammarAccess.getRePutAccess().getSuccAnswerAnswerEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getSuccAnswerAnswerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRePutAccess().getSuccAnswerAnswerCrossReference_3_0()); 

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
    // $ANTLR end "rule__RePut__SuccAnswerAssignment_3"


    // $ANTLR start "rule__RePut__RouteAssignment_5"
    // InternalRest.g:7524:1: rule__RePut__RouteAssignment_5 : ( ruleRoute ) ;
    public final void rule__RePut__RouteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7528:1: ( ( ruleRoute ) )
            // InternalRest.g:7529:2: ( ruleRoute )
            {
            // InternalRest.g:7529:2: ( ruleRoute )
            // InternalRest.g:7530:3: ruleRoute
            {
             before(grammarAccess.getRePutAccess().getRouteRouteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getRouteRouteParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RePut__RouteAssignment_5"


    // $ANTLR start "rule__RePut__OperationsAssignment_6_2"
    // InternalRest.g:7539:1: rule__RePut__OperationsAssignment_6_2 : ( ruleOperation ) ;
    public final void rule__RePut__OperationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7543:1: ( ( ruleOperation ) )
            // InternalRest.g:7544:2: ( ruleOperation )
            {
            // InternalRest.g:7544:2: ( ruleOperation )
            // InternalRest.g:7545:3: ruleOperation
            {
             before(grammarAccess.getRePutAccess().getOperationsOperationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getOperationsOperationParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__RePut__OperationsAssignment_6_2"


    // $ANTLR start "rule__RePut__OperationsAssignment_6_3_1"
    // InternalRest.g:7554:1: rule__RePut__OperationsAssignment_6_3_1 : ( ruleOperation ) ;
    public final void rule__RePut__OperationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7558:1: ( ( ruleOperation ) )
            // InternalRest.g:7559:2: ( ruleOperation )
            {
            // InternalRest.g:7559:2: ( ruleOperation )
            // InternalRest.g:7560:3: ruleOperation
            {
             before(grammarAccess.getRePutAccess().getOperationsOperationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getOperationsOperationParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__RePut__OperationsAssignment_6_3_1"


    // $ANTLR start "rule__RePut__ParametersAssignment_7_2"
    // InternalRest.g:7569:1: rule__RePut__ParametersAssignment_7_2 : ( ruleParameter ) ;
    public final void rule__RePut__ParametersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7573:1: ( ( ruleParameter ) )
            // InternalRest.g:7574:2: ( ruleParameter )
            {
            // InternalRest.g:7574:2: ( ruleParameter )
            // InternalRest.g:7575:3: ruleParameter
            {
             before(grammarAccess.getRePutAccess().getParametersParameterParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getParametersParameterParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__RePut__ParametersAssignment_7_2"


    // $ANTLR start "rule__RePut__ParametersAssignment_7_3_1"
    // InternalRest.g:7584:1: rule__RePut__ParametersAssignment_7_3_1 : ( ruleParameter ) ;
    public final void rule__RePut__ParametersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7588:1: ( ( ruleParameter ) )
            // InternalRest.g:7589:2: ( ruleParameter )
            {
            // InternalRest.g:7589:2: ( ruleParameter )
            // InternalRest.g:7590:3: ruleParameter
            {
             before(grammarAccess.getRePutAccess().getParametersParameterParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getParametersParameterParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__RePut__ParametersAssignment_7_3_1"


    // $ANTLR start "rule__ReDelete__SuccAnswerAssignment_3"
    // InternalRest.g:7599:1: rule__ReDelete__SuccAnswerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ReDelete__SuccAnswerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7603:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7604:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7604:2: ( ( ruleEString ) )
            // InternalRest.g:7605:3: ( ruleEString )
            {
             before(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerCrossReference_3_0()); 
            // InternalRest.g:7606:3: ( ruleEString )
            // InternalRest.g:7607:4: ruleEString
            {
             before(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerCrossReference_3_0()); 

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
    // $ANTLR end "rule__ReDelete__SuccAnswerAssignment_3"


    // $ANTLR start "rule__ReDelete__RouteAssignment_5"
    // InternalRest.g:7618:1: rule__ReDelete__RouteAssignment_5 : ( ruleRoute ) ;
    public final void rule__ReDelete__RouteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7622:1: ( ( ruleRoute ) )
            // InternalRest.g:7623:2: ( ruleRoute )
            {
            // InternalRest.g:7623:2: ( ruleRoute )
            // InternalRest.g:7624:3: ruleRoute
            {
             before(grammarAccess.getReDeleteAccess().getRouteRouteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getRouteRouteParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ReDelete__RouteAssignment_5"


    // $ANTLR start "rule__ReDelete__OperationsAssignment_6_2"
    // InternalRest.g:7633:1: rule__ReDelete__OperationsAssignment_6_2 : ( ruleOperation ) ;
    public final void rule__ReDelete__OperationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7637:1: ( ( ruleOperation ) )
            // InternalRest.g:7638:2: ( ruleOperation )
            {
            // InternalRest.g:7638:2: ( ruleOperation )
            // InternalRest.g:7639:3: ruleOperation
            {
             before(grammarAccess.getReDeleteAccess().getOperationsOperationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getOperationsOperationParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__ReDelete__OperationsAssignment_6_2"


    // $ANTLR start "rule__ReDelete__OperationsAssignment_6_3_1"
    // InternalRest.g:7648:1: rule__ReDelete__OperationsAssignment_6_3_1 : ( ruleOperation ) ;
    public final void rule__ReDelete__OperationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7652:1: ( ( ruleOperation ) )
            // InternalRest.g:7653:2: ( ruleOperation )
            {
            // InternalRest.g:7653:2: ( ruleOperation )
            // InternalRest.g:7654:3: ruleOperation
            {
             before(grammarAccess.getReDeleteAccess().getOperationsOperationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getOperationsOperationParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__ReDelete__OperationsAssignment_6_3_1"


    // $ANTLR start "rule__ReDelete__ParametersAssignment_7_2"
    // InternalRest.g:7663:1: rule__ReDelete__ParametersAssignment_7_2 : ( ruleParameter ) ;
    public final void rule__ReDelete__ParametersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7667:1: ( ( ruleParameter ) )
            // InternalRest.g:7668:2: ( ruleParameter )
            {
            // InternalRest.g:7668:2: ( ruleParameter )
            // InternalRest.g:7669:3: ruleParameter
            {
             before(grammarAccess.getReDeleteAccess().getParametersParameterParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getParametersParameterParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__ReDelete__ParametersAssignment_7_2"


    // $ANTLR start "rule__ReDelete__ParametersAssignment_7_3_1"
    // InternalRest.g:7678:1: rule__ReDelete__ParametersAssignment_7_3_1 : ( ruleParameter ) ;
    public final void rule__ReDelete__ParametersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7682:1: ( ( ruleParameter ) )
            // InternalRest.g:7683:2: ( ruleParameter )
            {
            // InternalRest.g:7683:2: ( ruleParameter )
            // InternalRest.g:7684:3: ruleParameter
            {
             before(grammarAccess.getReDeleteAccess().getParametersParameterParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getParametersParameterParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__ReDelete__ParametersAssignment_7_3_1"


    // $ANTLR start "rule__Segment__ValueAssignment_3_1"
    // InternalRest.g:7693:1: rule__Segment__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Segment__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7697:1: ( ( ruleEString ) )
            // InternalRest.g:7698:2: ( ruleEString )
            {
            // InternalRest.g:7698:2: ( ruleEString )
            // InternalRest.g:7699:3: ruleEString
            {
             before(grammarAccess.getSegmentAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getValueEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Segment__ValueAssignment_3_1"


    // $ANTLR start "rule__OpCreate__IdAssignment_2_1"
    // InternalRest.g:7708:1: rule__OpCreate__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpCreate__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7712:1: ( ( ruleEString ) )
            // InternalRest.g:7713:2: ( ruleEString )
            {
            // InternalRest.g:7713:2: ( ruleEString )
            // InternalRest.g:7714:3: ruleEString
            {
             before(grammarAccess.getOpCreateAccess().getIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getIdEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__OpCreate__IdAssignment_2_1"


    // $ANTLR start "rule__OpCreate__FailedAnswerAssignment_4"
    // InternalRest.g:7723:1: rule__OpCreate__FailedAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__OpCreate__FailedAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7727:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7728:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7728:2: ( ( ruleEString ) )
            // InternalRest.g:7729:3: ( ruleEString )
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:7730:3: ( ruleEString )
            // InternalRest.g:7731:4: ruleEString
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerCrossReference_4_0()); 

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
    // $ANTLR end "rule__OpCreate__FailedAnswerAssignment_4"


    // $ANTLR start "rule__OpCreate__StructAssignment_6"
    // InternalRest.g:7742:1: rule__OpCreate__StructAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__OpCreate__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7746:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7747:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7747:2: ( ( ruleEString ) )
            // InternalRest.g:7748:3: ( ruleEString )
            {
             before(grammarAccess.getOpCreateAccess().getStructStructCrossReference_6_0()); 
            // InternalRest.g:7749:3: ( ruleEString )
            // InternalRest.g:7750:4: ruleEString
            {
             before(grammarAccess.getOpCreateAccess().getStructStructEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getStructStructEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getOpCreateAccess().getStructStructCrossReference_6_0()); 

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
    // $ANTLR end "rule__OpCreate__StructAssignment_6"


    // $ANTLR start "rule__OpCreate__FieldsetsAssignment_7_2"
    // InternalRest.g:7761:1: rule__OpCreate__FieldsetsAssignment_7_2 : ( ruleFieldSet ) ;
    public final void rule__OpCreate__FieldsetsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7765:1: ( ( ruleFieldSet ) )
            // InternalRest.g:7766:2: ( ruleFieldSet )
            {
            // InternalRest.g:7766:2: ( ruleFieldSet )
            // InternalRest.g:7767:3: ruleFieldSet
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetsFieldSetParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSet();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getFieldsetsFieldSetParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__OpCreate__FieldsetsAssignment_7_2"


    // $ANTLR start "rule__OpCreate__FieldsetsAssignment_7_3_1"
    // InternalRest.g:7776:1: rule__OpCreate__FieldsetsAssignment_7_3_1 : ( ruleFieldSet ) ;
    public final void rule__OpCreate__FieldsetsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7780:1: ( ( ruleFieldSet ) )
            // InternalRest.g:7781:2: ( ruleFieldSet )
            {
            // InternalRest.g:7781:2: ( ruleFieldSet )
            // InternalRest.g:7782:3: ruleFieldSet
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetsFieldSetParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSet();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getFieldsetsFieldSetParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__OpCreate__FieldsetsAssignment_7_3_1"


    // $ANTLR start "rule__OpRead__IdAssignment_2_1"
    // InternalRest.g:7791:1: rule__OpRead__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpRead__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7795:1: ( ( ruleEString ) )
            // InternalRest.g:7796:2: ( ruleEString )
            {
            // InternalRest.g:7796:2: ( ruleEString )
            // InternalRest.g:7797:3: ruleEString
            {
             before(grammarAccess.getOpReadAccess().getIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getIdEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__OpRead__IdAssignment_2_1"


    // $ANTLR start "rule__OpRead__FailedAnswerAssignment_4"
    // InternalRest.g:7806:1: rule__OpRead__FailedAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__OpRead__FailedAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7810:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7811:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7811:2: ( ( ruleEString ) )
            // InternalRest.g:7812:3: ( ruleEString )
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:7813:3: ( ruleEString )
            // InternalRest.g:7814:4: ruleEString
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerAnswerEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getFailedAnswerAnswerEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getOpReadAccess().getFailedAnswerAnswerCrossReference_4_0()); 

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
    // $ANTLR end "rule__OpRead__FailedAnswerAssignment_4"


    // $ANTLR start "rule__OpRead__StructAssignment_6"
    // InternalRest.g:7825:1: rule__OpRead__StructAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__OpRead__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7829:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7830:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7830:2: ( ( ruleEString ) )
            // InternalRest.g:7831:3: ( ruleEString )
            {
             before(grammarAccess.getOpReadAccess().getStructStructCrossReference_6_0()); 
            // InternalRest.g:7832:3: ( ruleEString )
            // InternalRest.g:7833:4: ruleEString
            {
             before(grammarAccess.getOpReadAccess().getStructStructEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getStructStructEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getOpReadAccess().getStructStructCrossReference_6_0()); 

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
    // $ANTLR end "rule__OpRead__StructAssignment_6"


    // $ANTLR start "rule__OpRead__FieldsAssignment_7_2"
    // InternalRest.g:7844:1: rule__OpRead__FieldsAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__OpRead__FieldsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7848:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7849:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7849:2: ( ( ruleEString ) )
            // InternalRest.g:7850:3: ( ruleEString )
            {
             before(grammarAccess.getOpReadAccess().getFieldsFieldCrossReference_7_2_0()); 
            // InternalRest.g:7851:3: ( ruleEString )
            // InternalRest.g:7852:4: ruleEString
            {
             before(grammarAccess.getOpReadAccess().getFieldsFieldEStringParserRuleCall_7_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getFieldsFieldEStringParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getOpReadAccess().getFieldsFieldCrossReference_7_2_0()); 

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
    // $ANTLR end "rule__OpRead__FieldsAssignment_7_2"


    // $ANTLR start "rule__OpRead__FieldsAssignment_7_3_1"
    // InternalRest.g:7863:1: rule__OpRead__FieldsAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__OpRead__FieldsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7867:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7868:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7868:2: ( ( ruleEString ) )
            // InternalRest.g:7869:3: ( ruleEString )
            {
             before(grammarAccess.getOpReadAccess().getFieldsFieldCrossReference_7_3_1_0()); 
            // InternalRest.g:7870:3: ( ruleEString )
            // InternalRest.g:7871:4: ruleEString
            {
             before(grammarAccess.getOpReadAccess().getFieldsFieldEStringParserRuleCall_7_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getFieldsFieldEStringParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getOpReadAccess().getFieldsFieldCrossReference_7_3_1_0()); 

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
    // $ANTLR end "rule__OpRead__FieldsAssignment_7_3_1"


    // $ANTLR start "rule__OpUpdate__IdAssignment_2_1"
    // InternalRest.g:7882:1: rule__OpUpdate__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpUpdate__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7886:1: ( ( ruleEString ) )
            // InternalRest.g:7887:2: ( ruleEString )
            {
            // InternalRest.g:7887:2: ( ruleEString )
            // InternalRest.g:7888:3: ruleEString
            {
             before(grammarAccess.getOpUpdateAccess().getIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getIdEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__OpUpdate__IdAssignment_2_1"


    // $ANTLR start "rule__OpUpdate__FailedAnswerAssignment_4"
    // InternalRest.g:7897:1: rule__OpUpdate__FailedAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__OpUpdate__FailedAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7901:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7902:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7902:2: ( ( ruleEString ) )
            // InternalRest.g:7903:3: ( ruleEString )
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:7904:3: ( ruleEString )
            // InternalRest.g:7905:4: ruleEString
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerCrossReference_4_0()); 

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
    // $ANTLR end "rule__OpUpdate__FailedAnswerAssignment_4"


    // $ANTLR start "rule__OpUpdate__StructAssignment_6"
    // InternalRest.g:7916:1: rule__OpUpdate__StructAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__OpUpdate__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7920:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7921:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7921:2: ( ( ruleEString ) )
            // InternalRest.g:7922:3: ( ruleEString )
            {
             before(grammarAccess.getOpUpdateAccess().getStructStructCrossReference_6_0()); 
            // InternalRest.g:7923:3: ( ruleEString )
            // InternalRest.g:7924:4: ruleEString
            {
             before(grammarAccess.getOpUpdateAccess().getStructStructEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getStructStructEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getOpUpdateAccess().getStructStructCrossReference_6_0()); 

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
    // $ANTLR end "rule__OpUpdate__StructAssignment_6"


    // $ANTLR start "rule__OpUpdate__FieldsetsAssignment_7_2"
    // InternalRest.g:7935:1: rule__OpUpdate__FieldsetsAssignment_7_2 : ( ruleFieldSet ) ;
    public final void rule__OpUpdate__FieldsetsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7939:1: ( ( ruleFieldSet ) )
            // InternalRest.g:7940:2: ( ruleFieldSet )
            {
            // InternalRest.g:7940:2: ( ruleFieldSet )
            // InternalRest.g:7941:3: ruleFieldSet
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetsFieldSetParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSet();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getFieldsetsFieldSetParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__OpUpdate__FieldsetsAssignment_7_2"


    // $ANTLR start "rule__OpUpdate__FieldsetsAssignment_7_3_1"
    // InternalRest.g:7950:1: rule__OpUpdate__FieldsetsAssignment_7_3_1 : ( ruleFieldSet ) ;
    public final void rule__OpUpdate__FieldsetsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7954:1: ( ( ruleFieldSet ) )
            // InternalRest.g:7955:2: ( ruleFieldSet )
            {
            // InternalRest.g:7955:2: ( ruleFieldSet )
            // InternalRest.g:7956:3: ruleFieldSet
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetsFieldSetParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSet();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getFieldsetsFieldSetParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__OpUpdate__FieldsetsAssignment_7_3_1"


    // $ANTLR start "rule__OpDelete__IdAssignment_2_1"
    // InternalRest.g:7965:1: rule__OpDelete__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpDelete__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7969:1: ( ( ruleEString ) )
            // InternalRest.g:7970:2: ( ruleEString )
            {
            // InternalRest.g:7970:2: ( ruleEString )
            // InternalRest.g:7971:3: ruleEString
            {
             before(grammarAccess.getOpDeleteAccess().getIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpDeleteAccess().getIdEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__OpDelete__IdAssignment_2_1"


    // $ANTLR start "rule__OpDelete__FailedAnswerAssignment_4"
    // InternalRest.g:7980:1: rule__OpDelete__FailedAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__OpDelete__FailedAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7984:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7985:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7985:2: ( ( ruleEString ) )
            // InternalRest.g:7986:3: ( ruleEString )
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:7987:3: ( ruleEString )
            // InternalRest.g:7988:4: ruleEString
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerCrossReference_4_0()); 

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
    // $ANTLR end "rule__OpDelete__FailedAnswerAssignment_4"


    // $ANTLR start "rule__OpDelete__StructAssignment_6"
    // InternalRest.g:7999:1: rule__OpDelete__StructAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__OpDelete__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8003:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:8004:2: ( ( ruleEString ) )
            {
            // InternalRest.g:8004:2: ( ( ruleEString ) )
            // InternalRest.g:8005:3: ( ruleEString )
            {
             before(grammarAccess.getOpDeleteAccess().getStructStructCrossReference_6_0()); 
            // InternalRest.g:8006:3: ( ruleEString )
            // InternalRest.g:8007:4: ruleEString
            {
             before(grammarAccess.getOpDeleteAccess().getStructStructEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpDeleteAccess().getStructStructEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getOpDeleteAccess().getStructStructCrossReference_6_0()); 

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
    // $ANTLR end "rule__OpDelete__StructAssignment_6"


    // $ANTLR start "rule__FieldSet__NameAssignment_2"
    // InternalRest.g:8018:1: rule__FieldSet__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FieldSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8022:1: ( ( ruleEString ) )
            // InternalRest.g:8023:2: ( ruleEString )
            {
            // InternalRest.g:8023:2: ( ruleEString )
            // InternalRest.g:8024:3: ruleEString
            {
             before(grammarAccess.getFieldSetAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldSetAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FieldSet__NameAssignment_2"


    // $ANTLR start "rule__FieldSet__ValueAssignment_4_1"
    // InternalRest.g:8033:1: rule__FieldSet__ValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__FieldSet__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8037:1: ( ( ruleEString ) )
            // InternalRest.g:8038:2: ( ruleEString )
            {
            // InternalRest.g:8038:2: ( ruleEString )
            // InternalRest.g:8039:3: ruleEString
            {
             before(grammarAccess.getFieldSetAccess().getValueEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldSetAccess().getValueEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__FieldSet__ValueAssignment_4_1"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalRest.g:8048:1: rule__Field__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8052:1: ( ( ruleEString ) )
            // InternalRest.g:8053:2: ( ruleEString )
            {
            // InternalRest.g:8053:2: ( ruleEString )
            // InternalRest.g:8054:3: ruleEString
            {
             before(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000384000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000321000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000008000L});

}