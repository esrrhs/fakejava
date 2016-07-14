
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007, 2008 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "bison.y"  */

package fakescript;

import javax.swing.text.Position;


/**
 * A Bison parser, automatically generated from <tt>bison.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.4.1";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = true;


  /**
   * A class defining a pair of positions.  Positions, defined by the
   * <code>Position</code> class, denote a point in the input.
   * Locations represent a part of the input through the beginning
   * and ending positions.  */
  public class Location {
    /** The first, inclusive, position in the range.  */
    public Position begin;

    /** The first position beyond the range.  */
    public Position end;

    /**
     * Create a <code>Location</code> denoting an empty range located at
     * a given point.
     * @param loc The position at which the range is anchored.  */
    public Location (Position loc) {
      this.begin = this.end = loc;
    }

    /**
     * Create a <code>Location</code> from the endpoints of the range.
     * @param begin The first position included in the range.
     * @param end   The first position beyond the range.  */
    public Location (Position begin, Position end) {
      this.begin = begin;
      this.end = end;
    }

    /**
     * Print a representation of the location.  For this to be correct,
     * <code>Position</code> should override the <code>equals</code>
     * method.  */
    public String toString () {
      if (begin.equals (end))
        return begin.toString ();
      else
        return begin.toString () + "-" + end.toString ();
    }
  }



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int VAR_BEGIN = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int FUNC = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int FTRUE = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int FFALSE = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int IF = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int END = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int STRING_DEFINITION = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int IDENTIFIER = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int NUMBER = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int SINGLE_LINE_COMMENT = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVIDE_MOD = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int ARG_SPLITTER = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVIDE = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int ASSIGN = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int MORE = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int LESS = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int MORE_OR_EQUAL = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int LESS_OR_EQUAL = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_EQUAL = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int OPEN_BRACKET = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int CLOSE_BRACKET = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int AND = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int OR = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int FKFLOAT = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_ASSIGN = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_ASSIGN = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVIDE_ASSIGN = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_ASSIGN = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVIDE_MOD_ASSIGN = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int COLON = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int FOR = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int INC = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int FAKE = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int FKUUID = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int OPEN_SQUARE_BRACKET = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int CLOSE_SQUARE_BRACKET = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int FCONST = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int PACKAGE = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int INCLUDE = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int IDENTIFIER_DOT = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int IDENTIFIER_POINTER = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int STRUCT = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int IS = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int CONTINUE = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int YIELD = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int SLEEP = 313;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH = 314;
  /** Token number, to be returned by the scanner.  */
  public static final int CASE = 315;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT = 316;
  /** Token number, to be returned by the scanner.  */
  public static final int NEW_ASSIGN = 317;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSEIF = 318;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHT_POINTER = 319;
  /** Token number, to be returned by the scanner.  */
  public static final int STRING_CAT = 320;
  /** Token number, to be returned by the scanner.  */
  public static final int OPEN_BIG_BRACKET = 321;
  /** Token number, to be returned by the scanner.  */
  public static final int CLOSE_BIG_BRACKET = 322;



  
  private Location yylloc (YYStack rhs, int n)
  {
    if (n > 0)
      return new Location (rhs.locationAt (1).begin, rhs.locationAt (n).end);
    else
      return new Location (rhs.locationAt (0).end);
  }

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    /**
     * Method to retrieve the beginning position of the last scanned token.
     * @return the position at which the last scanned token starts.  */
    Position getStartPos ();

    /**
     * Method to retrieve the ending position of the last scanned token.
     * @return the first position beyond the last scanned token.  */
    Position getEndPos ();

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * and beginning/ending positions of the token. 
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * referring to the given location in a user-defined way.
     *
     * @param loc The location of the element to which the
     *                error message is related
     * @param s The string for the error message.  */
     void yyerror (Location loc, String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (Location loc, String s) {
    yylexer.yyerror (loc, s);
  }

  
  protected final void yyerror (String s) {
    yylexer.yyerror ((Location)null, s);
  }
  protected final void yyerror (Position loc, String s) {
    yylexer.yyerror (new Location (loc), s);
  }

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    private Location[] locStack = new Location[16];
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;
    
    public final void push (int state, Object value    	   	      	    , Location loc) {
      height++;
      if (size == height) 
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  
	  Location[] newLocStack = new Location[size * 2];
	  System.arraycopy (locStack, 0, newLocStack, 0, height);
	  locStack = newLocStack;
	  
	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      locStack[height] = loc;
      valueStack[height] = value;
    }

    public final void pop () {
      height--;
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height, null);
        java.util.Arrays.fill (locStack, height - num + 1, height, null);
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Location locationAt (int i) {
      return locStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");
      
      for (int i = 0; i < height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  /**
   * Returned by a Bison action in order to print an error message and start
   * error recovery.  */
  public static final int YYFAIL = 3;

  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    Location yyloc = yylloc (yystack, yylen);

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.
    
       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);
    
    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 3:
  if (yyn == 3)
    
/* Line 353 of lalr1.java  */
/* Line 151 of "bison.y"  */
    {
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 353 of lalr1.java  */
/* Line 155 of "bison.y"  */
    {
		//FKLOG("[bison]: package %s", $2.c_str());
		//myflexer *l = (myflexer *)parm;
		//l->set_package($2.c_str());
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 353 of lalr1.java  */
/* Line 162 of "bison.y"  */
    {
		//FKLOG("[bison]: package %s", $2.c_str());
		//myflexer *l = (myflexer *)parm;
		//l->set_package($2.c_str());
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 353 of lalr1.java  */
/* Line 170 of "bison.y"  */
    {
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 353 of lalr1.java  */
/* Line 180 of "bison.y"  */
    {
		//FKLOG("[bison]: include %s", $2.c_str());
		//myflexer *l = (myflexer *)parm;
		//l->add_include($2.c_str());
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 353 of lalr1.java  */
/* Line 189 of "bison.y"  */
    {
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 353 of lalr1.java  */
/* Line 199 of "bison.y"  */
    {
		//FKLOG("[bison]: struct_define %s", $2.c_str());
		//myflexer *l = (myflexer *)parm;
		//struct_desc_memlist_node * p = dynamic_cast<struct_desc_memlist_node*>($3);
		//l->add_struct_desc($2.c_str(), p);
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 353 of lalr1.java  */
/* Line 209 of "bison.y"  */
    {
		//$$ = 0;
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 353 of lalr1.java  */
/* Line 214 of "bison.y"  */
    {
		//FKLOG("[bison]: struct_mem_declaration <- IDENTIFIER struct_mem_declaration");
		//assert($1->gettype() == est_struct_memlist);
		//struct_desc_memlist_node * p = dynamic_cast<struct_desc_memlist_node*>($1);
		//p->add_arg($2);
		//$$ = p;
	};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 353 of lalr1.java  */
/* Line 223 of "bison.y"  */
    {
		//FKLOG("[bison]: struct_mem_declaration <- IDENTIFIER");
		//NEWTYPE(p, struct_desc_memlist_node);
		//p->add_arg($1);
		//$$ = p;
	};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 353 of lalr1.java  */
/* Line 233 of "bison.y"  */
    {
	};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 353 of lalr1.java  */
/* Line 243 of "bison.y"  */
    {
		//FKLOG("[bison]: const_define %s", $2.c_str());
		//myflexer *l = (myflexer *)parm;
		//l->add_const_desc($2.c_str(), $4);
	};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 353 of lalr1.java  */
/* Line 252 of "bison.y"  */
    {
	};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 353 of lalr1.java  */
/* Line 264 of "bison.y"  */
    {
		//FKLOG("[bison]: function_declaration <- block %s %d", $2.c_str(), yylloc.first_line);
		//NEWTYPE(p, func_desc_node);
		////p->funcname = $2;
		//p->arglist = dynamic_cast<func_desc_arglist_node*>($4);
		//p->block = dynamic_cast<block_node*>($6);
		//p->endline = yylloc.first_line;
		//myflexer *l = (myflexer *)parm;
		//l->add_func_desc(p);
	};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 353 of lalr1.java  */
/* Line 276 of "bison.y"  */
    {
		//FKLOG("[bison]: function_declaration <- empty %s %d", $2.c_str(), yylloc.first_line);
		//NEWTYPE(p, func_desc_node);
		//p->funcname = $2;
		//p->arglist = 0;
		//p->block = 0;
		//p->endline = yylloc.first_line;
		//myflexer *l = (myflexer *)parm;
		//l->add_func_desc(p);
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 353 of lalr1.java  */
/* Line 290 of "bison.y"  */
    {
		//$$ = 0;
	};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 353 of lalr1.java  */
/* Line 295 of "bison.y"  */
    {
		//FKLOG("[bison]: function_declaration_arguments <- arg function_declaration_arguments");
		//assert($1->gettype() == est_arglist);
		//func_desc_arglist_node * p = dynamic_cast<func_desc_arglist_node*>($1);
		//p->add_arg($3);
		//$$ = p;
	};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 353 of lalr1.java  */
/* Line 304 of "bison.y"  */
    {
		//FKLOG("[bison]: function_declaration_arguments <- arg");
		//NEWTYPE(p, func_desc_arglist_node);
		//p->add_arg($1);
		//$$ = p;
	};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 353 of lalr1.java  */
/* Line 314 of "bison.y"  */
    {
		//FKLOG("[bison]: arg <- IDENTIFIER %s", $1.c_str());
		//NEWTYPE(p, identifier_node);
		//p->str = $1;
		//$$ = p;
	};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 353 of lalr1.java  */
/* Line 324 of "bison.y"  */
    {
		//FKLOG("[bison]: function_call <- function_call_arguments %s", $1.c_str());
		//NEWTYPE(p, function_call_node);
		//p->fuc = $1;
		//p->arglist = dynamic_cast<function_call_arglist_node*>($3);
		//p->fakecall = false;
		//p->classmem_call = false;
		//$$ = p;
	};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 353 of lalr1.java  */
/* Line 335 of "bison.y"  */
    {
		//FKLOG("[bison]: function_call <- function_call_arguments %s", $1.c_str());
		//NEWTYPE(p, function_call_node);
		//p->fuc = $1;
		//p->arglist = dynamic_cast<function_call_arglist_node*>($3);
		//p->fakecall = false;
		//p->classmem_call = false;
		//$$ = p;
	};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 353 of lalr1.java  */
/* Line 346 of "bison.y"  */
    {
		//FKLOG("[bison]: function_call <- mem function_call_arguments %s", $3.c_str());
		//NEWTYPE(p, function_call_node);
		//p->fuc = $3;
		//p->arglist = dynamic_cast<function_call_arglist_node*>($5);
		//if (p->arglist == 0)
		//{
		//	NEWTYPE(pa, function_call_arglist_node);
		//	p->arglist = pa;
		//}
		//p->arglist->add_arg($1);
		//p->fakecall = false;
		//p->classmem_call = true;
		//$$ = p;
	};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 353 of lalr1.java  */
/* Line 365 of "bison.y"  */
    {
		//$$ = 0;
	};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 353 of lalr1.java  */
/* Line 370 of "bison.y"  */
    {
		//FKLOG("[bison]: function_call_arguments <- arg_expr function_call_arguments");
		//assert($1->gettype() == est_call_arglist);
		//function_call_arglist_node * p = dynamic_cast<function_call_arglist_node*>($1);
		//p->add_arg($3);
		//$$ = p;
	};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 353 of lalr1.java  */
/* Line 379 of "bison.y"  */
    {
		//FKLOG("[bison]: function_call_arguments <- arg_expr");
		//NEWTYPE(p, function_call_arglist_node);
		//p->add_arg($1);
		//$$ = p;
	};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 353 of lalr1.java  */
/* Line 389 of "bison.y"  */
    {
		//FKLOG("[bison]: arg_expr <- expr_value");
		//$$ = $1;
	};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 353 of lalr1.java  */
/* Line 399 of "bison.y"  */
    {
		//FKLOG("[bison]: block <- block stmt");
		//assert($1->gettype() == est_block);
		//block_node * p = dynamic_cast<block_node*>($1);
		//p->add_stmt($2);
		//$$ = p;
	};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 353 of lalr1.java  */
/* Line 408 of "bison.y"  */
    {
		//FKLOG("[bison]: block <- stmt");
		//NEWTYPE(p, block_node);
		//p->add_stmt($1);
		//$$ = p;
	};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 353 of lalr1.java  */
/* Line 418 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- while_stmt");
		//$$ = $1;
	};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 353 of lalr1.java  */
/* Line 424 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- if_stmt");
		//$$ = $1;
	};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 353 of lalr1.java  */
/* Line 430 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- return_stmt");
		//$$ = $1;
	};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 353 of lalr1.java  */
/* Line 436 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- assign_stmt");
		//$$ = $1;
	};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 353 of lalr1.java  */
/* Line 442 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- multi_assign_stmt");
		//$$ = $1;
	};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 353 of lalr1.java  */
/* Line 448 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- break");
		//$$ = $1;
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 353 of lalr1.java  */
/* Line 454 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- continue");
		//$$ = $1;
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 353 of lalr1.java  */
/* Line 460 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- expr");
		//$$ = $1;
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 353 of lalr1.java  */
/* Line 466 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- math_assign_stmt");
		//$$ = $1;
	};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 353 of lalr1.java  */
/* Line 472 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- for_stmt");
		//$$ = $1;
	};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 353 of lalr1.java  */
/* Line 478 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- for_loop_stmt");
		//$$ = $1;
	};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 353 of lalr1.java  */
/* Line 484 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- fake_call_stmt");
		//$$ = $1;
	};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 353 of lalr1.java  */
/* Line 490 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- sleep_stmt");
		//$$ = $1;
	};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 353 of lalr1.java  */
/* Line 496 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- yield_stmt");
		//$$ = $1;
	};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 353 of lalr1.java  */
/* Line 502 of "bison.y"  */
    {
		//FKLOG("[bison]: stmt <- switch_stmt");
		//$$ = $1;
	};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 353 of lalr1.java  */
/* Line 510 of "bison.y"  */
    {
		//FKLOG("[bison]: fake_call_stmt <- fake function_call");
		//function_call_node * p = dynamic_cast<function_call_node*>($2);
		//p->fakecall = true;
		//$$ = p;
	};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 353 of lalr1.java  */
/* Line 520 of "bison.y"  */
    {
		//FKLOG("[bison]: for_stmt <- block cmp block");
		//NEWTYPE(p, for_stmt);
		//p->cmp = dynamic_cast<cmp_stmt*>($4);
		//p->beginblock = dynamic_cast<block_node*>($2);
		//p->endblock = dynamic_cast<block_node*>($6);
		//p->block = dynamic_cast<block_node*>($8);
		//$$ = p;
	};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 353 of lalr1.java  */
/* Line 531 of "bison.y"  */
    {
		//FKLOG("[bison]: for_stmt <- block cmp");
		//NEWTYPE(p, for_stmt);
		//p->cmp = dynamic_cast<cmp_stmt*>($4);
		//p->beginblock = dynamic_cast<block_node*>($2);
		//p->endblock = dynamic_cast<block_node*>($6);
		//p->block = 0;
		//$$ = p;
	};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 353 of lalr1.java  */
/* Line 544 of "bison.y"  */
    {
		//FKLOG("[bison]: for_loop_stmt <- block");
		//NEWTYPE(p, for_loop_stmt);
		//p->var = $2;
		//p->begin = $4;
		//p->end = $6;
		//p->add = $8;
		//p->block = dynamic_cast<block_node*>($10);
		//$$ = p;
	};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 353 of lalr1.java  */
/* Line 556 of "bison.y"  */
    {
		//FKLOG("[bison]: for_loop_stmt <- empty");
		//NEWTYPE(p, for_loop_stmt);
		//p->var = $2;
		//p->begin = $4;
		//p->end = $6;
		//p->add = $8;
		//p->block = 0;
		//$$ = p;
	};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 353 of lalr1.java  */
/* Line 570 of "bison.y"  */
    {
		//FKLOG("[bison]: while_stmt <- cmp block");
		//NEWTYPE(p, while_stmt);
		//p->cmp = dynamic_cast<cmp_stmt*>($2);
		//p->block = dynamic_cast<block_node*>($4);
		//$$ = p;
	};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 353 of lalr1.java  */
/* Line 579 of "bison.y"  */
    {
		//FKLOG("[bison]: while_stmt <- cmp");
		//NEWTYPE(p, while_stmt);
		//p->cmp = dynamic_cast<cmp_stmt*>($2);
		//p->block = 0;
		//$$ = p;
	};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 353 of lalr1.java  */
/* Line 590 of "bison.y"  */
    {
		//FKLOG("[bison]: if_stmt <- cmp block");
		//NEWTYPE(p, if_stmt);
		//p->cmp = dynamic_cast<cmp_stmt*>($2);
		//p->block = dynamic_cast<block_node*>($4);
		//p->elseifs = dynamic_cast<elseif_stmt_list*>($5);
		//p->elses = dynamic_cast<else_stmt*>($6);
		//$$ = p;
	};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 353 of lalr1.java  */
/* Line 601 of "bison.y"  */
    {
		//FKLOG("[bison]: if_stmt <- cmp");
		//NEWTYPE(p, if_stmt);
		//p->cmp = dynamic_cast<cmp_stmt*>($2);
		//p->block = 0;
		//p->elseifs = dynamic_cast<elseif_stmt_list*>($4);
		//p->elses = dynamic_cast<else_stmt*>($5);
		//$$ = p;
	};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 353 of lalr1.java  */
/* Line 614 of "bison.y"  */
    {
		//$$ = 0;
	};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 353 of lalr1.java  */
/* Line 619 of "bison.y"  */
    {
		//FKLOG("[bison]: elseif_stmt_list <- elseif_stmt_list elseif_stmt");
		//assert($1->gettype() == est_elseif_stmt_list);
		//elseif_stmt_list * p = dynamic_cast<elseif_stmt_list*>($1);
		//p->add_stmt($2);
		//$$ = p;
	};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 353 of lalr1.java  */
/* Line 628 of "bison.y"  */
    {
		//FKLOG("[bison]: elseif_stmt_list <- elseif_stmt");
		//NEWTYPE(p, elseif_stmt_list);
		//p->add_stmt($1);
		//$$ = p;
	};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 353 of lalr1.java  */
/* Line 638 of "bison.y"  */
    {
		//FKLOG("[bison]: elseif_stmt <- ELSEIF cmp THEN block");
		//NEWTYPE(p, elseif_stmt);
		//p->cmp = dynamic_cast<cmp_stmt*>($2);
		//p->block = $4;
		//$$ = p;
	};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 353 of lalr1.java  */
/* Line 647 of "bison.y"  */
    {
		//FKLOG("[bison]: elseif_stmt <- ELSEIF cmp THEN block");
		//NEWTYPE(p, elseif_stmt);
		//p->cmp = dynamic_cast<cmp_stmt*>($2);
		//p->block = 0;
		//$$ = p;
	};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 353 of lalr1.java  */
/* Line 658 of "bison.y"  */
    {
		//$$ = 0;
	};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 353 of lalr1.java  */
/* Line 663 of "bison.y"  */
    {
		//FKLOG("[bison]: else_stmt <- block");
		//NEWTYPE(p, else_stmt);
		//p->block = dynamic_cast<block_node*>($2);
		//$$ = p;
	};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 353 of lalr1.java  */
/* Line 671 of "bison.y"  */
    {
		//FKLOG("[bison]: else_stmt <- empty");
		//NEWTYPE(p, else_stmt);
		//p->block = 0;
		//$$ = p;
	};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 353 of lalr1.java  */
/* Line 681 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- ( cmp )");
		//$$ = $2;
	};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 353 of lalr1.java  */
/* Line 687 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp AND cmp");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = "&&";
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 353 of lalr1.java  */
/* Line 697 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp OR cmp");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = "||";
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 353 of lalr1.java  */
/* Line 707 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp_value LESS cmp_value");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = $2;
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 353 of lalr1.java  */
/* Line 717 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp_value MORE cmp_value");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = $2;
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 353 of lalr1.java  */
/* Line 727 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp_value EQUAL cmp_value");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = $2;
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 353 of lalr1.java  */
/* Line 737 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp_value MORE_OR_EQUAL cmp_value");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = $2;
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 353 of lalr1.java  */
/* Line 747 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp_value LESS_OR_EQUAL cmp_value");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = $2;
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 353 of lalr1.java  */
/* Line 757 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp_value NOT_EQUAL cmp_value");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = $2;
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 353 of lalr1.java  */
/* Line 767 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- true");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = "true";
		//p->left = 0;
		//p->right = 0;
		//$$ = p;
	};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 353 of lalr1.java  */
/* Line 777 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- false");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = "false";
		//p->left = 0;
		//p->right = 0;
		//$$ = p;
	};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 353 of lalr1.java  */
/* Line 787 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp_value IS cmp_value");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = "is";
		//p->left = $2;
		//p->right = 0;
		//$$ = p;
	};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 353 of lalr1.java  */
/* Line 797 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp <- cmp_value NOT cmp_value");
		//NEWTYPE(p, cmp_stmt);
		//p->cmp = "not";
		//p->left = $2;
		//p->right = 0;
		//$$ = p;
	};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 353 of lalr1.java  */
/* Line 809 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp_value <- explicit_value");
		//$$ = $1;
	};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 353 of lalr1.java  */
/* Line 815 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp_value <- variable");
		//$$ = $1;
	};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 353 of lalr1.java  */
/* Line 821 of "bison.y"  */
    {
		//FKLOG("[bison]: cmp_value <- expr");
		//$$ = $1;
	};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 353 of lalr1.java  */
/* Line 829 of "bison.y"  */
    {
		//FKLOG("[bison]: return_stmt <- RETURN return_value_list");
		//NEWTYPE(p, return_stmt);
		//p->returnlist = dynamic_cast<return_value_list_node*>($2);
		//$$ = p;
	};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 353 of lalr1.java  */
/* Line 837 of "bison.y"  */
    {
		//FKLOG("[bison]: return_stmt <- RETURN");
		//NEWTYPE(p, return_stmt);
		//p->returnlist = 0;
		//$$ = p;
	};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 353 of lalr1.java  */
/* Line 847 of "bison.y"  */
    {
		//FKLOG("[bison]: return_value_list <- return_value_list return_value");
		//assert($1->gettype() == est_return_value_list);
		//return_value_list_node * p = dynamic_cast<return_value_list_node*>($1);
		//p->add_arg($3);
		//$$ = p;
	};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 353 of lalr1.java  */
/* Line 856 of "bison.y"  */
    {
		//NEWTYPE(p, return_value_list_node);
		//p->add_arg($1);
		//$$ = p;
	};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 353 of lalr1.java  */
/* Line 865 of "bison.y"  */
    {
		//FKLOG("[bison]: return_value <- explicit_value");
		//$$ = $1;
	};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 353 of lalr1.java  */
/* Line 871 of "bison.y"  */
    {
		//FKLOG("[bison]: return_value <- variable");
		//$$ = $1;
	};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 353 of lalr1.java  */
/* Line 877 of "bison.y"  */
    {
		//FKLOG("[bison]: return_value <- expr");
		//$$ = $1;
	};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 353 of lalr1.java  */
/* Line 885 of "bison.y"  */
    {
		//FKLOG("[bison]: assign_stmt <- var assign_value");
		//NEWTYPE(p, assign_stmt);
		//p->var = $1;
		//p->value = $3;
		//p->isnew = false;
		//$$ = p;
	};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 353 of lalr1.java  */
/* Line 895 of "bison.y"  */
    {
		//FKLOG("[bison]: new assign_stmt <- var assign_value");
		//NEWTYPE(p, assign_stmt);
		//p->var = $1;
		//p->value = $3;
		//p->isnew = true;
		//$$ = p;
	};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 353 of lalr1.java  */
/* Line 907 of "bison.y"  */
    {
		//FKLOG("[bison]: multi_assign_stmt <- var_list function_call");
		//NEWTYPE(p, multi_assign_stmt);
		//p->varlist = dynamic_cast<var_list_node*>($1);
		//p->value = $3;
		//p->isnew = false;
		//$$ = p;
	};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 353 of lalr1.java  */
/* Line 917 of "bison.y"  */
    {
		//FKLOG("[bison]: new multi_assign_stmt <- var_list function_call");
		//NEWTYPE(p, multi_assign_stmt);
		//p->varlist = dynamic_cast<var_list_node*>($1);
		//p->value = $3;
		//p->isnew = true;
		//$$ = p;
	};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 353 of lalr1.java  */
/* Line 929 of "bison.y"  */
    {
		//FKLOG("[bison]: var_list <- var_list var");
		//assert($1->gettype() == est_var_list);
		//var_list_node * p = dynamic_cast<var_list_node*>($1);
		//p->add_arg($3);
		//$$ = p;
	};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 353 of lalr1.java  */
/* Line 938 of "bison.y"  */
    {
		//NEWTYPE(p, var_list_node);
		//p->add_arg($1);
		//$$ = p;
	};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 353 of lalr1.java  */
/* Line 947 of "bison.y"  */
    {
		//FKLOG("[bison]: assign_value <- explicit_value");
		//$$ = $1;
	};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 353 of lalr1.java  */
/* Line 953 of "bison.y"  */
    {
		//FKLOG("[bison]: assign_value <- variable");
		//$$ = $1;
	};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 353 of lalr1.java  */
/* Line 959 of "bison.y"  */
    {
		//FKLOG("[bison]: assign_value <- expr");
		//$$ = $1;
	};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 353 of lalr1.java  */
/* Line 967 of "bison.y"  */
    {
		//FKLOG("[bison]: math_assign_stmt <- variable assign_value");
		//NEWTYPE(p, math_assign_stmt);
		//p->var = $1;
		//p->oper = "+=";
		//p->value = $3;
		//$$ = p;
	};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 353 of lalr1.java  */
/* Line 977 of "bison.y"  */
    {
		//FKLOG("[bison]: math_assign_stmt <- variable assign_value");
		//NEWTYPE(p, math_assign_stmt);
		//p->var = $1;
		//p->oper = "-=";
		//p->value = $3;
		//$$ = p;
	};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 353 of lalr1.java  */
/* Line 987 of "bison.y"  */
    {
		//FKLOG("[bison]: math_assign_stmt <- variable assign_value");
		//NEWTYPE(p, math_assign_stmt);
		//p->var = $1;
		//p->oper = "/=";
		//p->value = $3;
		//$$ = p;
	};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 353 of lalr1.java  */
/* Line 997 of "bison.y"  */
    {
		//FKLOG("[bison]: math_assign_stmt <- variable assign_value");
		//NEWTYPE(p, math_assign_stmt);
		//p->var = $1;
		//p->oper = "*=";
		//p->value = $3;
		//$$ = p;
	};
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 353 of lalr1.java  */
/* Line 1007 of "bison.y"  */
    {
		//FKLOG("[bison]: math_assign_stmt <- variable assign_value");
		//NEWTYPE(p, math_assign_stmt);
		//p->var = $1;
		//p->oper = "%=";
		//p->value = $3;
		//$$ = p;
	};
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 353 of lalr1.java  */
/* Line 1017 of "bison.y"  */
    {
		//FKLOG("[bison]: math_assign_stmt <- variable INC");
		//NEWTYPE(pp, explicit_value_node);
		//pp->str = "1";
		//pp->type = explicit_value_node::EVT_NUM;
		//
		//NEWTYPE(p, math_assign_stmt);
		//p->var = $1;
		//p->oper = "+=";
		//p->value = pp;
		//$$ = p;
	};
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 353 of lalr1.java  */
/* Line 1033 of "bison.y"  */
    {
		//FKLOG("[bison]: var <- VAR_BEGIN IDENTIFIER %s", $2.c_str());
		//NEWTYPE(p, var_node);
		//p->str = $2;
		//$$ = p;
	};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 353 of lalr1.java  */
/* Line 1041 of "bison.y"  */
    {
		//FKLOG("[bison]: var <- variable");
		//$$ = $1;
	};
  break;
    

  case 111:
  if (yyn == 111)
    
/* Line 353 of lalr1.java  */
/* Line 1049 of "bison.y"  */
    {
		//FKLOG("[bison]: variable <- IDENTIFIER %s", $1.c_str());
		//NEWTYPE(p, variable_node);
		//p->str = $1;
		//$$ = p;
	};
  break;
    

  case 112:
  if (yyn == 112)
    
/* Line 353 of lalr1.java  */
/* Line 1057 of "bison.y"  */
    {
		//FKLOG("[bison]: container_get_node <- IDENTIFIER[expr_value] %s", $1.c_str());
		//NEWTYPE(p, container_get_node);
		//p->container = $1;
		//p->key = $3;
		//$$ = p;
	};
  break;
    

  case 113:
  if (yyn == 113)
    
/* Line 353 of lalr1.java  */
/* Line 1066 of "bison.y"  */
    {
		//FKLOG("[bison]: variable <- IDENTIFIER_POINTER %s", $1.c_str());
		//NEWTYPE(p, struct_pointer_node);
		//p->str = $1;
		//$$ = p;
	};
  break;
    

  case 114:
  if (yyn == 114)
    
/* Line 353 of lalr1.java  */
/* Line 1074 of "bison.y"  */
    {
		//FKLOG("[bison]: variable <- IDENTIFIER_DOT %s", $1.c_str());
		//NEWTYPE(p, variable_node);
		//p->str = $1;
		//$$ = p;
	};
  break;
    

  case 115:
  if (yyn == 115)
    
/* Line 353 of lalr1.java  */
/* Line 1084 of "bison.y"  */
    {
		//FKLOG("[bison]: expr <- (expr)");
		//$$ = $2;
	};
  break;
    

  case 116:
  if (yyn == 116)
    
/* Line 353 of lalr1.java  */
/* Line 1090 of "bison.y"  */
    {
		//FKLOG("[bison]: expr <- function_call");
		//$$ = $1;
	};
  break;
    

  case 117:
  if (yyn == 117)
    
/* Line 353 of lalr1.java  */
/* Line 1096 of "bison.y"  */
    {
		//FKLOG("[bison]: expr <- math_expr");
		//$$ = $1;
	};
  break;
    

  case 118:
  if (yyn == 118)
    
/* Line 353 of lalr1.java  */
/* Line 1104 of "bison.y"  */
    {
		//FKLOG("[bison]: math_expr <- (math_expr)");
		//$$ = $2;
	};
  break;
    

  case 119:
  if (yyn == 119)
    
/* Line 353 of lalr1.java  */
/* Line 1110 of "bison.y"  */
    {
		//FKLOG("[bison]: math_expr <- expr_value %s expr_value", $2.c_str());
		//NEWTYPE(p, math_expr_node);
		//p->oper = "+";
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 120:
  if (yyn == 120)
    
/* Line 353 of lalr1.java  */
/* Line 1120 of "bison.y"  */
    {
		//FKLOG("[bison]: math_expr <- expr_value %s expr_value", $2.c_str());
		//NEWTYPE(p, math_expr_node);
		//p->oper = "-";
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 121:
  if (yyn == 121)
    
/* Line 353 of lalr1.java  */
/* Line 1130 of "bison.y"  */
    {
		//FKLOG("[bison]: math_expr <- expr_value %s expr_value", $2.c_str());
		//NEWTYPE(p, math_expr_node);
		//p->oper = "*";
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 122:
  if (yyn == 122)
    
/* Line 353 of lalr1.java  */
/* Line 1140 of "bison.y"  */
    {
		//FKLOG("[bison]: math_expr <- expr_value %s expr_value", $2.c_str());
		//NEWTYPE(p, math_expr_node);
		//p->oper = "/";
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 123:
  if (yyn == 123)
    
/* Line 353 of lalr1.java  */
/* Line 1150 of "bison.y"  */
    {
		//FKLOG("[bison]: math_expr <- expr_value %s expr_value", $2.c_str());
		//NEWTYPE(p, math_expr_node);
		//p->oper = "%";
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 124:
  if (yyn == 124)
    
/* Line 353 of lalr1.java  */
/* Line 1160 of "bison.y"  */
    {
		//FKLOG("[bison]: math_expr <- expr_value %s expr_value", $2.c_str());
		//NEWTYPE(p, math_expr_node);
		//p->oper = "..";
		//p->left = $1;
		//p->right = $3;
		//$$ = p;
	};
  break;
    

  case 125:
  if (yyn == 125)
    
/* Line 353 of lalr1.java  */
/* Line 1172 of "bison.y"  */
    {
		//FKLOG("[bison]: expr_value <- math_expr");
		//$$ = $1;
	};
  break;
    

  case 126:
  if (yyn == 126)
    
/* Line 353 of lalr1.java  */
/* Line 1178 of "bison.y"  */
    {
		//FKLOG("[bison]: expr_value <- explicit_value");
		//$$ = $1;
	};
  break;
    

  case 127:
  if (yyn == 127)
    
/* Line 353 of lalr1.java  */
/* Line 1184 of "bison.y"  */
    {
		//FKLOG("[bison]: expr_value <- function_call");
		//$$ = $1;
	};
  break;
    

  case 128:
  if (yyn == 128)
    
/* Line 353 of lalr1.java  */
/* Line 1190 of "bison.y"  */
    {
		//FKLOG("[bison]: expr_value <- variable");
		//$$ = $1;
	};
  break;
    

  case 129:
  if (yyn == 129)
    
/* Line 353 of lalr1.java  */
/* Line 1198 of "bison.y"  */
    {
		//FKLOG("[bison]: explicit_value <- FTRUE");
		//NEWTYPE(p, explicit_value_node);
		//p->str = $1;
		//p->type = explicit_value_node::EVT_TRUE;
		//$$ = p;
	};
  break;
    

  case 130:
  if (yyn == 130)
    
/* Line 353 of lalr1.java  */
/* Line 1207 of "bison.y"  */
    {
		//FKLOG("[bison]: explicit_value <- FFALSE");
		//NEWTYPE(p, explicit_value_node);
		//p->str = $1;
		//p->type = explicit_value_node::EVT_FALSE;
		//$$ = p;
	};
  break;
    

  case 131:
  if (yyn == 131)
    
/* Line 353 of lalr1.java  */
/* Line 1216 of "bison.y"  */
    {
		//FKLOG("[bison]: explicit_value <- NUMBER %s", $1.c_str());
		//NEWTYPE(p, explicit_value_node);
		//p->str = $1;
		//p->type = explicit_value_node::EVT_NUM;
		//$$ = p;
	};
  break;
    

  case 132:
  if (yyn == 132)
    
/* Line 353 of lalr1.java  */
/* Line 1225 of "bison.y"  */
    {
		//FKLOG("[bison]: explicit_value <- FKUUID %s", $1.c_str());
		//NEWTYPE(p, explicit_value_node);
		//p->str = $1;
		//p->type = explicit_value_node::EVT_UUID;
		//$$ = p;
	};
  break;
    

  case 133:
  if (yyn == 133)
    
/* Line 353 of lalr1.java  */
/* Line 1234 of "bison.y"  */
    {
		//FKLOG("[bison]: explicit_value <- STRING_DEFINITION %s", $1.c_str());
		//NEWTYPE(p, explicit_value_node);
		//p->str = $1;
		//p->type = explicit_value_node::EVT_STR;
		//$$ = p;
	};
  break;
    

  case 134:
  if (yyn == 134)
    
/* Line 353 of lalr1.java  */
/* Line 1243 of "bison.y"  */
    {
		//FKLOG("[bison]: explicit_value <- FKFLOAT %s", $1.c_str());
		//NEWTYPE(p, explicit_value_node);
		//p->str = $1;
		//p->type = explicit_value_node::EVT_FLOAT;
		//$$ = p;
	};
  break;
    

  case 135:
  if (yyn == 135)
    
/* Line 353 of lalr1.java  */
/* Line 1252 of "bison.y"  */
    {
		//FKLOG("[bison]: explicit_value <- const_map_list_value");
		//NEWTYPE(p, explicit_value_node);
		//p->str = "";
		//p->type = explicit_value_node::EVT_MAP;
		//p->v = $2;
		//$$ = p;
	};
  break;
    

  case 136:
  if (yyn == 136)
    
/* Line 353 of lalr1.java  */
/* Line 1262 of "bison.y"  */
    {
		//FKLOG("[bison]: explicit_value <- const_array_list_value");
		//NEWTYPE(p, explicit_value_node);
		//p->str = "";
		//p->type = explicit_value_node::EVT_ARRAY;
		//p->v = $2;
		//$$ = p;
	};
  break;
    

  case 137:
  if (yyn == 137)
    
/* Line 353 of lalr1.java  */
/* Line 1274 of "bison.y"  */
    {
		//FKLOG("[bison]: const_map_list_value <- null");
		//NEWTYPE(p, const_map_list_value_node);
		//$$ = p;
	};
  break;
    

  case 138:
  if (yyn == 138)
    
/* Line 353 of lalr1.java  */
/* Line 1281 of "bison.y"  */
    {
		//FKLOG("[bison]: const_map_list_value <- const_map_value");
		//NEWTYPE(p, const_map_list_value_node);
		//p->add_ele($1);
		//$$ = p;
	};
  break;
    

  case 139:
  if (yyn == 139)
    
/* Line 353 of lalr1.java  */
/* Line 1289 of "bison.y"  */
    {
		//FKLOG("[bison]: const_map_list_value <- const_map_list_value const_map_value");
		//assert($1->gettype() == est_constmaplist);
		//const_map_list_value_node * p = dynamic_cast<const_map_list_value_node*>($1);
		//p->add_ele($2);
		//$$ = p;
	};
  break;
    

  case 140:
  if (yyn == 140)
    
/* Line 353 of lalr1.java  */
/* Line 1300 of "bison.y"  */
    {
		//FKLOG("[bison]: const_map_value <- explicit_value");
		//NEWTYPE(p, const_map_value_node);
		//p->k = $1;
		//p->v = $3;
		//$$ = p;
	};
  break;
    

  case 141:
  if (yyn == 141)
    
/* Line 353 of lalr1.java  */
/* Line 1311 of "bison.y"  */
    {
		//FKLOG("[bison]: const_array_list_value <- null");
		//NEWTYPE(p, const_array_list_value_node);
		//$$ = p;
	};
  break;
    

  case 142:
  if (yyn == 142)
    
/* Line 353 of lalr1.java  */
/* Line 1318 of "bison.y"  */
    {
		//FKLOG("[bison]: const_array_list_value <- explicit_value");
		//NEWTYPE(p, const_array_list_value_node);
		//p->add_ele($1);
		//$$ = p;
	};
  break;
    

  case 143:
  if (yyn == 143)
    
/* Line 353 of lalr1.java  */
/* Line 1326 of "bison.y"  */
    {
		//FKLOG("[bison]: const_array_list_value <- const_array_list_value explicit_value");
		//assert($1->gettype() == est_constarraylist);
		//const_array_list_value_node * p = dynamic_cast<const_array_list_value_node*>($1);
		//p->add_ele($2);
		//$$ = p;
	};
  break;
    

  case 144:
  if (yyn == 144)
    
/* Line 353 of lalr1.java  */
/* Line 1337 of "bison.y"  */
    {
		//FKLOG("[bison]: break <- BREAK");
		//NEWTYPE(p, break_stmt);
		//$$ = p;
	};
  break;
    

  case 145:
  if (yyn == 145)
    
/* Line 353 of lalr1.java  */
/* Line 1346 of "bison.y"  */
    {
		//FKLOG("[bison]: CONTINUE");
		//NEWTYPE(p, continue_stmt);
		//$$ = p;
	};
  break;
    

  case 146:
  if (yyn == 146)
    
/* Line 353 of lalr1.java  */
/* Line 1355 of "bison.y"  */
    {
		//FKLOG("[bison]: SLEEP");
		//NEWTYPE(p, sleep_stmt);
		//p->time = $2;
		//$$ = p;
	};
  break;
    

  case 147:
  if (yyn == 147)
    
/* Line 353 of lalr1.java  */
/* Line 1364 of "bison.y"  */
    {
		//FKLOG("[bison]: YIELD");
		//NEWTYPE(p, yield_stmt);
		//p->time = $2;
		//$$ = p;
	};
  break;
    

  case 148:
  if (yyn == 148)
    
/* Line 353 of lalr1.java  */
/* Line 1374 of "bison.y"  */
    {
		//FKLOG("[bison]: switch_stmt");
		//NEWTYPE(p, switch_stmt);
		//p->cmp = $2;
		//p->caselist = $3;
		//p->def = $5;
		//$$ = p;
	};
  break;
    

  case 149:
  if (yyn == 149)
    
/* Line 353 of lalr1.java  */
/* Line 1384 of "bison.y"  */
    {
		//FKLOG("[bison]: switch_stmt");
		//NEWTYPE(p, switch_stmt);
		//p->cmp = $2;
		//p->caselist = $3;
		//p->def = 0;
		//$$ = p;
	};
  break;
    

  case 150:
  if (yyn == 150)
    
/* Line 353 of lalr1.java  */
/* Line 1396 of "bison.y"  */
    {
		//FKLOG("[bison]: switch_case_list <- switch_case_define");
		//NEWTYPE(p, switch_caselist_node);
		//p->add_case($1);
		//$$ = p;
	};
  break;
    

  case 151:
  if (yyn == 151)
    
/* Line 353 of lalr1.java  */
/* Line 1404 of "bison.y"  */
    {
		//FKLOG("[bison]: switch_case_list <- switch_case_list switch_case_define");
		//assert($2->gettype() == est_switch_case_node);
		//switch_caselist_node * p = dynamic_cast<switch_caselist_node*>($1);
		//p->add_case($2);
		//$$ = p;
	};
  break;
    

  case 152:
  if (yyn == 152)
    
/* Line 353 of lalr1.java  */
/* Line 1415 of "bison.y"  */
    {
		//FKLOG("[bison]: switch_case_define");
		//NEWTYPE(p, switch_case_node);
		//p->cmp = $2;
		//p->block = $4;
		//$$ = p;
	};
  break;
    

  case 153:
  if (yyn == 153)
    
/* Line 353 of lalr1.java  */
/* Line 1424 of "bison.y"  */
    {
		//FKLOG("[bison]: switch_case_define");
		//NEWTYPE(p, switch_case_node);
		//p->cmp = $2;
		//p->block = 0;
		//$$ = p;
	};
  break;
    



/* Line 353 of lalr1.java  */
/* Line 2507 of "bison.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval, yyloc);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval, yyloc);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 , Object yylocationp)
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + yylocationp + ": "
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    /// The location where the error started.
    Location yyerrloc = null;

    /// Location of the lookahead.
    Location yylloc = new Location (null, null);

    /// @$.
    Location yyloc;

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval, yylloc);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);
    
        /* Accept?  */
        if (yystate == yyfinal_)
          return true;
    
        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyn == yypact_ninf_)
          {
            label = YYDEFAULT;
	    break;
          }
    
        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
	    yylloc = new Location(yylexer.getStartPos (),
	    		   	            yylexer.getEndPos ());
            yylval = yylexer.getLVal ();
          }
    
        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
	    		     yylval, yylloc);
          }
    
        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;
    
        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yyn == 0 || yyn == yytable_ninf_)
	      label = YYFAIL;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }
    
        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
	    		     yylval, yylloc);
    
            /* Discard the token being shifted.  */
            yychar = yyempty_;
    
            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;
    
            yystate = yyn;
            yystack.push (yystate, yylval, yylloc);
            label = YYNEWSTATE;
          }
        break;
    
      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYFAIL;
        else
          label = YYREDUCE;
        break;
    
      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;
    
      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYFAIL:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
	    ++yynerrs_;
	    yyerror (yylloc, yysyntax_error (yystate, yytoken));
          }
    
        yyerrloc = yylloc;
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */
    
	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }
    
        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;
    
      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:
    
        yyerrloc = yystack.locationAt (yylen - 1);
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;
    
      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */
    
        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (yyn != yypact_ninf_)
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }
    
	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;
    
	    yyerrloc = yystack.locationAt (0);
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }
    
	
	/* Muck with the stack to setup for yylloc.  */
	yystack.push (0, null, yylloc);
	yystack.push (0, null, yyerrloc);
        yyloc = yylloc (yystack, 2);
	yystack.pop (2);

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval, yyloc);
    
        yystate = yyn;
	yystack.push (yyn, yylval, yyloc);
        label = YYNEWSTATE;
        break;
    
        /* Accept.  */
      case YYACCEPT:
        return true;
    
        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        int yyn = yypact_[yystate];
        if (yypact_ninf_ < yyn && yyn <= yylast_)
          {
	    StringBuffer res;

	    /* Start YYX at -YYN if negative to avoid negative indexes in
	       YYCHECK.  */
	    int yyxbegin = yyn < 0 ? -yyn : 0;

	    /* Stay within bounds of both yycheck and yytname.  */
	    int yychecklim = yylast_ - yyn + 1;
	    int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
	    int count = 0;
	    for (int x = yyxbegin; x < yyxend; ++x)
	      if (yycheck_[x + yyn] == x && x != yyterror_)
	        ++count;

	    // FIXME: This method of building the message is not compatible
	    // with internationalization.
	    res = new StringBuffer ("syntax error, unexpected ");
	    res.append (yytnamerr_ (yytname_[tok]));
	    if (count < 5)
	      {
	        count = 0;
	        for (int x = yyxbegin; x < yyxend; ++x)
	          if (yycheck_[x + yyn] == x && x != yyterror_)
		    {
		      res.append (count++ == 0 ? ", expecting " : " or ");
		      res.append (yytnamerr_ (yytname_[x]));
		    }
	      }
	    return res.toString ();
          }
      }

    return "syntax error";
  }


  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -212;
  private static final short yypact_[] =
  {
       -25,    -7,    32,   -11,  -212,  -212,  -212,    41,     1,  -212,
    -212,    59,  -212,    69,  -212,    62,    76,  -212,    12,  -212,
    -212,    70,    75,    82,  -212,   135,  -212,  -212,  -212,    49,
     112,  -212,  -212,  -212,  -212,  -212,  -212,  -212,    49,    49,
    -212,   137,  -212,   324,   134,     3,  -212,  -212,    -4,  -212,
    -212,  -212,    49,  -212,  -212,   137,   417,  -212,  -212,   184,
    1079,  -212,    21,    21,  -212,   -24,  1079,  1033,    73,   171,
    -212,  -212,  1088,  1088,  1079,    98,   477,  -212,  -212,  -212,
    -212,  -212,  -212,  -212,  -212,  -212,     2,  -212,   -21,  1119,
    -212,   643,   653,  -212,  -212,  -212,  -212,  -212,  -212,  -212,
     191,  -212,   256,  -212,   703,   292,   296,    21,  1079,  1079,
      48,   629,   256,  -212,   703,   117,  1088,  1088,   175,   188,
     321,   495,   -19,  -212,   175,  1088,  1088,  -212,  -212,   653,
     653,   166,  -212,  -212,    10,    73,    73,  1079,  1079,  1079,
    1079,  1079,  1079,  1079,   218,  -212,  1088,  1088,  1088,  1088,
    1088,  1088,  1079,   205,   188,  -212,  -212,   555,    21,    21,
    1079,  1079,  1079,  1079,  1079,  1079,   573,     8,  -212,   653,
     390,  -212,  -212,    21,  1079,   164,   203,  1079,   124,  -212,
     194,  -212,  -212,  -212,  -212,  -212,  -212,   256,  -212,   703,
    -212,  -212,  -212,  -212,  -212,  -212,   210,   178,    24,    24,
     178,   178,  -212,  -212,  -212,  -212,   637,    93,    93,  -212,
    -212,  -212,  -212,  -212,  -212,    21,   573,   -10,  -212,  1088,
    -212,  -212,    67,   180,  -212,   236,   697,  -212,  1088,  -212,
     189,   -10,  1033,  -212,   235,  -212,  1033,  1079,  1033,  -212,
     757,   182,  1033,   237,  1033,  -212,   775,   232,  1033,  -212,
    -212,  1033,  -212,   835,  1088,  -212,   895,   423,  -212,   955,
    -212,  1015,  -212
  };

  /* YYDEFACT[S] -- default rule to reduce with in state S when YYTABLE
     doesn't specify something else to do.  Zero means the default is an
     error.  */
  private static final short yydefact_[] =
  {
         3,     0,     0,     6,     4,     5,     1,     0,    10,     7,
       9,     0,     8,    17,    11,    14,     0,    12,    21,    18,
      16,     0,     0,     0,    19,     2,    22,    13,    15,     0,
       0,    23,   129,   130,   133,   131,   134,   132,   141,   137,
      20,    26,   142,     0,     0,     0,   138,    29,     0,    28,
     136,   143,     0,   135,   139,     0,     0,   140,    27,     0,
      88,   144,     0,     0,    25,   111,     0,     0,     0,   114,
     113,   145,     0,     0,     0,   116,     0,    38,    50,    48,
      49,    39,    40,    41,    42,    43,     0,    47,    99,   128,
      46,   117,     0,   126,    44,    45,    51,    52,    53,   109,
      87,    90,    92,    93,    91,   129,   130,     0,     0,     0,
       0,     0,    85,    86,    84,     0,    33,     0,   128,     0,
     117,     0,    99,    54,     0,    33,     0,   127,   125,   147,
     146,     0,    24,    37,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   108,     0,     0,     0,     0,
       0,     0,     0,     0,    86,    82,    83,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    63,     0,    35,    36,
       0,   115,   118,     0,     0,     0,   125,     0,     0,   150,
     111,   114,    98,   110,    96,    97,    94,   101,   102,   100,
      95,   103,   104,   105,   106,   107,     0,   123,   119,   120,
     122,   121,   124,    89,    71,    60,     0,    72,    73,    75,
      74,    77,    78,    76,    79,     0,    63,    68,    65,     0,
      30,   112,     0,    94,    31,     0,     0,   151,    33,    59,
       0,    68,    70,    64,     0,    34,     0,     0,   153,   149,
       0,     0,    67,     0,    69,    62,     0,     0,   152,   148,
      32,    66,    61,     0,     0,    56,     0,     0,    55,     0,
      58,     0,    57
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
      -212,  -212,  -212,  -212,   244,  -212,   240,  -212,  -212,   239,
    -212,   229,  -212,   204,   145,  -121,    44,   -17,    66,  -212,
    -212,  -212,  -212,  -212,    50,  -211,    29,   161,    -3,  -212,
    -212,   121,  -212,  -212,  -212,   453,  -212,   -66,    30,   242,
     139,    81,   -29,  -212,   224,  -212,  -212,  -212,  -212,  -212,
    -212,  -212,    97
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     2,     3,     8,     9,    13,    14,    21,    18,    19,
      25,    26,    48,    49,    75,   167,   168,    76,    77,    78,
      79,    80,    81,    82,   217,   218,   234,   110,   111,    83,
     100,   101,    84,    85,    86,   186,    87,    88,    89,    90,
      91,    92,    93,    45,    46,    43,    94,    95,    96,    97,
      98,   178,   179
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If zero, do what YYDEFACT says.  */
  private static final short yytable_ninf_ = -129;
  private static final short
  yytable_[] =
  {
        40,   122,   232,   137,   175,   174,   233,   116,     4,    42,
      44,    32,    33,    59,    51,    55,    44,    34,    23,    35,
     233,   134,   117,    57,     1,   180,   135,   219,    56,   105,
     106,   104,     6,   114,   114,    34,    65,    35,    36,     7,
     220,   138,   146,   138,     5,   114,   149,   150,    37,    38,
     121,     7,   107,   215,    11,    10,    36,    32,    33,   157,
      16,   181,    70,    34,   136,    35,    37,    38,   182,    39,
      53,   131,    69,    70,    15,   108,   109,    20,   114,   114,
     114,   158,   159,    27,    36,    28,   236,    39,    65,   151,
     102,    22,   112,   112,    37,    38,   118,    30,   124,    29,
     158,   159,   118,   118,   112,   155,   156,   241,   189,   189,
     189,   189,   189,   189,   189,    39,  -127,    16,  -127,  -127,
    -127,  -127,    11,   104,    69,    70,   158,   159,   166,   114,
     114,   114,   114,   114,   114,   114,   114,   112,   112,   112,
     206,    23,   133,    41,   114,   189,   118,   118,   114,   216,
     158,   159,    47,   129,   130,   118,   118,   209,   210,   211,
     212,   213,   214,  -127,   183,   124,   124,   187,   187,   187,
     187,   187,   187,   187,   225,    52,   118,   118,   118,   118,
     118,   118,   102,   219,   177,   226,   114,   133,   112,   112,
     112,   112,   112,   112,   112,   112,   224,   169,   170,    99,
     242,   219,   125,   112,   187,   120,   169,   112,   114,   240,
     152,   128,   128,   123,   250,   244,   144,   127,   127,   246,
     171,   248,   158,   159,   115,   251,   177,   197,   198,   199,
     200,   201,   202,   196,   247,   172,   256,   204,   158,   159,
     117,   228,   261,   151,   237,   112,   120,   238,   245,   118,
     252,   254,    12,    17,    31,   128,   128,    24,   118,    58,
     243,   127,   127,   235,   128,   176,   231,   112,   153,    54,
     127,   127,   133,   203,  -128,   227,  -128,  -128,  -128,  -128,
     184,   185,   133,     0,   118,   128,   128,   128,   128,   128,
     128,   127,   127,   127,   127,   127,   127,   144,     0,     0,
     169,     0,   103,   -80,   113,   113,   133,   -81,   119,   169,
     133,   -80,   133,     0,   133,   -81,   113,   133,     0,   207,
     208,  -128,   133,     0,   -80,   -80,   -80,   133,   -81,   -81,
     -81,     0,    32,    33,   222,   257,     0,     0,    34,  -125,
      35,  -125,  -125,  -125,  -125,     0,     0,     0,     0,   154,
     113,   113,     0,   172,     0,     0,     0,     0,   128,    36,
       0,     0,     0,     0,   127,     0,     0,   128,     0,    37,
      38,    50,     0,   127,     0,     0,   230,     0,     0,   188,
     188,   188,   188,   188,   188,   188,  -125,     0,     0,     0,
      39,     0,     0,   128,   103,     0,     0,     0,     0,   127,
     113,   113,   113,   113,   113,   113,   113,   113,   146,     0,
     147,   148,   149,   150,     0,   113,   188,     0,     0,   113,
      59,    60,    61,     0,    62,    32,    33,    63,     0,     0,
      64,    34,    65,    35,   259,     0,     0,   221,     0,     0,
       0,   146,     0,   147,   148,   149,   150,     0,    66,     0,
       0,     0,    36,     0,     0,   151,     0,   113,     0,    67,
       0,    68,    37,    38,     0,     0,     0,     0,    69,    70,
       0,     0,     0,    71,    72,    73,    74,     0,     0,   113,
      59,    60,    61,    39,    62,    32,    33,    63,   151,     0,
     132,    34,    65,    35,     0,     0,     0,     0,    59,    60,
      61,     0,    62,    32,    33,    63,     0,     0,    66,    34,
      65,    35,    36,     0,   173,     0,     0,     0,     0,    67,
       0,    68,    37,    38,     0,     0,    66,     0,    69,    70,
      36,     0,     0,    71,    72,    73,    74,    67,     0,    68,
      37,    38,     0,    39,     0,     0,    69,    70,     0,     0,
       0,    71,    72,    73,    74,     0,     0,     0,    59,    60,
      61,    39,    62,    32,    33,    63,     0,     0,   205,    34,
      65,    35,     0,     0,     0,     0,    59,    60,    61,     0,
      62,    32,    33,    63,     0,     0,    66,    34,    65,    35,
      36,   190,   191,   192,   193,   194,   195,    67,     0,    68,
      37,    38,     0,     0,    66,     0,    69,    70,    36,     0,
       0,    71,    72,    73,    74,    67,     0,    68,    37,    38,
       0,    39,     0,     0,    69,    70,     0,   223,     0,    71,
      72,    73,    74,     0,     0,     0,   215,     0,     0,    39,
      59,    60,    61,     0,    62,    32,    33,    63,     0,     0,
     229,    34,    65,    35,   160,   161,   162,   163,   164,   165,
       0,  -125,     0,  -125,  -125,  -125,  -125,     0,    66,     0,
       0,   146,    36,   147,   148,   149,   150,     0,     0,    67,
       0,    68,    37,    38,     0,     0,     0,     0,    69,    70,
       0,     0,     0,    71,    72,    73,    74,     0,     0,     0,
      59,    60,    61,    39,    62,    32,    33,    63,  -125,     0,
     239,    34,    65,    35,     0,     0,     0,     0,   151,     0,
       0,  -126,     0,  -126,  -126,  -126,  -126,     0,    66,     0,
       0,     0,    36,     0,     0,     0,     0,     0,     0,    67,
       0,    68,    37,    38,     0,     0,     0,     0,    69,    70,
       0,     0,     0,    71,    72,    73,    74,     0,     0,     0,
      59,    60,    61,    39,    62,    32,    33,    63,  -126,     0,
     249,    34,    65,    35,     0,     0,     0,     0,    59,    60,
      61,     0,    62,    32,    33,    63,   253,     0,    66,    34,
      65,    35,    36,     0,     0,     0,     0,     0,     0,    67,
       0,    68,    37,    38,     0,     0,    66,     0,    69,    70,
      36,     0,     0,    71,    72,    73,    74,    67,     0,    68,
      37,    38,     0,    39,     0,     0,    69,    70,     0,     0,
       0,    71,    72,    73,    74,     0,     0,     0,    59,    60,
      61,    39,    62,    32,    33,    63,     0,     0,   255,    34,
      65,    35,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    66,     0,     0,     0,
      36,     0,     0,     0,     0,     0,     0,    67,     0,    68,
      37,    38,     0,     0,     0,     0,    69,    70,     0,     0,
       0,    71,    72,    73,    74,     0,     0,     0,    59,    60,
      61,    39,    62,    32,    33,    63,     0,     0,   258,    34,
      65,    35,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    66,     0,     0,     0,
      36,     0,     0,     0,     0,     0,     0,    67,     0,    68,
      37,    38,     0,     0,     0,     0,    69,    70,     0,     0,
       0,    71,    72,    73,    74,     0,     0,     0,    59,    60,
      61,    39,    62,    32,    33,    63,     0,     0,   260,    34,
      65,    35,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    66,     0,     0,     0,
      36,     0,     0,     0,     0,     0,     0,    67,     0,    68,
      37,    38,     0,     0,     0,     0,    69,    70,     0,     0,
       0,    71,    72,    73,    74,     0,     0,     0,    59,    60,
      61,    39,    62,    32,    33,    63,     0,     0,   262,    34,
      65,    35,     0,     0,     0,     0,    59,    60,    61,     0,
      62,    32,    33,    63,     0,     0,    66,    34,    65,    35,
      36,     0,     0,     0,     0,     0,     0,    67,     0,    68,
      37,    38,     0,     0,    66,     0,    69,    70,    36,     0,
       0,    71,    72,    73,    74,    67,     0,    68,    37,    38,
       0,    39,     0,     0,    69,    70,     0,    32,    33,    71,
      72,    73,    74,    34,    65,    35,    32,    33,     0,    39,
       0,     0,    34,    65,    35,     0,     0,     0,     0,     0,
      66,     0,     0,     0,    36,     0,     0,     0,     0,   126,
       0,     0,     0,    36,    37,    38,     0,     0,     0,     0,
      69,    70,     0,    37,    38,     0,     0,     0,  -110,    69,
      70,     0,     0,  -110,     0,    39,     0,     0,     0,     0,
       0,     0,     0,     0,    39,   139,   140,   141,   142,   143,
     144,     0,   145,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,  -110
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        29,    67,    12,    24,   125,    24,   217,    31,    15,    38,
      39,     8,     9,     3,    43,    19,    45,    14,     6,    16,
     231,    19,    46,    52,    49,    15,    24,    19,    32,     8,
       9,    60,     0,    62,    63,    14,    15,    16,    35,    50,
      32,    62,    18,    62,    51,    74,    22,    23,    45,    46,
      67,    50,    31,    63,    53,    14,    35,     8,     9,    11,
      48,    51,    52,    14,    62,    16,    45,    46,   134,    66,
      67,    74,    51,    52,    15,    54,    55,    15,   107,   108,
     109,    33,    34,    13,    35,    15,    19,    66,    15,    65,
      60,    15,    62,    63,    45,    46,    66,    15,    68,    24,
      33,    34,    72,    73,    74,   108,   109,   228,   137,   138,
     139,   140,   141,   142,   143,    66,    18,    48,    20,    21,
      22,    23,    53,   152,    51,    52,    33,    34,    11,   158,
     159,   160,   161,   162,   163,   164,   165,   107,   108,   109,
     157,     6,    76,    31,   173,   174,   116,   117,   177,   166,
      33,    34,    15,    72,    73,   125,   126,   160,   161,   162,
     163,   164,   165,    65,   134,   135,   136,   137,   138,   139,
     140,   141,   142,   143,   177,    41,   146,   147,   148,   149,
     150,   151,   152,    19,    60,    61,   215,   121,   158,   159,
     160,   161,   162,   163,   164,   165,    32,   116,   117,    15,
      11,    19,    31,   173,   174,    66,   125,   177,   237,   226,
      19,    72,    73,    68,    32,   232,    41,    72,    73,   236,
      32,   238,    33,    34,    63,   242,    60,   146,   147,   148,
     149,   150,   151,    15,   237,    32,   253,    32,    33,    34,
      46,    31,   259,    65,    64,   215,   107,    11,    13,   219,
      13,    19,     8,    13,    25,   116,   117,    18,   228,    55,
     231,   116,   117,   219,   125,   126,   216,   237,   107,    45,
     125,   126,   206,   152,    18,   178,    20,    21,    22,    23,
     135,   136,   216,    -1,   254,   146,   147,   148,   149,   150,
     151,   146,   147,   148,   149,   150,   151,    41,    -1,    -1,
     219,    -1,    60,    11,    62,    63,   240,    11,    66,   228,
     244,    19,   246,    -1,   248,    19,    74,   251,    -1,   158,
     159,    65,   256,    -1,    32,    33,    34,   261,    32,    33,
      34,    -1,     8,     9,   173,   254,    -1,    -1,    14,    18,
      16,    20,    21,    22,    23,    -1,    -1,    -1,    -1,   107,
     108,   109,    -1,    32,    -1,    -1,    -1,    -1,   219,    35,
      -1,    -1,    -1,    -1,   219,    -1,    -1,   228,    -1,    45,
      46,    47,    -1,   228,    -1,    -1,   215,    -1,    -1,   137,
     138,   139,   140,   141,   142,   143,    65,    -1,    -1,    -1,
      66,    -1,    -1,   254,   152,    -1,    -1,    -1,    -1,   254,
     158,   159,   160,   161,   162,   163,   164,   165,    18,    -1,
      20,    21,    22,    23,    -1,   173,   174,    -1,    -1,   177,
       3,     4,     5,    -1,     7,     8,     9,    10,    -1,    -1,
      13,    14,    15,    16,    11,    -1,    -1,    47,    -1,    -1,
      -1,    18,    -1,    20,    21,    22,    23,    -1,    31,    -1,
      -1,    -1,    35,    -1,    -1,    65,    -1,   215,    -1,    42,
      -1,    44,    45,    46,    -1,    -1,    -1,    -1,    51,    52,
      -1,    -1,    -1,    56,    57,    58,    59,    -1,    -1,   237,
       3,     4,     5,    66,     7,     8,     9,    10,    65,    -1,
      13,    14,    15,    16,    -1,    -1,    -1,    -1,     3,     4,
       5,    -1,     7,     8,     9,    10,    -1,    -1,    31,    14,
      15,    16,    35,    -1,    19,    -1,    -1,    -1,    -1,    42,
      -1,    44,    45,    46,    -1,    -1,    31,    -1,    51,    52,
      35,    -1,    -1,    56,    57,    58,    59,    42,    -1,    44,
      45,    46,    -1,    66,    -1,    -1,    51,    52,    -1,    -1,
      -1,    56,    57,    58,    59,    -1,    -1,    -1,     3,     4,
       5,    66,     7,     8,     9,    10,    -1,    -1,    13,    14,
      15,    16,    -1,    -1,    -1,    -1,     3,     4,     5,    -1,
       7,     8,     9,    10,    -1,    -1,    31,    14,    15,    16,
      35,   138,   139,   140,   141,   142,   143,    42,    -1,    44,
      45,    46,    -1,    -1,    31,    -1,    51,    52,    35,    -1,
      -1,    56,    57,    58,    59,    42,    -1,    44,    45,    46,
      -1,    66,    -1,    -1,    51,    52,    -1,   174,    -1,    56,
      57,    58,    59,    -1,    -1,    -1,    63,    -1,    -1,    66,
       3,     4,     5,    -1,     7,     8,     9,    10,    -1,    -1,
      13,    14,    15,    16,    25,    26,    27,    28,    29,    30,
      -1,    18,    -1,    20,    21,    22,    23,    -1,    31,    -1,
      -1,    18,    35,    20,    21,    22,    23,    -1,    -1,    42,
      -1,    44,    45,    46,    -1,    -1,    -1,    -1,    51,    52,
      -1,    -1,    -1,    56,    57,    58,    59,    -1,    -1,    -1,
       3,     4,     5,    66,     7,     8,     9,    10,    65,    -1,
      13,    14,    15,    16,    -1,    -1,    -1,    -1,    65,    -1,
      -1,    18,    -1,    20,    21,    22,    23,    -1,    31,    -1,
      -1,    -1,    35,    -1,    -1,    -1,    -1,    -1,    -1,    42,
      -1,    44,    45,    46,    -1,    -1,    -1,    -1,    51,    52,
      -1,    -1,    -1,    56,    57,    58,    59,    -1,    -1,    -1,
       3,     4,     5,    66,     7,     8,     9,    10,    65,    -1,
      13,    14,    15,    16,    -1,    -1,    -1,    -1,     3,     4,
       5,    -1,     7,     8,     9,    10,    11,    -1,    31,    14,
      15,    16,    35,    -1,    -1,    -1,    -1,    -1,    -1,    42,
      -1,    44,    45,    46,    -1,    -1,    31,    -1,    51,    52,
      35,    -1,    -1,    56,    57,    58,    59,    42,    -1,    44,
      45,    46,    -1,    66,    -1,    -1,    51,    52,    -1,    -1,
      -1,    56,    57,    58,    59,    -1,    -1,    -1,     3,     4,
       5,    66,     7,     8,     9,    10,    -1,    -1,    13,    14,
      15,    16,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    31,    -1,    -1,    -1,
      35,    -1,    -1,    -1,    -1,    -1,    -1,    42,    -1,    44,
      45,    46,    -1,    -1,    -1,    -1,    51,    52,    -1,    -1,
      -1,    56,    57,    58,    59,    -1,    -1,    -1,     3,     4,
       5,    66,     7,     8,     9,    10,    -1,    -1,    13,    14,
      15,    16,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    31,    -1,    -1,    -1,
      35,    -1,    -1,    -1,    -1,    -1,    -1,    42,    -1,    44,
      45,    46,    -1,    -1,    -1,    -1,    51,    52,    -1,    -1,
      -1,    56,    57,    58,    59,    -1,    -1,    -1,     3,     4,
       5,    66,     7,     8,     9,    10,    -1,    -1,    13,    14,
      15,    16,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    31,    -1,    -1,    -1,
      35,    -1,    -1,    -1,    -1,    -1,    -1,    42,    -1,    44,
      45,    46,    -1,    -1,    -1,    -1,    51,    52,    -1,    -1,
      -1,    56,    57,    58,    59,    -1,    -1,    -1,     3,     4,
       5,    66,     7,     8,     9,    10,    -1,    -1,    13,    14,
      15,    16,    -1,    -1,    -1,    -1,     3,     4,     5,    -1,
       7,     8,     9,    10,    -1,    -1,    31,    14,    15,    16,
      35,    -1,    -1,    -1,    -1,    -1,    -1,    42,    -1,    44,
      45,    46,    -1,    -1,    31,    -1,    51,    52,    35,    -1,
      -1,    56,    57,    58,    59,    42,    -1,    44,    45,    46,
      -1,    66,    -1,    -1,    51,    52,    -1,     8,     9,    56,
      57,    58,    59,    14,    15,    16,     8,     9,    -1,    66,
      -1,    -1,    14,    15,    16,    -1,    -1,    -1,    -1,    -1,
      31,    -1,    -1,    -1,    35,    -1,    -1,    -1,    -1,    31,
      -1,    -1,    -1,    35,    45,    46,    -1,    -1,    -1,    -1,
      51,    52,    -1,    45,    46,    -1,    -1,    -1,    19,    51,
      52,    -1,    -1,    24,    -1,    66,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    66,    36,    37,    38,    39,    40,
      41,    -1,    43,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    62
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    49,    69,    70,    15,    51,     0,    50,    71,    72,
      14,    53,    72,    73,    74,    15,    48,    74,    76,    77,
      15,    75,    15,     6,    77,    78,    79,    13,    15,    24,
      15,    79,     8,     9,    14,    16,    35,    45,    46,    66,
     110,    31,   110,   113,   110,   111,   112,    15,    80,    81,
      47,   110,    41,    67,   112,    19,    32,   110,    81,     3,
       4,     5,     7,    10,    13,    15,    31,    42,    44,    51,
      52,    56,    57,    58,    59,    82,    85,    86,    87,    88,
      89,    90,    91,    97,   100,   101,   102,   104,   105,   106,
     107,   108,   109,   110,   114,   115,   116,   117,   118,    15,
      98,    99,   106,   107,   110,     8,     9,    31,    54,    55,
      95,    96,   106,   107,   110,    95,    31,    46,   106,   107,
     108,    85,   105,    82,   106,    31,    31,    82,   108,   109,
     109,    96,    13,    86,    19,    24,    62,    24,    62,    36,
      37,    38,    39,    40,    41,    43,    18,    20,    21,    22,
      23,    65,    19,    95,   107,    96,    96,    11,    33,    34,
      25,    26,    27,    28,    29,    30,    11,    83,    84,   109,
     109,    32,    32,    19,    24,    83,   108,    60,   119,   120,
      15,    51,   105,   106,    82,    82,   103,   106,   107,   110,
     103,   103,   103,   103,   103,   103,    15,   109,   109,   109,
     109,   109,   109,    99,    32,    13,    85,    95,    95,    96,
      96,    96,    96,    96,    96,    63,    85,    92,    93,    19,
      32,    47,    95,   103,    32,    96,    61,   120,    31,    13,
      95,    92,    12,    93,    94,    84,    19,    64,    11,    13,
      85,    83,    11,    94,    85,    13,    85,    96,    85,    13,
      32,    85,    13,    11,    19,    13,    85,   109,    13,    11,
      13,    85,    13
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315,   316,   317,   318,   319,   320,   321,   322
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    68,    69,    70,    70,    70,    71,    71,    71,    72,
      73,    73,    73,    74,    75,    75,    75,    76,    76,    76,
      77,    78,    78,    78,    79,    79,    80,    80,    80,    81,
      82,    82,    82,    83,    83,    83,    84,    85,    85,    86,
      86,    86,    86,    86,    86,    86,    86,    86,    86,    86,
      86,    86,    86,    86,    87,    88,    88,    89,    89,    90,
      90,    91,    91,    92,    92,    92,    93,    93,    94,    94,
      94,    95,    95,    95,    95,    95,    95,    95,    95,    95,
      95,    95,    95,    95,    96,    96,    96,    97,    97,    98,
      98,    99,    99,    99,   100,   100,   101,   101,   102,   102,
     103,   103,   103,   104,   104,   104,   104,   104,   104,   105,
     105,   106,   106,   106,   106,   107,   107,   107,   108,   108,
     108,   108,   108,   108,   108,   109,   109,   109,   109,   110,
     110,   110,   110,   110,   110,   110,   110,   111,   111,   111,
     112,   113,   113,   113,   114,   115,   116,   117,   118,   118,
     119,   119,   120,   120
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     5,     0,     2,     2,     0,     1,     2,     2,
       0,     1,     2,     4,     0,     2,     1,     0,     1,     2,
       4,     0,     1,     2,     7,     6,     0,     3,     1,     1,
       4,     4,     6,     0,     3,     1,     1,     2,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     2,     9,     8,    11,    10,     5,
       4,     7,     6,     0,     2,     1,     4,     3,     0,     2,
       1,     3,     3,     3,     3,     3,     3,     3,     3,     3,
       1,     1,     2,     2,     1,     1,     1,     2,     1,     3,
       1,     1,     1,     1,     3,     3,     3,     3,     3,     1,
       1,     1,     1,     3,     3,     3,     3,     3,     2,     2,
       1,     1,     4,     1,     1,     3,     1,     1,     3,     3,
       3,     3,     3,     3,     3,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     3,     3,     0,     1,     2,
       3,     0,     1,     2,     1,     1,     2,     2,     6,     5,
       1,     2,     4,     3
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "VAR_BEGIN", "RETURN", "BREAK", "FUNC",
  "WHILE", "FTRUE", "FFALSE", "IF", "THEN", "ELSE", "END",
  "STRING_DEFINITION", "IDENTIFIER", "NUMBER", "SINGLE_LINE_COMMENT",
  "DIVIDE_MOD", "ARG_SPLITTER", "PLUS", "MINUS", "DIVIDE", "MULTIPLY",
  "ASSIGN", "MORE", "LESS", "MORE_OR_EQUAL", "LESS_OR_EQUAL", "EQUAL",
  "NOT_EQUAL", "OPEN_BRACKET", "CLOSE_BRACKET", "AND", "OR", "FKFLOAT",
  "PLUS_ASSIGN", "MINUS_ASSIGN", "DIVIDE_ASSIGN", "MULTIPLY_ASSIGN",
  "DIVIDE_MOD_ASSIGN", "COLON", "FOR", "INC", "FAKE", "FKUUID",
  "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "FCONST", "PACKAGE",
  "INCLUDE", "IDENTIFIER_DOT", "IDENTIFIER_POINTER", "STRUCT", "IS", "NOT",
  "CONTINUE", "YIELD", "SLEEP", "SWITCH", "CASE", "DEFAULT", "NEW_ASSIGN",
  "ELSEIF", "RIGHT_POINTER", "STRING_CAT", "OPEN_BIG_BRACKET",
  "CLOSE_BIG_BRACKET", "$accept", "program", "package_head",
  "include_head", "include_define", "struct_head", "struct_define",
  "struct_mem_declaration", "const_head", "const_define", "body",
  "function_declaration", "function_declaration_arguments", "arg",
  "function_call", "function_call_arguments", "arg_expr", "block", "stmt",
  "fake_call_stmt", "for_stmt", "for_loop_stmt", "while_stmt", "if_stmt",
  "elseif_stmt_list", "elseif_stmt", "else_stmt", "cmp", "cmp_value",
  "return_stmt", "return_value_list", "return_value", "assign_stmt",
  "multi_assign_stmt", "var_list", "assign_value", "math_assign_stmt",
  "var", "variable", "expr", "math_expr", "expr_value", "explicit_value",
  "const_map_list_value", "const_map_value", "const_array_list_value",
  "break", "continue", "sleep", "yield", "switch_stmt", "switch_case_list",
  "switch_case_define", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        69,     0,    -1,    70,    71,    73,    76,    78,    -1,    -1,
      49,    15,    -1,    49,    51,    -1,    -1,    72,    -1,    71,
      72,    -1,    50,    14,    -1,    -1,    74,    -1,    73,    74,
      -1,    53,    15,    75,    13,    -1,    -1,    75,    15,    -1,
      15,    -1,    -1,    77,    -1,    76,    77,    -1,    48,    15,
      24,   110,    -1,    -1,    79,    -1,    78,    79,    -1,     6,
      15,    31,    80,    32,    85,    13,    -1,     6,    15,    31,
      80,    32,    13,    -1,    -1,    80,    19,    81,    -1,    81,
      -1,    15,    -1,    15,    31,    83,    32,    -1,    51,    31,
      83,    32,    -1,   106,    41,    15,    31,    83,    32,    -1,
      -1,    83,    19,    84,    -1,    84,    -1,   109,    -1,    85,
      86,    -1,    86,    -1,    90,    -1,    91,    -1,    97,    -1,
     100,    -1,   101,    -1,   114,    -1,   115,    -1,   107,    -1,
     104,    -1,    88,    -1,    89,    -1,    87,    -1,   116,    -1,
     117,    -1,   118,    -1,    44,    82,    -1,    42,    85,    19,
      95,    19,    85,    11,    85,    13,    -1,    42,    85,    19,
      95,    19,    85,    11,    13,    -1,    42,   105,    24,   103,
      64,    96,    19,   109,    11,    85,    13,    -1,    42,   105,
      24,   103,    64,    96,    19,   109,    11,    13,    -1,     7,
      95,    11,    85,    13,    -1,     7,    95,    11,    13,    -1,
      10,    95,    11,    85,    92,    94,    13,    -1,    10,    95,
      11,    92,    94,    13,    -1,    -1,    92,    93,    -1,    93,
      -1,    63,    95,    11,    85,    -1,    63,    95,    11,    -1,
      -1,    12,    85,    -1,    12,    -1,    31,    95,    32,    -1,
      95,    33,    95,    -1,    95,    34,    95,    -1,    96,    26,
      96,    -1,    96,    25,    96,    -1,    96,    29,    96,    -1,
      96,    27,    96,    -1,    96,    28,    96,    -1,    96,    30,
      96,    -1,     8,    -1,     9,    -1,    54,    96,    -1,    55,
      96,    -1,   110,    -1,   106,    -1,   107,    -1,     4,    98,
      -1,     4,    -1,    98,    19,    99,    -1,    99,    -1,   110,
      -1,   106,    -1,   107,    -1,   105,    24,   103,    -1,   105,
      62,   103,    -1,   102,    24,    82,    -1,   102,    62,    82,
      -1,   102,    19,   105,    -1,   105,    -1,   110,    -1,   106,
      -1,   107,    -1,   106,    36,   103,    -1,   106,    37,   103,
      -1,   106,    38,   103,    -1,   106,    39,   103,    -1,   106,
      40,   103,    -1,   106,    43,    -1,     3,    15,    -1,   106,
      -1,    15,    -1,    15,    46,   109,    47,    -1,    52,    -1,
      51,    -1,    31,   107,    32,    -1,    82,    -1,   108,    -1,
      31,   108,    32,    -1,   109,    20,   109,    -1,   109,    21,
     109,    -1,   109,    23,   109,    -1,   109,    22,   109,    -1,
     109,    18,   109,    -1,   109,    65,   109,    -1,   108,    -1,
     110,    -1,    82,    -1,   106,    -1,     8,    -1,     9,    -1,
      16,    -1,    45,    -1,    14,    -1,    35,    -1,    66,   111,
      67,    -1,    46,   113,    47,    -1,    -1,   112,    -1,   111,
     112,    -1,   110,    41,   110,    -1,    -1,   110,    -1,   113,
     110,    -1,     5,    -1,    56,    -1,    58,   109,    -1,    57,
     109,    -1,    59,    96,   119,    61,    85,    13,    -1,    59,
      96,   119,    61,    13,    -1,   120,    -1,   119,   120,    -1,
      60,    96,    11,    85,    -1,    60,    96,    11,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     9,    10,    13,    16,    17,    19,    22,
      25,    26,    28,    31,    36,    37,    40,    42,    43,    45,
      48,    53,    54,    56,    59,    67,    74,    75,    79,    81,
      83,    88,    93,   100,   101,   105,   107,   109,   112,   114,
     116,   118,   120,   122,   124,   126,   128,   130,   132,   134,
     136,   138,   140,   142,   144,   147,   157,   166,   178,   189,
     195,   200,   208,   215,   216,   219,   221,   226,   230,   231,
     234,   236,   240,   244,   248,   252,   256,   260,   264,   268,
     272,   274,   276,   279,   282,   284,   286,   288,   291,   293,
     297,   299,   301,   303,   305,   309,   313,   317,   321,   325,
     327,   329,   331,   333,   337,   341,   345,   349,   353,   356,
     359,   361,   363,   368,   370,   372,   376,   378,   380,   384,
     388,   392,   396,   400,   404,   408,   410,   412,   414,   416,
     418,   420,   422,   424,   426,   428,   432,   436,   437,   439,
     442,   446,   447,   449,   452,   454,   456,   459,   462,   469,
     475,   477,   480,   485
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   142,   142,   151,   154,   161,   170,   173,   175,   179,
     189,   192,   194,   198,   209,   213,   222,   233,   236,   238,
     242,   252,   255,   257,   263,   275,   290,   294,   303,   313,
     323,   334,   345,   365,   369,   378,   388,   398,   407,   417,
     423,   429,   435,   441,   447,   453,   459,   465,   471,   477,
     483,   489,   495,   501,   509,   519,   530,   543,   555,   569,
     578,   589,   600,   614,   618,   627,   637,   646,   658,   662,
     670,   680,   686,   696,   706,   716,   726,   736,   746,   756,
     766,   776,   786,   796,   808,   814,   820,   828,   836,   846,
     855,   864,   870,   876,   884,   894,   906,   916,   928,   937,
     946,   952,   958,   966,   976,   986,   996,  1006,  1016,  1032,
    1040,  1048,  1056,  1065,  1073,  1083,  1089,  1095,  1103,  1109,
    1119,  1129,  1139,  1149,  1159,  1171,  1177,  1183,  1189,  1197,
    1206,  1215,  1224,  1233,  1242,  1251,  1261,  1274,  1280,  1288,
    1299,  1311,  1317,  1325,  1336,  1345,  1354,  1363,  1373,  1383,
    1395,  1403,  1414,  1423
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))), 
		       yystack.locationAt (yynrhs-(yyi + 1)));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      65,    66,    67
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 1181;
  private static final int yynnts_ = 53;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 6;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 68;

  private static final int yyuser_token_number_max_ = 322;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}


