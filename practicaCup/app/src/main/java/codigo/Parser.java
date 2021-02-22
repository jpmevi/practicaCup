
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import java.util.List;
import Forma.Error;
import Forma.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\003\000\002\002" +
    "\003\000\002\002\002\000\002\007\004\000\002\003\015" +
    "\000\002\003\015\000\002\003\017\000\002\003\017\000" +
    "\002\003\021\000\002\003\003\000\002\010\005\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\010" +
    "\003\000\002\010\005\000\002\011\002\000\002\010\005" +
    "\000\002\004\003\000\002\004\003\000\002\004\002\000" +
    "\002\005\016\000\002\005\003\000\002\006\003\000\002" +
    "\006\003\000\002\006\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\145\000\010\002\ufffe\003\005\016\006\001\002\000" +
    "\004\002\000\001\002\000\004\002\uffff\001\002\000\016" +
    "\003\013\005\011\006\017\007\015\010\014\011\012\001" +
    "\002\000\004\002\010\001\002\000\004\002\001\001\002" +
    "\000\004\023\136\001\002\000\004\023\124\001\002\000" +
    "\020\002\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7\024\ufff7" +
    "\025\ufff7\001\002\000\004\023\106\001\002\000\004\023" +
    "\072\001\002\000\020\002\ufffd\017\ufffd\020\ufffd\021\ufffd" +
    "\022\ufffd\024\ufffd\025\ufffd\001\002\000\004\023\020\001" +
    "\002\000\010\003\023\023\022\026\021\001\002\000\016" +
    "\017\ufff2\020\ufff2\021\ufff2\022\ufff2\024\ufff2\025\ufff2\001" +
    "\002\000\010\003\023\023\022\026\021\001\002\000\004" +
    "\016\ufff0\001\002\000\014\017\030\020\026\021\031\022" +
    "\025\025\027\001\002\000\010\003\023\023\022\026\021" +
    "\001\002\000\010\003\023\023\022\026\021\001\002\000" +
    "\010\003\023\023\022\026\021\001\002\000\010\003\023" +
    "\023\022\026\021\001\002\000\010\003\023\023\022\026" +
    "\021\001\002\000\016\017\ufff4\020\ufff4\021\ufff4\022\ufff4" +
    "\024\ufff4\025\ufff4\001\002\000\016\017\ufff6\020\ufff6\021" +
    "\031\022\025\024\ufff6\025\ufff6\001\002\000\014\017\030" +
    "\020\026\021\031\022\025\025\035\001\002\000\010\003" +
    "\023\023\022\026\021\001\002\000\014\017\030\020\026" +
    "\021\031\022\025\025\037\001\002\000\010\003\023\023" +
    "\022\026\021\001\002\000\014\017\030\020\026\021\031" +
    "\022\025\025\041\001\002\000\004\004\042\001\002\000" +
    "\004\024\043\001\002\000\026\002\uffec\003\047\013\046" +
    "\016\006\017\uffec\020\uffec\021\uffec\022\uffec\024\uffec\025" +
    "\uffec\001\002\000\020\002\uffed\017\uffed\020\uffed\021\uffed" +
    "\022\uffed\024\uffed\025\uffed\001\002\000\020\002\uffee\017" +
    "\uffee\020\uffee\021\uffee\022\uffee\024\uffee\025\uffee\001\002" +
    "\000\004\014\051\001\002\000\020\002\uffea\017\uffea\020" +
    "\uffea\021\uffea\022\uffea\024\uffea\025\uffea\001\002\000\020" +
    "\002\ufffa\017\ufffa\020\ufffa\021\ufffa\022\ufffa\024\ufffa\025" +
    "\ufffa\001\002\000\004\015\052\001\002\000\004\023\053" +
    "\001\002\000\010\003\023\023\022\026\021\001\002\000" +
    "\014\017\030\020\026\021\031\022\025\025\055\001\002" +
    "\000\010\003\023\023\022\026\021\001\002\000\014\017" +
    "\030\020\026\021\031\022\025\025\057\001\002\000\010" +
    "\003\023\023\022\026\021\001\002\000\014\017\030\020" +
    "\026\021\031\022\025\025\061\001\002\000\010\003\023" +
    "\023\022\026\021\001\002\000\014\017\030\020\026\021" +
    "\031\022\025\024\063\001\002\000\020\002\uffeb\017\uffeb" +
    "\020\uffeb\021\uffeb\022\uffeb\024\uffeb\025\uffeb\001\002\000" +
    "\016\017\ufff5\020\ufff5\021\031\022\025\024\ufff5\025\ufff5" +
    "\001\002\000\016\017\ufff3\020\ufff3\021\ufff3\022\ufff3\024" +
    "\ufff3\025\ufff3\001\002\000\004\016\006\001\002\000\016" +
    "\017\uffef\020\uffef\021\uffef\022\uffef\024\uffef\025\uffef\001" +
    "\002\000\014\017\030\020\026\021\031\022\025\024\071" +
    "\001\002\000\016\017\ufff1\020\ufff1\021\ufff1\022\ufff1\024" +
    "\ufff1\025\ufff1\001\002\000\010\003\023\023\022\026\021" +
    "\001\002\000\014\017\030\020\026\021\031\022\025\025" +
    "\074\001\002\000\010\003\023\023\022\026\021\001\002" +
    "\000\014\017\030\020\026\021\031\022\025\025\076\001" +
    "\002\000\010\003\023\023\022\026\021\001\002\000\014" +
    "\017\030\020\026\021\031\022\025\025\100\001\002\000" +
    "\010\003\023\023\022\026\021\001\002\000\014\017\030" +
    "\020\026\021\031\022\025\025\102\001\002\000\004\004" +
    "\103\001\002\000\004\024\104\001\002\000\026\002\uffec" +
    "\003\047\013\046\016\006\017\uffec\020\uffec\021\uffec\022" +
    "\uffec\024\uffec\025\uffec\001\002\000\020\002\ufff9\017\ufff9" +
    "\020\ufff9\021\ufff9\022\ufff9\024\ufff9\025\ufff9\001\002\000" +
    "\010\003\023\023\022\026\021\001\002\000\014\017\030" +
    "\020\026\021\031\022\025\025\110\001\002\000\010\003" +
    "\023\023\022\026\021\001\002\000\014\017\030\020\026" +
    "\021\031\022\025\025\112\001\002\000\010\003\023\023" +
    "\022\026\021\001\002\000\014\017\030\020\026\021\031" +
    "\022\025\025\114\001\002\000\010\003\023\023\022\026" +
    "\021\001\002\000\014\017\030\020\026\021\031\022\025" +
    "\025\116\001\002\000\010\003\023\023\022\026\021\001" +
    "\002\000\014\017\030\020\026\021\031\022\025\025\120" +
    "\001\002\000\004\004\121\001\002\000\004\024\122\001" +
    "\002\000\026\002\uffec\003\047\013\046\016\006\017\uffec" +
    "\020\uffec\021\uffec\022\uffec\024\uffec\025\uffec\001\002\000" +
    "\020\002\ufff8\017\ufff8\020\ufff8\021\ufff8\022\ufff8\024\ufff8" +
    "\025\ufff8\001\002\000\010\003\023\023\022\026\021\001" +
    "\002\000\014\017\030\020\026\021\031\022\025\025\126" +
    "\001\002\000\010\003\023\023\022\026\021\001\002\000" +
    "\014\017\030\020\026\021\031\022\025\025\130\001\002" +
    "\000\010\003\023\023\022\026\021\001\002\000\014\017" +
    "\030\020\026\021\031\022\025\025\132\001\002\000\004" +
    "\004\133\001\002\000\004\024\134\001\002\000\026\002" +
    "\uffec\003\047\013\046\016\006\017\uffec\020\uffec\021\uffec" +
    "\022\uffec\024\uffec\025\uffec\001\002\000\020\002\ufffb\017" +
    "\ufffb\020\ufffb\021\ufffb\022\ufffb\024\ufffb\025\ufffb\001\002" +
    "\000\010\003\023\023\022\026\021\001\002\000\014\017" +
    "\030\020\026\021\031\022\025\025\140\001\002\000\010" +
    "\003\023\023\022\026\021\001\002\000\014\017\030\020" +
    "\026\021\031\022\025\025\142\001\002\000\010\003\023" +
    "\023\022\026\021\001\002\000\014\017\030\020\026\021" +
    "\031\022\025\025\144\001\002\000\004\004\145\001\002" +
    "\000\004\024\146\001\002\000\026\002\uffec\003\047\013" +
    "\046\016\006\017\uffec\020\uffec\021\uffec\022\uffec\024\uffec" +
    "\025\uffec\001\002\000\020\002\ufffc\017\ufffc\020\ufffc\021" +
    "\ufffc\022\ufffc\024\ufffc\025\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\145\000\006\002\006\007\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\023\001" +
    "\001\000\002\001\001\000\004\010\067\001\001\000\004" +
    "\011\065\001\001\000\002\001\001\000\004\010\064\001" +
    "\001\000\004\010\063\001\001\000\004\010\033\001\001" +
    "\000\004\010\032\001\001\000\004\010\031\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\035\001\001\000\002\001\001\000\004\010\037\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\047\005\043\007\044\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\053\001\001\000\002\001\001\000\004\010\055" +
    "\001\001\000\002\001\001\000\004\010\057\001\001\000" +
    "\002\001\001\000\004\010\061\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\066\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\072\001\001\000\002\001" +
    "\001\000\004\010\074\001\001\000\002\001\001\000\004" +
    "\010\076\001\001\000\002\001\001\000\004\010\100\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\104\005\043\007\044\001\001\000\002\001" +
    "\001\000\004\010\106\001\001\000\002\001\001\000\004" +
    "\010\110\001\001\000\002\001\001\000\004\010\112\001" +
    "\001\000\002\001\001\000\004\010\114\001\001\000\002" +
    "\001\001\000\004\010\116\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\004\122\005\043" +
    "\007\044\001\001\000\002\001\001\000\004\010\124\001" +
    "\001\000\002\001\001\000\004\010\126\001\001\000\002" +
    "\001\001\000\004\010\130\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\004\134\005\043" +
    "\007\044\001\001\000\002\001\001\000\004\010\136\001" +
    "\001\000\002\001\001\000\004\010\140\001\001\000\002" +
    "\001\001\000\004\010\142\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\004\146\005\043" +
    "\007\044\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private ArrayList<Formas> listaFormas= new ArrayList<Formas>();
    private ArrayList<Error> errorsList= new ArrayList<Error>();
    private ArrayList<Operador> listaOperadores= new ArrayList<Operador>();
    public Parser(LexerCup lex) {
        super(lex);
        this.errorsList = new ArrayList();
    }
    @Override
        public void syntax_error(Symbol st) {
            Token token = (Token) st.value;
              List<Integer> lista=expected_token_ids();
            report_error("Error Sintactico con el  Token:"+ token.getLexeme()+" este no pertenece a la estructura - linea: "+token.getLine()+" - columna: "+token.getColumn() + "\n",null);

            System.out.println("Error Sintactico con el Token: " + token.getLexeme() + " este no pertenece a la estructura - linea: " + token.getLine() + ", columna: " + token.getColumn());
           Error error = new Error(token.getLexeme(),token.getLine(),token.getColumn(),lista.get(0));
                       errorsList.add(error);
        }
@Override
    public List<Integer> expected_token_ids() {
        return super.expected_token_ids();
    }

        //retorna list de errores sintacticos
        public ArrayList<Error> getErrorsList(){
            return errorsList
            ;
        }

    //retorna list de formas
        public ArrayList getListaFormas(){
            return listaFormas;
        }
//retorna list de Operadores
        public ArrayList getListaOperadores(){
            return listaOperadores;
        }

    public void addListaFormas(Formas forma){
            try {
                 listaFormas.add(forma);
                }
            catch(Exception e) {
                System.out.println("error encontradoo: "+e);
                }
        }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= GRAFICAR 
            {
              Object RESULT =null;
		
            System.out.println("Encontro graficar");
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= error 
            {
              Object RESULT =null;
		
            System.out.println("Error en INICIO");
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // GRAFICAR ::= graficar FORMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("GRAFICAR",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // FORMA ::= circulo Parentesis_a OPERACION coma OPERACION coma OPERACION coma T_color Parentesis_c SIGUIENTE 
            {
              Object RESULT =null;
		int no1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int no1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer no1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int no2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int no2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer no2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int no3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int no3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer no3 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 Circulo circulo = new Circulo(no1.intValue(), no2.intValue(), color.getLexeme(), "circulo", no3.intValue()) ;
    addListaFormas(circulo);  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // FORMA ::= cuadrado Parentesis_a OPERACION coma OPERACION coma OPERACION coma T_color Parentesis_c SIGUIENTE 
            {
              Object RESULT =null;
		int no1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int no1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer no1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int no2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int no2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer no2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int no3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int no3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer no3 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 Cuadrado cuadrado = new Cuadrado(no1.intValue(), no2.intValue(), color.getLexeme(), "cuadrado", no3.intValue()) ;
    addListaFormas(cuadrado);  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // FORMA ::= rectangulo Parentesis_a OPERACION coma OPERACION coma OPERACION coma OPERACION coma T_color Parentesis_c SIGUIENTE 
            {
              Object RESULT =null;
		int no1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).left;
		int no1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).right;
		Integer no1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-10)).value;
		int no2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int no2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer no2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int no3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int no3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer no3 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int no4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int no4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer no4 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 Rectangulo rectangulo = new Rectangulo(no1.intValue(), no2.intValue(), color.getLexeme(), "rectangulo", no3.intValue(), no4.intValue()) ; 
    addListaFormas(rectangulo); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // FORMA ::= linea Parentesis_a OPERACION coma OPERACION coma OPERACION coma OPERACION coma T_color Parentesis_c SIGUIENTE 
            {
              Object RESULT =null;
		int no1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).left;
		int no1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).right;
		Integer no1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-10)).value;
		int no2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int no2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer no2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int no3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int no3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer no3 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int no4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int no4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer no4 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 Linea linea = new Linea(no1.intValue(), no2.intValue(), no3.intValue(), no4.intValue(), color.getLexeme(), "linea") ; 
    addListaFormas(linea);  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // FORMA ::= poligono Parentesis_a OPERACION coma OPERACION coma OPERACION coma OPERACION coma OPERACION coma T_color Parentesis_c SIGUIENTE 
            {
              Object RESULT =null;
		int no1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)).left;
		int no1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)).right;
		Integer no1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-12)).value;
		int no2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).left;
		int no2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).right;
		Integer no2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-10)).value;
		int no3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int no3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer no3 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int no4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int no4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer no4 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int no5left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int no5right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer no5 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 Poligono poligono = new Poligono(no1.intValue(), no2.intValue(), no3.intValue(), no4.intValue(), no5.intValue(), color.getLexeme(), "poligono" ) ; 
    addListaFormas(poligono); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-14)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // FORMA ::= error 
            {
              Object RESULT =null;
		
            System.out.println("Error en FORMA");
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // OPERACION ::= OPERACION Suma OPERACION 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Token s1 = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 Operador operador = new Operador(s1.getLexeme(),s1.getLine(),s1.getColumn(),1,String.valueOf(e1.intValue()+" + "+e2.intValue()));
    listaOperadores.add(operador);
    RESULT = new Integer(e1.intValue()+e2.intValue());  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // OPERACION ::= OPERACION Resta OPERACION 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Token s1 = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 Operador operador = new Operador(s1.getLexeme(),s1.getLine(),s1.getColumn(),1,String.valueOf(e1.intValue()+" - "+e2.intValue()));
           listaOperadores.add(operador);
    RESULT = new Integer(e1.intValue()-e2.intValue());  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // OPERACION ::= OPERACION Multiplicacion OPERACION 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Token s1 = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 Operador operador = new Operador(s1.getLexeme(),s1.getLine(),s1.getColumn(),1,String.valueOf(e1.intValue()+" * "+e2.intValue()));
           listaOperadores.add(operador);
    RESULT = new Integer(e1.intValue()*e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // OPERACION ::= OPERACION Division OPERACION 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Token s1 = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 Operador operador = new Operador(s1.getLexeme(),s1.getLine(),s1.getColumn(),1,String.valueOf(e1.intValue()+" / "+e2.intValue()));
           listaOperadores.add(operador);
    RESULT = new Integer(e1.intValue()/e2.intValue());  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OPERACION ::= Numero 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token n = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Integer.valueOf( n.getLexeme());  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OPERACION ::= Parentesis_a OPERACION Parentesis_c 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 
     RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // NT$0 ::= 
            {
              Integer RESULT =null;

            System.out.println("Error en OPERACION");
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NT$0",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // OPERACION ::= error NT$0 GRAFICAR 
            {
              Integer RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Integer) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SIGUIENTE ::= GRAFICAR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIGUIENTE",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SIGUIENTE ::= ANIMAR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIGUIENTE",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SIGUIENTE ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIGUIENTE",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // ANIMAR ::= animar objeto anterior Parentesis_a OPERACION coma OPERACION coma OPERACION coma OPERACION Parentesis_c 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ANIMAR",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-11)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // ANIMAR ::= error 
            {
              Object RESULT =null;
		
            System.out.println("Error en ANIMAR");
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ANIMAR",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ANIMACION ::= linea 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ANIMACION",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ANIMACION ::= curva 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ANIMACION",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // ANIMACION ::= error 
            {
              Object RESULT =null;
		
            System.out.println("Error en ANIMACION");
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ANIMACION",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
