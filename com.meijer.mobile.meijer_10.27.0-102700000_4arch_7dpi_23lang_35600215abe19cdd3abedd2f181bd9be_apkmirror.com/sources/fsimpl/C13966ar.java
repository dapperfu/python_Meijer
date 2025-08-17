package fsimpl;

import java.net.URL;

/* renamed from: fsimpl.ar, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13966ar {

    /* renamed from: a, reason: collision with root package name */
    private final C14013ck f131687a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f131688b;

    /* renamed from: c, reason: collision with root package name */
    private C14056ea f131689c;

    /* renamed from: d, reason: collision with root package name */
    private C14056ea f131690d;

    /* renamed from: e, reason: collision with root package name */
    private C14056ea f131691e;

    /* renamed from: f, reason: collision with root package name */
    private C14056ea f131692f;

    /* renamed from: g, reason: collision with root package name */
    private C14056ea f131693g;

    /* renamed from: h, reason: collision with root package name */
    private C14056ea f131694h;

    /* renamed from: i, reason: collision with root package name */
    private String f131695i;

    /* renamed from: j, reason: collision with root package name */
    private String f131696j;

    /* renamed from: k, reason: collision with root package name */
    private String f131697k;

    /* renamed from: l, reason: collision with root package name */
    private URL f131698l;

    /* renamed from: m, reason: collision with root package name */
    private URL f131699m;

    /* renamed from: n, reason: collision with root package name */
    private URL f131700n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f131701o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f131702p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f131703q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f131704r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f131705s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f131706t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f131707u;

    /* renamed from: v, reason: collision with root package name */
    private long f131708v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f131709w;

    public C13966ar(C14013ck c14013ck) {
        this.f131687a = c14013ck;
        this.f131707u = a(c14013ck.P());
        this.f131708v = c14013ck.Q();
    }

    private static boolean a(byte b10) {
        return b10 != 1 && b10 == 2;
    }

    public String a() {
        return this.f131697k;
    }

    public void a(C14056ea c14056ea) {
        this.f131689c = c14056ea;
    }

    public void a(String str) {
        this.f131697k = str;
    }

    public void a(URL url) {
        this.f131698l = url;
    }

    public void a(boolean z10) {
        this.f131709w = z10;
    }

    public String b() {
        return this.f131695i;
    }

    public void b(C14056ea c14056ea) {
        this.f131690d = c14056ea;
    }

    public void b(String str) {
        this.f131695i = str;
    }

    public void b(URL url) {
        this.f131699m = url;
    }

    public void b(boolean z10) {
        this.f131701o = z10;
    }

    public String c() {
        return this.f131696j;
    }

    public void c(C14056ea c14056ea) {
        this.f131691e = c14056ea;
    }

    public void c(String str) {
        this.f131696j = str;
    }

    public void c(URL url) {
        this.f131700n = url;
    }

    public void c(boolean z10) {
        this.f131688b = z10;
    }

    public void d(C14056ea c14056ea) {
        this.f131692f = c14056ea;
    }

    public void d(boolean z10) {
        this.f131702p = z10;
    }

    public boolean d() {
        return this.f131709w;
    }

    public void e(C14056ea c14056ea) {
        this.f131693g = c14056ea;
    }

    public void e(boolean z10) {
        this.f131703q = z10;
    }

    public boolean e() {
        return this.f131701o;
    }

    public void f(C14056ea c14056ea) {
        this.f131694h = c14056ea;
    }

    public void f(boolean z10) {
        this.f131704r = z10;
    }

    public boolean f() {
        return this.f131688b;
    }

    public C14056ea g() {
        return this.f131689c;
    }

    public void g(boolean z10) {
        this.f131705s = z10;
    }

    public C14056ea h() {
        return this.f131690d;
    }

    public void h(boolean z10) {
        this.f131706t = z10;
    }

    public C14056ea i() {
        return this.f131691e;
    }

    public String i(boolean z10) {
        if (f()) {
            String strJ = this.f131687a.j();
            String strA = a();
            if (strJ != null && strA != null) {
                String str = strJ + "/ui/" + strA + (d() ? "/client-session/" : "/session/") + c() + ":" + b();
                return z10 ? str + ":" + String.valueOf(System.currentTimeMillis()) : str;
            }
        }
        return null;
    }

    public C14056ea j() {
        return this.f131692f;
    }

    public C14056ea k() {
        return this.f131693g;
    }

    public C14056ea l() {
        return this.f131694h;
    }

    public URL m() {
        return this.f131698l;
    }

    public URL n() {
        return this.f131699m;
    }

    public URL o() {
        return this.f131700n;
    }

    public boolean p() {
        return this.f131702p;
    }

    public boolean q() {
        return this.f131703q;
    }

    public boolean r() {
        return this.f131704r;
    }

    public boolean s() {
        return this.f131705s;
    }

    public boolean t() {
        return this.f131706t;
    }

    public boolean u() {
        return this.f131707u;
    }

    public long v() {
        return this.f131708v;
    }

    public String w() {
        if (!f() || a() == null) {
            return null;
        }
        return c() + ":" + b();
    }
}
