package main;

import facade.Converter;
import files.CSVFile;
import files.File;
import files.JSONFile;
import files.XMLFile;

public class Main {
    public static void main(String[] args) {
        File xFile = new XMLFile(null, "fileXML");
        File jFile = new JSONFile("c:/temp", "fileJSON");
        File cFile = new CSVFile("c:/temp", "fileCSV");

        Converter converter = new Converter();//facade

        jFile = converter.convert(jFile, ".csv", "c:/temp/files");
        System.out.println(jFile.getTypeFile());//csv
    }

}
