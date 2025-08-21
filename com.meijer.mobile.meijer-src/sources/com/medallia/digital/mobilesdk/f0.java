package com.medallia.digital.mobilesdk;

import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.medallia.digital.mobilesdk.o6;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
abstract class f0<T> implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    private static final int f92768i = 1048576;

    /* renamed from: j, reason: collision with root package name */
    private static final String f92769j = "Content-Type";

    /* renamed from: k, reason: collision with root package name */
    private static final int f92770k = 600;

    /* renamed from: l, reason: collision with root package name */
    private static final String f92771l = "application/json";

    /* renamed from: m, reason: collision with root package name */
    static final int f92772m = -44;

    /* renamed from: n, reason: collision with root package name */
    private static final String f92773n = "BaseRequest: Error parsing server response ";

    /* renamed from: o, reason: collision with root package name */
    static final int f92774o = -45;

    /* renamed from: p, reason: collision with root package name */
    private static final String f92775p = "BaseRequest: Error no Connection Available";

    /* renamed from: q, reason: collision with root package name */
    static final int f92776q = -46;

    /* renamed from: r, reason: collision with root package name */
    private static final String f92777r = "BaseRequest: Error timeout";

    /* renamed from: s, reason: collision with root package name */
    private static final String f92778s = "https";

    /* renamed from: a, reason: collision with root package name */
    private final d f92779a;

    /* renamed from: b, reason: collision with root package name */
    private final String f92780b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.a f92781c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f92782d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f92783e;

    /* renamed from: f, reason: collision with root package name */
    private int f92784f;

    /* renamed from: g, reason: collision with root package name */
    private final int f92785g;

    /* renamed from: h, reason: collision with root package name */
    private String f92786h;

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92787a;

        a(String str) {
            this.f92787a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Message: ");
            String str = this.f92787a;
            if (str == null) {
                str = "Unknown network error";
            }
            sb2.append(str);
            sb2.append(" StatusCode ");
            String str2 = this.f92787a;
            int i10 = f0.f92770k;
            sb2.append(str2 != null ? f0.this.f92784f : f0.f92770k);
            a4.c(sb2.toString());
            if (f0.this.f92781c != null) {
                o6.a aVar = f0.this.f92781c;
                if (this.f92787a != null) {
                    i10 = f0.this.f92784f;
                }
                aVar.a(new i6(i10));
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92789a;

        static {
            int[] iArr = new int[c.values().length];
            f92789a = iArr;
            try {
                iArr[c.ContentType.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92789a[c.Accept.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum c {
        ContentType,
        Accept;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = b.f92789a[ordinal()];
            return i10 != 1 ? i10 != 2 ? "" : "Accept" : f0.f92769j;
        }
    }

    enum d {
        DEPRECATED_GET_OR_POST,
        GET,
        POST,
        PUT,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        PATCH
    }

    f0(d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i10, o6.a aVar) {
        this.f92779a = dVar;
        this.f92780b = str;
        this.f92781c = aVar;
        this.f92783e = jSONObject;
        this.f92782d = a(map);
        this.f92785g = i10;
    }

    private String c() {
        return f92771l;
    }

    private Map<String, String> d() {
        Map<String, String> map = this.f92782d;
        return map != null ? map : new HashMap();
    }

    private d f() {
        return this.f92779a;
    }

    protected abstract void a(T t10);

    protected abstract T b(InputStream inputStream);

    public String e() {
        return this.f92786h;
    }

    protected o6.a g() {
        return this.f92781c;
    }

    protected int h() {
        return this.f92784f;
    }

    protected String i() {
        return this.f92780b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = com.medallia.digital.mobilesdk.x8.b()
            if (r0 == 0) goto La7
            r0 = 0
            java.net.HttpURLConnection r1 = r5.a()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a java.net.SocketTimeoutException -> L74
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            r5.f92784f = r2     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            r3 = 400(0x190, float:5.6E-43)
            if (r2 >= r3) goto L3d
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            java.lang.Object r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            int r3 = r5.f92784f     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            r4 = -44
            if (r3 != r4) goto L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            r3.<init>()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            java.lang.String r4 = "BaseRequest: Error parsing server response "
            r3.append(r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            r3.append(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            goto L45
        L35:
            r2 = move-exception
            goto L93
        L37:
            r2 = move-exception
            goto L5c
        L39:
            r5.a(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            goto L48
        L3d:
            java.io.InputStream r2 = r1.getErrorStream()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
        L45:
            r5.a(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.net.SocketTimeoutException -> L75
        L48:
            if (r0 == 0) goto L8f
            r0.close()     // Catch: java.io.IOException -> L4e
            goto L8f
        L4e:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r5.a(r0)
            goto L8f
        L57:
            r2 = move-exception
            r1 = r0
            goto L93
        L5a:
            r2 = move-exception
            r1 = r0
        L5c:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L35
            r5.a(r2)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L71
            r0.close()     // Catch: java.io.IOException -> L69
            goto L71
        L69:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r5.a(r0)
        L71:
            if (r1 == 0) goto L92
            goto L8f
        L74:
            r1 = r0
        L75:
            r2 = -46
            r5.a(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "BaseRequest: Error timeout"
            r5.a(r2)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L8d
            r0.close()     // Catch: java.io.IOException -> L85
            goto L8d
        L85:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r5.a(r0)
        L8d:
            if (r1 == 0) goto L92
        L8f:
            r1.disconnect()
        L92:
            return
        L93:
            if (r0 == 0) goto La1
            r0.close()     // Catch: java.io.IOException -> L99
            goto La1
        L99:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r5.a(r0)
        La1:
            if (r1 == 0) goto La6
            r1.disconnect()
        La6:
            throw r2
        La7:
            r0 = -45
            r5.a(r0)
            java.lang.String r0 = "BaseRequest: Error no Connection Available"
            r5.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.f0.j():void");
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        j();
    }

    f0(d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i10, o6.a aVar) {
        this.f92779a = dVar;
        this.f92780b = str;
        this.f92781c = aVar;
        this.f92783e = jSONObject;
        this.f92782d = a(map);
        this.f92785g = i10;
        this.f92786h = str2;
    }

    private String a(InputStream inputStream) {
        try {
            return x8.a(inputStream).toString("UTF-8");
        } catch (Exception unused) {
            a(f92772m);
            return null;
        }
    }

    private byte[] b() {
        try {
            JSONObject jSONObject = this.f92783e;
            if (jSONObject == null) {
                return null;
            }
            return jSONObject.toString().getBytes();
        } catch (Exception unused) {
            return null;
        }
    }

    public HttpURLConnection a() throws NoSuchAlgorithmException, IOException, KeyManagementException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(i()).openConnection())));
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setConnectTimeout(this.f92785g);
        httpURLConnection.setReadTimeout(this.f92785g);
        httpURLConnection.setRequestMethod(f().name());
        if (d() != null && !d().isEmpty()) {
            for (String str : d().keySet()) {
                httpURLConnection.setRequestProperty(str, d().get(str));
            }
        }
        if (e() != null || (b() != null && b().length > 0)) {
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(f92769j, (!f().name().equals(d.PUT.toString()) || e() == null) ? c() : " ");
            if (e() != null) {
                FileInputStream fileInputStreamE = null;
                try {
                    try {
                        fileInputStreamE = g2.e(e());
                        httpURLConnection.setFixedLengthStreamingMode(fileInputStreamE.available());
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        byte[] bArr = new byte[f92768i];
                        for (int iMin = Math.min(fileInputStreamE.available(), f92768i); fileInputStreamE.read(bArr, 0, iMin) > 0; iMin = Math.min(fileInputStreamE.available(), f92768i)) {
                            dataOutputStream.write(bArr, 0, iMin);
                        }
                        a4.b("LivingLens Done writing file to server - continue processing");
                    } catch (IOException e10) {
                        a4.c(e10.getMessage());
                        if (fileInputStreamE != null) {
                        }
                    }
                    try {
                        fileInputStreamE.close();
                    } catch (IOException e11) {
                        a4.c(e11.getMessage());
                    }
                } catch (Throwable th2) {
                    if (fileInputStreamE != null) {
                        try {
                            fileInputStreamE.close();
                        } catch (IOException e12) {
                            a4.c(e12.getMessage());
                        }
                    }
                    throw th2;
                }
            } else {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(b());
                outputStream.close();
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private Map<String, String> a(HashMap<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(c.Accept.toString(), f92771l);
        return map;
    }

    protected void a(int i10) {
        this.f92784f = i10;
    }

    public void a(String str) {
        w7.b().a().execute(new a(str));
    }
}
