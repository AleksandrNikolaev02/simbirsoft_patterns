package facade;

import files.File;

public interface ConversionAlgorithm {
    File convert(File toConvert, String outUrlString);
}
