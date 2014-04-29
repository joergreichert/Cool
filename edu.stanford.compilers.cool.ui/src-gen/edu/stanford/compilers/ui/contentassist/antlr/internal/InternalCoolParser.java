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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'<='", "'='", "'true'", "'false'", "'self'", "'class'", "'{'", "'}'", "';'", "'inherits'", "':'", "'<-'", "'('", "')'", "','", "'not'", "'~'", "'.'", "'@'", "'if'", "'then'", "'fi'", "'else'", "'while'", "'loop'", "'pool'", "'let'", "'in'", "'case'", "'of'", "'esac'", "'=>'", "'new'", "'isvoid'", "'+'", "'-'", "'*'", "'/'"
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:238:1: ruleExpression : ( ruleDispatchExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:242:2: ( ( ruleDispatchExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:243:1: ( ruleDispatchExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:243:1: ( ruleDispatchExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:244:1: ruleDispatchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getDispatchExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleDispatchExpression_in_ruleExpression461);
            ruleDispatchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getDispatchExpressionParserRuleCall()); 
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


    // $ANTLR start "entryRuleIntegerComposite"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:537:1: entryRuleIntegerComposite : ruleIntegerComposite EOF ;
    public final void entryRuleIntegerComposite() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:538:1: ( ruleIntegerComposite EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:539:1: ruleIntegerComposite EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerComposite_in_entryRuleIntegerComposite1087);
            ruleIntegerComposite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerComposite1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntegerComposite"


    // $ANTLR start "ruleIntegerComposite"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:546:1: ruleIntegerComposite : ( ( rule__IntegerComposite__Group__0 ) ) ;
    public final void ruleIntegerComposite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:550:2: ( ( ( rule__IntegerComposite__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:551:1: ( ( rule__IntegerComposite__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:551:1: ( ( rule__IntegerComposite__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:552:1: ( rule__IntegerComposite__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:553:1: ( rule__IntegerComposite__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:553:2: rule__IntegerComposite__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerComposite__Group__0_in_ruleIntegerComposite1120);
            rule__IntegerComposite__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeAccess().getGroup()); 
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
    // $ANTLR end "ruleIntegerComposite"


    // $ANTLR start "entryRuleDispatchExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:565:1: entryRuleDispatchExpression : ruleDispatchExpression EOF ;
    public final void entryRuleDispatchExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:566:1: ( ruleDispatchExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:567:1: ruleDispatchExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDispatchExpression_in_entryRuleDispatchExpression1147);
            ruleDispatchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDispatchExpression1154); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:574:1: ruleDispatchExpression : ( ( rule__DispatchExpression__Group__0 ) ) ;
    public final void ruleDispatchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:578:2: ( ( ( rule__DispatchExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:579:1: ( ( rule__DispatchExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:579:1: ( ( rule__DispatchExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:580:1: ( rule__DispatchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:581:1: ( rule__DispatchExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:581:2: rule__DispatchExpression__Group__0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group__0_in_ruleDispatchExpression1180);
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


    // $ANTLR start "entryRuleLetExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:705:1: entryRuleLetExpression : ruleLetExpression EOF ;
    public final void entryRuleLetExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:706:1: ( ruleLetExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:707:1: ruleLetExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLetExpression_in_entryRuleLetExpression1447);
            ruleLetExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExpression1454); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:714:1: ruleLetExpression : ( ( rule__LetExpression__Group__0 ) ) ;
    public final void ruleLetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:718:2: ( ( ( rule__LetExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:719:1: ( ( rule__LetExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:719:1: ( ( rule__LetExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:720:1: ( rule__LetExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:721:1: ( rule__LetExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:721:2: rule__LetExpression__Group__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__0_in_ruleLetExpression1480);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:733:1: entryRuleLetDeclaration : ruleLetDeclaration EOF ;
    public final void entryRuleLetDeclaration() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:734:1: ( ruleLetDeclaration EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:735:1: ruleLetDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration1507);
            ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetDeclaration1514); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:742:1: ruleLetDeclaration : ( ( rule__LetDeclaration__Group__0 ) ) ;
    public final void ruleLetDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:746:2: ( ( ( rule__LetDeclaration__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:747:1: ( ( rule__LetDeclaration__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:747:1: ( ( rule__LetDeclaration__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:748:1: ( rule__LetDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:749:1: ( rule__LetDeclaration__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:749:2: rule__LetDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__0_in_ruleLetDeclaration1540);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:761:1: entryRuleCaseExpression : ruleCaseExpression EOF ;
    public final void entryRuleCaseExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:762:1: ( ruleCaseExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:763:1: ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression1567);
            ruleCaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression1574); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:770:1: ruleCaseExpression : ( ( rule__CaseExpression__Group__0 ) ) ;
    public final void ruleCaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:774:2: ( ( ( rule__CaseExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:775:1: ( ( rule__CaseExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:775:1: ( ( rule__CaseExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:776:1: ( rule__CaseExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:777:1: ( rule__CaseExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:777:2: rule__CaseExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression1600);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:789:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:790:1: ( ruleCase EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:791:1: ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase1627);
            ruleCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase1634); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:798:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:802:2: ( ( ( rule__Case__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:803:1: ( ( rule__Case__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:803:1: ( ( rule__Case__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:804:1: ( rule__Case__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:805:1: ( rule__Case__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:805:2: rule__Case__Group__0
            {
            pushFollow(FOLLOW_rule__Case__Group__0_in_ruleCase1660);
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


    // $ANTLR start "entryRuleNewExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:817:1: entryRuleNewExpression : ruleNewExpression EOF ;
    public final void entryRuleNewExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:818:1: ( ruleNewExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:819:1: ruleNewExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNewExpression_in_entryRuleNewExpression1687);
            ruleNewExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewExpression1694); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:826:1: ruleNewExpression : ( ( rule__NewExpression__Group__0 ) ) ;
    public final void ruleNewExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:830:2: ( ( ( rule__NewExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:831:1: ( ( rule__NewExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:831:1: ( ( rule__NewExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:832:1: ( rule__NewExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:833:1: ( rule__NewExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:833:2: rule__NewExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NewExpression__Group__0_in_ruleNewExpression1720);
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


    // $ANTLR start "entryRuleIsvoidExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:845:1: entryRuleIsvoidExpression : ruleIsvoidExpression EOF ;
    public final void entryRuleIsvoidExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:846:1: ( ruleIsvoidExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:847:1: ruleIsvoidExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIsvoidExpression_in_entryRuleIsvoidExpression1747);
            ruleIsvoidExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsvoidExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsvoidExpression1754); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:854:1: ruleIsvoidExpression : ( ( rule__IsvoidExpression__Group__0 ) ) ;
    public final void ruleIsvoidExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:858:2: ( ( ( rule__IsvoidExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:859:1: ( ( rule__IsvoidExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:859:1: ( ( rule__IsvoidExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:860:1: ( rule__IsvoidExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:861:1: ( rule__IsvoidExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:861:2: rule__IsvoidExpression__Group__0
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__0_in_ruleIsvoidExpression1780);
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


    // $ANTLR start "entryRuleCompareExpression"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:873:1: entryRuleCompareExpression : ruleCompareExpression EOF ;
    public final void entryRuleCompareExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:874:1: ( ruleCompareExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:875:1: ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1807);
            ruleCompareExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression1814); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:882:1: ruleCompareExpression : ( ( rule__CompareExpression__Group__0 ) ) ;
    public final void ruleCompareExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:886:2: ( ( ( rule__CompareExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:887:1: ( ( rule__CompareExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:887:1: ( ( rule__CompareExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:888:1: ( rule__CompareExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:889:1: ( rule__CompareExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:889:2: rule__CompareExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1840);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:901:1: entryRuleCompareOperator : ruleCompareOperator EOF ;
    public final void entryRuleCompareOperator() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:902:1: ( ruleCompareOperator EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:903:1: ruleCompareOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_entryRuleCompareOperator1867);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperator1874); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:910:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:914:2: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:915:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:915:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:916:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:917:1: ( rule__CompareOperator__Alternatives )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:917:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1900);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:929:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:930:1: ( ruleAdditionExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:931:1: ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1927);
            ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExpression1934); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:938:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:942:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:943:1: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:943:1: ( ( rule__AdditionExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:944:1: ( rule__AdditionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:945:1: ( rule__AdditionExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:945:2: rule__AdditionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression1960);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:957:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:958:1: ( ruleMultiplicationExpression EOF )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:959:1: ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1987);
            ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExpression1994); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:966:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:970:2: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:971:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:971:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:972:1: ( rule__MultiplicationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:973:1: ( rule__MultiplicationExpression__Group__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:973:2: rule__MultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression2020);
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

                if ( (LA2_1==24) ) {
                    alt2=2;
                }
                else if ( (LA2_1==22) ) {
                    alt2=1;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1067:1: rule__PrimaryExpression__Alternatives : ( ( ruleConditionalExpression ) | ( ruleLoopExpression ) | ( ruleBlockExpression ) | ( ruleLetExpression ) | ( ruleCaseExpression ) | ( ruleNewExpression ) | ( ruleIsvoidExpression ) | ( ruleAssignmentExpression ) | ( ruleSelfTypeLiteral ) | ( ruleIdentifierRefExpression ) | ( ruleLiteral ) | ( ruleParenExpression ) | ( ruleNegationExpression ) | ( ruleIntegerComposite ) | ( ruleStaticDispatchExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1071:1: ( ( ruleConditionalExpression ) | ( ruleLoopExpression ) | ( ruleBlockExpression ) | ( ruleLetExpression ) | ( ruleCaseExpression ) | ( ruleNewExpression ) | ( ruleIsvoidExpression ) | ( ruleAssignmentExpression ) | ( ruleSelfTypeLiteral ) | ( ruleIdentifierRefExpression ) | ( ruleLiteral ) | ( ruleParenExpression ) | ( ruleNegationExpression ) | ( ruleIntegerComposite ) | ( ruleStaticDispatchExpression ) )
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
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1150:6: ( ruleIntegerComposite )
                    {
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1150:6: ( ruleIntegerComposite )
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1151:1: ruleIntegerComposite
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getIntegerCompositeParserRuleCall_13()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerComposite_in_rule__PrimaryExpression__Alternatives2450);
                    ruleIntegerComposite();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getIntegerCompositeParserRuleCall_13()); 
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

            if ( (LA6_0==46) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
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

            if ( (LA7_0==48) ) {
                alt7=1;
            }
            else if ( (LA7_0==49) ) {
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


    // $ANTLR start "rule__IntegerComposite__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2691:1: rule__IntegerComposite__Group__0 : rule__IntegerComposite__Group__0__Impl rule__IntegerComposite__Group__1 ;
    public final void rule__IntegerComposite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2695:1: ( rule__IntegerComposite__Group__0__Impl rule__IntegerComposite__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2696:2: rule__IntegerComposite__Group__0__Impl rule__IntegerComposite__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerComposite__Group__0__Impl_in_rule__IntegerComposite__Group__05526);
            rule__IntegerComposite__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IntegerComposite__Group__1_in_rule__IntegerComposite__Group__05529);
            rule__IntegerComposite__Group__1();

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
    // $ANTLR end "rule__IntegerComposite__Group__0"


    // $ANTLR start "rule__IntegerComposite__Group__0__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2703:1: rule__IntegerComposite__Group__0__Impl : ( '~' ) ;
    public final void rule__IntegerComposite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2707:1: ( ( '~' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2708:1: ( '~' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2708:1: ( '~' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2709:1: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeAccess().getTildeKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__IntegerComposite__Group__0__Impl5557); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeAccess().getTildeKeyword_0()); 
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
    // $ANTLR end "rule__IntegerComposite__Group__0__Impl"


    // $ANTLR start "rule__IntegerComposite__Group__1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2722:1: rule__IntegerComposite__Group__1 : rule__IntegerComposite__Group__1__Impl ;
    public final void rule__IntegerComposite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2726:1: ( rule__IntegerComposite__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2727:2: rule__IntegerComposite__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerComposite__Group__1__Impl_in_rule__IntegerComposite__Group__15588);
            rule__IntegerComposite__Group__1__Impl();

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
    // $ANTLR end "rule__IntegerComposite__Group__1"


    // $ANTLR start "rule__IntegerComposite__Group__1__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2733:1: rule__IntegerComposite__Group__1__Impl : ( ( rule__IntegerComposite__ExprAssignment_1 ) ) ;
    public final void rule__IntegerComposite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2737:1: ( ( ( rule__IntegerComposite__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2738:1: ( ( rule__IntegerComposite__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2738:1: ( ( rule__IntegerComposite__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2739:1: ( rule__IntegerComposite__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2740:1: ( rule__IntegerComposite__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2740:2: rule__IntegerComposite__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__IntegerComposite__ExprAssignment_1_in_rule__IntegerComposite__Group__1__Impl5615);
            rule__IntegerComposite__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__IntegerComposite__Group__1__Impl"


    // $ANTLR start "rule__DispatchExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2754:1: rule__DispatchExpression__Group__0 : rule__DispatchExpression__Group__0__Impl rule__DispatchExpression__Group__1 ;
    public final void rule__DispatchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2758:1: ( rule__DispatchExpression__Group__0__Impl rule__DispatchExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2759:2: rule__DispatchExpression__Group__0__Impl rule__DispatchExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group__0__Impl_in_rule__DispatchExpression__Group__05649);
            rule__DispatchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group__1_in_rule__DispatchExpression__Group__05652);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2766:1: rule__DispatchExpression__Group__0__Impl : ( ruleCompareExpression ) ;
    public final void rule__DispatchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2770:1: ( ( ruleCompareExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2771:1: ( ruleCompareExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2771:1: ( ruleCompareExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2772:1: ruleCompareExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getCompareExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_rule__DispatchExpression__Group__0__Impl5679);
            ruleCompareExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getCompareExpressionParserRuleCall_0()); 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2783:1: rule__DispatchExpression__Group__1 : rule__DispatchExpression__Group__1__Impl ;
    public final void rule__DispatchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2787:1: ( rule__DispatchExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2788:2: rule__DispatchExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group__1__Impl_in_rule__DispatchExpression__Group__15708);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2794:1: rule__DispatchExpression__Group__1__Impl : ( ( rule__DispatchExpression__Group_1__0 )? ) ;
    public final void rule__DispatchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2798:1: ( ( ( rule__DispatchExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2799:1: ( ( rule__DispatchExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2799:1: ( ( rule__DispatchExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2800:1: ( rule__DispatchExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2801:1: ( rule__DispatchExpression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred30_InternalCool()) ) {
                    alt15=1;
                }
            }
            else if ( (LA15_0==29) ) {
                int LA15_2 = input.LA(2);

                if ( (synpred30_InternalCool()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2801:2: rule__DispatchExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1__0_in_rule__DispatchExpression__Group__1__Impl5735);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2815:1: rule__DispatchExpression__Group_1__0 : rule__DispatchExpression__Group_1__0__Impl rule__DispatchExpression__Group_1__1 ;
    public final void rule__DispatchExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2819:1: ( rule__DispatchExpression__Group_1__0__Impl rule__DispatchExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2820:2: rule__DispatchExpression__Group_1__0__Impl rule__DispatchExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__0__Impl_in_rule__DispatchExpression__Group_1__05770);
            rule__DispatchExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__1_in_rule__DispatchExpression__Group_1__05773);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2827:1: rule__DispatchExpression__Group_1__0__Impl : ( ( rule__DispatchExpression__Group_1_0__0 ) ) ;
    public final void rule__DispatchExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2831:1: ( ( ( rule__DispatchExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2832:1: ( ( rule__DispatchExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2832:1: ( ( rule__DispatchExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2833:1: ( rule__DispatchExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2834:1: ( rule__DispatchExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2834:2: rule__DispatchExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0__0_in_rule__DispatchExpression__Group_1__0__Impl5800);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2844:1: rule__DispatchExpression__Group_1__1 : rule__DispatchExpression__Group_1__1__Impl rule__DispatchExpression__Group_1__2 ;
    public final void rule__DispatchExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2848:1: ( rule__DispatchExpression__Group_1__1__Impl rule__DispatchExpression__Group_1__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2849:2: rule__DispatchExpression__Group_1__1__Impl rule__DispatchExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__1__Impl_in_rule__DispatchExpression__Group_1__15830);
            rule__DispatchExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__2_in_rule__DispatchExpression__Group_1__15833);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2856:1: rule__DispatchExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__DispatchExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2860:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2861:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2861:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2862:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__DispatchExpression__Group_1__1__Impl5861); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2875:1: rule__DispatchExpression__Group_1__2 : rule__DispatchExpression__Group_1__2__Impl rule__DispatchExpression__Group_1__3 ;
    public final void rule__DispatchExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2879:1: ( rule__DispatchExpression__Group_1__2__Impl rule__DispatchExpression__Group_1__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2880:2: rule__DispatchExpression__Group_1__2__Impl rule__DispatchExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__2__Impl_in_rule__DispatchExpression__Group_1__25892);
            rule__DispatchExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__3_in_rule__DispatchExpression__Group_1__25895);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2887:1: rule__DispatchExpression__Group_1__2__Impl : ( ( rule__DispatchExpression__Group_1_2__0 )? ) ;
    public final void rule__DispatchExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2891:1: ( ( ( rule__DispatchExpression__Group_1_2__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2892:1: ( ( rule__DispatchExpression__Group_1_2__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2892:1: ( ( rule__DispatchExpression__Group_1_2__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2893:1: ( rule__DispatchExpression__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2894:1: ( rule__DispatchExpression__Group_1_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||(LA16_0>=14 && LA16_0<=16)||LA16_0==18||LA16_0==24||(LA16_0>=27 && LA16_0<=28)||LA16_0==31||LA16_0==35||LA16_0==38||LA16_0==40||(LA16_0>=44 && LA16_0<=45)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2894:2: rule__DispatchExpression__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__0_in_rule__DispatchExpression__Group_1__2__Impl5922);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2904:1: rule__DispatchExpression__Group_1__3 : rule__DispatchExpression__Group_1__3__Impl ;
    public final void rule__DispatchExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2908:1: ( rule__DispatchExpression__Group_1__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2909:2: rule__DispatchExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__3__Impl_in_rule__DispatchExpression__Group_1__35953);
            rule__DispatchExpression__Group_1__3__Impl();

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2915:1: rule__DispatchExpression__Group_1__3__Impl : ( ')' ) ;
    public final void rule__DispatchExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2919:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2920:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2920:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2921:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__DispatchExpression__Group_1__3__Impl5981); if (state.failed) return ;
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


    // $ANTLR start "rule__DispatchExpression__Group_1_0__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2942:1: rule__DispatchExpression__Group_1_0__0 : rule__DispatchExpression__Group_1_0__0__Impl ;
    public final void rule__DispatchExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2946:1: ( rule__DispatchExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2947:2: rule__DispatchExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0__0__Impl_in_rule__DispatchExpression__Group_1_0__06020);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2953:1: rule__DispatchExpression__Group_1_0__0__Impl : ( ( rule__DispatchExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DispatchExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2957:1: ( ( ( rule__DispatchExpression__Group_1_0_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2958:1: ( ( rule__DispatchExpression__Group_1_0_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2958:1: ( ( rule__DispatchExpression__Group_1_0_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2959:1: ( rule__DispatchExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2960:1: ( rule__DispatchExpression__Group_1_0_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2960:2: rule__DispatchExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__0_in_rule__DispatchExpression__Group_1_0__0__Impl6047);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2972:1: rule__DispatchExpression__Group_1_0_0__0 : rule__DispatchExpression__Group_1_0_0__0__Impl rule__DispatchExpression__Group_1_0_0__1 ;
    public final void rule__DispatchExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2976:1: ( rule__DispatchExpression__Group_1_0_0__0__Impl rule__DispatchExpression__Group_1_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2977:2: rule__DispatchExpression__Group_1_0_0__0__Impl rule__DispatchExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__0__Impl_in_rule__DispatchExpression__Group_1_0_0__06079);
            rule__DispatchExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__1_in_rule__DispatchExpression__Group_1_0_0__06082);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2984:1: rule__DispatchExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DispatchExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2988:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2989:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2989:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2990:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2991:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2993:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0()); 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3003:1: rule__DispatchExpression__Group_1_0_0__1 : rule__DispatchExpression__Group_1_0_0__1__Impl rule__DispatchExpression__Group_1_0_0__2 ;
    public final void rule__DispatchExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3007:1: ( rule__DispatchExpression__Group_1_0_0__1__Impl rule__DispatchExpression__Group_1_0_0__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3008:2: rule__DispatchExpression__Group_1_0_0__1__Impl rule__DispatchExpression__Group_1_0_0__2
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__1__Impl_in_rule__DispatchExpression__Group_1_0_0__16140);
            rule__DispatchExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__2_in_rule__DispatchExpression__Group_1_0_0__16143);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3015:1: rule__DispatchExpression__Group_1_0_0__1__Impl : ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? ) ;
    public final void rule__DispatchExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3019:1: ( ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3020:1: ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3020:1: ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3021:1: ( rule__DispatchExpression__Group_1_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_0_0_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3022:1: ( rule__DispatchExpression__Group_1_0_0_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3022:2: rule__DispatchExpression__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0_in_rule__DispatchExpression__Group_1_0_0__1__Impl6170);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3032:1: rule__DispatchExpression__Group_1_0_0__2 : rule__DispatchExpression__Group_1_0_0__2__Impl rule__DispatchExpression__Group_1_0_0__3 ;
    public final void rule__DispatchExpression__Group_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3036:1: ( rule__DispatchExpression__Group_1_0_0__2__Impl rule__DispatchExpression__Group_1_0_0__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3037:2: rule__DispatchExpression__Group_1_0_0__2__Impl rule__DispatchExpression__Group_1_0_0__3
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__2__Impl_in_rule__DispatchExpression__Group_1_0_0__26201);
            rule__DispatchExpression__Group_1_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__3_in_rule__DispatchExpression__Group_1_0_0__26204);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3044:1: rule__DispatchExpression__Group_1_0_0__2__Impl : ( '.' ) ;
    public final void rule__DispatchExpression__Group_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3048:1: ( ( '.' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3049:1: ( '.' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3049:1: ( '.' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3050:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getFullStopKeyword_1_0_0_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__DispatchExpression__Group_1_0_0__2__Impl6232); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3063:1: rule__DispatchExpression__Group_1_0_0__3 : rule__DispatchExpression__Group_1_0_0__3__Impl ;
    public final void rule__DispatchExpression__Group_1_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3067:1: ( rule__DispatchExpression__Group_1_0_0__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3068:2: rule__DispatchExpression__Group_1_0_0__3__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__3__Impl_in_rule__DispatchExpression__Group_1_0_0__36263);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3074:1: rule__DispatchExpression__Group_1_0_0__3__Impl : ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) ) ;
    public final void rule__DispatchExpression__Group_1_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3078:1: ( ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3079:1: ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3079:1: ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3080:1: ( rule__DispatchExpression__RefAssignment_1_0_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getRefAssignment_1_0_0_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3081:1: ( rule__DispatchExpression__RefAssignment_1_0_0_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3081:2: rule__DispatchExpression__RefAssignment_1_0_0_3
            {
            pushFollow(FOLLOW_rule__DispatchExpression__RefAssignment_1_0_0_3_in_rule__DispatchExpression__Group_1_0_0__3__Impl6290);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3099:1: rule__DispatchExpression__Group_1_0_0_1__0 : rule__DispatchExpression__Group_1_0_0_1__0__Impl rule__DispatchExpression__Group_1_0_0_1__1 ;
    public final void rule__DispatchExpression__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3103:1: ( rule__DispatchExpression__Group_1_0_0_1__0__Impl rule__DispatchExpression__Group_1_0_0_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3104:2: rule__DispatchExpression__Group_1_0_0_1__0__Impl rule__DispatchExpression__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0__Impl_in_rule__DispatchExpression__Group_1_0_0_1__06328);
            rule__DispatchExpression__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1_in_rule__DispatchExpression__Group_1_0_0_1__06331);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3111:1: rule__DispatchExpression__Group_1_0_0_1__0__Impl : ( '@' ) ;
    public final void rule__DispatchExpression__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3115:1: ( ( '@' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3116:1: ( '@' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3116:1: ( '@' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3117:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getCommercialAtKeyword_1_0_0_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__DispatchExpression__Group_1_0_0_1__0__Impl6359); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3130:1: rule__DispatchExpression__Group_1_0_0_1__1 : rule__DispatchExpression__Group_1_0_0_1__1__Impl ;
    public final void rule__DispatchExpression__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3134:1: ( rule__DispatchExpression__Group_1_0_0_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3135:2: rule__DispatchExpression__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1__Impl_in_rule__DispatchExpression__Group_1_0_0_1__16390);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3141:1: rule__DispatchExpression__Group_1_0_0_1__1__Impl : ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) ) ;
    public final void rule__DispatchExpression__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3145:1: ( ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3146:1: ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3146:1: ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3147:1: ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getType_nameAssignment_1_0_0_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3148:1: ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3148:2: rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1_in_rule__DispatchExpression__Group_1_0_0_1__1__Impl6417);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3162:1: rule__DispatchExpression__Group_1_2__0 : rule__DispatchExpression__Group_1_2__0__Impl rule__DispatchExpression__Group_1_2__1 ;
    public final void rule__DispatchExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3166:1: ( rule__DispatchExpression__Group_1_2__0__Impl rule__DispatchExpression__Group_1_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3167:2: rule__DispatchExpression__Group_1_2__0__Impl rule__DispatchExpression__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__0__Impl_in_rule__DispatchExpression__Group_1_2__06451);
            rule__DispatchExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__1_in_rule__DispatchExpression__Group_1_2__06454);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3174:1: rule__DispatchExpression__Group_1_2__0__Impl : ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) ) ;
    public final void rule__DispatchExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3178:1: ( ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3179:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3179:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3180:1: ( rule__DispatchExpression__ActualAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualAssignment_1_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3181:1: ( rule__DispatchExpression__ActualAssignment_1_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3181:2: rule__DispatchExpression__ActualAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_0_in_rule__DispatchExpression__Group_1_2__0__Impl6481);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3191:1: rule__DispatchExpression__Group_1_2__1 : rule__DispatchExpression__Group_1_2__1__Impl ;
    public final void rule__DispatchExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3195:1: ( rule__DispatchExpression__Group_1_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3196:2: rule__DispatchExpression__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__1__Impl_in_rule__DispatchExpression__Group_1_2__16511);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3202:1: rule__DispatchExpression__Group_1_2__1__Impl : ( ( rule__DispatchExpression__Group_1_2_1__0 )* ) ;
    public final void rule__DispatchExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3206:1: ( ( ( rule__DispatchExpression__Group_1_2_1__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3207:1: ( ( rule__DispatchExpression__Group_1_2_1__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3207:1: ( ( rule__DispatchExpression__Group_1_2_1__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3208:1: ( rule__DispatchExpression__Group_1_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3209:1: ( rule__DispatchExpression__Group_1_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3209:2: rule__DispatchExpression__Group_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__0_in_rule__DispatchExpression__Group_1_2__1__Impl6538);
            	    rule__DispatchExpression__Group_1_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3223:1: rule__DispatchExpression__Group_1_2_1__0 : rule__DispatchExpression__Group_1_2_1__0__Impl rule__DispatchExpression__Group_1_2_1__1 ;
    public final void rule__DispatchExpression__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3227:1: ( rule__DispatchExpression__Group_1_2_1__0__Impl rule__DispatchExpression__Group_1_2_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3228:2: rule__DispatchExpression__Group_1_2_1__0__Impl rule__DispatchExpression__Group_1_2_1__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__0__Impl_in_rule__DispatchExpression__Group_1_2_1__06573);
            rule__DispatchExpression__Group_1_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__1_in_rule__DispatchExpression__Group_1_2_1__06576);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3235:1: rule__DispatchExpression__Group_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__DispatchExpression__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3239:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3240:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3240:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3241:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getCommaKeyword_1_2_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__DispatchExpression__Group_1_2_1__0__Impl6604); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3254:1: rule__DispatchExpression__Group_1_2_1__1 : rule__DispatchExpression__Group_1_2_1__1__Impl ;
    public final void rule__DispatchExpression__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3258:1: ( rule__DispatchExpression__Group_1_2_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3259:2: rule__DispatchExpression__Group_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__1__Impl_in_rule__DispatchExpression__Group_1_2_1__16635);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3265:1: rule__DispatchExpression__Group_1_2_1__1__Impl : ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) ) ;
    public final void rule__DispatchExpression__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3269:1: ( ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3270:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3270:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3271:1: ( rule__DispatchExpression__ActualAssignment_1_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualAssignment_1_2_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3272:1: ( rule__DispatchExpression__ActualAssignment_1_2_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3272:2: rule__DispatchExpression__ActualAssignment_1_2_1_1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_1_1_in_rule__DispatchExpression__Group_1_2_1__1__Impl6662);
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


    // $ANTLR start "rule__StaticDispatchExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3286:1: rule__StaticDispatchExpression__Group__0 : rule__StaticDispatchExpression__Group__0__Impl rule__StaticDispatchExpression__Group__1 ;
    public final void rule__StaticDispatchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3290:1: ( rule__StaticDispatchExpression__Group__0__Impl rule__StaticDispatchExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3291:2: rule__StaticDispatchExpression__Group__0__Impl rule__StaticDispatchExpression__Group__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__0__Impl_in_rule__StaticDispatchExpression__Group__06696);
            rule__StaticDispatchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__1_in_rule__StaticDispatchExpression__Group__06699);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3298:1: rule__StaticDispatchExpression__Group__0__Impl : ( ( rule__StaticDispatchExpression__RefAssignment_0 ) ) ;
    public final void rule__StaticDispatchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3302:1: ( ( ( rule__StaticDispatchExpression__RefAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3303:1: ( ( rule__StaticDispatchExpression__RefAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3303:1: ( ( rule__StaticDispatchExpression__RefAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3304:1: ( rule__StaticDispatchExpression__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getRefAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3305:1: ( rule__StaticDispatchExpression__RefAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3305:2: rule__StaticDispatchExpression__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__RefAssignment_0_in_rule__StaticDispatchExpression__Group__0__Impl6726);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3315:1: rule__StaticDispatchExpression__Group__1 : rule__StaticDispatchExpression__Group__1__Impl rule__StaticDispatchExpression__Group__2 ;
    public final void rule__StaticDispatchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3319:1: ( rule__StaticDispatchExpression__Group__1__Impl rule__StaticDispatchExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3320:2: rule__StaticDispatchExpression__Group__1__Impl rule__StaticDispatchExpression__Group__2
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__1__Impl_in_rule__StaticDispatchExpression__Group__16756);
            rule__StaticDispatchExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__2_in_rule__StaticDispatchExpression__Group__16759);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3327:1: rule__StaticDispatchExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__StaticDispatchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3331:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3332:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3332:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3333:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__StaticDispatchExpression__Group__1__Impl6787); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3346:1: rule__StaticDispatchExpression__Group__2 : rule__StaticDispatchExpression__Group__2__Impl rule__StaticDispatchExpression__Group__3 ;
    public final void rule__StaticDispatchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3350:1: ( rule__StaticDispatchExpression__Group__2__Impl rule__StaticDispatchExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3351:2: rule__StaticDispatchExpression__Group__2__Impl rule__StaticDispatchExpression__Group__3
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__2__Impl_in_rule__StaticDispatchExpression__Group__26818);
            rule__StaticDispatchExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__3_in_rule__StaticDispatchExpression__Group__26821);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3358:1: rule__StaticDispatchExpression__Group__2__Impl : ( ( rule__StaticDispatchExpression__Group_2__0 )? ) ;
    public final void rule__StaticDispatchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3362:1: ( ( ( rule__StaticDispatchExpression__Group_2__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3363:1: ( ( rule__StaticDispatchExpression__Group_2__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3363:1: ( ( rule__StaticDispatchExpression__Group_2__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3364:1: ( rule__StaticDispatchExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3365:1: ( rule__StaticDispatchExpression__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=14 && LA19_0<=16)||LA19_0==18||LA19_0==24||(LA19_0>=27 && LA19_0<=28)||LA19_0==31||LA19_0==35||LA19_0==38||LA19_0==40||(LA19_0>=44 && LA19_0<=45)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3365:2: rule__StaticDispatchExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__0_in_rule__StaticDispatchExpression__Group__2__Impl6848);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3375:1: rule__StaticDispatchExpression__Group__3 : rule__StaticDispatchExpression__Group__3__Impl ;
    public final void rule__StaticDispatchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3379:1: ( rule__StaticDispatchExpression__Group__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3380:2: rule__StaticDispatchExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__3__Impl_in_rule__StaticDispatchExpression__Group__36879);
            rule__StaticDispatchExpression__Group__3__Impl();

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3386:1: rule__StaticDispatchExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__StaticDispatchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3390:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3391:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3391:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3392:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__StaticDispatchExpression__Group__3__Impl6907); if (state.failed) return ;
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


    // $ANTLR start "rule__StaticDispatchExpression__Group_2__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3413:1: rule__StaticDispatchExpression__Group_2__0 : rule__StaticDispatchExpression__Group_2__0__Impl rule__StaticDispatchExpression__Group_2__1 ;
    public final void rule__StaticDispatchExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3417:1: ( rule__StaticDispatchExpression__Group_2__0__Impl rule__StaticDispatchExpression__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3418:2: rule__StaticDispatchExpression__Group_2__0__Impl rule__StaticDispatchExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__0__Impl_in_rule__StaticDispatchExpression__Group_2__06946);
            rule__StaticDispatchExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__1_in_rule__StaticDispatchExpression__Group_2__06949);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3425:1: rule__StaticDispatchExpression__Group_2__0__Impl : ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) ) ;
    public final void rule__StaticDispatchExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3429:1: ( ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3430:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3430:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3431:1: ( rule__StaticDispatchExpression__ActualAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualAssignment_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3432:1: ( rule__StaticDispatchExpression__ActualAssignment_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3432:2: rule__StaticDispatchExpression__ActualAssignment_2_0
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_0_in_rule__StaticDispatchExpression__Group_2__0__Impl6976);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3442:1: rule__StaticDispatchExpression__Group_2__1 : rule__StaticDispatchExpression__Group_2__1__Impl ;
    public final void rule__StaticDispatchExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3446:1: ( rule__StaticDispatchExpression__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3447:2: rule__StaticDispatchExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__1__Impl_in_rule__StaticDispatchExpression__Group_2__17006);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3453:1: rule__StaticDispatchExpression__Group_2__1__Impl : ( ( rule__StaticDispatchExpression__Group_2_1__0 )* ) ;
    public final void rule__StaticDispatchExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3457:1: ( ( ( rule__StaticDispatchExpression__Group_2_1__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3458:1: ( ( rule__StaticDispatchExpression__Group_2_1__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3458:1: ( ( rule__StaticDispatchExpression__Group_2_1__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3459:1: ( rule__StaticDispatchExpression__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getGroup_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3460:1: ( rule__StaticDispatchExpression__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3460:2: rule__StaticDispatchExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__0_in_rule__StaticDispatchExpression__Group_2__1__Impl7033);
            	    rule__StaticDispatchExpression__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3474:1: rule__StaticDispatchExpression__Group_2_1__0 : rule__StaticDispatchExpression__Group_2_1__0__Impl rule__StaticDispatchExpression__Group_2_1__1 ;
    public final void rule__StaticDispatchExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3478:1: ( rule__StaticDispatchExpression__Group_2_1__0__Impl rule__StaticDispatchExpression__Group_2_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3479:2: rule__StaticDispatchExpression__Group_2_1__0__Impl rule__StaticDispatchExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__0__Impl_in_rule__StaticDispatchExpression__Group_2_1__07068);
            rule__StaticDispatchExpression__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__1_in_rule__StaticDispatchExpression__Group_2_1__07071);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3486:1: rule__StaticDispatchExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__StaticDispatchExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3490:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3491:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3491:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3492:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__StaticDispatchExpression__Group_2_1__0__Impl7099); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3505:1: rule__StaticDispatchExpression__Group_2_1__1 : rule__StaticDispatchExpression__Group_2_1__1__Impl ;
    public final void rule__StaticDispatchExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3509:1: ( rule__StaticDispatchExpression__Group_2_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3510:2: rule__StaticDispatchExpression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__1__Impl_in_rule__StaticDispatchExpression__Group_2_1__17130);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3516:1: rule__StaticDispatchExpression__Group_2_1__1__Impl : ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) ) ;
    public final void rule__StaticDispatchExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3520:1: ( ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3521:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3521:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3522:1: ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualAssignment_2_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3523:1: ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3523:2: rule__StaticDispatchExpression__ActualAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_1_1_in_rule__StaticDispatchExpression__Group_2_1__1__Impl7157);
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


    // $ANTLR start "rule__ConditionalExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3537:1: rule__ConditionalExpression__Group__0 : rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 ;
    public final void rule__ConditionalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3541:1: ( rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3542:2: rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__07191);
            rule__ConditionalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__07194);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3549:1: rule__ConditionalExpression__Group__0__Impl : ( 'if' ) ;
    public final void rule__ConditionalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3553:1: ( ( 'if' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3554:1: ( 'if' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3554:1: ( 'if' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3555:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getIfKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ConditionalExpression__Group__0__Impl7222); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3568:1: rule__ConditionalExpression__Group__1 : rule__ConditionalExpression__Group__1__Impl rule__ConditionalExpression__Group__2 ;
    public final void rule__ConditionalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3572:1: ( rule__ConditionalExpression__Group__1__Impl rule__ConditionalExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3573:2: rule__ConditionalExpression__Group__1__Impl rule__ConditionalExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__17253);
            rule__ConditionalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__2_in_rule__ConditionalExpression__Group__17256);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3580:1: rule__ConditionalExpression__Group__1__Impl : ( ( rule__ConditionalExpression__PredAssignment_1 ) ) ;
    public final void rule__ConditionalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3584:1: ( ( ( rule__ConditionalExpression__PredAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3585:1: ( ( rule__ConditionalExpression__PredAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3585:1: ( ( rule__ConditionalExpression__PredAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3586:1: ( rule__ConditionalExpression__PredAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getPredAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3587:1: ( rule__ConditionalExpression__PredAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3587:2: rule__ConditionalExpression__PredAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__PredAssignment_1_in_rule__ConditionalExpression__Group__1__Impl7283);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3597:1: rule__ConditionalExpression__Group__2 : rule__ConditionalExpression__Group__2__Impl rule__ConditionalExpression__Group__3 ;
    public final void rule__ConditionalExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3601:1: ( rule__ConditionalExpression__Group__2__Impl rule__ConditionalExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3602:2: rule__ConditionalExpression__Group__2__Impl rule__ConditionalExpression__Group__3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__2__Impl_in_rule__ConditionalExpression__Group__27313);
            rule__ConditionalExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__3_in_rule__ConditionalExpression__Group__27316);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3609:1: rule__ConditionalExpression__Group__2__Impl : ( 'then' ) ;
    public final void rule__ConditionalExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3613:1: ( ( 'then' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3614:1: ( 'then' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3614:1: ( 'then' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3615:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getThenKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ConditionalExpression__Group__2__Impl7344); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3628:1: rule__ConditionalExpression__Group__3 : rule__ConditionalExpression__Group__3__Impl rule__ConditionalExpression__Group__4 ;
    public final void rule__ConditionalExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3632:1: ( rule__ConditionalExpression__Group__3__Impl rule__ConditionalExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3633:2: rule__ConditionalExpression__Group__3__Impl rule__ConditionalExpression__Group__4
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__3__Impl_in_rule__ConditionalExpression__Group__37375);
            rule__ConditionalExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__4_in_rule__ConditionalExpression__Group__37378);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3640:1: rule__ConditionalExpression__Group__3__Impl : ( ( rule__ConditionalExpression__Then_expAssignment_3 ) ) ;
    public final void rule__ConditionalExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3644:1: ( ( ( rule__ConditionalExpression__Then_expAssignment_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3645:1: ( ( rule__ConditionalExpression__Then_expAssignment_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3645:1: ( ( rule__ConditionalExpression__Then_expAssignment_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3646:1: ( rule__ConditionalExpression__Then_expAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getThen_expAssignment_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3647:1: ( rule__ConditionalExpression__Then_expAssignment_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3647:2: rule__ConditionalExpression__Then_expAssignment_3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Then_expAssignment_3_in_rule__ConditionalExpression__Group__3__Impl7405);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3657:1: rule__ConditionalExpression__Group__4 : rule__ConditionalExpression__Group__4__Impl rule__ConditionalExpression__Group__5 ;
    public final void rule__ConditionalExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3661:1: ( rule__ConditionalExpression__Group__4__Impl rule__ConditionalExpression__Group__5 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3662:2: rule__ConditionalExpression__Group__4__Impl rule__ConditionalExpression__Group__5
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__4__Impl_in_rule__ConditionalExpression__Group__47435);
            rule__ConditionalExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__5_in_rule__ConditionalExpression__Group__47438);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3669:1: rule__ConditionalExpression__Group__4__Impl : ( ( rule__ConditionalExpression__Group_4__0 )? ) ;
    public final void rule__ConditionalExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3673:1: ( ( ( rule__ConditionalExpression__Group_4__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3674:1: ( ( rule__ConditionalExpression__Group_4__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3674:1: ( ( rule__ConditionalExpression__Group_4__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3675:1: ( rule__ConditionalExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getGroup_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3676:1: ( rule__ConditionalExpression__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3676:2: rule__ConditionalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ConditionalExpression__Group_4__0_in_rule__ConditionalExpression__Group__4__Impl7465);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3686:1: rule__ConditionalExpression__Group__5 : rule__ConditionalExpression__Group__5__Impl ;
    public final void rule__ConditionalExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3690:1: ( rule__ConditionalExpression__Group__5__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3691:2: rule__ConditionalExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__5__Impl_in_rule__ConditionalExpression__Group__57496);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3697:1: rule__ConditionalExpression__Group__5__Impl : ( 'fi' ) ;
    public final void rule__ConditionalExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3701:1: ( ( 'fi' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3702:1: ( 'fi' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3702:1: ( 'fi' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3703:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getFiKeyword_5()); 
            }
            match(input,33,FOLLOW_33_in_rule__ConditionalExpression__Group__5__Impl7524); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3728:1: rule__ConditionalExpression__Group_4__0 : rule__ConditionalExpression__Group_4__0__Impl rule__ConditionalExpression__Group_4__1 ;
    public final void rule__ConditionalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3732:1: ( rule__ConditionalExpression__Group_4__0__Impl rule__ConditionalExpression__Group_4__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3733:2: rule__ConditionalExpression__Group_4__0__Impl rule__ConditionalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_4__0__Impl_in_rule__ConditionalExpression__Group_4__07567);
            rule__ConditionalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_4__1_in_rule__ConditionalExpression__Group_4__07570);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3740:1: rule__ConditionalExpression__Group_4__0__Impl : ( ( 'else' ) ) ;
    public final void rule__ConditionalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3744:1: ( ( ( 'else' ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3745:1: ( ( 'else' ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3745:1: ( ( 'else' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3746:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getElseKeyword_4_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3747:1: ( 'else' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3748:2: 'else'
            {
            match(input,34,FOLLOW_34_in_rule__ConditionalExpression__Group_4__0__Impl7599); if (state.failed) return ;

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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3759:1: rule__ConditionalExpression__Group_4__1 : rule__ConditionalExpression__Group_4__1__Impl ;
    public final void rule__ConditionalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3763:1: ( rule__ConditionalExpression__Group_4__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3764:2: rule__ConditionalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_4__1__Impl_in_rule__ConditionalExpression__Group_4__17631);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3770:1: rule__ConditionalExpression__Group_4__1__Impl : ( ( rule__ConditionalExpression__Else_expAssignment_4_1 ) ) ;
    public final void rule__ConditionalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3774:1: ( ( ( rule__ConditionalExpression__Else_expAssignment_4_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3775:1: ( ( rule__ConditionalExpression__Else_expAssignment_4_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3775:1: ( ( rule__ConditionalExpression__Else_expAssignment_4_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3776:1: ( rule__ConditionalExpression__Else_expAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getElse_expAssignment_4_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3777:1: ( rule__ConditionalExpression__Else_expAssignment_4_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3777:2: rule__ConditionalExpression__Else_expAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Else_expAssignment_4_1_in_rule__ConditionalExpression__Group_4__1__Impl7658);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3791:1: rule__LoopExpression__Group__0 : rule__LoopExpression__Group__0__Impl rule__LoopExpression__Group__1 ;
    public final void rule__LoopExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3795:1: ( rule__LoopExpression__Group__0__Impl rule__LoopExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3796:2: rule__LoopExpression__Group__0__Impl rule__LoopExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__0__Impl_in_rule__LoopExpression__Group__07692);
            rule__LoopExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__1_in_rule__LoopExpression__Group__07695);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3803:1: rule__LoopExpression__Group__0__Impl : ( 'while' ) ;
    public final void rule__LoopExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3807:1: ( ( 'while' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3808:1: ( 'while' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3808:1: ( 'while' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3809:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getWhileKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__LoopExpression__Group__0__Impl7723); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3822:1: rule__LoopExpression__Group__1 : rule__LoopExpression__Group__1__Impl rule__LoopExpression__Group__2 ;
    public final void rule__LoopExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3826:1: ( rule__LoopExpression__Group__1__Impl rule__LoopExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3827:2: rule__LoopExpression__Group__1__Impl rule__LoopExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__1__Impl_in_rule__LoopExpression__Group__17754);
            rule__LoopExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__2_in_rule__LoopExpression__Group__17757);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3834:1: rule__LoopExpression__Group__1__Impl : ( ( rule__LoopExpression__PredAssignment_1 ) ) ;
    public final void rule__LoopExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3838:1: ( ( ( rule__LoopExpression__PredAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3839:1: ( ( rule__LoopExpression__PredAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3839:1: ( ( rule__LoopExpression__PredAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3840:1: ( rule__LoopExpression__PredAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getPredAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3841:1: ( rule__LoopExpression__PredAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3841:2: rule__LoopExpression__PredAssignment_1
            {
            pushFollow(FOLLOW_rule__LoopExpression__PredAssignment_1_in_rule__LoopExpression__Group__1__Impl7784);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3851:1: rule__LoopExpression__Group__2 : rule__LoopExpression__Group__2__Impl rule__LoopExpression__Group__3 ;
    public final void rule__LoopExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3855:1: ( rule__LoopExpression__Group__2__Impl rule__LoopExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3856:2: rule__LoopExpression__Group__2__Impl rule__LoopExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__2__Impl_in_rule__LoopExpression__Group__27814);
            rule__LoopExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__3_in_rule__LoopExpression__Group__27817);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3863:1: rule__LoopExpression__Group__2__Impl : ( 'loop' ) ;
    public final void rule__LoopExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3867:1: ( ( 'loop' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3868:1: ( 'loop' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3868:1: ( 'loop' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3869:1: 'loop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getLoopKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__LoopExpression__Group__2__Impl7845); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3882:1: rule__LoopExpression__Group__3 : rule__LoopExpression__Group__3__Impl rule__LoopExpression__Group__4 ;
    public final void rule__LoopExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3886:1: ( rule__LoopExpression__Group__3__Impl rule__LoopExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3887:2: rule__LoopExpression__Group__3__Impl rule__LoopExpression__Group__4
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__3__Impl_in_rule__LoopExpression__Group__37876);
            rule__LoopExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__4_in_rule__LoopExpression__Group__37879);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3894:1: rule__LoopExpression__Group__3__Impl : ( ( rule__LoopExpression__BodyAssignment_3 ) ) ;
    public final void rule__LoopExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3898:1: ( ( ( rule__LoopExpression__BodyAssignment_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3899:1: ( ( rule__LoopExpression__BodyAssignment_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3899:1: ( ( rule__LoopExpression__BodyAssignment_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3900:1: ( rule__LoopExpression__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getBodyAssignment_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3901:1: ( rule__LoopExpression__BodyAssignment_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3901:2: rule__LoopExpression__BodyAssignment_3
            {
            pushFollow(FOLLOW_rule__LoopExpression__BodyAssignment_3_in_rule__LoopExpression__Group__3__Impl7906);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3911:1: rule__LoopExpression__Group__4 : rule__LoopExpression__Group__4__Impl ;
    public final void rule__LoopExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3915:1: ( rule__LoopExpression__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3916:2: rule__LoopExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__4__Impl_in_rule__LoopExpression__Group__47936);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3922:1: rule__LoopExpression__Group__4__Impl : ( 'pool' ) ;
    public final void rule__LoopExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3926:1: ( ( 'pool' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3927:1: ( 'pool' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3927:1: ( 'pool' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3928:1: 'pool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getPoolKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__LoopExpression__Group__4__Impl7964); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3951:1: rule__BlockExpression__Group__0 : rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 ;
    public final void rule__BlockExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3955:1: ( rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3956:2: rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__0__Impl_in_rule__BlockExpression__Group__08005);
            rule__BlockExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group__1_in_rule__BlockExpression__Group__08008);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3963:1: rule__BlockExpression__Group__0__Impl : ( () ) ;
    public final void rule__BlockExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3967:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3968:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3968:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3969:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3970:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3972:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3982:1: rule__BlockExpression__Group__1 : rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 ;
    public final void rule__BlockExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3986:1: ( rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3987:2: rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__1__Impl_in_rule__BlockExpression__Group__18066);
            rule__BlockExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group__2_in_rule__BlockExpression__Group__18069);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3994:1: rule__BlockExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BlockExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3998:1: ( ( '{' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3999:1: ( '{' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3999:1: ( '{' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4000:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__BlockExpression__Group__1__Impl8097); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4013:1: rule__BlockExpression__Group__2 : rule__BlockExpression__Group__2__Impl rule__BlockExpression__Group__3 ;
    public final void rule__BlockExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4017:1: ( rule__BlockExpression__Group__2__Impl rule__BlockExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4018:2: rule__BlockExpression__Group__2__Impl rule__BlockExpression__Group__3
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__2__Impl_in_rule__BlockExpression__Group__28128);
            rule__BlockExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group__3_in_rule__BlockExpression__Group__28131);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4025:1: rule__BlockExpression__Group__2__Impl : ( ( rule__BlockExpression__Group_2__0 )* ) ;
    public final void rule__BlockExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4029:1: ( ( ( rule__BlockExpression__Group_2__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4030:1: ( ( rule__BlockExpression__Group_2__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4030:1: ( ( rule__BlockExpression__Group_2__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4031:1: ( rule__BlockExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4032:1: ( rule__BlockExpression__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||(LA22_0>=14 && LA22_0<=16)||LA22_0==18||LA22_0==24||(LA22_0>=27 && LA22_0<=28)||LA22_0==31||LA22_0==35||LA22_0==38||LA22_0==40||(LA22_0>=44 && LA22_0<=45)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4032:2: rule__BlockExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BlockExpression__Group_2__0_in_rule__BlockExpression__Group__2__Impl8158);
            	    rule__BlockExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4042:1: rule__BlockExpression__Group__3 : rule__BlockExpression__Group__3__Impl ;
    public final void rule__BlockExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4046:1: ( rule__BlockExpression__Group__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4047:2: rule__BlockExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__3__Impl_in_rule__BlockExpression__Group__38189);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4053:1: rule__BlockExpression__Group__3__Impl : ( '}' ) ;
    public final void rule__BlockExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4057:1: ( ( '}' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4058:1: ( '}' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4058:1: ( '}' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4059:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__BlockExpression__Group__3__Impl8217); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4080:1: rule__BlockExpression__Group_2__0 : rule__BlockExpression__Group_2__0__Impl rule__BlockExpression__Group_2__1 ;
    public final void rule__BlockExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4084:1: ( rule__BlockExpression__Group_2__0__Impl rule__BlockExpression__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4085:2: rule__BlockExpression__Group_2__0__Impl rule__BlockExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group_2__0__Impl_in_rule__BlockExpression__Group_2__08256);
            rule__BlockExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group_2__1_in_rule__BlockExpression__Group_2__08259);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4092:1: rule__BlockExpression__Group_2__0__Impl : ( ( rule__BlockExpression__BodyAssignment_2_0 ) ) ;
    public final void rule__BlockExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4096:1: ( ( ( rule__BlockExpression__BodyAssignment_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4097:1: ( ( rule__BlockExpression__BodyAssignment_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4097:1: ( ( rule__BlockExpression__BodyAssignment_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4098:1: ( rule__BlockExpression__BodyAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBodyAssignment_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4099:1: ( rule__BlockExpression__BodyAssignment_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4099:2: rule__BlockExpression__BodyAssignment_2_0
            {
            pushFollow(FOLLOW_rule__BlockExpression__BodyAssignment_2_0_in_rule__BlockExpression__Group_2__0__Impl8286);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4109:1: rule__BlockExpression__Group_2__1 : rule__BlockExpression__Group_2__1__Impl ;
    public final void rule__BlockExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4113:1: ( rule__BlockExpression__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4114:2: rule__BlockExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group_2__1__Impl_in_rule__BlockExpression__Group_2__18316);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4120:1: rule__BlockExpression__Group_2__1__Impl : ( ';' ) ;
    public final void rule__BlockExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4124:1: ( ( ';' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4125:1: ( ';' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4125:1: ( ';' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4126:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__BlockExpression__Group_2__1__Impl8344); if (state.failed) return ;
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


    // $ANTLR start "rule__LetExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4143:1: rule__LetExpression__Group__0 : rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 ;
    public final void rule__LetExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4147:1: ( rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4148:2: rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__0__Impl_in_rule__LetExpression__Group__08379);
            rule__LetExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__1_in_rule__LetExpression__Group__08382);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4155:1: rule__LetExpression__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4159:1: ( ( 'let' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4160:1: ( 'let' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4160:1: ( 'let' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4161:1: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__LetExpression__Group__0__Impl8410); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4174:1: rule__LetExpression__Group__1 : rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 ;
    public final void rule__LetExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4178:1: ( rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4179:2: rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__1__Impl_in_rule__LetExpression__Group__18441);
            rule__LetExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__2_in_rule__LetExpression__Group__18444);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4186:1: rule__LetExpression__Group__1__Impl : ( ( rule__LetExpression__DeclarationAssignment_1 ) ) ;
    public final void rule__LetExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4190:1: ( ( ( rule__LetExpression__DeclarationAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4191:1: ( ( rule__LetExpression__DeclarationAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4191:1: ( ( rule__LetExpression__DeclarationAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4192:1: ( rule__LetExpression__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4193:1: ( rule__LetExpression__DeclarationAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4193:2: rule__LetExpression__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_rule__LetExpression__DeclarationAssignment_1_in_rule__LetExpression__Group__1__Impl8471);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4203:1: rule__LetExpression__Group__2 : rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3 ;
    public final void rule__LetExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4207:1: ( rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4208:2: rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__2__Impl_in_rule__LetExpression__Group__28501);
            rule__LetExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__3_in_rule__LetExpression__Group__28504);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4215:1: rule__LetExpression__Group__2__Impl : ( ( rule__LetExpression__Group_2__0 )* ) ;
    public final void rule__LetExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4219:1: ( ( ( rule__LetExpression__Group_2__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4220:1: ( ( rule__LetExpression__Group_2__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4220:1: ( ( rule__LetExpression__Group_2__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4221:1: ( rule__LetExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4222:1: ( rule__LetExpression__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4222:2: rule__LetExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__LetExpression__Group_2__0_in_rule__LetExpression__Group__2__Impl8531);
            	    rule__LetExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4232:1: rule__LetExpression__Group__3 : rule__LetExpression__Group__3__Impl rule__LetExpression__Group__4 ;
    public final void rule__LetExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4236:1: ( rule__LetExpression__Group__3__Impl rule__LetExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4237:2: rule__LetExpression__Group__3__Impl rule__LetExpression__Group__4
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__3__Impl_in_rule__LetExpression__Group__38562);
            rule__LetExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__4_in_rule__LetExpression__Group__38565);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4244:1: rule__LetExpression__Group__3__Impl : ( 'in' ) ;
    public final void rule__LetExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4248:1: ( ( 'in' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4249:1: ( 'in' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4249:1: ( 'in' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4250:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getInKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__LetExpression__Group__3__Impl8593); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4263:1: rule__LetExpression__Group__4 : rule__LetExpression__Group__4__Impl ;
    public final void rule__LetExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4267:1: ( rule__LetExpression__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4268:2: rule__LetExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__4__Impl_in_rule__LetExpression__Group__48624);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4274:1: rule__LetExpression__Group__4__Impl : ( ( rule__LetExpression__BodyAssignment_4 ) ) ;
    public final void rule__LetExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4278:1: ( ( ( rule__LetExpression__BodyAssignment_4 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4279:1: ( ( rule__LetExpression__BodyAssignment_4 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4279:1: ( ( rule__LetExpression__BodyAssignment_4 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4280:1: ( rule__LetExpression__BodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getBodyAssignment_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4281:1: ( rule__LetExpression__BodyAssignment_4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4281:2: rule__LetExpression__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__LetExpression__BodyAssignment_4_in_rule__LetExpression__Group__4__Impl8651);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4301:1: rule__LetExpression__Group_2__0 : rule__LetExpression__Group_2__0__Impl rule__LetExpression__Group_2__1 ;
    public final void rule__LetExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4305:1: ( rule__LetExpression__Group_2__0__Impl rule__LetExpression__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4306:2: rule__LetExpression__Group_2__0__Impl rule__LetExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__0__Impl_in_rule__LetExpression__Group_2__08691);
            rule__LetExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group_2__1_in_rule__LetExpression__Group_2__08694);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4313:1: rule__LetExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LetExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4317:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4318:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4318:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4319:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getCommaKeyword_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__LetExpression__Group_2__0__Impl8722); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4332:1: rule__LetExpression__Group_2__1 : rule__LetExpression__Group_2__1__Impl ;
    public final void rule__LetExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4336:1: ( rule__LetExpression__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4337:2: rule__LetExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__1__Impl_in_rule__LetExpression__Group_2__18753);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4343:1: rule__LetExpression__Group_2__1__Impl : ( ( rule__LetExpression__DeclarationAssignment_2_1 ) ) ;
    public final void rule__LetExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4347:1: ( ( ( rule__LetExpression__DeclarationAssignment_2_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4348:1: ( ( rule__LetExpression__DeclarationAssignment_2_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4348:1: ( ( rule__LetExpression__DeclarationAssignment_2_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4349:1: ( rule__LetExpression__DeclarationAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4350:1: ( rule__LetExpression__DeclarationAssignment_2_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4350:2: rule__LetExpression__DeclarationAssignment_2_1
            {
            pushFollow(FOLLOW_rule__LetExpression__DeclarationAssignment_2_1_in_rule__LetExpression__Group_2__1__Impl8780);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4364:1: rule__LetDeclaration__Group__0 : rule__LetDeclaration__Group__0__Impl rule__LetDeclaration__Group__1 ;
    public final void rule__LetDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4368:1: ( rule__LetDeclaration__Group__0__Impl rule__LetDeclaration__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4369:2: rule__LetDeclaration__Group__0__Impl rule__LetDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__0__Impl_in_rule__LetDeclaration__Group__08814);
            rule__LetDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group__1_in_rule__LetDeclaration__Group__08817);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4376:1: rule__LetDeclaration__Group__0__Impl : ( ( rule__LetDeclaration__NameAssignment_0 ) ) ;
    public final void rule__LetDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4380:1: ( ( ( rule__LetDeclaration__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4381:1: ( ( rule__LetDeclaration__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4381:1: ( ( rule__LetDeclaration__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4382:1: ( rule__LetDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4383:1: ( rule__LetDeclaration__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4383:2: rule__LetDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LetDeclaration__NameAssignment_0_in_rule__LetDeclaration__Group__0__Impl8844);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4393:1: rule__LetDeclaration__Group__1 : rule__LetDeclaration__Group__1__Impl rule__LetDeclaration__Group__2 ;
    public final void rule__LetDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4397:1: ( rule__LetDeclaration__Group__1__Impl rule__LetDeclaration__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4398:2: rule__LetDeclaration__Group__1__Impl rule__LetDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__1__Impl_in_rule__LetDeclaration__Group__18874);
            rule__LetDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group__2_in_rule__LetDeclaration__Group__18877);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4405:1: rule__LetDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__LetDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4409:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4410:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4410:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4411:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__LetDeclaration__Group__1__Impl8905); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4424:1: rule__LetDeclaration__Group__2 : rule__LetDeclaration__Group__2__Impl rule__LetDeclaration__Group__3 ;
    public final void rule__LetDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4428:1: ( rule__LetDeclaration__Group__2__Impl rule__LetDeclaration__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4429:2: rule__LetDeclaration__Group__2__Impl rule__LetDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__2__Impl_in_rule__LetDeclaration__Group__28936);
            rule__LetDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group__3_in_rule__LetDeclaration__Group__28939);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4436:1: rule__LetDeclaration__Group__2__Impl : ( ( rule__LetDeclaration__Type_declAssignment_2 ) ) ;
    public final void rule__LetDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4440:1: ( ( ( rule__LetDeclaration__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4441:1: ( ( rule__LetDeclaration__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4441:1: ( ( rule__LetDeclaration__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4442:1: ( rule__LetDeclaration__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4443:1: ( rule__LetDeclaration__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4443:2: rule__LetDeclaration__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Type_declAssignment_2_in_rule__LetDeclaration__Group__2__Impl8966);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4453:1: rule__LetDeclaration__Group__3 : rule__LetDeclaration__Group__3__Impl ;
    public final void rule__LetDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4457:1: ( rule__LetDeclaration__Group__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4458:2: rule__LetDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__3__Impl_in_rule__LetDeclaration__Group__38996);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4464:1: rule__LetDeclaration__Group__3__Impl : ( ( rule__LetDeclaration__Group_3__0 )? ) ;
    public final void rule__LetDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4468:1: ( ( ( rule__LetDeclaration__Group_3__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4469:1: ( ( rule__LetDeclaration__Group_3__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4469:1: ( ( rule__LetDeclaration__Group_3__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4470:1: ( rule__LetDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getGroup_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4471:1: ( rule__LetDeclaration__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4471:2: rule__LetDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LetDeclaration__Group_3__0_in_rule__LetDeclaration__Group__3__Impl9023);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4489:1: rule__LetDeclaration__Group_3__0 : rule__LetDeclaration__Group_3__0__Impl rule__LetDeclaration__Group_3__1 ;
    public final void rule__LetDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4493:1: ( rule__LetDeclaration__Group_3__0__Impl rule__LetDeclaration__Group_3__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4494:2: rule__LetDeclaration__Group_3__0__Impl rule__LetDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group_3__0__Impl_in_rule__LetDeclaration__Group_3__09062);
            rule__LetDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group_3__1_in_rule__LetDeclaration__Group_3__09065);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4501:1: rule__LetDeclaration__Group_3__0__Impl : ( '<-' ) ;
    public final void rule__LetDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4505:1: ( ( '<-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4506:1: ( '<-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4506:1: ( '<-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4507:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getLessThanSignHyphenMinusKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__LetDeclaration__Group_3__0__Impl9093); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4520:1: rule__LetDeclaration__Group_3__1 : rule__LetDeclaration__Group_3__1__Impl ;
    public final void rule__LetDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4524:1: ( rule__LetDeclaration__Group_3__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4525:2: rule__LetDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group_3__1__Impl_in_rule__LetDeclaration__Group_3__19124);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4531:1: rule__LetDeclaration__Group_3__1__Impl : ( ( rule__LetDeclaration__InitAssignment_3_1 ) ) ;
    public final void rule__LetDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4535:1: ( ( ( rule__LetDeclaration__InitAssignment_3_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4536:1: ( ( rule__LetDeclaration__InitAssignment_3_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4536:1: ( ( rule__LetDeclaration__InitAssignment_3_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4537:1: ( rule__LetDeclaration__InitAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getInitAssignment_3_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4538:1: ( rule__LetDeclaration__InitAssignment_3_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4538:2: rule__LetDeclaration__InitAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LetDeclaration__InitAssignment_3_1_in_rule__LetDeclaration__Group_3__1__Impl9151);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4552:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4556:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4557:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__09185);
            rule__CaseExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__09188);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4564:1: rule__CaseExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4568:1: ( ( 'case' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4569:1: ( 'case' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4569:1: ( 'case' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4570:1: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__CaseExpression__Group__0__Impl9216); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4583:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4587:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4588:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__19247);
            rule__CaseExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__19250);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4595:1: rule__CaseExpression__Group__1__Impl : ( ( rule__CaseExpression__ExprAssignment_1 ) ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4599:1: ( ( ( rule__CaseExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4600:1: ( ( rule__CaseExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4600:1: ( ( rule__CaseExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4601:1: ( rule__CaseExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4602:1: ( rule__CaseExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4602:2: rule__CaseExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__CaseExpression__ExprAssignment_1_in_rule__CaseExpression__Group__1__Impl9277);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4612:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4616:1: ( rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4617:2: rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__29307);
            rule__CaseExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__29310);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4624:1: rule__CaseExpression__Group__2__Impl : ( 'of' ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4628:1: ( ( 'of' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4629:1: ( 'of' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4629:1: ( 'of' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4630:1: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getOfKeyword_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__CaseExpression__Group__2__Impl9338); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4643:1: rule__CaseExpression__Group__3 : rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4 ;
    public final void rule__CaseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4647:1: ( rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4648:2: rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__39369);
            rule__CaseExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__4_in_rule__CaseExpression__Group__39372);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4655:1: rule__CaseExpression__Group__3__Impl : ( ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* ) ) ;
    public final void rule__CaseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4659:1: ( ( ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4660:1: ( ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4660:1: ( ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4661:1: ( ( rule__CaseExpression__Group_3__0 ) ) ( ( rule__CaseExpression__Group_3__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4661:1: ( ( rule__CaseExpression__Group_3__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4662:1: ( rule__CaseExpression__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4663:1: ( rule__CaseExpression__Group_3__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4663:2: rule__CaseExpression__Group_3__0
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group_3__0_in_rule__CaseExpression__Group__3__Impl9401);
            rule__CaseExpression__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getGroup_3()); 
            }

            }

            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4666:1: ( ( rule__CaseExpression__Group_3__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4667:1: ( rule__CaseExpression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4668:1: ( rule__CaseExpression__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4668:2: rule__CaseExpression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__CaseExpression__Group_3__0_in_rule__CaseExpression__Group__3__Impl9413);
            	    rule__CaseExpression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4679:1: rule__CaseExpression__Group__4 : rule__CaseExpression__Group__4__Impl ;
    public final void rule__CaseExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4683:1: ( rule__CaseExpression__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4684:2: rule__CaseExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__4__Impl_in_rule__CaseExpression__Group__49446);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4690:1: rule__CaseExpression__Group__4__Impl : ( 'esac' ) ;
    public final void rule__CaseExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4694:1: ( ( 'esac' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4695:1: ( 'esac' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4695:1: ( 'esac' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4696:1: 'esac'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getEsacKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__CaseExpression__Group__4__Impl9474); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4719:1: rule__CaseExpression__Group_3__0 : rule__CaseExpression__Group_3__0__Impl rule__CaseExpression__Group_3__1 ;
    public final void rule__CaseExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4723:1: ( rule__CaseExpression__Group_3__0__Impl rule__CaseExpression__Group_3__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4724:2: rule__CaseExpression__Group_3__0__Impl rule__CaseExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group_3__0__Impl_in_rule__CaseExpression__Group_3__09515);
            rule__CaseExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group_3__1_in_rule__CaseExpression__Group_3__09518);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4731:1: rule__CaseExpression__Group_3__0__Impl : ( ( rule__CaseExpression__CaseAssignment_3_0 ) ) ;
    public final void rule__CaseExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4735:1: ( ( ( rule__CaseExpression__CaseAssignment_3_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4736:1: ( ( rule__CaseExpression__CaseAssignment_3_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4736:1: ( ( rule__CaseExpression__CaseAssignment_3_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4737:1: ( rule__CaseExpression__CaseAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4738:1: ( rule__CaseExpression__CaseAssignment_3_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4738:2: rule__CaseExpression__CaseAssignment_3_0
            {
            pushFollow(FOLLOW_rule__CaseExpression__CaseAssignment_3_0_in_rule__CaseExpression__Group_3__0__Impl9545);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4748:1: rule__CaseExpression__Group_3__1 : rule__CaseExpression__Group_3__1__Impl ;
    public final void rule__CaseExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4752:1: ( rule__CaseExpression__Group_3__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4753:2: rule__CaseExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group_3__1__Impl_in_rule__CaseExpression__Group_3__19575);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4759:1: rule__CaseExpression__Group_3__1__Impl : ( ';' ) ;
    public final void rule__CaseExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4763:1: ( ( ';' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4764:1: ( ';' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4764:1: ( ';' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4765:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__CaseExpression__Group_3__1__Impl9603); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4782:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4786:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4787:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__09638);
            rule__Case__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__1_in_rule__Case__Group__09641);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4794:1: rule__Case__Group__0__Impl : ( ( rule__Case__NameAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4798:1: ( ( ( rule__Case__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4799:1: ( ( rule__Case__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4799:1: ( ( rule__Case__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4800:1: ( rule__Case__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4801:1: ( rule__Case__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4801:2: rule__Case__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl9668);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4811:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4815:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4816:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__19698);
            rule__Case__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__2_in_rule__Case__Group__19701);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4823:1: rule__Case__Group__1__Impl : ( ':' ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4827:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4828:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4828:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4829:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Case__Group__1__Impl9729); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4842:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4846:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4847:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__29760);
            rule__Case__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__3_in_rule__Case__Group__29763);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4854:1: rule__Case__Group__2__Impl : ( ( rule__Case__Type_declAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4858:1: ( ( ( rule__Case__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4859:1: ( ( rule__Case__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4859:1: ( ( rule__Case__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4860:1: ( rule__Case__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4861:1: ( rule__Case__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4861:2: rule__Case__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__Case__Type_declAssignment_2_in_rule__Case__Group__2__Impl9790);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4871:1: rule__Case__Group__3 : rule__Case__Group__3__Impl rule__Case__Group__4 ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4875:1: ( rule__Case__Group__3__Impl rule__Case__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4876:2: rule__Case__Group__3__Impl rule__Case__Group__4
            {
            pushFollow(FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__39820);
            rule__Case__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__4_in_rule__Case__Group__39823);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4883:1: rule__Case__Group__3__Impl : ( '=>' ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4887:1: ( ( '=>' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4888:1: ( '=>' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4888:1: ( '=>' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4889:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            }
            match(input,43,FOLLOW_43_in_rule__Case__Group__3__Impl9851); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4902:1: rule__Case__Group__4 : rule__Case__Group__4__Impl ;
    public final void rule__Case__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4906:1: ( rule__Case__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4907:2: rule__Case__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__49882);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4913:1: rule__Case__Group__4__Impl : ( ( rule__Case__ExprAssignment_4 ) ) ;
    public final void rule__Case__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4917:1: ( ( ( rule__Case__ExprAssignment_4 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4918:1: ( ( rule__Case__ExprAssignment_4 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4918:1: ( ( rule__Case__ExprAssignment_4 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4919:1: ( rule__Case__ExprAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getExprAssignment_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4920:1: ( rule__Case__ExprAssignment_4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4920:2: rule__Case__ExprAssignment_4
            {
            pushFollow(FOLLOW_rule__Case__ExprAssignment_4_in_rule__Case__Group__4__Impl9909);
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


    // $ANTLR start "rule__NewExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4940:1: rule__NewExpression__Group__0 : rule__NewExpression__Group__0__Impl rule__NewExpression__Group__1 ;
    public final void rule__NewExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4944:1: ( rule__NewExpression__Group__0__Impl rule__NewExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4945:2: rule__NewExpression__Group__0__Impl rule__NewExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NewExpression__Group__0__Impl_in_rule__NewExpression__Group__09949);
            rule__NewExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewExpression__Group__1_in_rule__NewExpression__Group__09952);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4952:1: rule__NewExpression__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4956:1: ( ( 'new' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4957:1: ( 'new' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4957:1: ( 'new' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4958:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getNewKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__NewExpression__Group__0__Impl9980); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4971:1: rule__NewExpression__Group__1 : rule__NewExpression__Group__1__Impl ;
    public final void rule__NewExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4975:1: ( rule__NewExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4976:2: rule__NewExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NewExpression__Group__1__Impl_in_rule__NewExpression__Group__110011);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4982:1: rule__NewExpression__Group__1__Impl : ( ( rule__NewExpression__Type_nameAssignment_1 ) ) ;
    public final void rule__NewExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4986:1: ( ( ( rule__NewExpression__Type_nameAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4987:1: ( ( rule__NewExpression__Type_nameAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4987:1: ( ( rule__NewExpression__Type_nameAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4988:1: ( rule__NewExpression__Type_nameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getType_nameAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4989:1: ( rule__NewExpression__Type_nameAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4989:2: rule__NewExpression__Type_nameAssignment_1
            {
            pushFollow(FOLLOW_rule__NewExpression__Type_nameAssignment_1_in_rule__NewExpression__Group__1__Impl10038);
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


    // $ANTLR start "rule__IsvoidExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5003:1: rule__IsvoidExpression__Group__0 : rule__IsvoidExpression__Group__0__Impl rule__IsvoidExpression__Group__1 ;
    public final void rule__IsvoidExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5007:1: ( rule__IsvoidExpression__Group__0__Impl rule__IsvoidExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5008:2: rule__IsvoidExpression__Group__0__Impl rule__IsvoidExpression__Group__1
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__0__Impl_in_rule__IsvoidExpression__Group__010072);
            rule__IsvoidExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__1_in_rule__IsvoidExpression__Group__010075);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5015:1: rule__IsvoidExpression__Group__0__Impl : ( 'isvoid' ) ;
    public final void rule__IsvoidExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5019:1: ( ( 'isvoid' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5020:1: ( 'isvoid' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5020:1: ( 'isvoid' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5021:1: 'isvoid'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getIsvoidKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__IsvoidExpression__Group__0__Impl10103); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5034:1: rule__IsvoidExpression__Group__1 : rule__IsvoidExpression__Group__1__Impl ;
    public final void rule__IsvoidExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5038:1: ( rule__IsvoidExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5039:2: rule__IsvoidExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__1__Impl_in_rule__IsvoidExpression__Group__110134);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5045:1: rule__IsvoidExpression__Group__1__Impl : ( ( rule__IsvoidExpression__ExprAssignment_1 ) ) ;
    public final void rule__IsvoidExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5049:1: ( ( ( rule__IsvoidExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5050:1: ( ( rule__IsvoidExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5050:1: ( ( rule__IsvoidExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5051:1: ( rule__IsvoidExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5052:1: ( rule__IsvoidExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5052:2: rule__IsvoidExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__ExprAssignment_1_in_rule__IsvoidExpression__Group__1__Impl10161);
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


    // $ANTLR start "rule__CompareExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5066:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5070:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5071:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010195);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010198);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5078:1: rule__CompareExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5082:1: ( ( ruleAdditionExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5083:1: ( ruleAdditionExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5083:1: ( ruleAdditionExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5084:1: ruleAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_rule__CompareExpression__Group__0__Impl10225);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5095:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5099:1: ( rule__CompareExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5100:2: rule__CompareExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110254);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5106:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__Group_1__0 )? ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5110:1: ( ( ( rule__CompareExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5111:1: ( ( rule__CompareExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5111:1: ( ( rule__CompareExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5112:1: ( rule__CompareExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5113:1: ( rule__CompareExpression__Group_1__0 )?
            int alt26=2;
            switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA26_1 = input.LA(2);

                    if ( (synpred41_InternalCool()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (synpred41_InternalCool()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (synpred41_InternalCool()) ) {
                        alt26=1;
                    }
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5113:2: rule__CompareExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl10281);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5127:1: rule__CompareExpression__Group_1__0 : rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 ;
    public final void rule__CompareExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5131:1: ( rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5132:2: rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__010316);
            rule__CompareExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__010319);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5139:1: rule__CompareExpression__Group_1__0__Impl : ( ( rule__CompareExpression__Group_1_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5143:1: ( ( ( rule__CompareExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5144:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5144:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5145:1: ( rule__CompareExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5146:1: ( rule__CompareExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5146:2: rule__CompareExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl10346);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5156:1: rule__CompareExpression__Group_1__1 : rule__CompareExpression__Group_1__1__Impl ;
    public final void rule__CompareExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5160:1: ( rule__CompareExpression__Group_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5161:2: rule__CompareExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__110376);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5167:1: rule__CompareExpression__Group_1__1__Impl : ( ( rule__CompareExpression__RightAssignment_1_1 ) ) ;
    public final void rule__CompareExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5171:1: ( ( ( rule__CompareExpression__RightAssignment_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5172:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5172:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5173:1: ( rule__CompareExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5174:1: ( rule__CompareExpression__RightAssignment_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5174:2: rule__CompareExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl10403);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5188:1: rule__CompareExpression__Group_1_0__0 : rule__CompareExpression__Group_1_0__0__Impl ;
    public final void rule__CompareExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5192:1: ( rule__CompareExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5193:2: rule__CompareExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__010437);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5199:1: rule__CompareExpression__Group_1_0__0__Impl : ( ( rule__CompareExpression__Group_1_0_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5203:1: ( ( ( rule__CompareExpression__Group_1_0_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5204:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5204:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5205:1: ( rule__CompareExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5206:1: ( rule__CompareExpression__Group_1_0_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5206:2: rule__CompareExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl10464);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5218:1: rule__CompareExpression__Group_1_0_0__0 : rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 ;
    public final void rule__CompareExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5222:1: ( rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5223:2: rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__010496);
            rule__CompareExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__010499);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5230:1: rule__CompareExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CompareExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5234:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5235:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5235:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5236:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5237:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5239:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5249:1: rule__CompareExpression__Group_1_0_0__1 : rule__CompareExpression__Group_1_0_0__1__Impl ;
    public final void rule__CompareExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5253:1: ( rule__CompareExpression__Group_1_0_0__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5254:2: rule__CompareExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__110557);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5260:1: rule__CompareExpression__Group_1_0_0__1__Impl : ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__CompareExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5264:1: ( ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5265:1: ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5265:1: ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5266:1: ( rule__CompareExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5267:1: ( rule__CompareExpression__OpAssignment_1_0_0_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5267:2: rule__CompareExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OpAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl10584);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5281:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5285:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5286:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__010618);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__010621);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5293:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5297:1: ( ( ruleMultiplicationExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5298:1: ( ruleMultiplicationExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5298:1: ( ruleMultiplicationExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5299:1: ruleMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl10648);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5310:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5314:1: ( rule__AdditionExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5315:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__110677);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5321:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )? ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5325:1: ( ( ( rule__AdditionExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5326:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5326:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5327:1: ( rule__AdditionExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5328:1: ( rule__AdditionExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred42_InternalCool()) ) {
                    alt27=1;
                }
            }
            else if ( (LA27_0==47) ) {
                int LA27_2 = input.LA(2);

                if ( (synpred42_InternalCool()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5328:2: rule__AdditionExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl10704);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5342:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5346:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5347:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__010739);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__010742);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5354:1: rule__AdditionExpression__Group_1__0__Impl : ( ( rule__AdditionExpression__Group_1_0__0 ) ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5358:1: ( ( ( rule__AdditionExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5359:1: ( ( rule__AdditionExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5359:1: ( ( rule__AdditionExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5360:1: ( rule__AdditionExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5361:1: ( rule__AdditionExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5361:2: rule__AdditionExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0__0_in_rule__AdditionExpression__Group_1__0__Impl10769);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5371:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5375:1: ( rule__AdditionExpression__Group_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5376:2: rule__AdditionExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__110799);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5382:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5386:1: ( ( ( rule__AdditionExpression__RightAssignment_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5387:1: ( ( rule__AdditionExpression__RightAssignment_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5387:1: ( ( rule__AdditionExpression__RightAssignment_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5388:1: ( rule__AdditionExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5389:1: ( rule__AdditionExpression__RightAssignment_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5389:2: rule__AdditionExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__RightAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl10826);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5403:1: rule__AdditionExpression__Group_1_0__0 : rule__AdditionExpression__Group_1_0__0__Impl ;
    public final void rule__AdditionExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5407:1: ( rule__AdditionExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5408:2: rule__AdditionExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0__0__Impl_in_rule__AdditionExpression__Group_1_0__010860);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5414:1: rule__AdditionExpression__Group_1_0__0__Impl : ( ( rule__AdditionExpression__Alternatives_1_0_0 ) ) ;
    public final void rule__AdditionExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5418:1: ( ( ( rule__AdditionExpression__Alternatives_1_0_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5419:1: ( ( rule__AdditionExpression__Alternatives_1_0_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5419:1: ( ( rule__AdditionExpression__Alternatives_1_0_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5420:1: ( rule__AdditionExpression__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getAlternatives_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5421:1: ( rule__AdditionExpression__Alternatives_1_0_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5421:2: rule__AdditionExpression__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Alternatives_1_0_0_in_rule__AdditionExpression__Group_1_0__0__Impl10887);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5433:1: rule__AdditionExpression__Group_1_0_0_0__0 : rule__AdditionExpression__Group_1_0_0_0__0__Impl rule__AdditionExpression__Group_1_0_0_0__1 ;
    public final void rule__AdditionExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5437:1: ( rule__AdditionExpression__Group_1_0_0_0__0__Impl rule__AdditionExpression__Group_1_0_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5438:2: rule__AdditionExpression__Group_1_0_0_0__0__Impl rule__AdditionExpression__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__0__Impl_in_rule__AdditionExpression__Group_1_0_0_0__010919);
            rule__AdditionExpression__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1_in_rule__AdditionExpression__Group_1_0_0_0__010922);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5445:1: rule__AdditionExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5449:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5450:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5450:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5451:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5452:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5454:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0()); 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5464:1: rule__AdditionExpression__Group_1_0_0_0__1 : rule__AdditionExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__AdditionExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5468:1: ( rule__AdditionExpression__Group_1_0_0_0__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5469:2: rule__AdditionExpression__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1__Impl_in_rule__AdditionExpression__Group_1_0_0_0__110980);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5475:1: rule__AdditionExpression__Group_1_0_0_0__1__Impl : ( '+' ) ;
    public final void rule__AdditionExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5479:1: ( ( '+' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5480:1: ( '+' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5480:1: ( '+' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5481:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getPlusSignKeyword_1_0_0_0_1()); 
            }
            match(input,46,FOLLOW_46_in_rule__AdditionExpression__Group_1_0_0_0__1__Impl11008); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5498:1: rule__AdditionExpression__Group_1_0_0_1__0 : rule__AdditionExpression__Group_1_0_0_1__0__Impl rule__AdditionExpression__Group_1_0_0_1__1 ;
    public final void rule__AdditionExpression__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5502:1: ( rule__AdditionExpression__Group_1_0_0_1__0__Impl rule__AdditionExpression__Group_1_0_0_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5503:2: rule__AdditionExpression__Group_1_0_0_1__0__Impl rule__AdditionExpression__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__0__Impl_in_rule__AdditionExpression__Group_1_0_0_1__011043);
            rule__AdditionExpression__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1_in_rule__AdditionExpression__Group_1_0_0_1__011046);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5510:1: rule__AdditionExpression__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5514:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5515:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5515:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5516:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5517:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5519:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5529:1: rule__AdditionExpression__Group_1_0_0_1__1 : rule__AdditionExpression__Group_1_0_0_1__1__Impl ;
    public final void rule__AdditionExpression__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5533:1: ( rule__AdditionExpression__Group_1_0_0_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5534:2: rule__AdditionExpression__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1__Impl_in_rule__AdditionExpression__Group_1_0_0_1__111104);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5540:1: rule__AdditionExpression__Group_1_0_0_1__1__Impl : ( '-' ) ;
    public final void rule__AdditionExpression__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5544:1: ( ( '-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5545:1: ( '-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5545:1: ( '-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5546:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
            }
            match(input,47,FOLLOW_47_in_rule__AdditionExpression__Group_1_0_0_1__1__Impl11132); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5563:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5567:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5568:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__011167);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__011170);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5575:1: rule__MultiplicationExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5579:1: ( ( rulePrimaryExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5580:1: ( rulePrimaryExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5580:1: ( rulePrimaryExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5581:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__MultiplicationExpression__Group__0__Impl11197);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5592:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5596:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5597:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__111226);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5603:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )? ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5607:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5608:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5608:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5609:1: ( rule__MultiplicationExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5610:1: ( rule__MultiplicationExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred43_InternalCool()) ) {
                    alt28=1;
                }
            }
            else if ( (LA28_0==49) ) {
                int LA28_2 = input.LA(2);

                if ( (synpred43_InternalCool()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5610:2: rule__MultiplicationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl11253);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5624:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5628:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5629:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__011288);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__011291);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5636:1: rule__MultiplicationExpression__Group_1__0__Impl : ( ( rule__MultiplicationExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5640:1: ( ( ( rule__MultiplicationExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5641:1: ( ( rule__MultiplicationExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5641:1: ( ( rule__MultiplicationExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5642:1: ( rule__MultiplicationExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5643:1: ( rule__MultiplicationExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5643:2: rule__MultiplicationExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0__0_in_rule__MultiplicationExpression__Group_1__0__Impl11318);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5653:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5657:1: ( rule__MultiplicationExpression__Group_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5658:2: rule__MultiplicationExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__111348);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5664:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5668:1: ( ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5669:1: ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5669:1: ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5670:1: ( rule__MultiplicationExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5671:1: ( rule__MultiplicationExpression__RightAssignment_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5671:2: rule__MultiplicationExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__RightAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl11375);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5685:1: rule__MultiplicationExpression__Group_1_0__0 : rule__MultiplicationExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicationExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5689:1: ( rule__MultiplicationExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5690:2: rule__MultiplicationExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0__011409);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5696:1: rule__MultiplicationExpression__Group_1_0__0__Impl : ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5700:1: ( ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5701:1: ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5701:1: ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5702:1: ( rule__MultiplicationExpression__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getAlternatives_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5703:1: ( rule__MultiplicationExpression__Alternatives_1_0_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5703:2: rule__MultiplicationExpression__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Alternatives_1_0_0_in_rule__MultiplicationExpression__Group_1_0__0__Impl11436);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5715:1: rule__MultiplicationExpression__Group_1_0_0_0__0 : rule__MultiplicationExpression__Group_1_0_0_0__0__Impl rule__MultiplicationExpression__Group_1_0_0_0__1 ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5719:1: ( rule__MultiplicationExpression__Group_1_0_0_0__0__Impl rule__MultiplicationExpression__Group_1_0_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5720:2: rule__MultiplicationExpression__Group_1_0_0_0__0__Impl rule__MultiplicationExpression__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__011468);
            rule__MultiplicationExpression__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1_in_rule__MultiplicationExpression__Group_1_0_0_0__011471);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5727:1: rule__MultiplicationExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5731:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5732:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5732:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5733:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5734:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5736:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0()); 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5746:1: rule__MultiplicationExpression__Group_1_0_0_0__1 : rule__MultiplicationExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5750:1: ( rule__MultiplicationExpression__Group_1_0_0_0__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5751:2: rule__MultiplicationExpression__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__111529);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5757:1: rule__MultiplicationExpression__Group_1_0_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5761:1: ( ( '*' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5762:1: ( '*' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5762:1: ( '*' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5763:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getAsteriskKeyword_1_0_0_0_1()); 
            }
            match(input,48,FOLLOW_48_in_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl11557); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5780:1: rule__MultiplicationExpression__Group_1_0_0_1__0 : rule__MultiplicationExpression__Group_1_0_0_1__0__Impl rule__MultiplicationExpression__Group_1_0_0_1__1 ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5784:1: ( rule__MultiplicationExpression__Group_1_0_0_1__0__Impl rule__MultiplicationExpression__Group_1_0_0_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5785:2: rule__MultiplicationExpression__Group_1_0_0_1__0__Impl rule__MultiplicationExpression__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__011592);
            rule__MultiplicationExpression__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1_in_rule__MultiplicationExpression__Group_1_0_0_1__011595);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5792:1: rule__MultiplicationExpression__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5796:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5797:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5797:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5798:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5799:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5801:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5811:1: rule__MultiplicationExpression__Group_1_0_0_1__1 : rule__MultiplicationExpression__Group_1_0_0_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5815:1: ( rule__MultiplicationExpression__Group_1_0_0_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5816:2: rule__MultiplicationExpression__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__111653);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5822:1: rule__MultiplicationExpression__Group_1_0_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5826:1: ( ( '/' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5827:1: ( '/' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5827:1: ( '/' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5828:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getSolidusKeyword_1_0_0_1_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl11681); if (state.failed) return ;
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


    // $ANTLR start "rule__Program__ClassesAssignment"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5846:1: rule__Program__ClassesAssignment : ( ruleClass_ ) ;
    public final void rule__Program__ClassesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5850:1: ( ( ruleClass_ ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5851:1: ( ruleClass_ )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5851:1: ( ruleClass_ )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5852:1: ruleClass_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesClass_ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleClass__in_rule__Program__ClassesAssignment11721);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5861:1: rule__Class___NameAssignment_1 : ( ruleSYMBOL ) ;
    public final void rule__Class___NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5865:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5866:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5866:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5867:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getNameSYMBOLParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Class___NameAssignment_111752);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5876:1: rule__Class___ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class___ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5880:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5881:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5881:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5882:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getParentTypeCrossReference_2_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5883:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5884:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getParentTypeIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class___ParentAssignment_2_111787); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5895:1: rule__Class___FeaturesAssignment_4 : ( ruleFeature_ ) ;
    public final void rule__Class___FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5899:1: ( ( ruleFeature_ ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5900:1: ( ruleFeature_ )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5900:1: ( ruleFeature_ )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5901:1: ruleFeature_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getFeaturesFeature_ParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleFeature__in_rule__Class___FeaturesAssignment_411822);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5910:1: rule__Attr__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Attr__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5914:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5915:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5915:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5916:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Attr__NameAssignment_011853);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5925:1: rule__Attr__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attr__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5929:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5930:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5930:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5931:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5932:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5933:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attr__Type_declAssignment_211888); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5944:1: rule__Attr__InitAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Attr__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5948:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5949:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5949:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5950:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getInitExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Attr__InitAssignment_3_111923);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5959:1: rule__Method__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Method__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5963:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5964:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5964:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5965:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Method__NameAssignment_011954);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5974:1: rule__Method__FormalsAssignment_2_0 : ( ruleFormal ) ;
    public final void rule__Method__FormalsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5978:1: ( ( ruleFormal ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5979:1: ( ruleFormal )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5979:1: ( ruleFormal )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5980:1: ruleFormal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_011985);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5989:1: rule__Method__FormalsAssignment_2_1_1 : ( ruleFormal ) ;
    public final void rule__Method__FormalsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5993:1: ( ( ruleFormal ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5994:1: ( ruleFormal )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5994:1: ( ruleFormal )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5995:1: ruleFormal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_1_112016);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6004:1: rule__Method__Return_typeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Method__Return_typeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6008:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6009:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6009:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6010:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturn_typeTypeCrossReference_5_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6011:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6012:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturn_typeTypeIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__Return_typeAssignment_512051); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6023:1: rule__Method__ExprAssignment_7 : ( ruleExpression ) ;
    public final void rule__Method__ExprAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6027:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6028:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6028:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6029:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getExprExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Method__ExprAssignment_712086);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6038:1: rule__Formal__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Formal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6042:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6043:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6043:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6044:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Formal__NameAssignment_012117);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6053:1: rule__Formal__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Formal__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6057:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6058:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6058:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6059:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6060:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6061:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Formal__Type_declAssignment_212152); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6072:1: rule__IdentifierRefExpression__IdAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IdentifierRefExpression__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6076:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6077:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6077:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6078:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementCrossReference_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6079:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6080:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IdentifierRefExpression__IdAssignment12191); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6091:1: rule__NumberLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6095:1: ( ( RULE_INT ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6096:1: ( RULE_INT )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6096:1: ( RULE_INT )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6097:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment12226); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6106:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6110:1: ( ( RULE_STRING ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6111:1: ( RULE_STRING )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6111:1: ( RULE_STRING )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6112:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12257); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6121:1: rule__BooleanLiteral__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6125:1: ( ( ruleBOOLEAN ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6126:1: ( ruleBOOLEAN )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6126:1: ( ruleBOOLEAN )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6127:1: ruleBOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__BooleanLiteral__ValueAssignment12288);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6136:1: rule__ParenExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__ParenExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6140:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6141:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6141:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6142:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParenExpression__ExprAssignment_112319);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6151:1: rule__AssignmentExpression__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__AssignmentExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6155:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6156:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6156:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6157:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__AssignmentExpression__NameAssignment_012350);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6166:1: rule__AssignmentExpression__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__AssignmentExpression__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6170:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6171:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6171:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6172:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getExprExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__AssignmentExpression__ExprAssignment_212381);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6181:1: rule__NegationExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__NegationExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6185:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6186:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6186:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6187:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__NegationExpression__ExprAssignment_112412);
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


    // $ANTLR start "rule__IntegerComposite__ExprAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6196:1: rule__IntegerComposite__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IntegerComposite__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6200:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6201:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6201:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6202:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__IntegerComposite__ExprAssignment_112443);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerCompositeAccess().getExprExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__IntegerComposite__ExprAssignment_1"


    // $ANTLR start "rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6211:1: rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6215:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6216:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6216:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6217:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getType_nameTypeCrossReference_1_0_0_1_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6218:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6219:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getType_nameTypeIDTerminalRuleCall_1_0_0_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_112478); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6230:1: rule__DispatchExpression__RefAssignment_1_0_0_3 : ( ruleIdentifierRefExpression ) ;
    public final void rule__DispatchExpression__RefAssignment_1_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6234:1: ( ( ruleIdentifierRefExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6235:1: ( ruleIdentifierRefExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6235:1: ( ruleIdentifierRefExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6236:1: ruleIdentifierRefExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_1_0_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleIdentifierRefExpression_in_rule__DispatchExpression__RefAssignment_1_0_0_312513);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6245:1: rule__DispatchExpression__ActualAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__DispatchExpression__ActualAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6249:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6250:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6250:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6251:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_012544);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6260:1: rule__DispatchExpression__ActualAssignment_1_2_1_1 : ( ruleExpression ) ;
    public final void rule__DispatchExpression__ActualAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6264:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6265:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6265:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6266:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_1_112575);
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


    // $ANTLR start "rule__StaticDispatchExpression__RefAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6275:1: rule__StaticDispatchExpression__RefAssignment_0 : ( ruleIdentifierRefExpression ) ;
    public final void rule__StaticDispatchExpression__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6279:1: ( ( ruleIdentifierRefExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6280:1: ( ruleIdentifierRefExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6280:1: ( ruleIdentifierRefExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6281:1: ruleIdentifierRefExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleIdentifierRefExpression_in_rule__StaticDispatchExpression__RefAssignment_012606);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6290:1: rule__StaticDispatchExpression__ActualAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__StaticDispatchExpression__ActualAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6294:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6295:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6295:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6296:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_012637);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6305:1: rule__StaticDispatchExpression__ActualAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__StaticDispatchExpression__ActualAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6309:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6310:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6310:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6311:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_1_112668);
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


    // $ANTLR start "rule__ConditionalExpression__PredAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6320:1: rule__ConditionalExpression__PredAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6324:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6325:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6325:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6326:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__PredAssignment_112699);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6335:1: rule__ConditionalExpression__Then_expAssignment_3 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__Then_expAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6339:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6340:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6340:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6341:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getThen_expExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__Then_expAssignment_312730);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6350:1: rule__ConditionalExpression__Else_expAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__Else_expAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6354:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6355:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6355:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6356:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getElse_expExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__Else_expAssignment_4_112761);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6365:1: rule__LoopExpression__PredAssignment_1 : ( ruleExpression ) ;
    public final void rule__LoopExpression__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6369:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6370:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6370:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6371:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LoopExpression__PredAssignment_112792);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6380:1: rule__LoopExpression__BodyAssignment_3 : ( ruleExpression ) ;
    public final void rule__LoopExpression__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6384:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6385:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6385:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6386:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getBodyExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LoopExpression__BodyAssignment_312823);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6395:1: rule__BlockExpression__BodyAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__BlockExpression__BodyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6399:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6400:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6400:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6401:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBodyExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__BlockExpression__BodyAssignment_2_012854);
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


    // $ANTLR start "rule__LetExpression__DeclarationAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6410:1: rule__LetExpression__DeclarationAssignment_1 : ( ruleLetDeclaration ) ;
    public final void rule__LetExpression__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6414:1: ( ( ruleLetDeclaration ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6415:1: ( ruleLetDeclaration )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6415:1: ( ruleLetDeclaration )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6416:1: ruleLetDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationLetDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_112885);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6425:1: rule__LetExpression__DeclarationAssignment_2_1 : ( ruleLetDeclaration ) ;
    public final void rule__LetExpression__DeclarationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6429:1: ( ( ruleLetDeclaration ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6430:1: ( ruleLetDeclaration )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6430:1: ( ruleLetDeclaration )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6431:1: ruleLetDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationLetDeclarationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_2_112916);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6440:1: rule__LetExpression__BodyAssignment_4 : ( ruleExpression ) ;
    public final void rule__LetExpression__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6444:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6445:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6445:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6446:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getBodyExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LetExpression__BodyAssignment_412947);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6455:1: rule__LetDeclaration__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__LetDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6459:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6460:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6460:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6461:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__LetDeclaration__NameAssignment_012978);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6470:1: rule__LetDeclaration__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LetDeclaration__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6474:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6475:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6475:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6476:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6477:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6478:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LetDeclaration__Type_declAssignment_213013); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6489:1: rule__LetDeclaration__InitAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__LetDeclaration__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6493:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6494:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6494:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6495:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getInitExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LetDeclaration__InitAssignment_3_113048);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6504:1: rule__CaseExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__CaseExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6508:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6509:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6509:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6510:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CaseExpression__ExprAssignment_113079);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6519:1: rule__CaseExpression__CaseAssignment_3_0 : ( ruleCase ) ;
    public final void rule__CaseExpression__CaseAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6523:1: ( ( ruleCase ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6524:1: ( ruleCase )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6524:1: ( ruleCase )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6525:1: ruleCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseCaseParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleCase_in_rule__CaseExpression__CaseAssignment_3_013110);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6534:1: rule__Case__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Case__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6538:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6539:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6539:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6540:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Case__NameAssignment_013141);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6549:1: rule__Case__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Case__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6553:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6554:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6554:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6555:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6556:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6557:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Case__Type_declAssignment_213176); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6568:1: rule__Case__ExprAssignment_4 : ( ruleExpression ) ;
    public final void rule__Case__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6572:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6573:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6573:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6574:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getExprExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Case__ExprAssignment_413211);
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


    // $ANTLR start "rule__NewExpression__Type_nameAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6583:1: rule__NewExpression__Type_nameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewExpression__Type_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6587:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6588:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6588:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6589:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getType_nameTypeCrossReference_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6590:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6591:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getType_nameTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewExpression__Type_nameAssignment_113246); if (state.failed) return ;
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


    // $ANTLR start "rule__IsvoidExpression__ExprAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6602:1: rule__IsvoidExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IsvoidExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6606:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6607:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6607:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6608:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__IsvoidExpression__ExprAssignment_113281);
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


    // $ANTLR start "rule__CompareExpression__OpAssignment_1_0_0_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6617:1: rule__CompareExpression__OpAssignment_1_0_0_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6621:1: ( ( ruleCompareOperator ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6622:1: ( ruleCompareOperator )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6622:1: ( ruleCompareOperator )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6623:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOpCompareOperatorParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareExpression__OpAssignment_1_0_0_113312);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6632:1: rule__CompareExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__CompareExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6636:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6637:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6637:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6638:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CompareExpression__RightAssignment_1_113343);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6647:1: rule__AdditionExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__AdditionExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6651:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6652:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6652:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6653:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__AdditionExpression__RightAssignment_1_113374);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6662:1: rule__MultiplicationExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__MultiplicationExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6666:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6667:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6667:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6668:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__MultiplicationExpression__RightAssignment_1_113405);
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

    // $ANTLR start synpred30_InternalCool
    public final void synpred30_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2801:2: ( rule__DispatchExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2801:2: rule__DispatchExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__DispatchExpression__Group_1__0_in_synpred30_InternalCool5735);
        rule__DispatchExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalCool

    // $ANTLR start synpred41_InternalCool
    public final void synpred41_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5113:2: ( rule__CompareExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5113:2: rule__CompareExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_synpred41_InternalCool10281);
        rule__CompareExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalCool

    // $ANTLR start synpred42_InternalCool
    public final void synpred42_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5328:2: ( rule__AdditionExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5328:2: rule__AdditionExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0_in_synpred42_InternalCool10704);
        rule__AdditionExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalCool

    // $ANTLR start synpred43_InternalCool
    public final void synpred43_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5610:2: ( rule__MultiplicationExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5610:2: rule__MultiplicationExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0_in_synpred43_InternalCool11253);
        rule__MultiplicationExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalCool

    // Delegated rules

    public final boolean synpred30_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred42_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalCool_fragment(); // can never throw exception
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
    static final String DFA3_eotS =
        "\22\uffff";
    static final String DFA3_eofS =
        "\10\uffff\1\20\1\21\10\uffff";
    static final String DFA3_minS =
        "\1\4\7\uffff\2\13\10\uffff";
    static final String DFA3_maxS =
        "\1\55\7\uffff\2\61\10\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\13\1\14\1\15\1\16"+
        "\1\10\1\17\1\12\1\11";
    static final String DFA3_specialS =
        "\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\10\2\12\7\uffff\2\12\1\11\1\uffff\1\3\5\uffff\1\13\2\uffff"+
            "\1\14\1\15\2\uffff\1\1\3\uffff\1\2\2\uffff\1\4\1\uffff\1\5\3"+
            "\uffff\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\20\5\uffff\2\20\2\uffff\1\16\1\17\2\20\2\uffff\2\20\1\uffff"+
            "\3\20\1\uffff\2\20\1\uffff\1\20\1\uffff\1\20\4\uffff\4\20",
            "\3\21\5\uffff\2\21\2\uffff\1\16\1\uffff\2\21\2\uffff\2\21"+
            "\1\uffff\3\21\1\uffff\2\21\1\uffff\1\21\1\uffff\1\21\4\uffff"+
            "\4\21",
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
            return "1067:1: rule__PrimaryExpression__Alternatives : ( ( ruleConditionalExpression ) | ( ruleLoopExpression ) | ( ruleBlockExpression ) | ( ruleLetExpression ) | ( ruleCaseExpression ) | ( ruleNewExpression ) | ( ruleIsvoidExpression ) | ( ruleAssignmentExpression ) | ( ruleSelfTypeLiteral ) | ( ruleIdentifierRefExpression ) | ( ruleLiteral ) | ( ruleParenExpression ) | ( ruleNegationExpression ) | ( ruleIntegerComposite ) | ( ruleStaticDispatchExpression ) );";
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
    public static final BitSet FOLLOW_ruleDispatchExpression_in_ruleExpression461 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleIntegerComposite_in_entryRuleIntegerComposite1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerComposite1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerComposite__Group__0_in_ruleIntegerComposite1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDispatchExpression_in_entryRuleDispatchExpression1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDispatchExpression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__0_in_ruleDispatchExpression1180 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleLetExpression_in_entryRuleLetExpression1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExpression1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__0_in_ruleLetExpression1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetDeclaration1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__0_in_ruleLetDeclaration1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0_in_ruleCase1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewExpression_in_entryRuleNewExpression1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewExpression1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__0_in_ruleNewExpression1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsvoidExpression_in_entryRuleIsvoidExpression1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsvoidExpression1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__0_in_ruleIsvoidExpression1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_entryRuleCompareOperator1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperator1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression2020 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleIntegerComposite_in_rule__PrimaryExpression__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Attr__Group_3__0__Impl_in_rule__Attr__Group_3__03724 = new BitSet(new long[]{0x000031489905C070L});
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
    public static final BitSet FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__64214 = new BitSet(new long[]{0x000031489905C070L});
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
    public static final BitSet FOLLOW_rule__ParenExpression__Group__0__Impl_in_rule__ParenExpression__Group__05031 = new BitSet(new long[]{0x000031489905C070L});
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
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__1__Impl_in_rule__AssignmentExpression__Group__15278 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__2_in_rule__AssignmentExpression__Group__15281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AssignmentExpression__Group__1__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__2__Impl_in_rule__AssignmentExpression__Group__25340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__ExprAssignment_2_in_rule__AssignmentExpression__Group__2__Impl5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__0__Impl_in_rule__NegationExpression__Group__05403 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__1_in_rule__NegationExpression__Group__05406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NegationExpression__Group__0__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__1__Impl_in_rule__NegationExpression__Group__15465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__ExprAssignment_1_in_rule__NegationExpression__Group__1__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerComposite__Group__0__Impl_in_rule__IntegerComposite__Group__05526 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__IntegerComposite__Group__1_in_rule__IntegerComposite__Group__05529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IntegerComposite__Group__0__Impl5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerComposite__Group__1__Impl_in_rule__IntegerComposite__Group__15588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerComposite__ExprAssignment_1_in_rule__IntegerComposite__Group__1__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__0__Impl_in_rule__DispatchExpression__Group__05649 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__1_in_rule__DispatchExpression__Group__05652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__DispatchExpression__Group__0__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__1__Impl_in_rule__DispatchExpression__Group__15708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__0_in_rule__DispatchExpression__Group__1__Impl5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__0__Impl_in_rule__DispatchExpression__Group_1__05770 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__1_in_rule__DispatchExpression__Group_1__05773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0__0_in_rule__DispatchExpression__Group_1__0__Impl5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__1__Impl_in_rule__DispatchExpression__Group_1__15830 = new BitSet(new long[]{0x000031489B05C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__2_in_rule__DispatchExpression__Group_1__15833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DispatchExpression__Group_1__1__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__2__Impl_in_rule__DispatchExpression__Group_1__25892 = new BitSet(new long[]{0x000031489B05C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__3_in_rule__DispatchExpression__Group_1__25895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__0_in_rule__DispatchExpression__Group_1__2__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__3__Impl_in_rule__DispatchExpression__Group_1__35953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DispatchExpression__Group_1__3__Impl5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0__0__Impl_in_rule__DispatchExpression__Group_1_0__06020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__0_in_rule__DispatchExpression__Group_1_0__0__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__0__Impl_in_rule__DispatchExpression__Group_1_0_0__06079 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__1_in_rule__DispatchExpression__Group_1_0_0__06082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__1__Impl_in_rule__DispatchExpression__Group_1_0_0__16140 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__2_in_rule__DispatchExpression__Group_1_0_0__16143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0_in_rule__DispatchExpression__Group_1_0_0__1__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__2__Impl_in_rule__DispatchExpression__Group_1_0_0__26201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__3_in_rule__DispatchExpression__Group_1_0_0__26204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DispatchExpression__Group_1_0_0__2__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__3__Impl_in_rule__DispatchExpression__Group_1_0_0__36263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__RefAssignment_1_0_0_3_in_rule__DispatchExpression__Group_1_0_0__3__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0__Impl_in_rule__DispatchExpression__Group_1_0_0_1__06328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1_in_rule__DispatchExpression__Group_1_0_0_1__06331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DispatchExpression__Group_1_0_0_1__0__Impl6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1__Impl_in_rule__DispatchExpression__Group_1_0_0_1__16390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1_in_rule__DispatchExpression__Group_1_0_0_1__1__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__0__Impl_in_rule__DispatchExpression__Group_1_2__06451 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__1_in_rule__DispatchExpression__Group_1_2__06454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_0_in_rule__DispatchExpression__Group_1_2__0__Impl6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__1__Impl_in_rule__DispatchExpression__Group_1_2__16511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__0_in_rule__DispatchExpression__Group_1_2__1__Impl6538 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__0__Impl_in_rule__DispatchExpression__Group_1_2_1__06573 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__1_in_rule__DispatchExpression__Group_1_2_1__06576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DispatchExpression__Group_1_2_1__0__Impl6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__1__Impl_in_rule__DispatchExpression__Group_1_2_1__16635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_1_1_in_rule__DispatchExpression__Group_1_2_1__1__Impl6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__0__Impl_in_rule__StaticDispatchExpression__Group__06696 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__1_in_rule__StaticDispatchExpression__Group__06699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__RefAssignment_0_in_rule__StaticDispatchExpression__Group__0__Impl6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__1__Impl_in_rule__StaticDispatchExpression__Group__16756 = new BitSet(new long[]{0x000031489B05C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__2_in_rule__StaticDispatchExpression__Group__16759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StaticDispatchExpression__Group__1__Impl6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__2__Impl_in_rule__StaticDispatchExpression__Group__26818 = new BitSet(new long[]{0x000031489B05C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__3_in_rule__StaticDispatchExpression__Group__26821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__0_in_rule__StaticDispatchExpression__Group__2__Impl6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__3__Impl_in_rule__StaticDispatchExpression__Group__36879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StaticDispatchExpression__Group__3__Impl6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__0__Impl_in_rule__StaticDispatchExpression__Group_2__06946 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__1_in_rule__StaticDispatchExpression__Group_2__06949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_0_in_rule__StaticDispatchExpression__Group_2__0__Impl6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__1__Impl_in_rule__StaticDispatchExpression__Group_2__17006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__0_in_rule__StaticDispatchExpression__Group_2__1__Impl7033 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__0__Impl_in_rule__StaticDispatchExpression__Group_2_1__07068 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__1_in_rule__StaticDispatchExpression__Group_2_1__07071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StaticDispatchExpression__Group_2_1__0__Impl7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__1__Impl_in_rule__StaticDispatchExpression__Group_2_1__17130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_1_1_in_rule__StaticDispatchExpression__Group_2_1__1__Impl7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__07191 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__07194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ConditionalExpression__Group__0__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__17253 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__2_in_rule__ConditionalExpression__Group__17256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__PredAssignment_1_in_rule__ConditionalExpression__Group__1__Impl7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__2__Impl_in_rule__ConditionalExpression__Group__27313 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__3_in_rule__ConditionalExpression__Group__27316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ConditionalExpression__Group__2__Impl7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__3__Impl_in_rule__ConditionalExpression__Group__37375 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__4_in_rule__ConditionalExpression__Group__37378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Then_expAssignment_3_in_rule__ConditionalExpression__Group__3__Impl7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__4__Impl_in_rule__ConditionalExpression__Group__47435 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__5_in_rule__ConditionalExpression__Group__47438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_4__0_in_rule__ConditionalExpression__Group__4__Impl7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__5__Impl_in_rule__ConditionalExpression__Group__57496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ConditionalExpression__Group__5__Impl7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_4__0__Impl_in_rule__ConditionalExpression__Group_4__07567 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_4__1_in_rule__ConditionalExpression__Group_4__07570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ConditionalExpression__Group_4__0__Impl7599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_4__1__Impl_in_rule__ConditionalExpression__Group_4__17631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Else_expAssignment_4_1_in_rule__ConditionalExpression__Group_4__1__Impl7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__0__Impl_in_rule__LoopExpression__Group__07692 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__1_in_rule__LoopExpression__Group__07695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LoopExpression__Group__0__Impl7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__1__Impl_in_rule__LoopExpression__Group__17754 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__2_in_rule__LoopExpression__Group__17757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__PredAssignment_1_in_rule__LoopExpression__Group__1__Impl7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__2__Impl_in_rule__LoopExpression__Group__27814 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__3_in_rule__LoopExpression__Group__27817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LoopExpression__Group__2__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__3__Impl_in_rule__LoopExpression__Group__37876 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__4_in_rule__LoopExpression__Group__37879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__BodyAssignment_3_in_rule__LoopExpression__Group__3__Impl7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__4__Impl_in_rule__LoopExpression__Group__47936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__LoopExpression__Group__4__Impl7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__0__Impl_in_rule__BlockExpression__Group__08005 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__1_in_rule__BlockExpression__Group__08008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__1__Impl_in_rule__BlockExpression__Group__18066 = new BitSet(new long[]{0x00003148990DC070L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__2_in_rule__BlockExpression__Group__18069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BlockExpression__Group__1__Impl8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__2__Impl_in_rule__BlockExpression__Group__28128 = new BitSet(new long[]{0x00003148990DC070L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__3_in_rule__BlockExpression__Group__28131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__0_in_rule__BlockExpression__Group__2__Impl8158 = new BitSet(new long[]{0x000031489905C072L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__3__Impl_in_rule__BlockExpression__Group__38189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BlockExpression__Group__3__Impl8217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__0__Impl_in_rule__BlockExpression__Group_2__08256 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__1_in_rule__BlockExpression__Group_2__08259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__BodyAssignment_2_0_in_rule__BlockExpression__Group_2__0__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__1__Impl_in_rule__BlockExpression__Group_2__18316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BlockExpression__Group_2__1__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__0__Impl_in_rule__LetExpression__Group__08379 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__1_in_rule__LetExpression__Group__08382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__LetExpression__Group__0__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__1__Impl_in_rule__LetExpression__Group__18441 = new BitSet(new long[]{0x0000008004000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__2_in_rule__LetExpression__Group__18444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__DeclarationAssignment_1_in_rule__LetExpression__Group__1__Impl8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__2__Impl_in_rule__LetExpression__Group__28501 = new BitSet(new long[]{0x0000008004000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__3_in_rule__LetExpression__Group__28504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__0_in_rule__LetExpression__Group__2__Impl8531 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__3__Impl_in_rule__LetExpression__Group__38562 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__4_in_rule__LetExpression__Group__38565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LetExpression__Group__3__Impl8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__4__Impl_in_rule__LetExpression__Group__48624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__BodyAssignment_4_in_rule__LetExpression__Group__4__Impl8651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__0__Impl_in_rule__LetExpression__Group_2__08691 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__1_in_rule__LetExpression__Group_2__08694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LetExpression__Group_2__0__Impl8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__1__Impl_in_rule__LetExpression__Group_2__18753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__DeclarationAssignment_2_1_in_rule__LetExpression__Group_2__1__Impl8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__0__Impl_in_rule__LetDeclaration__Group__08814 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__1_in_rule__LetDeclaration__Group__08817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__NameAssignment_0_in_rule__LetDeclaration__Group__0__Impl8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__1__Impl_in_rule__LetDeclaration__Group__18874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__2_in_rule__LetDeclaration__Group__18877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LetDeclaration__Group__1__Impl8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__2__Impl_in_rule__LetDeclaration__Group__28936 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__3_in_rule__LetDeclaration__Group__28939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Type_declAssignment_2_in_rule__LetDeclaration__Group__2__Impl8966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__3__Impl_in_rule__LetDeclaration__Group__38996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__0_in_rule__LetDeclaration__Group__3__Impl9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__0__Impl_in_rule__LetDeclaration__Group_3__09062 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__1_in_rule__LetDeclaration__Group_3__09065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LetDeclaration__Group_3__0__Impl9093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__1__Impl_in_rule__LetDeclaration__Group_3__19124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__InitAssignment_3_1_in_rule__LetDeclaration__Group_3__1__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__09185 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__09188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__CaseExpression__Group__0__Impl9216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__19247 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__19250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__ExprAssignment_1_in_rule__CaseExpression__Group__1__Impl9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__29307 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__29310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__CaseExpression__Group__2__Impl9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__39369 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__4_in_rule__CaseExpression__Group__39372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__0_in_rule__CaseExpression__Group__3__Impl9401 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__0_in_rule__CaseExpression__Group__3__Impl9413 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__4__Impl_in_rule__CaseExpression__Group__49446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__CaseExpression__Group__4__Impl9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__0__Impl_in_rule__CaseExpression__Group_3__09515 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__1_in_rule__CaseExpression__Group_3__09518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__CaseAssignment_3_0_in_rule__CaseExpression__Group_3__0__Impl9545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group_3__1__Impl_in_rule__CaseExpression__Group_3__19575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CaseExpression__Group_3__1__Impl9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__09638 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Case__Group__1_in_rule__Case__Group__09641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl9668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__19698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Case__Group__2_in_rule__Case__Group__19701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Case__Group__1__Impl9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__29760 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Case__Group__3_in_rule__Case__Group__29763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Type_declAssignment_2_in_rule__Case__Group__2__Impl9790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__39820 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__Case__Group__4_in_rule__Case__Group__39823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Case__Group__3__Impl9851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__49882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__ExprAssignment_4_in_rule__Case__Group__4__Impl9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__0__Impl_in_rule__NewExpression__Group__09949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__1_in_rule__NewExpression__Group__09952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NewExpression__Group__0__Impl9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__1__Impl_in_rule__NewExpression__Group__110011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Type_nameAssignment_1_in_rule__NewExpression__Group__1__Impl10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__0__Impl_in_rule__IsvoidExpression__Group__010072 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__1_in_rule__IsvoidExpression__Group__010075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__IsvoidExpression__Group__0__Impl10103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__1__Impl_in_rule__IsvoidExpression__Group__110134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__ExprAssignment_1_in_rule__IsvoidExpression__Group__1__Impl10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010195 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_rule__CompareExpression__Group__0__Impl10225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__010316 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__010319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl10346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__110376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__010437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl10464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__010496 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__010499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__110557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OpAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl10584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__010618 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__010621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl10648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__110677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl10704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__010739 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__010742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0__0_in_rule__AdditionExpression__Group_1__0__Impl10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__110799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__RightAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl10826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0__0__Impl_in_rule__AdditionExpression__Group_1_0__010860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Alternatives_1_0_0_in_rule__AdditionExpression__Group_1_0__0__Impl10887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__0__Impl_in_rule__AdditionExpression__Group_1_0_0_0__010919 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1_in_rule__AdditionExpression__Group_1_0_0_0__010922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1__Impl_in_rule__AdditionExpression__Group_1_0_0_0__110980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__AdditionExpression__Group_1_0_0_0__1__Impl11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__0__Impl_in_rule__AdditionExpression__Group_1_0_0_1__011043 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1_in_rule__AdditionExpression__Group_1_0_0_1__011046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1__Impl_in_rule__AdditionExpression__Group_1_0_0_1__111104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AdditionExpression__Group_1_0_0_1__1__Impl11132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__011167 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__011170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__MultiplicationExpression__Group__0__Impl11197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__111226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl11253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__011288 = new BitSet(new long[]{0x000031489905C070L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__011291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0__0_in_rule__MultiplicationExpression__Group_1__0__Impl11318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__111348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__RightAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl11375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0__011409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Alternatives_1_0_0_in_rule__MultiplicationExpression__Group_1_0__0__Impl11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__011468 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1_in_rule__MultiplicationExpression__Group_1_0_0_0__011471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__111529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl11557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__011592 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1_in_rule__MultiplicationExpression__Group_1_0_0_1__011595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__111653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass__in_rule__Program__ClassesAssignment11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Class___NameAssignment_111752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class___ParentAssignment_2_111787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature__in_rule__Class___FeaturesAssignment_411822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Attr__NameAssignment_011853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attr__Type_declAssignment_211888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Attr__InitAssignment_3_111923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Method__NameAssignment_011954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_011985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_1_112016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__Return_typeAssignment_512051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Method__ExprAssignment_712086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Formal__NameAssignment_012117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Formal__Type_declAssignment_212152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IdentifierRefExpression__IdAssignment12191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment12226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__BooleanLiteral__ValueAssignment12288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParenExpression__ExprAssignment_112319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__AssignmentExpression__NameAssignment_012350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AssignmentExpression__ExprAssignment_212381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__NegationExpression__ExprAssignment_112412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__IntegerComposite__ExprAssignment_112443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_112478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_rule__DispatchExpression__RefAssignment_1_0_0_312513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_012544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_1_112575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_rule__StaticDispatchExpression__RefAssignment_012606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_012637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_1_112668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__PredAssignment_112699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__Then_expAssignment_312730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__Else_expAssignment_4_112761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LoopExpression__PredAssignment_112792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LoopExpression__BodyAssignment_312823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__BlockExpression__BodyAssignment_2_012854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_112885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_2_112916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LetExpression__BodyAssignment_412947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__LetDeclaration__NameAssignment_012978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LetDeclaration__Type_declAssignment_213013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LetDeclaration__InitAssignment_3_113048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CaseExpression__ExprAssignment_113079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__CaseExpression__CaseAssignment_3_013110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Case__NameAssignment_013141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Case__Type_declAssignment_213176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Case__ExprAssignment_413211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewExpression__Type_nameAssignment_113246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__IsvoidExpression__ExprAssignment_113281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareExpression__OpAssignment_1_0_0_113312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CompareExpression__RightAssignment_1_113343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AdditionExpression__RightAssignment_1_113374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__MultiplicationExpression__RightAssignment_1_113405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__0_in_synpred30_InternalCool5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_synpred41_InternalCool10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_synpred42_InternalCool10704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_synpred43_InternalCool11253 = new BitSet(new long[]{0x0000000000000002L});

}