package com.percipio.simple;

import java.io.IOException;

import java.io.*;
public class CreatePDF {

	

	public class BlankPDF {
	    public static void main(String[] args) {
	        PDDocument doc = null;
	        try{
	            doc = new PDDocument();
	        } catch (IOException ie){
	            System.out.println(ie);
	        }
	        doc.addPage(new PDPage());
	        try{
	            doc.save("Empty PDF.pdf");
	            doc.close();
	        } catch (Exception io){
	            System.out.println(io);
	        }
	    }
	}
	
}
