package ph;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import jh.AbstractC15036e;
import jh.C15034c;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import ph.InterfaceC16436m;
import qh.C16669c;

/* renamed from: ph.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16427d implements InterfaceC16436m {

    /* renamed from: h, reason: collision with root package name */
    private static final okhttp3.j f156437h = okhttp3.j.g("application/json; charset=utf-8");

    /* renamed from: i, reason: collision with root package name */
    private static final SimpleDateFormat f156438i = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);

    /* renamed from: j, reason: collision with root package name */
    private static final Object f156439j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final OkHttpClient f156440a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f156441b;

    /* renamed from: c, reason: collision with root package name */
    private final Headers f156442c;

    /* renamed from: d, reason: collision with root package name */
    private final String f156443d;

    /* renamed from: e, reason: collision with root package name */
    private final String f156444e;

    /* renamed from: f, reason: collision with root package name */
    final long f156445f;

    /* renamed from: g, reason: collision with root package name */
    private final C15034c f156446g;

    /* renamed from: ph.d$a */
    private final class a implements AbstractC15036e.c {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f156447a;

        a(byte[] bArr) {
            this.f156447a = bArr;
        }

        @Override // jh.AbstractC15036e.c
        public String get() {
            byte[] bArr = this.f156447a;
            return bArr == null ? "" : new String(bArr, Charset.forName("UTF-8"));
        }
    }

    @Override // ph.InterfaceC16436m
    public InterfaceC16436m.a Q(byte[] bArr, URI uri) {
        return b(true, bArr, 1, uri);
    }

    @Override // ph.InterfaceC16436m
    public InterfaceC16436m.a R2(byte[] bArr, int i10, URI uri) {
        return b(false, bArr, i10, uri);
    }

    private final Date a(Response response) {
        Date date;
        String strH = response.h("Date");
        if (strH == null) {
            return null;
        }
        try {
            synchronized (f156439j) {
                date = f156438i.parse(strH);
            }
            return date;
        } catch (ParseException unused) {
            this.f156446g.n("Received invalid Date header from events service");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
    
        return new ph.InterfaceC16436m.a(false, r3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ph.InterfaceC16436m.a b(boolean r19, byte[] r20, int r21, java.net.URI r22) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C16427d.b(boolean, byte[], int, java.net.URI):ph.m$a");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f156441b) {
            C16669c.e(this.f156440a);
        }
    }

    public C16427d(C16669c c16669c, String str, String str2, long j10, C15034c c15034c) {
        if (c16669c.c() == null) {
            this.f156440a = c16669c.g().a();
            this.f156441b = true;
        } else {
            this.f156440a = c16669c.c();
            this.f156441b = false;
        }
        this.f156446g = c15034c;
        this.f156442c = c16669c.f().a("Content-Type", "application/json").f();
        this.f156443d = str == null ? "/bulk" : str;
        this.f156444e = str2 == null ? "/diagnostic" : str2;
        this.f156445f = j10 <= 0 ? 1000L : j10;
    }
}
