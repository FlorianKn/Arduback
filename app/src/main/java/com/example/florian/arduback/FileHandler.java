package com.example.florian.arduback;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import android.os.Environment;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;
import static android.content.Context.SYSTEM_HEALTH_SERVICE;

/**
 * Created by Florian on 26.11.2018.
 */

public class FileHandler {
    private Context ctx;
    private String filepath = "";
    File myExternalFile;

    public void init(Context mContext) {
        this.ctx = mContext;
    }

    public FileHandler() {

    }
}

    /*public void readFile() {

        StringBuilder text = new StringBuilder();
        ArrayList<String> content = new ArrayList<String>();

        try {
            File file = new File(filepath ,"history");
            FileInputStream inputStream = new FileInputStream(file);

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";


                while ((content = inputStreamReader.read()) != -1) {
                    // convert to char and display it
                    System.out.print((char) content);
                };
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File(filepath ,"history");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                content.add(line);
            }
            br.close();
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }
        System.out.println(content.l);
    }




}*/

