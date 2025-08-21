package ub;

import android.util.Base64;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.internal.HttpHeaders;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import db.C13650c;
import eb.C13784a;
import eb.C13785b;
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

/* renamed from: ub.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17367c {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f163863c = C13785b.a(C17367c.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static String f163864d = "UTF-8";

    /* renamed from: e, reason: collision with root package name */
    public static String f163865e = "Authorization";

    /* renamed from: f, reason: collision with root package name */
    public static String f163866f = HttpHeaders.USER_AGENT;

    /* renamed from: g, reason: collision with root package name */
    public static String f163867g = "Content-Encoding";

    /* renamed from: h, reason: collision with root package name */
    public static String f163868h = "Content-Type";

    /* renamed from: i, reason: collision with root package name */
    public static String f163869i = "text/plain";

    /* renamed from: j, reason: collision with root package name */
    public static String f163870j = "application/json";

    /* renamed from: k, reason: collision with root package name */
    private static String f163871k = "PUT";

    /* renamed from: l, reason: collision with root package name */
    private static String f163872l = "DELETE";

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f163873a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private C17365a f163874b;

    public final C17366b c(String str) {
        HttpURLConnection httpURLConnectionJ = null;
        try {
            httpURLConnectionJ = j(str);
            httpURLConnectionJ.setRequestMethod(f163872l);
            i(httpURLConnectionJ, this.f163873a);
            return a(httpURLConnectionJ.getResponseCode(), httpURLConnectionJ.getResponseMessage(), httpURLConnectionJ);
        } catch (IOException e10) {
            return b(e10);
        } finally {
            h(httpURLConnectionJ);
        }
    }

    private static C17366b a(int i10, String str, HttpURLConnection httpURLConnection) throws IOException {
        StringWriter stringWriter = new StringWriter();
        C17366b c17366b = new C17366b();
        try {
            if (200 == i10) {
                InputStream inputStream = httpURLConnection.getInputStream();
                c17366b.f163861c = true;
                c17366b.f163862d = C13650c.h(inputStream);
                c17366b.f163859a = HttpResponseStatus.SUCCESS_OK;
                C13650c.c(inputStream);
                return c17366b;
            }
            if (401 == i10) {
                c17366b.f163859a = i10;
                c17366b.f163860b = "Unauthorized Error. Invalid username and password.";
                return c17366b;
            }
            if (i10 >= 400 && i10 < 500) {
                C13650c.d(httpURLConnection.getErrorStream(), stringWriter, f163864d);
                throw new com.gimbal.internal.i.c(str, i10);
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            C13650c.d(errorStream, stringWriter, f163864d);
            c17366b.f163859a = i10;
            c17366b.f163860b = stringWriter.toString();
            C13650c.c(errorStream);
            return c17366b;
        } catch (IOException e10) {
            return b(e10);
        } finally {
            C13650c.c(null);
        }
    }

    private static C17366b b(IOException iOException) {
        C17366b c17366b = new C17366b();
        c17366b.f163859a = HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
        c17366b.f163860b = iOException.getLocalizedMessage();
        return c17366b;
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

    public final C17366b d(String str, File file, Map<String, String> map) throws Throwable {
        HttpURLConnection httpURLConnectionJ;
        FileReader fileReader;
        C17366b c17366bB;
        map.putAll(this.f163873a);
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
                            C13650c.g(fileReader, bufferedOutputStream2, f163864d);
                            bufferedOutputStream = bufferedOutputStream2;
                        } catch (IOException e10) {
                            e = e10;
                            bufferedOutputStream = bufferedOutputStream2;
                            c17366bB = b(e);
                            C13650c.e(bufferedOutputStream);
                            C13650c.f(fileReader);
                            h(httpURLConnectionJ);
                            return c17366bB;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            C13650c.e(bufferedOutputStream);
                            C13650c.f(fileReader);
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
                        c17366bB = a(httpURLConnectionJ.getResponseCode(), httpURLConnectionJ.getResponseMessage(), httpURLConnectionJ);
                    } catch (IOException e12) {
                        e = e12;
                        c17366bB = b(e);
                        C13650c.e(bufferedOutputStream);
                        C13650c.f(fileReader);
                        h(httpURLConnectionJ);
                        return c17366bB;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    C13650c.e(bufferedOutputStream);
                    C13650c.f(fileReader);
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
        C13650c.e(bufferedOutputStream);
        C13650c.f(fileReader);
        h(httpURLConnectionJ);
        return c17366bB;
    }

    public final C17366b e(String str, String str2, Map<String, String> map) throws Throwable {
        HttpURLConnection httpURLConnectionJ;
        C17366b c17366bB;
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(this.f163873a);
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
                            C13650c.g(new StringReader(str2), bufferedOutputStream2, f163864d);
                            bufferedOutputStream = bufferedOutputStream2;
                        } catch (IOException e10) {
                            e = e10;
                            bufferedOutputStream = bufferedOutputStream2;
                            c17366bB = b(e);
                            C13650c.e(bufferedOutputStream);
                            h(httpURLConnectionJ);
                            return c17366bB;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            C13650c.e(bufferedOutputStream);
                            h(httpURLConnectionJ);
                            throw th;
                        }
                    }
                    c17366bB = a(httpURLConnectionJ.getResponseCode(), httpURLConnectionJ.getResponseMessage(), httpURLConnectionJ);
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
        C13650c.e(bufferedOutputStream);
        h(httpURLConnectionJ);
        return c17366bB;
    }

    public final C17366b f(String str, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(this.f163873a);
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
        if (this.f163874b == null) {
            this.f163874b = new C17365a();
        }
        C17365a c17365a = this.f163874b;
        c17365a.f163857a = str;
        c17365a.f163858b = str2;
        if (str == null || str2 == null) {
            string = null;
        } else {
            byte[] bArrEncode = Base64.encode((c17365a.f163857a + ":" + c17365a.f163858b).getBytes(), 2);
            StringBuilder sb2 = new StringBuilder("Basic ");
            sb2.append(new String(bArrEncode));
            string = sb2.toString();
        }
        this.f163873a.put(f163865e, string);
    }

    public final C17366b k(String str, String str2, Map<String, String> map) throws Throwable {
        HttpURLConnection httpURLConnectionJ;
        C17366b c17366bB;
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(this.f163873a);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            httpURLConnectionJ = j(str);
            try {
                try {
                    httpURLConnectionJ.setRequestMethod(f163871k);
                    i(httpURLConnectionJ, map);
                    if (str2 != null) {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnectionJ.getOutputStream());
                        try {
                            C13650c.g(new StringReader(str2), bufferedOutputStream2, f163864d);
                            bufferedOutputStream = bufferedOutputStream2;
                        } catch (IOException e10) {
                            e = e10;
                            bufferedOutputStream = bufferedOutputStream2;
                            c17366bB = b(e);
                            C13650c.e(bufferedOutputStream);
                            h(httpURLConnectionJ);
                            return c17366bB;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            C13650c.e(bufferedOutputStream);
                            h(httpURLConnectionJ);
                            throw th;
                        }
                    }
                    c17366bB = a(httpURLConnectionJ.getResponseCode(), httpURLConnectionJ.getResponseMessage(), httpURLConnectionJ);
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
        C13650c.e(bufferedOutputStream);
        h(httpURLConnectionJ);
        return c17366bB;
    }
}
