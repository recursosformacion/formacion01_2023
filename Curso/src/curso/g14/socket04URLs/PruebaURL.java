package curso.g14.socket04URLs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map.Entry;

import javax.net.ssl.HttpsURLConnection;

public class PruebaURL {

	public static void main(String[] args) throws IOException {
		URL rfURL;
		BufferedReader in = null;
		try {
			rfURL = new URL("https://www.google.com/");
			HttpsURLConnection connection = (HttpsURLConnection) rfURL.openConnection();

			connection.addRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String lectura = in.readLine();
			// int status = connection.getResponseCode();

			for (Entry<String, List<String>> header : connection.getHeaderFields().entrySet()) {
				System.out.println(header.getKey() + "=" + header.getValue());
			}
			System.out.println("-----------------------------------------------------------------");
			int contador=0;
			while (lectura!=null && contador++<10) {
				
				System.out.println(lectura);
				lectura=in.readLine();
			}
			connection.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				in.close();
			
		}

	}

}
