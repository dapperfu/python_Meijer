package f3;

import a3.w;
import android.net.Uri;
import d3.C13599a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f131472a;

    /* renamed from: b, reason: collision with root package name */
    public final long f131473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131474c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f131475d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f131476e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f131477f;

    /* renamed from: g, reason: collision with root package name */
    public final long f131478g;

    /* renamed from: h, reason: collision with root package name */
    public final long f131479h;

    /* renamed from: i, reason: collision with root package name */
    public final String f131480i;

    /* renamed from: j, reason: collision with root package name */
    public final int f131481j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f131482k;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f131483a;

        /* renamed from: b, reason: collision with root package name */
        private long f131484b;

        /* renamed from: c, reason: collision with root package name */
        private int f131485c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f131486d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f131487e;

        /* renamed from: f, reason: collision with root package name */
        private long f131488f;

        /* renamed from: g, reason: collision with root package name */
        private long f131489g;

        /* renamed from: h, reason: collision with root package name */
        private String f131490h;

        /* renamed from: i, reason: collision with root package name */
        private int f131491i;

        /* renamed from: j, reason: collision with root package name */
        private Object f131492j;

        public b() {
            this.f131485c = 1;
            this.f131487e = Collections.EMPTY_MAP;
            this.f131489g = -1L;
        }

        public g a() {
            C13599a.j(this.f131483a, "The uri must be set.");
            return new g(this.f131483a, this.f131484b, this.f131485c, this.f131486d, this.f131487e, this.f131488f, this.f131489g, this.f131490h, this.f131491i, this.f131492j);
        }

        public b b(int i10) {
            this.f131491i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f131486d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f131485c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f131487e = map;
            return this;
        }

        public b f(String str) {
            this.f131490h = str;
            return this;
        }

        public b g(long j10) {
            this.f131488f = j10;
            return this;
        }

        public b h(Uri uri) {
            this.f131483a = uri;
            return this;
        }

        public b i(String str) {
            this.f131483a = Uri.parse(str);
            return this;
        }

        private b(g gVar) {
            this.f131483a = gVar.f131472a;
            this.f131484b = gVar.f131473b;
            this.f131485c = gVar.f131474c;
            this.f131486d = gVar.f131475d;
            this.f131487e = gVar.f131476e;
            this.f131488f = gVar.f131478g;
            this.f131489g = gVar.f131479h;
            this.f131490h = gVar.f131480i;
            this.f131491i = gVar.f131481j;
            this.f131492j = gVar.f131482k;
        }
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    static {
        w.a("media3.datasource");
    }

    public g(Uri uri) {
        this(uri, 0L, -1L);
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f131474c);
    }

    public boolean d(int i10) {
        return (this.f131481j & i10) == i10;
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f131472a + ", " + this.f131478g + ", " + this.f131479h + ", " + this.f131480i + ", " + this.f131481j + "]";
    }

    public g(Uri uri, long j10, long j11) {
        this(uri, j10, j11, null);
    }

    @Deprecated
    public g(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, str, 0, null);
    }

    private g(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        C13599a.a(j13 >= 0);
        C13599a.a(j11 >= 0);
        C13599a.a(j12 > 0 || j12 == -1);
        this.f131472a = (Uri) C13599a.e(uri);
        this.f131473b = j10;
        this.f131474c = i10;
        this.f131475d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f131476e = Collections.unmodifiableMap(new HashMap(map));
        this.f131478g = j11;
        this.f131477f = j13;
        this.f131479h = j12;
        this.f131480i = str;
        this.f131481j = i11;
        this.f131482k = obj;
    }
}
