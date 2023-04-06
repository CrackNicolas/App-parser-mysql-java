package Modelo;
import static Modelo.Tokens.*;

%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
insert {lexeme=yytext(); return insert;} 
into {lexeme=yytext(); return into;}
select {lexeme=yytext(); return select;}
from {lexeme=yytext(); return from;}
update {lexeme=yytext(); return update;}
delete {lexeme=yytext(); return delete;}
show {lexeme=yytext(); return show;}
use {lexeme=yytext(); return use;}
and {lexeme=yytext(); return and;}
or {lexeme=yytext(); return or;}
values {lexeme=yytext(); return values;}
where {lexeme=yytext(); return where;}
set {lexeme=yytext(); return set;}

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"\n" {lexeme=yytext(); return Linea;}
"=" {lexeme=yytext(); return igual;}
"+" {lexeme=yytext(); return suma;}
"-" {lexeme=yytext(); return resta;}
"*" {lexeme=yytext(); return multiplicacion;}
"/" {lexeme=yytext(); return division;}
"(" {lexeme=yytext(); return Parentesis_a;}
")" {lexeme=yytext(); return Parentesis_c;}
"{" {lexeme=yytext(); return Llave_a;}
"}" {lexeme=yytext(); return Llave_c;}
";" {lexeme=yytext(); return P_coma;}
"'" {lexeme=yytext(); return ComSimp;}
">" {lexeme=yytext(); return mayor;}
"<" {lexeme=yytext(); return menor;}
"<=" {lexeme=yytext(); return MenI;}
">=" {lexeme=yytext(); return MayI;}
"!=" {lexeme=yytext(); return distinto;}
"." {lexeme=yytext(); return Punto;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}