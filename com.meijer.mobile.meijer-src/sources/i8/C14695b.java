package i8;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m8.C15689d;
import m8.q;

/* renamed from: i8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14695b {

    /* renamed from: i, reason: collision with root package name */
    private static final String f137211i = x.f137411a + "AdkSettings";

    /* renamed from: j, reason: collision with root package name */
    public static String f137212j = "";

    /* renamed from: k, reason: collision with root package name */
    public static String f137213k = "";

    /* renamed from: l, reason: collision with root package name */
    public static String f137214l = "";

    /* renamed from: m, reason: collision with root package name */
    public static volatile Map<String, String> f137215m = null;

    /* renamed from: n, reason: collision with root package name */
    private static C14695b f137216n = new C14695b();

    /* renamed from: a, reason: collision with root package name */
    public AtomicBoolean f137217a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f137218b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public int f137219c = 1;

    /* renamed from: d, reason: collision with root package name */
    public m8.m f137220d = null;

    /* renamed from: e, reason: collision with root package name */
    boolean f137221e = false;

    /* renamed from: f, reason: collision with root package name */
    private Context f137222f;

    /* renamed from: g, reason: collision with root package name */
    private C15689d f137223g;

    /* renamed from: h, reason: collision with root package name */
    private volatile m8.q f137224h;

    public InterfaceC14696c b() {
        return null;
    }

    static String a() {
        return "Dynatrace OneAgent (Android)";
    }

    public static C14695b e() {
        return f137216n;
    }

    public C15689d c() {
        return this.f137223g;
    }

    public Context d() {
        return this.f137222f;
    }

    public m8.q f() {
        return this.f137224h;
    }

    public m8.t g() {
        return this.f137224h.y();
    }

    public void h(boolean z10) {
        this.f137218b.set(z10);
        this.f137220d.n(z10);
    }

    public void i(C15689d c15689d, Context context) {
        this.f137223g = c15689d;
        this.f137221e = c15689d.f150783t;
        if (context == null || this.f137222f == context.getApplicationContext()) {
            return;
        }
        this.f137222f = context;
        f137213k = z8.f.s(context.getApplicationInfo().loadLabel(this.f137222f.getPackageManager()).toString(), 250);
        f137214l = z8.f.s(this.f137222f.getPackageName(), 250);
        m8.m mVarA = m8.m.a(this.f137222f, new m8.r(c15689d.f150765b));
        this.f137220d = mVarA;
        this.f137218b.set(mVarA.c());
    }

    public void j(m8.q qVar) {
        if (x.f137412b) {
            z8.f.u(f137211i, "switching settings: " + qVar);
        }
        this.f137224h = qVar;
    }

    private C14695b() {
        j(new q.b().A(1).p());
    }
}
