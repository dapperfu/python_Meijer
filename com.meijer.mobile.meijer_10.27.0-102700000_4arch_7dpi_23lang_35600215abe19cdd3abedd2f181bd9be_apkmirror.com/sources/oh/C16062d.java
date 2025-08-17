package oh;

import ih.AbstractC14726e;
import ih.C14724c;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import oh.InterfaceC16071m;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import ph.C16305c;

/* renamed from: oh.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16062d implements InterfaceC16071m {

    /* renamed from: h, reason: collision with root package name */
    private static final okhttp3.j f153677h = okhttp3.j.g("application/json; charset=utf-8");

    /* renamed from: i, reason: collision with root package name */
    private static final SimpleDateFormat f153678i = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);

    /* renamed from: j, reason: collision with root package name */
    private static final Object f153679j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final OkHttpClient f153680a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f153681b;

    /* renamed from: c, reason: collision with root package name */
    private final Headers f153682c;

    /* renamed from: d, reason: collision with root package name */
    private final String f153683d;

    /* renamed from: e, reason: collision with root package name */
    private final String f153684e;

    /* renamed from: f, reason: collision with root package name */
    final long f153685f;

    /* renamed from: g, reason: collision with root package name */
    private final C14724c f153686g;

    /* renamed from: oh.d$a */
    private final class a implements AbstractC14726e.c {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f153687a;

        a(byte[] bArr) {
            this.f153687a = bArr;
        }

        @Override // ih.AbstractC14726e.c
        public String get() {
            byte[] bArr = this.f153687a;
            return bArr == null ? "" : new String(bArr, Charset.forName("UTF-8"));
        }
    }

    @Override // oh.InterfaceC16071m
    public InterfaceC16071m.a Q(byte[] bArr, URI uri) {
        return b(true, bArr, 1, uri);
    }

    @Override // oh.InterfaceC16071m
    public InterfaceC16071m.a R2(byte[] bArr, int i10, URI uri) {
        return b(false, bArr, i10, uri);
    }

    private final Date a(Response response) {
        Date date;
        String strH = response.h("Date");
        if (strH == null) {
            return null;
        }
        try {
            synchronized (f153679j) {
                date = f153678i.parse(strH);
            }
            return date;
        } catch (ParseException unused) {
            this.f153686g.n("Received invalid Date header from events service");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
    
        return new oh.InterfaceC16071m.a(false, r3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private oh.InterfaceC16071m.a b(boolean r19, byte[] r20, int r21, java.net.URI r22) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oh.C16062d.b(boolean, byte[], int, java.net.URI):oh.m$a");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f153681b) {
            C16305c.e(this.f153680a);
        }
    }

    public C16062d(C16305c c16305c, String str, String str2, long j10, C14724c c14724c) {
        if (c16305c.c() == null) {
            this.f153680a = c16305c.g().a();
            this.f153681b = true;
        } else {
            this.f153680a = c16305c.c();
            this.f153681b = false;
        }
        this.f153686g = c14724c;
        this.f153682c = c16305c.f().a("Content-Type", "application/json").f();
        this.f153683d = str == null ? "/bulk" : str;
        this.f153684e = str2 == null ? "/diagnostic" : str2;
        this.f153685f = j10 <= 0 ? 1000L : j10;
    }
}
