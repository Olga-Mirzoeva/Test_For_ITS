package its.core.initializer;

public enum SystemProperties {
    BROWSER_TYPE("its.browserName"),
    URL("its.url"),
    TIMEOUT("its.timeout");

    private String systemName;

    SystemProperties(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemName() {
        return systemName;
    }
}
