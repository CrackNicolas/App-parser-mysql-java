package Modelo;
import java_cup.runtime.Symbol;

%%
%class Lexer_cup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }
    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
    }
%}
%%
insert {return new Symbol(sym.Insert,yychar,yyline,yytext());} 
into {return new Symbol(sym.Into,yychar,yyline,yytext());}
select {return new Symbol(sym.Select,yychar,yyline,yytext());}
from {return new Symbol(sym.From,yychar,yyline,yytext());}
update {return new Symbol(sym.Update,yychar,yyline,yytext());}
delete {return new Symbol(sym.Delete,yychar,yyline,yytext());}
show {return new Symbol(sym.Show,yychar,yyline,yytext());}
use {return new Symbol(sym.Use,yychar,yyline,yytext());}
and {return new Symbol(sym.And,yychar,yyline,yytext());}
or {return new Symbol(sym.Or,yychar,yyline,yytext());}
values {return new Symbol(sym.Values,yychar,yyline,yytext());}
where {return new Symbol(sym.Where,yychar,yyline,yytext());}
set {return new Symbol(sym.Set,yychar,yyline,yytext());}

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return new Symbol(sym.Igual,yychar,yyline,yytext());}
"+" {return new Symbol(sym.Suma,yychar,yyline,yytext());}
"-" {return new Symbol(sym.Resta,yychar,yyline,yytext());}
"*" {return new Symbol(sym.Multiplicacion,yychar,yyline,yytext());}
"/" {return new Symbol(sym.Division,yychar,yyline,yytext());}
"(" {return new Symbol(sym.Parentesis_a,yychar,yyline,yytext());}
")" {return new Symbol(sym.Parentesis_c,yychar,yyline,yytext());}
"{" {return new Symbol(sym.Llave_a,yychar,yyline,yytext());}
"}" {return new Symbol(sym.Llave_c,yychar,yyline,yytext());}
";" {return new Symbol(sym.P_coma,yychar,yyline,yytext());}
"'" {return new Symbol(sym.ComSimp,yychar,yyline,yytext());}
">" {return new Symbol(sym.Mayor,yychar,yyline,yytext());}
"<" {return new Symbol(sym.Menor,yychar,yyline,yytext());}
"<=" {return new Symbol(sym.MenI,yychar,yyline,yytext());}
">=" {return new Symbol(sym.MayI,yychar,yyline,yytext());}
"!=" {return new Symbol(sym.Distinto,yychar,yyline,yytext());}
"." {return new Symbol(sym.Punto,yychar,yyline,yytext());}

{L}({L}|{D})* {return new Symbol(sym.Identificador,yychar,yyline,yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero,yychar,yyline,yytext());}