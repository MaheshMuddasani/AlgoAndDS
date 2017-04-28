package com.ds.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class AnalyzeLogFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		
		(BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\muddm\\Documents\\SR\\SR-B40687\\logs\\500s\\localhost_access_log.2017-03-06.log")))) {
			
			FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\muddm\\Documents\\SR\\SR-B40687\\logs\\500s\\localhost_access_log.2017-03-06_modified.log"));
		    for(String line; (line = br.readLine()) != null; ) {
		        // process the line.
		    	if(line.contains(" HTTP/1.1 500 ")||line.contains(" HTTP/1.1 404 ")/*||line.indexOf("400")>0*/ ){
		    		System.out.println(line);
		    		line = line+"\n\n\n";
		    		fos.write(line.getBytes(), 0, line.getBytes().length);
		    	}
		    }
		    // line is not visible here.
		}
	try
		(FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\muddm\\Documents\\SR\\SR-B41889\\import.csv"))) {
			
		        // process the line.
		String msg = "Id" +","+"Name"+","+"Lastname"+","+"IsStudent"+"\n";
		for(int i=1;i<100;i++){
			String msg2 = i +","+("CGNE"+i*126)+","+("last"+i*345)+","+(i%2==0?"True":"dd")+"\n";
			if(i==1){
				fos.write(msg.getBytes(), 0, msg.getBytes().length);
			}else{
				fos.write(msg2.getBytes(), 0, msg2.getBytes().length);
			}
			
		}
		}
		
		
	}

}
