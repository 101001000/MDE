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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RestSystem'", "'{'", "'}'", "'request'", "','", "'struct'", "'operation'", "'answer'", "'Struct'", "'fields'", "'Answer'", "'status'", "'return'", "'Route'", "'segment'", "'ReGet'", "'succAnswer'", "'route'", "'ops'", "'('", "')'", "'data'", "'RePost'", "'RePut'", "'ReDelete'", "'Segment'", "'value'", "'Parameter'", "'Attachments'", "'Random'", "'OpCreate'", "'failedAnswer'", "'id'", "'fieldset'", "'OpRead'", "'field'", "'OpUpdate'", "'OpDelete'", "'FieldSet'", "'expr'", "'Field'", "'-'"
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


    // $ANTLR start "entryRuleData"
    // InternalRest.g:128:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalRest.g:129:1: ( ruleData EOF )
            // InternalRest.g:130:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalRest.g:137:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:141:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalRest.g:142:2: ( ( rule__Data__Alternatives ) )
            {
            // InternalRest.g:142:2: ( ( rule__Data__Alternatives ) )
            // InternalRest.g:143:3: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalRest.g:144:3: ( rule__Data__Alternatives )
            // InternalRest.g:144:4: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Data__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleStruct"
    // InternalRest.g:153:1: entryRuleStruct : ruleStruct EOF ;
    public final void entryRuleStruct() throws RecognitionException {
        try {
            // InternalRest.g:154:1: ( ruleStruct EOF )
            // InternalRest.g:155:1: ruleStruct EOF
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
    // InternalRest.g:162:1: ruleStruct : ( ( rule__Struct__Group__0 ) ) ;
    public final void ruleStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:166:2: ( ( ( rule__Struct__Group__0 ) ) )
            // InternalRest.g:167:2: ( ( rule__Struct__Group__0 ) )
            {
            // InternalRest.g:167:2: ( ( rule__Struct__Group__0 ) )
            // InternalRest.g:168:3: ( rule__Struct__Group__0 )
            {
             before(grammarAccess.getStructAccess().getGroup()); 
            // InternalRest.g:169:3: ( rule__Struct__Group__0 )
            // InternalRest.g:169:4: rule__Struct__Group__0
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
    // InternalRest.g:178:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // InternalRest.g:179:1: ( ruleAnswer EOF )
            // InternalRest.g:180:1: ruleAnswer EOF
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
    // InternalRest.g:187:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:191:2: ( ( ( rule__Answer__Group__0 ) ) )
            // InternalRest.g:192:2: ( ( rule__Answer__Group__0 ) )
            {
            // InternalRest.g:192:2: ( ( rule__Answer__Group__0 ) )
            // InternalRest.g:193:3: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // InternalRest.g:194:3: ( rule__Answer__Group__0 )
            // InternalRest.g:194:4: rule__Answer__Group__0
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
    // InternalRest.g:203:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // InternalRest.g:204:1: ( ruleRoute EOF )
            // InternalRest.g:205:1: ruleRoute EOF
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
    // InternalRest.g:212:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:216:2: ( ( ( rule__Route__Group__0 ) ) )
            // InternalRest.g:217:2: ( ( rule__Route__Group__0 ) )
            {
            // InternalRest.g:217:2: ( ( rule__Route__Group__0 ) )
            // InternalRest.g:218:3: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // InternalRest.g:219:3: ( rule__Route__Group__0 )
            // InternalRest.g:219:4: rule__Route__Group__0
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


    // $ANTLR start "entryRuleParameter"
    // InternalRest.g:378:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalRest.g:379:1: ( ruleParameter EOF )
            // InternalRest.g:380:1: ruleParameter EOF
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
    // InternalRest.g:387:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:391:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalRest.g:392:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalRest.g:392:2: ( ( rule__Parameter__Group__0 ) )
            // InternalRest.g:393:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalRest.g:394:3: ( rule__Parameter__Group__0 )
            // InternalRest.g:394:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleAttachments"
    // InternalRest.g:403:1: entryRuleAttachments : ruleAttachments EOF ;
    public final void entryRuleAttachments() throws RecognitionException {
        try {
            // InternalRest.g:404:1: ( ruleAttachments EOF )
            // InternalRest.g:405:1: ruleAttachments EOF
            {
             before(grammarAccess.getAttachmentsRule()); 
            pushFollow(FOLLOW_1);
            ruleAttachments();

            state._fsp--;

             after(grammarAccess.getAttachmentsRule()); 
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
    // $ANTLR end "entryRuleAttachments"


    // $ANTLR start "ruleAttachments"
    // InternalRest.g:412:1: ruleAttachments : ( ( rule__Attachments__Group__0 ) ) ;
    public final void ruleAttachments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:416:2: ( ( ( rule__Attachments__Group__0 ) ) )
            // InternalRest.g:417:2: ( ( rule__Attachments__Group__0 ) )
            {
            // InternalRest.g:417:2: ( ( rule__Attachments__Group__0 ) )
            // InternalRest.g:418:3: ( rule__Attachments__Group__0 )
            {
             before(grammarAccess.getAttachmentsAccess().getGroup()); 
            // InternalRest.g:419:3: ( rule__Attachments__Group__0 )
            // InternalRest.g:419:4: rule__Attachments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attachments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttachmentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttachments"


    // $ANTLR start "entryRuleRandom"
    // InternalRest.g:428:1: entryRuleRandom : ruleRandom EOF ;
    public final void entryRuleRandom() throws RecognitionException {
        try {
            // InternalRest.g:429:1: ( ruleRandom EOF )
            // InternalRest.g:430:1: ruleRandom EOF
            {
             before(grammarAccess.getRandomRule()); 
            pushFollow(FOLLOW_1);
            ruleRandom();

            state._fsp--;

             after(grammarAccess.getRandomRule()); 
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
    // $ANTLR end "entryRuleRandom"


    // $ANTLR start "ruleRandom"
    // InternalRest.g:437:1: ruleRandom : ( ( rule__Random__Group__0 ) ) ;
    public final void ruleRandom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:441:2: ( ( ( rule__Random__Group__0 ) ) )
            // InternalRest.g:442:2: ( ( rule__Random__Group__0 ) )
            {
            // InternalRest.g:442:2: ( ( rule__Random__Group__0 ) )
            // InternalRest.g:443:3: ( rule__Random__Group__0 )
            {
             before(grammarAccess.getRandomAccess().getGroup()); 
            // InternalRest.g:444:3: ( rule__Random__Group__0 )
            // InternalRest.g:444:4: rule__Random__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Random__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRandomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRandom"


    // $ANTLR start "entryRuleOpCreate"
    // InternalRest.g:453:1: entryRuleOpCreate : ruleOpCreate EOF ;
    public final void entryRuleOpCreate() throws RecognitionException {
        try {
            // InternalRest.g:454:1: ( ruleOpCreate EOF )
            // InternalRest.g:455:1: ruleOpCreate EOF
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
    // InternalRest.g:462:1: ruleOpCreate : ( ( rule__OpCreate__Group__0 ) ) ;
    public final void ruleOpCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:466:2: ( ( ( rule__OpCreate__Group__0 ) ) )
            // InternalRest.g:467:2: ( ( rule__OpCreate__Group__0 ) )
            {
            // InternalRest.g:467:2: ( ( rule__OpCreate__Group__0 ) )
            // InternalRest.g:468:3: ( rule__OpCreate__Group__0 )
            {
             before(grammarAccess.getOpCreateAccess().getGroup()); 
            // InternalRest.g:469:3: ( rule__OpCreate__Group__0 )
            // InternalRest.g:469:4: rule__OpCreate__Group__0
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
    // InternalRest.g:478:1: entryRuleOpRead : ruleOpRead EOF ;
    public final void entryRuleOpRead() throws RecognitionException {
        try {
            // InternalRest.g:479:1: ( ruleOpRead EOF )
            // InternalRest.g:480:1: ruleOpRead EOF
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
    // InternalRest.g:487:1: ruleOpRead : ( ( rule__OpRead__Group__0 ) ) ;
    public final void ruleOpRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:491:2: ( ( ( rule__OpRead__Group__0 ) ) )
            // InternalRest.g:492:2: ( ( rule__OpRead__Group__0 ) )
            {
            // InternalRest.g:492:2: ( ( rule__OpRead__Group__0 ) )
            // InternalRest.g:493:3: ( rule__OpRead__Group__0 )
            {
             before(grammarAccess.getOpReadAccess().getGroup()); 
            // InternalRest.g:494:3: ( rule__OpRead__Group__0 )
            // InternalRest.g:494:4: rule__OpRead__Group__0
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
    // InternalRest.g:503:1: entryRuleOpUpdate : ruleOpUpdate EOF ;
    public final void entryRuleOpUpdate() throws RecognitionException {
        try {
            // InternalRest.g:504:1: ( ruleOpUpdate EOF )
            // InternalRest.g:505:1: ruleOpUpdate EOF
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
    // InternalRest.g:512:1: ruleOpUpdate : ( ( rule__OpUpdate__Group__0 ) ) ;
    public final void ruleOpUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:516:2: ( ( ( rule__OpUpdate__Group__0 ) ) )
            // InternalRest.g:517:2: ( ( rule__OpUpdate__Group__0 ) )
            {
            // InternalRest.g:517:2: ( ( rule__OpUpdate__Group__0 ) )
            // InternalRest.g:518:3: ( rule__OpUpdate__Group__0 )
            {
             before(grammarAccess.getOpUpdateAccess().getGroup()); 
            // InternalRest.g:519:3: ( rule__OpUpdate__Group__0 )
            // InternalRest.g:519:4: rule__OpUpdate__Group__0
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
    // InternalRest.g:528:1: entryRuleOpDelete : ruleOpDelete EOF ;
    public final void entryRuleOpDelete() throws RecognitionException {
        try {
            // InternalRest.g:529:1: ( ruleOpDelete EOF )
            // InternalRest.g:530:1: ruleOpDelete EOF
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
    // InternalRest.g:537:1: ruleOpDelete : ( ( rule__OpDelete__Group__0 ) ) ;
    public final void ruleOpDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:541:2: ( ( ( rule__OpDelete__Group__0 ) ) )
            // InternalRest.g:542:2: ( ( rule__OpDelete__Group__0 ) )
            {
            // InternalRest.g:542:2: ( ( rule__OpDelete__Group__0 ) )
            // InternalRest.g:543:3: ( rule__OpDelete__Group__0 )
            {
             before(grammarAccess.getOpDeleteAccess().getGroup()); 
            // InternalRest.g:544:3: ( rule__OpDelete__Group__0 )
            // InternalRest.g:544:4: rule__OpDelete__Group__0
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
    // InternalRest.g:553:1: entryRuleFieldSet : ruleFieldSet EOF ;
    public final void entryRuleFieldSet() throws RecognitionException {
        try {
            // InternalRest.g:554:1: ( ruleFieldSet EOF )
            // InternalRest.g:555:1: ruleFieldSet EOF
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
    // InternalRest.g:562:1: ruleFieldSet : ( ( rule__FieldSet__Group__0 ) ) ;
    public final void ruleFieldSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:566:2: ( ( ( rule__FieldSet__Group__0 ) ) )
            // InternalRest.g:567:2: ( ( rule__FieldSet__Group__0 ) )
            {
            // InternalRest.g:567:2: ( ( rule__FieldSet__Group__0 ) )
            // InternalRest.g:568:3: ( rule__FieldSet__Group__0 )
            {
             before(grammarAccess.getFieldSetAccess().getGroup()); 
            // InternalRest.g:569:3: ( rule__FieldSet__Group__0 )
            // InternalRest.g:569:4: rule__FieldSet__Group__0
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
    // InternalRest.g:578:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalRest.g:579:1: ( ruleField EOF )
            // InternalRest.g:580:1: ruleField EOF
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
    // InternalRest.g:587:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:591:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalRest.g:592:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalRest.g:592:2: ( ( rule__Field__Group__0 ) )
            // InternalRest.g:593:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalRest.g:594:3: ( rule__Field__Group__0 )
            // InternalRest.g:594:4: rule__Field__Group__0
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
    // InternalRest.g:603:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRest.g:604:1: ( ruleEInt EOF )
            // InternalRest.g:605:1: ruleEInt EOF
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
    // InternalRest.g:612:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:616:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalRest.g:617:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalRest.g:617:2: ( ( rule__EInt__Group__0 ) )
            // InternalRest.g:618:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalRest.g:619:3: ( rule__EInt__Group__0 )
            // InternalRest.g:619:4: rule__EInt__Group__0
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
    // InternalRest.g:627:1: rule__Request__Alternatives : ( ( ruleReGet ) | ( ruleRePost ) | ( ruleRePut ) | ( ruleReDelete ) );
    public final void rule__Request__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:631:1: ( ( ruleReGet ) | ( ruleRePost ) | ( ruleRePut ) | ( ruleReDelete ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            case 35:
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
                    // InternalRest.g:632:2: ( ruleReGet )
                    {
                    // InternalRest.g:632:2: ( ruleReGet )
                    // InternalRest.g:633:3: ruleReGet
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
                    // InternalRest.g:638:2: ( ruleRePost )
                    {
                    // InternalRest.g:638:2: ( ruleRePost )
                    // InternalRest.g:639:3: ruleRePost
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
                    // InternalRest.g:644:2: ( ruleRePut )
                    {
                    // InternalRest.g:644:2: ( ruleRePut )
                    // InternalRest.g:645:3: ruleRePut
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
                    // InternalRest.g:650:2: ( ruleReDelete )
                    {
                    // InternalRest.g:650:2: ( ruleReDelete )
                    // InternalRest.g:651:3: ruleReDelete
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
    // InternalRest.g:660:1: rule__Operation__Alternatives : ( ( ruleOpCreate ) | ( ruleOpRead ) | ( ruleOpUpdate ) | ( ruleOpDelete ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:664:1: ( ( ruleOpCreate ) | ( ruleOpRead ) | ( ruleOpUpdate ) | ( ruleOpDelete ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt2=1;
                }
                break;
            case 45:
                {
                alt2=2;
                }
                break;
            case 47:
                {
                alt2=3;
                }
                break;
            case 48:
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
                    // InternalRest.g:665:2: ( ruleOpCreate )
                    {
                    // InternalRest.g:665:2: ( ruleOpCreate )
                    // InternalRest.g:666:3: ruleOpCreate
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
                    // InternalRest.g:671:2: ( ruleOpRead )
                    {
                    // InternalRest.g:671:2: ( ruleOpRead )
                    // InternalRest.g:672:3: ruleOpRead
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
                    // InternalRest.g:677:2: ( ruleOpUpdate )
                    {
                    // InternalRest.g:677:2: ( ruleOpUpdate )
                    // InternalRest.g:678:3: ruleOpUpdate
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
                    // InternalRest.g:683:2: ( ruleOpDelete )
                    {
                    // InternalRest.g:683:2: ( ruleOpDelete )
                    // InternalRest.g:684:3: ruleOpDelete
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


    // $ANTLR start "rule__Data__Alternatives"
    // InternalRest.g:693:1: rule__Data__Alternatives : ( ( ruleParameter ) | ( ruleAttachments ) | ( ruleRandom ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:697:1: ( ( ruleParameter ) | ( ruleAttachments ) | ( ruleRandom ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt3=1;
                }
                break;
            case 39:
                {
                alt3=2;
                }
                break;
            case 40:
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
                    // InternalRest.g:698:2: ( ruleParameter )
                    {
                    // InternalRest.g:698:2: ( ruleParameter )
                    // InternalRest.g:699:3: ruleParameter
                    {
                     before(grammarAccess.getDataAccess().getParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:704:2: ( ruleAttachments )
                    {
                    // InternalRest.g:704:2: ( ruleAttachments )
                    // InternalRest.g:705:3: ruleAttachments
                    {
                     before(grammarAccess.getDataAccess().getAttachmentsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttachments();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getAttachmentsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRest.g:710:2: ( ruleRandom )
                    {
                    // InternalRest.g:710:2: ( ruleRandom )
                    // InternalRest.g:711:3: ruleRandom
                    {
                     before(grammarAccess.getDataAccess().getRandomParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRandom();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getRandomParserRuleCall_2()); 

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
    // $ANTLR end "rule__Data__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRest.g:720:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:724:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRest.g:725:2: ( RULE_STRING )
                    {
                    // InternalRest.g:725:2: ( RULE_STRING )
                    // InternalRest.g:726:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:731:2: ( RULE_ID )
                    {
                    // InternalRest.g:731:2: ( RULE_ID )
                    // InternalRest.g:732:3: RULE_ID
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
    // InternalRest.g:741:1: rule__RestSystem__Group__0 : rule__RestSystem__Group__0__Impl rule__RestSystem__Group__1 ;
    public final void rule__RestSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:745:1: ( rule__RestSystem__Group__0__Impl rule__RestSystem__Group__1 )
            // InternalRest.g:746:2: rule__RestSystem__Group__0__Impl rule__RestSystem__Group__1
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
    // InternalRest.g:753:1: rule__RestSystem__Group__0__Impl : ( () ) ;
    public final void rule__RestSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:757:1: ( ( () ) )
            // InternalRest.g:758:1: ( () )
            {
            // InternalRest.g:758:1: ( () )
            // InternalRest.g:759:2: ()
            {
             before(grammarAccess.getRestSystemAccess().getRestSystemAction_0()); 
            // InternalRest.g:760:2: ()
            // InternalRest.g:760:3: 
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
    // InternalRest.g:768:1: rule__RestSystem__Group__1 : rule__RestSystem__Group__1__Impl rule__RestSystem__Group__2 ;
    public final void rule__RestSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:772:1: ( rule__RestSystem__Group__1__Impl rule__RestSystem__Group__2 )
            // InternalRest.g:773:2: rule__RestSystem__Group__1__Impl rule__RestSystem__Group__2
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
    // InternalRest.g:780:1: rule__RestSystem__Group__1__Impl : ( 'RestSystem' ) ;
    public final void rule__RestSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:784:1: ( ( 'RestSystem' ) )
            // InternalRest.g:785:1: ( 'RestSystem' )
            {
            // InternalRest.g:785:1: ( 'RestSystem' )
            // InternalRest.g:786:2: 'RestSystem'
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
    // InternalRest.g:795:1: rule__RestSystem__Group__2 : rule__RestSystem__Group__2__Impl rule__RestSystem__Group__3 ;
    public final void rule__RestSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:799:1: ( rule__RestSystem__Group__2__Impl rule__RestSystem__Group__3 )
            // InternalRest.g:800:2: rule__RestSystem__Group__2__Impl rule__RestSystem__Group__3
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
    // InternalRest.g:807:1: rule__RestSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:811:1: ( ( '{' ) )
            // InternalRest.g:812:1: ( '{' )
            {
            // InternalRest.g:812:1: ( '{' )
            // InternalRest.g:813:2: '{'
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
    // InternalRest.g:822:1: rule__RestSystem__Group__3 : rule__RestSystem__Group__3__Impl rule__RestSystem__Group__4 ;
    public final void rule__RestSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:826:1: ( rule__RestSystem__Group__3__Impl rule__RestSystem__Group__4 )
            // InternalRest.g:827:2: rule__RestSystem__Group__3__Impl rule__RestSystem__Group__4
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
    // InternalRest.g:834:1: rule__RestSystem__Group__3__Impl : ( ( rule__RestSystem__Group_3__0 )? ) ;
    public final void rule__RestSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:838:1: ( ( ( rule__RestSystem__Group_3__0 )? ) )
            // InternalRest.g:839:1: ( ( rule__RestSystem__Group_3__0 )? )
            {
            // InternalRest.g:839:1: ( ( rule__RestSystem__Group_3__0 )? )
            // InternalRest.g:840:2: ( rule__RestSystem__Group_3__0 )?
            {
             before(grammarAccess.getRestSystemAccess().getGroup_3()); 
            // InternalRest.g:841:2: ( rule__RestSystem__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRest.g:841:3: rule__RestSystem__Group_3__0
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
    // InternalRest.g:849:1: rule__RestSystem__Group__4 : rule__RestSystem__Group__4__Impl rule__RestSystem__Group__5 ;
    public final void rule__RestSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:853:1: ( rule__RestSystem__Group__4__Impl rule__RestSystem__Group__5 )
            // InternalRest.g:854:2: rule__RestSystem__Group__4__Impl rule__RestSystem__Group__5
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
    // InternalRest.g:861:1: rule__RestSystem__Group__4__Impl : ( ( rule__RestSystem__Group_4__0 )? ) ;
    public final void rule__RestSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:865:1: ( ( ( rule__RestSystem__Group_4__0 )? ) )
            // InternalRest.g:866:1: ( ( rule__RestSystem__Group_4__0 )? )
            {
            // InternalRest.g:866:1: ( ( rule__RestSystem__Group_4__0 )? )
            // InternalRest.g:867:2: ( rule__RestSystem__Group_4__0 )?
            {
             before(grammarAccess.getRestSystemAccess().getGroup_4()); 
            // InternalRest.g:868:2: ( rule__RestSystem__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRest.g:868:3: rule__RestSystem__Group_4__0
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
    // InternalRest.g:876:1: rule__RestSystem__Group__5 : rule__RestSystem__Group__5__Impl rule__RestSystem__Group__6 ;
    public final void rule__RestSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:880:1: ( rule__RestSystem__Group__5__Impl rule__RestSystem__Group__6 )
            // InternalRest.g:881:2: rule__RestSystem__Group__5__Impl rule__RestSystem__Group__6
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
    // InternalRest.g:888:1: rule__RestSystem__Group__5__Impl : ( ( rule__RestSystem__Group_5__0 )? ) ;
    public final void rule__RestSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:892:1: ( ( ( rule__RestSystem__Group_5__0 )? ) )
            // InternalRest.g:893:1: ( ( rule__RestSystem__Group_5__0 )? )
            {
            // InternalRest.g:893:1: ( ( rule__RestSystem__Group_5__0 )? )
            // InternalRest.g:894:2: ( rule__RestSystem__Group_5__0 )?
            {
             before(grammarAccess.getRestSystemAccess().getGroup_5()); 
            // InternalRest.g:895:2: ( rule__RestSystem__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRest.g:895:3: rule__RestSystem__Group_5__0
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
    // InternalRest.g:903:1: rule__RestSystem__Group__6 : rule__RestSystem__Group__6__Impl rule__RestSystem__Group__7 ;
    public final void rule__RestSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:907:1: ( rule__RestSystem__Group__6__Impl rule__RestSystem__Group__7 )
            // InternalRest.g:908:2: rule__RestSystem__Group__6__Impl rule__RestSystem__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__RestSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__7();

            state._fsp--;


            }

        }
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
    // InternalRest.g:915:1: rule__RestSystem__Group__6__Impl : ( ( rule__RestSystem__Group_6__0 )? ) ;
    public final void rule__RestSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:919:1: ( ( ( rule__RestSystem__Group_6__0 )? ) )
            // InternalRest.g:920:1: ( ( rule__RestSystem__Group_6__0 )? )
            {
            // InternalRest.g:920:1: ( ( rule__RestSystem__Group_6__0 )? )
            // InternalRest.g:921:2: ( rule__RestSystem__Group_6__0 )?
            {
             before(grammarAccess.getRestSystemAccess().getGroup_6()); 
            // InternalRest.g:922:2: ( rule__RestSystem__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRest.g:922:3: rule__RestSystem__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestSystem__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestSystemAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RestSystem__Group__7"
    // InternalRest.g:930:1: rule__RestSystem__Group__7 : rule__RestSystem__Group__7__Impl ;
    public final void rule__RestSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:934:1: ( rule__RestSystem__Group__7__Impl )
            // InternalRest.g:935:2: rule__RestSystem__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group__7"


    // $ANTLR start "rule__RestSystem__Group__7__Impl"
    // InternalRest.g:941:1: rule__RestSystem__Group__7__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:945:1: ( ( '}' ) )
            // InternalRest.g:946:1: ( '}' )
            {
            // InternalRest.g:946:1: ( '}' )
            // InternalRest.g:947:2: '}'
            {
             before(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group__7__Impl"


    // $ANTLR start "rule__RestSystem__Group_3__0"
    // InternalRest.g:957:1: rule__RestSystem__Group_3__0 : rule__RestSystem__Group_3__0__Impl rule__RestSystem__Group_3__1 ;
    public final void rule__RestSystem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:961:1: ( rule__RestSystem__Group_3__0__Impl rule__RestSystem__Group_3__1 )
            // InternalRest.g:962:2: rule__RestSystem__Group_3__0__Impl rule__RestSystem__Group_3__1
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
    // InternalRest.g:969:1: rule__RestSystem__Group_3__0__Impl : ( 'request' ) ;
    public final void rule__RestSystem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:973:1: ( ( 'request' ) )
            // InternalRest.g:974:1: ( 'request' )
            {
            // InternalRest.g:974:1: ( 'request' )
            // InternalRest.g:975:2: 'request'
            {
             before(grammarAccess.getRestSystemAccess().getRequestKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRequestKeyword_3_0()); 

            }


            }

        }
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
    // InternalRest.g:984:1: rule__RestSystem__Group_3__1 : rule__RestSystem__Group_3__1__Impl rule__RestSystem__Group_3__2 ;
    public final void rule__RestSystem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:988:1: ( rule__RestSystem__Group_3__1__Impl rule__RestSystem__Group_3__2 )
            // InternalRest.g:989:2: rule__RestSystem__Group_3__1__Impl rule__RestSystem__Group_3__2
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
    // InternalRest.g:996:1: rule__RestSystem__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1000:1: ( ( '{' ) )
            // InternalRest.g:1001:1: ( '{' )
            {
            // InternalRest.g:1001:1: ( '{' )
            // InternalRest.g:1002:2: '{'
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
    // InternalRest.g:1011:1: rule__RestSystem__Group_3__2 : rule__RestSystem__Group_3__2__Impl rule__RestSystem__Group_3__3 ;
    public final void rule__RestSystem__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1015:1: ( rule__RestSystem__Group_3__2__Impl rule__RestSystem__Group_3__3 )
            // InternalRest.g:1016:2: rule__RestSystem__Group_3__2__Impl rule__RestSystem__Group_3__3
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
    // InternalRest.g:1023:1: rule__RestSystem__Group_3__2__Impl : ( ( rule__RestSystem__RequestAssignment_3_2 ) ) ;
    public final void rule__RestSystem__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1027:1: ( ( ( rule__RestSystem__RequestAssignment_3_2 ) ) )
            // InternalRest.g:1028:1: ( ( rule__RestSystem__RequestAssignment_3_2 ) )
            {
            // InternalRest.g:1028:1: ( ( rule__RestSystem__RequestAssignment_3_2 ) )
            // InternalRest.g:1029:2: ( rule__RestSystem__RequestAssignment_3_2 )
            {
             before(grammarAccess.getRestSystemAccess().getRequestAssignment_3_2()); 
            // InternalRest.g:1030:2: ( rule__RestSystem__RequestAssignment_3_2 )
            // InternalRest.g:1030:3: rule__RestSystem__RequestAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__RequestAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getRequestAssignment_3_2()); 

            }


            }

        }
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
    // InternalRest.g:1038:1: rule__RestSystem__Group_3__3 : rule__RestSystem__Group_3__3__Impl rule__RestSystem__Group_3__4 ;
    public final void rule__RestSystem__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1042:1: ( rule__RestSystem__Group_3__3__Impl rule__RestSystem__Group_3__4 )
            // InternalRest.g:1043:2: rule__RestSystem__Group_3__3__Impl rule__RestSystem__Group_3__4
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
    // InternalRest.g:1050:1: rule__RestSystem__Group_3__3__Impl : ( ( rule__RestSystem__Group_3_3__0 )* ) ;
    public final void rule__RestSystem__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1054:1: ( ( ( rule__RestSystem__Group_3_3__0 )* ) )
            // InternalRest.g:1055:1: ( ( rule__RestSystem__Group_3_3__0 )* )
            {
            // InternalRest.g:1055:1: ( ( rule__RestSystem__Group_3_3__0 )* )
            // InternalRest.g:1056:2: ( rule__RestSystem__Group_3_3__0 )*
            {
             before(grammarAccess.getRestSystemAccess().getGroup_3_3()); 
            // InternalRest.g:1057:2: ( rule__RestSystem__Group_3_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRest.g:1057:3: rule__RestSystem__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RestSystem__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRest.g:1065:1: rule__RestSystem__Group_3__4 : rule__RestSystem__Group_3__4__Impl ;
    public final void rule__RestSystem__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1069:1: ( rule__RestSystem__Group_3__4__Impl )
            // InternalRest.g:1070:2: rule__RestSystem__Group_3__4__Impl
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
    // InternalRest.g:1076:1: rule__RestSystem__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1080:1: ( ( '}' ) )
            // InternalRest.g:1081:1: ( '}' )
            {
            // InternalRest.g:1081:1: ( '}' )
            // InternalRest.g:1082:2: '}'
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
    // InternalRest.g:1092:1: rule__RestSystem__Group_3_3__0 : rule__RestSystem__Group_3_3__0__Impl rule__RestSystem__Group_3_3__1 ;
    public final void rule__RestSystem__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1096:1: ( rule__RestSystem__Group_3_3__0__Impl rule__RestSystem__Group_3_3__1 )
            // InternalRest.g:1097:2: rule__RestSystem__Group_3_3__0__Impl rule__RestSystem__Group_3_3__1
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
    // InternalRest.g:1104:1: rule__RestSystem__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RestSystem__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1108:1: ( ( ',' ) )
            // InternalRest.g:1109:1: ( ',' )
            {
            // InternalRest.g:1109:1: ( ',' )
            // InternalRest.g:1110:2: ','
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
    // InternalRest.g:1119:1: rule__RestSystem__Group_3_3__1 : rule__RestSystem__Group_3_3__1__Impl ;
    public final void rule__RestSystem__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1123:1: ( rule__RestSystem__Group_3_3__1__Impl )
            // InternalRest.g:1124:2: rule__RestSystem__Group_3_3__1__Impl
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
    // InternalRest.g:1130:1: rule__RestSystem__Group_3_3__1__Impl : ( ( rule__RestSystem__RequestAssignment_3_3_1 ) ) ;
    public final void rule__RestSystem__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1134:1: ( ( ( rule__RestSystem__RequestAssignment_3_3_1 ) ) )
            // InternalRest.g:1135:1: ( ( rule__RestSystem__RequestAssignment_3_3_1 ) )
            {
            // InternalRest.g:1135:1: ( ( rule__RestSystem__RequestAssignment_3_3_1 ) )
            // InternalRest.g:1136:2: ( rule__RestSystem__RequestAssignment_3_3_1 )
            {
             before(grammarAccess.getRestSystemAccess().getRequestAssignment_3_3_1()); 
            // InternalRest.g:1137:2: ( rule__RestSystem__RequestAssignment_3_3_1 )
            // InternalRest.g:1137:3: rule__RestSystem__RequestAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__RequestAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getRequestAssignment_3_3_1()); 

            }


            }

        }
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
    // InternalRest.g:1146:1: rule__RestSystem__Group_4__0 : rule__RestSystem__Group_4__0__Impl rule__RestSystem__Group_4__1 ;
    public final void rule__RestSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1150:1: ( rule__RestSystem__Group_4__0__Impl rule__RestSystem__Group_4__1 )
            // InternalRest.g:1151:2: rule__RestSystem__Group_4__0__Impl rule__RestSystem__Group_4__1
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
    // InternalRest.g:1158:1: rule__RestSystem__Group_4__0__Impl : ( 'struct' ) ;
    public final void rule__RestSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1162:1: ( ( 'struct' ) )
            // InternalRest.g:1163:1: ( 'struct' )
            {
            // InternalRest.g:1163:1: ( 'struct' )
            // InternalRest.g:1164:2: 'struct'
            {
             before(grammarAccess.getRestSystemAccess().getStructKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getStructKeyword_4_0()); 

            }


            }

        }
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
    // InternalRest.g:1173:1: rule__RestSystem__Group_4__1 : rule__RestSystem__Group_4__1__Impl rule__RestSystem__Group_4__2 ;
    public final void rule__RestSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1177:1: ( rule__RestSystem__Group_4__1__Impl rule__RestSystem__Group_4__2 )
            // InternalRest.g:1178:2: rule__RestSystem__Group_4__1__Impl rule__RestSystem__Group_4__2
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
    // InternalRest.g:1185:1: rule__RestSystem__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1189:1: ( ( '{' ) )
            // InternalRest.g:1190:1: ( '{' )
            {
            // InternalRest.g:1190:1: ( '{' )
            // InternalRest.g:1191:2: '{'
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
    // InternalRest.g:1200:1: rule__RestSystem__Group_4__2 : rule__RestSystem__Group_4__2__Impl rule__RestSystem__Group_4__3 ;
    public final void rule__RestSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1204:1: ( rule__RestSystem__Group_4__2__Impl rule__RestSystem__Group_4__3 )
            // InternalRest.g:1205:2: rule__RestSystem__Group_4__2__Impl rule__RestSystem__Group_4__3
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
    // InternalRest.g:1212:1: rule__RestSystem__Group_4__2__Impl : ( ( rule__RestSystem__StructAssignment_4_2 ) ) ;
    public final void rule__RestSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1216:1: ( ( ( rule__RestSystem__StructAssignment_4_2 ) ) )
            // InternalRest.g:1217:1: ( ( rule__RestSystem__StructAssignment_4_2 ) )
            {
            // InternalRest.g:1217:1: ( ( rule__RestSystem__StructAssignment_4_2 ) )
            // InternalRest.g:1218:2: ( rule__RestSystem__StructAssignment_4_2 )
            {
             before(grammarAccess.getRestSystemAccess().getStructAssignment_4_2()); 
            // InternalRest.g:1219:2: ( rule__RestSystem__StructAssignment_4_2 )
            // InternalRest.g:1219:3: rule__RestSystem__StructAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__StructAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getStructAssignment_4_2()); 

            }


            }

        }
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
    // InternalRest.g:1227:1: rule__RestSystem__Group_4__3 : rule__RestSystem__Group_4__3__Impl rule__RestSystem__Group_4__4 ;
    public final void rule__RestSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1231:1: ( rule__RestSystem__Group_4__3__Impl rule__RestSystem__Group_4__4 )
            // InternalRest.g:1232:2: rule__RestSystem__Group_4__3__Impl rule__RestSystem__Group_4__4
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
    // InternalRest.g:1239:1: rule__RestSystem__Group_4__3__Impl : ( ( rule__RestSystem__Group_4_3__0 )* ) ;
    public final void rule__RestSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1243:1: ( ( ( rule__RestSystem__Group_4_3__0 )* ) )
            // InternalRest.g:1244:1: ( ( rule__RestSystem__Group_4_3__0 )* )
            {
            // InternalRest.g:1244:1: ( ( rule__RestSystem__Group_4_3__0 )* )
            // InternalRest.g:1245:2: ( rule__RestSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getRestSystemAccess().getGroup_4_3()); 
            // InternalRest.g:1246:2: ( rule__RestSystem__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRest.g:1246:3: rule__RestSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RestSystem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalRest.g:1254:1: rule__RestSystem__Group_4__4 : rule__RestSystem__Group_4__4__Impl ;
    public final void rule__RestSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1258:1: ( rule__RestSystem__Group_4__4__Impl )
            // InternalRest.g:1259:2: rule__RestSystem__Group_4__4__Impl
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
    // InternalRest.g:1265:1: rule__RestSystem__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1269:1: ( ( '}' ) )
            // InternalRest.g:1270:1: ( '}' )
            {
            // InternalRest.g:1270:1: ( '}' )
            // InternalRest.g:1271:2: '}'
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
    // InternalRest.g:1281:1: rule__RestSystem__Group_4_3__0 : rule__RestSystem__Group_4_3__0__Impl rule__RestSystem__Group_4_3__1 ;
    public final void rule__RestSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1285:1: ( rule__RestSystem__Group_4_3__0__Impl rule__RestSystem__Group_4_3__1 )
            // InternalRest.g:1286:2: rule__RestSystem__Group_4_3__0__Impl rule__RestSystem__Group_4_3__1
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
    // InternalRest.g:1293:1: rule__RestSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RestSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1297:1: ( ( ',' ) )
            // InternalRest.g:1298:1: ( ',' )
            {
            // InternalRest.g:1298:1: ( ',' )
            // InternalRest.g:1299:2: ','
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
    // InternalRest.g:1308:1: rule__RestSystem__Group_4_3__1 : rule__RestSystem__Group_4_3__1__Impl ;
    public final void rule__RestSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1312:1: ( rule__RestSystem__Group_4_3__1__Impl )
            // InternalRest.g:1313:2: rule__RestSystem__Group_4_3__1__Impl
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
    // InternalRest.g:1319:1: rule__RestSystem__Group_4_3__1__Impl : ( ( rule__RestSystem__StructAssignment_4_3_1 ) ) ;
    public final void rule__RestSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1323:1: ( ( ( rule__RestSystem__StructAssignment_4_3_1 ) ) )
            // InternalRest.g:1324:1: ( ( rule__RestSystem__StructAssignment_4_3_1 ) )
            {
            // InternalRest.g:1324:1: ( ( rule__RestSystem__StructAssignment_4_3_1 ) )
            // InternalRest.g:1325:2: ( rule__RestSystem__StructAssignment_4_3_1 )
            {
             before(grammarAccess.getRestSystemAccess().getStructAssignment_4_3_1()); 
            // InternalRest.g:1326:2: ( rule__RestSystem__StructAssignment_4_3_1 )
            // InternalRest.g:1326:3: rule__RestSystem__StructAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__StructAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getStructAssignment_4_3_1()); 

            }


            }

        }
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
    // InternalRest.g:1335:1: rule__RestSystem__Group_5__0 : rule__RestSystem__Group_5__0__Impl rule__RestSystem__Group_5__1 ;
    public final void rule__RestSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1339:1: ( rule__RestSystem__Group_5__0__Impl rule__RestSystem__Group_5__1 )
            // InternalRest.g:1340:2: rule__RestSystem__Group_5__0__Impl rule__RestSystem__Group_5__1
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
    // InternalRest.g:1347:1: rule__RestSystem__Group_5__0__Impl : ( 'operation' ) ;
    public final void rule__RestSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1351:1: ( ( 'operation' ) )
            // InternalRest.g:1352:1: ( 'operation' )
            {
            // InternalRest.g:1352:1: ( 'operation' )
            // InternalRest.g:1353:2: 'operation'
            {
             before(grammarAccess.getRestSystemAccess().getOperationKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getOperationKeyword_5_0()); 

            }


            }

        }
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
    // InternalRest.g:1362:1: rule__RestSystem__Group_5__1 : rule__RestSystem__Group_5__1__Impl rule__RestSystem__Group_5__2 ;
    public final void rule__RestSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1366:1: ( rule__RestSystem__Group_5__1__Impl rule__RestSystem__Group_5__2 )
            // InternalRest.g:1367:2: rule__RestSystem__Group_5__1__Impl rule__RestSystem__Group_5__2
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
    // InternalRest.g:1374:1: rule__RestSystem__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1378:1: ( ( '{' ) )
            // InternalRest.g:1379:1: ( '{' )
            {
            // InternalRest.g:1379:1: ( '{' )
            // InternalRest.g:1380:2: '{'
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
    // InternalRest.g:1389:1: rule__RestSystem__Group_5__2 : rule__RestSystem__Group_5__2__Impl rule__RestSystem__Group_5__3 ;
    public final void rule__RestSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1393:1: ( rule__RestSystem__Group_5__2__Impl rule__RestSystem__Group_5__3 )
            // InternalRest.g:1394:2: rule__RestSystem__Group_5__2__Impl rule__RestSystem__Group_5__3
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
    // InternalRest.g:1401:1: rule__RestSystem__Group_5__2__Impl : ( ( rule__RestSystem__OperationAssignment_5_2 ) ) ;
    public final void rule__RestSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1405:1: ( ( ( rule__RestSystem__OperationAssignment_5_2 ) ) )
            // InternalRest.g:1406:1: ( ( rule__RestSystem__OperationAssignment_5_2 ) )
            {
            // InternalRest.g:1406:1: ( ( rule__RestSystem__OperationAssignment_5_2 ) )
            // InternalRest.g:1407:2: ( rule__RestSystem__OperationAssignment_5_2 )
            {
             before(grammarAccess.getRestSystemAccess().getOperationAssignment_5_2()); 
            // InternalRest.g:1408:2: ( rule__RestSystem__OperationAssignment_5_2 )
            // InternalRest.g:1408:3: rule__RestSystem__OperationAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__OperationAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getOperationAssignment_5_2()); 

            }


            }

        }
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
    // InternalRest.g:1416:1: rule__RestSystem__Group_5__3 : rule__RestSystem__Group_5__3__Impl rule__RestSystem__Group_5__4 ;
    public final void rule__RestSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1420:1: ( rule__RestSystem__Group_5__3__Impl rule__RestSystem__Group_5__4 )
            // InternalRest.g:1421:2: rule__RestSystem__Group_5__3__Impl rule__RestSystem__Group_5__4
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
    // InternalRest.g:1428:1: rule__RestSystem__Group_5__3__Impl : ( ( rule__RestSystem__Group_5_3__0 )* ) ;
    public final void rule__RestSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1432:1: ( ( ( rule__RestSystem__Group_5_3__0 )* ) )
            // InternalRest.g:1433:1: ( ( rule__RestSystem__Group_5_3__0 )* )
            {
            // InternalRest.g:1433:1: ( ( rule__RestSystem__Group_5_3__0 )* )
            // InternalRest.g:1434:2: ( rule__RestSystem__Group_5_3__0 )*
            {
             before(grammarAccess.getRestSystemAccess().getGroup_5_3()); 
            // InternalRest.g:1435:2: ( rule__RestSystem__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRest.g:1435:3: rule__RestSystem__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RestSystem__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRest.g:1443:1: rule__RestSystem__Group_5__4 : rule__RestSystem__Group_5__4__Impl ;
    public final void rule__RestSystem__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1447:1: ( rule__RestSystem__Group_5__4__Impl )
            // InternalRest.g:1448:2: rule__RestSystem__Group_5__4__Impl
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
    // InternalRest.g:1454:1: rule__RestSystem__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1458:1: ( ( '}' ) )
            // InternalRest.g:1459:1: ( '}' )
            {
            // InternalRest.g:1459:1: ( '}' )
            // InternalRest.g:1460:2: '}'
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
    // InternalRest.g:1470:1: rule__RestSystem__Group_5_3__0 : rule__RestSystem__Group_5_3__0__Impl rule__RestSystem__Group_5_3__1 ;
    public final void rule__RestSystem__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1474:1: ( rule__RestSystem__Group_5_3__0__Impl rule__RestSystem__Group_5_3__1 )
            // InternalRest.g:1475:2: rule__RestSystem__Group_5_3__0__Impl rule__RestSystem__Group_5_3__1
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
    // InternalRest.g:1482:1: rule__RestSystem__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RestSystem__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1486:1: ( ( ',' ) )
            // InternalRest.g:1487:1: ( ',' )
            {
            // InternalRest.g:1487:1: ( ',' )
            // InternalRest.g:1488:2: ','
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
    // InternalRest.g:1497:1: rule__RestSystem__Group_5_3__1 : rule__RestSystem__Group_5_3__1__Impl ;
    public final void rule__RestSystem__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1501:1: ( rule__RestSystem__Group_5_3__1__Impl )
            // InternalRest.g:1502:2: rule__RestSystem__Group_5_3__1__Impl
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
    // InternalRest.g:1508:1: rule__RestSystem__Group_5_3__1__Impl : ( ( rule__RestSystem__OperationAssignment_5_3_1 ) ) ;
    public final void rule__RestSystem__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1512:1: ( ( ( rule__RestSystem__OperationAssignment_5_3_1 ) ) )
            // InternalRest.g:1513:1: ( ( rule__RestSystem__OperationAssignment_5_3_1 ) )
            {
            // InternalRest.g:1513:1: ( ( rule__RestSystem__OperationAssignment_5_3_1 ) )
            // InternalRest.g:1514:2: ( rule__RestSystem__OperationAssignment_5_3_1 )
            {
             before(grammarAccess.getRestSystemAccess().getOperationAssignment_5_3_1()); 
            // InternalRest.g:1515:2: ( rule__RestSystem__OperationAssignment_5_3_1 )
            // InternalRest.g:1515:3: rule__RestSystem__OperationAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__OperationAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getOperationAssignment_5_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RestSystem__Group_6__0"
    // InternalRest.g:1524:1: rule__RestSystem__Group_6__0 : rule__RestSystem__Group_6__0__Impl rule__RestSystem__Group_6__1 ;
    public final void rule__RestSystem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1528:1: ( rule__RestSystem__Group_6__0__Impl rule__RestSystem__Group_6__1 )
            // InternalRest.g:1529:2: rule__RestSystem__Group_6__0__Impl rule__RestSystem__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RestSystem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__0"


    // $ANTLR start "rule__RestSystem__Group_6__0__Impl"
    // InternalRest.g:1536:1: rule__RestSystem__Group_6__0__Impl : ( 'answer' ) ;
    public final void rule__RestSystem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1540:1: ( ( 'answer' ) )
            // InternalRest.g:1541:1: ( 'answer' )
            {
            // InternalRest.g:1541:1: ( 'answer' )
            // InternalRest.g:1542:2: 'answer'
            {
             before(grammarAccess.getRestSystemAccess().getAnswerKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getAnswerKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__0__Impl"


    // $ANTLR start "rule__RestSystem__Group_6__1"
    // InternalRest.g:1551:1: rule__RestSystem__Group_6__1 : rule__RestSystem__Group_6__1__Impl rule__RestSystem__Group_6__2 ;
    public final void rule__RestSystem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1555:1: ( rule__RestSystem__Group_6__1__Impl rule__RestSystem__Group_6__2 )
            // InternalRest.g:1556:2: rule__RestSystem__Group_6__1__Impl rule__RestSystem__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__RestSystem__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__1"


    // $ANTLR start "rule__RestSystem__Group_6__1__Impl"
    // InternalRest.g:1563:1: rule__RestSystem__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1567:1: ( ( '{' ) )
            // InternalRest.g:1568:1: ( '{' )
            {
            // InternalRest.g:1568:1: ( '{' )
            // InternalRest.g:1569:2: '{'
            {
             before(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__1__Impl"


    // $ANTLR start "rule__RestSystem__Group_6__2"
    // InternalRest.g:1578:1: rule__RestSystem__Group_6__2 : rule__RestSystem__Group_6__2__Impl rule__RestSystem__Group_6__3 ;
    public final void rule__RestSystem__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1582:1: ( rule__RestSystem__Group_6__2__Impl rule__RestSystem__Group_6__3 )
            // InternalRest.g:1583:2: rule__RestSystem__Group_6__2__Impl rule__RestSystem__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__RestSystem__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__2"


    // $ANTLR start "rule__RestSystem__Group_6__2__Impl"
    // InternalRest.g:1590:1: rule__RestSystem__Group_6__2__Impl : ( ( rule__RestSystem__AnswerAssignment_6_2 ) ) ;
    public final void rule__RestSystem__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1594:1: ( ( ( rule__RestSystem__AnswerAssignment_6_2 ) ) )
            // InternalRest.g:1595:1: ( ( rule__RestSystem__AnswerAssignment_6_2 ) )
            {
            // InternalRest.g:1595:1: ( ( rule__RestSystem__AnswerAssignment_6_2 ) )
            // InternalRest.g:1596:2: ( rule__RestSystem__AnswerAssignment_6_2 )
            {
             before(grammarAccess.getRestSystemAccess().getAnswerAssignment_6_2()); 
            // InternalRest.g:1597:2: ( rule__RestSystem__AnswerAssignment_6_2 )
            // InternalRest.g:1597:3: rule__RestSystem__AnswerAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__AnswerAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getAnswerAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__2__Impl"


    // $ANTLR start "rule__RestSystem__Group_6__3"
    // InternalRest.g:1605:1: rule__RestSystem__Group_6__3 : rule__RestSystem__Group_6__3__Impl rule__RestSystem__Group_6__4 ;
    public final void rule__RestSystem__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1609:1: ( rule__RestSystem__Group_6__3__Impl rule__RestSystem__Group_6__4 )
            // InternalRest.g:1610:2: rule__RestSystem__Group_6__3__Impl rule__RestSystem__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__RestSystem__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__3"


    // $ANTLR start "rule__RestSystem__Group_6__3__Impl"
    // InternalRest.g:1617:1: rule__RestSystem__Group_6__3__Impl : ( ( rule__RestSystem__Group_6_3__0 )* ) ;
    public final void rule__RestSystem__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1621:1: ( ( ( rule__RestSystem__Group_6_3__0 )* ) )
            // InternalRest.g:1622:1: ( ( rule__RestSystem__Group_6_3__0 )* )
            {
            // InternalRest.g:1622:1: ( ( rule__RestSystem__Group_6_3__0 )* )
            // InternalRest.g:1623:2: ( rule__RestSystem__Group_6_3__0 )*
            {
             before(grammarAccess.getRestSystemAccess().getGroup_6_3()); 
            // InternalRest.g:1624:2: ( rule__RestSystem__Group_6_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRest.g:1624:3: rule__RestSystem__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RestSystem__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRestSystemAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__3__Impl"


    // $ANTLR start "rule__RestSystem__Group_6__4"
    // InternalRest.g:1632:1: rule__RestSystem__Group_6__4 : rule__RestSystem__Group_6__4__Impl ;
    public final void rule__RestSystem__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1636:1: ( rule__RestSystem__Group_6__4__Impl )
            // InternalRest.g:1637:2: rule__RestSystem__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__4"


    // $ANTLR start "rule__RestSystem__Group_6__4__Impl"
    // InternalRest.g:1643:1: rule__RestSystem__Group_6__4__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1647:1: ( ( '}' ) )
            // InternalRest.g:1648:1: ( '}' )
            {
            // InternalRest.g:1648:1: ( '}' )
            // InternalRest.g:1649:2: '}'
            {
             before(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6__4__Impl"


    // $ANTLR start "rule__RestSystem__Group_6_3__0"
    // InternalRest.g:1659:1: rule__RestSystem__Group_6_3__0 : rule__RestSystem__Group_6_3__0__Impl rule__RestSystem__Group_6_3__1 ;
    public final void rule__RestSystem__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1663:1: ( rule__RestSystem__Group_6_3__0__Impl rule__RestSystem__Group_6_3__1 )
            // InternalRest.g:1664:2: rule__RestSystem__Group_6_3__0__Impl rule__RestSystem__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__RestSystem__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6_3__0"


    // $ANTLR start "rule__RestSystem__Group_6_3__0__Impl"
    // InternalRest.g:1671:1: rule__RestSystem__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RestSystem__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1675:1: ( ( ',' ) )
            // InternalRest.g:1676:1: ( ',' )
            {
            // InternalRest.g:1676:1: ( ',' )
            // InternalRest.g:1677:2: ','
            {
             before(grammarAccess.getRestSystemAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6_3__0__Impl"


    // $ANTLR start "rule__RestSystem__Group_6_3__1"
    // InternalRest.g:1686:1: rule__RestSystem__Group_6_3__1 : rule__RestSystem__Group_6_3__1__Impl ;
    public final void rule__RestSystem__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1690:1: ( rule__RestSystem__Group_6_3__1__Impl )
            // InternalRest.g:1691:2: rule__RestSystem__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6_3__1"


    // $ANTLR start "rule__RestSystem__Group_6_3__1__Impl"
    // InternalRest.g:1697:1: rule__RestSystem__Group_6_3__1__Impl : ( ( rule__RestSystem__AnswerAssignment_6_3_1 ) ) ;
    public final void rule__RestSystem__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1701:1: ( ( ( rule__RestSystem__AnswerAssignment_6_3_1 ) ) )
            // InternalRest.g:1702:1: ( ( rule__RestSystem__AnswerAssignment_6_3_1 ) )
            {
            // InternalRest.g:1702:1: ( ( rule__RestSystem__AnswerAssignment_6_3_1 ) )
            // InternalRest.g:1703:2: ( rule__RestSystem__AnswerAssignment_6_3_1 )
            {
             before(grammarAccess.getRestSystemAccess().getAnswerAssignment_6_3_1()); 
            // InternalRest.g:1704:2: ( rule__RestSystem__AnswerAssignment_6_3_1 )
            // InternalRest.g:1704:3: rule__RestSystem__AnswerAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__AnswerAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRestSystemAccess().getAnswerAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__Group_6_3__1__Impl"


    // $ANTLR start "rule__Struct__Group__0"
    // InternalRest.g:1713:1: rule__Struct__Group__0 : rule__Struct__Group__0__Impl rule__Struct__Group__1 ;
    public final void rule__Struct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1717:1: ( rule__Struct__Group__0__Impl rule__Struct__Group__1 )
            // InternalRest.g:1718:2: rule__Struct__Group__0__Impl rule__Struct__Group__1
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
    // InternalRest.g:1725:1: rule__Struct__Group__0__Impl : ( () ) ;
    public final void rule__Struct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1729:1: ( ( () ) )
            // InternalRest.g:1730:1: ( () )
            {
            // InternalRest.g:1730:1: ( () )
            // InternalRest.g:1731:2: ()
            {
             before(grammarAccess.getStructAccess().getStructAction_0()); 
            // InternalRest.g:1732:2: ()
            // InternalRest.g:1732:3: 
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
    // InternalRest.g:1740:1: rule__Struct__Group__1 : rule__Struct__Group__1__Impl rule__Struct__Group__2 ;
    public final void rule__Struct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1744:1: ( rule__Struct__Group__1__Impl rule__Struct__Group__2 )
            // InternalRest.g:1745:2: rule__Struct__Group__1__Impl rule__Struct__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRest.g:1752:1: rule__Struct__Group__1__Impl : ( 'Struct' ) ;
    public final void rule__Struct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1756:1: ( ( 'Struct' ) )
            // InternalRest.g:1757:1: ( 'Struct' )
            {
            // InternalRest.g:1757:1: ( 'Struct' )
            // InternalRest.g:1758:2: 'Struct'
            {
             before(grammarAccess.getStructAccess().getStructKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRest.g:1767:1: rule__Struct__Group__2 : rule__Struct__Group__2__Impl rule__Struct__Group__3 ;
    public final void rule__Struct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1771:1: ( rule__Struct__Group__2__Impl rule__Struct__Group__3 )
            // InternalRest.g:1772:2: rule__Struct__Group__2__Impl rule__Struct__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalRest.g:1779:1: rule__Struct__Group__2__Impl : ( '{' ) ;
    public final void rule__Struct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1783:1: ( ( '{' ) )
            // InternalRest.g:1784:1: ( '{' )
            {
            // InternalRest.g:1784:1: ( '{' )
            // InternalRest.g:1785:2: '{'
            {
             before(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRest.g:1794:1: rule__Struct__Group__3 : rule__Struct__Group__3__Impl rule__Struct__Group__4 ;
    public final void rule__Struct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1798:1: ( rule__Struct__Group__3__Impl rule__Struct__Group__4 )
            // InternalRest.g:1799:2: rule__Struct__Group__3__Impl rule__Struct__Group__4
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
    // InternalRest.g:1806:1: rule__Struct__Group__3__Impl : ( ( rule__Struct__Group_3__0 )? ) ;
    public final void rule__Struct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1810:1: ( ( ( rule__Struct__Group_3__0 )? ) )
            // InternalRest.g:1811:1: ( ( rule__Struct__Group_3__0 )? )
            {
            // InternalRest.g:1811:1: ( ( rule__Struct__Group_3__0 )? )
            // InternalRest.g:1812:2: ( rule__Struct__Group_3__0 )?
            {
             before(grammarAccess.getStructAccess().getGroup_3()); 
            // InternalRest.g:1813:2: ( rule__Struct__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRest.g:1813:3: rule__Struct__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Struct__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalRest.g:1821:1: rule__Struct__Group__4 : rule__Struct__Group__4__Impl ;
    public final void rule__Struct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1825:1: ( rule__Struct__Group__4__Impl )
            // InternalRest.g:1826:2: rule__Struct__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Struct__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalRest.g:1832:1: rule__Struct__Group__4__Impl : ( '}' ) ;
    public final void rule__Struct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1836:1: ( ( '}' ) )
            // InternalRest.g:1837:1: ( '}' )
            {
            // InternalRest.g:1837:1: ( '}' )
            // InternalRest.g:1838:2: '}'
            {
             before(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Struct__Group_3__0"
    // InternalRest.g:1848:1: rule__Struct__Group_3__0 : rule__Struct__Group_3__0__Impl rule__Struct__Group_3__1 ;
    public final void rule__Struct__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1852:1: ( rule__Struct__Group_3__0__Impl rule__Struct__Group_3__1 )
            // InternalRest.g:1853:2: rule__Struct__Group_3__0__Impl rule__Struct__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Struct__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group_3__0"


    // $ANTLR start "rule__Struct__Group_3__0__Impl"
    // InternalRest.g:1860:1: rule__Struct__Group_3__0__Impl : ( 'fields' ) ;
    public final void rule__Struct__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1864:1: ( ( 'fields' ) )
            // InternalRest.g:1865:1: ( 'fields' )
            {
            // InternalRest.g:1865:1: ( 'fields' )
            // InternalRest.g:1866:2: 'fields'
            {
             before(grammarAccess.getStructAccess().getFieldsKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStructAccess().getFieldsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group_3__0__Impl"


    // $ANTLR start "rule__Struct__Group_3__1"
    // InternalRest.g:1875:1: rule__Struct__Group_3__1 : rule__Struct__Group_3__1__Impl ;
    public final void rule__Struct__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1879:1: ( rule__Struct__Group_3__1__Impl )
            // InternalRest.g:1880:2: rule__Struct__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Struct__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group_3__1"


    // $ANTLR start "rule__Struct__Group_3__1__Impl"
    // InternalRest.g:1886:1: rule__Struct__Group_3__1__Impl : ( ( rule__Struct__FieldsAssignment_3_1 ) ) ;
    public final void rule__Struct__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1890:1: ( ( ( rule__Struct__FieldsAssignment_3_1 ) ) )
            // InternalRest.g:1891:1: ( ( rule__Struct__FieldsAssignment_3_1 ) )
            {
            // InternalRest.g:1891:1: ( ( rule__Struct__FieldsAssignment_3_1 ) )
            // InternalRest.g:1892:2: ( rule__Struct__FieldsAssignment_3_1 )
            {
             before(grammarAccess.getStructAccess().getFieldsAssignment_3_1()); 
            // InternalRest.g:1893:2: ( rule__Struct__FieldsAssignment_3_1 )
            // InternalRest.g:1893:3: rule__Struct__FieldsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Struct__FieldsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getFieldsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group_3__1__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // InternalRest.g:1902:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1906:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // InternalRest.g:1907:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
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
    // InternalRest.g:1914:1: rule__Answer__Group__0__Impl : ( () ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1918:1: ( ( () ) )
            // InternalRest.g:1919:1: ( () )
            {
            // InternalRest.g:1919:1: ( () )
            // InternalRest.g:1920:2: ()
            {
             before(grammarAccess.getAnswerAccess().getAnswerAction_0()); 
            // InternalRest.g:1921:2: ()
            // InternalRest.g:1921:3: 
            {
            }

             after(grammarAccess.getAnswerAccess().getAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0__Impl"


    // $ANTLR start "rule__Answer__Group__1"
    // InternalRest.g:1929:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1933:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // InternalRest.g:1934:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
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
    // InternalRest.g:1941:1: rule__Answer__Group__1__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1945:1: ( ( 'Answer' ) )
            // InternalRest.g:1946:1: ( 'Answer' )
            {
            // InternalRest.g:1946:1: ( 'Answer' )
            // InternalRest.g:1947:2: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getAnswerKeyword_1()); 

            }


            }

        }
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
    // InternalRest.g:1956:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1960:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // InternalRest.g:1961:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
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
    // InternalRest.g:1968:1: rule__Answer__Group__2__Impl : ( '{' ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1972:1: ( ( '{' ) )
            // InternalRest.g:1973:1: ( '{' )
            {
            // InternalRest.g:1973:1: ( '{' )
            // InternalRest.g:1974:2: '{'
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
    // InternalRest.g:1983:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl rule__Answer__Group__4 ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1987:1: ( rule__Answer__Group__3__Impl rule__Answer__Group__4 )
            // InternalRest.g:1988:2: rule__Answer__Group__3__Impl rule__Answer__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:1995:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__Group_3__0 )? ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1999:1: ( ( ( rule__Answer__Group_3__0 )? ) )
            // InternalRest.g:2000:1: ( ( rule__Answer__Group_3__0 )? )
            {
            // InternalRest.g:2000:1: ( ( rule__Answer__Group_3__0 )? )
            // InternalRest.g:2001:2: ( rule__Answer__Group_3__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_3()); 
            // InternalRest.g:2002:2: ( rule__Answer__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRest.g:2002:3: rule__Answer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Answer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalRest.g:2010:1: rule__Answer__Group__4 : rule__Answer__Group__4__Impl rule__Answer__Group__5 ;
    public final void rule__Answer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2014:1: ( rule__Answer__Group__4__Impl rule__Answer__Group__5 )
            // InternalRest.g:2015:2: rule__Answer__Group__4__Impl rule__Answer__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:2022:1: rule__Answer__Group__4__Impl : ( ( rule__Answer__Group_4__0 )? ) ;
    public final void rule__Answer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2026:1: ( ( ( rule__Answer__Group_4__0 )? ) )
            // InternalRest.g:2027:1: ( ( rule__Answer__Group_4__0 )? )
            {
            // InternalRest.g:2027:1: ( ( rule__Answer__Group_4__0 )? )
            // InternalRest.g:2028:2: ( rule__Answer__Group_4__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_4()); 
            // InternalRest.g:2029:2: ( rule__Answer__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRest.g:2029:3: rule__Answer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Answer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRest.g:2037:1: rule__Answer__Group__5 : rule__Answer__Group__5__Impl ;
    public final void rule__Answer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2041:1: ( rule__Answer__Group__5__Impl )
            // InternalRest.g:2042:2: rule__Answer__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Answer__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalRest.g:2048:1: rule__Answer__Group__5__Impl : ( '}' ) ;
    public final void rule__Answer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2052:1: ( ( '}' ) )
            // InternalRest.g:2053:1: ( '}' )
            {
            // InternalRest.g:2053:1: ( '}' )
            // InternalRest.g:2054:2: '}'
            {
             before(grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Answer__Group_3__0"
    // InternalRest.g:2064:1: rule__Answer__Group_3__0 : rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 ;
    public final void rule__Answer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2068:1: ( rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 )
            // InternalRest.g:2069:2: rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Answer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__0"


    // $ANTLR start "rule__Answer__Group_3__0__Impl"
    // InternalRest.g:2076:1: rule__Answer__Group_3__0__Impl : ( 'status' ) ;
    public final void rule__Answer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2080:1: ( ( 'status' ) )
            // InternalRest.g:2081:1: ( 'status' )
            {
            // InternalRest.g:2081:1: ( 'status' )
            // InternalRest.g:2082:2: 'status'
            {
             before(grammarAccess.getAnswerAccess().getStatusKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getStatusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__0__Impl"


    // $ANTLR start "rule__Answer__Group_3__1"
    // InternalRest.g:2091:1: rule__Answer__Group_3__1 : rule__Answer__Group_3__1__Impl ;
    public final void rule__Answer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2095:1: ( rule__Answer__Group_3__1__Impl )
            // InternalRest.g:2096:2: rule__Answer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Answer__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__1"


    // $ANTLR start "rule__Answer__Group_3__1__Impl"
    // InternalRest.g:2102:1: rule__Answer__Group_3__1__Impl : ( ( rule__Answer__StatusAssignment_3_1 ) ) ;
    public final void rule__Answer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2106:1: ( ( ( rule__Answer__StatusAssignment_3_1 ) ) )
            // InternalRest.g:2107:1: ( ( rule__Answer__StatusAssignment_3_1 ) )
            {
            // InternalRest.g:2107:1: ( ( rule__Answer__StatusAssignment_3_1 ) )
            // InternalRest.g:2108:2: ( rule__Answer__StatusAssignment_3_1 )
            {
             before(grammarAccess.getAnswerAccess().getStatusAssignment_3_1()); 
            // InternalRest.g:2109:2: ( rule__Answer__StatusAssignment_3_1 )
            // InternalRest.g:2109:3: rule__Answer__StatusAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Answer__StatusAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getStatusAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__1__Impl"


    // $ANTLR start "rule__Answer__Group_4__0"
    // InternalRest.g:2118:1: rule__Answer__Group_4__0 : rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1 ;
    public final void rule__Answer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2122:1: ( rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1 )
            // InternalRest.g:2123:2: rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Answer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_4__0"


    // $ANTLR start "rule__Answer__Group_4__0__Impl"
    // InternalRest.g:2130:1: rule__Answer__Group_4__0__Impl : ( 'return' ) ;
    public final void rule__Answer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2134:1: ( ( 'return' ) )
            // InternalRest.g:2135:1: ( 'return' )
            {
            // InternalRest.g:2135:1: ( 'return' )
            // InternalRest.g:2136:2: 'return'
            {
             before(grammarAccess.getAnswerAccess().getReturnKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getReturnKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_4__0__Impl"


    // $ANTLR start "rule__Answer__Group_4__1"
    // InternalRest.g:2145:1: rule__Answer__Group_4__1 : rule__Answer__Group_4__1__Impl ;
    public final void rule__Answer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2149:1: ( rule__Answer__Group_4__1__Impl )
            // InternalRest.g:2150:2: rule__Answer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Answer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_4__1"


    // $ANTLR start "rule__Answer__Group_4__1__Impl"
    // InternalRest.g:2156:1: rule__Answer__Group_4__1__Impl : ( ( rule__Answer__ReturnAssignment_4_1 ) ) ;
    public final void rule__Answer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2160:1: ( ( ( rule__Answer__ReturnAssignment_4_1 ) ) )
            // InternalRest.g:2161:1: ( ( rule__Answer__ReturnAssignment_4_1 ) )
            {
            // InternalRest.g:2161:1: ( ( rule__Answer__ReturnAssignment_4_1 ) )
            // InternalRest.g:2162:2: ( rule__Answer__ReturnAssignment_4_1 )
            {
             before(grammarAccess.getAnswerAccess().getReturnAssignment_4_1()); 
            // InternalRest.g:2163:2: ( rule__Answer__ReturnAssignment_4_1 )
            // InternalRest.g:2163:3: rule__Answer__ReturnAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Answer__ReturnAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getReturnAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_4__1__Impl"


    // $ANTLR start "rule__Route__Group__0"
    // InternalRest.g:2172:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2176:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // InternalRest.g:2177:2: rule__Route__Group__0__Impl rule__Route__Group__1
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
    // InternalRest.g:2184:1: rule__Route__Group__0__Impl : ( 'Route' ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2188:1: ( ( 'Route' ) )
            // InternalRest.g:2189:1: ( 'Route' )
            {
            // InternalRest.g:2189:1: ( 'Route' )
            // InternalRest.g:2190:2: 'Route'
            {
             before(grammarAccess.getRouteAccess().getRouteKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRest.g:2199:1: rule__Route__Group__1 : rule__Route__Group__1__Impl rule__Route__Group__2 ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2203:1: ( rule__Route__Group__1__Impl rule__Route__Group__2 )
            // InternalRest.g:2204:2: rule__Route__Group__1__Impl rule__Route__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRest.g:2211:1: rule__Route__Group__1__Impl : ( '{' ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2215:1: ( ( '{' ) )
            // InternalRest.g:2216:1: ( '{' )
            {
            // InternalRest.g:2216:1: ( '{' )
            // InternalRest.g:2217:2: '{'
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
    // InternalRest.g:2226:1: rule__Route__Group__2 : rule__Route__Group__2__Impl rule__Route__Group__3 ;
    public final void rule__Route__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2230:1: ( rule__Route__Group__2__Impl rule__Route__Group__3 )
            // InternalRest.g:2231:2: rule__Route__Group__2__Impl rule__Route__Group__3
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
    // InternalRest.g:2238:1: rule__Route__Group__2__Impl : ( 'segment' ) ;
    public final void rule__Route__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2242:1: ( ( 'segment' ) )
            // InternalRest.g:2243:1: ( 'segment' )
            {
            // InternalRest.g:2243:1: ( 'segment' )
            // InternalRest.g:2244:2: 'segment'
            {
             before(grammarAccess.getRouteAccess().getSegmentKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getSegmentKeyword_2()); 

            }


            }

        }
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
    // InternalRest.g:2253:1: rule__Route__Group__3 : rule__Route__Group__3__Impl rule__Route__Group__4 ;
    public final void rule__Route__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2257:1: ( rule__Route__Group__3__Impl rule__Route__Group__4 )
            // InternalRest.g:2258:2: rule__Route__Group__3__Impl rule__Route__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRest.g:2265:1: rule__Route__Group__3__Impl : ( '{' ) ;
    public final void rule__Route__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2269:1: ( ( '{' ) )
            // InternalRest.g:2270:1: ( '{' )
            {
            // InternalRest.g:2270:1: ( '{' )
            // InternalRest.g:2271:2: '{'
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
    // InternalRest.g:2280:1: rule__Route__Group__4 : rule__Route__Group__4__Impl rule__Route__Group__5 ;
    public final void rule__Route__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2284:1: ( rule__Route__Group__4__Impl rule__Route__Group__5 )
            // InternalRest.g:2285:2: rule__Route__Group__4__Impl rule__Route__Group__5
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
    // InternalRest.g:2292:1: rule__Route__Group__4__Impl : ( ( rule__Route__SegmentAssignment_4 ) ) ;
    public final void rule__Route__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2296:1: ( ( ( rule__Route__SegmentAssignment_4 ) ) )
            // InternalRest.g:2297:1: ( ( rule__Route__SegmentAssignment_4 ) )
            {
            // InternalRest.g:2297:1: ( ( rule__Route__SegmentAssignment_4 ) )
            // InternalRest.g:2298:2: ( rule__Route__SegmentAssignment_4 )
            {
             before(grammarAccess.getRouteAccess().getSegmentAssignment_4()); 
            // InternalRest.g:2299:2: ( rule__Route__SegmentAssignment_4 )
            // InternalRest.g:2299:3: rule__Route__SegmentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Route__SegmentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getSegmentAssignment_4()); 

            }


            }

        }
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
    // InternalRest.g:2307:1: rule__Route__Group__5 : rule__Route__Group__5__Impl rule__Route__Group__6 ;
    public final void rule__Route__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2311:1: ( rule__Route__Group__5__Impl rule__Route__Group__6 )
            // InternalRest.g:2312:2: rule__Route__Group__5__Impl rule__Route__Group__6
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
    // InternalRest.g:2319:1: rule__Route__Group__5__Impl : ( ( rule__Route__Group_5__0 )* ) ;
    public final void rule__Route__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2323:1: ( ( ( rule__Route__Group_5__0 )* ) )
            // InternalRest.g:2324:1: ( ( rule__Route__Group_5__0 )* )
            {
            // InternalRest.g:2324:1: ( ( rule__Route__Group_5__0 )* )
            // InternalRest.g:2325:2: ( rule__Route__Group_5__0 )*
            {
             before(grammarAccess.getRouteAccess().getGroup_5()); 
            // InternalRest.g:2326:2: ( rule__Route__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRest.g:2326:3: rule__Route__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Route__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRest.g:2334:1: rule__Route__Group__6 : rule__Route__Group__6__Impl rule__Route__Group__7 ;
    public final void rule__Route__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2338:1: ( rule__Route__Group__6__Impl rule__Route__Group__7 )
            // InternalRest.g:2339:2: rule__Route__Group__6__Impl rule__Route__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:2346:1: rule__Route__Group__6__Impl : ( '}' ) ;
    public final void rule__Route__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2350:1: ( ( '}' ) )
            // InternalRest.g:2351:1: ( '}' )
            {
            // InternalRest.g:2351:1: ( '}' )
            // InternalRest.g:2352:2: '}'
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
    // InternalRest.g:2361:1: rule__Route__Group__7 : rule__Route__Group__7__Impl ;
    public final void rule__Route__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2365:1: ( rule__Route__Group__7__Impl )
            // InternalRest.g:2366:2: rule__Route__Group__7__Impl
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
    // InternalRest.g:2372:1: rule__Route__Group__7__Impl : ( '}' ) ;
    public final void rule__Route__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2376:1: ( ( '}' ) )
            // InternalRest.g:2377:1: ( '}' )
            {
            // InternalRest.g:2377:1: ( '}' )
            // InternalRest.g:2378:2: '}'
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
    // InternalRest.g:2388:1: rule__Route__Group_5__0 : rule__Route__Group_5__0__Impl rule__Route__Group_5__1 ;
    public final void rule__Route__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2392:1: ( rule__Route__Group_5__0__Impl rule__Route__Group_5__1 )
            // InternalRest.g:2393:2: rule__Route__Group_5__0__Impl rule__Route__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRest.g:2400:1: rule__Route__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Route__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2404:1: ( ( ',' ) )
            // InternalRest.g:2405:1: ( ',' )
            {
            // InternalRest.g:2405:1: ( ',' )
            // InternalRest.g:2406:2: ','
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
    // InternalRest.g:2415:1: rule__Route__Group_5__1 : rule__Route__Group_5__1__Impl ;
    public final void rule__Route__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2419:1: ( rule__Route__Group_5__1__Impl )
            // InternalRest.g:2420:2: rule__Route__Group_5__1__Impl
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
    // InternalRest.g:2426:1: rule__Route__Group_5__1__Impl : ( ( rule__Route__SegmentAssignment_5_1 ) ) ;
    public final void rule__Route__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2430:1: ( ( ( rule__Route__SegmentAssignment_5_1 ) ) )
            // InternalRest.g:2431:1: ( ( rule__Route__SegmentAssignment_5_1 ) )
            {
            // InternalRest.g:2431:1: ( ( rule__Route__SegmentAssignment_5_1 ) )
            // InternalRest.g:2432:2: ( rule__Route__SegmentAssignment_5_1 )
            {
             before(grammarAccess.getRouteAccess().getSegmentAssignment_5_1()); 
            // InternalRest.g:2433:2: ( rule__Route__SegmentAssignment_5_1 )
            // InternalRest.g:2433:3: rule__Route__SegmentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Route__SegmentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getSegmentAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReGet__Group__0"
    // InternalRest.g:2442:1: rule__ReGet__Group__0 : rule__ReGet__Group__0__Impl rule__ReGet__Group__1 ;
    public final void rule__ReGet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2446:1: ( rule__ReGet__Group__0__Impl rule__ReGet__Group__1 )
            // InternalRest.g:2447:2: rule__ReGet__Group__0__Impl rule__ReGet__Group__1
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
    // InternalRest.g:2454:1: rule__ReGet__Group__0__Impl : ( 'ReGet' ) ;
    public final void rule__ReGet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2458:1: ( ( 'ReGet' ) )
            // InternalRest.g:2459:1: ( 'ReGet' )
            {
            // InternalRest.g:2459:1: ( 'ReGet' )
            // InternalRest.g:2460:2: 'ReGet'
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
    // InternalRest.g:2469:1: rule__ReGet__Group__1 : rule__ReGet__Group__1__Impl rule__ReGet__Group__2 ;
    public final void rule__ReGet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2473:1: ( rule__ReGet__Group__1__Impl rule__ReGet__Group__2 )
            // InternalRest.g:2474:2: rule__ReGet__Group__1__Impl rule__ReGet__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalRest.g:2481:1: rule__ReGet__Group__1__Impl : ( '{' ) ;
    public final void rule__ReGet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2485:1: ( ( '{' ) )
            // InternalRest.g:2486:1: ( '{' )
            {
            // InternalRest.g:2486:1: ( '{' )
            // InternalRest.g:2487:2: '{'
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
    // InternalRest.g:2496:1: rule__ReGet__Group__2 : rule__ReGet__Group__2__Impl rule__ReGet__Group__3 ;
    public final void rule__ReGet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2500:1: ( rule__ReGet__Group__2__Impl rule__ReGet__Group__3 )
            // InternalRest.g:2501:2: rule__ReGet__Group__2__Impl rule__ReGet__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalRest.g:2508:1: rule__ReGet__Group__2__Impl : ( ( rule__ReGet__Group_2__0 )? ) ;
    public final void rule__ReGet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2512:1: ( ( ( rule__ReGet__Group_2__0 )? ) )
            // InternalRest.g:2513:1: ( ( rule__ReGet__Group_2__0 )? )
            {
            // InternalRest.g:2513:1: ( ( rule__ReGet__Group_2__0 )? )
            // InternalRest.g:2514:2: ( rule__ReGet__Group_2__0 )?
            {
             before(grammarAccess.getReGetAccess().getGroup_2()); 
            // InternalRest.g:2515:2: ( rule__ReGet__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRest.g:2515:3: rule__ReGet__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReGet__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReGetAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalRest.g:2523:1: rule__ReGet__Group__3 : rule__ReGet__Group__3__Impl rule__ReGet__Group__4 ;
    public final void rule__ReGet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2527:1: ( rule__ReGet__Group__3__Impl rule__ReGet__Group__4 )
            // InternalRest.g:2528:2: rule__ReGet__Group__3__Impl rule__ReGet__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:2535:1: rule__ReGet__Group__3__Impl : ( 'succAnswer' ) ;
    public final void rule__ReGet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2539:1: ( ( 'succAnswer' ) )
            // InternalRest.g:2540:1: ( 'succAnswer' )
            {
            // InternalRest.g:2540:1: ( 'succAnswer' )
            // InternalRest.g:2541:2: 'succAnswer'
            {
             before(grammarAccess.getReGetAccess().getSuccAnswerKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getSuccAnswerKeyword_3()); 

            }


            }

        }
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
    // InternalRest.g:2550:1: rule__ReGet__Group__4 : rule__ReGet__Group__4__Impl rule__ReGet__Group__5 ;
    public final void rule__ReGet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2554:1: ( rule__ReGet__Group__4__Impl rule__ReGet__Group__5 )
            // InternalRest.g:2555:2: rule__ReGet__Group__4__Impl rule__ReGet__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalRest.g:2562:1: rule__ReGet__Group__4__Impl : ( ( rule__ReGet__SuccAnswerAssignment_4 ) ) ;
    public final void rule__ReGet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2566:1: ( ( ( rule__ReGet__SuccAnswerAssignment_4 ) ) )
            // InternalRest.g:2567:1: ( ( rule__ReGet__SuccAnswerAssignment_4 ) )
            {
            // InternalRest.g:2567:1: ( ( rule__ReGet__SuccAnswerAssignment_4 ) )
            // InternalRest.g:2568:2: ( rule__ReGet__SuccAnswerAssignment_4 )
            {
             before(grammarAccess.getReGetAccess().getSuccAnswerAssignment_4()); 
            // InternalRest.g:2569:2: ( rule__ReGet__SuccAnswerAssignment_4 )
            // InternalRest.g:2569:3: rule__ReGet__SuccAnswerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__SuccAnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getSuccAnswerAssignment_4()); 

            }


            }

        }
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
    // InternalRest.g:2577:1: rule__ReGet__Group__5 : rule__ReGet__Group__5__Impl rule__ReGet__Group__6 ;
    public final void rule__ReGet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2581:1: ( rule__ReGet__Group__5__Impl rule__ReGet__Group__6 )
            // InternalRest.g:2582:2: rule__ReGet__Group__5__Impl rule__ReGet__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalRest.g:2589:1: rule__ReGet__Group__5__Impl : ( 'route' ) ;
    public final void rule__ReGet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2593:1: ( ( 'route' ) )
            // InternalRest.g:2594:1: ( 'route' )
            {
            // InternalRest.g:2594:1: ( 'route' )
            // InternalRest.g:2595:2: 'route'
            {
             before(grammarAccess.getReGetAccess().getRouteKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRouteKeyword_5()); 

            }


            }

        }
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
    // InternalRest.g:2604:1: rule__ReGet__Group__6 : rule__ReGet__Group__6__Impl rule__ReGet__Group__7 ;
    public final void rule__ReGet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2608:1: ( rule__ReGet__Group__6__Impl rule__ReGet__Group__7 )
            // InternalRest.g:2609:2: rule__ReGet__Group__6__Impl rule__ReGet__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:2616:1: rule__ReGet__Group__6__Impl : ( ( rule__ReGet__RouteAssignment_6 ) ) ;
    public final void rule__ReGet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2620:1: ( ( ( rule__ReGet__RouteAssignment_6 ) ) )
            // InternalRest.g:2621:1: ( ( rule__ReGet__RouteAssignment_6 ) )
            {
            // InternalRest.g:2621:1: ( ( rule__ReGet__RouteAssignment_6 ) )
            // InternalRest.g:2622:2: ( rule__ReGet__RouteAssignment_6 )
            {
             before(grammarAccess.getReGetAccess().getRouteAssignment_6()); 
            // InternalRest.g:2623:2: ( rule__ReGet__RouteAssignment_6 )
            // InternalRest.g:2623:3: rule__ReGet__RouteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__RouteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getRouteAssignment_6()); 

            }


            }

        }
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
    // InternalRest.g:2631:1: rule__ReGet__Group__7 : rule__ReGet__Group__7__Impl rule__ReGet__Group__8 ;
    public final void rule__ReGet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2635:1: ( rule__ReGet__Group__7__Impl rule__ReGet__Group__8 )
            // InternalRest.g:2636:2: rule__ReGet__Group__7__Impl rule__ReGet__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:2643:1: rule__ReGet__Group__7__Impl : ( ( rule__ReGet__Group_7__0 )? ) ;
    public final void rule__ReGet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2647:1: ( ( ( rule__ReGet__Group_7__0 )? ) )
            // InternalRest.g:2648:1: ( ( rule__ReGet__Group_7__0 )? )
            {
            // InternalRest.g:2648:1: ( ( rule__ReGet__Group_7__0 )? )
            // InternalRest.g:2649:2: ( rule__ReGet__Group_7__0 )?
            {
             before(grammarAccess.getReGetAccess().getGroup_7()); 
            // InternalRest.g:2650:2: ( rule__ReGet__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRest.g:2650:3: rule__ReGet__Group_7__0
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
    // InternalRest.g:2658:1: rule__ReGet__Group__8 : rule__ReGet__Group__8__Impl ;
    public final void rule__ReGet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2662:1: ( rule__ReGet__Group__8__Impl )
            // InternalRest.g:2663:2: rule__ReGet__Group__8__Impl
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
    // InternalRest.g:2669:1: rule__ReGet__Group__8__Impl : ( '}' ) ;
    public final void rule__ReGet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2673:1: ( ( '}' ) )
            // InternalRest.g:2674:1: ( '}' )
            {
            // InternalRest.g:2674:1: ( '}' )
            // InternalRest.g:2675:2: '}'
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


    // $ANTLR start "rule__ReGet__Group_2__0"
    // InternalRest.g:2685:1: rule__ReGet__Group_2__0 : rule__ReGet__Group_2__0__Impl rule__ReGet__Group_2__1 ;
    public final void rule__ReGet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2689:1: ( rule__ReGet__Group_2__0__Impl rule__ReGet__Group_2__1 )
            // InternalRest.g:2690:2: rule__ReGet__Group_2__0__Impl rule__ReGet__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__ReGet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__0"


    // $ANTLR start "rule__ReGet__Group_2__0__Impl"
    // InternalRest.g:2697:1: rule__ReGet__Group_2__0__Impl : ( 'ops' ) ;
    public final void rule__ReGet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2701:1: ( ( 'ops' ) )
            // InternalRest.g:2702:1: ( 'ops' )
            {
            // InternalRest.g:2702:1: ( 'ops' )
            // InternalRest.g:2703:2: 'ops'
            {
             before(grammarAccess.getReGetAccess().getOpsKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getOpsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__0__Impl"


    // $ANTLR start "rule__ReGet__Group_2__1"
    // InternalRest.g:2712:1: rule__ReGet__Group_2__1 : rule__ReGet__Group_2__1__Impl rule__ReGet__Group_2__2 ;
    public final void rule__ReGet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2716:1: ( rule__ReGet__Group_2__1__Impl rule__ReGet__Group_2__2 )
            // InternalRest.g:2717:2: rule__ReGet__Group_2__1__Impl rule__ReGet__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__ReGet__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__1"


    // $ANTLR start "rule__ReGet__Group_2__1__Impl"
    // InternalRest.g:2724:1: rule__ReGet__Group_2__1__Impl : ( '(' ) ;
    public final void rule__ReGet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2728:1: ( ( '(' ) )
            // InternalRest.g:2729:1: ( '(' )
            {
            // InternalRest.g:2729:1: ( '(' )
            // InternalRest.g:2730:2: '('
            {
             before(grammarAccess.getReGetAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__1__Impl"


    // $ANTLR start "rule__ReGet__Group_2__2"
    // InternalRest.g:2739:1: rule__ReGet__Group_2__2 : rule__ReGet__Group_2__2__Impl rule__ReGet__Group_2__3 ;
    public final void rule__ReGet__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2743:1: ( rule__ReGet__Group_2__2__Impl rule__ReGet__Group_2__3 )
            // InternalRest.g:2744:2: rule__ReGet__Group_2__2__Impl rule__ReGet__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__ReGet__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__2"


    // $ANTLR start "rule__ReGet__Group_2__2__Impl"
    // InternalRest.g:2751:1: rule__ReGet__Group_2__2__Impl : ( ( rule__ReGet__OpsAssignment_2_2 ) ) ;
    public final void rule__ReGet__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2755:1: ( ( ( rule__ReGet__OpsAssignment_2_2 ) ) )
            // InternalRest.g:2756:1: ( ( rule__ReGet__OpsAssignment_2_2 ) )
            {
            // InternalRest.g:2756:1: ( ( rule__ReGet__OpsAssignment_2_2 ) )
            // InternalRest.g:2757:2: ( rule__ReGet__OpsAssignment_2_2 )
            {
             before(grammarAccess.getReGetAccess().getOpsAssignment_2_2()); 
            // InternalRest.g:2758:2: ( rule__ReGet__OpsAssignment_2_2 )
            // InternalRest.g:2758:3: rule__ReGet__OpsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__OpsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getOpsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__2__Impl"


    // $ANTLR start "rule__ReGet__Group_2__3"
    // InternalRest.g:2766:1: rule__ReGet__Group_2__3 : rule__ReGet__Group_2__3__Impl rule__ReGet__Group_2__4 ;
    public final void rule__ReGet__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2770:1: ( rule__ReGet__Group_2__3__Impl rule__ReGet__Group_2__4 )
            // InternalRest.g:2771:2: rule__ReGet__Group_2__3__Impl rule__ReGet__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__ReGet__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__3"


    // $ANTLR start "rule__ReGet__Group_2__3__Impl"
    // InternalRest.g:2778:1: rule__ReGet__Group_2__3__Impl : ( ( rule__ReGet__Group_2_3__0 )* ) ;
    public final void rule__ReGet__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2782:1: ( ( ( rule__ReGet__Group_2_3__0 )* ) )
            // InternalRest.g:2783:1: ( ( rule__ReGet__Group_2_3__0 )* )
            {
            // InternalRest.g:2783:1: ( ( rule__ReGet__Group_2_3__0 )* )
            // InternalRest.g:2784:2: ( rule__ReGet__Group_2_3__0 )*
            {
             before(grammarAccess.getReGetAccess().getGroup_2_3()); 
            // InternalRest.g:2785:2: ( rule__ReGet__Group_2_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRest.g:2785:3: rule__ReGet__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReGet__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getReGetAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__3__Impl"


    // $ANTLR start "rule__ReGet__Group_2__4"
    // InternalRest.g:2793:1: rule__ReGet__Group_2__4 : rule__ReGet__Group_2__4__Impl ;
    public final void rule__ReGet__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2797:1: ( rule__ReGet__Group_2__4__Impl )
            // InternalRest.g:2798:2: rule__ReGet__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__4"


    // $ANTLR start "rule__ReGet__Group_2__4__Impl"
    // InternalRest.g:2804:1: rule__ReGet__Group_2__4__Impl : ( ')' ) ;
    public final void rule__ReGet__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2808:1: ( ( ')' ) )
            // InternalRest.g:2809:1: ( ')' )
            {
            // InternalRest.g:2809:1: ( ')' )
            // InternalRest.g:2810:2: ')'
            {
             before(grammarAccess.getReGetAccess().getRightParenthesisKeyword_2_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2__4__Impl"


    // $ANTLR start "rule__ReGet__Group_2_3__0"
    // InternalRest.g:2820:1: rule__ReGet__Group_2_3__0 : rule__ReGet__Group_2_3__0__Impl rule__ReGet__Group_2_3__1 ;
    public final void rule__ReGet__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2824:1: ( rule__ReGet__Group_2_3__0__Impl rule__ReGet__Group_2_3__1 )
            // InternalRest.g:2825:2: rule__ReGet__Group_2_3__0__Impl rule__ReGet__Group_2_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ReGet__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2_3__0"


    // $ANTLR start "rule__ReGet__Group_2_3__0__Impl"
    // InternalRest.g:2832:1: rule__ReGet__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__ReGet__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2836:1: ( ( ',' ) )
            // InternalRest.g:2837:1: ( ',' )
            {
            // InternalRest.g:2837:1: ( ',' )
            // InternalRest.g:2838:2: ','
            {
             before(grammarAccess.getReGetAccess().getCommaKeyword_2_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2_3__0__Impl"


    // $ANTLR start "rule__ReGet__Group_2_3__1"
    // InternalRest.g:2847:1: rule__ReGet__Group_2_3__1 : rule__ReGet__Group_2_3__1__Impl ;
    public final void rule__ReGet__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2851:1: ( rule__ReGet__Group_2_3__1__Impl )
            // InternalRest.g:2852:2: rule__ReGet__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2_3__1"


    // $ANTLR start "rule__ReGet__Group_2_3__1__Impl"
    // InternalRest.g:2858:1: rule__ReGet__Group_2_3__1__Impl : ( ( rule__ReGet__OpsAssignment_2_3_1 ) ) ;
    public final void rule__ReGet__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2862:1: ( ( ( rule__ReGet__OpsAssignment_2_3_1 ) ) )
            // InternalRest.g:2863:1: ( ( rule__ReGet__OpsAssignment_2_3_1 ) )
            {
            // InternalRest.g:2863:1: ( ( rule__ReGet__OpsAssignment_2_3_1 ) )
            // InternalRest.g:2864:2: ( rule__ReGet__OpsAssignment_2_3_1 )
            {
             before(grammarAccess.getReGetAccess().getOpsAssignment_2_3_1()); 
            // InternalRest.g:2865:2: ( rule__ReGet__OpsAssignment_2_3_1 )
            // InternalRest.g:2865:3: rule__ReGet__OpsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__OpsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getOpsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_2_3__1__Impl"


    // $ANTLR start "rule__ReGet__Group_7__0"
    // InternalRest.g:2874:1: rule__ReGet__Group_7__0 : rule__ReGet__Group_7__0__Impl rule__ReGet__Group_7__1 ;
    public final void rule__ReGet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2878:1: ( rule__ReGet__Group_7__0__Impl rule__ReGet__Group_7__1 )
            // InternalRest.g:2879:2: rule__ReGet__Group_7__0__Impl rule__ReGet__Group_7__1
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
    // InternalRest.g:2886:1: rule__ReGet__Group_7__0__Impl : ( 'data' ) ;
    public final void rule__ReGet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2890:1: ( ( 'data' ) )
            // InternalRest.g:2891:1: ( 'data' )
            {
            // InternalRest.g:2891:1: ( 'data' )
            // InternalRest.g:2892:2: 'data'
            {
             before(grammarAccess.getReGetAccess().getDataKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getDataKeyword_7_0()); 

            }


            }

        }
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
    // InternalRest.g:2901:1: rule__ReGet__Group_7__1 : rule__ReGet__Group_7__1__Impl rule__ReGet__Group_7__2 ;
    public final void rule__ReGet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2905:1: ( rule__ReGet__Group_7__1__Impl rule__ReGet__Group_7__2 )
            // InternalRest.g:2906:2: rule__ReGet__Group_7__1__Impl rule__ReGet__Group_7__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:2913:1: rule__ReGet__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ReGet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2917:1: ( ( '{' ) )
            // InternalRest.g:2918:1: ( '{' )
            {
            // InternalRest.g:2918:1: ( '{' )
            // InternalRest.g:2919:2: '{'
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
    // InternalRest.g:2928:1: rule__ReGet__Group_7__2 : rule__ReGet__Group_7__2__Impl rule__ReGet__Group_7__3 ;
    public final void rule__ReGet__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2932:1: ( rule__ReGet__Group_7__2__Impl rule__ReGet__Group_7__3 )
            // InternalRest.g:2933:2: rule__ReGet__Group_7__2__Impl rule__ReGet__Group_7__3
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
    // InternalRest.g:2940:1: rule__ReGet__Group_7__2__Impl : ( ( rule__ReGet__DataAssignment_7_2 ) ) ;
    public final void rule__ReGet__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2944:1: ( ( ( rule__ReGet__DataAssignment_7_2 ) ) )
            // InternalRest.g:2945:1: ( ( rule__ReGet__DataAssignment_7_2 ) )
            {
            // InternalRest.g:2945:1: ( ( rule__ReGet__DataAssignment_7_2 ) )
            // InternalRest.g:2946:2: ( rule__ReGet__DataAssignment_7_2 )
            {
             before(grammarAccess.getReGetAccess().getDataAssignment_7_2()); 
            // InternalRest.g:2947:2: ( rule__ReGet__DataAssignment_7_2 )
            // InternalRest.g:2947:3: rule__ReGet__DataAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__DataAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getDataAssignment_7_2()); 

            }


            }

        }
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
    // InternalRest.g:2955:1: rule__ReGet__Group_7__3 : rule__ReGet__Group_7__3__Impl rule__ReGet__Group_7__4 ;
    public final void rule__ReGet__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2959:1: ( rule__ReGet__Group_7__3__Impl rule__ReGet__Group_7__4 )
            // InternalRest.g:2960:2: rule__ReGet__Group_7__3__Impl rule__ReGet__Group_7__4
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
    // InternalRest.g:2967:1: rule__ReGet__Group_7__3__Impl : ( ( rule__ReGet__Group_7_3__0 )* ) ;
    public final void rule__ReGet__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2971:1: ( ( ( rule__ReGet__Group_7_3__0 )* ) )
            // InternalRest.g:2972:1: ( ( rule__ReGet__Group_7_3__0 )* )
            {
            // InternalRest.g:2972:1: ( ( rule__ReGet__Group_7_3__0 )* )
            // InternalRest.g:2973:2: ( rule__ReGet__Group_7_3__0 )*
            {
             before(grammarAccess.getReGetAccess().getGroup_7_3()); 
            // InternalRest.g:2974:2: ( rule__ReGet__Group_7_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRest.g:2974:3: rule__ReGet__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReGet__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalRest.g:2982:1: rule__ReGet__Group_7__4 : rule__ReGet__Group_7__4__Impl ;
    public final void rule__ReGet__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2986:1: ( rule__ReGet__Group_7__4__Impl )
            // InternalRest.g:2987:2: rule__ReGet__Group_7__4__Impl
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
    // InternalRest.g:2993:1: rule__ReGet__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ReGet__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2997:1: ( ( '}' ) )
            // InternalRest.g:2998:1: ( '}' )
            {
            // InternalRest.g:2998:1: ( '}' )
            // InternalRest.g:2999:2: '}'
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
    // InternalRest.g:3009:1: rule__ReGet__Group_7_3__0 : rule__ReGet__Group_7_3__0__Impl rule__ReGet__Group_7_3__1 ;
    public final void rule__ReGet__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3013:1: ( rule__ReGet__Group_7_3__0__Impl rule__ReGet__Group_7_3__1 )
            // InternalRest.g:3014:2: rule__ReGet__Group_7_3__0__Impl rule__ReGet__Group_7_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:3021:1: rule__ReGet__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ReGet__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3025:1: ( ( ',' ) )
            // InternalRest.g:3026:1: ( ',' )
            {
            // InternalRest.g:3026:1: ( ',' )
            // InternalRest.g:3027:2: ','
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
    // InternalRest.g:3036:1: rule__ReGet__Group_7_3__1 : rule__ReGet__Group_7_3__1__Impl ;
    public final void rule__ReGet__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3040:1: ( rule__ReGet__Group_7_3__1__Impl )
            // InternalRest.g:3041:2: rule__ReGet__Group_7_3__1__Impl
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
    // InternalRest.g:3047:1: rule__ReGet__Group_7_3__1__Impl : ( ( rule__ReGet__DataAssignment_7_3_1 ) ) ;
    public final void rule__ReGet__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3051:1: ( ( ( rule__ReGet__DataAssignment_7_3_1 ) ) )
            // InternalRest.g:3052:1: ( ( rule__ReGet__DataAssignment_7_3_1 ) )
            {
            // InternalRest.g:3052:1: ( ( rule__ReGet__DataAssignment_7_3_1 ) )
            // InternalRest.g:3053:2: ( rule__ReGet__DataAssignment_7_3_1 )
            {
             before(grammarAccess.getReGetAccess().getDataAssignment_7_3_1()); 
            // InternalRest.g:3054:2: ( rule__ReGet__DataAssignment_7_3_1 )
            // InternalRest.g:3054:3: rule__ReGet__DataAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__DataAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getDataAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalRest.g:3063:1: rule__RePost__Group__0 : rule__RePost__Group__0__Impl rule__RePost__Group__1 ;
    public final void rule__RePost__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3067:1: ( rule__RePost__Group__0__Impl rule__RePost__Group__1 )
            // InternalRest.g:3068:2: rule__RePost__Group__0__Impl rule__RePost__Group__1
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
    // InternalRest.g:3075:1: rule__RePost__Group__0__Impl : ( 'RePost' ) ;
    public final void rule__RePost__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3079:1: ( ( 'RePost' ) )
            // InternalRest.g:3080:1: ( 'RePost' )
            {
            // InternalRest.g:3080:1: ( 'RePost' )
            // InternalRest.g:3081:2: 'RePost'
            {
             before(grammarAccess.getRePostAccess().getRePostKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRest.g:3090:1: rule__RePost__Group__1 : rule__RePost__Group__1__Impl rule__RePost__Group__2 ;
    public final void rule__RePost__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3094:1: ( rule__RePost__Group__1__Impl rule__RePost__Group__2 )
            // InternalRest.g:3095:2: rule__RePost__Group__1__Impl rule__RePost__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalRest.g:3102:1: rule__RePost__Group__1__Impl : ( '{' ) ;
    public final void rule__RePost__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3106:1: ( ( '{' ) )
            // InternalRest.g:3107:1: ( '{' )
            {
            // InternalRest.g:3107:1: ( '{' )
            // InternalRest.g:3108:2: '{'
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
    // InternalRest.g:3117:1: rule__RePost__Group__2 : rule__RePost__Group__2__Impl rule__RePost__Group__3 ;
    public final void rule__RePost__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3121:1: ( rule__RePost__Group__2__Impl rule__RePost__Group__3 )
            // InternalRest.g:3122:2: rule__RePost__Group__2__Impl rule__RePost__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalRest.g:3129:1: rule__RePost__Group__2__Impl : ( ( rule__RePost__Group_2__0 )? ) ;
    public final void rule__RePost__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3133:1: ( ( ( rule__RePost__Group_2__0 )? ) )
            // InternalRest.g:3134:1: ( ( rule__RePost__Group_2__0 )? )
            {
            // InternalRest.g:3134:1: ( ( rule__RePost__Group_2__0 )? )
            // InternalRest.g:3135:2: ( rule__RePost__Group_2__0 )?
            {
             before(grammarAccess.getRePostAccess().getGroup_2()); 
            // InternalRest.g:3136:2: ( rule__RePost__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRest.g:3136:3: rule__RePost__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePost__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePostAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalRest.g:3144:1: rule__RePost__Group__3 : rule__RePost__Group__3__Impl rule__RePost__Group__4 ;
    public final void rule__RePost__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3148:1: ( rule__RePost__Group__3__Impl rule__RePost__Group__4 )
            // InternalRest.g:3149:2: rule__RePost__Group__3__Impl rule__RePost__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:3156:1: rule__RePost__Group__3__Impl : ( 'succAnswer' ) ;
    public final void rule__RePost__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3160:1: ( ( 'succAnswer' ) )
            // InternalRest.g:3161:1: ( 'succAnswer' )
            {
            // InternalRest.g:3161:1: ( 'succAnswer' )
            // InternalRest.g:3162:2: 'succAnswer'
            {
             before(grammarAccess.getRePostAccess().getSuccAnswerKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getSuccAnswerKeyword_3()); 

            }


            }

        }
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
    // InternalRest.g:3171:1: rule__RePost__Group__4 : rule__RePost__Group__4__Impl rule__RePost__Group__5 ;
    public final void rule__RePost__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3175:1: ( rule__RePost__Group__4__Impl rule__RePost__Group__5 )
            // InternalRest.g:3176:2: rule__RePost__Group__4__Impl rule__RePost__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalRest.g:3183:1: rule__RePost__Group__4__Impl : ( ( rule__RePost__SuccAnswerAssignment_4 ) ) ;
    public final void rule__RePost__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3187:1: ( ( ( rule__RePost__SuccAnswerAssignment_4 ) ) )
            // InternalRest.g:3188:1: ( ( rule__RePost__SuccAnswerAssignment_4 ) )
            {
            // InternalRest.g:3188:1: ( ( rule__RePost__SuccAnswerAssignment_4 ) )
            // InternalRest.g:3189:2: ( rule__RePost__SuccAnswerAssignment_4 )
            {
             before(grammarAccess.getRePostAccess().getSuccAnswerAssignment_4()); 
            // InternalRest.g:3190:2: ( rule__RePost__SuccAnswerAssignment_4 )
            // InternalRest.g:3190:3: rule__RePost__SuccAnswerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RePost__SuccAnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getSuccAnswerAssignment_4()); 

            }


            }

        }
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
    // InternalRest.g:3198:1: rule__RePost__Group__5 : rule__RePost__Group__5__Impl rule__RePost__Group__6 ;
    public final void rule__RePost__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3202:1: ( rule__RePost__Group__5__Impl rule__RePost__Group__6 )
            // InternalRest.g:3203:2: rule__RePost__Group__5__Impl rule__RePost__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalRest.g:3210:1: rule__RePost__Group__5__Impl : ( 'route' ) ;
    public final void rule__RePost__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3214:1: ( ( 'route' ) )
            // InternalRest.g:3215:1: ( 'route' )
            {
            // InternalRest.g:3215:1: ( 'route' )
            // InternalRest.g:3216:2: 'route'
            {
             before(grammarAccess.getRePostAccess().getRouteKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRouteKeyword_5()); 

            }


            }

        }
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
    // InternalRest.g:3225:1: rule__RePost__Group__6 : rule__RePost__Group__6__Impl rule__RePost__Group__7 ;
    public final void rule__RePost__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3229:1: ( rule__RePost__Group__6__Impl rule__RePost__Group__7 )
            // InternalRest.g:3230:2: rule__RePost__Group__6__Impl rule__RePost__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:3237:1: rule__RePost__Group__6__Impl : ( ( rule__RePost__RouteAssignment_6 ) ) ;
    public final void rule__RePost__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3241:1: ( ( ( rule__RePost__RouteAssignment_6 ) ) )
            // InternalRest.g:3242:1: ( ( rule__RePost__RouteAssignment_6 ) )
            {
            // InternalRest.g:3242:1: ( ( rule__RePost__RouteAssignment_6 ) )
            // InternalRest.g:3243:2: ( rule__RePost__RouteAssignment_6 )
            {
             before(grammarAccess.getRePostAccess().getRouteAssignment_6()); 
            // InternalRest.g:3244:2: ( rule__RePost__RouteAssignment_6 )
            // InternalRest.g:3244:3: rule__RePost__RouteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RePost__RouteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getRouteAssignment_6()); 

            }


            }

        }
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
    // InternalRest.g:3252:1: rule__RePost__Group__7 : rule__RePost__Group__7__Impl rule__RePost__Group__8 ;
    public final void rule__RePost__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3256:1: ( rule__RePost__Group__7__Impl rule__RePost__Group__8 )
            // InternalRest.g:3257:2: rule__RePost__Group__7__Impl rule__RePost__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:3264:1: rule__RePost__Group__7__Impl : ( ( rule__RePost__Group_7__0 )? ) ;
    public final void rule__RePost__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3268:1: ( ( ( rule__RePost__Group_7__0 )? ) )
            // InternalRest.g:3269:1: ( ( rule__RePost__Group_7__0 )? )
            {
            // InternalRest.g:3269:1: ( ( rule__RePost__Group_7__0 )? )
            // InternalRest.g:3270:2: ( rule__RePost__Group_7__0 )?
            {
             before(grammarAccess.getRePostAccess().getGroup_7()); 
            // InternalRest.g:3271:2: ( rule__RePost__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRest.g:3271:3: rule__RePost__Group_7__0
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
    // InternalRest.g:3279:1: rule__RePost__Group__8 : rule__RePost__Group__8__Impl ;
    public final void rule__RePost__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3283:1: ( rule__RePost__Group__8__Impl )
            // InternalRest.g:3284:2: rule__RePost__Group__8__Impl
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
    // InternalRest.g:3290:1: rule__RePost__Group__8__Impl : ( '}' ) ;
    public final void rule__RePost__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3294:1: ( ( '}' ) )
            // InternalRest.g:3295:1: ( '}' )
            {
            // InternalRest.g:3295:1: ( '}' )
            // InternalRest.g:3296:2: '}'
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


    // $ANTLR start "rule__RePost__Group_2__0"
    // InternalRest.g:3306:1: rule__RePost__Group_2__0 : rule__RePost__Group_2__0__Impl rule__RePost__Group_2__1 ;
    public final void rule__RePost__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3310:1: ( rule__RePost__Group_2__0__Impl rule__RePost__Group_2__1 )
            // InternalRest.g:3311:2: rule__RePost__Group_2__0__Impl rule__RePost__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__RePost__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__0"


    // $ANTLR start "rule__RePost__Group_2__0__Impl"
    // InternalRest.g:3318:1: rule__RePost__Group_2__0__Impl : ( 'ops' ) ;
    public final void rule__RePost__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3322:1: ( ( 'ops' ) )
            // InternalRest.g:3323:1: ( 'ops' )
            {
            // InternalRest.g:3323:1: ( 'ops' )
            // InternalRest.g:3324:2: 'ops'
            {
             before(grammarAccess.getRePostAccess().getOpsKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getOpsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__0__Impl"


    // $ANTLR start "rule__RePost__Group_2__1"
    // InternalRest.g:3333:1: rule__RePost__Group_2__1 : rule__RePost__Group_2__1__Impl rule__RePost__Group_2__2 ;
    public final void rule__RePost__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3337:1: ( rule__RePost__Group_2__1__Impl rule__RePost__Group_2__2 )
            // InternalRest.g:3338:2: rule__RePost__Group_2__1__Impl rule__RePost__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__RePost__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__1"


    // $ANTLR start "rule__RePost__Group_2__1__Impl"
    // InternalRest.g:3345:1: rule__RePost__Group_2__1__Impl : ( '(' ) ;
    public final void rule__RePost__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3349:1: ( ( '(' ) )
            // InternalRest.g:3350:1: ( '(' )
            {
            // InternalRest.g:3350:1: ( '(' )
            // InternalRest.g:3351:2: '('
            {
             before(grammarAccess.getRePostAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__1__Impl"


    // $ANTLR start "rule__RePost__Group_2__2"
    // InternalRest.g:3360:1: rule__RePost__Group_2__2 : rule__RePost__Group_2__2__Impl rule__RePost__Group_2__3 ;
    public final void rule__RePost__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3364:1: ( rule__RePost__Group_2__2__Impl rule__RePost__Group_2__3 )
            // InternalRest.g:3365:2: rule__RePost__Group_2__2__Impl rule__RePost__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__RePost__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__2"


    // $ANTLR start "rule__RePost__Group_2__2__Impl"
    // InternalRest.g:3372:1: rule__RePost__Group_2__2__Impl : ( ( rule__RePost__OpsAssignment_2_2 ) ) ;
    public final void rule__RePost__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3376:1: ( ( ( rule__RePost__OpsAssignment_2_2 ) ) )
            // InternalRest.g:3377:1: ( ( rule__RePost__OpsAssignment_2_2 ) )
            {
            // InternalRest.g:3377:1: ( ( rule__RePost__OpsAssignment_2_2 ) )
            // InternalRest.g:3378:2: ( rule__RePost__OpsAssignment_2_2 )
            {
             before(grammarAccess.getRePostAccess().getOpsAssignment_2_2()); 
            // InternalRest.g:3379:2: ( rule__RePost__OpsAssignment_2_2 )
            // InternalRest.g:3379:3: rule__RePost__OpsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__RePost__OpsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getOpsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__2__Impl"


    // $ANTLR start "rule__RePost__Group_2__3"
    // InternalRest.g:3387:1: rule__RePost__Group_2__3 : rule__RePost__Group_2__3__Impl rule__RePost__Group_2__4 ;
    public final void rule__RePost__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3391:1: ( rule__RePost__Group_2__3__Impl rule__RePost__Group_2__4 )
            // InternalRest.g:3392:2: rule__RePost__Group_2__3__Impl rule__RePost__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__RePost__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__3"


    // $ANTLR start "rule__RePost__Group_2__3__Impl"
    // InternalRest.g:3399:1: rule__RePost__Group_2__3__Impl : ( ( rule__RePost__Group_2_3__0 )* ) ;
    public final void rule__RePost__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3403:1: ( ( ( rule__RePost__Group_2_3__0 )* ) )
            // InternalRest.g:3404:1: ( ( rule__RePost__Group_2_3__0 )* )
            {
            // InternalRest.g:3404:1: ( ( rule__RePost__Group_2_3__0 )* )
            // InternalRest.g:3405:2: ( rule__RePost__Group_2_3__0 )*
            {
             before(grammarAccess.getRePostAccess().getGroup_2_3()); 
            // InternalRest.g:3406:2: ( rule__RePost__Group_2_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRest.g:3406:3: rule__RePost__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePost__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getRePostAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__3__Impl"


    // $ANTLR start "rule__RePost__Group_2__4"
    // InternalRest.g:3414:1: rule__RePost__Group_2__4 : rule__RePost__Group_2__4__Impl ;
    public final void rule__RePost__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3418:1: ( rule__RePost__Group_2__4__Impl )
            // InternalRest.g:3419:2: rule__RePost__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__4"


    // $ANTLR start "rule__RePost__Group_2__4__Impl"
    // InternalRest.g:3425:1: rule__RePost__Group_2__4__Impl : ( ')' ) ;
    public final void rule__RePost__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3429:1: ( ( ')' ) )
            // InternalRest.g:3430:1: ( ')' )
            {
            // InternalRest.g:3430:1: ( ')' )
            // InternalRest.g:3431:2: ')'
            {
             before(grammarAccess.getRePostAccess().getRightParenthesisKeyword_2_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2__4__Impl"


    // $ANTLR start "rule__RePost__Group_2_3__0"
    // InternalRest.g:3441:1: rule__RePost__Group_2_3__0 : rule__RePost__Group_2_3__0__Impl rule__RePost__Group_2_3__1 ;
    public final void rule__RePost__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3445:1: ( rule__RePost__Group_2_3__0__Impl rule__RePost__Group_2_3__1 )
            // InternalRest.g:3446:2: rule__RePost__Group_2_3__0__Impl rule__RePost__Group_2_3__1
            {
            pushFollow(FOLLOW_13);
            rule__RePost__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2_3__0"


    // $ANTLR start "rule__RePost__Group_2_3__0__Impl"
    // InternalRest.g:3453:1: rule__RePost__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__RePost__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3457:1: ( ( ',' ) )
            // InternalRest.g:3458:1: ( ',' )
            {
            // InternalRest.g:3458:1: ( ',' )
            // InternalRest.g:3459:2: ','
            {
             before(grammarAccess.getRePostAccess().getCommaKeyword_2_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2_3__0__Impl"


    // $ANTLR start "rule__RePost__Group_2_3__1"
    // InternalRest.g:3468:1: rule__RePost__Group_2_3__1 : rule__RePost__Group_2_3__1__Impl ;
    public final void rule__RePost__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3472:1: ( rule__RePost__Group_2_3__1__Impl )
            // InternalRest.g:3473:2: rule__RePost__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2_3__1"


    // $ANTLR start "rule__RePost__Group_2_3__1__Impl"
    // InternalRest.g:3479:1: rule__RePost__Group_2_3__1__Impl : ( ( rule__RePost__OpsAssignment_2_3_1 ) ) ;
    public final void rule__RePost__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3483:1: ( ( ( rule__RePost__OpsAssignment_2_3_1 ) ) )
            // InternalRest.g:3484:1: ( ( rule__RePost__OpsAssignment_2_3_1 ) )
            {
            // InternalRest.g:3484:1: ( ( rule__RePost__OpsAssignment_2_3_1 ) )
            // InternalRest.g:3485:2: ( rule__RePost__OpsAssignment_2_3_1 )
            {
             before(grammarAccess.getRePostAccess().getOpsAssignment_2_3_1()); 
            // InternalRest.g:3486:2: ( rule__RePost__OpsAssignment_2_3_1 )
            // InternalRest.g:3486:3: rule__RePost__OpsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePost__OpsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getOpsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_2_3__1__Impl"


    // $ANTLR start "rule__RePost__Group_7__0"
    // InternalRest.g:3495:1: rule__RePost__Group_7__0 : rule__RePost__Group_7__0__Impl rule__RePost__Group_7__1 ;
    public final void rule__RePost__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3499:1: ( rule__RePost__Group_7__0__Impl rule__RePost__Group_7__1 )
            // InternalRest.g:3500:2: rule__RePost__Group_7__0__Impl rule__RePost__Group_7__1
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
    // InternalRest.g:3507:1: rule__RePost__Group_7__0__Impl : ( 'data' ) ;
    public final void rule__RePost__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3511:1: ( ( 'data' ) )
            // InternalRest.g:3512:1: ( 'data' )
            {
            // InternalRest.g:3512:1: ( 'data' )
            // InternalRest.g:3513:2: 'data'
            {
             before(grammarAccess.getRePostAccess().getDataKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getDataKeyword_7_0()); 

            }


            }

        }
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
    // InternalRest.g:3522:1: rule__RePost__Group_7__1 : rule__RePost__Group_7__1__Impl rule__RePost__Group_7__2 ;
    public final void rule__RePost__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3526:1: ( rule__RePost__Group_7__1__Impl rule__RePost__Group_7__2 )
            // InternalRest.g:3527:2: rule__RePost__Group_7__1__Impl rule__RePost__Group_7__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:3534:1: rule__RePost__Group_7__1__Impl : ( '{' ) ;
    public final void rule__RePost__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3538:1: ( ( '{' ) )
            // InternalRest.g:3539:1: ( '{' )
            {
            // InternalRest.g:3539:1: ( '{' )
            // InternalRest.g:3540:2: '{'
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
    // InternalRest.g:3549:1: rule__RePost__Group_7__2 : rule__RePost__Group_7__2__Impl rule__RePost__Group_7__3 ;
    public final void rule__RePost__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3553:1: ( rule__RePost__Group_7__2__Impl rule__RePost__Group_7__3 )
            // InternalRest.g:3554:2: rule__RePost__Group_7__2__Impl rule__RePost__Group_7__3
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
    // InternalRest.g:3561:1: rule__RePost__Group_7__2__Impl : ( ( rule__RePost__DataAssignment_7_2 ) ) ;
    public final void rule__RePost__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3565:1: ( ( ( rule__RePost__DataAssignment_7_2 ) ) )
            // InternalRest.g:3566:1: ( ( rule__RePost__DataAssignment_7_2 ) )
            {
            // InternalRest.g:3566:1: ( ( rule__RePost__DataAssignment_7_2 ) )
            // InternalRest.g:3567:2: ( rule__RePost__DataAssignment_7_2 )
            {
             before(grammarAccess.getRePostAccess().getDataAssignment_7_2()); 
            // InternalRest.g:3568:2: ( rule__RePost__DataAssignment_7_2 )
            // InternalRest.g:3568:3: rule__RePost__DataAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__RePost__DataAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getDataAssignment_7_2()); 

            }


            }

        }
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
    // InternalRest.g:3576:1: rule__RePost__Group_7__3 : rule__RePost__Group_7__3__Impl rule__RePost__Group_7__4 ;
    public final void rule__RePost__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3580:1: ( rule__RePost__Group_7__3__Impl rule__RePost__Group_7__4 )
            // InternalRest.g:3581:2: rule__RePost__Group_7__3__Impl rule__RePost__Group_7__4
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
    // InternalRest.g:3588:1: rule__RePost__Group_7__3__Impl : ( ( rule__RePost__Group_7_3__0 )* ) ;
    public final void rule__RePost__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3592:1: ( ( ( rule__RePost__Group_7_3__0 )* ) )
            // InternalRest.g:3593:1: ( ( rule__RePost__Group_7_3__0 )* )
            {
            // InternalRest.g:3593:1: ( ( rule__RePost__Group_7_3__0 )* )
            // InternalRest.g:3594:2: ( rule__RePost__Group_7_3__0 )*
            {
             before(grammarAccess.getRePostAccess().getGroup_7_3()); 
            // InternalRest.g:3595:2: ( rule__RePost__Group_7_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRest.g:3595:3: rule__RePost__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePost__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalRest.g:3603:1: rule__RePost__Group_7__4 : rule__RePost__Group_7__4__Impl ;
    public final void rule__RePost__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3607:1: ( rule__RePost__Group_7__4__Impl )
            // InternalRest.g:3608:2: rule__RePost__Group_7__4__Impl
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
    // InternalRest.g:3614:1: rule__RePost__Group_7__4__Impl : ( '}' ) ;
    public final void rule__RePost__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3618:1: ( ( '}' ) )
            // InternalRest.g:3619:1: ( '}' )
            {
            // InternalRest.g:3619:1: ( '}' )
            // InternalRest.g:3620:2: '}'
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
    // InternalRest.g:3630:1: rule__RePost__Group_7_3__0 : rule__RePost__Group_7_3__0__Impl rule__RePost__Group_7_3__1 ;
    public final void rule__RePost__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3634:1: ( rule__RePost__Group_7_3__0__Impl rule__RePost__Group_7_3__1 )
            // InternalRest.g:3635:2: rule__RePost__Group_7_3__0__Impl rule__RePost__Group_7_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:3642:1: rule__RePost__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__RePost__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3646:1: ( ( ',' ) )
            // InternalRest.g:3647:1: ( ',' )
            {
            // InternalRest.g:3647:1: ( ',' )
            // InternalRest.g:3648:2: ','
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
    // InternalRest.g:3657:1: rule__RePost__Group_7_3__1 : rule__RePost__Group_7_3__1__Impl ;
    public final void rule__RePost__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3661:1: ( rule__RePost__Group_7_3__1__Impl )
            // InternalRest.g:3662:2: rule__RePost__Group_7_3__1__Impl
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
    // InternalRest.g:3668:1: rule__RePost__Group_7_3__1__Impl : ( ( rule__RePost__DataAssignment_7_3_1 ) ) ;
    public final void rule__RePost__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3672:1: ( ( ( rule__RePost__DataAssignment_7_3_1 ) ) )
            // InternalRest.g:3673:1: ( ( rule__RePost__DataAssignment_7_3_1 ) )
            {
            // InternalRest.g:3673:1: ( ( rule__RePost__DataAssignment_7_3_1 ) )
            // InternalRest.g:3674:2: ( rule__RePost__DataAssignment_7_3_1 )
            {
             before(grammarAccess.getRePostAccess().getDataAssignment_7_3_1()); 
            // InternalRest.g:3675:2: ( rule__RePost__DataAssignment_7_3_1 )
            // InternalRest.g:3675:3: rule__RePost__DataAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePost__DataAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getDataAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalRest.g:3684:1: rule__RePut__Group__0 : rule__RePut__Group__0__Impl rule__RePut__Group__1 ;
    public final void rule__RePut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3688:1: ( rule__RePut__Group__0__Impl rule__RePut__Group__1 )
            // InternalRest.g:3689:2: rule__RePut__Group__0__Impl rule__RePut__Group__1
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
    // InternalRest.g:3696:1: rule__RePut__Group__0__Impl : ( 'RePut' ) ;
    public final void rule__RePut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3700:1: ( ( 'RePut' ) )
            // InternalRest.g:3701:1: ( 'RePut' )
            {
            // InternalRest.g:3701:1: ( 'RePut' )
            // InternalRest.g:3702:2: 'RePut'
            {
             before(grammarAccess.getRePutAccess().getRePutKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRest.g:3711:1: rule__RePut__Group__1 : rule__RePut__Group__1__Impl rule__RePut__Group__2 ;
    public final void rule__RePut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3715:1: ( rule__RePut__Group__1__Impl rule__RePut__Group__2 )
            // InternalRest.g:3716:2: rule__RePut__Group__1__Impl rule__RePut__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalRest.g:3723:1: rule__RePut__Group__1__Impl : ( '{' ) ;
    public final void rule__RePut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3727:1: ( ( '{' ) )
            // InternalRest.g:3728:1: ( '{' )
            {
            // InternalRest.g:3728:1: ( '{' )
            // InternalRest.g:3729:2: '{'
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
    // InternalRest.g:3738:1: rule__RePut__Group__2 : rule__RePut__Group__2__Impl rule__RePut__Group__3 ;
    public final void rule__RePut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3742:1: ( rule__RePut__Group__2__Impl rule__RePut__Group__3 )
            // InternalRest.g:3743:2: rule__RePut__Group__2__Impl rule__RePut__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalRest.g:3750:1: rule__RePut__Group__2__Impl : ( ( rule__RePut__Group_2__0 )? ) ;
    public final void rule__RePut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3754:1: ( ( ( rule__RePut__Group_2__0 )? ) )
            // InternalRest.g:3755:1: ( ( rule__RePut__Group_2__0 )? )
            {
            // InternalRest.g:3755:1: ( ( rule__RePut__Group_2__0 )? )
            // InternalRest.g:3756:2: ( rule__RePut__Group_2__0 )?
            {
             before(grammarAccess.getRePutAccess().getGroup_2()); 
            // InternalRest.g:3757:2: ( rule__RePut__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRest.g:3757:3: rule__RePut__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePut__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePutAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalRest.g:3765:1: rule__RePut__Group__3 : rule__RePut__Group__3__Impl rule__RePut__Group__4 ;
    public final void rule__RePut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3769:1: ( rule__RePut__Group__3__Impl rule__RePut__Group__4 )
            // InternalRest.g:3770:2: rule__RePut__Group__3__Impl rule__RePut__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:3777:1: rule__RePut__Group__3__Impl : ( 'succAnswer' ) ;
    public final void rule__RePut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3781:1: ( ( 'succAnswer' ) )
            // InternalRest.g:3782:1: ( 'succAnswer' )
            {
            // InternalRest.g:3782:1: ( 'succAnswer' )
            // InternalRest.g:3783:2: 'succAnswer'
            {
             before(grammarAccess.getRePutAccess().getSuccAnswerKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getSuccAnswerKeyword_3()); 

            }


            }

        }
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
    // InternalRest.g:3792:1: rule__RePut__Group__4 : rule__RePut__Group__4__Impl rule__RePut__Group__5 ;
    public final void rule__RePut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3796:1: ( rule__RePut__Group__4__Impl rule__RePut__Group__5 )
            // InternalRest.g:3797:2: rule__RePut__Group__4__Impl rule__RePut__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalRest.g:3804:1: rule__RePut__Group__4__Impl : ( ( rule__RePut__SuccAnswerAssignment_4 ) ) ;
    public final void rule__RePut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3808:1: ( ( ( rule__RePut__SuccAnswerAssignment_4 ) ) )
            // InternalRest.g:3809:1: ( ( rule__RePut__SuccAnswerAssignment_4 ) )
            {
            // InternalRest.g:3809:1: ( ( rule__RePut__SuccAnswerAssignment_4 ) )
            // InternalRest.g:3810:2: ( rule__RePut__SuccAnswerAssignment_4 )
            {
             before(grammarAccess.getRePutAccess().getSuccAnswerAssignment_4()); 
            // InternalRest.g:3811:2: ( rule__RePut__SuccAnswerAssignment_4 )
            // InternalRest.g:3811:3: rule__RePut__SuccAnswerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RePut__SuccAnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getSuccAnswerAssignment_4()); 

            }


            }

        }
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
    // InternalRest.g:3819:1: rule__RePut__Group__5 : rule__RePut__Group__5__Impl rule__RePut__Group__6 ;
    public final void rule__RePut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3823:1: ( rule__RePut__Group__5__Impl rule__RePut__Group__6 )
            // InternalRest.g:3824:2: rule__RePut__Group__5__Impl rule__RePut__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalRest.g:3831:1: rule__RePut__Group__5__Impl : ( 'route' ) ;
    public final void rule__RePut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3835:1: ( ( 'route' ) )
            // InternalRest.g:3836:1: ( 'route' )
            {
            // InternalRest.g:3836:1: ( 'route' )
            // InternalRest.g:3837:2: 'route'
            {
             before(grammarAccess.getRePutAccess().getRouteKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRouteKeyword_5()); 

            }


            }

        }
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
    // InternalRest.g:3846:1: rule__RePut__Group__6 : rule__RePut__Group__6__Impl rule__RePut__Group__7 ;
    public final void rule__RePut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3850:1: ( rule__RePut__Group__6__Impl rule__RePut__Group__7 )
            // InternalRest.g:3851:2: rule__RePut__Group__6__Impl rule__RePut__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:3858:1: rule__RePut__Group__6__Impl : ( ( rule__RePut__RouteAssignment_6 ) ) ;
    public final void rule__RePut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3862:1: ( ( ( rule__RePut__RouteAssignment_6 ) ) )
            // InternalRest.g:3863:1: ( ( rule__RePut__RouteAssignment_6 ) )
            {
            // InternalRest.g:3863:1: ( ( rule__RePut__RouteAssignment_6 ) )
            // InternalRest.g:3864:2: ( rule__RePut__RouteAssignment_6 )
            {
             before(grammarAccess.getRePutAccess().getRouteAssignment_6()); 
            // InternalRest.g:3865:2: ( rule__RePut__RouteAssignment_6 )
            // InternalRest.g:3865:3: rule__RePut__RouteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RePut__RouteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getRouteAssignment_6()); 

            }


            }

        }
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
    // InternalRest.g:3873:1: rule__RePut__Group__7 : rule__RePut__Group__7__Impl rule__RePut__Group__8 ;
    public final void rule__RePut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3877:1: ( rule__RePut__Group__7__Impl rule__RePut__Group__8 )
            // InternalRest.g:3878:2: rule__RePut__Group__7__Impl rule__RePut__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:3885:1: rule__RePut__Group__7__Impl : ( ( rule__RePut__Group_7__0 )? ) ;
    public final void rule__RePut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3889:1: ( ( ( rule__RePut__Group_7__0 )? ) )
            // InternalRest.g:3890:1: ( ( rule__RePut__Group_7__0 )? )
            {
            // InternalRest.g:3890:1: ( ( rule__RePut__Group_7__0 )? )
            // InternalRest.g:3891:2: ( rule__RePut__Group_7__0 )?
            {
             before(grammarAccess.getRePutAccess().getGroup_7()); 
            // InternalRest.g:3892:2: ( rule__RePut__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRest.g:3892:3: rule__RePut__Group_7__0
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
    // InternalRest.g:3900:1: rule__RePut__Group__8 : rule__RePut__Group__8__Impl ;
    public final void rule__RePut__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3904:1: ( rule__RePut__Group__8__Impl )
            // InternalRest.g:3905:2: rule__RePut__Group__8__Impl
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
    // InternalRest.g:3911:1: rule__RePut__Group__8__Impl : ( '}' ) ;
    public final void rule__RePut__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3915:1: ( ( '}' ) )
            // InternalRest.g:3916:1: ( '}' )
            {
            // InternalRest.g:3916:1: ( '}' )
            // InternalRest.g:3917:2: '}'
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


    // $ANTLR start "rule__RePut__Group_2__0"
    // InternalRest.g:3927:1: rule__RePut__Group_2__0 : rule__RePut__Group_2__0__Impl rule__RePut__Group_2__1 ;
    public final void rule__RePut__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3931:1: ( rule__RePut__Group_2__0__Impl rule__RePut__Group_2__1 )
            // InternalRest.g:3932:2: rule__RePut__Group_2__0__Impl rule__RePut__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__RePut__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__0"


    // $ANTLR start "rule__RePut__Group_2__0__Impl"
    // InternalRest.g:3939:1: rule__RePut__Group_2__0__Impl : ( 'ops' ) ;
    public final void rule__RePut__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3943:1: ( ( 'ops' ) )
            // InternalRest.g:3944:1: ( 'ops' )
            {
            // InternalRest.g:3944:1: ( 'ops' )
            // InternalRest.g:3945:2: 'ops'
            {
             before(grammarAccess.getRePutAccess().getOpsKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getOpsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__0__Impl"


    // $ANTLR start "rule__RePut__Group_2__1"
    // InternalRest.g:3954:1: rule__RePut__Group_2__1 : rule__RePut__Group_2__1__Impl rule__RePut__Group_2__2 ;
    public final void rule__RePut__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3958:1: ( rule__RePut__Group_2__1__Impl rule__RePut__Group_2__2 )
            // InternalRest.g:3959:2: rule__RePut__Group_2__1__Impl rule__RePut__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__RePut__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__1"


    // $ANTLR start "rule__RePut__Group_2__1__Impl"
    // InternalRest.g:3966:1: rule__RePut__Group_2__1__Impl : ( '(' ) ;
    public final void rule__RePut__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3970:1: ( ( '(' ) )
            // InternalRest.g:3971:1: ( '(' )
            {
            // InternalRest.g:3971:1: ( '(' )
            // InternalRest.g:3972:2: '('
            {
             before(grammarAccess.getRePutAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__1__Impl"


    // $ANTLR start "rule__RePut__Group_2__2"
    // InternalRest.g:3981:1: rule__RePut__Group_2__2 : rule__RePut__Group_2__2__Impl rule__RePut__Group_2__3 ;
    public final void rule__RePut__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3985:1: ( rule__RePut__Group_2__2__Impl rule__RePut__Group_2__3 )
            // InternalRest.g:3986:2: rule__RePut__Group_2__2__Impl rule__RePut__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__RePut__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__2"


    // $ANTLR start "rule__RePut__Group_2__2__Impl"
    // InternalRest.g:3993:1: rule__RePut__Group_2__2__Impl : ( ( rule__RePut__OpsAssignment_2_2 ) ) ;
    public final void rule__RePut__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3997:1: ( ( ( rule__RePut__OpsAssignment_2_2 ) ) )
            // InternalRest.g:3998:1: ( ( rule__RePut__OpsAssignment_2_2 ) )
            {
            // InternalRest.g:3998:1: ( ( rule__RePut__OpsAssignment_2_2 ) )
            // InternalRest.g:3999:2: ( rule__RePut__OpsAssignment_2_2 )
            {
             before(grammarAccess.getRePutAccess().getOpsAssignment_2_2()); 
            // InternalRest.g:4000:2: ( rule__RePut__OpsAssignment_2_2 )
            // InternalRest.g:4000:3: rule__RePut__OpsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__RePut__OpsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getOpsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__2__Impl"


    // $ANTLR start "rule__RePut__Group_2__3"
    // InternalRest.g:4008:1: rule__RePut__Group_2__3 : rule__RePut__Group_2__3__Impl rule__RePut__Group_2__4 ;
    public final void rule__RePut__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4012:1: ( rule__RePut__Group_2__3__Impl rule__RePut__Group_2__4 )
            // InternalRest.g:4013:2: rule__RePut__Group_2__3__Impl rule__RePut__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__RePut__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__3"


    // $ANTLR start "rule__RePut__Group_2__3__Impl"
    // InternalRest.g:4020:1: rule__RePut__Group_2__3__Impl : ( ( rule__RePut__Group_2_3__0 )* ) ;
    public final void rule__RePut__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4024:1: ( ( ( rule__RePut__Group_2_3__0 )* ) )
            // InternalRest.g:4025:1: ( ( rule__RePut__Group_2_3__0 )* )
            {
            // InternalRest.g:4025:1: ( ( rule__RePut__Group_2_3__0 )* )
            // InternalRest.g:4026:2: ( rule__RePut__Group_2_3__0 )*
            {
             before(grammarAccess.getRePutAccess().getGroup_2_3()); 
            // InternalRest.g:4027:2: ( rule__RePut__Group_2_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRest.g:4027:3: rule__RePut__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePut__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRePutAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__3__Impl"


    // $ANTLR start "rule__RePut__Group_2__4"
    // InternalRest.g:4035:1: rule__RePut__Group_2__4 : rule__RePut__Group_2__4__Impl ;
    public final void rule__RePut__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4039:1: ( rule__RePut__Group_2__4__Impl )
            // InternalRest.g:4040:2: rule__RePut__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__4"


    // $ANTLR start "rule__RePut__Group_2__4__Impl"
    // InternalRest.g:4046:1: rule__RePut__Group_2__4__Impl : ( ')' ) ;
    public final void rule__RePut__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4050:1: ( ( ')' ) )
            // InternalRest.g:4051:1: ( ')' )
            {
            // InternalRest.g:4051:1: ( ')' )
            // InternalRest.g:4052:2: ')'
            {
             before(grammarAccess.getRePutAccess().getRightParenthesisKeyword_2_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2__4__Impl"


    // $ANTLR start "rule__RePut__Group_2_3__0"
    // InternalRest.g:4062:1: rule__RePut__Group_2_3__0 : rule__RePut__Group_2_3__0__Impl rule__RePut__Group_2_3__1 ;
    public final void rule__RePut__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4066:1: ( rule__RePut__Group_2_3__0__Impl rule__RePut__Group_2_3__1 )
            // InternalRest.g:4067:2: rule__RePut__Group_2_3__0__Impl rule__RePut__Group_2_3__1
            {
            pushFollow(FOLLOW_13);
            rule__RePut__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2_3__0"


    // $ANTLR start "rule__RePut__Group_2_3__0__Impl"
    // InternalRest.g:4074:1: rule__RePut__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__RePut__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4078:1: ( ( ',' ) )
            // InternalRest.g:4079:1: ( ',' )
            {
            // InternalRest.g:4079:1: ( ',' )
            // InternalRest.g:4080:2: ','
            {
             before(grammarAccess.getRePutAccess().getCommaKeyword_2_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2_3__0__Impl"


    // $ANTLR start "rule__RePut__Group_2_3__1"
    // InternalRest.g:4089:1: rule__RePut__Group_2_3__1 : rule__RePut__Group_2_3__1__Impl ;
    public final void rule__RePut__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4093:1: ( rule__RePut__Group_2_3__1__Impl )
            // InternalRest.g:4094:2: rule__RePut__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2_3__1"


    // $ANTLR start "rule__RePut__Group_2_3__1__Impl"
    // InternalRest.g:4100:1: rule__RePut__Group_2_3__1__Impl : ( ( rule__RePut__OpsAssignment_2_3_1 ) ) ;
    public final void rule__RePut__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4104:1: ( ( ( rule__RePut__OpsAssignment_2_3_1 ) ) )
            // InternalRest.g:4105:1: ( ( rule__RePut__OpsAssignment_2_3_1 ) )
            {
            // InternalRest.g:4105:1: ( ( rule__RePut__OpsAssignment_2_3_1 ) )
            // InternalRest.g:4106:2: ( rule__RePut__OpsAssignment_2_3_1 )
            {
             before(grammarAccess.getRePutAccess().getOpsAssignment_2_3_1()); 
            // InternalRest.g:4107:2: ( rule__RePut__OpsAssignment_2_3_1 )
            // InternalRest.g:4107:3: rule__RePut__OpsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePut__OpsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getOpsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_2_3__1__Impl"


    // $ANTLR start "rule__RePut__Group_7__0"
    // InternalRest.g:4116:1: rule__RePut__Group_7__0 : rule__RePut__Group_7__0__Impl rule__RePut__Group_7__1 ;
    public final void rule__RePut__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4120:1: ( rule__RePut__Group_7__0__Impl rule__RePut__Group_7__1 )
            // InternalRest.g:4121:2: rule__RePut__Group_7__0__Impl rule__RePut__Group_7__1
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
    // InternalRest.g:4128:1: rule__RePut__Group_7__0__Impl : ( 'data' ) ;
    public final void rule__RePut__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4132:1: ( ( 'data' ) )
            // InternalRest.g:4133:1: ( 'data' )
            {
            // InternalRest.g:4133:1: ( 'data' )
            // InternalRest.g:4134:2: 'data'
            {
             before(grammarAccess.getRePutAccess().getDataKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getDataKeyword_7_0()); 

            }


            }

        }
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
    // InternalRest.g:4143:1: rule__RePut__Group_7__1 : rule__RePut__Group_7__1__Impl rule__RePut__Group_7__2 ;
    public final void rule__RePut__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4147:1: ( rule__RePut__Group_7__1__Impl rule__RePut__Group_7__2 )
            // InternalRest.g:4148:2: rule__RePut__Group_7__1__Impl rule__RePut__Group_7__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:4155:1: rule__RePut__Group_7__1__Impl : ( '{' ) ;
    public final void rule__RePut__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4159:1: ( ( '{' ) )
            // InternalRest.g:4160:1: ( '{' )
            {
            // InternalRest.g:4160:1: ( '{' )
            // InternalRest.g:4161:2: '{'
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
    // InternalRest.g:4170:1: rule__RePut__Group_7__2 : rule__RePut__Group_7__2__Impl rule__RePut__Group_7__3 ;
    public final void rule__RePut__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4174:1: ( rule__RePut__Group_7__2__Impl rule__RePut__Group_7__3 )
            // InternalRest.g:4175:2: rule__RePut__Group_7__2__Impl rule__RePut__Group_7__3
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
    // InternalRest.g:4182:1: rule__RePut__Group_7__2__Impl : ( ( rule__RePut__DataAssignment_7_2 ) ) ;
    public final void rule__RePut__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4186:1: ( ( ( rule__RePut__DataAssignment_7_2 ) ) )
            // InternalRest.g:4187:1: ( ( rule__RePut__DataAssignment_7_2 ) )
            {
            // InternalRest.g:4187:1: ( ( rule__RePut__DataAssignment_7_2 ) )
            // InternalRest.g:4188:2: ( rule__RePut__DataAssignment_7_2 )
            {
             before(grammarAccess.getRePutAccess().getDataAssignment_7_2()); 
            // InternalRest.g:4189:2: ( rule__RePut__DataAssignment_7_2 )
            // InternalRest.g:4189:3: rule__RePut__DataAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__RePut__DataAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getDataAssignment_7_2()); 

            }


            }

        }
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
    // InternalRest.g:4197:1: rule__RePut__Group_7__3 : rule__RePut__Group_7__3__Impl rule__RePut__Group_7__4 ;
    public final void rule__RePut__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4201:1: ( rule__RePut__Group_7__3__Impl rule__RePut__Group_7__4 )
            // InternalRest.g:4202:2: rule__RePut__Group_7__3__Impl rule__RePut__Group_7__4
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
    // InternalRest.g:4209:1: rule__RePut__Group_7__3__Impl : ( ( rule__RePut__Group_7_3__0 )* ) ;
    public final void rule__RePut__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4213:1: ( ( ( rule__RePut__Group_7_3__0 )* ) )
            // InternalRest.g:4214:1: ( ( rule__RePut__Group_7_3__0 )* )
            {
            // InternalRest.g:4214:1: ( ( rule__RePut__Group_7_3__0 )* )
            // InternalRest.g:4215:2: ( rule__RePut__Group_7_3__0 )*
            {
             before(grammarAccess.getRePutAccess().getGroup_7_3()); 
            // InternalRest.g:4216:2: ( rule__RePut__Group_7_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRest.g:4216:3: rule__RePut__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePut__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalRest.g:4224:1: rule__RePut__Group_7__4 : rule__RePut__Group_7__4__Impl ;
    public final void rule__RePut__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4228:1: ( rule__RePut__Group_7__4__Impl )
            // InternalRest.g:4229:2: rule__RePut__Group_7__4__Impl
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
    // InternalRest.g:4235:1: rule__RePut__Group_7__4__Impl : ( '}' ) ;
    public final void rule__RePut__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4239:1: ( ( '}' ) )
            // InternalRest.g:4240:1: ( '}' )
            {
            // InternalRest.g:4240:1: ( '}' )
            // InternalRest.g:4241:2: '}'
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
    // InternalRest.g:4251:1: rule__RePut__Group_7_3__0 : rule__RePut__Group_7_3__0__Impl rule__RePut__Group_7_3__1 ;
    public final void rule__RePut__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4255:1: ( rule__RePut__Group_7_3__0__Impl rule__RePut__Group_7_3__1 )
            // InternalRest.g:4256:2: rule__RePut__Group_7_3__0__Impl rule__RePut__Group_7_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:4263:1: rule__RePut__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__RePut__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4267:1: ( ( ',' ) )
            // InternalRest.g:4268:1: ( ',' )
            {
            // InternalRest.g:4268:1: ( ',' )
            // InternalRest.g:4269:2: ','
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
    // InternalRest.g:4278:1: rule__RePut__Group_7_3__1 : rule__RePut__Group_7_3__1__Impl ;
    public final void rule__RePut__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4282:1: ( rule__RePut__Group_7_3__1__Impl )
            // InternalRest.g:4283:2: rule__RePut__Group_7_3__1__Impl
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
    // InternalRest.g:4289:1: rule__RePut__Group_7_3__1__Impl : ( ( rule__RePut__DataAssignment_7_3_1 ) ) ;
    public final void rule__RePut__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4293:1: ( ( ( rule__RePut__DataAssignment_7_3_1 ) ) )
            // InternalRest.g:4294:1: ( ( rule__RePut__DataAssignment_7_3_1 ) )
            {
            // InternalRest.g:4294:1: ( ( rule__RePut__DataAssignment_7_3_1 ) )
            // InternalRest.g:4295:2: ( rule__RePut__DataAssignment_7_3_1 )
            {
             before(grammarAccess.getRePutAccess().getDataAssignment_7_3_1()); 
            // InternalRest.g:4296:2: ( rule__RePut__DataAssignment_7_3_1 )
            // InternalRest.g:4296:3: rule__RePut__DataAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePut__DataAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getDataAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalRest.g:4305:1: rule__ReDelete__Group__0 : rule__ReDelete__Group__0__Impl rule__ReDelete__Group__1 ;
    public final void rule__ReDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4309:1: ( rule__ReDelete__Group__0__Impl rule__ReDelete__Group__1 )
            // InternalRest.g:4310:2: rule__ReDelete__Group__0__Impl rule__ReDelete__Group__1
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
    // InternalRest.g:4317:1: rule__ReDelete__Group__0__Impl : ( 'ReDelete' ) ;
    public final void rule__ReDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4321:1: ( ( 'ReDelete' ) )
            // InternalRest.g:4322:1: ( 'ReDelete' )
            {
            // InternalRest.g:4322:1: ( 'ReDelete' )
            // InternalRest.g:4323:2: 'ReDelete'
            {
             before(grammarAccess.getReDeleteAccess().getReDeleteKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRest.g:4332:1: rule__ReDelete__Group__1 : rule__ReDelete__Group__1__Impl rule__ReDelete__Group__2 ;
    public final void rule__ReDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4336:1: ( rule__ReDelete__Group__1__Impl rule__ReDelete__Group__2 )
            // InternalRest.g:4337:2: rule__ReDelete__Group__1__Impl rule__ReDelete__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalRest.g:4344:1: rule__ReDelete__Group__1__Impl : ( '{' ) ;
    public final void rule__ReDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4348:1: ( ( '{' ) )
            // InternalRest.g:4349:1: ( '{' )
            {
            // InternalRest.g:4349:1: ( '{' )
            // InternalRest.g:4350:2: '{'
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
    // InternalRest.g:4359:1: rule__ReDelete__Group__2 : rule__ReDelete__Group__2__Impl rule__ReDelete__Group__3 ;
    public final void rule__ReDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4363:1: ( rule__ReDelete__Group__2__Impl rule__ReDelete__Group__3 )
            // InternalRest.g:4364:2: rule__ReDelete__Group__2__Impl rule__ReDelete__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalRest.g:4371:1: rule__ReDelete__Group__2__Impl : ( ( rule__ReDelete__Group_2__0 )? ) ;
    public final void rule__ReDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4375:1: ( ( ( rule__ReDelete__Group_2__0 )? ) )
            // InternalRest.g:4376:1: ( ( rule__ReDelete__Group_2__0 )? )
            {
            // InternalRest.g:4376:1: ( ( rule__ReDelete__Group_2__0 )? )
            // InternalRest.g:4377:2: ( rule__ReDelete__Group_2__0 )?
            {
             before(grammarAccess.getReDeleteAccess().getGroup_2()); 
            // InternalRest.g:4378:2: ( rule__ReDelete__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRest.g:4378:3: rule__ReDelete__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReDelete__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReDeleteAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalRest.g:4386:1: rule__ReDelete__Group__3 : rule__ReDelete__Group__3__Impl rule__ReDelete__Group__4 ;
    public final void rule__ReDelete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4390:1: ( rule__ReDelete__Group__3__Impl rule__ReDelete__Group__4 )
            // InternalRest.g:4391:2: rule__ReDelete__Group__3__Impl rule__ReDelete__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:4398:1: rule__ReDelete__Group__3__Impl : ( 'succAnswer' ) ;
    public final void rule__ReDelete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4402:1: ( ( 'succAnswer' ) )
            // InternalRest.g:4403:1: ( 'succAnswer' )
            {
            // InternalRest.g:4403:1: ( 'succAnswer' )
            // InternalRest.g:4404:2: 'succAnswer'
            {
             before(grammarAccess.getReDeleteAccess().getSuccAnswerKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getSuccAnswerKeyword_3()); 

            }


            }

        }
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
    // InternalRest.g:4413:1: rule__ReDelete__Group__4 : rule__ReDelete__Group__4__Impl rule__ReDelete__Group__5 ;
    public final void rule__ReDelete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4417:1: ( rule__ReDelete__Group__4__Impl rule__ReDelete__Group__5 )
            // InternalRest.g:4418:2: rule__ReDelete__Group__4__Impl rule__ReDelete__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalRest.g:4425:1: rule__ReDelete__Group__4__Impl : ( ( rule__ReDelete__SuccAnswerAssignment_4 ) ) ;
    public final void rule__ReDelete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4429:1: ( ( ( rule__ReDelete__SuccAnswerAssignment_4 ) ) )
            // InternalRest.g:4430:1: ( ( rule__ReDelete__SuccAnswerAssignment_4 ) )
            {
            // InternalRest.g:4430:1: ( ( rule__ReDelete__SuccAnswerAssignment_4 ) )
            // InternalRest.g:4431:2: ( rule__ReDelete__SuccAnswerAssignment_4 )
            {
             before(grammarAccess.getReDeleteAccess().getSuccAnswerAssignment_4()); 
            // InternalRest.g:4432:2: ( rule__ReDelete__SuccAnswerAssignment_4 )
            // InternalRest.g:4432:3: rule__ReDelete__SuccAnswerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__SuccAnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getSuccAnswerAssignment_4()); 

            }


            }

        }
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
    // InternalRest.g:4440:1: rule__ReDelete__Group__5 : rule__ReDelete__Group__5__Impl rule__ReDelete__Group__6 ;
    public final void rule__ReDelete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4444:1: ( rule__ReDelete__Group__5__Impl rule__ReDelete__Group__6 )
            // InternalRest.g:4445:2: rule__ReDelete__Group__5__Impl rule__ReDelete__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalRest.g:4452:1: rule__ReDelete__Group__5__Impl : ( 'route' ) ;
    public final void rule__ReDelete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4456:1: ( ( 'route' ) )
            // InternalRest.g:4457:1: ( 'route' )
            {
            // InternalRest.g:4457:1: ( 'route' )
            // InternalRest.g:4458:2: 'route'
            {
             before(grammarAccess.getReDeleteAccess().getRouteKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRouteKeyword_5()); 

            }


            }

        }
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
    // InternalRest.g:4467:1: rule__ReDelete__Group__6 : rule__ReDelete__Group__6__Impl rule__ReDelete__Group__7 ;
    public final void rule__ReDelete__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4471:1: ( rule__ReDelete__Group__6__Impl rule__ReDelete__Group__7 )
            // InternalRest.g:4472:2: rule__ReDelete__Group__6__Impl rule__ReDelete__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:4479:1: rule__ReDelete__Group__6__Impl : ( ( rule__ReDelete__RouteAssignment_6 ) ) ;
    public final void rule__ReDelete__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4483:1: ( ( ( rule__ReDelete__RouteAssignment_6 ) ) )
            // InternalRest.g:4484:1: ( ( rule__ReDelete__RouteAssignment_6 ) )
            {
            // InternalRest.g:4484:1: ( ( rule__ReDelete__RouteAssignment_6 ) )
            // InternalRest.g:4485:2: ( rule__ReDelete__RouteAssignment_6 )
            {
             before(grammarAccess.getReDeleteAccess().getRouteAssignment_6()); 
            // InternalRest.g:4486:2: ( rule__ReDelete__RouteAssignment_6 )
            // InternalRest.g:4486:3: rule__ReDelete__RouteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__RouteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getRouteAssignment_6()); 

            }


            }

        }
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
    // InternalRest.g:4494:1: rule__ReDelete__Group__7 : rule__ReDelete__Group__7__Impl rule__ReDelete__Group__8 ;
    public final void rule__ReDelete__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4498:1: ( rule__ReDelete__Group__7__Impl rule__ReDelete__Group__8 )
            // InternalRest.g:4499:2: rule__ReDelete__Group__7__Impl rule__ReDelete__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:4506:1: rule__ReDelete__Group__7__Impl : ( ( rule__ReDelete__Group_7__0 )? ) ;
    public final void rule__ReDelete__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4510:1: ( ( ( rule__ReDelete__Group_7__0 )? ) )
            // InternalRest.g:4511:1: ( ( rule__ReDelete__Group_7__0 )? )
            {
            // InternalRest.g:4511:1: ( ( rule__ReDelete__Group_7__0 )? )
            // InternalRest.g:4512:2: ( rule__ReDelete__Group_7__0 )?
            {
             before(grammarAccess.getReDeleteAccess().getGroup_7()); 
            // InternalRest.g:4513:2: ( rule__ReDelete__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRest.g:4513:3: rule__ReDelete__Group_7__0
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
    // InternalRest.g:4521:1: rule__ReDelete__Group__8 : rule__ReDelete__Group__8__Impl ;
    public final void rule__ReDelete__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4525:1: ( rule__ReDelete__Group__8__Impl )
            // InternalRest.g:4526:2: rule__ReDelete__Group__8__Impl
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
    // InternalRest.g:4532:1: rule__ReDelete__Group__8__Impl : ( '}' ) ;
    public final void rule__ReDelete__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4536:1: ( ( '}' ) )
            // InternalRest.g:4537:1: ( '}' )
            {
            // InternalRest.g:4537:1: ( '}' )
            // InternalRest.g:4538:2: '}'
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


    // $ANTLR start "rule__ReDelete__Group_2__0"
    // InternalRest.g:4548:1: rule__ReDelete__Group_2__0 : rule__ReDelete__Group_2__0__Impl rule__ReDelete__Group_2__1 ;
    public final void rule__ReDelete__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4552:1: ( rule__ReDelete__Group_2__0__Impl rule__ReDelete__Group_2__1 )
            // InternalRest.g:4553:2: rule__ReDelete__Group_2__0__Impl rule__ReDelete__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__ReDelete__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__0"


    // $ANTLR start "rule__ReDelete__Group_2__0__Impl"
    // InternalRest.g:4560:1: rule__ReDelete__Group_2__0__Impl : ( 'ops' ) ;
    public final void rule__ReDelete__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4564:1: ( ( 'ops' ) )
            // InternalRest.g:4565:1: ( 'ops' )
            {
            // InternalRest.g:4565:1: ( 'ops' )
            // InternalRest.g:4566:2: 'ops'
            {
             before(grammarAccess.getReDeleteAccess().getOpsKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getOpsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_2__1"
    // InternalRest.g:4575:1: rule__ReDelete__Group_2__1 : rule__ReDelete__Group_2__1__Impl rule__ReDelete__Group_2__2 ;
    public final void rule__ReDelete__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4579:1: ( rule__ReDelete__Group_2__1__Impl rule__ReDelete__Group_2__2 )
            // InternalRest.g:4580:2: rule__ReDelete__Group_2__1__Impl rule__ReDelete__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__ReDelete__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__1"


    // $ANTLR start "rule__ReDelete__Group_2__1__Impl"
    // InternalRest.g:4587:1: rule__ReDelete__Group_2__1__Impl : ( '(' ) ;
    public final void rule__ReDelete__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4591:1: ( ( '(' ) )
            // InternalRest.g:4592:1: ( '(' )
            {
            // InternalRest.g:4592:1: ( '(' )
            // InternalRest.g:4593:2: '('
            {
             before(grammarAccess.getReDeleteAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__1__Impl"


    // $ANTLR start "rule__ReDelete__Group_2__2"
    // InternalRest.g:4602:1: rule__ReDelete__Group_2__2 : rule__ReDelete__Group_2__2__Impl rule__ReDelete__Group_2__3 ;
    public final void rule__ReDelete__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4606:1: ( rule__ReDelete__Group_2__2__Impl rule__ReDelete__Group_2__3 )
            // InternalRest.g:4607:2: rule__ReDelete__Group_2__2__Impl rule__ReDelete__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__ReDelete__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__2"


    // $ANTLR start "rule__ReDelete__Group_2__2__Impl"
    // InternalRest.g:4614:1: rule__ReDelete__Group_2__2__Impl : ( ( rule__ReDelete__OpsAssignment_2_2 ) ) ;
    public final void rule__ReDelete__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4618:1: ( ( ( rule__ReDelete__OpsAssignment_2_2 ) ) )
            // InternalRest.g:4619:1: ( ( rule__ReDelete__OpsAssignment_2_2 ) )
            {
            // InternalRest.g:4619:1: ( ( rule__ReDelete__OpsAssignment_2_2 ) )
            // InternalRest.g:4620:2: ( rule__ReDelete__OpsAssignment_2_2 )
            {
             before(grammarAccess.getReDeleteAccess().getOpsAssignment_2_2()); 
            // InternalRest.g:4621:2: ( rule__ReDelete__OpsAssignment_2_2 )
            // InternalRest.g:4621:3: rule__ReDelete__OpsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__OpsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getOpsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__2__Impl"


    // $ANTLR start "rule__ReDelete__Group_2__3"
    // InternalRest.g:4629:1: rule__ReDelete__Group_2__3 : rule__ReDelete__Group_2__3__Impl rule__ReDelete__Group_2__4 ;
    public final void rule__ReDelete__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4633:1: ( rule__ReDelete__Group_2__3__Impl rule__ReDelete__Group_2__4 )
            // InternalRest.g:4634:2: rule__ReDelete__Group_2__3__Impl rule__ReDelete__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__ReDelete__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__3"


    // $ANTLR start "rule__ReDelete__Group_2__3__Impl"
    // InternalRest.g:4641:1: rule__ReDelete__Group_2__3__Impl : ( ( rule__ReDelete__Group_2_3__0 )* ) ;
    public final void rule__ReDelete__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4645:1: ( ( ( rule__ReDelete__Group_2_3__0 )* ) )
            // InternalRest.g:4646:1: ( ( rule__ReDelete__Group_2_3__0 )* )
            {
            // InternalRest.g:4646:1: ( ( rule__ReDelete__Group_2_3__0 )* )
            // InternalRest.g:4647:2: ( rule__ReDelete__Group_2_3__0 )*
            {
             before(grammarAccess.getReDeleteAccess().getGroup_2_3()); 
            // InternalRest.g:4648:2: ( rule__ReDelete__Group_2_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRest.g:4648:3: rule__ReDelete__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReDelete__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getReDeleteAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__3__Impl"


    // $ANTLR start "rule__ReDelete__Group_2__4"
    // InternalRest.g:4656:1: rule__ReDelete__Group_2__4 : rule__ReDelete__Group_2__4__Impl ;
    public final void rule__ReDelete__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4660:1: ( rule__ReDelete__Group_2__4__Impl )
            // InternalRest.g:4661:2: rule__ReDelete__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__4"


    // $ANTLR start "rule__ReDelete__Group_2__4__Impl"
    // InternalRest.g:4667:1: rule__ReDelete__Group_2__4__Impl : ( ')' ) ;
    public final void rule__ReDelete__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4671:1: ( ( ')' ) )
            // InternalRest.g:4672:1: ( ')' )
            {
            // InternalRest.g:4672:1: ( ')' )
            // InternalRest.g:4673:2: ')'
            {
             before(grammarAccess.getReDeleteAccess().getRightParenthesisKeyword_2_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2__4__Impl"


    // $ANTLR start "rule__ReDelete__Group_2_3__0"
    // InternalRest.g:4683:1: rule__ReDelete__Group_2_3__0 : rule__ReDelete__Group_2_3__0__Impl rule__ReDelete__Group_2_3__1 ;
    public final void rule__ReDelete__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4687:1: ( rule__ReDelete__Group_2_3__0__Impl rule__ReDelete__Group_2_3__1 )
            // InternalRest.g:4688:2: rule__ReDelete__Group_2_3__0__Impl rule__ReDelete__Group_2_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ReDelete__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2_3__0"


    // $ANTLR start "rule__ReDelete__Group_2_3__0__Impl"
    // InternalRest.g:4695:1: rule__ReDelete__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__ReDelete__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4699:1: ( ( ',' ) )
            // InternalRest.g:4700:1: ( ',' )
            {
            // InternalRest.g:4700:1: ( ',' )
            // InternalRest.g:4701:2: ','
            {
             before(grammarAccess.getReDeleteAccess().getCommaKeyword_2_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2_3__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_2_3__1"
    // InternalRest.g:4710:1: rule__ReDelete__Group_2_3__1 : rule__ReDelete__Group_2_3__1__Impl ;
    public final void rule__ReDelete__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4714:1: ( rule__ReDelete__Group_2_3__1__Impl )
            // InternalRest.g:4715:2: rule__ReDelete__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2_3__1"


    // $ANTLR start "rule__ReDelete__Group_2_3__1__Impl"
    // InternalRest.g:4721:1: rule__ReDelete__Group_2_3__1__Impl : ( ( rule__ReDelete__OpsAssignment_2_3_1 ) ) ;
    public final void rule__ReDelete__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4725:1: ( ( ( rule__ReDelete__OpsAssignment_2_3_1 ) ) )
            // InternalRest.g:4726:1: ( ( rule__ReDelete__OpsAssignment_2_3_1 ) )
            {
            // InternalRest.g:4726:1: ( ( rule__ReDelete__OpsAssignment_2_3_1 ) )
            // InternalRest.g:4727:2: ( rule__ReDelete__OpsAssignment_2_3_1 )
            {
             before(grammarAccess.getReDeleteAccess().getOpsAssignment_2_3_1()); 
            // InternalRest.g:4728:2: ( rule__ReDelete__OpsAssignment_2_3_1 )
            // InternalRest.g:4728:3: rule__ReDelete__OpsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__OpsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getOpsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_2_3__1__Impl"


    // $ANTLR start "rule__ReDelete__Group_7__0"
    // InternalRest.g:4737:1: rule__ReDelete__Group_7__0 : rule__ReDelete__Group_7__0__Impl rule__ReDelete__Group_7__1 ;
    public final void rule__ReDelete__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4741:1: ( rule__ReDelete__Group_7__0__Impl rule__ReDelete__Group_7__1 )
            // InternalRest.g:4742:2: rule__ReDelete__Group_7__0__Impl rule__ReDelete__Group_7__1
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
    // InternalRest.g:4749:1: rule__ReDelete__Group_7__0__Impl : ( 'data' ) ;
    public final void rule__ReDelete__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4753:1: ( ( 'data' ) )
            // InternalRest.g:4754:1: ( 'data' )
            {
            // InternalRest.g:4754:1: ( 'data' )
            // InternalRest.g:4755:2: 'data'
            {
             before(grammarAccess.getReDeleteAccess().getDataKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getDataKeyword_7_0()); 

            }


            }

        }
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
    // InternalRest.g:4764:1: rule__ReDelete__Group_7__1 : rule__ReDelete__Group_7__1__Impl rule__ReDelete__Group_7__2 ;
    public final void rule__ReDelete__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4768:1: ( rule__ReDelete__Group_7__1__Impl rule__ReDelete__Group_7__2 )
            // InternalRest.g:4769:2: rule__ReDelete__Group_7__1__Impl rule__ReDelete__Group_7__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:4776:1: rule__ReDelete__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ReDelete__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4780:1: ( ( '{' ) )
            // InternalRest.g:4781:1: ( '{' )
            {
            // InternalRest.g:4781:1: ( '{' )
            // InternalRest.g:4782:2: '{'
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
    // InternalRest.g:4791:1: rule__ReDelete__Group_7__2 : rule__ReDelete__Group_7__2__Impl rule__ReDelete__Group_7__3 ;
    public final void rule__ReDelete__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4795:1: ( rule__ReDelete__Group_7__2__Impl rule__ReDelete__Group_7__3 )
            // InternalRest.g:4796:2: rule__ReDelete__Group_7__2__Impl rule__ReDelete__Group_7__3
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
    // InternalRest.g:4803:1: rule__ReDelete__Group_7__2__Impl : ( ( rule__ReDelete__DataAssignment_7_2 ) ) ;
    public final void rule__ReDelete__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4807:1: ( ( ( rule__ReDelete__DataAssignment_7_2 ) ) )
            // InternalRest.g:4808:1: ( ( rule__ReDelete__DataAssignment_7_2 ) )
            {
            // InternalRest.g:4808:1: ( ( rule__ReDelete__DataAssignment_7_2 ) )
            // InternalRest.g:4809:2: ( rule__ReDelete__DataAssignment_7_2 )
            {
             before(grammarAccess.getReDeleteAccess().getDataAssignment_7_2()); 
            // InternalRest.g:4810:2: ( rule__ReDelete__DataAssignment_7_2 )
            // InternalRest.g:4810:3: rule__ReDelete__DataAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__DataAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getDataAssignment_7_2()); 

            }


            }

        }
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
    // InternalRest.g:4818:1: rule__ReDelete__Group_7__3 : rule__ReDelete__Group_7__3__Impl rule__ReDelete__Group_7__4 ;
    public final void rule__ReDelete__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4822:1: ( rule__ReDelete__Group_7__3__Impl rule__ReDelete__Group_7__4 )
            // InternalRest.g:4823:2: rule__ReDelete__Group_7__3__Impl rule__ReDelete__Group_7__4
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
    // InternalRest.g:4830:1: rule__ReDelete__Group_7__3__Impl : ( ( rule__ReDelete__Group_7_3__0 )* ) ;
    public final void rule__ReDelete__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4834:1: ( ( ( rule__ReDelete__Group_7_3__0 )* ) )
            // InternalRest.g:4835:1: ( ( rule__ReDelete__Group_7_3__0 )* )
            {
            // InternalRest.g:4835:1: ( ( rule__ReDelete__Group_7_3__0 )* )
            // InternalRest.g:4836:2: ( rule__ReDelete__Group_7_3__0 )*
            {
             before(grammarAccess.getReDeleteAccess().getGroup_7_3()); 
            // InternalRest.g:4837:2: ( rule__ReDelete__Group_7_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRest.g:4837:3: rule__ReDelete__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReDelete__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalRest.g:4845:1: rule__ReDelete__Group_7__4 : rule__ReDelete__Group_7__4__Impl ;
    public final void rule__ReDelete__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4849:1: ( rule__ReDelete__Group_7__4__Impl )
            // InternalRest.g:4850:2: rule__ReDelete__Group_7__4__Impl
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
    // InternalRest.g:4856:1: rule__ReDelete__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ReDelete__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4860:1: ( ( '}' ) )
            // InternalRest.g:4861:1: ( '}' )
            {
            // InternalRest.g:4861:1: ( '}' )
            // InternalRest.g:4862:2: '}'
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
    // InternalRest.g:4872:1: rule__ReDelete__Group_7_3__0 : rule__ReDelete__Group_7_3__0__Impl rule__ReDelete__Group_7_3__1 ;
    public final void rule__ReDelete__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4876:1: ( rule__ReDelete__Group_7_3__0__Impl rule__ReDelete__Group_7_3__1 )
            // InternalRest.g:4877:2: rule__ReDelete__Group_7_3__0__Impl rule__ReDelete__Group_7_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:4884:1: rule__ReDelete__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ReDelete__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4888:1: ( ( ',' ) )
            // InternalRest.g:4889:1: ( ',' )
            {
            // InternalRest.g:4889:1: ( ',' )
            // InternalRest.g:4890:2: ','
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
    // InternalRest.g:4899:1: rule__ReDelete__Group_7_3__1 : rule__ReDelete__Group_7_3__1__Impl ;
    public final void rule__ReDelete__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4903:1: ( rule__ReDelete__Group_7_3__1__Impl )
            // InternalRest.g:4904:2: rule__ReDelete__Group_7_3__1__Impl
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
    // InternalRest.g:4910:1: rule__ReDelete__Group_7_3__1__Impl : ( ( rule__ReDelete__DataAssignment_7_3_1 ) ) ;
    public final void rule__ReDelete__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4914:1: ( ( ( rule__ReDelete__DataAssignment_7_3_1 ) ) )
            // InternalRest.g:4915:1: ( ( rule__ReDelete__DataAssignment_7_3_1 ) )
            {
            // InternalRest.g:4915:1: ( ( rule__ReDelete__DataAssignment_7_3_1 ) )
            // InternalRest.g:4916:2: ( rule__ReDelete__DataAssignment_7_3_1 )
            {
             before(grammarAccess.getReDeleteAccess().getDataAssignment_7_3_1()); 
            // InternalRest.g:4917:2: ( rule__ReDelete__DataAssignment_7_3_1 )
            // InternalRest.g:4917:3: rule__ReDelete__DataAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__DataAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getDataAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalRest.g:4926:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4930:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // InternalRest.g:4931:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRest.g:4938:1: rule__Segment__Group__0__Impl : ( () ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4942:1: ( ( () ) )
            // InternalRest.g:4943:1: ( () )
            {
            // InternalRest.g:4943:1: ( () )
            // InternalRest.g:4944:2: ()
            {
             before(grammarAccess.getSegmentAccess().getSegmentAction_0()); 
            // InternalRest.g:4945:2: ()
            // InternalRest.g:4945:3: 
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
    // InternalRest.g:4953:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4957:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // InternalRest.g:4958:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
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
    // InternalRest.g:4965:1: rule__Segment__Group__1__Impl : ( 'Segment' ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4969:1: ( ( 'Segment' ) )
            // InternalRest.g:4970:1: ( 'Segment' )
            {
            // InternalRest.g:4970:1: ( 'Segment' )
            // InternalRest.g:4971:2: 'Segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRest.g:4980:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4984:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // InternalRest.g:4985:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
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
    // InternalRest.g:4992:1: rule__Segment__Group__2__Impl : ( '{' ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4996:1: ( ( '{' ) )
            // InternalRest.g:4997:1: ( '{' )
            {
            // InternalRest.g:4997:1: ( '{' )
            // InternalRest.g:4998:2: '{'
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
    // InternalRest.g:5007:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5011:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // InternalRest.g:5012:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
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
    // InternalRest.g:5019:1: rule__Segment__Group__3__Impl : ( ( rule__Segment__Group_3__0 )? ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5023:1: ( ( ( rule__Segment__Group_3__0 )? ) )
            // InternalRest.g:5024:1: ( ( rule__Segment__Group_3__0 )? )
            {
            // InternalRest.g:5024:1: ( ( rule__Segment__Group_3__0 )? )
            // InternalRest.g:5025:2: ( rule__Segment__Group_3__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_3()); 
            // InternalRest.g:5026:2: ( rule__Segment__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRest.g:5026:3: rule__Segment__Group_3__0
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
    // InternalRest.g:5034:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5038:1: ( rule__Segment__Group__4__Impl )
            // InternalRest.g:5039:2: rule__Segment__Group__4__Impl
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
    // InternalRest.g:5045:1: rule__Segment__Group__4__Impl : ( '}' ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5049:1: ( ( '}' ) )
            // InternalRest.g:5050:1: ( '}' )
            {
            // InternalRest.g:5050:1: ( '}' )
            // InternalRest.g:5051:2: '}'
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
    // InternalRest.g:5061:1: rule__Segment__Group_3__0 : rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1 ;
    public final void rule__Segment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5065:1: ( rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1 )
            // InternalRest.g:5066:2: rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:5073:1: rule__Segment__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__Segment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5077:1: ( ( 'value' ) )
            // InternalRest.g:5078:1: ( 'value' )
            {
            // InternalRest.g:5078:1: ( 'value' )
            // InternalRest.g:5079:2: 'value'
            {
             before(grammarAccess.getSegmentAccess().getValueKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRest.g:5088:1: rule__Segment__Group_3__1 : rule__Segment__Group_3__1__Impl ;
    public final void rule__Segment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5092:1: ( rule__Segment__Group_3__1__Impl )
            // InternalRest.g:5093:2: rule__Segment__Group_3__1__Impl
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
    // InternalRest.g:5099:1: rule__Segment__Group_3__1__Impl : ( ( rule__Segment__ValueAssignment_3_1 ) ) ;
    public final void rule__Segment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5103:1: ( ( ( rule__Segment__ValueAssignment_3_1 ) ) )
            // InternalRest.g:5104:1: ( ( rule__Segment__ValueAssignment_3_1 ) )
            {
            // InternalRest.g:5104:1: ( ( rule__Segment__ValueAssignment_3_1 ) )
            // InternalRest.g:5105:2: ( rule__Segment__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSegmentAccess().getValueAssignment_3_1()); 
            // InternalRest.g:5106:2: ( rule__Segment__ValueAssignment_3_1 )
            // InternalRest.g:5106:3: rule__Segment__ValueAssignment_3_1
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


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalRest.g:5115:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5119:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalRest.g:5120:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalRest.g:5127:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5131:1: ( ( () ) )
            // InternalRest.g:5132:1: ( () )
            {
            // InternalRest.g:5132:1: ( () )
            // InternalRest.g:5133:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalRest.g:5134:2: ()
            // InternalRest.g:5134:3: 
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
    // InternalRest.g:5142:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5146:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalRest.g:5147:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:5154:1: rule__Parameter__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5158:1: ( ( 'Parameter' ) )
            // InternalRest.g:5159:1: ( 'Parameter' )
            {
            // InternalRest.g:5159:1: ( 'Parameter' )
            // InternalRest.g:5160:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRest.g:5169:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5173:1: ( rule__Parameter__Group__2__Impl )
            // InternalRest.g:5174:2: rule__Parameter__Group__2__Impl
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
    // InternalRest.g:5180:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5184:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalRest.g:5185:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalRest.g:5185:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalRest.g:5186:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalRest.g:5187:2: ( rule__Parameter__NameAssignment_2 )
            // InternalRest.g:5187:3: rule__Parameter__NameAssignment_2
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


    // $ANTLR start "rule__Attachments__Group__0"
    // InternalRest.g:5196:1: rule__Attachments__Group__0 : rule__Attachments__Group__0__Impl rule__Attachments__Group__1 ;
    public final void rule__Attachments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5200:1: ( rule__Attachments__Group__0__Impl rule__Attachments__Group__1 )
            // InternalRest.g:5201:2: rule__Attachments__Group__0__Impl rule__Attachments__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Attachments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachments__Group__0"


    // $ANTLR start "rule__Attachments__Group__0__Impl"
    // InternalRest.g:5208:1: rule__Attachments__Group__0__Impl : ( () ) ;
    public final void rule__Attachments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5212:1: ( ( () ) )
            // InternalRest.g:5213:1: ( () )
            {
            // InternalRest.g:5213:1: ( () )
            // InternalRest.g:5214:2: ()
            {
             before(grammarAccess.getAttachmentsAccess().getAttachmentsAction_0()); 
            // InternalRest.g:5215:2: ()
            // InternalRest.g:5215:3: 
            {
            }

             after(grammarAccess.getAttachmentsAccess().getAttachmentsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachments__Group__0__Impl"


    // $ANTLR start "rule__Attachments__Group__1"
    // InternalRest.g:5223:1: rule__Attachments__Group__1 : rule__Attachments__Group__1__Impl rule__Attachments__Group__2 ;
    public final void rule__Attachments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5227:1: ( rule__Attachments__Group__1__Impl rule__Attachments__Group__2 )
            // InternalRest.g:5228:2: rule__Attachments__Group__1__Impl rule__Attachments__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Attachments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachments__Group__1"


    // $ANTLR start "rule__Attachments__Group__1__Impl"
    // InternalRest.g:5235:1: rule__Attachments__Group__1__Impl : ( 'Attachments' ) ;
    public final void rule__Attachments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5239:1: ( ( 'Attachments' ) )
            // InternalRest.g:5240:1: ( 'Attachments' )
            {
            // InternalRest.g:5240:1: ( 'Attachments' )
            // InternalRest.g:5241:2: 'Attachments'
            {
             before(grammarAccess.getAttachmentsAccess().getAttachmentsKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAttachmentsAccess().getAttachmentsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachments__Group__1__Impl"


    // $ANTLR start "rule__Attachments__Group__2"
    // InternalRest.g:5250:1: rule__Attachments__Group__2 : rule__Attachments__Group__2__Impl ;
    public final void rule__Attachments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5254:1: ( rule__Attachments__Group__2__Impl )
            // InternalRest.g:5255:2: rule__Attachments__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attachments__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachments__Group__2"


    // $ANTLR start "rule__Attachments__Group__2__Impl"
    // InternalRest.g:5261:1: rule__Attachments__Group__2__Impl : ( ( rule__Attachments__NameAssignment_2 ) ) ;
    public final void rule__Attachments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5265:1: ( ( ( rule__Attachments__NameAssignment_2 ) ) )
            // InternalRest.g:5266:1: ( ( rule__Attachments__NameAssignment_2 ) )
            {
            // InternalRest.g:5266:1: ( ( rule__Attachments__NameAssignment_2 ) )
            // InternalRest.g:5267:2: ( rule__Attachments__NameAssignment_2 )
            {
             before(grammarAccess.getAttachmentsAccess().getNameAssignment_2()); 
            // InternalRest.g:5268:2: ( rule__Attachments__NameAssignment_2 )
            // InternalRest.g:5268:3: rule__Attachments__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attachments__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttachmentsAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachments__Group__2__Impl"


    // $ANTLR start "rule__Random__Group__0"
    // InternalRest.g:5277:1: rule__Random__Group__0 : rule__Random__Group__0__Impl rule__Random__Group__1 ;
    public final void rule__Random__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5281:1: ( rule__Random__Group__0__Impl rule__Random__Group__1 )
            // InternalRest.g:5282:2: rule__Random__Group__0__Impl rule__Random__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Random__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Random__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random__Group__0"


    // $ANTLR start "rule__Random__Group__0__Impl"
    // InternalRest.g:5289:1: rule__Random__Group__0__Impl : ( () ) ;
    public final void rule__Random__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5293:1: ( ( () ) )
            // InternalRest.g:5294:1: ( () )
            {
            // InternalRest.g:5294:1: ( () )
            // InternalRest.g:5295:2: ()
            {
             before(grammarAccess.getRandomAccess().getRandomAction_0()); 
            // InternalRest.g:5296:2: ()
            // InternalRest.g:5296:3: 
            {
            }

             after(grammarAccess.getRandomAccess().getRandomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random__Group__0__Impl"


    // $ANTLR start "rule__Random__Group__1"
    // InternalRest.g:5304:1: rule__Random__Group__1 : rule__Random__Group__1__Impl rule__Random__Group__2 ;
    public final void rule__Random__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5308:1: ( rule__Random__Group__1__Impl rule__Random__Group__2 )
            // InternalRest.g:5309:2: rule__Random__Group__1__Impl rule__Random__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Random__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Random__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random__Group__1"


    // $ANTLR start "rule__Random__Group__1__Impl"
    // InternalRest.g:5316:1: rule__Random__Group__1__Impl : ( 'Random' ) ;
    public final void rule__Random__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5320:1: ( ( 'Random' ) )
            // InternalRest.g:5321:1: ( 'Random' )
            {
            // InternalRest.g:5321:1: ( 'Random' )
            // InternalRest.g:5322:2: 'Random'
            {
             before(grammarAccess.getRandomAccess().getRandomKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRandomAccess().getRandomKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random__Group__1__Impl"


    // $ANTLR start "rule__Random__Group__2"
    // InternalRest.g:5331:1: rule__Random__Group__2 : rule__Random__Group__2__Impl ;
    public final void rule__Random__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5335:1: ( rule__Random__Group__2__Impl )
            // InternalRest.g:5336:2: rule__Random__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Random__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random__Group__2"


    // $ANTLR start "rule__Random__Group__2__Impl"
    // InternalRest.g:5342:1: rule__Random__Group__2__Impl : ( ( rule__Random__NameAssignment_2 ) ) ;
    public final void rule__Random__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5346:1: ( ( ( rule__Random__NameAssignment_2 ) ) )
            // InternalRest.g:5347:1: ( ( rule__Random__NameAssignment_2 ) )
            {
            // InternalRest.g:5347:1: ( ( rule__Random__NameAssignment_2 ) )
            // InternalRest.g:5348:2: ( rule__Random__NameAssignment_2 )
            {
             before(grammarAccess.getRandomAccess().getNameAssignment_2()); 
            // InternalRest.g:5349:2: ( rule__Random__NameAssignment_2 )
            // InternalRest.g:5349:3: rule__Random__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Random__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRandomAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random__Group__2__Impl"


    // $ANTLR start "rule__OpCreate__Group__0"
    // InternalRest.g:5358:1: rule__OpCreate__Group__0 : rule__OpCreate__Group__0__Impl rule__OpCreate__Group__1 ;
    public final void rule__OpCreate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5362:1: ( rule__OpCreate__Group__0__Impl rule__OpCreate__Group__1 )
            // InternalRest.g:5363:2: rule__OpCreate__Group__0__Impl rule__OpCreate__Group__1
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
    // InternalRest.g:5370:1: rule__OpCreate__Group__0__Impl : ( 'OpCreate' ) ;
    public final void rule__OpCreate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5374:1: ( ( 'OpCreate' ) )
            // InternalRest.g:5375:1: ( 'OpCreate' )
            {
            // InternalRest.g:5375:1: ( 'OpCreate' )
            // InternalRest.g:5376:2: 'OpCreate'
            {
             before(grammarAccess.getOpCreateAccess().getOpCreateKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRest.g:5385:1: rule__OpCreate__Group__1 : rule__OpCreate__Group__1__Impl rule__OpCreate__Group__2 ;
    public final void rule__OpCreate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5389:1: ( rule__OpCreate__Group__1__Impl rule__OpCreate__Group__2 )
            // InternalRest.g:5390:2: rule__OpCreate__Group__1__Impl rule__OpCreate__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:5397:1: rule__OpCreate__Group__1__Impl : ( '{' ) ;
    public final void rule__OpCreate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5401:1: ( ( '{' ) )
            // InternalRest.g:5402:1: ( '{' )
            {
            // InternalRest.g:5402:1: ( '{' )
            // InternalRest.g:5403:2: '{'
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
    // InternalRest.g:5412:1: rule__OpCreate__Group__2 : rule__OpCreate__Group__2__Impl rule__OpCreate__Group__3 ;
    public final void rule__OpCreate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5416:1: ( rule__OpCreate__Group__2__Impl rule__OpCreate__Group__3 )
            // InternalRest.g:5417:2: rule__OpCreate__Group__2__Impl rule__OpCreate__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:5424:1: rule__OpCreate__Group__2__Impl : ( ( rule__OpCreate__Group_2__0 )? ) ;
    public final void rule__OpCreate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5428:1: ( ( ( rule__OpCreate__Group_2__0 )? ) )
            // InternalRest.g:5429:1: ( ( rule__OpCreate__Group_2__0 )? )
            {
            // InternalRest.g:5429:1: ( ( rule__OpCreate__Group_2__0 )? )
            // InternalRest.g:5430:2: ( rule__OpCreate__Group_2__0 )?
            {
             before(grammarAccess.getOpCreateAccess().getGroup_2()); 
            // InternalRest.g:5431:2: ( rule__OpCreate__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRest.g:5431:3: rule__OpCreate__Group_2__0
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
    // InternalRest.g:5439:1: rule__OpCreate__Group__3 : rule__OpCreate__Group__3__Impl rule__OpCreate__Group__4 ;
    public final void rule__OpCreate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5443:1: ( rule__OpCreate__Group__3__Impl rule__OpCreate__Group__4 )
            // InternalRest.g:5444:2: rule__OpCreate__Group__3__Impl rule__OpCreate__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:5451:1: rule__OpCreate__Group__3__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpCreate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5455:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:5456:1: ( 'failedAnswer' )
            {
            // InternalRest.g:5456:1: ( 'failedAnswer' )
            // InternalRest.g:5457:2: 'failedAnswer'
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRest.g:5466:1: rule__OpCreate__Group__4 : rule__OpCreate__Group__4__Impl rule__OpCreate__Group__5 ;
    public final void rule__OpCreate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5470:1: ( rule__OpCreate__Group__4__Impl rule__OpCreate__Group__5 )
            // InternalRest.g:5471:2: rule__OpCreate__Group__4__Impl rule__OpCreate__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalRest.g:5478:1: rule__OpCreate__Group__4__Impl : ( ( rule__OpCreate__FailedAnswerAssignment_4 ) ) ;
    public final void rule__OpCreate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5482:1: ( ( ( rule__OpCreate__FailedAnswerAssignment_4 ) ) )
            // InternalRest.g:5483:1: ( ( rule__OpCreate__FailedAnswerAssignment_4 ) )
            {
            // InternalRest.g:5483:1: ( ( rule__OpCreate__FailedAnswerAssignment_4 ) )
            // InternalRest.g:5484:2: ( rule__OpCreate__FailedAnswerAssignment_4 )
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerAssignment_4()); 
            // InternalRest.g:5485:2: ( rule__OpCreate__FailedAnswerAssignment_4 )
            // InternalRest.g:5485:3: rule__OpCreate__FailedAnswerAssignment_4
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
    // InternalRest.g:5493:1: rule__OpCreate__Group__5 : rule__OpCreate__Group__5__Impl rule__OpCreate__Group__6 ;
    public final void rule__OpCreate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5497:1: ( rule__OpCreate__Group__5__Impl rule__OpCreate__Group__6 )
            // InternalRest.g:5498:2: rule__OpCreate__Group__5__Impl rule__OpCreate__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:5505:1: rule__OpCreate__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpCreate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5509:1: ( ( 'struct' ) )
            // InternalRest.g:5510:1: ( 'struct' )
            {
            // InternalRest.g:5510:1: ( 'struct' )
            // InternalRest.g:5511:2: 'struct'
            {
             before(grammarAccess.getOpCreateAccess().getStructKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalRest.g:5520:1: rule__OpCreate__Group__6 : rule__OpCreate__Group__6__Impl rule__OpCreate__Group__7 ;
    public final void rule__OpCreate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5524:1: ( rule__OpCreate__Group__6__Impl rule__OpCreate__Group__7 )
            // InternalRest.g:5525:2: rule__OpCreate__Group__6__Impl rule__OpCreate__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalRest.g:5532:1: rule__OpCreate__Group__6__Impl : ( ( rule__OpCreate__StructAssignment_6 ) ) ;
    public final void rule__OpCreate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5536:1: ( ( ( rule__OpCreate__StructAssignment_6 ) ) )
            // InternalRest.g:5537:1: ( ( rule__OpCreate__StructAssignment_6 ) )
            {
            // InternalRest.g:5537:1: ( ( rule__OpCreate__StructAssignment_6 ) )
            // InternalRest.g:5538:2: ( rule__OpCreate__StructAssignment_6 )
            {
             before(grammarAccess.getOpCreateAccess().getStructAssignment_6()); 
            // InternalRest.g:5539:2: ( rule__OpCreate__StructAssignment_6 )
            // InternalRest.g:5539:3: rule__OpCreate__StructAssignment_6
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
    // InternalRest.g:5547:1: rule__OpCreate__Group__7 : rule__OpCreate__Group__7__Impl rule__OpCreate__Group__8 ;
    public final void rule__OpCreate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5551:1: ( rule__OpCreate__Group__7__Impl rule__OpCreate__Group__8 )
            // InternalRest.g:5552:2: rule__OpCreate__Group__7__Impl rule__OpCreate__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalRest.g:5559:1: rule__OpCreate__Group__7__Impl : ( ( rule__OpCreate__Group_7__0 )? ) ;
    public final void rule__OpCreate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5563:1: ( ( ( rule__OpCreate__Group_7__0 )? ) )
            // InternalRest.g:5564:1: ( ( rule__OpCreate__Group_7__0 )? )
            {
            // InternalRest.g:5564:1: ( ( rule__OpCreate__Group_7__0 )? )
            // InternalRest.g:5565:2: ( rule__OpCreate__Group_7__0 )?
            {
             before(grammarAccess.getOpCreateAccess().getGroup_7()); 
            // InternalRest.g:5566:2: ( rule__OpCreate__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRest.g:5566:3: rule__OpCreate__Group_7__0
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
    // InternalRest.g:5574:1: rule__OpCreate__Group__8 : rule__OpCreate__Group__8__Impl ;
    public final void rule__OpCreate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5578:1: ( rule__OpCreate__Group__8__Impl )
            // InternalRest.g:5579:2: rule__OpCreate__Group__8__Impl
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
    // InternalRest.g:5585:1: rule__OpCreate__Group__8__Impl : ( '}' ) ;
    public final void rule__OpCreate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5589:1: ( ( '}' ) )
            // InternalRest.g:5590:1: ( '}' )
            {
            // InternalRest.g:5590:1: ( '}' )
            // InternalRest.g:5591:2: '}'
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
    // InternalRest.g:5601:1: rule__OpCreate__Group_2__0 : rule__OpCreate__Group_2__0__Impl rule__OpCreate__Group_2__1 ;
    public final void rule__OpCreate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5605:1: ( rule__OpCreate__Group_2__0__Impl rule__OpCreate__Group_2__1 )
            // InternalRest.g:5606:2: rule__OpCreate__Group_2__0__Impl rule__OpCreate__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:5613:1: rule__OpCreate__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpCreate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5617:1: ( ( 'id' ) )
            // InternalRest.g:5618:1: ( 'id' )
            {
            // InternalRest.g:5618:1: ( 'id' )
            // InternalRest.g:5619:2: 'id'
            {
             before(grammarAccess.getOpCreateAccess().getIdKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRest.g:5628:1: rule__OpCreate__Group_2__1 : rule__OpCreate__Group_2__1__Impl ;
    public final void rule__OpCreate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5632:1: ( rule__OpCreate__Group_2__1__Impl )
            // InternalRest.g:5633:2: rule__OpCreate__Group_2__1__Impl
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
    // InternalRest.g:5639:1: rule__OpCreate__Group_2__1__Impl : ( ( rule__OpCreate__IdAssignment_2_1 ) ) ;
    public final void rule__OpCreate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5643:1: ( ( ( rule__OpCreate__IdAssignment_2_1 ) ) )
            // InternalRest.g:5644:1: ( ( rule__OpCreate__IdAssignment_2_1 ) )
            {
            // InternalRest.g:5644:1: ( ( rule__OpCreate__IdAssignment_2_1 ) )
            // InternalRest.g:5645:2: ( rule__OpCreate__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpCreateAccess().getIdAssignment_2_1()); 
            // InternalRest.g:5646:2: ( rule__OpCreate__IdAssignment_2_1 )
            // InternalRest.g:5646:3: rule__OpCreate__IdAssignment_2_1
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
    // InternalRest.g:5655:1: rule__OpCreate__Group_7__0 : rule__OpCreate__Group_7__0__Impl rule__OpCreate__Group_7__1 ;
    public final void rule__OpCreate__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5659:1: ( rule__OpCreate__Group_7__0__Impl rule__OpCreate__Group_7__1 )
            // InternalRest.g:5660:2: rule__OpCreate__Group_7__0__Impl rule__OpCreate__Group_7__1
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
    // InternalRest.g:5667:1: rule__OpCreate__Group_7__0__Impl : ( 'fieldset' ) ;
    public final void rule__OpCreate__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5671:1: ( ( 'fieldset' ) )
            // InternalRest.g:5672:1: ( 'fieldset' )
            {
            // InternalRest.g:5672:1: ( 'fieldset' )
            // InternalRest.g:5673:2: 'fieldset'
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetKeyword_7_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getFieldsetKeyword_7_0()); 

            }


            }

        }
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
    // InternalRest.g:5682:1: rule__OpCreate__Group_7__1 : rule__OpCreate__Group_7__1__Impl rule__OpCreate__Group_7__2 ;
    public final void rule__OpCreate__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5686:1: ( rule__OpCreate__Group_7__1__Impl rule__OpCreate__Group_7__2 )
            // InternalRest.g:5687:2: rule__OpCreate__Group_7__1__Impl rule__OpCreate__Group_7__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalRest.g:5694:1: rule__OpCreate__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OpCreate__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5698:1: ( ( '{' ) )
            // InternalRest.g:5699:1: ( '{' )
            {
            // InternalRest.g:5699:1: ( '{' )
            // InternalRest.g:5700:2: '{'
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
    // InternalRest.g:5709:1: rule__OpCreate__Group_7__2 : rule__OpCreate__Group_7__2__Impl rule__OpCreate__Group_7__3 ;
    public final void rule__OpCreate__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5713:1: ( rule__OpCreate__Group_7__2__Impl rule__OpCreate__Group_7__3 )
            // InternalRest.g:5714:2: rule__OpCreate__Group_7__2__Impl rule__OpCreate__Group_7__3
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
    // InternalRest.g:5721:1: rule__OpCreate__Group_7__2__Impl : ( ( rule__OpCreate__FieldsetAssignment_7_2 ) ) ;
    public final void rule__OpCreate__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5725:1: ( ( ( rule__OpCreate__FieldsetAssignment_7_2 ) ) )
            // InternalRest.g:5726:1: ( ( rule__OpCreate__FieldsetAssignment_7_2 ) )
            {
            // InternalRest.g:5726:1: ( ( rule__OpCreate__FieldsetAssignment_7_2 ) )
            // InternalRest.g:5727:2: ( rule__OpCreate__FieldsetAssignment_7_2 )
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetAssignment_7_2()); 
            // InternalRest.g:5728:2: ( rule__OpCreate__FieldsetAssignment_7_2 )
            // InternalRest.g:5728:3: rule__OpCreate__FieldsetAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__FieldsetAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getFieldsetAssignment_7_2()); 

            }


            }

        }
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
    // InternalRest.g:5736:1: rule__OpCreate__Group_7__3 : rule__OpCreate__Group_7__3__Impl rule__OpCreate__Group_7__4 ;
    public final void rule__OpCreate__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5740:1: ( rule__OpCreate__Group_7__3__Impl rule__OpCreate__Group_7__4 )
            // InternalRest.g:5741:2: rule__OpCreate__Group_7__3__Impl rule__OpCreate__Group_7__4
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
    // InternalRest.g:5748:1: rule__OpCreate__Group_7__3__Impl : ( ( rule__OpCreate__Group_7_3__0 )* ) ;
    public final void rule__OpCreate__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5752:1: ( ( ( rule__OpCreate__Group_7_3__0 )* ) )
            // InternalRest.g:5753:1: ( ( rule__OpCreate__Group_7_3__0 )* )
            {
            // InternalRest.g:5753:1: ( ( rule__OpCreate__Group_7_3__0 )* )
            // InternalRest.g:5754:2: ( rule__OpCreate__Group_7_3__0 )*
            {
             before(grammarAccess.getOpCreateAccess().getGroup_7_3()); 
            // InternalRest.g:5755:2: ( rule__OpCreate__Group_7_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRest.g:5755:3: rule__OpCreate__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OpCreate__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalRest.g:5763:1: rule__OpCreate__Group_7__4 : rule__OpCreate__Group_7__4__Impl ;
    public final void rule__OpCreate__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5767:1: ( rule__OpCreate__Group_7__4__Impl )
            // InternalRest.g:5768:2: rule__OpCreate__Group_7__4__Impl
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
    // InternalRest.g:5774:1: rule__OpCreate__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OpCreate__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5778:1: ( ( '}' ) )
            // InternalRest.g:5779:1: ( '}' )
            {
            // InternalRest.g:5779:1: ( '}' )
            // InternalRest.g:5780:2: '}'
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
    // InternalRest.g:5790:1: rule__OpCreate__Group_7_3__0 : rule__OpCreate__Group_7_3__0__Impl rule__OpCreate__Group_7_3__1 ;
    public final void rule__OpCreate__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5794:1: ( rule__OpCreate__Group_7_3__0__Impl rule__OpCreate__Group_7_3__1 )
            // InternalRest.g:5795:2: rule__OpCreate__Group_7_3__0__Impl rule__OpCreate__Group_7_3__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalRest.g:5802:1: rule__OpCreate__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OpCreate__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5806:1: ( ( ',' ) )
            // InternalRest.g:5807:1: ( ',' )
            {
            // InternalRest.g:5807:1: ( ',' )
            // InternalRest.g:5808:2: ','
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
    // InternalRest.g:5817:1: rule__OpCreate__Group_7_3__1 : rule__OpCreate__Group_7_3__1__Impl ;
    public final void rule__OpCreate__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5821:1: ( rule__OpCreate__Group_7_3__1__Impl )
            // InternalRest.g:5822:2: rule__OpCreate__Group_7_3__1__Impl
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
    // InternalRest.g:5828:1: rule__OpCreate__Group_7_3__1__Impl : ( ( rule__OpCreate__FieldsetAssignment_7_3_1 ) ) ;
    public final void rule__OpCreate__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5832:1: ( ( ( rule__OpCreate__FieldsetAssignment_7_3_1 ) ) )
            // InternalRest.g:5833:1: ( ( rule__OpCreate__FieldsetAssignment_7_3_1 ) )
            {
            // InternalRest.g:5833:1: ( ( rule__OpCreate__FieldsetAssignment_7_3_1 ) )
            // InternalRest.g:5834:2: ( rule__OpCreate__FieldsetAssignment_7_3_1 )
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetAssignment_7_3_1()); 
            // InternalRest.g:5835:2: ( rule__OpCreate__FieldsetAssignment_7_3_1 )
            // InternalRest.g:5835:3: rule__OpCreate__FieldsetAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__FieldsetAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getFieldsetAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalRest.g:5844:1: rule__OpRead__Group__0 : rule__OpRead__Group__0__Impl rule__OpRead__Group__1 ;
    public final void rule__OpRead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5848:1: ( rule__OpRead__Group__0__Impl rule__OpRead__Group__1 )
            // InternalRest.g:5849:2: rule__OpRead__Group__0__Impl rule__OpRead__Group__1
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
    // InternalRest.g:5856:1: rule__OpRead__Group__0__Impl : ( 'OpRead' ) ;
    public final void rule__OpRead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5860:1: ( ( 'OpRead' ) )
            // InternalRest.g:5861:1: ( 'OpRead' )
            {
            // InternalRest.g:5861:1: ( 'OpRead' )
            // InternalRest.g:5862:2: 'OpRead'
            {
             before(grammarAccess.getOpReadAccess().getOpReadKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalRest.g:5871:1: rule__OpRead__Group__1 : rule__OpRead__Group__1__Impl rule__OpRead__Group__2 ;
    public final void rule__OpRead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5875:1: ( rule__OpRead__Group__1__Impl rule__OpRead__Group__2 )
            // InternalRest.g:5876:2: rule__OpRead__Group__1__Impl rule__OpRead__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:5883:1: rule__OpRead__Group__1__Impl : ( '{' ) ;
    public final void rule__OpRead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5887:1: ( ( '{' ) )
            // InternalRest.g:5888:1: ( '{' )
            {
            // InternalRest.g:5888:1: ( '{' )
            // InternalRest.g:5889:2: '{'
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
    // InternalRest.g:5898:1: rule__OpRead__Group__2 : rule__OpRead__Group__2__Impl rule__OpRead__Group__3 ;
    public final void rule__OpRead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5902:1: ( rule__OpRead__Group__2__Impl rule__OpRead__Group__3 )
            // InternalRest.g:5903:2: rule__OpRead__Group__2__Impl rule__OpRead__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:5910:1: rule__OpRead__Group__2__Impl : ( ( rule__OpRead__Group_2__0 )? ) ;
    public final void rule__OpRead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5914:1: ( ( ( rule__OpRead__Group_2__0 )? ) )
            // InternalRest.g:5915:1: ( ( rule__OpRead__Group_2__0 )? )
            {
            // InternalRest.g:5915:1: ( ( rule__OpRead__Group_2__0 )? )
            // InternalRest.g:5916:2: ( rule__OpRead__Group_2__0 )?
            {
             before(grammarAccess.getOpReadAccess().getGroup_2()); 
            // InternalRest.g:5917:2: ( rule__OpRead__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRest.g:5917:3: rule__OpRead__Group_2__0
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
    // InternalRest.g:5925:1: rule__OpRead__Group__3 : rule__OpRead__Group__3__Impl rule__OpRead__Group__4 ;
    public final void rule__OpRead__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5929:1: ( rule__OpRead__Group__3__Impl rule__OpRead__Group__4 )
            // InternalRest.g:5930:2: rule__OpRead__Group__3__Impl rule__OpRead__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:5937:1: rule__OpRead__Group__3__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpRead__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5941:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:5942:1: ( 'failedAnswer' )
            {
            // InternalRest.g:5942:1: ( 'failedAnswer' )
            // InternalRest.g:5943:2: 'failedAnswer'
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRest.g:5952:1: rule__OpRead__Group__4 : rule__OpRead__Group__4__Impl rule__OpRead__Group__5 ;
    public final void rule__OpRead__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5956:1: ( rule__OpRead__Group__4__Impl rule__OpRead__Group__5 )
            // InternalRest.g:5957:2: rule__OpRead__Group__4__Impl rule__OpRead__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalRest.g:5964:1: rule__OpRead__Group__4__Impl : ( ( rule__OpRead__FailedAnswerAssignment_4 ) ) ;
    public final void rule__OpRead__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5968:1: ( ( ( rule__OpRead__FailedAnswerAssignment_4 ) ) )
            // InternalRest.g:5969:1: ( ( rule__OpRead__FailedAnswerAssignment_4 ) )
            {
            // InternalRest.g:5969:1: ( ( rule__OpRead__FailedAnswerAssignment_4 ) )
            // InternalRest.g:5970:2: ( rule__OpRead__FailedAnswerAssignment_4 )
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerAssignment_4()); 
            // InternalRest.g:5971:2: ( rule__OpRead__FailedAnswerAssignment_4 )
            // InternalRest.g:5971:3: rule__OpRead__FailedAnswerAssignment_4
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
    // InternalRest.g:5979:1: rule__OpRead__Group__5 : rule__OpRead__Group__5__Impl rule__OpRead__Group__6 ;
    public final void rule__OpRead__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5983:1: ( rule__OpRead__Group__5__Impl rule__OpRead__Group__6 )
            // InternalRest.g:5984:2: rule__OpRead__Group__5__Impl rule__OpRead__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:5991:1: rule__OpRead__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpRead__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5995:1: ( ( 'struct' ) )
            // InternalRest.g:5996:1: ( 'struct' )
            {
            // InternalRest.g:5996:1: ( 'struct' )
            // InternalRest.g:5997:2: 'struct'
            {
             before(grammarAccess.getOpReadAccess().getStructKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalRest.g:6006:1: rule__OpRead__Group__6 : rule__OpRead__Group__6__Impl rule__OpRead__Group__7 ;
    public final void rule__OpRead__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6010:1: ( rule__OpRead__Group__6__Impl rule__OpRead__Group__7 )
            // InternalRest.g:6011:2: rule__OpRead__Group__6__Impl rule__OpRead__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalRest.g:6018:1: rule__OpRead__Group__6__Impl : ( ( rule__OpRead__StructAssignment_6 ) ) ;
    public final void rule__OpRead__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6022:1: ( ( ( rule__OpRead__StructAssignment_6 ) ) )
            // InternalRest.g:6023:1: ( ( rule__OpRead__StructAssignment_6 ) )
            {
            // InternalRest.g:6023:1: ( ( rule__OpRead__StructAssignment_6 ) )
            // InternalRest.g:6024:2: ( rule__OpRead__StructAssignment_6 )
            {
             before(grammarAccess.getOpReadAccess().getStructAssignment_6()); 
            // InternalRest.g:6025:2: ( rule__OpRead__StructAssignment_6 )
            // InternalRest.g:6025:3: rule__OpRead__StructAssignment_6
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
    // InternalRest.g:6033:1: rule__OpRead__Group__7 : rule__OpRead__Group__7__Impl rule__OpRead__Group__8 ;
    public final void rule__OpRead__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6037:1: ( rule__OpRead__Group__7__Impl rule__OpRead__Group__8 )
            // InternalRest.g:6038:2: rule__OpRead__Group__7__Impl rule__OpRead__Group__8
            {
            pushFollow(FOLLOW_33);
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
    // InternalRest.g:6045:1: rule__OpRead__Group__7__Impl : ( ( rule__OpRead__Group_7__0 )? ) ;
    public final void rule__OpRead__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6049:1: ( ( ( rule__OpRead__Group_7__0 )? ) )
            // InternalRest.g:6050:1: ( ( rule__OpRead__Group_7__0 )? )
            {
            // InternalRest.g:6050:1: ( ( rule__OpRead__Group_7__0 )? )
            // InternalRest.g:6051:2: ( rule__OpRead__Group_7__0 )?
            {
             before(grammarAccess.getOpReadAccess().getGroup_7()); 
            // InternalRest.g:6052:2: ( rule__OpRead__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRest.g:6052:3: rule__OpRead__Group_7__0
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
    // InternalRest.g:6060:1: rule__OpRead__Group__8 : rule__OpRead__Group__8__Impl ;
    public final void rule__OpRead__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6064:1: ( rule__OpRead__Group__8__Impl )
            // InternalRest.g:6065:2: rule__OpRead__Group__8__Impl
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
    // InternalRest.g:6071:1: rule__OpRead__Group__8__Impl : ( '}' ) ;
    public final void rule__OpRead__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6075:1: ( ( '}' ) )
            // InternalRest.g:6076:1: ( '}' )
            {
            // InternalRest.g:6076:1: ( '}' )
            // InternalRest.g:6077:2: '}'
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
    // InternalRest.g:6087:1: rule__OpRead__Group_2__0 : rule__OpRead__Group_2__0__Impl rule__OpRead__Group_2__1 ;
    public final void rule__OpRead__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6091:1: ( rule__OpRead__Group_2__0__Impl rule__OpRead__Group_2__1 )
            // InternalRest.g:6092:2: rule__OpRead__Group_2__0__Impl rule__OpRead__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:6099:1: rule__OpRead__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpRead__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6103:1: ( ( 'id' ) )
            // InternalRest.g:6104:1: ( 'id' )
            {
            // InternalRest.g:6104:1: ( 'id' )
            // InternalRest.g:6105:2: 'id'
            {
             before(grammarAccess.getOpReadAccess().getIdKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRest.g:6114:1: rule__OpRead__Group_2__1 : rule__OpRead__Group_2__1__Impl ;
    public final void rule__OpRead__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6118:1: ( rule__OpRead__Group_2__1__Impl )
            // InternalRest.g:6119:2: rule__OpRead__Group_2__1__Impl
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
    // InternalRest.g:6125:1: rule__OpRead__Group_2__1__Impl : ( ( rule__OpRead__IdAssignment_2_1 ) ) ;
    public final void rule__OpRead__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6129:1: ( ( ( rule__OpRead__IdAssignment_2_1 ) ) )
            // InternalRest.g:6130:1: ( ( rule__OpRead__IdAssignment_2_1 ) )
            {
            // InternalRest.g:6130:1: ( ( rule__OpRead__IdAssignment_2_1 ) )
            // InternalRest.g:6131:2: ( rule__OpRead__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpReadAccess().getIdAssignment_2_1()); 
            // InternalRest.g:6132:2: ( rule__OpRead__IdAssignment_2_1 )
            // InternalRest.g:6132:3: rule__OpRead__IdAssignment_2_1
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
    // InternalRest.g:6141:1: rule__OpRead__Group_7__0 : rule__OpRead__Group_7__0__Impl rule__OpRead__Group_7__1 ;
    public final void rule__OpRead__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6145:1: ( rule__OpRead__Group_7__0__Impl rule__OpRead__Group_7__1 )
            // InternalRest.g:6146:2: rule__OpRead__Group_7__0__Impl rule__OpRead__Group_7__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRest.g:6153:1: rule__OpRead__Group_7__0__Impl : ( 'field' ) ;
    public final void rule__OpRead__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6157:1: ( ( 'field' ) )
            // InternalRest.g:6158:1: ( 'field' )
            {
            // InternalRest.g:6158:1: ( 'field' )
            // InternalRest.g:6159:2: 'field'
            {
             before(grammarAccess.getOpReadAccess().getFieldKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getFieldKeyword_7_0()); 

            }


            }

        }
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
    // InternalRest.g:6168:1: rule__OpRead__Group_7__1 : rule__OpRead__Group_7__1__Impl rule__OpRead__Group_7__2 ;
    public final void rule__OpRead__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6172:1: ( rule__OpRead__Group_7__1__Impl rule__OpRead__Group_7__2 )
            // InternalRest.g:6173:2: rule__OpRead__Group_7__1__Impl rule__OpRead__Group_7__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalRest.g:6180:1: rule__OpRead__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OpRead__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6184:1: ( ( '{' ) )
            // InternalRest.g:6185:1: ( '{' )
            {
            // InternalRest.g:6185:1: ( '{' )
            // InternalRest.g:6186:2: '{'
            {
             before(grammarAccess.getOpReadAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
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
    // InternalRest.g:6195:1: rule__OpRead__Group_7__2 : rule__OpRead__Group_7__2__Impl rule__OpRead__Group_7__3 ;
    public final void rule__OpRead__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6199:1: ( rule__OpRead__Group_7__2__Impl rule__OpRead__Group_7__3 )
            // InternalRest.g:6200:2: rule__OpRead__Group_7__2__Impl rule__OpRead__Group_7__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRest.g:6207:1: rule__OpRead__Group_7__2__Impl : ( ( rule__OpRead__FieldAssignment_7_2 ) ) ;
    public final void rule__OpRead__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6211:1: ( ( ( rule__OpRead__FieldAssignment_7_2 ) ) )
            // InternalRest.g:6212:1: ( ( rule__OpRead__FieldAssignment_7_2 ) )
            {
            // InternalRest.g:6212:1: ( ( rule__OpRead__FieldAssignment_7_2 ) )
            // InternalRest.g:6213:2: ( rule__OpRead__FieldAssignment_7_2 )
            {
             before(grammarAccess.getOpReadAccess().getFieldAssignment_7_2()); 
            // InternalRest.g:6214:2: ( rule__OpRead__FieldAssignment_7_2 )
            // InternalRest.g:6214:3: rule__OpRead__FieldAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__FieldAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getFieldAssignment_7_2()); 

            }


            }

        }
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
    // InternalRest.g:6222:1: rule__OpRead__Group_7__3 : rule__OpRead__Group_7__3__Impl rule__OpRead__Group_7__4 ;
    public final void rule__OpRead__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6226:1: ( rule__OpRead__Group_7__3__Impl rule__OpRead__Group_7__4 )
            // InternalRest.g:6227:2: rule__OpRead__Group_7__3__Impl rule__OpRead__Group_7__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRest.g:6234:1: rule__OpRead__Group_7__3__Impl : ( ( rule__OpRead__Group_7_3__0 )* ) ;
    public final void rule__OpRead__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6238:1: ( ( ( rule__OpRead__Group_7_3__0 )* ) )
            // InternalRest.g:6239:1: ( ( rule__OpRead__Group_7_3__0 )* )
            {
            // InternalRest.g:6239:1: ( ( rule__OpRead__Group_7_3__0 )* )
            // InternalRest.g:6240:2: ( rule__OpRead__Group_7_3__0 )*
            {
             before(grammarAccess.getOpReadAccess().getGroup_7_3()); 
            // InternalRest.g:6241:2: ( rule__OpRead__Group_7_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==15) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRest.g:6241:3: rule__OpRead__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OpRead__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalRest.g:6249:1: rule__OpRead__Group_7__4 : rule__OpRead__Group_7__4__Impl ;
    public final void rule__OpRead__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6253:1: ( rule__OpRead__Group_7__4__Impl )
            // InternalRest.g:6254:2: rule__OpRead__Group_7__4__Impl
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
    // InternalRest.g:6260:1: rule__OpRead__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OpRead__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6264:1: ( ( '}' ) )
            // InternalRest.g:6265:1: ( '}' )
            {
            // InternalRest.g:6265:1: ( '}' )
            // InternalRest.g:6266:2: '}'
            {
             before(grammarAccess.getOpReadAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
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
    // InternalRest.g:6276:1: rule__OpRead__Group_7_3__0 : rule__OpRead__Group_7_3__0__Impl rule__OpRead__Group_7_3__1 ;
    public final void rule__OpRead__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6280:1: ( rule__OpRead__Group_7_3__0__Impl rule__OpRead__Group_7_3__1 )
            // InternalRest.g:6281:2: rule__OpRead__Group_7_3__0__Impl rule__OpRead__Group_7_3__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalRest.g:6288:1: rule__OpRead__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OpRead__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6292:1: ( ( ',' ) )
            // InternalRest.g:6293:1: ( ',' )
            {
            // InternalRest.g:6293:1: ( ',' )
            // InternalRest.g:6294:2: ','
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
    // InternalRest.g:6303:1: rule__OpRead__Group_7_3__1 : rule__OpRead__Group_7_3__1__Impl ;
    public final void rule__OpRead__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6307:1: ( rule__OpRead__Group_7_3__1__Impl )
            // InternalRest.g:6308:2: rule__OpRead__Group_7_3__1__Impl
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
    // InternalRest.g:6314:1: rule__OpRead__Group_7_3__1__Impl : ( ( rule__OpRead__FieldAssignment_7_3_1 ) ) ;
    public final void rule__OpRead__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6318:1: ( ( ( rule__OpRead__FieldAssignment_7_3_1 ) ) )
            // InternalRest.g:6319:1: ( ( rule__OpRead__FieldAssignment_7_3_1 ) )
            {
            // InternalRest.g:6319:1: ( ( rule__OpRead__FieldAssignment_7_3_1 ) )
            // InternalRest.g:6320:2: ( rule__OpRead__FieldAssignment_7_3_1 )
            {
             before(grammarAccess.getOpReadAccess().getFieldAssignment_7_3_1()); 
            // InternalRest.g:6321:2: ( rule__OpRead__FieldAssignment_7_3_1 )
            // InternalRest.g:6321:3: rule__OpRead__FieldAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__FieldAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getFieldAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalRest.g:6330:1: rule__OpUpdate__Group__0 : rule__OpUpdate__Group__0__Impl rule__OpUpdate__Group__1 ;
    public final void rule__OpUpdate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6334:1: ( rule__OpUpdate__Group__0__Impl rule__OpUpdate__Group__1 )
            // InternalRest.g:6335:2: rule__OpUpdate__Group__0__Impl rule__OpUpdate__Group__1
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
    // InternalRest.g:6342:1: rule__OpUpdate__Group__0__Impl : ( 'OpUpdate' ) ;
    public final void rule__OpUpdate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6346:1: ( ( 'OpUpdate' ) )
            // InternalRest.g:6347:1: ( 'OpUpdate' )
            {
            // InternalRest.g:6347:1: ( 'OpUpdate' )
            // InternalRest.g:6348:2: 'OpUpdate'
            {
             before(grammarAccess.getOpUpdateAccess().getOpUpdateKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalRest.g:6357:1: rule__OpUpdate__Group__1 : rule__OpUpdate__Group__1__Impl rule__OpUpdate__Group__2 ;
    public final void rule__OpUpdate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6361:1: ( rule__OpUpdate__Group__1__Impl rule__OpUpdate__Group__2 )
            // InternalRest.g:6362:2: rule__OpUpdate__Group__1__Impl rule__OpUpdate__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:6369:1: rule__OpUpdate__Group__1__Impl : ( '{' ) ;
    public final void rule__OpUpdate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6373:1: ( ( '{' ) )
            // InternalRest.g:6374:1: ( '{' )
            {
            // InternalRest.g:6374:1: ( '{' )
            // InternalRest.g:6375:2: '{'
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
    // InternalRest.g:6384:1: rule__OpUpdate__Group__2 : rule__OpUpdate__Group__2__Impl rule__OpUpdate__Group__3 ;
    public final void rule__OpUpdate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6388:1: ( rule__OpUpdate__Group__2__Impl rule__OpUpdate__Group__3 )
            // InternalRest.g:6389:2: rule__OpUpdate__Group__2__Impl rule__OpUpdate__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:6396:1: rule__OpUpdate__Group__2__Impl : ( ( rule__OpUpdate__Group_2__0 )? ) ;
    public final void rule__OpUpdate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6400:1: ( ( ( rule__OpUpdate__Group_2__0 )? ) )
            // InternalRest.g:6401:1: ( ( rule__OpUpdate__Group_2__0 )? )
            {
            // InternalRest.g:6401:1: ( ( rule__OpUpdate__Group_2__0 )? )
            // InternalRest.g:6402:2: ( rule__OpUpdate__Group_2__0 )?
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_2()); 
            // InternalRest.g:6403:2: ( rule__OpUpdate__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRest.g:6403:3: rule__OpUpdate__Group_2__0
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
    // InternalRest.g:6411:1: rule__OpUpdate__Group__3 : rule__OpUpdate__Group__3__Impl rule__OpUpdate__Group__4 ;
    public final void rule__OpUpdate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6415:1: ( rule__OpUpdate__Group__3__Impl rule__OpUpdate__Group__4 )
            // InternalRest.g:6416:2: rule__OpUpdate__Group__3__Impl rule__OpUpdate__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:6423:1: rule__OpUpdate__Group__3__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpUpdate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6427:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:6428:1: ( 'failedAnswer' )
            {
            // InternalRest.g:6428:1: ( 'failedAnswer' )
            // InternalRest.g:6429:2: 'failedAnswer'
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRest.g:6438:1: rule__OpUpdate__Group__4 : rule__OpUpdate__Group__4__Impl rule__OpUpdate__Group__5 ;
    public final void rule__OpUpdate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6442:1: ( rule__OpUpdate__Group__4__Impl rule__OpUpdate__Group__5 )
            // InternalRest.g:6443:2: rule__OpUpdate__Group__4__Impl rule__OpUpdate__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalRest.g:6450:1: rule__OpUpdate__Group__4__Impl : ( ( rule__OpUpdate__FailedAnswerAssignment_4 ) ) ;
    public final void rule__OpUpdate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6454:1: ( ( ( rule__OpUpdate__FailedAnswerAssignment_4 ) ) )
            // InternalRest.g:6455:1: ( ( rule__OpUpdate__FailedAnswerAssignment_4 ) )
            {
            // InternalRest.g:6455:1: ( ( rule__OpUpdate__FailedAnswerAssignment_4 ) )
            // InternalRest.g:6456:2: ( rule__OpUpdate__FailedAnswerAssignment_4 )
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerAssignment_4()); 
            // InternalRest.g:6457:2: ( rule__OpUpdate__FailedAnswerAssignment_4 )
            // InternalRest.g:6457:3: rule__OpUpdate__FailedAnswerAssignment_4
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
    // InternalRest.g:6465:1: rule__OpUpdate__Group__5 : rule__OpUpdate__Group__5__Impl rule__OpUpdate__Group__6 ;
    public final void rule__OpUpdate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6469:1: ( rule__OpUpdate__Group__5__Impl rule__OpUpdate__Group__6 )
            // InternalRest.g:6470:2: rule__OpUpdate__Group__5__Impl rule__OpUpdate__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:6477:1: rule__OpUpdate__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpUpdate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6481:1: ( ( 'struct' ) )
            // InternalRest.g:6482:1: ( 'struct' )
            {
            // InternalRest.g:6482:1: ( 'struct' )
            // InternalRest.g:6483:2: 'struct'
            {
             before(grammarAccess.getOpUpdateAccess().getStructKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalRest.g:6492:1: rule__OpUpdate__Group__6 : rule__OpUpdate__Group__6__Impl rule__OpUpdate__Group__7 ;
    public final void rule__OpUpdate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6496:1: ( rule__OpUpdate__Group__6__Impl rule__OpUpdate__Group__7 )
            // InternalRest.g:6497:2: rule__OpUpdate__Group__6__Impl rule__OpUpdate__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalRest.g:6504:1: rule__OpUpdate__Group__6__Impl : ( ( rule__OpUpdate__StructAssignment_6 ) ) ;
    public final void rule__OpUpdate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6508:1: ( ( ( rule__OpUpdate__StructAssignment_6 ) ) )
            // InternalRest.g:6509:1: ( ( rule__OpUpdate__StructAssignment_6 ) )
            {
            // InternalRest.g:6509:1: ( ( rule__OpUpdate__StructAssignment_6 ) )
            // InternalRest.g:6510:2: ( rule__OpUpdate__StructAssignment_6 )
            {
             before(grammarAccess.getOpUpdateAccess().getStructAssignment_6()); 
            // InternalRest.g:6511:2: ( rule__OpUpdate__StructAssignment_6 )
            // InternalRest.g:6511:3: rule__OpUpdate__StructAssignment_6
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
    // InternalRest.g:6519:1: rule__OpUpdate__Group__7 : rule__OpUpdate__Group__7__Impl rule__OpUpdate__Group__8 ;
    public final void rule__OpUpdate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6523:1: ( rule__OpUpdate__Group__7__Impl rule__OpUpdate__Group__8 )
            // InternalRest.g:6524:2: rule__OpUpdate__Group__7__Impl rule__OpUpdate__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalRest.g:6531:1: rule__OpUpdate__Group__7__Impl : ( ( rule__OpUpdate__Group_7__0 )? ) ;
    public final void rule__OpUpdate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6535:1: ( ( ( rule__OpUpdate__Group_7__0 )? ) )
            // InternalRest.g:6536:1: ( ( rule__OpUpdate__Group_7__0 )? )
            {
            // InternalRest.g:6536:1: ( ( rule__OpUpdate__Group_7__0 )? )
            // InternalRest.g:6537:2: ( rule__OpUpdate__Group_7__0 )?
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_7()); 
            // InternalRest.g:6538:2: ( rule__OpUpdate__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRest.g:6538:3: rule__OpUpdate__Group_7__0
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
    // InternalRest.g:6546:1: rule__OpUpdate__Group__8 : rule__OpUpdate__Group__8__Impl ;
    public final void rule__OpUpdate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6550:1: ( rule__OpUpdate__Group__8__Impl )
            // InternalRest.g:6551:2: rule__OpUpdate__Group__8__Impl
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
    // InternalRest.g:6557:1: rule__OpUpdate__Group__8__Impl : ( '}' ) ;
    public final void rule__OpUpdate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6561:1: ( ( '}' ) )
            // InternalRest.g:6562:1: ( '}' )
            {
            // InternalRest.g:6562:1: ( '}' )
            // InternalRest.g:6563:2: '}'
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
    // InternalRest.g:6573:1: rule__OpUpdate__Group_2__0 : rule__OpUpdate__Group_2__0__Impl rule__OpUpdate__Group_2__1 ;
    public final void rule__OpUpdate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6577:1: ( rule__OpUpdate__Group_2__0__Impl rule__OpUpdate__Group_2__1 )
            // InternalRest.g:6578:2: rule__OpUpdate__Group_2__0__Impl rule__OpUpdate__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:6585:1: rule__OpUpdate__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpUpdate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6589:1: ( ( 'id' ) )
            // InternalRest.g:6590:1: ( 'id' )
            {
            // InternalRest.g:6590:1: ( 'id' )
            // InternalRest.g:6591:2: 'id'
            {
             before(grammarAccess.getOpUpdateAccess().getIdKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRest.g:6600:1: rule__OpUpdate__Group_2__1 : rule__OpUpdate__Group_2__1__Impl ;
    public final void rule__OpUpdate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6604:1: ( rule__OpUpdate__Group_2__1__Impl )
            // InternalRest.g:6605:2: rule__OpUpdate__Group_2__1__Impl
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
    // InternalRest.g:6611:1: rule__OpUpdate__Group_2__1__Impl : ( ( rule__OpUpdate__IdAssignment_2_1 ) ) ;
    public final void rule__OpUpdate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6615:1: ( ( ( rule__OpUpdate__IdAssignment_2_1 ) ) )
            // InternalRest.g:6616:1: ( ( rule__OpUpdate__IdAssignment_2_1 ) )
            {
            // InternalRest.g:6616:1: ( ( rule__OpUpdate__IdAssignment_2_1 ) )
            // InternalRest.g:6617:2: ( rule__OpUpdate__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpUpdateAccess().getIdAssignment_2_1()); 
            // InternalRest.g:6618:2: ( rule__OpUpdate__IdAssignment_2_1 )
            // InternalRest.g:6618:3: rule__OpUpdate__IdAssignment_2_1
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
    // InternalRest.g:6627:1: rule__OpUpdate__Group_7__0 : rule__OpUpdate__Group_7__0__Impl rule__OpUpdate__Group_7__1 ;
    public final void rule__OpUpdate__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6631:1: ( rule__OpUpdate__Group_7__0__Impl rule__OpUpdate__Group_7__1 )
            // InternalRest.g:6632:2: rule__OpUpdate__Group_7__0__Impl rule__OpUpdate__Group_7__1
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
    // InternalRest.g:6639:1: rule__OpUpdate__Group_7__0__Impl : ( 'fieldset' ) ;
    public final void rule__OpUpdate__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6643:1: ( ( 'fieldset' ) )
            // InternalRest.g:6644:1: ( 'fieldset' )
            {
            // InternalRest.g:6644:1: ( 'fieldset' )
            // InternalRest.g:6645:2: 'fieldset'
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetKeyword_7_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getFieldsetKeyword_7_0()); 

            }


            }

        }
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
    // InternalRest.g:6654:1: rule__OpUpdate__Group_7__1 : rule__OpUpdate__Group_7__1__Impl rule__OpUpdate__Group_7__2 ;
    public final void rule__OpUpdate__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6658:1: ( rule__OpUpdate__Group_7__1__Impl rule__OpUpdate__Group_7__2 )
            // InternalRest.g:6659:2: rule__OpUpdate__Group_7__1__Impl rule__OpUpdate__Group_7__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalRest.g:6666:1: rule__OpUpdate__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OpUpdate__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6670:1: ( ( '{' ) )
            // InternalRest.g:6671:1: ( '{' )
            {
            // InternalRest.g:6671:1: ( '{' )
            // InternalRest.g:6672:2: '{'
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
    // InternalRest.g:6681:1: rule__OpUpdate__Group_7__2 : rule__OpUpdate__Group_7__2__Impl rule__OpUpdate__Group_7__3 ;
    public final void rule__OpUpdate__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6685:1: ( rule__OpUpdate__Group_7__2__Impl rule__OpUpdate__Group_7__3 )
            // InternalRest.g:6686:2: rule__OpUpdate__Group_7__2__Impl rule__OpUpdate__Group_7__3
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
    // InternalRest.g:6693:1: rule__OpUpdate__Group_7__2__Impl : ( ( rule__OpUpdate__FieldsetAssignment_7_2 ) ) ;
    public final void rule__OpUpdate__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6697:1: ( ( ( rule__OpUpdate__FieldsetAssignment_7_2 ) ) )
            // InternalRest.g:6698:1: ( ( rule__OpUpdate__FieldsetAssignment_7_2 ) )
            {
            // InternalRest.g:6698:1: ( ( rule__OpUpdate__FieldsetAssignment_7_2 ) )
            // InternalRest.g:6699:2: ( rule__OpUpdate__FieldsetAssignment_7_2 )
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetAssignment_7_2()); 
            // InternalRest.g:6700:2: ( rule__OpUpdate__FieldsetAssignment_7_2 )
            // InternalRest.g:6700:3: rule__OpUpdate__FieldsetAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__FieldsetAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getFieldsetAssignment_7_2()); 

            }


            }

        }
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
    // InternalRest.g:6708:1: rule__OpUpdate__Group_7__3 : rule__OpUpdate__Group_7__3__Impl rule__OpUpdate__Group_7__4 ;
    public final void rule__OpUpdate__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6712:1: ( rule__OpUpdate__Group_7__3__Impl rule__OpUpdate__Group_7__4 )
            // InternalRest.g:6713:2: rule__OpUpdate__Group_7__3__Impl rule__OpUpdate__Group_7__4
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
    // InternalRest.g:6720:1: rule__OpUpdate__Group_7__3__Impl : ( ( rule__OpUpdate__Group_7_3__0 )* ) ;
    public final void rule__OpUpdate__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6724:1: ( ( ( rule__OpUpdate__Group_7_3__0 )* ) )
            // InternalRest.g:6725:1: ( ( rule__OpUpdate__Group_7_3__0 )* )
            {
            // InternalRest.g:6725:1: ( ( rule__OpUpdate__Group_7_3__0 )* )
            // InternalRest.g:6726:2: ( rule__OpUpdate__Group_7_3__0 )*
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_7_3()); 
            // InternalRest.g:6727:2: ( rule__OpUpdate__Group_7_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==15) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRest.g:6727:3: rule__OpUpdate__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OpUpdate__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalRest.g:6735:1: rule__OpUpdate__Group_7__4 : rule__OpUpdate__Group_7__4__Impl ;
    public final void rule__OpUpdate__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6739:1: ( rule__OpUpdate__Group_7__4__Impl )
            // InternalRest.g:6740:2: rule__OpUpdate__Group_7__4__Impl
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
    // InternalRest.g:6746:1: rule__OpUpdate__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OpUpdate__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6750:1: ( ( '}' ) )
            // InternalRest.g:6751:1: ( '}' )
            {
            // InternalRest.g:6751:1: ( '}' )
            // InternalRest.g:6752:2: '}'
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
    // InternalRest.g:6762:1: rule__OpUpdate__Group_7_3__0 : rule__OpUpdate__Group_7_3__0__Impl rule__OpUpdate__Group_7_3__1 ;
    public final void rule__OpUpdate__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6766:1: ( rule__OpUpdate__Group_7_3__0__Impl rule__OpUpdate__Group_7_3__1 )
            // InternalRest.g:6767:2: rule__OpUpdate__Group_7_3__0__Impl rule__OpUpdate__Group_7_3__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalRest.g:6774:1: rule__OpUpdate__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OpUpdate__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6778:1: ( ( ',' ) )
            // InternalRest.g:6779:1: ( ',' )
            {
            // InternalRest.g:6779:1: ( ',' )
            // InternalRest.g:6780:2: ','
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
    // InternalRest.g:6789:1: rule__OpUpdate__Group_7_3__1 : rule__OpUpdate__Group_7_3__1__Impl ;
    public final void rule__OpUpdate__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6793:1: ( rule__OpUpdate__Group_7_3__1__Impl )
            // InternalRest.g:6794:2: rule__OpUpdate__Group_7_3__1__Impl
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
    // InternalRest.g:6800:1: rule__OpUpdate__Group_7_3__1__Impl : ( ( rule__OpUpdate__FieldsetAssignment_7_3_1 ) ) ;
    public final void rule__OpUpdate__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6804:1: ( ( ( rule__OpUpdate__FieldsetAssignment_7_3_1 ) ) )
            // InternalRest.g:6805:1: ( ( rule__OpUpdate__FieldsetAssignment_7_3_1 ) )
            {
            // InternalRest.g:6805:1: ( ( rule__OpUpdate__FieldsetAssignment_7_3_1 ) )
            // InternalRest.g:6806:2: ( rule__OpUpdate__FieldsetAssignment_7_3_1 )
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetAssignment_7_3_1()); 
            // InternalRest.g:6807:2: ( rule__OpUpdate__FieldsetAssignment_7_3_1 )
            // InternalRest.g:6807:3: rule__OpUpdate__FieldsetAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__FieldsetAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getFieldsetAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalRest.g:6816:1: rule__OpDelete__Group__0 : rule__OpDelete__Group__0__Impl rule__OpDelete__Group__1 ;
    public final void rule__OpDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6820:1: ( rule__OpDelete__Group__0__Impl rule__OpDelete__Group__1 )
            // InternalRest.g:6821:2: rule__OpDelete__Group__0__Impl rule__OpDelete__Group__1
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
    // InternalRest.g:6828:1: rule__OpDelete__Group__0__Impl : ( 'OpDelete' ) ;
    public final void rule__OpDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6832:1: ( ( 'OpDelete' ) )
            // InternalRest.g:6833:1: ( 'OpDelete' )
            {
            // InternalRest.g:6833:1: ( 'OpDelete' )
            // InternalRest.g:6834:2: 'OpDelete'
            {
             before(grammarAccess.getOpDeleteAccess().getOpDeleteKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalRest.g:6843:1: rule__OpDelete__Group__1 : rule__OpDelete__Group__1__Impl rule__OpDelete__Group__2 ;
    public final void rule__OpDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6847:1: ( rule__OpDelete__Group__1__Impl rule__OpDelete__Group__2 )
            // InternalRest.g:6848:2: rule__OpDelete__Group__1__Impl rule__OpDelete__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:6855:1: rule__OpDelete__Group__1__Impl : ( '{' ) ;
    public final void rule__OpDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6859:1: ( ( '{' ) )
            // InternalRest.g:6860:1: ( '{' )
            {
            // InternalRest.g:6860:1: ( '{' )
            // InternalRest.g:6861:2: '{'
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
    // InternalRest.g:6870:1: rule__OpDelete__Group__2 : rule__OpDelete__Group__2__Impl rule__OpDelete__Group__3 ;
    public final void rule__OpDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6874:1: ( rule__OpDelete__Group__2__Impl rule__OpDelete__Group__3 )
            // InternalRest.g:6875:2: rule__OpDelete__Group__2__Impl rule__OpDelete__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:6882:1: rule__OpDelete__Group__2__Impl : ( ( rule__OpDelete__Group_2__0 )? ) ;
    public final void rule__OpDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6886:1: ( ( ( rule__OpDelete__Group_2__0 )? ) )
            // InternalRest.g:6887:1: ( ( rule__OpDelete__Group_2__0 )? )
            {
            // InternalRest.g:6887:1: ( ( rule__OpDelete__Group_2__0 )? )
            // InternalRest.g:6888:2: ( rule__OpDelete__Group_2__0 )?
            {
             before(grammarAccess.getOpDeleteAccess().getGroup_2()); 
            // InternalRest.g:6889:2: ( rule__OpDelete__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRest.g:6889:3: rule__OpDelete__Group_2__0
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
    // InternalRest.g:6897:1: rule__OpDelete__Group__3 : rule__OpDelete__Group__3__Impl rule__OpDelete__Group__4 ;
    public final void rule__OpDelete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6901:1: ( rule__OpDelete__Group__3__Impl rule__OpDelete__Group__4 )
            // InternalRest.g:6902:2: rule__OpDelete__Group__3__Impl rule__OpDelete__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:6909:1: rule__OpDelete__Group__3__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpDelete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6913:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:6914:1: ( 'failedAnswer' )
            {
            // InternalRest.g:6914:1: ( 'failedAnswer' )
            // InternalRest.g:6915:2: 'failedAnswer'
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRest.g:6924:1: rule__OpDelete__Group__4 : rule__OpDelete__Group__4__Impl rule__OpDelete__Group__5 ;
    public final void rule__OpDelete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6928:1: ( rule__OpDelete__Group__4__Impl rule__OpDelete__Group__5 )
            // InternalRest.g:6929:2: rule__OpDelete__Group__4__Impl rule__OpDelete__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalRest.g:6936:1: rule__OpDelete__Group__4__Impl : ( ( rule__OpDelete__FailedAnswerAssignment_4 ) ) ;
    public final void rule__OpDelete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6940:1: ( ( ( rule__OpDelete__FailedAnswerAssignment_4 ) ) )
            // InternalRest.g:6941:1: ( ( rule__OpDelete__FailedAnswerAssignment_4 ) )
            {
            // InternalRest.g:6941:1: ( ( rule__OpDelete__FailedAnswerAssignment_4 ) )
            // InternalRest.g:6942:2: ( rule__OpDelete__FailedAnswerAssignment_4 )
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerAssignment_4()); 
            // InternalRest.g:6943:2: ( rule__OpDelete__FailedAnswerAssignment_4 )
            // InternalRest.g:6943:3: rule__OpDelete__FailedAnswerAssignment_4
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
    // InternalRest.g:6951:1: rule__OpDelete__Group__5 : rule__OpDelete__Group__5__Impl rule__OpDelete__Group__6 ;
    public final void rule__OpDelete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6955:1: ( rule__OpDelete__Group__5__Impl rule__OpDelete__Group__6 )
            // InternalRest.g:6956:2: rule__OpDelete__Group__5__Impl rule__OpDelete__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:6963:1: rule__OpDelete__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpDelete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6967:1: ( ( 'struct' ) )
            // InternalRest.g:6968:1: ( 'struct' )
            {
            // InternalRest.g:6968:1: ( 'struct' )
            // InternalRest.g:6969:2: 'struct'
            {
             before(grammarAccess.getOpDeleteAccess().getStructKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalRest.g:6978:1: rule__OpDelete__Group__6 : rule__OpDelete__Group__6__Impl rule__OpDelete__Group__7 ;
    public final void rule__OpDelete__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6982:1: ( rule__OpDelete__Group__6__Impl rule__OpDelete__Group__7 )
            // InternalRest.g:6983:2: rule__OpDelete__Group__6__Impl rule__OpDelete__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:6990:1: rule__OpDelete__Group__6__Impl : ( ( rule__OpDelete__StructAssignment_6 ) ) ;
    public final void rule__OpDelete__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6994:1: ( ( ( rule__OpDelete__StructAssignment_6 ) ) )
            // InternalRest.g:6995:1: ( ( rule__OpDelete__StructAssignment_6 ) )
            {
            // InternalRest.g:6995:1: ( ( rule__OpDelete__StructAssignment_6 ) )
            // InternalRest.g:6996:2: ( rule__OpDelete__StructAssignment_6 )
            {
             before(grammarAccess.getOpDeleteAccess().getStructAssignment_6()); 
            // InternalRest.g:6997:2: ( rule__OpDelete__StructAssignment_6 )
            // InternalRest.g:6997:3: rule__OpDelete__StructAssignment_6
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
    // InternalRest.g:7005:1: rule__OpDelete__Group__7 : rule__OpDelete__Group__7__Impl ;
    public final void rule__OpDelete__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7009:1: ( rule__OpDelete__Group__7__Impl )
            // InternalRest.g:7010:2: rule__OpDelete__Group__7__Impl
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
    // InternalRest.g:7016:1: rule__OpDelete__Group__7__Impl : ( '}' ) ;
    public final void rule__OpDelete__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7020:1: ( ( '}' ) )
            // InternalRest.g:7021:1: ( '}' )
            {
            // InternalRest.g:7021:1: ( '}' )
            // InternalRest.g:7022:2: '}'
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
    // InternalRest.g:7032:1: rule__OpDelete__Group_2__0 : rule__OpDelete__Group_2__0__Impl rule__OpDelete__Group_2__1 ;
    public final void rule__OpDelete__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7036:1: ( rule__OpDelete__Group_2__0__Impl rule__OpDelete__Group_2__1 )
            // InternalRest.g:7037:2: rule__OpDelete__Group_2__0__Impl rule__OpDelete__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:7044:1: rule__OpDelete__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpDelete__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7048:1: ( ( 'id' ) )
            // InternalRest.g:7049:1: ( 'id' )
            {
            // InternalRest.g:7049:1: ( 'id' )
            // InternalRest.g:7050:2: 'id'
            {
             before(grammarAccess.getOpDeleteAccess().getIdKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRest.g:7059:1: rule__OpDelete__Group_2__1 : rule__OpDelete__Group_2__1__Impl ;
    public final void rule__OpDelete__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7063:1: ( rule__OpDelete__Group_2__1__Impl )
            // InternalRest.g:7064:2: rule__OpDelete__Group_2__1__Impl
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
    // InternalRest.g:7070:1: rule__OpDelete__Group_2__1__Impl : ( ( rule__OpDelete__IdAssignment_2_1 ) ) ;
    public final void rule__OpDelete__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7074:1: ( ( ( rule__OpDelete__IdAssignment_2_1 ) ) )
            // InternalRest.g:7075:1: ( ( rule__OpDelete__IdAssignment_2_1 ) )
            {
            // InternalRest.g:7075:1: ( ( rule__OpDelete__IdAssignment_2_1 ) )
            // InternalRest.g:7076:2: ( rule__OpDelete__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpDeleteAccess().getIdAssignment_2_1()); 
            // InternalRest.g:7077:2: ( rule__OpDelete__IdAssignment_2_1 )
            // InternalRest.g:7077:3: rule__OpDelete__IdAssignment_2_1
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
    // InternalRest.g:7086:1: rule__FieldSet__Group__0 : rule__FieldSet__Group__0__Impl rule__FieldSet__Group__1 ;
    public final void rule__FieldSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7090:1: ( rule__FieldSet__Group__0__Impl rule__FieldSet__Group__1 )
            // InternalRest.g:7091:2: rule__FieldSet__Group__0__Impl rule__FieldSet__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalRest.g:7098:1: rule__FieldSet__Group__0__Impl : ( () ) ;
    public final void rule__FieldSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7102:1: ( ( () ) )
            // InternalRest.g:7103:1: ( () )
            {
            // InternalRest.g:7103:1: ( () )
            // InternalRest.g:7104:2: ()
            {
             before(grammarAccess.getFieldSetAccess().getFieldSetAction_0()); 
            // InternalRest.g:7105:2: ()
            // InternalRest.g:7105:3: 
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
    // InternalRest.g:7113:1: rule__FieldSet__Group__1 : rule__FieldSet__Group__1__Impl rule__FieldSet__Group__2 ;
    public final void rule__FieldSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7117:1: ( rule__FieldSet__Group__1__Impl rule__FieldSet__Group__2 )
            // InternalRest.g:7118:2: rule__FieldSet__Group__1__Impl rule__FieldSet__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:7125:1: rule__FieldSet__Group__1__Impl : ( 'FieldSet' ) ;
    public final void rule__FieldSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7129:1: ( ( 'FieldSet' ) )
            // InternalRest.g:7130:1: ( 'FieldSet' )
            {
            // InternalRest.g:7130:1: ( 'FieldSet' )
            // InternalRest.g:7131:2: 'FieldSet'
            {
             before(grammarAccess.getFieldSetAccess().getFieldSetKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalRest.g:7140:1: rule__FieldSet__Group__2 : rule__FieldSet__Group__2__Impl rule__FieldSet__Group__3 ;
    public final void rule__FieldSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7144:1: ( rule__FieldSet__Group__2__Impl rule__FieldSet__Group__3 )
            // InternalRest.g:7145:2: rule__FieldSet__Group__2__Impl rule__FieldSet__Group__3
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
    // InternalRest.g:7152:1: rule__FieldSet__Group__2__Impl : ( ( rule__FieldSet__NameAssignment_2 ) ) ;
    public final void rule__FieldSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7156:1: ( ( ( rule__FieldSet__NameAssignment_2 ) ) )
            // InternalRest.g:7157:1: ( ( rule__FieldSet__NameAssignment_2 ) )
            {
            // InternalRest.g:7157:1: ( ( rule__FieldSet__NameAssignment_2 ) )
            // InternalRest.g:7158:2: ( rule__FieldSet__NameAssignment_2 )
            {
             before(grammarAccess.getFieldSetAccess().getNameAssignment_2()); 
            // InternalRest.g:7159:2: ( rule__FieldSet__NameAssignment_2 )
            // InternalRest.g:7159:3: rule__FieldSet__NameAssignment_2
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
    // InternalRest.g:7167:1: rule__FieldSet__Group__3 : rule__FieldSet__Group__3__Impl rule__FieldSet__Group__4 ;
    public final void rule__FieldSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7171:1: ( rule__FieldSet__Group__3__Impl rule__FieldSet__Group__4 )
            // InternalRest.g:7172:2: rule__FieldSet__Group__3__Impl rule__FieldSet__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalRest.g:7179:1: rule__FieldSet__Group__3__Impl : ( '{' ) ;
    public final void rule__FieldSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7183:1: ( ( '{' ) )
            // InternalRest.g:7184:1: ( '{' )
            {
            // InternalRest.g:7184:1: ( '{' )
            // InternalRest.g:7185:2: '{'
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
    // InternalRest.g:7194:1: rule__FieldSet__Group__4 : rule__FieldSet__Group__4__Impl rule__FieldSet__Group__5 ;
    public final void rule__FieldSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7198:1: ( rule__FieldSet__Group__4__Impl rule__FieldSet__Group__5 )
            // InternalRest.g:7199:2: rule__FieldSet__Group__4__Impl rule__FieldSet__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalRest.g:7206:1: rule__FieldSet__Group__4__Impl : ( ( rule__FieldSet__Group_4__0 )? ) ;
    public final void rule__FieldSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7210:1: ( ( ( rule__FieldSet__Group_4__0 )? ) )
            // InternalRest.g:7211:1: ( ( rule__FieldSet__Group_4__0 )? )
            {
            // InternalRest.g:7211:1: ( ( rule__FieldSet__Group_4__0 )? )
            // InternalRest.g:7212:2: ( rule__FieldSet__Group_4__0 )?
            {
             before(grammarAccess.getFieldSetAccess().getGroup_4()); 
            // InternalRest.g:7213:2: ( rule__FieldSet__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRest.g:7213:3: rule__FieldSet__Group_4__0
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
    // InternalRest.g:7221:1: rule__FieldSet__Group__5 : rule__FieldSet__Group__5__Impl ;
    public final void rule__FieldSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7225:1: ( rule__FieldSet__Group__5__Impl )
            // InternalRest.g:7226:2: rule__FieldSet__Group__5__Impl
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
    // InternalRest.g:7232:1: rule__FieldSet__Group__5__Impl : ( '}' ) ;
    public final void rule__FieldSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7236:1: ( ( '}' ) )
            // InternalRest.g:7237:1: ( '}' )
            {
            // InternalRest.g:7237:1: ( '}' )
            // InternalRest.g:7238:2: '}'
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
    // InternalRest.g:7248:1: rule__FieldSet__Group_4__0 : rule__FieldSet__Group_4__0__Impl rule__FieldSet__Group_4__1 ;
    public final void rule__FieldSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7252:1: ( rule__FieldSet__Group_4__0__Impl rule__FieldSet__Group_4__1 )
            // InternalRest.g:7253:2: rule__FieldSet__Group_4__0__Impl rule__FieldSet__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:7260:1: rule__FieldSet__Group_4__0__Impl : ( 'expr' ) ;
    public final void rule__FieldSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7264:1: ( ( 'expr' ) )
            // InternalRest.g:7265:1: ( 'expr' )
            {
            // InternalRest.g:7265:1: ( 'expr' )
            // InternalRest.g:7266:2: 'expr'
            {
             before(grammarAccess.getFieldSetAccess().getExprKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFieldSetAccess().getExprKeyword_4_0()); 

            }


            }

        }
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
    // InternalRest.g:7275:1: rule__FieldSet__Group_4__1 : rule__FieldSet__Group_4__1__Impl ;
    public final void rule__FieldSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7279:1: ( rule__FieldSet__Group_4__1__Impl )
            // InternalRest.g:7280:2: rule__FieldSet__Group_4__1__Impl
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
    // InternalRest.g:7286:1: rule__FieldSet__Group_4__1__Impl : ( ( rule__FieldSet__ExprAssignment_4_1 ) ) ;
    public final void rule__FieldSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7290:1: ( ( ( rule__FieldSet__ExprAssignment_4_1 ) ) )
            // InternalRest.g:7291:1: ( ( rule__FieldSet__ExprAssignment_4_1 ) )
            {
            // InternalRest.g:7291:1: ( ( rule__FieldSet__ExprAssignment_4_1 ) )
            // InternalRest.g:7292:2: ( rule__FieldSet__ExprAssignment_4_1 )
            {
             before(grammarAccess.getFieldSetAccess().getExprAssignment_4_1()); 
            // InternalRest.g:7293:2: ( rule__FieldSet__ExprAssignment_4_1 )
            // InternalRest.g:7293:3: rule__FieldSet__ExprAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSet__ExprAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldSetAccess().getExprAssignment_4_1()); 

            }


            }

        }
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
    // InternalRest.g:7302:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7306:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalRest.g:7307:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalRest.g:7314:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7318:1: ( ( () ) )
            // InternalRest.g:7319:1: ( () )
            {
            // InternalRest.g:7319:1: ( () )
            // InternalRest.g:7320:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // InternalRest.g:7321:2: ()
            // InternalRest.g:7321:3: 
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
    // InternalRest.g:7329:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7333:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalRest.g:7334:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:7341:1: rule__Field__Group__1__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7345:1: ( ( 'Field' ) )
            // InternalRest.g:7346:1: ( 'Field' )
            {
            // InternalRest.g:7346:1: ( 'Field' )
            // InternalRest.g:7347:2: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalRest.g:7356:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7360:1: ( rule__Field__Group__2__Impl )
            // InternalRest.g:7361:2: rule__Field__Group__2__Impl
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
    // InternalRest.g:7367:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7371:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalRest.g:7372:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalRest.g:7372:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalRest.g:7373:2: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // InternalRest.g:7374:2: ( rule__Field__NameAssignment_2 )
            // InternalRest.g:7374:3: rule__Field__NameAssignment_2
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
    // InternalRest.g:7383:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7387:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRest.g:7388:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalRest.g:7395:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7399:1: ( ( ( '-' )? ) )
            // InternalRest.g:7400:1: ( ( '-' )? )
            {
            // InternalRest.g:7400:1: ( ( '-' )? )
            // InternalRest.g:7401:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRest.g:7402:2: ( '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==52) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRest.g:7402:3: '-'
                    {
                    match(input,52,FOLLOW_2); 

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
    // InternalRest.g:7410:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7414:1: ( rule__EInt__Group__1__Impl )
            // InternalRest.g:7415:2: rule__EInt__Group__1__Impl
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
    // InternalRest.g:7421:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7425:1: ( ( RULE_INT ) )
            // InternalRest.g:7426:1: ( RULE_INT )
            {
            // InternalRest.g:7426:1: ( RULE_INT )
            // InternalRest.g:7427:2: RULE_INT
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


    // $ANTLR start "rule__RestSystem__RequestAssignment_3_2"
    // InternalRest.g:7437:1: rule__RestSystem__RequestAssignment_3_2 : ( ruleRequest ) ;
    public final void rule__RestSystem__RequestAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7441:1: ( ( ruleRequest ) )
            // InternalRest.g:7442:2: ( ruleRequest )
            {
            // InternalRest.g:7442:2: ( ruleRequest )
            // InternalRest.g:7443:3: ruleRequest
            {
             before(grammarAccess.getRestSystemAccess().getRequestRequestParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getRequestRequestParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__RequestAssignment_3_2"


    // $ANTLR start "rule__RestSystem__RequestAssignment_3_3_1"
    // InternalRest.g:7452:1: rule__RestSystem__RequestAssignment_3_3_1 : ( ruleRequest ) ;
    public final void rule__RestSystem__RequestAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7456:1: ( ( ruleRequest ) )
            // InternalRest.g:7457:2: ( ruleRequest )
            {
            // InternalRest.g:7457:2: ( ruleRequest )
            // InternalRest.g:7458:3: ruleRequest
            {
             before(grammarAccess.getRestSystemAccess().getRequestRequestParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getRequestRequestParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__RequestAssignment_3_3_1"


    // $ANTLR start "rule__RestSystem__StructAssignment_4_2"
    // InternalRest.g:7467:1: rule__RestSystem__StructAssignment_4_2 : ( ruleStruct ) ;
    public final void rule__RestSystem__StructAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7471:1: ( ( ruleStruct ) )
            // InternalRest.g:7472:2: ( ruleStruct )
            {
            // InternalRest.g:7472:2: ( ruleStruct )
            // InternalRest.g:7473:3: ruleStruct
            {
             before(grammarAccess.getRestSystemAccess().getStructStructParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getStructStructParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__StructAssignment_4_2"


    // $ANTLR start "rule__RestSystem__StructAssignment_4_3_1"
    // InternalRest.g:7482:1: rule__RestSystem__StructAssignment_4_3_1 : ( ruleStruct ) ;
    public final void rule__RestSystem__StructAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7486:1: ( ( ruleStruct ) )
            // InternalRest.g:7487:2: ( ruleStruct )
            {
            // InternalRest.g:7487:2: ( ruleStruct )
            // InternalRest.g:7488:3: ruleStruct
            {
             before(grammarAccess.getRestSystemAccess().getStructStructParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getStructStructParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__StructAssignment_4_3_1"


    // $ANTLR start "rule__RestSystem__OperationAssignment_5_2"
    // InternalRest.g:7497:1: rule__RestSystem__OperationAssignment_5_2 : ( ruleOperation ) ;
    public final void rule__RestSystem__OperationAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7501:1: ( ( ruleOperation ) )
            // InternalRest.g:7502:2: ( ruleOperation )
            {
            // InternalRest.g:7502:2: ( ruleOperation )
            // InternalRest.g:7503:3: ruleOperation
            {
             before(grammarAccess.getRestSystemAccess().getOperationOperationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getOperationOperationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__OperationAssignment_5_2"


    // $ANTLR start "rule__RestSystem__OperationAssignment_5_3_1"
    // InternalRest.g:7512:1: rule__RestSystem__OperationAssignment_5_3_1 : ( ruleOperation ) ;
    public final void rule__RestSystem__OperationAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7516:1: ( ( ruleOperation ) )
            // InternalRest.g:7517:2: ( ruleOperation )
            {
            // InternalRest.g:7517:2: ( ruleOperation )
            // InternalRest.g:7518:3: ruleOperation
            {
             before(grammarAccess.getRestSystemAccess().getOperationOperationParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getOperationOperationParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__OperationAssignment_5_3_1"


    // $ANTLR start "rule__RestSystem__AnswerAssignment_6_2"
    // InternalRest.g:7527:1: rule__RestSystem__AnswerAssignment_6_2 : ( ruleAnswer ) ;
    public final void rule__RestSystem__AnswerAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7531:1: ( ( ruleAnswer ) )
            // InternalRest.g:7532:2: ( ruleAnswer )
            {
            // InternalRest.g:7532:2: ( ruleAnswer )
            // InternalRest.g:7533:3: ruleAnswer
            {
             before(grammarAccess.getRestSystemAccess().getAnswerAnswerParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getAnswerAnswerParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__AnswerAssignment_6_2"


    // $ANTLR start "rule__RestSystem__AnswerAssignment_6_3_1"
    // InternalRest.g:7542:1: rule__RestSystem__AnswerAssignment_6_3_1 : ( ruleAnswer ) ;
    public final void rule__RestSystem__AnswerAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7546:1: ( ( ruleAnswer ) )
            // InternalRest.g:7547:2: ( ruleAnswer )
            {
            // InternalRest.g:7547:2: ( ruleAnswer )
            // InternalRest.g:7548:3: ruleAnswer
            {
             before(grammarAccess.getRestSystemAccess().getAnswerAnswerParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getRestSystemAccess().getAnswerAnswerParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestSystem__AnswerAssignment_6_3_1"


    // $ANTLR start "rule__Struct__FieldsAssignment_3_1"
    // InternalRest.g:7557:1: rule__Struct__FieldsAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Struct__FieldsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7561:1: ( ( ruleEString ) )
            // InternalRest.g:7562:2: ( ruleEString )
            {
            // InternalRest.g:7562:2: ( ruleEString )
            // InternalRest.g:7563:3: ruleEString
            {
             before(grammarAccess.getStructAccess().getFieldsEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStructAccess().getFieldsEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__FieldsAssignment_3_1"


    // $ANTLR start "rule__Answer__StatusAssignment_3_1"
    // InternalRest.g:7572:1: rule__Answer__StatusAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Answer__StatusAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7576:1: ( ( ruleEInt ) )
            // InternalRest.g:7577:2: ( ruleEInt )
            {
            // InternalRest.g:7577:2: ( ruleEInt )
            // InternalRest.g:7578:3: ruleEInt
            {
             before(grammarAccess.getAnswerAccess().getStatusEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getStatusEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__StatusAssignment_3_1"


    // $ANTLR start "rule__Answer__ReturnAssignment_4_1"
    // InternalRest.g:7587:1: rule__Answer__ReturnAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Answer__ReturnAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7591:1: ( ( ruleEString ) )
            // InternalRest.g:7592:2: ( ruleEString )
            {
            // InternalRest.g:7592:2: ( ruleEString )
            // InternalRest.g:7593:3: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getReturnEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getReturnEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__ReturnAssignment_4_1"


    // $ANTLR start "rule__Route__SegmentAssignment_4"
    // InternalRest.g:7602:1: rule__Route__SegmentAssignment_4 : ( ruleSegment ) ;
    public final void rule__Route__SegmentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7606:1: ( ( ruleSegment ) )
            // InternalRest.g:7607:2: ( ruleSegment )
            {
            // InternalRest.g:7607:2: ( ruleSegment )
            // InternalRest.g:7608:3: ruleSegment
            {
             before(grammarAccess.getRouteAccess().getSegmentSegmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getSegmentSegmentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__SegmentAssignment_4"


    // $ANTLR start "rule__Route__SegmentAssignment_5_1"
    // InternalRest.g:7617:1: rule__Route__SegmentAssignment_5_1 : ( ruleSegment ) ;
    public final void rule__Route__SegmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7621:1: ( ( ruleSegment ) )
            // InternalRest.g:7622:2: ( ruleSegment )
            {
            // InternalRest.g:7622:2: ( ruleSegment )
            // InternalRest.g:7623:3: ruleSegment
            {
             before(grammarAccess.getRouteAccess().getSegmentSegmentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getSegmentSegmentParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__SegmentAssignment_5_1"


    // $ANTLR start "rule__ReGet__OpsAssignment_2_2"
    // InternalRest.g:7632:1: rule__ReGet__OpsAssignment_2_2 : ( ( ruleEString ) ) ;
    public final void rule__ReGet__OpsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7636:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7637:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7637:2: ( ( ruleEString ) )
            // InternalRest.g:7638:3: ( ruleEString )
            {
             before(grammarAccess.getReGetAccess().getOpsOperationCrossReference_2_2_0()); 
            // InternalRest.g:7639:3: ( ruleEString )
            // InternalRest.g:7640:4: ruleEString
            {
             before(grammarAccess.getReGetAccess().getOpsOperationEStringParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getOpsOperationEStringParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getReGetAccess().getOpsOperationCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__OpsAssignment_2_2"


    // $ANTLR start "rule__ReGet__OpsAssignment_2_3_1"
    // InternalRest.g:7651:1: rule__ReGet__OpsAssignment_2_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ReGet__OpsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7655:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7656:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7656:2: ( ( ruleEString ) )
            // InternalRest.g:7657:3: ( ruleEString )
            {
             before(grammarAccess.getReGetAccess().getOpsOperationCrossReference_2_3_1_0()); 
            // InternalRest.g:7658:3: ( ruleEString )
            // InternalRest.g:7659:4: ruleEString
            {
             before(grammarAccess.getReGetAccess().getOpsOperationEStringParserRuleCall_2_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getOpsOperationEStringParserRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getReGetAccess().getOpsOperationCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__OpsAssignment_2_3_1"


    // $ANTLR start "rule__ReGet__SuccAnswerAssignment_4"
    // InternalRest.g:7670:1: rule__ReGet__SuccAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ReGet__SuccAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7674:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7675:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7675:2: ( ( ruleEString ) )
            // InternalRest.g:7676:3: ( ruleEString )
            {
             before(grammarAccess.getReGetAccess().getSuccAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:7677:3: ( ruleEString )
            // InternalRest.g:7678:4: ruleEString
            {
             before(grammarAccess.getReGetAccess().getSuccAnswerAnswerEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getSuccAnswerAnswerEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReGetAccess().getSuccAnswerAnswerCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__SuccAnswerAssignment_4"


    // $ANTLR start "rule__ReGet__RouteAssignment_6"
    // InternalRest.g:7689:1: rule__ReGet__RouteAssignment_6 : ( ruleRoute ) ;
    public final void rule__ReGet__RouteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7693:1: ( ( ruleRoute ) )
            // InternalRest.g:7694:2: ( ruleRoute )
            {
            // InternalRest.g:7694:2: ( ruleRoute )
            // InternalRest.g:7695:3: ruleRoute
            {
             before(grammarAccess.getReGetAccess().getRouteRouteParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getRouteRouteParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__RouteAssignment_6"


    // $ANTLR start "rule__ReGet__DataAssignment_7_2"
    // InternalRest.g:7704:1: rule__ReGet__DataAssignment_7_2 : ( ruleData ) ;
    public final void rule__ReGet__DataAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7708:1: ( ( ruleData ) )
            // InternalRest.g:7709:2: ( ruleData )
            {
            // InternalRest.g:7709:2: ( ruleData )
            // InternalRest.g:7710:3: ruleData
            {
             before(grammarAccess.getReGetAccess().getDataDataParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getDataDataParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__DataAssignment_7_2"


    // $ANTLR start "rule__ReGet__DataAssignment_7_3_1"
    // InternalRest.g:7719:1: rule__ReGet__DataAssignment_7_3_1 : ( ruleData ) ;
    public final void rule__ReGet__DataAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7723:1: ( ( ruleData ) )
            // InternalRest.g:7724:2: ( ruleData )
            {
            // InternalRest.g:7724:2: ( ruleData )
            // InternalRest.g:7725:3: ruleData
            {
             before(grammarAccess.getReGetAccess().getDataDataParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getDataDataParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__DataAssignment_7_3_1"


    // $ANTLR start "rule__RePost__OpsAssignment_2_2"
    // InternalRest.g:7734:1: rule__RePost__OpsAssignment_2_2 : ( ( ruleEString ) ) ;
    public final void rule__RePost__OpsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7738:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7739:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7739:2: ( ( ruleEString ) )
            // InternalRest.g:7740:3: ( ruleEString )
            {
             before(grammarAccess.getRePostAccess().getOpsOperationCrossReference_2_2_0()); 
            // InternalRest.g:7741:3: ( ruleEString )
            // InternalRest.g:7742:4: ruleEString
            {
             before(grammarAccess.getRePostAccess().getOpsOperationEStringParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getOpsOperationEStringParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getRePostAccess().getOpsOperationCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__OpsAssignment_2_2"


    // $ANTLR start "rule__RePost__OpsAssignment_2_3_1"
    // InternalRest.g:7753:1: rule__RePost__OpsAssignment_2_3_1 : ( ( ruleEString ) ) ;
    public final void rule__RePost__OpsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7757:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7758:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7758:2: ( ( ruleEString ) )
            // InternalRest.g:7759:3: ( ruleEString )
            {
             before(grammarAccess.getRePostAccess().getOpsOperationCrossReference_2_3_1_0()); 
            // InternalRest.g:7760:3: ( ruleEString )
            // InternalRest.g:7761:4: ruleEString
            {
             before(grammarAccess.getRePostAccess().getOpsOperationEStringParserRuleCall_2_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getOpsOperationEStringParserRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getRePostAccess().getOpsOperationCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__OpsAssignment_2_3_1"


    // $ANTLR start "rule__RePost__SuccAnswerAssignment_4"
    // InternalRest.g:7772:1: rule__RePost__SuccAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RePost__SuccAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7776:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7777:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7777:2: ( ( ruleEString ) )
            // InternalRest.g:7778:3: ( ruleEString )
            {
             before(grammarAccess.getRePostAccess().getSuccAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:7779:3: ( ruleEString )
            // InternalRest.g:7780:4: ruleEString
            {
             before(grammarAccess.getRePostAccess().getSuccAnswerAnswerEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getSuccAnswerAnswerEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRePostAccess().getSuccAnswerAnswerCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__SuccAnswerAssignment_4"


    // $ANTLR start "rule__RePost__RouteAssignment_6"
    // InternalRest.g:7791:1: rule__RePost__RouteAssignment_6 : ( ruleRoute ) ;
    public final void rule__RePost__RouteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7795:1: ( ( ruleRoute ) )
            // InternalRest.g:7796:2: ( ruleRoute )
            {
            // InternalRest.g:7796:2: ( ruleRoute )
            // InternalRest.g:7797:3: ruleRoute
            {
             before(grammarAccess.getRePostAccess().getRouteRouteParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getRouteRouteParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__RouteAssignment_6"


    // $ANTLR start "rule__RePost__DataAssignment_7_2"
    // InternalRest.g:7806:1: rule__RePost__DataAssignment_7_2 : ( ruleData ) ;
    public final void rule__RePost__DataAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7810:1: ( ( ruleData ) )
            // InternalRest.g:7811:2: ( ruleData )
            {
            // InternalRest.g:7811:2: ( ruleData )
            // InternalRest.g:7812:3: ruleData
            {
             before(grammarAccess.getRePostAccess().getDataDataParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getDataDataParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__DataAssignment_7_2"


    // $ANTLR start "rule__RePost__DataAssignment_7_3_1"
    // InternalRest.g:7821:1: rule__RePost__DataAssignment_7_3_1 : ( ruleData ) ;
    public final void rule__RePost__DataAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7825:1: ( ( ruleData ) )
            // InternalRest.g:7826:2: ( ruleData )
            {
            // InternalRest.g:7826:2: ( ruleData )
            // InternalRest.g:7827:3: ruleData
            {
             before(grammarAccess.getRePostAccess().getDataDataParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getDataDataParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__DataAssignment_7_3_1"


    // $ANTLR start "rule__RePut__OpsAssignment_2_2"
    // InternalRest.g:7836:1: rule__RePut__OpsAssignment_2_2 : ( ( ruleEString ) ) ;
    public final void rule__RePut__OpsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7840:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7841:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7841:2: ( ( ruleEString ) )
            // InternalRest.g:7842:3: ( ruleEString )
            {
             before(grammarAccess.getRePutAccess().getOpsOperationCrossReference_2_2_0()); 
            // InternalRest.g:7843:3: ( ruleEString )
            // InternalRest.g:7844:4: ruleEString
            {
             before(grammarAccess.getRePutAccess().getOpsOperationEStringParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getOpsOperationEStringParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getRePutAccess().getOpsOperationCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__OpsAssignment_2_2"


    // $ANTLR start "rule__RePut__OpsAssignment_2_3_1"
    // InternalRest.g:7855:1: rule__RePut__OpsAssignment_2_3_1 : ( ( ruleEString ) ) ;
    public final void rule__RePut__OpsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7859:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7860:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7860:2: ( ( ruleEString ) )
            // InternalRest.g:7861:3: ( ruleEString )
            {
             before(grammarAccess.getRePutAccess().getOpsOperationCrossReference_2_3_1_0()); 
            // InternalRest.g:7862:3: ( ruleEString )
            // InternalRest.g:7863:4: ruleEString
            {
             before(grammarAccess.getRePutAccess().getOpsOperationEStringParserRuleCall_2_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getOpsOperationEStringParserRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getRePutAccess().getOpsOperationCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__OpsAssignment_2_3_1"


    // $ANTLR start "rule__RePut__SuccAnswerAssignment_4"
    // InternalRest.g:7874:1: rule__RePut__SuccAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RePut__SuccAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7878:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7879:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7879:2: ( ( ruleEString ) )
            // InternalRest.g:7880:3: ( ruleEString )
            {
             before(grammarAccess.getRePutAccess().getSuccAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:7881:3: ( ruleEString )
            // InternalRest.g:7882:4: ruleEString
            {
             before(grammarAccess.getRePutAccess().getSuccAnswerAnswerEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getSuccAnswerAnswerEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRePutAccess().getSuccAnswerAnswerCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__SuccAnswerAssignment_4"


    // $ANTLR start "rule__RePut__RouteAssignment_6"
    // InternalRest.g:7893:1: rule__RePut__RouteAssignment_6 : ( ruleRoute ) ;
    public final void rule__RePut__RouteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7897:1: ( ( ruleRoute ) )
            // InternalRest.g:7898:2: ( ruleRoute )
            {
            // InternalRest.g:7898:2: ( ruleRoute )
            // InternalRest.g:7899:3: ruleRoute
            {
             before(grammarAccess.getRePutAccess().getRouteRouteParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getRouteRouteParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__RouteAssignment_6"


    // $ANTLR start "rule__RePut__DataAssignment_7_2"
    // InternalRest.g:7908:1: rule__RePut__DataAssignment_7_2 : ( ruleData ) ;
    public final void rule__RePut__DataAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7912:1: ( ( ruleData ) )
            // InternalRest.g:7913:2: ( ruleData )
            {
            // InternalRest.g:7913:2: ( ruleData )
            // InternalRest.g:7914:3: ruleData
            {
             before(grammarAccess.getRePutAccess().getDataDataParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getDataDataParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__DataAssignment_7_2"


    // $ANTLR start "rule__RePut__DataAssignment_7_3_1"
    // InternalRest.g:7923:1: rule__RePut__DataAssignment_7_3_1 : ( ruleData ) ;
    public final void rule__RePut__DataAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7927:1: ( ( ruleData ) )
            // InternalRest.g:7928:2: ( ruleData )
            {
            // InternalRest.g:7928:2: ( ruleData )
            // InternalRest.g:7929:3: ruleData
            {
             before(grammarAccess.getRePutAccess().getDataDataParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getDataDataParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__DataAssignment_7_3_1"


    // $ANTLR start "rule__ReDelete__OpsAssignment_2_2"
    // InternalRest.g:7938:1: rule__ReDelete__OpsAssignment_2_2 : ( ( ruleEString ) ) ;
    public final void rule__ReDelete__OpsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7942:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7943:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7943:2: ( ( ruleEString ) )
            // InternalRest.g:7944:3: ( ruleEString )
            {
             before(grammarAccess.getReDeleteAccess().getOpsOperationCrossReference_2_2_0()); 
            // InternalRest.g:7945:3: ( ruleEString )
            // InternalRest.g:7946:4: ruleEString
            {
             before(grammarAccess.getReDeleteAccess().getOpsOperationEStringParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getOpsOperationEStringParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getReDeleteAccess().getOpsOperationCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__OpsAssignment_2_2"


    // $ANTLR start "rule__ReDelete__OpsAssignment_2_3_1"
    // InternalRest.g:7957:1: rule__ReDelete__OpsAssignment_2_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ReDelete__OpsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7961:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7962:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7962:2: ( ( ruleEString ) )
            // InternalRest.g:7963:3: ( ruleEString )
            {
             before(grammarAccess.getReDeleteAccess().getOpsOperationCrossReference_2_3_1_0()); 
            // InternalRest.g:7964:3: ( ruleEString )
            // InternalRest.g:7965:4: ruleEString
            {
             before(grammarAccess.getReDeleteAccess().getOpsOperationEStringParserRuleCall_2_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getOpsOperationEStringParserRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getReDeleteAccess().getOpsOperationCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__OpsAssignment_2_3_1"


    // $ANTLR start "rule__ReDelete__SuccAnswerAssignment_4"
    // InternalRest.g:7976:1: rule__ReDelete__SuccAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ReDelete__SuccAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7980:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:7981:2: ( ( ruleEString ) )
            {
            // InternalRest.g:7981:2: ( ( ruleEString ) )
            // InternalRest.g:7982:3: ( ruleEString )
            {
             before(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:7983:3: ( ruleEString )
            // InternalRest.g:7984:4: ruleEString
            {
             before(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReDeleteAccess().getSuccAnswerAnswerCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__SuccAnswerAssignment_4"


    // $ANTLR start "rule__ReDelete__RouteAssignment_6"
    // InternalRest.g:7995:1: rule__ReDelete__RouteAssignment_6 : ( ruleRoute ) ;
    public final void rule__ReDelete__RouteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7999:1: ( ( ruleRoute ) )
            // InternalRest.g:8000:2: ( ruleRoute )
            {
            // InternalRest.g:8000:2: ( ruleRoute )
            // InternalRest.g:8001:3: ruleRoute
            {
             before(grammarAccess.getReDeleteAccess().getRouteRouteParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getRouteRouteParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__RouteAssignment_6"


    // $ANTLR start "rule__ReDelete__DataAssignment_7_2"
    // InternalRest.g:8010:1: rule__ReDelete__DataAssignment_7_2 : ( ruleData ) ;
    public final void rule__ReDelete__DataAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8014:1: ( ( ruleData ) )
            // InternalRest.g:8015:2: ( ruleData )
            {
            // InternalRest.g:8015:2: ( ruleData )
            // InternalRest.g:8016:3: ruleData
            {
             before(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__DataAssignment_7_2"


    // $ANTLR start "rule__ReDelete__DataAssignment_7_3_1"
    // InternalRest.g:8025:1: rule__ReDelete__DataAssignment_7_3_1 : ( ruleData ) ;
    public final void rule__ReDelete__DataAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8029:1: ( ( ruleData ) )
            // InternalRest.g:8030:2: ( ruleData )
            {
            // InternalRest.g:8030:2: ( ruleData )
            // InternalRest.g:8031:3: ruleData
            {
             before(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__DataAssignment_7_3_1"


    // $ANTLR start "rule__Segment__ValueAssignment_3_1"
    // InternalRest.g:8040:1: rule__Segment__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Segment__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8044:1: ( ( ruleEString ) )
            // InternalRest.g:8045:2: ( ruleEString )
            {
            // InternalRest.g:8045:2: ( ruleEString )
            // InternalRest.g:8046:3: ruleEString
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


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalRest.g:8055:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8059:1: ( ( ruleEString ) )
            // InternalRest.g:8060:2: ( ruleEString )
            {
            // InternalRest.g:8060:2: ( ruleEString )
            // InternalRest.g:8061:3: ruleEString
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


    // $ANTLR start "rule__Attachments__NameAssignment_2"
    // InternalRest.g:8070:1: rule__Attachments__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Attachments__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8074:1: ( ( ruleEString ) )
            // InternalRest.g:8075:2: ( ruleEString )
            {
            // InternalRest.g:8075:2: ( ruleEString )
            // InternalRest.g:8076:3: ruleEString
            {
             before(grammarAccess.getAttachmentsAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttachmentsAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachments__NameAssignment_2"


    // $ANTLR start "rule__Random__NameAssignment_2"
    // InternalRest.g:8085:1: rule__Random__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Random__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8089:1: ( ( ruleEString ) )
            // InternalRest.g:8090:2: ( ruleEString )
            {
            // InternalRest.g:8090:2: ( ruleEString )
            // InternalRest.g:8091:3: ruleEString
            {
             before(grammarAccess.getRandomAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRandomAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random__NameAssignment_2"


    // $ANTLR start "rule__OpCreate__IdAssignment_2_1"
    // InternalRest.g:8100:1: rule__OpCreate__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpCreate__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8104:1: ( ( ruleEString ) )
            // InternalRest.g:8105:2: ( ruleEString )
            {
            // InternalRest.g:8105:2: ( ruleEString )
            // InternalRest.g:8106:3: ruleEString
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
    // InternalRest.g:8115:1: rule__OpCreate__FailedAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__OpCreate__FailedAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8119:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:8120:2: ( ( ruleEString ) )
            {
            // InternalRest.g:8120:2: ( ( ruleEString ) )
            // InternalRest.g:8121:3: ( ruleEString )
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:8122:3: ( ruleEString )
            // InternalRest.g:8123:4: ruleEString
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
    // InternalRest.g:8134:1: rule__OpCreate__StructAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__OpCreate__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8138:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:8139:2: ( ( ruleEString ) )
            {
            // InternalRest.g:8139:2: ( ( ruleEString ) )
            // InternalRest.g:8140:3: ( ruleEString )
            {
             before(grammarAccess.getOpCreateAccess().getStructStructCrossReference_6_0()); 
            // InternalRest.g:8141:3: ( ruleEString )
            // InternalRest.g:8142:4: ruleEString
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


    // $ANTLR start "rule__OpCreate__FieldsetAssignment_7_2"
    // InternalRest.g:8153:1: rule__OpCreate__FieldsetAssignment_7_2 : ( ruleFieldSet ) ;
    public final void rule__OpCreate__FieldsetAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8157:1: ( ( ruleFieldSet ) )
            // InternalRest.g:8158:2: ( ruleFieldSet )
            {
            // InternalRest.g:8158:2: ( ruleFieldSet )
            // InternalRest.g:8159:3: ruleFieldSet
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetFieldSetParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSet();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getFieldsetFieldSetParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__FieldsetAssignment_7_2"


    // $ANTLR start "rule__OpCreate__FieldsetAssignment_7_3_1"
    // InternalRest.g:8168:1: rule__OpCreate__FieldsetAssignment_7_3_1 : ( ruleFieldSet ) ;
    public final void rule__OpCreate__FieldsetAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8172:1: ( ( ruleFieldSet ) )
            // InternalRest.g:8173:2: ( ruleFieldSet )
            {
            // InternalRest.g:8173:2: ( ruleFieldSet )
            // InternalRest.g:8174:3: ruleFieldSet
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetFieldSetParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSet();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getFieldsetFieldSetParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__FieldsetAssignment_7_3_1"


    // $ANTLR start "rule__OpRead__IdAssignment_2_1"
    // InternalRest.g:8183:1: rule__OpRead__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpRead__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8187:1: ( ( ruleEString ) )
            // InternalRest.g:8188:2: ( ruleEString )
            {
            // InternalRest.g:8188:2: ( ruleEString )
            // InternalRest.g:8189:3: ruleEString
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
    // InternalRest.g:8198:1: rule__OpRead__FailedAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__OpRead__FailedAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8202:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:8203:2: ( ( ruleEString ) )
            {
            // InternalRest.g:8203:2: ( ( ruleEString ) )
            // InternalRest.g:8204:3: ( ruleEString )
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:8205:3: ( ruleEString )
            // InternalRest.g:8206:4: ruleEString
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
    // InternalRest.g:8217:1: rule__OpRead__StructAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__OpRead__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8221:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:8222:2: ( ( ruleEString ) )
            {
            // InternalRest.g:8222:2: ( ( ruleEString ) )
            // InternalRest.g:8223:3: ( ruleEString )
            {
             before(grammarAccess.getOpReadAccess().getStructStructCrossReference_6_0()); 
            // InternalRest.g:8224:3: ( ruleEString )
            // InternalRest.g:8225:4: ruleEString
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


    // $ANTLR start "rule__OpRead__FieldAssignment_7_2"
    // InternalRest.g:8236:1: rule__OpRead__FieldAssignment_7_2 : ( ruleField ) ;
    public final void rule__OpRead__FieldAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8240:1: ( ( ruleField ) )
            // InternalRest.g:8241:2: ( ruleField )
            {
            // InternalRest.g:8241:2: ( ruleField )
            // InternalRest.g:8242:3: ruleField
            {
             before(grammarAccess.getOpReadAccess().getFieldFieldParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getFieldFieldParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__FieldAssignment_7_2"


    // $ANTLR start "rule__OpRead__FieldAssignment_7_3_1"
    // InternalRest.g:8251:1: rule__OpRead__FieldAssignment_7_3_1 : ( ruleField ) ;
    public final void rule__OpRead__FieldAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8255:1: ( ( ruleField ) )
            // InternalRest.g:8256:2: ( ruleField )
            {
            // InternalRest.g:8256:2: ( ruleField )
            // InternalRest.g:8257:3: ruleField
            {
             before(grammarAccess.getOpReadAccess().getFieldFieldParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getFieldFieldParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__FieldAssignment_7_3_1"


    // $ANTLR start "rule__OpUpdate__IdAssignment_2_1"
    // InternalRest.g:8266:1: rule__OpUpdate__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpUpdate__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8270:1: ( ( ruleEString ) )
            // InternalRest.g:8271:2: ( ruleEString )
            {
            // InternalRest.g:8271:2: ( ruleEString )
            // InternalRest.g:8272:3: ruleEString
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
    // InternalRest.g:8281:1: rule__OpUpdate__FailedAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__OpUpdate__FailedAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8285:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:8286:2: ( ( ruleEString ) )
            {
            // InternalRest.g:8286:2: ( ( ruleEString ) )
            // InternalRest.g:8287:3: ( ruleEString )
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:8288:3: ( ruleEString )
            // InternalRest.g:8289:4: ruleEString
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
    // InternalRest.g:8300:1: rule__OpUpdate__StructAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__OpUpdate__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8304:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:8305:2: ( ( ruleEString ) )
            {
            // InternalRest.g:8305:2: ( ( ruleEString ) )
            // InternalRest.g:8306:3: ( ruleEString )
            {
             before(grammarAccess.getOpUpdateAccess().getStructStructCrossReference_6_0()); 
            // InternalRest.g:8307:3: ( ruleEString )
            // InternalRest.g:8308:4: ruleEString
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


    // $ANTLR start "rule__OpUpdate__FieldsetAssignment_7_2"
    // InternalRest.g:8319:1: rule__OpUpdate__FieldsetAssignment_7_2 : ( ruleFieldSet ) ;
    public final void rule__OpUpdate__FieldsetAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8323:1: ( ( ruleFieldSet ) )
            // InternalRest.g:8324:2: ( ruleFieldSet )
            {
            // InternalRest.g:8324:2: ( ruleFieldSet )
            // InternalRest.g:8325:3: ruleFieldSet
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSet();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__FieldsetAssignment_7_2"


    // $ANTLR start "rule__OpUpdate__FieldsetAssignment_7_3_1"
    // InternalRest.g:8334:1: rule__OpUpdate__FieldsetAssignment_7_3_1 : ( ruleFieldSet ) ;
    public final void rule__OpUpdate__FieldsetAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8338:1: ( ( ruleFieldSet ) )
            // InternalRest.g:8339:2: ( ruleFieldSet )
            {
            // InternalRest.g:8339:2: ( ruleFieldSet )
            // InternalRest.g:8340:3: ruleFieldSet
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSet();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getFieldsetFieldSetParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__FieldsetAssignment_7_3_1"


    // $ANTLR start "rule__OpDelete__IdAssignment_2_1"
    // InternalRest.g:8349:1: rule__OpDelete__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpDelete__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8353:1: ( ( ruleEString ) )
            // InternalRest.g:8354:2: ( ruleEString )
            {
            // InternalRest.g:8354:2: ( ruleEString )
            // InternalRest.g:8355:3: ruleEString
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
    // InternalRest.g:8364:1: rule__OpDelete__FailedAnswerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__OpDelete__FailedAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8368:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:8369:2: ( ( ruleEString ) )
            {
            // InternalRest.g:8369:2: ( ( ruleEString ) )
            // InternalRest.g:8370:3: ( ruleEString )
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerCrossReference_4_0()); 
            // InternalRest.g:8371:3: ( ruleEString )
            // InternalRest.g:8372:4: ruleEString
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
    // InternalRest.g:8383:1: rule__OpDelete__StructAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__OpDelete__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8387:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:8388:2: ( ( ruleEString ) )
            {
            // InternalRest.g:8388:2: ( ( ruleEString ) )
            // InternalRest.g:8389:3: ( ruleEString )
            {
             before(grammarAccess.getOpDeleteAccess().getStructStructCrossReference_6_0()); 
            // InternalRest.g:8390:3: ( ruleEString )
            // InternalRest.g:8391:4: ruleEString
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
    // InternalRest.g:8402:1: rule__FieldSet__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FieldSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8406:1: ( ( ruleEString ) )
            // InternalRest.g:8407:2: ( ruleEString )
            {
            // InternalRest.g:8407:2: ( ruleEString )
            // InternalRest.g:8408:3: ruleEString
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


    // $ANTLR start "rule__FieldSet__ExprAssignment_4_1"
    // InternalRest.g:8417:1: rule__FieldSet__ExprAssignment_4_1 : ( ruleEString ) ;
    public final void rule__FieldSet__ExprAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8421:1: ( ( ruleEString ) )
            // InternalRest.g:8422:2: ( ruleEString )
            {
            // InternalRest.g:8422:2: ( ruleEString )
            // InternalRest.g:8423:3: ruleEString
            {
             before(grammarAccess.getFieldSetAccess().getExprEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldSetAccess().getExprEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSet__ExprAssignment_4_1"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalRest.g:8432:1: rule__Field__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:8436:1: ( ( ruleEString ) )
            // InternalRest.g:8437:2: ( ruleEString )
            {
            // InternalRest.g:8437:2: ( ruleEString )
            // InternalRest.g:8438:3: ruleEString
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000E04000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001A20000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000002000L});

}