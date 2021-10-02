package logica;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class AnalizadorLexico {
    
    public static void main(String[] args) throws Exception {
        
        String caminoJFLEX= "../AnalizadorLexico_SC/src/logica/Lexico.flex";
        String caminoJCUP= "../AnalizadorLexico_SC/src/logica/LexicoCup.flex";
        String[] caminoSCUP= {"-parser","Sintax","../AnalizadorLexico_SC/src/logica/Sintax.cup"};
        generarLex(caminoJFLEX, caminoJCUP, caminoSCUP);
    }
    public static void generarLex(String caminoJFLEX, String caminoJCUP, String[] caminoSCUP) throws IOException, Exception {
        File arc; 
        arc = new File(caminoJFLEX);
        JFlex.Main.generate(arc);
        arc = new File(caminoJCUP);
        JFlex.Main.generate(arc);
        java_cup.Main.main(caminoSCUP);     
        
        Path caminoSym = Paths.get("../AnalizadorLexico_SC/src/logica/sym.java");
        if (Files.exists(caminoSym)) {
            Files.delete(caminoSym);
        }
        Files.move(
                Paths.get("../AnalizadorLexico_SC/sym.java"), 
                Paths.get("../AnalizadorLexico_SC/src/logica/sym.java")
        );
        Path caminoSint = Paths.get("../AnalizadorLexico_SC/src/logica/Sintax.java");
        if (Files.exists(caminoSint)) {
            Files.delete(caminoSint);
        }
        Files.move(
                Paths.get("../AnalizadorLexico_SC/Sintax.java"), 
                Paths.get("../AnalizadorLexico_SC/src/logica/Sintax.java")
        );        
    }
}
