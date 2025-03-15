import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class HttpJsonHandler {
    private static final String API_URL = "https://jsonplaceholder.typicode.com/todos/1";

    public static void main(String[] args) {
        try {
            String response = sendHttpRequest(API_URL);
            parseJsonResponse(response);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String sendHttpRequest(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        
        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("HTTP Response Code: " + responseCode);
        }
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        
        return response.toString();
    }

    private static void parseJsonResponse(String response) {
        JSONObject jsonObj = new JSONObject(response);
        int id = jsonObj.getInt("id");
        String title = jsonObj.getString("title");
        boolean completed = jsonObj.getBoolean("completed");
        
        System.out.println("JSON Response Data:");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Completed: " + completed);
    }
}
