/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author laboratorio
 */
public class BLArquivos {
    
    public static void escreverTexto(String pCaminhoArquivo, String pTextoAEscrever){
            
        try(
                
                FileWriter criadorDeArquivos = new FileWriter(pCaminhoArquivo+".txt", true);
                BufferedWriter buffer = new BufferedWriter(criadorDeArquivos);
                PrintWriter escritorDeArquivos = new PrintWriter(buffer);
                
                ){
            
            escritorDeArquivos.append(pTextoAEscrever);
            
        }catch(IOException e){
            e.printStackTrace();
        }
                
    }
    public static void escreverTexto(String pCaminhoArquivo){
            
        try(
                
                FileWriter criadorDeArquivos = new FileWriter(pCaminhoArquivo+".txt", true);
                BufferedWriter buffer = new BufferedWriter(criadorDeArquivos);
                PrintWriter escritorDeArquivos = new PrintWriter(buffer);
                
                ){
            
            escritorDeArquivos.append(pCaminhoArquivo);
            
        }catch(IOException e){
            e.printStackTrace();
        }
                
    }
}
    

