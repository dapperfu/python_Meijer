package f3;

import a3.w;
import android.net.Uri;
import d3.C13466a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f130638a;

    /* renamed from: b, reason: collision with root package name */
    public final long f130639b;

    /* renamed from: c, reason: collision with root package name */
    public final int f130640c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f130641d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f130642e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f130643f;

    /* renamed from: g, reason: collision with root package name */
    public final long f130644g;

    /* renamed from: h, reason: collision with root package name */
    public final long f130645h;

    /* renamed from: i, reason: collision with root package name */
    public final String f130646i;

    /* renamed from: j, reason: collision with root package name */
    public final int f130647j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f130648k;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f130649a;

        /* renamed from: b, reason: collision with root package name */
        private long f130650b;

        /* renamed from: c, reason: collision with root package name */
        private int f130651c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f130652d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f130653e;

        /* renamed from: f, reason: collision with root package name */
        private long f130654f;

        /* renamed from: g, reason: collision with root package name */
        private long f130655g;

        /* renamed from: h, reason: collision with root package name */
        private String f130656h;

        /* renamed from: i, reason: collision with root package name */
        private int f130657i;

        /* renamed from: j, reason: collision with root package name */
        private Object f130658j;

        public b() {
            this.f130651c = 1;
            this.f130653e = Collections.EMPTY_MAP;
            this.f130655g = -1L;
        }

        public g a() {
            C13466a.j(this.f130649a, "The uri must be set.");
            return new g(this.f130649a, this.f130650b, this.f130651c, this.f130652d, this.f130653e, this.f130654f, this.f130655g, this.f130656h, this.f130657i, this.f130658j);
        }

        public b b(int i10) {
            this.f130657i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f130652d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f130651c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f130653e = map;
            return this;
        }

        public b f(String str) {
            this.f130656h = str;
            return this;
        }

        public b g(long j10) {
            this.f130654f = j10;
            return this;
        }

        public b h(Uri uri) {
            this.f130649a = uri;
            return this;
        }

        public b i(String str) {
            this.f130649a = Uri.parse(str);
            return this;
        }

        private b(g gVar) {
            this.f130649a = gVar.f130638a;
            this.f130650b = gVar.f130639b;
            this.f130651c = gVar.f130640c;
            this.f130652d = gVar.f130641d;
            this.f130653e = gVar.f130642e;
            this.f130654f = gVar.f130644g;
            this.f130655g = gVar.f130645h;
            this.f130656h = gVar.f130646i;
            this.f130657i = gVar.f130647j;
            this.f130658j = gVar.f130648k;
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
        return c(this.f130640c);
    }

    public boolean d(int i10) {
        return (this.f130647j & i10) == i10;
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f130638a + ", " + this.f130644g + ", " + this.f130645h + ", " + this.f130646i + ", " + this.f130647j + "]";
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
        C13466a.a(j13 >= 0);
        C13466a.a(j11 >= 0);
        C13466a.a(j12 > 0 || j12 == -1);
        this.f130638a = (Uri) C13466a.e(uri);
        this.f130639b = j10;
        this.f130640c = i10;
        this.f130641d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f130642e = Collections.unmodifiableMap(new HashMap(map));
        this.f130644g = j11;
        this.f130643f = j13;
        this.f130645h = j12;
        this.f130646i = str;
        this.f130647j = i11;
        this.f130648k = obj;
    }
}
