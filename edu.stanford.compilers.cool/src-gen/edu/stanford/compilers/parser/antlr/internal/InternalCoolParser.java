package edu.stanford.compilers.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.stanford.compilers.services.CoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCoolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'inherits'", "'{'", "'}'", "';'", "':'", "'<-'", "'('", "','", "')'", "'self'", "'not'", "'~'", "'@'", "'.'", "'if'", "'then'", "'else'", "'fi'", "'while'", "'loop'", "'pool'", "'let'", "'in'", "'case'", "'of'", "'esac'", "'=>'", "'new'", "'isvoid'", "'<'", "'<='", "'='", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'"
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
    public String getGrammarFileName() { return "../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g"; }



     	private CoolGrammarAccess grammarAccess;
     	
        public InternalCoolParser(TokenStream input, CoolGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected CoolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_classes_0_0= ruleClass_ ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_classes_0_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:79:28: ( ( (lv_classes_0_0= ruleClass_ ) )* )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:80:1: ( (lv_classes_0_0= ruleClass_ ) )*
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:80:1: ( (lv_classes_0_0= ruleClass_ ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:81:1: (lv_classes_0_0= ruleClass_ )
            	    {
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:81:1: (lv_classes_0_0= ruleClass_ )
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:82:3: lv_classes_0_0= ruleClass_
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getClassesClass_ParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleClass__in_ruleProgram130);
            	    lv_classes_0_0=ruleClass_();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classes",
            	              		lv_classes_0_0, 
            	              		"Class_");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleClass_"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:106:1: entryRuleClass_ returns [EObject current=null] : iv_ruleClass_= ruleClass_ EOF ;
    public final EObject entryRuleClass_() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_ = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:107:2: (iv_ruleClass_= ruleClass_ EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:108:2: iv_ruleClass_= ruleClass_ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_Rule()); 
            }
            pushFollow(FOLLOW_ruleClass__in_entryRuleClass_166);
            iv_ruleClass_=ruleClass_();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClass_"


    // $ANTLR start "ruleClass_"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:115:1: ruleClass_ returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= ruleSYMBOL ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature_ ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleClass_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:118:28: ( (otherlv_0= 'class' ( (lv_name_1_0= ruleSYMBOL ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature_ ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:119:1: (otherlv_0= 'class' ( (lv_name_1_0= ruleSYMBOL ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature_ ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:119:1: (otherlv_0= 'class' ( (lv_name_1_0= ruleSYMBOL ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature_ ) )* otherlv_6= '}' otherlv_7= ';' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:119:3: otherlv_0= 'class' ( (lv_name_1_0= ruleSYMBOL ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature_ ) )* otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleClass_213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClass_Access().getClassKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:123:1: ( (lv_name_1_0= ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:124:1: (lv_name_1_0= ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:124:1: (lv_name_1_0= ruleSYMBOL )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:125:3: lv_name_1_0= ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClass_Access().getNameSYMBOLParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_ruleClass_234);
            lv_name_1_0=ruleSYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClass_Rule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"SYMBOL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:141:2: (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:141:4: otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleClass_247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getClass_Access().getInheritsKeyword_2_0());
                          
                    }
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:145:1: ( (otherlv_3= RULE_ID ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:146:1: (otherlv_3= RULE_ID )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:146:1: (otherlv_3= RULE_ID )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:147:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClass_Rule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass_267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getClass_Access().getParentTypeCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleClass_281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClass_Access().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:162:1: ( (lv_features_5_0= ruleFeature_ ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:163:1: (lv_features_5_0= ruleFeature_ )
            	    {
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:163:1: (lv_features_5_0= ruleFeature_ )
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:164:3: lv_features_5_0= ruleFeature_
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_Access().getFeaturesFeature_ParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature__in_ruleClass_302);
            	    lv_features_5_0=ruleFeature_();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_5_0, 
            	              		"Feature_");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleClass_315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getClass_Access().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleClass_327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getClass_Access().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClass_"


    // $ANTLR start "entryRuleFeature_"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:196:1: entryRuleFeature_ returns [EObject current=null] : iv_ruleFeature_= ruleFeature_ EOF ;
    public final EObject entryRuleFeature_() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_ = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:197:2: (iv_ruleFeature_= ruleFeature_ EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:198:2: iv_ruleFeature_= ruleFeature_ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeature_Rule()); 
            }
            pushFollow(FOLLOW_ruleFeature__in_entryRuleFeature_363);
            iv_ruleFeature_=ruleFeature_();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature_; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_373); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeature_"


    // $ANTLR start "ruleFeature_"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:205:1: ruleFeature_ returns [EObject current=null] : (this_Attr_0= ruleAttr | this_Method_1= ruleMethod ) ;
    public final EObject ruleFeature_() throws RecognitionException {
        EObject current = null;

        EObject this_Attr_0 = null;

        EObject this_Method_1 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:208:28: ( (this_Attr_0= ruleAttr | this_Method_1= ruleMethod ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:209:1: (this_Attr_0= ruleAttr | this_Method_1= ruleMethod )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:209:1: (this_Attr_0= ruleAttr | this_Method_1= ruleMethod )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==18) ) {
                    alt4=2;
                }
                else if ( (LA4_1==16) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==21) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==16) ) {
                    alt4=1;
                }
                else if ( (LA4_2==18) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:210:5: this_Attr_0= ruleAttr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeature_Access().getAttrParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttr_in_ruleFeature_420);
                    this_Attr_0=ruleAttr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Attr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:220:5: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeature_Access().getMethodParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMethod_in_ruleFeature_447);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Method_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFeature_"


    // $ANTLR start "entryRuleAttr"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:236:1: entryRuleAttr returns [EObject current=null] : iv_ruleAttr= ruleAttr EOF ;
    public final EObject entryRuleAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttr = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:237:2: (iv_ruleAttr= ruleAttr EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:238:2: iv_ruleAttr= ruleAttr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttrRule()); 
            }
            pushFollow(FOLLOW_ruleAttr_in_entryRuleAttr482);
            iv_ruleAttr=ruleAttr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttr492); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttr"


    // $ANTLR start "ruleAttr"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:245:1: ruleAttr returns [EObject current=null] : ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:248:28: ( ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )? otherlv_5= ';' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:249:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:249:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:249:2: ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )? otherlv_5= ';'
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:249:2: ( (lv_name_0_0= ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:250:1: (lv_name_0_0= ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:250:1: (lv_name_0_0= ruleSYMBOL )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:251:3: lv_name_0_0= ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttrAccess().getNameSYMBOLParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_ruleAttr538);
            lv_name_0_0=ruleSYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttrRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"SYMBOL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAttr550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttrAccess().getColonKeyword_1());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:271:1: ( (otherlv_2= RULE_ID ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:272:1: (otherlv_2= RULE_ID )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:272:1: (otherlv_2= RULE_ID )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:273:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAttrRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttr570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAttrAccess().getType_declTypeCrossReference_2_0()); 
              	
            }

            }


            }

            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:284:2: (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:284:4: otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAttr583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAttrAccess().getLessThanSignHyphenMinusKeyword_3_0());
                          
                    }
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:288:1: ( (lv_init_4_0= ruleExpression ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:289:1: (lv_init_4_0= ruleExpression )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:289:1: (lv_init_4_0= ruleExpression )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:290:3: lv_init_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttrAccess().getInitExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAttr604);
                    lv_init_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttrRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleAttr618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAttrAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttr"


    // $ANTLR start "entryRuleMethod"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:318:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:319:2: (iv_ruleMethod= ruleMethod EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:320:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod654);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod664); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:327:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '(' ( ( (lv_formals_2_0= ruleFormal ) ) (otherlv_3= ',' ( (lv_formals_4_0= ruleFormal ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_expr_9_0= ruleExpression ) ) otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_formals_2_0 = null;

        EObject lv_formals_4_0 = null;

        EObject lv_expr_9_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:330:28: ( ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '(' ( ( (lv_formals_2_0= ruleFormal ) ) (otherlv_3= ',' ( (lv_formals_4_0= ruleFormal ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_expr_9_0= ruleExpression ) ) otherlv_10= '}' otherlv_11= ';' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:331:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '(' ( ( (lv_formals_2_0= ruleFormal ) ) (otherlv_3= ',' ( (lv_formals_4_0= ruleFormal ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_expr_9_0= ruleExpression ) ) otherlv_10= '}' otherlv_11= ';' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:331:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '(' ( ( (lv_formals_2_0= ruleFormal ) ) (otherlv_3= ',' ( (lv_formals_4_0= ruleFormal ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_expr_9_0= ruleExpression ) ) otherlv_10= '}' otherlv_11= ';' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:331:2: ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '(' ( ( (lv_formals_2_0= ruleFormal ) ) (otherlv_3= ',' ( (lv_formals_4_0= ruleFormal ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_expr_9_0= ruleExpression ) ) otherlv_10= '}' otherlv_11= ';'
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:331:2: ( (lv_name_0_0= ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:332:1: (lv_name_0_0= ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:332:1: (lv_name_0_0= ruleSYMBOL )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:333:3: lv_name_0_0= ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getNameSYMBOLParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_ruleMethod710);
            lv_name_0_0=ruleSYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"SYMBOL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleMethod722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:353:1: ( ( (lv_formals_2_0= ruleFormal ) ) (otherlv_3= ',' ( (lv_formals_4_0= ruleFormal ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:353:2: ( (lv_formals_2_0= ruleFormal ) ) (otherlv_3= ',' ( (lv_formals_4_0= ruleFormal ) ) )*
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:353:2: ( (lv_formals_2_0= ruleFormal ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:354:1: (lv_formals_2_0= ruleFormal )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:354:1: (lv_formals_2_0= ruleFormal )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:355:3: lv_formals_2_0= ruleFormal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormal_in_ruleMethod744);
                    lv_formals_2_0=ruleFormal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"formals",
                              		lv_formals_2_0, 
                              		"Formal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:371:2: (otherlv_3= ',' ( (lv_formals_4_0= ruleFormal ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:371:4: otherlv_3= ',' ( (lv_formals_4_0= ruleFormal ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMethod757); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:375:1: ( (lv_formals_4_0= ruleFormal ) )
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:376:1: (lv_formals_4_0= ruleFormal )
                    	    {
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:376:1: (lv_formals_4_0= ruleFormal )
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:377:3: lv_formals_4_0= ruleFormal
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getFormalsFormalParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFormal_in_ruleMethod778);
                    	    lv_formals_4_0=ruleFormal();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formals",
                    	              		lv_formals_4_0, 
                    	              		"Formal");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleMethod794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleMethod806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getColonKeyword_4());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:401:1: ( (otherlv_7= RULE_ID ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:402:1: (otherlv_7= RULE_ID )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:402:1: (otherlv_7= RULE_ID )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:403:3: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodRule());
              	        }
                      
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getReturn_typeTypeCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleMethod838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:418:1: ( (lv_expr_9_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:419:1: (lv_expr_9_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:419:1: (lv_expr_9_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:420:3: lv_expr_9_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getExprExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleMethod859);
            lv_expr_9_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_9_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleMethod871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8());
                  
            }
            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleMethod883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getSemicolonKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleFormal"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:452:1: entryRuleFormal returns [EObject current=null] : iv_ruleFormal= ruleFormal EOF ;
    public final EObject entryRuleFormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormal = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:453:2: (iv_ruleFormal= ruleFormal EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:454:2: iv_ruleFormal= ruleFormal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalRule()); 
            }
            pushFollow(FOLLOW_ruleFormal_in_entryRuleFormal919);
            iv_ruleFormal=ruleFormal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormal929); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFormal"


    // $ANTLR start "ruleFormal"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:461:1: ruleFormal returns [EObject current=null] : ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleFormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:464:28: ( ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:465:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:465:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:465:2: ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:465:2: ( (lv_name_0_0= ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:466:1: (lv_name_0_0= ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:466:1: (lv_name_0_0= ruleSYMBOL )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:467:3: lv_name_0_0= ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalAccess().getNameSYMBOLParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_ruleFormal975);
            lv_name_0_0=ruleSYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormalRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"SYMBOL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleFormal987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFormalAccess().getColonKeyword_1());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:487:1: ( (otherlv_2= RULE_ID ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:488:1: (otherlv_2= RULE_ID )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:488:1: (otherlv_2= RULE_ID )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:489:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFormalRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormal1007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getFormalAccess().getType_declTypeCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFormal"


    // $ANTLR start "entryRuleExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:508:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:509:2: (iv_ruleExpression= ruleExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:510:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1043);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1053); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:517:1: ruleExpression returns [EObject current=null] : this_DispatchExpression_0= ruleDispatchExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DispatchExpression_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:520:28: (this_DispatchExpression_0= ruleDispatchExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:522:5: this_DispatchExpression_0= ruleDispatchExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getDispatchExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleDispatchExpression_in_ruleExpression1099);
            this_DispatchExpression_0=ruleDispatchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DispatchExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:538:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:539:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:540:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1133);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1143); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:547:1: rulePrimaryExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression | this_LoopExpression_1= ruleLoopExpression | this_BlockExpression_2= ruleBlockExpression | this_LetExpression_3= ruleLetExpression | this_CaseExpression_4= ruleCaseExpression | this_NewExpression_5= ruleNewExpression | this_IsvoidExpression_6= ruleIsvoidExpression | this_AssignmentExpression_7= ruleAssignmentExpression | this_SelfTypeLiteral_8= ruleSelfTypeLiteral | this_IdentifierRefExpression_9= ruleIdentifierRefExpression | this_Literal_10= ruleLiteral | this_ParenExpression_11= ruleParenExpression | this_NegationExpression_12= ruleNegationExpression | this_IntegerComposite_13= ruleIntegerComposite | this_StaticDispatchExpression_14= ruleStaticDispatchExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        EObject this_LoopExpression_1 = null;

        EObject this_BlockExpression_2 = null;

        EObject this_LetExpression_3 = null;

        EObject this_CaseExpression_4 = null;

        EObject this_NewExpression_5 = null;

        EObject this_IsvoidExpression_6 = null;

        EObject this_AssignmentExpression_7 = null;

        EObject this_SelfTypeLiteral_8 = null;

        EObject this_IdentifierRefExpression_9 = null;

        EObject this_Literal_10 = null;

        EObject this_ParenExpression_11 = null;

        EObject this_NegationExpression_12 = null;

        EObject this_IntegerComposite_13 = null;

        EObject this_StaticDispatchExpression_14 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:550:28: ( (this_ConditionalExpression_0= ruleConditionalExpression | this_LoopExpression_1= ruleLoopExpression | this_BlockExpression_2= ruleBlockExpression | this_LetExpression_3= ruleLetExpression | this_CaseExpression_4= ruleCaseExpression | this_NewExpression_5= ruleNewExpression | this_IsvoidExpression_6= ruleIsvoidExpression | this_AssignmentExpression_7= ruleAssignmentExpression | this_SelfTypeLiteral_8= ruleSelfTypeLiteral | this_IdentifierRefExpression_9= ruleIdentifierRefExpression | this_Literal_10= ruleLiteral | this_ParenExpression_11= ruleParenExpression | this_NegationExpression_12= ruleNegationExpression | this_IntegerComposite_13= ruleIntegerComposite | this_StaticDispatchExpression_14= ruleStaticDispatchExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:551:1: (this_ConditionalExpression_0= ruleConditionalExpression | this_LoopExpression_1= ruleLoopExpression | this_BlockExpression_2= ruleBlockExpression | this_LetExpression_3= ruleLetExpression | this_CaseExpression_4= ruleCaseExpression | this_NewExpression_5= ruleNewExpression | this_IsvoidExpression_6= ruleIsvoidExpression | this_AssignmentExpression_7= ruleAssignmentExpression | this_SelfTypeLiteral_8= ruleSelfTypeLiteral | this_IdentifierRefExpression_9= ruleIdentifierRefExpression | this_Literal_10= ruleLiteral | this_ParenExpression_11= ruleParenExpression | this_NegationExpression_12= ruleNegationExpression | this_IntegerComposite_13= ruleIntegerComposite | this_StaticDispatchExpression_14= ruleStaticDispatchExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:551:1: (this_ConditionalExpression_0= ruleConditionalExpression | this_LoopExpression_1= ruleLoopExpression | this_BlockExpression_2= ruleBlockExpression | this_LetExpression_3= ruleLetExpression | this_CaseExpression_4= ruleCaseExpression | this_NewExpression_5= ruleNewExpression | this_IsvoidExpression_6= ruleIsvoidExpression | this_AssignmentExpression_7= ruleAssignmentExpression | this_SelfTypeLiteral_8= ruleSelfTypeLiteral | this_IdentifierRefExpression_9= ruleIdentifierRefExpression | this_Literal_10= ruleLiteral | this_ParenExpression_11= ruleParenExpression | this_NegationExpression_12= ruleNegationExpression | this_IntegerComposite_13= ruleIntegerComposite | this_StaticDispatchExpression_14= ruleStaticDispatchExpression )
            int alt8=15;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:552:5: this_ConditionalExpression_0= ruleConditionalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConditionalExpression_in_rulePrimaryExpression1190);
                    this_ConditionalExpression_0=ruleConditionalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConditionalExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:562:5: this_LoopExpression_1= ruleLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLoopExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLoopExpression_in_rulePrimaryExpression1217);
                    this_LoopExpression_1=ruleLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LoopExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:572:5: this_BlockExpression_2= ruleBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBlockExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockExpression_in_rulePrimaryExpression1244);
                    this_BlockExpression_2=ruleBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BlockExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:582:5: this_LetExpression_3= ruleLetExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLetExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLetExpression_in_rulePrimaryExpression1271);
                    this_LetExpression_3=ruleLetExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LetExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:592:5: this_CaseExpression_4= ruleCaseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCaseExpression_in_rulePrimaryExpression1298);
                    this_CaseExpression_4=ruleCaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CaseExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:602:5: this_NewExpression_5= ruleNewExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNewExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewExpression_in_rulePrimaryExpression1325);
                    this_NewExpression_5=ruleNewExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:612:5: this_IsvoidExpression_6= ruleIsvoidExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIsvoidExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIsvoidExpression_in_rulePrimaryExpression1352);
                    this_IsvoidExpression_6=ruleIsvoidExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IsvoidExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:622:5: this_AssignmentExpression_7= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAssignmentExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_rulePrimaryExpression1379);
                    this_AssignmentExpression_7=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssignmentExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:632:5: this_SelfTypeLiteral_8= ruleSelfTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelfTypeLiteralParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelfTypeLiteral_in_rulePrimaryExpression1406);
                    this_SelfTypeLiteral_8=ruleSelfTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelfTypeLiteral_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:642:5: this_IdentifierRefExpression_9= ruleIdentifierRefExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIdentifierRefExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifierRefExpression_in_rulePrimaryExpression1433);
                    this_IdentifierRefExpression_9=ruleIdentifierRefExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdentifierRefExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:652:5: this_Literal_10= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression1460);
                    this_Literal_10=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:662:5: this_ParenExpression_11= ruleParenExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenExpression_in_rulePrimaryExpression1487);
                    this_ParenExpression_11=ruleParenExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:672:5: this_NegationExpression_12= ruleNegationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNegationExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegationExpression_in_rulePrimaryExpression1514);
                    this_NegationExpression_12=ruleNegationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NegationExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:682:5: this_IntegerComposite_13= ruleIntegerComposite
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIntegerCompositeParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerComposite_in_rulePrimaryExpression1541);
                    this_IntegerComposite_13=ruleIntegerComposite();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerComposite_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:692:5: this_StaticDispatchExpression_14= ruleStaticDispatchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getStaticDispatchExpressionParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticDispatchExpression_in_rulePrimaryExpression1568);
                    this_StaticDispatchExpression_14=ruleStaticDispatchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StaticDispatchExpression_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleSelfTypeLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:708:1: entryRuleSelfTypeLiteral returns [EObject current=null] : iv_ruleSelfTypeLiteral= ruleSelfTypeLiteral EOF ;
    public final EObject entryRuleSelfTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfTypeLiteral = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:709:2: (iv_ruleSelfTypeLiteral= ruleSelfTypeLiteral EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:710:2: iv_ruleSelfTypeLiteral= ruleSelfTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleSelfTypeLiteral_in_entryRuleSelfTypeLiteral1603);
            iv_ruleSelfTypeLiteral=ruleSelfTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfTypeLiteral1613); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelfTypeLiteral"


    // $ANTLR start "ruleSelfTypeLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:717:1: ruleSelfTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:720:28: ( ( () otherlv_1= 'self' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:721:1: ( () otherlv_1= 'self' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:721:1: ( () otherlv_1= 'self' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:721:2: () otherlv_1= 'self'
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:721:2: ()
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:722:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelfTypeLiteralAccess().getSelfTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSelfTypeLiteral1659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelfTypeLiteralAccess().getSelfKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelfTypeLiteral"


    // $ANTLR start "entryRuleIdentifierRefExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:739:1: entryRuleIdentifierRefExpression returns [EObject current=null] : iv_ruleIdentifierRefExpression= ruleIdentifierRefExpression EOF ;
    public final EObject entryRuleIdentifierRefExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierRefExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:740:2: (iv_ruleIdentifierRefExpression= ruleIdentifierRefExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:741:2: iv_ruleIdentifierRefExpression= ruleIdentifierRefExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRefExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierRefExpression_in_entryRuleIdentifierRefExpression1695);
            iv_ruleIdentifierRefExpression=ruleIdentifierRefExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierRefExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierRefExpression1705); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifierRefExpression"


    // $ANTLR start "ruleIdentifierRefExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:748:1: ruleIdentifierRefExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIdentifierRefExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:751:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:752:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:752:1: ( (otherlv_0= RULE_ID ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:753:1: (otherlv_0= RULE_ID )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:753:1: (otherlv_0= RULE_ID )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:754:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierRefExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifierRefExpression1749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdentifierRefExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:773:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:774:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:775:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1784);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1794); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:782:1: ruleLiteral returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:785:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:786:1: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:786:1: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case 48:
            case 49:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:787:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral1841);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:797:5: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral1868);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:807:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral1895);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:823:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:824:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:825:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1930);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral1940); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:832:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:835:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:836:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:836:1: ( (lv_value_0_0= RULE_INT ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:837:1: (lv_value_0_0= RULE_INT )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:837:1: (lv_value_0_0= RULE_INT )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:838:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberLiteral1981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumberLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:862:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:863:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:864:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2021);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2031); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:871:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:874:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:875:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:875:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:876:1: (lv_value_0_0= RULE_STRING )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:876:1: (lv_value_0_0= RULE_STRING )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:877:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:901:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:902:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:903:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2112);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2122); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:910:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:913:28: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:914:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:914:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:915:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:915:1: (lv_value_0_0= ruleBOOLEAN )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:916:3: lv_value_0_0= ruleBOOLEAN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral2167);
            lv_value_0_0=ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBooleanLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BOOLEAN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleParenExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:940:1: entryRuleParenExpression returns [EObject current=null] : iv_ruleParenExpression= ruleParenExpression EOF ;
    public final EObject entryRuleParenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:941:2: (iv_ruleParenExpression= ruleParenExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:942:2: iv_ruleParenExpression= ruleParenExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenExpression_in_entryRuleParenExpression2202);
            iv_ruleParenExpression=ruleParenExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenExpression2212); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenExpression"


    // $ANTLR start "ruleParenExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:949:1: ruleParenExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:952:28: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:953:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:953:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:953:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleParenExpression2249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:957:1: ( (lv_expr_1_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:958:1: (lv_expr_1_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:958:1: (lv_expr_1_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:959:3: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenExpression2270);
            lv_expr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleParenExpression2282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParenExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:987:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:988:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:989:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression2318);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression2328); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:996:1: ruleAssignmentExpression returns [EObject current=null] : ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:999:28: ( ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1000:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1000:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1000:2: ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1000:2: ( (lv_name_0_0= ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1001:1: (lv_name_0_0= ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1001:1: (lv_name_0_0= ruleSYMBOL )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1002:3: lv_name_0_0= ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getNameSYMBOLParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_ruleAssignmentExpression2374);
            lv_name_0_0=ruleSYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"SYMBOL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAssignmentExpression2386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentExpressionAccess().getLessThanSignHyphenMinusKeyword_1());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1022:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1023:1: (lv_expr_2_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1023:1: (lv_expr_2_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1024:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignmentExpression2407);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleNegationExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1048:1: entryRuleNegationExpression returns [EObject current=null] : iv_ruleNegationExpression= ruleNegationExpression EOF ;
    public final EObject entryRuleNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1049:2: (iv_ruleNegationExpression= ruleNegationExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1050:2: iv_ruleNegationExpression= ruleNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression2443);
            iv_ruleNegationExpression=ruleNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegationExpression2453); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegationExpression"


    // $ANTLR start "ruleNegationExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1057:1: ruleNegationExpression returns [EObject current=null] : (otherlv_0= 'not' ( (lv_expr_1_0= ruleExpression ) ) ) ;
    public final EObject ruleNegationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1060:28: ( (otherlv_0= 'not' ( (lv_expr_1_0= ruleExpression ) ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1061:1: (otherlv_0= 'not' ( (lv_expr_1_0= ruleExpression ) ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1061:1: (otherlv_0= 'not' ( (lv_expr_1_0= ruleExpression ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1061:3: otherlv_0= 'not' ( (lv_expr_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleNegationExpression2490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNegationExpressionAccess().getNotKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1065:1: ( (lv_expr_1_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1066:1: (lv_expr_1_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1066:1: (lv_expr_1_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1067:3: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleNegationExpression2511);
            lv_expr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegationExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNegationExpression"


    // $ANTLR start "entryRuleIntegerComposite"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1091:1: entryRuleIntegerComposite returns [EObject current=null] : iv_ruleIntegerComposite= ruleIntegerComposite EOF ;
    public final EObject entryRuleIntegerComposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerComposite = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1092:2: (iv_ruleIntegerComposite= ruleIntegerComposite EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1093:2: iv_ruleIntegerComposite= ruleIntegerComposite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerCompositeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerComposite_in_entryRuleIntegerComposite2547);
            iv_ruleIntegerComposite=ruleIntegerComposite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerComposite; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerComposite2557); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerComposite"


    // $ANTLR start "ruleIntegerComposite"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1100:1: ruleIntegerComposite returns [EObject current=null] : (otherlv_0= '~' ( (lv_expr_1_0= ruleExpression ) ) ) ;
    public final EObject ruleIntegerComposite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1103:28: ( (otherlv_0= '~' ( (lv_expr_1_0= ruleExpression ) ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1104:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExpression ) ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1104:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExpression ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1104:3: otherlv_0= '~' ( (lv_expr_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleIntegerComposite2594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerCompositeAccess().getTildeKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1108:1: ( (lv_expr_1_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1109:1: (lv_expr_1_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1109:1: (lv_expr_1_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1110:3: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerCompositeAccess().getExprExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIntegerComposite2615);
            lv_expr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerCompositeRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerComposite"


    // $ANTLR start "entryRuleDispatchExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1134:1: entryRuleDispatchExpression returns [EObject current=null] : iv_ruleDispatchExpression= ruleDispatchExpression EOF ;
    public final EObject entryRuleDispatchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDispatchExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1135:2: (iv_ruleDispatchExpression= ruleDispatchExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1136:2: iv_ruleDispatchExpression= ruleDispatchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDispatchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDispatchExpression_in_entryRuleDispatchExpression2651);
            iv_ruleDispatchExpression=ruleDispatchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDispatchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDispatchExpression2661); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDispatchExpression"


    // $ANTLR start "ruleDispatchExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1143:1: ruleDispatchExpression returns [EObject current=null] : (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )=> ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) ) ) otherlv_6= '(' ( ( (lv_actual_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )* )? otherlv_10= ')' )? ) ;
    public final EObject ruleDispatchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_CompareExpression_0 = null;

        EObject lv_ref_5_0 = null;

        EObject lv_actual_7_0 = null;

        EObject lv_actual_9_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1146:28: ( (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )=> ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) ) ) otherlv_6= '(' ( ( (lv_actual_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )* )? otherlv_10= ')' )? ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1147:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )=> ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) ) ) otherlv_6= '(' ( ( (lv_actual_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )* )? otherlv_10= ')' )? )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1147:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )=> ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) ) ) otherlv_6= '(' ( ( (lv_actual_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )* )? otherlv_10= ')' )? )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1148:5: this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )=> ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) ) ) otherlv_6= '(' ( ( (lv_actual_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )* )? otherlv_10= ')' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDispatchExpressionAccess().getCompareExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_ruleDispatchExpression2708);
            this_CompareExpression_0=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1156:1: ( ( ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )=> ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) ) ) otherlv_6= '(' ( ( (lv_actual_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )* )? otherlv_10= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred1_InternalCool()) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==25) ) {
                int LA13_2 = input.LA(2);

                if ( (synpred1_InternalCool()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1156:2: ( ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )=> ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) ) ) otherlv_6= '(' ( ( (lv_actual_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )* )? otherlv_10= ')'
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1156:2: ( ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )=> ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1156:3: ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )=> ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1168:6: ( () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1168:7: () (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '.' ( (lv_ref_5_0= ruleIdentifierRefExpression ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1168:7: ()
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1169:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1174:2: (otherlv_2= '@' ( (otherlv_3= RULE_ID ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==24) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1174:4: otherlv_2= '@' ( (otherlv_3= RULE_ID ) )
                            {
                            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleDispatchExpression2771); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getDispatchExpressionAccess().getCommercialAtKeyword_1_0_0_1_0());
                                  
                            }
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1178:1: ( (otherlv_3= RULE_ID ) )
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1179:1: (otherlv_3= RULE_ID )
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1179:1: (otherlv_3= RULE_ID )
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1180:3: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getDispatchExpressionRule());
                              	        }
                                      
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDispatchExpression2791); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_3, grammarAccess.getDispatchExpressionAccess().getType_nameTypeCrossReference_1_0_0_1_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleDispatchExpression2805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDispatchExpressionAccess().getFullStopKeyword_1_0_0_2());
                          
                    }
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1195:1: ( (lv_ref_5_0= ruleIdentifierRefExpression ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1196:1: (lv_ref_5_0= ruleIdentifierRefExpression )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1196:1: (lv_ref_5_0= ruleIdentifierRefExpression )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1197:3: lv_ref_5_0= ruleIdentifierRefExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_1_0_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifierRefExpression_in_ruleDispatchExpression2826);
                    lv_ref_5_0=ruleIdentifierRefExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDispatchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"ref",
                              		lv_ref_5_0, 
                              		"IdentifierRefExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleDispatchExpression2840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDispatchExpressionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1217:1: ( ( (lv_actual_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==13||LA12_0==18||(LA12_0>=21 && LA12_0<=23)||LA12_0==26||LA12_0==30||LA12_0==33||LA12_0==35||(LA12_0>=39 && LA12_0<=40)||(LA12_0>=48 && LA12_0<=49)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1217:2: ( (lv_actual_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )*
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1217:2: ( (lv_actual_7_0= ruleExpression ) )
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1218:1: (lv_actual_7_0= ruleExpression )
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1218:1: (lv_actual_7_0= ruleExpression )
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1219:3: lv_actual_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleDispatchExpression2862);
                            lv_actual_7_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDispatchExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"actual",
                                      		lv_actual_7_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1235:2: (otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==19) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1235:4: otherlv_8= ',' ( (lv_actual_9_0= ruleExpression ) )
                            	    {
                            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleDispatchExpression2875); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getDispatchExpressionAccess().getCommaKeyword_1_2_1_0());
                            	          
                            	    }
                            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1239:1: ( (lv_actual_9_0= ruleExpression ) )
                            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1240:1: (lv_actual_9_0= ruleExpression )
                            	    {
                            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1240:1: (lv_actual_9_0= ruleExpression )
                            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1241:3: lv_actual_9_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getDispatchExpressionAccess().getActualExpressionParserRuleCall_1_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleDispatchExpression2896);
                            	    lv_actual_9_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getDispatchExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"actual",
                            	              		lv_actual_9_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleDispatchExpression2912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDispatchExpressionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDispatchExpression"


    // $ANTLR start "entryRuleStaticDispatchExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1269:1: entryRuleStaticDispatchExpression returns [EObject current=null] : iv_ruleStaticDispatchExpression= ruleStaticDispatchExpression EOF ;
    public final EObject entryRuleStaticDispatchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticDispatchExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1270:2: (iv_ruleStaticDispatchExpression= ruleStaticDispatchExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1271:2: iv_ruleStaticDispatchExpression= ruleStaticDispatchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticDispatchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStaticDispatchExpression_in_entryRuleStaticDispatchExpression2950);
            iv_ruleStaticDispatchExpression=ruleStaticDispatchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticDispatchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticDispatchExpression2960); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticDispatchExpression"


    // $ANTLR start "ruleStaticDispatchExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1278:1: ruleStaticDispatchExpression returns [EObject current=null] : ( ( (lv_ref_0_0= ruleIdentifierRefExpression ) ) otherlv_1= '(' ( ( (lv_actual_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_actual_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleStaticDispatchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ref_0_0 = null;

        EObject lv_actual_2_0 = null;

        EObject lv_actual_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1281:28: ( ( ( (lv_ref_0_0= ruleIdentifierRefExpression ) ) otherlv_1= '(' ( ( (lv_actual_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_actual_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1282:1: ( ( (lv_ref_0_0= ruleIdentifierRefExpression ) ) otherlv_1= '(' ( ( (lv_actual_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_actual_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1282:1: ( ( (lv_ref_0_0= ruleIdentifierRefExpression ) ) otherlv_1= '(' ( ( (lv_actual_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_actual_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1282:2: ( (lv_ref_0_0= ruleIdentifierRefExpression ) ) otherlv_1= '(' ( ( (lv_actual_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_actual_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1282:2: ( (lv_ref_0_0= ruleIdentifierRefExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1283:1: (lv_ref_0_0= ruleIdentifierRefExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1283:1: (lv_ref_0_0= ruleIdentifierRefExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1284:3: lv_ref_0_0= ruleIdentifierRefExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStaticDispatchExpressionAccess().getRefIdentifierRefExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifierRefExpression_in_ruleStaticDispatchExpression3006);
            lv_ref_0_0=ruleIdentifierRefExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStaticDispatchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"ref",
                      		lv_ref_0_0, 
                      		"IdentifierRefExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleStaticDispatchExpression3018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStaticDispatchExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1304:1: ( ( (lv_actual_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_actual_4_0= ruleExpression ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==13||LA15_0==18||(LA15_0>=21 && LA15_0<=23)||LA15_0==26||LA15_0==30||LA15_0==33||LA15_0==35||(LA15_0>=39 && LA15_0<=40)||(LA15_0>=48 && LA15_0<=49)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1304:2: ( (lv_actual_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_actual_4_0= ruleExpression ) ) )*
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1304:2: ( (lv_actual_2_0= ruleExpression ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1305:1: (lv_actual_2_0= ruleExpression )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1305:1: (lv_actual_2_0= ruleExpression )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1306:3: lv_actual_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStaticDispatchExpression3040);
                    lv_actual_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticDispatchExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"actual",
                              		lv_actual_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1322:2: (otherlv_3= ',' ( (lv_actual_4_0= ruleExpression ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1322:4: otherlv_3= ',' ( (lv_actual_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStaticDispatchExpression3053); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getStaticDispatchExpressionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1326:1: ( (lv_actual_4_0= ruleExpression ) )
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1327:1: (lv_actual_4_0= ruleExpression )
                    	    {
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1327:1: (lv_actual_4_0= ruleExpression )
                    	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1328:3: lv_actual_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStaticDispatchExpressionAccess().getActualExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleStaticDispatchExpression3074);
                    	    lv_actual_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStaticDispatchExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"actual",
                    	              		lv_actual_4_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleStaticDispatchExpression3090); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getStaticDispatchExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticDispatchExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1356:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1357:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1358:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression3126);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression3136); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1365:1: ruleConditionalExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_exp_3_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_exp_5_0= ruleExpression ) ) )? otherlv_6= 'fi' ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_pred_1_0 = null;

        EObject lv_then_exp_3_0 = null;

        EObject lv_else_exp_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1368:28: ( (otherlv_0= 'if' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_exp_3_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_exp_5_0= ruleExpression ) ) )? otherlv_6= 'fi' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1369:1: (otherlv_0= 'if' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_exp_3_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_exp_5_0= ruleExpression ) ) )? otherlv_6= 'fi' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1369:1: (otherlv_0= 'if' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_exp_3_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_exp_5_0= ruleExpression ) ) )? otherlv_6= 'fi' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1369:3: otherlv_0= 'if' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_exp_3_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_exp_5_0= ruleExpression ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleConditionalExpression3173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionalExpressionAccess().getIfKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1373:1: ( (lv_pred_1_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1374:1: (lv_pred_1_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1374:1: (lv_pred_1_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1375:3: lv_pred_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConditionalExpression3194);
            lv_pred_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"pred",
                      		lv_pred_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleConditionalExpression3206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getThenKeyword_2());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1395:1: ( (lv_then_exp_3_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1396:1: (lv_then_exp_3_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1396:1: (lv_then_exp_3_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1397:3: lv_then_exp_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getThen_expExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConditionalExpression3227);
            lv_then_exp_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then_exp",
                      		lv_then_exp_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1413:2: ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_exp_5_0= ruleExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) && (synpred2_InternalCool())) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1413:3: ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_exp_5_0= ruleExpression ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1413:3: ( ( 'else' )=>otherlv_4= 'else' )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1413:4: ( 'else' )=>otherlv_4= 'else'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleConditionalExpression3248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getElseKeyword_4_0());
                          
                    }

                    }

                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1418:2: ( (lv_else_exp_5_0= ruleExpression ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1419:1: (lv_else_exp_5_0= ruleExpression )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1419:1: (lv_else_exp_5_0= ruleExpression )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1420:3: lv_else_exp_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getElse_expExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleConditionalExpression3270);
                    lv_else_exp_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else_exp",
                              		lv_else_exp_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleConditionalExpression3284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getConditionalExpressionAccess().getFiKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleLoopExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1448:1: entryRuleLoopExpression returns [EObject current=null] : iv_ruleLoopExpression= ruleLoopExpression EOF ;
    public final EObject entryRuleLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1449:2: (iv_ruleLoopExpression= ruleLoopExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1450:2: iv_ruleLoopExpression= ruleLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLoopExpression_in_entryRuleLoopExpression3320);
            iv_ruleLoopExpression=ruleLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopExpression3330); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLoopExpression"


    // $ANTLR start "ruleLoopExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1457:1: ruleLoopExpression returns [EObject current=null] : (otherlv_0= 'while' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_body_3_0= ruleExpression ) ) otherlv_4= 'pool' ) ;
    public final EObject ruleLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pred_1_0 = null;

        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1460:28: ( (otherlv_0= 'while' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_body_3_0= ruleExpression ) ) otherlv_4= 'pool' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1461:1: (otherlv_0= 'while' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_body_3_0= ruleExpression ) ) otherlv_4= 'pool' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1461:1: (otherlv_0= 'while' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_body_3_0= ruleExpression ) ) otherlv_4= 'pool' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1461:3: otherlv_0= 'while' ( (lv_pred_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_body_3_0= ruleExpression ) ) otherlv_4= 'pool'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleLoopExpression3367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoopExpressionAccess().getWhileKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1465:1: ( (lv_pred_1_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1466:1: (lv_pred_1_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1466:1: (lv_pred_1_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1467:3: lv_pred_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopExpressionAccess().getPredExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLoopExpression3388);
            lv_pred_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"pred",
                      		lv_pred_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleLoopExpression3400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLoopExpressionAccess().getLoopKeyword_2());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1487:1: ( (lv_body_3_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1488:1: (lv_body_3_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1488:1: (lv_body_3_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1489:3: lv_body_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopExpressionAccess().getBodyExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLoopExpression3421);
            lv_body_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleLoopExpression3433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLoopExpressionAccess().getPoolKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLoopExpression"


    // $ANTLR start "entryRuleBlockExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1517:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1518:2: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1519:2: iv_ruleBlockExpression= ruleBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression3469);
            iv_ruleBlockExpression=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockExpression3479); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1526:1: ruleBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ';' )* otherlv_4= '}' ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1529:28: ( ( () otherlv_1= '{' ( ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ';' )* otherlv_4= '}' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1530:1: ( () otherlv_1= '{' ( ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ';' )* otherlv_4= '}' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1530:1: ( () otherlv_1= '{' ( ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ';' )* otherlv_4= '}' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1530:2: () otherlv_1= '{' ( ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ';' )* otherlv_4= '}'
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1530:2: ()
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1531:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleBlockExpression3525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1540:1: ( ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||LA17_0==13||LA17_0==18||(LA17_0>=21 && LA17_0<=23)||LA17_0==26||LA17_0==30||LA17_0==33||LA17_0==35||(LA17_0>=39 && LA17_0<=40)||(LA17_0>=48 && LA17_0<=49)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1540:2: ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ';'
            	    {
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1540:2: ( (lv_body_2_0= ruleExpression ) )
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1541:1: (lv_body_2_0= ruleExpression )
            	    {
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1541:1: (lv_body_2_0= ruleExpression )
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1542:3: lv_body_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockExpressionAccess().getBodyExpressionParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleBlockExpression3547);
            	    lv_body_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"body",
            	              		lv_body_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleBlockExpression3559); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleBlockExpression3573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleLetExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1574:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1575:2: (iv_ruleLetExpression= ruleLetExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1576:2: iv_ruleLetExpression= ruleLetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLetExpression_in_entryRuleLetExpression3609);
            iv_ruleLetExpression=ruleLetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExpression3619); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1583:1: ruleLetExpression returns [EObject current=null] : (otherlv_0= 'let' ( (lv_declaration_1_0= ruleLetDeclaration ) ) (otherlv_2= ',' ( (lv_declaration_3_0= ruleLetDeclaration ) ) )* otherlv_4= 'in' ( (lv_body_5_0= ruleExpression ) ) ) ;
    public final EObject ruleLetExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declaration_1_0 = null;

        EObject lv_declaration_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1586:28: ( (otherlv_0= 'let' ( (lv_declaration_1_0= ruleLetDeclaration ) ) (otherlv_2= ',' ( (lv_declaration_3_0= ruleLetDeclaration ) ) )* otherlv_4= 'in' ( (lv_body_5_0= ruleExpression ) ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1587:1: (otherlv_0= 'let' ( (lv_declaration_1_0= ruleLetDeclaration ) ) (otherlv_2= ',' ( (lv_declaration_3_0= ruleLetDeclaration ) ) )* otherlv_4= 'in' ( (lv_body_5_0= ruleExpression ) ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1587:1: (otherlv_0= 'let' ( (lv_declaration_1_0= ruleLetDeclaration ) ) (otherlv_2= ',' ( (lv_declaration_3_0= ruleLetDeclaration ) ) )* otherlv_4= 'in' ( (lv_body_5_0= ruleExpression ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1587:3: otherlv_0= 'let' ( (lv_declaration_1_0= ruleLetDeclaration ) ) (otherlv_2= ',' ( (lv_declaration_3_0= ruleLetDeclaration ) ) )* otherlv_4= 'in' ( (lv_body_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleLetExpression3656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpressionAccess().getLetKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1591:1: ( (lv_declaration_1_0= ruleLetDeclaration ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1592:1: (lv_declaration_1_0= ruleLetDeclaration )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1592:1: (lv_declaration_1_0= ruleLetDeclaration )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1593:3: lv_declaration_1_0= ruleLetDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getDeclarationLetDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_ruleLetExpression3677);
            lv_declaration_1_0=ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"declaration",
                      		lv_declaration_1_0, 
                      		"LetDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1609:2: (otherlv_2= ',' ( (lv_declaration_3_0= ruleLetDeclaration ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1609:4: otherlv_2= ',' ( (lv_declaration_3_0= ruleLetDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLetExpression3690); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1613:1: ( (lv_declaration_3_0= ruleLetDeclaration ) )
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1614:1: (lv_declaration_3_0= ruleLetDeclaration )
            	    {
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1614:1: (lv_declaration_3_0= ruleLetDeclaration )
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1615:3: lv_declaration_3_0= ruleLetDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpressionAccess().getDeclarationLetDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLetDeclaration_in_ruleLetExpression3711);
            	    lv_declaration_3_0=ruleLetDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaration",
            	              		lv_declaration_3_0, 
            	              		"LetDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleLetExpression3725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpressionAccess().getInKeyword_3());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1635:1: ( (lv_body_5_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1636:1: (lv_body_5_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1636:1: (lv_body_5_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1637:3: lv_body_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getBodyExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLetExpression3746);
            lv_body_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleLetDeclaration"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1661:1: entryRuleLetDeclaration returns [EObject current=null] : iv_ruleLetDeclaration= ruleLetDeclaration EOF ;
    public final EObject entryRuleLetDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDeclaration = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1662:2: (iv_ruleLetDeclaration= ruleLetDeclaration EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1663:2: iv_ruleLetDeclaration= ruleLetDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration3782);
            iv_ruleLetDeclaration=ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetDeclaration3792); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetDeclaration"


    // $ANTLR start "ruleLetDeclaration"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1670:1: ruleLetDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleLetDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1673:28: ( ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )? ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1674:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )? )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1674:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )? )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1674:2: ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )?
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1674:2: ( (lv_name_0_0= ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1675:1: (lv_name_0_0= ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1675:1: (lv_name_0_0= ruleSYMBOL )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1676:3: lv_name_0_0= ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetDeclarationAccess().getNameSYMBOLParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_ruleLetDeclaration3838);
            lv_name_0_0=ruleSYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"SYMBOL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleLetDeclaration3850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLetDeclarationAccess().getColonKeyword_1());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1696:1: ( (otherlv_2= RULE_ID ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1697:1: (otherlv_2= RULE_ID )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1697:1: (otherlv_2= RULE_ID )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1698:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLetDeclarationRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLetDeclaration3870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getLetDeclarationAccess().getType_declTypeCrossReference_2_0()); 
              	
            }

            }


            }

            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1709:2: (otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1709:4: otherlv_3= '<-' ( (lv_init_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleLetDeclaration3883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getLetDeclarationAccess().getLessThanSignHyphenMinusKeyword_3_0());
                          
                    }
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1713:1: ( (lv_init_4_0= ruleExpression ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1714:1: (lv_init_4_0= ruleExpression )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1714:1: (lv_init_4_0= ruleExpression )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1715:3: lv_init_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetDeclarationAccess().getInitExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLetDeclaration3904);
                    lv_init_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLetDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLetDeclaration"


    // $ANTLR start "entryRuleCaseExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1739:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1740:2: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1741:2: iv_ruleCaseExpression= ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression3942);
            iv_ruleCaseExpression=ruleCaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression3952); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCaseExpression"


    // $ANTLR start "ruleCaseExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1748:1: ruleCaseExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'of' ( ( (lv_case_3_0= ruleCase ) ) otherlv_4= ';' )+ otherlv_5= 'esac' ) ;
    public final EObject ruleCaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expr_1_0 = null;

        EObject lv_case_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1751:28: ( (otherlv_0= 'case' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'of' ( ( (lv_case_3_0= ruleCase ) ) otherlv_4= ';' )+ otherlv_5= 'esac' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1752:1: (otherlv_0= 'case' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'of' ( ( (lv_case_3_0= ruleCase ) ) otherlv_4= ';' )+ otherlv_5= 'esac' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1752:1: (otherlv_0= 'case' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'of' ( ( (lv_case_3_0= ruleCase ) ) otherlv_4= ';' )+ otherlv_5= 'esac' )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1752:3: otherlv_0= 'case' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'of' ( ( (lv_case_3_0= ruleCase ) ) otherlv_4= ';' )+ otherlv_5= 'esac'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleCaseExpression3989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseExpressionAccess().getCaseKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1756:1: ( (lv_expr_1_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1757:1: (lv_expr_1_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1757:1: (lv_expr_1_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1758:3: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCaseExpression4010);
            lv_expr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleCaseExpression4022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseExpressionAccess().getOfKeyword_2());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1778:1: ( ( (lv_case_3_0= ruleCase ) ) otherlv_4= ';' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1778:2: ( (lv_case_3_0= ruleCase ) ) otherlv_4= ';'
            	    {
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1778:2: ( (lv_case_3_0= ruleCase ) )
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1779:1: (lv_case_3_0= ruleCase )
            	    {
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1779:1: (lv_case_3_0= ruleCase )
            	    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1780:3: lv_case_3_0= ruleCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getCaseCaseParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCase_in_ruleCaseExpression4044);
            	    lv_case_3_0=ruleCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"case",
            	              		lv_case_3_0, 
            	              		"Case");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCaseExpression4056); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getCaseExpressionAccess().getSemicolonKeyword_3_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleCaseExpression4070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCaseExpressionAccess().getEsacKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "entryRuleCase"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1812:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1813:2: (iv_ruleCase= ruleCase EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1814:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase4106);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase4116); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1821:1: ruleCase returns [EObject current=null] : ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (lv_expr_4_0= ruleExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1824:28: ( ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (lv_expr_4_0= ruleExpression ) ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1825:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (lv_expr_4_0= ruleExpression ) ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1825:1: ( ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (lv_expr_4_0= ruleExpression ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1825:2: ( (lv_name_0_0= ruleSYMBOL ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=>' ( (lv_expr_4_0= ruleExpression ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1825:2: ( (lv_name_0_0= ruleSYMBOL ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1826:1: (lv_name_0_0= ruleSYMBOL )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1826:1: (lv_name_0_0= ruleSYMBOL )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1827:3: lv_name_0_0= ruleSYMBOL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getNameSYMBOLParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_ruleCase4162);
            lv_name_0_0=ruleSYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"SYMBOL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleCase4174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getColonKeyword_1());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1847:1: ( (otherlv_2= RULE_ID ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1848:1: (otherlv_2= RULE_ID )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1848:1: (otherlv_2= RULE_ID )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1849:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCaseRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCase4194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getType_declTypeCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleCase4206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_3());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1864:1: ( (lv_expr_4_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1865:1: (lv_expr_4_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1865:1: (lv_expr_4_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1866:3: lv_expr_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getExprExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCase4227);
            lv_expr_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleNewExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1890:1: entryRuleNewExpression returns [EObject current=null] : iv_ruleNewExpression= ruleNewExpression EOF ;
    public final EObject entryRuleNewExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1891:2: (iv_ruleNewExpression= ruleNewExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1892:2: iv_ruleNewExpression= ruleNewExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNewExpression_in_entryRuleNewExpression4263);
            iv_ruleNewExpression=ruleNewExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewExpression4273); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNewExpression"


    // $ANTLR start "ruleNewExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1899:1: ruleNewExpression returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleNewExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1902:28: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1903:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1903:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1903:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleNewExpression4310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewExpressionAccess().getNewKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1907:1: ( (otherlv_1= RULE_ID ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1908:1: (otherlv_1= RULE_ID )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1908:1: (otherlv_1= RULE_ID )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1909:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNewExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewExpression4330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getNewExpressionAccess().getType_nameTypeCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNewExpression"


    // $ANTLR start "entryRuleIsvoidExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1928:1: entryRuleIsvoidExpression returns [EObject current=null] : iv_ruleIsvoidExpression= ruleIsvoidExpression EOF ;
    public final EObject entryRuleIsvoidExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsvoidExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1929:2: (iv_ruleIsvoidExpression= ruleIsvoidExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1930:2: iv_ruleIsvoidExpression= ruleIsvoidExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsvoidExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIsvoidExpression_in_entryRuleIsvoidExpression4366);
            iv_ruleIsvoidExpression=ruleIsvoidExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsvoidExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsvoidExpression4376); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIsvoidExpression"


    // $ANTLR start "ruleIsvoidExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1937:1: ruleIsvoidExpression returns [EObject current=null] : (otherlv_0= 'isvoid' ( (lv_expr_1_0= ruleExpression ) ) ) ;
    public final EObject ruleIsvoidExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1940:28: ( (otherlv_0= 'isvoid' ( (lv_expr_1_0= ruleExpression ) ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1941:1: (otherlv_0= 'isvoid' ( (lv_expr_1_0= ruleExpression ) ) )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1941:1: (otherlv_0= 'isvoid' ( (lv_expr_1_0= ruleExpression ) ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1941:3: otherlv_0= 'isvoid' ( (lv_expr_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleIsvoidExpression4413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIsvoidExpressionAccess().getIsvoidKeyword_0());
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1945:1: ( (lv_expr_1_0= ruleExpression ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1946:1: (lv_expr_1_0= ruleExpression )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1946:1: (lv_expr_1_0= ruleExpression )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1947:3: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIsvoidExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIsvoidExpression4434);
            lv_expr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIsvoidExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIsvoidExpression"


    // $ANTLR start "entryRuleCompareExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1971:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1972:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1973:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4470);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression4480); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1980:1: ruleCompareExpression returns [EObject current=null] : (this_AdditionExpression_0= ruleAdditionExpression ( ( ( ( () ( ( ruleCompareOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleCompareOperator ) ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1983:28: ( (this_AdditionExpression_0= ruleAdditionExpression ( ( ( ( () ( ( ruleCompareOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleCompareOperator ) ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1984:1: (this_AdditionExpression_0= ruleAdditionExpression ( ( ( ( () ( ( ruleCompareOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleCompareOperator ) ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1984:1: (this_AdditionExpression_0= ruleAdditionExpression ( ( ( ( () ( ( ruleCompareOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleCompareOperator ) ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1985:5: this_AdditionExpression_0= ruleAdditionExpression ( ( ( ( () ( ( ruleCompareOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleCompareOperator ) ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_ruleCompareExpression4527);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1993:1: ( ( ( ( () ( ( ruleCompareOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleCompareOperator ) ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case 41:
                    {
                    int LA21_1 = input.LA(2);

                    if ( (synpred3_InternalCool()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case 42:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred3_InternalCool()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case 43:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred3_InternalCool()) ) {
                        alt21=1;
                    }
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1993:2: ( ( ( () ( ( ruleCompareOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleCompareOperator ) ) ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1993:2: ( ( ( () ( ( ruleCompareOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleCompareOperator ) ) ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1993:3: ( ( () ( ( ruleCompareOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleCompareOperator ) ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1998:6: ( () ( (lv_op_2_0= ruleCompareOperator ) ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1998:7: () ( (lv_op_2_0= ruleCompareOperator ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1998:7: ()
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1999:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2004:2: ( (lv_op_2_0= ruleCompareOperator ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2005:1: (lv_op_2_0= ruleCompareOperator )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2005:1: (lv_op_2_0= ruleCompareOperator )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2006:3: lv_op_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getOpCompareOperatorParserRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareExpression4576);
                    lv_op_2_0=ruleCompareOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2022:4: ( (lv_right_3_0= ruleExpression ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2023:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2023:1: (lv_right_3_0= ruleExpression )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2024:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCompareExpression4599);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleCompareOperator"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2048:1: entryRuleCompareOperator returns [String current=null] : iv_ruleCompareOperator= ruleCompareOperator EOF ;
    public final String entryRuleCompareOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOperator = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2049:2: (iv_ruleCompareOperator= ruleCompareOperator EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2050:2: iv_ruleCompareOperator= ruleCompareOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_entryRuleCompareOperator4638);
            iv_ruleCompareOperator=ruleCompareOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperator4649); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompareOperator"


    // $ANTLR start "ruleCompareOperator"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2057:1: ruleCompareOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2060:28: ( (kw= '<' | kw= '<=' | kw= '=' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2061:1: (kw= '<' | kw= '<=' | kw= '=' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2061:1: (kw= '<' | kw= '<=' | kw= '=' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt22=1;
                }
                break;
            case 42:
                {
                alt22=2;
                }
                break;
            case 43:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2062:2: kw= '<'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleCompareOperator4687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompareOperatorAccess().getLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2069:2: kw= '<='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleCompareOperator4706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompareOperatorAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2076:2: kw= '='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleCompareOperator4725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompareOperatorAccess().getEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "entryRuleAdditionExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2089:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2090:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2091:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression4765);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExpression4775); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2098:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )? ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultiplicationExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2101:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )? ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2102:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )? )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2102:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )? )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2103:5: this_MultiplicationExpression_0= ruleMultiplicationExpression ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression4822);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:1: ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred4_InternalCool()) ) {
                    alt24=1;
                }
            }
            else if ( (LA24_0==45) ) {
                int LA24_2 = input.LA(2);

                if ( (synpred4_InternalCool()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:2: ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleExpression ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:2: ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:3: ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2116:6: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==44) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==45) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2116:7: ( () otherlv_2= '+' )
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2116:7: ( () otherlv_2= '+' )
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2116:8: () otherlv_2= '+'
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2116:8: ()
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2117:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleAdditionExpression4875); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getAdditionExpressionAccess().getPlusSignKeyword_1_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2127:6: ( () otherlv_4= '-' )
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2127:6: ( () otherlv_4= '-' )
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2127:7: () otherlv_4= '-'
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2127:7: ()
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2128:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleAdditionExpression4904); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getAdditionExpressionAccess().getHyphenMinusKeyword_1_0_0_1_1());
                                  
                            }

                            }


                            }
                            break;

                    }


                    }

                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2137:4: ( (lv_right_5_0= ruleExpression ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2138:1: (lv_right_5_0= ruleExpression )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2138:1: (lv_right_5_0= ruleExpression )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2139:3: lv_right_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAdditionExpression4928);
                    lv_right_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2163:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2164:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2165:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression4966);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExpression4976); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2172:1: ruleMultiplicationExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '*' ) | ( () '/' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )? ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2175:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '*' ) | ( () '/' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )? ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2176:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '*' ) | ( () '/' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )? )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2176:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '*' ) | ( () '/' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )? )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2177:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '*' ) | ( () '/' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplicationExpression5023);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:1: ( ( ( ( ( () '*' ) | ( () '/' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ) ( (lv_right_5_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred5_InternalCool()) ) {
                    alt26=1;
                }
            }
            else if ( (LA26_0==47) ) {
                int LA26_2 = input.LA(2);

                if ( (synpred5_InternalCool()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:2: ( ( ( ( () '*' ) | ( () '/' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ) ( (lv_right_5_0= ruleExpression ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:2: ( ( ( ( () '*' ) | ( () '/' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:3: ( ( ( () '*' ) | ( () '/' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2190:6: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==46) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==47) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2190:7: ( () otherlv_2= '*' )
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2190:7: ( () otherlv_2= '*' )
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2190:8: () otherlv_2= '*'
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2190:8: ()
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2191:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleMultiplicationExpression5076); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationExpressionAccess().getAsteriskKeyword_1_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2201:6: ( () otherlv_4= '/' )
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2201:6: ( () otherlv_4= '/' )
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2201:7: () otherlv_4= '/'
                            {
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2201:7: ()
                            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2202:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleMultiplicationExpression5105); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationExpressionAccess().getSolidusKeyword_1_0_0_1_1());
                                  
                            }

                            }


                            }
                            break;

                    }


                    }

                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2211:4: ( (lv_right_5_0= ruleExpression ) )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2212:1: (lv_right_5_0= ruleExpression )
                    {
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2212:1: (lv_right_5_0= ruleExpression )
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2213:3: lv_right_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleMultiplicationExpression5129);
                    lv_right_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2241:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2242:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2243:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN5172);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN5183); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2250:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2253:28: ( (kw= 'true' | kw= 'false' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2254:1: (kw= 'true' | kw= 'false' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2254:1: (kw= 'true' | kw= 'false' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            else if ( (LA27_0==49) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2255:2: kw= 'true'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleBOOLEAN5221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2262:2: kw= 'false'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleBOOLEAN5240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleSYMBOL"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2275:1: entryRuleSYMBOL returns [String current=null] : iv_ruleSYMBOL= ruleSYMBOL EOF ;
    public final String entryRuleSYMBOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSYMBOL = null;


        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2276:2: (iv_ruleSYMBOL= ruleSYMBOL EOF )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2277:2: iv_ruleSYMBOL= ruleSYMBOL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSYMBOLRule()); 
            }
            pushFollow(FOLLOW_ruleSYMBOL_in_entryRuleSYMBOL5281);
            iv_ruleSYMBOL=ruleSYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSYMBOL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSYMBOL5292); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSYMBOL"


    // $ANTLR start "ruleSYMBOL"
    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2284:1: ruleSYMBOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'self' ) ;
    public final AntlrDatatypeRuleToken ruleSYMBOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2287:28: ( (this_ID_0= RULE_ID | kw= 'self' ) )
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2288:1: (this_ID_0= RULE_ID | kw= 'self' )
            {
            // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2288:1: (this_ID_0= RULE_ID | kw= 'self' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==21) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2288:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSYMBOL5332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getSYMBOLAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2297:2: kw= 'self'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSYMBOL5356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSYMBOLAccess().getSelfKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSYMBOL"

    // $ANTLR start synpred1_InternalCool
    public final void synpred1_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1156:3: ( ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) ) )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1156:4: ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) )
        {
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1156:4: ( () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) ) )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1156:5: () ( '@' ( ( RULE_ID ) ) )? '.' ( ( ruleIdentifierRefExpression ) )
        {
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1156:5: ()
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1157:1: 
        {
        }

        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1157:2: ( '@' ( ( RULE_ID ) ) )?
        int alt29=2;
        int LA29_0 = input.LA(1);

        if ( (LA29_0==24) ) {
            alt29=1;
        }
        switch (alt29) {
            case 1 :
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1157:4: '@' ( ( RULE_ID ) )
                {
                match(input,24,FOLLOW_24_in_synpred1_InternalCool2725); if (state.failed) return ;
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1158:1: ( ( RULE_ID ) )
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1159:1: ( RULE_ID )
                {
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1159:1: ( RULE_ID )
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1160:2: RULE_ID
                {
                match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalCool2733); if (state.failed) return ;

                }


                }


                }
                break;

        }

        match(input,25,FOLLOW_25_in_synpred1_InternalCool2742); if (state.failed) return ;
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1164:1: ( ( ruleIdentifierRefExpression ) )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1165:1: ( ruleIdentifierRefExpression )
        {
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1165:1: ( ruleIdentifierRefExpression )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1166:1: ruleIdentifierRefExpression
        {
        pushFollow(FOLLOW_ruleIdentifierRefExpression_in_synpred1_InternalCool2749);
        ruleIdentifierRefExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalCool

    // $ANTLR start synpred2_InternalCool
    public final void synpred2_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1413:4: ( 'else' )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1413:6: 'else'
        {
        match(input,28,FOLLOW_28_in_synpred2_InternalCool3240); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalCool

    // $ANTLR start synpred3_InternalCool
    public final void synpred3_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1993:3: ( ( () ( ( ruleCompareOperator ) ) ) )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1993:4: ( () ( ( ruleCompareOperator ) ) )
        {
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1993:4: ( () ( ( ruleCompareOperator ) ) )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1993:5: () ( ( ruleCompareOperator ) )
        {
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1993:5: ()
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1994:1: 
        {
        }

        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1994:2: ( ( ruleCompareOperator ) )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1995:1: ( ruleCompareOperator )
        {
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1995:1: ( ruleCompareOperator )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:1996:1: ruleCompareOperator
        {
        pushFollow(FOLLOW_ruleCompareOperator_in_synpred3_InternalCool4546);
        ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalCool

    // $ANTLR start synpred4_InternalCool
    public final void synpred4_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:3: ( ( ( () '+' ) | ( () '-' ) ) )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:4: ( ( () '+' ) | ( () '-' ) )
        {
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:4: ( ( () '+' ) | ( () '-' ) )
        int alt30=2;
        int LA30_0 = input.LA(1);

        if ( (LA30_0==44) ) {
            alt30=1;
        }
        else if ( (LA30_0==45) ) {
            alt30=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 30, 0, input);

            throw nvae;
        }
        switch (alt30) {
            case 1 :
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:5: ( () '+' )
                {
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:5: ( () '+' )
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:6: () '+'
                {
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2111:6: ()
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2112:1: 
                {
                }

                match(input,44,FOLLOW_44_in_synpred4_InternalCool4839); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2114:6: ( () '-' )
                {
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2114:6: ( () '-' )
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2114:7: () '-'
                {
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2114:7: ()
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2115:1: 
                {
                }

                match(input,45,FOLLOW_45_in_synpred4_InternalCool4854); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred4_InternalCool

    // $ANTLR start synpred5_InternalCool
    public final void synpred5_InternalCool_fragment() throws RecognitionException {   
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:3: ( ( ( () '*' ) | ( () '/' ) ) )
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:4: ( ( () '*' ) | ( () '/' ) )
        {
        // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:4: ( ( () '*' ) | ( () '/' ) )
        int alt31=2;
        int LA31_0 = input.LA(1);

        if ( (LA31_0==46) ) {
            alt31=1;
        }
        else if ( (LA31_0==47) ) {
            alt31=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 31, 0, input);

            throw nvae;
        }
        switch (alt31) {
            case 1 :
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:5: ( () '*' )
                {
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:5: ( () '*' )
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:6: () '*'
                {
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2185:6: ()
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2186:1: 
                {
                }

                match(input,46,FOLLOW_46_in_synpred5_InternalCool5040); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2188:6: ( () '/' )
                {
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2188:6: ( () '/' )
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2188:7: () '/'
                {
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2188:7: ()
                // ../edu.stanford.compilers.cool/src-gen/edu/stanford/compilers/parser/antlr/internal/InternalCool.g:2189:1: 
                {
                }

                match(input,47,FOLLOW_47_in_synpred5_InternalCool5055); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred5_InternalCool

    // Delegated rules

    public final boolean synpred3_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\22\uffff";
    static final String DFA8_eofS =
        "\10\uffff\1\17\1\21\10\uffff";
    static final String DFA8_minS =
        "\1\4\7\uffff\2\16\10\uffff";
    static final String DFA8_maxS =
        "\1\61\7\uffff\2\57\10\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\13\1\14\1\15\1\16"+
        "\1\17\1\12\1\10\1\11";
    static final String DFA8_specialS =
        "\22\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\10\2\12\6\uffff\1\3\4\uffff\1\13\2\uffff\1\11\1\14\1\15"+
            "\2\uffff\1\1\3\uffff\1\2\2\uffff\1\4\1\uffff\1\5\3\uffff\1\6"+
            "\1\7\7\uffff\2\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\17\1\uffff\1\20\1\16\2\17\3\uffff\2\17\1\uffff\3\17\1\uffff"+
            "\2\17\1\uffff\1\17\1\uffff\1\17\4\uffff\7\17",
            "\2\21\1\uffff\1\20\1\uffff\2\21\3\uffff\2\21\1\uffff\3\21"+
            "\1\uffff\2\21\1\uffff\1\21\1\uffff\1\21\4\uffff\7\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "551:1: (this_ConditionalExpression_0= ruleConditionalExpression | this_LoopExpression_1= ruleLoopExpression | this_BlockExpression_2= ruleBlockExpression | this_LetExpression_3= ruleLetExpression | this_CaseExpression_4= ruleCaseExpression | this_NewExpression_5= ruleNewExpression | this_IsvoidExpression_6= ruleIsvoidExpression | this_AssignmentExpression_7= ruleAssignmentExpression | this_SelfTypeLiteral_8= ruleSelfTypeLiteral | this_IdentifierRefExpression_9= ruleIdentifierRefExpression | this_Literal_10= ruleLiteral | this_ParenExpression_11= ruleParenExpression | this_NegationExpression_12= ruleNegationExpression | this_IntegerComposite_13= ruleIntegerComposite | this_StaticDispatchExpression_14= ruleStaticDispatchExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass__in_ruleProgram130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleClass__in_entryRuleClass_166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleClass_213 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_ruleClass_234 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleClass_247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass_267 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleClass_281 = new BitSet(new long[]{0x0000000000204010L});
    public static final BitSet FOLLOW_ruleFeature__in_ruleClass_302 = new BitSet(new long[]{0x0000000000204010L});
    public static final BitSet FOLLOW_14_in_ruleClass_315 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClass_327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature__in_entryRuleFeature_363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleFeature_420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleFeature_447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_entryRuleAttr482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttr492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_ruleAttr538 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttr550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttr570 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleAttr583 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAttr604 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAttr618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_ruleMethod710 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMethod722 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_ruleFormal_in_ruleMethod744 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleMethod757 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleFormal_in_ruleMethod778 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleMethod794 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMethod806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod826 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMethod838 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMethod859 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod871 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMethod883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormal_in_entryRuleFormal919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormal929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_ruleFormal975 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFormal987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormal1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDispatchExpression_in_ruleExpression1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_rulePrimaryExpression1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopExpression_in_rulePrimaryExpression1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_rulePrimaryExpression1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_rulePrimaryExpression1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_rulePrimaryExpression1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewExpression_in_rulePrimaryExpression1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsvoidExpression_in_rulePrimaryExpression1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_rulePrimaryExpression1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfTypeLiteral_in_rulePrimaryExpression1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_rulePrimaryExpression1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpression_in_rulePrimaryExpression1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_rulePrimaryExpression1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerComposite_in_rulePrimaryExpression1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticDispatchExpression_in_rulePrimaryExpression1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfTypeLiteral_in_entryRuleSelfTypeLiteral1603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfTypeLiteral1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSelfTypeLiteral1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_entryRuleIdentifierRefExpression1695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierRefExpression1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifierRefExpression1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberLiteral1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpression_in_entryRuleParenExpression2202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenExpression2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleParenExpression2249 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenExpression2270 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleParenExpression2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression2318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_ruleAssignmentExpression2374 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssignmentExpression2386 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignmentExpression2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression2443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegationExpression2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNegationExpression2490 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNegationExpression2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerComposite_in_entryRuleIntegerComposite2547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerComposite2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIntegerComposite2594 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIntegerComposite2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDispatchExpression_in_entryRuleDispatchExpression2651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDispatchExpression2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleDispatchExpression2708 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleDispatchExpression2771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDispatchExpression2791 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDispatchExpression2805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_ruleDispatchExpression2826 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDispatchExpression2840 = new BitSet(new long[]{0x0003018A44F42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDispatchExpression2862 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleDispatchExpression2875 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDispatchExpression2896 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleDispatchExpression2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticDispatchExpression_in_entryRuleStaticDispatchExpression2950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticDispatchExpression2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_ruleStaticDispatchExpression3006 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStaticDispatchExpression3018 = new BitSet(new long[]{0x0003018A44F42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStaticDispatchExpression3040 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleStaticDispatchExpression3053 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStaticDispatchExpression3074 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleStaticDispatchExpression3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConditionalExpression3173 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionalExpression3194 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleConditionalExpression3206 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionalExpression3227 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleConditionalExpression3248 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionalExpression3270 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConditionalExpression3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopExpression_in_entryRuleLoopExpression3320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopExpression3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLoopExpression3367 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLoopExpression3388 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLoopExpression3400 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLoopExpression3421 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLoopExpression3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression3469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockExpression3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBlockExpression3525 = new BitSet(new long[]{0x0003018A44E46070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlockExpression3547 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBlockExpression3559 = new BitSet(new long[]{0x0003018A44E46070L});
    public static final BitSet FOLLOW_14_in_ruleBlockExpression3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_entryRuleLetExpression3609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExpression3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLetExpression3656 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_ruleLetExpression3677 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleLetExpression3690 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_ruleLetExpression3711 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_34_in_ruleLetExpression3725 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetExpression3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration3782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetDeclaration3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_ruleLetDeclaration3838 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLetDeclaration3850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLetDeclaration3870 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleLetDeclaration3883 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetDeclaration3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression3942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCaseExpression3989 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseExpression4010 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCaseExpression4022 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleCase_in_ruleCaseExpression4044 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCaseExpression4056 = new BitSet(new long[]{0x0000002000200010L});
    public static final BitSet FOLLOW_37_in_ruleCaseExpression4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_ruleCase4162 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCase4174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCase4194 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCase4206 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCase4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewExpression_in_entryRuleNewExpression4263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewExpression4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNewExpression4310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewExpression4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsvoidExpression_in_entryRuleIsvoidExpression4366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsvoidExpression4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleIsvoidExpression4413 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIsvoidExpression4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleCompareExpression4527 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareExpression4576 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCompareExpression4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_entryRuleCompareOperator4638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperator4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCompareOperator4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCompareOperator4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCompareOperator4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression4765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression4822 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_ruleAdditionExpression4875 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_45_in_ruleAdditionExpression4904 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAdditionExpression4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression4966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplicationExpression5023 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleMultiplicationExpression5076 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_47_in_ruleMultiplicationExpression5105 = new BitSet(new long[]{0x0003018A44E42070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMultiplicationExpression5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN5172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBOOLEAN5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBOOLEAN5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMBOL_in_entryRuleSYMBOL5281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSYMBOL5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSYMBOL5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSYMBOL5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred1_InternalCool2725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalCool2733 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred1_InternalCool2742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdentifierRefExpression_in_synpred1_InternalCool2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred2_InternalCool3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_synpred3_InternalCool4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred4_InternalCool4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred4_InternalCool4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred5_InternalCool5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred5_InternalCool5055 = new BitSet(new long[]{0x0000000000000002L});

}