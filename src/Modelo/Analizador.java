package Modelo;

import java.awt.Color;
import java.io.StringReader;
import java_cup.runtime.Symbol;
import javax.swing.JTextArea;

public class Analizador {
    public static void Sintactico(String entrada, JTextArea respuesta){
        Sintax sintaxis = new Sintax(new Lexer_cup(new StringReader(entrada.toLowerCase())));
        try{
            sintaxis.parse();
            respuesta.setText("Analisis realizado correctamente");
            respuesta.setForeground(new Color(25,111,61));
        }catch(Exception ex){
            Symbol simbolo = sintaxis.getSim();
            respuesta.setText("Error de sintaxis. Linea: "+(simbolo.right+1)+ " Columna: "+(simbolo.left+1)+", Texto: \""+simbolo.value+"\"");
            respuesta.setForeground(Color.red);
        }
    }
    public static void Lexico(String entrada, JTextArea lexico) throws java.io.IOException{
        int cont=1;
        Lexer lexer = new Lexer(new StringReader(entrada));
        String resultado = "LINEA "+cont+"\t\t\tSIMBOLO\n";
        while(true){
            Tokens token = lexer.yylex();
            if(token==null){
                lexico.setText(resultado);
                return;
            }
            switch(token){
                case insert: case into: case select: case from: case update: case delete: case show:   case use: case and:    case or: case values: case where: case set:
                    cont++;
                    resultado += Reservadas(token,lexer.lexeme);
                break;
                case mayor: case menor: case distinto: case igual: case suma: case resta: case division: case multiplicacion:
                    cont++;
                    resultado += Operador(token,lexer.lexeme);
                    break;
                case Linea:
                    cont++;
                    resultado+="LINEA "+cont+"\n";
                break;
                case Numero:
                    cont++;
                    resultado+= "<Numero>\t\t\t"+lexer.lexeme+"\n";
                    break;
                case Identificador:
                    cont++;
                    resultado+= "<Identificador>\t\t"+lexer.lexeme+"\n";
                    break;
                
                case Parentesis_a:
                    cont++;
                    resultado+= "<Operador parentesis de apertura>\t"+lexer.lexeme+"\n";
                    break;
                case Parentesis_c:
                    cont++;
                    resultado+= "<Operador parentesis de cierre>\t"+lexer.lexeme+"\n";
                    break;
                case Llave_a:
                    cont++;
                    resultado+= "<Operador llave apertura>\t"+lexer.lexeme+"\n";
                    break;
                case Llave_c:
                    cont++;
                    resultado+= "<Operador llave cierre>\t"+lexer.lexeme+"\n";
                    break;
                case Punto:
                    cont++;
                    resultado+= "<Simbolo punto>\t\t"+lexer.lexeme+"\n";
                    break;
                case ComSimp:
                    cont++;
                    resultado+= "<Operador comilla simple>\t\t"+lexer.lexeme+"\n";
                    break;
                case P_coma:
                    cont++;
                    resultado+= "<Operador punto y coma>\t\t"+lexer.lexeme+"\n";
                    break;
                case MenI:
                    cont++;
                    resultado+= "<Operador menor o igual>\t\t"+lexer.lexeme+"\n";
                    break;
                case MayI:
                    cont++;
                    resultado+= "<Operador mayor o igual>\t\t"+lexer.lexeme+"\n";
                    break;
                case ERROR:
                    resultado+="<Simbolo no definido>\t\t\n";
                    break;
            }
        }
    }
    private static String Reservadas(Tokens token, String lexer){
        return "<Reservada "+token+">\t\t"+lexer+"\n";
    }
    private static String Operador(Tokens token, String lexer){
        return "<Operador "+token+">\t\t"+lexer+"\n";
    }
}