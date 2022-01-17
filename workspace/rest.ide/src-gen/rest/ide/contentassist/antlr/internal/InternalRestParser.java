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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RestSystem'", "'{'", "'}'", "'request'", "','", "'Route'", "'segment'", "'ReGet'", "'route'", "'data'", "'ops'", "'RePost'", "'RePut'", "'ReDelete'", "'Segment'", "'value'", "'Parameter'", "'Attachments'", "'Random'", "'Answer'", "'status'", "'return'", "'Struct'", "'fields'", "'OpCreate'", "'struct'", "'id'", "'failedAnswer'", "'succAnswer'", "'fieldset'", "'OpRead'", "'OpUpdate'", "'OpDelete'", "'-'", "'FieldSet'", "'expr'"
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


    // $ANTLR start "entryRuleData"
    // InternalRest.g:103:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalRest.g:104:1: ( ruleData EOF )
            // InternalRest.g:105:1: ruleData EOF
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
    // InternalRest.g:112:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:116:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalRest.g:117:2: ( ( rule__Data__Alternatives ) )
            {
            // InternalRest.g:117:2: ( ( rule__Data__Alternatives ) )
            // InternalRest.g:118:3: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalRest.g:119:3: ( rule__Data__Alternatives )
            // InternalRest.g:119:4: rule__Data__Alternatives
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


    // $ANTLR start "entryRuleOperation"
    // InternalRest.g:128:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalRest.g:129:1: ( ruleOperation EOF )
            // InternalRest.g:130:1: ruleOperation EOF
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
    // InternalRest.g:137:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:141:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalRest.g:142:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalRest.g:142:2: ( ( rule__Operation__Alternatives ) )
            // InternalRest.g:143:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalRest.g:144:3: ( rule__Operation__Alternatives )
            // InternalRest.g:144:4: rule__Operation__Alternatives
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


    // $ANTLR start "entryRuleRoute"
    // InternalRest.g:153:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // InternalRest.g:154:1: ( ruleRoute EOF )
            // InternalRest.g:155:1: ruleRoute EOF
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
    // InternalRest.g:162:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:166:2: ( ( ( rule__Route__Group__0 ) ) )
            // InternalRest.g:167:2: ( ( rule__Route__Group__0 ) )
            {
            // InternalRest.g:167:2: ( ( rule__Route__Group__0 ) )
            // InternalRest.g:168:3: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // InternalRest.g:169:3: ( rule__Route__Group__0 )
            // InternalRest.g:169:4: rule__Route__Group__0
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
    // InternalRest.g:178:1: entryRuleReGet : ruleReGet EOF ;
    public final void entryRuleReGet() throws RecognitionException {
        try {
            // InternalRest.g:179:1: ( ruleReGet EOF )
            // InternalRest.g:180:1: ruleReGet EOF
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
    // InternalRest.g:187:1: ruleReGet : ( ( rule__ReGet__Group__0 ) ) ;
    public final void ruleReGet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:191:2: ( ( ( rule__ReGet__Group__0 ) ) )
            // InternalRest.g:192:2: ( ( rule__ReGet__Group__0 ) )
            {
            // InternalRest.g:192:2: ( ( rule__ReGet__Group__0 ) )
            // InternalRest.g:193:3: ( rule__ReGet__Group__0 )
            {
             before(grammarAccess.getReGetAccess().getGroup()); 
            // InternalRest.g:194:3: ( rule__ReGet__Group__0 )
            // InternalRest.g:194:4: rule__ReGet__Group__0
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
    // InternalRest.g:203:1: entryRuleRePost : ruleRePost EOF ;
    public final void entryRuleRePost() throws RecognitionException {
        try {
            // InternalRest.g:204:1: ( ruleRePost EOF )
            // InternalRest.g:205:1: ruleRePost EOF
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
    // InternalRest.g:212:1: ruleRePost : ( ( rule__RePost__Group__0 ) ) ;
    public final void ruleRePost() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:216:2: ( ( ( rule__RePost__Group__0 ) ) )
            // InternalRest.g:217:2: ( ( rule__RePost__Group__0 ) )
            {
            // InternalRest.g:217:2: ( ( rule__RePost__Group__0 ) )
            // InternalRest.g:218:3: ( rule__RePost__Group__0 )
            {
             before(grammarAccess.getRePostAccess().getGroup()); 
            // InternalRest.g:219:3: ( rule__RePost__Group__0 )
            // InternalRest.g:219:4: rule__RePost__Group__0
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
    // InternalRest.g:228:1: entryRuleRePut : ruleRePut EOF ;
    public final void entryRuleRePut() throws RecognitionException {
        try {
            // InternalRest.g:229:1: ( ruleRePut EOF )
            // InternalRest.g:230:1: ruleRePut EOF
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
    // InternalRest.g:237:1: ruleRePut : ( ( rule__RePut__Group__0 ) ) ;
    public final void ruleRePut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:241:2: ( ( ( rule__RePut__Group__0 ) ) )
            // InternalRest.g:242:2: ( ( rule__RePut__Group__0 ) )
            {
            // InternalRest.g:242:2: ( ( rule__RePut__Group__0 ) )
            // InternalRest.g:243:3: ( rule__RePut__Group__0 )
            {
             before(grammarAccess.getRePutAccess().getGroup()); 
            // InternalRest.g:244:3: ( rule__RePut__Group__0 )
            // InternalRest.g:244:4: rule__RePut__Group__0
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
    // InternalRest.g:253:1: entryRuleReDelete : ruleReDelete EOF ;
    public final void entryRuleReDelete() throws RecognitionException {
        try {
            // InternalRest.g:254:1: ( ruleReDelete EOF )
            // InternalRest.g:255:1: ruleReDelete EOF
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
    // InternalRest.g:262:1: ruleReDelete : ( ( rule__ReDelete__Group__0 ) ) ;
    public final void ruleReDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:266:2: ( ( ( rule__ReDelete__Group__0 ) ) )
            // InternalRest.g:267:2: ( ( rule__ReDelete__Group__0 ) )
            {
            // InternalRest.g:267:2: ( ( rule__ReDelete__Group__0 ) )
            // InternalRest.g:268:3: ( rule__ReDelete__Group__0 )
            {
             before(grammarAccess.getReDeleteAccess().getGroup()); 
            // InternalRest.g:269:3: ( rule__ReDelete__Group__0 )
            // InternalRest.g:269:4: rule__ReDelete__Group__0
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
    // InternalRest.g:278:1: entryRuleSegment : ruleSegment EOF ;
    public final void entryRuleSegment() throws RecognitionException {
        try {
            // InternalRest.g:279:1: ( ruleSegment EOF )
            // InternalRest.g:280:1: ruleSegment EOF
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
    // InternalRest.g:287:1: ruleSegment : ( ( rule__Segment__Group__0 ) ) ;
    public final void ruleSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:291:2: ( ( ( rule__Segment__Group__0 ) ) )
            // InternalRest.g:292:2: ( ( rule__Segment__Group__0 ) )
            {
            // InternalRest.g:292:2: ( ( rule__Segment__Group__0 ) )
            // InternalRest.g:293:3: ( rule__Segment__Group__0 )
            {
             before(grammarAccess.getSegmentAccess().getGroup()); 
            // InternalRest.g:294:3: ( rule__Segment__Group__0 )
            // InternalRest.g:294:4: rule__Segment__Group__0
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
    // InternalRest.g:303:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRest.g:304:1: ( ruleEString EOF )
            // InternalRest.g:305:1: ruleEString EOF
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
    // InternalRest.g:312:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:316:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRest.g:317:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRest.g:317:2: ( ( rule__EString__Alternatives ) )
            // InternalRest.g:318:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRest.g:319:3: ( rule__EString__Alternatives )
            // InternalRest.g:319:4: rule__EString__Alternatives
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
    // InternalRest.g:328:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalRest.g:329:1: ( ruleParameter EOF )
            // InternalRest.g:330:1: ruleParameter EOF
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
    // InternalRest.g:337:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:341:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalRest.g:342:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalRest.g:342:2: ( ( rule__Parameter__Group__0 ) )
            // InternalRest.g:343:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalRest.g:344:3: ( rule__Parameter__Group__0 )
            // InternalRest.g:344:4: rule__Parameter__Group__0
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
    // InternalRest.g:353:1: entryRuleAttachments : ruleAttachments EOF ;
    public final void entryRuleAttachments() throws RecognitionException {
        try {
            // InternalRest.g:354:1: ( ruleAttachments EOF )
            // InternalRest.g:355:1: ruleAttachments EOF
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
    // InternalRest.g:362:1: ruleAttachments : ( ( rule__Attachments__Group__0 ) ) ;
    public final void ruleAttachments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:366:2: ( ( ( rule__Attachments__Group__0 ) ) )
            // InternalRest.g:367:2: ( ( rule__Attachments__Group__0 ) )
            {
            // InternalRest.g:367:2: ( ( rule__Attachments__Group__0 ) )
            // InternalRest.g:368:3: ( rule__Attachments__Group__0 )
            {
             before(grammarAccess.getAttachmentsAccess().getGroup()); 
            // InternalRest.g:369:3: ( rule__Attachments__Group__0 )
            // InternalRest.g:369:4: rule__Attachments__Group__0
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
    // InternalRest.g:378:1: entryRuleRandom : ruleRandom EOF ;
    public final void entryRuleRandom() throws RecognitionException {
        try {
            // InternalRest.g:379:1: ( ruleRandom EOF )
            // InternalRest.g:380:1: ruleRandom EOF
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
    // InternalRest.g:387:1: ruleRandom : ( ( rule__Random__Group__0 ) ) ;
    public final void ruleRandom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:391:2: ( ( ( rule__Random__Group__0 ) ) )
            // InternalRest.g:392:2: ( ( rule__Random__Group__0 ) )
            {
            // InternalRest.g:392:2: ( ( rule__Random__Group__0 ) )
            // InternalRest.g:393:3: ( rule__Random__Group__0 )
            {
             before(grammarAccess.getRandomAccess().getGroup()); 
            // InternalRest.g:394:3: ( rule__Random__Group__0 )
            // InternalRest.g:394:4: rule__Random__Group__0
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


    // $ANTLR start "entryRuleAnswer"
    // InternalRest.g:403:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // InternalRest.g:404:1: ( ruleAnswer EOF )
            // InternalRest.g:405:1: ruleAnswer EOF
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
    // InternalRest.g:412:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:416:2: ( ( ( rule__Answer__Group__0 ) ) )
            // InternalRest.g:417:2: ( ( rule__Answer__Group__0 ) )
            {
            // InternalRest.g:417:2: ( ( rule__Answer__Group__0 ) )
            // InternalRest.g:418:3: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // InternalRest.g:419:3: ( rule__Answer__Group__0 )
            // InternalRest.g:419:4: rule__Answer__Group__0
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


    // $ANTLR start "entryRuleStruct"
    // InternalRest.g:428:1: entryRuleStruct : ruleStruct EOF ;
    public final void entryRuleStruct() throws RecognitionException {
        try {
            // InternalRest.g:429:1: ( ruleStruct EOF )
            // InternalRest.g:430:1: ruleStruct EOF
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
    // InternalRest.g:437:1: ruleStruct : ( ( rule__Struct__Group__0 ) ) ;
    public final void ruleStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:441:2: ( ( ( rule__Struct__Group__0 ) ) )
            // InternalRest.g:442:2: ( ( rule__Struct__Group__0 ) )
            {
            // InternalRest.g:442:2: ( ( rule__Struct__Group__0 ) )
            // InternalRest.g:443:3: ( rule__Struct__Group__0 )
            {
             before(grammarAccess.getStructAccess().getGroup()); 
            // InternalRest.g:444:3: ( rule__Struct__Group__0 )
            // InternalRest.g:444:4: rule__Struct__Group__0
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


    // $ANTLR start "entryRuleEInt"
    // InternalRest.g:553:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRest.g:554:1: ( ruleEInt EOF )
            // InternalRest.g:555:1: ruleEInt EOF
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
    // InternalRest.g:562:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:566:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalRest.g:567:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalRest.g:567:2: ( ( rule__EInt__Group__0 ) )
            // InternalRest.g:568:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalRest.g:569:3: ( rule__EInt__Group__0 )
            // InternalRest.g:569:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleFieldSet"
    // InternalRest.g:578:1: entryRuleFieldSet : ruleFieldSet EOF ;
    public final void entryRuleFieldSet() throws RecognitionException {
        try {
            // InternalRest.g:579:1: ( ruleFieldSet EOF )
            // InternalRest.g:580:1: ruleFieldSet EOF
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
    // InternalRest.g:587:1: ruleFieldSet : ( ( rule__FieldSet__Group__0 ) ) ;
    public final void ruleFieldSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:591:2: ( ( ( rule__FieldSet__Group__0 ) ) )
            // InternalRest.g:592:2: ( ( rule__FieldSet__Group__0 ) )
            {
            // InternalRest.g:592:2: ( ( rule__FieldSet__Group__0 ) )
            // InternalRest.g:593:3: ( rule__FieldSet__Group__0 )
            {
             before(grammarAccess.getFieldSetAccess().getGroup()); 
            // InternalRest.g:594:3: ( rule__FieldSet__Group__0 )
            // InternalRest.g:594:4: rule__FieldSet__Group__0
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


    // $ANTLR start "rule__Request__Alternatives"
    // InternalRest.g:602:1: rule__Request__Alternatives : ( ( ruleReGet ) | ( ruleRePost ) | ( ruleRePut ) | ( ruleReDelete ) );
    public final void rule__Request__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:606:1: ( ( ruleReGet ) | ( ruleRePost ) | ( ruleRePut ) | ( ruleReDelete ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 24:
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
                    // InternalRest.g:607:2: ( ruleReGet )
                    {
                    // InternalRest.g:607:2: ( ruleReGet )
                    // InternalRest.g:608:3: ruleReGet
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
                    // InternalRest.g:613:2: ( ruleRePost )
                    {
                    // InternalRest.g:613:2: ( ruleRePost )
                    // InternalRest.g:614:3: ruleRePost
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
                    // InternalRest.g:619:2: ( ruleRePut )
                    {
                    // InternalRest.g:619:2: ( ruleRePut )
                    // InternalRest.g:620:3: ruleRePut
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
                    // InternalRest.g:625:2: ( ruleReDelete )
                    {
                    // InternalRest.g:625:2: ( ruleReDelete )
                    // InternalRest.g:626:3: ruleReDelete
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


    // $ANTLR start "rule__Data__Alternatives"
    // InternalRest.g:635:1: rule__Data__Alternatives : ( ( ruleParameter ) | ( ruleAttachments ) | ( ruleRandom ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:639:1: ( ( ruleParameter ) | ( ruleAttachments ) | ( ruleRandom ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRest.g:640:2: ( ruleParameter )
                    {
                    // InternalRest.g:640:2: ( ruleParameter )
                    // InternalRest.g:641:3: ruleParameter
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
                    // InternalRest.g:646:2: ( ruleAttachments )
                    {
                    // InternalRest.g:646:2: ( ruleAttachments )
                    // InternalRest.g:647:3: ruleAttachments
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
                    // InternalRest.g:652:2: ( ruleRandom )
                    {
                    // InternalRest.g:652:2: ( ruleRandom )
                    // InternalRest.g:653:3: ruleRandom
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


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalRest.g:662:1: rule__Operation__Alternatives : ( ( ruleOpCreate ) | ( ruleOpRead ) | ( ruleOpUpdate ) | ( ruleOpDelete ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:666:1: ( ( ruleOpCreate ) | ( ruleOpRead ) | ( ruleOpUpdate ) | ( ruleOpDelete ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                alt3=3;
                }
                break;
            case 43:
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
                    // InternalRest.g:667:2: ( ruleOpCreate )
                    {
                    // InternalRest.g:667:2: ( ruleOpCreate )
                    // InternalRest.g:668:3: ruleOpCreate
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
                    // InternalRest.g:673:2: ( ruleOpRead )
                    {
                    // InternalRest.g:673:2: ( ruleOpRead )
                    // InternalRest.g:674:3: ruleOpRead
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
                    // InternalRest.g:679:2: ( ruleOpUpdate )
                    {
                    // InternalRest.g:679:2: ( ruleOpUpdate )
                    // InternalRest.g:680:3: ruleOpUpdate
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
                    // InternalRest.g:685:2: ( ruleOpDelete )
                    {
                    // InternalRest.g:685:2: ( ruleOpDelete )
                    // InternalRest.g:686:3: ruleOpDelete
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
    // InternalRest.g:695:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:699:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRest.g:700:2: ( RULE_STRING )
                    {
                    // InternalRest.g:700:2: ( RULE_STRING )
                    // InternalRest.g:701:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:706:2: ( RULE_ID )
                    {
                    // InternalRest.g:706:2: ( RULE_ID )
                    // InternalRest.g:707:3: RULE_ID
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
    // InternalRest.g:716:1: rule__RestSystem__Group__0 : rule__RestSystem__Group__0__Impl rule__RestSystem__Group__1 ;
    public final void rule__RestSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:720:1: ( rule__RestSystem__Group__0__Impl rule__RestSystem__Group__1 )
            // InternalRest.g:721:2: rule__RestSystem__Group__0__Impl rule__RestSystem__Group__1
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
    // InternalRest.g:728:1: rule__RestSystem__Group__0__Impl : ( () ) ;
    public final void rule__RestSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:732:1: ( ( () ) )
            // InternalRest.g:733:1: ( () )
            {
            // InternalRest.g:733:1: ( () )
            // InternalRest.g:734:2: ()
            {
             before(grammarAccess.getRestSystemAccess().getRestSystemAction_0()); 
            // InternalRest.g:735:2: ()
            // InternalRest.g:735:3: 
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
    // InternalRest.g:743:1: rule__RestSystem__Group__1 : rule__RestSystem__Group__1__Impl rule__RestSystem__Group__2 ;
    public final void rule__RestSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:747:1: ( rule__RestSystem__Group__1__Impl rule__RestSystem__Group__2 )
            // InternalRest.g:748:2: rule__RestSystem__Group__1__Impl rule__RestSystem__Group__2
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
    // InternalRest.g:755:1: rule__RestSystem__Group__1__Impl : ( 'RestSystem' ) ;
    public final void rule__RestSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:759:1: ( ( 'RestSystem' ) )
            // InternalRest.g:760:1: ( 'RestSystem' )
            {
            // InternalRest.g:760:1: ( 'RestSystem' )
            // InternalRest.g:761:2: 'RestSystem'
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
    // InternalRest.g:770:1: rule__RestSystem__Group__2 : rule__RestSystem__Group__2__Impl rule__RestSystem__Group__3 ;
    public final void rule__RestSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:774:1: ( rule__RestSystem__Group__2__Impl rule__RestSystem__Group__3 )
            // InternalRest.g:775:2: rule__RestSystem__Group__2__Impl rule__RestSystem__Group__3
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
    // InternalRest.g:782:1: rule__RestSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:786:1: ( ( '{' ) )
            // InternalRest.g:787:1: ( '{' )
            {
            // InternalRest.g:787:1: ( '{' )
            // InternalRest.g:788:2: '{'
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
    // InternalRest.g:797:1: rule__RestSystem__Group__3 : rule__RestSystem__Group__3__Impl rule__RestSystem__Group__4 ;
    public final void rule__RestSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:801:1: ( rule__RestSystem__Group__3__Impl rule__RestSystem__Group__4 )
            // InternalRest.g:802:2: rule__RestSystem__Group__3__Impl rule__RestSystem__Group__4
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
    // InternalRest.g:809:1: rule__RestSystem__Group__3__Impl : ( ( rule__RestSystem__Group_3__0 )? ) ;
    public final void rule__RestSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:813:1: ( ( ( rule__RestSystem__Group_3__0 )? ) )
            // InternalRest.g:814:1: ( ( rule__RestSystem__Group_3__0 )? )
            {
            // InternalRest.g:814:1: ( ( rule__RestSystem__Group_3__0 )? )
            // InternalRest.g:815:2: ( rule__RestSystem__Group_3__0 )?
            {
             before(grammarAccess.getRestSystemAccess().getGroup_3()); 
            // InternalRest.g:816:2: ( rule__RestSystem__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRest.g:816:3: rule__RestSystem__Group_3__0
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
    // InternalRest.g:824:1: rule__RestSystem__Group__4 : rule__RestSystem__Group__4__Impl ;
    public final void rule__RestSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:828:1: ( rule__RestSystem__Group__4__Impl )
            // InternalRest.g:829:2: rule__RestSystem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestSystem__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalRest.g:835:1: rule__RestSystem__Group__4__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:839:1: ( ( '}' ) )
            // InternalRest.g:840:1: ( '}' )
            {
            // InternalRest.g:840:1: ( '}' )
            // InternalRest.g:841:2: '}'
            {
             before(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestSystemAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__RestSystem__Group_3__0"
    // InternalRest.g:851:1: rule__RestSystem__Group_3__0 : rule__RestSystem__Group_3__0__Impl rule__RestSystem__Group_3__1 ;
    public final void rule__RestSystem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:855:1: ( rule__RestSystem__Group_3__0__Impl rule__RestSystem__Group_3__1 )
            // InternalRest.g:856:2: rule__RestSystem__Group_3__0__Impl rule__RestSystem__Group_3__1
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
    // InternalRest.g:863:1: rule__RestSystem__Group_3__0__Impl : ( 'request' ) ;
    public final void rule__RestSystem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:867:1: ( ( 'request' ) )
            // InternalRest.g:868:1: ( 'request' )
            {
            // InternalRest.g:868:1: ( 'request' )
            // InternalRest.g:869:2: 'request'
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
    // InternalRest.g:878:1: rule__RestSystem__Group_3__1 : rule__RestSystem__Group_3__1__Impl rule__RestSystem__Group_3__2 ;
    public final void rule__RestSystem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:882:1: ( rule__RestSystem__Group_3__1__Impl rule__RestSystem__Group_3__2 )
            // InternalRest.g:883:2: rule__RestSystem__Group_3__1__Impl rule__RestSystem__Group_3__2
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
    // InternalRest.g:890:1: rule__RestSystem__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RestSystem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:894:1: ( ( '{' ) )
            // InternalRest.g:895:1: ( '{' )
            {
            // InternalRest.g:895:1: ( '{' )
            // InternalRest.g:896:2: '{'
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
    // InternalRest.g:905:1: rule__RestSystem__Group_3__2 : rule__RestSystem__Group_3__2__Impl rule__RestSystem__Group_3__3 ;
    public final void rule__RestSystem__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:909:1: ( rule__RestSystem__Group_3__2__Impl rule__RestSystem__Group_3__3 )
            // InternalRest.g:910:2: rule__RestSystem__Group_3__2__Impl rule__RestSystem__Group_3__3
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
    // InternalRest.g:917:1: rule__RestSystem__Group_3__2__Impl : ( ( rule__RestSystem__RequestAssignment_3_2 ) ) ;
    public final void rule__RestSystem__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:921:1: ( ( ( rule__RestSystem__RequestAssignment_3_2 ) ) )
            // InternalRest.g:922:1: ( ( rule__RestSystem__RequestAssignment_3_2 ) )
            {
            // InternalRest.g:922:1: ( ( rule__RestSystem__RequestAssignment_3_2 ) )
            // InternalRest.g:923:2: ( rule__RestSystem__RequestAssignment_3_2 )
            {
             before(grammarAccess.getRestSystemAccess().getRequestAssignment_3_2()); 
            // InternalRest.g:924:2: ( rule__RestSystem__RequestAssignment_3_2 )
            // InternalRest.g:924:3: rule__RestSystem__RequestAssignment_3_2
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
    // InternalRest.g:932:1: rule__RestSystem__Group_3__3 : rule__RestSystem__Group_3__3__Impl rule__RestSystem__Group_3__4 ;
    public final void rule__RestSystem__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:936:1: ( rule__RestSystem__Group_3__3__Impl rule__RestSystem__Group_3__4 )
            // InternalRest.g:937:2: rule__RestSystem__Group_3__3__Impl rule__RestSystem__Group_3__4
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
    // InternalRest.g:944:1: rule__RestSystem__Group_3__3__Impl : ( ( rule__RestSystem__Group_3_3__0 )* ) ;
    public final void rule__RestSystem__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:948:1: ( ( ( rule__RestSystem__Group_3_3__0 )* ) )
            // InternalRest.g:949:1: ( ( rule__RestSystem__Group_3_3__0 )* )
            {
            // InternalRest.g:949:1: ( ( rule__RestSystem__Group_3_3__0 )* )
            // InternalRest.g:950:2: ( rule__RestSystem__Group_3_3__0 )*
            {
             before(grammarAccess.getRestSystemAccess().getGroup_3_3()); 
            // InternalRest.g:951:2: ( rule__RestSystem__Group_3_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRest.g:951:3: rule__RestSystem__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RestSystem__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalRest.g:959:1: rule__RestSystem__Group_3__4 : rule__RestSystem__Group_3__4__Impl ;
    public final void rule__RestSystem__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:963:1: ( rule__RestSystem__Group_3__4__Impl )
            // InternalRest.g:964:2: rule__RestSystem__Group_3__4__Impl
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
    // InternalRest.g:970:1: rule__RestSystem__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RestSystem__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:974:1: ( ( '}' ) )
            // InternalRest.g:975:1: ( '}' )
            {
            // InternalRest.g:975:1: ( '}' )
            // InternalRest.g:976:2: '}'
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
    // InternalRest.g:986:1: rule__RestSystem__Group_3_3__0 : rule__RestSystem__Group_3_3__0__Impl rule__RestSystem__Group_3_3__1 ;
    public final void rule__RestSystem__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:990:1: ( rule__RestSystem__Group_3_3__0__Impl rule__RestSystem__Group_3_3__1 )
            // InternalRest.g:991:2: rule__RestSystem__Group_3_3__0__Impl rule__RestSystem__Group_3_3__1
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
    // InternalRest.g:998:1: rule__RestSystem__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RestSystem__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1002:1: ( ( ',' ) )
            // InternalRest.g:1003:1: ( ',' )
            {
            // InternalRest.g:1003:1: ( ',' )
            // InternalRest.g:1004:2: ','
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
    // InternalRest.g:1013:1: rule__RestSystem__Group_3_3__1 : rule__RestSystem__Group_3_3__1__Impl ;
    public final void rule__RestSystem__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1017:1: ( rule__RestSystem__Group_3_3__1__Impl )
            // InternalRest.g:1018:2: rule__RestSystem__Group_3_3__1__Impl
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
    // InternalRest.g:1024:1: rule__RestSystem__Group_3_3__1__Impl : ( ( rule__RestSystem__RequestAssignment_3_3_1 ) ) ;
    public final void rule__RestSystem__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1028:1: ( ( ( rule__RestSystem__RequestAssignment_3_3_1 ) ) )
            // InternalRest.g:1029:1: ( ( rule__RestSystem__RequestAssignment_3_3_1 ) )
            {
            // InternalRest.g:1029:1: ( ( rule__RestSystem__RequestAssignment_3_3_1 ) )
            // InternalRest.g:1030:2: ( rule__RestSystem__RequestAssignment_3_3_1 )
            {
             before(grammarAccess.getRestSystemAccess().getRequestAssignment_3_3_1()); 
            // InternalRest.g:1031:2: ( rule__RestSystem__RequestAssignment_3_3_1 )
            // InternalRest.g:1031:3: rule__RestSystem__RequestAssignment_3_3_1
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


    // $ANTLR start "rule__Route__Group__0"
    // InternalRest.g:1040:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1044:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // InternalRest.g:1045:2: rule__Route__Group__0__Impl rule__Route__Group__1
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
    // InternalRest.g:1052:1: rule__Route__Group__0__Impl : ( 'Route' ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1056:1: ( ( 'Route' ) )
            // InternalRest.g:1057:1: ( 'Route' )
            {
            // InternalRest.g:1057:1: ( 'Route' )
            // InternalRest.g:1058:2: 'Route'
            {
             before(grammarAccess.getRouteAccess().getRouteKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalRest.g:1067:1: rule__Route__Group__1 : rule__Route__Group__1__Impl rule__Route__Group__2 ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1071:1: ( rule__Route__Group__1__Impl rule__Route__Group__2 )
            // InternalRest.g:1072:2: rule__Route__Group__1__Impl rule__Route__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRest.g:1079:1: rule__Route__Group__1__Impl : ( '{' ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1083:1: ( ( '{' ) )
            // InternalRest.g:1084:1: ( '{' )
            {
            // InternalRest.g:1084:1: ( '{' )
            // InternalRest.g:1085:2: '{'
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
    // InternalRest.g:1094:1: rule__Route__Group__2 : rule__Route__Group__2__Impl rule__Route__Group__3 ;
    public final void rule__Route__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1098:1: ( rule__Route__Group__2__Impl rule__Route__Group__3 )
            // InternalRest.g:1099:2: rule__Route__Group__2__Impl rule__Route__Group__3
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
    // InternalRest.g:1106:1: rule__Route__Group__2__Impl : ( 'segment' ) ;
    public final void rule__Route__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1110:1: ( ( 'segment' ) )
            // InternalRest.g:1111:1: ( 'segment' )
            {
            // InternalRest.g:1111:1: ( 'segment' )
            // InternalRest.g:1112:2: 'segment'
            {
             before(grammarAccess.getRouteAccess().getSegmentKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRest.g:1121:1: rule__Route__Group__3 : rule__Route__Group__3__Impl rule__Route__Group__4 ;
    public final void rule__Route__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1125:1: ( rule__Route__Group__3__Impl rule__Route__Group__4 )
            // InternalRest.g:1126:2: rule__Route__Group__3__Impl rule__Route__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalRest.g:1133:1: rule__Route__Group__3__Impl : ( '{' ) ;
    public final void rule__Route__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1137:1: ( ( '{' ) )
            // InternalRest.g:1138:1: ( '{' )
            {
            // InternalRest.g:1138:1: ( '{' )
            // InternalRest.g:1139:2: '{'
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
    // InternalRest.g:1148:1: rule__Route__Group__4 : rule__Route__Group__4__Impl rule__Route__Group__5 ;
    public final void rule__Route__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1152:1: ( rule__Route__Group__4__Impl rule__Route__Group__5 )
            // InternalRest.g:1153:2: rule__Route__Group__4__Impl rule__Route__Group__5
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
    // InternalRest.g:1160:1: rule__Route__Group__4__Impl : ( ( rule__Route__SegmentAssignment_4 ) ) ;
    public final void rule__Route__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1164:1: ( ( ( rule__Route__SegmentAssignment_4 ) ) )
            // InternalRest.g:1165:1: ( ( rule__Route__SegmentAssignment_4 ) )
            {
            // InternalRest.g:1165:1: ( ( rule__Route__SegmentAssignment_4 ) )
            // InternalRest.g:1166:2: ( rule__Route__SegmentAssignment_4 )
            {
             before(grammarAccess.getRouteAccess().getSegmentAssignment_4()); 
            // InternalRest.g:1167:2: ( rule__Route__SegmentAssignment_4 )
            // InternalRest.g:1167:3: rule__Route__SegmentAssignment_4
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
    // InternalRest.g:1175:1: rule__Route__Group__5 : rule__Route__Group__5__Impl rule__Route__Group__6 ;
    public final void rule__Route__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1179:1: ( rule__Route__Group__5__Impl rule__Route__Group__6 )
            // InternalRest.g:1180:2: rule__Route__Group__5__Impl rule__Route__Group__6
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
    // InternalRest.g:1187:1: rule__Route__Group__5__Impl : ( ( rule__Route__Group_5__0 )* ) ;
    public final void rule__Route__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1191:1: ( ( ( rule__Route__Group_5__0 )* ) )
            // InternalRest.g:1192:1: ( ( rule__Route__Group_5__0 )* )
            {
            // InternalRest.g:1192:1: ( ( rule__Route__Group_5__0 )* )
            // InternalRest.g:1193:2: ( rule__Route__Group_5__0 )*
            {
             before(grammarAccess.getRouteAccess().getGroup_5()); 
            // InternalRest.g:1194:2: ( rule__Route__Group_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRest.g:1194:3: rule__Route__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Route__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalRest.g:1202:1: rule__Route__Group__6 : rule__Route__Group__6__Impl rule__Route__Group__7 ;
    public final void rule__Route__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1206:1: ( rule__Route__Group__6__Impl rule__Route__Group__7 )
            // InternalRest.g:1207:2: rule__Route__Group__6__Impl rule__Route__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalRest.g:1214:1: rule__Route__Group__6__Impl : ( '}' ) ;
    public final void rule__Route__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1218:1: ( ( '}' ) )
            // InternalRest.g:1219:1: ( '}' )
            {
            // InternalRest.g:1219:1: ( '}' )
            // InternalRest.g:1220:2: '}'
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
    // InternalRest.g:1229:1: rule__Route__Group__7 : rule__Route__Group__7__Impl ;
    public final void rule__Route__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1233:1: ( rule__Route__Group__7__Impl )
            // InternalRest.g:1234:2: rule__Route__Group__7__Impl
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
    // InternalRest.g:1240:1: rule__Route__Group__7__Impl : ( '}' ) ;
    public final void rule__Route__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1244:1: ( ( '}' ) )
            // InternalRest.g:1245:1: ( '}' )
            {
            // InternalRest.g:1245:1: ( '}' )
            // InternalRest.g:1246:2: '}'
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
    // InternalRest.g:1256:1: rule__Route__Group_5__0 : rule__Route__Group_5__0__Impl rule__Route__Group_5__1 ;
    public final void rule__Route__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1260:1: ( rule__Route__Group_5__0__Impl rule__Route__Group_5__1 )
            // InternalRest.g:1261:2: rule__Route__Group_5__0__Impl rule__Route__Group_5__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRest.g:1268:1: rule__Route__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Route__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1272:1: ( ( ',' ) )
            // InternalRest.g:1273:1: ( ',' )
            {
            // InternalRest.g:1273:1: ( ',' )
            // InternalRest.g:1274:2: ','
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
    // InternalRest.g:1283:1: rule__Route__Group_5__1 : rule__Route__Group_5__1__Impl ;
    public final void rule__Route__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1287:1: ( rule__Route__Group_5__1__Impl )
            // InternalRest.g:1288:2: rule__Route__Group_5__1__Impl
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
    // InternalRest.g:1294:1: rule__Route__Group_5__1__Impl : ( ( rule__Route__SegmentAssignment_5_1 ) ) ;
    public final void rule__Route__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1298:1: ( ( ( rule__Route__SegmentAssignment_5_1 ) ) )
            // InternalRest.g:1299:1: ( ( rule__Route__SegmentAssignment_5_1 ) )
            {
            // InternalRest.g:1299:1: ( ( rule__Route__SegmentAssignment_5_1 ) )
            // InternalRest.g:1300:2: ( rule__Route__SegmentAssignment_5_1 )
            {
             before(grammarAccess.getRouteAccess().getSegmentAssignment_5_1()); 
            // InternalRest.g:1301:2: ( rule__Route__SegmentAssignment_5_1 )
            // InternalRest.g:1301:3: rule__Route__SegmentAssignment_5_1
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
    // InternalRest.g:1310:1: rule__ReGet__Group__0 : rule__ReGet__Group__0__Impl rule__ReGet__Group__1 ;
    public final void rule__ReGet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1314:1: ( rule__ReGet__Group__0__Impl rule__ReGet__Group__1 )
            // InternalRest.g:1315:2: rule__ReGet__Group__0__Impl rule__ReGet__Group__1
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
    // InternalRest.g:1322:1: rule__ReGet__Group__0__Impl : ( 'ReGet' ) ;
    public final void rule__ReGet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1326:1: ( ( 'ReGet' ) )
            // InternalRest.g:1327:1: ( 'ReGet' )
            {
            // InternalRest.g:1327:1: ( 'ReGet' )
            // InternalRest.g:1328:2: 'ReGet'
            {
             before(grammarAccess.getReGetAccess().getReGetKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRest.g:1337:1: rule__ReGet__Group__1 : rule__ReGet__Group__1__Impl rule__ReGet__Group__2 ;
    public final void rule__ReGet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1341:1: ( rule__ReGet__Group__1__Impl rule__ReGet__Group__2 )
            // InternalRest.g:1342:2: rule__ReGet__Group__1__Impl rule__ReGet__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalRest.g:1349:1: rule__ReGet__Group__1__Impl : ( '{' ) ;
    public final void rule__ReGet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1353:1: ( ( '{' ) )
            // InternalRest.g:1354:1: ( '{' )
            {
            // InternalRest.g:1354:1: ( '{' )
            // InternalRest.g:1355:2: '{'
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
    // InternalRest.g:1364:1: rule__ReGet__Group__2 : rule__ReGet__Group__2__Impl rule__ReGet__Group__3 ;
    public final void rule__ReGet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1368:1: ( rule__ReGet__Group__2__Impl rule__ReGet__Group__3 )
            // InternalRest.g:1369:2: rule__ReGet__Group__2__Impl rule__ReGet__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:1376:1: rule__ReGet__Group__2__Impl : ( 'route' ) ;
    public final void rule__ReGet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1380:1: ( ( 'route' ) )
            // InternalRest.g:1381:1: ( 'route' )
            {
            // InternalRest.g:1381:1: ( 'route' )
            // InternalRest.g:1382:2: 'route'
            {
             before(grammarAccess.getReGetAccess().getRouteKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRouteKeyword_2()); 

            }


            }

        }
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
    // InternalRest.g:1391:1: rule__ReGet__Group__3 : rule__ReGet__Group__3__Impl rule__ReGet__Group__4 ;
    public final void rule__ReGet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1395:1: ( rule__ReGet__Group__3__Impl rule__ReGet__Group__4 )
            // InternalRest.g:1396:2: rule__ReGet__Group__3__Impl rule__ReGet__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:1403:1: rule__ReGet__Group__3__Impl : ( ( rule__ReGet__RouteAssignment_3 ) ) ;
    public final void rule__ReGet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1407:1: ( ( ( rule__ReGet__RouteAssignment_3 ) ) )
            // InternalRest.g:1408:1: ( ( rule__ReGet__RouteAssignment_3 ) )
            {
            // InternalRest.g:1408:1: ( ( rule__ReGet__RouteAssignment_3 ) )
            // InternalRest.g:1409:2: ( rule__ReGet__RouteAssignment_3 )
            {
             before(grammarAccess.getReGetAccess().getRouteAssignment_3()); 
            // InternalRest.g:1410:2: ( rule__ReGet__RouteAssignment_3 )
            // InternalRest.g:1410:3: rule__ReGet__RouteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__RouteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getRouteAssignment_3()); 

            }


            }

        }
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
    // InternalRest.g:1418:1: rule__ReGet__Group__4 : rule__ReGet__Group__4__Impl rule__ReGet__Group__5 ;
    public final void rule__ReGet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1422:1: ( rule__ReGet__Group__4__Impl rule__ReGet__Group__5 )
            // InternalRest.g:1423:2: rule__ReGet__Group__4__Impl rule__ReGet__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:1430:1: rule__ReGet__Group__4__Impl : ( ( rule__ReGet__Group_4__0 )? ) ;
    public final void rule__ReGet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1434:1: ( ( ( rule__ReGet__Group_4__0 )? ) )
            // InternalRest.g:1435:1: ( ( rule__ReGet__Group_4__0 )? )
            {
            // InternalRest.g:1435:1: ( ( rule__ReGet__Group_4__0 )? )
            // InternalRest.g:1436:2: ( rule__ReGet__Group_4__0 )?
            {
             before(grammarAccess.getReGetAccess().getGroup_4()); 
            // InternalRest.g:1437:2: ( rule__ReGet__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRest.g:1437:3: rule__ReGet__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReGet__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReGetAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRest.g:1445:1: rule__ReGet__Group__5 : rule__ReGet__Group__5__Impl rule__ReGet__Group__6 ;
    public final void rule__ReGet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1449:1: ( rule__ReGet__Group__5__Impl rule__ReGet__Group__6 )
            // InternalRest.g:1450:2: rule__ReGet__Group__5__Impl rule__ReGet__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:1457:1: rule__ReGet__Group__5__Impl : ( ( rule__ReGet__Group_5__0 )? ) ;
    public final void rule__ReGet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1461:1: ( ( ( rule__ReGet__Group_5__0 )? ) )
            // InternalRest.g:1462:1: ( ( rule__ReGet__Group_5__0 )? )
            {
            // InternalRest.g:1462:1: ( ( rule__ReGet__Group_5__0 )? )
            // InternalRest.g:1463:2: ( rule__ReGet__Group_5__0 )?
            {
             before(grammarAccess.getReGetAccess().getGroup_5()); 
            // InternalRest.g:1464:2: ( rule__ReGet__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRest.g:1464:3: rule__ReGet__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReGet__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReGetAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalRest.g:1472:1: rule__ReGet__Group__6 : rule__ReGet__Group__6__Impl ;
    public final void rule__ReGet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1476:1: ( rule__ReGet__Group__6__Impl )
            // InternalRest.g:1477:2: rule__ReGet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalRest.g:1483:1: rule__ReGet__Group__6__Impl : ( '}' ) ;
    public final void rule__ReGet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1487:1: ( ( '}' ) )
            // InternalRest.g:1488:1: ( '}' )
            {
            // InternalRest.g:1488:1: ( '}' )
            // InternalRest.g:1489:2: '}'
            {
             before(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReGet__Group_4__0"
    // InternalRest.g:1499:1: rule__ReGet__Group_4__0 : rule__ReGet__Group_4__0__Impl rule__ReGet__Group_4__1 ;
    public final void rule__ReGet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1503:1: ( rule__ReGet__Group_4__0__Impl rule__ReGet__Group_4__1 )
            // InternalRest.g:1504:2: rule__ReGet__Group_4__0__Impl rule__ReGet__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ReGet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__0"


    // $ANTLR start "rule__ReGet__Group_4__0__Impl"
    // InternalRest.g:1511:1: rule__ReGet__Group_4__0__Impl : ( 'data' ) ;
    public final void rule__ReGet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1515:1: ( ( 'data' ) )
            // InternalRest.g:1516:1: ( 'data' )
            {
            // InternalRest.g:1516:1: ( 'data' )
            // InternalRest.g:1517:2: 'data'
            {
             before(grammarAccess.getReGetAccess().getDataKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getDataKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__0__Impl"


    // $ANTLR start "rule__ReGet__Group_4__1"
    // InternalRest.g:1526:1: rule__ReGet__Group_4__1 : rule__ReGet__Group_4__1__Impl rule__ReGet__Group_4__2 ;
    public final void rule__ReGet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1530:1: ( rule__ReGet__Group_4__1__Impl rule__ReGet__Group_4__2 )
            // InternalRest.g:1531:2: rule__ReGet__Group_4__1__Impl rule__ReGet__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__ReGet__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__1"


    // $ANTLR start "rule__ReGet__Group_4__1__Impl"
    // InternalRest.g:1538:1: rule__ReGet__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ReGet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1542:1: ( ( '{' ) )
            // InternalRest.g:1543:1: ( '{' )
            {
            // InternalRest.g:1543:1: ( '{' )
            // InternalRest.g:1544:2: '{'
            {
             before(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__1__Impl"


    // $ANTLR start "rule__ReGet__Group_4__2"
    // InternalRest.g:1553:1: rule__ReGet__Group_4__2 : rule__ReGet__Group_4__2__Impl rule__ReGet__Group_4__3 ;
    public final void rule__ReGet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1557:1: ( rule__ReGet__Group_4__2__Impl rule__ReGet__Group_4__3 )
            // InternalRest.g:1558:2: rule__ReGet__Group_4__2__Impl rule__ReGet__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__ReGet__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__2"


    // $ANTLR start "rule__ReGet__Group_4__2__Impl"
    // InternalRest.g:1565:1: rule__ReGet__Group_4__2__Impl : ( ( rule__ReGet__DataAssignment_4_2 ) ) ;
    public final void rule__ReGet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1569:1: ( ( ( rule__ReGet__DataAssignment_4_2 ) ) )
            // InternalRest.g:1570:1: ( ( rule__ReGet__DataAssignment_4_2 ) )
            {
            // InternalRest.g:1570:1: ( ( rule__ReGet__DataAssignment_4_2 ) )
            // InternalRest.g:1571:2: ( rule__ReGet__DataAssignment_4_2 )
            {
             before(grammarAccess.getReGetAccess().getDataAssignment_4_2()); 
            // InternalRest.g:1572:2: ( rule__ReGet__DataAssignment_4_2 )
            // InternalRest.g:1572:3: rule__ReGet__DataAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__DataAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getDataAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__2__Impl"


    // $ANTLR start "rule__ReGet__Group_4__3"
    // InternalRest.g:1580:1: rule__ReGet__Group_4__3 : rule__ReGet__Group_4__3__Impl rule__ReGet__Group_4__4 ;
    public final void rule__ReGet__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1584:1: ( rule__ReGet__Group_4__3__Impl rule__ReGet__Group_4__4 )
            // InternalRest.g:1585:2: rule__ReGet__Group_4__3__Impl rule__ReGet__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__ReGet__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__3"


    // $ANTLR start "rule__ReGet__Group_4__3__Impl"
    // InternalRest.g:1592:1: rule__ReGet__Group_4__3__Impl : ( ( rule__ReGet__Group_4_3__0 )* ) ;
    public final void rule__ReGet__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1596:1: ( ( ( rule__ReGet__Group_4_3__0 )* ) )
            // InternalRest.g:1597:1: ( ( rule__ReGet__Group_4_3__0 )* )
            {
            // InternalRest.g:1597:1: ( ( rule__ReGet__Group_4_3__0 )* )
            // InternalRest.g:1598:2: ( rule__ReGet__Group_4_3__0 )*
            {
             before(grammarAccess.getReGetAccess().getGroup_4_3()); 
            // InternalRest.g:1599:2: ( rule__ReGet__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRest.g:1599:3: rule__ReGet__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReGet__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getReGetAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__3__Impl"


    // $ANTLR start "rule__ReGet__Group_4__4"
    // InternalRest.g:1607:1: rule__ReGet__Group_4__4 : rule__ReGet__Group_4__4__Impl ;
    public final void rule__ReGet__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1611:1: ( rule__ReGet__Group_4__4__Impl )
            // InternalRest.g:1612:2: rule__ReGet__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__4"


    // $ANTLR start "rule__ReGet__Group_4__4__Impl"
    // InternalRest.g:1618:1: rule__ReGet__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ReGet__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1622:1: ( ( '}' ) )
            // InternalRest.g:1623:1: ( '}' )
            {
            // InternalRest.g:1623:1: ( '}' )
            // InternalRest.g:1624:2: '}'
            {
             before(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4__4__Impl"


    // $ANTLR start "rule__ReGet__Group_4_3__0"
    // InternalRest.g:1634:1: rule__ReGet__Group_4_3__0 : rule__ReGet__Group_4_3__0__Impl rule__ReGet__Group_4_3__1 ;
    public final void rule__ReGet__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1638:1: ( rule__ReGet__Group_4_3__0__Impl rule__ReGet__Group_4_3__1 )
            // InternalRest.g:1639:2: rule__ReGet__Group_4_3__0__Impl rule__ReGet__Group_4_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ReGet__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4_3__0"


    // $ANTLR start "rule__ReGet__Group_4_3__0__Impl"
    // InternalRest.g:1646:1: rule__ReGet__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ReGet__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1650:1: ( ( ',' ) )
            // InternalRest.g:1651:1: ( ',' )
            {
            // InternalRest.g:1651:1: ( ',' )
            // InternalRest.g:1652:2: ','
            {
             before(grammarAccess.getReGetAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4_3__0__Impl"


    // $ANTLR start "rule__ReGet__Group_4_3__1"
    // InternalRest.g:1661:1: rule__ReGet__Group_4_3__1 : rule__ReGet__Group_4_3__1__Impl ;
    public final void rule__ReGet__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1665:1: ( rule__ReGet__Group_4_3__1__Impl )
            // InternalRest.g:1666:2: rule__ReGet__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4_3__1"


    // $ANTLR start "rule__ReGet__Group_4_3__1__Impl"
    // InternalRest.g:1672:1: rule__ReGet__Group_4_3__1__Impl : ( ( rule__ReGet__DataAssignment_4_3_1 ) ) ;
    public final void rule__ReGet__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1676:1: ( ( ( rule__ReGet__DataAssignment_4_3_1 ) ) )
            // InternalRest.g:1677:1: ( ( rule__ReGet__DataAssignment_4_3_1 ) )
            {
            // InternalRest.g:1677:1: ( ( rule__ReGet__DataAssignment_4_3_1 ) )
            // InternalRest.g:1678:2: ( rule__ReGet__DataAssignment_4_3_1 )
            {
             before(grammarAccess.getReGetAccess().getDataAssignment_4_3_1()); 
            // InternalRest.g:1679:2: ( rule__ReGet__DataAssignment_4_3_1 )
            // InternalRest.g:1679:3: rule__ReGet__DataAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__DataAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getDataAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_4_3__1__Impl"


    // $ANTLR start "rule__ReGet__Group_5__0"
    // InternalRest.g:1688:1: rule__ReGet__Group_5__0 : rule__ReGet__Group_5__0__Impl rule__ReGet__Group_5__1 ;
    public final void rule__ReGet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1692:1: ( rule__ReGet__Group_5__0__Impl rule__ReGet__Group_5__1 )
            // InternalRest.g:1693:2: rule__ReGet__Group_5__0__Impl rule__ReGet__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ReGet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__0"


    // $ANTLR start "rule__ReGet__Group_5__0__Impl"
    // InternalRest.g:1700:1: rule__ReGet__Group_5__0__Impl : ( 'ops' ) ;
    public final void rule__ReGet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1704:1: ( ( 'ops' ) )
            // InternalRest.g:1705:1: ( 'ops' )
            {
            // InternalRest.g:1705:1: ( 'ops' )
            // InternalRest.g:1706:2: 'ops'
            {
             before(grammarAccess.getReGetAccess().getOpsKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getOpsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__0__Impl"


    // $ANTLR start "rule__ReGet__Group_5__1"
    // InternalRest.g:1715:1: rule__ReGet__Group_5__1 : rule__ReGet__Group_5__1__Impl rule__ReGet__Group_5__2 ;
    public final void rule__ReGet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1719:1: ( rule__ReGet__Group_5__1__Impl rule__ReGet__Group_5__2 )
            // InternalRest.g:1720:2: rule__ReGet__Group_5__1__Impl rule__ReGet__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__ReGet__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__1"


    // $ANTLR start "rule__ReGet__Group_5__1__Impl"
    // InternalRest.g:1727:1: rule__ReGet__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ReGet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1731:1: ( ( '{' ) )
            // InternalRest.g:1732:1: ( '{' )
            {
            // InternalRest.g:1732:1: ( '{' )
            // InternalRest.g:1733:2: '{'
            {
             before(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__1__Impl"


    // $ANTLR start "rule__ReGet__Group_5__2"
    // InternalRest.g:1742:1: rule__ReGet__Group_5__2 : rule__ReGet__Group_5__2__Impl rule__ReGet__Group_5__3 ;
    public final void rule__ReGet__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1746:1: ( rule__ReGet__Group_5__2__Impl rule__ReGet__Group_5__3 )
            // InternalRest.g:1747:2: rule__ReGet__Group_5__2__Impl rule__ReGet__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__ReGet__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__2"


    // $ANTLR start "rule__ReGet__Group_5__2__Impl"
    // InternalRest.g:1754:1: rule__ReGet__Group_5__2__Impl : ( ( rule__ReGet__OpsAssignment_5_2 ) ) ;
    public final void rule__ReGet__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1758:1: ( ( ( rule__ReGet__OpsAssignment_5_2 ) ) )
            // InternalRest.g:1759:1: ( ( rule__ReGet__OpsAssignment_5_2 ) )
            {
            // InternalRest.g:1759:1: ( ( rule__ReGet__OpsAssignment_5_2 ) )
            // InternalRest.g:1760:2: ( rule__ReGet__OpsAssignment_5_2 )
            {
             before(grammarAccess.getReGetAccess().getOpsAssignment_5_2()); 
            // InternalRest.g:1761:2: ( rule__ReGet__OpsAssignment_5_2 )
            // InternalRest.g:1761:3: rule__ReGet__OpsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__OpsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getOpsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__2__Impl"


    // $ANTLR start "rule__ReGet__Group_5__3"
    // InternalRest.g:1769:1: rule__ReGet__Group_5__3 : rule__ReGet__Group_5__3__Impl rule__ReGet__Group_5__4 ;
    public final void rule__ReGet__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1773:1: ( rule__ReGet__Group_5__3__Impl rule__ReGet__Group_5__4 )
            // InternalRest.g:1774:2: rule__ReGet__Group_5__3__Impl rule__ReGet__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__ReGet__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__3"


    // $ANTLR start "rule__ReGet__Group_5__3__Impl"
    // InternalRest.g:1781:1: rule__ReGet__Group_5__3__Impl : ( ( rule__ReGet__Group_5_3__0 )* ) ;
    public final void rule__ReGet__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1785:1: ( ( ( rule__ReGet__Group_5_3__0 )* ) )
            // InternalRest.g:1786:1: ( ( rule__ReGet__Group_5_3__0 )* )
            {
            // InternalRest.g:1786:1: ( ( rule__ReGet__Group_5_3__0 )* )
            // InternalRest.g:1787:2: ( rule__ReGet__Group_5_3__0 )*
            {
             before(grammarAccess.getReGetAccess().getGroup_5_3()); 
            // InternalRest.g:1788:2: ( rule__ReGet__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRest.g:1788:3: rule__ReGet__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReGet__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getReGetAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__3__Impl"


    // $ANTLR start "rule__ReGet__Group_5__4"
    // InternalRest.g:1796:1: rule__ReGet__Group_5__4 : rule__ReGet__Group_5__4__Impl ;
    public final void rule__ReGet__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1800:1: ( rule__ReGet__Group_5__4__Impl )
            // InternalRest.g:1801:2: rule__ReGet__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__4"


    // $ANTLR start "rule__ReGet__Group_5__4__Impl"
    // InternalRest.g:1807:1: rule__ReGet__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ReGet__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1811:1: ( ( '}' ) )
            // InternalRest.g:1812:1: ( '}' )
            {
            // InternalRest.g:1812:1: ( '}' )
            // InternalRest.g:1813:2: '}'
            {
             before(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5__4__Impl"


    // $ANTLR start "rule__ReGet__Group_5_3__0"
    // InternalRest.g:1823:1: rule__ReGet__Group_5_3__0 : rule__ReGet__Group_5_3__0__Impl rule__ReGet__Group_5_3__1 ;
    public final void rule__ReGet__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1827:1: ( rule__ReGet__Group_5_3__0__Impl rule__ReGet__Group_5_3__1 )
            // InternalRest.g:1828:2: rule__ReGet__Group_5_3__0__Impl rule__ReGet__Group_5_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ReGet__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReGet__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5_3__0"


    // $ANTLR start "rule__ReGet__Group_5_3__0__Impl"
    // InternalRest.g:1835:1: rule__ReGet__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ReGet__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1839:1: ( ( ',' ) )
            // InternalRest.g:1840:1: ( ',' )
            {
            // InternalRest.g:1840:1: ( ',' )
            // InternalRest.g:1841:2: ','
            {
             before(grammarAccess.getReGetAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReGetAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5_3__0__Impl"


    // $ANTLR start "rule__ReGet__Group_5_3__1"
    // InternalRest.g:1850:1: rule__ReGet__Group_5_3__1 : rule__ReGet__Group_5_3__1__Impl ;
    public final void rule__ReGet__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1854:1: ( rule__ReGet__Group_5_3__1__Impl )
            // InternalRest.g:1855:2: rule__ReGet__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5_3__1"


    // $ANTLR start "rule__ReGet__Group_5_3__1__Impl"
    // InternalRest.g:1861:1: rule__ReGet__Group_5_3__1__Impl : ( ( rule__ReGet__OpsAssignment_5_3_1 ) ) ;
    public final void rule__ReGet__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1865:1: ( ( ( rule__ReGet__OpsAssignment_5_3_1 ) ) )
            // InternalRest.g:1866:1: ( ( rule__ReGet__OpsAssignment_5_3_1 ) )
            {
            // InternalRest.g:1866:1: ( ( rule__ReGet__OpsAssignment_5_3_1 ) )
            // InternalRest.g:1867:2: ( rule__ReGet__OpsAssignment_5_3_1 )
            {
             before(grammarAccess.getReGetAccess().getOpsAssignment_5_3_1()); 
            // InternalRest.g:1868:2: ( rule__ReGet__OpsAssignment_5_3_1 )
            // InternalRest.g:1868:3: rule__ReGet__OpsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReGet__OpsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReGetAccess().getOpsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__Group_5_3__1__Impl"


    // $ANTLR start "rule__RePost__Group__0"
    // InternalRest.g:1877:1: rule__RePost__Group__0 : rule__RePost__Group__0__Impl rule__RePost__Group__1 ;
    public final void rule__RePost__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1881:1: ( rule__RePost__Group__0__Impl rule__RePost__Group__1 )
            // InternalRest.g:1882:2: rule__RePost__Group__0__Impl rule__RePost__Group__1
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
    // InternalRest.g:1889:1: rule__RePost__Group__0__Impl : ( 'RePost' ) ;
    public final void rule__RePost__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1893:1: ( ( 'RePost' ) )
            // InternalRest.g:1894:1: ( 'RePost' )
            {
            // InternalRest.g:1894:1: ( 'RePost' )
            // InternalRest.g:1895:2: 'RePost'
            {
             before(grammarAccess.getRePostAccess().getRePostKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRest.g:1904:1: rule__RePost__Group__1 : rule__RePost__Group__1__Impl rule__RePost__Group__2 ;
    public final void rule__RePost__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1908:1: ( rule__RePost__Group__1__Impl rule__RePost__Group__2 )
            // InternalRest.g:1909:2: rule__RePost__Group__1__Impl rule__RePost__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalRest.g:1916:1: rule__RePost__Group__1__Impl : ( '{' ) ;
    public final void rule__RePost__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1920:1: ( ( '{' ) )
            // InternalRest.g:1921:1: ( '{' )
            {
            // InternalRest.g:1921:1: ( '{' )
            // InternalRest.g:1922:2: '{'
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
    // InternalRest.g:1931:1: rule__RePost__Group__2 : rule__RePost__Group__2__Impl rule__RePost__Group__3 ;
    public final void rule__RePost__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1935:1: ( rule__RePost__Group__2__Impl rule__RePost__Group__3 )
            // InternalRest.g:1936:2: rule__RePost__Group__2__Impl rule__RePost__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:1943:1: rule__RePost__Group__2__Impl : ( 'route' ) ;
    public final void rule__RePost__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1947:1: ( ( 'route' ) )
            // InternalRest.g:1948:1: ( 'route' )
            {
            // InternalRest.g:1948:1: ( 'route' )
            // InternalRest.g:1949:2: 'route'
            {
             before(grammarAccess.getRePostAccess().getRouteKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRouteKeyword_2()); 

            }


            }

        }
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
    // InternalRest.g:1958:1: rule__RePost__Group__3 : rule__RePost__Group__3__Impl rule__RePost__Group__4 ;
    public final void rule__RePost__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1962:1: ( rule__RePost__Group__3__Impl rule__RePost__Group__4 )
            // InternalRest.g:1963:2: rule__RePost__Group__3__Impl rule__RePost__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:1970:1: rule__RePost__Group__3__Impl : ( ( rule__RePost__RouteAssignment_3 ) ) ;
    public final void rule__RePost__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1974:1: ( ( ( rule__RePost__RouteAssignment_3 ) ) )
            // InternalRest.g:1975:1: ( ( rule__RePost__RouteAssignment_3 ) )
            {
            // InternalRest.g:1975:1: ( ( rule__RePost__RouteAssignment_3 ) )
            // InternalRest.g:1976:2: ( rule__RePost__RouteAssignment_3 )
            {
             before(grammarAccess.getRePostAccess().getRouteAssignment_3()); 
            // InternalRest.g:1977:2: ( rule__RePost__RouteAssignment_3 )
            // InternalRest.g:1977:3: rule__RePost__RouteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RePost__RouteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getRouteAssignment_3()); 

            }


            }

        }
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
    // InternalRest.g:1985:1: rule__RePost__Group__4 : rule__RePost__Group__4__Impl rule__RePost__Group__5 ;
    public final void rule__RePost__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1989:1: ( rule__RePost__Group__4__Impl rule__RePost__Group__5 )
            // InternalRest.g:1990:2: rule__RePost__Group__4__Impl rule__RePost__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:1997:1: rule__RePost__Group__4__Impl : ( ( rule__RePost__Group_4__0 )? ) ;
    public final void rule__RePost__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2001:1: ( ( ( rule__RePost__Group_4__0 )? ) )
            // InternalRest.g:2002:1: ( ( rule__RePost__Group_4__0 )? )
            {
            // InternalRest.g:2002:1: ( ( rule__RePost__Group_4__0 )? )
            // InternalRest.g:2003:2: ( rule__RePost__Group_4__0 )?
            {
             before(grammarAccess.getRePostAccess().getGroup_4()); 
            // InternalRest.g:2004:2: ( rule__RePost__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRest.g:2004:3: rule__RePost__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePost__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePostAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRest.g:2012:1: rule__RePost__Group__5 : rule__RePost__Group__5__Impl rule__RePost__Group__6 ;
    public final void rule__RePost__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2016:1: ( rule__RePost__Group__5__Impl rule__RePost__Group__6 )
            // InternalRest.g:2017:2: rule__RePost__Group__5__Impl rule__RePost__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:2024:1: rule__RePost__Group__5__Impl : ( ( rule__RePost__Group_5__0 )? ) ;
    public final void rule__RePost__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2028:1: ( ( ( rule__RePost__Group_5__0 )? ) )
            // InternalRest.g:2029:1: ( ( rule__RePost__Group_5__0 )? )
            {
            // InternalRest.g:2029:1: ( ( rule__RePost__Group_5__0 )? )
            // InternalRest.g:2030:2: ( rule__RePost__Group_5__0 )?
            {
             before(grammarAccess.getRePostAccess().getGroup_5()); 
            // InternalRest.g:2031:2: ( rule__RePost__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRest.g:2031:3: rule__RePost__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePost__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePostAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalRest.g:2039:1: rule__RePost__Group__6 : rule__RePost__Group__6__Impl ;
    public final void rule__RePost__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2043:1: ( rule__RePost__Group__6__Impl )
            // InternalRest.g:2044:2: rule__RePost__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalRest.g:2050:1: rule__RePost__Group__6__Impl : ( '}' ) ;
    public final void rule__RePost__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2054:1: ( ( '}' ) )
            // InternalRest.g:2055:1: ( '}' )
            {
            // InternalRest.g:2055:1: ( '}' )
            // InternalRest.g:2056:2: '}'
            {
             before(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RePost__Group_4__0"
    // InternalRest.g:2066:1: rule__RePost__Group_4__0 : rule__RePost__Group_4__0__Impl rule__RePost__Group_4__1 ;
    public final void rule__RePost__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2070:1: ( rule__RePost__Group_4__0__Impl rule__RePost__Group_4__1 )
            // InternalRest.g:2071:2: rule__RePost__Group_4__0__Impl rule__RePost__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__RePost__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__0"


    // $ANTLR start "rule__RePost__Group_4__0__Impl"
    // InternalRest.g:2078:1: rule__RePost__Group_4__0__Impl : ( 'data' ) ;
    public final void rule__RePost__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2082:1: ( ( 'data' ) )
            // InternalRest.g:2083:1: ( 'data' )
            {
            // InternalRest.g:2083:1: ( 'data' )
            // InternalRest.g:2084:2: 'data'
            {
             before(grammarAccess.getRePostAccess().getDataKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getDataKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__0__Impl"


    // $ANTLR start "rule__RePost__Group_4__1"
    // InternalRest.g:2093:1: rule__RePost__Group_4__1 : rule__RePost__Group_4__1__Impl rule__RePost__Group_4__2 ;
    public final void rule__RePost__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2097:1: ( rule__RePost__Group_4__1__Impl rule__RePost__Group_4__2 )
            // InternalRest.g:2098:2: rule__RePost__Group_4__1__Impl rule__RePost__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__RePost__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__1"


    // $ANTLR start "rule__RePost__Group_4__1__Impl"
    // InternalRest.g:2105:1: rule__RePost__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RePost__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2109:1: ( ( '{' ) )
            // InternalRest.g:2110:1: ( '{' )
            {
            // InternalRest.g:2110:1: ( '{' )
            // InternalRest.g:2111:2: '{'
            {
             before(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__1__Impl"


    // $ANTLR start "rule__RePost__Group_4__2"
    // InternalRest.g:2120:1: rule__RePost__Group_4__2 : rule__RePost__Group_4__2__Impl rule__RePost__Group_4__3 ;
    public final void rule__RePost__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2124:1: ( rule__RePost__Group_4__2__Impl rule__RePost__Group_4__3 )
            // InternalRest.g:2125:2: rule__RePost__Group_4__2__Impl rule__RePost__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__RePost__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__2"


    // $ANTLR start "rule__RePost__Group_4__2__Impl"
    // InternalRest.g:2132:1: rule__RePost__Group_4__2__Impl : ( ( rule__RePost__DataAssignment_4_2 ) ) ;
    public final void rule__RePost__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2136:1: ( ( ( rule__RePost__DataAssignment_4_2 ) ) )
            // InternalRest.g:2137:1: ( ( rule__RePost__DataAssignment_4_2 ) )
            {
            // InternalRest.g:2137:1: ( ( rule__RePost__DataAssignment_4_2 ) )
            // InternalRest.g:2138:2: ( rule__RePost__DataAssignment_4_2 )
            {
             before(grammarAccess.getRePostAccess().getDataAssignment_4_2()); 
            // InternalRest.g:2139:2: ( rule__RePost__DataAssignment_4_2 )
            // InternalRest.g:2139:3: rule__RePost__DataAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RePost__DataAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getDataAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__2__Impl"


    // $ANTLR start "rule__RePost__Group_4__3"
    // InternalRest.g:2147:1: rule__RePost__Group_4__3 : rule__RePost__Group_4__3__Impl rule__RePost__Group_4__4 ;
    public final void rule__RePost__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2151:1: ( rule__RePost__Group_4__3__Impl rule__RePost__Group_4__4 )
            // InternalRest.g:2152:2: rule__RePost__Group_4__3__Impl rule__RePost__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__RePost__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__3"


    // $ANTLR start "rule__RePost__Group_4__3__Impl"
    // InternalRest.g:2159:1: rule__RePost__Group_4__3__Impl : ( ( rule__RePost__Group_4_3__0 )* ) ;
    public final void rule__RePost__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2163:1: ( ( ( rule__RePost__Group_4_3__0 )* ) )
            // InternalRest.g:2164:1: ( ( rule__RePost__Group_4_3__0 )* )
            {
            // InternalRest.g:2164:1: ( ( rule__RePost__Group_4_3__0 )* )
            // InternalRest.g:2165:2: ( rule__RePost__Group_4_3__0 )*
            {
             before(grammarAccess.getRePostAccess().getGroup_4_3()); 
            // InternalRest.g:2166:2: ( rule__RePost__Group_4_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRest.g:2166:3: rule__RePost__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePost__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRePostAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__3__Impl"


    // $ANTLR start "rule__RePost__Group_4__4"
    // InternalRest.g:2174:1: rule__RePost__Group_4__4 : rule__RePost__Group_4__4__Impl ;
    public final void rule__RePost__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2178:1: ( rule__RePost__Group_4__4__Impl )
            // InternalRest.g:2179:2: rule__RePost__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__4"


    // $ANTLR start "rule__RePost__Group_4__4__Impl"
    // InternalRest.g:2185:1: rule__RePost__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RePost__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2189:1: ( ( '}' ) )
            // InternalRest.g:2190:1: ( '}' )
            {
            // InternalRest.g:2190:1: ( '}' )
            // InternalRest.g:2191:2: '}'
            {
             before(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4__4__Impl"


    // $ANTLR start "rule__RePost__Group_4_3__0"
    // InternalRest.g:2201:1: rule__RePost__Group_4_3__0 : rule__RePost__Group_4_3__0__Impl rule__RePost__Group_4_3__1 ;
    public final void rule__RePost__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2205:1: ( rule__RePost__Group_4_3__0__Impl rule__RePost__Group_4_3__1 )
            // InternalRest.g:2206:2: rule__RePost__Group_4_3__0__Impl rule__RePost__Group_4_3__1
            {
            pushFollow(FOLLOW_15);
            rule__RePost__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4_3__0"


    // $ANTLR start "rule__RePost__Group_4_3__0__Impl"
    // InternalRest.g:2213:1: rule__RePost__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RePost__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2217:1: ( ( ',' ) )
            // InternalRest.g:2218:1: ( ',' )
            {
            // InternalRest.g:2218:1: ( ',' )
            // InternalRest.g:2219:2: ','
            {
             before(grammarAccess.getRePostAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4_3__0__Impl"


    // $ANTLR start "rule__RePost__Group_4_3__1"
    // InternalRest.g:2228:1: rule__RePost__Group_4_3__1 : rule__RePost__Group_4_3__1__Impl ;
    public final void rule__RePost__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2232:1: ( rule__RePost__Group_4_3__1__Impl )
            // InternalRest.g:2233:2: rule__RePost__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4_3__1"


    // $ANTLR start "rule__RePost__Group_4_3__1__Impl"
    // InternalRest.g:2239:1: rule__RePost__Group_4_3__1__Impl : ( ( rule__RePost__DataAssignment_4_3_1 ) ) ;
    public final void rule__RePost__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2243:1: ( ( ( rule__RePost__DataAssignment_4_3_1 ) ) )
            // InternalRest.g:2244:1: ( ( rule__RePost__DataAssignment_4_3_1 ) )
            {
            // InternalRest.g:2244:1: ( ( rule__RePost__DataAssignment_4_3_1 ) )
            // InternalRest.g:2245:2: ( rule__RePost__DataAssignment_4_3_1 )
            {
             before(grammarAccess.getRePostAccess().getDataAssignment_4_3_1()); 
            // InternalRest.g:2246:2: ( rule__RePost__DataAssignment_4_3_1 )
            // InternalRest.g:2246:3: rule__RePost__DataAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePost__DataAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getDataAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_4_3__1__Impl"


    // $ANTLR start "rule__RePost__Group_5__0"
    // InternalRest.g:2255:1: rule__RePost__Group_5__0 : rule__RePost__Group_5__0__Impl rule__RePost__Group_5__1 ;
    public final void rule__RePost__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2259:1: ( rule__RePost__Group_5__0__Impl rule__RePost__Group_5__1 )
            // InternalRest.g:2260:2: rule__RePost__Group_5__0__Impl rule__RePost__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__RePost__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__0"


    // $ANTLR start "rule__RePost__Group_5__0__Impl"
    // InternalRest.g:2267:1: rule__RePost__Group_5__0__Impl : ( 'ops' ) ;
    public final void rule__RePost__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2271:1: ( ( 'ops' ) )
            // InternalRest.g:2272:1: ( 'ops' )
            {
            // InternalRest.g:2272:1: ( 'ops' )
            // InternalRest.g:2273:2: 'ops'
            {
             before(grammarAccess.getRePostAccess().getOpsKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getOpsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__0__Impl"


    // $ANTLR start "rule__RePost__Group_5__1"
    // InternalRest.g:2282:1: rule__RePost__Group_5__1 : rule__RePost__Group_5__1__Impl rule__RePost__Group_5__2 ;
    public final void rule__RePost__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2286:1: ( rule__RePost__Group_5__1__Impl rule__RePost__Group_5__2 )
            // InternalRest.g:2287:2: rule__RePost__Group_5__1__Impl rule__RePost__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__RePost__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__1"


    // $ANTLR start "rule__RePost__Group_5__1__Impl"
    // InternalRest.g:2294:1: rule__RePost__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RePost__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2298:1: ( ( '{' ) )
            // InternalRest.g:2299:1: ( '{' )
            {
            // InternalRest.g:2299:1: ( '{' )
            // InternalRest.g:2300:2: '{'
            {
             before(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__1__Impl"


    // $ANTLR start "rule__RePost__Group_5__2"
    // InternalRest.g:2309:1: rule__RePost__Group_5__2 : rule__RePost__Group_5__2__Impl rule__RePost__Group_5__3 ;
    public final void rule__RePost__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2313:1: ( rule__RePost__Group_5__2__Impl rule__RePost__Group_5__3 )
            // InternalRest.g:2314:2: rule__RePost__Group_5__2__Impl rule__RePost__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__RePost__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__2"


    // $ANTLR start "rule__RePost__Group_5__2__Impl"
    // InternalRest.g:2321:1: rule__RePost__Group_5__2__Impl : ( ( rule__RePost__OpsAssignment_5_2 ) ) ;
    public final void rule__RePost__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2325:1: ( ( ( rule__RePost__OpsAssignment_5_2 ) ) )
            // InternalRest.g:2326:1: ( ( rule__RePost__OpsAssignment_5_2 ) )
            {
            // InternalRest.g:2326:1: ( ( rule__RePost__OpsAssignment_5_2 ) )
            // InternalRest.g:2327:2: ( rule__RePost__OpsAssignment_5_2 )
            {
             before(grammarAccess.getRePostAccess().getOpsAssignment_5_2()); 
            // InternalRest.g:2328:2: ( rule__RePost__OpsAssignment_5_2 )
            // InternalRest.g:2328:3: rule__RePost__OpsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RePost__OpsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getOpsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__2__Impl"


    // $ANTLR start "rule__RePost__Group_5__3"
    // InternalRest.g:2336:1: rule__RePost__Group_5__3 : rule__RePost__Group_5__3__Impl rule__RePost__Group_5__4 ;
    public final void rule__RePost__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2340:1: ( rule__RePost__Group_5__3__Impl rule__RePost__Group_5__4 )
            // InternalRest.g:2341:2: rule__RePost__Group_5__3__Impl rule__RePost__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__RePost__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__3"


    // $ANTLR start "rule__RePost__Group_5__3__Impl"
    // InternalRest.g:2348:1: rule__RePost__Group_5__3__Impl : ( ( rule__RePost__Group_5_3__0 )* ) ;
    public final void rule__RePost__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2352:1: ( ( ( rule__RePost__Group_5_3__0 )* ) )
            // InternalRest.g:2353:1: ( ( rule__RePost__Group_5_3__0 )* )
            {
            // InternalRest.g:2353:1: ( ( rule__RePost__Group_5_3__0 )* )
            // InternalRest.g:2354:2: ( rule__RePost__Group_5_3__0 )*
            {
             before(grammarAccess.getRePostAccess().getGroup_5_3()); 
            // InternalRest.g:2355:2: ( rule__RePost__Group_5_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRest.g:2355:3: rule__RePost__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePost__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRePostAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__3__Impl"


    // $ANTLR start "rule__RePost__Group_5__4"
    // InternalRest.g:2363:1: rule__RePost__Group_5__4 : rule__RePost__Group_5__4__Impl ;
    public final void rule__RePost__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2367:1: ( rule__RePost__Group_5__4__Impl )
            // InternalRest.g:2368:2: rule__RePost__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__4"


    // $ANTLR start "rule__RePost__Group_5__4__Impl"
    // InternalRest.g:2374:1: rule__RePost__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RePost__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2378:1: ( ( '}' ) )
            // InternalRest.g:2379:1: ( '}' )
            {
            // InternalRest.g:2379:1: ( '}' )
            // InternalRest.g:2380:2: '}'
            {
             before(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5__4__Impl"


    // $ANTLR start "rule__RePost__Group_5_3__0"
    // InternalRest.g:2390:1: rule__RePost__Group_5_3__0 : rule__RePost__Group_5_3__0__Impl rule__RePost__Group_5_3__1 ;
    public final void rule__RePost__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2394:1: ( rule__RePost__Group_5_3__0__Impl rule__RePost__Group_5_3__1 )
            // InternalRest.g:2395:2: rule__RePost__Group_5_3__0__Impl rule__RePost__Group_5_3__1
            {
            pushFollow(FOLLOW_16);
            rule__RePost__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePost__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5_3__0"


    // $ANTLR start "rule__RePost__Group_5_3__0__Impl"
    // InternalRest.g:2402:1: rule__RePost__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RePost__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2406:1: ( ( ',' ) )
            // InternalRest.g:2407:1: ( ',' )
            {
            // InternalRest.g:2407:1: ( ',' )
            // InternalRest.g:2408:2: ','
            {
             before(grammarAccess.getRePostAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePostAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5_3__0__Impl"


    // $ANTLR start "rule__RePost__Group_5_3__1"
    // InternalRest.g:2417:1: rule__RePost__Group_5_3__1 : rule__RePost__Group_5_3__1__Impl ;
    public final void rule__RePost__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2421:1: ( rule__RePost__Group_5_3__1__Impl )
            // InternalRest.g:2422:2: rule__RePost__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePost__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5_3__1"


    // $ANTLR start "rule__RePost__Group_5_3__1__Impl"
    // InternalRest.g:2428:1: rule__RePost__Group_5_3__1__Impl : ( ( rule__RePost__OpsAssignment_5_3_1 ) ) ;
    public final void rule__RePost__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2432:1: ( ( ( rule__RePost__OpsAssignment_5_3_1 ) ) )
            // InternalRest.g:2433:1: ( ( rule__RePost__OpsAssignment_5_3_1 ) )
            {
            // InternalRest.g:2433:1: ( ( rule__RePost__OpsAssignment_5_3_1 ) )
            // InternalRest.g:2434:2: ( rule__RePost__OpsAssignment_5_3_1 )
            {
             before(grammarAccess.getRePostAccess().getOpsAssignment_5_3_1()); 
            // InternalRest.g:2435:2: ( rule__RePost__OpsAssignment_5_3_1 )
            // InternalRest.g:2435:3: rule__RePost__OpsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePost__OpsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePostAccess().getOpsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__Group_5_3__1__Impl"


    // $ANTLR start "rule__RePut__Group__0"
    // InternalRest.g:2444:1: rule__RePut__Group__0 : rule__RePut__Group__0__Impl rule__RePut__Group__1 ;
    public final void rule__RePut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2448:1: ( rule__RePut__Group__0__Impl rule__RePut__Group__1 )
            // InternalRest.g:2449:2: rule__RePut__Group__0__Impl rule__RePut__Group__1
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
    // InternalRest.g:2456:1: rule__RePut__Group__0__Impl : ( 'RePut' ) ;
    public final void rule__RePut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2460:1: ( ( 'RePut' ) )
            // InternalRest.g:2461:1: ( 'RePut' )
            {
            // InternalRest.g:2461:1: ( 'RePut' )
            // InternalRest.g:2462:2: 'RePut'
            {
             before(grammarAccess.getRePutAccess().getRePutKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRest.g:2471:1: rule__RePut__Group__1 : rule__RePut__Group__1__Impl rule__RePut__Group__2 ;
    public final void rule__RePut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2475:1: ( rule__RePut__Group__1__Impl rule__RePut__Group__2 )
            // InternalRest.g:2476:2: rule__RePut__Group__1__Impl rule__RePut__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalRest.g:2483:1: rule__RePut__Group__1__Impl : ( '{' ) ;
    public final void rule__RePut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2487:1: ( ( '{' ) )
            // InternalRest.g:2488:1: ( '{' )
            {
            // InternalRest.g:2488:1: ( '{' )
            // InternalRest.g:2489:2: '{'
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
    // InternalRest.g:2498:1: rule__RePut__Group__2 : rule__RePut__Group__2__Impl rule__RePut__Group__3 ;
    public final void rule__RePut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2502:1: ( rule__RePut__Group__2__Impl rule__RePut__Group__3 )
            // InternalRest.g:2503:2: rule__RePut__Group__2__Impl rule__RePut__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:2510:1: rule__RePut__Group__2__Impl : ( 'route' ) ;
    public final void rule__RePut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2514:1: ( ( 'route' ) )
            // InternalRest.g:2515:1: ( 'route' )
            {
            // InternalRest.g:2515:1: ( 'route' )
            // InternalRest.g:2516:2: 'route'
            {
             before(grammarAccess.getRePutAccess().getRouteKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRouteKeyword_2()); 

            }


            }

        }
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
    // InternalRest.g:2525:1: rule__RePut__Group__3 : rule__RePut__Group__3__Impl rule__RePut__Group__4 ;
    public final void rule__RePut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2529:1: ( rule__RePut__Group__3__Impl rule__RePut__Group__4 )
            // InternalRest.g:2530:2: rule__RePut__Group__3__Impl rule__RePut__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:2537:1: rule__RePut__Group__3__Impl : ( ( rule__RePut__RouteAssignment_3 ) ) ;
    public final void rule__RePut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2541:1: ( ( ( rule__RePut__RouteAssignment_3 ) ) )
            // InternalRest.g:2542:1: ( ( rule__RePut__RouteAssignment_3 ) )
            {
            // InternalRest.g:2542:1: ( ( rule__RePut__RouteAssignment_3 ) )
            // InternalRest.g:2543:2: ( rule__RePut__RouteAssignment_3 )
            {
             before(grammarAccess.getRePutAccess().getRouteAssignment_3()); 
            // InternalRest.g:2544:2: ( rule__RePut__RouteAssignment_3 )
            // InternalRest.g:2544:3: rule__RePut__RouteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RePut__RouteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getRouteAssignment_3()); 

            }


            }

        }
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
    // InternalRest.g:2552:1: rule__RePut__Group__4 : rule__RePut__Group__4__Impl rule__RePut__Group__5 ;
    public final void rule__RePut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2556:1: ( rule__RePut__Group__4__Impl rule__RePut__Group__5 )
            // InternalRest.g:2557:2: rule__RePut__Group__4__Impl rule__RePut__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:2564:1: rule__RePut__Group__4__Impl : ( ( rule__RePut__Group_4__0 )? ) ;
    public final void rule__RePut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2568:1: ( ( ( rule__RePut__Group_4__0 )? ) )
            // InternalRest.g:2569:1: ( ( rule__RePut__Group_4__0 )? )
            {
            // InternalRest.g:2569:1: ( ( rule__RePut__Group_4__0 )? )
            // InternalRest.g:2570:2: ( rule__RePut__Group_4__0 )?
            {
             before(grammarAccess.getRePutAccess().getGroup_4()); 
            // InternalRest.g:2571:2: ( rule__RePut__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRest.g:2571:3: rule__RePut__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePut__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePutAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRest.g:2579:1: rule__RePut__Group__5 : rule__RePut__Group__5__Impl rule__RePut__Group__6 ;
    public final void rule__RePut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2583:1: ( rule__RePut__Group__5__Impl rule__RePut__Group__6 )
            // InternalRest.g:2584:2: rule__RePut__Group__5__Impl rule__RePut__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:2591:1: rule__RePut__Group__5__Impl : ( ( rule__RePut__Group_5__0 )? ) ;
    public final void rule__RePut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2595:1: ( ( ( rule__RePut__Group_5__0 )? ) )
            // InternalRest.g:2596:1: ( ( rule__RePut__Group_5__0 )? )
            {
            // InternalRest.g:2596:1: ( ( rule__RePut__Group_5__0 )? )
            // InternalRest.g:2597:2: ( rule__RePut__Group_5__0 )?
            {
             before(grammarAccess.getRePutAccess().getGroup_5()); 
            // InternalRest.g:2598:2: ( rule__RePut__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRest.g:2598:3: rule__RePut__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RePut__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRePutAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalRest.g:2606:1: rule__RePut__Group__6 : rule__RePut__Group__6__Impl ;
    public final void rule__RePut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2610:1: ( rule__RePut__Group__6__Impl )
            // InternalRest.g:2611:2: rule__RePut__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalRest.g:2617:1: rule__RePut__Group__6__Impl : ( '}' ) ;
    public final void rule__RePut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2621:1: ( ( '}' ) )
            // InternalRest.g:2622:1: ( '}' )
            {
            // InternalRest.g:2622:1: ( '}' )
            // InternalRest.g:2623:2: '}'
            {
             before(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RePut__Group_4__0"
    // InternalRest.g:2633:1: rule__RePut__Group_4__0 : rule__RePut__Group_4__0__Impl rule__RePut__Group_4__1 ;
    public final void rule__RePut__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2637:1: ( rule__RePut__Group_4__0__Impl rule__RePut__Group_4__1 )
            // InternalRest.g:2638:2: rule__RePut__Group_4__0__Impl rule__RePut__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__RePut__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__0"


    // $ANTLR start "rule__RePut__Group_4__0__Impl"
    // InternalRest.g:2645:1: rule__RePut__Group_4__0__Impl : ( 'data' ) ;
    public final void rule__RePut__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2649:1: ( ( 'data' ) )
            // InternalRest.g:2650:1: ( 'data' )
            {
            // InternalRest.g:2650:1: ( 'data' )
            // InternalRest.g:2651:2: 'data'
            {
             before(grammarAccess.getRePutAccess().getDataKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getDataKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__0__Impl"


    // $ANTLR start "rule__RePut__Group_4__1"
    // InternalRest.g:2660:1: rule__RePut__Group_4__1 : rule__RePut__Group_4__1__Impl rule__RePut__Group_4__2 ;
    public final void rule__RePut__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2664:1: ( rule__RePut__Group_4__1__Impl rule__RePut__Group_4__2 )
            // InternalRest.g:2665:2: rule__RePut__Group_4__1__Impl rule__RePut__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__RePut__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__1"


    // $ANTLR start "rule__RePut__Group_4__1__Impl"
    // InternalRest.g:2672:1: rule__RePut__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RePut__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2676:1: ( ( '{' ) )
            // InternalRest.g:2677:1: ( '{' )
            {
            // InternalRest.g:2677:1: ( '{' )
            // InternalRest.g:2678:2: '{'
            {
             before(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__1__Impl"


    // $ANTLR start "rule__RePut__Group_4__2"
    // InternalRest.g:2687:1: rule__RePut__Group_4__2 : rule__RePut__Group_4__2__Impl rule__RePut__Group_4__3 ;
    public final void rule__RePut__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2691:1: ( rule__RePut__Group_4__2__Impl rule__RePut__Group_4__3 )
            // InternalRest.g:2692:2: rule__RePut__Group_4__2__Impl rule__RePut__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__RePut__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__2"


    // $ANTLR start "rule__RePut__Group_4__2__Impl"
    // InternalRest.g:2699:1: rule__RePut__Group_4__2__Impl : ( ( rule__RePut__DataAssignment_4_2 ) ) ;
    public final void rule__RePut__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2703:1: ( ( ( rule__RePut__DataAssignment_4_2 ) ) )
            // InternalRest.g:2704:1: ( ( rule__RePut__DataAssignment_4_2 ) )
            {
            // InternalRest.g:2704:1: ( ( rule__RePut__DataAssignment_4_2 ) )
            // InternalRest.g:2705:2: ( rule__RePut__DataAssignment_4_2 )
            {
             before(grammarAccess.getRePutAccess().getDataAssignment_4_2()); 
            // InternalRest.g:2706:2: ( rule__RePut__DataAssignment_4_2 )
            // InternalRest.g:2706:3: rule__RePut__DataAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RePut__DataAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getDataAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__2__Impl"


    // $ANTLR start "rule__RePut__Group_4__3"
    // InternalRest.g:2714:1: rule__RePut__Group_4__3 : rule__RePut__Group_4__3__Impl rule__RePut__Group_4__4 ;
    public final void rule__RePut__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2718:1: ( rule__RePut__Group_4__3__Impl rule__RePut__Group_4__4 )
            // InternalRest.g:2719:2: rule__RePut__Group_4__3__Impl rule__RePut__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__RePut__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__3"


    // $ANTLR start "rule__RePut__Group_4__3__Impl"
    // InternalRest.g:2726:1: rule__RePut__Group_4__3__Impl : ( ( rule__RePut__Group_4_3__0 )* ) ;
    public final void rule__RePut__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2730:1: ( ( ( rule__RePut__Group_4_3__0 )* ) )
            // InternalRest.g:2731:1: ( ( rule__RePut__Group_4_3__0 )* )
            {
            // InternalRest.g:2731:1: ( ( rule__RePut__Group_4_3__0 )* )
            // InternalRest.g:2732:2: ( rule__RePut__Group_4_3__0 )*
            {
             before(grammarAccess.getRePutAccess().getGroup_4_3()); 
            // InternalRest.g:2733:2: ( rule__RePut__Group_4_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRest.g:2733:3: rule__RePut__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePut__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRePutAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__3__Impl"


    // $ANTLR start "rule__RePut__Group_4__4"
    // InternalRest.g:2741:1: rule__RePut__Group_4__4 : rule__RePut__Group_4__4__Impl ;
    public final void rule__RePut__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2745:1: ( rule__RePut__Group_4__4__Impl )
            // InternalRest.g:2746:2: rule__RePut__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__4"


    // $ANTLR start "rule__RePut__Group_4__4__Impl"
    // InternalRest.g:2752:1: rule__RePut__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RePut__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2756:1: ( ( '}' ) )
            // InternalRest.g:2757:1: ( '}' )
            {
            // InternalRest.g:2757:1: ( '}' )
            // InternalRest.g:2758:2: '}'
            {
             before(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4__4__Impl"


    // $ANTLR start "rule__RePut__Group_4_3__0"
    // InternalRest.g:2768:1: rule__RePut__Group_4_3__0 : rule__RePut__Group_4_3__0__Impl rule__RePut__Group_4_3__1 ;
    public final void rule__RePut__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2772:1: ( rule__RePut__Group_4_3__0__Impl rule__RePut__Group_4_3__1 )
            // InternalRest.g:2773:2: rule__RePut__Group_4_3__0__Impl rule__RePut__Group_4_3__1
            {
            pushFollow(FOLLOW_15);
            rule__RePut__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4_3__0"


    // $ANTLR start "rule__RePut__Group_4_3__0__Impl"
    // InternalRest.g:2780:1: rule__RePut__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RePut__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2784:1: ( ( ',' ) )
            // InternalRest.g:2785:1: ( ',' )
            {
            // InternalRest.g:2785:1: ( ',' )
            // InternalRest.g:2786:2: ','
            {
             before(grammarAccess.getRePutAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4_3__0__Impl"


    // $ANTLR start "rule__RePut__Group_4_3__1"
    // InternalRest.g:2795:1: rule__RePut__Group_4_3__1 : rule__RePut__Group_4_3__1__Impl ;
    public final void rule__RePut__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2799:1: ( rule__RePut__Group_4_3__1__Impl )
            // InternalRest.g:2800:2: rule__RePut__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4_3__1"


    // $ANTLR start "rule__RePut__Group_4_3__1__Impl"
    // InternalRest.g:2806:1: rule__RePut__Group_4_3__1__Impl : ( ( rule__RePut__DataAssignment_4_3_1 ) ) ;
    public final void rule__RePut__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2810:1: ( ( ( rule__RePut__DataAssignment_4_3_1 ) ) )
            // InternalRest.g:2811:1: ( ( rule__RePut__DataAssignment_4_3_1 ) )
            {
            // InternalRest.g:2811:1: ( ( rule__RePut__DataAssignment_4_3_1 ) )
            // InternalRest.g:2812:2: ( rule__RePut__DataAssignment_4_3_1 )
            {
             before(grammarAccess.getRePutAccess().getDataAssignment_4_3_1()); 
            // InternalRest.g:2813:2: ( rule__RePut__DataAssignment_4_3_1 )
            // InternalRest.g:2813:3: rule__RePut__DataAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePut__DataAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getDataAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_4_3__1__Impl"


    // $ANTLR start "rule__RePut__Group_5__0"
    // InternalRest.g:2822:1: rule__RePut__Group_5__0 : rule__RePut__Group_5__0__Impl rule__RePut__Group_5__1 ;
    public final void rule__RePut__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2826:1: ( rule__RePut__Group_5__0__Impl rule__RePut__Group_5__1 )
            // InternalRest.g:2827:2: rule__RePut__Group_5__0__Impl rule__RePut__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__RePut__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__0"


    // $ANTLR start "rule__RePut__Group_5__0__Impl"
    // InternalRest.g:2834:1: rule__RePut__Group_5__0__Impl : ( 'ops' ) ;
    public final void rule__RePut__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2838:1: ( ( 'ops' ) )
            // InternalRest.g:2839:1: ( 'ops' )
            {
            // InternalRest.g:2839:1: ( 'ops' )
            // InternalRest.g:2840:2: 'ops'
            {
             before(grammarAccess.getRePutAccess().getOpsKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getOpsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__0__Impl"


    // $ANTLR start "rule__RePut__Group_5__1"
    // InternalRest.g:2849:1: rule__RePut__Group_5__1 : rule__RePut__Group_5__1__Impl rule__RePut__Group_5__2 ;
    public final void rule__RePut__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2853:1: ( rule__RePut__Group_5__1__Impl rule__RePut__Group_5__2 )
            // InternalRest.g:2854:2: rule__RePut__Group_5__1__Impl rule__RePut__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__RePut__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__1"


    // $ANTLR start "rule__RePut__Group_5__1__Impl"
    // InternalRest.g:2861:1: rule__RePut__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RePut__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2865:1: ( ( '{' ) )
            // InternalRest.g:2866:1: ( '{' )
            {
            // InternalRest.g:2866:1: ( '{' )
            // InternalRest.g:2867:2: '{'
            {
             before(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__1__Impl"


    // $ANTLR start "rule__RePut__Group_5__2"
    // InternalRest.g:2876:1: rule__RePut__Group_5__2 : rule__RePut__Group_5__2__Impl rule__RePut__Group_5__3 ;
    public final void rule__RePut__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2880:1: ( rule__RePut__Group_5__2__Impl rule__RePut__Group_5__3 )
            // InternalRest.g:2881:2: rule__RePut__Group_5__2__Impl rule__RePut__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__RePut__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__2"


    // $ANTLR start "rule__RePut__Group_5__2__Impl"
    // InternalRest.g:2888:1: rule__RePut__Group_5__2__Impl : ( ( rule__RePut__OpsAssignment_5_2 ) ) ;
    public final void rule__RePut__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2892:1: ( ( ( rule__RePut__OpsAssignment_5_2 ) ) )
            // InternalRest.g:2893:1: ( ( rule__RePut__OpsAssignment_5_2 ) )
            {
            // InternalRest.g:2893:1: ( ( rule__RePut__OpsAssignment_5_2 ) )
            // InternalRest.g:2894:2: ( rule__RePut__OpsAssignment_5_2 )
            {
             before(grammarAccess.getRePutAccess().getOpsAssignment_5_2()); 
            // InternalRest.g:2895:2: ( rule__RePut__OpsAssignment_5_2 )
            // InternalRest.g:2895:3: rule__RePut__OpsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RePut__OpsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getOpsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__2__Impl"


    // $ANTLR start "rule__RePut__Group_5__3"
    // InternalRest.g:2903:1: rule__RePut__Group_5__3 : rule__RePut__Group_5__3__Impl rule__RePut__Group_5__4 ;
    public final void rule__RePut__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2907:1: ( rule__RePut__Group_5__3__Impl rule__RePut__Group_5__4 )
            // InternalRest.g:2908:2: rule__RePut__Group_5__3__Impl rule__RePut__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__RePut__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__3"


    // $ANTLR start "rule__RePut__Group_5__3__Impl"
    // InternalRest.g:2915:1: rule__RePut__Group_5__3__Impl : ( ( rule__RePut__Group_5_3__0 )* ) ;
    public final void rule__RePut__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2919:1: ( ( ( rule__RePut__Group_5_3__0 )* ) )
            // InternalRest.g:2920:1: ( ( rule__RePut__Group_5_3__0 )* )
            {
            // InternalRest.g:2920:1: ( ( rule__RePut__Group_5_3__0 )* )
            // InternalRest.g:2921:2: ( rule__RePut__Group_5_3__0 )*
            {
             before(grammarAccess.getRePutAccess().getGroup_5_3()); 
            // InternalRest.g:2922:2: ( rule__RePut__Group_5_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRest.g:2922:3: rule__RePut__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RePut__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRePutAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__3__Impl"


    // $ANTLR start "rule__RePut__Group_5__4"
    // InternalRest.g:2930:1: rule__RePut__Group_5__4 : rule__RePut__Group_5__4__Impl ;
    public final void rule__RePut__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2934:1: ( rule__RePut__Group_5__4__Impl )
            // InternalRest.g:2935:2: rule__RePut__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__4"


    // $ANTLR start "rule__RePut__Group_5__4__Impl"
    // InternalRest.g:2941:1: rule__RePut__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RePut__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2945:1: ( ( '}' ) )
            // InternalRest.g:2946:1: ( '}' )
            {
            // InternalRest.g:2946:1: ( '}' )
            // InternalRest.g:2947:2: '}'
            {
             before(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5__4__Impl"


    // $ANTLR start "rule__RePut__Group_5_3__0"
    // InternalRest.g:2957:1: rule__RePut__Group_5_3__0 : rule__RePut__Group_5_3__0__Impl rule__RePut__Group_5_3__1 ;
    public final void rule__RePut__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2961:1: ( rule__RePut__Group_5_3__0__Impl rule__RePut__Group_5_3__1 )
            // InternalRest.g:2962:2: rule__RePut__Group_5_3__0__Impl rule__RePut__Group_5_3__1
            {
            pushFollow(FOLLOW_16);
            rule__RePut__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RePut__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5_3__0"


    // $ANTLR start "rule__RePut__Group_5_3__0__Impl"
    // InternalRest.g:2969:1: rule__RePut__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RePut__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2973:1: ( ( ',' ) )
            // InternalRest.g:2974:1: ( ',' )
            {
            // InternalRest.g:2974:1: ( ',' )
            // InternalRest.g:2975:2: ','
            {
             before(grammarAccess.getRePutAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRePutAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5_3__0__Impl"


    // $ANTLR start "rule__RePut__Group_5_3__1"
    // InternalRest.g:2984:1: rule__RePut__Group_5_3__1 : rule__RePut__Group_5_3__1__Impl ;
    public final void rule__RePut__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2988:1: ( rule__RePut__Group_5_3__1__Impl )
            // InternalRest.g:2989:2: rule__RePut__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RePut__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5_3__1"


    // $ANTLR start "rule__RePut__Group_5_3__1__Impl"
    // InternalRest.g:2995:1: rule__RePut__Group_5_3__1__Impl : ( ( rule__RePut__OpsAssignment_5_3_1 ) ) ;
    public final void rule__RePut__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2999:1: ( ( ( rule__RePut__OpsAssignment_5_3_1 ) ) )
            // InternalRest.g:3000:1: ( ( rule__RePut__OpsAssignment_5_3_1 ) )
            {
            // InternalRest.g:3000:1: ( ( rule__RePut__OpsAssignment_5_3_1 ) )
            // InternalRest.g:3001:2: ( rule__RePut__OpsAssignment_5_3_1 )
            {
             before(grammarAccess.getRePutAccess().getOpsAssignment_5_3_1()); 
            // InternalRest.g:3002:2: ( rule__RePut__OpsAssignment_5_3_1 )
            // InternalRest.g:3002:3: rule__RePut__OpsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RePut__OpsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRePutAccess().getOpsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__Group_5_3__1__Impl"


    // $ANTLR start "rule__ReDelete__Group__0"
    // InternalRest.g:3011:1: rule__ReDelete__Group__0 : rule__ReDelete__Group__0__Impl rule__ReDelete__Group__1 ;
    public final void rule__ReDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3015:1: ( rule__ReDelete__Group__0__Impl rule__ReDelete__Group__1 )
            // InternalRest.g:3016:2: rule__ReDelete__Group__0__Impl rule__ReDelete__Group__1
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
    // InternalRest.g:3023:1: rule__ReDelete__Group__0__Impl : ( 'ReDelete' ) ;
    public final void rule__ReDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3027:1: ( ( 'ReDelete' ) )
            // InternalRest.g:3028:1: ( 'ReDelete' )
            {
            // InternalRest.g:3028:1: ( 'ReDelete' )
            // InternalRest.g:3029:2: 'ReDelete'
            {
             before(grammarAccess.getReDeleteAccess().getReDeleteKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRest.g:3038:1: rule__ReDelete__Group__1 : rule__ReDelete__Group__1__Impl rule__ReDelete__Group__2 ;
    public final void rule__ReDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3042:1: ( rule__ReDelete__Group__1__Impl rule__ReDelete__Group__2 )
            // InternalRest.g:3043:2: rule__ReDelete__Group__1__Impl rule__ReDelete__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalRest.g:3050:1: rule__ReDelete__Group__1__Impl : ( '{' ) ;
    public final void rule__ReDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3054:1: ( ( '{' ) )
            // InternalRest.g:3055:1: ( '{' )
            {
            // InternalRest.g:3055:1: ( '{' )
            // InternalRest.g:3056:2: '{'
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
    // InternalRest.g:3065:1: rule__ReDelete__Group__2 : rule__ReDelete__Group__2__Impl rule__ReDelete__Group__3 ;
    public final void rule__ReDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3069:1: ( rule__ReDelete__Group__2__Impl rule__ReDelete__Group__3 )
            // InternalRest.g:3070:2: rule__ReDelete__Group__2__Impl rule__ReDelete__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalRest.g:3077:1: rule__ReDelete__Group__2__Impl : ( 'route' ) ;
    public final void rule__ReDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3081:1: ( ( 'route' ) )
            // InternalRest.g:3082:1: ( 'route' )
            {
            // InternalRest.g:3082:1: ( 'route' )
            // InternalRest.g:3083:2: 'route'
            {
             before(grammarAccess.getReDeleteAccess().getRouteKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRouteKeyword_2()); 

            }


            }

        }
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
    // InternalRest.g:3092:1: rule__ReDelete__Group__3 : rule__ReDelete__Group__3__Impl rule__ReDelete__Group__4 ;
    public final void rule__ReDelete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3096:1: ( rule__ReDelete__Group__3__Impl rule__ReDelete__Group__4 )
            // InternalRest.g:3097:2: rule__ReDelete__Group__3__Impl rule__ReDelete__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:3104:1: rule__ReDelete__Group__3__Impl : ( ( rule__ReDelete__RouteAssignment_3 ) ) ;
    public final void rule__ReDelete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3108:1: ( ( ( rule__ReDelete__RouteAssignment_3 ) ) )
            // InternalRest.g:3109:1: ( ( rule__ReDelete__RouteAssignment_3 ) )
            {
            // InternalRest.g:3109:1: ( ( rule__ReDelete__RouteAssignment_3 ) )
            // InternalRest.g:3110:2: ( rule__ReDelete__RouteAssignment_3 )
            {
             before(grammarAccess.getReDeleteAccess().getRouteAssignment_3()); 
            // InternalRest.g:3111:2: ( rule__ReDelete__RouteAssignment_3 )
            // InternalRest.g:3111:3: rule__ReDelete__RouteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__RouteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getRouteAssignment_3()); 

            }


            }

        }
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
    // InternalRest.g:3119:1: rule__ReDelete__Group__4 : rule__ReDelete__Group__4__Impl rule__ReDelete__Group__5 ;
    public final void rule__ReDelete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3123:1: ( rule__ReDelete__Group__4__Impl rule__ReDelete__Group__5 )
            // InternalRest.g:3124:2: rule__ReDelete__Group__4__Impl rule__ReDelete__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:3131:1: rule__ReDelete__Group__4__Impl : ( ( rule__ReDelete__Group_4__0 )? ) ;
    public final void rule__ReDelete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3135:1: ( ( ( rule__ReDelete__Group_4__0 )? ) )
            // InternalRest.g:3136:1: ( ( rule__ReDelete__Group_4__0 )? )
            {
            // InternalRest.g:3136:1: ( ( rule__ReDelete__Group_4__0 )? )
            // InternalRest.g:3137:2: ( rule__ReDelete__Group_4__0 )?
            {
             before(grammarAccess.getReDeleteAccess().getGroup_4()); 
            // InternalRest.g:3138:2: ( rule__ReDelete__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRest.g:3138:3: rule__ReDelete__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReDelete__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReDeleteAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRest.g:3146:1: rule__ReDelete__Group__5 : rule__ReDelete__Group__5__Impl rule__ReDelete__Group__6 ;
    public final void rule__ReDelete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3150:1: ( rule__ReDelete__Group__5__Impl rule__ReDelete__Group__6 )
            // InternalRest.g:3151:2: rule__ReDelete__Group__5__Impl rule__ReDelete__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalRest.g:3158:1: rule__ReDelete__Group__5__Impl : ( ( rule__ReDelete__Group_5__0 )? ) ;
    public final void rule__ReDelete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3162:1: ( ( ( rule__ReDelete__Group_5__0 )? ) )
            // InternalRest.g:3163:1: ( ( rule__ReDelete__Group_5__0 )? )
            {
            // InternalRest.g:3163:1: ( ( rule__ReDelete__Group_5__0 )? )
            // InternalRest.g:3164:2: ( rule__ReDelete__Group_5__0 )?
            {
             before(grammarAccess.getReDeleteAccess().getGroup_5()); 
            // InternalRest.g:3165:2: ( rule__ReDelete__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRest.g:3165:3: rule__ReDelete__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReDelete__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReDeleteAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalRest.g:3173:1: rule__ReDelete__Group__6 : rule__ReDelete__Group__6__Impl ;
    public final void rule__ReDelete__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3177:1: ( rule__ReDelete__Group__6__Impl )
            // InternalRest.g:3178:2: rule__ReDelete__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalRest.g:3184:1: rule__ReDelete__Group__6__Impl : ( '}' ) ;
    public final void rule__ReDelete__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3188:1: ( ( '}' ) )
            // InternalRest.g:3189:1: ( '}' )
            {
            // InternalRest.g:3189:1: ( '}' )
            // InternalRest.g:3190:2: '}'
            {
             before(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReDelete__Group_4__0"
    // InternalRest.g:3200:1: rule__ReDelete__Group_4__0 : rule__ReDelete__Group_4__0__Impl rule__ReDelete__Group_4__1 ;
    public final void rule__ReDelete__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3204:1: ( rule__ReDelete__Group_4__0__Impl rule__ReDelete__Group_4__1 )
            // InternalRest.g:3205:2: rule__ReDelete__Group_4__0__Impl rule__ReDelete__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ReDelete__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__0"


    // $ANTLR start "rule__ReDelete__Group_4__0__Impl"
    // InternalRest.g:3212:1: rule__ReDelete__Group_4__0__Impl : ( 'data' ) ;
    public final void rule__ReDelete__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3216:1: ( ( 'data' ) )
            // InternalRest.g:3217:1: ( 'data' )
            {
            // InternalRest.g:3217:1: ( 'data' )
            // InternalRest.g:3218:2: 'data'
            {
             before(grammarAccess.getReDeleteAccess().getDataKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getDataKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_4__1"
    // InternalRest.g:3227:1: rule__ReDelete__Group_4__1 : rule__ReDelete__Group_4__1__Impl rule__ReDelete__Group_4__2 ;
    public final void rule__ReDelete__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3231:1: ( rule__ReDelete__Group_4__1__Impl rule__ReDelete__Group_4__2 )
            // InternalRest.g:3232:2: rule__ReDelete__Group_4__1__Impl rule__ReDelete__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__ReDelete__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__1"


    // $ANTLR start "rule__ReDelete__Group_4__1__Impl"
    // InternalRest.g:3239:1: rule__ReDelete__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ReDelete__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3243:1: ( ( '{' ) )
            // InternalRest.g:3244:1: ( '{' )
            {
            // InternalRest.g:3244:1: ( '{' )
            // InternalRest.g:3245:2: '{'
            {
             before(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__1__Impl"


    // $ANTLR start "rule__ReDelete__Group_4__2"
    // InternalRest.g:3254:1: rule__ReDelete__Group_4__2 : rule__ReDelete__Group_4__2__Impl rule__ReDelete__Group_4__3 ;
    public final void rule__ReDelete__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3258:1: ( rule__ReDelete__Group_4__2__Impl rule__ReDelete__Group_4__3 )
            // InternalRest.g:3259:2: rule__ReDelete__Group_4__2__Impl rule__ReDelete__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__ReDelete__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__2"


    // $ANTLR start "rule__ReDelete__Group_4__2__Impl"
    // InternalRest.g:3266:1: rule__ReDelete__Group_4__2__Impl : ( ( rule__ReDelete__DataAssignment_4_2 ) ) ;
    public final void rule__ReDelete__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3270:1: ( ( ( rule__ReDelete__DataAssignment_4_2 ) ) )
            // InternalRest.g:3271:1: ( ( rule__ReDelete__DataAssignment_4_2 ) )
            {
            // InternalRest.g:3271:1: ( ( rule__ReDelete__DataAssignment_4_2 ) )
            // InternalRest.g:3272:2: ( rule__ReDelete__DataAssignment_4_2 )
            {
             before(grammarAccess.getReDeleteAccess().getDataAssignment_4_2()); 
            // InternalRest.g:3273:2: ( rule__ReDelete__DataAssignment_4_2 )
            // InternalRest.g:3273:3: rule__ReDelete__DataAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__DataAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getDataAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__2__Impl"


    // $ANTLR start "rule__ReDelete__Group_4__3"
    // InternalRest.g:3281:1: rule__ReDelete__Group_4__3 : rule__ReDelete__Group_4__3__Impl rule__ReDelete__Group_4__4 ;
    public final void rule__ReDelete__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3285:1: ( rule__ReDelete__Group_4__3__Impl rule__ReDelete__Group_4__4 )
            // InternalRest.g:3286:2: rule__ReDelete__Group_4__3__Impl rule__ReDelete__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__ReDelete__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__3"


    // $ANTLR start "rule__ReDelete__Group_4__3__Impl"
    // InternalRest.g:3293:1: rule__ReDelete__Group_4__3__Impl : ( ( rule__ReDelete__Group_4_3__0 )* ) ;
    public final void rule__ReDelete__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3297:1: ( ( ( rule__ReDelete__Group_4_3__0 )* ) )
            // InternalRest.g:3298:1: ( ( rule__ReDelete__Group_4_3__0 )* )
            {
            // InternalRest.g:3298:1: ( ( rule__ReDelete__Group_4_3__0 )* )
            // InternalRest.g:3299:2: ( rule__ReDelete__Group_4_3__0 )*
            {
             before(grammarAccess.getReDeleteAccess().getGroup_4_3()); 
            // InternalRest.g:3300:2: ( rule__ReDelete__Group_4_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRest.g:3300:3: rule__ReDelete__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReDelete__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getReDeleteAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__3__Impl"


    // $ANTLR start "rule__ReDelete__Group_4__4"
    // InternalRest.g:3308:1: rule__ReDelete__Group_4__4 : rule__ReDelete__Group_4__4__Impl ;
    public final void rule__ReDelete__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3312:1: ( rule__ReDelete__Group_4__4__Impl )
            // InternalRest.g:3313:2: rule__ReDelete__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__4"


    // $ANTLR start "rule__ReDelete__Group_4__4__Impl"
    // InternalRest.g:3319:1: rule__ReDelete__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ReDelete__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3323:1: ( ( '}' ) )
            // InternalRest.g:3324:1: ( '}' )
            {
            // InternalRest.g:3324:1: ( '}' )
            // InternalRest.g:3325:2: '}'
            {
             before(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4__4__Impl"


    // $ANTLR start "rule__ReDelete__Group_4_3__0"
    // InternalRest.g:3335:1: rule__ReDelete__Group_4_3__0 : rule__ReDelete__Group_4_3__0__Impl rule__ReDelete__Group_4_3__1 ;
    public final void rule__ReDelete__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3339:1: ( rule__ReDelete__Group_4_3__0__Impl rule__ReDelete__Group_4_3__1 )
            // InternalRest.g:3340:2: rule__ReDelete__Group_4_3__0__Impl rule__ReDelete__Group_4_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ReDelete__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4_3__0"


    // $ANTLR start "rule__ReDelete__Group_4_3__0__Impl"
    // InternalRest.g:3347:1: rule__ReDelete__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ReDelete__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3351:1: ( ( ',' ) )
            // InternalRest.g:3352:1: ( ',' )
            {
            // InternalRest.g:3352:1: ( ',' )
            // InternalRest.g:3353:2: ','
            {
             before(grammarAccess.getReDeleteAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4_3__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_4_3__1"
    // InternalRest.g:3362:1: rule__ReDelete__Group_4_3__1 : rule__ReDelete__Group_4_3__1__Impl ;
    public final void rule__ReDelete__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3366:1: ( rule__ReDelete__Group_4_3__1__Impl )
            // InternalRest.g:3367:2: rule__ReDelete__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4_3__1"


    // $ANTLR start "rule__ReDelete__Group_4_3__1__Impl"
    // InternalRest.g:3373:1: rule__ReDelete__Group_4_3__1__Impl : ( ( rule__ReDelete__DataAssignment_4_3_1 ) ) ;
    public final void rule__ReDelete__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3377:1: ( ( ( rule__ReDelete__DataAssignment_4_3_1 ) ) )
            // InternalRest.g:3378:1: ( ( rule__ReDelete__DataAssignment_4_3_1 ) )
            {
            // InternalRest.g:3378:1: ( ( rule__ReDelete__DataAssignment_4_3_1 ) )
            // InternalRest.g:3379:2: ( rule__ReDelete__DataAssignment_4_3_1 )
            {
             before(grammarAccess.getReDeleteAccess().getDataAssignment_4_3_1()); 
            // InternalRest.g:3380:2: ( rule__ReDelete__DataAssignment_4_3_1 )
            // InternalRest.g:3380:3: rule__ReDelete__DataAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__DataAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getDataAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_4_3__1__Impl"


    // $ANTLR start "rule__ReDelete__Group_5__0"
    // InternalRest.g:3389:1: rule__ReDelete__Group_5__0 : rule__ReDelete__Group_5__0__Impl rule__ReDelete__Group_5__1 ;
    public final void rule__ReDelete__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3393:1: ( rule__ReDelete__Group_5__0__Impl rule__ReDelete__Group_5__1 )
            // InternalRest.g:3394:2: rule__ReDelete__Group_5__0__Impl rule__ReDelete__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ReDelete__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__0"


    // $ANTLR start "rule__ReDelete__Group_5__0__Impl"
    // InternalRest.g:3401:1: rule__ReDelete__Group_5__0__Impl : ( 'ops' ) ;
    public final void rule__ReDelete__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3405:1: ( ( 'ops' ) )
            // InternalRest.g:3406:1: ( 'ops' )
            {
            // InternalRest.g:3406:1: ( 'ops' )
            // InternalRest.g:3407:2: 'ops'
            {
             before(grammarAccess.getReDeleteAccess().getOpsKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getOpsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_5__1"
    // InternalRest.g:3416:1: rule__ReDelete__Group_5__1 : rule__ReDelete__Group_5__1__Impl rule__ReDelete__Group_5__2 ;
    public final void rule__ReDelete__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3420:1: ( rule__ReDelete__Group_5__1__Impl rule__ReDelete__Group_5__2 )
            // InternalRest.g:3421:2: rule__ReDelete__Group_5__1__Impl rule__ReDelete__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__ReDelete__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__1"


    // $ANTLR start "rule__ReDelete__Group_5__1__Impl"
    // InternalRest.g:3428:1: rule__ReDelete__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ReDelete__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3432:1: ( ( '{' ) )
            // InternalRest.g:3433:1: ( '{' )
            {
            // InternalRest.g:3433:1: ( '{' )
            // InternalRest.g:3434:2: '{'
            {
             before(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__1__Impl"


    // $ANTLR start "rule__ReDelete__Group_5__2"
    // InternalRest.g:3443:1: rule__ReDelete__Group_5__2 : rule__ReDelete__Group_5__2__Impl rule__ReDelete__Group_5__3 ;
    public final void rule__ReDelete__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3447:1: ( rule__ReDelete__Group_5__2__Impl rule__ReDelete__Group_5__3 )
            // InternalRest.g:3448:2: rule__ReDelete__Group_5__2__Impl rule__ReDelete__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__ReDelete__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__2"


    // $ANTLR start "rule__ReDelete__Group_5__2__Impl"
    // InternalRest.g:3455:1: rule__ReDelete__Group_5__2__Impl : ( ( rule__ReDelete__OpsAssignment_5_2 ) ) ;
    public final void rule__ReDelete__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3459:1: ( ( ( rule__ReDelete__OpsAssignment_5_2 ) ) )
            // InternalRest.g:3460:1: ( ( rule__ReDelete__OpsAssignment_5_2 ) )
            {
            // InternalRest.g:3460:1: ( ( rule__ReDelete__OpsAssignment_5_2 ) )
            // InternalRest.g:3461:2: ( rule__ReDelete__OpsAssignment_5_2 )
            {
             before(grammarAccess.getReDeleteAccess().getOpsAssignment_5_2()); 
            // InternalRest.g:3462:2: ( rule__ReDelete__OpsAssignment_5_2 )
            // InternalRest.g:3462:3: rule__ReDelete__OpsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__OpsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getOpsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__2__Impl"


    // $ANTLR start "rule__ReDelete__Group_5__3"
    // InternalRest.g:3470:1: rule__ReDelete__Group_5__3 : rule__ReDelete__Group_5__3__Impl rule__ReDelete__Group_5__4 ;
    public final void rule__ReDelete__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3474:1: ( rule__ReDelete__Group_5__3__Impl rule__ReDelete__Group_5__4 )
            // InternalRest.g:3475:2: rule__ReDelete__Group_5__3__Impl rule__ReDelete__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__ReDelete__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__3"


    // $ANTLR start "rule__ReDelete__Group_5__3__Impl"
    // InternalRest.g:3482:1: rule__ReDelete__Group_5__3__Impl : ( ( rule__ReDelete__Group_5_3__0 )* ) ;
    public final void rule__ReDelete__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3486:1: ( ( ( rule__ReDelete__Group_5_3__0 )* ) )
            // InternalRest.g:3487:1: ( ( rule__ReDelete__Group_5_3__0 )* )
            {
            // InternalRest.g:3487:1: ( ( rule__ReDelete__Group_5_3__0 )* )
            // InternalRest.g:3488:2: ( rule__ReDelete__Group_5_3__0 )*
            {
             before(grammarAccess.getReDeleteAccess().getGroup_5_3()); 
            // InternalRest.g:3489:2: ( rule__ReDelete__Group_5_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRest.g:3489:3: rule__ReDelete__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReDelete__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getReDeleteAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__3__Impl"


    // $ANTLR start "rule__ReDelete__Group_5__4"
    // InternalRest.g:3497:1: rule__ReDelete__Group_5__4 : rule__ReDelete__Group_5__4__Impl ;
    public final void rule__ReDelete__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3501:1: ( rule__ReDelete__Group_5__4__Impl )
            // InternalRest.g:3502:2: rule__ReDelete__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__4"


    // $ANTLR start "rule__ReDelete__Group_5__4__Impl"
    // InternalRest.g:3508:1: rule__ReDelete__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ReDelete__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3512:1: ( ( '}' ) )
            // InternalRest.g:3513:1: ( '}' )
            {
            // InternalRest.g:3513:1: ( '}' )
            // InternalRest.g:3514:2: '}'
            {
             before(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5__4__Impl"


    // $ANTLR start "rule__ReDelete__Group_5_3__0"
    // InternalRest.g:3524:1: rule__ReDelete__Group_5_3__0 : rule__ReDelete__Group_5_3__0__Impl rule__ReDelete__Group_5_3__1 ;
    public final void rule__ReDelete__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3528:1: ( rule__ReDelete__Group_5_3__0__Impl rule__ReDelete__Group_5_3__1 )
            // InternalRest.g:3529:2: rule__ReDelete__Group_5_3__0__Impl rule__ReDelete__Group_5_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ReDelete__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5_3__0"


    // $ANTLR start "rule__ReDelete__Group_5_3__0__Impl"
    // InternalRest.g:3536:1: rule__ReDelete__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ReDelete__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3540:1: ( ( ',' ) )
            // InternalRest.g:3541:1: ( ',' )
            {
            // InternalRest.g:3541:1: ( ',' )
            // InternalRest.g:3542:2: ','
            {
             before(grammarAccess.getReDeleteAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReDeleteAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5_3__0__Impl"


    // $ANTLR start "rule__ReDelete__Group_5_3__1"
    // InternalRest.g:3551:1: rule__ReDelete__Group_5_3__1 : rule__ReDelete__Group_5_3__1__Impl ;
    public final void rule__ReDelete__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3555:1: ( rule__ReDelete__Group_5_3__1__Impl )
            // InternalRest.g:3556:2: rule__ReDelete__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5_3__1"


    // $ANTLR start "rule__ReDelete__Group_5_3__1__Impl"
    // InternalRest.g:3562:1: rule__ReDelete__Group_5_3__1__Impl : ( ( rule__ReDelete__OpsAssignment_5_3_1 ) ) ;
    public final void rule__ReDelete__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3566:1: ( ( ( rule__ReDelete__OpsAssignment_5_3_1 ) ) )
            // InternalRest.g:3567:1: ( ( rule__ReDelete__OpsAssignment_5_3_1 ) )
            {
            // InternalRest.g:3567:1: ( ( rule__ReDelete__OpsAssignment_5_3_1 ) )
            // InternalRest.g:3568:2: ( rule__ReDelete__OpsAssignment_5_3_1 )
            {
             before(grammarAccess.getReDeleteAccess().getOpsAssignment_5_3_1()); 
            // InternalRest.g:3569:2: ( rule__ReDelete__OpsAssignment_5_3_1 )
            // InternalRest.g:3569:3: rule__ReDelete__OpsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReDelete__OpsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReDeleteAccess().getOpsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__Group_5_3__1__Impl"


    // $ANTLR start "rule__Segment__Group__0"
    // InternalRest.g:3578:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3582:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // InternalRest.g:3583:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRest.g:3590:1: rule__Segment__Group__0__Impl : ( () ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3594:1: ( ( () ) )
            // InternalRest.g:3595:1: ( () )
            {
            // InternalRest.g:3595:1: ( () )
            // InternalRest.g:3596:2: ()
            {
             before(grammarAccess.getSegmentAccess().getSegmentAction_0()); 
            // InternalRest.g:3597:2: ()
            // InternalRest.g:3597:3: 
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
    // InternalRest.g:3605:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3609:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // InternalRest.g:3610:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
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
    // InternalRest.g:3617:1: rule__Segment__Group__1__Impl : ( 'Segment' ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3621:1: ( ( 'Segment' ) )
            // InternalRest.g:3622:1: ( 'Segment' )
            {
            // InternalRest.g:3622:1: ( 'Segment' )
            // InternalRest.g:3623:2: 'Segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRest.g:3632:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3636:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // InternalRest.g:3637:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRest.g:3644:1: rule__Segment__Group__2__Impl : ( '{' ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3648:1: ( ( '{' ) )
            // InternalRest.g:3649:1: ( '{' )
            {
            // InternalRest.g:3649:1: ( '{' )
            // InternalRest.g:3650:2: '{'
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
    // InternalRest.g:3659:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3663:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // InternalRest.g:3664:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRest.g:3671:1: rule__Segment__Group__3__Impl : ( ( rule__Segment__Group_3__0 )? ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3675:1: ( ( ( rule__Segment__Group_3__0 )? ) )
            // InternalRest.g:3676:1: ( ( rule__Segment__Group_3__0 )? )
            {
            // InternalRest.g:3676:1: ( ( rule__Segment__Group_3__0 )? )
            // InternalRest.g:3677:2: ( rule__Segment__Group_3__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_3()); 
            // InternalRest.g:3678:2: ( rule__Segment__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRest.g:3678:3: rule__Segment__Group_3__0
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
    // InternalRest.g:3686:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3690:1: ( rule__Segment__Group__4__Impl )
            // InternalRest.g:3691:2: rule__Segment__Group__4__Impl
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
    // InternalRest.g:3697:1: rule__Segment__Group__4__Impl : ( '}' ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3701:1: ( ( '}' ) )
            // InternalRest.g:3702:1: ( '}' )
            {
            // InternalRest.g:3702:1: ( '}' )
            // InternalRest.g:3703:2: '}'
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
    // InternalRest.g:3713:1: rule__Segment__Group_3__0 : rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1 ;
    public final void rule__Segment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3717:1: ( rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1 )
            // InternalRest.g:3718:2: rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:3725:1: rule__Segment__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__Segment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3729:1: ( ( 'value' ) )
            // InternalRest.g:3730:1: ( 'value' )
            {
            // InternalRest.g:3730:1: ( 'value' )
            // InternalRest.g:3731:2: 'value'
            {
             before(grammarAccess.getSegmentAccess().getValueKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRest.g:3740:1: rule__Segment__Group_3__1 : rule__Segment__Group_3__1__Impl ;
    public final void rule__Segment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3744:1: ( rule__Segment__Group_3__1__Impl )
            // InternalRest.g:3745:2: rule__Segment__Group_3__1__Impl
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
    // InternalRest.g:3751:1: rule__Segment__Group_3__1__Impl : ( ( rule__Segment__ValueAssignment_3_1 ) ) ;
    public final void rule__Segment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3755:1: ( ( ( rule__Segment__ValueAssignment_3_1 ) ) )
            // InternalRest.g:3756:1: ( ( rule__Segment__ValueAssignment_3_1 ) )
            {
            // InternalRest.g:3756:1: ( ( rule__Segment__ValueAssignment_3_1 ) )
            // InternalRest.g:3757:2: ( rule__Segment__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSegmentAccess().getValueAssignment_3_1()); 
            // InternalRest.g:3758:2: ( rule__Segment__ValueAssignment_3_1 )
            // InternalRest.g:3758:3: rule__Segment__ValueAssignment_3_1
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
    // InternalRest.g:3767:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3771:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalRest.g:3772:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalRest.g:3779:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3783:1: ( ( () ) )
            // InternalRest.g:3784:1: ( () )
            {
            // InternalRest.g:3784:1: ( () )
            // InternalRest.g:3785:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalRest.g:3786:2: ()
            // InternalRest.g:3786:3: 
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
    // InternalRest.g:3794:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3798:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalRest.g:3799:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:3806:1: rule__Parameter__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3810:1: ( ( 'Parameter' ) )
            // InternalRest.g:3811:1: ( 'Parameter' )
            {
            // InternalRest.g:3811:1: ( 'Parameter' )
            // InternalRest.g:3812:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRest.g:3821:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3825:1: ( rule__Parameter__Group__2__Impl )
            // InternalRest.g:3826:2: rule__Parameter__Group__2__Impl
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
    // InternalRest.g:3832:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3836:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalRest.g:3837:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalRest.g:3837:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalRest.g:3838:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalRest.g:3839:2: ( rule__Parameter__NameAssignment_2 )
            // InternalRest.g:3839:3: rule__Parameter__NameAssignment_2
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
    // InternalRest.g:3848:1: rule__Attachments__Group__0 : rule__Attachments__Group__0__Impl rule__Attachments__Group__1 ;
    public final void rule__Attachments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3852:1: ( rule__Attachments__Group__0__Impl rule__Attachments__Group__1 )
            // InternalRest.g:3853:2: rule__Attachments__Group__0__Impl rule__Attachments__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRest.g:3860:1: rule__Attachments__Group__0__Impl : ( () ) ;
    public final void rule__Attachments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3864:1: ( ( () ) )
            // InternalRest.g:3865:1: ( () )
            {
            // InternalRest.g:3865:1: ( () )
            // InternalRest.g:3866:2: ()
            {
             before(grammarAccess.getAttachmentsAccess().getAttachmentsAction_0()); 
            // InternalRest.g:3867:2: ()
            // InternalRest.g:3867:3: 
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
    // InternalRest.g:3875:1: rule__Attachments__Group__1 : rule__Attachments__Group__1__Impl rule__Attachments__Group__2 ;
    public final void rule__Attachments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3879:1: ( rule__Attachments__Group__1__Impl rule__Attachments__Group__2 )
            // InternalRest.g:3880:2: rule__Attachments__Group__1__Impl rule__Attachments__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:3887:1: rule__Attachments__Group__1__Impl : ( 'Attachments' ) ;
    public final void rule__Attachments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3891:1: ( ( 'Attachments' ) )
            // InternalRest.g:3892:1: ( 'Attachments' )
            {
            // InternalRest.g:3892:1: ( 'Attachments' )
            // InternalRest.g:3893:2: 'Attachments'
            {
             before(grammarAccess.getAttachmentsAccess().getAttachmentsKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRest.g:3902:1: rule__Attachments__Group__2 : rule__Attachments__Group__2__Impl ;
    public final void rule__Attachments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3906:1: ( rule__Attachments__Group__2__Impl )
            // InternalRest.g:3907:2: rule__Attachments__Group__2__Impl
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
    // InternalRest.g:3913:1: rule__Attachments__Group__2__Impl : ( ( rule__Attachments__NameAssignment_2 ) ) ;
    public final void rule__Attachments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3917:1: ( ( ( rule__Attachments__NameAssignment_2 ) ) )
            // InternalRest.g:3918:1: ( ( rule__Attachments__NameAssignment_2 ) )
            {
            // InternalRest.g:3918:1: ( ( rule__Attachments__NameAssignment_2 ) )
            // InternalRest.g:3919:2: ( rule__Attachments__NameAssignment_2 )
            {
             before(grammarAccess.getAttachmentsAccess().getNameAssignment_2()); 
            // InternalRest.g:3920:2: ( rule__Attachments__NameAssignment_2 )
            // InternalRest.g:3920:3: rule__Attachments__NameAssignment_2
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
    // InternalRest.g:3929:1: rule__Random__Group__0 : rule__Random__Group__0__Impl rule__Random__Group__1 ;
    public final void rule__Random__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3933:1: ( rule__Random__Group__0__Impl rule__Random__Group__1 )
            // InternalRest.g:3934:2: rule__Random__Group__0__Impl rule__Random__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalRest.g:3941:1: rule__Random__Group__0__Impl : ( () ) ;
    public final void rule__Random__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3945:1: ( ( () ) )
            // InternalRest.g:3946:1: ( () )
            {
            // InternalRest.g:3946:1: ( () )
            // InternalRest.g:3947:2: ()
            {
             before(grammarAccess.getRandomAccess().getRandomAction_0()); 
            // InternalRest.g:3948:2: ()
            // InternalRest.g:3948:3: 
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
    // InternalRest.g:3956:1: rule__Random__Group__1 : rule__Random__Group__1__Impl rule__Random__Group__2 ;
    public final void rule__Random__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3960:1: ( rule__Random__Group__1__Impl rule__Random__Group__2 )
            // InternalRest.g:3961:2: rule__Random__Group__1__Impl rule__Random__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:3968:1: rule__Random__Group__1__Impl : ( 'Random' ) ;
    public final void rule__Random__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3972:1: ( ( 'Random' ) )
            // InternalRest.g:3973:1: ( 'Random' )
            {
            // InternalRest.g:3973:1: ( 'Random' )
            // InternalRest.g:3974:2: 'Random'
            {
             before(grammarAccess.getRandomAccess().getRandomKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRest.g:3983:1: rule__Random__Group__2 : rule__Random__Group__2__Impl ;
    public final void rule__Random__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3987:1: ( rule__Random__Group__2__Impl )
            // InternalRest.g:3988:2: rule__Random__Group__2__Impl
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
    // InternalRest.g:3994:1: rule__Random__Group__2__Impl : ( ( rule__Random__NameAssignment_2 ) ) ;
    public final void rule__Random__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:3998:1: ( ( ( rule__Random__NameAssignment_2 ) ) )
            // InternalRest.g:3999:1: ( ( rule__Random__NameAssignment_2 ) )
            {
            // InternalRest.g:3999:1: ( ( rule__Random__NameAssignment_2 ) )
            // InternalRest.g:4000:2: ( rule__Random__NameAssignment_2 )
            {
             before(grammarAccess.getRandomAccess().getNameAssignment_2()); 
            // InternalRest.g:4001:2: ( rule__Random__NameAssignment_2 )
            // InternalRest.g:4001:3: rule__Random__NameAssignment_2
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


    // $ANTLR start "rule__Answer__Group__0"
    // InternalRest.g:4010:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4014:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // InternalRest.g:4015:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalRest.g:4022:1: rule__Answer__Group__0__Impl : ( () ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4026:1: ( ( () ) )
            // InternalRest.g:4027:1: ( () )
            {
            // InternalRest.g:4027:1: ( () )
            // InternalRest.g:4028:2: ()
            {
             before(grammarAccess.getAnswerAccess().getAnswerAction_0()); 
            // InternalRest.g:4029:2: ()
            // InternalRest.g:4029:3: 
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
    // InternalRest.g:4037:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4041:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // InternalRest.g:4042:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
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
    // InternalRest.g:4049:1: rule__Answer__Group__1__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4053:1: ( ( 'Answer' ) )
            // InternalRest.g:4054:1: ( 'Answer' )
            {
            // InternalRest.g:4054:1: ( 'Answer' )
            // InternalRest.g:4055:2: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRest.g:4064:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4068:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // InternalRest.g:4069:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:4076:1: rule__Answer__Group__2__Impl : ( '{' ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4080:1: ( ( '{' ) )
            // InternalRest.g:4081:1: ( '{' )
            {
            // InternalRest.g:4081:1: ( '{' )
            // InternalRest.g:4082:2: '{'
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
    // InternalRest.g:4091:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl rule__Answer__Group__4 ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4095:1: ( rule__Answer__Group__3__Impl rule__Answer__Group__4 )
            // InternalRest.g:4096:2: rule__Answer__Group__3__Impl rule__Answer__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:4103:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__Group_3__0 )? ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4107:1: ( ( ( rule__Answer__Group_3__0 )? ) )
            // InternalRest.g:4108:1: ( ( rule__Answer__Group_3__0 )? )
            {
            // InternalRest.g:4108:1: ( ( rule__Answer__Group_3__0 )? )
            // InternalRest.g:4109:2: ( rule__Answer__Group_3__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_3()); 
            // InternalRest.g:4110:2: ( rule__Answer__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRest.g:4110:3: rule__Answer__Group_3__0
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
    // InternalRest.g:4118:1: rule__Answer__Group__4 : rule__Answer__Group__4__Impl rule__Answer__Group__5 ;
    public final void rule__Answer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4122:1: ( rule__Answer__Group__4__Impl rule__Answer__Group__5 )
            // InternalRest.g:4123:2: rule__Answer__Group__4__Impl rule__Answer__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalRest.g:4130:1: rule__Answer__Group__4__Impl : ( ( rule__Answer__Group_4__0 )? ) ;
    public final void rule__Answer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4134:1: ( ( ( rule__Answer__Group_4__0 )? ) )
            // InternalRest.g:4135:1: ( ( rule__Answer__Group_4__0 )? )
            {
            // InternalRest.g:4135:1: ( ( rule__Answer__Group_4__0 )? )
            // InternalRest.g:4136:2: ( rule__Answer__Group_4__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_4()); 
            // InternalRest.g:4137:2: ( rule__Answer__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRest.g:4137:3: rule__Answer__Group_4__0
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
    // InternalRest.g:4145:1: rule__Answer__Group__5 : rule__Answer__Group__5__Impl ;
    public final void rule__Answer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4149:1: ( rule__Answer__Group__5__Impl )
            // InternalRest.g:4150:2: rule__Answer__Group__5__Impl
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
    // InternalRest.g:4156:1: rule__Answer__Group__5__Impl : ( '}' ) ;
    public final void rule__Answer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4160:1: ( ( '}' ) )
            // InternalRest.g:4161:1: ( '}' )
            {
            // InternalRest.g:4161:1: ( '}' )
            // InternalRest.g:4162:2: '}'
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
    // InternalRest.g:4172:1: rule__Answer__Group_3__0 : rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 ;
    public final void rule__Answer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4176:1: ( rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 )
            // InternalRest.g:4177:2: rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRest.g:4184:1: rule__Answer__Group_3__0__Impl : ( 'status' ) ;
    public final void rule__Answer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4188:1: ( ( 'status' ) )
            // InternalRest.g:4189:1: ( 'status' )
            {
            // InternalRest.g:4189:1: ( 'status' )
            // InternalRest.g:4190:2: 'status'
            {
             before(grammarAccess.getAnswerAccess().getStatusKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRest.g:4199:1: rule__Answer__Group_3__1 : rule__Answer__Group_3__1__Impl ;
    public final void rule__Answer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4203:1: ( rule__Answer__Group_3__1__Impl )
            // InternalRest.g:4204:2: rule__Answer__Group_3__1__Impl
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
    // InternalRest.g:4210:1: rule__Answer__Group_3__1__Impl : ( ( rule__Answer__StatusAssignment_3_1 ) ) ;
    public final void rule__Answer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4214:1: ( ( ( rule__Answer__StatusAssignment_3_1 ) ) )
            // InternalRest.g:4215:1: ( ( rule__Answer__StatusAssignment_3_1 ) )
            {
            // InternalRest.g:4215:1: ( ( rule__Answer__StatusAssignment_3_1 ) )
            // InternalRest.g:4216:2: ( rule__Answer__StatusAssignment_3_1 )
            {
             before(grammarAccess.getAnswerAccess().getStatusAssignment_3_1()); 
            // InternalRest.g:4217:2: ( rule__Answer__StatusAssignment_3_1 )
            // InternalRest.g:4217:3: rule__Answer__StatusAssignment_3_1
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
    // InternalRest.g:4226:1: rule__Answer__Group_4__0 : rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1 ;
    public final void rule__Answer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4230:1: ( rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1 )
            // InternalRest.g:4231:2: rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:4238:1: rule__Answer__Group_4__0__Impl : ( 'return' ) ;
    public final void rule__Answer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4242:1: ( ( 'return' ) )
            // InternalRest.g:4243:1: ( 'return' )
            {
            // InternalRest.g:4243:1: ( 'return' )
            // InternalRest.g:4244:2: 'return'
            {
             before(grammarAccess.getAnswerAccess().getReturnKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRest.g:4253:1: rule__Answer__Group_4__1 : rule__Answer__Group_4__1__Impl ;
    public final void rule__Answer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4257:1: ( rule__Answer__Group_4__1__Impl )
            // InternalRest.g:4258:2: rule__Answer__Group_4__1__Impl
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
    // InternalRest.g:4264:1: rule__Answer__Group_4__1__Impl : ( ( rule__Answer__ReturnAssignment_4_1 ) ) ;
    public final void rule__Answer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4268:1: ( ( ( rule__Answer__ReturnAssignment_4_1 ) ) )
            // InternalRest.g:4269:1: ( ( rule__Answer__ReturnAssignment_4_1 ) )
            {
            // InternalRest.g:4269:1: ( ( rule__Answer__ReturnAssignment_4_1 ) )
            // InternalRest.g:4270:2: ( rule__Answer__ReturnAssignment_4_1 )
            {
             before(grammarAccess.getAnswerAccess().getReturnAssignment_4_1()); 
            // InternalRest.g:4271:2: ( rule__Answer__ReturnAssignment_4_1 )
            // InternalRest.g:4271:3: rule__Answer__ReturnAssignment_4_1
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


    // $ANTLR start "rule__Struct__Group__0"
    // InternalRest.g:4280:1: rule__Struct__Group__0 : rule__Struct__Group__0__Impl rule__Struct__Group__1 ;
    public final void rule__Struct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4284:1: ( rule__Struct__Group__0__Impl rule__Struct__Group__1 )
            // InternalRest.g:4285:2: rule__Struct__Group__0__Impl rule__Struct__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRest.g:4292:1: rule__Struct__Group__0__Impl : ( () ) ;
    public final void rule__Struct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4296:1: ( ( () ) )
            // InternalRest.g:4297:1: ( () )
            {
            // InternalRest.g:4297:1: ( () )
            // InternalRest.g:4298:2: ()
            {
             before(grammarAccess.getStructAccess().getStructAction_0()); 
            // InternalRest.g:4299:2: ()
            // InternalRest.g:4299:3: 
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
    // InternalRest.g:4307:1: rule__Struct__Group__1 : rule__Struct__Group__1__Impl rule__Struct__Group__2 ;
    public final void rule__Struct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4311:1: ( rule__Struct__Group__1__Impl rule__Struct__Group__2 )
            // InternalRest.g:4312:2: rule__Struct__Group__1__Impl rule__Struct__Group__2
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
    // InternalRest.g:4319:1: rule__Struct__Group__1__Impl : ( 'Struct' ) ;
    public final void rule__Struct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4323:1: ( ( 'Struct' ) )
            // InternalRest.g:4324:1: ( 'Struct' )
            {
            // InternalRest.g:4324:1: ( 'Struct' )
            // InternalRest.g:4325:2: 'Struct'
            {
             before(grammarAccess.getStructAccess().getStructKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRest.g:4334:1: rule__Struct__Group__2 : rule__Struct__Group__2__Impl rule__Struct__Group__3 ;
    public final void rule__Struct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4338:1: ( rule__Struct__Group__2__Impl rule__Struct__Group__3 )
            // InternalRest.g:4339:2: rule__Struct__Group__2__Impl rule__Struct__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:4346:1: rule__Struct__Group__2__Impl : ( '{' ) ;
    public final void rule__Struct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4350:1: ( ( '{' ) )
            // InternalRest.g:4351:1: ( '{' )
            {
            // InternalRest.g:4351:1: ( '{' )
            // InternalRest.g:4352:2: '{'
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
    // InternalRest.g:4361:1: rule__Struct__Group__3 : rule__Struct__Group__3__Impl rule__Struct__Group__4 ;
    public final void rule__Struct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4365:1: ( rule__Struct__Group__3__Impl rule__Struct__Group__4 )
            // InternalRest.g:4366:2: rule__Struct__Group__3__Impl rule__Struct__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalRest.g:4373:1: rule__Struct__Group__3__Impl : ( ( rule__Struct__Group_3__0 )? ) ;
    public final void rule__Struct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4377:1: ( ( ( rule__Struct__Group_3__0 )? ) )
            // InternalRest.g:4378:1: ( ( rule__Struct__Group_3__0 )? )
            {
            // InternalRest.g:4378:1: ( ( rule__Struct__Group_3__0 )? )
            // InternalRest.g:4379:2: ( rule__Struct__Group_3__0 )?
            {
             before(grammarAccess.getStructAccess().getGroup_3()); 
            // InternalRest.g:4380:2: ( rule__Struct__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRest.g:4380:3: rule__Struct__Group_3__0
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
    // InternalRest.g:4388:1: rule__Struct__Group__4 : rule__Struct__Group__4__Impl ;
    public final void rule__Struct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4392:1: ( rule__Struct__Group__4__Impl )
            // InternalRest.g:4393:2: rule__Struct__Group__4__Impl
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
    // InternalRest.g:4399:1: rule__Struct__Group__4__Impl : ( '}' ) ;
    public final void rule__Struct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4403:1: ( ( '}' ) )
            // InternalRest.g:4404:1: ( '}' )
            {
            // InternalRest.g:4404:1: ( '}' )
            // InternalRest.g:4405:2: '}'
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
    // InternalRest.g:4415:1: rule__Struct__Group_3__0 : rule__Struct__Group_3__0__Impl rule__Struct__Group_3__1 ;
    public final void rule__Struct__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4419:1: ( rule__Struct__Group_3__0__Impl rule__Struct__Group_3__1 )
            // InternalRest.g:4420:2: rule__Struct__Group_3__0__Impl rule__Struct__Group_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:4427:1: rule__Struct__Group_3__0__Impl : ( 'fields' ) ;
    public final void rule__Struct__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4431:1: ( ( 'fields' ) )
            // InternalRest.g:4432:1: ( 'fields' )
            {
            // InternalRest.g:4432:1: ( 'fields' )
            // InternalRest.g:4433:2: 'fields'
            {
             before(grammarAccess.getStructAccess().getFieldsKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRest.g:4442:1: rule__Struct__Group_3__1 : rule__Struct__Group_3__1__Impl ;
    public final void rule__Struct__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4446:1: ( rule__Struct__Group_3__1__Impl )
            // InternalRest.g:4447:2: rule__Struct__Group_3__1__Impl
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
    // InternalRest.g:4453:1: rule__Struct__Group_3__1__Impl : ( ( rule__Struct__FieldsAssignment_3_1 ) ) ;
    public final void rule__Struct__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4457:1: ( ( ( rule__Struct__FieldsAssignment_3_1 ) ) )
            // InternalRest.g:4458:1: ( ( rule__Struct__FieldsAssignment_3_1 ) )
            {
            // InternalRest.g:4458:1: ( ( rule__Struct__FieldsAssignment_3_1 ) )
            // InternalRest.g:4459:2: ( rule__Struct__FieldsAssignment_3_1 )
            {
             before(grammarAccess.getStructAccess().getFieldsAssignment_3_1()); 
            // InternalRest.g:4460:2: ( rule__Struct__FieldsAssignment_3_1 )
            // InternalRest.g:4460:3: rule__Struct__FieldsAssignment_3_1
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


    // $ANTLR start "rule__OpCreate__Group__0"
    // InternalRest.g:4469:1: rule__OpCreate__Group__0 : rule__OpCreate__Group__0__Impl rule__OpCreate__Group__1 ;
    public final void rule__OpCreate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4473:1: ( rule__OpCreate__Group__0__Impl rule__OpCreate__Group__1 )
            // InternalRest.g:4474:2: rule__OpCreate__Group__0__Impl rule__OpCreate__Group__1
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
    // InternalRest.g:4481:1: rule__OpCreate__Group__0__Impl : ( 'OpCreate' ) ;
    public final void rule__OpCreate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4485:1: ( ( 'OpCreate' ) )
            // InternalRest.g:4486:1: ( 'OpCreate' )
            {
            // InternalRest.g:4486:1: ( 'OpCreate' )
            // InternalRest.g:4487:2: 'OpCreate'
            {
             before(grammarAccess.getOpCreateAccess().getOpCreateKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRest.g:4496:1: rule__OpCreate__Group__1 : rule__OpCreate__Group__1__Impl rule__OpCreate__Group__2 ;
    public final void rule__OpCreate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4500:1: ( rule__OpCreate__Group__1__Impl rule__OpCreate__Group__2 )
            // InternalRest.g:4501:2: rule__OpCreate__Group__1__Impl rule__OpCreate__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:4508:1: rule__OpCreate__Group__1__Impl : ( '{' ) ;
    public final void rule__OpCreate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4512:1: ( ( '{' ) )
            // InternalRest.g:4513:1: ( '{' )
            {
            // InternalRest.g:4513:1: ( '{' )
            // InternalRest.g:4514:2: '{'
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
    // InternalRest.g:4523:1: rule__OpCreate__Group__2 : rule__OpCreate__Group__2__Impl rule__OpCreate__Group__3 ;
    public final void rule__OpCreate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4527:1: ( rule__OpCreate__Group__2__Impl rule__OpCreate__Group__3 )
            // InternalRest.g:4528:2: rule__OpCreate__Group__2__Impl rule__OpCreate__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:4535:1: rule__OpCreate__Group__2__Impl : ( ( rule__OpCreate__Group_2__0 )? ) ;
    public final void rule__OpCreate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4539:1: ( ( ( rule__OpCreate__Group_2__0 )? ) )
            // InternalRest.g:4540:1: ( ( rule__OpCreate__Group_2__0 )? )
            {
            // InternalRest.g:4540:1: ( ( rule__OpCreate__Group_2__0 )? )
            // InternalRest.g:4541:2: ( rule__OpCreate__Group_2__0 )?
            {
             before(grammarAccess.getOpCreateAccess().getGroup_2()); 
            // InternalRest.g:4542:2: ( rule__OpCreate__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRest.g:4542:3: rule__OpCreate__Group_2__0
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
    // InternalRest.g:4550:1: rule__OpCreate__Group__3 : rule__OpCreate__Group__3__Impl rule__OpCreate__Group__4 ;
    public final void rule__OpCreate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4554:1: ( rule__OpCreate__Group__3__Impl rule__OpCreate__Group__4 )
            // InternalRest.g:4555:2: rule__OpCreate__Group__3__Impl rule__OpCreate__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:4562:1: rule__OpCreate__Group__3__Impl : ( ( rule__OpCreate__Group_3__0 )? ) ;
    public final void rule__OpCreate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4566:1: ( ( ( rule__OpCreate__Group_3__0 )? ) )
            // InternalRest.g:4567:1: ( ( rule__OpCreate__Group_3__0 )? )
            {
            // InternalRest.g:4567:1: ( ( rule__OpCreate__Group_3__0 )? )
            // InternalRest.g:4568:2: ( rule__OpCreate__Group_3__0 )?
            {
             before(grammarAccess.getOpCreateAccess().getGroup_3()); 
            // InternalRest.g:4569:2: ( rule__OpCreate__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRest.g:4569:3: rule__OpCreate__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpCreate__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpCreateAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalRest.g:4577:1: rule__OpCreate__Group__4 : rule__OpCreate__Group__4__Impl rule__OpCreate__Group__5 ;
    public final void rule__OpCreate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4581:1: ( rule__OpCreate__Group__4__Impl rule__OpCreate__Group__5 )
            // InternalRest.g:4582:2: rule__OpCreate__Group__4__Impl rule__OpCreate__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:4589:1: rule__OpCreate__Group__4__Impl : ( ( rule__OpCreate__Group_4__0 )? ) ;
    public final void rule__OpCreate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4593:1: ( ( ( rule__OpCreate__Group_4__0 )? ) )
            // InternalRest.g:4594:1: ( ( rule__OpCreate__Group_4__0 )? )
            {
            // InternalRest.g:4594:1: ( ( rule__OpCreate__Group_4__0 )? )
            // InternalRest.g:4595:2: ( rule__OpCreate__Group_4__0 )?
            {
             before(grammarAccess.getOpCreateAccess().getGroup_4()); 
            // InternalRest.g:4596:2: ( rule__OpCreate__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRest.g:4596:3: rule__OpCreate__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpCreate__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpCreateAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRest.g:4604:1: rule__OpCreate__Group__5 : rule__OpCreate__Group__5__Impl rule__OpCreate__Group__6 ;
    public final void rule__OpCreate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4608:1: ( rule__OpCreate__Group__5__Impl rule__OpCreate__Group__6 )
            // InternalRest.g:4609:2: rule__OpCreate__Group__5__Impl rule__OpCreate__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalRest.g:4616:1: rule__OpCreate__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpCreate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4620:1: ( ( 'struct' ) )
            // InternalRest.g:4621:1: ( 'struct' )
            {
            // InternalRest.g:4621:1: ( 'struct' )
            // InternalRest.g:4622:2: 'struct'
            {
             before(grammarAccess.getOpCreateAccess().getStructKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRest.g:4631:1: rule__OpCreate__Group__6 : rule__OpCreate__Group__6__Impl rule__OpCreate__Group__7 ;
    public final void rule__OpCreate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4635:1: ( rule__OpCreate__Group__6__Impl rule__OpCreate__Group__7 )
            // InternalRest.g:4636:2: rule__OpCreate__Group__6__Impl rule__OpCreate__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalRest.g:4643:1: rule__OpCreate__Group__6__Impl : ( ( rule__OpCreate__StructAssignment_6 ) ) ;
    public final void rule__OpCreate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4647:1: ( ( ( rule__OpCreate__StructAssignment_6 ) ) )
            // InternalRest.g:4648:1: ( ( rule__OpCreate__StructAssignment_6 ) )
            {
            // InternalRest.g:4648:1: ( ( rule__OpCreate__StructAssignment_6 ) )
            // InternalRest.g:4649:2: ( rule__OpCreate__StructAssignment_6 )
            {
             before(grammarAccess.getOpCreateAccess().getStructAssignment_6()); 
            // InternalRest.g:4650:2: ( rule__OpCreate__StructAssignment_6 )
            // InternalRest.g:4650:3: rule__OpCreate__StructAssignment_6
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
    // InternalRest.g:4658:1: rule__OpCreate__Group__7 : rule__OpCreate__Group__7__Impl rule__OpCreate__Group__8 ;
    public final void rule__OpCreate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4662:1: ( rule__OpCreate__Group__7__Impl rule__OpCreate__Group__8 )
            // InternalRest.g:4663:2: rule__OpCreate__Group__7__Impl rule__OpCreate__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalRest.g:4670:1: rule__OpCreate__Group__7__Impl : ( ( rule__OpCreate__Group_7__0 )? ) ;
    public final void rule__OpCreate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4674:1: ( ( ( rule__OpCreate__Group_7__0 )? ) )
            // InternalRest.g:4675:1: ( ( rule__OpCreate__Group_7__0 )? )
            {
            // InternalRest.g:4675:1: ( ( rule__OpCreate__Group_7__0 )? )
            // InternalRest.g:4676:2: ( rule__OpCreate__Group_7__0 )?
            {
             before(grammarAccess.getOpCreateAccess().getGroup_7()); 
            // InternalRest.g:4677:2: ( rule__OpCreate__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRest.g:4677:3: rule__OpCreate__Group_7__0
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
    // InternalRest.g:4685:1: rule__OpCreate__Group__8 : rule__OpCreate__Group__8__Impl ;
    public final void rule__OpCreate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4689:1: ( rule__OpCreate__Group__8__Impl )
            // InternalRest.g:4690:2: rule__OpCreate__Group__8__Impl
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
    // InternalRest.g:4696:1: rule__OpCreate__Group__8__Impl : ( '}' ) ;
    public final void rule__OpCreate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4700:1: ( ( '}' ) )
            // InternalRest.g:4701:1: ( '}' )
            {
            // InternalRest.g:4701:1: ( '}' )
            // InternalRest.g:4702:2: '}'
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
    // InternalRest.g:4712:1: rule__OpCreate__Group_2__0 : rule__OpCreate__Group_2__0__Impl rule__OpCreate__Group_2__1 ;
    public final void rule__OpCreate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4716:1: ( rule__OpCreate__Group_2__0__Impl rule__OpCreate__Group_2__1 )
            // InternalRest.g:4717:2: rule__OpCreate__Group_2__0__Impl rule__OpCreate__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:4724:1: rule__OpCreate__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpCreate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4728:1: ( ( 'id' ) )
            // InternalRest.g:4729:1: ( 'id' )
            {
            // InternalRest.g:4729:1: ( 'id' )
            // InternalRest.g:4730:2: 'id'
            {
             before(grammarAccess.getOpCreateAccess().getIdKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRest.g:4739:1: rule__OpCreate__Group_2__1 : rule__OpCreate__Group_2__1__Impl ;
    public final void rule__OpCreate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4743:1: ( rule__OpCreate__Group_2__1__Impl )
            // InternalRest.g:4744:2: rule__OpCreate__Group_2__1__Impl
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
    // InternalRest.g:4750:1: rule__OpCreate__Group_2__1__Impl : ( ( rule__OpCreate__IdAssignment_2_1 ) ) ;
    public final void rule__OpCreate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4754:1: ( ( ( rule__OpCreate__IdAssignment_2_1 ) ) )
            // InternalRest.g:4755:1: ( ( rule__OpCreate__IdAssignment_2_1 ) )
            {
            // InternalRest.g:4755:1: ( ( rule__OpCreate__IdAssignment_2_1 ) )
            // InternalRest.g:4756:2: ( rule__OpCreate__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpCreateAccess().getIdAssignment_2_1()); 
            // InternalRest.g:4757:2: ( rule__OpCreate__IdAssignment_2_1 )
            // InternalRest.g:4757:3: rule__OpCreate__IdAssignment_2_1
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


    // $ANTLR start "rule__OpCreate__Group_3__0"
    // InternalRest.g:4766:1: rule__OpCreate__Group_3__0 : rule__OpCreate__Group_3__0__Impl rule__OpCreate__Group_3__1 ;
    public final void rule__OpCreate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4770:1: ( rule__OpCreate__Group_3__0__Impl rule__OpCreate__Group_3__1 )
            // InternalRest.g:4771:2: rule__OpCreate__Group_3__0__Impl rule__OpCreate__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__OpCreate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__Group_3__0"


    // $ANTLR start "rule__OpCreate__Group_3__0__Impl"
    // InternalRest.g:4778:1: rule__OpCreate__Group_3__0__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpCreate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4782:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:4783:1: ( 'failedAnswer' )
            {
            // InternalRest.g:4783:1: ( 'failedAnswer' )
            // InternalRest.g:4784:2: 'failedAnswer'
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getFailedAnswerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__Group_3__0__Impl"


    // $ANTLR start "rule__OpCreate__Group_3__1"
    // InternalRest.g:4793:1: rule__OpCreate__Group_3__1 : rule__OpCreate__Group_3__1__Impl ;
    public final void rule__OpCreate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4797:1: ( rule__OpCreate__Group_3__1__Impl )
            // InternalRest.g:4798:2: rule__OpCreate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__Group_3__1"


    // $ANTLR start "rule__OpCreate__Group_3__1__Impl"
    // InternalRest.g:4804:1: rule__OpCreate__Group_3__1__Impl : ( ( rule__OpCreate__FailedAnswerAssignment_3_1 ) ) ;
    public final void rule__OpCreate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4808:1: ( ( ( rule__OpCreate__FailedAnswerAssignment_3_1 ) ) )
            // InternalRest.g:4809:1: ( ( rule__OpCreate__FailedAnswerAssignment_3_1 ) )
            {
            // InternalRest.g:4809:1: ( ( rule__OpCreate__FailedAnswerAssignment_3_1 ) )
            // InternalRest.g:4810:2: ( rule__OpCreate__FailedAnswerAssignment_3_1 )
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerAssignment_3_1()); 
            // InternalRest.g:4811:2: ( rule__OpCreate__FailedAnswerAssignment_3_1 )
            // InternalRest.g:4811:3: rule__OpCreate__FailedAnswerAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__FailedAnswerAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getFailedAnswerAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__Group_3__1__Impl"


    // $ANTLR start "rule__OpCreate__Group_4__0"
    // InternalRest.g:4820:1: rule__OpCreate__Group_4__0 : rule__OpCreate__Group_4__0__Impl rule__OpCreate__Group_4__1 ;
    public final void rule__OpCreate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4824:1: ( rule__OpCreate__Group_4__0__Impl rule__OpCreate__Group_4__1 )
            // InternalRest.g:4825:2: rule__OpCreate__Group_4__0__Impl rule__OpCreate__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__OpCreate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__Group_4__0"


    // $ANTLR start "rule__OpCreate__Group_4__0__Impl"
    // InternalRest.g:4832:1: rule__OpCreate__Group_4__0__Impl : ( 'succAnswer' ) ;
    public final void rule__OpCreate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4836:1: ( ( 'succAnswer' ) )
            // InternalRest.g:4837:1: ( 'succAnswer' )
            {
            // InternalRest.g:4837:1: ( 'succAnswer' )
            // InternalRest.g:4838:2: 'succAnswer'
            {
             before(grammarAccess.getOpCreateAccess().getSuccAnswerKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOpCreateAccess().getSuccAnswerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__Group_4__0__Impl"


    // $ANTLR start "rule__OpCreate__Group_4__1"
    // InternalRest.g:4847:1: rule__OpCreate__Group_4__1 : rule__OpCreate__Group_4__1__Impl ;
    public final void rule__OpCreate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4851:1: ( rule__OpCreate__Group_4__1__Impl )
            // InternalRest.g:4852:2: rule__OpCreate__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__Group_4__1"


    // $ANTLR start "rule__OpCreate__Group_4__1__Impl"
    // InternalRest.g:4858:1: rule__OpCreate__Group_4__1__Impl : ( ( rule__OpCreate__SuccAnswerAssignment_4_1 ) ) ;
    public final void rule__OpCreate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4862:1: ( ( ( rule__OpCreate__SuccAnswerAssignment_4_1 ) ) )
            // InternalRest.g:4863:1: ( ( rule__OpCreate__SuccAnswerAssignment_4_1 ) )
            {
            // InternalRest.g:4863:1: ( ( rule__OpCreate__SuccAnswerAssignment_4_1 ) )
            // InternalRest.g:4864:2: ( rule__OpCreate__SuccAnswerAssignment_4_1 )
            {
             before(grammarAccess.getOpCreateAccess().getSuccAnswerAssignment_4_1()); 
            // InternalRest.g:4865:2: ( rule__OpCreate__SuccAnswerAssignment_4_1 )
            // InternalRest.g:4865:3: rule__OpCreate__SuccAnswerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OpCreate__SuccAnswerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOpCreateAccess().getSuccAnswerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__Group_4__1__Impl"


    // $ANTLR start "rule__OpCreate__Group_7__0"
    // InternalRest.g:4874:1: rule__OpCreate__Group_7__0 : rule__OpCreate__Group_7__0__Impl rule__OpCreate__Group_7__1 ;
    public final void rule__OpCreate__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4878:1: ( rule__OpCreate__Group_7__0__Impl rule__OpCreate__Group_7__1 )
            // InternalRest.g:4879:2: rule__OpCreate__Group_7__0__Impl rule__OpCreate__Group_7__1
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
    // InternalRest.g:4886:1: rule__OpCreate__Group_7__0__Impl : ( 'fieldset' ) ;
    public final void rule__OpCreate__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4890:1: ( ( 'fieldset' ) )
            // InternalRest.g:4891:1: ( 'fieldset' )
            {
            // InternalRest.g:4891:1: ( 'fieldset' )
            // InternalRest.g:4892:2: 'fieldset'
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRest.g:4901:1: rule__OpCreate__Group_7__1 : rule__OpCreate__Group_7__1__Impl rule__OpCreate__Group_7__2 ;
    public final void rule__OpCreate__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4905:1: ( rule__OpCreate__Group_7__1__Impl rule__OpCreate__Group_7__2 )
            // InternalRest.g:4906:2: rule__OpCreate__Group_7__1__Impl rule__OpCreate__Group_7__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalRest.g:4913:1: rule__OpCreate__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OpCreate__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4917:1: ( ( '{' ) )
            // InternalRest.g:4918:1: ( '{' )
            {
            // InternalRest.g:4918:1: ( '{' )
            // InternalRest.g:4919:2: '{'
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
    // InternalRest.g:4928:1: rule__OpCreate__Group_7__2 : rule__OpCreate__Group_7__2__Impl rule__OpCreate__Group_7__3 ;
    public final void rule__OpCreate__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4932:1: ( rule__OpCreate__Group_7__2__Impl rule__OpCreate__Group_7__3 )
            // InternalRest.g:4933:2: rule__OpCreate__Group_7__2__Impl rule__OpCreate__Group_7__3
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
    // InternalRest.g:4940:1: rule__OpCreate__Group_7__2__Impl : ( ( rule__OpCreate__FieldsetAssignment_7_2 ) ) ;
    public final void rule__OpCreate__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4944:1: ( ( ( rule__OpCreate__FieldsetAssignment_7_2 ) ) )
            // InternalRest.g:4945:1: ( ( rule__OpCreate__FieldsetAssignment_7_2 ) )
            {
            // InternalRest.g:4945:1: ( ( rule__OpCreate__FieldsetAssignment_7_2 ) )
            // InternalRest.g:4946:2: ( rule__OpCreate__FieldsetAssignment_7_2 )
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetAssignment_7_2()); 
            // InternalRest.g:4947:2: ( rule__OpCreate__FieldsetAssignment_7_2 )
            // InternalRest.g:4947:3: rule__OpCreate__FieldsetAssignment_7_2
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
    // InternalRest.g:4955:1: rule__OpCreate__Group_7__3 : rule__OpCreate__Group_7__3__Impl rule__OpCreate__Group_7__4 ;
    public final void rule__OpCreate__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4959:1: ( rule__OpCreate__Group_7__3__Impl rule__OpCreate__Group_7__4 )
            // InternalRest.g:4960:2: rule__OpCreate__Group_7__3__Impl rule__OpCreate__Group_7__4
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
    // InternalRest.g:4967:1: rule__OpCreate__Group_7__3__Impl : ( ( rule__OpCreate__Group_7_3__0 )* ) ;
    public final void rule__OpCreate__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4971:1: ( ( ( rule__OpCreate__Group_7_3__0 )* ) )
            // InternalRest.g:4972:1: ( ( rule__OpCreate__Group_7_3__0 )* )
            {
            // InternalRest.g:4972:1: ( ( rule__OpCreate__Group_7_3__0 )* )
            // InternalRest.g:4973:2: ( rule__OpCreate__Group_7_3__0 )*
            {
             before(grammarAccess.getOpCreateAccess().getGroup_7_3()); 
            // InternalRest.g:4974:2: ( rule__OpCreate__Group_7_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRest.g:4974:3: rule__OpCreate__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OpCreate__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalRest.g:4982:1: rule__OpCreate__Group_7__4 : rule__OpCreate__Group_7__4__Impl ;
    public final void rule__OpCreate__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4986:1: ( rule__OpCreate__Group_7__4__Impl )
            // InternalRest.g:4987:2: rule__OpCreate__Group_7__4__Impl
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
    // InternalRest.g:4993:1: rule__OpCreate__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OpCreate__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:4997:1: ( ( '}' ) )
            // InternalRest.g:4998:1: ( '}' )
            {
            // InternalRest.g:4998:1: ( '}' )
            // InternalRest.g:4999:2: '}'
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
    // InternalRest.g:5009:1: rule__OpCreate__Group_7_3__0 : rule__OpCreate__Group_7_3__0__Impl rule__OpCreate__Group_7_3__1 ;
    public final void rule__OpCreate__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5013:1: ( rule__OpCreate__Group_7_3__0__Impl rule__OpCreate__Group_7_3__1 )
            // InternalRest.g:5014:2: rule__OpCreate__Group_7_3__0__Impl rule__OpCreate__Group_7_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRest.g:5021:1: rule__OpCreate__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OpCreate__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5025:1: ( ( ',' ) )
            // InternalRest.g:5026:1: ( ',' )
            {
            // InternalRest.g:5026:1: ( ',' )
            // InternalRest.g:5027:2: ','
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
    // InternalRest.g:5036:1: rule__OpCreate__Group_7_3__1 : rule__OpCreate__Group_7_3__1__Impl ;
    public final void rule__OpCreate__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5040:1: ( rule__OpCreate__Group_7_3__1__Impl )
            // InternalRest.g:5041:2: rule__OpCreate__Group_7_3__1__Impl
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
    // InternalRest.g:5047:1: rule__OpCreate__Group_7_3__1__Impl : ( ( rule__OpCreate__FieldsetAssignment_7_3_1 ) ) ;
    public final void rule__OpCreate__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5051:1: ( ( ( rule__OpCreate__FieldsetAssignment_7_3_1 ) ) )
            // InternalRest.g:5052:1: ( ( rule__OpCreate__FieldsetAssignment_7_3_1 ) )
            {
            // InternalRest.g:5052:1: ( ( rule__OpCreate__FieldsetAssignment_7_3_1 ) )
            // InternalRest.g:5053:2: ( rule__OpCreate__FieldsetAssignment_7_3_1 )
            {
             before(grammarAccess.getOpCreateAccess().getFieldsetAssignment_7_3_1()); 
            // InternalRest.g:5054:2: ( rule__OpCreate__FieldsetAssignment_7_3_1 )
            // InternalRest.g:5054:3: rule__OpCreate__FieldsetAssignment_7_3_1
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
    // InternalRest.g:5063:1: rule__OpRead__Group__0 : rule__OpRead__Group__0__Impl rule__OpRead__Group__1 ;
    public final void rule__OpRead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5067:1: ( rule__OpRead__Group__0__Impl rule__OpRead__Group__1 )
            // InternalRest.g:5068:2: rule__OpRead__Group__0__Impl rule__OpRead__Group__1
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
    // InternalRest.g:5075:1: rule__OpRead__Group__0__Impl : ( 'OpRead' ) ;
    public final void rule__OpRead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5079:1: ( ( 'OpRead' ) )
            // InternalRest.g:5080:1: ( 'OpRead' )
            {
            // InternalRest.g:5080:1: ( 'OpRead' )
            // InternalRest.g:5081:2: 'OpRead'
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
    // InternalRest.g:5090:1: rule__OpRead__Group__1 : rule__OpRead__Group__1__Impl rule__OpRead__Group__2 ;
    public final void rule__OpRead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5094:1: ( rule__OpRead__Group__1__Impl rule__OpRead__Group__2 )
            // InternalRest.g:5095:2: rule__OpRead__Group__1__Impl rule__OpRead__Group__2
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
    // InternalRest.g:5102:1: rule__OpRead__Group__1__Impl : ( '{' ) ;
    public final void rule__OpRead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5106:1: ( ( '{' ) )
            // InternalRest.g:5107:1: ( '{' )
            {
            // InternalRest.g:5107:1: ( '{' )
            // InternalRest.g:5108:2: '{'
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
    // InternalRest.g:5117:1: rule__OpRead__Group__2 : rule__OpRead__Group__2__Impl rule__OpRead__Group__3 ;
    public final void rule__OpRead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5121:1: ( rule__OpRead__Group__2__Impl rule__OpRead__Group__3 )
            // InternalRest.g:5122:2: rule__OpRead__Group__2__Impl rule__OpRead__Group__3
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
    // InternalRest.g:5129:1: rule__OpRead__Group__2__Impl : ( ( rule__OpRead__Group_2__0 )? ) ;
    public final void rule__OpRead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5133:1: ( ( ( rule__OpRead__Group_2__0 )? ) )
            // InternalRest.g:5134:1: ( ( rule__OpRead__Group_2__0 )? )
            {
            // InternalRest.g:5134:1: ( ( rule__OpRead__Group_2__0 )? )
            // InternalRest.g:5135:2: ( rule__OpRead__Group_2__0 )?
            {
             before(grammarAccess.getOpReadAccess().getGroup_2()); 
            // InternalRest.g:5136:2: ( rule__OpRead__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRest.g:5136:3: rule__OpRead__Group_2__0
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
    // InternalRest.g:5144:1: rule__OpRead__Group__3 : rule__OpRead__Group__3__Impl rule__OpRead__Group__4 ;
    public final void rule__OpRead__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5148:1: ( rule__OpRead__Group__3__Impl rule__OpRead__Group__4 )
            // InternalRest.g:5149:2: rule__OpRead__Group__3__Impl rule__OpRead__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:5156:1: rule__OpRead__Group__3__Impl : ( ( rule__OpRead__Group_3__0 )? ) ;
    public final void rule__OpRead__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5160:1: ( ( ( rule__OpRead__Group_3__0 )? ) )
            // InternalRest.g:5161:1: ( ( rule__OpRead__Group_3__0 )? )
            {
            // InternalRest.g:5161:1: ( ( rule__OpRead__Group_3__0 )? )
            // InternalRest.g:5162:2: ( rule__OpRead__Group_3__0 )?
            {
             before(grammarAccess.getOpReadAccess().getGroup_3()); 
            // InternalRest.g:5163:2: ( rule__OpRead__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRest.g:5163:3: rule__OpRead__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpRead__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpReadAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalRest.g:5171:1: rule__OpRead__Group__4 : rule__OpRead__Group__4__Impl rule__OpRead__Group__5 ;
    public final void rule__OpRead__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5175:1: ( rule__OpRead__Group__4__Impl rule__OpRead__Group__5 )
            // InternalRest.g:5176:2: rule__OpRead__Group__4__Impl rule__OpRead__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:5183:1: rule__OpRead__Group__4__Impl : ( ( rule__OpRead__Group_4__0 )? ) ;
    public final void rule__OpRead__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5187:1: ( ( ( rule__OpRead__Group_4__0 )? ) )
            // InternalRest.g:5188:1: ( ( rule__OpRead__Group_4__0 )? )
            {
            // InternalRest.g:5188:1: ( ( rule__OpRead__Group_4__0 )? )
            // InternalRest.g:5189:2: ( rule__OpRead__Group_4__0 )?
            {
             before(grammarAccess.getOpReadAccess().getGroup_4()); 
            // InternalRest.g:5190:2: ( rule__OpRead__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRest.g:5190:3: rule__OpRead__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpRead__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpReadAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRest.g:5198:1: rule__OpRead__Group__5 : rule__OpRead__Group__5__Impl rule__OpRead__Group__6 ;
    public final void rule__OpRead__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5202:1: ( rule__OpRead__Group__5__Impl rule__OpRead__Group__6 )
            // InternalRest.g:5203:2: rule__OpRead__Group__5__Impl rule__OpRead__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalRest.g:5210:1: rule__OpRead__Group__5__Impl : ( ( rule__OpRead__Group_5__0 )? ) ;
    public final void rule__OpRead__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5214:1: ( ( ( rule__OpRead__Group_5__0 )? ) )
            // InternalRest.g:5215:1: ( ( rule__OpRead__Group_5__0 )? )
            {
            // InternalRest.g:5215:1: ( ( rule__OpRead__Group_5__0 )? )
            // InternalRest.g:5216:2: ( rule__OpRead__Group_5__0 )?
            {
             before(grammarAccess.getOpReadAccess().getGroup_5()); 
            // InternalRest.g:5217:2: ( rule__OpRead__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRest.g:5217:3: rule__OpRead__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpRead__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpReadAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalRest.g:5225:1: rule__OpRead__Group__6 : rule__OpRead__Group__6__Impl rule__OpRead__Group__7 ;
    public final void rule__OpRead__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5229:1: ( rule__OpRead__Group__6__Impl rule__OpRead__Group__7 )
            // InternalRest.g:5230:2: rule__OpRead__Group__6__Impl rule__OpRead__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalRest.g:5237:1: rule__OpRead__Group__6__Impl : ( 'struct' ) ;
    public final void rule__OpRead__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5241:1: ( ( 'struct' ) )
            // InternalRest.g:5242:1: ( 'struct' )
            {
            // InternalRest.g:5242:1: ( 'struct' )
            // InternalRest.g:5243:2: 'struct'
            {
             before(grammarAccess.getOpReadAccess().getStructKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getStructKeyword_6()); 

            }


            }

        }
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
    // InternalRest.g:5252:1: rule__OpRead__Group__7 : rule__OpRead__Group__7__Impl rule__OpRead__Group__8 ;
    public final void rule__OpRead__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5256:1: ( rule__OpRead__Group__7__Impl rule__OpRead__Group__8 )
            // InternalRest.g:5257:2: rule__OpRead__Group__7__Impl rule__OpRead__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalRest.g:5264:1: rule__OpRead__Group__7__Impl : ( ( rule__OpRead__StructAssignment_7 ) ) ;
    public final void rule__OpRead__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5268:1: ( ( ( rule__OpRead__StructAssignment_7 ) ) )
            // InternalRest.g:5269:1: ( ( rule__OpRead__StructAssignment_7 ) )
            {
            // InternalRest.g:5269:1: ( ( rule__OpRead__StructAssignment_7 ) )
            // InternalRest.g:5270:2: ( rule__OpRead__StructAssignment_7 )
            {
             before(grammarAccess.getOpReadAccess().getStructAssignment_7()); 
            // InternalRest.g:5271:2: ( rule__OpRead__StructAssignment_7 )
            // InternalRest.g:5271:3: rule__OpRead__StructAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__StructAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getStructAssignment_7()); 

            }


            }

        }
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
    // InternalRest.g:5279:1: rule__OpRead__Group__8 : rule__OpRead__Group__8__Impl ;
    public final void rule__OpRead__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5283:1: ( rule__OpRead__Group__8__Impl )
            // InternalRest.g:5284:2: rule__OpRead__Group__8__Impl
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
    // InternalRest.g:5290:1: rule__OpRead__Group__8__Impl : ( '}' ) ;
    public final void rule__OpRead__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5294:1: ( ( '}' ) )
            // InternalRest.g:5295:1: ( '}' )
            {
            // InternalRest.g:5295:1: ( '}' )
            // InternalRest.g:5296:2: '}'
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
    // InternalRest.g:5306:1: rule__OpRead__Group_2__0 : rule__OpRead__Group_2__0__Impl rule__OpRead__Group_2__1 ;
    public final void rule__OpRead__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5310:1: ( rule__OpRead__Group_2__0__Impl rule__OpRead__Group_2__1 )
            // InternalRest.g:5311:2: rule__OpRead__Group_2__0__Impl rule__OpRead__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:5318:1: rule__OpRead__Group_2__0__Impl : ( 'fields' ) ;
    public final void rule__OpRead__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5322:1: ( ( 'fields' ) )
            // InternalRest.g:5323:1: ( 'fields' )
            {
            // InternalRest.g:5323:1: ( 'fields' )
            // InternalRest.g:5324:2: 'fields'
            {
             before(grammarAccess.getOpReadAccess().getFieldsKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getFieldsKeyword_2_0()); 

            }


            }

        }
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
    // InternalRest.g:5333:1: rule__OpRead__Group_2__1 : rule__OpRead__Group_2__1__Impl ;
    public final void rule__OpRead__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5337:1: ( rule__OpRead__Group_2__1__Impl )
            // InternalRest.g:5338:2: rule__OpRead__Group_2__1__Impl
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
    // InternalRest.g:5344:1: rule__OpRead__Group_2__1__Impl : ( ( rule__OpRead__FieldsAssignment_2_1 ) ) ;
    public final void rule__OpRead__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5348:1: ( ( ( rule__OpRead__FieldsAssignment_2_1 ) ) )
            // InternalRest.g:5349:1: ( ( rule__OpRead__FieldsAssignment_2_1 ) )
            {
            // InternalRest.g:5349:1: ( ( rule__OpRead__FieldsAssignment_2_1 ) )
            // InternalRest.g:5350:2: ( rule__OpRead__FieldsAssignment_2_1 )
            {
             before(grammarAccess.getOpReadAccess().getFieldsAssignment_2_1()); 
            // InternalRest.g:5351:2: ( rule__OpRead__FieldsAssignment_2_1 )
            // InternalRest.g:5351:3: rule__OpRead__FieldsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__FieldsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getFieldsAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__OpRead__Group_3__0"
    // InternalRest.g:5360:1: rule__OpRead__Group_3__0 : rule__OpRead__Group_3__0__Impl rule__OpRead__Group_3__1 ;
    public final void rule__OpRead__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5364:1: ( rule__OpRead__Group_3__0__Impl rule__OpRead__Group_3__1 )
            // InternalRest.g:5365:2: rule__OpRead__Group_3__0__Impl rule__OpRead__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__OpRead__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_3__0"


    // $ANTLR start "rule__OpRead__Group_3__0__Impl"
    // InternalRest.g:5372:1: rule__OpRead__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__OpRead__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5376:1: ( ( 'id' ) )
            // InternalRest.g:5377:1: ( 'id' )
            {
            // InternalRest.g:5377:1: ( 'id' )
            // InternalRest.g:5378:2: 'id'
            {
             before(grammarAccess.getOpReadAccess().getIdKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getIdKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_3__0__Impl"


    // $ANTLR start "rule__OpRead__Group_3__1"
    // InternalRest.g:5387:1: rule__OpRead__Group_3__1 : rule__OpRead__Group_3__1__Impl ;
    public final void rule__OpRead__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5391:1: ( rule__OpRead__Group_3__1__Impl )
            // InternalRest.g:5392:2: rule__OpRead__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_3__1"


    // $ANTLR start "rule__OpRead__Group_3__1__Impl"
    // InternalRest.g:5398:1: rule__OpRead__Group_3__1__Impl : ( ( rule__OpRead__IdAssignment_3_1 ) ) ;
    public final void rule__OpRead__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5402:1: ( ( ( rule__OpRead__IdAssignment_3_1 ) ) )
            // InternalRest.g:5403:1: ( ( rule__OpRead__IdAssignment_3_1 ) )
            {
            // InternalRest.g:5403:1: ( ( rule__OpRead__IdAssignment_3_1 ) )
            // InternalRest.g:5404:2: ( rule__OpRead__IdAssignment_3_1 )
            {
             before(grammarAccess.getOpReadAccess().getIdAssignment_3_1()); 
            // InternalRest.g:5405:2: ( rule__OpRead__IdAssignment_3_1 )
            // InternalRest.g:5405:3: rule__OpRead__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getIdAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_3__1__Impl"


    // $ANTLR start "rule__OpRead__Group_4__0"
    // InternalRest.g:5414:1: rule__OpRead__Group_4__0 : rule__OpRead__Group_4__0__Impl rule__OpRead__Group_4__1 ;
    public final void rule__OpRead__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5418:1: ( rule__OpRead__Group_4__0__Impl rule__OpRead__Group_4__1 )
            // InternalRest.g:5419:2: rule__OpRead__Group_4__0__Impl rule__OpRead__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__OpRead__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_4__0"


    // $ANTLR start "rule__OpRead__Group_4__0__Impl"
    // InternalRest.g:5426:1: rule__OpRead__Group_4__0__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpRead__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5430:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:5431:1: ( 'failedAnswer' )
            {
            // InternalRest.g:5431:1: ( 'failedAnswer' )
            // InternalRest.g:5432:2: 'failedAnswer'
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getFailedAnswerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_4__0__Impl"


    // $ANTLR start "rule__OpRead__Group_4__1"
    // InternalRest.g:5441:1: rule__OpRead__Group_4__1 : rule__OpRead__Group_4__1__Impl ;
    public final void rule__OpRead__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5445:1: ( rule__OpRead__Group_4__1__Impl )
            // InternalRest.g:5446:2: rule__OpRead__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_4__1"


    // $ANTLR start "rule__OpRead__Group_4__1__Impl"
    // InternalRest.g:5452:1: rule__OpRead__Group_4__1__Impl : ( ( rule__OpRead__FailedAnswerAssignment_4_1 ) ) ;
    public final void rule__OpRead__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5456:1: ( ( ( rule__OpRead__FailedAnswerAssignment_4_1 ) ) )
            // InternalRest.g:5457:1: ( ( rule__OpRead__FailedAnswerAssignment_4_1 ) )
            {
            // InternalRest.g:5457:1: ( ( rule__OpRead__FailedAnswerAssignment_4_1 ) )
            // InternalRest.g:5458:2: ( rule__OpRead__FailedAnswerAssignment_4_1 )
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerAssignment_4_1()); 
            // InternalRest.g:5459:2: ( rule__OpRead__FailedAnswerAssignment_4_1 )
            // InternalRest.g:5459:3: rule__OpRead__FailedAnswerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__FailedAnswerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getFailedAnswerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_4__1__Impl"


    // $ANTLR start "rule__OpRead__Group_5__0"
    // InternalRest.g:5468:1: rule__OpRead__Group_5__0 : rule__OpRead__Group_5__0__Impl rule__OpRead__Group_5__1 ;
    public final void rule__OpRead__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5472:1: ( rule__OpRead__Group_5__0__Impl rule__OpRead__Group_5__1 )
            // InternalRest.g:5473:2: rule__OpRead__Group_5__0__Impl rule__OpRead__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__OpRead__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpRead__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_5__0"


    // $ANTLR start "rule__OpRead__Group_5__0__Impl"
    // InternalRest.g:5480:1: rule__OpRead__Group_5__0__Impl : ( 'succAnswer' ) ;
    public final void rule__OpRead__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5484:1: ( ( 'succAnswer' ) )
            // InternalRest.g:5485:1: ( 'succAnswer' )
            {
            // InternalRest.g:5485:1: ( 'succAnswer' )
            // InternalRest.g:5486:2: 'succAnswer'
            {
             before(grammarAccess.getOpReadAccess().getSuccAnswerKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOpReadAccess().getSuccAnswerKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_5__0__Impl"


    // $ANTLR start "rule__OpRead__Group_5__1"
    // InternalRest.g:5495:1: rule__OpRead__Group_5__1 : rule__OpRead__Group_5__1__Impl ;
    public final void rule__OpRead__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5499:1: ( rule__OpRead__Group_5__1__Impl )
            // InternalRest.g:5500:2: rule__OpRead__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_5__1"


    // $ANTLR start "rule__OpRead__Group_5__1__Impl"
    // InternalRest.g:5506:1: rule__OpRead__Group_5__1__Impl : ( ( rule__OpRead__SuccAnswerAssignment_5_1 ) ) ;
    public final void rule__OpRead__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5510:1: ( ( ( rule__OpRead__SuccAnswerAssignment_5_1 ) ) )
            // InternalRest.g:5511:1: ( ( rule__OpRead__SuccAnswerAssignment_5_1 ) )
            {
            // InternalRest.g:5511:1: ( ( rule__OpRead__SuccAnswerAssignment_5_1 ) )
            // InternalRest.g:5512:2: ( rule__OpRead__SuccAnswerAssignment_5_1 )
            {
             before(grammarAccess.getOpReadAccess().getSuccAnswerAssignment_5_1()); 
            // InternalRest.g:5513:2: ( rule__OpRead__SuccAnswerAssignment_5_1 )
            // InternalRest.g:5513:3: rule__OpRead__SuccAnswerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__OpRead__SuccAnswerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOpReadAccess().getSuccAnswerAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__Group_5__1__Impl"


    // $ANTLR start "rule__OpUpdate__Group__0"
    // InternalRest.g:5522:1: rule__OpUpdate__Group__0 : rule__OpUpdate__Group__0__Impl rule__OpUpdate__Group__1 ;
    public final void rule__OpUpdate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5526:1: ( rule__OpUpdate__Group__0__Impl rule__OpUpdate__Group__1 )
            // InternalRest.g:5527:2: rule__OpUpdate__Group__0__Impl rule__OpUpdate__Group__1
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
    // InternalRest.g:5534:1: rule__OpUpdate__Group__0__Impl : ( 'OpUpdate' ) ;
    public final void rule__OpUpdate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5538:1: ( ( 'OpUpdate' ) )
            // InternalRest.g:5539:1: ( 'OpUpdate' )
            {
            // InternalRest.g:5539:1: ( 'OpUpdate' )
            // InternalRest.g:5540:2: 'OpUpdate'
            {
             before(grammarAccess.getOpUpdateAccess().getOpUpdateKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRest.g:5549:1: rule__OpUpdate__Group__1 : rule__OpUpdate__Group__1__Impl rule__OpUpdate__Group__2 ;
    public final void rule__OpUpdate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5553:1: ( rule__OpUpdate__Group__1__Impl rule__OpUpdate__Group__2 )
            // InternalRest.g:5554:2: rule__OpUpdate__Group__1__Impl rule__OpUpdate__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:5561:1: rule__OpUpdate__Group__1__Impl : ( '{' ) ;
    public final void rule__OpUpdate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5565:1: ( ( '{' ) )
            // InternalRest.g:5566:1: ( '{' )
            {
            // InternalRest.g:5566:1: ( '{' )
            // InternalRest.g:5567:2: '{'
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
    // InternalRest.g:5576:1: rule__OpUpdate__Group__2 : rule__OpUpdate__Group__2__Impl rule__OpUpdate__Group__3 ;
    public final void rule__OpUpdate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5580:1: ( rule__OpUpdate__Group__2__Impl rule__OpUpdate__Group__3 )
            // InternalRest.g:5581:2: rule__OpUpdate__Group__2__Impl rule__OpUpdate__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:5588:1: rule__OpUpdate__Group__2__Impl : ( ( rule__OpUpdate__Group_2__0 )? ) ;
    public final void rule__OpUpdate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5592:1: ( ( ( rule__OpUpdate__Group_2__0 )? ) )
            // InternalRest.g:5593:1: ( ( rule__OpUpdate__Group_2__0 )? )
            {
            // InternalRest.g:5593:1: ( ( rule__OpUpdate__Group_2__0 )? )
            // InternalRest.g:5594:2: ( rule__OpUpdate__Group_2__0 )?
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_2()); 
            // InternalRest.g:5595:2: ( rule__OpUpdate__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRest.g:5595:3: rule__OpUpdate__Group_2__0
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
    // InternalRest.g:5603:1: rule__OpUpdate__Group__3 : rule__OpUpdate__Group__3__Impl rule__OpUpdate__Group__4 ;
    public final void rule__OpUpdate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5607:1: ( rule__OpUpdate__Group__3__Impl rule__OpUpdate__Group__4 )
            // InternalRest.g:5608:2: rule__OpUpdate__Group__3__Impl rule__OpUpdate__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:5615:1: rule__OpUpdate__Group__3__Impl : ( ( rule__OpUpdate__Group_3__0 )? ) ;
    public final void rule__OpUpdate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5619:1: ( ( ( rule__OpUpdate__Group_3__0 )? ) )
            // InternalRest.g:5620:1: ( ( rule__OpUpdate__Group_3__0 )? )
            {
            // InternalRest.g:5620:1: ( ( rule__OpUpdate__Group_3__0 )? )
            // InternalRest.g:5621:2: ( rule__OpUpdate__Group_3__0 )?
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_3()); 
            // InternalRest.g:5622:2: ( rule__OpUpdate__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRest.g:5622:3: rule__OpUpdate__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpUpdate__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpUpdateAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalRest.g:5630:1: rule__OpUpdate__Group__4 : rule__OpUpdate__Group__4__Impl rule__OpUpdate__Group__5 ;
    public final void rule__OpUpdate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5634:1: ( rule__OpUpdate__Group__4__Impl rule__OpUpdate__Group__5 )
            // InternalRest.g:5635:2: rule__OpUpdate__Group__4__Impl rule__OpUpdate__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:5642:1: rule__OpUpdate__Group__4__Impl : ( ( rule__OpUpdate__Group_4__0 )? ) ;
    public final void rule__OpUpdate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5646:1: ( ( ( rule__OpUpdate__Group_4__0 )? ) )
            // InternalRest.g:5647:1: ( ( rule__OpUpdate__Group_4__0 )? )
            {
            // InternalRest.g:5647:1: ( ( rule__OpUpdate__Group_4__0 )? )
            // InternalRest.g:5648:2: ( rule__OpUpdate__Group_4__0 )?
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_4()); 
            // InternalRest.g:5649:2: ( rule__OpUpdate__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRest.g:5649:3: rule__OpUpdate__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpUpdate__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpUpdateAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRest.g:5657:1: rule__OpUpdate__Group__5 : rule__OpUpdate__Group__5__Impl rule__OpUpdate__Group__6 ;
    public final void rule__OpUpdate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5661:1: ( rule__OpUpdate__Group__5__Impl rule__OpUpdate__Group__6 )
            // InternalRest.g:5662:2: rule__OpUpdate__Group__5__Impl rule__OpUpdate__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalRest.g:5669:1: rule__OpUpdate__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpUpdate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5673:1: ( ( 'struct' ) )
            // InternalRest.g:5674:1: ( 'struct' )
            {
            // InternalRest.g:5674:1: ( 'struct' )
            // InternalRest.g:5675:2: 'struct'
            {
             before(grammarAccess.getOpUpdateAccess().getStructKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRest.g:5684:1: rule__OpUpdate__Group__6 : rule__OpUpdate__Group__6__Impl rule__OpUpdate__Group__7 ;
    public final void rule__OpUpdate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5688:1: ( rule__OpUpdate__Group__6__Impl rule__OpUpdate__Group__7 )
            // InternalRest.g:5689:2: rule__OpUpdate__Group__6__Impl rule__OpUpdate__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalRest.g:5696:1: rule__OpUpdate__Group__6__Impl : ( ( rule__OpUpdate__StructAssignment_6 ) ) ;
    public final void rule__OpUpdate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5700:1: ( ( ( rule__OpUpdate__StructAssignment_6 ) ) )
            // InternalRest.g:5701:1: ( ( rule__OpUpdate__StructAssignment_6 ) )
            {
            // InternalRest.g:5701:1: ( ( rule__OpUpdate__StructAssignment_6 ) )
            // InternalRest.g:5702:2: ( rule__OpUpdate__StructAssignment_6 )
            {
             before(grammarAccess.getOpUpdateAccess().getStructAssignment_6()); 
            // InternalRest.g:5703:2: ( rule__OpUpdate__StructAssignment_6 )
            // InternalRest.g:5703:3: rule__OpUpdate__StructAssignment_6
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
    // InternalRest.g:5711:1: rule__OpUpdate__Group__7 : rule__OpUpdate__Group__7__Impl rule__OpUpdate__Group__8 ;
    public final void rule__OpUpdate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5715:1: ( rule__OpUpdate__Group__7__Impl rule__OpUpdate__Group__8 )
            // InternalRest.g:5716:2: rule__OpUpdate__Group__7__Impl rule__OpUpdate__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalRest.g:5723:1: rule__OpUpdate__Group__7__Impl : ( ( rule__OpUpdate__Group_7__0 )? ) ;
    public final void rule__OpUpdate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5727:1: ( ( ( rule__OpUpdate__Group_7__0 )? ) )
            // InternalRest.g:5728:1: ( ( rule__OpUpdate__Group_7__0 )? )
            {
            // InternalRest.g:5728:1: ( ( rule__OpUpdate__Group_7__0 )? )
            // InternalRest.g:5729:2: ( rule__OpUpdate__Group_7__0 )?
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_7()); 
            // InternalRest.g:5730:2: ( rule__OpUpdate__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRest.g:5730:3: rule__OpUpdate__Group_7__0
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
    // InternalRest.g:5738:1: rule__OpUpdate__Group__8 : rule__OpUpdate__Group__8__Impl ;
    public final void rule__OpUpdate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5742:1: ( rule__OpUpdate__Group__8__Impl )
            // InternalRest.g:5743:2: rule__OpUpdate__Group__8__Impl
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
    // InternalRest.g:5749:1: rule__OpUpdate__Group__8__Impl : ( '}' ) ;
    public final void rule__OpUpdate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5753:1: ( ( '}' ) )
            // InternalRest.g:5754:1: ( '}' )
            {
            // InternalRest.g:5754:1: ( '}' )
            // InternalRest.g:5755:2: '}'
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
    // InternalRest.g:5765:1: rule__OpUpdate__Group_2__0 : rule__OpUpdate__Group_2__0__Impl rule__OpUpdate__Group_2__1 ;
    public final void rule__OpUpdate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5769:1: ( rule__OpUpdate__Group_2__0__Impl rule__OpUpdate__Group_2__1 )
            // InternalRest.g:5770:2: rule__OpUpdate__Group_2__0__Impl rule__OpUpdate__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:5777:1: rule__OpUpdate__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpUpdate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5781:1: ( ( 'id' ) )
            // InternalRest.g:5782:1: ( 'id' )
            {
            // InternalRest.g:5782:1: ( 'id' )
            // InternalRest.g:5783:2: 'id'
            {
             before(grammarAccess.getOpUpdateAccess().getIdKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRest.g:5792:1: rule__OpUpdate__Group_2__1 : rule__OpUpdate__Group_2__1__Impl ;
    public final void rule__OpUpdate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5796:1: ( rule__OpUpdate__Group_2__1__Impl )
            // InternalRest.g:5797:2: rule__OpUpdate__Group_2__1__Impl
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
    // InternalRest.g:5803:1: rule__OpUpdate__Group_2__1__Impl : ( ( rule__OpUpdate__IdAssignment_2_1 ) ) ;
    public final void rule__OpUpdate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5807:1: ( ( ( rule__OpUpdate__IdAssignment_2_1 ) ) )
            // InternalRest.g:5808:1: ( ( rule__OpUpdate__IdAssignment_2_1 ) )
            {
            // InternalRest.g:5808:1: ( ( rule__OpUpdate__IdAssignment_2_1 ) )
            // InternalRest.g:5809:2: ( rule__OpUpdate__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpUpdateAccess().getIdAssignment_2_1()); 
            // InternalRest.g:5810:2: ( rule__OpUpdate__IdAssignment_2_1 )
            // InternalRest.g:5810:3: rule__OpUpdate__IdAssignment_2_1
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


    // $ANTLR start "rule__OpUpdate__Group_3__0"
    // InternalRest.g:5819:1: rule__OpUpdate__Group_3__0 : rule__OpUpdate__Group_3__0__Impl rule__OpUpdate__Group_3__1 ;
    public final void rule__OpUpdate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5823:1: ( rule__OpUpdate__Group_3__0__Impl rule__OpUpdate__Group_3__1 )
            // InternalRest.g:5824:2: rule__OpUpdate__Group_3__0__Impl rule__OpUpdate__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__OpUpdate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__Group_3__0"


    // $ANTLR start "rule__OpUpdate__Group_3__0__Impl"
    // InternalRest.g:5831:1: rule__OpUpdate__Group_3__0__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpUpdate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5835:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:5836:1: ( 'failedAnswer' )
            {
            // InternalRest.g:5836:1: ( 'failedAnswer' )
            // InternalRest.g:5837:2: 'failedAnswer'
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getFailedAnswerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__Group_3__0__Impl"


    // $ANTLR start "rule__OpUpdate__Group_3__1"
    // InternalRest.g:5846:1: rule__OpUpdate__Group_3__1 : rule__OpUpdate__Group_3__1__Impl ;
    public final void rule__OpUpdate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5850:1: ( rule__OpUpdate__Group_3__1__Impl )
            // InternalRest.g:5851:2: rule__OpUpdate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__Group_3__1"


    // $ANTLR start "rule__OpUpdate__Group_3__1__Impl"
    // InternalRest.g:5857:1: rule__OpUpdate__Group_3__1__Impl : ( ( rule__OpUpdate__FailedAnswerAssignment_3_1 ) ) ;
    public final void rule__OpUpdate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5861:1: ( ( ( rule__OpUpdate__FailedAnswerAssignment_3_1 ) ) )
            // InternalRest.g:5862:1: ( ( rule__OpUpdate__FailedAnswerAssignment_3_1 ) )
            {
            // InternalRest.g:5862:1: ( ( rule__OpUpdate__FailedAnswerAssignment_3_1 ) )
            // InternalRest.g:5863:2: ( rule__OpUpdate__FailedAnswerAssignment_3_1 )
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerAssignment_3_1()); 
            // InternalRest.g:5864:2: ( rule__OpUpdate__FailedAnswerAssignment_3_1 )
            // InternalRest.g:5864:3: rule__OpUpdate__FailedAnswerAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__FailedAnswerAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getFailedAnswerAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__Group_3__1__Impl"


    // $ANTLR start "rule__OpUpdate__Group_4__0"
    // InternalRest.g:5873:1: rule__OpUpdate__Group_4__0 : rule__OpUpdate__Group_4__0__Impl rule__OpUpdate__Group_4__1 ;
    public final void rule__OpUpdate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5877:1: ( rule__OpUpdate__Group_4__0__Impl rule__OpUpdate__Group_4__1 )
            // InternalRest.g:5878:2: rule__OpUpdate__Group_4__0__Impl rule__OpUpdate__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__OpUpdate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__Group_4__0"


    // $ANTLR start "rule__OpUpdate__Group_4__0__Impl"
    // InternalRest.g:5885:1: rule__OpUpdate__Group_4__0__Impl : ( 'succAnswer' ) ;
    public final void rule__OpUpdate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5889:1: ( ( 'succAnswer' ) )
            // InternalRest.g:5890:1: ( 'succAnswer' )
            {
            // InternalRest.g:5890:1: ( 'succAnswer' )
            // InternalRest.g:5891:2: 'succAnswer'
            {
             before(grammarAccess.getOpUpdateAccess().getSuccAnswerKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOpUpdateAccess().getSuccAnswerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__Group_4__0__Impl"


    // $ANTLR start "rule__OpUpdate__Group_4__1"
    // InternalRest.g:5900:1: rule__OpUpdate__Group_4__1 : rule__OpUpdate__Group_4__1__Impl ;
    public final void rule__OpUpdate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5904:1: ( rule__OpUpdate__Group_4__1__Impl )
            // InternalRest.g:5905:2: rule__OpUpdate__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__Group_4__1"


    // $ANTLR start "rule__OpUpdate__Group_4__1__Impl"
    // InternalRest.g:5911:1: rule__OpUpdate__Group_4__1__Impl : ( ( rule__OpUpdate__SuccAnswerAssignment_4_1 ) ) ;
    public final void rule__OpUpdate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5915:1: ( ( ( rule__OpUpdate__SuccAnswerAssignment_4_1 ) ) )
            // InternalRest.g:5916:1: ( ( rule__OpUpdate__SuccAnswerAssignment_4_1 ) )
            {
            // InternalRest.g:5916:1: ( ( rule__OpUpdate__SuccAnswerAssignment_4_1 ) )
            // InternalRest.g:5917:2: ( rule__OpUpdate__SuccAnswerAssignment_4_1 )
            {
             before(grammarAccess.getOpUpdateAccess().getSuccAnswerAssignment_4_1()); 
            // InternalRest.g:5918:2: ( rule__OpUpdate__SuccAnswerAssignment_4_1 )
            // InternalRest.g:5918:3: rule__OpUpdate__SuccAnswerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OpUpdate__SuccAnswerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOpUpdateAccess().getSuccAnswerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__Group_4__1__Impl"


    // $ANTLR start "rule__OpUpdate__Group_7__0"
    // InternalRest.g:5927:1: rule__OpUpdate__Group_7__0 : rule__OpUpdate__Group_7__0__Impl rule__OpUpdate__Group_7__1 ;
    public final void rule__OpUpdate__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5931:1: ( rule__OpUpdate__Group_7__0__Impl rule__OpUpdate__Group_7__1 )
            // InternalRest.g:5932:2: rule__OpUpdate__Group_7__0__Impl rule__OpUpdate__Group_7__1
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
    // InternalRest.g:5939:1: rule__OpUpdate__Group_7__0__Impl : ( 'fieldset' ) ;
    public final void rule__OpUpdate__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5943:1: ( ( 'fieldset' ) )
            // InternalRest.g:5944:1: ( 'fieldset' )
            {
            // InternalRest.g:5944:1: ( 'fieldset' )
            // InternalRest.g:5945:2: 'fieldset'
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRest.g:5954:1: rule__OpUpdate__Group_7__1 : rule__OpUpdate__Group_7__1__Impl rule__OpUpdate__Group_7__2 ;
    public final void rule__OpUpdate__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5958:1: ( rule__OpUpdate__Group_7__1__Impl rule__OpUpdate__Group_7__2 )
            // InternalRest.g:5959:2: rule__OpUpdate__Group_7__1__Impl rule__OpUpdate__Group_7__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalRest.g:5966:1: rule__OpUpdate__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OpUpdate__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5970:1: ( ( '{' ) )
            // InternalRest.g:5971:1: ( '{' )
            {
            // InternalRest.g:5971:1: ( '{' )
            // InternalRest.g:5972:2: '{'
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
    // InternalRest.g:5981:1: rule__OpUpdate__Group_7__2 : rule__OpUpdate__Group_7__2__Impl rule__OpUpdate__Group_7__3 ;
    public final void rule__OpUpdate__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5985:1: ( rule__OpUpdate__Group_7__2__Impl rule__OpUpdate__Group_7__3 )
            // InternalRest.g:5986:2: rule__OpUpdate__Group_7__2__Impl rule__OpUpdate__Group_7__3
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
    // InternalRest.g:5993:1: rule__OpUpdate__Group_7__2__Impl : ( ( rule__OpUpdate__FieldsetAssignment_7_2 ) ) ;
    public final void rule__OpUpdate__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:5997:1: ( ( ( rule__OpUpdate__FieldsetAssignment_7_2 ) ) )
            // InternalRest.g:5998:1: ( ( rule__OpUpdate__FieldsetAssignment_7_2 ) )
            {
            // InternalRest.g:5998:1: ( ( rule__OpUpdate__FieldsetAssignment_7_2 ) )
            // InternalRest.g:5999:2: ( rule__OpUpdate__FieldsetAssignment_7_2 )
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetAssignment_7_2()); 
            // InternalRest.g:6000:2: ( rule__OpUpdate__FieldsetAssignment_7_2 )
            // InternalRest.g:6000:3: rule__OpUpdate__FieldsetAssignment_7_2
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
    // InternalRest.g:6008:1: rule__OpUpdate__Group_7__3 : rule__OpUpdate__Group_7__3__Impl rule__OpUpdate__Group_7__4 ;
    public final void rule__OpUpdate__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6012:1: ( rule__OpUpdate__Group_7__3__Impl rule__OpUpdate__Group_7__4 )
            // InternalRest.g:6013:2: rule__OpUpdate__Group_7__3__Impl rule__OpUpdate__Group_7__4
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
    // InternalRest.g:6020:1: rule__OpUpdate__Group_7__3__Impl : ( ( rule__OpUpdate__Group_7_3__0 )* ) ;
    public final void rule__OpUpdate__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6024:1: ( ( ( rule__OpUpdate__Group_7_3__0 )* ) )
            // InternalRest.g:6025:1: ( ( rule__OpUpdate__Group_7_3__0 )* )
            {
            // InternalRest.g:6025:1: ( ( rule__OpUpdate__Group_7_3__0 )* )
            // InternalRest.g:6026:2: ( rule__OpUpdate__Group_7_3__0 )*
            {
             before(grammarAccess.getOpUpdateAccess().getGroup_7_3()); 
            // InternalRest.g:6027:2: ( rule__OpUpdate__Group_7_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==15) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRest.g:6027:3: rule__OpUpdate__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OpUpdate__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalRest.g:6035:1: rule__OpUpdate__Group_7__4 : rule__OpUpdate__Group_7__4__Impl ;
    public final void rule__OpUpdate__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6039:1: ( rule__OpUpdate__Group_7__4__Impl )
            // InternalRest.g:6040:2: rule__OpUpdate__Group_7__4__Impl
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
    // InternalRest.g:6046:1: rule__OpUpdate__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OpUpdate__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6050:1: ( ( '}' ) )
            // InternalRest.g:6051:1: ( '}' )
            {
            // InternalRest.g:6051:1: ( '}' )
            // InternalRest.g:6052:2: '}'
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
    // InternalRest.g:6062:1: rule__OpUpdate__Group_7_3__0 : rule__OpUpdate__Group_7_3__0__Impl rule__OpUpdate__Group_7_3__1 ;
    public final void rule__OpUpdate__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6066:1: ( rule__OpUpdate__Group_7_3__0__Impl rule__OpUpdate__Group_7_3__1 )
            // InternalRest.g:6067:2: rule__OpUpdate__Group_7_3__0__Impl rule__OpUpdate__Group_7_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRest.g:6074:1: rule__OpUpdate__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OpUpdate__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6078:1: ( ( ',' ) )
            // InternalRest.g:6079:1: ( ',' )
            {
            // InternalRest.g:6079:1: ( ',' )
            // InternalRest.g:6080:2: ','
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
    // InternalRest.g:6089:1: rule__OpUpdate__Group_7_3__1 : rule__OpUpdate__Group_7_3__1__Impl ;
    public final void rule__OpUpdate__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6093:1: ( rule__OpUpdate__Group_7_3__1__Impl )
            // InternalRest.g:6094:2: rule__OpUpdate__Group_7_3__1__Impl
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
    // InternalRest.g:6100:1: rule__OpUpdate__Group_7_3__1__Impl : ( ( rule__OpUpdate__FieldsetAssignment_7_3_1 ) ) ;
    public final void rule__OpUpdate__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6104:1: ( ( ( rule__OpUpdate__FieldsetAssignment_7_3_1 ) ) )
            // InternalRest.g:6105:1: ( ( rule__OpUpdate__FieldsetAssignment_7_3_1 ) )
            {
            // InternalRest.g:6105:1: ( ( rule__OpUpdate__FieldsetAssignment_7_3_1 ) )
            // InternalRest.g:6106:2: ( rule__OpUpdate__FieldsetAssignment_7_3_1 )
            {
             before(grammarAccess.getOpUpdateAccess().getFieldsetAssignment_7_3_1()); 
            // InternalRest.g:6107:2: ( rule__OpUpdate__FieldsetAssignment_7_3_1 )
            // InternalRest.g:6107:3: rule__OpUpdate__FieldsetAssignment_7_3_1
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
    // InternalRest.g:6116:1: rule__OpDelete__Group__0 : rule__OpDelete__Group__0__Impl rule__OpDelete__Group__1 ;
    public final void rule__OpDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6120:1: ( rule__OpDelete__Group__0__Impl rule__OpDelete__Group__1 )
            // InternalRest.g:6121:2: rule__OpDelete__Group__0__Impl rule__OpDelete__Group__1
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
    // InternalRest.g:6128:1: rule__OpDelete__Group__0__Impl : ( 'OpDelete' ) ;
    public final void rule__OpDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6132:1: ( ( 'OpDelete' ) )
            // InternalRest.g:6133:1: ( 'OpDelete' )
            {
            // InternalRest.g:6133:1: ( 'OpDelete' )
            // InternalRest.g:6134:2: 'OpDelete'
            {
             before(grammarAccess.getOpDeleteAccess().getOpDeleteKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRest.g:6143:1: rule__OpDelete__Group__1 : rule__OpDelete__Group__1__Impl rule__OpDelete__Group__2 ;
    public final void rule__OpDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6147:1: ( rule__OpDelete__Group__1__Impl rule__OpDelete__Group__2 )
            // InternalRest.g:6148:2: rule__OpDelete__Group__1__Impl rule__OpDelete__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:6155:1: rule__OpDelete__Group__1__Impl : ( '{' ) ;
    public final void rule__OpDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6159:1: ( ( '{' ) )
            // InternalRest.g:6160:1: ( '{' )
            {
            // InternalRest.g:6160:1: ( '{' )
            // InternalRest.g:6161:2: '{'
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
    // InternalRest.g:6170:1: rule__OpDelete__Group__2 : rule__OpDelete__Group__2__Impl rule__OpDelete__Group__3 ;
    public final void rule__OpDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6174:1: ( rule__OpDelete__Group__2__Impl rule__OpDelete__Group__3 )
            // InternalRest.g:6175:2: rule__OpDelete__Group__2__Impl rule__OpDelete__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:6182:1: rule__OpDelete__Group__2__Impl : ( ( rule__OpDelete__Group_2__0 )? ) ;
    public final void rule__OpDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6186:1: ( ( ( rule__OpDelete__Group_2__0 )? ) )
            // InternalRest.g:6187:1: ( ( rule__OpDelete__Group_2__0 )? )
            {
            // InternalRest.g:6187:1: ( ( rule__OpDelete__Group_2__0 )? )
            // InternalRest.g:6188:2: ( rule__OpDelete__Group_2__0 )?
            {
             before(grammarAccess.getOpDeleteAccess().getGroup_2()); 
            // InternalRest.g:6189:2: ( rule__OpDelete__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRest.g:6189:3: rule__OpDelete__Group_2__0
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
    // InternalRest.g:6197:1: rule__OpDelete__Group__3 : rule__OpDelete__Group__3__Impl rule__OpDelete__Group__4 ;
    public final void rule__OpDelete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6201:1: ( rule__OpDelete__Group__3__Impl rule__OpDelete__Group__4 )
            // InternalRest.g:6202:2: rule__OpDelete__Group__3__Impl rule__OpDelete__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:6209:1: rule__OpDelete__Group__3__Impl : ( ( rule__OpDelete__Group_3__0 )? ) ;
    public final void rule__OpDelete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6213:1: ( ( ( rule__OpDelete__Group_3__0 )? ) )
            // InternalRest.g:6214:1: ( ( rule__OpDelete__Group_3__0 )? )
            {
            // InternalRest.g:6214:1: ( ( rule__OpDelete__Group_3__0 )? )
            // InternalRest.g:6215:2: ( rule__OpDelete__Group_3__0 )?
            {
             before(grammarAccess.getOpDeleteAccess().getGroup_3()); 
            // InternalRest.g:6216:2: ( rule__OpDelete__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRest.g:6216:3: rule__OpDelete__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpDelete__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpDeleteAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalRest.g:6224:1: rule__OpDelete__Group__4 : rule__OpDelete__Group__4__Impl rule__OpDelete__Group__5 ;
    public final void rule__OpDelete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6228:1: ( rule__OpDelete__Group__4__Impl rule__OpDelete__Group__5 )
            // InternalRest.g:6229:2: rule__OpDelete__Group__4__Impl rule__OpDelete__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:6236:1: rule__OpDelete__Group__4__Impl : ( ( rule__OpDelete__Group_4__0 )? ) ;
    public final void rule__OpDelete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6240:1: ( ( ( rule__OpDelete__Group_4__0 )? ) )
            // InternalRest.g:6241:1: ( ( rule__OpDelete__Group_4__0 )? )
            {
            // InternalRest.g:6241:1: ( ( rule__OpDelete__Group_4__0 )? )
            // InternalRest.g:6242:2: ( rule__OpDelete__Group_4__0 )?
            {
             before(grammarAccess.getOpDeleteAccess().getGroup_4()); 
            // InternalRest.g:6243:2: ( rule__OpDelete__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRest.g:6243:3: rule__OpDelete__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpDelete__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpDeleteAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRest.g:6251:1: rule__OpDelete__Group__5 : rule__OpDelete__Group__5__Impl rule__OpDelete__Group__6 ;
    public final void rule__OpDelete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6255:1: ( rule__OpDelete__Group__5__Impl rule__OpDelete__Group__6 )
            // InternalRest.g:6256:2: rule__OpDelete__Group__5__Impl rule__OpDelete__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalRest.g:6263:1: rule__OpDelete__Group__5__Impl : ( 'struct' ) ;
    public final void rule__OpDelete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6267:1: ( ( 'struct' ) )
            // InternalRest.g:6268:1: ( 'struct' )
            {
            // InternalRest.g:6268:1: ( 'struct' )
            // InternalRest.g:6269:2: 'struct'
            {
             before(grammarAccess.getOpDeleteAccess().getStructKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRest.g:6278:1: rule__OpDelete__Group__6 : rule__OpDelete__Group__6__Impl rule__OpDelete__Group__7 ;
    public final void rule__OpDelete__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6282:1: ( rule__OpDelete__Group__6__Impl rule__OpDelete__Group__7 )
            // InternalRest.g:6283:2: rule__OpDelete__Group__6__Impl rule__OpDelete__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalRest.g:6290:1: rule__OpDelete__Group__6__Impl : ( ( rule__OpDelete__StructAssignment_6 ) ) ;
    public final void rule__OpDelete__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6294:1: ( ( ( rule__OpDelete__StructAssignment_6 ) ) )
            // InternalRest.g:6295:1: ( ( rule__OpDelete__StructAssignment_6 ) )
            {
            // InternalRest.g:6295:1: ( ( rule__OpDelete__StructAssignment_6 ) )
            // InternalRest.g:6296:2: ( rule__OpDelete__StructAssignment_6 )
            {
             before(grammarAccess.getOpDeleteAccess().getStructAssignment_6()); 
            // InternalRest.g:6297:2: ( rule__OpDelete__StructAssignment_6 )
            // InternalRest.g:6297:3: rule__OpDelete__StructAssignment_6
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
    // InternalRest.g:6305:1: rule__OpDelete__Group__7 : rule__OpDelete__Group__7__Impl ;
    public final void rule__OpDelete__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6309:1: ( rule__OpDelete__Group__7__Impl )
            // InternalRest.g:6310:2: rule__OpDelete__Group__7__Impl
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
    // InternalRest.g:6316:1: rule__OpDelete__Group__7__Impl : ( '}' ) ;
    public final void rule__OpDelete__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6320:1: ( ( '}' ) )
            // InternalRest.g:6321:1: ( '}' )
            {
            // InternalRest.g:6321:1: ( '}' )
            // InternalRest.g:6322:2: '}'
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
    // InternalRest.g:6332:1: rule__OpDelete__Group_2__0 : rule__OpDelete__Group_2__0__Impl rule__OpDelete__Group_2__1 ;
    public final void rule__OpDelete__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6336:1: ( rule__OpDelete__Group_2__0__Impl rule__OpDelete__Group_2__1 )
            // InternalRest.g:6337:2: rule__OpDelete__Group_2__0__Impl rule__OpDelete__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:6344:1: rule__OpDelete__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__OpDelete__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6348:1: ( ( 'id' ) )
            // InternalRest.g:6349:1: ( 'id' )
            {
            // InternalRest.g:6349:1: ( 'id' )
            // InternalRest.g:6350:2: 'id'
            {
             before(grammarAccess.getOpDeleteAccess().getIdKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRest.g:6359:1: rule__OpDelete__Group_2__1 : rule__OpDelete__Group_2__1__Impl ;
    public final void rule__OpDelete__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6363:1: ( rule__OpDelete__Group_2__1__Impl )
            // InternalRest.g:6364:2: rule__OpDelete__Group_2__1__Impl
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
    // InternalRest.g:6370:1: rule__OpDelete__Group_2__1__Impl : ( ( rule__OpDelete__IdAssignment_2_1 ) ) ;
    public final void rule__OpDelete__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6374:1: ( ( ( rule__OpDelete__IdAssignment_2_1 ) ) )
            // InternalRest.g:6375:1: ( ( rule__OpDelete__IdAssignment_2_1 ) )
            {
            // InternalRest.g:6375:1: ( ( rule__OpDelete__IdAssignment_2_1 ) )
            // InternalRest.g:6376:2: ( rule__OpDelete__IdAssignment_2_1 )
            {
             before(grammarAccess.getOpDeleteAccess().getIdAssignment_2_1()); 
            // InternalRest.g:6377:2: ( rule__OpDelete__IdAssignment_2_1 )
            // InternalRest.g:6377:3: rule__OpDelete__IdAssignment_2_1
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


    // $ANTLR start "rule__OpDelete__Group_3__0"
    // InternalRest.g:6386:1: rule__OpDelete__Group_3__0 : rule__OpDelete__Group_3__0__Impl rule__OpDelete__Group_3__1 ;
    public final void rule__OpDelete__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6390:1: ( rule__OpDelete__Group_3__0__Impl rule__OpDelete__Group_3__1 )
            // InternalRest.g:6391:2: rule__OpDelete__Group_3__0__Impl rule__OpDelete__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__OpDelete__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__Group_3__0"


    // $ANTLR start "rule__OpDelete__Group_3__0__Impl"
    // InternalRest.g:6398:1: rule__OpDelete__Group_3__0__Impl : ( 'failedAnswer' ) ;
    public final void rule__OpDelete__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6402:1: ( ( 'failedAnswer' ) )
            // InternalRest.g:6403:1: ( 'failedAnswer' )
            {
            // InternalRest.g:6403:1: ( 'failedAnswer' )
            // InternalRest.g:6404:2: 'failedAnswer'
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOpDeleteAccess().getFailedAnswerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__Group_3__0__Impl"


    // $ANTLR start "rule__OpDelete__Group_3__1"
    // InternalRest.g:6413:1: rule__OpDelete__Group_3__1 : rule__OpDelete__Group_3__1__Impl ;
    public final void rule__OpDelete__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6417:1: ( rule__OpDelete__Group_3__1__Impl )
            // InternalRest.g:6418:2: rule__OpDelete__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__Group_3__1"


    // $ANTLR start "rule__OpDelete__Group_3__1__Impl"
    // InternalRest.g:6424:1: rule__OpDelete__Group_3__1__Impl : ( ( rule__OpDelete__FailedAnswerAssignment_3_1 ) ) ;
    public final void rule__OpDelete__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6428:1: ( ( ( rule__OpDelete__FailedAnswerAssignment_3_1 ) ) )
            // InternalRest.g:6429:1: ( ( rule__OpDelete__FailedAnswerAssignment_3_1 ) )
            {
            // InternalRest.g:6429:1: ( ( rule__OpDelete__FailedAnswerAssignment_3_1 ) )
            // InternalRest.g:6430:2: ( rule__OpDelete__FailedAnswerAssignment_3_1 )
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerAssignment_3_1()); 
            // InternalRest.g:6431:2: ( rule__OpDelete__FailedAnswerAssignment_3_1 )
            // InternalRest.g:6431:3: rule__OpDelete__FailedAnswerAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__FailedAnswerAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpDeleteAccess().getFailedAnswerAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__Group_3__1__Impl"


    // $ANTLR start "rule__OpDelete__Group_4__0"
    // InternalRest.g:6440:1: rule__OpDelete__Group_4__0 : rule__OpDelete__Group_4__0__Impl rule__OpDelete__Group_4__1 ;
    public final void rule__OpDelete__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6444:1: ( rule__OpDelete__Group_4__0__Impl rule__OpDelete__Group_4__1 )
            // InternalRest.g:6445:2: rule__OpDelete__Group_4__0__Impl rule__OpDelete__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__OpDelete__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpDelete__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__Group_4__0"


    // $ANTLR start "rule__OpDelete__Group_4__0__Impl"
    // InternalRest.g:6452:1: rule__OpDelete__Group_4__0__Impl : ( 'succAnswer' ) ;
    public final void rule__OpDelete__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6456:1: ( ( 'succAnswer' ) )
            // InternalRest.g:6457:1: ( 'succAnswer' )
            {
            // InternalRest.g:6457:1: ( 'succAnswer' )
            // InternalRest.g:6458:2: 'succAnswer'
            {
             before(grammarAccess.getOpDeleteAccess().getSuccAnswerKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOpDeleteAccess().getSuccAnswerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__Group_4__0__Impl"


    // $ANTLR start "rule__OpDelete__Group_4__1"
    // InternalRest.g:6467:1: rule__OpDelete__Group_4__1 : rule__OpDelete__Group_4__1__Impl ;
    public final void rule__OpDelete__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6471:1: ( rule__OpDelete__Group_4__1__Impl )
            // InternalRest.g:6472:2: rule__OpDelete__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__Group_4__1"


    // $ANTLR start "rule__OpDelete__Group_4__1__Impl"
    // InternalRest.g:6478:1: rule__OpDelete__Group_4__1__Impl : ( ( rule__OpDelete__SuccAnswerAssignment_4_1 ) ) ;
    public final void rule__OpDelete__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6482:1: ( ( ( rule__OpDelete__SuccAnswerAssignment_4_1 ) ) )
            // InternalRest.g:6483:1: ( ( rule__OpDelete__SuccAnswerAssignment_4_1 ) )
            {
            // InternalRest.g:6483:1: ( ( rule__OpDelete__SuccAnswerAssignment_4_1 ) )
            // InternalRest.g:6484:2: ( rule__OpDelete__SuccAnswerAssignment_4_1 )
            {
             before(grammarAccess.getOpDeleteAccess().getSuccAnswerAssignment_4_1()); 
            // InternalRest.g:6485:2: ( rule__OpDelete__SuccAnswerAssignment_4_1 )
            // InternalRest.g:6485:3: rule__OpDelete__SuccAnswerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OpDelete__SuccAnswerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOpDeleteAccess().getSuccAnswerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalRest.g:6494:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6498:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRest.g:6499:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRest.g:6506:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6510:1: ( ( ( '-' )? ) )
            // InternalRest.g:6511:1: ( ( '-' )? )
            {
            // InternalRest.g:6511:1: ( ( '-' )? )
            // InternalRest.g:6512:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRest.g:6513:2: ( '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRest.g:6513:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalRest.g:6521:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6525:1: ( rule__EInt__Group__1__Impl )
            // InternalRest.g:6526:2: rule__EInt__Group__1__Impl
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
    // InternalRest.g:6532:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6536:1: ( ( RULE_INT ) )
            // InternalRest.g:6537:1: ( RULE_INT )
            {
            // InternalRest.g:6537:1: ( RULE_INT )
            // InternalRest.g:6538:2: RULE_INT
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


    // $ANTLR start "rule__FieldSet__Group__0"
    // InternalRest.g:6548:1: rule__FieldSet__Group__0 : rule__FieldSet__Group__0__Impl rule__FieldSet__Group__1 ;
    public final void rule__FieldSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6552:1: ( rule__FieldSet__Group__0__Impl rule__FieldSet__Group__1 )
            // InternalRest.g:6553:2: rule__FieldSet__Group__0__Impl rule__FieldSet__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRest.g:6560:1: rule__FieldSet__Group__0__Impl : ( () ) ;
    public final void rule__FieldSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6564:1: ( ( () ) )
            // InternalRest.g:6565:1: ( () )
            {
            // InternalRest.g:6565:1: ( () )
            // InternalRest.g:6566:2: ()
            {
             before(grammarAccess.getFieldSetAccess().getFieldSetAction_0()); 
            // InternalRest.g:6567:2: ()
            // InternalRest.g:6567:3: 
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
    // InternalRest.g:6575:1: rule__FieldSet__Group__1 : rule__FieldSet__Group__1__Impl rule__FieldSet__Group__2 ;
    public final void rule__FieldSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6579:1: ( rule__FieldSet__Group__1__Impl rule__FieldSet__Group__2 )
            // InternalRest.g:6580:2: rule__FieldSet__Group__1__Impl rule__FieldSet__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:6587:1: rule__FieldSet__Group__1__Impl : ( 'FieldSet' ) ;
    public final void rule__FieldSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6591:1: ( ( 'FieldSet' ) )
            // InternalRest.g:6592:1: ( 'FieldSet' )
            {
            // InternalRest.g:6592:1: ( 'FieldSet' )
            // InternalRest.g:6593:2: 'FieldSet'
            {
             before(grammarAccess.getFieldSetAccess().getFieldSetKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalRest.g:6602:1: rule__FieldSet__Group__2 : rule__FieldSet__Group__2__Impl rule__FieldSet__Group__3 ;
    public final void rule__FieldSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6606:1: ( rule__FieldSet__Group__2__Impl rule__FieldSet__Group__3 )
            // InternalRest.g:6607:2: rule__FieldSet__Group__2__Impl rule__FieldSet__Group__3
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
    // InternalRest.g:6614:1: rule__FieldSet__Group__2__Impl : ( ( rule__FieldSet__NameAssignment_2 ) ) ;
    public final void rule__FieldSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6618:1: ( ( ( rule__FieldSet__NameAssignment_2 ) ) )
            // InternalRest.g:6619:1: ( ( rule__FieldSet__NameAssignment_2 ) )
            {
            // InternalRest.g:6619:1: ( ( rule__FieldSet__NameAssignment_2 ) )
            // InternalRest.g:6620:2: ( rule__FieldSet__NameAssignment_2 )
            {
             before(grammarAccess.getFieldSetAccess().getNameAssignment_2()); 
            // InternalRest.g:6621:2: ( rule__FieldSet__NameAssignment_2 )
            // InternalRest.g:6621:3: rule__FieldSet__NameAssignment_2
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
    // InternalRest.g:6629:1: rule__FieldSet__Group__3 : rule__FieldSet__Group__3__Impl rule__FieldSet__Group__4 ;
    public final void rule__FieldSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6633:1: ( rule__FieldSet__Group__3__Impl rule__FieldSet__Group__4 )
            // InternalRest.g:6634:2: rule__FieldSet__Group__3__Impl rule__FieldSet__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalRest.g:6641:1: rule__FieldSet__Group__3__Impl : ( '{' ) ;
    public final void rule__FieldSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6645:1: ( ( '{' ) )
            // InternalRest.g:6646:1: ( '{' )
            {
            // InternalRest.g:6646:1: ( '{' )
            // InternalRest.g:6647:2: '{'
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
    // InternalRest.g:6656:1: rule__FieldSet__Group__4 : rule__FieldSet__Group__4__Impl rule__FieldSet__Group__5 ;
    public final void rule__FieldSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6660:1: ( rule__FieldSet__Group__4__Impl rule__FieldSet__Group__5 )
            // InternalRest.g:6661:2: rule__FieldSet__Group__4__Impl rule__FieldSet__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalRest.g:6668:1: rule__FieldSet__Group__4__Impl : ( ( rule__FieldSet__Group_4__0 )? ) ;
    public final void rule__FieldSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6672:1: ( ( ( rule__FieldSet__Group_4__0 )? ) )
            // InternalRest.g:6673:1: ( ( rule__FieldSet__Group_4__0 )? )
            {
            // InternalRest.g:6673:1: ( ( rule__FieldSet__Group_4__0 )? )
            // InternalRest.g:6674:2: ( rule__FieldSet__Group_4__0 )?
            {
             before(grammarAccess.getFieldSetAccess().getGroup_4()); 
            // InternalRest.g:6675:2: ( rule__FieldSet__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRest.g:6675:3: rule__FieldSet__Group_4__0
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
    // InternalRest.g:6683:1: rule__FieldSet__Group__5 : rule__FieldSet__Group__5__Impl ;
    public final void rule__FieldSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6687:1: ( rule__FieldSet__Group__5__Impl )
            // InternalRest.g:6688:2: rule__FieldSet__Group__5__Impl
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
    // InternalRest.g:6694:1: rule__FieldSet__Group__5__Impl : ( '}' ) ;
    public final void rule__FieldSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6698:1: ( ( '}' ) )
            // InternalRest.g:6699:1: ( '}' )
            {
            // InternalRest.g:6699:1: ( '}' )
            // InternalRest.g:6700:2: '}'
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
    // InternalRest.g:6710:1: rule__FieldSet__Group_4__0 : rule__FieldSet__Group_4__0__Impl rule__FieldSet__Group_4__1 ;
    public final void rule__FieldSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6714:1: ( rule__FieldSet__Group_4__0__Impl rule__FieldSet__Group_4__1 )
            // InternalRest.g:6715:2: rule__FieldSet__Group_4__0__Impl rule__FieldSet__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRest.g:6722:1: rule__FieldSet__Group_4__0__Impl : ( 'expr' ) ;
    public final void rule__FieldSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6726:1: ( ( 'expr' ) )
            // InternalRest.g:6727:1: ( 'expr' )
            {
            // InternalRest.g:6727:1: ( 'expr' )
            // InternalRest.g:6728:2: 'expr'
            {
             before(grammarAccess.getFieldSetAccess().getExprKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalRest.g:6737:1: rule__FieldSet__Group_4__1 : rule__FieldSet__Group_4__1__Impl ;
    public final void rule__FieldSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6741:1: ( rule__FieldSet__Group_4__1__Impl )
            // InternalRest.g:6742:2: rule__FieldSet__Group_4__1__Impl
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
    // InternalRest.g:6748:1: rule__FieldSet__Group_4__1__Impl : ( ( rule__FieldSet__ExprAssignment_4_1 ) ) ;
    public final void rule__FieldSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6752:1: ( ( ( rule__FieldSet__ExprAssignment_4_1 ) ) )
            // InternalRest.g:6753:1: ( ( rule__FieldSet__ExprAssignment_4_1 ) )
            {
            // InternalRest.g:6753:1: ( ( rule__FieldSet__ExprAssignment_4_1 ) )
            // InternalRest.g:6754:2: ( rule__FieldSet__ExprAssignment_4_1 )
            {
             before(grammarAccess.getFieldSetAccess().getExprAssignment_4_1()); 
            // InternalRest.g:6755:2: ( rule__FieldSet__ExprAssignment_4_1 )
            // InternalRest.g:6755:3: rule__FieldSet__ExprAssignment_4_1
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


    // $ANTLR start "rule__RestSystem__RequestAssignment_3_2"
    // InternalRest.g:6764:1: rule__RestSystem__RequestAssignment_3_2 : ( ruleRequest ) ;
    public final void rule__RestSystem__RequestAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6768:1: ( ( ruleRequest ) )
            // InternalRest.g:6769:2: ( ruleRequest )
            {
            // InternalRest.g:6769:2: ( ruleRequest )
            // InternalRest.g:6770:3: ruleRequest
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
    // InternalRest.g:6779:1: rule__RestSystem__RequestAssignment_3_3_1 : ( ruleRequest ) ;
    public final void rule__RestSystem__RequestAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6783:1: ( ( ruleRequest ) )
            // InternalRest.g:6784:2: ( ruleRequest )
            {
            // InternalRest.g:6784:2: ( ruleRequest )
            // InternalRest.g:6785:3: ruleRequest
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


    // $ANTLR start "rule__Route__SegmentAssignment_4"
    // InternalRest.g:6794:1: rule__Route__SegmentAssignment_4 : ( ruleSegment ) ;
    public final void rule__Route__SegmentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6798:1: ( ( ruleSegment ) )
            // InternalRest.g:6799:2: ( ruleSegment )
            {
            // InternalRest.g:6799:2: ( ruleSegment )
            // InternalRest.g:6800:3: ruleSegment
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
    // InternalRest.g:6809:1: rule__Route__SegmentAssignment_5_1 : ( ruleSegment ) ;
    public final void rule__Route__SegmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6813:1: ( ( ruleSegment ) )
            // InternalRest.g:6814:2: ( ruleSegment )
            {
            // InternalRest.g:6814:2: ( ruleSegment )
            // InternalRest.g:6815:3: ruleSegment
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


    // $ANTLR start "rule__ReGet__RouteAssignment_3"
    // InternalRest.g:6824:1: rule__ReGet__RouteAssignment_3 : ( ruleRoute ) ;
    public final void rule__ReGet__RouteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6828:1: ( ( ruleRoute ) )
            // InternalRest.g:6829:2: ( ruleRoute )
            {
            // InternalRest.g:6829:2: ( ruleRoute )
            // InternalRest.g:6830:3: ruleRoute
            {
             before(grammarAccess.getReGetAccess().getRouteRouteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getRouteRouteParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__RouteAssignment_3"


    // $ANTLR start "rule__ReGet__DataAssignment_4_2"
    // InternalRest.g:6839:1: rule__ReGet__DataAssignment_4_2 : ( ruleData ) ;
    public final void rule__ReGet__DataAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6843:1: ( ( ruleData ) )
            // InternalRest.g:6844:2: ( ruleData )
            {
            // InternalRest.g:6844:2: ( ruleData )
            // InternalRest.g:6845:3: ruleData
            {
             before(grammarAccess.getReGetAccess().getDataDataParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getDataDataParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__DataAssignment_4_2"


    // $ANTLR start "rule__ReGet__DataAssignment_4_3_1"
    // InternalRest.g:6854:1: rule__ReGet__DataAssignment_4_3_1 : ( ruleData ) ;
    public final void rule__ReGet__DataAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6858:1: ( ( ruleData ) )
            // InternalRest.g:6859:2: ( ruleData )
            {
            // InternalRest.g:6859:2: ( ruleData )
            // InternalRest.g:6860:3: ruleData
            {
             before(grammarAccess.getReGetAccess().getDataDataParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getDataDataParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__DataAssignment_4_3_1"


    // $ANTLR start "rule__ReGet__OpsAssignment_5_2"
    // InternalRest.g:6869:1: rule__ReGet__OpsAssignment_5_2 : ( ruleOperation ) ;
    public final void rule__ReGet__OpsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6873:1: ( ( ruleOperation ) )
            // InternalRest.g:6874:2: ( ruleOperation )
            {
            // InternalRest.g:6874:2: ( ruleOperation )
            // InternalRest.g:6875:3: ruleOperation
            {
             before(grammarAccess.getReGetAccess().getOpsOperationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getOpsOperationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__OpsAssignment_5_2"


    // $ANTLR start "rule__ReGet__OpsAssignment_5_3_1"
    // InternalRest.g:6884:1: rule__ReGet__OpsAssignment_5_3_1 : ( ruleOperation ) ;
    public final void rule__ReGet__OpsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6888:1: ( ( ruleOperation ) )
            // InternalRest.g:6889:2: ( ruleOperation )
            {
            // InternalRest.g:6889:2: ( ruleOperation )
            // InternalRest.g:6890:3: ruleOperation
            {
             before(grammarAccess.getReGetAccess().getOpsOperationParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getReGetAccess().getOpsOperationParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReGet__OpsAssignment_5_3_1"


    // $ANTLR start "rule__RePost__RouteAssignment_3"
    // InternalRest.g:6899:1: rule__RePost__RouteAssignment_3 : ( ruleRoute ) ;
    public final void rule__RePost__RouteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6903:1: ( ( ruleRoute ) )
            // InternalRest.g:6904:2: ( ruleRoute )
            {
            // InternalRest.g:6904:2: ( ruleRoute )
            // InternalRest.g:6905:3: ruleRoute
            {
             before(grammarAccess.getRePostAccess().getRouteRouteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getRouteRouteParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__RouteAssignment_3"


    // $ANTLR start "rule__RePost__DataAssignment_4_2"
    // InternalRest.g:6914:1: rule__RePost__DataAssignment_4_2 : ( ruleData ) ;
    public final void rule__RePost__DataAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6918:1: ( ( ruleData ) )
            // InternalRest.g:6919:2: ( ruleData )
            {
            // InternalRest.g:6919:2: ( ruleData )
            // InternalRest.g:6920:3: ruleData
            {
             before(grammarAccess.getRePostAccess().getDataDataParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getDataDataParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__DataAssignment_4_2"


    // $ANTLR start "rule__RePost__DataAssignment_4_3_1"
    // InternalRest.g:6929:1: rule__RePost__DataAssignment_4_3_1 : ( ruleData ) ;
    public final void rule__RePost__DataAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6933:1: ( ( ruleData ) )
            // InternalRest.g:6934:2: ( ruleData )
            {
            // InternalRest.g:6934:2: ( ruleData )
            // InternalRest.g:6935:3: ruleData
            {
             before(grammarAccess.getRePostAccess().getDataDataParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getDataDataParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__DataAssignment_4_3_1"


    // $ANTLR start "rule__RePost__OpsAssignment_5_2"
    // InternalRest.g:6944:1: rule__RePost__OpsAssignment_5_2 : ( ruleOperation ) ;
    public final void rule__RePost__OpsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6948:1: ( ( ruleOperation ) )
            // InternalRest.g:6949:2: ( ruleOperation )
            {
            // InternalRest.g:6949:2: ( ruleOperation )
            // InternalRest.g:6950:3: ruleOperation
            {
             before(grammarAccess.getRePostAccess().getOpsOperationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getOpsOperationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__OpsAssignment_5_2"


    // $ANTLR start "rule__RePost__OpsAssignment_5_3_1"
    // InternalRest.g:6959:1: rule__RePost__OpsAssignment_5_3_1 : ( ruleOperation ) ;
    public final void rule__RePost__OpsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6963:1: ( ( ruleOperation ) )
            // InternalRest.g:6964:2: ( ruleOperation )
            {
            // InternalRest.g:6964:2: ( ruleOperation )
            // InternalRest.g:6965:3: ruleOperation
            {
             before(grammarAccess.getRePostAccess().getOpsOperationParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRePostAccess().getOpsOperationParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePost__OpsAssignment_5_3_1"


    // $ANTLR start "rule__RePut__RouteAssignment_3"
    // InternalRest.g:6974:1: rule__RePut__RouteAssignment_3 : ( ruleRoute ) ;
    public final void rule__RePut__RouteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6978:1: ( ( ruleRoute ) )
            // InternalRest.g:6979:2: ( ruleRoute )
            {
            // InternalRest.g:6979:2: ( ruleRoute )
            // InternalRest.g:6980:3: ruleRoute
            {
             before(grammarAccess.getRePutAccess().getRouteRouteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getRouteRouteParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__RouteAssignment_3"


    // $ANTLR start "rule__RePut__DataAssignment_4_2"
    // InternalRest.g:6989:1: rule__RePut__DataAssignment_4_2 : ( ruleData ) ;
    public final void rule__RePut__DataAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:6993:1: ( ( ruleData ) )
            // InternalRest.g:6994:2: ( ruleData )
            {
            // InternalRest.g:6994:2: ( ruleData )
            // InternalRest.g:6995:3: ruleData
            {
             before(grammarAccess.getRePutAccess().getDataDataParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getDataDataParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__DataAssignment_4_2"


    // $ANTLR start "rule__RePut__DataAssignment_4_3_1"
    // InternalRest.g:7004:1: rule__RePut__DataAssignment_4_3_1 : ( ruleData ) ;
    public final void rule__RePut__DataAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7008:1: ( ( ruleData ) )
            // InternalRest.g:7009:2: ( ruleData )
            {
            // InternalRest.g:7009:2: ( ruleData )
            // InternalRest.g:7010:3: ruleData
            {
             before(grammarAccess.getRePutAccess().getDataDataParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getDataDataParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__DataAssignment_4_3_1"


    // $ANTLR start "rule__RePut__OpsAssignment_5_2"
    // InternalRest.g:7019:1: rule__RePut__OpsAssignment_5_2 : ( ruleOperation ) ;
    public final void rule__RePut__OpsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7023:1: ( ( ruleOperation ) )
            // InternalRest.g:7024:2: ( ruleOperation )
            {
            // InternalRest.g:7024:2: ( ruleOperation )
            // InternalRest.g:7025:3: ruleOperation
            {
             before(grammarAccess.getRePutAccess().getOpsOperationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getOpsOperationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__OpsAssignment_5_2"


    // $ANTLR start "rule__RePut__OpsAssignment_5_3_1"
    // InternalRest.g:7034:1: rule__RePut__OpsAssignment_5_3_1 : ( ruleOperation ) ;
    public final void rule__RePut__OpsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7038:1: ( ( ruleOperation ) )
            // InternalRest.g:7039:2: ( ruleOperation )
            {
            // InternalRest.g:7039:2: ( ruleOperation )
            // InternalRest.g:7040:3: ruleOperation
            {
             before(grammarAccess.getRePutAccess().getOpsOperationParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRePutAccess().getOpsOperationParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RePut__OpsAssignment_5_3_1"


    // $ANTLR start "rule__ReDelete__RouteAssignment_3"
    // InternalRest.g:7049:1: rule__ReDelete__RouteAssignment_3 : ( ruleRoute ) ;
    public final void rule__ReDelete__RouteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7053:1: ( ( ruleRoute ) )
            // InternalRest.g:7054:2: ( ruleRoute )
            {
            // InternalRest.g:7054:2: ( ruleRoute )
            // InternalRest.g:7055:3: ruleRoute
            {
             before(grammarAccess.getReDeleteAccess().getRouteRouteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getRouteRouteParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__RouteAssignment_3"


    // $ANTLR start "rule__ReDelete__DataAssignment_4_2"
    // InternalRest.g:7064:1: rule__ReDelete__DataAssignment_4_2 : ( ruleData ) ;
    public final void rule__ReDelete__DataAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7068:1: ( ( ruleData ) )
            // InternalRest.g:7069:2: ( ruleData )
            {
            // InternalRest.g:7069:2: ( ruleData )
            // InternalRest.g:7070:3: ruleData
            {
             before(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__DataAssignment_4_2"


    // $ANTLR start "rule__ReDelete__DataAssignment_4_3_1"
    // InternalRest.g:7079:1: rule__ReDelete__DataAssignment_4_3_1 : ( ruleData ) ;
    public final void rule__ReDelete__DataAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7083:1: ( ( ruleData ) )
            // InternalRest.g:7084:2: ( ruleData )
            {
            // InternalRest.g:7084:2: ( ruleData )
            // InternalRest.g:7085:3: ruleData
            {
             before(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getDataDataParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__DataAssignment_4_3_1"


    // $ANTLR start "rule__ReDelete__OpsAssignment_5_2"
    // InternalRest.g:7094:1: rule__ReDelete__OpsAssignment_5_2 : ( ruleOperation ) ;
    public final void rule__ReDelete__OpsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7098:1: ( ( ruleOperation ) )
            // InternalRest.g:7099:2: ( ruleOperation )
            {
            // InternalRest.g:7099:2: ( ruleOperation )
            // InternalRest.g:7100:3: ruleOperation
            {
             before(grammarAccess.getReDeleteAccess().getOpsOperationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getOpsOperationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__OpsAssignment_5_2"


    // $ANTLR start "rule__ReDelete__OpsAssignment_5_3_1"
    // InternalRest.g:7109:1: rule__ReDelete__OpsAssignment_5_3_1 : ( ruleOperation ) ;
    public final void rule__ReDelete__OpsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7113:1: ( ( ruleOperation ) )
            // InternalRest.g:7114:2: ( ruleOperation )
            {
            // InternalRest.g:7114:2: ( ruleOperation )
            // InternalRest.g:7115:3: ruleOperation
            {
             before(grammarAccess.getReDeleteAccess().getOpsOperationParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getReDeleteAccess().getOpsOperationParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDelete__OpsAssignment_5_3_1"


    // $ANTLR start "rule__Segment__ValueAssignment_3_1"
    // InternalRest.g:7124:1: rule__Segment__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Segment__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7128:1: ( ( ruleEString ) )
            // InternalRest.g:7129:2: ( ruleEString )
            {
            // InternalRest.g:7129:2: ( ruleEString )
            // InternalRest.g:7130:3: ruleEString
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
    // InternalRest.g:7139:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7143:1: ( ( ruleEString ) )
            // InternalRest.g:7144:2: ( ruleEString )
            {
            // InternalRest.g:7144:2: ( ruleEString )
            // InternalRest.g:7145:3: ruleEString
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
    // InternalRest.g:7154:1: rule__Attachments__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Attachments__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7158:1: ( ( ruleEString ) )
            // InternalRest.g:7159:2: ( ruleEString )
            {
            // InternalRest.g:7159:2: ( ruleEString )
            // InternalRest.g:7160:3: ruleEString
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
    // InternalRest.g:7169:1: rule__Random__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Random__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7173:1: ( ( ruleEString ) )
            // InternalRest.g:7174:2: ( ruleEString )
            {
            // InternalRest.g:7174:2: ( ruleEString )
            // InternalRest.g:7175:3: ruleEString
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


    // $ANTLR start "rule__Answer__StatusAssignment_3_1"
    // InternalRest.g:7184:1: rule__Answer__StatusAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Answer__StatusAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7188:1: ( ( ruleEInt ) )
            // InternalRest.g:7189:2: ( ruleEInt )
            {
            // InternalRest.g:7189:2: ( ruleEInt )
            // InternalRest.g:7190:3: ruleEInt
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
    // InternalRest.g:7199:1: rule__Answer__ReturnAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Answer__ReturnAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7203:1: ( ( ruleEString ) )
            // InternalRest.g:7204:2: ( ruleEString )
            {
            // InternalRest.g:7204:2: ( ruleEString )
            // InternalRest.g:7205:3: ruleEString
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


    // $ANTLR start "rule__Struct__FieldsAssignment_3_1"
    // InternalRest.g:7214:1: rule__Struct__FieldsAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Struct__FieldsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7218:1: ( ( ruleEString ) )
            // InternalRest.g:7219:2: ( ruleEString )
            {
            // InternalRest.g:7219:2: ( ruleEString )
            // InternalRest.g:7220:3: ruleEString
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


    // $ANTLR start "rule__OpCreate__IdAssignment_2_1"
    // InternalRest.g:7229:1: rule__OpCreate__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpCreate__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7233:1: ( ( ruleEString ) )
            // InternalRest.g:7234:2: ( ruleEString )
            {
            // InternalRest.g:7234:2: ( ruleEString )
            // InternalRest.g:7235:3: ruleEString
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


    // $ANTLR start "rule__OpCreate__FailedAnswerAssignment_3_1"
    // InternalRest.g:7244:1: rule__OpCreate__FailedAnswerAssignment_3_1 : ( ruleAnswer ) ;
    public final void rule__OpCreate__FailedAnswerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7248:1: ( ( ruleAnswer ) )
            // InternalRest.g:7249:2: ( ruleAnswer )
            {
            // InternalRest.g:7249:2: ( ruleAnswer )
            // InternalRest.g:7250:3: ruleAnswer
            {
             before(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getFailedAnswerAnswerParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__FailedAnswerAssignment_3_1"


    // $ANTLR start "rule__OpCreate__SuccAnswerAssignment_4_1"
    // InternalRest.g:7259:1: rule__OpCreate__SuccAnswerAssignment_4_1 : ( ruleAnswer ) ;
    public final void rule__OpCreate__SuccAnswerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7263:1: ( ( ruleAnswer ) )
            // InternalRest.g:7264:2: ( ruleAnswer )
            {
            // InternalRest.g:7264:2: ( ruleAnswer )
            // InternalRest.g:7265:3: ruleAnswer
            {
             before(grammarAccess.getOpCreateAccess().getSuccAnswerAnswerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getSuccAnswerAnswerParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpCreate__SuccAnswerAssignment_4_1"


    // $ANTLR start "rule__OpCreate__StructAssignment_6"
    // InternalRest.g:7274:1: rule__OpCreate__StructAssignment_6 : ( ruleStruct ) ;
    public final void rule__OpCreate__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7278:1: ( ( ruleStruct ) )
            // InternalRest.g:7279:2: ( ruleStruct )
            {
            // InternalRest.g:7279:2: ( ruleStruct )
            // InternalRest.g:7280:3: ruleStruct
            {
             before(grammarAccess.getOpCreateAccess().getStructStructParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getOpCreateAccess().getStructStructParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalRest.g:7289:1: rule__OpCreate__FieldsetAssignment_7_2 : ( ruleFieldSet ) ;
    public final void rule__OpCreate__FieldsetAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7293:1: ( ( ruleFieldSet ) )
            // InternalRest.g:7294:2: ( ruleFieldSet )
            {
            // InternalRest.g:7294:2: ( ruleFieldSet )
            // InternalRest.g:7295:3: ruleFieldSet
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
    // InternalRest.g:7304:1: rule__OpCreate__FieldsetAssignment_7_3_1 : ( ruleFieldSet ) ;
    public final void rule__OpCreate__FieldsetAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7308:1: ( ( ruleFieldSet ) )
            // InternalRest.g:7309:2: ( ruleFieldSet )
            {
            // InternalRest.g:7309:2: ( ruleFieldSet )
            // InternalRest.g:7310:3: ruleFieldSet
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


    // $ANTLR start "rule__OpRead__FieldsAssignment_2_1"
    // InternalRest.g:7319:1: rule__OpRead__FieldsAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpRead__FieldsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7323:1: ( ( ruleEString ) )
            // InternalRest.g:7324:2: ( ruleEString )
            {
            // InternalRest.g:7324:2: ( ruleEString )
            // InternalRest.g:7325:3: ruleEString
            {
             before(grammarAccess.getOpReadAccess().getFieldsEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getFieldsEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__FieldsAssignment_2_1"


    // $ANTLR start "rule__OpRead__IdAssignment_3_1"
    // InternalRest.g:7334:1: rule__OpRead__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__OpRead__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7338:1: ( ( ruleEString ) )
            // InternalRest.g:7339:2: ( ruleEString )
            {
            // InternalRest.g:7339:2: ( ruleEString )
            // InternalRest.g:7340:3: ruleEString
            {
             before(grammarAccess.getOpReadAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getIdEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__IdAssignment_3_1"


    // $ANTLR start "rule__OpRead__FailedAnswerAssignment_4_1"
    // InternalRest.g:7349:1: rule__OpRead__FailedAnswerAssignment_4_1 : ( ruleAnswer ) ;
    public final void rule__OpRead__FailedAnswerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7353:1: ( ( ruleAnswer ) )
            // InternalRest.g:7354:2: ( ruleAnswer )
            {
            // InternalRest.g:7354:2: ( ruleAnswer )
            // InternalRest.g:7355:3: ruleAnswer
            {
             before(grammarAccess.getOpReadAccess().getFailedAnswerAnswerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getFailedAnswerAnswerParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__FailedAnswerAssignment_4_1"


    // $ANTLR start "rule__OpRead__SuccAnswerAssignment_5_1"
    // InternalRest.g:7364:1: rule__OpRead__SuccAnswerAssignment_5_1 : ( ruleAnswer ) ;
    public final void rule__OpRead__SuccAnswerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7368:1: ( ( ruleAnswer ) )
            // InternalRest.g:7369:2: ( ruleAnswer )
            {
            // InternalRest.g:7369:2: ( ruleAnswer )
            // InternalRest.g:7370:3: ruleAnswer
            {
             before(grammarAccess.getOpReadAccess().getSuccAnswerAnswerParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getSuccAnswerAnswerParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__SuccAnswerAssignment_5_1"


    // $ANTLR start "rule__OpRead__StructAssignment_7"
    // InternalRest.g:7379:1: rule__OpRead__StructAssignment_7 : ( ruleStruct ) ;
    public final void rule__OpRead__StructAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7383:1: ( ( ruleStruct ) )
            // InternalRest.g:7384:2: ( ruleStruct )
            {
            // InternalRest.g:7384:2: ( ruleStruct )
            // InternalRest.g:7385:3: ruleStruct
            {
             before(grammarAccess.getOpReadAccess().getStructStructParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getOpReadAccess().getStructStructParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRead__StructAssignment_7"


    // $ANTLR start "rule__OpUpdate__IdAssignment_2_1"
    // InternalRest.g:7394:1: rule__OpUpdate__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpUpdate__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7398:1: ( ( ruleEString ) )
            // InternalRest.g:7399:2: ( ruleEString )
            {
            // InternalRest.g:7399:2: ( ruleEString )
            // InternalRest.g:7400:3: ruleEString
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


    // $ANTLR start "rule__OpUpdate__FailedAnswerAssignment_3_1"
    // InternalRest.g:7409:1: rule__OpUpdate__FailedAnswerAssignment_3_1 : ( ruleAnswer ) ;
    public final void rule__OpUpdate__FailedAnswerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7413:1: ( ( ruleAnswer ) )
            // InternalRest.g:7414:2: ( ruleAnswer )
            {
            // InternalRest.g:7414:2: ( ruleAnswer )
            // InternalRest.g:7415:3: ruleAnswer
            {
             before(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getFailedAnswerAnswerParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__FailedAnswerAssignment_3_1"


    // $ANTLR start "rule__OpUpdate__SuccAnswerAssignment_4_1"
    // InternalRest.g:7424:1: rule__OpUpdate__SuccAnswerAssignment_4_1 : ( ruleAnswer ) ;
    public final void rule__OpUpdate__SuccAnswerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7428:1: ( ( ruleAnswer ) )
            // InternalRest.g:7429:2: ( ruleAnswer )
            {
            // InternalRest.g:7429:2: ( ruleAnswer )
            // InternalRest.g:7430:3: ruleAnswer
            {
             before(grammarAccess.getOpUpdateAccess().getSuccAnswerAnswerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getSuccAnswerAnswerParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpUpdate__SuccAnswerAssignment_4_1"


    // $ANTLR start "rule__OpUpdate__StructAssignment_6"
    // InternalRest.g:7439:1: rule__OpUpdate__StructAssignment_6 : ( ruleStruct ) ;
    public final void rule__OpUpdate__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7443:1: ( ( ruleStruct ) )
            // InternalRest.g:7444:2: ( ruleStruct )
            {
            // InternalRest.g:7444:2: ( ruleStruct )
            // InternalRest.g:7445:3: ruleStruct
            {
             before(grammarAccess.getOpUpdateAccess().getStructStructParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getOpUpdateAccess().getStructStructParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalRest.g:7454:1: rule__OpUpdate__FieldsetAssignment_7_2 : ( ruleFieldSet ) ;
    public final void rule__OpUpdate__FieldsetAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7458:1: ( ( ruleFieldSet ) )
            // InternalRest.g:7459:2: ( ruleFieldSet )
            {
            // InternalRest.g:7459:2: ( ruleFieldSet )
            // InternalRest.g:7460:3: ruleFieldSet
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
    // InternalRest.g:7469:1: rule__OpUpdate__FieldsetAssignment_7_3_1 : ( ruleFieldSet ) ;
    public final void rule__OpUpdate__FieldsetAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7473:1: ( ( ruleFieldSet ) )
            // InternalRest.g:7474:2: ( ruleFieldSet )
            {
            // InternalRest.g:7474:2: ( ruleFieldSet )
            // InternalRest.g:7475:3: ruleFieldSet
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
    // InternalRest.g:7484:1: rule__OpDelete__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpDelete__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7488:1: ( ( ruleEString ) )
            // InternalRest.g:7489:2: ( ruleEString )
            {
            // InternalRest.g:7489:2: ( ruleEString )
            // InternalRest.g:7490:3: ruleEString
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


    // $ANTLR start "rule__OpDelete__FailedAnswerAssignment_3_1"
    // InternalRest.g:7499:1: rule__OpDelete__FailedAnswerAssignment_3_1 : ( ruleAnswer ) ;
    public final void rule__OpDelete__FailedAnswerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7503:1: ( ( ruleAnswer ) )
            // InternalRest.g:7504:2: ( ruleAnswer )
            {
            // InternalRest.g:7504:2: ( ruleAnswer )
            // InternalRest.g:7505:3: ruleAnswer
            {
             before(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getOpDeleteAccess().getFailedAnswerAnswerParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__FailedAnswerAssignment_3_1"


    // $ANTLR start "rule__OpDelete__SuccAnswerAssignment_4_1"
    // InternalRest.g:7514:1: rule__OpDelete__SuccAnswerAssignment_4_1 : ( ruleAnswer ) ;
    public final void rule__OpDelete__SuccAnswerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7518:1: ( ( ruleAnswer ) )
            // InternalRest.g:7519:2: ( ruleAnswer )
            {
            // InternalRest.g:7519:2: ( ruleAnswer )
            // InternalRest.g:7520:3: ruleAnswer
            {
             before(grammarAccess.getOpDeleteAccess().getSuccAnswerAnswerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getOpDeleteAccess().getSuccAnswerAnswerParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDelete__SuccAnswerAssignment_4_1"


    // $ANTLR start "rule__OpDelete__StructAssignment_6"
    // InternalRest.g:7529:1: rule__OpDelete__StructAssignment_6 : ( ruleStruct ) ;
    public final void rule__OpDelete__StructAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7533:1: ( ( ruleStruct ) )
            // InternalRest.g:7534:2: ( ruleStruct )
            {
            // InternalRest.g:7534:2: ( ruleStruct )
            // InternalRest.g:7535:3: ruleStruct
            {
             before(grammarAccess.getOpDeleteAccess().getStructStructParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getOpDeleteAccess().getStructStructParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalRest.g:7544:1: rule__FieldSet__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FieldSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7548:1: ( ( ruleEString ) )
            // InternalRest.g:7549:2: ( ruleEString )
            {
            // InternalRest.g:7549:2: ( ruleEString )
            // InternalRest.g:7550:3: ruleEString
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
    // InternalRest.g:7559:1: rule__FieldSet__ExprAssignment_4_1 : ( ruleEString ) ;
    public final void rule__FieldSet__ExprAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:7563:1: ( ( ruleEString ) )
            // InternalRest.g:7564:2: ( ruleEString )
            {
            // InternalRest.g:7564:2: ( ruleEString )
            // InternalRest.g:7565:3: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001C40000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000E0800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000F400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000002000L});

}