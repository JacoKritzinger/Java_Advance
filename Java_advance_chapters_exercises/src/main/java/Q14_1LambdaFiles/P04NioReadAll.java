package Q14_1LambdaFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class P04NioReadAll {
    public static void main(String[] args) {
        
        List<String> fileArr;
        Path file =  Paths.get("hamlet.txt");

        try{
            fileArr = Files.readAllLines(file);
            
            System.out.println("\n=== Rosencrantz ===");
            fileArr.stream()
                .filter(line -> line.contains("Ros."))
                .forEach(line -> System.out.println(line));
            
            System.out.println("\n=== Guildenstern ===");
            fileArr.stream()
                .filter(line -> line.contains("Guil."))
                .forEach(line -> System.out.println(line));
            

        }catch (IOException e){
          System.out.println("Error: " + e.getMessage());
        }
    } 
}
