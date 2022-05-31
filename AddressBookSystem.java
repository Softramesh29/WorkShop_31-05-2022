package com.bridgelabz.workshop_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class AddressBookSystem {
	public static void main(String [] args) {
		File file = new File("C:\\Users\\Ramesh\\Desktop\\AddressBookSystem\\AddressBookSystem.csv");
		try {
			boolean create = file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bWriter = new BufferedWriter(fileWriter);
			bWriter.write("First Name - Ramesh, ");
			bWriter.newLine();
			bWriter.write("Last Name - Ramasami, ");
			bWriter.newLine();
			bWriter.write("Address - Perambalur");
			bWriter.newLine();
			bWriter.write("City - S.Sduthurai");
			bWriter.newLine();
			bWriter.write("Zip - 621108");
			bWriter.newLine();
			bWriter.write("Phone Number - 9629789619");
			bWriter.newLine();
			bWriter.write("Email - softramesh29@gmail.com");
			bWriter.newLine();
			bWriter.close();
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fileReader);
			String line = bReader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bReader.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
