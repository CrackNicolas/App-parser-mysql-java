package Controlador;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Generar_rutas_necesarias {
    public static void generar(String raiz) throws Exception{
        String ruta_lexer = raiz + "Parser/src/Modelo/Lexer.flex";
        String ruta_lexer_cup = raiz + "Parser/src/Modelo/Lexer_cup.flex";       
        String [] ruta_sintax = {"-parser","Sintax",raiz + "Parser/src/Modelo/Sintax.cup"};
        
        JFlex.Main.generate(new File(ruta_lexer));
        JFlex.Main.generate(new File(ruta_lexer_cup));
        java_cup.Main.main(ruta_sintax);
        
        Path ruta_simbolos = Paths.get(raiz + "Parser/src/Modelo/sym.java");
        if(Files.exists(ruta_simbolos)){
            Files.delete(ruta_simbolos);
        }
        Files.move(
            Paths.get(raiz + "Parser/sym.java"),
            Paths.get(raiz + "Parser/src/Modelo/sym.java")   
        );
        Path ruta_sintaxi = Paths.get(raiz + "src/Modelo/Sintax.java");
        if(Files.exists(ruta_sintaxi)){
            Files.delete(ruta_sintaxi);
        }
        Files.move(
            Paths.get(raiz + "Parser/Sintax.java"),
            Paths.get(raiz + "Parser/src/Modelo/Sintax.java")   
        );
    }
}