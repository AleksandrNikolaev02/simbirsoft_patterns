package files;

public interface File {
    String getName();
    String getUrl();
    void setUrl(String newUrl);
    void setName(String newName);
    String getTypeFile();
    void setTypeFile(String type);
}
