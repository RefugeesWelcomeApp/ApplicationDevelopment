package ra.servlets;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@WebServlet("/getMediaWikiArticle")
public class getMediaWikiArticle extends HttpServlet  {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        URL url = new URL("https://ddc.derpy.ws/media_wiki/api.php?action=parse&page=Das_Leben_in_Deutschland&format=json");
        HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
        httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
        InputStream is = httpcon.getInputStream();
        String content = IOUtils.toString(is, "UTF-8");

        JSONObject json = new JSONObject(content);
        JSONObject titel = new JSONObject(json.get("parse").toString());
        JSONObject text = new JSONObject(titel.get("text").toString());

        request.setAttribute("title", titel.getString("title"));
        request.setAttribute("text", text.getString("*"));

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}