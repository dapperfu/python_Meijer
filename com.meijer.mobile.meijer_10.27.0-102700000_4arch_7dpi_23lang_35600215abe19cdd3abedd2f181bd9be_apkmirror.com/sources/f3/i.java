package f3;

import Be.q;
import Ce.F;
import Ce.M;
import Ce.s0;
import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.internal.HttpHeaders;
import d3.P;
import d3.r;
import f3.InterfaceC13839d;
import f3.i;
import io.constructor.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class i extends AbstractC13836a implements InterfaceC13839d {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f130673e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f130674f;

    /* renamed from: g, reason: collision with root package name */
    private final int f130675g;

    /* renamed from: h, reason: collision with root package name */
    private final int f130676h;

    /* renamed from: i, reason: collision with root package name */
    private final String f130677i;

    /* renamed from: j, reason: collision with root package name */
    private final l f130678j;

    /* renamed from: k, reason: collision with root package name */
    private final l f130679k;

    /* renamed from: l, reason: collision with root package name */
    private final q<String> f130680l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f130681m;

    /* renamed from: n, reason: collision with root package name */
    private g f130682n;

    /* renamed from: o, reason: collision with root package name */
    private HttpURLConnection f130683o;

    /* renamed from: p, reason: collision with root package name */
    private InputStream f130684p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f130685q;

    /* renamed from: r, reason: collision with root package name */
    private int f130686r;

    /* renamed from: s, reason: collision with root package name */
    private long f130687s;

    /* renamed from: t, reason: collision with root package name */
    private long f130688t;

    public static final class b implements InterfaceC13839d.a {

        /* renamed from: b, reason: collision with root package name */
        private o f130690b;

        /* renamed from: c, reason: collision with root package name */
        private q<String> f130691c;

        /* renamed from: d, reason: collision with root package name */
        private String f130692d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f130695g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f130696h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f130697i;

        /* renamed from: a, reason: collision with root package name */
        private final l f130689a = new l();

        /* renamed from: e, reason: collision with root package name */
        private int f130693e = 8000;

        /* renamed from: f, reason: collision with root package name */
        private int f130694f = 8000;

        @Override // f3.InterfaceC13839d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a() {
            i iVar = new i(this.f130692d, this.f130693e, this.f130694f, this.f130695g, this.f130696h, this.f130689a, this.f130691c, this.f130697i);
            o oVar = this.f130690b;
            if (oVar != null) {
                iVar.e(oVar);
            }
            return iVar;
        }

        public b c(String str) {
            this.f130692d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends F<String, List<String>> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, List<String>> f130698a;

        public static /* synthetic */ boolean E(String str) {
            return str != null;
        }

        @Override // Ce.F, java.util.Map
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ce.G
        public Map<String, List<String>> b() {
            return this.f130698a;
        }

        @Override // Ce.F, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.B(obj);
        }

        public c(Map<String, List<String>> map) {
            this.f130698a = map;
        }

        public static /* synthetic */ boolean D(Map.Entry entry) {
            if (entry.getKey() != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.w(obj);
        }

        @Override // Ce.F, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return s0.b(super.entrySet(), new q() { // from class: f3.j
                @Override // Be.q
                public final boolean apply(Object obj) {
                    return i.c.D((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.C();
        }

        @Override // Ce.F, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty() || (super.size() == 1 && super.containsKey(null))) {
                return true;
            }
            return false;
        }

        @Override // Ce.F, java.util.Map
        public Set<String> keySet() {
            return s0.b(super.keySet(), new q() { // from class: f3.k
                @Override // Be.q
                public final boolean apply(Object obj) {
                    return i.c.E((String) obj);
                }
            });
        }

        @Override // Ce.F, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private URL s(URL url, String str, g gVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", gVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!BuildConfig.SERVICE_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, gVar, 2001, 1);
            }
            if (this.f130673e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f130674f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, gVar, 2001, 1);
                }
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", gVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new HttpDataSource$HttpDataSourceException(e11, gVar, 2001, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f3.InterfaceC13839d
    public void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f130684p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, (g) P.h(this.f130682n), 2000, 3);
                }
            }
        } finally {
            this.f130684p = null;
            r();
            if (this.f130685q) {
                this.f130685q = false;
                o();
            }
            this.f130683o = null;
            this.f130682n = null;
        }
    }

    private i(String str, int i10, int i11, boolean z10, boolean z11, l lVar, q<String> qVar, boolean z12) {
        super(true);
        this.f130677i = str;
        this.f130675g = i10;
        this.f130676h = i11;
        this.f130673e = z10;
        this.f130674f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f130678j = lVar;
        this.f130680l = qVar;
        this.f130679k = new l();
        this.f130681m = z12;
    }

    private void r() {
        HttpURLConnection httpURLConnection = this.f130683o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                r.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    private static boolean t(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection u(g gVar) throws IOException {
        HttpURLConnection httpURLConnectionV;
        URL url = new URL(gVar.f130638a.toString());
        int i10 = gVar.f130640c;
        byte[] bArr = gVar.f130641d;
        long j10 = gVar.f130644g;
        long j11 = gVar.f130645h;
        int i11 = 1;
        boolean zD = gVar.d(1);
        if (!this.f130673e && !this.f130674f && !this.f130681m) {
            return v(url, i10, bArr, j10, j11, zD, true, gVar.f130642e);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i13), gVar, 2001, 1);
            }
            httpURLConnectionV = v(url, i10, bArr, j10, j11, zD, false, gVar.f130642e);
            int responseCode = httpURLConnectionV.getResponseCode();
            String headerField = httpURLConnectionV.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionV.disconnect();
                url = s(url, headerField, gVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionV.disconnect();
                if (!this.f130681m || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = s(url, headerField, gVar);
            }
            i12 = i13;
            i11 = 1;
        }
        return httpURLConnectionV;
    }

    private int x(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f130687s;
        if (j10 != -1) {
            long j11 = j10 - this.f130688t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) P.h(this.f130684p)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f130688t += i12;
        n(i12);
        return i12;
    }

    private void y(long j10, g gVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (j10 > 0) {
            int i10 = ((InputStream) P.h(this.f130684p)).read(bArr, 0, (int) Math.min(j10, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), gVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new HttpDataSource$HttpDataSourceException(gVar, 2008, 1);
            }
            j10 -= i10;
            n(i10);
        }
    }

    @Override // f3.InterfaceC13839d
    public Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f130683o;
        return httpURLConnection == null ? M.n() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // f3.InterfaceC13839d
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f130683o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        g gVar = this.f130682n;
        if (gVar != null) {
            return gVar.f130638a;
        }
        return null;
    }

    @Override // f3.InterfaceC13839d
    public long h(final g gVar) throws IOException, NumberFormatException {
        byte[] bArrB;
        this.f130682n = gVar;
        long j10 = 0;
        this.f130688t = 0L;
        this.f130687s = 0L;
        p(gVar);
        try {
            HttpURLConnection httpURLConnectionU = u(gVar);
            this.f130683o = httpURLConnectionU;
            this.f130686r = httpURLConnectionU.getResponseCode();
            String responseMessage = httpURLConnectionU.getResponseMessage();
            int i10 = this.f130686r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionU.getHeaderFields();
                if (this.f130686r == 416) {
                    if (gVar.f130644g == m.c(httpURLConnectionU.getHeaderField("Content-Range"))) {
                        this.f130685q = true;
                        q(gVar);
                        long j11 = gVar.f130645h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionU.getErrorStream();
                try {
                    bArrB = errorStream != null ? Ee.a.b(errorStream) : P.f127091f;
                } catch (IOException unused) {
                    bArrB = P.f127091f;
                }
                byte[] bArr = bArrB;
                r();
                throw new HttpDataSource$InvalidResponseCodeException(this.f130686r, responseMessage, this.f130686r == 416 ? new DataSourceException(2008) : null, headerFields, gVar, bArr);
            }
            final String contentType = httpURLConnectionU.getContentType();
            q<String> qVar = this.f130680l;
            if (qVar != null && !qVar.apply(contentType)) {
                r();
                throw new HttpDataSource$HttpDataSourceException(contentType, gVar) { // from class: androidx.media3.datasource.HttpDataSource$InvalidContentTypeException

                    /* renamed from: d, reason: collision with root package name */
                    public final String f55443d;

                    {
                        super("Invalid content type: " + contentType, gVar, 2003, 1);
                        this.f55443d = contentType;
                    }
                };
            }
            if (this.f130686r == 200) {
                long j12 = gVar.f130644g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zT = t(httpURLConnectionU);
            if (zT) {
                this.f130687s = gVar.f130645h;
            } else {
                long j13 = gVar.f130645h;
                if (j13 != -1) {
                    this.f130687s = j13;
                } else {
                    long jB = m.b(httpURLConnectionU.getHeaderField("Content-Length"), httpURLConnectionU.getHeaderField("Content-Range"));
                    this.f130687s = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f130684p = httpURLConnectionU.getInputStream();
                if (zT) {
                    this.f130684p = new GZIPInputStream(this.f130684p);
                }
                this.f130685q = true;
                q(gVar);
                try {
                    y(j10, gVar);
                    return this.f130687s;
                } catch (IOException e10) {
                    r();
                    if (e10 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e10);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e10, gVar, 2000, 1);
                }
            } catch (IOException e11) {
                r();
                throw new HttpDataSource$HttpDataSourceException(e11, gVar, 2000, 1);
            }
        } catch (IOException e12) {
            r();
            throw HttpDataSource$HttpDataSourceException.c(e12, gVar, 1);
        }
    }

    private HttpURLConnection v(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        String str;
        boolean z12;
        HttpURLConnection httpURLConnectionW = w(url);
        httpURLConnectionW.setConnectTimeout(this.f130675g);
        httpURLConnectionW.setReadTimeout(this.f130676h);
        HashMap map2 = new HashMap();
        l lVar = this.f130678j;
        if (lVar != null) {
            map2.putAll(lVar.a());
        }
        map2.putAll(this.f130679k.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionW.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = m.a(j10, j11);
        if (strA != null) {
            httpURLConnectionW.setRequestProperty("Range", strA);
        }
        String str2 = this.f130677i;
        if (str2 != null) {
            httpURLConnectionW.setRequestProperty(HttpHeaders.USER_AGENT, str2);
        }
        if (z10) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnectionW.setRequestProperty("Accept-Encoding", str);
        httpURLConnectionW.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        httpURLConnectionW.setDoOutput(z12);
        httpURLConnectionW.setRequestMethod(g.c(i10));
        if (bArr != null) {
            httpURLConnectionW.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionW.connect();
            OutputStream outputStream = httpURLConnectionW.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnectionW;
        }
        httpURLConnectionW.connect();
        return httpURLConnectionW;
    }

    @Override // a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource$HttpDataSourceException {
        try {
            return x(bArr, i10, i11);
        } catch (IOException e10) {
            throw HttpDataSource$HttpDataSourceException.c(e10, (g) P.h(this.f130682n), 2);
        }
    }

    HttpURLConnection w(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection())));
    }
}
