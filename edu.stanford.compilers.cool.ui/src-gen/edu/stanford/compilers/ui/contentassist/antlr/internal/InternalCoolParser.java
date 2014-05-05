package edu.stanford.compilers.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import edu.stanford.compilers.services.CoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCoolParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'<='", "'='", "'true'", "'false'", "'self'", "'class'", "'{'", "'}'", "';'", "'inherits'", "':'", "'<-'", "'('", "')'", "','", "'not'", "'~'", "'new'", "'.'", "'if'", "'then'", "'fi'", "'else'", "'while'", "'loop'", "'pool'", "'isvoid'", "'let'", "'in'", "'case'", "'of'", "'esac'", "'=>'", "'+'", "'-'", "'*'", "'/'", "'@'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCoolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCoolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCoolParser.tokenNames; }
    public String getGrammarFileName() { return "../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g"; }


     
     	private CoolGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CoolGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProgram"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:61:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:62:1: ( ruleProgram EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:63:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram67);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:70:1: ruleProgram : ( ( rule__Program__ClassesAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:74:2: ( ( ( rule__Program__ClassesAssignment )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:75:1: ( ( rule__Program__ClassesAssignment )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:75:1: ( ( rule__Program__ClassesAssignment )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:76:1: ( rule__Program__ClassesAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesAssignment()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:77:1: ( rule__Program__ClassesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:77:2: rule__Program__ClassesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__ClassesAssignment_in_ruleProgram100);
            	    rule__Program__ClassesAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesAssignment()); 
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleClass_"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:89:1: entryRuleClass_ : ruleClass_ EOF ;
    public final void entryRuleClass_() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:90:1: ( ruleClass_ EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:91:1: ruleClass_ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Rule()); 
            }
            pushFollow(FOLLOW_ruleClass__in_entryRuleClass_128);
            ruleClass_();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Rule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_135); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClass_"


    // $ANTLR start "ruleClass_"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:98:1: ruleClass_ : ( ( rule__Class___Group__0 ) ) ;
    public final void ruleClass_() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:102:2: ( ( ( rule__Class___Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:103:1: ( ( rule__Class___Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:103:1: ( ( rule__Class___Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:104:1: ( rule__Class___Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:105:1: ( rule__Class___Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:105:2: rule__Class___Group__0
            {
            pushFollow(FOLLOW_rule__Class___Group__0_in_ruleClass_161);
            rule__Class___Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getGroup()); 
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
    // $ANTLR end "ruleClass_"


    // $ANTLR start "entryRuleFeature_"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:117:1: entryRuleFeature_ : ruleFeature_ EOF ;
    public final void entryRuleFeature_() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:118:1: ( ruleFeature_ EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:119:1: ruleFeature_ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_Rule()); 
            }
            pushFollow(FOLLOW_ruleFeature__in_entryRuleFeature_188);
            ruleFeature_();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_Rule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_195); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature_"


    // $ANTLR start "ruleFeature_"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:126:1: ruleFeature_ : ( ( rule__Feature___Alternatives ) ) ;
    public final void ruleFeature_() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:130:2: ( ( ( rule__Feature___Alternatives ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:131:1: ( ( rule__Feature___Alternatives ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:131:1: ( ( rule__Feature___Alternatives ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:132:1: ( rule__Feature___Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_Access().getAlternatives()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:133:1: ( rule__Feature___Alternatives )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:133:2: rule__Feature___Alternatives
            {
            pushFollow(FOLLOW_rule__Feature___Alternatives_in_ruleFeature_221);
            rule__Feature___Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_Access().getAlternatives()); 
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
    // $ANTLR end "ruleFeature_"


    // $ANTLR start "entryRuleAttr"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:145:1: entryRuleAttr : ruleAttr EOF ;
    public final void entryRuleAttr() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:146:1: ( ruleAttr EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:147:1: ruleAttr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrRule()); 
            }
            pushFollow(FOLLOW_ruleAttr_in_entryRuleAttr248);
            ruleAttr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttr255); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttr"


    // $ANTLR start "ruleAttr"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:154:1: ruleAttr : ( ( rule__Attr__Group__0 ) ) ;
    public final void ruleAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:158:2: ( ( ( rule__Attr__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:159:1: ( ( rule__Attr__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:159:1: ( ( rule__Attr__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:160:1: ( rule__Attr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:161:1: ( rule__Attr__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:161:2: rule__Attr__Group__0
            {
            pushFollow(FOLLOW_rule__Attr__Group__0_in_ruleAttr281);
            rule__Attr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getGroup()); 
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
    // $ANTLR end "ruleAttr"


    // $ANTLR start "entryRuleMethod"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:173:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:174:1: ( ruleMethod EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:175:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod308);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod315); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:182:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:186:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:187:1: ( ( rule__Method__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:187:1: ( ( rule__Method__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:188:1: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:189:1: ( rule__Method__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:189:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod341);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleFormal"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:201:1: entryRuleFormal : ruleFormal EOF ;
    public final void entryRuleFormal() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:202:1: ( ruleFormal EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:203:1: ruleFormal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalRule()); 
            }
            pushFollow(FOLLOW_ruleFormal_in_entryRuleFormal368);
            ruleFormal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormal375); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFormal"


    // $ANTLR start "ruleFormal"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:210:1: ruleFormal : ( ( rule__Formal__Group__0 ) ) ;
    public final void ruleFormal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:214:2: ( ( ( rule__Formal__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:215:1: ( ( rule__Formal__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:215:1: ( ( rule__Formal__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:216:1: ( rule__Formal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:217:1: ( rule__Formal__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:217:2: rule__Formal__Group__0
            {
            pushFollow(FOLLOW_rule__Formal__Group__0_in_ruleFormal401);
            rule__Formal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalAccess().getGroup()); 
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
    // $ANTLR end "ruleFormal"


    // $ANTLR start "entryRuleExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:229:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:230:1: ( ruleExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:231:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression428);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression435); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:238:1: ruleExpression : ( ruleCompareExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:242:2: ( ( ruleCompareExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:243:1: ( ruleCompareExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:243:1: ( ruleCompareExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:244:1: ruleCompareExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCompareExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_ruleExpression461);
            ruleCompareExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCompareExpressionParserRuleCall()); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:257:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:258:1: ( rulePrimaryExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:259:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression487);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression494); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:266:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:270:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:271:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:271:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:272:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:273:1: ( rule__PrimaryExpression__Alternatives )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:273:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression520);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleSelfTypeLiteral"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:285:1: entryRuleSelfTypeLiteral : ruleSelfTypeLiteral EOF ;
    public final void entryRuleSelfTypeLiteral() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:286:1: ( ruleSelfTypeLiteral EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:287:1: ruleSelfTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleSelfTypeLiteral_in_entryRuleSelfTypeLiteral547);
            ruleSelfTypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfTypeLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfTypeLiteral554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSelfTypeLiteral"


    // $ANTLR start "ruleSelfTypeLiteral"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:294:1: ruleSelfTypeLiteral : ( ( rule__SelfTypeLiteral__Group__0 ) ) ;
    public final void ruleSelfTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:298:2: ( ( ( rule__SelfTypeLiteral__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:299:1: ( ( rule__SelfTypeLiteral__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:299:1: ( ( rule__SelfTypeLiteral__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:300:1: ( rule__SelfTypeLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfTypeLiteralAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:301:1: ( rule__SelfTypeLiteral__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:301:2: rule__SelfTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__SelfTypeLiteral__Group__0_in_ruleSelfTypeLiteral580);
            rule__SelfTypeLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfTypeLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleSelfTypeLiteral"


    // $ANTLR start "entryRuleIdentifierRefExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:313:1: entryRuleIdentifierRefExpression : ruleIdentifierRefExpression EOF ;
    public final void entryRuleIdentifierRefExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:314:1: ( ruleIdentifierRefExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:315:1: ruleIdentifierRefExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRefExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierRefExpression_in_entryRuleIdentifierRefExpression607);
            ruleIdentifierRefExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierRefExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierRefExpression614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIdentifierRefExpression"


    // $ANTLR start "ruleIdentifierRefExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:322:1: ruleIdentifierRefExpression : ( ( rule__IdentifierRefExpression__IdAssignment ) ) ;
    public final void ruleIdentifierRefExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:326:2: ( ( ( rule__IdentifierRefExpression__IdAssignment ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:327:1: ( ( rule__IdentifierRefExpression__IdAssignment ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:327:1: ( ( rule__IdentifierRefExpression__IdAssignment ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:328:1: ( rule__IdentifierRefExpression__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRefExpressionAccess().getIdAssignment()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:329:1: ( rule__IdentifierRefExpression__IdAssignment )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:329:2: rule__IdentifierRefExpression__IdAssignment
            {
            pushFollow(FOLLOW_rule__IdentifierRefExpression__IdAssignment_in_ruleIdentifierRefExpression640);
            rule__IdentifierRefExpression__IdAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierRefExpressionAccess().getIdAssignment()); 
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
    // $ANTLR end "ruleIdentifierRefExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:341:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:342:1: ( ruleLiteral EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:343:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral667);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:350:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:354:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:355:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:355:1: ( ( rule__Literal__Alternatives ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:356:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:357:1: ( rule__Literal__Alternatives )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:357:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral700);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:369:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:370:1: ( ruleNumberLiteral EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:371:1: ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral727);
            ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral734); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:378:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:382:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:383:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:383:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:384:1: ( rule__NumberLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:385:1: ( rule__NumberLiteral__ValueAssignment )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:385:2: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_in_ruleNumberLiteral760);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:397:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:398:1: ( ruleStringLiteral EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:399:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral787);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral794); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:406:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:410:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:411:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:411:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:412:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:413:1: ( rule__StringLiteral__ValueAssignment )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:413:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral820);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:425:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:426:1: ( ruleBooleanLiteral EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:427:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral847);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:434:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:438:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:439:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:439:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:440:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:441:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:441:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral880);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleParenExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:453:1: entryRuleParenExpression : ruleParenExpression EOF ;
    public final void entryRuleParenExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:454:1: ( ruleParenExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:455:1: ruleParenExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenExpression_in_entryRuleParenExpression907);
            ruleParenExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenExpression914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParenExpression"


    // $ANTLR start "ruleParenExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:462:1: ruleParenExpression : ( ( rule__ParenExpression__Group__0 ) ) ;
    public final void ruleParenExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:466:2: ( ( ( rule__ParenExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:467:1: ( ( rule__ParenExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:467:1: ( ( rule__ParenExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:468:1: ( rule__ParenExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:469:1: ( rule__ParenExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:469:2: rule__ParenExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParenExpression__Group__0_in_ruleParenExpression940);
            rule__ParenExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleParenExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:481:1: entryRuleAssignmentExpression : ruleAssignmentExpression EOF ;
    public final void entryRuleAssignmentExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:482:1: ( ruleAssignmentExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:483:1: ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression967);
            ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:490:1: ruleAssignmentExpression : ( ( rule__AssignmentExpression__Group__0 ) ) ;
    public final void ruleAssignmentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:494:2: ( ( ( rule__AssignmentExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:495:1: ( ( rule__AssignmentExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:495:1: ( ( rule__AssignmentExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:496:1: ( rule__AssignmentExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:497:1: ( rule__AssignmentExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:497:2: rule__AssignmentExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__0_in_ruleAssignmentExpression1000);
            rule__AssignmentExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleNegationExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:509:1: entryRuleNegationExpression : ruleNegationExpression EOF ;
    public final void entryRuleNegationExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:510:1: ( ruleNegationExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:511:1: ruleNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression1027);
            ruleNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegationExpression1034); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNegationExpression"


    // $ANTLR start "ruleNegationExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:518:1: ruleNegationExpression : ( ( rule__NegationExpression__Group__0 ) ) ;
    public final void ruleNegationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:522:2: ( ( ( rule__NegationExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:523:1: ( ( rule__NegationExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:523:1: ( ( rule__NegationExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:524:1: ( rule__NegationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:525:1: ( rule__NegationExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:525:2: rule__NegationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group__0_in_ruleNegationExpression1060);
            rule__NegationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleNegationExpression"


    // $ANTLR start "entryRuleIntegerCompositeExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:537:1: entryRuleIntegerCompositeExpression : ruleIntegerCompositeExpression EOF ;
    public final void entryRuleIntegerCompositeExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:538:1: ( ruleIntegerCompositeExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:539:1: ruleIntegerCompositeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerCompositeExpression_in_entryRuleIntegerCompositeExpression1087);
            ruleIntegerCompositeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerCompositeExpression1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntegerCompositeExpression"


    // $ANTLR start "ruleIntegerCompositeExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:546:1: ruleIntegerCompositeExpression : ( ( rule__IntegerCompositeExpression__Group__0 ) ) ;
    public final void ruleIntegerCompositeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:550:2: ( ( ( rule__IntegerCompositeExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:551:1: ( ( rule__IntegerCompositeExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:551:1: ( ( rule__IntegerCompositeExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:552:1: ( rule__IntegerCompositeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:553:1: ( rule__IntegerCompositeExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:553:2: rule__IntegerCompositeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerCompositeExpression__Group__0_in_ruleIntegerCompositeExpression1120);
            rule__IntegerCompositeExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleIntegerCompositeExpression"


    // $ANTLR start "entryRuleNewExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:565:1: entryRuleNewExpression : ruleNewExpression EOF ;
    public final void entryRuleNewExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:566:1: ( ruleNewExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:567:1: ruleNewExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNewExpression_in_entryRuleNewExpression1147);
            ruleNewExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewExpression1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNewExpression"


    // $ANTLR start "ruleNewExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:574:1: ruleNewExpression : ( ( rule__NewExpression__Group__0 ) ) ;
    public final void ruleNewExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:578:2: ( ( ( rule__NewExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:579:1: ( ( rule__NewExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:579:1: ( ( rule__NewExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:580:1: ( rule__NewExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:581:1: ( rule__NewExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:581:2: rule__NewExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NewExpression__Group__0_in_ruleNewExpression1180);
            rule__NewExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleNewExpression"


    // $ANTLR start "entryRuleStaticDispatchExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:593:1: entryRuleStaticDispatchExpression : ruleStaticDispatchExpression EOF ;
    public final void entryRuleStaticDispatchExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:594:1: ( ruleStaticDispatchExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:595:1: ruleStaticDispatchExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStaticDispatchExpression_in_entryRuleStaticDispatchExpression1207);
            ruleStaticDispatchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticDispatchExpression1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStaticDispatchExpression"


    // $ANTLR start "ruleStaticDispatchExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:602:1: ruleStaticDispatchExpression : ( ( rule__StaticDispatchExpression__Group__0 ) ) ;
    public final void ruleStaticDispatchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:606:2: ( ( ( rule__StaticDispatchExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:607:1: ( ( rule__StaticDispatchExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:607:1: ( ( rule__StaticDispatchExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:608:1: ( rule__StaticDispatchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:609:1: ( rule__StaticDispatchExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:609:2: rule__StaticDispatchExpression__Group__0
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__0_in_ruleStaticDispatchExpression1240);
            rule__StaticDispatchExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleStaticDispatchExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:621:1: entryRuleConditionalExpression : ruleConditionalExpression EOF ;
    public final void entryRuleConditionalExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:622:1: ( ruleConditionalExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:623:1: ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression1267);
            ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:630:1: ruleConditionalExpression : ( ( rule__ConditionalExpression__Group__0 ) ) ;
    public final void ruleConditionalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:634:2: ( ( ( rule__ConditionalExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:635:1: ( ( rule__ConditionalExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:635:1: ( ( rule__ConditionalExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:636:1: ( rule__ConditionalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:637:1: ( rule__ConditionalExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:637:2: rule__ConditionalExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__0_in_ruleConditionalExpression1300);
            rule__ConditionalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleLoopExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:649:1: entryRuleLoopExpression : ruleLoopExpression EOF ;
    public final void entryRuleLoopExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:650:1: ( ruleLoopExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:651:1: ruleLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLoopExpression_in_entryRuleLoopExpression1327);
            ruleLoopExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopExpression1334); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLoopExpression"


    // $ANTLR start "ruleLoopExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:658:1: ruleLoopExpression : ( ( rule__LoopExpression__Group__0 ) ) ;
    public final void ruleLoopExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:662:2: ( ( ( rule__LoopExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:663:1: ( ( rule__LoopExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:663:1: ( ( rule__LoopExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:664:1: ( rule__LoopExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:665:1: ( rule__LoopExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:665:2: rule__LoopExpression__Group__0
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__0_in_ruleLoopExpression1360);
            rule__LoopExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleLoopExpression"


    // $ANTLR start "entryRuleBlockExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:677:1: entryRuleBlockExpression : ruleBlockExpression EOF ;
    public final void entryRuleBlockExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:678:1: ( ruleBlockExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:679:1: ruleBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression1387);
            ruleBlockExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockExpression1394); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:686:1: ruleBlockExpression : ( ( rule__BlockExpression__Group__0 ) ) ;
    public final void ruleBlockExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:690:2: ( ( ( rule__BlockExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:691:1: ( ( rule__BlockExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:691:1: ( ( rule__BlockExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:692:1: ( rule__BlockExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:693:1: ( rule__BlockExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:693:2: rule__BlockExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__0_in_ruleBlockExpression1420);
            rule__BlockExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleIsvoidExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:705:1: entryRuleIsvoidExpression : ruleIsvoidExpression EOF ;
    public final void entryRuleIsvoidExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:706:1: ( ruleIsvoidExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:707:1: ruleIsvoidExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIsvoidExpression_in_entryRuleIsvoidExpression1447);
            ruleIsvoidExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsvoidExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsvoidExpression1454); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIsvoidExpression"


    // $ANTLR start "ruleIsvoidExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:714:1: ruleIsvoidExpression : ( ( rule__IsvoidExpression__Group__0 ) ) ;
    public final void ruleIsvoidExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:718:2: ( ( ( rule__IsvoidExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:719:1: ( ( rule__IsvoidExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:719:1: ( ( rule__IsvoidExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:720:1: ( rule__IsvoidExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:721:1: ( rule__IsvoidExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:721:2: rule__IsvoidExpression__Group__0
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__0_in_ruleIsvoidExpression1480);
            rule__IsvoidExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsvoidExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleIsvoidExpression"


    // $ANTLR start "entryRuleLetExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:733:1: entryRuleLetExpression : ruleLetExpression EOF ;
    public final void entryRuleLetExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:734:1: ( ruleLetExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:735:1: ruleLetExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLetExpression_in_entryRuleLetExpression1507);
            ruleLetExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExpression1514); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:742:1: ruleLetExpression : ( ( rule__LetExpression__Group__0 ) ) ;
    public final void ruleLetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:746:2: ( ( ( rule__LetExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:747:1: ( ( rule__LetExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:747:1: ( ( rule__LetExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:748:1: ( rule__LetExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:749:1: ( rule__LetExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:749:2: rule__LetExpression__Group__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__0_in_ruleLetExpression1540);
            rule__LetExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleLetDeclaration"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:761:1: entryRuleLetDeclaration : ruleLetDeclaration EOF ;
    public final void entryRuleLetDeclaration() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:762:1: ( ruleLetDeclaration EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:763:1: ruleLetDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration1567);
            ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetDeclaration1574); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLetDeclaration"


    // $ANTLR start "ruleLetDeclaration"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:770:1: ruleLetDeclaration : ( ( rule__LetDeclaration__Group__0 ) ) ;
    public final void ruleLetDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:774:2: ( ( ( rule__LetDeclaration__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:775:1: ( ( rule__LetDeclaration__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:775:1: ( ( rule__LetDeclaration__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:776:1: ( rule__LetDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:777:1: ( rule__LetDeclaration__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:777:2: rule__LetDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__0_in_ruleLetDeclaration1600);
            rule__LetDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleLetDeclaration"


    // $ANTLR start "entryRuleCaseExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:789:1: entryRuleCaseExpression : ruleCaseExpression EOF ;
    public final void entryRuleCaseExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:790:1: ( ruleCaseExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:791:1: ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression1627);
            ruleCaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression1634); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCaseExpression"


    // $ANTLR start "ruleCaseExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:798:1: ruleCaseExpression : ( ( rule__CaseExpression__Group__0 ) ) ;
    public final void ruleCaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:802:2: ( ( ( rule__CaseExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:803:1: ( ( rule__CaseExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:803:1: ( ( rule__CaseExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:804:1: ( rule__CaseExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:805:1: ( rule__CaseExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:805:2: rule__CaseExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression1660);
            rule__CaseExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "entryRuleCase"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:817:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:818:1: ( ruleCase EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:819:1: ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase1687);
            ruleCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase1694); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:826:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:830:2: ( ( ( rule__Case__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:831:1: ( ( rule__Case__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:831:1: ( ( rule__Case__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:832:1: ( rule__Case__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:833:1: ( rule__Case__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:833:2: rule__Case__Group__0
            {
            pushFollow(FOLLOW_rule__Case__Group__0_in_ruleCase1720);
            rule__Case__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getGroup()); 
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleCompareExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:845:1: entryRuleCompareExpression : ruleCompareExpression EOF ;
    public final void entryRuleCompareExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:846:1: ( ruleCompareExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:847:1: ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1747);
            ruleCompareExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression1754); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:854:1: ruleCompareExpression : ( ( rule__CompareExpression__Group__0 ) ) ;
    public final void ruleCompareExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:858:2: ( ( ( rule__CompareExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:859:1: ( ( rule__CompareExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:859:1: ( ( rule__CompareExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:860:1: ( rule__CompareExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:861:1: ( rule__CompareExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:861:2: rule__CompareExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1780);
            rule__CompareExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleCompareOperator"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:873:1: entryRuleCompareOperator : ruleCompareOperator EOF ;
    public final void entryRuleCompareOperator() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:874:1: ( ruleCompareOperator EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:875:1: ruleCompareOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_entryRuleCompareOperator1807);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperator1814); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompareOperator"


    // $ANTLR start "ruleCompareOperator"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:882:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:886:2: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:887:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:887:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:888:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:889:1: ( rule__CompareOperator__Alternatives )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:889:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1840);
            rule__CompareOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "entryRuleAdditionExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:901:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:902:1: ( ruleAdditionExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:903:1: ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1867);
            ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExpression1874); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:910:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:914:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:915:1: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:915:1: ( ( rule__AdditionExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:916:1: ( rule__AdditionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:917:1: ( rule__AdditionExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:917:2: rule__AdditionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression1900);
            rule__AdditionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:929:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:930:1: ( ruleMultiplicationExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:931:1: ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1927);
            ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExpression1934); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:938:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:942:2: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:943:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:943:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:944:1: ( rule__MultiplicationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:945:1: ( rule__MultiplicationExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:945:2: rule__MultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression1960);
            rule__MultiplicationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleDispatchExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:957:1: entryRuleDispatchExpression : ruleDispatchExpression EOF ;
    public final void entryRuleDispatchExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:958:1: ( ruleDispatchExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:959:1: ruleDispatchExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDispatchExpression_in_entryRuleDispatchExpression1987);
            ruleDispatchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDispatchExpression1994); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDispatchExpression"


    // $ANTLR start "ruleDispatchExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:966:1: ruleDispatchExpression : ( ( rule__DispatchExpression__Group__0 ) ) ;
    public final void ruleDispatchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:970:2: ( ( ( rule__DispatchExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:971:1: ( ( rule__DispatchExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:971:1: ( ( rule__DispatchExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:972:1: ( rule__DispatchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:973:1: ( rule__DispatchExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:973:2: rule__DispatchExpression__Group__0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group__0_in_ruleDispatchExpression2020);
            rule__DispatchExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDispatchExpression"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:989:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:990:1: ( ruleBOOLEAN EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:991:1: ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN2051);
            ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEANRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN2058); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:998:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1002:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1003:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1003:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1004:1: ( rule__BOOLEAN__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1005:1: ( rule__BOOLEAN__Alternatives )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1005:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN2084);
            rule__BOOLEAN__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEANAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleSYMBOL"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1017:1: entryRuleSYMBOL : ruleSYMBOL EOF ;
    public final void entryRuleSYMBOL() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1018:1: ( ruleSYMBOL EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1019:1: ruleSYMBOL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSYMBOLRule()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_entryRuleSYMBOL2111);
            ruleSYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSYMBOLRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSYMBOL2118); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSYMBOL"


    // $ANTLR start "ruleSYMBOL"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1026:1: ruleSYMBOL : ( ( rule__SYMBOL__Alternatives ) ) ;
    public final void ruleSYMBOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1030:2: ( ( ( rule__SYMBOL__Alternatives ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1031:1: ( ( rule__SYMBOL__Alternatives ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1031:1: ( ( rule__SYMBOL__Alternatives ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1032:1: ( rule__SYMBOL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSYMBOLAccess().getAlternatives()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1033:1: ( rule__SYMBOL__Alternatives )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1033:2: rule__SYMBOL__Alternatives
            {
            pushFollow(FOLLOW_rule__SYMBOL__Alternatives_in_ruleSYMBOL2144);
            rule__SYMBOL__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSYMBOLAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSYMBOL"


    // $ANTLR start "rule__Feature___Alternatives"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1045:1: rule__Feature___Alternatives : ( ( ruleAttr ) | ( ruleMethod ) );
    public final void rule__Feature___Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1049:1: ( ( ruleAttr ) | ( ruleMethod ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==22) ) {
                    alt2=1;
                }
                else if ( (LA2_1==24) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==16) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==22) ) {
                    alt2=1;
                }
                else if ( (LA2_2==24) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1050:1: ( ruleAttr )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1050:1: ( ruleAttr )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1051:1: ruleAttr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeature_Access().getAttrParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAttr_in_rule__Feature___Alternatives2180);
                    ruleAttr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeature_Access().getAttrParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1056:6: ( ruleMethod )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1056:6: ( ruleMethod )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1057:1: ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeature_Access().getMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleMethod_in_rule__Feature___Alternatives2197);
                    ruleMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeature_Access().getMethodParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Feature___Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1067:1: rule__PrimaryExpression__Alternatives : ( ( ruleConditionalExpression ) | ( ruleLoopExpression ) | ( ruleBlockExpression ) | ( ruleLetExpression ) | ( ruleCaseExpression ) | ( ruleNewExpression ) | ( ruleIsvoidExpression ) | ( ruleAssignmentExpression ) | ( ruleSelfTypeLiteral ) | ( ruleIdentifierRefExpression ) | ( ruleLiteral ) | ( ruleParenExpression ) | ( ruleNegationExpression ) | ( ruleIntegerCompositeExpression ) | ( ruleStaticDispatchExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1071:1: ( ( ruleConditionalExpression ) | ( ruleLoopExpression ) | ( ruleBlockExpression ) | ( ruleLetExpression ) | ( ruleCaseExpression ) | ( ruleNewExpression ) | ( ruleIsvoidExpression ) | ( ruleAssignmentExpression ) | ( ruleSelfTypeLiteral ) | ( ruleIdentifierRefExpression ) | ( ruleLiteral ) | ( ruleParenExpression ) | ( ruleNegationExpression ) | ( ruleIntegerCompositeExpression ) | ( ruleStaticDispatchExpression ) )
            int alt3=15;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1072:1: ( ruleConditionalExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1072:1: ( ruleConditionalExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1073:1: ruleConditionalExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleConditionalExpression_in_rule__PrimaryExpression__Alternatives2229);
                    ruleConditionalExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1078:6: ( ruleLoopExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1078:6: ( ruleLoopExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1079:1: ruleLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLoopExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleLoopExpression_in_rule__PrimaryExpression__Alternatives2246);
                    ruleLoopExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getLoopExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1084:6: ( ruleBlockExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1084:6: ( ruleBlockExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1085:1: ruleBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getBlockExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBlockExpression_in_rule__PrimaryExpression__Alternatives2263);
                    ruleBlockExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getBlockExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1090:6: ( ruleLetExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1090:6: ( ruleLetExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1091:1: ruleLetExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLetExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleLetExpression_in_rule__PrimaryExpression__Alternatives2280);
                    ruleLetExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getLetExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1096:6: ( ruleCaseExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1096:6: ( ruleCaseExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1097:1: ruleCaseExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleCaseExpression_in_rule__PrimaryExpression__Alternatives2297);
                    ruleCaseExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1102:6: ( ruleNewExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1102:6: ( ruleNewExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1103:1: ruleNewExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getNewExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleNewExpression_in_rule__PrimaryExpression__Alternatives2314);
                    ruleNewExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getNewExpressionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1108:6: ( ruleIsvoidExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1108:6: ( ruleIsvoidExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1109:1: ruleIsvoidExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getIsvoidExpressionParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleIsvoidExpression_in_rule__PrimaryExpression__Alternatives2331);
                    ruleIsvoidExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getIsvoidExpressionParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1114:6: ( ruleAssignmentExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1114:6: ( ruleAssignmentExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1115:1: ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getAssignmentExpressionParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_rule__PrimaryExpression__Alternatives2348);
                    ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getAssignmentExpressionParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1120:6: ( ruleSelfTypeLiteral )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1120:6: ( ruleSelfTypeLiteral )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1121:1: ruleSelfTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getSelfTypeLiteralParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_ruleSelfTypeLiteral_in_rule__PrimaryExpression__Alternatives2365);
                    ruleSelfTypeLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getSelfTypeLiteralParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1126:6: ( ruleIdentifierRefExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1126:6: ( ruleIdentifierRefExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1127:1: ruleIdentifierRefExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getIdentifierRefExpressionParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_ruleIdentifierRefExpression_in_rule__PrimaryExpression__Alternatives2382);
                    ruleIdentifierRefExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getIdentifierRefExpressionParserRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1132:6: ( ruleLiteral )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1132:6: ( ruleLiteral )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1133:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_10()); 
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rule__PrimaryExpression__Alternatives2399);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1138:6: ( ruleParenExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1138:6: ( ruleParenExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1139:1: ruleParenExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getParenExpressionParserRuleCall_11()); 
                    }
                    pushFollow(FOLLOW_ruleParenExpression_in_rule__PrimaryExpression__Alternatives2416);
                    ruleParenExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getParenExpressionParserRuleCall_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1144:6: ( ruleNegationExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1144:6: ( ruleNegationExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1145:1: ruleNegationExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getNegationExpressionParserRuleCall_12()); 
                    }
                    pushFollow(FOLLOW_ruleNegationExpression_in_rule__PrimaryExpression__Alternatives2433);
                    ruleNegationExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getNegationExpressionParserRuleCall_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1150:6: ( ruleIntegerCompositeExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1150:6: ( ruleIntegerCompositeExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1151:1: ruleIntegerCompositeExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getIntegerCompositeExpressionParserRuleCall_13()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerCompositeExpression_in_rule__PrimaryExpression__Alternatives2450);
                    ruleIntegerCompositeExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getIntegerCompositeExpressionParserRuleCall_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1156:6: ( ruleStaticDispatchExpression )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1156:6: ( ruleStaticDispatchExpression )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1157:1: ruleStaticDispatchExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getStaticDispatchExpressionParserRuleCall_14()); 
                    }
                    pushFollow(FOLLOW_ruleStaticDispatchExpression_in_rule__PrimaryExpression__Alternatives2467);
                    ruleStaticDispatchExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getStaticDispatchExpressionParserRuleCall_14()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1167:1: rule__Literal__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1171:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case 14:
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1172:1: ( ruleNumberLiteral )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1172:1: ( ruleNumberLiteral )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1173:1: ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives2499);
                    ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1178:6: ( ruleStringLiteral )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1178:6: ( ruleStringLiteral )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1179:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2516);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1184:6: ( ruleBooleanLiteral )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1184:6: ( ruleBooleanLiteral )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1185:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2533);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1195:1: rule__CompareOperator__Alternatives : ( ( '<' ) | ( '<=' ) | ( '=' ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1199:1: ( ( '<' ) | ( '<=' ) | ( '=' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1200:1: ( '<' )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1200:1: ( '<' )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1201:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLessThanSignKeyword_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__CompareOperator__Alternatives2566); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLessThanSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1208:6: ( '<=' )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1208:6: ( '<=' )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1209:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLessThanSignEqualsSignKeyword_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__CompareOperator__Alternatives2586); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLessThanSignEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1216:6: ( '=' )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1216:6: ( '=' )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1217:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEqualsSignKeyword_2()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__CompareOperator__Alternatives2606); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEqualsSignKeyword_2()); 
                    }

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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__AdditionExpression__Alternatives_1_0_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1229:1: rule__AdditionExpression__Alternatives_1_0_0 : ( ( ( rule__AdditionExpression__Group_1_0_0_0__0 ) ) | ( ( rule__AdditionExpression__Group_1_0_0_1__0 ) ) );
    public final void rule__AdditionExpression__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1233:1: ( ( ( rule__AdditionExpression__Group_1_0_0_0__0 ) ) | ( ( rule__AdditionExpression__Group_1_0_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==45) ) {
                alt6=1;
            }
            else if ( (LA6_0==46) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1234:1: ( ( rule__AdditionExpression__Group_1_0_0_0__0 ) )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1234:1: ( ( rule__AdditionExpression__Group_1_0_0_0__0 ) )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1235:1: ( rule__AdditionExpression__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionExpressionAccess().getGroup_1_0_0_0()); 
                    }
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1236:1: ( rule__AdditionExpression__Group_1_0_0_0__0 )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1236:2: rule__AdditionExpression__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__0_in_rule__AdditionExpression__Alternatives_1_0_02640);
                    rule__AdditionExpression__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionExpressionAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1240:6: ( ( rule__AdditionExpression__Group_1_0_0_1__0 ) )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1240:6: ( ( rule__AdditionExpression__Group_1_0_0_1__0 ) )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1241:1: ( rule__AdditionExpression__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionExpressionAccess().getGroup_1_0_0_1()); 
                    }
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1242:1: ( rule__AdditionExpression__Group_1_0_0_1__0 )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1242:2: rule__AdditionExpression__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__0_in_rule__AdditionExpression__Alternatives_1_0_02658);
                    rule__AdditionExpression__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionExpressionAccess().getGroup_1_0_0_1()); 
                    }

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
    // $ANTLR end "rule__AdditionExpression__Alternatives_1_0_0"


    // $ANTLR start "rule__MultiplicationExpression__Alternatives_1_0_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1251:1: rule__MultiplicationExpression__Alternatives_1_0_0 : ( ( ( rule__MultiplicationExpression__Group_1_0_0_0__0 ) ) | ( ( rule__MultiplicationExpression__Group_1_0_0_1__0 ) ) );
    public final void rule__MultiplicationExpression__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1255:1: ( ( ( rule__MultiplicationExpression__Group_1_0_0_0__0 ) ) | ( ( rule__MultiplicationExpression__Group_1_0_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==48) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1256:1: ( ( rule__MultiplicationExpression__Group_1_0_0_0__0 ) )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1256:1: ( ( rule__MultiplicationExpression__Group_1_0_0_0__0 ) )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1257:1: ( rule__MultiplicationExpression__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0_0_0()); 
                    }
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1258:1: ( rule__MultiplicationExpression__Group_1_0_0_0__0 )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1258:2: rule__MultiplicationExpression__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__0_in_rule__MultiplicationExpression__Alternatives_1_0_02691);
                    rule__MultiplicationExpression__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1262:6: ( ( rule__MultiplicationExpression__Group_1_0_0_1__0 ) )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1262:6: ( ( rule__MultiplicationExpression__Group_1_0_0_1__0 ) )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1263:1: ( rule__MultiplicationExpression__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0_0_1()); 
                    }
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1264:1: ( rule__MultiplicationExpression__Group_1_0_0_1__0 )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1264:2: rule__MultiplicationExpression__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__0_in_rule__MultiplicationExpression__Alternatives_1_0_02709);
                    rule__MultiplicationExpression__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0_0_1()); 
                    }

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
    // $ANTLR end "rule__MultiplicationExpression__Alternatives_1_0_0"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1274:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1278:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1279:1: ( 'true' )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1279:1: ( 'true' )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1280:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__BOOLEAN__Alternatives2744); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1287:6: ( 'false' )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1287:6: ( 'false' )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1288:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__BOOLEAN__Alternatives2764); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    }

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
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__SYMBOL__Alternatives"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1300:1: rule__SYMBOL__Alternatives : ( ( RULE_ID ) | ( 'self' ) );
    public final void rule__SYMBOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1304:1: ( ( RULE_ID ) | ( 'self' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1305:1: ( RULE_ID )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1305:1: ( RULE_ID )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1306:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSYMBOLAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SYMBOL__Alternatives2798); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSYMBOLAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1311:6: ( 'self' )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1311:6: ( 'self' )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1312:1: 'self'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSYMBOLAccess().getSelfKeyword_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__SYMBOL__Alternatives2816); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSYMBOLAccess().getSelfKeyword_1()); 
                    }

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
    // $ANTLR end "rule__SYMBOL__Alternatives"


    // $ANTLR start "rule__Class___Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1326:1: rule__Class___Group__0 : rule__Class___Group__0__Impl rule__Class___Group__1 ;
    public final void rule__Class___Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1330:1: ( rule__Class___Group__0__Impl rule__Class___Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1331:2: rule__Class___Group__0__Impl rule__Class___Group__1
            {
            pushFollow(FOLLOW_rule__Class___Group__0__Impl_in_rule__Class___Group__02848);
            rule__Class___Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class___Group__1_in_rule__Class___Group__02851);
            rule__Class___Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class___Group__0"


    // $ANTLR start "rule__Class___Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1338:1: rule__Class___Group__0__Impl : ( 'class' ) ;
    public final void rule__Class___Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1342:1: ( ( 'class' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1343:1: ( 'class' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1343:1: ( 'class' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1344:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getClassKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Class___Group__0__Impl2879); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getClassKeyword_0()); 
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
    // $ANTLR end "rule__Class___Group__0__Impl"


    // $ANTLR start "rule__Class___Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1357:1: rule__Class___Group__1 : rule__Class___Group__1__Impl rule__Class___Group__2 ;
    public final void rule__Class___Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1361:1: ( rule__Class___Group__1__Impl rule__Class___Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1362:2: rule__Class___Group__1__Impl rule__Class___Group__2
            {
            pushFollow(FOLLOW_rule__Class___Group__1__Impl_in_rule__Class___Group__12910);
            rule__Class___Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class___Group__2_in_rule__Class___Group__12913);
            rule__Class___Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class___Group__1"


    // $ANTLR start "rule__Class___Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1369:1: rule__Class___Group__1__Impl : ( ( rule__Class___NameAssignment_1 ) ) ;
    public final void rule__Class___Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1373:1: ( ( ( rule__Class___NameAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1374:1: ( ( rule__Class___NameAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1374:1: ( ( rule__Class___NameAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1375:1: ( rule__Class___NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getNameAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1376:1: ( rule__Class___NameAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1376:2: rule__Class___NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class___NameAssignment_1_in_rule__Class___Group__1__Impl2940);
            rule__Class___NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Class___Group__1__Impl"


    // $ANTLR start "rule__Class___Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1386:1: rule__Class___Group__2 : rule__Class___Group__2__Impl rule__Class___Group__3 ;
    public final void rule__Class___Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1390:1: ( rule__Class___Group__2__Impl rule__Class___Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1391:2: rule__Class___Group__2__Impl rule__Class___Group__3
            {
            pushFollow(FOLLOW_rule__Class___Group__2__Impl_in_rule__Class___Group__22970);
            rule__Class___Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class___Group__3_in_rule__Class___Group__22973);
            rule__Class___Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class___Group__2"


    // $ANTLR start "rule__Class___Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1398:1: rule__Class___Group__2__Impl : ( ( rule__Class___Group_2__0 )? ) ;
    public final void rule__Class___Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1402:1: ( ( ( rule__Class___Group_2__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1403:1: ( ( rule__Class___Group_2__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1403:1: ( ( rule__Class___Group_2__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1404:1: ( rule__Class___Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1405:1: ( rule__Class___Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1405:2: rule__Class___Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Class___Group_2__0_in_rule__Class___Group__2__Impl3000);
                    rule__Class___Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getGroup_2()); 
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
    // $ANTLR end "rule__Class___Group__2__Impl"


    // $ANTLR start "rule__Class___Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1415:1: rule__Class___Group__3 : rule__Class___Group__3__Impl rule__Class___Group__4 ;
    public final void rule__Class___Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1419:1: ( rule__Class___Group__3__Impl rule__Class___Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1420:2: rule__Class___Group__3__Impl rule__Class___Group__4
            {
            pushFollow(FOLLOW_rule__Class___Group__3__Impl_in_rule__Class___Group__33031);
            rule__Class___Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class___Group__4_in_rule__Class___Group__33034);
            rule__Class___Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class___Group__3"


    // $ANTLR start "rule__Class___Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1427:1: rule__Class___Group__3__Impl : ( '{' ) ;
    public final void rule__Class___Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1431:1: ( ( '{' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1432:1: ( '{' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1432:1: ( '{' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1433:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__Class___Group__3__Impl3062); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Class___Group__3__Impl"


    // $ANTLR start "rule__Class___Group__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1446:1: rule__Class___Group__4 : rule__Class___Group__4__Impl rule__Class___Group__5 ;
    public final void rule__Class___Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1450:1: ( rule__Class___Group__4__Impl rule__Class___Group__5 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1451:2: rule__Class___Group__4__Impl rule__Class___Group__5
            {
            pushFollow(FOLLOW_rule__Class___Group__4__Impl_in_rule__Class___Group__43093);
            rule__Class___Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class___Group__5_in_rule__Class___Group__43096);
            rule__Class___Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class___Group__4"


    // $ANTLR start "rule__Class___Group__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1458:1: rule__Class___Group__4__Impl : ( ( rule__Class___FeaturesAssignment_4 )* ) ;
    public final void rule__Class___Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1462:1: ( ( ( rule__Class___FeaturesAssignment_4 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1463:1: ( ( rule__Class___FeaturesAssignment_4 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1463:1: ( ( rule__Class___FeaturesAssignment_4 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1464:1: ( rule__Class___FeaturesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getFeaturesAssignment_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1465:1: ( rule__Class___FeaturesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1465:2: rule__Class___FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class___FeaturesAssignment_4_in_rule__Class___Group__4__Impl3123);
            	    rule__Class___FeaturesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getFeaturesAssignment_4()); 
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
    // $ANTLR end "rule__Class___Group__4__Impl"


    // $ANTLR start "rule__Class___Group__5"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1475:1: rule__Class___Group__5 : rule__Class___Group__5__Impl rule__Class___Group__6 ;
    public final void rule__Class___Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1479:1: ( rule__Class___Group__5__Impl rule__Class___Group__6 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1480:2: rule__Class___Group__5__Impl rule__Class___Group__6
            {
            pushFollow(FOLLOW_rule__Class___Group__5__Impl_in_rule__Class___Group__53154);
            rule__Class___Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class___Group__6_in_rule__Class___Group__53157);
            rule__Class___Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class___Group__5"


    // $ANTLR start "rule__Class___Group__5__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1487:1: rule__Class___Group__5__Impl : ( '}' ) ;
    public final void rule__Class___Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1491:1: ( ( '}' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1492:1: ( '}' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1492:1: ( '}' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1493:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getRightCurlyBracketKeyword_5()); 
            }
            match(input,19,FOLLOW_19_in_rule__Class___Group__5__Impl3185); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Class___Group__5__Impl"


    // $ANTLR start "rule__Class___Group__6"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1506:1: rule__Class___Group__6 : rule__Class___Group__6__Impl ;
    public final void rule__Class___Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1510:1: ( rule__Class___Group__6__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1511:2: rule__Class___Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Class___Group__6__Impl_in_rule__Class___Group__63216);
            rule__Class___Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class___Group__6"


    // $ANTLR start "rule__Class___Group__6__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1517:1: rule__Class___Group__6__Impl : ( ';' ) ;
    public final void rule__Class___Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1521:1: ( ( ';' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1522:1: ( ';' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1522:1: ( ';' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1523:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getSemicolonKeyword_6()); 
            }
            match(input,20,FOLLOW_20_in_rule__Class___Group__6__Impl3244); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getSemicolonKeyword_6()); 
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
    // $ANTLR end "rule__Class___Group__6__Impl"


    // $ANTLR start "rule__Class___Group_2__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1550:1: rule__Class___Group_2__0 : rule__Class___Group_2__0__Impl rule__Class___Group_2__1 ;
    public final void rule__Class___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1554:1: ( rule__Class___Group_2__0__Impl rule__Class___Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1555:2: rule__Class___Group_2__0__Impl rule__Class___Group_2__1
            {
            pushFollow(FOLLOW_rule__Class___Group_2__0__Impl_in_rule__Class___Group_2__03289);
            rule__Class___Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class___Group_2__1_in_rule__Class___Group_2__03292);
            rule__Class___Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class___Group_2__0"


    // $ANTLR start "rule__Class___Group_2__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1562:1: rule__Class___Group_2__0__Impl : ( 'inherits' ) ;
    public final void rule__Class___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1566:1: ( ( 'inherits' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1567:1: ( 'inherits' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1567:1: ( 'inherits' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1568:1: 'inherits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getInheritsKeyword_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Class___Group_2__0__Impl3320); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getInheritsKeyword_2_0()); 
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
    // $ANTLR end "rule__Class___Group_2__0__Impl"


    // $ANTLR start "rule__Class___Group_2__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1581:1: rule__Class___Group_2__1 : rule__Class___Group_2__1__Impl ;
    public final void rule__Class___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1585:1: ( rule__Class___Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1586:2: rule__Class___Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class___Group_2__1__Impl_in_rule__Class___Group_2__13351);
            rule__Class___Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class___Group_2__1"


    // $ANTLR start "rule__Class___Group_2__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1592:1: rule__Class___Group_2__1__Impl : ( ( rule__Class___ParentAssignment_2_1 ) ) ;
    public final void rule__Class___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1596:1: ( ( ( rule__Class___ParentAssignment_2_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1597:1: ( ( rule__Class___ParentAssignment_2_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1597:1: ( ( rule__Class___ParentAssignment_2_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1598:1: ( rule__Class___ParentAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getParentAssignment_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1599:1: ( rule__Class___ParentAssignment_2_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1599:2: rule__Class___ParentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Class___ParentAssignment_2_1_in_rule__Class___Group_2__1__Impl3378);
            rule__Class___ParentAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getParentAssignment_2_1()); 
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
    // $ANTLR end "rule__Class___Group_2__1__Impl"


    // $ANTLR start "rule__Attr__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1613:1: rule__Attr__Group__0 : rule__Attr__Group__0__Impl rule__Attr__Group__1 ;
    public final void rule__Attr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1617:1: ( rule__Attr__Group__0__Impl rule__Attr__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1618:2: rule__Attr__Group__0__Impl rule__Attr__Group__1
            {
            pushFollow(FOLLOW_rule__Attr__Group__0__Impl_in_rule__Attr__Group__03412);
            rule__Attr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group__1_in_rule__Attr__Group__03415);
            rule__Attr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__0"


    // $ANTLR start "rule__Attr__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1625:1: rule__Attr__Group__0__Impl : ( ( rule__Attr__NameAssignment_0 ) ) ;
    public final void rule__Attr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1629:1: ( ( ( rule__Attr__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1630:1: ( ( rule__Attr__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1630:1: ( ( rule__Attr__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1631:1: ( rule__Attr__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1632:1: ( rule__Attr__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1632:2: rule__Attr__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attr__NameAssignment_0_in_rule__Attr__Group__0__Impl3442);
            rule__Attr__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Attr__Group__0__Impl"


    // $ANTLR start "rule__Attr__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1642:1: rule__Attr__Group__1 : rule__Attr__Group__1__Impl rule__Attr__Group__2 ;
    public final void rule__Attr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1646:1: ( rule__Attr__Group__1__Impl rule__Attr__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1647:2: rule__Attr__Group__1__Impl rule__Attr__Group__2
            {
            pushFollow(FOLLOW_rule__Attr__Group__1__Impl_in_rule__Attr__Group__13472);
            rule__Attr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group__2_in_rule__Attr__Group__13475);
            rule__Attr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__1"


    // $ANTLR start "rule__Attr__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1654:1: rule__Attr__Group__1__Impl : ( ':' ) ;
    public final void rule__Attr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1658:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1659:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1659:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1660:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Attr__Group__1__Impl3503); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Attr__Group__1__Impl"


    // $ANTLR start "rule__Attr__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1673:1: rule__Attr__Group__2 : rule__Attr__Group__2__Impl rule__Attr__Group__3 ;
    public final void rule__Attr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1677:1: ( rule__Attr__Group__2__Impl rule__Attr__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1678:2: rule__Attr__Group__2__Impl rule__Attr__Group__3
            {
            pushFollow(FOLLOW_rule__Attr__Group__2__Impl_in_rule__Attr__Group__23534);
            rule__Attr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group__3_in_rule__Attr__Group__23537);
            rule__Attr__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__2"


    // $ANTLR start "rule__Attr__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1685:1: rule__Attr__Group__2__Impl : ( ( rule__Attr__Type_declAssignment_2 ) ) ;
    public final void rule__Attr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1689:1: ( ( ( rule__Attr__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1690:1: ( ( rule__Attr__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1690:1: ( ( rule__Attr__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1691:1: ( rule__Attr__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1692:1: ( rule__Attr__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1692:2: rule__Attr__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__Attr__Type_declAssignment_2_in_rule__Attr__Group__2__Impl3564);
            rule__Attr__Type_declAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getType_declAssignment_2()); 
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
    // $ANTLR end "rule__Attr__Group__2__Impl"


    // $ANTLR start "rule__Attr__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1702:1: rule__Attr__Group__3 : rule__Attr__Group__3__Impl rule__Attr__Group__4 ;
    public final void rule__Attr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1706:1: ( rule__Attr__Group__3__Impl rule__Attr__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1707:2: rule__Attr__Group__3__Impl rule__Attr__Group__4
            {
            pushFollow(FOLLOW_rule__Attr__Group__3__Impl_in_rule__Attr__Group__33594);
            rule__Attr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group__4_in_rule__Attr__Group__33597);
            rule__Attr__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__3"


    // $ANTLR start "rule__Attr__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1714:1: rule__Attr__Group__3__Impl : ( ( rule__Attr__Group_3__0 )? ) ;
    public final void rule__Attr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1718:1: ( ( ( rule__Attr__Group_3__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1719:1: ( ( rule__Attr__Group_3__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1719:1: ( ( rule__Attr__Group_3__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1720:1: ( rule__Attr__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getGroup_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1721:1: ( rule__Attr__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1721:2: rule__Attr__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Attr__Group_3__0_in_rule__Attr__Group__3__Impl3624);
                    rule__Attr__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Attr__Group__3__Impl"


    // $ANTLR start "rule__Attr__Group__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1731:1: rule__Attr__Group__4 : rule__Attr__Group__4__Impl ;
    public final void rule__Attr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1735:1: ( rule__Attr__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1736:2: rule__Attr__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attr__Group__4__Impl_in_rule__Attr__Group__43655);
            rule__Attr__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__4"


    // $ANTLR start "rule__Attr__Group__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1742:1: rule__Attr__Group__4__Impl : ( ';' ) ;
    public final void rule__Attr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1746:1: ( ( ';' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1747:1: ( ';' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1747:1: ( ';' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1748:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getSemicolonKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__Attr__Group__4__Impl3683); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__Attr__Group__4__Impl"


    // $ANTLR start "rule__Attr__Group_3__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1771:1: rule__Attr__Group_3__0 : rule__Attr__Group_3__0__Impl rule__Attr__Group_3__1 ;
    public final void rule__Attr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1775:1: ( rule__Attr__Group_3__0__Impl rule__Attr__Group_3__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1776:2: rule__Attr__Group_3__0__Impl rule__Attr__Group_3__1
            {
            pushFollow(FOLLOW_rule__Attr__Group_3__0__Impl_in_rule__Attr__Group_3__03724);
            rule__Attr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group_3__1_in_rule__Attr__Group_3__03727);
            rule__Attr__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group_3__0"


    // $ANTLR start "rule__Attr__Group_3__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1783:1: rule__Attr__Group_3__0__Impl : ( '<-' ) ;
    public final void rule__Attr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1787:1: ( ( '<-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1788:1: ( '<-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1788:1: ( '<-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1789:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getLessThanSignHyphenMinusKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Attr__Group_3__0__Impl3755); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getLessThanSignHyphenMinusKeyword_3_0()); 
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
    // $ANTLR end "rule__Attr__Group_3__0__Impl"


    // $ANTLR start "rule__Attr__Group_3__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1802:1: rule__Attr__Group_3__1 : rule__Attr__Group_3__1__Impl ;
    public final void rule__Attr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1806:1: ( rule__Attr__Group_3__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1807:2: rule__Attr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Attr__Group_3__1__Impl_in_rule__Attr__Group_3__13786);
            rule__Attr__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group_3__1"


    // $ANTLR start "rule__Attr__Group_3__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1813:1: rule__Attr__Group_3__1__Impl : ( ( rule__Attr__InitAssignment_3_1 ) ) ;
    public final void rule__Attr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1817:1: ( ( ( rule__Attr__InitAssignment_3_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1818:1: ( ( rule__Attr__InitAssignment_3_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1818:1: ( ( rule__Attr__InitAssignment_3_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1819:1: ( rule__Attr__InitAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getInitAssignment_3_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1820:1: ( rule__Attr__InitAssignment_3_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1820:2: rule__Attr__InitAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Attr__InitAssignment_3_1_in_rule__Attr__Group_3__1__Impl3813);
            rule__Attr__InitAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getInitAssignment_3_1()); 
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
    // $ANTLR end "rule__Attr__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1834:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1838:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1839:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03847);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03850);
            rule__Method__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1846:1: rule__Method__Group__0__Impl : ( ( rule__Method__NameAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1850:1: ( ( ( rule__Method__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1851:1: ( ( rule__Method__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1851:1: ( ( rule__Method__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1852:1: ( rule__Method__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1853:1: ( rule__Method__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1853:2: rule__Method__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_0_in_rule__Method__Group__0__Impl3877);
            rule__Method__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1863:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1867:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1868:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13907);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13910);
            rule__Method__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1875:1: rule__Method__Group__1__Impl : ( '(' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1879:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1880:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1880:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1881:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__Method__Group__1__Impl3938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1894:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1898:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1899:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23969);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23972);
            rule__Method__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1906:1: rule__Method__Group__2__Impl : ( ( rule__Method__Group_2__0 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1910:1: ( ( ( rule__Method__Group_2__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1911:1: ( ( rule__Method__Group_2__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1911:1: ( ( rule__Method__Group_2__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1912:1: ( rule__Method__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1913:1: ( rule__Method__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1913:2: rule__Method__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_2__0_in_rule__Method__Group__2__Impl3999);
                    rule__Method__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1923:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1927:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1928:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__34030);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__34033);
            rule__Method__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1935:1: rule__Method__Group__3__Impl : ( ')' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1939:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1940:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1940:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1941:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__Method__Group__3__Impl4061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1954:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1958:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1959:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44092);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44095);
            rule__Method__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1966:1: rule__Method__Group__4__Impl : ( ':' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1970:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1971:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1971:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1972:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getColonKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__Method__Group__4__Impl4123); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getColonKeyword_4()); 
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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1985:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1989:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1990:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54154);
            rule__Method__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__6_in_rule__Method__Group__54157);
            rule__Method__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1997:1: rule__Method__Group__5__Impl : ( ( rule__Method__Return_typeAssignment_5 ) ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2001:1: ( ( ( rule__Method__Return_typeAssignment_5 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2002:1: ( ( rule__Method__Return_typeAssignment_5 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2002:1: ( ( rule__Method__Return_typeAssignment_5 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2003:1: ( rule__Method__Return_typeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturn_typeAssignment_5()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2004:1: ( rule__Method__Return_typeAssignment_5 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2004:2: rule__Method__Return_typeAssignment_5
            {
            pushFollow(FOLLOW_rule__Method__Return_typeAssignment_5_in_rule__Method__Group__5__Impl4184);
            rule__Method__Return_typeAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturn_typeAssignment_5()); 
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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2014:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2018:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2019:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__64214);
            rule__Method__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__7_in_rule__Method__Group__64217);
            rule__Method__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2026:1: rule__Method__Group__6__Impl : ( '{' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2030:1: ( ( '{' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2031:1: ( '{' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2031:1: ( '{' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2032:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,18,FOLLOW_18_in_rule__Method__Group__6__Impl4245); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2045:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2049:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2050:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__74276);
            rule__Method__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__8_in_rule__Method__Group__74279);
            rule__Method__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2057:1: rule__Method__Group__7__Impl : ( ( rule__Method__ExprAssignment_7 ) ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2061:1: ( ( ( rule__Method__ExprAssignment_7 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2062:1: ( ( rule__Method__ExprAssignment_7 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2062:1: ( ( rule__Method__ExprAssignment_7 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2063:1: ( rule__Method__ExprAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getExprAssignment_7()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2064:1: ( rule__Method__ExprAssignment_7 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2064:2: rule__Method__ExprAssignment_7
            {
            pushFollow(FOLLOW_rule__Method__ExprAssignment_7_in_rule__Method__Group__7__Impl4306);
            rule__Method__ExprAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getExprAssignment_7()); 
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
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__8"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2074:1: rule__Method__Group__8 : rule__Method__Group__8__Impl rule__Method__Group__9 ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2078:1: ( rule__Method__Group__8__Impl rule__Method__Group__9 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2079:2: rule__Method__Group__8__Impl rule__Method__Group__9
            {
            pushFollow(FOLLOW_rule__Method__Group__8__Impl_in_rule__Method__Group__84336);
            rule__Method__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__9_in_rule__Method__Group__84339);
            rule__Method__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8"


    // $ANTLR start "rule__Method__Group__8__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2086:1: rule__Method__Group__8__Impl : ( '}' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2090:1: ( ( '}' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2091:1: ( '}' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2091:1: ( '}' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2092:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,19,FOLLOW_19_in_rule__Method__Group__8__Impl4367); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__Method__Group__8__Impl"


    // $ANTLR start "rule__Method__Group__9"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2105:1: rule__Method__Group__9 : rule__Method__Group__9__Impl ;
    public final void rule__Method__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2109:1: ( rule__Method__Group__9__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2110:2: rule__Method__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__9__Impl_in_rule__Method__Group__94398);
            rule__Method__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__9"


    // $ANTLR start "rule__Method__Group__9__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2116:1: rule__Method__Group__9__Impl : ( ';' ) ;
    public final void rule__Method__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2120:1: ( ( ';' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2121:1: ( ';' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2121:1: ( ';' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2122:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getSemicolonKeyword_9()); 
            }
            match(input,20,FOLLOW_20_in_rule__Method__Group__9__Impl4426); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getSemicolonKeyword_9()); 
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
    // $ANTLR end "rule__Method__Group__9__Impl"


    // $ANTLR start "rule__Method__Group_2__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2155:1: rule__Method__Group_2__0 : rule__Method__Group_2__0__Impl rule__Method__Group_2__1 ;
    public final void rule__Method__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2159:1: ( rule__Method__Group_2__0__Impl rule__Method__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2160:2: rule__Method__Group_2__0__Impl rule__Method__Group_2__1
            {
            pushFollow(FOLLOW_rule__Method__Group_2__0__Impl_in_rule__Method__Group_2__04477);
            rule__Method__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group_2__1_in_rule__Method__Group_2__04480);
            rule__Method__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__0"


    // $ANTLR start "rule__Method__Group_2__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2167:1: rule__Method__Group_2__0__Impl : ( ( rule__Method__FormalsAssignment_2_0 ) ) ;
    public final void rule__Method__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2171:1: ( ( ( rule__Method__FormalsAssignment_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2172:1: ( ( rule__Method__FormalsAssignment_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2172:1: ( ( rule__Method__FormalsAssignment_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2173:1: ( rule__Method__FormalsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsAssignment_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2174:1: ( rule__Method__FormalsAssignment_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2174:2: rule__Method__FormalsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Method__FormalsAssignment_2_0_in_rule__Method__Group_2__0__Impl4507);
            rule__Method__FormalsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getFormalsAssignment_2_0()); 
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
    // $ANTLR end "rule__Method__Group_2__0__Impl"


    // $ANTLR start "rule__Method__Group_2__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2184:1: rule__Method__Group_2__1 : rule__Method__Group_2__1__Impl ;
    public final void rule__Method__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2188:1: ( rule__Method__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2189:2: rule__Method__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_2__1__Impl_in_rule__Method__Group_2__14537);
            rule__Method__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__1"


    // $ANTLR start "rule__Method__Group_2__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2195:1: rule__Method__Group_2__1__Impl : ( ( rule__Method__Group_2_1__0 )* ) ;
    public final void rule__Method__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2199:1: ( ( ( rule__Method__Group_2_1__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2200:1: ( ( rule__Method__Group_2_1__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2200:1: ( ( rule__Method__Group_2_1__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2201:1: ( rule__Method__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2202:1: ( rule__Method__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2202:2: rule__Method__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_2_1__0_in_rule__Method__Group_2__1__Impl4564);
            	    rule__Method__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__Method__Group_2__1__Impl"


    // $ANTLR start "rule__Method__Group_2_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2216:1: rule__Method__Group_2_1__0 : rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 ;
    public final void rule__Method__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2220:1: ( rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2221:2: rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Method__Group_2_1__0__Impl_in_rule__Method__Group_2_1__04599);
            rule__Method__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group_2_1__1_in_rule__Method__Group_2_1__04602);
            rule__Method__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__0"


    // $ANTLR start "rule__Method__Group_2_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2228:1: rule__Method__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2232:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2233:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2233:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2234:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Method__Group_2_1__0__Impl4630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__Method__Group_2_1__0__Impl"


    // $ANTLR start "rule__Method__Group_2_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2247:1: rule__Method__Group_2_1__1 : rule__Method__Group_2_1__1__Impl ;
    public final void rule__Method__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2251:1: ( rule__Method__Group_2_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2252:2: rule__Method__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_2_1__1__Impl_in_rule__Method__Group_2_1__14661);
            rule__Method__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__1"


    // $ANTLR start "rule__Method__Group_2_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2258:1: rule__Method__Group_2_1__1__Impl : ( ( rule__Method__FormalsAssignment_2_1_1 ) ) ;
    public final void rule__Method__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2262:1: ( ( ( rule__Method__FormalsAssignment_2_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2263:1: ( ( rule__Method__FormalsAssignment_2_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2263:1: ( ( rule__Method__FormalsAssignment_2_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2264:1: ( rule__Method__FormalsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsAssignment_2_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2265:1: ( rule__Method__FormalsAssignment_2_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2265:2: rule__Method__FormalsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Method__FormalsAssignment_2_1_1_in_rule__Method__Group_2_1__1__Impl4688);
            rule__Method__FormalsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getFormalsAssignment_2_1_1()); 
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
    // $ANTLR end "rule__Method__Group_2_1__1__Impl"


    // $ANTLR start "rule__Formal__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2279:1: rule__Formal__Group__0 : rule__Formal__Group__0__Impl rule__Formal__Group__1 ;
    public final void rule__Formal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2283:1: ( rule__Formal__Group__0__Impl rule__Formal__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2284:2: rule__Formal__Group__0__Impl rule__Formal__Group__1
            {
            pushFollow(FOLLOW_rule__Formal__Group__0__Impl_in_rule__Formal__Group__04722);
            rule__Formal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Formal__Group__1_in_rule__Formal__Group__04725);
            rule__Formal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal__Group__0"


    // $ANTLR start "rule__Formal__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2291:1: rule__Formal__Group__0__Impl : ( ( rule__Formal__NameAssignment_0 ) ) ;
    public final void rule__Formal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2295:1: ( ( ( rule__Formal__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2296:1: ( ( rule__Formal__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2296:1: ( ( rule__Formal__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2297:1: ( rule__Formal__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2298:1: ( rule__Formal__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2298:2: rule__Formal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Formal__NameAssignment_0_in_rule__Formal__Group__0__Impl4752);
            rule__Formal__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Formal__Group__0__Impl"


    // $ANTLR start "rule__Formal__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2308:1: rule__Formal__Group__1 : rule__Formal__Group__1__Impl rule__Formal__Group__2 ;
    public final void rule__Formal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2312:1: ( rule__Formal__Group__1__Impl rule__Formal__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2313:2: rule__Formal__Group__1__Impl rule__Formal__Group__2
            {
            pushFollow(FOLLOW_rule__Formal__Group__1__Impl_in_rule__Formal__Group__14782);
            rule__Formal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Formal__Group__2_in_rule__Formal__Group__14785);
            rule__Formal__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal__Group__1"


    // $ANTLR start "rule__Formal__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2320:1: rule__Formal__Group__1__Impl : ( ':' ) ;
    public final void rule__Formal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2324:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2325:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2325:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2326:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Formal__Group__1__Impl4813); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Formal__Group__1__Impl"


    // $ANTLR start "rule__Formal__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2339:1: rule__Formal__Group__2 : rule__Formal__Group__2__Impl ;
    public final void rule__Formal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2343:1: ( rule__Formal__Group__2__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2344:2: rule__Formal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Formal__Group__2__Impl_in_rule__Formal__Group__24844);
            rule__Formal__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal__Group__2"


    // $ANTLR start "rule__Formal__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2350:1: rule__Formal__Group__2__Impl : ( ( rule__Formal__Type_declAssignment_2 ) ) ;
    public final void rule__Formal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2354:1: ( ( ( rule__Formal__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2355:1: ( ( rule__Formal__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2355:1: ( ( rule__Formal__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2356:1: ( rule__Formal__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2357:1: ( rule__Formal__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2357:2: rule__Formal__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__Formal__Type_declAssignment_2_in_rule__Formal__Group__2__Impl4871);
            rule__Formal__Type_declAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalAccess().getType_declAssignment_2()); 
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
    // $ANTLR end "rule__Formal__Group__2__Impl"


    // $ANTLR start "rule__SelfTypeLiteral__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2373:1: rule__SelfTypeLiteral__Group__0 : rule__SelfTypeLiteral__Group__0__Impl rule__SelfTypeLiteral__Group__1 ;
    public final void rule__SelfTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2377:1: ( rule__SelfTypeLiteral__Group__0__Impl rule__SelfTypeLiteral__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2378:2: rule__SelfTypeLiteral__Group__0__Impl rule__SelfTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__SelfTypeLiteral__Group__0__Impl_in_rule__SelfTypeLiteral__Group__04907);
            rule__SelfTypeLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelfTypeLiteral__Group__1_in_rule__SelfTypeLiteral__Group__04910);
            rule__SelfTypeLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfTypeLiteral__Group__0"


    // $ANTLR start "rule__SelfTypeLiteral__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2385:1: rule__SelfTypeLiteral__Group__0__Impl : ( () ) ;
    public final void rule__SelfTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2389:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2390:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2390:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2391:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfTypeLiteralAccess().getSelfTypeLiteralAction_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2392:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2394:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfTypeLiteralAccess().getSelfTypeLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfTypeLiteral__Group__0__Impl"


    // $ANTLR start "rule__SelfTypeLiteral__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2404:1: rule__SelfTypeLiteral__Group__1 : rule__SelfTypeLiteral__Group__1__Impl ;
    public final void rule__SelfTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2408:1: ( rule__SelfTypeLiteral__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2409:2: rule__SelfTypeLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelfTypeLiteral__Group__1__Impl_in_rule__SelfTypeLiteral__Group__14968);
            rule__SelfTypeLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfTypeLiteral__Group__1"


    // $ANTLR start "rule__SelfTypeLiteral__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2415:1: rule__SelfTypeLiteral__Group__1__Impl : ( 'self' ) ;
    public final void rule__SelfTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2419:1: ( ( 'self' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2420:1: ( 'self' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2420:1: ( 'self' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2421:1: 'self'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfTypeLiteralAccess().getSelfKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__SelfTypeLiteral__Group__1__Impl4996); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfTypeLiteralAccess().getSelfKeyword_1()); 
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
    // $ANTLR end "rule__SelfTypeLiteral__Group__1__Impl"


    // $ANTLR start "rule__ParenExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2438:1: rule__ParenExpression__Group__0 : rule__ParenExpression__Group__0__Impl rule__ParenExpression__Group__1 ;
    public final void rule__ParenExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2442:1: ( rule__ParenExpression__Group__0__Impl rule__ParenExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2443:2: rule__ParenExpression__Group__0__Impl rule__ParenExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParenExpression__Group__0__Impl_in_rule__ParenExpression__Group__05031);
            rule__ParenExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenExpression__Group__1_in_rule__ParenExpression__Group__05034);
            rule__ParenExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenExpression__Group__0"


    // $ANTLR start "rule__ParenExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2450:1: rule__ParenExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2454:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2455:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2455:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2456:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ParenExpression__Group__0__Impl5062); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenExpressionAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__ParenExpression__Group__0__Impl"


    // $ANTLR start "rule__ParenExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2469:1: rule__ParenExpression__Group__1 : rule__ParenExpression__Group__1__Impl rule__ParenExpression__Group__2 ;
    public final void rule__ParenExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2473:1: ( rule__ParenExpression__Group__1__Impl rule__ParenExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2474:2: rule__ParenExpression__Group__1__Impl rule__ParenExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParenExpression__Group__1__Impl_in_rule__ParenExpression__Group__15093);
            rule__ParenExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenExpression__Group__2_in_rule__ParenExpression__Group__15096);
            rule__ParenExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenExpression__Group__1"


    // $ANTLR start "rule__ParenExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2481:1: rule__ParenExpression__Group__1__Impl : ( ( rule__ParenExpression__ExprAssignment_1 ) ) ;
    public final void rule__ParenExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2485:1: ( ( ( rule__ParenExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2486:1: ( ( rule__ParenExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2486:1: ( ( rule__ParenExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2487:1: ( rule__ParenExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2488:1: ( rule__ParenExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2488:2: rule__ParenExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenExpression__ExprAssignment_1_in_rule__ParenExpression__Group__1__Impl5123);
            rule__ParenExpression__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenExpressionAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__ParenExpression__Group__1__Impl"


    // $ANTLR start "rule__ParenExpression__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2498:1: rule__ParenExpression__Group__2 : rule__ParenExpression__Group__2__Impl ;
    public final void rule__ParenExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2502:1: ( rule__ParenExpression__Group__2__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2503:2: rule__ParenExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenExpression__Group__2__Impl_in_rule__ParenExpression__Group__25153);
            rule__ParenExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenExpression__Group__2"


    // $ANTLR start "rule__ParenExpression__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2509:1: rule__ParenExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2513:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2514:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2514:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2515:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__ParenExpression__Group__2__Impl5181); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenExpressionAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ParenExpression__Group__2__Impl"


    // $ANTLR start "rule__AssignmentExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2534:1: rule__AssignmentExpression__Group__0 : rule__AssignmentExpression__Group__0__Impl rule__AssignmentExpression__Group__1 ;
    public final void rule__AssignmentExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2538:1: ( rule__AssignmentExpression__Group__0__Impl rule__AssignmentExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2539:2: rule__AssignmentExpression__Group__0__Impl rule__AssignmentExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__0__Impl_in_rule__AssignmentExpression__Group__05218);
            rule__AssignmentExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__1_in_rule__AssignmentExpression__Group__05221);
            rule__AssignmentExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group__0"


    // $ANTLR start "rule__AssignmentExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2546:1: rule__AssignmentExpression__Group__0__Impl : ( ( rule__AssignmentExpression__NameAssignment_0 ) ) ;
    public final void rule__AssignmentExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2550:1: ( ( ( rule__AssignmentExpression__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2551:1: ( ( rule__AssignmentExpression__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2551:1: ( ( rule__AssignmentExpression__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2552:1: ( rule__AssignmentExpression__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2553:1: ( rule__AssignmentExpression__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2553:2: rule__AssignmentExpression__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__NameAssignment_0_in_rule__AssignmentExpression__Group__0__Impl5248);
            rule__AssignmentExpression__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExpressionAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__AssignmentExpression__Group__0__Impl"


    // $ANTLR start "rule__AssignmentExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2563:1: rule__AssignmentExpression__Group__1 : rule__AssignmentExpression__Group__1__Impl rule__AssignmentExpression__Group__2 ;
    public final void rule__AssignmentExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2567:1: ( rule__AssignmentExpression__Group__1__Impl rule__AssignmentExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2568:2: rule__AssignmentExpression__Group__1__Impl rule__AssignmentExpression__Group__2
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__1__Impl_in_rule__AssignmentExpression__Group__15278);
            rule__AssignmentExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__2_in_rule__AssignmentExpression__Group__15281);
            rule__AssignmentExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group__1"


    // $ANTLR start "rule__AssignmentExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2575:1: rule__AssignmentExpression__Group__1__Impl : ( '<-' ) ;
    public final void rule__AssignmentExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2579:1: ( ( '<-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2580:1: ( '<-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2580:1: ( '<-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2581:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getLessThanSignHyphenMinusKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__AssignmentExpression__Group__1__Impl5309); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExpressionAccess().getLessThanSignHyphenMinusKeyword_1()); 
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
    // $ANTLR end "rule__AssignmentExpression__Group__1__Impl"


    // $ANTLR start "rule__AssignmentExpression__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2594:1: rule__AssignmentExpression__Group__2 : rule__AssignmentExpression__Group__2__Impl ;
    public final void rule__AssignmentExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2598:1: ( rule__AssignmentExpression__Group__2__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2599:2: rule__AssignmentExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__2__Impl_in_rule__AssignmentExpression__Group__25340);
            rule__AssignmentExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Group__2"


    // $ANTLR start "rule__AssignmentExpression__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2605:1: rule__AssignmentExpression__Group__2__Impl : ( ( rule__AssignmentExpression__ExprAssignment_2 ) ) ;
    public final void rule__AssignmentExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2609:1: ( ( ( rule__AssignmentExpression__ExprAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2610:1: ( ( rule__AssignmentExpression__ExprAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2610:1: ( ( rule__AssignmentExpression__ExprAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2611:1: ( rule__AssignmentExpression__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getExprAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2612:1: ( rule__AssignmentExpression__ExprAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2612:2: rule__AssignmentExpression__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__ExprAssignment_2_in_rule__AssignmentExpression__Group__2__Impl5367);
            rule__AssignmentExpression__ExprAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExpressionAccess().getExprAssignment_2()); 
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
    // $ANTLR end "rule__AssignmentExpression__Group__2__Impl"


    // $ANTLR start "rule__NegationExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2628:1: rule__NegationExpression__Group__0 : rule__NegationExpression__Group__0__Impl rule__NegationExpression__Group__1 ;
    public final void rule__NegationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2632:1: ( rule__NegationExpression__Group__0__Impl rule__NegationExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2633:2: rule__NegationExpression__Group__0__Impl rule__NegationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group__0__Impl_in_rule__NegationExpression__Group__05403);
            rule__NegationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NegationExpression__Group__1_in_rule__NegationExpression__Group__05406);
            rule__NegationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegationExpression__Group__0"


    // $ANTLR start "rule__NegationExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2640:1: rule__NegationExpression__Group__0__Impl : ( 'not' ) ;
    public final void rule__NegationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2644:1: ( ( 'not' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2645:1: ( 'not' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2645:1: ( 'not' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2646:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationExpressionAccess().getNotKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__NegationExpression__Group__0__Impl5434); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationExpressionAccess().getNotKeyword_0()); 
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
    // $ANTLR end "rule__NegationExpression__Group__0__Impl"


    // $ANTLR start "rule__NegationExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2659:1: rule__NegationExpression__Group__1 : rule__NegationExpression__Group__1__Impl ;
    public final void rule__NegationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2663:1: ( rule__NegationExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2664:2: rule__NegationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group__1__Impl_in_rule__NegationExpression__Group__15465);
            rule__NegationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegationExpression__Group__1"


    // $ANTLR start "rule__NegationExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2670:1: rule__NegationExpression__Group__1__Impl : ( ( rule__NegationExpression__ExprAssignment_1 ) ) ;
    public final void rule__NegationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2674:1: ( ( ( rule__NegationExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2675:1: ( ( rule__NegationExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2675:1: ( ( rule__NegationExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2676:1: ( rule__NegationExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2677:1: ( rule__NegationExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2677:2: rule__NegationExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__NegationExpression__ExprAssignment_1_in_rule__NegationExpression__Group__1__Impl5492);
            rule__NegationExpression__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationExpressionAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__NegationExpression__Group__1__Impl"


    // $ANTLR start "rule__IntegerCompositeExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2691:1: rule__IntegerCompositeExpression__Group__0 : rule__IntegerCompositeExpression__Group__0__Impl rule__IntegerCompositeExpression__Group__1 ;
    public final void rule__IntegerCompositeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2695:1: ( rule__IntegerCompositeExpression__Group__0__Impl rule__IntegerCompositeExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2696:2: rule__IntegerCompositeExpression__Group__0__Impl rule__IntegerCompositeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerCompositeExpression__Group__0__Impl_in_rule__IntegerCompositeExpression__Group__05526);
            rule__IntegerCompositeExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IntegerCompositeExpression__Group__1_in_rule__IntegerCompositeExpression__Group__05529);
            rule__IntegerCompositeExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerCompositeExpression__Group__0"


    // $ANTLR start "rule__IntegerCompositeExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2703:1: rule__IntegerCompositeExpression__Group__0__Impl : ( '~' ) ;
    public final void rule__IntegerCompositeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2707:1: ( ( '~' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2708:1: ( '~' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2708:1: ( '~' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2709:1: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeExpressionAccess().getTildeKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__IntegerCompositeExpression__Group__0__Impl5557); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeExpressionAccess().getTildeKeyword_0()); 
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
    // $ANTLR end "rule__IntegerCompositeExpression__Group__0__Impl"


    // $ANTLR start "rule__IntegerCompositeExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2722:1: rule__IntegerCompositeExpression__Group__1 : rule__IntegerCompositeExpression__Group__1__Impl ;
    public final void rule__IntegerCompositeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2726:1: ( rule__IntegerCompositeExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2727:2: rule__IntegerCompositeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerCompositeExpression__Group__1__Impl_in_rule__IntegerCompositeExpression__Group__15588);
            rule__IntegerCompositeExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerCompositeExpression__Group__1"


    // $ANTLR start "rule__IntegerCompositeExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2733:1: rule__IntegerCompositeExpression__Group__1__Impl : ( ( rule__IntegerCompositeExpression__ExprAssignment_1 ) ) ;
    public final void rule__IntegerCompositeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2737:1: ( ( ( rule__IntegerCompositeExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2738:1: ( ( rule__IntegerCompositeExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2738:1: ( ( rule__IntegerCompositeExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2739:1: ( rule__IntegerCompositeExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2740:1: ( rule__IntegerCompositeExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2740:2: rule__IntegerCompositeExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__IntegerCompositeExpression__ExprAssignment_1_in_rule__IntegerCompositeExpression__Group__1__Impl5615);
            rule__IntegerCompositeExpression__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeExpressionAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__IntegerCompositeExpression__Group__1__Impl"


    // $ANTLR start "rule__NewExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2754:1: rule__NewExpression__Group__0 : rule__NewExpression__Group__0__Impl rule__NewExpression__Group__1 ;
    public final void rule__NewExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2758:1: ( rule__NewExpression__Group__0__Impl rule__NewExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2759:2: rule__NewExpression__Group__0__Impl rule__NewExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NewExpression__Group__0__Impl_in_rule__NewExpression__Group__05649);
            rule__NewExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewExpression__Group__1_in_rule__NewExpression__Group__05652);
            rule__NewExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExpression__Group__0"


    // $ANTLR start "rule__NewExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2766:1: rule__NewExpression__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2770:1: ( ( 'new' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2771:1: ( 'new' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2771:1: ( 'new' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2772:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getNewKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__NewExpression__Group__0__Impl5680); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewExpressionAccess().getNewKeyword_0()); 
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
    // $ANTLR end "rule__NewExpression__Group__0__Impl"


    // $ANTLR start "rule__NewExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2785:1: rule__NewExpression__Group__1 : rule__NewExpression__Group__1__Impl ;
    public final void rule__NewExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2789:1: ( rule__NewExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2790:2: rule__NewExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NewExpression__Group__1__Impl_in_rule__NewExpression__Group__15711);
            rule__NewExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExpression__Group__1"


    // $ANTLR start "rule__NewExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2796:1: rule__NewExpression__Group__1__Impl : ( ( rule__NewExpression__Type_nameAssignment_1 ) ) ;
    public final void rule__NewExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2800:1: ( ( ( rule__NewExpression__Type_nameAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2801:1: ( ( rule__NewExpression__Type_nameAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2801:1: ( ( rule__NewExpression__Type_nameAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2802:1: ( rule__NewExpression__Type_nameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getType_nameAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2803:1: ( rule__NewExpression__Type_nameAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2803:2: rule__NewExpression__Type_nameAssignment_1
            {
            pushFollow(FOLLOW_rule__NewExpression__Type_nameAssignment_1_in_rule__NewExpression__Group__1__Impl5738);
            rule__NewExpression__Type_nameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewExpressionAccess().getType_nameAssignment_1()); 
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
    // $ANTLR end "rule__NewExpression__Group__1__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2817:1: rule__StaticDispatchExpression__Group__0 : rule__StaticDispatchExpression__Group__0__Impl rule__StaticDispatchExpression__Group__1 ;
    public final void rule__StaticDispatchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2821:1: ( rule__StaticDispatchExpression__Group__0__Impl rule__StaticDispatchExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2822:2: rule__StaticDispatchExpression__Group__0__Impl rule__StaticDispatchExpression__Group__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__0__Impl_in_rule__StaticDispatchExpression__Group__05772);
            rule__StaticDispatchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__1_in_rule__StaticDispatchExpression__Group__05775);
            rule__StaticDispatchExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group__0"


    // $ANTLR start "rule__StaticDispatchExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2829:1: rule__StaticDispatchExpression__Group__0__Impl : ( ( rule__StaticDispatchExpression__RefAssignment_0 ) ) ;
    public final void rule__StaticDispatchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2833:1: ( ( ( rule__StaticDispatchExpression__RefAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2834:1: ( ( rule__StaticDispatchExpression__RefAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2834:1: ( ( rule__StaticDispatchExpression__RefAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2835:1: ( rule__StaticDispatchExpression__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getRefAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2836:1: ( rule__StaticDispatchExpression__RefAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2836:2: rule__StaticDispatchExpression__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__RefAssignment_0_in_rule__StaticDispatchExpression__Group__0__Impl5802);
            rule__StaticDispatchExpression__RefAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getRefAssignment_0()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group__0__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2846:1: rule__StaticDispatchExpression__Group__1 : rule__StaticDispatchExpression__Group__1__Impl rule__StaticDispatchExpression__Group__2 ;
    public final void rule__StaticDispatchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2850:1: ( rule__StaticDispatchExpression__Group__1__Impl rule__StaticDispatchExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2851:2: rule__StaticDispatchExpression__Group__1__Impl rule__StaticDispatchExpression__Group__2
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__1__Impl_in_rule__StaticDispatchExpression__Group__15832);
            rule__StaticDispatchExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__2_in_rule__StaticDispatchExpression__Group__15835);
            rule__StaticDispatchExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group__1"


    // $ANTLR start "rule__StaticDispatchExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2858:1: rule__StaticDispatchExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__StaticDispatchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2862:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2863:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2863:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2864:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__StaticDispatchExpression__Group__1__Impl5863); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group__1__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2877:1: rule__StaticDispatchExpression__Group__2 : rule__StaticDispatchExpression__Group__2__Impl rule__StaticDispatchExpression__Group__3 ;
    public final void rule__StaticDispatchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2881:1: ( rule__StaticDispatchExpression__Group__2__Impl rule__StaticDispatchExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2882:2: rule__StaticDispatchExpression__Group__2__Impl rule__StaticDispatchExpression__Group__3
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__2__Impl_in_rule__StaticDispatchExpression__Group__25894);
            rule__StaticDispatchExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__3_in_rule__StaticDispatchExpression__Group__25897);
            rule__StaticDispatchExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group__2"


    // $ANTLR start "rule__StaticDispatchExpression__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2889:1: rule__StaticDispatchExpression__Group__2__Impl : ( ( rule__StaticDispatchExpression__Group_2__0 )? ) ;
    public final void rule__StaticDispatchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2893:1: ( ( ( rule__StaticDispatchExpression__Group_2__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2894:1: ( ( rule__StaticDispatchExpression__Group_2__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2894:1: ( ( rule__StaticDispatchExpression__Group_2__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2895:1: ( rule__StaticDispatchExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2896:1: ( rule__StaticDispatchExpression__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||(LA15_0>=14 && LA15_0<=16)||LA15_0==18||LA15_0==24||(LA15_0>=27 && LA15_0<=29)||LA15_0==31||LA15_0==35||(LA15_0>=38 && LA15_0<=39)||LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2896:2: rule__StaticDispatchExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__0_in_rule__StaticDispatchExpression__Group__2__Impl5924);
                    rule__StaticDispatchExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getGroup_2()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group__2__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2906:1: rule__StaticDispatchExpression__Group__3 : rule__StaticDispatchExpression__Group__3__Impl rule__StaticDispatchExpression__Group__4 ;
    public final void rule__StaticDispatchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2910:1: ( rule__StaticDispatchExpression__Group__3__Impl rule__StaticDispatchExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2911:2: rule__StaticDispatchExpression__Group__3__Impl rule__StaticDispatchExpression__Group__4
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__3__Impl_in_rule__StaticDispatchExpression__Group__35955);
            rule__StaticDispatchExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__4_in_rule__StaticDispatchExpression__Group__35958);
            rule__StaticDispatchExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group__3"


    // $ANTLR start "rule__StaticDispatchExpression__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2918:1: rule__StaticDispatchExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__StaticDispatchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2922:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2923:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2923:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2924:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__StaticDispatchExpression__Group__3__Impl5986); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group__3__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2937:1: rule__StaticDispatchExpression__Group__4 : rule__StaticDispatchExpression__Group__4__Impl ;
    public final void rule__StaticDispatchExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2941:1: ( rule__StaticDispatchExpression__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2942:2: rule__StaticDispatchExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__4__Impl_in_rule__StaticDispatchExpression__Group__46017);
            rule__StaticDispatchExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group__4"


    // $ANTLR start "rule__StaticDispatchExpression__Group__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2948:1: rule__StaticDispatchExpression__Group__4__Impl : ( ( rule__StaticDispatchExpression__Group_4__0 )? ) ;
    public final void rule__StaticDispatchExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2952:1: ( ( ( rule__StaticDispatchExpression__Group_4__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2953:1: ( ( rule__StaticDispatchExpression__Group_4__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2953:1: ( ( rule__StaticDispatchExpression__Group_4__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2954:1: ( rule__StaticDispatchExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getGroup_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2955:1: ( rule__StaticDispatchExpression__Group_4__0 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2955:2: rule__StaticDispatchExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_4__0_in_rule__StaticDispatchExpression__Group__4__Impl6044);
                    rule__StaticDispatchExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group__4__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group_2__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2975:1: rule__StaticDispatchExpression__Group_2__0 : rule__StaticDispatchExpression__Group_2__0__Impl rule__StaticDispatchExpression__Group_2__1 ;
    public final void rule__StaticDispatchExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2979:1: ( rule__StaticDispatchExpression__Group_2__0__Impl rule__StaticDispatchExpression__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2980:2: rule__StaticDispatchExpression__Group_2__0__Impl rule__StaticDispatchExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__0__Impl_in_rule__StaticDispatchExpression__Group_2__06085);
            rule__StaticDispatchExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__1_in_rule__StaticDispatchExpression__Group_2__06088);
            rule__StaticDispatchExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group_2__0"


    // $ANTLR start "rule__StaticDispatchExpression__Group_2__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2987:1: rule__StaticDispatchExpression__Group_2__0__Impl : ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) ) ;
    public final void rule__StaticDispatchExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2991:1: ( ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2992:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2992:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2993:1: ( rule__StaticDispatchExpression__ActualAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualAssignment_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2994:1: ( rule__StaticDispatchExpression__ActualAssignment_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2994:2: rule__StaticDispatchExpression__ActualAssignment_2_0
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_0_in_rule__StaticDispatchExpression__Group_2__0__Impl6115);
            rule__StaticDispatchExpression__ActualAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getActualAssignment_2_0()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group_2__0__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group_2__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3004:1: rule__StaticDispatchExpression__Group_2__1 : rule__StaticDispatchExpression__Group_2__1__Impl ;
    public final void rule__StaticDispatchExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3008:1: ( rule__StaticDispatchExpression__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3009:2: rule__StaticDispatchExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__1__Impl_in_rule__StaticDispatchExpression__Group_2__16145);
            rule__StaticDispatchExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group_2__1"


    // $ANTLR start "rule__StaticDispatchExpression__Group_2__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3015:1: rule__StaticDispatchExpression__Group_2__1__Impl : ( ( rule__StaticDispatchExpression__Group_2_1__0 )* ) ;
    public final void rule__StaticDispatchExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3019:1: ( ( ( rule__StaticDispatchExpression__Group_2_1__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3020:1: ( ( rule__StaticDispatchExpression__Group_2_1__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3020:1: ( ( rule__StaticDispatchExpression__Group_2_1__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3021:1: ( rule__StaticDispatchExpression__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getGroup_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3022:1: ( rule__StaticDispatchExpression__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3022:2: rule__StaticDispatchExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__0_in_rule__StaticDispatchExpression__Group_2__1__Impl6172);
            	    rule__StaticDispatchExpression__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group_2__1__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group_2_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3036:1: rule__StaticDispatchExpression__Group_2_1__0 : rule__StaticDispatchExpression__Group_2_1__0__Impl rule__StaticDispatchExpression__Group_2_1__1 ;
    public final void rule__StaticDispatchExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3040:1: ( rule__StaticDispatchExpression__Group_2_1__0__Impl rule__StaticDispatchExpression__Group_2_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3041:2: rule__StaticDispatchExpression__Group_2_1__0__Impl rule__StaticDispatchExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__0__Impl_in_rule__StaticDispatchExpression__Group_2_1__06207);
            rule__StaticDispatchExpression__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__1_in_rule__StaticDispatchExpression__Group_2_1__06210);
            rule__StaticDispatchExpression__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group_2_1__0"


    // $ANTLR start "rule__StaticDispatchExpression__Group_2_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3048:1: rule__StaticDispatchExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__StaticDispatchExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3052:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3053:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3053:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3054:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__StaticDispatchExpression__Group_2_1__0__Impl6238); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group_2_1__0__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group_2_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3067:1: rule__StaticDispatchExpression__Group_2_1__1 : rule__StaticDispatchExpression__Group_2_1__1__Impl ;
    public final void rule__StaticDispatchExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3071:1: ( rule__StaticDispatchExpression__Group_2_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3072:2: rule__StaticDispatchExpression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__1__Impl_in_rule__StaticDispatchExpression__Group_2_1__16269);
            rule__StaticDispatchExpression__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group_2_1__1"


    // $ANTLR start "rule__StaticDispatchExpression__Group_2_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3078:1: rule__StaticDispatchExpression__Group_2_1__1__Impl : ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) ) ;
    public final void rule__StaticDispatchExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3082:1: ( ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3083:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3083:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3084:1: ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualAssignment_2_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3085:1: ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3085:2: rule__StaticDispatchExpression__ActualAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_1_1_in_rule__StaticDispatchExpression__Group_2_1__1__Impl6296);
            rule__StaticDispatchExpression__ActualAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getActualAssignment_2_1_1()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group_2_1__1__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group_4__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3099:1: rule__StaticDispatchExpression__Group_4__0 : rule__StaticDispatchExpression__Group_4__0__Impl rule__StaticDispatchExpression__Group_4__1 ;
    public final void rule__StaticDispatchExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3103:1: ( rule__StaticDispatchExpression__Group_4__0__Impl rule__StaticDispatchExpression__Group_4__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3104:2: rule__StaticDispatchExpression__Group_4__0__Impl rule__StaticDispatchExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_4__0__Impl_in_rule__StaticDispatchExpression__Group_4__06330);
            rule__StaticDispatchExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_4__1_in_rule__StaticDispatchExpression__Group_4__06333);
            rule__StaticDispatchExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group_4__0"


    // $ANTLR start "rule__StaticDispatchExpression__Group_4__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3111:1: rule__StaticDispatchExpression__Group_4__0__Impl : ( ( '.' ) ) ;
    public final void rule__StaticDispatchExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3115:1: ( ( ( '.' ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3116:1: ( ( '.' ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3116:1: ( ( '.' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3117:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getFullStopKeyword_4_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3118:1: ( '.' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3119:2: '.'
            {
            match(input,30,FOLLOW_30_in_rule__StaticDispatchExpression__Group_4__0__Impl6362); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getFullStopKeyword_4_0()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group_4__0__Impl"


    // $ANTLR start "rule__StaticDispatchExpression__Group_4__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3130:1: rule__StaticDispatchExpression__Group_4__1 : rule__StaticDispatchExpression__Group_4__1__Impl ;
    public final void rule__StaticDispatchExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3134:1: ( rule__StaticDispatchExpression__Group_4__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3135:2: rule__StaticDispatchExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_4__1__Impl_in_rule__StaticDispatchExpression__Group_4__16394);
            rule__StaticDispatchExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticDispatchExpression__Group_4__1"


    // $ANTLR start "rule__StaticDispatchExpression__Group_4__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3141:1: rule__StaticDispatchExpression__Group_4__1__Impl : ( ( rule__StaticDispatchExpression__ChainAssignment_4_1 ) ) ;
    public final void rule__StaticDispatchExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3145:1: ( ( ( rule__StaticDispatchExpression__ChainAssignment_4_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3146:1: ( ( rule__StaticDispatchExpression__ChainAssignment_4_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3146:1: ( ( rule__StaticDispatchExpression__ChainAssignment_4_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3147:1: ( rule__StaticDispatchExpression__ChainAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getChainAssignment_4_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3148:1: ( rule__StaticDispatchExpression__ChainAssignment_4_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3148:2: rule__StaticDispatchExpression__ChainAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__ChainAssignment_4_1_in_rule__StaticDispatchExpression__Group_4__1__Impl6421);
            rule__StaticDispatchExpression__ChainAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getChainAssignment_4_1()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__Group_4__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3162:1: rule__ConditionalExpression__Group__0 : rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 ;
    public final void rule__ConditionalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3166:1: ( rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3167:2: rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__06455);
            rule__ConditionalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__06458);
            rule__ConditionalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__0"


    // $ANTLR start "rule__ConditionalExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3174:1: rule__ConditionalExpression__Group__0__Impl : ( 'if' ) ;
    public final void rule__ConditionalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3178:1: ( ( 'if' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3179:1: ( 'if' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3179:1: ( 'if' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3180:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getIfKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ConditionalExpression__Group__0__Impl6486); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__ConditionalExpression__Group__0__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3193:1: rule__ConditionalExpression__Group__1 : rule__ConditionalExpression__Group__1__Impl rule__ConditionalExpression__Group__2 ;
    public final void rule__ConditionalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3197:1: ( rule__ConditionalExpression__Group__1__Impl rule__ConditionalExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3198:2: rule__ConditionalExpression__Group__1__Impl rule__ConditionalExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__16517);
            rule__ConditionalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__2_in_rule__ConditionalExpression__Group__16520);
            rule__ConditionalExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__1"


    // $ANTLR start "rule__ConditionalExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3205:1: rule__ConditionalExpression__Group__1__Impl : ( ( rule__ConditionalExpression__PredAssignment_1 ) ) ;
    public final void rule__ConditionalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3209:1: ( ( ( rule__ConditionalExpression__PredAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3210:1: ( ( rule__ConditionalExpression__PredAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3210:1: ( ( rule__ConditionalExpression__PredAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3211:1: ( rule__ConditionalExpression__PredAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getPredAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3212:1: ( rule__ConditionalExpression__PredAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3212:2: rule__ConditionalExpression__PredAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__PredAssignment_1_in_rule__ConditionalExpression__Group__1__Impl6547);
            rule__ConditionalExpression__PredAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getPredAssignment_1()); 
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
    // $ANTLR end "rule__ConditionalExpression__Group__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3222:1: rule__ConditionalExpression__Group__2 : rule__ConditionalExpression__Group__2__Impl rule__ConditionalExpression__Group__3 ;
    public final void rule__ConditionalExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3226:1: ( rule__ConditionalExpression__Group__2__Impl rule__ConditionalExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3227:2: rule__ConditionalExpression__Group__2__Impl rule__ConditionalExpression__Group__3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__2__Impl_in_rule__ConditionalExpression__Group__26577);
            rule__ConditionalExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__3_in_rule__ConditionalExpression__Group__26580);
            rule__ConditionalExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__2"


    // $ANTLR start "rule__ConditionalExpression__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3234:1: rule__ConditionalExpression__Group__2__Impl : ( 'then' ) ;
    public final void rule__ConditionalExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3238:1: ( ( 'then' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3239:1: ( 'then' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3239:1: ( 'then' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3240:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getThenKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ConditionalExpression__Group__2__Impl6608); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getThenKeyword_2()); 
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
    // $ANTLR end "rule__ConditionalExpression__Group__2__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3253:1: rule__ConditionalExpression__Group__3 : rule__ConditionalExpression__Group__3__Impl rule__ConditionalExpression__Group__4 ;
    public final void rule__ConditionalExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3257:1: ( rule__ConditionalExpression__Group__3__Impl rule__ConditionalExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3258:2: rule__ConditionalExpression__Group__3__Impl rule__ConditionalExpression__Group__4
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__3__Impl_in_rule__ConditionalExpression__Group__36639);
            rule__ConditionalExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__4_in_rule__ConditionalExpression__Group__36642);
            rule__ConditionalExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__3"


    // $ANTLR start "rule__ConditionalExpression__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3265:1: rule__ConditionalExpression__Group__3__Impl : ( ( rule__ConditionalExpression__Then_expAssignment_3 ) ) ;
    public final void rule__ConditionalExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3269:1: ( ( ( rule__ConditionalExpression__Then_expAssignment_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3270:1: ( ( rule__ConditionalExpression__Then_expAssignment_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3270:1: ( ( rule__ConditionalExpression__Then_expAssignment_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3271:1: ( rule__ConditionalExpression__Then_expAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getThen_expAssignment_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3272:1: ( rule__ConditionalExpression__Then_expAssignment_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3272:2: rule__ConditionalExpression__Then_expAssignment_3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Then_expAssignment_3_in_rule__ConditionalExpression__Group__3__Impl6669);
            rule__ConditionalExpression__Then_expAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getThen_expAssignment_3()); 
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
    // $ANTLR end "rule__ConditionalExpression__Group__3__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3282:1: rule__ConditionalExpression__Group__4 : rule__ConditionalExpression__Group__4__Impl rule__ConditionalExpression__Group__5 ;
    public final void rule__ConditionalExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3286:1: ( rule__ConditionalExpression__Group__4__Impl rule__ConditionalExpression__Group__5 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3287:2: rule__ConditionalExpression__Group__4__Impl rule__ConditionalExpression__Group__5
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__4__Impl_in_rule__ConditionalExpression__Group__46699);
            rule__ConditionalExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__5_in_rule__ConditionalExpression__Group__46702);
            rule__ConditionalExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__4"


    // $ANTLR start "rule__ConditionalExpression__Group__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3294:1: rule__ConditionalExpression__Group__4__Impl : ( ( rule__ConditionalExpression__Group_4__0 )? ) ;
    public final void rule__ConditionalExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3298:1: ( ( ( rule__ConditionalExpression__Group_4__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3299:1: ( ( rule__ConditionalExpression__Group_4__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3299:1: ( ( rule__ConditionalExpression__Group_4__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3300:1: ( rule__ConditionalExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getGroup_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3301:1: ( rule__ConditionalExpression__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3301:2: rule__ConditionalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ConditionalExpression__Group_4__0_in_rule__ConditionalExpression__Group__4__Impl6729);
                    rule__ConditionalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__ConditionalExpression__Group__4__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group__5"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3311:1: rule__ConditionalExpression__Group__5 : rule__ConditionalExpression__Group__5__Impl ;
    public final void rule__ConditionalExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3315:1: ( rule__ConditionalExpression__Group__5__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3316:2: rule__ConditionalExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__5__Impl_in_rule__ConditionalExpression__Group__56760);
            rule__ConditionalExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__5"


    // $ANTLR start "rule__ConditionalExpression__Group__5__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3322:1: rule__ConditionalExpression__Group__5__Impl : ( 'fi' ) ;
    public final void rule__ConditionalExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3326:1: ( ( 'fi' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3327:1: ( 'fi' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3327:1: ( 'fi' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3328:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getFiKeyword_5()); 
            }
            match(input,33,FOLLOW_33_in_rule__ConditionalExpression__Group__5__Impl6788); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getFiKeyword_5()); 
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
    // $ANTLR end "rule__ConditionalExpression__Group__5__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_4__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3353:1: rule__ConditionalExpression__Group_4__0 : rule__ConditionalExpression__Group_4__0__Impl rule__ConditionalExpression__Group_4__1 ;
    public final void rule__ConditionalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3357:1: ( rule__ConditionalExpression__Group_4__0__Impl rule__ConditionalExpression__Group_4__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3358:2: rule__ConditionalExpression__Group_4__0__Impl rule__ConditionalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_4__0__Impl_in_rule__ConditionalExpression__Group_4__06831);
            rule__ConditionalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_4__1_in_rule__ConditionalExpression__Group_4__06834);
            rule__ConditionalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_4__0"


    // $ANTLR start "rule__ConditionalExpression__Group_4__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3365:1: rule__ConditionalExpression__Group_4__0__Impl : ( ( 'else' ) ) ;
    public final void rule__ConditionalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3369:1: ( ( ( 'else' ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3370:1: ( ( 'else' ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3370:1: ( ( 'else' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3371:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getElseKeyword_4_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3372:1: ( 'else' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3373:2: 'else'
            {
            match(input,34,FOLLOW_34_in_rule__ConditionalExpression__Group_4__0__Impl6863); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getElseKeyword_4_0()); 
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
    // $ANTLR end "rule__ConditionalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_4__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3384:1: rule__ConditionalExpression__Group_4__1 : rule__ConditionalExpression__Group_4__1__Impl ;
    public final void rule__ConditionalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3388:1: ( rule__ConditionalExpression__Group_4__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3389:2: rule__ConditionalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_4__1__Impl_in_rule__ConditionalExpression__Group_4__16895);
            rule__ConditionalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_4__1"


    // $ANTLR start "rule__ConditionalExpression__Group_4__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3395:1: rule__ConditionalExpression__Group_4__1__Impl : ( ( rule__ConditionalExpression__Else_expAssignment_4_1 ) ) ;
    public final void rule__ConditionalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3399:1: ( ( ( rule__ConditionalExpression__Else_expAssignment_4_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3400:1: ( ( rule__ConditionalExpression__Else_expAssignment_4_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3400:1: ( ( rule__ConditionalExpression__Else_expAssignment_4_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3401:1: ( rule__ConditionalExpression__Else_expAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getElse_expAssignment_4_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3402:1: ( rule__ConditionalExpression__Else_expAssignment_4_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3402:2: rule__ConditionalExpression__Else_expAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Else_expAssignment_4_1_in_rule__ConditionalExpression__Group_4__1__Impl6922);
            rule__ConditionalExpression__Else_expAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getElse_expAssignment_4_1()); 
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
    // $ANTLR end "rule__ConditionalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__LoopExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3416:1: rule__LoopExpression__Group__0 : rule__LoopExpression__Group__0__Impl rule__LoopExpression__Group__1 ;
    public final void rule__LoopExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3420:1: ( rule__LoopExpression__Group__0__Impl rule__LoopExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3421:2: rule__LoopExpression__Group__0__Impl rule__LoopExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__0__Impl_in_rule__LoopExpression__Group__06956);
            rule__LoopExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__1_in_rule__LoopExpression__Group__06959);
            rule__LoopExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopExpression__Group__0"


    // $ANTLR start "rule__LoopExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3428:1: rule__LoopExpression__Group__0__Impl : ( 'while' ) ;
    public final void rule__LoopExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3432:1: ( ( 'while' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3433:1: ( 'while' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3433:1: ( 'while' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3434:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getWhileKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__LoopExpression__Group__0__Impl6987); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopExpressionAccess().getWhileKeyword_0()); 
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
    // $ANTLR end "rule__LoopExpression__Group__0__Impl"


    // $ANTLR start "rule__LoopExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3447:1: rule__LoopExpression__Group__1 : rule__LoopExpression__Group__1__Impl rule__LoopExpression__Group__2 ;
    public final void rule__LoopExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3451:1: ( rule__LoopExpression__Group__1__Impl rule__LoopExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3452:2: rule__LoopExpression__Group__1__Impl rule__LoopExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__1__Impl_in_rule__LoopExpression__Group__17018);
            rule__LoopExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__2_in_rule__LoopExpression__Group__17021);
            rule__LoopExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopExpression__Group__1"


    // $ANTLR start "rule__LoopExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3459:1: rule__LoopExpression__Group__1__Impl : ( ( rule__LoopExpression__PredAssignment_1 ) ) ;
    public final void rule__LoopExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3463:1: ( ( ( rule__LoopExpression__PredAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3464:1: ( ( rule__LoopExpression__PredAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3464:1: ( ( rule__LoopExpression__PredAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3465:1: ( rule__LoopExpression__PredAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getPredAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3466:1: ( rule__LoopExpression__PredAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3466:2: rule__LoopExpression__PredAssignment_1
            {
            pushFollow(FOLLOW_rule__LoopExpression__PredAssignment_1_in_rule__LoopExpression__Group__1__Impl7048);
            rule__LoopExpression__PredAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopExpressionAccess().getPredAssignment_1()); 
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
    // $ANTLR end "rule__LoopExpression__Group__1__Impl"


    // $ANTLR start "rule__LoopExpression__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3476:1: rule__LoopExpression__Group__2 : rule__LoopExpression__Group__2__Impl rule__LoopExpression__Group__3 ;
    public final void rule__LoopExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3480:1: ( rule__LoopExpression__Group__2__Impl rule__LoopExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3481:2: rule__LoopExpression__Group__2__Impl rule__LoopExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__2__Impl_in_rule__LoopExpression__Group__27078);
            rule__LoopExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__3_in_rule__LoopExpression__Group__27081);
            rule__LoopExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopExpression__Group__2"


    // $ANTLR start "rule__LoopExpression__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3488:1: rule__LoopExpression__Group__2__Impl : ( 'loop' ) ;
    public final void rule__LoopExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3492:1: ( ( 'loop' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3493:1: ( 'loop' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3493:1: ( 'loop' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3494:1: 'loop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getLoopKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__LoopExpression__Group__2__Impl7109); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopExpressionAccess().getLoopKeyword_2()); 
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
    // $ANTLR end "rule__LoopExpression__Group__2__Impl"


    // $ANTLR start "rule__LoopExpression__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3507:1: rule__LoopExpression__Group__3 : rule__LoopExpression__Group__3__Impl rule__LoopExpression__Group__4 ;
    public final void rule__LoopExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3511:1: ( rule__LoopExpression__Group__3__Impl rule__LoopExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3512:2: rule__LoopExpression__Group__3__Impl rule__LoopExpression__Group__4
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__3__Impl_in_rule__LoopExpression__Group__37140);
            rule__LoopExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__4_in_rule__LoopExpression__Group__37143);
            rule__LoopExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopExpression__Group__3"


    // $ANTLR start "rule__LoopExpression__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3519:1: rule__LoopExpression__Group__3__Impl : ( ( rule__LoopExpression__BodyAssignment_3 ) ) ;
    public final void rule__LoopExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3523:1: ( ( ( rule__LoopExpression__BodyAssignment_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3524:1: ( ( rule__LoopExpression__BodyAssignment_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3524:1: ( ( rule__LoopExpression__BodyAssignment_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3525:1: ( rule__LoopExpression__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getBodyAssignment_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3526:1: ( rule__LoopExpression__BodyAssignment_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3526:2: rule__LoopExpression__BodyAssignment_3
            {
            pushFollow(FOLLOW_rule__LoopExpression__BodyAssignment_3_in_rule__LoopExpression__Group__3__Impl7170);
            rule__LoopExpression__BodyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopExpressionAccess().getBodyAssignment_3()); 
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
    // $ANTLR end "rule__LoopExpression__Group__3__Impl"


    // $ANTLR start "rule__LoopExpression__Group__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3536:1: rule__LoopExpression__Group__4 : rule__LoopExpression__Group__4__Impl ;
    public final void rule__LoopExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3540:1: ( rule__LoopExpression__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3541:2: rule__LoopExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__4__Impl_in_rule__LoopExpression__Group__47200);
            rule__LoopExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopExpression__Group__4"


    // $ANTLR start "rule__LoopExpression__Group__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3547:1: rule__LoopExpression__Group__4__Impl : ( 'pool' ) ;
    public final void rule__LoopExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3551:1: ( ( 'pool' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3552:1: ( 'pool' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3552:1: ( 'pool' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3553:1: 'pool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getPoolKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__LoopExpression__Group__4__Impl7228); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopExpressionAccess().getPoolKeyword_4()); 
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
    // $ANTLR end "rule__LoopExpression__Group__4__Impl"


    // $ANTLR start "rule__BlockExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3576:1: rule__BlockExpression__Group__0 : rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 ;
    public final void rule__BlockExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3580:1: ( rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3581:2: rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__0__Impl_in_rule__BlockExpression__Group__07269);
            rule__BlockExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group__1_in_rule__BlockExpression__Group__07272);
            rule__BlockExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__0"


    // $ANTLR start "rule__BlockExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3588:1: rule__BlockExpression__Group__0__Impl : ( () ) ;
    public final void rule__BlockExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3592:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3593:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3593:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3594:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3595:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3597:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__0__Impl"


    // $ANTLR start "rule__BlockExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3607:1: rule__BlockExpression__Group__1 : rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 ;
    public final void rule__BlockExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3611:1: ( rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3612:2: rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__1__Impl_in_rule__BlockExpression__Group__17330);
            rule__BlockExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group__2_in_rule__BlockExpression__Group__17333);
            rule__BlockExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__1"


    // $ANTLR start "rule__BlockExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3619:1: rule__BlockExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BlockExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3623:1: ( ( '{' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3624:1: ( '{' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3624:1: ( '{' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3625:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__BlockExpression__Group__1__Impl7361); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__BlockExpression__Group__1__Impl"


    // $ANTLR start "rule__BlockExpression__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3638:1: rule__BlockExpression__Group__2 : rule__BlockExpression__Group__2__Impl rule__BlockExpression__Group__3 ;
    public final void rule__BlockExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3642:1: ( rule__BlockExpression__Group__2__Impl rule__BlockExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3643:2: rule__BlockExpression__Group__2__Impl rule__BlockExpression__Group__3
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__2__Impl_in_rule__BlockExpression__Group__27392);
            rule__BlockExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group__3_in_rule__BlockExpression__Group__27395);
            rule__BlockExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__2"


    // $ANTLR start "rule__BlockExpression__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3650:1: rule__BlockExpression__Group__2__Impl : ( ( rule__BlockExpression__Group_2__0 )* ) ;
    public final void rule__BlockExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3654:1: ( ( ( rule__BlockExpression__Group_2__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3655:1: ( ( rule__BlockExpression__Group_2__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3655:1: ( ( rule__BlockExpression__Group_2__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3656:1: ( rule__BlockExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3657:1: ( rule__BlockExpression__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=14 && LA19_0<=16)||LA19_0==18||LA19_0==24||(LA19_0>=27 && LA19_0<=29)||LA19_0==31||LA19_0==35||(LA19_0>=38 && LA19_0<=39)||LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3657:2: rule__BlockExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BlockExpression__Group_2__0_in_rule__BlockExpression__Group__2__Impl7422);
            	    rule__BlockExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getGroup_2()); 
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
    // $ANTLR end "rule__BlockExpression__Group__2__Impl"


    // $ANTLR start "rule__BlockExpression__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3667:1: rule__BlockExpression__Group__3 : rule__BlockExpression__Group__3__Impl ;
    public final void rule__BlockExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3671:1: ( rule__BlockExpression__Group__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3672:2: rule__BlockExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__3__Impl_in_rule__BlockExpression__Group__37453);
            rule__BlockExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__3"


    // $ANTLR start "rule__BlockExpression__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3678:1: rule__BlockExpression__Group__3__Impl : ( '}' ) ;
    public final void rule__BlockExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3682:1: ( ( '}' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3683:1: ( '}' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3683:1: ( '}' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3684:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__BlockExpression__Group__3__Impl7481); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__BlockExpression__Group__3__Impl"


    // $ANTLR start "rule__BlockExpression__Group_2__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3705:1: rule__BlockExpression__Group_2__0 : rule__BlockExpression__Group_2__0__Impl rule__BlockExpression__Group_2__1 ;
    public final void rule__BlockExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3709:1: ( rule__BlockExpression__Group_2__0__Impl rule__BlockExpression__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3710:2: rule__BlockExpression__Group_2__0__Impl rule__BlockExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group_2__0__Impl_in_rule__BlockExpression__Group_2__07520);
            rule__BlockExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group_2__1_in_rule__BlockExpression__Group_2__07523);
            rule__BlockExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_2__0"


    // $ANTLR start "rule__BlockExpression__Group_2__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3717:1: rule__BlockExpression__Group_2__0__Impl : ( ( rule__BlockExpression__BodyAssignment_2_0 ) ) ;
    public final void rule__BlockExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3721:1: ( ( ( rule__BlockExpression__BodyAssignment_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3722:1: ( ( rule__BlockExpression__BodyAssignment_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3722:1: ( ( rule__BlockExpression__BodyAssignment_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3723:1: ( rule__BlockExpression__BodyAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBodyAssignment_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3724:1: ( rule__BlockExpression__BodyAssignment_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3724:2: rule__BlockExpression__BodyAssignment_2_0
            {
            pushFollow(FOLLOW_rule__BlockExpression__BodyAssignment_2_0_in_rule__BlockExpression__Group_2__0__Impl7550);
            rule__BlockExpression__BodyAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getBodyAssignment_2_0()); 
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
    // $ANTLR end "rule__BlockExpression__Group_2__0__Impl"


    // $ANTLR start "rule__BlockExpression__Group_2__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3734:1: rule__BlockExpression__Group_2__1 : rule__BlockExpression__Group_2__1__Impl ;
    public final void rule__BlockExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3738:1: ( rule__BlockExpression__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3739:2: rule__BlockExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group_2__1__Impl_in_rule__BlockExpression__Group_2__17580);
            rule__BlockExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_2__1"


    // $ANTLR start "rule__BlockExpression__Group_2__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3745:1: rule__BlockExpression__Group_2__1__Impl : ( ';' ) ;
    public final void rule__BlockExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3749:1: ( ( ';' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3750:1: ( ';' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3750:1: ( ';' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3751:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__BlockExpression__Group_2__1__Impl7608); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1()); 
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
    // $ANTLR end "rule__BlockExpression__Group_2__1__Impl"


    // $ANTLR start "rule__IsvoidExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3768:1: rule__IsvoidExpression__Group__0 : rule__IsvoidExpression__Group__0__Impl rule__IsvoidExpression__Group__1 ;
    public final void rule__IsvoidExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3772:1: ( rule__IsvoidExpression__Group__0__Impl rule__IsvoidExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3773:2: rule__IsvoidExpression__Group__0__Impl rule__IsvoidExpression__Group__1
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__0__Impl_in_rule__IsvoidExpression__Group__07643);
            rule__IsvoidExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__1_in_rule__IsvoidExpression__Group__07646);
            rule__IsvoidExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsvoidExpression__Group__0"


    // $ANTLR start "rule__IsvoidExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3780:1: rule__IsvoidExpression__Group__0__Impl : ( 'isvoid' ) ;
    public final void rule__IsvoidExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3784:1: ( ( 'isvoid' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3785:1: ( 'isvoid' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3785:1: ( 'isvoid' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3786:1: 'isvoid'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getIsvoidKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__IsvoidExpression__Group__0__Impl7674); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsvoidExpressionAccess().getIsvoidKeyword_0()); 
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
    // $ANTLR end "rule__IsvoidExpression__Group__0__Impl"


    // $ANTLR start "rule__IsvoidExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3799:1: rule__IsvoidExpression__Group__1 : rule__IsvoidExpression__Group__1__Impl ;
    public final void rule__IsvoidExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3803:1: ( rule__IsvoidExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3804:2: rule__IsvoidExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__1__Impl_in_rule__IsvoidExpression__Group__17705);
            rule__IsvoidExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsvoidExpression__Group__1"


    // $ANTLR start "rule__IsvoidExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3810:1: rule__IsvoidExpression__Group__1__Impl : ( ( rule__IsvoidExpression__ExprAssignment_1 ) ) ;
    public final void rule__IsvoidExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3814:1: ( ( ( rule__IsvoidExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3815:1: ( ( rule__IsvoidExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3815:1: ( ( rule__IsvoidExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3816:1: ( rule__IsvoidExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3817:1: ( rule__IsvoidExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3817:2: rule__IsvoidExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__ExprAssignment_1_in_rule__IsvoidExpression__Group__1__Impl7732);
            rule__IsvoidExpression__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsvoidExpressionAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__IsvoidExpression__Group__1__Impl"


    // $ANTLR start "rule__LetExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3831:1: rule__LetExpression__Group__0 : rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 ;
    public final void rule__LetExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3835:1: ( rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3836:2: rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__0__Impl_in_rule__LetExpression__Group__07766);
            rule__LetExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__1_in_rule__LetExpression__Group__07769);
            rule__LetExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__0"


    // $ANTLR start "rule__LetExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3843:1: rule__LetExpression__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3847:1: ( ( 'let' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3848:1: ( 'let' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3848:1: ( 'let' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3849:1: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__LetExpression__Group__0__Impl7797); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 
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
    // $ANTLR end "rule__LetExpression__Group__0__Impl"


    // $ANTLR start "rule__LetExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3862:1: rule__LetExpression__Group__1 : rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 ;
    public final void rule__LetExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3866:1: ( rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3867:2: rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__1__Impl_in_rule__LetExpression__Group__17828);
            rule__LetExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__2_in_rule__LetExpression__Group__17831);
            rule__LetExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__1"


    // $ANTLR start "rule__LetExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3874:1: rule__LetExpression__Group__1__Impl : ( ( rule__LetExpression__DeclarationAssignment_1 ) ) ;
    public final void rule__LetExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3878:1: ( ( ( rule__LetExpression__DeclarationAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3879:1: ( ( rule__LetExpression__DeclarationAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3879:1: ( ( rule__LetExpression__DeclarationAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3880:1: ( rule__LetExpression__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3881:1: ( rule__LetExpression__DeclarationAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3881:2: rule__LetExpression__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_rule__LetExpression__DeclarationAssignment_1_in_rule__LetExpression__Group__1__Impl7858);
            rule__LetExpression__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_1()); 
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
    // $ANTLR end "rule__LetExpression__Group__1__Impl"


    // $ANTLR start "rule__LetExpression__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3891:1: rule__LetExpression__Group__2 : rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3 ;
    public final void rule__LetExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3895:1: ( rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3896:2: rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__2__Impl_in_rule__LetExpression__Group__27888);
            rule__LetExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__3_in_rule__LetExpression__Group__27891);
            rule__LetExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__2"


    // $ANTLR start "rule__LetExpression__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3903:1: rule__LetExpression__Group__2__Impl : ( ( rule__LetExpression__Group_2__0 )* ) ;
    public final void rule__LetExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3907:1: ( ( ( rule__LetExpression__Group_2__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3908:1: ( ( rule__LetExpression__Group_2__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3908:1: ( ( rule__LetExpression__Group_2__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3909:1: ( rule__LetExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3910:1: ( rule__LetExpression__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3910:2: rule__LetExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__LetExpression__Group_2__0_in_rule__LetExpression__Group__2__Impl7918);
            	    rule__LetExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getGroup_2()); 
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
    // $ANTLR end "rule__LetExpression__Group__2__Impl"


    // $ANTLR start "rule__LetExpression__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3920:1: rule__LetExpression__Group__3 : rule__LetExpression__Group__3__Impl rule__LetExpression__Group__4 ;
    public final void rule__LetExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3924:1: ( rule__LetExpression__Group__3__Impl rule__LetExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3925:2: rule__LetExpression__Group__3__Impl rule__LetExpression__Group__4
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__3__Impl_in_rule__LetExpression__Group__37949);
            rule__LetExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__4_in_rule__LetExpression__Group__37952);
            rule__LetExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__3"


    // $ANTLR start "rule__LetExpression__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3932:1: rule__LetExpression__Group__3__Impl : ( 'in' ) ;
    public final void rule__LetExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3936:1: ( ( 'in' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3937:1: ( 'in' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3937:1: ( 'in' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3938:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getInKeyword_3()); 
            }
            match(input,40,FOLLOW_40_in_rule__LetExpression__Group__3__Impl7980); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getInKeyword_3()); 
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
    // $ANTLR end "rule__LetExpression__Group__3__Impl"


    // $ANTLR start "rule__LetExpression__Group__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3951:1: rule__LetExpression__Group__4 : rule__LetExpression__Group__4__Impl ;
    public final void rule__LetExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3955:1: ( rule__LetExpression__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3956:2: rule__LetExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__4__Impl_in_rule__LetExpression__Group__48011);
            rule__LetExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__4"


    // $ANTLR start "rule__LetExpression__Group__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3962:1: rule__LetExpression__Group__4__Impl : ( ( rule__LetExpression__BodyAssignment_4 ) ) ;
    public final void rule__LetExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3966:1: ( ( ( rule__LetExpression__BodyAssignment_4 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3967:1: ( ( rule__LetExpression__BodyAssignment_4 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3967:1: ( ( rule__LetExpression__BodyAssignment_4 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3968:1: ( rule__LetExpression__BodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getBodyAssignment_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3969:1: ( rule__LetExpression__BodyAssignment_4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3969:2: rule__LetExpression__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__LetExpression__BodyAssignment_4_in_rule__LetExpression__Group__4__Impl8038);
            rule__LetExpression__BodyAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getBodyAssignment_4()); 
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
    // $ANTLR end "rule__LetExpression__Group__4__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3989:1: rule__LetExpression__Group_2__0 : rule__LetExpression__Group_2__0__Impl rule__LetExpression__Group_2__1 ;
    public final void rule__LetExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3993:1: ( rule__LetExpression__Group_2__0__Impl rule__LetExpression__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3994:2: rule__LetExpression__Group_2__0__Impl rule__LetExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__0__Impl_in_rule__LetExpression__Group_2__08078);
            rule__LetExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group_2__1_in_rule__LetExpression__Group_2__08081);
            rule__LetExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_2__0"


    // $ANTLR start "rule__LetExpression__Group_2__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4001:1: rule__LetExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LetExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4005:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4006:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4006:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4007:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getCommaKeyword_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__LetExpression__Group_2__0__Impl8109); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__LetExpression__Group_2__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4020:1: rule__LetExpression__Group_2__1 : rule__LetExpression__Group_2__1__Impl ;
    public final void rule__LetExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4024:1: ( rule__LetExpression__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4025:2: rule__LetExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__1__Impl_in_rule__LetExpression__Group_2__18140);
            rule__LetExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_2__1"


    // $ANTLR start "rule__LetExpression__Group_2__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4031:1: rule__LetExpression__Group_2__1__Impl : ( ( rule__LetExpression__DeclarationAssignment_2_1 ) ) ;
    public final void rule__LetExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4035:1: ( ( ( rule__LetExpression__DeclarationAssignment_2_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4036:1: ( ( rule__LetExpression__DeclarationAssignment_2_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4036:1: ( ( rule__LetExpression__DeclarationAssignment_2_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4037:1: ( rule__LetExpression__DeclarationAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4038:1: ( rule__LetExpression__DeclarationAssignment_2_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4038:2: rule__LetExpression__DeclarationAssignment_2_1
            {
            pushFollow(FOLLOW_rule__LetExpression__DeclarationAssignment_2_1_in_rule__LetExpression__Group_2__1__Impl8167);
            rule__LetExpression__DeclarationAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_2_1()); 
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
    // $ANTLR end "rule__LetExpression__Group_2__1__Impl"


    // $ANTLR start "rule__LetDeclaration__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4052:1: rule__LetDeclaration__Group__0 : rule__LetDeclaration__Group__0__Impl rule__LetDeclaration__Group__1 ;
    public final void rule__LetDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4056:1: ( rule__LetDeclaration__Group__0__Impl rule__LetDeclaration__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4057:2: rule__LetDeclaration__Group__0__Impl rule__LetDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__0__Impl_in_rule__LetDeclaration__Group__08201);
            rule__LetDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group__1_in_rule__LetDeclaration__Group__08204);
            rule__LetDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetDeclaration__Group__0"


    // $ANTLR start "rule__LetDeclaration__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4064:1: rule__LetDeclaration__Group__0__Impl : ( ( rule__LetDeclaration__NameAssignment_0 ) ) ;
    public final void rule__LetDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4068:1: ( ( ( rule__LetDeclaration__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4069:1: ( ( rule__LetDeclaration__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4069:1: ( ( rule__LetDeclaration__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4070:1: ( rule__LetDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4071:1: ( rule__LetDeclaration__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4071:2: rule__LetDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LetDeclaration__NameAssignment_0_in_rule__LetDeclaration__Group__0__Impl8231);
            rule__LetDeclaration__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__LetDeclaration__Group__0__Impl"


    // $ANTLR start "rule__LetDeclaration__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4081:1: rule__LetDeclaration__Group__1 : rule__LetDeclaration__Group__1__Impl rule__LetDeclaration__Group__2 ;
    public final void rule__LetDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4085:1: ( rule__LetDeclaration__Group__1__Impl rule__LetDeclaration__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4086:2: rule__LetDeclaration__Group__1__Impl rule__LetDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__1__Impl_in_rule__LetDeclaration__Group__18261);
            rule__LetDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group__2_in_rule__LetDeclaration__Group__18264);
            rule__LetDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetDeclaration__Group__1"


    // $ANTLR start "rule__LetDeclaration__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4093:1: rule__LetDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__LetDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4097:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4098:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4098:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4099:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__LetDeclaration__Group__1__Impl8292); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__LetDeclaration__Group__1__Impl"


    // $ANTLR start "rule__LetDeclaration__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4112:1: rule__LetDeclaration__Group__2 : rule__LetDeclaration__Group__2__Impl rule__LetDeclaration__Group__3 ;
    public final void rule__LetDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4116:1: ( rule__LetDeclaration__Group__2__Impl rule__LetDeclaration__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4117:2: rule__LetDeclaration__Group__2__Impl rule__LetDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__2__Impl_in_rule__LetDeclaration__Group__28323);
            rule__LetDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group__3_in_rule__LetDeclaration__Group__28326);
            rule__LetDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetDeclaration__Group__2"


    // $ANTLR start "rule__LetDeclaration__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4124:1: rule__LetDeclaration__Group__2__Impl : ( ( rule__LetDeclaration__Type_declAssignment_2 ) ) ;
    public final void rule__LetDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4128:1: ( ( ( rule__LetDeclaration__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4129:1: ( ( rule__LetDeclaration__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4129:1: ( ( rule__LetDeclaration__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4130:1: ( rule__LetDeclaration__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4131:1: ( rule__LetDeclaration__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4131:2: rule__LetDeclaration__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Type_declAssignment_2_in_rule__LetDeclaration__Group__2__Impl8353);
            rule__LetDeclaration__Type_declAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getType_declAssignment_2()); 
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
    // $ANTLR end "rule__LetDeclaration__Group__2__Impl"


    // $ANTLR start "rule__LetDeclaration__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4141:1: rule__LetDeclaration__Group__3 : rule__LetDeclaration__Group__3__Impl ;
    public final void rule__LetDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4145:1: ( rule__LetDeclaration__Group__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4146:2: rule__LetDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__3__Impl_in_rule__LetDeclaration__Group__38383);
            rule__LetDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetDeclaration__Group__3"


    // $ANTLR start "rule__LetDeclaration__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4152:1: rule__LetDeclaration__Group__3__Impl : ( ( rule__LetDeclaration__Group_3__0 )? ) ;
    public final void rule__LetDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4156:1: ( ( ( rule__LetDeclaration__Group_3__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4157:1: ( ( rule__LetDeclaration__Group_3__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4157:1: ( ( rule__LetDeclaration__Group_3__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4158:1: ( rule__LetDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getGroup_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4159:1: ( rule__LetDeclaration__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4159:2: rule__LetDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LetDeclaration__Group_3__0_in_rule__LetDeclaration__Group__3__Impl8410);
                    rule__LetDeclaration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__LetDeclaration__Group__3__Impl"


    // $ANTLR start "rule__LetDeclaration__Group_3__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4177:1: rule__LetDeclaration__Group_3__0 : rule__LetDeclaration__Group_3__0__Impl rule__LetDeclaration__Group_3__1 ;
    public final void rule__LetDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4181:1: ( rule__LetDeclaration__Group_3__0__Impl rule__LetDeclaration__Group_3__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4182:2: rule__LetDeclaration__Group_3__0__Impl rule__LetDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group_3__0__Impl_in_rule__LetDeclaration__Group_3__08449);
            rule__LetDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group_3__1_in_rule__LetDeclaration__Group_3__08452);
            rule__LetDeclaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetDeclaration__Group_3__0"


    // $ANTLR start "rule__LetDeclaration__Group_3__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4189:1: rule__LetDeclaration__Group_3__0__Impl : ( '<-' ) ;
    public final void rule__LetDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4193:1: ( ( '<-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4194:1: ( '<-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4194:1: ( '<-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4195:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getLessThanSignHyphenMinusKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__LetDeclaration__Group_3__0__Impl8480); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getLessThanSignHyphenMinusKeyword_3_0()); 
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
    // $ANTLR end "rule__LetDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__LetDeclaration__Group_3__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4208:1: rule__LetDeclaration__Group_3__1 : rule__LetDeclaration__Group_3__1__Impl ;
    public final void rule__LetDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4212:1: ( rule__LetDeclaration__Group_3__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4213:2: rule__LetDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group_3__1__Impl_in_rule__LetDeclaration__Group_3__18511);
            rule__LetDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetDeclaration__Group_3__1"


    // $ANTLR start "rule__LetDeclaration__Group_3__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4219:1: rule__LetDeclaration__Group_3__1__Impl : ( ( rule__LetDeclaration__InitAssignment_3_1 ) ) ;
    public final void rule__LetDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4223:1: ( ( ( rule__LetDeclaration__InitAssignment_3_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4224:1: ( ( rule__LetDeclaration__InitAssignment_3_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4224:1: ( ( rule__LetDeclaration__InitAssignment_3_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4225:1: ( rule__LetDeclaration__InitAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getInitAssignment_3_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4226:1: ( rule__LetDeclaration__InitAssignment_3_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4226:2: rule__LetDeclaration__InitAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LetDeclaration__InitAssignment_3_1_in_rule__LetDeclaration__Group_3__1__Impl8538);
            rule__LetDeclaration__InitAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getInitAssignment_3_1()); 
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
    // $ANTLR end "rule__LetDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__CaseExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4240:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4244:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4245:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__08572);
            rule__CaseExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__08575);
            rule__CaseExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__0"


    // $ANTLR start "rule__CaseExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4252:1: rule__CaseExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4256:1: ( ( 'case' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4257:1: ( 'case' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4257:1: ( 'case' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4258:1: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__CaseExpression__Group__0__Impl8603); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseKeyword_0()); 
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
    // $ANTLR end "rule__CaseExpression__Group__0__Impl"


    // $ANTLR start "rule__CaseExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4271:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4275:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4276:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__18634);
            rule__CaseExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__18637);
            rule__CaseExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__1"


    // $ANTLR start "rule__CaseExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4283:1: rule__CaseExpression__Group__1__Impl : ( ( rule__CaseExpression__ExprAssignment_1 ) ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4287:1: ( ( ( rule__CaseExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4288:1: ( ( rule__CaseExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4288:1: ( ( rule__CaseExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4289:1: ( rule__CaseExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4290:1: ( rule__CaseExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4290:2: rule__CaseExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__CaseExpression__ExprAssignment_1_in_rule__CaseExpression__Group__1__Impl8664);
            rule__CaseExpression__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__CaseExpression__Group__1__Impl"


    // $ANTLR start "rule__CaseExpression__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4300:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4304:1: ( rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4305:2: rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__28694);
            rule__CaseExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__28697);
            rule__CaseExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__2"


    // $ANTLR start "rule__CaseExpression__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4312:1: rule__CaseExpression__Group__2__Impl : ( 'of' ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4316:1: ( ( 'of' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4317:1: ( 'of' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4317:1: ( 'of' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4318:1: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getOfKeyword_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__CaseExpression__Group__2__Impl8725); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getOfKeyword_2()); 
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
    // $ANTLR end "rule__CaseExpression__Group__2__Impl"


    // $ANTLR start "rule__CaseExpression__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4331:1: rule__CaseExpression__Group__3 : rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4 ;
    public final void rule__CaseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4335:1: ( rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4336:2: rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__38756);
            rule__CaseExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__4_in_rule__CaseExpression__Group__38759);
            rule__CaseExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__3"


    // $ANTLR start "rule__CaseExpression__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4343:1: rule__CaseExpression__Group__3__Impl : ( ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* ) ) ;
    public final void rule__CaseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4347:1: ( ( ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4348:1: ( ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4348:1: ( ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4349:1: ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4349:1: ( ( rule__CaseExpression__Group_3__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4350:1: ( rule__CaseExpression__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4351:1: ( rule__CaseExpression__Group_3__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4351:2: rule__CaseExpression__Group_3__0
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group_3__0_in_rule__CaseExpression__Group__3__Impl8788);
            rule__CaseExpression__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getGroup_3()); 
            }

            }

            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4354:1: ( ( rule__CaseExpression__Group_3__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4355:1: ( rule__CaseExpression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4356:1: ( rule__CaseExpression__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4356:2: rule__CaseExpression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__CaseExpression__Group_3__0_in_rule__CaseExpression__Group__3__Impl8800);
            	    rule__CaseExpression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getGroup_3()); 
            }

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
    // $ANTLR end "rule__CaseExpression__Group__3__Impl"


    // $ANTLR start "rule__CaseExpression__Group__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4367:1: rule__CaseExpression__Group__4 : rule__CaseExpression__Group__4__Impl ;
    public final void rule__CaseExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4371:1: ( rule__CaseExpression__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4372:2: rule__CaseExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__4__Impl_in_rule__CaseExpression__Group__48833);
            rule__CaseExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__4"


    // $ANTLR start "rule__CaseExpression__Group__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4378:1: rule__CaseExpression__Group__4__Impl : ( 'esac' ) ;
    public final void rule__CaseExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4382:1: ( ( 'esac' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4383:1: ( 'esac' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4383:1: ( 'esac' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4384:1: 'esac'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getEsacKeyword_4()); 
            }
            match(input,43,FOLLOW_43_in_rule__CaseExpression__Group__4__Impl8861); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getEsacKeyword_4()); 
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
    // $ANTLR end "rule__CaseExpression__Group__4__Impl"


    // $ANTLR start "rule__CaseExpression__Group_3__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4407:1: rule__CaseExpression__Group_3__0 : rule__CaseExpression__Group_3__0__Impl rule__CaseExpression__Group_3__1 ;
    public final void rule__CaseExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4411:1: ( rule__CaseExpression__Group_3__0__Impl rule__CaseExpression__Group_3__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4412:2: rule__CaseExpression__Group_3__0__Impl rule__CaseExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group_3__0__Impl_in_rule__CaseExpression__Group_3__08902);
            rule__CaseExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group_3__1_in_rule__CaseExpression__Group_3__08905);
            rule__CaseExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group_3__0"


    // $ANTLR start "rule__CaseExpression__Group_3__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4419:1: rule__CaseExpression__Group_3__0__Impl : ( ( rule__CaseExpression__CaseAssignment_3_0 ) ) ;
    public final void rule__CaseExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4423:1: ( ( ( rule__CaseExpression__CaseAssignment_3_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4424:1: ( ( rule__CaseExpression__CaseAssignment_3_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4424:1: ( ( rule__CaseExpression__CaseAssignment_3_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4425:1: ( rule__CaseExpression__CaseAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4426:1: ( rule__CaseExpression__CaseAssignment_3_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4426:2: rule__CaseExpression__CaseAssignment_3_0
            {
            pushFollow(FOLLOW_rule__CaseExpression__CaseAssignment_3_0_in_rule__CaseExpression__Group_3__0__Impl8932);
            rule__CaseExpression__CaseAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3_0()); 
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
    // $ANTLR end "rule__CaseExpression__Group_3__0__Impl"


    // $ANTLR start "rule__CaseExpression__Group_3__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4436:1: rule__CaseExpression__Group_3__1 : rule__CaseExpression__Group_3__1__Impl ;
    public final void rule__CaseExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4440:1: ( rule__CaseExpression__Group_3__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4441:2: rule__CaseExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group_3__1__Impl_in_rule__CaseExpression__Group_3__18962);
            rule__CaseExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group_3__1"


    // $ANTLR start "rule__CaseExpression__Group_3__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4447:1: rule__CaseExpression__Group_3__1__Impl : ( ';' ) ;
    public final void rule__CaseExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4451:1: ( ( ';' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4452:1: ( ';' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4452:1: ( ';' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4453:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__CaseExpression__Group_3__1__Impl8990); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getSemicolonKeyword_3_1()); 
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
    // $ANTLR end "rule__CaseExpression__Group_3__1__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4470:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4474:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4475:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__09025);
            rule__Case__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__1_in_rule__Case__Group__09028);
            rule__Case__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4482:1: rule__Case__Group__0__Impl : ( ( rule__Case__NameAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4486:1: ( ( ( rule__Case__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4487:1: ( ( rule__Case__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4487:1: ( ( rule__Case__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4488:1: ( rule__Case__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4489:1: ( rule__Case__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4489:2: rule__Case__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl9055);
            rule__Case__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4499:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4503:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4504:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__19085);
            rule__Case__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__2_in_rule__Case__Group__19088);
            rule__Case__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4511:1: rule__Case__Group__1__Impl : ( ':' ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4515:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4516:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4516:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4517:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Case__Group__1__Impl9116); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4530:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4534:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4535:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__29147);
            rule__Case__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__3_in_rule__Case__Group__29150);
            rule__Case__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4542:1: rule__Case__Group__2__Impl : ( ( rule__Case__Type_declAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4546:1: ( ( ( rule__Case__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4547:1: ( ( rule__Case__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4547:1: ( ( rule__Case__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4548:1: ( rule__Case__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4549:1: ( rule__Case__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4549:2: rule__Case__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__Case__Type_declAssignment_2_in_rule__Case__Group__2__Impl9177);
            rule__Case__Type_declAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getType_declAssignment_2()); 
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
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4559:1: rule__Case__Group__3 : rule__Case__Group__3__Impl rule__Case__Group__4 ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4563:1: ( rule__Case__Group__3__Impl rule__Case__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4564:2: rule__Case__Group__3__Impl rule__Case__Group__4
            {
            pushFollow(FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__39207);
            rule__Case__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__4_in_rule__Case__Group__39210);
            rule__Case__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3"


    // $ANTLR start "rule__Case__Group__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4571:1: rule__Case__Group__3__Impl : ( '=>' ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4575:1: ( ( '=>' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4576:1: ( '=>' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4576:1: ( '=>' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4577:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            }
            match(input,44,FOLLOW_44_in_rule__Case__Group__3__Impl9238); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_3()); 
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
    // $ANTLR end "rule__Case__Group__3__Impl"


    // $ANTLR start "rule__Case__Group__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4590:1: rule__Case__Group__4 : rule__Case__Group__4__Impl ;
    public final void rule__Case__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4594:1: ( rule__Case__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4595:2: rule__Case__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__49269);
            rule__Case__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__4"


    // $ANTLR start "rule__Case__Group__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4601:1: rule__Case__Group__4__Impl : ( ( rule__Case__ExprAssignment_4 ) ) ;
    public final void rule__Case__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4605:1: ( ( ( rule__Case__ExprAssignment_4 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4606:1: ( ( rule__Case__ExprAssignment_4 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4606:1: ( ( rule__Case__ExprAssignment_4 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4607:1: ( rule__Case__ExprAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getExprAssignment_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4608:1: ( rule__Case__ExprAssignment_4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4608:2: rule__Case__ExprAssignment_4
            {
            pushFollow(FOLLOW_rule__Case__ExprAssignment_4_in_rule__Case__Group__4__Impl9296);
            rule__Case__ExprAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getExprAssignment_4()); 
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
    // $ANTLR end "rule__Case__Group__4__Impl"


    // $ANTLR start "rule__CompareExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4628:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4632:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4633:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__09336);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__09339);
            rule__CompareExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group__0"


    // $ANTLR start "rule__CompareExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4640:1: rule__CompareExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4644:1: ( ( ruleAdditionExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4645:1: ( ruleAdditionExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4645:1: ( ruleAdditionExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4646:1: ruleAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_rule__CompareExpression__Group__0__Impl9366);
            ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__CompareExpression__Group__0__Impl"


    // $ANTLR start "rule__CompareExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4657:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4661:1: ( rule__CompareExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4662:2: rule__CompareExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__19395);
            rule__CompareExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group__1"


    // $ANTLR start "rule__CompareExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4668:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__Group_1__0 )? ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4672:1: ( ( ( rule__CompareExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4673:1: ( ( rule__CompareExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4673:1: ( ( rule__CompareExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4674:1: ( rule__CompareExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4675:1: ( rule__CompareExpression__Group_1__0 )?
            int alt23=2;
            switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA23_1 = input.LA(2);

                    if ( (synpred38_InternalCool()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (synpred38_InternalCool()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred38_InternalCool()) ) {
                        alt23=1;
                    }
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4675:2: rule__CompareExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl9422);
                    rule__CompareExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CompareExpression__Group__1__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4689:1: rule__CompareExpression__Group_1__0 : rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 ;
    public final void rule__CompareExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4693:1: ( rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4694:2: rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__09457);
            rule__CompareExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__09460);
            rule__CompareExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1__0"


    // $ANTLR start "rule__CompareExpression__Group_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4701:1: rule__CompareExpression__Group_1__0__Impl : ( ( rule__CompareExpression__Group_1_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4705:1: ( ( ( rule__CompareExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4706:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4706:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4707:1: ( rule__CompareExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4708:1: ( rule__CompareExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4708:2: rule__CompareExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl9487);
            rule__CompareExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__CompareExpression__Group_1__0__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4718:1: rule__CompareExpression__Group_1__1 : rule__CompareExpression__Group_1__1__Impl ;
    public final void rule__CompareExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4722:1: ( rule__CompareExpression__Group_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4723:2: rule__CompareExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__19517);
            rule__CompareExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1__1"


    // $ANTLR start "rule__CompareExpression__Group_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4729:1: rule__CompareExpression__Group_1__1__Impl : ( ( rule__CompareExpression__RightAssignment_1_1 ) ) ;
    public final void rule__CompareExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4733:1: ( ( ( rule__CompareExpression__RightAssignment_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4734:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4734:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4735:1: ( rule__CompareExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4736:1: ( rule__CompareExpression__RightAssignment_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4736:2: rule__CompareExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl9544);
            rule__CompareExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__CompareExpression__Group_1__1__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1_0__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4750:1: rule__CompareExpression__Group_1_0__0 : rule__CompareExpression__Group_1_0__0__Impl ;
    public final void rule__CompareExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4754:1: ( rule__CompareExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4755:2: rule__CompareExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__09578);
            rule__CompareExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0__0"


    // $ANTLR start "rule__CompareExpression__Group_1_0__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4761:1: rule__CompareExpression__Group_1_0__0__Impl : ( ( rule__CompareExpression__Group_1_0_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4765:1: ( ( ( rule__CompareExpression__Group_1_0_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4766:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4766:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4767:1: ( rule__CompareExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4768:1: ( rule__CompareExpression__Group_1_0_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4768:2: rule__CompareExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl9605);
            rule__CompareExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__CompareExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1_0_0__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4780:1: rule__CompareExpression__Group_1_0_0__0 : rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 ;
    public final void rule__CompareExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4784:1: ( rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4785:2: rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__09637);
            rule__CompareExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__09640);
            rule__CompareExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0_0__0"


    // $ANTLR start "rule__CompareExpression__Group_1_0_0__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4792:1: rule__CompareExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CompareExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4796:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4797:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4797:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4798:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4799:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4801:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1_0_0__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4811:1: rule__CompareExpression__Group_1_0_0__1 : rule__CompareExpression__Group_1_0_0__1__Impl ;
    public final void rule__CompareExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4815:1: ( rule__CompareExpression__Group_1_0_0__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4816:2: rule__CompareExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__19698);
            rule__CompareExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0_0__1"


    // $ANTLR start "rule__CompareExpression__Group_1_0_0__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4822:1: rule__CompareExpression__Group_1_0_0__1__Impl : ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__CompareExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4826:1: ( ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4827:1: ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4827:1: ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4828:1: ( rule__CompareExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4829:1: ( rule__CompareExpression__OpAssignment_1_0_0_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4829:2: rule__CompareExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OpAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl9725);
            rule__CompareExpression__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getOpAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__CompareExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4843:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4847:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4848:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__09759);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__09762);
            rule__AdditionExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0"


    // $ANTLR start "rule__AdditionExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4855:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4859:1: ( ( ruleMultiplicationExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4860:1: ( ruleMultiplicationExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4860:1: ( ruleMultiplicationExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4861:1: ruleMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl9789);
            ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__AdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4872:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4876:1: ( rule__AdditionExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4877:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__19818);
            rule__AdditionExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1"


    // $ANTLR start "rule__AdditionExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4883:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )? ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4887:1: ( ( ( rule__AdditionExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4888:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4888:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4889:1: ( rule__AdditionExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4890:1: ( rule__AdditionExpression__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred39_InternalCool()) ) {
                    alt24=1;
                }
            }
            else if ( (LA24_0==46) ) {
                int LA24_2 = input.LA(2);

                if ( (synpred39_InternalCool()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4890:2: rule__AdditionExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl9845);
                    rule__AdditionExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__AdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4904:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4908:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4909:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__09880);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__09883);
            rule__AdditionExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0"


    // $ANTLR start "rule__AdditionExpression__Group_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4916:1: rule__AdditionExpression__Group_1__0__Impl : ( ( rule__AdditionExpression__Group_1_0__0 ) ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4920:1: ( ( ( rule__AdditionExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4921:1: ( ( rule__AdditionExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4921:1: ( ( rule__AdditionExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4922:1: ( rule__AdditionExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4923:1: ( rule__AdditionExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4923:2: rule__AdditionExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0__0_in_rule__AdditionExpression__Group_1__0__Impl9910);
            rule__AdditionExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__AdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4933:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4937:1: ( rule__AdditionExpression__Group_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4938:2: rule__AdditionExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__19940);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1"


    // $ANTLR start "rule__AdditionExpression__Group_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4944:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4948:1: ( ( ( rule__AdditionExpression__RightAssignment_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4949:1: ( ( rule__AdditionExpression__RightAssignment_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4949:1: ( ( rule__AdditionExpression__RightAssignment_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4950:1: ( rule__AdditionExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4951:1: ( rule__AdditionExpression__RightAssignment_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4951:2: rule__AdditionExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__RightAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl9967);
            rule__AdditionExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__AdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1_0__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4965:1: rule__AdditionExpression__Group_1_0__0 : rule__AdditionExpression__Group_1_0__0__Impl ;
    public final void rule__AdditionExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4969:1: ( rule__AdditionExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4970:2: rule__AdditionExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0__0__Impl_in_rule__AdditionExpression__Group_1_0__010001);
            rule__AdditionExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1_0__0"


    // $ANTLR start "rule__AdditionExpression__Group_1_0__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4976:1: rule__AdditionExpression__Group_1_0__0__Impl : ( ( rule__AdditionExpression__Alternatives_1_0_0 ) ) ;
    public final void rule__AdditionExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4980:1: ( ( ( rule__AdditionExpression__Alternatives_1_0_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4981:1: ( ( rule__AdditionExpression__Alternatives_1_0_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4981:1: ( ( rule__AdditionExpression__Alternatives_1_0_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4982:1: ( rule__AdditionExpression__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getAlternatives_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4983:1: ( rule__AdditionExpression__Alternatives_1_0_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4983:2: rule__AdditionExpression__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Alternatives_1_0_0_in_rule__AdditionExpression__Group_1_0__0__Impl10028);
            rule__AdditionExpression__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getAlternatives_1_0_0()); 
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
    // $ANTLR end "rule__AdditionExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1_0_0_0__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4995:1: rule__AdditionExpression__Group_1_0_0_0__0 : rule__AdditionExpression__Group_1_0_0_0__0__Impl rule__AdditionExpression__Group_1_0_0_0__1 ;
    public final void rule__AdditionExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4999:1: ( rule__AdditionExpression__Group_1_0_0_0__0__Impl rule__AdditionExpression__Group_1_0_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5000:2: rule__AdditionExpression__Group_1_0_0_0__0__Impl rule__AdditionExpression__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__0__Impl_in_rule__AdditionExpression__Group_1_0_0_0__010060);
            rule__AdditionExpression__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1_in_rule__AdditionExpression__Group_1_0_0_0__010063);
            rule__AdditionExpression__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1_0_0_0__0"


    // $ANTLR start "rule__AdditionExpression__Group_1_0_0_0__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5007:1: rule__AdditionExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5011:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5012:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5012:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5013:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5014:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5016:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1_0_0_0__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5026:1: rule__AdditionExpression__Group_1_0_0_0__1 : rule__AdditionExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__AdditionExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5030:1: ( rule__AdditionExpression__Group_1_0_0_0__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5031:2: rule__AdditionExpression__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1__Impl_in_rule__AdditionExpression__Group_1_0_0_0__110121);
            rule__AdditionExpression__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1_0_0_0__1"


    // $ANTLR start "rule__AdditionExpression__Group_1_0_0_0__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5037:1: rule__AdditionExpression__Group_1_0_0_0__1__Impl : ( '+' ) ;
    public final void rule__AdditionExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5041:1: ( ( '+' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5042:1: ( '+' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5042:1: ( '+' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5043:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getPlusSignKeyword_1_0_0_0_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__AdditionExpression__Group_1_0_0_0__1__Impl10149); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getPlusSignKeyword_1_0_0_0_1()); 
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
    // $ANTLR end "rule__AdditionExpression__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1_0_0_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5060:1: rule__AdditionExpression__Group_1_0_0_1__0 : rule__AdditionExpression__Group_1_0_0_1__0__Impl rule__AdditionExpression__Group_1_0_0_1__1 ;
    public final void rule__AdditionExpression__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5064:1: ( rule__AdditionExpression__Group_1_0_0_1__0__Impl rule__AdditionExpression__Group_1_0_0_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5065:2: rule__AdditionExpression__Group_1_0_0_1__0__Impl rule__AdditionExpression__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__0__Impl_in_rule__AdditionExpression__Group_1_0_0_1__010184);
            rule__AdditionExpression__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1_in_rule__AdditionExpression__Group_1_0_0_1__010187);
            rule__AdditionExpression__Group_1_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1_0_0_1__0"


    // $ANTLR start "rule__AdditionExpression__Group_1_0_0_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5072:1: rule__AdditionExpression__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5076:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5077:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5077:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5078:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5079:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5081:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1_0_0_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5091:1: rule__AdditionExpression__Group_1_0_0_1__1 : rule__AdditionExpression__Group_1_0_0_1__1__Impl ;
    public final void rule__AdditionExpression__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5095:1: ( rule__AdditionExpression__Group_1_0_0_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5096:2: rule__AdditionExpression__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1__Impl_in_rule__AdditionExpression__Group_1_0_0_1__110245);
            rule__AdditionExpression__Group_1_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1_0_0_1__1"


    // $ANTLR start "rule__AdditionExpression__Group_1_0_0_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5102:1: rule__AdditionExpression__Group_1_0_0_1__1__Impl : ( '-' ) ;
    public final void rule__AdditionExpression__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5106:1: ( ( '-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5107:1: ( '-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5107:1: ( '-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5108:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
            }
            match(input,46,FOLLOW_46_in_rule__AdditionExpression__Group_1_0_0_1__1__Impl10273); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
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
    // $ANTLR end "rule__AdditionExpression__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5125:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5129:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5130:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__010308);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__010311);
            rule__MultiplicationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__0"


    // $ANTLR start "rule__MultiplicationExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5137:1: rule__MultiplicationExpression__Group__0__Impl : ( ruleDispatchExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5141:1: ( ( ruleDispatchExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5142:1: ( ruleDispatchExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5142:1: ( ruleDispatchExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5143:1: ruleDispatchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getDispatchExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDispatchExpression_in_rule__MultiplicationExpression__Group__0__Impl10338);
            ruleDispatchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getDispatchExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__MultiplicationExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5154:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5158:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5159:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__110367);
            rule__MultiplicationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__1"


    // $ANTLR start "rule__MultiplicationExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5165:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )? ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5169:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5170:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5170:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5171:1: ( rule__MultiplicationExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5172:1: ( rule__MultiplicationExpression__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred40_InternalCool()) ) {
                    alt25=1;
                }
            }
            else if ( (LA25_0==48) ) {
                int LA25_2 = input.LA(2);

                if ( (synpred40_InternalCool()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5172:2: rule__MultiplicationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl10394);
                    rule__MultiplicationExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MultiplicationExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5186:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5190:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5191:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__010429);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__010432);
            rule__MultiplicationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5198:1: rule__MultiplicationExpression__Group_1__0__Impl : ( ( rule__MultiplicationExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5202:1: ( ( ( rule__MultiplicationExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5203:1: ( ( rule__MultiplicationExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5203:1: ( ( rule__MultiplicationExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5204:1: ( rule__MultiplicationExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5205:1: ( rule__MultiplicationExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5205:2: rule__MultiplicationExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0__0_in_rule__MultiplicationExpression__Group_1__0__Impl10459);
            rule__MultiplicationExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5215:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5219:1: ( rule__MultiplicationExpression__Group_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5220:2: rule__MultiplicationExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__110489);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5226:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5230:1: ( ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5231:1: ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5231:1: ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5232:1: ( rule__MultiplicationExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5233:1: ( rule__MultiplicationExpression__RightAssignment_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5233:2: rule__MultiplicationExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__RightAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl10516);
            rule__MultiplicationExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5247:1: rule__MultiplicationExpression__Group_1_0__0 : rule__MultiplicationExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicationExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5251:1: ( rule__MultiplicationExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5252:2: rule__MultiplicationExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0__010550);
            rule__MultiplicationExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5258:1: rule__MultiplicationExpression__Group_1_0__0__Impl : ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5262:1: ( ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5263:1: ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5263:1: ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5264:1: ( rule__MultiplicationExpression__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getAlternatives_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5265:1: ( rule__MultiplicationExpression__Alternatives_1_0_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5265:2: rule__MultiplicationExpression__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Alternatives_1_0_0_in_rule__MultiplicationExpression__Group_1_0__0__Impl10577);
            rule__MultiplicationExpression__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getAlternatives_1_0_0()); 
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
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0_0_0__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5277:1: rule__MultiplicationExpression__Group_1_0_0_0__0 : rule__MultiplicationExpression__Group_1_0_0_0__0__Impl rule__MultiplicationExpression__Group_1_0_0_0__1 ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5281:1: ( rule__MultiplicationExpression__Group_1_0_0_0__0__Impl rule__MultiplicationExpression__Group_1_0_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5282:2: rule__MultiplicationExpression__Group_1_0_0_0__0__Impl rule__MultiplicationExpression__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__010609);
            rule__MultiplicationExpression__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1_in_rule__MultiplicationExpression__Group_1_0_0_0__010612);
            rule__MultiplicationExpression__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0_0_0__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0_0_0__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5289:1: rule__MultiplicationExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5293:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5294:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5294:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5295:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5296:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5298:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0_0_0__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5308:1: rule__MultiplicationExpression__Group_1_0_0_0__1 : rule__MultiplicationExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5312:1: ( rule__MultiplicationExpression__Group_1_0_0_0__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5313:2: rule__MultiplicationExpression__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__110670);
            rule__MultiplicationExpression__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0_0_0__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0_0_0__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5319:1: rule__MultiplicationExpression__Group_1_0_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5323:1: ( ( '*' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5324:1: ( '*' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5324:1: ( '*' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5325:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getAsteriskKeyword_1_0_0_0_1()); 
            }
            match(input,47,FOLLOW_47_in_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl10698); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getAsteriskKeyword_1_0_0_0_1()); 
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
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0_0_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5342:1: rule__MultiplicationExpression__Group_1_0_0_1__0 : rule__MultiplicationExpression__Group_1_0_0_1__0__Impl rule__MultiplicationExpression__Group_1_0_0_1__1 ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5346:1: ( rule__MultiplicationExpression__Group_1_0_0_1__0__Impl rule__MultiplicationExpression__Group_1_0_0_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5347:2: rule__MultiplicationExpression__Group_1_0_0_1__0__Impl rule__MultiplicationExpression__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__010733);
            rule__MultiplicationExpression__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1_in_rule__MultiplicationExpression__Group_1_0_0_1__010736);
            rule__MultiplicationExpression__Group_1_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0_0_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0_0_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5354:1: rule__MultiplicationExpression__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5358:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5359:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5359:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5360:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5361:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5363:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0_0_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5373:1: rule__MultiplicationExpression__Group_1_0_0_1__1 : rule__MultiplicationExpression__Group_1_0_0_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5377:1: ( rule__MultiplicationExpression__Group_1_0_0_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5378:2: rule__MultiplicationExpression__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__110794);
            rule__MultiplicationExpression__Group_1_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0_0_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_0_0_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5384:1: rule__MultiplicationExpression__Group_1_0_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5388:1: ( ( '/' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5389:1: ( '/' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5389:1: ( '/' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5390:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getSolidusKeyword_1_0_0_1_1()); 
            }
            match(input,48,FOLLOW_48_in_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl10822); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getSolidusKeyword_1_0_0_1_1()); 
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
    // $ANTLR end "rule__MultiplicationExpression__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__DispatchExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5407:1: rule__DispatchExpression__Group__0 : rule__DispatchExpression__Group__0__Impl rule__DispatchExpression__Group__1 ;
    public final void rule__DispatchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5411:1: ( rule__DispatchExpression__Group__0__Impl rule__DispatchExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5412:2: rule__DispatchExpression__Group__0__Impl rule__DispatchExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group__0__Impl_in_rule__DispatchExpression__Group__010857);
            rule__DispatchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group__1_in_rule__DispatchExpression__Group__010860);
            rule__DispatchExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group__0"


    // $ANTLR start "rule__DispatchExpression__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5419:1: rule__DispatchExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__DispatchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5423:1: ( ( rulePrimaryExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5424:1: ( rulePrimaryExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5424:1: ( rulePrimaryExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5425:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__DispatchExpression__Group__0__Impl10887);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__DispatchExpression__Group__0__Impl"


    // $ANTLR start "rule__DispatchExpression__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5436:1: rule__DispatchExpression__Group__1 : rule__DispatchExpression__Group__1__Impl ;
    public final void rule__DispatchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5440:1: ( rule__DispatchExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5441:2: rule__DispatchExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group__1__Impl_in_rule__DispatchExpression__Group__110916);
            rule__DispatchExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group__1"


    // $ANTLR start "rule__DispatchExpression__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5447:1: rule__DispatchExpression__Group__1__Impl : ( ( rule__DispatchExpression__Group_1__0 )? ) ;
    public final void rule__DispatchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5451:1: ( ( ( rule__DispatchExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5452:1: ( ( rule__DispatchExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5452:1: ( ( rule__DispatchExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5453:1: ( rule__DispatchExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5454:1: ( rule__DispatchExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred41_InternalCool()) ) {
                    alt26=1;
                }
            }
            else if ( (LA26_0==30) ) {
                int LA26_2 = input.LA(2);

                if ( (synpred41_InternalCool()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5454:2: rule__DispatchExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1__0_in_rule__DispatchExpression__Group__1__Impl10943);
                    rule__DispatchExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DispatchExpression__Group__1__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5468:1: rule__DispatchExpression__Group_1__0 : rule__DispatchExpression__Group_1__0__Impl rule__DispatchExpression__Group_1__1 ;
    public final void rule__DispatchExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5472:1: ( rule__DispatchExpression__Group_1__0__Impl rule__DispatchExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5473:2: rule__DispatchExpression__Group_1__0__Impl rule__DispatchExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__0__Impl_in_rule__DispatchExpression__Group_1__010978);
            rule__DispatchExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__1_in_rule__DispatchExpression__Group_1__010981);
            rule__DispatchExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1__0"


    // $ANTLR start "rule__DispatchExpression__Group_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5480:1: rule__DispatchExpression__Group_1__0__Impl : ( ( rule__DispatchExpression__Group_1_0__0 ) ) ;
    public final void rule__DispatchExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5484:1: ( ( ( rule__DispatchExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5485:1: ( ( rule__DispatchExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5485:1: ( ( rule__DispatchExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5486:1: ( rule__DispatchExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5487:1: ( rule__DispatchExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5487:2: rule__DispatchExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0__0_in_rule__DispatchExpression__Group_1__0__Impl11008);
            rule__DispatchExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5497:1: rule__DispatchExpression__Group_1__1 : rule__DispatchExpression__Group_1__1__Impl rule__DispatchExpression__Group_1__2 ;
    public final void rule__DispatchExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5501:1: ( rule__DispatchExpression__Group_1__1__Impl rule__DispatchExpression__Group_1__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5502:2: rule__DispatchExpression__Group_1__1__Impl rule__DispatchExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__1__Impl_in_rule__DispatchExpression__Group_1__111038);
            rule__DispatchExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__2_in_rule__DispatchExpression__Group_1__111041);
            rule__DispatchExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1__1"


    // $ANTLR start "rule__DispatchExpression__Group_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5509:1: rule__DispatchExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__DispatchExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5513:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5514:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5514:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5515:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__DispatchExpression__Group_1__1__Impl11069); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getLeftParenthesisKeyword_1_1()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5528:1: rule__DispatchExpression__Group_1__2 : rule__DispatchExpression__Group_1__2__Impl rule__DispatchExpression__Group_1__3 ;
    public final void rule__DispatchExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5532:1: ( rule__DispatchExpression__Group_1__2__Impl rule__DispatchExpression__Group_1__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5533:2: rule__DispatchExpression__Group_1__2__Impl rule__DispatchExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__2__Impl_in_rule__DispatchExpression__Group_1__211100);
            rule__DispatchExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__3_in_rule__DispatchExpression__Group_1__211103);
            rule__DispatchExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1__2"


    // $ANTLR start "rule__DispatchExpression__Group_1__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5540:1: rule__DispatchExpression__Group_1__2__Impl : ( ( rule__DispatchExpression__Group_1_2__0 )? ) ;
    public final void rule__DispatchExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5544:1: ( ( ( rule__DispatchExpression__Group_1_2__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5545:1: ( ( rule__DispatchExpression__Group_1_2__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5545:1: ( ( rule__DispatchExpression__Group_1_2__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5546:1: ( rule__DispatchExpression__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5547:1: ( rule__DispatchExpression__Group_1_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||(LA27_0>=14 && LA27_0<=16)||LA27_0==18||LA27_0==24||(LA27_0>=27 && LA27_0<=29)||LA27_0==31||LA27_0==35||(LA27_0>=38 && LA27_0<=39)||LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5547:2: rule__DispatchExpression__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__0_in_rule__DispatchExpression__Group_1__2__Impl11130);
                    rule__DispatchExpression__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1__2__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5557:1: rule__DispatchExpression__Group_1__3 : rule__DispatchExpression__Group_1__3__Impl rule__DispatchExpression__Group_1__4 ;
    public final void rule__DispatchExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5561:1: ( rule__DispatchExpression__Group_1__3__Impl rule__DispatchExpression__Group_1__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5562:2: rule__DispatchExpression__Group_1__3__Impl rule__DispatchExpression__Group_1__4
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__3__Impl_in_rule__DispatchExpression__Group_1__311161);
            rule__DispatchExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__4_in_rule__DispatchExpression__Group_1__311164);
            rule__DispatchExpression__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1__3"


    // $ANTLR start "rule__DispatchExpression__Group_1__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5569:1: rule__DispatchExpression__Group_1__3__Impl : ( ')' ) ;
    public final void rule__DispatchExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5573:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5574:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5574:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5575:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__DispatchExpression__Group_1__3__Impl11192); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getRightParenthesisKeyword_1_3()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1__3__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1__4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5588:1: rule__DispatchExpression__Group_1__4 : rule__DispatchExpression__Group_1__4__Impl ;
    public final void rule__DispatchExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5592:1: ( rule__DispatchExpression__Group_1__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5593:2: rule__DispatchExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__4__Impl_in_rule__DispatchExpression__Group_1__411223);
            rule__DispatchExpression__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1__4"


    // $ANTLR start "rule__DispatchExpression__Group_1__4__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5599:1: rule__DispatchExpression__Group_1__4__Impl : ( ( rule__DispatchExpression__Group_1_4__0 )? ) ;
    public final void rule__DispatchExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5603:1: ( ( ( rule__DispatchExpression__Group_1_4__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5604:1: ( ( rule__DispatchExpression__Group_1_4__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5604:1: ( ( rule__DispatchExpression__Group_1_4__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5605:1: ( rule__DispatchExpression__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5606:1: ( rule__DispatchExpression__Group_1_4__0 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5606:2: rule__DispatchExpression__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_4__0_in_rule__DispatchExpression__Group_1__4__Impl11250);
                    rule__DispatchExpression__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getGroup_1_4()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1__4__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_0__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5626:1: rule__DispatchExpression__Group_1_0__0 : rule__DispatchExpression__Group_1_0__0__Impl ;
    public final void rule__DispatchExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5630:1: ( rule__DispatchExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5631:2: rule__DispatchExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0__0__Impl_in_rule__DispatchExpression__Group_1_0__011291);
            rule__DispatchExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_0__0"


    // $ANTLR start "rule__DispatchExpression__Group_1_0__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5637:1: rule__DispatchExpression__Group_1_0__0__Impl : ( ( rule__DispatchExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DispatchExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5641:1: ( ( ( rule__DispatchExpression__Group_1_0_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5642:1: ( ( rule__DispatchExpression__Group_1_0_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5642:1: ( ( rule__DispatchExpression__Group_1_0_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5643:1: ( rule__DispatchExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5644:1: ( rule__DispatchExpression__Group_1_0_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5644:2: rule__DispatchExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__0_in_rule__DispatchExpression__Group_1_0__0__Impl11318);
            rule__DispatchExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5656:1: rule__DispatchExpression__Group_1_0_0__0 : rule__DispatchExpression__Group_1_0_0__0__Impl rule__DispatchExpression__Group_1_0_0__1 ;
    public final void rule__DispatchExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5660:1: ( rule__DispatchExpression__Group_1_0_0__0__Impl rule__DispatchExpression__Group_1_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5661:2: rule__DispatchExpression__Group_1_0_0__0__Impl rule__DispatchExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__0__Impl_in_rule__DispatchExpression__Group_1_0_0__011350);
            rule__DispatchExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__1_in_rule__DispatchExpression__Group_1_0_0__011353);
            rule__DispatchExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0__0"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5668:1: rule__DispatchExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DispatchExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5672:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5673:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5673:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5674:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5675:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5677:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5687:1: rule__DispatchExpression__Group_1_0_0__1 : rule__DispatchExpression__Group_1_0_0__1__Impl rule__DispatchExpression__Group_1_0_0__2 ;
    public final void rule__DispatchExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5691:1: ( rule__DispatchExpression__Group_1_0_0__1__Impl rule__DispatchExpression__Group_1_0_0__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5692:2: rule__DispatchExpression__Group_1_0_0__1__Impl rule__DispatchExpression__Group_1_0_0__2
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__1__Impl_in_rule__DispatchExpression__Group_1_0_0__111411);
            rule__DispatchExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__2_in_rule__DispatchExpression__Group_1_0_0__111414);
            rule__DispatchExpression__Group_1_0_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0__1"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5699:1: rule__DispatchExpression__Group_1_0_0__1__Impl : ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? ) ;
    public final void rule__DispatchExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5703:1: ( ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5704:1: ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5704:1: ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5705:1: ( rule__DispatchExpression__Group_1_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_0_0_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5706:1: ( rule__DispatchExpression__Group_1_0_0_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5706:2: rule__DispatchExpression__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0_in_rule__DispatchExpression__Group_1_0_0__1__Impl11441);
                    rule__DispatchExpression__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getGroup_1_0_0_1()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5716:1: rule__DispatchExpression__Group_1_0_0__2 : rule__DispatchExpression__Group_1_0_0__2__Impl rule__DispatchExpression__Group_1_0_0__3 ;
    public final void rule__DispatchExpression__Group_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5720:1: ( rule__DispatchExpression__Group_1_0_0__2__Impl rule__DispatchExpression__Group_1_0_0__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5721:2: rule__DispatchExpression__Group_1_0_0__2__Impl rule__DispatchExpression__Group_1_0_0__3
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__2__Impl_in_rule__DispatchExpression__Group_1_0_0__211472);
            rule__DispatchExpression__Group_1_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__3_in_rule__DispatchExpression__Group_1_0_0__211475);
            rule__DispatchExpression__Group_1_0_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0__2"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0__2__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5728:1: rule__DispatchExpression__Group_1_0_0__2__Impl : ( '.' ) ;
    public final void rule__DispatchExpression__Group_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5732:1: ( ( '.' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5733:1: ( '.' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5733:1: ( '.' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5734:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getFullStopKeyword_1_0_0_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__DispatchExpression__Group_1_0_0__2__Impl11503); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getFullStopKeyword_1_0_0_2()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0__2__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0__3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5747:1: rule__DispatchExpression__Group_1_0_0__3 : rule__DispatchExpression__Group_1_0_0__3__Impl ;
    public final void rule__DispatchExpression__Group_1_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5751:1: ( rule__DispatchExpression__Group_1_0_0__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5752:2: rule__DispatchExpression__Group_1_0_0__3__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__3__Impl_in_rule__DispatchExpression__Group_1_0_0__311534);
            rule__DispatchExpression__Group_1_0_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0__3"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0__3__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5758:1: rule__DispatchExpression__Group_1_0_0__3__Impl : ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) ) ;
    public final void rule__DispatchExpression__Group_1_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5762:1: ( ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5763:1: ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5763:1: ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5764:1: ( rule__DispatchExpression__RefAssignment_1_0_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getRefAssignment_1_0_0_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5765:1: ( rule__DispatchExpression__RefAssignment_1_0_0_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5765:2: rule__DispatchExpression__RefAssignment_1_0_0_3
            {
            pushFollow(FOLLOW_rule__DispatchExpression__RefAssignment_1_0_0_3_in_rule__DispatchExpression__Group_1_0_0__3__Impl11561);
            rule__DispatchExpression__RefAssignment_1_0_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getRefAssignment_1_0_0_3()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0__3__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5783:1: rule__DispatchExpression__Group_1_0_0_1__0 : rule__DispatchExpression__Group_1_0_0_1__0__Impl rule__DispatchExpression__Group_1_0_0_1__1 ;
    public final void rule__DispatchExpression__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5787:1: ( rule__DispatchExpression__Group_1_0_0_1__0__Impl rule__DispatchExpression__Group_1_0_0_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5788:2: rule__DispatchExpression__Group_1_0_0_1__0__Impl rule__DispatchExpression__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0__Impl_in_rule__DispatchExpression__Group_1_0_0_1__011599);
            rule__DispatchExpression__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1_in_rule__DispatchExpression__Group_1_0_0_1__011602);
            rule__DispatchExpression__Group_1_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0_1__0"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5795:1: rule__DispatchExpression__Group_1_0_0_1__0__Impl : ( '@' ) ;
    public final void rule__DispatchExpression__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5799:1: ( ( '@' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5800:1: ( '@' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5800:1: ( '@' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5801:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getCommercialAtKeyword_1_0_0_1_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__DispatchExpression__Group_1_0_0_1__0__Impl11630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getCommercialAtKeyword_1_0_0_1_0()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5814:1: rule__DispatchExpression__Group_1_0_0_1__1 : rule__DispatchExpression__Group_1_0_0_1__1__Impl ;
    public final void rule__DispatchExpression__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5818:1: ( rule__DispatchExpression__Group_1_0_0_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5819:2: rule__DispatchExpression__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1__Impl_in_rule__DispatchExpression__Group_1_0_0_1__111661);
            rule__DispatchExpression__Group_1_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0_1__1"


    // $ANTLR start "rule__DispatchExpression__Group_1_0_0_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5825:1: rule__DispatchExpression__Group_1_0_0_1__1__Impl : ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) ) ;
    public final void rule__DispatchExpression__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5829:1: ( ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5830:1: ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5830:1: ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5831:1: ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getType_nameAssignment_1_0_0_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5832:1: ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5832:2: rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1_in_rule__DispatchExpression__Group_1_0_0_1__1__Impl11688);
            rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getType_nameAssignment_1_0_0_1_1()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_2__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5846:1: rule__DispatchExpression__Group_1_2__0 : rule__DispatchExpression__Group_1_2__0__Impl rule__DispatchExpression__Group_1_2__1 ;
    public final void rule__DispatchExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5850:1: ( rule__DispatchExpression__Group_1_2__0__Impl rule__DispatchExpression__Group_1_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5851:2: rule__DispatchExpression__Group_1_2__0__Impl rule__DispatchExpression__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__0__Impl_in_rule__DispatchExpression__Group_1_2__011722);
            rule__DispatchExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__1_in_rule__DispatchExpression__Group_1_2__011725);
            rule__DispatchExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_2__0"


    // $ANTLR start "rule__DispatchExpression__Group_1_2__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5858:1: rule__DispatchExpression__Group_1_2__0__Impl : ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) ) ;
    public final void rule__DispatchExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5862:1: ( ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5863:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5863:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5864:1: ( rule__DispatchExpression__ActualAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualAssignment_1_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5865:1: ( rule__DispatchExpression__ActualAssignment_1_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5865:2: rule__DispatchExpression__ActualAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_0_in_rule__DispatchExpression__Group_1_2__0__Impl11752);
            rule__DispatchExpression__ActualAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getActualAssignment_1_2_0()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_2__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5875:1: rule__DispatchExpression__Group_1_2__1 : rule__DispatchExpression__Group_1_2__1__Impl ;
    public final void rule__DispatchExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5879:1: ( rule__DispatchExpression__Group_1_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5880:2: rule__DispatchExpression__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__1__Impl_in_rule__DispatchExpression__Group_1_2__111782);
            rule__DispatchExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_2__1"


    // $ANTLR start "rule__DispatchExpression__Group_1_2__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5886:1: rule__DispatchExpression__Group_1_2__1__Impl : ( ( rule__DispatchExpression__Group_1_2_1__0 )* ) ;
    public final void rule__DispatchExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5890:1: ( ( ( rule__DispatchExpression__Group_1_2_1__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5891:1: ( ( rule__DispatchExpression__Group_1_2_1__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5891:1: ( ( rule__DispatchExpression__Group_1_2_1__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5892:1: ( rule__DispatchExpression__Group_1_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5893:1: ( rule__DispatchExpression__Group_1_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5893:2: rule__DispatchExpression__Group_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__0_in_rule__DispatchExpression__Group_1_2__1__Impl11809);
            	    rule__DispatchExpression__Group_1_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getGroup_1_2_1()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_2_1__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5907:1: rule__DispatchExpression__Group_1_2_1__0 : rule__DispatchExpression__Group_1_2_1__0__Impl rule__DispatchExpression__Group_1_2_1__1 ;
    public final void rule__DispatchExpression__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5911:1: ( rule__DispatchExpression__Group_1_2_1__0__Impl rule__DispatchExpression__Group_1_2_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5912:2: rule__DispatchExpression__Group_1_2_1__0__Impl rule__DispatchExpression__Group_1_2_1__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__0__Impl_in_rule__DispatchExpression__Group_1_2_1__011844);
            rule__DispatchExpression__Group_1_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__1_in_rule__DispatchExpression__Group_1_2_1__011847);
            rule__DispatchExpression__Group_1_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_2_1__0"


    // $ANTLR start "rule__DispatchExpression__Group_1_2_1__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5919:1: rule__DispatchExpression__Group_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__DispatchExpression__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5923:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5924:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5924:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5925:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getCommaKeyword_1_2_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__DispatchExpression__Group_1_2_1__0__Impl11875); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getCommaKeyword_1_2_1_0()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_2_1__0__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_2_1__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5938:1: rule__DispatchExpression__Group_1_2_1__1 : rule__DispatchExpression__Group_1_2_1__1__Impl ;
    public final void rule__DispatchExpression__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5942:1: ( rule__DispatchExpression__Group_1_2_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5943:2: rule__DispatchExpression__Group_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__1__Impl_in_rule__DispatchExpression__Group_1_2_1__111906);
            rule__DispatchExpression__Group_1_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_2_1__1"


    // $ANTLR start "rule__DispatchExpression__Group_1_2_1__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5949:1: rule__DispatchExpression__Group_1_2_1__1__Impl : ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) ) ;
    public final void rule__DispatchExpression__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5953:1: ( ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5954:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5954:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5955:1: ( rule__DispatchExpression__ActualAssignment_1_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualAssignment_1_2_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5956:1: ( rule__DispatchExpression__ActualAssignment_1_2_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5956:2: rule__DispatchExpression__ActualAssignment_1_2_1_1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_1_1_in_rule__DispatchExpression__Group_1_2_1__1__Impl11933);
            rule__DispatchExpression__ActualAssignment_1_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getActualAssignment_1_2_1_1()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_2_1__1__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_4__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5970:1: rule__DispatchExpression__Group_1_4__0 : rule__DispatchExpression__Group_1_4__0__Impl rule__DispatchExpression__Group_1_4__1 ;
    public final void rule__DispatchExpression__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5974:1: ( rule__DispatchExpression__Group_1_4__0__Impl rule__DispatchExpression__Group_1_4__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5975:2: rule__DispatchExpression__Group_1_4__0__Impl rule__DispatchExpression__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_4__0__Impl_in_rule__DispatchExpression__Group_1_4__011967);
            rule__DispatchExpression__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_4__1_in_rule__DispatchExpression__Group_1_4__011970);
            rule__DispatchExpression__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_4__0"


    // $ANTLR start "rule__DispatchExpression__Group_1_4__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5982:1: rule__DispatchExpression__Group_1_4__0__Impl : ( ( '.' ) ) ;
    public final void rule__DispatchExpression__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5986:1: ( ( ( '.' ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5987:1: ( ( '.' ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5987:1: ( ( '.' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5988:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getFullStopKeyword_1_4_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5989:1: ( '.' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5990:2: '.'
            {
            match(input,30,FOLLOW_30_in_rule__DispatchExpression__Group_1_4__0__Impl11999); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getFullStopKeyword_1_4_0()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_4__0__Impl"


    // $ANTLR start "rule__DispatchExpression__Group_1_4__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6001:1: rule__DispatchExpression__Group_1_4__1 : rule__DispatchExpression__Group_1_4__1__Impl ;
    public final void rule__DispatchExpression__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6005:1: ( rule__DispatchExpression__Group_1_4__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6006:2: rule__DispatchExpression__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_4__1__Impl_in_rule__DispatchExpression__Group_1_4__112031);
            rule__DispatchExpression__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DispatchExpression__Group_1_4__1"


    // $ANTLR start "rule__DispatchExpression__Group_1_4__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6012:1: rule__DispatchExpression__Group_1_4__1__Impl : ( ( rule__DispatchExpression__ChainAssignment_1_4_1 ) ) ;
    public final void rule__DispatchExpression__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6016:1: ( ( ( rule__DispatchExpression__ChainAssignment_1_4_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6017:1: ( ( rule__DispatchExpression__ChainAssignment_1_4_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6017:1: ( ( rule__DispatchExpression__ChainAssignment_1_4_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6018:1: ( rule__DispatchExpression__ChainAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getChainAssignment_1_4_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6019:1: ( rule__DispatchExpression__ChainAssignment_1_4_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6019:2: rule__DispatchExpression__ChainAssignment_1_4_1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__ChainAssignment_1_4_1_in_rule__DispatchExpression__Group_1_4__1__Impl12058);
            rule__DispatchExpression__ChainAssignment_1_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getChainAssignment_1_4_1()); 
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
    // $ANTLR end "rule__DispatchExpression__Group_1_4__1__Impl"


    // $ANTLR start "rule__Program__ClassesAssignment"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6034:1: rule__Program__ClassesAssignment : ( ruleClass_ ) ;
    public final void rule__Program__ClassesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6038:1: ( ( ruleClass_ ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6039:1: ( ruleClass_ )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6039:1: ( ruleClass_ )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6040:1: ruleClass_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesClass_ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleClass__in_rule__Program__ClassesAssignment12097);
            ruleClass_();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesClass_ParserRuleCall_0()); 
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
    // $ANTLR end "rule__Program__ClassesAssignment"


    // $ANTLR start "rule__Class___NameAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6049:1: rule__Class___NameAssignment_1 : ( ruleSYMBOL ) ;
    public final void rule__Class___NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6053:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6054:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6054:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6055:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getNameSYMBOLParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Class___NameAssignment_112128);
            ruleSYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getNameSYMBOLParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Class___NameAssignment_1"


    // $ANTLR start "rule__Class___ParentAssignment_2_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6064:1: rule__Class___ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class___ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6068:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6069:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6069:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6070:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getParentTypeCrossReference_2_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6071:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6072:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getParentTypeIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class___ParentAssignment_2_112163); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getParentTypeIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getParentTypeCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__Class___ParentAssignment_2_1"


    // $ANTLR start "rule__Class___FeaturesAssignment_4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6083:1: rule__Class___FeaturesAssignment_4 : ( ruleFeature_ ) ;
    public final void rule__Class___FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6087:1: ( ( ruleFeature_ ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6088:1: ( ruleFeature_ )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6088:1: ( ruleFeature_ )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6089:1: ruleFeature_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getFeaturesFeature_ParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleFeature__in_rule__Class___FeaturesAssignment_412198);
            ruleFeature_();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getFeaturesFeature_ParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Class___FeaturesAssignment_4"


    // $ANTLR start "rule__Attr__NameAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6098:1: rule__Attr__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Attr__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6102:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6103:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6103:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6104:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Attr__NameAssignment_012229);
            ruleSYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getNameSYMBOLParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Attr__NameAssignment_0"


    // $ANTLR start "rule__Attr__Type_declAssignment_2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6113:1: rule__Attr__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attr__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6117:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6118:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6118:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6119:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6120:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6121:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attr__Type_declAssignment_212264); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getType_declTypeCrossReference_2_0()); 
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
    // $ANTLR end "rule__Attr__Type_declAssignment_2"


    // $ANTLR start "rule__Attr__InitAssignment_3_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6132:1: rule__Attr__InitAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Attr__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6136:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6137:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6137:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6138:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getInitExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Attr__InitAssignment_3_112299);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAccess().getInitExpressionParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Attr__InitAssignment_3_1"


    // $ANTLR start "rule__Method__NameAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6147:1: rule__Method__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Method__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6151:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6152:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6152:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6153:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Method__NameAssignment_012330);
            ruleSYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameSYMBOLParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Method__NameAssignment_0"


    // $ANTLR start "rule__Method__FormalsAssignment_2_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6162:1: rule__Method__FormalsAssignment_2_0 : ( ruleFormal ) ;
    public final void rule__Method__FormalsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6166:1: ( ( ruleFormal ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6167:1: ( ruleFormal )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6167:1: ( ruleFormal )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6168:1: ruleFormal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_012361);
            ruleFormal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__Method__FormalsAssignment_2_0"


    // $ANTLR start "rule__Method__FormalsAssignment_2_1_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6177:1: rule__Method__FormalsAssignment_2_1_1 : ( ruleFormal ) ;
    public final void rule__Method__FormalsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6181:1: ( ( ruleFormal ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6182:1: ( ruleFormal )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6182:1: ( ruleFormal )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6183:1: ruleFormal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_1_112392);
            ruleFormal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__Method__FormalsAssignment_2_1_1"


    // $ANTLR start "rule__Method__Return_typeAssignment_5"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6192:1: rule__Method__Return_typeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Method__Return_typeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6196:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6197:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6197:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6198:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturn_typeTypeCrossReference_5_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6199:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6200:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturn_typeTypeIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__Return_typeAssignment_512427); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturn_typeTypeIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturn_typeTypeCrossReference_5_0()); 
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
    // $ANTLR end "rule__Method__Return_typeAssignment_5"


    // $ANTLR start "rule__Method__ExprAssignment_7"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6211:1: rule__Method__ExprAssignment_7 : ( ruleExpression ) ;
    public final void rule__Method__ExprAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6215:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6216:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6216:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6217:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getExprExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Method__ExprAssignment_712462);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getExprExpressionParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Method__ExprAssignment_7"


    // $ANTLR start "rule__Formal__NameAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6226:1: rule__Formal__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Formal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6230:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6231:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6231:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6232:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Formal__NameAssignment_012493);
            ruleSYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalAccess().getNameSYMBOLParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Formal__NameAssignment_0"


    // $ANTLR start "rule__Formal__Type_declAssignment_2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6241:1: rule__Formal__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Formal__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6245:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6246:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6246:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6247:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6248:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6249:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Formal__Type_declAssignment_212528); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalAccess().getType_declTypeCrossReference_2_0()); 
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
    // $ANTLR end "rule__Formal__Type_declAssignment_2"


    // $ANTLR start "rule__IdentifierRefExpression__IdAssignment"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6260:1: rule__IdentifierRefExpression__IdAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IdentifierRefExpression__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6264:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6265:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6265:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6266:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementCrossReference_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6267:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6268:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IdentifierRefExpression__IdAssignment12567); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementCrossReference_0()); 
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
    // $ANTLR end "rule__IdentifierRefExpression__IdAssignment"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6279:1: rule__NumberLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6283:1: ( ( RULE_INT ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6284:1: ( RULE_INT )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6284:1: ( RULE_INT )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6285:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment12602); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6294:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6298:1: ( ( RULE_STRING ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6299:1: ( RULE_STRING )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6299:1: ( RULE_STRING )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6300:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12633); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6309:1: rule__BooleanLiteral__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6313:1: ( ( ruleBOOLEAN ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6314:1: ( ruleBOOLEAN )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6314:1: ( ruleBOOLEAN )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6315:1: ruleBOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__BooleanLiteral__ValueAssignment12664);
            ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"


    // $ANTLR start "rule__ParenExpression__ExprAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6324:1: rule__ParenExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__ParenExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6328:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6329:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6329:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6330:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParenExpression__ExprAssignment_112695);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ParenExpression__ExprAssignment_1"


    // $ANTLR start "rule__AssignmentExpression__NameAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6339:1: rule__AssignmentExpression__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__AssignmentExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6343:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6344:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6344:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6345:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__AssignmentExpression__NameAssignment_012726);
            ruleSYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExpressionAccess().getNameSYMBOLParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__AssignmentExpression__NameAssignment_0"


    // $ANTLR start "rule__AssignmentExpression__ExprAssignment_2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6354:1: rule__AssignmentExpression__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__AssignmentExpression__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6358:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6359:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6359:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6360:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getExprExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__AssignmentExpression__ExprAssignment_212757);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExpressionAccess().getExprExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__AssignmentExpression__ExprAssignment_2"


    // $ANTLR start "rule__NegationExpression__ExprAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6369:1: rule__NegationExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__NegationExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6373:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6374:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6374:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6375:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__NegationExpression__ExprAssignment_112788);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__NegationExpression__ExprAssignment_1"


    // $ANTLR start "rule__IntegerCompositeExpression__ExprAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6384:1: rule__IntegerCompositeExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IntegerCompositeExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6388:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6389:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6389:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6390:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__IntegerCompositeExpression__ExprAssignment_112819);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__IntegerCompositeExpression__ExprAssignment_1"


    // $ANTLR start "rule__NewExpression__Type_nameAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6399:1: rule__NewExpression__Type_nameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewExpression__Type_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6403:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6404:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6404:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6405:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getType_nameTypeCrossReference_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6406:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6407:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getType_nameTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewExpression__Type_nameAssignment_112854); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewExpressionAccess().getType_nameTypeIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewExpressionAccess().getType_nameTypeCrossReference_1_0()); 
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
    // $ANTLR end "rule__NewExpression__Type_nameAssignment_1"


    // $ANTLR start "rule__StaticDispatchExpression__RefAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6418:1: rule__StaticDispatchExpression__RefAssignment_0 : ( ruleIdentifierRefExpression ) ;
    public final void rule__StaticDispatchExpression__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6422:1: ( ( ruleIdentifierRefExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6423:1: ( ruleIdentifierRefExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6423:1: ( ruleIdentifierRefExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6424:1: ruleIdentifierRefExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleIdentifierRefExpression_in_rule__StaticDispatchExpression__RefAssignment_012889);
            ruleIdentifierRefExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__RefAssignment_0"


    // $ANTLR start "rule__StaticDispatchExpression__ActualAssignment_2_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6433:1: rule__StaticDispatchExpression__ActualAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__StaticDispatchExpression__ActualAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6437:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6438:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6438:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6439:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_012920);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__ActualAssignment_2_0"


    // $ANTLR start "rule__StaticDispatchExpression__ActualAssignment_2_1_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6448:1: rule__StaticDispatchExpression__ActualAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__StaticDispatchExpression__ActualAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6452:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6453:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6453:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6454:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_1_112951);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__ActualAssignment_2_1_1"


    // $ANTLR start "rule__StaticDispatchExpression__ChainAssignment_4_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6463:1: rule__StaticDispatchExpression__ChainAssignment_4_1 : ( ruleStaticDispatchExpression ) ;
    public final void rule__StaticDispatchExpression__ChainAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6467:1: ( ( ruleStaticDispatchExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6468:1: ( ruleStaticDispatchExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6468:1: ( ruleStaticDispatchExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6469:1: ruleStaticDispatchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getChainStaticDispatchExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleStaticDispatchExpression_in_rule__StaticDispatchExpression__ChainAssignment_4_112982);
            ruleStaticDispatchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticDispatchExpressionAccess().getChainStaticDispatchExpressionParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__StaticDispatchExpression__ChainAssignment_4_1"


    // $ANTLR start "rule__ConditionalExpression__PredAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6478:1: rule__ConditionalExpression__PredAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6482:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6483:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6483:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6484:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__PredAssignment_113013);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ConditionalExpression__PredAssignment_1"


    // $ANTLR start "rule__ConditionalExpression__Then_expAssignment_3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6493:1: rule__ConditionalExpression__Then_expAssignment_3 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__Then_expAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6497:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6498:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6498:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6499:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getThen_expExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__Then_expAssignment_313044);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getThen_expExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ConditionalExpression__Then_expAssignment_3"


    // $ANTLR start "rule__ConditionalExpression__Else_expAssignment_4_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6508:1: rule__ConditionalExpression__Else_expAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__Else_expAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6512:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6513:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6513:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6514:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getElse_expExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__Else_expAssignment_4_113075);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getElse_expExpressionParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__ConditionalExpression__Else_expAssignment_4_1"


    // $ANTLR start "rule__LoopExpression__PredAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6523:1: rule__LoopExpression__PredAssignment_1 : ( ruleExpression ) ;
    public final void rule__LoopExpression__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6527:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6528:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6528:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6529:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LoopExpression__PredAssignment_113106);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LoopExpression__PredAssignment_1"


    // $ANTLR start "rule__LoopExpression__BodyAssignment_3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6538:1: rule__LoopExpression__BodyAssignment_3 : ( ruleExpression ) ;
    public final void rule__LoopExpression__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6542:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6543:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6543:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6544:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getBodyExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LoopExpression__BodyAssignment_313137);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopExpressionAccess().getBodyExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__LoopExpression__BodyAssignment_3"


    // $ANTLR start "rule__BlockExpression__BodyAssignment_2_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6553:1: rule__BlockExpression__BodyAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__BlockExpression__BodyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6557:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6558:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6558:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6559:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBodyExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__BlockExpression__BodyAssignment_2_013168);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getBodyExpressionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__BlockExpression__BodyAssignment_2_0"


    // $ANTLR start "rule__IsvoidExpression__ExprAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6568:1: rule__IsvoidExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IsvoidExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6572:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6573:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6573:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6574:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__IsvoidExpression__ExprAssignment_113199);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsvoidExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__IsvoidExpression__ExprAssignment_1"


    // $ANTLR start "rule__LetExpression__DeclarationAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6583:1: rule__LetExpression__DeclarationAssignment_1 : ( ruleLetDeclaration ) ;
    public final void rule__LetExpression__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6587:1: ( ( ruleLetDeclaration ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6588:1: ( ruleLetDeclaration )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6588:1: ( ruleLetDeclaration )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6589:1: ruleLetDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationLetDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_113230);
            ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getDeclarationLetDeclarationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LetExpression__DeclarationAssignment_1"


    // $ANTLR start "rule__LetExpression__DeclarationAssignment_2_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6598:1: rule__LetExpression__DeclarationAssignment_2_1 : ( ruleLetDeclaration ) ;
    public final void rule__LetExpression__DeclarationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6602:1: ( ( ruleLetDeclaration ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6603:1: ( ruleLetDeclaration )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6603:1: ( ruleLetDeclaration )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6604:1: ruleLetDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationLetDeclarationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_2_113261);
            ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getDeclarationLetDeclarationParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__LetExpression__DeclarationAssignment_2_1"


    // $ANTLR start "rule__LetExpression__BodyAssignment_4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6613:1: rule__LetExpression__BodyAssignment_4 : ( ruleExpression ) ;
    public final void rule__LetExpression__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6617:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6618:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6618:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6619:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getBodyExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LetExpression__BodyAssignment_413292);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getBodyExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__LetExpression__BodyAssignment_4"


    // $ANTLR start "rule__LetDeclaration__NameAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6628:1: rule__LetDeclaration__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__LetDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6632:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6633:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6633:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6634:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__LetDeclaration__NameAssignment_013323);
            ruleSYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getNameSYMBOLParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__LetDeclaration__NameAssignment_0"


    // $ANTLR start "rule__LetDeclaration__Type_declAssignment_2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6643:1: rule__LetDeclaration__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LetDeclaration__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6647:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6648:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6648:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6649:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6650:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6651:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LetDeclaration__Type_declAssignment_213358); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getType_declTypeCrossReference_2_0()); 
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
    // $ANTLR end "rule__LetDeclaration__Type_declAssignment_2"


    // $ANTLR start "rule__LetDeclaration__InitAssignment_3_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6662:1: rule__LetDeclaration__InitAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__LetDeclaration__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6666:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6667:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6667:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6668:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getInitExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LetDeclaration__InitAssignment_3_113393);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationAccess().getInitExpressionParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__LetDeclaration__InitAssignment_3_1"


    // $ANTLR start "rule__CaseExpression__ExprAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6677:1: rule__CaseExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__CaseExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6681:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6682:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6682:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6683:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CaseExpression__ExprAssignment_113424);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__CaseExpression__ExprAssignment_1"


    // $ANTLR start "rule__CaseExpression__CaseAssignment_3_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6692:1: rule__CaseExpression__CaseAssignment_3_0 : ( ruleCase ) ;
    public final void rule__CaseExpression__CaseAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6696:1: ( ( ruleCase ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6697:1: ( ruleCase )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6697:1: ( ruleCase )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6698:1: ruleCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseCaseParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleCase_in_rule__CaseExpression__CaseAssignment_3_013455);
            ruleCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseCaseParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__CaseExpression__CaseAssignment_3_0"


    // $ANTLR start "rule__Case__NameAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6707:1: rule__Case__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Case__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6711:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6712:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6712:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6713:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Case__NameAssignment_013486);
            ruleSYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getNameSYMBOLParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Case__NameAssignment_0"


    // $ANTLR start "rule__Case__Type_declAssignment_2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6722:1: rule__Case__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Case__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6726:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6727:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6727:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6728:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6729:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6730:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Case__Type_declAssignment_213521); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getType_declTypeCrossReference_2_0()); 
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
    // $ANTLR end "rule__Case__Type_declAssignment_2"


    // $ANTLR start "rule__Case__ExprAssignment_4"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6741:1: rule__Case__ExprAssignment_4 : ( ruleExpression ) ;
    public final void rule__Case__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6745:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6746:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6746:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6747:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getExprExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Case__ExprAssignment_413556);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getExprExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Case__ExprAssignment_4"


    // $ANTLR start "rule__CompareExpression__OpAssignment_1_0_0_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6756:1: rule__CompareExpression__OpAssignment_1_0_0_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6760:1: ( ( ruleCompareOperator ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6761:1: ( ruleCompareOperator )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6761:1: ( ruleCompareOperator )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6762:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOpCompareOperatorParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareExpression__OpAssignment_1_0_0_113587);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getOpCompareOperatorParserRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__CompareExpression__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__CompareExpression__RightAssignment_1_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6771:1: rule__CompareExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__CompareExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6775:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6776:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6776:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6777:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CompareExpression__RightAssignment_1_113618);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__CompareExpression__RightAssignment_1_1"


    // $ANTLR start "rule__AdditionExpression__RightAssignment_1_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6786:1: rule__AdditionExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__AdditionExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6790:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6791:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6791:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6792:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__AdditionExpression__RightAssignment_1_113649);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__AdditionExpression__RightAssignment_1_1"


    // $ANTLR start "rule__MultiplicationExpression__RightAssignment_1_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6801:1: rule__MultiplicationExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__MultiplicationExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6805:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6806:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6806:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6807:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__MultiplicationExpression__RightAssignment_1_113680);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__MultiplicationExpression__RightAssignment_1_1"


    // $ANTLR start "rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6816:1: rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6820:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6821:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6821:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6822:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getType_nameTypeCrossReference_1_0_0_1_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6823:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6824:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getType_nameTypeIDTerminalRuleCall_1_0_0_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_113715); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getType_nameTypeIDTerminalRuleCall_1_0_0_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getType_nameTypeCrossReference_1_0_0_1_1_0()); 
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
    // $ANTLR end "rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1"


    // $ANTLR start "rule__DispatchExpression__RefAssignment_1_0_0_3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6835:1: rule__DispatchExpression__RefAssignment_1_0_0_3 : ( ruleIdentifierRefExpression ) ;
    public final void rule__DispatchExpression__RefAssignment_1_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6839:1: ( ( ruleIdentifierRefExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6840:1: ( ruleIdentifierRefExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6840:1: ( ruleIdentifierRefExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6841:1: ruleIdentifierRefExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_1_0_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleIdentifierRefExpression_in_rule__DispatchExpression__RefAssignment_1_0_0_313750);
            ruleIdentifierRefExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_1_0_0_3_0()); 
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
    // $ANTLR end "rule__DispatchExpression__RefAssignment_1_0_0_3"


    // $ANTLR start "rule__DispatchExpression__ActualAssignment_1_2_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6850:1: rule__DispatchExpression__ActualAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__DispatchExpression__ActualAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6854:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6855:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6855:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6856:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_013781);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_0_0()); 
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
    // $ANTLR end "rule__DispatchExpression__ActualAssignment_1_2_0"


    // $ANTLR start "rule__DispatchExpression__ActualAssignment_1_2_1_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6865:1: rule__DispatchExpression__ActualAssignment_1_2_1_1 : ( ruleExpression ) ;
    public final void rule__DispatchExpression__ActualAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6869:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6870:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6870:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6871:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_1_113812);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_1_1_0()); 
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
    // $ANTLR end "rule__DispatchExpression__ActualAssignment_1_2_1_1"


    // $ANTLR start "rule__DispatchExpression__ChainAssignment_1_4_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6880:1: rule__DispatchExpression__ChainAssignment_1_4_1 : ( ruleStaticDispatchExpression ) ;
    public final void rule__DispatchExpression__ChainAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6884:1: ( ( ruleStaticDispatchExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6885:1: ( ruleStaticDispatchExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6885:1: ( ruleStaticDispatchExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6886:1: ruleStaticDispatchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getChainStaticDispatchExpressionParserRuleCall_1_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleStaticDispatchExpression_in_rule__DispatchExpression__ChainAssignment_1_4_113843);
            ruleStaticDispatchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getChainStaticDispatchExpressionParserRuleCall_1_4_1_0()); 
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
    // $ANTLR end "rule__DispatchExpression__ChainAssignment_1_4_1"

    // $ANTLR start synpred31_InternalCool
    public final void synpred31_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2955:2: ( rule__StaticDispatchExpression__Group_4__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2955:2: rule__StaticDispatchExpression__Group_4__0
        {
        pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_4__0_in_synpred31_InternalCool6044);
        rule__StaticDispatchExpression__Group_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalCool

    // $ANTLR start synpred38_InternalCool
    public final void synpred38_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4675:2: ( rule__CompareExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4675:2: rule__CompareExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_synpred38_InternalCool9422);
        rule__CompareExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalCool

    // $ANTLR start synpred39_InternalCool
    public final void synpred39_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4890:2: ( rule__AdditionExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4890:2: rule__AdditionExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0_in_synpred39_InternalCool9845);
        rule__AdditionExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalCool

    // $ANTLR start synpred40_InternalCool
    public final void synpred40_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5172:2: ( rule__MultiplicationExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5172:2: rule__MultiplicationExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0_in_synpred40_InternalCool10394);
        rule__MultiplicationExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalCool

    // $ANTLR start synpred41_InternalCool
    public final void synpred41_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5454:2: ( rule__DispatchExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5454:2: rule__DispatchExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__DispatchExpression__Group_1__0_in_synpred41_InternalCool10943);
        rule__DispatchExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalCool

    // $ANTLR start synpred43_InternalCool
    public final void synpred43_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5606:2: ( rule__DispatchExpression__Group_1_4__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5606:2: rule__DispatchExpression__Group_1_4__0
        {
        pushFollow(FOLLOW_rule__DispatchExpression__Group_1_4__0_in_synpred43_InternalCool11250);
        rule__DispatchExpression__Group_1_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalCool

    // Delegated rules

    public final boolean synpred41_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA3_eotS =
        "\22\uffff";
    static final String DFA3_eofS =
        "\10\uffff\1\20\1\21\10\uffff";
    static final String DFA3_minS =
        "\1\4\7\uffff\2\13\10\uffff";
    static final String DFA3_maxS =
        "\1\51\7\uffff\2\61\10\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\13\1\14\1\15\1\16"+
        "\1\17\1\10\1\12\1\11";
    static final String DFA3_specialS =
        "\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\10\2\12\7\uffff\2\12\1\11\1\uffff\1\3\5\uffff\1\13\2\uffff"+
            "\1\14\1\15\1\6\1\uffff\1\1\3\uffff\1\2\2\uffff\1\7\1\4\1\uffff"+
            "\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\20\5\uffff\2\20\2\uffff\1\17\1\16\2\20\3\uffff\1\20\1\uffff"+
            "\3\20\1\uffff\2\20\2\uffff\1\20\1\uffff\1\20\2\uffff\5\20",
            "\3\21\5\uffff\2\21\2\uffff\1\17\1\uffff\2\21\3\uffff\1\21"+
            "\1\uffff\3\21\1\uffff\2\21\2\uffff\1\21\1\uffff\1\21\2\uffff"+
            "\5\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1067:1: rule__PrimaryExpression__Alternatives : ( ( ruleConditionalExpression ) | ( ruleLoopExpression ) | ( ruleBlockExpression ) | ( ruleLetExpression ) | ( ruleCaseExpression ) | ( ruleNewExpression ) | ( ruleIsvoidExpression ) | ( ruleAssignmentExpression ) | ( ruleSelfTypeLiteral ) | ( ruleIdentifierRefExpression ) | ( ruleLiteral ) | ( ruleParenExpression ) | ( ruleNegationExpression ) | ( ruleIntegerCompositeExpression ) | ( ruleStaticDispatchExpression ) );";
        }
    }
    static final String DFA16_eotS =
        "\27\uffff";
    static final String DFA16_eofS =
        "\1\2\26\uffff";
    static final String DFA16_minS =
        "\1\13\1\0\25\uffff";
    static final String DFA16_maxS =
        "\1\61\1\0\25\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\23\uffff\1\1";
    static final String DFA16_specialS =
        "\1\uffff\1\0\25\uffff}>";
    static final String[] DFA16_transitionS = {
            "\3\2\5\uffff\2\2\4\uffff\2\2\3\uffff\1\1\1\uffff\3\2\1\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\1\2\2\uffff\5\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "2955:1: ( rule__StaticDispatchExpression__Group_4__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalCool()) ) {s = 22;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\27\uffff";
    static final String DFA28_eofS =
        "\1\2\26\uffff";
    static final String DFA28_minS =
        "\1\13\1\0\25\uffff";
    static final String DFA28_maxS =
        "\1\61\1\0\25\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\23\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\25\uffff}>";
    static final String[] DFA28_transitionS = {
            "\3\2\5\uffff\2\2\4\uffff\2\2\3\uffff\1\1\1\uffff\3\2\1\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\1\2\2\uffff\5\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "5606:1: ( rule__DispatchExpression__Group_1_4__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalCool()) ) {s = 22;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ClassesAssignment_in_ruleProgram100 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleClass__in_entryRuleClass_128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__0_in_ruleClass_161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature__in_entryRuleFeature_188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature___Alternatives_in_ruleFeature_221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_entryRuleAttr248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttr255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__0_in_ruleAttr281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormal_in_entryRuleFormal368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormal375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__Group__0_in_ruleFormal401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleExpression461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfTypeLiteral_in_entryRuleSelfTypeLiteral547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfTypeLiteral554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfTypeLiteral__Group__0_in_ruleSelfTypeLiteral580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_entryRuleIdentifierRefExpression607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierRefExpression614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdentifierRefExpression__IdAssignment_in_ruleIdentifierRefExpression640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_in_ruleNumberLiteral760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpression_in_entryRuleParenExpression907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenExpression914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__0_in_ruleParenExpression940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__0_in_ruleAssignmentExpression1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegationExpression1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__0_in_ruleNegationExpression1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerCompositeExpression_in_entryRuleIntegerCompositeExpression1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerCompositeExpression1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerCompositeExpression__Group__0_in_ruleIntegerCompositeExpression1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewExpression_in_entryRuleNewExpression1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewExpression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__0_in_ruleNewExpression1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticDispatchExpression_in_entryRuleStaticDispatchExpression1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticDispatchExpression1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__0_in_ruleStaticDispatchExpression1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__0_in_ruleConditionalExpression1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopExpression_in_entryRuleLoopExpression1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopExpression1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__0_in_ruleLoopExpression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockExpression1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__0_in_ruleBlockExpression1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsvoidExpression_in_entryRuleIsvoidExpression1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsvoidExpression1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__0_in_ruleIsvoidExpression1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_entryRuleLetExpression1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExpression1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__0_in_ruleLetExpression1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetDeclaration1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__0_in_ruleLetDeclaration1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0_in_ruleCase1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_entryRuleCompareOperator1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperator1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDispatchExpression_in_entryRuleDispatchExpression1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDispatchExpression1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__0_in_ruleDispatchExpression2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_entryRuleSYMBOL2111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSYMBOL2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SYMBOL__Alternatives_in_ruleSYMBOL2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__Feature___Alternatives2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Feature___Alternatives2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_rule__PrimaryExpression__Alternatives2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopExpression_in_rule__PrimaryExpression__Alternatives2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_rule__PrimaryExpression__Alternatives2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_rule__PrimaryExpression__Alternatives2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_rule__PrimaryExpression__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewExpression_in_rule__PrimaryExpression__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsvoidExpression_in_rule__PrimaryExpression__Alternatives2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_rule__PrimaryExpression__Alternatives2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfTypeLiteral_in_rule__PrimaryExpression__Alternatives2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_rule__PrimaryExpression__Alternatives2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__PrimaryExpression__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpression_in_rule__PrimaryExpression__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_rule__PrimaryExpression__Alternatives2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerCompositeExpression_in_rule__PrimaryExpression__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticDispatchExpression_in_rule__PrimaryExpression__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CompareOperator__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CompareOperator__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompareOperator__Alternatives2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__0_in_rule__AdditionExpression__Alternatives_1_0_02640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__0_in_rule__AdditionExpression__Alternatives_1_0_02658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__0_in_rule__MultiplicationExpression__Alternatives_1_0_02691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__0_in_rule__MultiplicationExpression__Alternatives_1_0_02709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BOOLEAN__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BOOLEAN__Alternatives2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SYMBOL__Alternatives2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SYMBOL__Alternatives2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__0__Impl_in_rule__Class___Group__02848 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Class___Group__1_in_rule__Class___Group__02851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Class___Group__0__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__1__Impl_in_rule__Class___Group__12910 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Class___Group__2_in_rule__Class___Group__12913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___NameAssignment_1_in_rule__Class___Group__1__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__2__Impl_in_rule__Class___Group__22970 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Class___Group__3_in_rule__Class___Group__22973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group_2__0_in_rule__Class___Group__2__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__3__Impl_in_rule__Class___Group__33031 = new BitSet(new long[]{0x0000000000090010L});
    public static final BitSet FOLLOW_rule__Class___Group__4_in_rule__Class___Group__33034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Class___Group__3__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__4__Impl_in_rule__Class___Group__43093 = new BitSet(new long[]{0x0000000000090010L});
    public static final BitSet FOLLOW_rule__Class___Group__5_in_rule__Class___Group__43096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___FeaturesAssignment_4_in_rule__Class___Group__4__Impl3123 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__Class___Group__5__Impl_in_rule__Class___Group__53154 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Class___Group__6_in_rule__Class___Group__53157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class___Group__5__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__6__Impl_in_rule__Class___Group__63216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Class___Group__6__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group_2__0__Impl_in_rule__Class___Group_2__03289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class___Group_2__1_in_rule__Class___Group_2__03292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class___Group_2__0__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group_2__1__Impl_in_rule__Class___Group_2__13351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___ParentAssignment_2_1_in_rule__Class___Group_2__1__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__0__Impl_in_rule__Attr__Group__03412 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Attr__Group__1_in_rule__Attr__Group__03415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__NameAssignment_0_in_rule__Attr__Group__0__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__1__Impl_in_rule__Attr__Group__13472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attr__Group__2_in_rule__Attr__Group__13475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Attr__Group__1__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__2__Impl_in_rule__Attr__Group__23534 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__Attr__Group__3_in_rule__Attr__Group__23537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Type_declAssignment_2_in_rule__Attr__Group__2__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__3__Impl_in_rule__Attr__Group__33594 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__Attr__Group__4_in_rule__Attr__Group__33597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group_3__0_in_rule__Attr__Group__3__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__4__Impl_in_rule__Attr__Group__43655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Attr__Group__4__Impl3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group_3__0__Impl_in_rule__Attr__Group_3__03724 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__Attr__Group_3__1_in_rule__Attr__Group_3__03727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attr__Group_3__0__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group_3__1__Impl_in_rule__Attr__Group_3__13786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__InitAssignment_3_1_in_rule__Attr__Group_3__1__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03847 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_0_in_rule__Method__Group__0__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13907 = new BitSet(new long[]{0x0000000002010010L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Method__Group__1__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23969 = new BitSet(new long[]{0x0000000002010010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2__0_in_rule__Method__Group__2__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__34030 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__34033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Method__Group__3__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Method__Group__4__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Method__Group__6_in_rule__Method__Group__54157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Return_typeAssignment_5_in_rule__Method__Group__5__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__64214 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__Method__Group__7_in_rule__Method__Group__64217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group__6__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__74276 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Method__Group__8_in_rule__Method__Group__74279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ExprAssignment_7_in_rule__Method__Group__7__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__8__Impl_in_rule__Method__Group__84336 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Method__Group__9_in_rule__Method__Group__84339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Method__Group__8__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__9__Impl_in_rule__Method__Group__94398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Method__Group__9__Impl4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2__0__Impl_in_rule__Method__Group_2__04477 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Method__Group_2__1_in_rule__Method__Group_2__04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__FormalsAssignment_2_0_in_rule__Method__Group_2__0__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2__1__Impl_in_rule__Method__Group_2__14537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2_1__0_in_rule__Method__Group_2__1__Impl4564 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2_1__0__Impl_in_rule__Method__Group_2_1__04599 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Method__Group_2_1__1_in_rule__Method__Group_2_1__04602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Method__Group_2_1__0__Impl4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2_1__1__Impl_in_rule__Method__Group_2_1__14661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__FormalsAssignment_2_1_1_in_rule__Method__Group_2_1__1__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__Group__0__Impl_in_rule__Formal__Group__04722 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Formal__Group__1_in_rule__Formal__Group__04725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__NameAssignment_0_in_rule__Formal__Group__0__Impl4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__Group__1__Impl_in_rule__Formal__Group__14782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Formal__Group__2_in_rule__Formal__Group__14785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Formal__Group__1__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__Group__2__Impl_in_rule__Formal__Group__24844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__Type_declAssignment_2_in_rule__Formal__Group__2__Impl4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfTypeLiteral__Group__0__Impl_in_rule__SelfTypeLiteral__Group__04907 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SelfTypeLiteral__Group__1_in_rule__SelfTypeLiteral__Group__04910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfTypeLiteral__Group__1__Impl_in_rule__SelfTypeLiteral__Group__14968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SelfTypeLiteral__Group__1__Impl4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__0__Impl_in_rule__ParenExpression__Group__05031 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__1_in_rule__ParenExpression__Group__05034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ParenExpression__Group__0__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__1__Impl_in_rule__ParenExpression__Group__15093 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__2_in_rule__ParenExpression__Group__15096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpression__ExprAssignment_1_in_rule__ParenExpression__Group__1__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__2__Impl_in_rule__ParenExpression__Group__25153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ParenExpression__Group__2__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__0__Impl_in_rule__AssignmentExpression__Group__05218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__1_in_rule__AssignmentExpression__Group__05221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__NameAssignment_0_in_rule__AssignmentExpression__Group__0__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__1__Impl_in_rule__AssignmentExpression__Group__15278 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__2_in_rule__AssignmentExpression__Group__15281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AssignmentExpression__Group__1__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__2__Impl_in_rule__AssignmentExpression__Group__25340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__ExprAssignment_2_in_rule__AssignmentExpression__Group__2__Impl5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__0__Impl_in_rule__NegationExpression__Group__05403 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__1_in_rule__NegationExpression__Group__05406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NegationExpression__Group__0__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__1__Impl_in_rule__NegationExpression__Group__15465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__ExprAssignment_1_in_rule__NegationExpression__Group__1__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerCompositeExpression__Group__0__Impl_in_rule__IntegerCompositeExpression__Group__05526 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__IntegerCompositeExpression__Group__1_in_rule__IntegerCompositeExpression__Group__05529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IntegerCompositeExpression__Group__0__Impl5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerCompositeExpression__Group__1__Impl_in_rule__IntegerCompositeExpression__Group__15588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerCompositeExpression__ExprAssignment_1_in_rule__IntegerCompositeExpression__Group__1__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__0__Impl_in_rule__NewExpression__Group__05649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__1_in_rule__NewExpression__Group__05652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NewExpression__Group__0__Impl5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__1__Impl_in_rule__NewExpression__Group__15711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Type_nameAssignment_1_in_rule__NewExpression__Group__1__Impl5738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__0__Impl_in_rule__StaticDispatchExpression__Group__05772 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__1_in_rule__StaticDispatchExpression__Group__05775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__RefAssignment_0_in_rule__StaticDispatchExpression__Group__0__Impl5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__1__Impl_in_rule__StaticDispatchExpression__Group__15832 = new BitSet(new long[]{0x000002C8BB05C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__2_in_rule__StaticDispatchExpression__Group__15835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StaticDispatchExpression__Group__1__Impl5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__2__Impl_in_rule__StaticDispatchExpression__Group__25894 = new BitSet(new long[]{0x000002C8BB05C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__3_in_rule__StaticDispatchExpression__Group__25897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__0_in_rule__StaticDispatchExpression__Group__2__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__3__Impl_in_rule__StaticDispatchExpression__Group__35955 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__4_in_rule__StaticDispatchExpression__Group__35958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StaticDispatchExpression__Group__3__Impl5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__4__Impl_in_rule__StaticDispatchExpression__Group__46017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_4__0_in_rule__StaticDispatchExpression__Group__4__Impl6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__0__Impl_in_rule__StaticDispatchExpression__Group_2__06085 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__1_in_rule__StaticDispatchExpression__Group_2__06088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_0_in_rule__StaticDispatchExpression__Group_2__0__Impl6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__1__Impl_in_rule__StaticDispatchExpression__Group_2__16145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__0_in_rule__StaticDispatchExpression__Group_2__1__Impl6172 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__0__Impl_in_rule__StaticDispatchExpression__Group_2_1__06207 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__1_in_rule__StaticDispatchExpression__Group_2_1__06210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StaticDispatchExpression__Group_2_1__0__Impl6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__1__Impl_in_rule__StaticDispatchExpression__Group_2_1__16269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_1_1_in_rule__StaticDispatchExpression__Group_2_1__1__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_4__0__Impl_in_rule__StaticDispatchExpression__Group_4__06330 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_4__1_in_rule__StaticDispatchExpression__Group_4__06333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StaticDispatchExpression__Group_4__0__Impl6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_4__1__Impl_in_rule__StaticDispatchExpression__Group_4__16394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__ChainAssignment_4_1_in_rule__StaticDispatchExpression__Group_4__1__Impl6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__06455 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__06458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ConditionalExpression__Group__0__Impl6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__16517 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__2_in_rule__ConditionalExpression__Group__16520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__PredAssignment_1_in_rule__ConditionalExpression__Group__1__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__2__Impl_in_rule__ConditionalExpression__Group__26577 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__3_in_rule__ConditionalExpression__Group__26580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ConditionalExpression__Group__2__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__3__Impl_in_rule__ConditionalExpression__Group__36639 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__4_in_rule__ConditionalExpression__Group__36642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Then_expAssignment_3_in_rule__ConditionalExpression__Group__3__Impl6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__4__Impl_in_rule__ConditionalExpression__Group__46699 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__5_in_rule__ConditionalExpression__Group__46702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_4__0_in_rule__ConditionalExpression__Group__4__Impl6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__5__Impl_in_rule__ConditionalExpression__Group__56760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ConditionalExpression__Group__5__Impl6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_4__0__Impl_in_rule__ConditionalExpression__Group_4__06831 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_4__1_in_rule__ConditionalExpression__Group_4__06834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ConditionalExpression__Group_4__0__Impl6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_4__1__Impl_in_rule__ConditionalExpression__Group_4__16895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Else_expAssignment_4_1_in_rule__ConditionalExpression__Group_4__1__Impl6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__0__Impl_in_rule__LoopExpression__Group__06956 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__1_in_rule__LoopExpression__Group__06959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LoopExpression__Group__0__Impl6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__1__Impl_in_rule__LoopExpression__Group__17018 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__2_in_rule__LoopExpression__Group__17021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__PredAssignment_1_in_rule__LoopExpression__Group__1__Impl7048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__2__Impl_in_rule__LoopExpression__Group__27078 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__3_in_rule__LoopExpression__Group__27081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LoopExpression__Group__2__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__3__Impl_in_rule__LoopExpression__Group__37140 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__4_in_rule__LoopExpression__Group__37143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__BodyAssignment_3_in_rule__LoopExpression__Group__3__Impl7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__4__Impl_in_rule__LoopExpression__Group__47200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__LoopExpression__Group__4__Impl7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__0__Impl_in_rule__BlockExpression__Group__07269 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__1_in_rule__BlockExpression__Group__07272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__1__Impl_in_rule__BlockExpression__Group__17330 = new BitSet(new long[]{0x000002C8B90DC070L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__2_in_rule__BlockExpression__Group__17333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BlockExpression__Group__1__Impl7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__2__Impl_in_rule__BlockExpression__Group__27392 = new BitSet(new long[]{0x000002C8B90DC070L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__3_in_rule__BlockExpression__Group__27395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__0_in_rule__BlockExpression__Group__2__Impl7422 = new BitSet(new long[]{0x000002C8B905C072L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__3__Impl_in_rule__BlockExpression__Group__37453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BlockExpression__Group__3__Impl7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__0__Impl_in_rule__BlockExpression__Group_2__07520 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__1_in_rule__BlockExpression__Group_2__07523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__BodyAssignment_2_0_in_rule__BlockExpression__Group_2__0__Impl7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__1__Impl_in_rule__BlockExpression__Group_2__17580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BlockExpression__Group_2__1__Impl7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__0__Impl_in_rule__IsvoidExpression__Group__07643 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__1_in_rule__IsvoidExpression__Group__07646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IsvoidExpression__Group__0__Impl7674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__1__Impl_in_rule__IsvoidExpression__Group__17705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__ExprAssignment_1_in_rule__IsvoidExpression__Group__1__Impl7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__0__Impl_in_rule__LetExpression__Group__07766 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__1_in_rule__LetExpression__Group__07769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LetExpression__Group__0__Impl7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__1__Impl_in_rule__LetExpression__Group__17828 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__2_in_rule__LetExpression__Group__17831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__DeclarationAssignment_1_in_rule__LetExpression__Group__1__Impl7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__2__Impl_in_rule__LetExpression__Group__27888 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__3_in_rule__LetExpression__Group__27891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__0_in_rule__LetExpression__Group__2__Impl7918 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__3__Impl_in_rule__LetExpression__Group__37949 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__4_in_rule__LetExpression__Group__37952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__LetExpression__Group__3__Impl7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__4__Impl_in_rule__LetExpression__Group__48011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__BodyAssignment_4_in_rule__LetExpression__Group__4__Impl8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__0__Impl_in_rule__LetExpression__Group_2__08078 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__1_in_rule__LetExpression__Group_2__08081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LetExpression__Group_2__0__Impl8109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__1__Impl_in_rule__LetExpression__Group_2__18140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__DeclarationAssignment_2_1_in_rule__LetExpression__Group_2__1__Impl8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__0__Impl_in_rule__LetDeclaration__Group__08201 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__1_in_rule__LetDeclaration__Group__08204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__NameAssignment_0_in_rule__LetDeclaration__Group__0__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__1__Impl_in_rule__LetDeclaration__Group__18261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__2_in_rule__LetDeclaration__Group__18264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LetDeclaration__Group__1__Impl8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__2__Impl_in_rule__LetDeclaration__Group__28323 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__3_in_rule__LetDeclaration__Group__28326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Type_declAssignment_2_in_rule__LetDeclaration__Group__2__Impl8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__3__Impl_in_rule__LetDeclaration__Group__38383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__0_in_rule__LetDeclaration__Group__3__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__0__Impl_in_rule__LetDeclaration__Group_3__08449 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__1_in_rule__LetDeclaration__Group_3__08452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LetDeclaration__Group_3__0__Impl8480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__1__Impl_in_rule__LetDeclaration__Group_3__18511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__InitAssignment_3_1_in_rule__LetDeclaration__Group_3__1__Impl8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__08572 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__08575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__CaseExpression__Group__0__Impl8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__18634 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__18637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__ExprAssignment_1_in_rule__CaseExpression__Group__1__Impl8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__28694 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__28697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__CaseExpression__Group__2__Impl8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__38756 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__4_in_rule__CaseExpression__Group__38759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__0_in_rule__CaseExpression__Group__3__Impl8788 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__0_in_rule__CaseExpression__Group__3__Impl8800 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__4__Impl_in_rule__CaseExpression__Group__48833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__CaseExpression__Group__4__Impl8861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__0__Impl_in_rule__CaseExpression__Group_3__08902 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__1_in_rule__CaseExpression__Group_3__08905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__CaseAssignment_3_0_in_rule__CaseExpression__Group_3__0__Impl8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__1__Impl_in_rule__CaseExpression__Group_3__18962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CaseExpression__Group_3__1__Impl8990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__09025 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Case__Group__1_in_rule__Case__Group__09028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl9055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__19085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Case__Group__2_in_rule__Case__Group__19088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Case__Group__1__Impl9116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__29147 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Case__Group__3_in_rule__Case__Group__29150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Type_declAssignment_2_in_rule__Case__Group__2__Impl9177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__39207 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__Case__Group__4_in_rule__Case__Group__39210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Case__Group__3__Impl9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__49269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__ExprAssignment_4_in_rule__Case__Group__4__Impl9296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__09336 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__09339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_rule__CompareExpression__Group__0__Impl9366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__19395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__09457 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__09460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl9487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__19517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl9544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__09578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__09637 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__09640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__19698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OpAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl9725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__09759 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__09762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl9789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__19818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__09880 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__09883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0__0_in_rule__AdditionExpression__Group_1__0__Impl9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__19940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__RightAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl9967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0__0__Impl_in_rule__AdditionExpression__Group_1_0__010001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Alternatives_1_0_0_in_rule__AdditionExpression__Group_1_0__0__Impl10028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__0__Impl_in_rule__AdditionExpression__Group_1_0_0_0__010060 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1_in_rule__AdditionExpression__Group_1_0_0_0__010063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1__Impl_in_rule__AdditionExpression__Group_1_0_0_0__110121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AdditionExpression__Group_1_0_0_0__1__Impl10149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__0__Impl_in_rule__AdditionExpression__Group_1_0_0_1__010184 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1_in_rule__AdditionExpression__Group_1_0_0_1__010187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1__Impl_in_rule__AdditionExpression__Group_1_0_0_1__110245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__AdditionExpression__Group_1_0_0_1__1__Impl10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__010308 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__010311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDispatchExpression_in_rule__MultiplicationExpression__Group__0__Impl10338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__110367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl10394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__010429 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__010432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0__0_in_rule__MultiplicationExpression__Group_1__0__Impl10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__110489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__RightAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0__010550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Alternatives_1_0_0_in_rule__MultiplicationExpression__Group_1_0__0__Impl10577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__010609 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1_in_rule__MultiplicationExpression__Group_1_0_0_0__010612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__110670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl10698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__010733 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1_in_rule__MultiplicationExpression__Group_1_0_0_1__010736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__110794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl10822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__0__Impl_in_rule__DispatchExpression__Group__010857 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__1_in_rule__DispatchExpression__Group__010860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__DispatchExpression__Group__0__Impl10887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__1__Impl_in_rule__DispatchExpression__Group__110916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__0_in_rule__DispatchExpression__Group__1__Impl10943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__0__Impl_in_rule__DispatchExpression__Group_1__010978 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__1_in_rule__DispatchExpression__Group_1__010981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0__0_in_rule__DispatchExpression__Group_1__0__Impl11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__1__Impl_in_rule__DispatchExpression__Group_1__111038 = new BitSet(new long[]{0x000002C8BB05C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__2_in_rule__DispatchExpression__Group_1__111041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DispatchExpression__Group_1__1__Impl11069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__2__Impl_in_rule__DispatchExpression__Group_1__211100 = new BitSet(new long[]{0x000002C8BB05C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__3_in_rule__DispatchExpression__Group_1__211103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__0_in_rule__DispatchExpression__Group_1__2__Impl11130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__3__Impl_in_rule__DispatchExpression__Group_1__311161 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__4_in_rule__DispatchExpression__Group_1__311164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DispatchExpression__Group_1__3__Impl11192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__4__Impl_in_rule__DispatchExpression__Group_1__411223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_4__0_in_rule__DispatchExpression__Group_1__4__Impl11250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0__0__Impl_in_rule__DispatchExpression__Group_1_0__011291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__0_in_rule__DispatchExpression__Group_1_0__0__Impl11318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__0__Impl_in_rule__DispatchExpression__Group_1_0_0__011350 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__1_in_rule__DispatchExpression__Group_1_0_0__011353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__1__Impl_in_rule__DispatchExpression__Group_1_0_0__111411 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__2_in_rule__DispatchExpression__Group_1_0_0__111414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0_in_rule__DispatchExpression__Group_1_0_0__1__Impl11441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__2__Impl_in_rule__DispatchExpression__Group_1_0_0__211472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__3_in_rule__DispatchExpression__Group_1_0_0__211475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DispatchExpression__Group_1_0_0__2__Impl11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__3__Impl_in_rule__DispatchExpression__Group_1_0_0__311534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__RefAssignment_1_0_0_3_in_rule__DispatchExpression__Group_1_0_0__3__Impl11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0__Impl_in_rule__DispatchExpression__Group_1_0_0_1__011599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1_in_rule__DispatchExpression__Group_1_0_0_1__011602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DispatchExpression__Group_1_0_0_1__0__Impl11630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1__Impl_in_rule__DispatchExpression__Group_1_0_0_1__111661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1_in_rule__DispatchExpression__Group_1_0_0_1__1__Impl11688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__0__Impl_in_rule__DispatchExpression__Group_1_2__011722 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__1_in_rule__DispatchExpression__Group_1_2__011725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_0_in_rule__DispatchExpression__Group_1_2__0__Impl11752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__1__Impl_in_rule__DispatchExpression__Group_1_2__111782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__0_in_rule__DispatchExpression__Group_1_2__1__Impl11809 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__0__Impl_in_rule__DispatchExpression__Group_1_2_1__011844 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__1_in_rule__DispatchExpression__Group_1_2_1__011847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DispatchExpression__Group_1_2_1__0__Impl11875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__1__Impl_in_rule__DispatchExpression__Group_1_2_1__111906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_1_1_in_rule__DispatchExpression__Group_1_2_1__1__Impl11933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_4__0__Impl_in_rule__DispatchExpression__Group_1_4__011967 = new BitSet(new long[]{0x000002C8B905C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_4__1_in_rule__DispatchExpression__Group_1_4__011970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DispatchExpression__Group_1_4__0__Impl11999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_4__1__Impl_in_rule__DispatchExpression__Group_1_4__112031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__ChainAssignment_1_4_1_in_rule__DispatchExpression__Group_1_4__1__Impl12058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass__in_rule__Program__ClassesAssignment12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Class___NameAssignment_112128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class___ParentAssignment_2_112163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature__in_rule__Class___FeaturesAssignment_412198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Attr__NameAssignment_012229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attr__Type_declAssignment_212264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Attr__InitAssignment_3_112299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Method__NameAssignment_012330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_012361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_1_112392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__Return_typeAssignment_512427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Method__ExprAssignment_712462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Formal__NameAssignment_012493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Formal__Type_declAssignment_212528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IdentifierRefExpression__IdAssignment12567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment12602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__BooleanLiteral__ValueAssignment12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParenExpression__ExprAssignment_112695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__AssignmentExpression__NameAssignment_012726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AssignmentExpression__ExprAssignment_212757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__NegationExpression__ExprAssignment_112788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__IntegerCompositeExpression__ExprAssignment_112819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewExpression__Type_nameAssignment_112854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_rule__StaticDispatchExpression__RefAssignment_012889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_012920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_1_112951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticDispatchExpression_in_rule__StaticDispatchExpression__ChainAssignment_4_112982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__PredAssignment_113013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__Then_expAssignment_313044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__Else_expAssignment_4_113075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LoopExpression__PredAssignment_113106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LoopExpression__BodyAssignment_313137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__BlockExpression__BodyAssignment_2_013168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__IsvoidExpression__ExprAssignment_113199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_113230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_2_113261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LetExpression__BodyAssignment_413292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__LetDeclaration__NameAssignment_013323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LetDeclaration__Type_declAssignment_213358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LetDeclaration__InitAssignment_3_113393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CaseExpression__ExprAssignment_113424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__CaseExpression__CaseAssignment_3_013455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Case__NameAssignment_013486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Case__Type_declAssignment_213521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Case__ExprAssignment_413556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareExpression__OpAssignment_1_0_0_113587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CompareExpression__RightAssignment_1_113618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AdditionExpression__RightAssignment_1_113649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__MultiplicationExpression__RightAssignment_1_113680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_113715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_rule__DispatchExpression__RefAssignment_1_0_0_313750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_013781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_1_113812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticDispatchExpression_in_rule__DispatchExpression__ChainAssignment_1_4_113843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_4__0_in_synpred31_InternalCool6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_synpred38_InternalCool9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_synpred39_InternalCool9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_synpred40_InternalCool10394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__0_in_synpred41_InternalCool10943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_4__0_in_synpred43_InternalCool11250 = new BitSet(new long[]{0x0000000000000002L});

}