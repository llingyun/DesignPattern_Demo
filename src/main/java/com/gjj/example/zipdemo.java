package com.gjj.example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.apache.tika.Tika;

public class zipdemo {
	static final int BUFFER = 2048;
    public static void main (String argv[]) {
    	try {
			BufferedOutputStream dest = null;
			BufferedInputStream is = null;
			InputStream in = new FileInputStream("d:/12.zip");
			ZipEntry entry;
			ZipInputStream zis = new ZipInputStream(in);
			while ((entry = zis.getNextEntry()) != null) {
				System.out.println(entry.getName());
				 String name = entry.getName(); 
				 Tika ka = new Tika();
				 ka.parseToString(zis);
		             System.out.println(zis); 
		             System.out.println("------------");
		       }	
			dest.flush();
			dest.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

       
    }

}
