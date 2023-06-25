
public class Request {
    private String input;

    private String method;
    private String version;
    private String uri;

    public Request(String input) {
        this.input = input;
        final var parts = input.split(" ");

        if (parts.length == 3) {
            this.method = parts[0];
            this.uri = parts[1];
            this.version = parts[2];
        } else {
            this.method = null;
            this.uri = null;
            this.version = null;
        }
    }

    public void parse() {
        uri = parseUri(input);
    }

    private String parseUri(String requestString) {
        final var parts = requestString.split(" ");

        if (parts.length == 3) {
            return parts[1];
        }

        return null;
    }

    public String getUri() {
        return uri;
    }

    public String getMethod() {
        return method;
    }

    public String getVersion() {
        return version;
    }
}