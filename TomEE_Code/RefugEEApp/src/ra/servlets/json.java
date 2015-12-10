package ra.servlets;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class Json {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://ddc.derpy.ws/media_wiki/api.php?action=parse&page=Das_Leben_in_Deutschland&format=json");
        HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
        httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
        InputStream is = httpcon.getInputStream();
        String content = IOUtils.toString(is, "UTF-8");

        JSONObject json = new JSONObject(content);
        JSONObject titel = new JSONObject(json.get("parse").toString());
        JSONObject text = new JSONObject(titel.get("text").toString());

        System.out.println("Title: "+titel.getString("title"));
        System.out.println("Text: "+text.getString("*"));
    }
}