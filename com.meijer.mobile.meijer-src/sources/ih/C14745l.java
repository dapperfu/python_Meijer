package ih;

import io.constructor.data.local.PreferencesHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import java.util.Set;
import java.util.regex.Pattern;
import jh.C15034c;

/* renamed from: ih.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C14745l {

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f137615q = Pattern.compile("^[\\d]+$");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14744k f137616a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14743j f137617b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f137618c;

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f137619d;

    /* renamed from: e, reason: collision with root package name */
    private final C15034c f137620e;

    /* renamed from: f, reason: collision with root package name */
    private final URI f137621f;

    /* renamed from: g, reason: collision with root package name */
    private C14741h f137622g;

    /* renamed from: h, reason: collision with root package name */
    private ByteArrayOutputStream f137623h;

    /* renamed from: i, reason: collision with root package name */
    private ByteArrayOutputStream f137624i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f137625j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f137626k;

    /* renamed from: l, reason: collision with root package name */
    private PipedOutputStream f137627l;

    /* renamed from: m, reason: collision with root package name */
    private String f137628m;

    /* renamed from: n, reason: collision with root package name */
    private String f137629n;

    /* renamed from: o, reason: collision with root package name */
    private String f137630o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f137631p;

    private void g() {
        this.f137625j = false;
        this.f137626k = false;
        this.f137630o = null;
        h();
        if (this.f137623h.size() != 0) {
            if (this.f137623h.size() > 1000) {
                this.f137623h = new ByteArrayOutputStream(1000);
            } else {
                this.f137623h.reset();
            }
        }
    }

    private boolean a() {
        if (!this.f137618c) {
            return false;
        }
        Set<String> set = this.f137619d;
        if (set == null) {
            return true;
        }
        if (set.contains("event") && this.f137630o == null) {
            return false;
        }
        return (this.f137619d.contains(PreferencesHelper.PREF_ID) && this.f137629n == null) ? false : true;
    }

    private void b(C14751r c14751r) {
        try {
            this.f137620e.b("Dispatching message: {}", c14751r);
            this.f137616a.b(c14751r.c(), c14751r);
        } catch (Exception e10) {
            this.f137620e.n("Message handler threw an exception: " + e10.toString());
            this.f137620e.b("Stack trace: {}", new C14750q(e10));
            this.f137616a.onError(e10);
        }
    }

    private void c() throws IOException {
        PipedOutputStream pipedOutputStream = this.f137627l;
        if (pipedOutputStream != null) {
            try {
                pipedOutputStream.close();
            } catch (IOException unused) {
            }
            this.f137627l = null;
            g();
        } else {
            if (!this.f137625j) {
                g();
                return;
            }
            C14751r c14751r = new C14751r(this.f137630o, this.f137623h.toString(AbstractC14749p.f137683a.name()), this.f137629n, this.f137621f);
            String str = this.f137629n;
            if (str != null) {
                this.f137617b.b(str);
            }
            b(c14751r);
            g();
        }
    }

    private void e(String str) {
        try {
            this.f137616a.a(str);
        } catch (Exception e10) {
            this.f137620e.n("Message handler threw an exception: " + e10.toString());
            this.f137620e.b("Stack trace: {}", new C14750q(e10));
            this.f137616a.onError(e10);
        }
    }

    private void h() {
        ByteArrayOutputStream byteArrayOutputStream = this.f137624i;
        if (byteArrayOutputStream != null) {
            if (byteArrayOutputStream.size() > 1000) {
                this.f137624i = null;
            } else {
                this.f137624i.reset();
            }
        }
    }

    public boolean d() {
        return this.f137622g.d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ih.C14745l.f():boolean");
    }

    C14745l(InputStream inputStream, URI uri, InterfaceC14744k interfaceC14744k, InterfaceC14743j interfaceC14743j, int i10, boolean z10, Set<String> set, C15034c c15034c) {
        this.f137622g = new C14741h(inputStream, i10 < 200 ? 200 : i10);
        this.f137616a = interfaceC14744k;
        this.f137621f = uri;
        this.f137617b = interfaceC14743j;
        this.f137618c = z10;
        this.f137619d = set;
        this.f137620e = c15034c;
        this.f137623h = new ByteArrayOutputStream(1000);
    }
}
