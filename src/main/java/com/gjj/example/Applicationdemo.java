package com.gjj.example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import javax.servlet.http.HttpServletRequest;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class Applicationdemo {

	static final int BUFFER = 2048;

	/**
	 * @param args
	 */
	@SuppressWarnings({ "resource", "null" })
	public static void main(String[] args) {/*
		SpringApplication.run(Applicationdemo.class, args);
		try {
			InputStream is = null;
			ZipEntry entry;
			ZipFile zipfile = new ZipFile("d:/12.zip", codeString("d:/12.zip"));
			Enumeration e = zipfile.entries();
			while (e.hasMoreElements()) {
				entry = (ZipEntry) e.nextElement();
				String hh = entry.toString();
				System.out.println("Extracting: " + hh);
				is = new BufferedInputStream(zipfile.getInputStream(entry));
				Tika ka = new Tika();
				String content = null;
				content = ka.parseToString(is);
				System.out.println(content);
				System.out.println("------------");

			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	*/
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		Map<Integer, String> map = new HashMap<Integer, String>();
		list.stream().map(e -> map.put(e, "haha"));
		System.out.println(map.size());
		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
			System.out.println("shagsaaha");
		}
		/*Optional< String > firstName = Optional.of( "Tom" );
		System.out.println( "First Name is set? " + firstName.isPresent() );        
		System.out.println( "First Name: " + firstName.orElseGet( () -> "[none]" ) ); 
		System.out.println( firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
		System.out.println( firstName.filter(s -> s.equals("nihao")).orElse(null));
		System.out.println();*/
	}

	@SuppressWarnings("resource")
	public static Charset codeString(String path) throws IOException {
		File file = new File(path);
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file));
		int p = (bin.read() << 8) + bin.read();
		String code = null;

		switch (p) {
		case 0xefbb:
			code = "UTF-8";
			break;
		case 0xfffe:
			code = "Unicode";
			break;
		case 0xfeff:
			code = "UTF-16BE";
			break;
		default:
			code = "GBK";
		}

		return Charset.forName(code);
	}

}
