package collection;

import java.sql.SQLException;

import data.FileDatabase;

public class FileCollector {
	
	public static String[] collectFileInfo() {
		String[] fileInfo = {"4","Pikachu"};
		return fileInfo;
	}
	
	public static void addFile() throws SQLException {
		String[] fileInfo = collectFileInfo();
		FileDatabase.addFile(fileInfo);
	}
	
	public static boolean validFile(){
		boolean validFile = true;
		return validFile;
	}
}