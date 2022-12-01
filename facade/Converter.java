package facade;

import converters.CSVConverter;
import converters.JSONConverter;
import converters.XMLConverter;
import files.File;

public class Converter {
    private JSONConverter jConverter = new JSONConverter();
    private XMLConverter xConverter = new XMLConverter();
    private CSVConverter csvConverter = new CSVConverter();

    public File convert(File file, String OutFormat, String SaveUrl) {
        switch (OutFormat) {
            case ".csv": file = csvConverter.convert(file, SaveUrl);
                break;
            case ".json": file = jConverter.convert(file, SaveUrl);
                break;
            case ".xml": file = xConverter.convert(file, SaveUrl);
                break;
            default:
                break;
        }
        System.out.println("Файл сохранён по пути: " + SaveUrl);
        return file;
    }

}
