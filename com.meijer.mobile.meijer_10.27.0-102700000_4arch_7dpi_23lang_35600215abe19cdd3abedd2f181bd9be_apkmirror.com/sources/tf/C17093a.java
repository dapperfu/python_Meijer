package tf;

import com.fullstory.FS;
import j$.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import lf.g;
import pf.i;

/* renamed from: tf.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C17093a {

    /* renamed from: a, reason: collision with root package name */
    private final String f161634a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f161635b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f161636c = new HashMap();

    private String a(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb2.append(next.getKey());
        sb2.append("=");
        sb2.append(next.getValue() != null ? URLEncoder.encode(next.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb2.append("&");
            sb2.append(next2.getKey());
            sb2.append("=");
            sb2.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), "UTF-8") : "");
        }
        return sb2.toString();
    }

    private String e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read(cArr);
            if (i10 == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, i10);
        }
    }

    public C17093a d(String str, String str2) {
        this.f161636c.put(str, str2);
        return this;
    }

    public C17093a(String str, Map<String, String> map) {
        this.f161634a = str;
        this.f161635b = map;
    }

    private String b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String strA = a(map);
        if (strA.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                strA = "&" + strA;
            }
            return str + strA;
        }
        return str + "?" + strA;
    }

    public C17095c c() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        i.d();
        InputStream inputStream = null;
        String strE = null;
        inputStream = null;
        try {
            String strB = b(this.f161634a, this.f161635b);
            g.f().i("GET Request URL: " + strB);
            httpsURLConnection = (HttpsURLConnection) FS.urlconnection_wrapInstance(new URL(strB).openConnection());
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f161636c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strE = e(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C17095c(responseCode, strE);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }
}
