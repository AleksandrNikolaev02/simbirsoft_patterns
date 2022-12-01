package files;

public class JSONFile implements File{
    private String url;
    private String pathname;
    private String type = "json";

    public JSONFile(String url, String pathname) {
        this.url = url;
        this.pathname = pathname;
    }
    @Override
    public String getUrl() {
        return url;
    }
    @Override
    public String getName() {
        return pathname;
    }
    @Override
    public void setUrl(String newUrl) {
        this.url = newUrl;
    }
    @Override
    public void setName(String newName) {
        this.pathname = newName;
    }

    @Override
    public String getTypeFile() {
        return type;
    }

    @Override
    public void setTypeFile(String type) {
        this.type = type;
    }

}
