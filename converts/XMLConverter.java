package converts;

import facade.ConversionAlgorithm;
import files.File;
import files.XMLFile;

public class XMLConverter implements ConversionAlgorithm{

    private final String Name = "Output";

    @Override
    public File convert(File toConvert, String OutUrl) {
        File XMLfile = new XMLFile(OutUrl, Name);
        for (int i = 0; i <= 200; i += 20) {
            progressPercentage(i, 200);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Файл успешно сконвертирован!");
        return XMLfile;
    }
    
    private void progressPercentage(int remain, int total) {
        if (remain > total) {
            throw new IllegalArgumentException();
        }
        int maxBareSize = 10;
        int remainProcent = ((100 * remain) / total) / maxBareSize;
        char defaultChar = '-';
        String icon = "*";
        String bare = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
        StringBuilder bareDone = new StringBuilder();
        bareDone.append("[");
        for (int i = 0; i < remainProcent; i++) {
            bareDone.append(icon);
        }
        String bareRemain = bare.substring(remainProcent, bare.length());
        System.out.print("\r" + bareDone + bareRemain + " " + remainProcent * 10 + "%");
        if (remain == total) {
            System.out.print("\n");
        }
    }
}
