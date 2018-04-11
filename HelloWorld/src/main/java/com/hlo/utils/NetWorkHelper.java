package com.hlo.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class NetWorkHelper {

	public String getHttpsResponse(String reqUrl,String requestMethod) {
		URL url;
		InputStream is;
		String resultData = "";
		try {
			System.out.println(reqUrl);
			url = new URL(reqUrl);
			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
			TrustManager[] tm = {xtm};
			SSLContext ctx = SSLContext.getInstance("TLS");
			ctx.init(null, tm, null);
			con.setSSLSocketFactory(ctx.getSocketFactory());
			con.setHostnameVerifier(new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return false;
				}
			});
			
			con.setDoInput(true);
			con.setDoOutput(false);
			con.setUseCaches(false);
			if( null != requestMethod && !requestMethod.equals("")) {
				con.setRequestMethod(requestMethod);
			}else {
				con.setRequestMethod("GET");
			}
			is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bufferedReader = new BufferedReader(isr);
			String inputLine;
			while((inputLine = bufferedReader.readLine())!=null) {
				resultData += inputLine + "\n";
			}
			System.out.println(resultData);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resultData;
	}
	
	X509TrustManager xtm = new X509TrustManager() {
		
		public X509Certificate[] getAcceptedIssuers() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			// TODO Auto-generated method stub
			
		}
		
		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			// TODO Auto-generated method stub
			
		}
	};
	
}
