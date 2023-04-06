package Controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;

public class Recibidor {
    private static final Vista.Recibidor vista = new Vista.Recibidor();
    
    public static void Vista_recibidor(boolean value){
        vista.setVisible(value);
    }
    public static void Analizador_lexico(){
        try{
            Modelo.Analizador.Lexico(vista.getEntrada().getText(),vista.getLexico());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void Analizador_sintactico(){
        Modelo.Analizador.Sintactico(vista.getEntrada().getText(),vista.getRespuesta());
    }
    public static void Abrir_file(){
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        try{
            vista.getEntrada().setText(new String(Files.readAllBytes(archivo.toPath())));
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}