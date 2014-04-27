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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'<='", "'='", "'true'", "'false'", "'self'", "'class'", "'{'", "'};'", "'inherits'", "':'", "';'", "'<-'", "'('", "')'", "','", "'not'", "'~'", "'.'", "'@'", "'if'", "'then'", "'else'", "'fi'", "'while'", "'loop'", "'pool'", "'}'", "'let'", "'in'", "'case'", "'of'", "'esac'", "'=>'", "'new'", "'isvoid'", "'+'", "'-'", "'*'", "'/'"
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
    public static final int T__50=50;
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
                else if ( (LA2_1==21) ) {
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

                if ( (LA2_2==21) ) {
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

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            else if ( (LA6_0==48) ) {
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

            if ( (LA7_0==49) ) {
                alt7=1;
            }
            else if ( (LA7_0==50) ) {
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

            if ( (LA10_0==20) ) {
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1475:1: rule__Class___Group__5 : rule__Class___Group__5__Impl ;
    public final void rule__Class___Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1479:1: ( rule__Class___Group__5__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1480:2: rule__Class___Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Class___Group__5__Impl_in_rule__Class___Group__53154);
            rule__Class___Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1486:1: rule__Class___Group__5__Impl : ( '};' ) ;
    public final void rule__Class___Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1490:1: ( ( '};' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1491:1: ( '};' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1491:1: ( '};' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1492:1: '};'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getRightCurlyBracketSemicolonKeyword_5()); 
            }
            match(input,19,FOLLOW_19_in_rule__Class___Group__5__Impl3182); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_Access().getRightCurlyBracketSemicolonKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Class___Group_2__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1517:1: rule__Class___Group_2__0 : rule__Class___Group_2__0__Impl rule__Class___Group_2__1 ;
    public final void rule__Class___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1521:1: ( rule__Class___Group_2__0__Impl rule__Class___Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1522:2: rule__Class___Group_2__0__Impl rule__Class___Group_2__1
            {
            pushFollow(FOLLOW_rule__Class___Group_2__0__Impl_in_rule__Class___Group_2__03225);
            rule__Class___Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class___Group_2__1_in_rule__Class___Group_2__03228);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1529:1: rule__Class___Group_2__0__Impl : ( 'inherits' ) ;
    public final void rule__Class___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1533:1: ( ( 'inherits' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1534:1: ( 'inherits' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1534:1: ( 'inherits' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1535:1: 'inherits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getInheritsKeyword_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Class___Group_2__0__Impl3256); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1548:1: rule__Class___Group_2__1 : rule__Class___Group_2__1__Impl ;
    public final void rule__Class___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1552:1: ( rule__Class___Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1553:2: rule__Class___Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class___Group_2__1__Impl_in_rule__Class___Group_2__13287);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1559:1: rule__Class___Group_2__1__Impl : ( ( rule__Class___ParentAssignment_2_1 ) ) ;
    public final void rule__Class___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1563:1: ( ( ( rule__Class___ParentAssignment_2_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1564:1: ( ( rule__Class___ParentAssignment_2_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1564:1: ( ( rule__Class___ParentAssignment_2_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1565:1: ( rule__Class___ParentAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getParentAssignment_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1566:1: ( rule__Class___ParentAssignment_2_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1566:2: rule__Class___ParentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Class___ParentAssignment_2_1_in_rule__Class___Group_2__1__Impl3314);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1580:1: rule__Attr__Group__0 : rule__Attr__Group__0__Impl rule__Attr__Group__1 ;
    public final void rule__Attr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1584:1: ( rule__Attr__Group__0__Impl rule__Attr__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1585:2: rule__Attr__Group__0__Impl rule__Attr__Group__1
            {
            pushFollow(FOLLOW_rule__Attr__Group__0__Impl_in_rule__Attr__Group__03348);
            rule__Attr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group__1_in_rule__Attr__Group__03351);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1592:1: rule__Attr__Group__0__Impl : ( ( rule__Attr__NameAssignment_0 ) ) ;
    public final void rule__Attr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1596:1: ( ( ( rule__Attr__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1597:1: ( ( rule__Attr__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1597:1: ( ( rule__Attr__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1598:1: ( rule__Attr__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1599:1: ( rule__Attr__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1599:2: rule__Attr__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attr__NameAssignment_0_in_rule__Attr__Group__0__Impl3378);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1609:1: rule__Attr__Group__1 : rule__Attr__Group__1__Impl rule__Attr__Group__2 ;
    public final void rule__Attr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1613:1: ( rule__Attr__Group__1__Impl rule__Attr__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1614:2: rule__Attr__Group__1__Impl rule__Attr__Group__2
            {
            pushFollow(FOLLOW_rule__Attr__Group__1__Impl_in_rule__Attr__Group__13408);
            rule__Attr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group__2_in_rule__Attr__Group__13411);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1621:1: rule__Attr__Group__1__Impl : ( ':' ) ;
    public final void rule__Attr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1625:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1626:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1626:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1627:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getColonKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Attr__Group__1__Impl3439); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1640:1: rule__Attr__Group__2 : rule__Attr__Group__2__Impl rule__Attr__Group__3 ;
    public final void rule__Attr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1644:1: ( rule__Attr__Group__2__Impl rule__Attr__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1645:2: rule__Attr__Group__2__Impl rule__Attr__Group__3
            {
            pushFollow(FOLLOW_rule__Attr__Group__2__Impl_in_rule__Attr__Group__23470);
            rule__Attr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group__3_in_rule__Attr__Group__23473);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1652:1: rule__Attr__Group__2__Impl : ( ( rule__Attr__Type_declAssignment_2 ) ) ;
    public final void rule__Attr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1656:1: ( ( ( rule__Attr__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1657:1: ( ( rule__Attr__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1657:1: ( ( rule__Attr__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1658:1: ( rule__Attr__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1659:1: ( rule__Attr__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1659:2: rule__Attr__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__Attr__Type_declAssignment_2_in_rule__Attr__Group__2__Impl3500);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1669:1: rule__Attr__Group__3 : rule__Attr__Group__3__Impl rule__Attr__Group__4 ;
    public final void rule__Attr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1673:1: ( rule__Attr__Group__3__Impl rule__Attr__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1674:2: rule__Attr__Group__3__Impl rule__Attr__Group__4
            {
            pushFollow(FOLLOW_rule__Attr__Group__3__Impl_in_rule__Attr__Group__33530);
            rule__Attr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group__4_in_rule__Attr__Group__33533);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1681:1: rule__Attr__Group__3__Impl : ( ( rule__Attr__Group_3__0 )? ) ;
    public final void rule__Attr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1685:1: ( ( ( rule__Attr__Group_3__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1686:1: ( ( rule__Attr__Group_3__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1686:1: ( ( rule__Attr__Group_3__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1687:1: ( rule__Attr__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getGroup_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1688:1: ( rule__Attr__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1688:2: rule__Attr__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Attr__Group_3__0_in_rule__Attr__Group__3__Impl3560);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1698:1: rule__Attr__Group__4 : rule__Attr__Group__4__Impl ;
    public final void rule__Attr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1702:1: ( rule__Attr__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1703:2: rule__Attr__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attr__Group__4__Impl_in_rule__Attr__Group__43591);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1709:1: rule__Attr__Group__4__Impl : ( ';' ) ;
    public final void rule__Attr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1713:1: ( ( ';' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1714:1: ( ';' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1714:1: ( ';' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1715:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getSemicolonKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__Attr__Group__4__Impl3619); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1738:1: rule__Attr__Group_3__0 : rule__Attr__Group_3__0__Impl rule__Attr__Group_3__1 ;
    public final void rule__Attr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1742:1: ( rule__Attr__Group_3__0__Impl rule__Attr__Group_3__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1743:2: rule__Attr__Group_3__0__Impl rule__Attr__Group_3__1
            {
            pushFollow(FOLLOW_rule__Attr__Group_3__0__Impl_in_rule__Attr__Group_3__03660);
            rule__Attr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attr__Group_3__1_in_rule__Attr__Group_3__03663);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1750:1: rule__Attr__Group_3__0__Impl : ( '<-' ) ;
    public final void rule__Attr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1754:1: ( ( '<-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1755:1: ( '<-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1755:1: ( '<-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1756:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getLessThanSignHyphenMinusKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Attr__Group_3__0__Impl3691); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1769:1: rule__Attr__Group_3__1 : rule__Attr__Group_3__1__Impl ;
    public final void rule__Attr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1773:1: ( rule__Attr__Group_3__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1774:2: rule__Attr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Attr__Group_3__1__Impl_in_rule__Attr__Group_3__13722);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1780:1: rule__Attr__Group_3__1__Impl : ( ( rule__Attr__InitAssignment_3_1 ) ) ;
    public final void rule__Attr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1784:1: ( ( ( rule__Attr__InitAssignment_3_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1785:1: ( ( rule__Attr__InitAssignment_3_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1785:1: ( ( rule__Attr__InitAssignment_3_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1786:1: ( rule__Attr__InitAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getInitAssignment_3_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1787:1: ( rule__Attr__InitAssignment_3_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1787:2: rule__Attr__InitAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Attr__InitAssignment_3_1_in_rule__Attr__Group_3__1__Impl3749);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1801:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1805:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1806:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03783);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03786);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1813:1: rule__Method__Group__0__Impl : ( ( rule__Method__NameAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1817:1: ( ( ( rule__Method__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1818:1: ( ( rule__Method__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1818:1: ( ( rule__Method__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1819:1: ( rule__Method__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1820:1: ( rule__Method__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1820:2: rule__Method__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_0_in_rule__Method__Group__0__Impl3813);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1830:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1834:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1835:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13843);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13846);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1842:1: rule__Method__Group__1__Impl : ( '(' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1846:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1847:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1847:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1848:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__Method__Group__1__Impl3874); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1861:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1865:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1866:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23905);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23908);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1873:1: rule__Method__Group__2__Impl : ( ( rule__Method__Group_2__0 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1877:1: ( ( ( rule__Method__Group_2__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1878:1: ( ( rule__Method__Group_2__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1878:1: ( ( rule__Method__Group_2__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1879:1: ( rule__Method__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1880:1: ( rule__Method__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1880:2: rule__Method__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_2__0_in_rule__Method__Group__2__Impl3935);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1890:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1894:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1895:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33966);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33969);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1902:1: rule__Method__Group__3__Impl : ( ')' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1906:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1907:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1907:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1908:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__Method__Group__3__Impl3997); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1921:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1925:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1926:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44028);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44031);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1933:1: rule__Method__Group__4__Impl : ( ':' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1937:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1938:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1938:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1939:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getColonKeyword_4()); 
            }
            match(input,21,FOLLOW_21_in_rule__Method__Group__4__Impl4059); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1952:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1956:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1957:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54090);
            rule__Method__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__6_in_rule__Method__Group__54093);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1964:1: rule__Method__Group__5__Impl : ( ( rule__Method__Return_typeAssignment_5 ) ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1968:1: ( ( ( rule__Method__Return_typeAssignment_5 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1969:1: ( ( rule__Method__Return_typeAssignment_5 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1969:1: ( ( rule__Method__Return_typeAssignment_5 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1970:1: ( rule__Method__Return_typeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturn_typeAssignment_5()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1971:1: ( rule__Method__Return_typeAssignment_5 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1971:2: rule__Method__Return_typeAssignment_5
            {
            pushFollow(FOLLOW_rule__Method__Return_typeAssignment_5_in_rule__Method__Group__5__Impl4120);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1981:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1985:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1986:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__64150);
            rule__Method__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__7_in_rule__Method__Group__64153);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1993:1: rule__Method__Group__6__Impl : ( '{' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1997:1: ( ( '{' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1998:1: ( '{' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1998:1: ( '{' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:1999:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,18,FOLLOW_18_in_rule__Method__Group__6__Impl4181); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2012:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2016:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2017:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__74212);
            rule__Method__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__8_in_rule__Method__Group__74215);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2024:1: rule__Method__Group__7__Impl : ( ( rule__Method__ExprAssignment_7 ) ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2028:1: ( ( ( rule__Method__ExprAssignment_7 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2029:1: ( ( rule__Method__ExprAssignment_7 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2029:1: ( ( rule__Method__ExprAssignment_7 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2030:1: ( rule__Method__ExprAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getExprAssignment_7()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2031:1: ( rule__Method__ExprAssignment_7 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2031:2: rule__Method__ExprAssignment_7
            {
            pushFollow(FOLLOW_rule__Method__ExprAssignment_7_in_rule__Method__Group__7__Impl4242);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2041:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2045:1: ( rule__Method__Group__8__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2046:2: rule__Method__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__8__Impl_in_rule__Method__Group__84272);
            rule__Method__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2052:1: rule__Method__Group__8__Impl : ( '};' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2056:1: ( ( '};' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2057:1: ( '};' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2057:1: ( '};' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2058:1: '};'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightCurlyBracketSemicolonKeyword_8()); 
            }
            match(input,19,FOLLOW_19_in_rule__Method__Group__8__Impl4300); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightCurlyBracketSemicolonKeyword_8()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Method__Group_2__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2089:1: rule__Method__Group_2__0 : rule__Method__Group_2__0__Impl rule__Method__Group_2__1 ;
    public final void rule__Method__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2093:1: ( rule__Method__Group_2__0__Impl rule__Method__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2094:2: rule__Method__Group_2__0__Impl rule__Method__Group_2__1
            {
            pushFollow(FOLLOW_rule__Method__Group_2__0__Impl_in_rule__Method__Group_2__04349);
            rule__Method__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group_2__1_in_rule__Method__Group_2__04352);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2101:1: rule__Method__Group_2__0__Impl : ( ( rule__Method__FormalsAssignment_2_0 ) ) ;
    public final void rule__Method__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2105:1: ( ( ( rule__Method__FormalsAssignment_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2106:1: ( ( rule__Method__FormalsAssignment_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2106:1: ( ( rule__Method__FormalsAssignment_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2107:1: ( rule__Method__FormalsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsAssignment_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2108:1: ( rule__Method__FormalsAssignment_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2108:2: rule__Method__FormalsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Method__FormalsAssignment_2_0_in_rule__Method__Group_2__0__Impl4379);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2118:1: rule__Method__Group_2__1 : rule__Method__Group_2__1__Impl ;
    public final void rule__Method__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2122:1: ( rule__Method__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2123:2: rule__Method__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_2__1__Impl_in_rule__Method__Group_2__14409);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2129:1: rule__Method__Group_2__1__Impl : ( ( rule__Method__Group_2_1__0 )* ) ;
    public final void rule__Method__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2133:1: ( ( ( rule__Method__Group_2_1__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2134:1: ( ( rule__Method__Group_2_1__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2134:1: ( ( rule__Method__Group_2_1__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2135:1: ( rule__Method__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2136:1: ( rule__Method__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2136:2: rule__Method__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_2_1__0_in_rule__Method__Group_2__1__Impl4436);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2150:1: rule__Method__Group_2_1__0 : rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 ;
    public final void rule__Method__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2154:1: ( rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2155:2: rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Method__Group_2_1__0__Impl_in_rule__Method__Group_2_1__04471);
            rule__Method__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group_2_1__1_in_rule__Method__Group_2_1__04474);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2162:1: rule__Method__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2166:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2167:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2167:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2168:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Method__Group_2_1__0__Impl4502); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2181:1: rule__Method__Group_2_1__1 : rule__Method__Group_2_1__1__Impl ;
    public final void rule__Method__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2185:1: ( rule__Method__Group_2_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2186:2: rule__Method__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_2_1__1__Impl_in_rule__Method__Group_2_1__14533);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2192:1: rule__Method__Group_2_1__1__Impl : ( ( rule__Method__FormalsAssignment_2_1_1 ) ) ;
    public final void rule__Method__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2196:1: ( ( ( rule__Method__FormalsAssignment_2_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2197:1: ( ( rule__Method__FormalsAssignment_2_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2197:1: ( ( rule__Method__FormalsAssignment_2_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2198:1: ( rule__Method__FormalsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsAssignment_2_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2199:1: ( rule__Method__FormalsAssignment_2_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2199:2: rule__Method__FormalsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Method__FormalsAssignment_2_1_1_in_rule__Method__Group_2_1__1__Impl4560);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2213:1: rule__Formal__Group__0 : rule__Formal__Group__0__Impl rule__Formal__Group__1 ;
    public final void rule__Formal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2217:1: ( rule__Formal__Group__0__Impl rule__Formal__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2218:2: rule__Formal__Group__0__Impl rule__Formal__Group__1
            {
            pushFollow(FOLLOW_rule__Formal__Group__0__Impl_in_rule__Formal__Group__04594);
            rule__Formal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Formal__Group__1_in_rule__Formal__Group__04597);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2225:1: rule__Formal__Group__0__Impl : ( ( rule__Formal__NameAssignment_0 ) ) ;
    public final void rule__Formal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2229:1: ( ( ( rule__Formal__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2230:1: ( ( rule__Formal__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2230:1: ( ( rule__Formal__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2231:1: ( rule__Formal__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2232:1: ( rule__Formal__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2232:2: rule__Formal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Formal__NameAssignment_0_in_rule__Formal__Group__0__Impl4624);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2242:1: rule__Formal__Group__1 : rule__Formal__Group__1__Impl rule__Formal__Group__2 ;
    public final void rule__Formal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2246:1: ( rule__Formal__Group__1__Impl rule__Formal__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2247:2: rule__Formal__Group__1__Impl rule__Formal__Group__2
            {
            pushFollow(FOLLOW_rule__Formal__Group__1__Impl_in_rule__Formal__Group__14654);
            rule__Formal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Formal__Group__2_in_rule__Formal__Group__14657);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2254:1: rule__Formal__Group__1__Impl : ( ':' ) ;
    public final void rule__Formal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2258:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2259:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2259:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2260:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getColonKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Formal__Group__1__Impl4685); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2273:1: rule__Formal__Group__2 : rule__Formal__Group__2__Impl ;
    public final void rule__Formal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2277:1: ( rule__Formal__Group__2__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2278:2: rule__Formal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Formal__Group__2__Impl_in_rule__Formal__Group__24716);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2284:1: rule__Formal__Group__2__Impl : ( ( rule__Formal__Type_declAssignment_2 ) ) ;
    public final void rule__Formal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2288:1: ( ( ( rule__Formal__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2289:1: ( ( rule__Formal__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2289:1: ( ( rule__Formal__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2290:1: ( rule__Formal__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2291:1: ( rule__Formal__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2291:2: rule__Formal__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__Formal__Type_declAssignment_2_in_rule__Formal__Group__2__Impl4743);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2307:1: rule__SelfTypeLiteral__Group__0 : rule__SelfTypeLiteral__Group__0__Impl rule__SelfTypeLiteral__Group__1 ;
    public final void rule__SelfTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2311:1: ( rule__SelfTypeLiteral__Group__0__Impl rule__SelfTypeLiteral__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2312:2: rule__SelfTypeLiteral__Group__0__Impl rule__SelfTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__SelfTypeLiteral__Group__0__Impl_in_rule__SelfTypeLiteral__Group__04779);
            rule__SelfTypeLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelfTypeLiteral__Group__1_in_rule__SelfTypeLiteral__Group__04782);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2319:1: rule__SelfTypeLiteral__Group__0__Impl : ( () ) ;
    public final void rule__SelfTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2323:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2324:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2324:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2325:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfTypeLiteralAccess().getSelfTypeLiteralAction_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2326:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2328:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2338:1: rule__SelfTypeLiteral__Group__1 : rule__SelfTypeLiteral__Group__1__Impl ;
    public final void rule__SelfTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2342:1: ( rule__SelfTypeLiteral__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2343:2: rule__SelfTypeLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelfTypeLiteral__Group__1__Impl_in_rule__SelfTypeLiteral__Group__14840);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2349:1: rule__SelfTypeLiteral__Group__1__Impl : ( 'self' ) ;
    public final void rule__SelfTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2353:1: ( ( 'self' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2354:1: ( 'self' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2354:1: ( 'self' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2355:1: 'self'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfTypeLiteralAccess().getSelfKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__SelfTypeLiteral__Group__1__Impl4868); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2372:1: rule__ParenExpression__Group__0 : rule__ParenExpression__Group__0__Impl rule__ParenExpression__Group__1 ;
    public final void rule__ParenExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2376:1: ( rule__ParenExpression__Group__0__Impl rule__ParenExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2377:2: rule__ParenExpression__Group__0__Impl rule__ParenExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParenExpression__Group__0__Impl_in_rule__ParenExpression__Group__04903);
            rule__ParenExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenExpression__Group__1_in_rule__ParenExpression__Group__04906);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2384:1: rule__ParenExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2388:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2389:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2389:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2390:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ParenExpression__Group__0__Impl4934); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2403:1: rule__ParenExpression__Group__1 : rule__ParenExpression__Group__1__Impl rule__ParenExpression__Group__2 ;
    public final void rule__ParenExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2407:1: ( rule__ParenExpression__Group__1__Impl rule__ParenExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2408:2: rule__ParenExpression__Group__1__Impl rule__ParenExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParenExpression__Group__1__Impl_in_rule__ParenExpression__Group__14965);
            rule__ParenExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenExpression__Group__2_in_rule__ParenExpression__Group__14968);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2415:1: rule__ParenExpression__Group__1__Impl : ( ( rule__ParenExpression__ExprAssignment_1 ) ) ;
    public final void rule__ParenExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2419:1: ( ( ( rule__ParenExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2420:1: ( ( rule__ParenExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2420:1: ( ( rule__ParenExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2421:1: ( rule__ParenExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2422:1: ( rule__ParenExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2422:2: rule__ParenExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenExpression__ExprAssignment_1_in_rule__ParenExpression__Group__1__Impl4995);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2432:1: rule__ParenExpression__Group__2 : rule__ParenExpression__Group__2__Impl ;
    public final void rule__ParenExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2436:1: ( rule__ParenExpression__Group__2__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2437:2: rule__ParenExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenExpression__Group__2__Impl_in_rule__ParenExpression__Group__25025);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2443:1: rule__ParenExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2447:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2448:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2448:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2449:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__ParenExpression__Group__2__Impl5053); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2468:1: rule__AssignmentExpression__Group__0 : rule__AssignmentExpression__Group__0__Impl rule__AssignmentExpression__Group__1 ;
    public final void rule__AssignmentExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2472:1: ( rule__AssignmentExpression__Group__0__Impl rule__AssignmentExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2473:2: rule__AssignmentExpression__Group__0__Impl rule__AssignmentExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__0__Impl_in_rule__AssignmentExpression__Group__05090);
            rule__AssignmentExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__1_in_rule__AssignmentExpression__Group__05093);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2480:1: rule__AssignmentExpression__Group__0__Impl : ( ( rule__AssignmentExpression__NameAssignment_0 ) ) ;
    public final void rule__AssignmentExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2484:1: ( ( ( rule__AssignmentExpression__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2485:1: ( ( rule__AssignmentExpression__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2485:1: ( ( rule__AssignmentExpression__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2486:1: ( rule__AssignmentExpression__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2487:1: ( rule__AssignmentExpression__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2487:2: rule__AssignmentExpression__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__NameAssignment_0_in_rule__AssignmentExpression__Group__0__Impl5120);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2497:1: rule__AssignmentExpression__Group__1 : rule__AssignmentExpression__Group__1__Impl rule__AssignmentExpression__Group__2 ;
    public final void rule__AssignmentExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2501:1: ( rule__AssignmentExpression__Group__1__Impl rule__AssignmentExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2502:2: rule__AssignmentExpression__Group__1__Impl rule__AssignmentExpression__Group__2
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__1__Impl_in_rule__AssignmentExpression__Group__15150);
            rule__AssignmentExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__2_in_rule__AssignmentExpression__Group__15153);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2509:1: rule__AssignmentExpression__Group__1__Impl : ( '<-' ) ;
    public final void rule__AssignmentExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2513:1: ( ( '<-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2514:1: ( '<-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2514:1: ( '<-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2515:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getLessThanSignHyphenMinusKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__AssignmentExpression__Group__1__Impl5181); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2528:1: rule__AssignmentExpression__Group__2 : rule__AssignmentExpression__Group__2__Impl ;
    public final void rule__AssignmentExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2532:1: ( rule__AssignmentExpression__Group__2__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2533:2: rule__AssignmentExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Group__2__Impl_in_rule__AssignmentExpression__Group__25212);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2539:1: rule__AssignmentExpression__Group__2__Impl : ( ( rule__AssignmentExpression__ExprAssignment_2 ) ) ;
    public final void rule__AssignmentExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2543:1: ( ( ( rule__AssignmentExpression__ExprAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2544:1: ( ( rule__AssignmentExpression__ExprAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2544:1: ( ( rule__AssignmentExpression__ExprAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2545:1: ( rule__AssignmentExpression__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getExprAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2546:1: ( rule__AssignmentExpression__ExprAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2546:2: rule__AssignmentExpression__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__ExprAssignment_2_in_rule__AssignmentExpression__Group__2__Impl5239);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2562:1: rule__NegationExpression__Group__0 : rule__NegationExpression__Group__0__Impl rule__NegationExpression__Group__1 ;
    public final void rule__NegationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2566:1: ( rule__NegationExpression__Group__0__Impl rule__NegationExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2567:2: rule__NegationExpression__Group__0__Impl rule__NegationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group__0__Impl_in_rule__NegationExpression__Group__05275);
            rule__NegationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NegationExpression__Group__1_in_rule__NegationExpression__Group__05278);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2574:1: rule__NegationExpression__Group__0__Impl : ( 'not' ) ;
    public final void rule__NegationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2578:1: ( ( 'not' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2579:1: ( 'not' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2579:1: ( 'not' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2580:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationExpressionAccess().getNotKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__NegationExpression__Group__0__Impl5306); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2593:1: rule__NegationExpression__Group__1 : rule__NegationExpression__Group__1__Impl ;
    public final void rule__NegationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2597:1: ( rule__NegationExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2598:2: rule__NegationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group__1__Impl_in_rule__NegationExpression__Group__15337);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2604:1: rule__NegationExpression__Group__1__Impl : ( ( rule__NegationExpression__ExprAssignment_1 ) ) ;
    public final void rule__NegationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2608:1: ( ( ( rule__NegationExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2609:1: ( ( rule__NegationExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2609:1: ( ( rule__NegationExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2610:1: ( rule__NegationExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2611:1: ( rule__NegationExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2611:2: rule__NegationExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__NegationExpression__ExprAssignment_1_in_rule__NegationExpression__Group__1__Impl5364);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2625:1: rule__IntegerComposite__Group__0 : rule__IntegerComposite__Group__0__Impl rule__IntegerComposite__Group__1 ;
    public final void rule__IntegerComposite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2629:1: ( rule__IntegerComposite__Group__0__Impl rule__IntegerComposite__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2630:2: rule__IntegerComposite__Group__0__Impl rule__IntegerComposite__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerComposite__Group__0__Impl_in_rule__IntegerComposite__Group__05398);
            rule__IntegerComposite__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IntegerComposite__Group__1_in_rule__IntegerComposite__Group__05401);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2637:1: rule__IntegerComposite__Group__0__Impl : ( '~' ) ;
    public final void rule__IntegerComposite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2641:1: ( ( '~' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2642:1: ( '~' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2642:1: ( '~' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2643:1: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeAccess().getTildeKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__IntegerComposite__Group__0__Impl5429); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2656:1: rule__IntegerComposite__Group__1 : rule__IntegerComposite__Group__1__Impl ;
    public final void rule__IntegerComposite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2660:1: ( rule__IntegerComposite__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2661:2: rule__IntegerComposite__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerComposite__Group__1__Impl_in_rule__IntegerComposite__Group__15460);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2667:1: rule__IntegerComposite__Group__1__Impl : ( ( rule__IntegerComposite__ExprAssignment_1 ) ) ;
    public final void rule__IntegerComposite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2671:1: ( ( ( rule__IntegerComposite__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2672:1: ( ( rule__IntegerComposite__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2672:1: ( ( rule__IntegerComposite__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2673:1: ( rule__IntegerComposite__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2674:1: ( rule__IntegerComposite__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2674:2: rule__IntegerComposite__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__IntegerComposite__ExprAssignment_1_in_rule__IntegerComposite__Group__1__Impl5487);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2688:1: rule__DispatchExpression__Group__0 : rule__DispatchExpression__Group__0__Impl rule__DispatchExpression__Group__1 ;
    public final void rule__DispatchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2692:1: ( rule__DispatchExpression__Group__0__Impl rule__DispatchExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2693:2: rule__DispatchExpression__Group__0__Impl rule__DispatchExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group__0__Impl_in_rule__DispatchExpression__Group__05521);
            rule__DispatchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group__1_in_rule__DispatchExpression__Group__05524);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2700:1: rule__DispatchExpression__Group__0__Impl : ( ruleCompareExpression ) ;
    public final void rule__DispatchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2704:1: ( ( ruleCompareExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2705:1: ( ruleCompareExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2705:1: ( ruleCompareExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2706:1: ruleCompareExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getCompareExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_rule__DispatchExpression__Group__0__Impl5551);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2717:1: rule__DispatchExpression__Group__1 : rule__DispatchExpression__Group__1__Impl ;
    public final void rule__DispatchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2721:1: ( rule__DispatchExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2722:2: rule__DispatchExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group__1__Impl_in_rule__DispatchExpression__Group__15580);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2728:1: rule__DispatchExpression__Group__1__Impl : ( ( rule__DispatchExpression__Group_1__0 )? ) ;
    public final void rule__DispatchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2732:1: ( ( ( rule__DispatchExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2733:1: ( ( rule__DispatchExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2733:1: ( ( rule__DispatchExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2734:1: ( rule__DispatchExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2735:1: ( rule__DispatchExpression__Group_1__0 )?
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
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2735:2: rule__DispatchExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1__0_in_rule__DispatchExpression__Group__1__Impl5607);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2749:1: rule__DispatchExpression__Group_1__0 : rule__DispatchExpression__Group_1__0__Impl rule__DispatchExpression__Group_1__1 ;
    public final void rule__DispatchExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2753:1: ( rule__DispatchExpression__Group_1__0__Impl rule__DispatchExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2754:2: rule__DispatchExpression__Group_1__0__Impl rule__DispatchExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__0__Impl_in_rule__DispatchExpression__Group_1__05642);
            rule__DispatchExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__1_in_rule__DispatchExpression__Group_1__05645);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2761:1: rule__DispatchExpression__Group_1__0__Impl : ( ( rule__DispatchExpression__Group_1_0__0 ) ) ;
    public final void rule__DispatchExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2765:1: ( ( ( rule__DispatchExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2766:1: ( ( rule__DispatchExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2766:1: ( ( rule__DispatchExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2767:1: ( rule__DispatchExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2768:1: ( rule__DispatchExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2768:2: rule__DispatchExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0__0_in_rule__DispatchExpression__Group_1__0__Impl5672);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2778:1: rule__DispatchExpression__Group_1__1 : rule__DispatchExpression__Group_1__1__Impl rule__DispatchExpression__Group_1__2 ;
    public final void rule__DispatchExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2782:1: ( rule__DispatchExpression__Group_1__1__Impl rule__DispatchExpression__Group_1__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2783:2: rule__DispatchExpression__Group_1__1__Impl rule__DispatchExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__1__Impl_in_rule__DispatchExpression__Group_1__15702);
            rule__DispatchExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__2_in_rule__DispatchExpression__Group_1__15705);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2790:1: rule__DispatchExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__DispatchExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2794:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2795:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2795:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2796:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__DispatchExpression__Group_1__1__Impl5733); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2809:1: rule__DispatchExpression__Group_1__2 : rule__DispatchExpression__Group_1__2__Impl rule__DispatchExpression__Group_1__3 ;
    public final void rule__DispatchExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2813:1: ( rule__DispatchExpression__Group_1__2__Impl rule__DispatchExpression__Group_1__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2814:2: rule__DispatchExpression__Group_1__2__Impl rule__DispatchExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__2__Impl_in_rule__DispatchExpression__Group_1__25764);
            rule__DispatchExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__3_in_rule__DispatchExpression__Group_1__25767);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2821:1: rule__DispatchExpression__Group_1__2__Impl : ( ( rule__DispatchExpression__Group_1_2__0 )? ) ;
    public final void rule__DispatchExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2825:1: ( ( ( rule__DispatchExpression__Group_1_2__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2826:1: ( ( rule__DispatchExpression__Group_1_2__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2826:1: ( ( rule__DispatchExpression__Group_1_2__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2827:1: ( rule__DispatchExpression__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2828:1: ( rule__DispatchExpression__Group_1_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||(LA16_0>=14 && LA16_0<=16)||LA16_0==18||LA16_0==24||(LA16_0>=27 && LA16_0<=28)||LA16_0==31||LA16_0==35||LA16_0==39||LA16_0==41||(LA16_0>=45 && LA16_0<=46)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2828:2: rule__DispatchExpression__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__0_in_rule__DispatchExpression__Group_1__2__Impl5794);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2838:1: rule__DispatchExpression__Group_1__3 : rule__DispatchExpression__Group_1__3__Impl ;
    public final void rule__DispatchExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2842:1: ( rule__DispatchExpression__Group_1__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2843:2: rule__DispatchExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1__3__Impl_in_rule__DispatchExpression__Group_1__35825);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2849:1: rule__DispatchExpression__Group_1__3__Impl : ( ')' ) ;
    public final void rule__DispatchExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2853:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2854:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2854:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2855:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__DispatchExpression__Group_1__3__Impl5853); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2876:1: rule__DispatchExpression__Group_1_0__0 : rule__DispatchExpression__Group_1_0__0__Impl ;
    public final void rule__DispatchExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2880:1: ( rule__DispatchExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2881:2: rule__DispatchExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0__0__Impl_in_rule__DispatchExpression__Group_1_0__05892);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2887:1: rule__DispatchExpression__Group_1_0__0__Impl : ( ( rule__DispatchExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DispatchExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2891:1: ( ( ( rule__DispatchExpression__Group_1_0_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2892:1: ( ( rule__DispatchExpression__Group_1_0_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2892:1: ( ( rule__DispatchExpression__Group_1_0_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2893:1: ( rule__DispatchExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2894:1: ( rule__DispatchExpression__Group_1_0_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2894:2: rule__DispatchExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__0_in_rule__DispatchExpression__Group_1_0__0__Impl5919);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2906:1: rule__DispatchExpression__Group_1_0_0__0 : rule__DispatchExpression__Group_1_0_0__0__Impl rule__DispatchExpression__Group_1_0_0__1 ;
    public final void rule__DispatchExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2910:1: ( rule__DispatchExpression__Group_1_0_0__0__Impl rule__DispatchExpression__Group_1_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2911:2: rule__DispatchExpression__Group_1_0_0__0__Impl rule__DispatchExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__0__Impl_in_rule__DispatchExpression__Group_1_0_0__05951);
            rule__DispatchExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__1_in_rule__DispatchExpression__Group_1_0_0__05954);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2918:1: rule__DispatchExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DispatchExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2922:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2923:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2923:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2924:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2925:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2927:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2937:1: rule__DispatchExpression__Group_1_0_0__1 : rule__DispatchExpression__Group_1_0_0__1__Impl rule__DispatchExpression__Group_1_0_0__2 ;
    public final void rule__DispatchExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2941:1: ( rule__DispatchExpression__Group_1_0_0__1__Impl rule__DispatchExpression__Group_1_0_0__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2942:2: rule__DispatchExpression__Group_1_0_0__1__Impl rule__DispatchExpression__Group_1_0_0__2
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__1__Impl_in_rule__DispatchExpression__Group_1_0_0__16012);
            rule__DispatchExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__2_in_rule__DispatchExpression__Group_1_0_0__16015);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2949:1: rule__DispatchExpression__Group_1_0_0__1__Impl : ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? ) ;
    public final void rule__DispatchExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2953:1: ( ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2954:1: ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2954:1: ( ( rule__DispatchExpression__Group_1_0_0_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2955:1: ( rule__DispatchExpression__Group_1_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_0_0_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2956:1: ( rule__DispatchExpression__Group_1_0_0_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2956:2: rule__DispatchExpression__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0_in_rule__DispatchExpression__Group_1_0_0__1__Impl6042);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2966:1: rule__DispatchExpression__Group_1_0_0__2 : rule__DispatchExpression__Group_1_0_0__2__Impl rule__DispatchExpression__Group_1_0_0__3 ;
    public final void rule__DispatchExpression__Group_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2970:1: ( rule__DispatchExpression__Group_1_0_0__2__Impl rule__DispatchExpression__Group_1_0_0__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2971:2: rule__DispatchExpression__Group_1_0_0__2__Impl rule__DispatchExpression__Group_1_0_0__3
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__2__Impl_in_rule__DispatchExpression__Group_1_0_0__26073);
            rule__DispatchExpression__Group_1_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__3_in_rule__DispatchExpression__Group_1_0_0__26076);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2978:1: rule__DispatchExpression__Group_1_0_0__2__Impl : ( '.' ) ;
    public final void rule__DispatchExpression__Group_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2982:1: ( ( '.' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2983:1: ( '.' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2983:1: ( '.' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2984:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getFullStopKeyword_1_0_0_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__DispatchExpression__Group_1_0_0__2__Impl6104); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2997:1: rule__DispatchExpression__Group_1_0_0__3 : rule__DispatchExpression__Group_1_0_0__3__Impl ;
    public final void rule__DispatchExpression__Group_1_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3001:1: ( rule__DispatchExpression__Group_1_0_0__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3002:2: rule__DispatchExpression__Group_1_0_0__3__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0__3__Impl_in_rule__DispatchExpression__Group_1_0_0__36135);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3008:1: rule__DispatchExpression__Group_1_0_0__3__Impl : ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) ) ;
    public final void rule__DispatchExpression__Group_1_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3012:1: ( ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3013:1: ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3013:1: ( ( rule__DispatchExpression__RefAssignment_1_0_0_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3014:1: ( rule__DispatchExpression__RefAssignment_1_0_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getRefAssignment_1_0_0_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3015:1: ( rule__DispatchExpression__RefAssignment_1_0_0_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3015:2: rule__DispatchExpression__RefAssignment_1_0_0_3
            {
            pushFollow(FOLLOW_rule__DispatchExpression__RefAssignment_1_0_0_3_in_rule__DispatchExpression__Group_1_0_0__3__Impl6162);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3033:1: rule__DispatchExpression__Group_1_0_0_1__0 : rule__DispatchExpression__Group_1_0_0_1__0__Impl rule__DispatchExpression__Group_1_0_0_1__1 ;
    public final void rule__DispatchExpression__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3037:1: ( rule__DispatchExpression__Group_1_0_0_1__0__Impl rule__DispatchExpression__Group_1_0_0_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3038:2: rule__DispatchExpression__Group_1_0_0_1__0__Impl rule__DispatchExpression__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0__Impl_in_rule__DispatchExpression__Group_1_0_0_1__06200);
            rule__DispatchExpression__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1_in_rule__DispatchExpression__Group_1_0_0_1__06203);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3045:1: rule__DispatchExpression__Group_1_0_0_1__0__Impl : ( '@' ) ;
    public final void rule__DispatchExpression__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3049:1: ( ( '@' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3050:1: ( '@' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3050:1: ( '@' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3051:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getCommercialAtKeyword_1_0_0_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__DispatchExpression__Group_1_0_0_1__0__Impl6231); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3064:1: rule__DispatchExpression__Group_1_0_0_1__1 : rule__DispatchExpression__Group_1_0_0_1__1__Impl ;
    public final void rule__DispatchExpression__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3068:1: ( rule__DispatchExpression__Group_1_0_0_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3069:2: rule__DispatchExpression__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1__Impl_in_rule__DispatchExpression__Group_1_0_0_1__16262);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3075:1: rule__DispatchExpression__Group_1_0_0_1__1__Impl : ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) ) ;
    public final void rule__DispatchExpression__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3079:1: ( ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3080:1: ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3080:1: ( ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3081:1: ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getType_nameAssignment_1_0_0_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3082:1: ( rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3082:2: rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1_in_rule__DispatchExpression__Group_1_0_0_1__1__Impl6289);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3096:1: rule__DispatchExpression__Group_1_2__0 : rule__DispatchExpression__Group_1_2__0__Impl rule__DispatchExpression__Group_1_2__1 ;
    public final void rule__DispatchExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3100:1: ( rule__DispatchExpression__Group_1_2__0__Impl rule__DispatchExpression__Group_1_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3101:2: rule__DispatchExpression__Group_1_2__0__Impl rule__DispatchExpression__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__0__Impl_in_rule__DispatchExpression__Group_1_2__06323);
            rule__DispatchExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__1_in_rule__DispatchExpression__Group_1_2__06326);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3108:1: rule__DispatchExpression__Group_1_2__0__Impl : ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) ) ;
    public final void rule__DispatchExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3112:1: ( ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3113:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3113:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3114:1: ( rule__DispatchExpression__ActualAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualAssignment_1_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3115:1: ( rule__DispatchExpression__ActualAssignment_1_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3115:2: rule__DispatchExpression__ActualAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_0_in_rule__DispatchExpression__Group_1_2__0__Impl6353);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3125:1: rule__DispatchExpression__Group_1_2__1 : rule__DispatchExpression__Group_1_2__1__Impl ;
    public final void rule__DispatchExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3129:1: ( rule__DispatchExpression__Group_1_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3130:2: rule__DispatchExpression__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2__1__Impl_in_rule__DispatchExpression__Group_1_2__16383);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3136:1: rule__DispatchExpression__Group_1_2__1__Impl : ( ( rule__DispatchExpression__Group_1_2_1__0 )* ) ;
    public final void rule__DispatchExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3140:1: ( ( ( rule__DispatchExpression__Group_1_2_1__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3141:1: ( ( rule__DispatchExpression__Group_1_2_1__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3141:1: ( ( rule__DispatchExpression__Group_1_2_1__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3142:1: ( rule__DispatchExpression__Group_1_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getGroup_1_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3143:1: ( rule__DispatchExpression__Group_1_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3143:2: rule__DispatchExpression__Group_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__0_in_rule__DispatchExpression__Group_1_2__1__Impl6410);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3157:1: rule__DispatchExpression__Group_1_2_1__0 : rule__DispatchExpression__Group_1_2_1__0__Impl rule__DispatchExpression__Group_1_2_1__1 ;
    public final void rule__DispatchExpression__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3161:1: ( rule__DispatchExpression__Group_1_2_1__0__Impl rule__DispatchExpression__Group_1_2_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3162:2: rule__DispatchExpression__Group_1_2_1__0__Impl rule__DispatchExpression__Group_1_2_1__1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__0__Impl_in_rule__DispatchExpression__Group_1_2_1__06445);
            rule__DispatchExpression__Group_1_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__1_in_rule__DispatchExpression__Group_1_2_1__06448);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3169:1: rule__DispatchExpression__Group_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__DispatchExpression__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3173:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3174:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3174:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3175:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getCommaKeyword_1_2_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__DispatchExpression__Group_1_2_1__0__Impl6476); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3188:1: rule__DispatchExpression__Group_1_2_1__1 : rule__DispatchExpression__Group_1_2_1__1__Impl ;
    public final void rule__DispatchExpression__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3192:1: ( rule__DispatchExpression__Group_1_2_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3193:2: rule__DispatchExpression__Group_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DispatchExpression__Group_1_2_1__1__Impl_in_rule__DispatchExpression__Group_1_2_1__16507);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3199:1: rule__DispatchExpression__Group_1_2_1__1__Impl : ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) ) ;
    public final void rule__DispatchExpression__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3203:1: ( ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3204:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3204:1: ( ( rule__DispatchExpression__ActualAssignment_1_2_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3205:1: ( rule__DispatchExpression__ActualAssignment_1_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualAssignment_1_2_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3206:1: ( rule__DispatchExpression__ActualAssignment_1_2_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3206:2: rule__DispatchExpression__ActualAssignment_1_2_1_1
            {
            pushFollow(FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_1_1_in_rule__DispatchExpression__Group_1_2_1__1__Impl6534);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3220:1: rule__StaticDispatchExpression__Group__0 : rule__StaticDispatchExpression__Group__0__Impl rule__StaticDispatchExpression__Group__1 ;
    public final void rule__StaticDispatchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3224:1: ( rule__StaticDispatchExpression__Group__0__Impl rule__StaticDispatchExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3225:2: rule__StaticDispatchExpression__Group__0__Impl rule__StaticDispatchExpression__Group__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__0__Impl_in_rule__StaticDispatchExpression__Group__06568);
            rule__StaticDispatchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__1_in_rule__StaticDispatchExpression__Group__06571);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3232:1: rule__StaticDispatchExpression__Group__0__Impl : ( ( rule__StaticDispatchExpression__RefAssignment_0 ) ) ;
    public final void rule__StaticDispatchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3236:1: ( ( ( rule__StaticDispatchExpression__RefAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3237:1: ( ( rule__StaticDispatchExpression__RefAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3237:1: ( ( rule__StaticDispatchExpression__RefAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3238:1: ( rule__StaticDispatchExpression__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getRefAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3239:1: ( rule__StaticDispatchExpression__RefAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3239:2: rule__StaticDispatchExpression__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__RefAssignment_0_in_rule__StaticDispatchExpression__Group__0__Impl6598);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3249:1: rule__StaticDispatchExpression__Group__1 : rule__StaticDispatchExpression__Group__1__Impl rule__StaticDispatchExpression__Group__2 ;
    public final void rule__StaticDispatchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3253:1: ( rule__StaticDispatchExpression__Group__1__Impl rule__StaticDispatchExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3254:2: rule__StaticDispatchExpression__Group__1__Impl rule__StaticDispatchExpression__Group__2
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__1__Impl_in_rule__StaticDispatchExpression__Group__16628);
            rule__StaticDispatchExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__2_in_rule__StaticDispatchExpression__Group__16631);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3261:1: rule__StaticDispatchExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__StaticDispatchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3265:1: ( ( '(' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3266:1: ( '(' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3266:1: ( '(' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3267:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__StaticDispatchExpression__Group__1__Impl6659); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3280:1: rule__StaticDispatchExpression__Group__2 : rule__StaticDispatchExpression__Group__2__Impl rule__StaticDispatchExpression__Group__3 ;
    public final void rule__StaticDispatchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3284:1: ( rule__StaticDispatchExpression__Group__2__Impl rule__StaticDispatchExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3285:2: rule__StaticDispatchExpression__Group__2__Impl rule__StaticDispatchExpression__Group__3
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__2__Impl_in_rule__StaticDispatchExpression__Group__26690);
            rule__StaticDispatchExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__3_in_rule__StaticDispatchExpression__Group__26693);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3292:1: rule__StaticDispatchExpression__Group__2__Impl : ( ( rule__StaticDispatchExpression__Group_2__0 )? ) ;
    public final void rule__StaticDispatchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3296:1: ( ( ( rule__StaticDispatchExpression__Group_2__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3297:1: ( ( rule__StaticDispatchExpression__Group_2__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3297:1: ( ( rule__StaticDispatchExpression__Group_2__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3298:1: ( rule__StaticDispatchExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3299:1: ( rule__StaticDispatchExpression__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=14 && LA19_0<=16)||LA19_0==18||LA19_0==24||(LA19_0>=27 && LA19_0<=28)||LA19_0==31||LA19_0==35||LA19_0==39||LA19_0==41||(LA19_0>=45 && LA19_0<=46)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3299:2: rule__StaticDispatchExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__0_in_rule__StaticDispatchExpression__Group__2__Impl6720);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3309:1: rule__StaticDispatchExpression__Group__3 : rule__StaticDispatchExpression__Group__3__Impl ;
    public final void rule__StaticDispatchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3313:1: ( rule__StaticDispatchExpression__Group__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3314:2: rule__StaticDispatchExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group__3__Impl_in_rule__StaticDispatchExpression__Group__36751);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3320:1: rule__StaticDispatchExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__StaticDispatchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3324:1: ( ( ')' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3325:1: ( ')' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3325:1: ( ')' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3326:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__StaticDispatchExpression__Group__3__Impl6779); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3347:1: rule__StaticDispatchExpression__Group_2__0 : rule__StaticDispatchExpression__Group_2__0__Impl rule__StaticDispatchExpression__Group_2__1 ;
    public final void rule__StaticDispatchExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3351:1: ( rule__StaticDispatchExpression__Group_2__0__Impl rule__StaticDispatchExpression__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3352:2: rule__StaticDispatchExpression__Group_2__0__Impl rule__StaticDispatchExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__0__Impl_in_rule__StaticDispatchExpression__Group_2__06818);
            rule__StaticDispatchExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__1_in_rule__StaticDispatchExpression__Group_2__06821);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3359:1: rule__StaticDispatchExpression__Group_2__0__Impl : ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) ) ;
    public final void rule__StaticDispatchExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3363:1: ( ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3364:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3364:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3365:1: ( rule__StaticDispatchExpression__ActualAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualAssignment_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3366:1: ( rule__StaticDispatchExpression__ActualAssignment_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3366:2: rule__StaticDispatchExpression__ActualAssignment_2_0
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_0_in_rule__StaticDispatchExpression__Group_2__0__Impl6848);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3376:1: rule__StaticDispatchExpression__Group_2__1 : rule__StaticDispatchExpression__Group_2__1__Impl ;
    public final void rule__StaticDispatchExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3380:1: ( rule__StaticDispatchExpression__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3381:2: rule__StaticDispatchExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2__1__Impl_in_rule__StaticDispatchExpression__Group_2__16878);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3387:1: rule__StaticDispatchExpression__Group_2__1__Impl : ( ( rule__StaticDispatchExpression__Group_2_1__0 )* ) ;
    public final void rule__StaticDispatchExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3391:1: ( ( ( rule__StaticDispatchExpression__Group_2_1__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3392:1: ( ( rule__StaticDispatchExpression__Group_2_1__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3392:1: ( ( rule__StaticDispatchExpression__Group_2_1__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3393:1: ( rule__StaticDispatchExpression__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getGroup_2_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3394:1: ( rule__StaticDispatchExpression__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3394:2: rule__StaticDispatchExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__0_in_rule__StaticDispatchExpression__Group_2__1__Impl6905);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3408:1: rule__StaticDispatchExpression__Group_2_1__0 : rule__StaticDispatchExpression__Group_2_1__0__Impl rule__StaticDispatchExpression__Group_2_1__1 ;
    public final void rule__StaticDispatchExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3412:1: ( rule__StaticDispatchExpression__Group_2_1__0__Impl rule__StaticDispatchExpression__Group_2_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3413:2: rule__StaticDispatchExpression__Group_2_1__0__Impl rule__StaticDispatchExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__0__Impl_in_rule__StaticDispatchExpression__Group_2_1__06940);
            rule__StaticDispatchExpression__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__1_in_rule__StaticDispatchExpression__Group_2_1__06943);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3420:1: rule__StaticDispatchExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__StaticDispatchExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3424:1: ( ( ',' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3425:1: ( ',' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3425:1: ( ',' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3426:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__StaticDispatchExpression__Group_2_1__0__Impl6971); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3439:1: rule__StaticDispatchExpression__Group_2_1__1 : rule__StaticDispatchExpression__Group_2_1__1__Impl ;
    public final void rule__StaticDispatchExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3443:1: ( rule__StaticDispatchExpression__Group_2_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3444:2: rule__StaticDispatchExpression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__Group_2_1__1__Impl_in_rule__StaticDispatchExpression__Group_2_1__17002);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3450:1: rule__StaticDispatchExpression__Group_2_1__1__Impl : ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) ) ;
    public final void rule__StaticDispatchExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3454:1: ( ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3455:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3455:1: ( ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3456:1: ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualAssignment_2_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3457:1: ( rule__StaticDispatchExpression__ActualAssignment_2_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3457:2: rule__StaticDispatchExpression__ActualAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_1_1_in_rule__StaticDispatchExpression__Group_2_1__1__Impl7029);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3471:1: rule__ConditionalExpression__Group__0 : rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 ;
    public final void rule__ConditionalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3475:1: ( rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3476:2: rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__07063);
            rule__ConditionalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__07066);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3483:1: rule__ConditionalExpression__Group__0__Impl : ( 'if' ) ;
    public final void rule__ConditionalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3487:1: ( ( 'if' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3488:1: ( 'if' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3488:1: ( 'if' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3489:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getIfKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ConditionalExpression__Group__0__Impl7094); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3502:1: rule__ConditionalExpression__Group__1 : rule__ConditionalExpression__Group__1__Impl rule__ConditionalExpression__Group__2 ;
    public final void rule__ConditionalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3506:1: ( rule__ConditionalExpression__Group__1__Impl rule__ConditionalExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3507:2: rule__ConditionalExpression__Group__1__Impl rule__ConditionalExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__17125);
            rule__ConditionalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__2_in_rule__ConditionalExpression__Group__17128);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3514:1: rule__ConditionalExpression__Group__1__Impl : ( ( rule__ConditionalExpression__PredAssignment_1 ) ) ;
    public final void rule__ConditionalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3518:1: ( ( ( rule__ConditionalExpression__PredAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3519:1: ( ( rule__ConditionalExpression__PredAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3519:1: ( ( rule__ConditionalExpression__PredAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3520:1: ( rule__ConditionalExpression__PredAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getPredAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3521:1: ( rule__ConditionalExpression__PredAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3521:2: rule__ConditionalExpression__PredAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__PredAssignment_1_in_rule__ConditionalExpression__Group__1__Impl7155);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3531:1: rule__ConditionalExpression__Group__2 : rule__ConditionalExpression__Group__2__Impl rule__ConditionalExpression__Group__3 ;
    public final void rule__ConditionalExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3535:1: ( rule__ConditionalExpression__Group__2__Impl rule__ConditionalExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3536:2: rule__ConditionalExpression__Group__2__Impl rule__ConditionalExpression__Group__3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__2__Impl_in_rule__ConditionalExpression__Group__27185);
            rule__ConditionalExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__3_in_rule__ConditionalExpression__Group__27188);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3543:1: rule__ConditionalExpression__Group__2__Impl : ( 'then' ) ;
    public final void rule__ConditionalExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3547:1: ( ( 'then' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3548:1: ( 'then' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3548:1: ( 'then' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3549:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getThenKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ConditionalExpression__Group__2__Impl7216); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3562:1: rule__ConditionalExpression__Group__3 : rule__ConditionalExpression__Group__3__Impl rule__ConditionalExpression__Group__4 ;
    public final void rule__ConditionalExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3566:1: ( rule__ConditionalExpression__Group__3__Impl rule__ConditionalExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3567:2: rule__ConditionalExpression__Group__3__Impl rule__ConditionalExpression__Group__4
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__3__Impl_in_rule__ConditionalExpression__Group__37247);
            rule__ConditionalExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__4_in_rule__ConditionalExpression__Group__37250);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3574:1: rule__ConditionalExpression__Group__3__Impl : ( ( rule__ConditionalExpression__Then_expAssignment_3 ) ) ;
    public final void rule__ConditionalExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3578:1: ( ( ( rule__ConditionalExpression__Then_expAssignment_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3579:1: ( ( rule__ConditionalExpression__Then_expAssignment_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3579:1: ( ( rule__ConditionalExpression__Then_expAssignment_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3580:1: ( rule__ConditionalExpression__Then_expAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getThen_expAssignment_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3581:1: ( rule__ConditionalExpression__Then_expAssignment_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3581:2: rule__ConditionalExpression__Then_expAssignment_3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Then_expAssignment_3_in_rule__ConditionalExpression__Group__3__Impl7277);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3591:1: rule__ConditionalExpression__Group__4 : rule__ConditionalExpression__Group__4__Impl rule__ConditionalExpression__Group__5 ;
    public final void rule__ConditionalExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3595:1: ( rule__ConditionalExpression__Group__4__Impl rule__ConditionalExpression__Group__5 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3596:2: rule__ConditionalExpression__Group__4__Impl rule__ConditionalExpression__Group__5
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__4__Impl_in_rule__ConditionalExpression__Group__47307);
            rule__ConditionalExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__5_in_rule__ConditionalExpression__Group__47310);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3603:1: rule__ConditionalExpression__Group__4__Impl : ( 'else' ) ;
    public final void rule__ConditionalExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3607:1: ( ( 'else' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3608:1: ( 'else' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3608:1: ( 'else' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3609:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getElseKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__ConditionalExpression__Group__4__Impl7338); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getElseKeyword_4()); 
            }

            }


            }

        }
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3622:1: rule__ConditionalExpression__Group__5 : rule__ConditionalExpression__Group__5__Impl rule__ConditionalExpression__Group__6 ;
    public final void rule__ConditionalExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3626:1: ( rule__ConditionalExpression__Group__5__Impl rule__ConditionalExpression__Group__6 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3627:2: rule__ConditionalExpression__Group__5__Impl rule__ConditionalExpression__Group__6
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__5__Impl_in_rule__ConditionalExpression__Group__57369);
            rule__ConditionalExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__6_in_rule__ConditionalExpression__Group__57372);
            rule__ConditionalExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3634:1: rule__ConditionalExpression__Group__5__Impl : ( ( rule__ConditionalExpression__Else_expAssignment_5 ) ) ;
    public final void rule__ConditionalExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3638:1: ( ( ( rule__ConditionalExpression__Else_expAssignment_5 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3639:1: ( ( rule__ConditionalExpression__Else_expAssignment_5 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3639:1: ( ( rule__ConditionalExpression__Else_expAssignment_5 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3640:1: ( rule__ConditionalExpression__Else_expAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getElse_expAssignment_5()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3641:1: ( rule__ConditionalExpression__Else_expAssignment_5 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3641:2: rule__ConditionalExpression__Else_expAssignment_5
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Else_expAssignment_5_in_rule__ConditionalExpression__Group__5__Impl7399);
            rule__ConditionalExpression__Else_expAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getElse_expAssignment_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ConditionalExpression__Group__6"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3651:1: rule__ConditionalExpression__Group__6 : rule__ConditionalExpression__Group__6__Impl ;
    public final void rule__ConditionalExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3655:1: ( rule__ConditionalExpression__Group__6__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3656:2: rule__ConditionalExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__6__Impl_in_rule__ConditionalExpression__Group__67429);
            rule__ConditionalExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__6"


    // $ANTLR start "rule__ConditionalExpression__Group__6__Impl"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3662:1: rule__ConditionalExpression__Group__6__Impl : ( 'fi' ) ;
    public final void rule__ConditionalExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3666:1: ( ( 'fi' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3667:1: ( 'fi' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3667:1: ( 'fi' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3668:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getFiKeyword_6()); 
            }
            match(input,34,FOLLOW_34_in_rule__ConditionalExpression__Group__6__Impl7457); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getFiKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__6__Impl"


    // $ANTLR start "rule__LoopExpression__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3695:1: rule__LoopExpression__Group__0 : rule__LoopExpression__Group__0__Impl rule__LoopExpression__Group__1 ;
    public final void rule__LoopExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3699:1: ( rule__LoopExpression__Group__0__Impl rule__LoopExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3700:2: rule__LoopExpression__Group__0__Impl rule__LoopExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__0__Impl_in_rule__LoopExpression__Group__07502);
            rule__LoopExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__1_in_rule__LoopExpression__Group__07505);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3707:1: rule__LoopExpression__Group__0__Impl : ( 'while' ) ;
    public final void rule__LoopExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3711:1: ( ( 'while' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3712:1: ( 'while' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3712:1: ( 'while' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3713:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getWhileKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__LoopExpression__Group__0__Impl7533); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3726:1: rule__LoopExpression__Group__1 : rule__LoopExpression__Group__1__Impl rule__LoopExpression__Group__2 ;
    public final void rule__LoopExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3730:1: ( rule__LoopExpression__Group__1__Impl rule__LoopExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3731:2: rule__LoopExpression__Group__1__Impl rule__LoopExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__1__Impl_in_rule__LoopExpression__Group__17564);
            rule__LoopExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__2_in_rule__LoopExpression__Group__17567);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3738:1: rule__LoopExpression__Group__1__Impl : ( ( rule__LoopExpression__PredAssignment_1 ) ) ;
    public final void rule__LoopExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3742:1: ( ( ( rule__LoopExpression__PredAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3743:1: ( ( rule__LoopExpression__PredAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3743:1: ( ( rule__LoopExpression__PredAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3744:1: ( rule__LoopExpression__PredAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getPredAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3745:1: ( rule__LoopExpression__PredAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3745:2: rule__LoopExpression__PredAssignment_1
            {
            pushFollow(FOLLOW_rule__LoopExpression__PredAssignment_1_in_rule__LoopExpression__Group__1__Impl7594);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3755:1: rule__LoopExpression__Group__2 : rule__LoopExpression__Group__2__Impl rule__LoopExpression__Group__3 ;
    public final void rule__LoopExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3759:1: ( rule__LoopExpression__Group__2__Impl rule__LoopExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3760:2: rule__LoopExpression__Group__2__Impl rule__LoopExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__2__Impl_in_rule__LoopExpression__Group__27624);
            rule__LoopExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__3_in_rule__LoopExpression__Group__27627);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3767:1: rule__LoopExpression__Group__2__Impl : ( 'loop' ) ;
    public final void rule__LoopExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3771:1: ( ( 'loop' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3772:1: ( 'loop' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3772:1: ( 'loop' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3773:1: 'loop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getLoopKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__LoopExpression__Group__2__Impl7655); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3786:1: rule__LoopExpression__Group__3 : rule__LoopExpression__Group__3__Impl rule__LoopExpression__Group__4 ;
    public final void rule__LoopExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3790:1: ( rule__LoopExpression__Group__3__Impl rule__LoopExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3791:2: rule__LoopExpression__Group__3__Impl rule__LoopExpression__Group__4
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__3__Impl_in_rule__LoopExpression__Group__37686);
            rule__LoopExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopExpression__Group__4_in_rule__LoopExpression__Group__37689);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3798:1: rule__LoopExpression__Group__3__Impl : ( ( rule__LoopExpression__BodyAssignment_3 ) ) ;
    public final void rule__LoopExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3802:1: ( ( ( rule__LoopExpression__BodyAssignment_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3803:1: ( ( rule__LoopExpression__BodyAssignment_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3803:1: ( ( rule__LoopExpression__BodyAssignment_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3804:1: ( rule__LoopExpression__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getBodyAssignment_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3805:1: ( rule__LoopExpression__BodyAssignment_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3805:2: rule__LoopExpression__BodyAssignment_3
            {
            pushFollow(FOLLOW_rule__LoopExpression__BodyAssignment_3_in_rule__LoopExpression__Group__3__Impl7716);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3815:1: rule__LoopExpression__Group__4 : rule__LoopExpression__Group__4__Impl ;
    public final void rule__LoopExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3819:1: ( rule__LoopExpression__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3820:2: rule__LoopExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LoopExpression__Group__4__Impl_in_rule__LoopExpression__Group__47746);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3826:1: rule__LoopExpression__Group__4__Impl : ( 'pool' ) ;
    public final void rule__LoopExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3830:1: ( ( 'pool' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3831:1: ( 'pool' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3831:1: ( 'pool' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3832:1: 'pool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getPoolKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__LoopExpression__Group__4__Impl7774); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3855:1: rule__BlockExpression__Group__0 : rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 ;
    public final void rule__BlockExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3859:1: ( rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3860:2: rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__0__Impl_in_rule__BlockExpression__Group__07815);
            rule__BlockExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group__1_in_rule__BlockExpression__Group__07818);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3867:1: rule__BlockExpression__Group__0__Impl : ( () ) ;
    public final void rule__BlockExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3871:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3872:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3872:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3873:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3874:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3876:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3886:1: rule__BlockExpression__Group__1 : rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 ;
    public final void rule__BlockExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3890:1: ( rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3891:2: rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__1__Impl_in_rule__BlockExpression__Group__17876);
            rule__BlockExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group__2_in_rule__BlockExpression__Group__17879);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3898:1: rule__BlockExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BlockExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3902:1: ( ( '{' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3903:1: ( '{' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3903:1: ( '{' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3904:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__BlockExpression__Group__1__Impl7907); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3917:1: rule__BlockExpression__Group__2 : rule__BlockExpression__Group__2__Impl rule__BlockExpression__Group__3 ;
    public final void rule__BlockExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3921:1: ( rule__BlockExpression__Group__2__Impl rule__BlockExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3922:2: rule__BlockExpression__Group__2__Impl rule__BlockExpression__Group__3
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__2__Impl_in_rule__BlockExpression__Group__27938);
            rule__BlockExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group__3_in_rule__BlockExpression__Group__27941);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3929:1: rule__BlockExpression__Group__2__Impl : ( ( rule__BlockExpression__Group_2__0 )* ) ;
    public final void rule__BlockExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3933:1: ( ( ( rule__BlockExpression__Group_2__0 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3934:1: ( ( rule__BlockExpression__Group_2__0 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3934:1: ( ( rule__BlockExpression__Group_2__0 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3935:1: ( rule__BlockExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getGroup_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3936:1: ( rule__BlockExpression__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||(LA21_0>=14 && LA21_0<=16)||LA21_0==18||LA21_0==24||(LA21_0>=27 && LA21_0<=28)||LA21_0==31||LA21_0==35||LA21_0==39||LA21_0==41||(LA21_0>=45 && LA21_0<=46)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3936:2: rule__BlockExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BlockExpression__Group_2__0_in_rule__BlockExpression__Group__2__Impl7968);
            	    rule__BlockExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3946:1: rule__BlockExpression__Group__3 : rule__BlockExpression__Group__3__Impl ;
    public final void rule__BlockExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3950:1: ( rule__BlockExpression__Group__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3951:2: rule__BlockExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__3__Impl_in_rule__BlockExpression__Group__37999);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3957:1: rule__BlockExpression__Group__3__Impl : ( '}' ) ;
    public final void rule__BlockExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3961:1: ( ( '}' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3962:1: ( '}' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3962:1: ( '}' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3963:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,38,FOLLOW_38_in_rule__BlockExpression__Group__3__Impl8027); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3984:1: rule__BlockExpression__Group_2__0 : rule__BlockExpression__Group_2__0__Impl rule__BlockExpression__Group_2__1 ;
    public final void rule__BlockExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3988:1: ( rule__BlockExpression__Group_2__0__Impl rule__BlockExpression__Group_2__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3989:2: rule__BlockExpression__Group_2__0__Impl rule__BlockExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group_2__0__Impl_in_rule__BlockExpression__Group_2__08066);
            rule__BlockExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BlockExpression__Group_2__1_in_rule__BlockExpression__Group_2__08069);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:3996:1: rule__BlockExpression__Group_2__0__Impl : ( ( rule__BlockExpression__BodyAssignment_2_0 ) ) ;
    public final void rule__BlockExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4000:1: ( ( ( rule__BlockExpression__BodyAssignment_2_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4001:1: ( ( rule__BlockExpression__BodyAssignment_2_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4001:1: ( ( rule__BlockExpression__BodyAssignment_2_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4002:1: ( rule__BlockExpression__BodyAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBodyAssignment_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4003:1: ( rule__BlockExpression__BodyAssignment_2_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4003:2: rule__BlockExpression__BodyAssignment_2_0
            {
            pushFollow(FOLLOW_rule__BlockExpression__BodyAssignment_2_0_in_rule__BlockExpression__Group_2__0__Impl8096);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4013:1: rule__BlockExpression__Group_2__1 : rule__BlockExpression__Group_2__1__Impl ;
    public final void rule__BlockExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4017:1: ( rule__BlockExpression__Group_2__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4018:2: rule__BlockExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group_2__1__Impl_in_rule__BlockExpression__Group_2__18126);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4024:1: rule__BlockExpression__Group_2__1__Impl : ( ';' ) ;
    public final void rule__BlockExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4028:1: ( ( ';' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4029:1: ( ';' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4029:1: ( ';' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4030:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__BlockExpression__Group_2__1__Impl8154); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4047:1: rule__LetExpression__Group__0 : rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 ;
    public final void rule__LetExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4051:1: ( rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4052:2: rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__0__Impl_in_rule__LetExpression__Group__08189);
            rule__LetExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__1_in_rule__LetExpression__Group__08192);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4059:1: rule__LetExpression__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4063:1: ( ( 'let' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4064:1: ( 'let' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4064:1: ( 'let' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4065:1: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__LetExpression__Group__0__Impl8220); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4078:1: rule__LetExpression__Group__1 : rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 ;
    public final void rule__LetExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4082:1: ( rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4083:2: rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__1__Impl_in_rule__LetExpression__Group__18251);
            rule__LetExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__2_in_rule__LetExpression__Group__18254);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4090:1: rule__LetExpression__Group__1__Impl : ( ( ( rule__LetExpression__DeclarationAssignment_1 ) ) ( ( rule__LetExpression__DeclarationAssignment_1 )* ) ) ;
    public final void rule__LetExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4094:1: ( ( ( ( rule__LetExpression__DeclarationAssignment_1 ) ) ( ( rule__LetExpression__DeclarationAssignment_1 )* ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4095:1: ( ( ( rule__LetExpression__DeclarationAssignment_1 ) ) ( ( rule__LetExpression__DeclarationAssignment_1 )* ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4095:1: ( ( ( rule__LetExpression__DeclarationAssignment_1 ) ) ( ( rule__LetExpression__DeclarationAssignment_1 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4096:1: ( ( rule__LetExpression__DeclarationAssignment_1 ) ) ( ( rule__LetExpression__DeclarationAssignment_1 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4096:1: ( ( rule__LetExpression__DeclarationAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4097:1: ( rule__LetExpression__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4098:1: ( rule__LetExpression__DeclarationAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4098:2: rule__LetExpression__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_rule__LetExpression__DeclarationAssignment_1_in_rule__LetExpression__Group__1__Impl8283);
            rule__LetExpression__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_1()); 
            }

            }

            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4101:1: ( ( rule__LetExpression__DeclarationAssignment_1 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4102:1: ( rule__LetExpression__DeclarationAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4103:1: ( rule__LetExpression__DeclarationAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4103:2: rule__LetExpression__DeclarationAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__LetExpression__DeclarationAssignment_1_in_rule__LetExpression__Group__1__Impl8295);
            	    rule__LetExpression__DeclarationAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getDeclarationAssignment_1()); 
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
    // $ANTLR end "rule__LetExpression__Group__1__Impl"


    // $ANTLR start "rule__LetExpression__Group__2"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4114:1: rule__LetExpression__Group__2 : rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3 ;
    public final void rule__LetExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4118:1: ( rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4119:2: rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__2__Impl_in_rule__LetExpression__Group__28328);
            rule__LetExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetExpression__Group__3_in_rule__LetExpression__Group__28331);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4126:1: rule__LetExpression__Group__2__Impl : ( 'in' ) ;
    public final void rule__LetExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4130:1: ( ( 'in' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4131:1: ( 'in' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4131:1: ( 'in' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4132:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getInKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__LetExpression__Group__2__Impl8359); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getInKeyword_2()); 
            }

            }


            }

        }
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4145:1: rule__LetExpression__Group__3 : rule__LetExpression__Group__3__Impl ;
    public final void rule__LetExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4149:1: ( rule__LetExpression__Group__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4150:2: rule__LetExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__3__Impl_in_rule__LetExpression__Group__38390);
            rule__LetExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4156:1: rule__LetExpression__Group__3__Impl : ( ( rule__LetExpression__BodyAssignment_3 ) ) ;
    public final void rule__LetExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4160:1: ( ( ( rule__LetExpression__BodyAssignment_3 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4161:1: ( ( rule__LetExpression__BodyAssignment_3 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4161:1: ( ( rule__LetExpression__BodyAssignment_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4162:1: ( rule__LetExpression__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getBodyAssignment_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4163:1: ( rule__LetExpression__BodyAssignment_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4163:2: rule__LetExpression__BodyAssignment_3
            {
            pushFollow(FOLLOW_rule__LetExpression__BodyAssignment_3_in_rule__LetExpression__Group__3__Impl8417);
            rule__LetExpression__BodyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getBodyAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LetDeclaration__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4181:1: rule__LetDeclaration__Group__0 : rule__LetDeclaration__Group__0__Impl rule__LetDeclaration__Group__1 ;
    public final void rule__LetDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4185:1: ( rule__LetDeclaration__Group__0__Impl rule__LetDeclaration__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4186:2: rule__LetDeclaration__Group__0__Impl rule__LetDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__0__Impl_in_rule__LetDeclaration__Group__08455);
            rule__LetDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group__1_in_rule__LetDeclaration__Group__08458);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4193:1: rule__LetDeclaration__Group__0__Impl : ( ( rule__LetDeclaration__NameAssignment_0 ) ) ;
    public final void rule__LetDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4197:1: ( ( ( rule__LetDeclaration__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4198:1: ( ( rule__LetDeclaration__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4198:1: ( ( rule__LetDeclaration__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4199:1: ( rule__LetDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4200:1: ( rule__LetDeclaration__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4200:2: rule__LetDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LetDeclaration__NameAssignment_0_in_rule__LetDeclaration__Group__0__Impl8485);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4210:1: rule__LetDeclaration__Group__1 : rule__LetDeclaration__Group__1__Impl rule__LetDeclaration__Group__2 ;
    public final void rule__LetDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4214:1: ( rule__LetDeclaration__Group__1__Impl rule__LetDeclaration__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4215:2: rule__LetDeclaration__Group__1__Impl rule__LetDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__1__Impl_in_rule__LetDeclaration__Group__18515);
            rule__LetDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group__2_in_rule__LetDeclaration__Group__18518);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4222:1: rule__LetDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__LetDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4226:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4227:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4227:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4228:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getColonKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__LetDeclaration__Group__1__Impl8546); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4241:1: rule__LetDeclaration__Group__2 : rule__LetDeclaration__Group__2__Impl rule__LetDeclaration__Group__3 ;
    public final void rule__LetDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4245:1: ( rule__LetDeclaration__Group__2__Impl rule__LetDeclaration__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4246:2: rule__LetDeclaration__Group__2__Impl rule__LetDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__2__Impl_in_rule__LetDeclaration__Group__28577);
            rule__LetDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group__3_in_rule__LetDeclaration__Group__28580);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4253:1: rule__LetDeclaration__Group__2__Impl : ( ( rule__LetDeclaration__Type_declAssignment_2 ) ) ;
    public final void rule__LetDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4257:1: ( ( ( rule__LetDeclaration__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4258:1: ( ( rule__LetDeclaration__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4258:1: ( ( rule__LetDeclaration__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4259:1: ( rule__LetDeclaration__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4260:1: ( rule__LetDeclaration__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4260:2: rule__LetDeclaration__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Type_declAssignment_2_in_rule__LetDeclaration__Group__2__Impl8607);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4270:1: rule__LetDeclaration__Group__3 : rule__LetDeclaration__Group__3__Impl ;
    public final void rule__LetDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4274:1: ( rule__LetDeclaration__Group__3__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4275:2: rule__LetDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group__3__Impl_in_rule__LetDeclaration__Group__38637);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4281:1: rule__LetDeclaration__Group__3__Impl : ( ( rule__LetDeclaration__Group_3__0 )? ) ;
    public final void rule__LetDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4285:1: ( ( ( rule__LetDeclaration__Group_3__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4286:1: ( ( rule__LetDeclaration__Group_3__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4286:1: ( ( rule__LetDeclaration__Group_3__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4287:1: ( rule__LetDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getGroup_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4288:1: ( rule__LetDeclaration__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4288:2: rule__LetDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LetDeclaration__Group_3__0_in_rule__LetDeclaration__Group__3__Impl8664);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4306:1: rule__LetDeclaration__Group_3__0 : rule__LetDeclaration__Group_3__0__Impl rule__LetDeclaration__Group_3__1 ;
    public final void rule__LetDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4310:1: ( rule__LetDeclaration__Group_3__0__Impl rule__LetDeclaration__Group_3__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4311:2: rule__LetDeclaration__Group_3__0__Impl rule__LetDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group_3__0__Impl_in_rule__LetDeclaration__Group_3__08703);
            rule__LetDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LetDeclaration__Group_3__1_in_rule__LetDeclaration__Group_3__08706);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4318:1: rule__LetDeclaration__Group_3__0__Impl : ( '<-' ) ;
    public final void rule__LetDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4322:1: ( ( '<-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4323:1: ( '<-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4323:1: ( '<-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4324:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getLessThanSignHyphenMinusKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__LetDeclaration__Group_3__0__Impl8734); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4337:1: rule__LetDeclaration__Group_3__1 : rule__LetDeclaration__Group_3__1__Impl ;
    public final void rule__LetDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4341:1: ( rule__LetDeclaration__Group_3__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4342:2: rule__LetDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LetDeclaration__Group_3__1__Impl_in_rule__LetDeclaration__Group_3__18765);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4348:1: rule__LetDeclaration__Group_3__1__Impl : ( ( rule__LetDeclaration__InitAssignment_3_1 ) ) ;
    public final void rule__LetDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4352:1: ( ( ( rule__LetDeclaration__InitAssignment_3_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4353:1: ( ( rule__LetDeclaration__InitAssignment_3_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4353:1: ( ( rule__LetDeclaration__InitAssignment_3_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4354:1: ( rule__LetDeclaration__InitAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getInitAssignment_3_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4355:1: ( rule__LetDeclaration__InitAssignment_3_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4355:2: rule__LetDeclaration__InitAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LetDeclaration__InitAssignment_3_1_in_rule__LetDeclaration__Group_3__1__Impl8792);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4369:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4373:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4374:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__08826);
            rule__CaseExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__08829);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4381:1: rule__CaseExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4385:1: ( ( 'case' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4386:1: ( 'case' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4386:1: ( 'case' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4387:1: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__CaseExpression__Group__0__Impl8857); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4400:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4404:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4405:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__18888);
            rule__CaseExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__18891);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4412:1: rule__CaseExpression__Group__1__Impl : ( ( rule__CaseExpression__ExprAssignment_1 ) ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4416:1: ( ( ( rule__CaseExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4417:1: ( ( rule__CaseExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4417:1: ( ( rule__CaseExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4418:1: ( rule__CaseExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4419:1: ( rule__CaseExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4419:2: rule__CaseExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__CaseExpression__ExprAssignment_1_in_rule__CaseExpression__Group__1__Impl8918);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4429:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4433:1: ( rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4434:2: rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__28948);
            rule__CaseExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__28951);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4441:1: rule__CaseExpression__Group__2__Impl : ( 'of' ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4445:1: ( ( 'of' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4446:1: ( 'of' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4446:1: ( 'of' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4447:1: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getOfKeyword_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__CaseExpression__Group__2__Impl8979); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4460:1: rule__CaseExpression__Group__3 : rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4 ;
    public final void rule__CaseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4464:1: ( rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4465:2: rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__39010);
            rule__CaseExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__4_in_rule__CaseExpression__Group__39013);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4472:1: rule__CaseExpression__Group__3__Impl : ( ( ( rule__CaseExpression__CaseAssignment_3 ) ) ( ( rule__CaseExpression__CaseAssignment_3 )* ) ) ;
    public final void rule__CaseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4476:1: ( ( ( ( rule__CaseExpression__CaseAssignment_3 ) ) ( ( rule__CaseExpression__CaseAssignment_3 )* ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4477:1: ( ( ( rule__CaseExpression__CaseAssignment_3 ) ) ( ( rule__CaseExpression__CaseAssignment_3 )* ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4477:1: ( ( ( rule__CaseExpression__CaseAssignment_3 ) ) ( ( rule__CaseExpression__CaseAssignment_3 )* ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4478:1: ( ( rule__CaseExpression__CaseAssignment_3 ) ) ( ( rule__CaseExpression__CaseAssignment_3 )* )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4478:1: ( ( rule__CaseExpression__CaseAssignment_3 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4479:1: ( rule__CaseExpression__CaseAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4480:1: ( rule__CaseExpression__CaseAssignment_3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4480:2: rule__CaseExpression__CaseAssignment_3
            {
            pushFollow(FOLLOW_rule__CaseExpression__CaseAssignment_3_in_rule__CaseExpression__Group__3__Impl9042);
            rule__CaseExpression__CaseAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3()); 
            }

            }

            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4483:1: ( ( rule__CaseExpression__CaseAssignment_3 )* )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4484:1: ( rule__CaseExpression__CaseAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4485:1: ( rule__CaseExpression__CaseAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4485:2: rule__CaseExpression__CaseAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__CaseExpression__CaseAssignment_3_in_rule__CaseExpression__Group__3__Impl9054);
            	    rule__CaseExpression__CaseAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3()); 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4496:1: rule__CaseExpression__Group__4 : rule__CaseExpression__Group__4__Impl ;
    public final void rule__CaseExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4500:1: ( rule__CaseExpression__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4501:2: rule__CaseExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__4__Impl_in_rule__CaseExpression__Group__49087);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4507:1: rule__CaseExpression__Group__4__Impl : ( 'esac' ) ;
    public final void rule__CaseExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4511:1: ( ( 'esac' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4512:1: ( 'esac' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4512:1: ( 'esac' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4513:1: 'esac'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getEsacKeyword_4()); 
            }
            match(input,43,FOLLOW_43_in_rule__CaseExpression__Group__4__Impl9115); if (state.failed) return ;
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


    // $ANTLR start "rule__Case__Group__0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4536:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4540:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4541:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__09156);
            rule__Case__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__1_in_rule__Case__Group__09159);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4548:1: rule__Case__Group__0__Impl : ( ( rule__Case__NameAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4552:1: ( ( ( rule__Case__NameAssignment_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4553:1: ( ( rule__Case__NameAssignment_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4553:1: ( ( rule__Case__NameAssignment_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4554:1: ( rule__Case__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getNameAssignment_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4555:1: ( rule__Case__NameAssignment_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4555:2: rule__Case__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl9186);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4565:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4569:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4570:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__19216);
            rule__Case__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__2_in_rule__Case__Group__19219);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4577:1: rule__Case__Group__1__Impl : ( ':' ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4581:1: ( ( ':' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4582:1: ( ':' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4582:1: ( ':' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4583:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getColonKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Case__Group__1__Impl9247); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4596:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4600:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4601:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__29278);
            rule__Case__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__3_in_rule__Case__Group__29281);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4608:1: rule__Case__Group__2__Impl : ( ( rule__Case__Type_declAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4612:1: ( ( ( rule__Case__Type_declAssignment_2 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4613:1: ( ( rule__Case__Type_declAssignment_2 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4613:1: ( ( rule__Case__Type_declAssignment_2 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4614:1: ( rule__Case__Type_declAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getType_declAssignment_2()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4615:1: ( rule__Case__Type_declAssignment_2 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4615:2: rule__Case__Type_declAssignment_2
            {
            pushFollow(FOLLOW_rule__Case__Type_declAssignment_2_in_rule__Case__Group__2__Impl9308);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4625:1: rule__Case__Group__3 : rule__Case__Group__3__Impl rule__Case__Group__4 ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4629:1: ( rule__Case__Group__3__Impl rule__Case__Group__4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4630:2: rule__Case__Group__3__Impl rule__Case__Group__4
            {
            pushFollow(FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__39338);
            rule__Case__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Case__Group__4_in_rule__Case__Group__39341);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4637:1: rule__Case__Group__3__Impl : ( '=>' ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4641:1: ( ( '=>' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4642:1: ( '=>' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4642:1: ( '=>' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4643:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            }
            match(input,44,FOLLOW_44_in_rule__Case__Group__3__Impl9369); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4656:1: rule__Case__Group__4 : rule__Case__Group__4__Impl ;
    public final void rule__Case__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4660:1: ( rule__Case__Group__4__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4661:2: rule__Case__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__49400);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4667:1: rule__Case__Group__4__Impl : ( ( rule__Case__ExprAssignment_4 ) ) ;
    public final void rule__Case__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4671:1: ( ( ( rule__Case__ExprAssignment_4 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4672:1: ( ( rule__Case__ExprAssignment_4 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4672:1: ( ( rule__Case__ExprAssignment_4 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4673:1: ( rule__Case__ExprAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getExprAssignment_4()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4674:1: ( rule__Case__ExprAssignment_4 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4674:2: rule__Case__ExprAssignment_4
            {
            pushFollow(FOLLOW_rule__Case__ExprAssignment_4_in_rule__Case__Group__4__Impl9427);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4694:1: rule__NewExpression__Group__0 : rule__NewExpression__Group__0__Impl rule__NewExpression__Group__1 ;
    public final void rule__NewExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4698:1: ( rule__NewExpression__Group__0__Impl rule__NewExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4699:2: rule__NewExpression__Group__0__Impl rule__NewExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NewExpression__Group__0__Impl_in_rule__NewExpression__Group__09467);
            rule__NewExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewExpression__Group__1_in_rule__NewExpression__Group__09470);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4706:1: rule__NewExpression__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4710:1: ( ( 'new' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4711:1: ( 'new' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4711:1: ( 'new' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4712:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getNewKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__NewExpression__Group__0__Impl9498); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4725:1: rule__NewExpression__Group__1 : rule__NewExpression__Group__1__Impl ;
    public final void rule__NewExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4729:1: ( rule__NewExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4730:2: rule__NewExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NewExpression__Group__1__Impl_in_rule__NewExpression__Group__19529);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4736:1: rule__NewExpression__Group__1__Impl : ( ( rule__NewExpression__Type_nameAssignment_1 ) ) ;
    public final void rule__NewExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4740:1: ( ( ( rule__NewExpression__Type_nameAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4741:1: ( ( rule__NewExpression__Type_nameAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4741:1: ( ( rule__NewExpression__Type_nameAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4742:1: ( rule__NewExpression__Type_nameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getType_nameAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4743:1: ( rule__NewExpression__Type_nameAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4743:2: rule__NewExpression__Type_nameAssignment_1
            {
            pushFollow(FOLLOW_rule__NewExpression__Type_nameAssignment_1_in_rule__NewExpression__Group__1__Impl9556);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4757:1: rule__IsvoidExpression__Group__0 : rule__IsvoidExpression__Group__0__Impl rule__IsvoidExpression__Group__1 ;
    public final void rule__IsvoidExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4761:1: ( rule__IsvoidExpression__Group__0__Impl rule__IsvoidExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4762:2: rule__IsvoidExpression__Group__0__Impl rule__IsvoidExpression__Group__1
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__0__Impl_in_rule__IsvoidExpression__Group__09590);
            rule__IsvoidExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__1_in_rule__IsvoidExpression__Group__09593);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4769:1: rule__IsvoidExpression__Group__0__Impl : ( 'isvoid' ) ;
    public final void rule__IsvoidExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4773:1: ( ( 'isvoid' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4774:1: ( 'isvoid' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4774:1: ( 'isvoid' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4775:1: 'isvoid'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getIsvoidKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__IsvoidExpression__Group__0__Impl9621); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4788:1: rule__IsvoidExpression__Group__1 : rule__IsvoidExpression__Group__1__Impl ;
    public final void rule__IsvoidExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4792:1: ( rule__IsvoidExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4793:2: rule__IsvoidExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__Group__1__Impl_in_rule__IsvoidExpression__Group__19652);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4799:1: rule__IsvoidExpression__Group__1__Impl : ( ( rule__IsvoidExpression__ExprAssignment_1 ) ) ;
    public final void rule__IsvoidExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4803:1: ( ( ( rule__IsvoidExpression__ExprAssignment_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4804:1: ( ( rule__IsvoidExpression__ExprAssignment_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4804:1: ( ( rule__IsvoidExpression__ExprAssignment_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4805:1: ( rule__IsvoidExpression__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getExprAssignment_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4806:1: ( rule__IsvoidExpression__ExprAssignment_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4806:2: rule__IsvoidExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__IsvoidExpression__ExprAssignment_1_in_rule__IsvoidExpression__Group__1__Impl9679);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4820:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4824:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4825:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__09713);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__09716);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4832:1: rule__CompareExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4836:1: ( ( ruleAdditionExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4837:1: ( ruleAdditionExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4837:1: ( ruleAdditionExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4838:1: ruleAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_rule__CompareExpression__Group__0__Impl9743);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4849:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4853:1: ( rule__CompareExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4854:2: rule__CompareExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__19772);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4860:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__Group_1__0 )? ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4864:1: ( ( ( rule__CompareExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4865:1: ( ( rule__CompareExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4865:1: ( ( rule__CompareExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4866:1: ( rule__CompareExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4867:1: ( rule__CompareExpression__Group_1__0 )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA25_1 = input.LA(2);

                    if ( (synpred40_InternalCool()) ) {
                        alt25=1;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred40_InternalCool()) ) {
                        alt25=1;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred40_InternalCool()) ) {
                        alt25=1;
                    }
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4867:2: rule__CompareExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl9799);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4881:1: rule__CompareExpression__Group_1__0 : rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 ;
    public final void rule__CompareExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4885:1: ( rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4886:2: rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__09834);
            rule__CompareExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__09837);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4893:1: rule__CompareExpression__Group_1__0__Impl : ( ( rule__CompareExpression__Group_1_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4897:1: ( ( ( rule__CompareExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4898:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4898:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4899:1: ( rule__CompareExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4900:1: ( rule__CompareExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4900:2: rule__CompareExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl9864);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4910:1: rule__CompareExpression__Group_1__1 : rule__CompareExpression__Group_1__1__Impl ;
    public final void rule__CompareExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4914:1: ( rule__CompareExpression__Group_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4915:2: rule__CompareExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__19894);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4921:1: rule__CompareExpression__Group_1__1__Impl : ( ( rule__CompareExpression__RightAssignment_1_1 ) ) ;
    public final void rule__CompareExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4925:1: ( ( ( rule__CompareExpression__RightAssignment_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4926:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4926:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4927:1: ( rule__CompareExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4928:1: ( rule__CompareExpression__RightAssignment_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4928:2: rule__CompareExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl9921);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4942:1: rule__CompareExpression__Group_1_0__0 : rule__CompareExpression__Group_1_0__0__Impl ;
    public final void rule__CompareExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4946:1: ( rule__CompareExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4947:2: rule__CompareExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__09955);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4953:1: rule__CompareExpression__Group_1_0__0__Impl : ( ( rule__CompareExpression__Group_1_0_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4957:1: ( ( ( rule__CompareExpression__Group_1_0_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4958:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4958:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4959:1: ( rule__CompareExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4960:1: ( rule__CompareExpression__Group_1_0_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4960:2: rule__CompareExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl9982);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4972:1: rule__CompareExpression__Group_1_0_0__0 : rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 ;
    public final void rule__CompareExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4976:1: ( rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4977:2: rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__010014);
            rule__CompareExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__010017);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4984:1: rule__CompareExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CompareExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4988:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4989:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4989:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4990:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4991:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4993:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5003:1: rule__CompareExpression__Group_1_0_0__1 : rule__CompareExpression__Group_1_0_0__1__Impl ;
    public final void rule__CompareExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5007:1: ( rule__CompareExpression__Group_1_0_0__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5008:2: rule__CompareExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__110075);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5014:1: rule__CompareExpression__Group_1_0_0__1__Impl : ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__CompareExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5018:1: ( ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5019:1: ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5019:1: ( ( rule__CompareExpression__OpAssignment_1_0_0_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5020:1: ( rule__CompareExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5021:1: ( rule__CompareExpression__OpAssignment_1_0_0_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5021:2: rule__CompareExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OpAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl10102);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5035:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5039:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5040:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__010136);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__010139);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5047:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5051:1: ( ( ruleMultiplicationExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5052:1: ( ruleMultiplicationExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5052:1: ( ruleMultiplicationExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5053:1: ruleMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl10166);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5064:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5068:1: ( rule__AdditionExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5069:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__110195);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5075:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )? ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5079:1: ( ( ( rule__AdditionExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5080:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5080:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5081:1: ( rule__AdditionExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5082:1: ( rule__AdditionExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred41_InternalCool()) ) {
                    alt26=1;
                }
            }
            else if ( (LA26_0==48) ) {
                int LA26_2 = input.LA(2);

                if ( (synpred41_InternalCool()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5082:2: rule__AdditionExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl10222);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5096:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5100:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5101:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__010257);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__010260);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5108:1: rule__AdditionExpression__Group_1__0__Impl : ( ( rule__AdditionExpression__Group_1_0__0 ) ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5112:1: ( ( ( rule__AdditionExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5113:1: ( ( rule__AdditionExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5113:1: ( ( rule__AdditionExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5114:1: ( rule__AdditionExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5115:1: ( rule__AdditionExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5115:2: rule__AdditionExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0__0_in_rule__AdditionExpression__Group_1__0__Impl10287);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5125:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5129:1: ( rule__AdditionExpression__Group_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5130:2: rule__AdditionExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__110317);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5136:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5140:1: ( ( ( rule__AdditionExpression__RightAssignment_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5141:1: ( ( rule__AdditionExpression__RightAssignment_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5141:1: ( ( rule__AdditionExpression__RightAssignment_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5142:1: ( rule__AdditionExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5143:1: ( rule__AdditionExpression__RightAssignment_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5143:2: rule__AdditionExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__RightAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl10344);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5157:1: rule__AdditionExpression__Group_1_0__0 : rule__AdditionExpression__Group_1_0__0__Impl ;
    public final void rule__AdditionExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5161:1: ( rule__AdditionExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5162:2: rule__AdditionExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0__0__Impl_in_rule__AdditionExpression__Group_1_0__010378);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5168:1: rule__AdditionExpression__Group_1_0__0__Impl : ( ( rule__AdditionExpression__Alternatives_1_0_0 ) ) ;
    public final void rule__AdditionExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5172:1: ( ( ( rule__AdditionExpression__Alternatives_1_0_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5173:1: ( ( rule__AdditionExpression__Alternatives_1_0_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5173:1: ( ( rule__AdditionExpression__Alternatives_1_0_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5174:1: ( rule__AdditionExpression__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getAlternatives_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5175:1: ( rule__AdditionExpression__Alternatives_1_0_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5175:2: rule__AdditionExpression__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Alternatives_1_0_0_in_rule__AdditionExpression__Group_1_0__0__Impl10405);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5187:1: rule__AdditionExpression__Group_1_0_0_0__0 : rule__AdditionExpression__Group_1_0_0_0__0__Impl rule__AdditionExpression__Group_1_0_0_0__1 ;
    public final void rule__AdditionExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5191:1: ( rule__AdditionExpression__Group_1_0_0_0__0__Impl rule__AdditionExpression__Group_1_0_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5192:2: rule__AdditionExpression__Group_1_0_0_0__0__Impl rule__AdditionExpression__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__0__Impl_in_rule__AdditionExpression__Group_1_0_0_0__010437);
            rule__AdditionExpression__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1_in_rule__AdditionExpression__Group_1_0_0_0__010440);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5199:1: rule__AdditionExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5203:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5204:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5204:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5205:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5206:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5208:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5218:1: rule__AdditionExpression__Group_1_0_0_0__1 : rule__AdditionExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__AdditionExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5222:1: ( rule__AdditionExpression__Group_1_0_0_0__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5223:2: rule__AdditionExpression__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1__Impl_in_rule__AdditionExpression__Group_1_0_0_0__110498);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5229:1: rule__AdditionExpression__Group_1_0_0_0__1__Impl : ( '+' ) ;
    public final void rule__AdditionExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5233:1: ( ( '+' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5234:1: ( '+' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5234:1: ( '+' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5235:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getPlusSignKeyword_1_0_0_0_1()); 
            }
            match(input,47,FOLLOW_47_in_rule__AdditionExpression__Group_1_0_0_0__1__Impl10526); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5252:1: rule__AdditionExpression__Group_1_0_0_1__0 : rule__AdditionExpression__Group_1_0_0_1__0__Impl rule__AdditionExpression__Group_1_0_0_1__1 ;
    public final void rule__AdditionExpression__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5256:1: ( rule__AdditionExpression__Group_1_0_0_1__0__Impl rule__AdditionExpression__Group_1_0_0_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5257:2: rule__AdditionExpression__Group_1_0_0_1__0__Impl rule__AdditionExpression__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__0__Impl_in_rule__AdditionExpression__Group_1_0_0_1__010561);
            rule__AdditionExpression__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1_in_rule__AdditionExpression__Group_1_0_0_1__010564);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5264:1: rule__AdditionExpression__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5268:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5269:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5269:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5270:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5271:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5273:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5283:1: rule__AdditionExpression__Group_1_0_0_1__1 : rule__AdditionExpression__Group_1_0_0_1__1__Impl ;
    public final void rule__AdditionExpression__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5287:1: ( rule__AdditionExpression__Group_1_0_0_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5288:2: rule__AdditionExpression__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1__Impl_in_rule__AdditionExpression__Group_1_0_0_1__110622);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5294:1: rule__AdditionExpression__Group_1_0_0_1__1__Impl : ( '-' ) ;
    public final void rule__AdditionExpression__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5298:1: ( ( '-' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5299:1: ( '-' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5299:1: ( '-' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5300:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
            }
            match(input,48,FOLLOW_48_in_rule__AdditionExpression__Group_1_0_0_1__1__Impl10650); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5317:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5321:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5322:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__010685);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__010688);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5329:1: rule__MultiplicationExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5333:1: ( ( rulePrimaryExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5334:1: ( rulePrimaryExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5334:1: ( rulePrimaryExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5335:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__MultiplicationExpression__Group__0__Impl10715);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5346:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5350:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5351:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__110744);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5357:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )? ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5361:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )? ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5362:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5362:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5363:1: ( rule__MultiplicationExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5364:1: ( rule__MultiplicationExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred42_InternalCool()) ) {
                    alt27=1;
                }
            }
            else if ( (LA27_0==50) ) {
                int LA27_2 = input.LA(2);

                if ( (synpred42_InternalCool()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5364:2: rule__MultiplicationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl10771);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5378:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5382:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5383:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__010806);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__010809);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5390:1: rule__MultiplicationExpression__Group_1__0__Impl : ( ( rule__MultiplicationExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5394:1: ( ( ( rule__MultiplicationExpression__Group_1_0__0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5395:1: ( ( rule__MultiplicationExpression__Group_1_0__0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5395:1: ( ( rule__MultiplicationExpression__Group_1_0__0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5396:1: ( rule__MultiplicationExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5397:1: ( rule__MultiplicationExpression__Group_1_0__0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5397:2: rule__MultiplicationExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0__0_in_rule__MultiplicationExpression__Group_1__0__Impl10836);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5407:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5411:1: ( rule__MultiplicationExpression__Group_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5412:2: rule__MultiplicationExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__110866);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5418:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5422:1: ( ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5423:1: ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5423:1: ( ( rule__MultiplicationExpression__RightAssignment_1_1 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5424:1: ( rule__MultiplicationExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5425:1: ( rule__MultiplicationExpression__RightAssignment_1_1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5425:2: rule__MultiplicationExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__RightAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl10893);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5439:1: rule__MultiplicationExpression__Group_1_0__0 : rule__MultiplicationExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicationExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5443:1: ( rule__MultiplicationExpression__Group_1_0__0__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5444:2: rule__MultiplicationExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0__010927);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5450:1: rule__MultiplicationExpression__Group_1_0__0__Impl : ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5454:1: ( ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5455:1: ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5455:1: ( ( rule__MultiplicationExpression__Alternatives_1_0_0 ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5456:1: ( rule__MultiplicationExpression__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getAlternatives_1_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5457:1: ( rule__MultiplicationExpression__Alternatives_1_0_0 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5457:2: rule__MultiplicationExpression__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Alternatives_1_0_0_in_rule__MultiplicationExpression__Group_1_0__0__Impl10954);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5469:1: rule__MultiplicationExpression__Group_1_0_0_0__0 : rule__MultiplicationExpression__Group_1_0_0_0__0__Impl rule__MultiplicationExpression__Group_1_0_0_0__1 ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5473:1: ( rule__MultiplicationExpression__Group_1_0_0_0__0__Impl rule__MultiplicationExpression__Group_1_0_0_0__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5474:2: rule__MultiplicationExpression__Group_1_0_0_0__0__Impl rule__MultiplicationExpression__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__010986);
            rule__MultiplicationExpression__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1_in_rule__MultiplicationExpression__Group_1_0_0_0__010989);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5481:1: rule__MultiplicationExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5485:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5486:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5486:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5487:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5488:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5490:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5500:1: rule__MultiplicationExpression__Group_1_0_0_0__1 : rule__MultiplicationExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5504:1: ( rule__MultiplicationExpression__Group_1_0_0_0__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5505:2: rule__MultiplicationExpression__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__111047);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5511:1: rule__MultiplicationExpression__Group_1_0_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5515:1: ( ( '*' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5516:1: ( '*' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5516:1: ( '*' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5517:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getAsteriskKeyword_1_0_0_0_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl11075); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5534:1: rule__MultiplicationExpression__Group_1_0_0_1__0 : rule__MultiplicationExpression__Group_1_0_0_1__0__Impl rule__MultiplicationExpression__Group_1_0_0_1__1 ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5538:1: ( rule__MultiplicationExpression__Group_1_0_0_1__0__Impl rule__MultiplicationExpression__Group_1_0_0_1__1 )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5539:2: rule__MultiplicationExpression__Group_1_0_0_1__0__Impl rule__MultiplicationExpression__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__011110);
            rule__MultiplicationExpression__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1_in_rule__MultiplicationExpression__Group_1_0_0_1__011113);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5546:1: rule__MultiplicationExpression__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5550:1: ( ( () ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5551:1: ( () )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5551:1: ( () )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5552:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5553:1: ()
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5555:1: 
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5565:1: rule__MultiplicationExpression__Group_1_0_0_1__1 : rule__MultiplicationExpression__Group_1_0_0_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5569:1: ( rule__MultiplicationExpression__Group_1_0_0_1__1__Impl )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5570:2: rule__MultiplicationExpression__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__111171);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5576:1: rule__MultiplicationExpression__Group_1_0_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultiplicationExpression__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5580:1: ( ( '/' ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5581:1: ( '/' )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5581:1: ( '/' )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5582:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getSolidusKeyword_1_0_0_1_1()); 
            }
            match(input,50,FOLLOW_50_in_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl11199); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5600:1: rule__Program__ClassesAssignment : ( ruleClass_ ) ;
    public final void rule__Program__ClassesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5604:1: ( ( ruleClass_ ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5605:1: ( ruleClass_ )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5605:1: ( ruleClass_ )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5606:1: ruleClass_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesClass_ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleClass__in_rule__Program__ClassesAssignment11239);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5615:1: rule__Class___NameAssignment_1 : ( ruleSYMBOL ) ;
    public final void rule__Class___NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5619:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5620:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5620:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5621:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getNameSYMBOLParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Class___NameAssignment_111270);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5630:1: rule__Class___ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class___ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5634:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5635:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5635:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5636:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getParentTypeCrossReference_2_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5637:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5638:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getParentTypeIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class___ParentAssignment_2_111305); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5649:1: rule__Class___FeaturesAssignment_4 : ( ruleFeature_ ) ;
    public final void rule__Class___FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5653:1: ( ( ruleFeature_ ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5654:1: ( ruleFeature_ )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5654:1: ( ruleFeature_ )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5655:1: ruleFeature_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_Access().getFeaturesFeature_ParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleFeature__in_rule__Class___FeaturesAssignment_411340);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5664:1: rule__Attr__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Attr__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5668:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5669:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5669:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5670:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Attr__NameAssignment_011371);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5679:1: rule__Attr__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attr__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5683:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5684:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5684:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5685:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5686:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5687:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attr__Type_declAssignment_211406); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5698:1: rule__Attr__InitAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Attr__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5702:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5703:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5703:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5704:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAccess().getInitExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Attr__InitAssignment_3_111441);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5713:1: rule__Method__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Method__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5717:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5718:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5718:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5719:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Method__NameAssignment_011472);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5728:1: rule__Method__FormalsAssignment_2_0 : ( ruleFormal ) ;
    public final void rule__Method__FormalsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5732:1: ( ( ruleFormal ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5733:1: ( ruleFormal )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5733:1: ( ruleFormal )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5734:1: ruleFormal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_011503);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5743:1: rule__Method__FormalsAssignment_2_1_1 : ( ruleFormal ) ;
    public final void rule__Method__FormalsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5747:1: ( ( ruleFormal ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5748:1: ( ruleFormal )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5748:1: ( ruleFormal )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5749:1: ruleFormal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_1_111534);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5758:1: rule__Method__Return_typeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Method__Return_typeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5762:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5763:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5763:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5764:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturn_typeTypeCrossReference_5_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5765:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5766:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturn_typeTypeIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__Return_typeAssignment_511569); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5777:1: rule__Method__ExprAssignment_7 : ( ruleExpression ) ;
    public final void rule__Method__ExprAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5781:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5782:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5782:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5783:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getExprExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Method__ExprAssignment_711604);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5792:1: rule__Formal__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Formal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5796:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5797:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5797:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5798:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Formal__NameAssignment_011635);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5807:1: rule__Formal__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Formal__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5811:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5812:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5812:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5813:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5814:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5815:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Formal__Type_declAssignment_211670); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5826:1: rule__IdentifierRefExpression__IdAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IdentifierRefExpression__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5830:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5831:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5831:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5832:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementCrossReference_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5833:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5834:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IdentifierRefExpression__IdAssignment11709); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5845:1: rule__NumberLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5849:1: ( ( RULE_INT ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5850:1: ( RULE_INT )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5850:1: ( RULE_INT )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5851:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment11744); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5860:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5864:1: ( ( RULE_STRING ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5865:1: ( RULE_STRING )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5865:1: ( RULE_STRING )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5866:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11775); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5875:1: rule__BooleanLiteral__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5879:1: ( ( ruleBOOLEAN ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5880:1: ( ruleBOOLEAN )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5880:1: ( ruleBOOLEAN )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5881:1: ruleBOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__BooleanLiteral__ValueAssignment11806);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5890:1: rule__ParenExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__ParenExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5894:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5895:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5895:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5896:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParenExpression__ExprAssignment_111837);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5905:1: rule__AssignmentExpression__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__AssignmentExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5909:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5910:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5910:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5911:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__AssignmentExpression__NameAssignment_011868);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5920:1: rule__AssignmentExpression__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__AssignmentExpression__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5924:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5925:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5925:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5926:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExpressionAccess().getExprExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__AssignmentExpression__ExprAssignment_211899);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5935:1: rule__NegationExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__NegationExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5939:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5940:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5940:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5941:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__NegationExpression__ExprAssignment_111930);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5950:1: rule__IntegerComposite__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IntegerComposite__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5954:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5955:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5955:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5956:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerCompositeAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__IntegerComposite__ExprAssignment_111961);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5965:1: rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5969:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5970:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5970:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5971:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getType_nameTypeCrossReference_1_0_0_1_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5972:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5973:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getType_nameTypeIDTerminalRuleCall_1_0_0_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_111996); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5984:1: rule__DispatchExpression__RefAssignment_1_0_0_3 : ( ruleIdentifierRefExpression ) ;
    public final void rule__DispatchExpression__RefAssignment_1_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5988:1: ( ( ruleIdentifierRefExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5989:1: ( ruleIdentifierRefExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5989:1: ( ruleIdentifierRefExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5990:1: ruleIdentifierRefExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_1_0_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleIdentifierRefExpression_in_rule__DispatchExpression__RefAssignment_1_0_0_312031);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5999:1: rule__DispatchExpression__ActualAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__DispatchExpression__ActualAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6003:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6004:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6004:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6005:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_012062);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6014:1: rule__DispatchExpression__ActualAssignment_1_2_1_1 : ( ruleExpression ) ;
    public final void rule__DispatchExpression__ActualAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6018:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6019:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6019:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6020:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_1_112093);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6029:1: rule__StaticDispatchExpression__RefAssignment_0 : ( ruleIdentifierRefExpression ) ;
    public final void rule__StaticDispatchExpression__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6033:1: ( ( ruleIdentifierRefExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6034:1: ( ruleIdentifierRefExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6034:1: ( ruleIdentifierRefExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6035:1: ruleIdentifierRefExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleIdentifierRefExpression_in_rule__StaticDispatchExpression__RefAssignment_012124);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6044:1: rule__StaticDispatchExpression__ActualAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__StaticDispatchExpression__ActualAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6048:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6049:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6049:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6050:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_012155);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6059:1: rule__StaticDispatchExpression__ActualAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__StaticDispatchExpression__ActualAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6063:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6064:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6064:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6065:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_1_112186);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6074:1: rule__ConditionalExpression__PredAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6078:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6079:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6079:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6080:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__PredAssignment_112217);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6089:1: rule__ConditionalExpression__Then_expAssignment_3 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__Then_expAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6093:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6094:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6094:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6095:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getThen_expExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__Then_expAssignment_312248);
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


    // $ANTLR start "rule__ConditionalExpression__Else_expAssignment_5"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6104:1: rule__ConditionalExpression__Else_expAssignment_5 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__Else_expAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6108:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6109:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6109:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6110:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getElse_expExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__Else_expAssignment_512279);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getElse_expExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Else_expAssignment_5"


    // $ANTLR start "rule__LoopExpression__PredAssignment_1"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6119:1: rule__LoopExpression__PredAssignment_1 : ( ruleExpression ) ;
    public final void rule__LoopExpression__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6123:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6124:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6124:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6125:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LoopExpression__PredAssignment_112310);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6134:1: rule__LoopExpression__BodyAssignment_3 : ( ruleExpression ) ;
    public final void rule__LoopExpression__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6138:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6139:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6139:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6140:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopExpressionAccess().getBodyExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LoopExpression__BodyAssignment_312341);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6149:1: rule__BlockExpression__BodyAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__BlockExpression__BodyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6153:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6154:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6154:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6155:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBodyExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__BlockExpression__BodyAssignment_2_012372);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6164:1: rule__LetExpression__DeclarationAssignment_1 : ( ruleLetDeclaration ) ;
    public final void rule__LetExpression__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6168:1: ( ( ruleLetDeclaration ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6169:1: ( ruleLetDeclaration )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6169:1: ( ruleLetDeclaration )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6170:1: ruleLetDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getDeclarationLetDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_112403);
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


    // $ANTLR start "rule__LetExpression__BodyAssignment_3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6179:1: rule__LetExpression__BodyAssignment_3 : ( ruleExpression ) ;
    public final void rule__LetExpression__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6183:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6184:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6184:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6185:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetExpressionAccess().getBodyExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LetExpression__BodyAssignment_312434);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetExpressionAccess().getBodyExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__BodyAssignment_3"


    // $ANTLR start "rule__LetDeclaration__NameAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6194:1: rule__LetDeclaration__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__LetDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6198:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6199:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6199:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6200:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__LetDeclaration__NameAssignment_012465);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6209:1: rule__LetDeclaration__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LetDeclaration__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6213:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6214:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6214:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6215:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6216:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6217:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LetDeclaration__Type_declAssignment_212500); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6228:1: rule__LetDeclaration__InitAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__LetDeclaration__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6232:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6233:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6233:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6234:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetDeclarationAccess().getInitExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LetDeclaration__InitAssignment_3_112535);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6243:1: rule__CaseExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__CaseExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6247:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6248:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6248:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6249:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CaseExpression__ExprAssignment_112566);
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


    // $ANTLR start "rule__CaseExpression__CaseAssignment_3"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6258:1: rule__CaseExpression__CaseAssignment_3 : ( ruleCase ) ;
    public final void rule__CaseExpression__CaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6262:1: ( ( ruleCase ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6263:1: ( ruleCase )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6263:1: ( ruleCase )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6264:1: ruleCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseCaseParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCase_in_rule__CaseExpression__CaseAssignment_312597);
            ruleCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseCaseParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__CaseAssignment_3"


    // $ANTLR start "rule__Case__NameAssignment_0"
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6273:1: rule__Case__NameAssignment_0 : ( ruleSYMBOL ) ;
    public final void rule__Case__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6277:1: ( ( ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6278:1: ( ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6278:1: ( ruleSYMBOL )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6279:1: ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getNameSYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_rule__Case__NameAssignment_012628);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6288:1: rule__Case__Type_declAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Case__Type_declAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6292:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6293:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6293:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6294:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getType_declTypeCrossReference_2_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6295:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6296:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getType_declTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Case__Type_declAssignment_212663); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6307:1: rule__Case__ExprAssignment_4 : ( ruleExpression ) ;
    public final void rule__Case__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6311:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6312:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6312:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6313:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getExprExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Case__ExprAssignment_412698);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6322:1: rule__NewExpression__Type_nameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewExpression__Type_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6326:1: ( ( ( RULE_ID ) ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6327:1: ( ( RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6327:1: ( ( RULE_ID ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6328:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getType_nameTypeCrossReference_1_0()); 
            }
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6329:1: ( RULE_ID )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6330:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewExpressionAccess().getType_nameTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewExpression__Type_nameAssignment_112733); if (state.failed) return ;
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6341:1: rule__IsvoidExpression__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IsvoidExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6345:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6346:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6346:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6347:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsvoidExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__IsvoidExpression__ExprAssignment_112768);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6356:1: rule__CompareExpression__OpAssignment_1_0_0_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6360:1: ( ( ruleCompareOperator ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6361:1: ( ruleCompareOperator )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6361:1: ( ruleCompareOperator )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6362:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOpCompareOperatorParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareExpression__OpAssignment_1_0_0_112799);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6371:1: rule__CompareExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__CompareExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6375:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6376:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6376:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6377:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CompareExpression__RightAssignment_1_112830);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6386:1: rule__AdditionExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__AdditionExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6390:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6391:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6391:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6392:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__AdditionExpression__RightAssignment_1_112861);
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
    // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6401:1: rule__MultiplicationExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__MultiplicationExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6405:1: ( ( ruleExpression ) )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6406:1: ( ruleExpression )
            {
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6406:1: ( ruleExpression )
            // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:6407:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__MultiplicationExpression__RightAssignment_1_112892);
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
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2735:2: ( rule__DispatchExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:2735:2: rule__DispatchExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__DispatchExpression__Group_1__0_in_synpred30_InternalCool5607);
        rule__DispatchExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalCool

    // $ANTLR start synpred40_InternalCool
    public final void synpred40_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4867:2: ( rule__CompareExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:4867:2: rule__CompareExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_synpred40_InternalCool9799);
        rule__CompareExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalCool

    // $ANTLR start synpred41_InternalCool
    public final void synpred41_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5082:2: ( rule__AdditionExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5082:2: rule__AdditionExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0_in_synpred41_InternalCool10222);
        rule__AdditionExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalCool

    // $ANTLR start synpred42_InternalCool
    public final void synpred42_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5364:2: ( rule__MultiplicationExpression__Group_1__0 )
        // ../edu.stanford.compilers.cool.ui/src-gen/edu/stanford/compilers/ui/contentassist/antlr/internal/InternalCool.g:5364:2: rule__MultiplicationExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0_in_synpred42_InternalCool10771);
        rule__MultiplicationExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalCool

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
    static final String DFA3_eotS =
        "\22\uffff";
    static final String DFA3_eofS =
        "\10\uffff\1\20\1\21\10\uffff";
    static final String DFA3_minS =
        "\1\4\7\uffff\2\4\10\uffff";
    static final String DFA3_maxS =
        "\1\56\7\uffff\2\62\10\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\13\1\14\1\15\1\16"+
        "\1\17\1\10\1\12\1\11";
    static final String DFA3_specialS =
        "\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\10\2\12\7\uffff\2\12\1\11\1\uffff\1\3\5\uffff\1\13\2\uffff"+
            "\1\14\1\15\2\uffff\1\1\3\uffff\1\2\3\uffff\1\4\1\uffff\1\5\3"+
            "\uffff\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\6\uffff\3\20\2\uffff\1\20\2\uffff\1\20\2\uffff\1\20"+
            "\1\17\1\16\2\20\2\uffff\2\20\1\uffff\3\20\1\uffff\2\20\2\uffff"+
            "\1\20\1\uffff\2\20\3\uffff\4\20",
            "\1\21\6\uffff\3\21\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21"+
            "\1\17\1\uffff\2\21\2\uffff\2\21\1\uffff\3\21\1\uffff\2\21\2"+
            "\uffff\1\21\1\uffff\2\21\3\uffff\4\21",
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
    public static final BitSet FOLLOW_rule__Class___Group__1__Impl_in_rule__Class___Group__12910 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Class___Group__2_in_rule__Class___Group__12913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___NameAssignment_1_in_rule__Class___Group__1__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__2__Impl_in_rule__Class___Group__22970 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Class___Group__3_in_rule__Class___Group__22973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group_2__0_in_rule__Class___Group__2__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__3__Impl_in_rule__Class___Group__33031 = new BitSet(new long[]{0x0000000000090010L});
    public static final BitSet FOLLOW_rule__Class___Group__4_in_rule__Class___Group__33034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Class___Group__3__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group__4__Impl_in_rule__Class___Group__43093 = new BitSet(new long[]{0x0000000000090010L});
    public static final BitSet FOLLOW_rule__Class___Group__5_in_rule__Class___Group__43096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___FeaturesAssignment_4_in_rule__Class___Group__4__Impl3123 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__Class___Group__5__Impl_in_rule__Class___Group__53154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class___Group__5__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group_2__0__Impl_in_rule__Class___Group_2__03225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class___Group_2__1_in_rule__Class___Group_2__03228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Class___Group_2__0__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___Group_2__1__Impl_in_rule__Class___Group_2__13287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class___ParentAssignment_2_1_in_rule__Class___Group_2__1__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__0__Impl_in_rule__Attr__Group__03348 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Attr__Group__1_in_rule__Attr__Group__03351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__NameAssignment_0_in_rule__Attr__Group__0__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__1__Impl_in_rule__Attr__Group__13408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attr__Group__2_in_rule__Attr__Group__13411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Attr__Group__1__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__2__Impl_in_rule__Attr__Group__23470 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Attr__Group__3_in_rule__Attr__Group__23473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Type_declAssignment_2_in_rule__Attr__Group__2__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__3__Impl_in_rule__Attr__Group__33530 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Attr__Group__4_in_rule__Attr__Group__33533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group_3__0_in_rule__Attr__Group__3__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group__4__Impl_in_rule__Attr__Group__43591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Attr__Group__4__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group_3__0__Impl_in_rule__Attr__Group_3__03660 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__Attr__Group_3__1_in_rule__Attr__Group_3__03663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attr__Group_3__0__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Group_3__1__Impl_in_rule__Attr__Group_3__13722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__InitAssignment_3_1_in_rule__Attr__Group_3__1__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03783 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_0_in_rule__Method__Group__0__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13843 = new BitSet(new long[]{0x0000000002010010L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Method__Group__1__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23905 = new BitSet(new long[]{0x0000000002010010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2__0_in_rule__Method__Group__2__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33966 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Method__Group__3__Impl3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Method__Group__4__Impl4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54090 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Method__Group__6_in_rule__Method__Group__54093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Return_typeAssignment_5_in_rule__Method__Group__5__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__64150 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__Method__Group__7_in_rule__Method__Group__64153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group__6__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__74212 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Method__Group__8_in_rule__Method__Group__74215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ExprAssignment_7_in_rule__Method__Group__7__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__8__Impl_in_rule__Method__Group__84272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Method__Group__8__Impl4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2__0__Impl_in_rule__Method__Group_2__04349 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Method__Group_2__1_in_rule__Method__Group_2__04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__FormalsAssignment_2_0_in_rule__Method__Group_2__0__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2__1__Impl_in_rule__Method__Group_2__14409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2_1__0_in_rule__Method__Group_2__1__Impl4436 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2_1__0__Impl_in_rule__Method__Group_2_1__04471 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Method__Group_2_1__1_in_rule__Method__Group_2_1__04474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Method__Group_2_1__0__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_2_1__1__Impl_in_rule__Method__Group_2_1__14533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__FormalsAssignment_2_1_1_in_rule__Method__Group_2_1__1__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__Group__0__Impl_in_rule__Formal__Group__04594 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Formal__Group__1_in_rule__Formal__Group__04597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__NameAssignment_0_in_rule__Formal__Group__0__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__Group__1__Impl_in_rule__Formal__Group__14654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Formal__Group__2_in_rule__Formal__Group__14657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Formal__Group__1__Impl4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__Group__2__Impl_in_rule__Formal__Group__24716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formal__Type_declAssignment_2_in_rule__Formal__Group__2__Impl4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfTypeLiteral__Group__0__Impl_in_rule__SelfTypeLiteral__Group__04779 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SelfTypeLiteral__Group__1_in_rule__SelfTypeLiteral__Group__04782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfTypeLiteral__Group__1__Impl_in_rule__SelfTypeLiteral__Group__14840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SelfTypeLiteral__Group__1__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__0__Impl_in_rule__ParenExpression__Group__04903 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__1_in_rule__ParenExpression__Group__04906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ParenExpression__Group__0__Impl4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__1__Impl_in_rule__ParenExpression__Group__14965 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__2_in_rule__ParenExpression__Group__14968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpression__ExprAssignment_1_in_rule__ParenExpression__Group__1__Impl4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpression__Group__2__Impl_in_rule__ParenExpression__Group__25025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ParenExpression__Group__2__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__0__Impl_in_rule__AssignmentExpression__Group__05090 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__1_in_rule__AssignmentExpression__Group__05093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__NameAssignment_0_in_rule__AssignmentExpression__Group__0__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__1__Impl_in_rule__AssignmentExpression__Group__15150 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__2_in_rule__AssignmentExpression__Group__15153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AssignmentExpression__Group__1__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Group__2__Impl_in_rule__AssignmentExpression__Group__25212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__ExprAssignment_2_in_rule__AssignmentExpression__Group__2__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__0__Impl_in_rule__NegationExpression__Group__05275 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__1_in_rule__NegationExpression__Group__05278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NegationExpression__Group__0__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__1__Impl_in_rule__NegationExpression__Group__15337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__ExprAssignment_1_in_rule__NegationExpression__Group__1__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerComposite__Group__0__Impl_in_rule__IntegerComposite__Group__05398 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__IntegerComposite__Group__1_in_rule__IntegerComposite__Group__05401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IntegerComposite__Group__0__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerComposite__Group__1__Impl_in_rule__IntegerComposite__Group__15460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerComposite__ExprAssignment_1_in_rule__IntegerComposite__Group__1__Impl5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__0__Impl_in_rule__DispatchExpression__Group__05521 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__1_in_rule__DispatchExpression__Group__05524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__DispatchExpression__Group__0__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group__1__Impl_in_rule__DispatchExpression__Group__15580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__0_in_rule__DispatchExpression__Group__1__Impl5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__0__Impl_in_rule__DispatchExpression__Group_1__05642 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__1_in_rule__DispatchExpression__Group_1__05645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0__0_in_rule__DispatchExpression__Group_1__0__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__1__Impl_in_rule__DispatchExpression__Group_1__15702 = new BitSet(new long[]{0x000062889B05C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__2_in_rule__DispatchExpression__Group_1__15705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DispatchExpression__Group_1__1__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__2__Impl_in_rule__DispatchExpression__Group_1__25764 = new BitSet(new long[]{0x000062889B05C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__3_in_rule__DispatchExpression__Group_1__25767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__0_in_rule__DispatchExpression__Group_1__2__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__3__Impl_in_rule__DispatchExpression__Group_1__35825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DispatchExpression__Group_1__3__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0__0__Impl_in_rule__DispatchExpression__Group_1_0__05892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__0_in_rule__DispatchExpression__Group_1_0__0__Impl5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__0__Impl_in_rule__DispatchExpression__Group_1_0_0__05951 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__1_in_rule__DispatchExpression__Group_1_0_0__05954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__1__Impl_in_rule__DispatchExpression__Group_1_0_0__16012 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__2_in_rule__DispatchExpression__Group_1_0_0__16015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0_in_rule__DispatchExpression__Group_1_0_0__1__Impl6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__2__Impl_in_rule__DispatchExpression__Group_1_0_0__26073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__3_in_rule__DispatchExpression__Group_1_0_0__26076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DispatchExpression__Group_1_0_0__2__Impl6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0__3__Impl_in_rule__DispatchExpression__Group_1_0_0__36135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__RefAssignment_1_0_0_3_in_rule__DispatchExpression__Group_1_0_0__3__Impl6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__0__Impl_in_rule__DispatchExpression__Group_1_0_0_1__06200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1_in_rule__DispatchExpression__Group_1_0_0_1__06203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DispatchExpression__Group_1_0_0_1__0__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_0_0_1__1__Impl_in_rule__DispatchExpression__Group_1_0_0_1__16262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_1_in_rule__DispatchExpression__Group_1_0_0_1__1__Impl6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__0__Impl_in_rule__DispatchExpression__Group_1_2__06323 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__1_in_rule__DispatchExpression__Group_1_2__06326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_0_in_rule__DispatchExpression__Group_1_2__0__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2__1__Impl_in_rule__DispatchExpression__Group_1_2__16383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__0_in_rule__DispatchExpression__Group_1_2__1__Impl6410 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__0__Impl_in_rule__DispatchExpression__Group_1_2_1__06445 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__1_in_rule__DispatchExpression__Group_1_2_1__06448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DispatchExpression__Group_1_2_1__0__Impl6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1_2_1__1__Impl_in_rule__DispatchExpression__Group_1_2_1__16507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__ActualAssignment_1_2_1_1_in_rule__DispatchExpression__Group_1_2_1__1__Impl6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__0__Impl_in_rule__StaticDispatchExpression__Group__06568 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__1_in_rule__StaticDispatchExpression__Group__06571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__RefAssignment_0_in_rule__StaticDispatchExpression__Group__0__Impl6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__1__Impl_in_rule__StaticDispatchExpression__Group__16628 = new BitSet(new long[]{0x000062889B05C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__2_in_rule__StaticDispatchExpression__Group__16631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StaticDispatchExpression__Group__1__Impl6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__2__Impl_in_rule__StaticDispatchExpression__Group__26690 = new BitSet(new long[]{0x000062889B05C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__3_in_rule__StaticDispatchExpression__Group__26693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__0_in_rule__StaticDispatchExpression__Group__2__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group__3__Impl_in_rule__StaticDispatchExpression__Group__36751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StaticDispatchExpression__Group__3__Impl6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__0__Impl_in_rule__StaticDispatchExpression__Group_2__06818 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__1_in_rule__StaticDispatchExpression__Group_2__06821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_0_in_rule__StaticDispatchExpression__Group_2__0__Impl6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2__1__Impl_in_rule__StaticDispatchExpression__Group_2__16878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__0_in_rule__StaticDispatchExpression__Group_2__1__Impl6905 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__0__Impl_in_rule__StaticDispatchExpression__Group_2_1__06940 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__1_in_rule__StaticDispatchExpression__Group_2_1__06943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StaticDispatchExpression__Group_2_1__0__Impl6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__Group_2_1__1__Impl_in_rule__StaticDispatchExpression__Group_2_1__17002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticDispatchExpression__ActualAssignment_2_1_1_in_rule__StaticDispatchExpression__Group_2_1__1__Impl7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__07063 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__07066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ConditionalExpression__Group__0__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__17125 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__2_in_rule__ConditionalExpression__Group__17128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__PredAssignment_1_in_rule__ConditionalExpression__Group__1__Impl7155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__2__Impl_in_rule__ConditionalExpression__Group__27185 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__3_in_rule__ConditionalExpression__Group__27188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ConditionalExpression__Group__2__Impl7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__3__Impl_in_rule__ConditionalExpression__Group__37247 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__4_in_rule__ConditionalExpression__Group__37250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Then_expAssignment_3_in_rule__ConditionalExpression__Group__3__Impl7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__4__Impl_in_rule__ConditionalExpression__Group__47307 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__5_in_rule__ConditionalExpression__Group__47310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ConditionalExpression__Group__4__Impl7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__5__Impl_in_rule__ConditionalExpression__Group__57369 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__6_in_rule__ConditionalExpression__Group__57372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Else_expAssignment_5_in_rule__ConditionalExpression__Group__5__Impl7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__6__Impl_in_rule__ConditionalExpression__Group__67429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ConditionalExpression__Group__6__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__0__Impl_in_rule__LoopExpression__Group__07502 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__1_in_rule__LoopExpression__Group__07505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LoopExpression__Group__0__Impl7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__1__Impl_in_rule__LoopExpression__Group__17564 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__2_in_rule__LoopExpression__Group__17567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__PredAssignment_1_in_rule__LoopExpression__Group__1__Impl7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__2__Impl_in_rule__LoopExpression__Group__27624 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__3_in_rule__LoopExpression__Group__27627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LoopExpression__Group__2__Impl7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__3__Impl_in_rule__LoopExpression__Group__37686 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__4_in_rule__LoopExpression__Group__37689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__BodyAssignment_3_in_rule__LoopExpression__Group__3__Impl7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopExpression__Group__4__Impl_in_rule__LoopExpression__Group__47746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__LoopExpression__Group__4__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__0__Impl_in_rule__BlockExpression__Group__07815 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__1_in_rule__BlockExpression__Group__07818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__1__Impl_in_rule__BlockExpression__Group__17876 = new BitSet(new long[]{0x000062C89905C070L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__2_in_rule__BlockExpression__Group__17879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BlockExpression__Group__1__Impl7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__2__Impl_in_rule__BlockExpression__Group__27938 = new BitSet(new long[]{0x000062C89905C070L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__3_in_rule__BlockExpression__Group__27941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__0_in_rule__BlockExpression__Group__2__Impl7968 = new BitSet(new long[]{0x000062889905C072L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__3__Impl_in_rule__BlockExpression__Group__37999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__BlockExpression__Group__3__Impl8027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__0__Impl_in_rule__BlockExpression__Group_2__08066 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__1_in_rule__BlockExpression__Group_2__08069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__BodyAssignment_2_0_in_rule__BlockExpression__Group_2__0__Impl8096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_2__1__Impl_in_rule__BlockExpression__Group_2__18126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BlockExpression__Group_2__1__Impl8154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__0__Impl_in_rule__LetExpression__Group__08189 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__1_in_rule__LetExpression__Group__08192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LetExpression__Group__0__Impl8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__1__Impl_in_rule__LetExpression__Group__18251 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__2_in_rule__LetExpression__Group__18254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__DeclarationAssignment_1_in_rule__LetExpression__Group__1__Impl8283 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__LetExpression__DeclarationAssignment_1_in_rule__LetExpression__Group__1__Impl8295 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__2__Impl_in_rule__LetExpression__Group__28328 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__3_in_rule__LetExpression__Group__28331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__LetExpression__Group__2__Impl8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__3__Impl_in_rule__LetExpression__Group__38390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__BodyAssignment_3_in_rule__LetExpression__Group__3__Impl8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__0__Impl_in_rule__LetDeclaration__Group__08455 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__1_in_rule__LetDeclaration__Group__08458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__NameAssignment_0_in_rule__LetDeclaration__Group__0__Impl8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__1__Impl_in_rule__LetDeclaration__Group__18515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__2_in_rule__LetDeclaration__Group__18518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LetDeclaration__Group__1__Impl8546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__2__Impl_in_rule__LetDeclaration__Group__28577 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__3_in_rule__LetDeclaration__Group__28580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Type_declAssignment_2_in_rule__LetDeclaration__Group__2__Impl8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group__3__Impl_in_rule__LetDeclaration__Group__38637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__0_in_rule__LetDeclaration__Group__3__Impl8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__0__Impl_in_rule__LetDeclaration__Group_3__08703 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__1_in_rule__LetDeclaration__Group_3__08706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LetDeclaration__Group_3__0__Impl8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__Group_3__1__Impl_in_rule__LetDeclaration__Group_3__18765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetDeclaration__InitAssignment_3_1_in_rule__LetDeclaration__Group_3__1__Impl8792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__08826 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__08829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__CaseExpression__Group__0__Impl8857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__18888 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__18891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__ExprAssignment_1_in_rule__CaseExpression__Group__1__Impl8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__28948 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__28951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__CaseExpression__Group__2__Impl8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__39010 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__4_in_rule__CaseExpression__Group__39013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__CaseAssignment_3_in_rule__CaseExpression__Group__3__Impl9042 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__CaseExpression__CaseAssignment_3_in_rule__CaseExpression__Group__3__Impl9054 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__4__Impl_in_rule__CaseExpression__Group__49087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__CaseExpression__Group__4__Impl9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__09156 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Case__Group__1_in_rule__Case__Group__09159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl9186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__19216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Case__Group__2_in_rule__Case__Group__19219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Case__Group__1__Impl9247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__29278 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Case__Group__3_in_rule__Case__Group__29281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Type_declAssignment_2_in_rule__Case__Group__2__Impl9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__39338 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__Case__Group__4_in_rule__Case__Group__39341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Case__Group__3__Impl9369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__49400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__ExprAssignment_4_in_rule__Case__Group__4__Impl9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__0__Impl_in_rule__NewExpression__Group__09467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__1_in_rule__NewExpression__Group__09470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NewExpression__Group__0__Impl9498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Group__1__Impl_in_rule__NewExpression__Group__19529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewExpression__Type_nameAssignment_1_in_rule__NewExpression__Group__1__Impl9556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__0__Impl_in_rule__IsvoidExpression__Group__09590 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__1_in_rule__IsvoidExpression__Group__09593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__IsvoidExpression__Group__0__Impl9621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__Group__1__Impl_in_rule__IsvoidExpression__Group__19652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsvoidExpression__ExprAssignment_1_in_rule__IsvoidExpression__Group__1__Impl9679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__09713 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__09716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_rule__CompareExpression__Group__0__Impl9743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__19772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__09834 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__09837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl9864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__19894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__09955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl9982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__010014 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__010017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__110075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OpAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__010136 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__010139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl10166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__110195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl10222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__010257 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__010260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0__0_in_rule__AdditionExpression__Group_1__0__Impl10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__110317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__RightAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0__0__Impl_in_rule__AdditionExpression__Group_1_0__010378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Alternatives_1_0_0_in_rule__AdditionExpression__Group_1_0__0__Impl10405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__0__Impl_in_rule__AdditionExpression__Group_1_0_0_0__010437 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1_in_rule__AdditionExpression__Group_1_0_0_0__010440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_0__1__Impl_in_rule__AdditionExpression__Group_1_0_0_0__110498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AdditionExpression__Group_1_0_0_0__1__Impl10526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__0__Impl_in_rule__AdditionExpression__Group_1_0_0_1__010561 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1_in_rule__AdditionExpression__Group_1_0_0_1__010564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1_0_0_1__1__Impl_in_rule__AdditionExpression__Group_1_0_0_1__110622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AdditionExpression__Group_1_0_0_1__1__Impl10650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__010685 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__010688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__MultiplicationExpression__Group__0__Impl10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__110744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl10771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__010806 = new BitSet(new long[]{0x000062889905C070L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__010809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0__0_in_rule__MultiplicationExpression__Group_1__0__Impl10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__110866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__RightAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl10893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0__010927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Alternatives_1_0_0_in_rule__MultiplicationExpression__Group_1_0__0__Impl10954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__010986 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1_in_rule__MultiplicationExpression__Group_1_0_0_0__010989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_0__111047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MultiplicationExpression__Group_1_0_0_0__1__Impl11075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__0__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__011110 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1_in_rule__MultiplicationExpression__Group_1_0_0_1__011113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl_in_rule__MultiplicationExpression__Group_1_0_0_1__111171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MultiplicationExpression__Group_1_0_0_1__1__Impl11199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass__in_rule__Program__ClassesAssignment11239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Class___NameAssignment_111270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class___ParentAssignment_2_111305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature__in_rule__Class___FeaturesAssignment_411340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Attr__NameAssignment_011371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attr__Type_declAssignment_211406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Attr__InitAssignment_3_111441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Method__NameAssignment_011472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_011503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormal_in_rule__Method__FormalsAssignment_2_1_111534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__Return_typeAssignment_511569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Method__ExprAssignment_711604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Formal__NameAssignment_011635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Formal__Type_declAssignment_211670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IdentifierRefExpression__IdAssignment11709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment11744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__BooleanLiteral__ValueAssignment11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParenExpression__ExprAssignment_111837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__AssignmentExpression__NameAssignment_011868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AssignmentExpression__ExprAssignment_211899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__NegationExpression__ExprAssignment_111930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__IntegerComposite__ExprAssignment_111961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DispatchExpression__Type_nameAssignment_1_0_0_1_111996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_rule__DispatchExpression__RefAssignment_1_0_0_312031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_012062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DispatchExpression__ActualAssignment_1_2_1_112093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_rule__StaticDispatchExpression__RefAssignment_012124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_012155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__StaticDispatchExpression__ActualAssignment_2_1_112186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__PredAssignment_112217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__Then_expAssignment_312248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__Else_expAssignment_512279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LoopExpression__PredAssignment_112310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LoopExpression__BodyAssignment_312341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__BlockExpression__BodyAssignment_2_012372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_rule__LetExpression__DeclarationAssignment_112403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LetExpression__BodyAssignment_312434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__LetDeclaration__NameAssignment_012465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LetDeclaration__Type_declAssignment_212500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LetDeclaration__InitAssignment_3_112535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CaseExpression__ExprAssignment_112566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__CaseExpression__CaseAssignment_312597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_rule__Case__NameAssignment_012628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Case__Type_declAssignment_212663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Case__ExprAssignment_412698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewExpression__Type_nameAssignment_112733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__IsvoidExpression__ExprAssignment_112768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareExpression__OpAssignment_1_0_0_112799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CompareExpression__RightAssignment_1_112830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AdditionExpression__RightAssignment_1_112861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__MultiplicationExpression__RightAssignment_1_112892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DispatchExpression__Group_1__0_in_synpred30_InternalCool5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_synpred40_InternalCool9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_synpred41_InternalCool10222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_synpred42_InternalCool10771 = new BitSet(new long[]{0x0000000000000002L});

}