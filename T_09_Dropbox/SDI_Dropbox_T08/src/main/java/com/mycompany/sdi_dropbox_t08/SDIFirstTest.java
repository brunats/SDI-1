/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanyodl3.sdibeansdb;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.*;
import com.dropbox.core.v2.users.FullAccount;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SDIFirstTest {    
    private static final String ACCESS_TOKEN = "S5qD3HLfptkAAAAAAAAFAs5onbHxjeWsTpIqQRV8CMq7b8HI-GfiXncSFhp_Y3Qn";
    
    private static final String name_Arq_Up = "/teste.txt";
    private static final String adress_Arq_Up = "/home/bruna/NetBeansProjects/SDIBeansDB/teste.txt";
    
    private static final String name_Dir = "/pastaTeste";
    private static String quota = "";
    
    private static final String adress_Arq_Down = "/home/bruna/NetBeansProjects/SDIBeansDB/baixadooooo.txt";
    
    
    public static void main(String args[]) throws DbxException, IOException {
        // Create Dropbox client
        DbxRequestConfig config = new DbxRequestConfig("dropbox/java-tutorial", "en_US");
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        // Get current account info
        FullAccount account = client.users().getCurrentAccount();
        System.out.println(account.getName().getDisplayName());

        System.out.println("testando criar arquivo");
            enviarArquivo(name_Arq_Up, adress_Arq_Up, client);
        System.out.println("testando criar diretorio");
            criaDiretorio(name_Dir, client);
        System.out.println("testando quota");
            quota = quotaClient(client);
            System.out.println(quota);
        System.out.println("testando download arquivo");
            receberArquivo("/testeD.txt",client);
        
    }
    
    private static void enviarArquivo(String arq, String end, DbxClientV2 client) throws DbxException, IOException{
        // Get files and folder metadata from Dropbox root directory
        ListFolderResult result = client.files().listFolder("");
        while (true) {
            for (Metadata metadata : result.getEntries()) {
                System.out.println(metadata.getPathLower());
            }

            if (!result.getHasMore()) {
                break;
            }

            result = client.files().listFolderContinue(result.getCursor());
        }

        // Upload "test.txt" to Dropbox
        try (InputStream in = new FileInputStream(end)) {
            FileMetadata metadata = client.files().uploadBuilder(arq)
                .uploadAndFinish(in);
        }
    }
    
    private static void criaDiretorio(String n_Dir, DbxClientV2 client) throws DbxException, IOException{
        FolderMetadata createFolder;
        createFolder = client.files().createFolder(n_Dir);
    }
    
    private static String quotaClient(DbxClientV2 client) throws DbxException{
        quota = client.users().getSpaceUsage().toStringMultiline();
        return quota;
    }
    
    private static void receberArquivo(String path, DbxClientV2 client) throws DbxException, IllegalArgumentException{
        try{//output file for download --> storage location on local system to download file
                OutputStream downloadFile = new FileOutputStream(adress_Arq_Down);
                try{
                    FileMetadata metadata = client.files().downloadBuilder(path)
                        .download(downloadFile);
                }
                finally{
                    downloadFile.close();
                }
            }//exception handled
        
            catch (DbxException | IOException e){//error downloading file
               System.out.println("Unable to download file to local system\n Error: " + e);
            }
        //error downloading file

    }
    
    
}

