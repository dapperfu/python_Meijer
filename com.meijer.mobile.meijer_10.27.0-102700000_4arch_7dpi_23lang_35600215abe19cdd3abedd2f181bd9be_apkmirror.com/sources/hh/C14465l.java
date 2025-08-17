package hh;

import ih.C14724c;
import io.constructor.data.local.PreferencesHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: hh.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14465l {

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f134975q = Pattern.compile("^[\\d]+$");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14464k f134976a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14463j f134977b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f134978c;

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f134979d;

    /* renamed from: e, reason: collision with root package name */
    private final C14724c f134980e;

    /* renamed from: f, reason: collision with root package name */
    private final URI f134981f;

    /* renamed from: g, reason: collision with root package name */
    private C14461h f134982g;

    /* renamed from: h, reason: collision with root package name */
    private ByteArrayOutputStream f134983h;

    /* renamed from: i, reason: collision with root package name */
    private ByteArrayOutputStream f134984i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f134985j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f134986k;

    /* renamed from: l, reason: collision with root package name */
    private PipedOutputStream f134987l;

    /* renamed from: m, reason: collision with root package name */
    private String f134988m;

    /* renamed from: n, reason: collision with root package name */
    private String f134989n;

    /* renamed from: o, reason: collision with root package name */
    private String f134990o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f134991p;

    private void g() {
        this.f134985j = false;
        this.f134986k = false;
        this.f134990o = null;
        h();
        if (this.f134983h.size() != 0) {
            if (this.f134983h.size() > 1000) {
                this.f134983h = new ByteArrayOutputStream(1000);
            } else {
                this.f134983h.reset();
            }
        }
    }

    private boolean a() {
        if (!this.f134978c) {
            return false;
        }
        Set<String> set = this.f134979d;
        if (set == null) {
            return true;
        }
        if (set.contains("event") && this.f134990o == null) {
            return false;
        }
        return (this.f134979d.contains(PreferencesHelper.PREF_ID) && this.f134989n == null) ? false : true;
    }

    private void b(C14471r c14471r) {
        try {
            this.f134980e.b("Dispatching message: {}", c14471r);
            this.f134976a.d(c14471r.c(), c14471r);
        } catch (Exception e10) {
            this.f134980e.n("Message handler threw an exception: " + e10.toString());
            this.f134980e.b("Stack trace: {}", new C14470q(e10));
            this.f134976a.onError(e10);
        }
    }

    private void c() throws IOException {
        PipedOutputStream pipedOutputStream = this.f134987l;
        if (pipedOutputStream != null) {
            try {
                pipedOutputStream.close();
            } catch (IOException unused) {
            }
            this.f134987l = null;
            g();
        } else {
            if (!this.f134985j) {
                g();
                return;
            }
            C14471r c14471r = new C14471r(this.f134990o, this.f134983h.toString(AbstractC14469p.f135043a.name()), this.f134989n, this.f134981f);
            String str = this.f134989n;
            if (str != null) {
                this.f134977b.b(str);
            }
            b(c14471r);
            g();
        }
    }

    private void e(String str) {
        try {
            this.f134976a.a(str);
        } catch (Exception e10) {
            this.f134980e.n("Message handler threw an exception: " + e10.toString());
            this.f134980e.b("Stack trace: {}", new C14470q(e10));
            this.f134976a.onError(e10);
        }
    }

    private void h() {
        ByteArrayOutputStream byteArrayOutputStream = this.f134984i;
        if (byteArrayOutputStream != null) {
            if (byteArrayOutputStream.size() > 1000) {
                this.f134984i = null;
            } else {
                this.f134984i.reset();
            }
        }
    }

    public boolean d() {
        return this.f134982g.d();
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
        throw new UnsupportedOperationException("Method not decompiled: hh.C14465l.f():boolean");
    }

    C14465l(InputStream inputStream, URI uri, InterfaceC14464k interfaceC14464k, InterfaceC14463j interfaceC14463j, int i10, boolean z10, Set<String> set, C14724c c14724c) {
        this.f134982g = new C14461h(inputStream, i10 < 200 ? 200 : i10);
        this.f134976a = interfaceC14464k;
        this.f134981f = uri;
        this.f134977b = interfaceC14463j;
        this.f134978c = z10;
        this.f134979d = set;
        this.f134980e = c14724c;
        this.f134983h = new ByteArrayOutputStream(1000);
    }
}
