package fsimpl;

import java.net.URL;

/* renamed from: fsimpl.ar, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14091ar {

    /* renamed from: a, reason: collision with root package name */
    private final C14138ck f132937a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f132938b;

    /* renamed from: c, reason: collision with root package name */
    private C14181ea f132939c;

    /* renamed from: d, reason: collision with root package name */
    private C14181ea f132940d;

    /* renamed from: e, reason: collision with root package name */
    private C14181ea f132941e;

    /* renamed from: f, reason: collision with root package name */
    private C14181ea f132942f;

    /* renamed from: g, reason: collision with root package name */
    private C14181ea f132943g;

    /* renamed from: h, reason: collision with root package name */
    private C14181ea f132944h;

    /* renamed from: i, reason: collision with root package name */
    private String f132945i;

    /* renamed from: j, reason: collision with root package name */
    private String f132946j;

    /* renamed from: k, reason: collision with root package name */
    private String f132947k;

    /* renamed from: l, reason: collision with root package name */
    private URL f132948l;

    /* renamed from: m, reason: collision with root package name */
    private URL f132949m;

    /* renamed from: n, reason: collision with root package name */
    private URL f132950n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f132951o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f132952p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f132953q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f132954r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f132955s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f132956t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f132957u;

    /* renamed from: v, reason: collision with root package name */
    private long f132958v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f132959w;

    public C14091ar(C14138ck c14138ck) {
        this.f132937a = c14138ck;
        this.f132957u = a(c14138ck.P());
        this.f132958v = c14138ck.Q();
    }

    private static boolean a(byte b10) {
        return b10 != 1 && b10 == 2;
    }

    public String a() {
        return this.f132947k;
    }

    public void a(C14181ea c14181ea) {
        this.f132939c = c14181ea;
    }

    public void a(String str) {
        this.f132947k = str;
    }

    public void a(URL url) {
        this.f132948l = url;
    }

    public void a(boolean z10) {
        this.f132959w = z10;
    }

    public String b() {
        return this.f132945i;
    }

    public void b(C14181ea c14181ea) {
        this.f132940d = c14181ea;
    }

    public void b(String str) {
        this.f132945i = str;
    }

    public void b(URL url) {
        this.f132949m = url;
    }

    public void b(boolean z10) {
        this.f132951o = z10;
    }

    public String c() {
        return this.f132946j;
    }

    public void c(C14181ea c14181ea) {
        this.f132941e = c14181ea;
    }

    public void c(String str) {
        this.f132946j = str;
    }

    public void c(URL url) {
        this.f132950n = url;
    }

    public void c(boolean z10) {
        this.f132938b = z10;
    }

    public void d(C14181ea c14181ea) {
        this.f132942f = c14181ea;
    }

    public void d(boolean z10) {
        this.f132952p = z10;
    }

    public boolean d() {
        return this.f132959w;
    }

    public void e(C14181ea c14181ea) {
        this.f132943g = c14181ea;
    }

    public void e(boolean z10) {
        this.f132953q = z10;
    }

    public boolean e() {
        return this.f132951o;
    }

    public void f(C14181ea c14181ea) {
        this.f132944h = c14181ea;
    }

    public void f(boolean z10) {
        this.f132954r = z10;
    }

    public boolean f() {
        return this.f132938b;
    }

    public C14181ea g() {
        return this.f132939c;
    }

    public void g(boolean z10) {
        this.f132955s = z10;
    }

    public C14181ea h() {
        return this.f132940d;
    }

    public void h(boolean z10) {
        this.f132956t = z10;
    }

    public C14181ea i() {
        return this.f132941e;
    }

    public String i(boolean z10) {
        if (f()) {
            String strJ = this.f132937a.j();
            String strA = a();
            if (strJ != null && strA != null) {
                String str = strJ + "/ui/" + strA + (d() ? "/client-session/" : "/session/") + c() + ":" + b();
                return z10 ? str + ":" + String.valueOf(System.currentTimeMillis()) : str;
            }
        }
        return null;
    }

    public C14181ea j() {
        return this.f132942f;
    }

    public C14181ea k() {
        return this.f132943g;
    }

    public C14181ea l() {
        return this.f132944h;
    }

    public URL m() {
        return this.f132948l;
    }

    public URL n() {
        return this.f132949m;
    }

    public URL o() {
        return this.f132950n;
    }

    public boolean p() {
        return this.f132952p;
    }

    public boolean q() {
        return this.f132953q;
    }

    public boolean r() {
        return this.f132954r;
    }

    public boolean s() {
        return this.f132955s;
    }

    public boolean t() {
        return this.f132956t;
    }

    public boolean u() {
        return this.f132957u;
    }

    public long v() {
        return this.f132958v;
    }

    public String w() {
        if (!f() || a() == null) {
            return null;
        }
        return c() + ":" + b();
    }
}
