/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sdi_dropbox_t08;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.FolderMetadata;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SDIFirstTest {    
    
    private static final String ACCESS_TOKEN = "cAOcO6AuOGAAAAAAAAABiHFP5z4mOpd3pKHfuJ8q8xL2kep6FP50ATaILd70_zvb";
    
    
    public static void main(String args[]) throws DbxException, IOException {
        // Create Dropbox client
        DbxRequestConfig config;
        config = new DbxRequestConfig("dropbox/java-tutorial", "en_US");
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        // Get current account info
        FullAccount account = client.users().getCurrentAccount();
        System.out.println(account.getName().getDisplayName());

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
        try (InputStream in = new FileInputStream("/tmp/test.txt")) {
            FileMetadata metadata = client.files().uploadBuilder("/test.txt")
                .uploadAndFinish(in);
        }
        
        criarPasta("Teste", client);
    } 
    
    private static boolean criarPasta(String nomePasta, DbxClientV2 client) throws FileNotFoundException, IOException{
        
        FolderMetadata metadata = new client.files().
        
        
        return true;
    }
}
