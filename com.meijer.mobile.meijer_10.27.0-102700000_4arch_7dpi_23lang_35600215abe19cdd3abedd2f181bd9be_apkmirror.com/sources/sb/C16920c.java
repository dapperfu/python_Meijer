package sb;

import android.util.Base64;
import bb.C6219c;
import cb.C6380a;
import cb.C6381b;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.internal.HttpHeaders;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16920c {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f160377c = C6381b.a(C16920c.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static String f160378d = "UTF-8";

    /* renamed from: e, reason: collision with root package name */
    public static String f160379e = "Authorization";

    /* renamed from: f, reason: collision with root package name */
    public static String f160380f = HttpHeaders.USER_AGENT;

    /* renamed from: g, reason: collision with root package name */
    public static String f160381g = "Content-Encoding";

    /* renamed from: h, reason: collision with root package name */
    public static String f160382h = "Content-Type";

    /* renamed from: i, reason: collision with root package name */
    public static String f160383i = "text/plain";

    /* renamed from: j, reason: collision with root package name */
    public static String f160384j = "application/json";

    /* renamed from: k, reason: collision with root package name */
    private static String f160385k = "PUT";

    /* renamed from: l, reason: collision with root package name */
    private static String f160386l = "DELETE";

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f160387a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private C16918a f160388b;

    public final C16919b c(String str) {
        HttpURLConnection httpURLConnectionJ = null;
        try {
            httpURLConnectionJ = j(str);
            httpURLConnectionJ.setRequestMethod(f160386l);
            i(httpURLConnectionJ, this.f160387a);
            return a(httpURLConnectionJ.getResponseCode(), httpURLConnectionJ.getResponseMessage(), httpURLConnectionJ);
        } catch (IOException e10) {
            return b(e10);
        } finally {
            h(httpURLConnectionJ);
        }
    }

    private static C16919b a(int i10, String str, HttpURLConnection httpURLConnection) throws IOException {
        StringWriter stringWriter = new StringWriter();
        C16919b c16919b = new C16919b();
        try {
            if (200 == i10) {
                InputStream inputStream = httpURLConnection.getInputStream();
                c16919b.f160375c = true;
                c16919b.f160376d = C6219c.h(inputStream);
                c16919b.f160373a = HttpResponseStatus.SUCCESS_OK;
                C6219c.c(inputStream);
                return c16919b;
            }
            if (401 == i10) {
                c16919b.f160373a = i10;
                c16919b.f160374b = "Unauthorized Error. Invalid username and password.";
                return c16919b;
            }
            if (i10 >= 400 && i10 < 500) {
                C6219c.d(httpURLConnection.getErrorStream(), stringWriter, f160378d);
                throw new com.gimbal.internal.i.c(str, i10);
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            C6219c.d(errorStream, stringWriter, f160378d);
            c16919b.f160373a = i10;
            c16919b.f160374b = stringWriter.toString();
            C6219c.c(errorStream);
            return c16919b;
        } catch (IOException e10) {
            return b(e10);
        } finally {
            C6219c.c(null);
        }
    }

    private static C16919b b(IOException iOException) {
        C16919b c16919b = new C16919b();
        c16919b.f160373a = HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
        c16919b.f160374b = iOException.getLocalizedMessage();
        return c16919b;
    }

    private static void h(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private static void i(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpURLConnection.addRequestProperty(str, map.get(str));
            }
        }
    }

    private static HttpURLConnection j(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(str).openConnection())));
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(60000);
        return httpURLConnection;
    }

    public final C16919b d(String str, File file, Map<String, String> map) throws Throwable {
        HttpURLConnection httpURLConnectionJ;
        FileReader fileReader;
        C16919b c16919bB;
        map.putAll(this.f160387a);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            httpURLConnectionJ = j(str);
            try {
                httpURLConnectionJ.setDoOutput(true);
                i(httpURLConnectionJ, map);
                if (file != null && file.exists() && file.canRead()) {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnectionJ.getOutputStream());
                    try {
                        fileReader = new FileReader(file);
                        try {
                            C6219c.g(fileReader, bufferedOutputStream2, f160378d);
                            bufferedOutputStream = bufferedOutputStream2;
                        } catch (IOException e10) {
                            e = e10;
                            bufferedOutputStream = bufferedOutputStream2;
                            c16919bB = b(e);
                            C6219c.e(bufferedOutputStream);
                            C6219c.f(fileReader);
                            h(httpURLConnectionJ);
                            return c16919bB;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            C6219c.e(bufferedOutputStream);
                            C6219c.f(fileReader);
                            h(httpURLConnectionJ);
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        fileReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileReader = null;
                    }
                } else {
                    fileReader = null;
                }
                try {
                    try {
                        c16919bB = a(httpURLConnectionJ.getResponseCode(), httpURLConnectionJ.getResponseMessage(), httpURLConnectionJ);
                    } catch (IOException e12) {
                        e = e12;
                        c16919bB = b(e);
                        C6219c.e(bufferedOutputStream);
                        C6219c.f(fileReader);
                        h(httpURLConnectionJ);
                        return c16919bB;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    C6219c.e(bufferedOutputStream);
                    C6219c.f(fileReader);
                    h(httpURLConnectionJ);
                    throw th;
                }
            } catch (IOException e13) {
                e = e13;
                fileReader = null;
            } catch (Throwable th5) {
                th = th5;
                fileReader = null;
            }
        } catch (IOException e14) {
            e = e14;
            httpURLConnectionJ = null;
            fileReader = null;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnectionJ = null;
            fileReader = null;
        }
        C6219c.e(bufferedOutputStream);
        C6219c.f(fileReader);
        h(httpURLConnectionJ);
        return c16919bB;
    }

    public final C16919b e(String str, String str2, Map<String, String> map) throws Throwable {
        HttpURLConnection httpURLConnectionJ;
        C16919b c16919bB;
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(this.f160387a);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            httpURLConnectionJ = j(str);
            try {
                try {
                    httpURLConnectionJ.setDoOutput(true);
                    i(httpURLConnectionJ, map);
                    if (str2 != null) {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnectionJ.getOutputStream());
                        try {
                            C6219c.g(new StringReader(str2), bufferedOutputStream2, f160378d);
                            bufferedOutputStream = bufferedOutputStream2;
                        } catch (IOException e10) {
                            e = e10;
                            bufferedOutputStream = bufferedOutputStream2;
                            c16919bB = b(e);
                            C6219c.e(bufferedOutputStream);
                            h(httpURLConnectionJ);
                            return c16919bB;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            C6219c.e(bufferedOutputStream);
                            h(httpURLConnectionJ);
                            throw th;
                        }
                    }
                    c16919bB = a(httpURLConnectionJ.getResponseCode(), httpURLConnectionJ.getResponseMessage(), httpURLConnectionJ);
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
            httpURLConnectionJ = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnectionJ = null;
        }
        C6219c.e(bufferedOutputStream);
        h(httpURLConnectionJ);
        return c16919bB;
    }

    public final C16919b f(String str, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(this.f160387a);
        HttpURLConnection httpURLConnectionJ = null;
        try {
            httpURLConnectionJ = j(str);
            i(httpURLConnectionJ, map);
            return a(httpURLConnectionJ.getResponseCode(), httpURLConnectionJ.getResponseMessage(), httpURLConnectionJ);
        } catch (IOException e10) {
            return b(e10);
        } finally {
            h(httpURLConnectionJ);
        }
    }

    public final void g(String str, String str2) {
        String string;
        if (this.f160388b == null) {
            this.f160388b = new C16918a();
        }
        C16918a c16918a = this.f160388b;
        c16918a.f160371a = str;
        c16918a.f160372b = str2;
        if (str == null || str2 == null) {
            string = null;
        } else {
            byte[] bArrEncode = Base64.encode((c16918a.f160371a + ":" + c16918a.f160372b).getBytes(), 2);
            StringBuilder sb2 = new StringBuilder("Basic ");
            sb2.append(new String(bArrEncode));
            string = sb2.toString();
        }
        this.f160387a.put(f160379e, string);
    }

    public final C16919b k(String str, String str2, Map<String, String> map) throws Throwable {
        HttpURLConnection httpURLConnectionJ;
        C16919b c16919bB;
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(this.f160387a);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            httpURLConnectionJ = j(str);
            try {
                try {
                    httpURLConnectionJ.setRequestMethod(f160385k);
                    i(httpURLConnectionJ, map);
                    if (str2 != null) {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnectionJ.getOutputStream());
                        try {
                            C6219c.g(new StringReader(str2), bufferedOutputStream2, f160378d);
                            bufferedOutputStream = bufferedOutputStream2;
                        } catch (IOException e10) {
                            e = e10;
                            bufferedOutputStream = bufferedOutputStream2;
                            c16919bB = b(e);
                            C6219c.e(bufferedOutputStream);
                            h(httpURLConnectionJ);
                            return c16919bB;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            C6219c.e(bufferedOutputStream);
                            h(httpURLConnectionJ);
                            throw th;
                        }
                    }
                    c16919bB = a(httpURLConnectionJ.getResponseCode(), httpURLConnectionJ.getResponseMessage(), httpURLConnectionJ);
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
            httpURLConnectionJ = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnectionJ = null;
        }
        C6219c.e(bufferedOutputStream);
        h(httpURLConnectionJ);
        return c16919bB;
    }
}
