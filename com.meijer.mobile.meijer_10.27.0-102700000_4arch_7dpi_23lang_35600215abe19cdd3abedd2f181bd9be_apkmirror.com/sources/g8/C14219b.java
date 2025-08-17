package g8;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.C15118d;
import k8.q;

/* renamed from: g8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14219b {

    /* renamed from: i, reason: collision with root package name */
    private static final String f132995i = x.f133195a + "AdkSettings";

    /* renamed from: j, reason: collision with root package name */
    public static String f132996j = "";

    /* renamed from: k, reason: collision with root package name */
    public static String f132997k = "";

    /* renamed from: l, reason: collision with root package name */
    public static String f132998l = "";

    /* renamed from: m, reason: collision with root package name */
    public static volatile Map<String, String> f132999m = null;

    /* renamed from: n, reason: collision with root package name */
    private static C14219b f133000n = new C14219b();

    /* renamed from: a, reason: collision with root package name */
    public AtomicBoolean f133001a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f133002b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public int f133003c = 1;

    /* renamed from: d, reason: collision with root package name */
    public k8.m f133004d = null;

    /* renamed from: e, reason: collision with root package name */
    boolean f133005e = false;

    /* renamed from: f, reason: collision with root package name */
    private Context f133006f;

    /* renamed from: g, reason: collision with root package name */
    private C15118d f133007g;

    /* renamed from: h, reason: collision with root package name */
    private volatile k8.q f133008h;

    public InterfaceC14220c b() {
        return null;
    }

    static String a() {
        return "Dynatrace OneAgent (Android)";
    }

    public static C14219b e() {
        return f133000n;
    }

    public C15118d c() {
        return this.f133007g;
    }

    public Context d() {
        return this.f133006f;
    }

    public k8.q f() {
        return this.f133008h;
    }

    public k8.t g() {
        return this.f133008h.y();
    }

    public void h(boolean z10) {
        this.f133002b.set(z10);
        this.f133004d.n(z10);
    }

    public void i(C15118d c15118d, Context context) {
        this.f133007g = c15118d;
        this.f133005e = c15118d.f141637t;
        if (context == null || this.f133006f == context.getApplicationContext()) {
            return;
        }
        this.f133006f = context;
        f132997k = x8.f.s(context.getApplicationInfo().loadLabel(this.f133006f.getPackageManager()).toString(), 250);
        f132998l = x8.f.s(this.f133006f.getPackageName(), 250);
        k8.m mVarA = k8.m.a(this.f133006f, new k8.r(c15118d.f141619b));
        this.f133004d = mVarA;
        this.f133002b.set(mVarA.c());
    }

    public void j(k8.q qVar) {
        if (x.f133196b) {
            x8.f.u(f132995i, "switching settings: " + qVar);
        }
        this.f133008h = qVar;
    }

    private C14219b() {
        j(new q.b().A(1).p());
    }
}
