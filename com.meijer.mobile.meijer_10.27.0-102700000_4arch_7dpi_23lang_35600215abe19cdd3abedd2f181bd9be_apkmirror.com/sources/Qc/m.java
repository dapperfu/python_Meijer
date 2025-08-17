package Qc;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f29957c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f29958d;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f29961g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final List f29962a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f29956b = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.common.util.f f29959e = com.google.android.gms.common.util.i.d();

    /* renamed from: f, reason: collision with root package name */
    private static final Set f29960f = new HashSet(Arrays.asList(new String[0]));

    static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(com.google.android.gms.common.util.c.a(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void b(int i10, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        r(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (f29956b) {
            f29957c = false;
            f29958d = false;
            p.g("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z10) {
        synchronized (f29956b) {
            f29957c = true;
            f29958d = z10;
        }
    }

    public static boolean k() {
        boolean z10;
        synchronized (f29956b) {
            try {
                z10 = false;
                if (f29957c && f29958d) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public static boolean l() {
        boolean z10;
        synchronized (f29956b) {
            z10 = f29957c;
        }
        return z10;
    }

    private static synchronized void m(String str) {
        try {
            p.f("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + 4000;
                p.f("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i10, Math.min(i11, str.length())))));
                i10 = i11;
            }
            p.f("GMA Debug FINISH");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void n(String str, l lVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f29959e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f29962a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            lVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            p.e("unable to log", e10);
        }
        m(stringWriter.toString());
    }

    private final void o(final String str) throws IOException {
        n("onNetworkRequestError", new l() { // from class: Qc.j
            @Override // Qc.l
            public final void a(JsonWriter jsonWriter) throws IOException {
                int i10 = m.f29961g;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void p(final String str, final String str2, final Map map, final byte[] bArr) throws IOException {
        n("onNetworkRequest", new l() { // from class: Qc.h
            @Override // Qc.l
            public final void a(JsonWriter jsonWriter) throws IOException {
                m.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void q(final Map map, final int i10) throws IOException {
        n("onNetworkResponse", new l() { // from class: Qc.k
            @Override // Qc.l
            public final void a(JsonWriter jsonWriter) throws IOException {
                m.b(i10, map, jsonWriter);
            }
        });
    }

    private static void r(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f29960f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        p.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void h(final byte[] bArr) throws IOException {
        n("onNetworkResponseBody", new l() { // from class: Qc.i
            @Override // Qc.l
            public final void a(JsonWriter jsonWriter) throws IOException {
                int i10 = m.f29961g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strA = com.google.android.gms.common.util.c.a(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strA);
                } else {
                    String strH = g.h(strA);
                    if (strH != null) {
                        jsonWriter.name("bodydigest").value(strH);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public m(String str) {
        List listAsList;
        if (!k()) {
            listAsList = new ArrayList();
        } else {
            listAsList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.f29962a = listAsList;
    }

    public final void c(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        HashMap map;
        if (!k()) {
            return;
        }
        if (httpURLConnection.getRequestProperties() == null) {
            map = null;
        } else {
            map = new HashMap(httpURLConnection.getRequestProperties());
        }
        p(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), map, bArr);
    }

    public final void d(String str, String str2, Map map, byte[] bArr) throws IOException {
        if (!k()) {
            return;
        }
        p(str, "GET", map, bArr);
    }

    public final void e(HttpURLConnection httpURLConnection, int i10) throws IOException {
        HashMap map;
        if (k()) {
            String responseMessage = null;
            if (httpURLConnection.getHeaderFields() == null) {
                map = null;
            } else {
                map = new HashMap(httpURLConnection.getHeaderFields());
            }
            q(map, i10);
            if (i10 >= 200 && i10 < 300) {
                return;
            }
            try {
                responseMessage = httpURLConnection.getResponseMessage();
            } catch (IOException e10) {
                p.g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
            }
            o(responseMessage);
        }
    }

    public final void f(Map map, int i10) throws IOException {
        if (k()) {
            q(map, i10);
            if (i10 >= 200 && i10 < 300) {
                return;
            }
            o(null);
        }
    }

    public final void g(String str) throws IOException {
        if (k() && str != null) {
            h(str.getBytes());
        }
    }
}
